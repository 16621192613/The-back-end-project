package com.hsk.angeldoctor.api.daobbase;

import java.util.*;
import com.hsk.angeldoctor.api.persistence.*;
import com.hsk.exception.HSKDBException;
import com.hsk.supper.dto.comm.PagerModel;

/**
 * ag_doctor_department_gx表数据库层面操作接口类 
 * @author  作者:admin
 * @version  版本信息:v1.0   创建时间: 2018-08-14 13:27:59
 */
public interface IAgDoctorDepartmentGxDao{
	
	/**
	 * 根据ag_doctor_department_gx表主键查找AgDoctorDepartmentGx对象记录
	 * @param  AddgId  Integer类型(ag_doctor_department_gx表主键)
	 * @return AgDoctorDepartmentGx ag_doctor_department_gx表记录
	 * @throws HSKDBException
	 */	
	public AgDoctorDepartmentGx findAgDoctorDepartmentGxById(Integer AddgId) throws HSKDBException;
	
	/**
	 * 根据ag_doctor_department_gx表主键删除AgDoctorDepartmentGx对象记录
     * @param  AddgId  Integer类型(ag_doctor_department_gx表主键)
	 * @throws HSKDBException
	 */
	public void deleteAgDoctorDepartmentGxById(Integer AddgId) throws HSKDBException;
	 
	/**
 	 * 根据ag_doctor_department_gx表主键修改AgDoctorDepartmentGx对象记录
	 * @param  AddgId  Integer类型(ag_doctor_department_gx表主键)
	 * @param  att_AgDoctorDepartmentGx  AgDoctorDepartmentGx类型(ag_doctor_department_gx表记录)
	 * @return AgDoctorDepartmentGx  修改后的AgDoctorDepartmentGx对象记录
	 * @throws HSKDBException
	 */
	public  AgDoctorDepartmentGx updateAgDoctorDepartmentGxById(Integer AddgId,AgDoctorDepartmentGx att_AgDoctorDepartmentGx) throws HSKDBException;
	
	/**
	 * 新增ag_doctor_department_gx表 记录
     * @param  att_AgDoctorDepartmentGx  AgDoctorDepartmentGx类型(ag_doctor_department_gx表记录)
     * @return ag_doctor_department_gx表主键值
	 * @throws HSKDBException
	 */
	public Integer saveAgDoctorDepartmentGx(AgDoctorDepartmentGx att_AgDoctorDepartmentGx) throws HSKDBException;
	
	 /**
	 * 新增或修改ag_doctor_department_gx表记录 ,如果ag_doctor_department_gx表主键AgDoctorDepartmentGx.AddgId为空就是添加，如果非空就是修改
     * @param  att_AgDoctorDepartmentGx  AgDoctorDepartmentGx类型(ag_doctor_department_gx表记录)
     * @return AgDoctorDepartmentGx  修改后的AgDoctorDepartmentGx对象记录
	 * @throws HSKDBException
	 */
	public  AgDoctorDepartmentGx saveOrUpdateAgDoctorDepartmentGx( AgDoctorDepartmentGx att_AgDoctorDepartmentGx) throws HSKDBException;
	
	/**
	 *根据AgDoctorDepartmentGx对象作为对(ag_doctor_department_gx表进行查询，获取分页对象
     * @param  att_AgDoctorDepartmentGx  AgDoctorDepartmentGx类型(ag_doctor_department_gx表记录)
     * @return PagerModel  分页对象
	 * @throws HSKDBException 
	 */
	public PagerModel getPagerModelByAgDoctorDepartmentGx (AgDoctorDepartmentGx att_AgDoctorDepartmentGx) throws HSKDBException;
	
    /**
	 *根据AgDoctorDepartmentGx对象作为对(ag_doctor_department_gx表进行查询，获取分页对象
     * @param  att_AgDoctorDepartmentGx  AgDoctorDepartmentGx类型(ag_doctor_department_gx表记录)
     * @return List<AgDoctorDepartmentGx>  列表对象
	 * @throws HSKDBException 
	 */
	public List<AgDoctorDepartmentGx> getListByAgDoctorDepartmentGx ( AgDoctorDepartmentGx att_AgDoctorDepartmentGx) throws HSKDBException;

}