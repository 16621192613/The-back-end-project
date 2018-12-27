package com.hsk.angeldoctor.web.finance.controller;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.hsk.angeldoctor.api.daobbase.IAgWithdrawInfoDao;
import com.hsk.angeldoctor.api.persistence.AgGoodsInfo;
import com.hsk.angeldoctor.api.persistence.AgIntegralInfo;
import com.hsk.angeldoctor.api.persistence.AgIntegralOrder;
import com.hsk.angeldoctor.api.persistence.AgMoneyCount;
import com.hsk.angeldoctor.api.persistence.AgPatientInfo;
import com.hsk.angeldoctor.api.persistence.AgWechatInfo;
import com.hsk.angeldoctor.api.persistence.AgWithdrawInfo;
import com.hsk.angeldoctor.api.persistence.AgWithdrawMaidInfo;
import com.hsk.angeldoctor.web.agent.service.IAgWithdrawInfoService;
import com.hsk.angeldoctor.web.integral.service.IAgGoodsInfoService;
import com.hsk.angeldoctor.web.integral.service.IAgIntegralInfoService;
import com.hsk.angeldoctor.web.integral.service.IAgIntegralOrderService;
import com.hsk.angeldoctor.web.order.service.IAgMoneyCountService;
import com.hsk.supper.dto.comm.SysRetrunMessage;
import com.hsk.supper.until.datetime.DateTime;
import com.hsk.xframe.api.controller.imp.DSTController;
import com.hsk.xframe.api.utils.freeMarker.CommonUtil;

/**
 * 微信业务类
 * @version 1.0
 * @author xun
 *
 */
@Controller
public class WechatController extends DSTController{
	/**
	 * 积分商品管理业务操作实现类
	 */
	@Autowired
	private	IAgGoodsInfoService agGoodsInfoService; 
	/**
	 * 积分订单管理业务操作实现类 
	 */
	@Autowired
	private		IAgIntegralOrderService agIntegralOrderService;
	/**
	 * 积分记录表管理业务操作实现类 
	 */
	@Autowired
	private	IAgIntegralInfoService agIntegralInfoService;
	
	/**
	 * 提现申请业务实现类 
	 */
	@Autowired
	private IAgWithdrawInfoService agWithdrawInfoService;
	
	/**
	 * 余额业务类 
	 */
	@Autowired
	private	IAgMoneyCountService agMoneyCountService;
	
	
	 
	/**
	 * 获取每日积分任务信息：“今日积分totalAccumulatePoints”、今日是否分享shared,今日是否预约registered,今日是否消费charged,是否绑定bound
	 * @param request
	 * @param response
	 * @throws Exception
	 */
	@RequestMapping(value = "/wechat/getDayTask.htm")
	public void GetDayTask(HttpServletRequest request,
			HttpServletResponse response) throws Exception {
		SysRetrunMessage srm = new SysRetrunMessage(1l);
		agIntegralInfoService.setRequest(request); 
		AgPatientInfo userinfo=this.getLoginAgPatientInfo(request);
		srm=agIntegralInfoService.getPatientCountInfo(userinfo.getPatientId());
		returnData(response,srm);
	}
	
	/**
	 * 通过绑定手机获取积分
	 * @param request
	 * @param response
	 * @throws Exception
	 */
	@RequestMapping(value = "/wechat/bindingPhoneIntegral.htm")
	public void BindingPhoneIntegral(HttpServletRequest request,
			HttpServletResponse response) throws Exception {
		SysRetrunMessage srm = new SysRetrunMessage(1l);
		agIntegralInfoService.setRequest(request); 
		AgIntegralInfo att_AgIntegralInfo=new AgIntegralInfo (); 
		AgPatientInfo userinfo=this.getLoginAgPatientInfo(request);
		att_AgIntegralInfo.setSuiId(userinfo.getPatientId());
		att_AgIntegralInfo.setSource("4");
		att_AgIntegralInfo.setUserType("2");
		att_AgIntegralInfo.setComment("通过绑定手机获取积分");
		att_AgIntegralInfo.setCount(15);
		att_AgIntegralInfo.setStatus("1");
		att_AgIntegralInfo.setCreateDate(new Date()); 
		srm=agIntegralInfoService.saveOrUpdateObject(att_AgIntegralInfo);
		returnData(response,srm);
	}
	/**
	 * 签到 
	 * @param request
	 * @param response
	 * @throws Exception
	 */
	@RequestMapping(value = "/wechat/doSign.htm")
	public void doSign(HttpServletRequest request,
			HttpServletResponse response) throws Exception {
		agIntegralInfoService.setRequest(request); 
		AgPatientInfo userinfo=this.getLoginAgPatientInfo(request);
		SysRetrunMessage srm=agIntegralInfoService.savedoSign(userinfo.getPatientId(),"2");
		returnData(response,srm);
	}
	
	/**
	 * 获取签到列表 
	 * @param request
	 * @param response
	 * @throws Exception
	 */
	@RequestMapping(value = "/wechat/getSignList.htm")
	public void getSignList(HttpServletRequest request,HttpServletResponse response) throws Exception {
		SysRetrunMessage srm = new SysRetrunMessage(1l);
		agIntegralInfoService.setRequest(request); 
		 AgIntegralInfo att_AgIntegralInfo=new AgIntegralInfo();
		 AgPatientInfo userinfo=this.getLoginAgPatientInfo(request);
		 att_AgIntegralInfo.setSuiId(userinfo.getPatientId());
		 att_AgIntegralInfo.setUserType("2");
		 att_AgIntegralInfo.setSource("1");
		 att_AgIntegralInfo.setStatus("0");
		 List<AgIntegralInfo> list = agIntegralInfoService.getAgIntegralInfoList(att_AgIntegralInfo);
		 List<String> dataList = new ArrayList<String>();
		 if(list!= null && list.size() >0){
			 SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");
			 for(AgIntegralInfo info : list){
				 dataList.add(sdf.format(info.getCreateDate()));
			 }
		 }
		 srm.setObj(dataList);
		returnData(response,srm);
	}
	
	
 /**
  * 商品列表查询
  * @param request
  * @param response
  * @param att_AgIntegralOrder
  * @throws Exception
  */
	@RequestMapping(value = "/wechat/goodsList.htm")
	public void goodsList(HttpServletRequest request,HttpServletResponse response,@ModelAttribute AgGoodsInfo att_AgGoodsInfo) throws Exception {
		SysRetrunMessage srm = new SysRetrunMessage(1l);
		agGoodsInfoService.setRequest(request); 
		att_AgGoodsInfo.setTab_like("name,supplierName");
		srm.setObj(agGoodsInfoService.getPagerModelObject(att_AgGoodsInfo));
		returnData(response, srm);
	}
	
	/**
	 * 获取商品详情   
	 * @param request
	 * @param response
	 * @param att_AgGoodsInfo
	 * @throws Exception
	 */
	@RequestMapping(value = "/wechat/goodsInfo.htm")
	public void goodsInfo(HttpServletRequest request,
			HttpServletResponse response,
			@ModelAttribute AgGoodsInfo att_AgGoodsInfo) throws Exception {
		SysRetrunMessage srm = new SysRetrunMessage(1l);
		agGoodsInfoService.setRequest(request); 
		att_AgGoodsInfo.setTab_like("name,supplierName");
		srm.setObj(agGoodsInfoService.getPagerModelObject(att_AgGoodsInfo));
		returnData(response, srm);
	}
	/**
	 * 订单列表查询 
	 * @param request
	 * @param response
	 * @param id
	 * @throws Exception
	 */
	@RequestMapping(value = "/wechat/accumulateOrderList.htm")
	public void accumulateOrderList(HttpServletRequest request,
			HttpServletResponse response, @ModelAttribute AgIntegralOrder att_AgIntegralOrder) throws Exception {
		SysRetrunMessage srm = new SysRetrunMessage(1l);
		agIntegralOrderService.setRequest(request); 
		AgPatientInfo userinfo=this.getLoginAgPatientInfo(request);
		att_AgIntegralOrder.setSuiId(userinfo.getPatientId() );
		att_AgIntegralOrder.setUserType("2");
		att_AgIntegralOrder.setTab_like("deliveryName,goodsName,serialNumber,supplierName");
		att_AgIntegralOrder.setTab_order("aioId desc");
		srm.setObj(agIntegralOrderService.getPagerModelObject(att_AgIntegralOrder));
		returnData(response, srm);
	}
	
	/**
	 * 获取订单详细信息 
	 * @param request
	 * @param response
	 * @param id
	 * @throws Exception
	 */
	@RequestMapping(value = "/wechat/accumulateOrderInfo.htm")
	public void accumulateOrderInfo(HttpServletRequest request,
			HttpServletResponse response, Integer id) throws Exception {
		agIntegralOrderService.setRequest(request); 
		SysRetrunMessage srm=agIntegralOrderService.findFormObject(id);
		returnData(response,srm);
	}
	
	
	/**
	 * 使用积分购买积分商场接口
	 * @param request
	 * @param response
	 * @param id
	 * @throws Exception
	 */
	@RequestMapping(value = "/wechat/newAccumulateOrder.htm")
	public void newAccumulateOrder(HttpServletRequest request,
			HttpServletResponse response, @ModelAttribute AgIntegralOrder att_AgIntegralOrder) throws Exception {
		agIntegralOrderService.setRequest(request); 
		AgPatientInfo userinfo=this.getLoginAgPatientInfo(request);
		att_AgIntegralOrder.setSuiId(userinfo.getPatientId() );
		att_AgIntegralOrder.setUserType("2");
		SysRetrunMessage srm=agIntegralOrderService.saveOrUpdateObject(att_AgIntegralOrder);
		returnData(response,srm);
	}
	
	
	/**
	 * 查看当前账户是否存在正在进行的提现操作 
	 * @param request
	 * @param response
	 * @throws Exception
	 */
	@RequestMapping(value = "/wechat/addWithdraw.htm")
	public void addWithdraw(HttpServletRequest request,
			HttpServletResponse response ) throws Exception {
		SysRetrunMessage srm = new SysRetrunMessage(1l);
		agWithdrawInfoService.setRequest(request);
		AgPatientInfo userinfo=this.getLoginAgPatientInfo(request);
		AgWithdrawInfo att_AgWithdrawInfo=new AgWithdrawInfo ();
		att_AgWithdrawInfo.setAwiUserId(userinfo.getPatientId());
		att_AgWithdrawInfo.setWithdrawStatus("0,1");
		att_AgWithdrawInfo.setCheckStatus("0,1");
		srm=agWithdrawInfoService.getIfWithdrawInfo(att_AgWithdrawInfo);
		returnData(response, srm);
	}
	/**
	 * 获取当前用户余额信息 
	 * @param request
	 * @param response
	 * @throws Exception
	 */
	@RequestMapping(value = "/wechat/getUserCount.htm") 
	public void getUserCount(HttpServletRequest request,
			HttpServletResponse response ) throws Exception {
		SysRetrunMessage srm = new SysRetrunMessage(1l);
		agMoneyCountService.setRequest(request);
		AgPatientInfo userinfo=this.getLoginAgPatientInfo(request);
		 
		AgMoneyCount att_AgMoneyCount=new AgMoneyCount ();
		
		att_AgMoneyCount.setSuiId(userinfo.getPatientId());
		att_AgMoneyCount.setAmcType("4");
		srm=agMoneyCountService.findCountObject(att_AgMoneyCount);
		 
		returnData(response, srm);
	}
	/**
	 * 微信申请提现
	 * @param request
	 * @param response
	 * @throws Exception
	 */
	@RequestMapping(value = "/wechat/addMyWithdraw.htm")
	public void addMyWithdraw(HttpServletRequest request ,HttpServletResponse response,String code,String mobile) throws Exception{
		agWithdrawInfoService.setRequest(request); 
		SysRetrunMessage srm=new SysRetrunMessage(1l);
		if(mobile==null || mobile.trim().equals("")){
			srm.setCode(0l);
			srm.setMeg("请输入手机号!");
		}
		if(CommonUtil.getSmsCode(mobile, code)){
			AgPatientInfo userinfo=this.getLoginAgPatientInfo(request);
			AgWithdrawInfo att_AgWithdrawInfo=new AgWithdrawInfo (); 
			att_AgWithdrawInfo.setAwiUserId(userinfo.getPatientId());
			if (att_AgWithdrawInfo.getId() != null) {			
				att_AgWithdrawInfo.setEditDate(new Date());			
				att_AgWithdrawInfo.setEditRen(userinfo.getWechatName() );
			}else {
				att_AgWithdrawInfo.setCreateDate(new Date());			
				att_AgWithdrawInfo.setCreateRen(userinfo.getWechatName());
			}
			srm=agWithdrawInfoService.saveWithdrawMaid("4",att_AgWithdrawInfo);
		}else{
			srm.setCode(0l);
			srm.setMeg("验证码不正确!");
		}
		
		returnData(response,srm);
	}
/**
 * 获取账单列表                            
 * @param request
 * @param response
 * @throws Exception
 */
	@RequestMapping(value = "/wechat/getAgentBillList.htm")
	public void getAgentBillList(HttpServletRequest request,
			HttpServletResponse response  ) throws Exception {
		SysRetrunMessage srm = new SysRetrunMessage(1l);
		agMoneyCountService.setRequest(request);  	
		AgPatientInfo userinfo=this.getLoginAgPatientInfo(request);
		srm.setObj( agMoneyCountService.getListPatientBill(userinfo.getPatientId())); 
		 
		returnData(response, srm);
	}
	
	/**
	 * 获取单笔补贴详情
	 * @param request
	 * @param response
	 * @param att_AgWithdrawMaidInfo
	 * @throws Exception
	 */
	@RequestMapping(value = "/wechat/getSubsidyInfo.htm")
	public void getSubsidyInfo(HttpServletRequest request,
			HttpServletResponse response ,Integer transactionId,String isFirstAgent) throws Exception {
		SysRetrunMessage srm = new SysRetrunMessage(1l);
		agMoneyCountService.setRequest(request);  	
		 srm.setObj( agMoneyCountService.getSubsidyInfo(transactionId)); 
		 
		returnData(response, srm);
	}
	
	/**
	 * 获取单笔提现详情
	 * @param request
	 * @param response
	 * @param withdrawId
	 * @throws Exception
	 */
	@RequestMapping(value = "/wechat/getWithdrawInfo.htm")
	public void GetWithdrawInfo(HttpServletRequest request,
			HttpServletResponse response ,Integer withdrawId	 ) throws Exception {
		SysRetrunMessage srm = new SysRetrunMessage(1l);
		agWithdrawInfoService.setRequest(request);  
		 srm.setObj( agWithdrawInfoService.findObject(withdrawId) );  
		returnData(response, srm);
	}
	/**
	 * 获取积分详情
	 * @param response
	 * @throws Exception
	 */
	@RequestMapping(value = "/wechat/getIntegrationInfo.htm")
	public void getIntegrationInfo(HttpServletRequest request,HttpServletResponse response)throws Exception {
		SysRetrunMessage srm = new SysRetrunMessage(1l);
		agMoneyCountService.setRequest(request);  
		AgPatientInfo userinfo=this.getLoginAgPatientInfo(request);
		srm=agMoneyCountService.getIntegrationInfo(userinfo.getPatientId(), "2");
		returnData(response, srm);
	}
	 
}
