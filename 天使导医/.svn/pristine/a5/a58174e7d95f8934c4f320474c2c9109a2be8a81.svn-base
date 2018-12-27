package com.hsk.angeldoctor.api.daobbase;

import java.util.*;
import com.hsk.angeldoctor.api.persistence.*;
import com.hsk.exception.HSKDBException;
import com.hsk.supper.dto.comm.PagerModel;

/**
 * ag_job_menu_gx表数据库层面操作接口类 
 * @author  作者:admin
 * @version  版本信息:v1.0   创建时间: 2018-08-14 13:28:02
 */
public interface IAgJobMenuGxDao{
	
	/**
	 * 根据ag_job_menu_gx表主键查找AgJobMenuGx对象记录
	 * @param  AjmgId  Integer类型(ag_job_menu_gx表主键)
	 * @return AgJobMenuGx ag_job_menu_gx表记录
	 * @throws HSKDBException
	 */	
	public AgJobMenuGx findAgJobMenuGxById(Integer AjmgId) throws HSKDBException;
	
	/**
	 * 根据ag_job_menu_gx表主键删除AgJobMenuGx对象记录
     * @param  AjmgId  Integer类型(ag_job_menu_gx表主键)
	 * @throws HSKDBException
	 */
	public void deleteAgJobMenuGxById(Integer AjmgId) throws HSKDBException;
	 
	/**
 	 * 根据ag_job_menu_gx表主键修改AgJobMenuGx对象记录
	 * @param  AjmgId  Integer类型(ag_job_menu_gx表主键)
	 * @param  att_AgJobMenuGx  AgJobMenuGx类型(ag_job_menu_gx表记录)
	 * @return AgJobMenuGx  修改后的AgJobMenuGx对象记录
	 * @throws HSKDBException
	 */
	public  AgJobMenuGx updateAgJobMenuGxById(Integer AjmgId,AgJobMenuGx att_AgJobMenuGx) throws HSKDBException;
	
	/**
	 * 新增ag_job_menu_gx表 记录
     * @param  att_AgJobMenuGx  AgJobMenuGx类型(ag_job_menu_gx表记录)
     * @return ag_job_menu_gx表主键值
	 * @throws HSKDBException
	 */
	public Integer saveAgJobMenuGx(AgJobMenuGx att_AgJobMenuGx) throws HSKDBException;
	
	 /**
	 * 新增或修改ag_job_menu_gx表记录 ,如果ag_job_menu_gx表主键AgJobMenuGx.AjmgId为空就是添加，如果非空就是修改
     * @param  att_AgJobMenuGx  AgJobMenuGx类型(ag_job_menu_gx表记录)
     * @return AgJobMenuGx  修改后的AgJobMenuGx对象记录
	 * @throws HSKDBException
	 */
	public  AgJobMenuGx saveOrUpdateAgJobMenuGx( AgJobMenuGx att_AgJobMenuGx) throws HSKDBException;
	
	/**
	 *根据AgJobMenuGx对象作为对(ag_job_menu_gx表进行查询，获取分页对象
     * @param  att_AgJobMenuGx  AgJobMenuGx类型(ag_job_menu_gx表记录)
     * @return PagerModel  分页对象
	 * @throws HSKDBException 
	 */
	public PagerModel getPagerModelByAgJobMenuGx (AgJobMenuGx att_AgJobMenuGx) throws HSKDBException;
	
    /**
	 *根据AgJobMenuGx对象作为对(ag_job_menu_gx表进行查询，获取分页对象
     * @param  att_AgJobMenuGx  AgJobMenuGx类型(ag_job_menu_gx表记录)
     * @return List<AgJobMenuGx>  列表对象
	 * @throws HSKDBException 
	 */
	public List<AgJobMenuGx> getListByAgJobMenuGx ( AgJobMenuGx att_AgJobMenuGx) throws HSKDBException;
	/**
	 * 根据关系IDs删除关系列表
	 * @param ids
	 * @throws HSKDBException
	 */
	public void delAgJobMenuGxByIds(Integer jobId,String menuIds)  throws HSKDBException;

}