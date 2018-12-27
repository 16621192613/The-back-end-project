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
public interface IAgDepartmentInfoService extends IDSTService{


		/**
	 * 查找AgDepartmentInfo对象记录，用于弹出添加、修改窗口时候初始化数据
	 * @param  departmentId  Integer类型(ag_department_info表主键)
	  * @return SysRetrunMessage 对象记录
	 * @throws HSKException
	 */	
	public SysRetrunMessage findFormObject(Integer departmentId) throws HSKException;

	
	/**
	 * 查找AgDepartmentInfo对象记录，用于弹出添加、修改窗口时候初始化数据
	 * @param  departmentId  Integer类型(ag_department_info表主键)
	 * @return AgDepartmentInfo ag_department_info表记录
	 * @throws HSKException
	 */	
	public AgDepartmentInfo findObject(Integer departmentId) throws HSKException;
	
	/**
	 * 根据ag_department_info表主键删除AgDepartmentInfo对象记录
     * @param  departmentId  Integer类型(ag_department_info表主键)
     * @return SysRetrunMessage 对象记录
	 * @throws HSKException
	 */
	public SysRetrunMessage deleteObject(Integer departmentId) throws HSKException;
	
	
	
	/**
	 * 根据ag_department_info表主键删除多条AgDepartmentInfo对象记录
     * @param  departmentIds  Integer类型(ag_department_info表主键)
     * @return SysRetrunMessage 对象记录
	 * @throws HSKException
	 */
	public SysRetrunMessage deleteAllObject(String departmentIds) throws HSKException;
	
	 /**
	 * 新增或修改ag_department_info表记录 ,如果ag_department_info表主键AgDepartmentInfo.departmentId为空就是添加，如果非空就是修改
     * @param  att_AgDepartmentInfo  AgDepartmentInfo类型(ag_department_info表记录)
     * @return SysRetrunMessage 对象记录
	 * @throws HSKException
	 */
	public SysRetrunMessage   saveOrUpdateObject( AgDepartmentInfo att_AgDepartmentInfo) throws HSKException;
	
	/**
	 *根据AgDepartmentInfo对象作为对(ag_department_info表进行查询，获取分页对象
     * @param  att_AgDepartmentInfo  AgDepartmentInfo类型(ag_department_info表记录)
     * @return PagerModel  分页对象
	 * @throws HSKException 
	 */
	public PagerModel getPagerModelObject (AgDepartmentInfo att_AgDepartmentInfo) throws HSKException;
	/**
	 * 查询所有科室列表
	 * @param att_AgDepartmentInfo
	 * @return
	 * @throws HSKException
	 */
	public List<AgDepartmentInfo> getAgDepartmentInfoList(AgDepartmentInfo att_AgDepartmentInfo) throws HSKException;
	
}