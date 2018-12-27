package com.hsk.angeldoctor.web.order.service;

import com.hsk.angeldoctor.api.persistence.AgDealInfo;
import com.hsk.angeldoctor.api.persistence.AgDealView;
import com.hsk.exception.HSKException;
import com.hsk.supper.dto.comm.PagerModel;
import com.hsk.supper.dto.comm.SysRetrunMessage;
import com.hsk.xframe.api.service.IDSTService;

/**
 * order业务操作接口类 
 * @author  作者:admin
 * @version  版本信息:v1.0   创建时间: 2018-08-14 13:35:36
 */
public interface IAgDealInfoService extends IDSTService{


		/**
	 * 查找AgDealInfo对象记录，用于弹出添加、修改窗口时候初始化数据
	 * @param  adiId  Integer类型(ag_deal_info表主键)
	  * @return SysRetrunMessage 对象记录
	 * @throws HSKException
	 */	
	public SysRetrunMessage findFormObject(Integer adiId) throws HSKException;

	
	/**
	 * 查找AgDealInfo对象记录，用于弹出添加、修改窗口时候初始化数据
	 * @param  adiId  Integer类型(ag_deal_info表主键)
	 * @return AgDealInfo ag_deal_info表记录
	 * @throws HSKException
	 */	
	public AgDealInfo findObject(Integer adiId) throws HSKException;
	
	/**
	 * 根据ag_deal_info表主键删除AgDealInfo对象记录
     * @param  adiId  Integer类型(ag_deal_info表主键)
     * @return SysRetrunMessage 对象记录
	 * @throws HSKException
	 */
	public SysRetrunMessage deleteObject(Integer adiId) throws HSKException;
	
	
	
	/**
	 * 根据ag_deal_info表主键删除多条AgDealInfo对象记录
     * @param  adiIds  Integer类型(ag_deal_info表主键)
     * @return SysRetrunMessage 对象记录
	 * @throws HSKException
	 */
	public SysRetrunMessage deleteAllObject(String adiIds) throws HSKException;
	
	 /**
	 * 新增或修改ag_deal_info表记录 ,如果ag_deal_info表主键AgDealInfo.adiId为空就是添加，如果非空就是修改
     * @param  att_AgDealInfo  AgDealInfo类型(ag_deal_info表记录)
     * @return SysRetrunMessage 对象记录
	 * @throws HSKException
	 */
	public SysRetrunMessage   saveOrUpdateObject( AgDealInfo att_AgDealInfo) throws HSKException;
	
	/**
	 *根据AgDealInfo对象作为对(ag_deal_info表进行查询，获取分页对象
     * @param  att_AgDealInfo  AgDealInfo类型(ag_deal_info表记录)
     * @return PagerModel  分页对象
	 * @throws HSKException 
	 */
	public PagerModel getPagerModelObject (AgDealInfo att_AgDealInfo) throws HSKException;
	/**
	 * 查询预约列表
	 * @param agDealView
	 * @return
	 * @throws HSKException
	 */
	public PagerModel getPagerAgDealView(AgDealView agDealView) throws HSKException;
	
	/**
	 * 增加收费信息
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
	 * @return
	 * @throws HSKException
	 */
	public SysRetrunMessage addVisit(Integer registrationId,Double treatmentFee,Double drugFee,Integer departmentId,Integer doctorId,
			String comment,Integer regDepartmentId,Integer regDoctorId,String registerDate,Integer shiftPeriodId,Integer shiftPlanId,String description) throws HSKException;
	/**
	 * 获取导医医生记录
	 * @return
	 * @throws HSKException
	 */
	public PagerModel getDealDocPager(Integer agentId,String registerType) throws HSKException;
	
}