package com.hsk.angeldoctor.web.hospital.service;

import java.util.*;
import com.hsk.angeldoctor.api.persistence.*;
import com.hsk.angeldoctor.api.daobbase.*;
import com.hsk.supper.dto.comm.PagerModel;
import com.hsk.supper.dto.comm.SysRetrunMessage;
import com.hsk.xframe.api.service.IDSTService;
import com.hsk.exception.HSKException;

/**
 * hospital业务操作接口类 
 * @author  作者:admin
 * @version  版本信息:v1.0   创建时间: 2018-08-14 13:27:59
 */
public interface IAgDoctorDepartmentGxService extends IDSTService{


		/**
	 * 查找AgDoctorDepartmentGx对象记录，用于弹出添加、修改窗口时候初始化数据
	 * @param  addgId  Integer类型(ag_doctor_department_gx表主键)
	  * @return SysRetrunMessage 对象记录
	 * @throws HSKException
	 */	
	public SysRetrunMessage findFormObject(Integer addgId) throws HSKException;

	
	/**
	 * 查找AgDoctorDepartmentGx对象记录，用于弹出添加、修改窗口时候初始化数据
	 * @param  addgId  Integer类型(ag_doctor_department_gx表主键)
	 * @return AgDoctorDepartmentGx ag_doctor_department_gx表记录
	 * @throws HSKException
	 */	
	public AgDoctorDepartmentGx findObject(Integer addgId) throws HSKException;
	
	/**
	 * 根据ag_doctor_department_gx表主键删除AgDoctorDepartmentGx对象记录
     * @param  addgId  Integer类型(ag_doctor_department_gx表主键)
     * @return SysRetrunMessage 对象记录
	 * @throws HSKException
	 */
	public SysRetrunMessage deleteObject(Integer addgId) throws HSKException;
	
	
	
	/**
	 * 根据ag_doctor_department_gx表主键删除多条AgDoctorDepartmentGx对象记录
     * @param  addgIds  Integer类型(ag_doctor_department_gx表主键)
     * @return SysRetrunMessage 对象记录
	 * @throws HSKException
	 */
	public SysRetrunMessage deleteAllObject(String addgIds) throws HSKException;
	
	 /**
	 * 新增或修改ag_doctor_department_gx表记录 ,如果ag_doctor_department_gx表主键AgDoctorDepartmentGx.addgId为空就是添加，如果非空就是修改
     * @param  att_AgDoctorDepartmentGx  AgDoctorDepartmentGx类型(ag_doctor_department_gx表记录)
     * @return SysRetrunMessage 对象记录
	 * @throws HSKException
	 */
	public SysRetrunMessage   saveOrUpdateObject( AgDoctorDepartmentGx att_AgDoctorDepartmentGx) throws HSKException;
	
	/**
	 *根据AgDoctorDepartmentGx对象作为对(ag_doctor_department_gx表进行查询，获取分页对象
     * @param  att_AgDoctorDepartmentGx  AgDoctorDepartmentGx类型(ag_doctor_department_gx表记录)
     * @return PagerModel  分页对象
	 * @throws HSKException 
	 */
	public PagerModel getPagerModelObject (AgDoctorDepartmentGx att_AgDoctorDepartmentGx) throws HSKException;
	
}