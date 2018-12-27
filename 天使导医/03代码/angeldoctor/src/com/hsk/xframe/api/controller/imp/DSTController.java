
package com.hsk.xframe.api.controller.imp;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;

import com.hsk.angeldoctor.api.daobbase.IAgWechatInfoDao;
import com.hsk.angeldoctor.api.persistence.AgPatientInfo;
import com.hsk.angeldoctor.api.persistence.AgWechatInfo;
import com.hsk.angeldoctor.web.order.service.IAgPatientInfoService;
import com.hsk.angeldoctor.web.order.service.IAgWechatInfoService;
import com.hsk.exception.HSKException;
import com.hsk.supper.controller.imp.SupperController;
import com.hsk.supper.dto.SystemContext;
import com.hsk.supper.dto.comm.PagerModel;
import com.hsk.supper.dto.comm.SysRetrunMessage;
import com.hsk.supper.until.json.JsonUtil;
import com.hsk.supper.until.web.WebUtils;
import com.hsk.xframe.api.controller.IDSTController;
import com.hsk.xframe.api.filter.TokenUtil;
import com.hsk.xframe.api.persistence.SysUserInfo;


import sun.beans.editors.DoubleEditor;
import sun.beans.editors.FloatEditor;
import sun.beans.editors.IntEditor;
import sun.beans.editors.LongEditor;

/**
 * 基础控制层实现类 
 * @author zhangshu
 *@version v1.0 2018-08-19
 */
@Controller
public class DSTController extends SupperController implements IDSTController {
	
	@Autowired
	private IAgPatientInfoService agPatientInfoService;
	@Autowired
	protected IAgWechatInfoService agWechatInfoService;
	
	@InitBinder    
	public void initBinder(WebDataBinder binder) {    
	   binder.registerCustomEditor(Date.class, new CustomDateEditor(new SimpleDateFormat("yyyy-MM-dd"), true)); 
	   binder.registerCustomEditor(int.class, new IntEditor());
	   binder.registerCustomEditor(long.class, new LongEditor());  
	   binder.registerCustomEditor(double.class, new DoubleEditor());  
	   binder.registerCustomEditor(float.class, new FloatEditor());  
	}
	
	/**
	 * 获取当前登录用户token
	 * @param request
	 * @return
	 */
	public String getToken(HttpServletRequest request){
		String token = request.getHeader("token");
		return token;
	}
	/**
	 * 获取当前登录用户类型：用户类型：1后台管理员；2医院管理员；3医生；4：代理商；5业务员
	 * @param request
	 * @return
	 */
	public String getUserType(HttpServletRequest request){
		String token = request.getHeader("token");
		Map<String,Object> tokenData=TokenUtil.TOKEN_MAP.get(token);
		SysUserInfo sysUserInfo = null;
		Integer userType=null;
		if(tokenData.get("account") !=null){
			sysUserInfo =  (SysUserInfo) tokenData.get("account");
			userType=sysUserInfo.getUserType();
		}
		
		return userType+"";
	}
	/**
	 * 获取当前登录用户
	 * @param request
	 * @return
	 */
	public SysUserInfo getLoginSysUserInfo(HttpServletRequest request){
		String token = request.getHeader("token");
		Map<String,Object> tokenData=TokenUtil.TOKEN_MAP.get(token);
		SysUserInfo sysUserInfo = null;
		if(tokenData.get("account") !=null){
			sysUserInfo =  (SysUserInfo) tokenData.get("account");
		}
		return sysUserInfo;
	}
	/**
	 * 跟新当前登录用户
	 */
	public void SetLoginSysUserInfo(HttpServletRequest request,SysUserInfo account) throws HSKException {
		String token = request.getHeader("token");
		Map<String,Object> tokenData = TokenUtil.TOKEN_MAP.get(token);
		tokenData.put("account",account);
		TokenUtil.TOKEN_MAP.put(token, tokenData);
	}
	/**
	 * 返回统一的格式对象
	 * @param response
	 * @param srm
	 * @throws Exception
	 */
	public void returnData(HttpServletResponse response,SysRetrunMessage srm) throws Exception{
		Map<String,Object> reMap=new HashMap<String,Object>();
		reMap.put("code", srm.getCode());
		Object obj=srm.getObj();
		if(srm.getObj()!=null&& (obj instanceof  com.hsk.supper.dto.comm.PagerModel)){
			Map<String,Object> lbmap=new HashMap<String,Object>();
			PagerModel pm=(PagerModel)obj;
			lbmap.put("count", pm.getTotalCount());
			if(SystemContext.getOffset()>0)
				lbmap.put("pageIndex", SystemContext.getOffset());
			else
				lbmap.put("pageIndex", "1");
			lbmap.put("rows", pm.getRows()); 
			srm.setObj(lbmap);
			reMap.put("data", lbmap);
		} else {
			reMap.put("data", srm.getObj());
		}
		
		reMap.put("message", srm.getMeg());
		WebUtils.sendObject(response, JsonUtil.getjsonstr(reMap));
	}
	/**
	 * 获取微信当前登录的患者信息
	 * @param request
	 * @return
	 */
	public AgPatientInfo getLoginAgPatientInfo(HttpServletRequest request) throws Exception{
		AgPatientInfo agPatientInfo =null;
		String openId = request.getHeader("openId");
		AgWechatInfo agWechatInfo = agWechatInfoService.getAgWechatInfoByOpenId(openId);
		if(agWechatInfo !=null){
			agPatientInfo = agPatientInfoService.getAgPatientInfoByWechatUserId(agWechatInfo.getWechatUserId());
			return agPatientInfo;
		}else
			return null;
		
	}
	/**
	 * 获取微信登录的微信信息
	 * @param request
	 * @return
	 * @throws Exception
	 */
	public AgWechatInfo getLoginWechatUser(HttpServletRequest request) throws Exception{
		String openId = request.getHeader("openId");
		AgWechatInfo agWechatInfo = agWechatInfoService.getAgWechatInfoByOpenId(openId);
		return agWechatInfo;
	}
}
