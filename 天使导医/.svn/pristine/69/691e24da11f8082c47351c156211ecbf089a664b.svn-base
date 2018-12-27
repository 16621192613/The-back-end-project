package com.hsk.angeldoctor.api.daobbase;

import java.util.*;
import com.hsk.angeldoctor.api.persistence.*;
import com.hsk.exception.HSKDBException;
import com.hsk.supper.dto.comm.PagerModel;

/**
 * ag_department_info表数据库层面操作接口类 
 * @author  作者:admin
 * @version  版本信息:v1.0   创建时间: 2018-08-14 13:27:59
 */
public interface IAgDepartmentInfoDao{
	
	/**
	 * 根据ag_department_info表主键查找AgDepartmentInfo对象记录
	 * @param  DepartmentId  Integer类型(ag_department_info表主键)
	 * @return AgDepartmentInfo ag_department_info表记录
	 * @throws HSKDBException
	 */	
	public AgDepartmentInfo findAgDepartmentInfoById(Integer DepartmentId) throws HSKDBException;
	
	/**
	 * 根据ag_department_info表主键删除AgDepartmentInfo对象记录
     * @param  DepartmentId  Integer类型(ag_department_info表主键)
	 * @throws HSKDBException
	 */
	public void deleteAgDepartmentInfoById(Integer DepartmentId) throws HSKDBException;
	 
	/**
 	 * 根据ag_department_info表主键修改AgDepartmentInfo对象记录
	 * @param  DepartmentId  Integer类型(ag_department_info表主键)
	 * @param  att_AgDepartmentInfo  AgDepartmentInfo类型(ag_department_info表记录)
	 * @return AgDepartmentInfo  修改后的AgDepartmentInfo对象记录
	 * @throws HSKDBException
	 */
	public  AgDepartmentInfo updateAgDepartmentInfoById(Integer DepartmentId,AgDepartmentInfo att_AgDepartmentInfo) throws HSKDBException;
	
	/**
	 * 新增ag_department_info表 记录
     * @param  att_AgDepartmentInfo  AgDepartmentInfo类型(ag_department_info表记录)
     * @return ag_department_info表主键值
	 * @throws HSKDBException
	 */
	public Integer saveAgDepartmentInfo(AgDepartmentInfo att_AgDepartmentInfo) throws HSKDBException;
	
	 /**
	 * 新增或修改ag_department_info表记录 ,如果ag_department_info表主键AgDepartmentInfo.DepartmentId为空就是添加，如果非空就是修改
     * @param  att_AgDepartmentInfo  AgDepartmentInfo类型(ag_department_info表记录)
     * @return AgDepartmentInfo  修改后的AgDepartmentInfo对象记录
	 * @throws HSKDBException
	 */
	public  AgDepartmentInfo saveOrUpdateAgDepartmentInfo( AgDepartmentInfo att_AgDepartmentInfo) throws HSKDBException;
	
	/**
	 *根据AgDepartmentInfo对象作为对(ag_department_info表进行查询，获取分页对象
     * @param  att_AgDepartmentInfo  AgDepartmentInfo类型(ag_department_info表记录)
     * @return PagerModel  分页对象
	 * @throws HSKDBException 
	 */
	public PagerModel getPagerModelByAgDepartmentInfo (AgDepartmentInfo att_AgDepartmentInfo) throws HSKDBException;
	
    /**
	 *根据AgDepartmentInfo对象作为对(ag_department_info表进行查询，获取分页对象
     * @param  att_AgDepartmentInfo  AgDepartmentInfo类型(ag_department_info表记录)
     * @return List<AgDepartmentInfo>  列表对象
	 * @throws HSKDBException 
	 */
	public List<AgDepartmentInfo> getListByAgDepartmentInfo ( AgDepartmentInfo att_AgDepartmentInfo) throws HSKDBException;

}