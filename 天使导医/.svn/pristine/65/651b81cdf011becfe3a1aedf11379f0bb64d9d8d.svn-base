package com.hsk.angeldoctor.api.daobbase;

import java.util.*;
import com.hsk.angeldoctor.api.persistence.*;
import com.hsk.exception.HSKDBException;
import com.hsk.supper.dto.comm.PagerModel;

/**
 * ag_business_user表数据库层面操作接口类 
 * @author  作者:admin
 * @version  版本信息:v1.0   创建时间: 2018-08-14 13:31:11
 */
public interface IAgBusinessUserDao{
	
	/**
	 * 根据ag_business_user表主键查找AgBusinessUser对象记录
	 * @param  AgentId  Integer类型(ag_business_user表主键)
	 * @return AgBusinessUser ag_business_user表记录
	 * @throws HSKDBException
	 */	
	public AgBusinessUser findAgBusinessUserById(Integer AgentId) throws HSKDBException;
	
	/**
	 * 根据ag_business_user表主键删除AgBusinessUser对象记录
     * @param  AgentId  Integer类型(ag_business_user表主键)
	 * @throws HSKDBException
	 */
	public void deleteAgBusinessUserById(Integer AgentId) throws HSKDBException;
	 
	/**
 	 * 根据ag_business_user表主键修改AgBusinessUser对象记录
	 * @param  AgentId  Integer类型(ag_business_user表主键)
	 * @param  att_AgBusinessUser  AgBusinessUser类型(ag_business_user表记录)
	 * @return AgBusinessUser  修改后的AgBusinessUser对象记录
	 * @throws HSKDBException
	 */
	public  AgBusinessUser updateAgBusinessUserById(Integer AgentId,AgBusinessUser att_AgBusinessUser) throws HSKDBException;
	
	/**
	 * 新增ag_business_user表 记录
     * @param  att_AgBusinessUser  AgBusinessUser类型(ag_business_user表记录)
     * @return ag_business_user表主键值
	 * @throws HSKDBException
	 */
	public Integer saveAgBusinessUser(AgBusinessUser att_AgBusinessUser) throws HSKDBException;
	
	 /**
	 * 新增或修改ag_business_user表记录 ,如果ag_business_user表主键AgBusinessUser.AgentId为空就是添加，如果非空就是修改
     * @param  att_AgBusinessUser  AgBusinessUser类型(ag_business_user表记录)
     * @return AgBusinessUser  修改后的AgBusinessUser对象记录
	 * @throws HSKDBException
	 */
	public  AgBusinessUser saveOrUpdateAgBusinessUser( AgBusinessUser att_AgBusinessUser) throws HSKDBException;
	
	/**
	 *根据AgBusinessUser对象作为对(ag_business_user表进行查询，获取分页对象
     * @param  att_AgBusinessUser  AgBusinessUser类型(ag_business_user表记录)
     * @return PagerModel  分页对象
	 * @throws HSKDBException 
	 */
	public PagerModel getPagerModelByAgBusinessUser (AgBusinessUser att_AgBusinessUser) throws HSKDBException;
	
    /**
	 *根据AgBusinessUser对象作为对(ag_business_user表进行查询，获取分页对象
     * @param  att_AgBusinessUser  AgBusinessUser类型(ag_business_user表记录)
     * @return List<AgBusinessUser>  列表对象
	 * @throws HSKDBException 
	 */
	public List<AgBusinessUser> getListByAgBusinessUser ( AgBusinessUser att_AgBusinessUser) throws HSKDBException;
	/**
	 * 根据子业务员ID查询所有父节点组成的字符串
	 * @param id
	 * @return
	 * @throws HSKDBException
	 */
	public String getBusinessIds(Integer id)throws HSKDBException;

}