package com.hsk.angeldoctor.api.daobbase;

import java.util.*;
import com.hsk.angeldoctor.api.persistence.*;
import com.hsk.exception.HSKDBException;
import com.hsk.supper.dto.comm.PagerModel;

/**
 * ag_patient_info表数据库层面操作接口类 
 * @author  作者:admin
 * @version  版本信息:v1.0   创建时间: 2018-08-14 13:35:37
 */
public interface IAgPatientInfoDao{
	
	/**
	 * 根据ag_patient_info表主键查找AgPatientInfo对象记录
	 * @param  PatientId  Integer类型(ag_patient_info表主键)
	 * @return AgPatientInfo ag_patient_info表记录
	 * @throws HSKDBException
	 */	
	public AgPatientInfo findAgPatientInfoById(Integer PatientId) throws HSKDBException;
	
	/**
	 * 根据ag_patient_info表主键删除AgPatientInfo对象记录
     * @param  PatientId  Integer类型(ag_patient_info表主键)
	 * @throws HSKDBException
	 */
	public void deleteAgPatientInfoById(Integer PatientId) throws HSKDBException;
	 
	/**
 	 * 根据ag_patient_info表主键修改AgPatientInfo对象记录
	 * @param  PatientId  Integer类型(ag_patient_info表主键)
	 * @param  att_AgPatientInfo  AgPatientInfo类型(ag_patient_info表记录)
	 * @return AgPatientInfo  修改后的AgPatientInfo对象记录
	 * @throws HSKDBException
	 */
	public  AgPatientInfo updateAgPatientInfoById(Integer PatientId,AgPatientInfo att_AgPatientInfo) throws HSKDBException;
	
	/**
	 * 新增ag_patient_info表 记录
     * @param  att_AgPatientInfo  AgPatientInfo类型(ag_patient_info表记录)
     * @return ag_patient_info表主键值
	 * @throws HSKDBException
	 */
	public Integer saveAgPatientInfo(AgPatientInfo att_AgPatientInfo) throws HSKDBException;
	
	 /**
	 * 新增或修改ag_patient_info表记录 ,如果ag_patient_info表主键AgPatientInfo.PatientId为空就是添加，如果非空就是修改
     * @param  att_AgPatientInfo  AgPatientInfo类型(ag_patient_info表记录)
     * @return AgPatientInfo  修改后的AgPatientInfo对象记录
	 * @throws HSKDBException
	 */
	public  AgPatientInfo saveOrUpdateAgPatientInfo( AgPatientInfo att_AgPatientInfo) throws HSKDBException;
	
	/**
	 *根据AgPatientInfo对象作为对(ag_patient_info表进行查询，获取分页对象
     * @param  att_AgPatientInfo  AgPatientInfo类型(ag_patient_info表记录)
     * @return PagerModel  分页对象
	 * @throws HSKDBException 
	 */
	public PagerModel getPagerModelByAgPatientInfo (AgPatientInfo att_AgPatientInfo) throws HSKDBException;
	
    /**
	 *根据AgPatientInfo对象作为对(ag_patient_info表进行查询，获取分页对象
     * @param  att_AgPatientInfo  AgPatientInfo类型(ag_patient_info表记录)
     * @return List<AgPatientInfo>  列表对象
	 * @throws HSKDBException 
	 */
	public List<AgPatientInfo> getListByAgPatientInfo ( AgPatientInfo att_AgPatientInfo) throws HSKDBException;
	/**
	 * 根据id查询统计
	 * @param id
	 * @return
	 * @throws HSKDBException
	 */
	public List<Object> getCount ( Integer id) throws HSKDBException;
	/**
	 * 查询微信患者列表
	 * @param createDateStart
	 * @param createDateEnd
	 * @param mobile
	 * @param name
	 * @param sceneMobile
	 * @return
	 * @throws HSKDBException
	 */
	public PagerModel getWechatPatienPager(String createDateStart,String createDateEnd,String mobile,String name,String sceneMobile)throws HSKDBException;
	/**
	 * 根据业务员ID查询患者列表
	 * @param agentId
	 * @param keyWords
	 * @return
	 * @throws HSKDBException
	 */
	public PagerModel getAppPatienPager(Integer agentId,String keyWords) throws HSKDBException;
	/**
	 * 统计业务员患者数
	 * @param agentId
	 * @return
	 * @throws HSKDBException
	 */
	public Integer countAppPatient(Integer agentId) throws HSKDBException;
	/**
	 * 获取医院的统计信息
	 * @param att_AgPatientInfo
	 * @return
	 * @throws HSKDBException
	 */
	public PagerModel getHosPatienByAgPatientInfo (AgPatientInfo att_AgPatientInfo,Integer organizationId) throws HSKDBException;

}