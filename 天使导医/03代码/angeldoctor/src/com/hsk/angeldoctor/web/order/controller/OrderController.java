package com.hsk.angeldoctor.web.order.controller;

import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.hsk.angeldoctor.api.persistence.AgDealView;
import com.hsk.angeldoctor.api.persistence.AgMoneyCount;
import com.hsk.angeldoctor.api.persistence.AgOrderInfo;
import com.hsk.angeldoctor.api.persistence.AgOrderView;
import com.hsk.angeldoctor.api.persistence.AgPatientInfo;
import com.hsk.angeldoctor.web.order.service.IAgDealInfoService;
import com.hsk.angeldoctor.web.order.service.IAgMoneyCountService;
import com.hsk.angeldoctor.web.order.service.IAgOrderInfoService;
import com.hsk.angeldoctor.web.order.service.IAgPatientInfoService;
import com.hsk.supper.dto.comm.SysRetrunMessage;
import com.hsk.xframe.api.controller.imp.DSTController;

@Controller
public class OrderController extends DSTController{
	
	@Autowired
	private IAgOrderInfoService agOrderInfoService;
	@Autowired
	private IAgDealInfoService agDealInfoService;
	@Autowired
	private IAgPatientInfoService agPatientInfoService;
	@Autowired
	private	IAgMoneyCountService agMoneyCountService;
	 
	
	/**
	 * 业务系统查询预约列表
	 * @param request
	 * @param response
	 * @param att_AgOrderView
	 * @param registerStartDate
	 * @param registerEndDate
	 * @throws Exception
	 */
	@RequestMapping(value = "/order/orderList.htm")
	public void orderList(HttpServletRequest request,HttpServletResponse response,@ModelAttribute AgOrderView att_AgOrderView,String registerStartDate,String registerEndDate,String previousRegistration,String isToday) throws Exception{
		SysRetrunMessage srm=new SysRetrunMessage(1l);
		agOrderInfoService.setRequest(request);
		if(isToday!=null && isToday.equals("1")){
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
			registerStartDate=sdf.format(new Date());
			registerEndDate=sdf.format(new Date());
		}
		
		
		srm.setObj(agOrderInfoService.getPagerAgOrderView(att_AgOrderView, registerStartDate, registerEndDate, previousRegistration));
		returnData(response,srm);
	}
	/**
	 * 业务员获取自己的预约列表o
	 * @param request
	 * @param response
	 * @param outpatientStatus
	 * @param registerStatus
	 * @throws Exception
	 */
	@RequestMapping(value = "/order/agentOrderList.htm")
	public void agentOrderList(HttpServletRequest request,HttpServletResponse response,String outpatientStatus,String registerStatus) throws Exception{
		SysRetrunMessage srm=new SysRetrunMessage(1l);
		agDealInfoService.setRequest(request);
		AgDealView agDealView = new AgDealView();
		agDealView.setOutpatientStatus(outpatientStatus);
		agDealView.setRegisterStatus(registerStatus);
		agDealView.setRegisterType("0");
		agDealView.setAgentId(this.getLoginSysUserInfo(request).getSroleId());
		srm.setObj(agDealInfoService.getPagerAgDealView(agDealView));
		returnData(response,srm);
	}
	/**
	 * 业务员创建预约信息
	 * @param request
	 * @param response
	 * @param att_AgOrderInfo
	 * @throws Exception
	 */
	@RequestMapping(value = "/order/busSaveOrder.htm")
	public void busSaveOrder(HttpServletRequest request ,HttpServletResponse response,@ModelAttribute AgOrderInfo att_AgOrderInfo) throws Exception{
		agOrderInfoService.setRequest(request);
		att_AgOrderInfo.setAgentId(this.getLoginSysUserInfo(request).getSroleId());
		att_AgOrderInfo.setRegisterType("0");
		//设置预约人姓名
		att_AgOrderInfo.setOutpatientName(this.getLoginSysUserInfo(request).getUserName());
		SysRetrunMessage srm=agOrderInfoService.saveAppyInfo(att_AgOrderInfo);
		returnData(response,srm);
	}
	/**
	 * 医院新增收费患者
	 * @param request
	 * @param response
	 * @param att_AgOrderInfo
	 * @throws Exception
	 */
	@RequestMapping(value = "/order/hosSaveOrder.htm")
	public void hosSaveOrder(HttpServletRequest request ,HttpServletResponse response,String patientName,String patientMobile,
			String patientGender,String patientAge,String patientSource,Double treatmentFee,Double drugFee,Integer departmentId,Integer doctorId,
			String comment,Integer registrationId,Integer regDepartmentId,Integer regDoctorId,String registerDate,Integer shiftPeriodId,Integer shiftPlanId,String description) throws Exception{
		agOrderInfoService.setRequest(request);
		if(treatmentFee==null)
			treatmentFee=0d;
		if(drugFee==null)
			drugFee=0d;
		SysRetrunMessage srm=agOrderInfoService.addHosAgOrderInfo(patientName, patientMobile, patientGender, patientAge, patientSource, treatmentFee, drugFee, departmentId, doctorId, comment, 
				regDepartmentId, regDoctorId, registerDate, shiftPeriodId, shiftPlanId, description);
		returnData(response,srm);
	}
	/**
	 * 根据患者姓名手机号校验患者是否已经存在
	 * @param request
	 * @param response
	 * @param name
	 * @param mobile
	 * @throws Exception
	 */
	@RequestMapping(value = "/order/getCheckParent.htm")
	public void getCheckParent(HttpServletRequest request ,HttpServletResponse response,String name,String mobile) throws Exception{
		agPatientInfoService.setRequest(request);
		SysRetrunMessage srm=agPatientInfoService.getAgPatientInfoByName(name, mobile);
		returnData(response,srm);
	}
	/**
	 * 取消待约信息
	 * @param request
	 * @param response
	 * @param registrationId
	 * @throws Exception
	 */
	@RequestMapping(value = "/order/cancelOrder.htm")
	public void cancelOrder(HttpServletRequest request ,HttpServletResponse response,Integer id) throws Exception{
		agOrderInfoService.setRequest(request);
		AgOrderInfo agOrderInfo = agOrderInfoService.findObject(id);
		agOrderInfo.setOutpatientStatus("3");
		agOrderInfo.setRegisterStatus("2");
		SysRetrunMessage srm=agOrderInfoService.saveOrUpdateObject(agOrderInfo);
		returnData(response,srm);
	}
	/**
	 * 根据预约ID查询预约详情
	 * @param request
	 * @param response
	 * @param registrationId
	 * @throws Exception
	 */
	@RequestMapping(value = "/order/orderInfo.htm")
	public void orderInfo(HttpServletRequest request ,HttpServletResponse response,Integer id) throws Exception{
		agOrderInfoService.setRequest(request);
		SysRetrunMessage srm=agOrderInfoService.findFormObject(id);
		returnData(response,srm);
	}
	/**
	 * 根据预约流水号查询收费详情
	 * @param request
	 * @param response
	 * @param serialNumber
	 * @throws Exception
	 */
	@RequestMapping(value = "/order/orderInfoBySerialNumber.htm")
	public void orderInfoBySerialNumber(HttpServletRequest request ,HttpServletResponse response,String serialNumber) throws Exception{
		agOrderInfoService.setRequest(request);
		SysRetrunMessage srm=agOrderInfoService.findFormObjectBySerialNumber(serialNumber);
		returnData(response,srm);
	}
	/**
	 * 修改代约信息
	 * @param request
	 * @param response
	 * @param registrationId
	 * @param departmentId
	 * @param shiftPlanId
	 * @param shiftPeriodId
	 * @param doctorId
	 * @param registerDate
	 * @throws Exception
	 */
	@RequestMapping(value = "/order/editBusOrder.htm")
	public void editBusOrder(HttpServletRequest request ,HttpServletResponse response,Integer registrationId,Integer departmentId,Integer shiftPlanId,Integer shiftPeriodId,Integer doctorId,String registerDate) throws Exception{
		agOrderInfoService.setRequest(request);
		AgOrderInfo agOrderInfo = agOrderInfoService.findObject(registrationId);
		agOrderInfo.setDepartmentId(departmentId);
		agOrderInfo.setShiftPeriodId(shiftPeriodId);
		agOrderInfo.setShiftPlanId(shiftPlanId);
		agOrderInfo.setDoctorId(doctorId);
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		agOrderInfo.setRegisterDate(sdf.parse(registerDate));
		SysRetrunMessage srm=agOrderInfoService.saveOrUpdateObject(agOrderInfo);
		returnData(response,srm);
	}
	/**
	 * 确认收费
	 * @param request
	 * @param response
	 * @param patientName
	 * @param registrationId
	 * @param treatmentFee
	 * @param drugFee
	 * @param departmentId
	 * @param doctorId
	 * @param comment
	 * @param regDepartmentId
	 * @param regDoctorId
	 * @param registerDate
	 * @param shiftPeriodId
	 * @param shiftPlanId
	 * @param description
	 * @throws Exception
	 */
	@RequestMapping(value = "/order/visit.htm")
	public void visit(HttpServletRequest request ,HttpServletResponse response,Integer registrationId,
			Double treatmentFee,Double drugFee,Integer departmentId,Integer doctorId,
			String comment,Integer regDepartmentId,Integer regDoctorId,String registerDate,Integer shiftPeriodId,Integer shiftPlanId,String description) throws Exception{
		agOrderInfoService.setRequest(request);
		if(treatmentFee==null)
			treatmentFee=0d;
		if(drugFee==null)
			drugFee=0d;
		SysRetrunMessage srm=agDealInfoService.addVisit(registrationId, treatmentFee, drugFee, departmentId, doctorId, comment, regDepartmentId, regDoctorId, registerDate, shiftPeriodId, shiftPlanId, description);
		returnData(response,srm);
	}
	
	
	/**
	 * 查询患者列表
	 * @param request
	 * @param response
	 * @param att_AgPatientInfo
	 * @throws Exception
	 */
	@RequestMapping(value = "/order/patientList.htm")
	public void patientList(HttpServletRequest request,
			HttpServletResponse response,
			@ModelAttribute AgPatientInfo att_AgPatientInfo,String patientMobile,String patientName) throws Exception {
		SysRetrunMessage srm = new SysRetrunMessage(1l);
		agPatientInfoService.setRequest(request);
		att_AgPatientInfo.setName(patientName);
		att_AgPatientInfo.setMobile(patientMobile);
		att_AgPatientInfo.setTab_like("name");
		srm.setObj(agPatientInfoService.getPagerModelObject(att_AgPatientInfo));
		returnData(response, srm);
	}
	/**
	 * 医院端获取患者列表
	 * @param request
	 * @param response
	 * @param att_AgPatientInfo
	 * @param patientMobile
	 * @param patientName
	 * @throws Exception
	 */
	@RequestMapping(value = "/order/getHosPatientList.htm")
	public void getHosPatientList(HttpServletRequest request,
			HttpServletResponse response,
			@ModelAttribute AgPatientInfo att_AgPatientInfo,String patientMobile,String patientName,String createDateStart,String createDateEnd) throws Exception {
		SysRetrunMessage srm = new SysRetrunMessage(1l);
		agPatientInfoService.setRequest(request);
		att_AgPatientInfo.setName(patientName);
		att_AgPatientInfo.setMobile(patientMobile);
		att_AgPatientInfo.setTab_like("name,mobile");
		//设置开始时间结束时间
		SimpleDateFormat sdf =new SimpleDateFormat("yyyy-MM-dd");
		if(createDateStart!=null && !createDateStart.trim().equals(""))
			att_AgPatientInfo.setLastDealDate_start(sdf.parse(createDateStart));
		if(createDateEnd!=null && !createDateEnd.trim().equals(""))
			att_AgPatientInfo.setLastDealDate_end(sdf.parse(createDateEnd));
		srm.setObj(agPatientInfoService.getHosPagerModelObject(att_AgPatientInfo));
		returnData(response, srm);
	}
	/**
	 * 获取会员列表
	 * @param request
	 * @param response
	 * @param att_AgPatientInfo
	 * @param patientMobile
	 * @param patientName
	 * @throws Exception
	 */
	@RequestMapping(value = "/order/getSerPatientList.htm")
	public void getSerPatientList(HttpServletRequest request,HttpServletResponse response,String createDateStart,String createDateEnd,String mobile,String name,String sceneMobile) throws Exception {
		SysRetrunMessage srm = new SysRetrunMessage(1l);
		agPatientInfoService.setRequest(request);
		srm.setObj(agPatientInfoService.getSerPagerModelObject(createDateStart, createDateEnd, mobile, name, sceneMobile));
		returnData(response, srm);
	}
	/**
	 * app获取患者列表
	 * @param request
	 * @param response
	 * @param keyWords
	 * @throws Exception
	 */
	@RequestMapping(value = "/order/getAgentScenes.htm")
	public void getAgentScenes(HttpServletRequest request,HttpServletResponse response,String keyWords) throws Exception {
		SysRetrunMessage srm = new SysRetrunMessage(1l);
		agPatientInfoService.setRequest(request);
		srm.setObj(agPatientInfoService.getAppPagerModelObject(keyWords));
		returnData(response, srm);
	}
	/**
	 * 根据患者id查询出患者详情信息
	 * @param request
	 * @param response
	 * @param id 患者id
	 * @throws Exception
	 */
	@RequestMapping(value = "/order/PatientInfo.htm")
	public void PatientInfo(HttpServletRequest request,
			HttpServletResponse response, Integer id) throws Exception {
		agPatientInfoService.setRequest(request); 
		SysRetrunMessage srm=agPatientInfoService.findFormObject(id);
		returnData(response,srm);
	}
	
	/**
	 * 根据患者id获取患者就医诊疗记录列表
	 * @param request
	 * @param response
	 * @param att_AgPatientInfo
	 * @param patientNameOrMobile  患者姓名或手机号 
	 * @throws Exception
	 */
	@RequestMapping(value = "/order/dealList.htm")
	public void dealList(HttpServletRequest request,
			HttpServletResponse response,
			@ModelAttribute AgDealView att_AgDealView,String  patientNameOrMobile,Integer id) throws Exception {
		SysRetrunMessage srm = new SysRetrunMessage(1l);
		agDealInfoService.setRequest(request);
		att_AgDealView.setPatientId(id);
		att_AgDealView.setOutpatientStatus("0");
		srm.setObj(agDealInfoService.getPagerAgDealView(att_AgDealView));
		returnData(response, srm);
	}
	
	
	/**
	 * 根据患者id获取患者消费统计
	 * @param request
	 * @param response
	 * @param id
	 * @throws Exception
	 */
	
	@RequestMapping(value = "/order/dealCount.htm")
	public void dealCount(HttpServletRequest request,
			HttpServletResponse response, Integer id) throws Exception {
		SysRetrunMessage srm = new SysRetrunMessage(1l);
		agMoneyCountService.setRequest(request);  
		AgMoneyCount att_AgMoneyCount=new AgMoneyCount();
		att_AgMoneyCount.setSuiId(id);
		srm.setObj(agMoneyCountService.getPagerModelObject(att_AgMoneyCount) );
		returnData(response,srm);
	}
	
	
	
}

