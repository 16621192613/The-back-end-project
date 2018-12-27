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
 * @version  版本信息:v1.0   创建时间: 2018-08-14 13:28:01
 */
public interface IAgHospitalRoleService extends IDSTService{


		/**
	 * 查找AgHospitalRole对象记录，用于弹出添加、修改窗口时候初始化数据
	 * @param  roleId  Integer类型(ag_hospital_role表主键)
	  * @return SysRetrunMessage 对象记录
	 * @throws HSKException
	 */	
	public SysRetrunMessage findFormObject(Integer roleId) throws HSKException;

	
	/**
	 * 查找AgHospitalRole对象记录，用于弹出添加、修改窗口时候初始化数据
	 * @param  roleId  Integer类型(ag_hospital_role表主键)
	 * @return AgHospitalRole ag_hospital_role表记录
	 * @throws HSKException
	 */	
	public AgHospitalRole findObject(Integer roleId) throws HSKException;
	
	/**
	 * 根据ag_hospital_role表主键删除AgHospitalRole对象记录
     * @param  roleId  Integer类型(ag_hospital_role表主键)
     * @return SysRetrunMessage 对象记录
	 * @throws HSKException
	 */
	public SysRetrunMessage deleteObject(Integer roleId) throws HSKException;
	
	
	
	/**
	 * 根据ag_hospital_role表主键删除多条AgHospitalRole对象记录
     * @param  roleIds  Integer类型(ag_hospital_role表主键)
     * @return SysRetrunMessage 对象记录
	 * @throws HSKException
	 */
	public SysRetrunMessage deleteAllObject(String roleIds) throws HSKException;
	
	 /**
	 * 新增或修改ag_hospital_role表记录 ,如果ag_hospital_role表主键AgHospitalRole.roleId为空就是添加，如果非空就是修改
     * @param  att_AgHospitalRole  AgHospitalRole类型(ag_hospital_role表记录)
     * @return SysRetrunMessage 对象记录
	 * @throws HSKException
	 */
	public SysRetrunMessage   saveOrUpdateObject( AgHospitalRole att_AgHospitalRole) throws HSKException;
	
	/**
	 *根据AgHospitalRole对象作为对(ag_hospital_role表进行查询，获取分页对象
     * @param  att_AgHospitalRole  AgHospitalRole类型(ag_hospital_role表记录)
     * @return PagerModel  分页对象
	 * @throws HSKException 
	 */
	public PagerModel getPagerModelObject (AgHospitalRole att_AgHospitalRole) throws HSKException;
	/**
	 * 根据登录用户获取角色列表
	 * @return
	 * @throws HSKException
	 */
	public List<AgHospitalRole> getAgHospitalRoleList() throws HSKException;
	
}