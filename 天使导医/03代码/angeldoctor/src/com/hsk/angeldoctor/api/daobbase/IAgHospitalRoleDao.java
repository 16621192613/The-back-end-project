package com.hsk.angeldoctor.api.daobbase;

import java.util.*;
import com.hsk.angeldoctor.api.persistence.*;
import com.hsk.exception.HSKDBException;
import com.hsk.supper.dto.comm.PagerModel;

/**
 * ag_hospital_role表数据库层面操作接口类 
 * @author  作者:admin
 * @version  版本信息:v1.0   创建时间: 2018-08-14 13:28:01
 */
public interface IAgHospitalRoleDao{
	
	/**
	 * 根据ag_hospital_role表主键查找AgHospitalRole对象记录
	 * @param  RoleId  Integer类型(ag_hospital_role表主键)
	 * @return AgHospitalRole ag_hospital_role表记录
	 * @throws HSKDBException
	 */	
	public AgHospitalRole findAgHospitalRoleById(Integer RoleId) throws HSKDBException;
	
	/**
	 * 根据ag_hospital_role表主键删除AgHospitalRole对象记录
     * @param  RoleId  Integer类型(ag_hospital_role表主键)
	 * @throws HSKDBException
	 */
	public void deleteAgHospitalRoleById(Integer RoleId) throws HSKDBException;
	 
	/**
 	 * 根据ag_hospital_role表主键修改AgHospitalRole对象记录
	 * @param  RoleId  Integer类型(ag_hospital_role表主键)
	 * @param  att_AgHospitalRole  AgHospitalRole类型(ag_hospital_role表记录)
	 * @return AgHospitalRole  修改后的AgHospitalRole对象记录
	 * @throws HSKDBException
	 */
	public  AgHospitalRole updateAgHospitalRoleById(Integer RoleId,AgHospitalRole att_AgHospitalRole) throws HSKDBException;
	
	/**
	 * 新增ag_hospital_role表 记录
     * @param  att_AgHospitalRole  AgHospitalRole类型(ag_hospital_role表记录)
     * @return ag_hospital_role表主键值
	 * @throws HSKDBException
	 */
	public Integer saveAgHospitalRole(AgHospitalRole att_AgHospitalRole) throws HSKDBException;
	
	 /**
	 * 新增或修改ag_hospital_role表记录 ,如果ag_hospital_role表主键AgHospitalRole.RoleId为空就是添加，如果非空就是修改
     * @param  att_AgHospitalRole  AgHospitalRole类型(ag_hospital_role表记录)
     * @return AgHospitalRole  修改后的AgHospitalRole对象记录
	 * @throws HSKDBException
	 */
	public  AgHospitalRole saveOrUpdateAgHospitalRole( AgHospitalRole att_AgHospitalRole) throws HSKDBException;
	
	/**
	 *根据AgHospitalRole对象作为对(ag_hospital_role表进行查询，获取分页对象
     * @param  att_AgHospitalRole  AgHospitalRole类型(ag_hospital_role表记录)
     * @return PagerModel  分页对象
	 * @throws HSKDBException 
	 */
	public PagerModel getPagerModelByAgHospitalRole (AgHospitalRole att_AgHospitalRole) throws HSKDBException;
	
    /**
	 *根据AgHospitalRole对象作为对(ag_hospital_role表进行查询，获取分页对象
     * @param  att_AgHospitalRole  AgHospitalRole类型(ag_hospital_role表记录)
     * @return List<AgHospitalRole>  列表对象
	 * @throws HSKDBException 
	 */
	public List<AgHospitalRole> getListByAgHospitalRole ( AgHospitalRole att_AgHospitalRole) throws HSKDBException;

}