package com.hsk.angeldoctor.web.integral.controller;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import com.hsk.angeldoctor.api.persistence.AgGoodsInfo;
import com.hsk.angeldoctor.api.persistence.AgIntegralInfo;
import com.hsk.angeldoctor.api.persistence.AgIntegralOrder;
import com.hsk.angeldoctor.api.persistence.AgPatientInfo;
import com.hsk.angeldoctor.web.integral.service.IAgGoodsInfoService;
import com.hsk.angeldoctor.web.integral.service.IAgIntegralInfoService;
import com.hsk.angeldoctor.web.integral.service.IAgIntegralOrderService;
import com.hsk.angeldoctor.web.order.service.IAgMoneyCountService;
import com.hsk.supper.dto.comm.SysRetrunMessage;
import com.hsk.supper.until.datetime.DateTime;
import com.hsk.xframe.api.controller.imp.DSTController;
import com.hsk.xframe.api.persistence.SysUserInfo;
import com.hsk.xframe.api.utils.freeMarker.CreateCodeUtil;

/**
 * 积分商城接口业务类
 * @author xun
 * @version v.10
 */
@Controller
public class IntegralController extends DSTController {
	/**
	 * 积分商品管理业务操作实现类
	 */
	@Autowired
	private	IAgGoodsInfoService agGoodsInfoService; 
	/**
	 * 积分记录表管理业务操作实现类 
	 */
	@Autowired
	private	IAgIntegralInfoService agIntegralInfoService; 
	/**
	 * 积分订单管理业务操作实现类 
	 */
	@Autowired
	private		IAgIntegralOrderService agIntegralOrderService;
	@Autowired
	private IAgMoneyCountService agMoneyCountService;
	
	/**
	 * 根据查询条件查询商品列表
	 * @param request
	 * @param response
	 * @param att_AgGoodsInfo
	 * @throws Exception
	 */
	@RequestMapping(value = "/integral/goodsList.htm")
	public void goodsList(HttpServletRequest request,
			HttpServletResponse response,
			@ModelAttribute AgGoodsInfo att_AgGoodsInfo) throws Exception {
		SysRetrunMessage srm = new SysRetrunMessage(1l);
		agGoodsInfoService.setRequest(request); 
		att_AgGoodsInfo.setTab_like("name,supplierName");
		srm.setObj(agGoodsInfoService.getPagerModelObject(att_AgGoodsInfo));
		returnData(response, srm);
	}
	
	/**
	 * 新增或修改积分商品信息接口：当积分商品ID为空时新增，不为空时修改
	 * @param request
	 * @param response
	 * @param att_AgGoodsInfo
	 * @throws Exception
	 */
	@RequestMapping(value = "/integral/saveGoods.htm")
	public void saveAgent(HttpServletRequest request ,HttpServletResponse response,
			@RequestBody AgGoodsInfo att_AgGoodsInfo ) throws Exception{
		agGoodsInfoService.setRequest(request); 
		SysUserInfo userinfo=this.getLoginSysUserInfo(request);
		if (att_AgGoodsInfo.getGoodsId() == null) {		
			att_AgGoodsInfo.setCreateDate(new Date());			
			att_AgGoodsInfo.setCreatorname(userinfo.getUserName());
			att_AgGoodsInfo.setCreatorid( userinfo.getSuiId());
		}
		SysRetrunMessage srm=agGoodsInfoService.saveOrUpdateObject(att_AgGoodsInfo);
		returnData(response,srm);
	}
	
	/**
	 * 根据积分商品ID删除商品信息
	 * @param request
	 * @param response
	 * @param id
	 * @throws Exception
	 */
	@RequestMapping(value = "/integral/delGoods.htm")
	public void delGoods(HttpServletRequest request ,HttpServletResponse response,Integer id) throws Exception{
		agGoodsInfoService.setRequest(request); 
		SysRetrunMessage srm=agGoodsInfoService.deleteObject(id);
		returnData(response,srm);
	}
	
	/**
	 * 根据商品ID查询商品详细信息
	 * @param request
	 * @param response
	 * @param id 商品ID
	 * @throws Exception
	 */
	@RequestMapping(value = "/integral/goodsInfo.htm")
	public void goodsInfo(HttpServletRequest request,
			HttpServletResponse response, Integer id) throws Exception {
		agGoodsInfoService.setRequest(request); 
		SysRetrunMessage srm=agGoodsInfoService.findFormObject(id);
		returnData(response,srm);
	}
	
	
	
 
	
	/**
	 * 根据查询条件查询积分订单列表
	 * @param request
	 * @param response
	 * @param att_AgIntegralOrder
	 * @throws Exception
	 */
	@RequestMapping(value = "/integral/orderList.htm")
	public void orderList(HttpServletRequest request,
			HttpServletResponse response,
			@ModelAttribute AgIntegralOrder att_AgIntegralOrder) throws Exception {
		SysRetrunMessage srm = new SysRetrunMessage(1l);
		agIntegralOrderService.setRequest(request); 
		SysUserInfo userinfo=this.getLoginSysUserInfo(request);
		if(this.getUserType(request).equals("5")){
			att_AgIntegralOrder.setSuiId(userinfo.getSroleId());
			att_AgIntegralOrder.setUserType("1");
		}
		att_AgIntegralOrder.setTab_like("deliveryName,goodsName,serialNumber,supplierName");
		att_AgIntegralOrder.setTab_order("aioId desc");
		srm.setObj(agIntegralOrderService.getPagerModelObject(att_AgIntegralOrder));
		returnData(response, srm);
	}
	
	/**
	 * 对积分订单信息进行修改
	 * @param request
	 * @param response
	 * @param att_AgIntegralOrder
	 * @throws Exception
	 */
	@RequestMapping(value = "/integral/saveOrder.htm")
	public void saveOrder(HttpServletRequest request ,HttpServletResponse response,Integer id,String deliveryName,
			String deliveryMobile,String deliveryProv,String deliveryCity,String deliveryDistrict,String deliveryAddress,Integer goodsId) throws Exception{
		agIntegralOrderService.setRequest(request); 
		SysUserInfo userinfo=this.getLoginSysUserInfo(request);
		AgIntegralOrder att_AgIntegralOrder = new AgIntegralOrder();
		if (id == null) {	
			att_AgIntegralOrder.setCreateDate(new Date());	
			att_AgIntegralOrder.setCreateRen(userinfo.getUserName() ); 
			att_AgIntegralOrder.setGoodsId(goodsId);
			att_AgIntegralOrder.setSuiId(userinfo.getSroleId());
			att_AgIntegralOrder.setUserType("1");
			att_AgIntegralOrder.setStatus("0");
		}else {
			att_AgIntegralOrder = agIntegralOrderService.findObject(id);
			att_AgIntegralOrder.setEditDate(new Date());
			att_AgIntegralOrder.setEditRen(userinfo.getUserName());
		}
		att_AgIntegralOrder.setDeliveryName(deliveryName);
		att_AgIntegralOrder.setDeliveryMobile(deliveryMobile);
		att_AgIntegralOrder.setDeliveryProvId(deliveryProv);
		att_AgIntegralOrder.setDeliveryCityId(deliveryCity);
		att_AgIntegralOrder.setDeliveryDistrictId(deliveryDistrict);
		att_AgIntegralOrder.setDeliveryAddress(deliveryAddress);
		
		SysRetrunMessage srm=agIntegralOrderService.saveOrUpdateObject(att_AgIntegralOrder);
		returnData(response,srm);
	}
	
	 /**
	  * 对积分订单进行发货操作
	  * @param request
	  * @param response
	  * @param att_AgIntegralOrder 
	  * @throws Exception
	  */
	@RequestMapping(value = "/integral/saveDelivery.htm")
	public void saveDelivery(HttpServletRequest request ,HttpServletResponse response,AgIntegralOrder att_AgIntegralOrder) throws Exception{
		agIntegralOrderService.setRequest(request);  
		SysRetrunMessage srm=agIntegralOrderService.savefire(att_AgIntegralOrder);
		returnData(response,srm);
	}
	
	/**
	 * 根据积分ID获取积分订单信息
	 * @param request
	 * @param response
	 * @param id 订单ID
	 * @throws Exception
	 */
	@RequestMapping(value = "/integral/orderInfo.htm")
	public void orderInfo(HttpServletRequest request,
			HttpServletResponse response, Integer id) throws Exception {
		agIntegralOrderService.setRequest(request); 
		SysRetrunMessage srm=agIntegralOrderService.findFormObject(id);
		returnData(response,srm);
	}
	
	/**
	 * 签到
	 * @param request
	 * @param response
	 * @throws Exception
	 */
	@RequestMapping(value = "/integral/doSign.htm")
	public void doSign(HttpServletRequest request,
			HttpServletResponse response) throws Exception {
		agIntegralInfoService.setRequest(request); 
		SysUserInfo userinfo=this.getLoginSysUserInfo(request);		 
		SysRetrunMessage srm=agIntegralInfoService.savedoSign(userinfo.getSroleId(), "1");
		returnData(response,srm);
	}
	/**
	 * 获取签到列表
	 * @param request
	 * @param response
	 * @throws Exception
	 */
	@RequestMapping(value = "/integral/getSignList.htm")
	public void getSignList(HttpServletRequest request,HttpServletResponse response) throws Exception {
		SysRetrunMessage srm = new SysRetrunMessage(1l);
		agIntegralInfoService.setRequest(request); 
		 AgIntegralInfo att_AgIntegralInfo=new AgIntegralInfo();
		 att_AgIntegralInfo.setSuiId(this.getLoginSysUserInfo(request).getSroleId());
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
	 *  获取每日任务清单
	 * @param request
	 * @param response
	 * @throws Exception
	 */
	@RequestMapping(value = "/integral/getDayTask.htm")
	public void GetDayTask(HttpServletRequest request,HttpServletResponse response) throws Exception {
		SysRetrunMessage srm = new SysRetrunMessage(1l);
		agIntegralInfoService.setRequest(request); 
		SysUserInfo userinfo=this.getLoginSysUserInfo(request);
		AgIntegralInfo att_AgIntegralInfo=new AgIntegralInfo ();
		
		att_AgIntegralInfo.setSuiId(userinfo.getSroleId());
		att_AgIntegralInfo.setCreateDate_start(new Date());
		att_AgIntegralInfo.setCreateDate_end(new Date());
		att_AgIntegralInfo.setUserType("1");
		srm=agIntegralInfoService.getCountInfo(att_AgIntegralInfo);
		returnData(response,srm);
	}
	
	/**
	 *  获取积分信息
	 * @param request
	 * @param response
	 * @throws Exception
	 */
	@RequestMapping(value = "/integral/getIntegralList.htm")
	public void GetIntegralList(HttpServletRequest request,HttpServletResponse response) throws Exception {
		SysRetrunMessage srm = new SysRetrunMessage(1l);
		agIntegralInfoService.setRequest(request); 
		SysUserInfo userinfo=this.getLoginSysUserInfo(request);
		AgIntegralInfo att_AgIntegralInfo=new AgIntegralInfo ();
		
		att_AgIntegralInfo.setSuiId(userinfo.getSuiId());
		att_AgIntegralInfo.setCreateDate_start(new Date());
		att_AgIntegralInfo.setCreateDate_end(new Date());
		 srm.setObj(agIntegralInfoService.getCountIntegral(att_AgIntegralInfo));
		returnData(response,srm);
	}
	/**
	 * 获取今日积分
	 * @param request
	 * @param response
	 * @throws Exception
	 */
	@RequestMapping(value = "/integral/getAccumulatePoints.htm")
	public void GetAccumulatePoints(HttpServletRequest request,HttpServletResponse response) throws Exception {
		SysRetrunMessage srm = new SysRetrunMessage(1l);
		agIntegralInfoService.setRequest(request); 
		srm=agIntegralInfoService.getCountDayIntegral();
		returnData(response,srm);
	}
	/**
	 * 获取积分明细信息
	 * @param request
	 * @param response
	 * @throws Exception
	 */
	@RequestMapping(value = "/integral/getIntegrationInfo.htm")
	public void getIntegrationInfo(HttpServletRequest request,HttpServletResponse response)throws Exception {
		SysRetrunMessage srm = new SysRetrunMessage(1l);
		agMoneyCountService.setRequest(request);  
		SysUserInfo userinfo=this.getLoginSysUserInfo(request);
		srm=agMoneyCountService.getIntegrationInfo(userinfo.getSroleId(), "1");
		returnData(response, srm);
	}
}
