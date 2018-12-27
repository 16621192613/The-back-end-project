package com.hsk.angeldoctor.web.finance.controller;

import java.io.InputStream;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.dom4j.Document;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.hsk.angeldoctor.api.persistence.AgIntegralInfo;
import com.hsk.angeldoctor.api.persistence.AgWechatInfo;
import com.hsk.angeldoctor.web.integral.service.IAgIntegralInfoService;
import com.hsk.angeldoctor.web.order.service.IAgOrderInfoService;
import com.hsk.angeldoctor.web.order.service.IAgWechatInfoService;
import com.hsk.exception.HSKException;
import com.hsk.supper.dto.comm.SysRetrunMessage;
import com.hsk.xframe.api.controller.imp.DSTController;
import com.hsk.xframe.api.persistence.SysFileInfo;
import com.hsk.xframe.api.utils.freeMarker.WeixinUtils;
import com.hsk.xframe.api.utils.freeMarker.WeixinUtils.WxConfig;
import com.hsk.xframe.api.utils.freeMarker.WeixinUtils.WxUserInfo;
import com.hsk.xframe.web.sysfile.service.IFileService;

@Controller
public class WechatOpenController extends DSTController{
	
	private static String TOKEN="angeldoctor";  
	@Autowired
	private IAgWechatInfoService agWechatInfoService;
	@Autowired
	private IFileService fileService;
	@Autowired
	private IAgIntegralInfoService agIntegralInfoService;
	@Autowired
	private IAgOrderInfoService agOrderInfoService;
	
	@RequestMapping(value = "/openwechat/getConfig.htm")
	public void sendCode(HttpServletRequest request,HttpServletResponse response,String address) throws Exception{
		SysRetrunMessage srm= new SysRetrunMessage(1l);
		address=address.replaceAll(",", "&");
		WxConfig wxConfig = WeixinUtils.getWxConfig(address);
		srm.setObj(wxConfig);
		returnData(response,srm);
	}
	@RequestMapping("/openwechat/doBind.htm")
    public void doBind(HttpServletRequest request, HttpServletResponse response, String body)throws Exception {
		
//		if (request.getParameter("signature")!=null) {
//            String signature = request.getParameter("signature");
//            String timestamp = request.getParameter("timestamp");
//            String nonce = request.getParameter("nonce");
//            String echostr = request.getParameter("echostr");
//            if (this.checkSignature(signature, timestamp, nonce)) {
//            	System.out.println("数据源为微信后台，将echostr[{}]返回！"+ echostr);
//                response.getOutputStream().println(echostr);
//            }
//        }
		boolean isreturn=false;
		Map<String, String> wxdata=parseXml(request);
        if(wxdata.get("MsgType")!=null){
            if("event".equals(wxdata.get("MsgType"))){
                if( "subscribe".equals(wxdata.get("Event"))){
                    isreturn=true;
                }
            }
        }
        if(isreturn == true){
            //转换XML
        	String openId=wxdata.get("FromUserName");//用户openId
        	AgWechatInfo wechatInfo = agWechatInfoService.getAgWechatInfoByOpenId(openId);
        	if(wechatInfo==null){
        		Integer sceneId=0;//业务员ID
            	if(wxdata.get("EventKey") !=null && !wxdata.get("EventKey").toString().equals("")){
            		String key=wxdata.get("EventKey").toString().replace("qrscene_", "");
            		sceneId=Integer.parseInt(key);
            	}
            	AgWechatInfo agWechatInfo = new AgWechatInfo();
            	agWechatInfo.setOpenId(openId);
            	WxUserInfo wxUserInfo = WeixinUtils.getUserInfo(openId);//根据微信ID获取微信用户信息
            	if(sceneId>0)
            		agWechatInfo.setSceneId(sceneId);
            	agWechatInfo.setWechatName(wxUserInfo.getNickname());
            	agWechatInfo.setAvatar(wxUserInfo.getHeadimgurl());
            	agWechatInfo.setStatus("0");
            	agWechatInfo.setCreateDate(new Date());
            	agWechatInfoService.saveOrUpdateObject(agWechatInfo);
            	
            	AgIntegralInfo att_AgIntegralInfo = new AgIntegralInfo();
    			att_AgIntegralInfo.setSuiId(sceneId);//
    			att_AgIntegralInfo.setUserType("1");
    			att_AgIntegralInfo.setSource("4");
    			att_AgIntegralInfo.setCount(100);
    			att_AgIntegralInfo.setCreateDate(new Date());
    			att_AgIntegralInfo.setStatus("0");
    			agIntegralInfoService.saveOrUpdateObject(att_AgIntegralInfo);
        	}
        	
        }
    }
	/**
	 * 根据微信serverId保存上传的图片
	 * @param request
	 * @param response
	 * @param serverIds
	 * @return
	 * @throws Exception
	 */
	@RequestMapping("/openwechat/saveWxFile.htm")
	public void saveFile(HttpServletRequest request,HttpServletResponse response,String serverIds) throws Exception {
		SysRetrunMessage srm = new SysRetrunMessage(1);
		fileService.setRequest(request);
		List<SysFileInfo> reList = new ArrayList<SysFileInfo>();
		if(serverIds!=null && !serverIds.trim().equals("")){
			String[] serverIdArray=serverIds.split(",");
			for(String serverId : serverIdArray){
				SysFileInfo sysFileInfo= fileService.saveWxFile(serverId);
				if(sysFileInfo!=null && sysFileInfo.getFileId()!=null)
					reList.add(sysFileInfo);
			}
		}
		srm.setObj(reList);
		returnData(response, srm);
	}
	@RequestMapping("/openwechat/createMenu.htm")
	public void createMenu(HttpServletRequest request,HttpServletResponse response) throws Exception {
		SysRetrunMessage srm = new SysRetrunMessage(1);
		WeixinUtils.createMenu();
		returnData(response, srm);
	}
	
	/**
     * 校验签名
     * 
     * @param signature
     *            签名
     * @param timestamp
     *            时间戳
     * @param nonce
     *            随机数
     * @return 布尔值
     */
    public static boolean checkSignature(String signature, String timestamp, String nonce) {
        String checktext = null;
        if (null != signature) {
            // 对ToKen,timestamp,nonce 按字典排序
            String[] paramArr = new String[] { TOKEN, timestamp, nonce };
            Arrays.sort(paramArr);
            // 将排序后的结果拼成一个字符串
            String content = paramArr[0].concat(paramArr[1]).concat(paramArr[2]);

            try {
                MessageDigest md = MessageDigest.getInstance("SHA-1");
                // 对接后的字符串进行sha1加密
                byte[] digest = md.digest(content.toString().getBytes());
                checktext = byteToStr(digest);
            } catch (NoSuchAlgorithmException e) {
                e.printStackTrace();
            }
        }
        // 将加密后的字符串与signature进行对比
        return checktext != null ? checktext.equals(signature.toUpperCase()) : false;
    }
    
    /**
     * 将字节数组转化为16进制字符串
     * 
     * @param byteArrays
     *            字符数组
     * @return 字符串
     */
    private static String byteToStr(byte[] byteArrays) {
        String str = "";
        for (int i = 0; i < byteArrays.length; i++) {
            str += byteToHexStr(byteArrays[i]);
        }
        return str;
    }

    /**
     * 将字节转化为十六进制字符串
     * 
     * @param myByte
     *            字节
     * @return 字符串
     */
    private static String byteToHexStr(byte myByte) {
        char[] Digit = { '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F' };
        char[] tampArr = new char[2];
        tampArr[0] = Digit[(myByte >>> 4) & 0X0F];
        tampArr[1] = Digit[myByte & 0X0F];
        String str = new String(tampArr);
        return str;
    }
    
    public static Map<String, String> parseXml(HttpServletRequest request) throws Exception {
        // 将解析结果存储在HashMap中
        Map<String, String> map = new HashMap<String, String>();
        // 从request中取得输入流
        InputStream inputStream = request.getInputStream();
        // 读取输入流
        SAXReader reader = new SAXReader();
        Document document = reader.read(inputStream);
        // 得到xml根元素
        Element root = document.getRootElement();
        // 得到根元素的所有子节点
        List<Element> elementList = root.elements();

        // 遍历所有子节点
        for (Element e : elementList)
            map.put(e.getName(), e.getText());

        // 释放资源
        inputStream.close();
        inputStream = null;
        return map;
    }

}
