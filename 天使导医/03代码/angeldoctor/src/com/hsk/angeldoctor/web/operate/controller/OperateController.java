package com.hsk.angeldoctor.web.operate.controller;

import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import com.hsk.angeldoctor.api.persistence.AgEvaluateInfo;
import com.hsk.angeldoctor.api.persistence.AgFeedbackInfo;
import com.hsk.angeldoctor.api.persistence.AgInformationInfo;
import com.hsk.angeldoctor.api.persistence.AgNewsInfo;
import com.hsk.angeldoctor.api.persistence.AgOrderInfo;
import com.hsk.angeldoctor.web.operate.service.IAgDepositInfoService;
import com.hsk.angeldoctor.web.operate.service.IAgEvaluateInfoService;
import com.hsk.angeldoctor.web.operate.service.IAgFeedbackInfoService;
import com.hsk.angeldoctor.web.operate.service.IAgInformationInfoService;
import com.hsk.angeldoctor.web.operate.service.IAgNewsInfoService;
import com.hsk.angeldoctor.web.order.service.IAgOrderInfoService;
import com.hsk.supper.dto.comm.SysRetrunMessage;
import com.hsk.xframe.api.controller.imp.DSTController;
import com.hsk.xframe.api.persistence.SysUserInfo;

@Controller
public class OperateController extends DSTController{
	
	@Autowired
	private IAgEvaluateInfoService agEvaluateInfoService;
	@Autowired
	private IAgFeedbackInfoService agFeedbackInfoService;
	@Autowired
	private IAgNewsInfoService agNewsInfoService;
	@Autowired
	private IAgInformationInfoService agInformationInfoService;
	@Autowired
	private IAgOrderInfoService agOrderInfoService;
	@Autowired
	private IAgDepositInfoService agDepositInfoService;
	/**
	 * 获取评价列表
	 * @param request
	 * @param response
	 * @param att_agEvaluateInfo
	 * @param createDateStart
	 * @param createDateEnd
	 * @throws Exception
	 */
	@RequestMapping(value = "/operate/evaluateList.htm")
	public void evaluateList(HttpServletRequest request ,HttpServletResponse response,@ModelAttribute AgEvaluateInfo att_agEvaluateInfo,String createDateStart,String createDateEnd) throws Exception{
		SysRetrunMessage srm=new SysRetrunMessage(1l);
		agEvaluateInfoService.setRequest(request);
		//设置开始时间结束时间
		SimpleDateFormat sdf =new SimpleDateFormat("yyyy-MM-dd");
		if(createDateStart!=null && !createDateStart.trim().equals(""))
			att_agEvaluateInfo.setCreateDate_start(sdf.parse(createDateStart));
		if(createDateEnd!=null && !createDateEnd.trim().equals(""))
			att_agEvaluateInfo.setCreateDate_end(sdf.parse(createDateEnd));
		att_agEvaluateInfo.setOrderPatientId(att_agEvaluateInfo.getPatientId());
		att_agEvaluateInfo.setPatientId(null);
		//设置like字段
		srm.setObj(agEvaluateInfoService.getPagerModelObject(att_agEvaluateInfo));
		returnData(response,srm);
	}
	/**
	 * 回复评价信息
	 * @param request
	 * @param response
	 * @param id
	 * @param repliedContent
	 * @throws Exception
	 */
	@RequestMapping(value = "/operate/addReplyEvaluate.htm")
	public void addReplyEvaluate(HttpServletRequest request ,HttpServletResponse response,Integer id,String repliedContent) throws Exception{
		SysRetrunMessage srm=new SysRetrunMessage(1l);
		agEvaluateInfoService.setRequest(request);
		AgEvaluateInfo agEvaluateInfo= agEvaluateInfoService.findObject(id);
		agEvaluateInfo.setReplied("1");//设置为已回复
		if(this.getUserType(request).equals("1"))//设置是否医院回复
			agEvaluateInfo.setIsHosRep("1");
		else 
			agEvaluateInfo.setIsHosRep("0");
		agEvaluateInfo.setRepliedContent(repliedContent);
 		agEvaluateInfo.setRepliedDate(new Date());
		srm = agEvaluateInfoService.saveOrUpdateObject(agEvaluateInfo);
		returnData(response,srm);
	}
	/**
	 * 获取评价详情
	 * @param request
	 * @param response
	 * @param id
	 * @throws Exception
	 */
	@RequestMapping(value = "/operate/evaluateInfo.htm")
	public void evaluateInfo(HttpServletRequest request ,HttpServletResponse response,Integer id) throws Exception{
		agEvaluateInfoService.setRequest(request);
		SysRetrunMessage srm=agEvaluateInfoService.findFormObject(id);
		returnData(response,srm);
	}
	/**
	 * 查询患者反馈列表
	 * @param request
	 * @param response
	 * @param att_AgFeedbackInfo
	 * @param createDateStart
	 * @param createDateEnd
	 * @throws Exception
	 */
	@RequestMapping(value = "/operate/patientFeedbackList.htm")
	public void patientFeedbackList(HttpServletRequest request ,HttpServletResponse response,@ModelAttribute AgFeedbackInfo att_AgFeedbackInfo,String createDateStart,String createDateEnd) throws Exception{
		SysRetrunMessage srm=new SysRetrunMessage(1l);
		agFeedbackInfoService.setRequest(request);
		//设置开始时间结束时间
		SimpleDateFormat sdf =new SimpleDateFormat("yyyy-MM-dd");
		if(createDateStart!=null && !createDateStart.trim().equals(""))
			att_AgFeedbackInfo.setCreateDate_start(sdf.parse(createDateStart));
		if(createDateEnd!=null && !createDateEnd.trim().equals(""))
			att_AgFeedbackInfo.setCreateDate_end(sdf.parse(createDateEnd));
		att_AgFeedbackInfo.setFeedbackType("1");
		srm.setObj(agFeedbackInfoService.getPagerModelObject(att_AgFeedbackInfo));
		returnData(response,srm);
	}
	/**
	 * 查询宣传员反馈列表
	 * @param request
	 * @param response
	 * @param att_AgFeedbackInfo
	 * @param createDateStart
	 * @param createDateEnd
	 * @throws Exception
	 */
	@RequestMapping(value = "/operate/agentFeedbackList.htm")
	public void agentFeedbackList(HttpServletRequest request ,HttpServletResponse response,@ModelAttribute AgFeedbackInfo att_AgFeedbackInfo,String createDateStart,String createDateEnd) throws Exception{
		SysRetrunMessage srm=new SysRetrunMessage(1l);
		agFeedbackInfoService.setRequest(request);
		//设置开始时间结束时间
		SimpleDateFormat sdf =new SimpleDateFormat("yyyy-MM-dd");
		if(createDateStart!=null && !createDateStart.trim().equals(""))
			att_AgFeedbackInfo.setCreateDate_start(sdf.parse(createDateStart));
		if(createDateEnd!=null && !createDateEnd.trim().equals(""))
			att_AgFeedbackInfo.setCreateDate_end(sdf.parse(createDateEnd));
		att_AgFeedbackInfo.setFeedbackType("2");
		srm.setObj(agFeedbackInfoService.getPagerModelObject(att_AgFeedbackInfo));
		returnData(response,srm);
	}
	/**
	 * 增加宣传员反馈
	 * @param request
	 * @param response
	 * @param att_AgFeedbackInfo
	 * @throws Exception
	 */
	@RequestMapping(value = "/operate/addFeedback.htm")
	public void addFeedback(HttpServletRequest request ,HttpServletResponse response,@ModelAttribute AgFeedbackInfo att_AgFeedbackInfo) throws Exception{
		agFeedbackInfoService.setRequest(request);
		att_AgFeedbackInfo.setFeedbackType("2");//业务员反馈
		att_AgFeedbackInfo.setUserId(this.getLoginSysUserInfo(request).getSroleId());
		//查询流水号 agOrderInfoService
		AgOrderInfo agOrderInfo = agOrderInfoService.findObject(att_AgFeedbackInfo.getMedicalRecordId());
		att_AgFeedbackInfo.setSerialNumber(agOrderInfo.getSerialNumber());
		att_AgFeedbackInfo.setOrderPatientId(agOrderInfo.getPatientId());
		SysRetrunMessage srm = agFeedbackInfoService.saveOrUpdateObject(att_AgFeedbackInfo);
		returnData(response,srm);
	}
	/**
	 * 回复反馈信息
	 * @param request
	 * @param response
	 * @param id
	 * @param repliedContent
	 * @throws Exception
	 */
	@RequestMapping(value = "/operate/addReplyFeedback.htm")
	public void addReplyFeedback(HttpServletRequest request ,HttpServletResponse response,Integer id,String repliedContent) throws Exception{
		SysRetrunMessage srm=new SysRetrunMessage(1l);
		agFeedbackInfoService.setRequest(request);
		AgFeedbackInfo agFeedbackInfo= agFeedbackInfoService.findObject(id);
		agFeedbackInfo.setReplied("1");//设置为已回复
		agFeedbackInfo.setRepliedContent(repliedContent);
		agFeedbackInfo.setRepUserId(this.getLoginSysUserInfo(request).getSuiId());
		agFeedbackInfo.setRepliedDate(new Date());
		srm = agFeedbackInfoService.saveOrUpdateObject(agFeedbackInfo);
		returnData(response,srm);
	}
	/**
	 * 获取反馈信息
	 * @param request
	 * @param response
	 * @param id
	 * @throws Exception
	 */
	@RequestMapping(value = "/operate/feedbackInfo.htm")
	public void feedbackInfo(HttpServletRequest request ,HttpServletResponse response,Integer id) throws Exception{
		agFeedbackInfoService.setRequest(request);
		SysRetrunMessage srm=agFeedbackInfoService.findFormObject(id);
		returnData(response,srm);
	}
	/**
	 * 获取消息列表
	 * @param request
	 * @param response
	 * @throws Exception
	 */
	@RequestMapping(value = "/operate/newsList.htm")
	public void newsList(HttpServletRequest request ,HttpServletResponse response) throws Exception{
		SysRetrunMessage srm=new SysRetrunMessage(1l);
		SysUserInfo userinfo=this.getLoginSysUserInfo(request); 
		AgNewsInfo att_AgNewsInfo = new AgNewsInfo();
		att_AgNewsInfo.setStatus("0");
		srm.setObj(agNewsInfoService.getPagerModelObject(att_AgNewsInfo));
		returnData(response,srm);
	}
	/**
	 * 获取消息详情
	 * @param request
	 * @param response
	 * @param id
	 * @throws Exception
	 */
	@RequestMapping(value = "/operate/newsInfo.htm")
	public void newsInfo(HttpServletRequest request ,HttpServletResponse response,Integer id) throws Exception{
		SysRetrunMessage srm=new SysRetrunMessage(1l);
		agNewsInfoService.setRequest(request);
		srm.setObj(agNewsInfoService.findObject(id));
		returnData(response,srm);
	}
	/**
	 * 保存消息
	 * @param request
	 * @param response
	 * @param title
	 * @param content
	 * @throws Exception
	 */
	@RequestMapping(value = "/operate/addNews.htm")
	public void addNews(HttpServletRequest request ,HttpServletResponse response,String title,String content) throws Exception{
		agNewsInfoService.setRequest(request);
		AgNewsInfo att_AgNewsInfo = new AgNewsInfo();
		att_AgNewsInfo.setStatus("0");
		att_AgNewsInfo.setTitle(title);
		att_AgNewsInfo.setBody(content);
		att_AgNewsInfo.setCreateDate(new Date());
		att_AgNewsInfo.setPortalUserId(this.getLoginSysUserInfo(request).getSuiId());
		SysRetrunMessage srm = agNewsInfoService.saveOrUpdateObject(att_AgNewsInfo);
		returnData(response,srm);
	}
	/**
	 * 获取资讯列表
	 * @param request
	 * @param response
	 * @throws Exception
	 */
	@RequestMapping(value = "/operate/informationList.htm")
	public void informationList(HttpServletRequest request ,HttpServletResponse response,@ModelAttribute AgInformationInfo att_AgInformationInfo,String createDateStart,String createDateEnd) throws Exception{
		SysRetrunMessage srm=new SysRetrunMessage(1l);
		agInformationInfoService.setRequest(request);
		//设置开始时间结束时间
		SimpleDateFormat sdf =new SimpleDateFormat("yyyy-MM-dd");
		if(createDateStart!=null && !createDateStart.trim().equals(""))
			att_AgInformationInfo.setCreateDate_start(sdf.parse(createDateStart));
		if(createDateEnd!=null && !createDateEnd.trim().equals(""))
			att_AgInformationInfo.setCreateDate_end(sdf.parse(createDateEnd));
		
		srm.setObj(agInformationInfoService.getPagerModelObject(att_AgInformationInfo));
		returnData(response,srm);
	}
	/**
	 * 获取资讯详情
	 * @param request
	 * @param response
	 * @param id
	 * @throws Exception
	 */
	@RequestMapping(value = "/operate/informationInfo.htm")
	public void informationInfo(HttpServletRequest request ,HttpServletResponse response,Integer id) throws Exception{
		SysRetrunMessage srm=new SysRetrunMessage(1l);
		agInformationInfoService.setRequest(request);
		srm.setObj(agInformationInfoService.findObject(id));
		returnData(response,srm);
	}
	/**
	 * 保存资讯信息
	 * @param request
	 * @param response
	 * @param title
	 * @param content
	 * @throws Exception
	 * 
	 */
	@RequestMapping(value = "/operate/addInformation.htm")
	public void addInformation(HttpServletRequest request ,HttpServletResponse response,@RequestBody AgInformationInfo att_AgInformationInfo) throws Exception{
		agInformationInfoService.setRequest(request);
		SysRetrunMessage srm =new SysRetrunMessage(1l);
		if(att_AgInformationInfo.getAiiId()==null){
			att_AgInformationInfo.setPageRead(0);
			srm = agInformationInfoService.saveOrUpdateObject(att_AgInformationInfo);
		}else{
			AgInformationInfo info = agInformationInfoService.findObject(att_AgInformationInfo.getAiiId());
			info.setType(att_AgInformationInfo.getType());
			info.setProvId(att_AgInformationInfo.getProvId());
			info.setCityId(att_AgInformationInfo.getCityId());
			info.setTitle(att_AgInformationInfo.getTitle());
			info.setAuthor(att_AgInformationInfo.getAuthor());
			info.setIcon(att_AgInformationInfo.getIcon());
			info.setDigest(att_AgInformationInfo.getDigest());
			info.setContent(att_AgInformationInfo.getContent());
			info.setIsBanner(att_AgInformationInfo.getIsBanner());
			info.setBannerIcon(att_AgInformationInfo.getBannerIcon());
			info.setBannerStartDate(att_AgInformationInfo.getBannerStartDate());
			info.setBannerEndDate((att_AgInformationInfo.getBannerEndDate()));
			info.setStatus(att_AgInformationInfo.getStatus());
			srm = agInformationInfoService.saveOrUpdateObject(info);
		}
		returnData(response,srm);
	}
	/**
	 * 删除资讯信息
	 * @param request
	 * @param response
	 * @param id
	 * @throws Exception
	 */
	@RequestMapping(value = "/operate/deleteInformation.htm")
	public void deleteInformation(HttpServletRequest request ,HttpServletResponse response,Integer id) throws Exception{
		agNewsInfoService.setRequest(request);
		SysRetrunMessage srm = agInformationInfoService.deleteObject(id);
		returnData(response,srm);
	}
	/**
	 * 医院充值
	 * @param request
	 * @param response
	 * @param organizationId
	 * @param depositAmount
	 * @throws Exception
	 */
	@RequestMapping(value = "/operate/saveDeposit.htm")
	public void saveDeposit(HttpServletRequest request ,HttpServletResponse response,Integer organizationId,Double depositAmount) throws Exception{
		agDepositInfoService.setRequest(request);
		SysRetrunMessage srm = agDepositInfoService.saveAgDepositInfo(organizationId, depositAmount);
		returnData(response,srm);
	}
	/**
	 * 获取banner列表
	 * @param request
	 * @param response
	 * @throws Exception
	 */
	@RequestMapping(value = "/operate/getBannerList.htm")
	public void getBannerList(HttpServletRequest request ,HttpServletResponse response,String provId,String cityId) throws Exception{
		SysRetrunMessage srm=new SysRetrunMessage(1l);
		agInformationInfoService.setRequest(request);
		srm.setObj(agInformationInfoService.getBannerList(provId,cityId));
		returnData(response,srm);
	}
	
}
