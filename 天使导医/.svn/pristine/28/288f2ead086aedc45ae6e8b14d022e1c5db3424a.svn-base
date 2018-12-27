package com.hsk.angeldoctor.web.order.service;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.hsk.angeldoctor.api.persistence.AgOrderInfo;
import com.hsk.angeldoctor.api.persistence.AgOrderView;
import com.hsk.exception.HSKDBException;
import com.hsk.exception.HSKException;
import com.hsk.supper.dto.comm.PagerModel;
import com.hsk.supper.dto.comm.SysRetrunMessage;
import com.hsk.xframe.api.service.IDSTService;

/**
 * order业务操作接口类 
 * @author  作者:admin
 * @version  版本信息:v1.0   创建时间: 2018-08-14 13:35:36
 */
public interface IAgOrderInfoService extends IDSTService{


		/**
	 * 查找AgOrderInfo对象记录，用于弹出添加、修改窗口时候初始化数据
	 * @param  aoiId  Integer类型(ag_order_info表主键)
	  * @return SysRetrunMessage 对象记录
	 * @throws HSKException
	 */	
	public SysRetrunMessage findFormObject(Integer aoiId) throws HSKException;
	/**
	 * 根据预约流水号查询预约详情
	 * @param serialNumber
	 * @return
	 * @throws HSKException
	 */
	public SysRetrunMessage findFormObjectBySerialNumber(String serialNumber) throws HSKException;

	
	/**
	 * 查找AgOrderInfo对象记录，用于弹出添加、修改窗口时候初始化数据
	 * @param  aoiId  Integer类型(ag_order_info表主键)
	 * @return AgOrderInfo ag_order_info表记录
	 * @throws HSKException
	 */	
	public AgOrderInfo findObject(Integer aoiId) throws HSKException;
	
	/**
	 * 根据ag_order_info表主键删除AgOrderInfo对象记录
     * @param  aoiId  Integer类型(ag_order_info表主键)
     * @return SysRetrunMessage 对象记录
	 * @throws HSKException
	 */
	public SysRetrunMessage deleteObject(Integer aoiId) throws HSKException;
	
	
	
	/**
	 * 根据ag_order_info表主键删除多条AgOrderInfo对象记录
     * @param  aoiIds  Integer类型(ag_order_info表主键)
     * @return SysRetrunMessage 对象记录
	 * @throws HSKException
	 */
	public SysRetrunMessage deleteAllObject(String aoiIds) throws HSKException;
	
	 /**
	 * 新增或修改ag_order_info表记录 ,如果ag_order_info表主键AgOrderInfo.aoiId为空就是添加，如果非空就是修改
     * @param  att_AgOrderInfo  AgOrderInfo类型(ag_order_info表记录)
     * @return SysRetrunMessage 对象记录
	 * @throws HSKException
	 */
	public SysRetrunMessage   saveOrUpdateObject( AgOrderInfo att_AgOrderInfo) throws HSKException;
	
	/**
	 *根据AgOrderInfo对象作为对(ag_order_info表进行查询，获取分页对象
     * @param  att_AgOrderInfo  AgOrderInfo类型(ag_order_info表记录)
     * @return PagerModel  分页对象
	 * @throws HSKException 
	 */
	public PagerModel getPagerModelObject (AgOrderInfo att_AgOrderInfo) throws HSKException;
	/**
	 * 创建预约信息
	 * @param att_AgOrderInfo
	 * @return
	 * @throws HSKException
	 */
	public SysRetrunMessage saveAppyInfo(AgOrderInfo att_AgOrderInfo) throws HSKException;
	/**
	 * 医院新增患者信息
	 * @param patientName
	 * @param patientMobile
	 * @param patientGender
	 * @param patientAge
	 * @param patientSource
	 * @param treatmentFee
	 * @param drugFee
	 * @param departmentId
	 * @param doctorId
	 * @param comment
	 * @param registrationId
	 * @param regDepartmentId
	 * @param regDoctorId
	 * @param registerDate
	 * @param shiftPeriodId
	 * @param shiftPlanId
	 * @param description
	 * @return
	 * @throws HSKException
	 */
	public SysRetrunMessage addHosAgOrderInfo(String patientName,String patientMobile,
			String patientGender,String patientAge,String patientSource,Double treatmentFee,Double drugFee,Integer departmentId,Integer doctorId,
			String comment,Integer regDepartmentId,Integer regDoctorId,String registerDate,Integer shiftPeriodId,Integer shiftPlanId,String description)throws HSKException; 
	/**
	 * 查询预约列表
	 * @param agOrderView
	 * @param registerStartDate
	 * @param registerEndDate
	 * @return
	 * @throws HSKDBException
	 */
	public PagerModel getPagerAgOrderView(AgOrderView agOrderView,String registerStartDate,String registerEndDate,String previousRegistration) throws HSKException;
}