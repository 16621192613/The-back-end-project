package com.hsk.angeldoctor.api.daobbase;

import java.util.*;
import com.hsk.angeldoctor.api.persistence.*;
import com.hsk.exception.HSKDBException;
import com.hsk.supper.dto.comm.PagerModel;

/**
 * ag_doctor_info表数据库层面操作接口类 
 * @author  作者:admin
 * @version  版本信息:v1.0   创建时间: 2018-08-14 13:27:59
 */
public interface IAgDoctorInfoDao{
	
	/**
	 * 根据ag_doctor_info表主键查找AgDoctorInfo对象记录
	 * @param  DoctorId  Integer类型(ag_doctor_info表主键)
	 * @return AgDoctorInfo ag_doctor_info表记录
	 * @throws HSKDBException
	 */	
	public AgDoctorInfo findAgDoctorInfoById(Integer DoctorId) throws HSKDBException;
	
	/**
	 * 根据ag_doctor_info表主键删除AgDoctorInfo对象记录
     * @param  DoctorId  Integer类型(ag_doctor_info表主键)
	 * @throws HSKDBException
	 */
	public void deleteAgDoctorInfoById(Integer DoctorId) throws HSKDBException;
	 
	/**
 	 * 根据ag_doctor_info表主键修改AgDoctorInfo对象记录
	 * @param  DoctorId  Integer类型(ag_doctor_info表主键)
	 * @param  att_AgDoctorInfo  AgDoctorInfo类型(ag_doctor_info表记录)
	 * @return AgDoctorInfo  修改后的AgDoctorInfo对象记录
	 * @throws HSKDBException
	 */
	public  AgDoctorInfo updateAgDoctorInfoById(Integer DoctorId,AgDoctorInfo att_AgDoctorInfo) throws HSKDBException;
	
	/**
	 * 新增ag_doctor_info表 记录
     * @param  att_AgDoctorInfo  AgDoctorInfo类型(ag_doctor_info表记录)
     * @return ag_doctor_info表主键值
	 * @throws HSKDBException
	 */
	public Integer saveAgDoctorInfo(AgDoctorInfo att_AgDoctorInfo) throws HSKDBException;
	
	 /**
	 * 新增或修改ag_doctor_info表记录 ,如果ag_doctor_info表主键AgDoctorInfo.DoctorId为空就是添加，如果非空就是修改
     * @param  att_AgDoctorInfo  AgDoctorInfo类型(ag_doctor_info表记录)
     * @return AgDoctorInfo  修改后的AgDoctorInfo对象记录
	 * @throws HSKDBException
	 */
	public  AgDoctorInfo saveOrUpdateAgDoctorInfo( AgDoctorInfo att_AgDoctorInfo) throws HSKDBException;
	
	/**
	 *根据AgDoctorInfo对象作为对(ag_doctor_info表进行查询，获取分页对象
     * @param  att_AgDoctorInfo  AgDoctorInfo类型(ag_doctor_info表记录)
     * @return PagerModel  分页对象
	 * @throws HSKDBException 
	 */
	public PagerModel getPagerModelByAgDoctorInfo (AgDoctorInfo att_AgDoctorInfo) throws HSKDBException;
	
    /**
	 *根据AgDoctorInfo对象作为对(ag_doctor_info表进行查询，获取分页对象
     * @param  att_AgDoctorInfo  AgDoctorInfo类型(ag_doctor_info表记录)
     * @return List<AgDoctorInfo>  列表对象
	 * @throws HSKDBException 
	 */
	public List<AgDoctorInfo> getListByAgDoctorInfo ( AgDoctorInfo att_AgDoctorInfo) throws HSKDBException;

}