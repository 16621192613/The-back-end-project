package com.hsk.angeldoctor.web.finance.controller;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
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

import com.hsk.angeldoctor.api.persistence.AgDepartmentInfo;
import com.hsk.angeldoctor.api.persistence.AgDoctorInfo;
import com.hsk.angeldoctor.api.persistence.AgHospitalInfo;
import com.hsk.angeldoctor.api.persistence.AgOrderInfo;
import com.hsk.angeldoctor.api.persistence.AgWorkView;
import com.hsk.angeldoctor.web.hospital.service.IAgDepartmentInfoService;
import com.hsk.angeldoctor.web.hospital.service.IAgDoctorInfoService;
import com.hsk.angeldoctor.web.hospital.service.IAgHospitalInfoService;
import com.hsk.angeldoctor.web.hospital.service.IAgWorkInfoService;
import com.hsk.angeldoctor.web.order.service.IAgOrderInfoService;
import com.hsk.supper.dto.comm.SysRetrunMessage;
import com.hsk.xframe.api.controller.imp.DSTController;
import com.hsk.xframe.api.utils.freeMarker.WeixinUtils;

/**
 * 外部 接口
 * @author zhangshu
 * @version v.10
 */
@Controller
public class OutsideController extends DSTController{
	@Autowired
	private IAgHospitalInfoService agHospitalInfoService;
	@Autowired
	private IAgDepartmentInfoService agDepartmentInfoService;
	@Autowired
	private	IAgDoctorInfoService  agDoctorInfoService;
	@Autowired
	private IAgWorkInfoService agWorkInfoService;
	@Autowired
	private IAgOrderInfoService agOrderInfoService;
	
	/**
	 * 根据医院域名查询医院详细系你先
	 * @param request
	 * @param response
	 * @param domainName
	 * @throws Exception
	 */
	@RequestMapping(value = "/outside/hospitalInfo.htm")
	public void hospitalInfo(HttpServletRequest request,HttpServletResponse response,String domainName) throws Exception {
		SysRetrunMessage srm = new SysRetrunMessage(1l);
		agDepartmentInfoService.setRequest(request);
		if(domainName==null || domainName.trim().equals("")){
			domainName= request.getHeader("domainName");
		}
		domainName = domainName.replace("http://", "");
		AgHospitalInfo agHospitalInfo = agHospitalInfoService.getAgHospitalInfoByDomainName(domainName);
		if(agHospitalInfo!=null && agHospitalInfo.getOrganizationId() !=null){
			srm.setObj(agHospitalInfo);
		}else{
			srm.setCode(0l);
			srm.setMeg("没有该医院信息!");
		}
		
		returnData(response, srm);
	}
	/**
	 * 根据医院ID查询科室列表
	 * @param request
	 * @param response
	 * @param organizationId
	 * @throws Exception
	 */
	@RequestMapping(value = "/outside/departList.htm")
	public void departList(HttpServletRequest request,HttpServletResponse response,String domainName) throws Exception {
		SysRetrunMessage srm = new SysRetrunMessage(1l);
		agDepartmentInfoService.setRequest(request);
		if(domainName==null || domainName.trim().equals("")){
			domainName= request.getHeader("dominName");
		}
		domainName = domainName.replace("http://", "");
		AgHospitalInfo agHospitalInfo = agHospitalInfoService.getAgHospitalInfoByDomainName(domainName);
		if(agHospitalInfo!=null && agHospitalInfo.getOrganizationId() !=null){
			AgDepartmentInfo att_AgDepartmentInfo = new AgDepartmentInfo();
			att_AgDepartmentInfo.setOrganizationId(agHospitalInfo.getOrganizationId());
			att_AgDepartmentInfo.setVisible("1");
			srm.setObj(agDepartmentInfoService.getAgDepartmentInfoList(att_AgDepartmentInfo));
		}else{
			srm.setCode(0l);
			srm.setMeg("没有该医院信息!");
		}
		
		returnData(response, srm);
	}
	/**
	 * 根据科室ID查询医生列表
	 * @param request
	 * @param response
	 * @param departmentId
	 * @throws Exception
	 */
	@RequestMapping(value = "/outside/doctorList.htm")
	public void doctorList(HttpServletRequest request,HttpServletResponse response,Integer departmentId) throws Exception {
		SysRetrunMessage srm = new SysRetrunMessage(1l);
		agDoctorInfoService.setRequest(request);
		srm.setObj(agDoctorInfoService.getAgDoctorInfoListByDepId(departmentId));
		returnData(response, srm);
	}
	/**
	 * 根据医生ID条件查询医生详细信息
	 * @param request
	 * @param response
	 * @param id  医生id
	 * @throws Exception
	 */
	@RequestMapping(value = "/outside/doctorInfo.htm")
	public void doctorInfo(HttpServletRequest request,HttpServletResponse response, Integer id) throws Exception {
		agDoctorInfoService.setRequest(request); 
		SysRetrunMessage srm=agDoctorInfoService.findFormObject(id);	
		returnData(response,srm);
	}
	
	/**
	 * 排班列表查询
	 * @param request
	 * @param response
	 * @param departmentId
	 * @param doctorId
	 * @throws Exception
	 */
	@RequestMapping(value = "/outside/workInfoList.htm")
	public void workInfoList(HttpServletRequest request,HttpServletResponse response, Integer departmentId,Integer doctorId) throws Exception {
		agWorkInfoService.setRequest(request); 
		SysRetrunMessage srm=new SysRetrunMessage(1l);
		AgWorkView att_AgWorkView = new AgWorkView();
		att_AgWorkView.setDepartmentId(departmentId);
		att_AgWorkView.setDoctorId(doctorId);
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm");
		Date now = new Date();
		Calendar cal = Calendar.getInstance();
		cal.setTime(now);
		//cal.set(Calendar.HOUR_OF_DAY, cal.get(Calendar.HOUR_OF_DAY) - 1);     
		String searchStart = sdf.format(cal.getTime());
		//2周后的今天
		cal.setTime(now);
		cal.add(cal.DATE,14);
		String searchEnd = sdf.format(cal.getTime());
		att_AgWorkView.setShiftEnd_start(searchStart);
		att_AgWorkView.setShiftEnd_end(searchEnd);
		List<AgWorkView> list = agWorkInfoService.getAgWorkViewList(att_AgWorkView);
		List<AgWorkView> reList = new ArrayList<AgWorkView>();
		Map<String,Object> reMap= new HashMap<String,Object>();
		Map<String,Object> infoMap =  new HashMap<String,Object>();
		Integer actualCount=0;
		Integer planCount=0;
		if(list != null && list.size() >0){
			for(AgWorkView work : list){
				if(sdf.parse(work.getShiftEnd()).after(now) && sdf.parse(work.getShiftEnd()).before(cal.getTime())){
					actualCount+=work.getActualCount();
					planCount+=work.getPlanCount();
					if(work.getPlanCount() > work.getActualCount())
						reList.add(work);
				}
			}
			AgWorkView agWorkView =list.get(0);
			infoMap.put("organizationId", agWorkView.getOrganizationId());
			infoMap.put("departmentName", agWorkView.getDepartmentName());
			infoMap.put("organizationName", agWorkView.getOrganizationName());
			infoMap.put("doctorName", agWorkView.getDoctorName());
			infoMap.put("actualCount", actualCount);
			infoMap.put("planCount", planCount);
		}
		reMap.put("plans", reList);
		reMap.put("info", infoMap);
		srm.setObj(reMap);
		returnData(response,srm);
	}
	
	/**
	 * 创建预约信息
	 * @param request
	 * @param response
	 * @param att_AgOrderInfo
	 * @throws Exception
	 */
	@RequestMapping(value = "/outside/saveOrder.htm")
	public void saveOrder(HttpServletRequest request ,HttpServletResponse response,@ModelAttribute AgOrderInfo att_AgOrderInfo) throws Exception{
		agOrderInfoService.setRequest(request);
		att_AgOrderInfo.setRegisterType("4");
		SysRetrunMessage srm=agOrderInfoService.saveAppyInfo(att_AgOrderInfo);
		returnData(response,srm);
	}
	
	@RequestMapping(value = "/outside/testTicket.htm")
	public void testTicket(HttpServletRequest request ,HttpServletResponse response) throws Exception{
		SysRetrunMessage srm=new SysRetrunMessage(1l);
		WeixinUtils.createForeverTicket(11);
		returnData(response,srm);
	}
	@RequestMapping(value = "/outside/showQrcode.htm")
	public void showQrcode(HttpServletRequest request ,HttpServletResponse response) throws Exception{
		SysRetrunMessage srm=new SysRetrunMessage(1l);
		WeixinUtils.showQrcode("gQEG8TwAAAAAAAAAAS5odHRwOi8vd2VpeGluLnFxLmNvbS9xLzAySTJfbUZZLVBmM2sxMDAwMGcwM3gAAgTHfepbAwQAAAAA");
		returnData(response,srm);
	}
	
}
