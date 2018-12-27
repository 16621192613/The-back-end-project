package com.hsk.angeldoctor.web.order.service;

import com.hsk.angeldoctor.api.persistence.AgPatientInfo;
import com.hsk.exception.HSKException;
import com.hsk.supper.dto.comm.PagerModel;
import com.hsk.supper.dto.comm.SysRetrunMessage;
import com.hsk.xframe.api.service.IDSTService;

/**
 * order业务操作接口类 
 * @author  作者:admin
 * @version  版本信息:v1.0   创建时间: 2018-08-14 13:35:37
 */
public interface IAgPatientInfoService extends IDSTService{
		/**
	 * 查找AgPatientInfo对象记录，用于弹出添加、修改窗口时候初始化数据
	 * @param  patientId  Integer类型(ag_patient_info表主键)
	  * @return SysRetrunMessage 对象记录
	 * @throws HSKException
	 */	
	public SysRetrunMessage findFormObject(Integer patientId) throws HSKException;

	
	/**
	 * 查找AgPatientInfo对象记录，用于弹出添加、修改窗口时候初始化数据
	 * @param  patientId  Integer类型(ag_patient_info表主键)
	 * @return AgPatientInfo ag_patient_info表记录
	 * @throws HSKException
	 */	
	public AgPatientInfo findObject(Integer patientId) throws HSKException;
	/**
	 * 根据姓名与手机号查询患者信息
	 * @param userName
	 * @param phone
	 * @return
	 * @throws HSKException
	 */
	public AgPatientInfo fingAgPatientInfoByNameAndPhone(String userName,String phone)  throws HSKException;
	/**
	 * 根据ag_patient_info表主键删除AgPatientInfo对象记录
     * @param  patientId  Integer类型(ag_patient_info表主键)
     * @return SysRetrunMessage 对象记录
	 * @throws HSKException
	 */
	public SysRetrunMessage deleteObject(Integer patientId) throws HSKException;
	
	
	
	/**
	 * 根据ag_patient_info表主键删除多条AgPatientInfo对象记录
     * @param  patientIds  Integer类型(ag_patient_info表主键)
     * @return SysRetrunMessage 对象记录
	 * @throws HSKException
	 */
	public SysRetrunMessage deleteAllObject(String patientIds) throws HSKException;
	
	 /**
	 * 新增或修改ag_patient_info表记录 ,如果ag_patient_info表主键AgPatientInfo.patientId为空就是添加，如果非空就是修改
     * @param  att_AgPatientInfo  AgPatientInfo类型(ag_patient_info表记录)
     * @return SysRetrunMessage 对象记录
	 * @throws HSKException
	 */
	public SysRetrunMessage   saveOrUpdateObject( AgPatientInfo att_AgPatientInfo) throws HSKException;
	
	/**
	 *根据AgPatientInfo对象作为对(ag_patient_info表进行查询，获取分页对象
     * @param  att_AgPatientInfo  AgPatientInfo类型(ag_patient_info表记录)
     * @return PagerModel  分页对象
	 * @throws HSKException 
	 */
	public PagerModel getPagerModelObject (AgPatientInfo att_AgPatientInfo) throws HSKException;
	/**
	 * 根据姓名手机号查询患者信息
	 * @param name
	 * @param mobile
	 * @return
	 * @throws HSKException
	 */
	public SysRetrunMessage getAgPatientInfoByName(String name,String mobile)throws HSKException;
	
	/**
	 * 根据患者id获取患者就医诊疗记录列表
	 * @param att_AgPatientInfo
	 * @return
	 * @throws HSKException
	 */
	public PagerModel getPagerModeldealList (AgPatientInfo att_AgPatientInfo) throws HSKException;
	
	
	/**
	 * 根据患者id获取患者消费统计
	 * @param id
	  * @return SysRetrunMessage 对象记录
	 * @throws HSKException
	 */
	public SysRetrunMessage  getDealCount(Integer id)throws HSKException;
	/**
	 * 根据微信ID查询患者 信息
	 * @param wechatUserId
	 * @return
	 * @throws HSKException
	 */
	public AgPatientInfo getAgPatientInfoByWechatUserId(Integer wechatUserId) throws HSKException;
	/**
	 * 获取医院患者列表
	 * @param att_AgPatientInfo
	 * @return
	 * @throws HSKException
	 */
	public PagerModel getHosPagerModelObject (AgPatientInfo att_AgPatientInfo) throws HSKException;
	/**
	 * 获取后台会员列表
	 * @param att_AgPatientInfo
	 * @return
	 * @throws HSKException
	 */
	public PagerModel getSerPagerModelObject (String createDateStart,String createDateEnd,String mobile,String name,String sceneMobile) throws HSKException;
	/**
	 * 获取app患者列表
	 * @param keyWords
	 * @return
	 * @throws HSKException
	 */
	public PagerModel getAppPagerModelObject (String keyWords) throws HSKException;
}