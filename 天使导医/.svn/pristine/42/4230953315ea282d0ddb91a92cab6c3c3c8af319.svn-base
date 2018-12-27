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
 * @version  版本信息:v1.0   创建时间: 2018-08-14 13:28:02
 */
public interface IAgJobMenuGxService extends IDSTService{


		/**
	 * 查找AgJobMenuGx对象记录，用于弹出添加、修改窗口时候初始化数据
	 * @param  ajmgId  Integer类型(ag_job_menu_gx表主键)
	  * @return SysRetrunMessage 对象记录
	 * @throws HSKException
	 */	
	public SysRetrunMessage findFormObject(Integer ajmgId) throws HSKException;
	/**
	 * 查找AgJobMenuGx对象记录，用于弹出添加、修改窗口时候初始化数据
	 * @param  ajmgId  Integer类型(ag_job_menu_gx表主键)
	 * @return AgJobMenuGx ag_job_menu_gx表记录
	 * @throws HSKException
	 */	
	public AgJobMenuGx findObject(Integer ajmgId) throws HSKException;
	/**
	 * 根据ag_job_menu_gx表主键删除AgJobMenuGx对象记录
     * @param  ajmgId  Integer类型(ag_job_menu_gx表主键)
     * @return SysRetrunMessage 对象记录
	 * @throws HSKException
	 */
	public SysRetrunMessage deleteObject(Integer ajmgId) throws HSKException;
	/**
	 * 根据ag_job_menu_gx表主键删除多条AgJobMenuGx对象记录
     * @param  ajmgIds  Integer类型(ag_job_menu_gx表主键)
     * @return SysRetrunMessage 对象记录
	 * @throws HSKException
	 */
	public SysRetrunMessage deleteAllObject(String ajmgIds) throws HSKException;
	
	 /**
	 * 新增或修改ag_job_menu_gx表记录 ,如果ag_job_menu_gx表主键AgJobMenuGx.ajmgId为空就是添加，如果非空就是修改
     * @param  att_AgJobMenuGx  AgJobMenuGx类型(ag_job_menu_gx表记录)
     * @return SysRetrunMessage 对象记录
	 * @throws HSKException
	 */
	public SysRetrunMessage   saveOrUpdateObject( AgJobMenuGx att_AgJobMenuGx) throws HSKException;
	
	/**
	 *根据AgJobMenuGx对象作为对(ag_job_menu_gx表进行查询，获取分页对象
     * @param  att_AgJobMenuGx  AgJobMenuGx类型(ag_job_menu_gx表记录)
     * @return PagerModel  分页对象
	 * @throws HSKException 
	 */
	public PagerModel getPagerModelObject (AgJobMenuGx att_AgJobMenuGx) throws HSKException;
	/**
	 * 根据岗位ID获取菜单列表
	 * @param jobId
	 * @return
	 * @throws HSKException
	 */
	public List<AgHospitalMenu> getMenuListByJobId(Integer jobId) throws HSKException;
	/**
	 * 获取登录用户菜单信息
	 * @return
	 * @throws HSKException
	 */
	public List<AgHospitalMenu> getLoginMenuList() throws HSKException;
	/**
	 * 根据岗位ID获取关系列表
	 * @param jobId
	 * @return
	 * @throws HSKException
	 */
	public List<Map<String,Object>> getAgHospitalMenuGxList(Integer jobId) throws HSKException;
	/**
	 * 保存岗位菜单列表
	 * @param jobId
	 * @param menuIds
	 * @return
	 * @throws HSKException
	 */
	public SysRetrunMessage saveAgHospitalMenuGxs(Integer jobId,String menuIds)  throws HSKException;
	/**
	 * 删除岗位菜单列表
	 * @param menuIds
	 * @return
	 * @throws HSKException
	 */
	public SysRetrunMessage deleteAgHospitalMenuGxs(Integer jobId,String menuIds)  throws HSKException;
}