package com.hsk.angeldoctor.web.agent.service;

import java.util.*;
import com.hsk.angeldoctor.api.persistence.*;
import com.hsk.angeldoctor.api.daobbase.*;
import com.hsk.supper.dto.comm.PagerModel;
import com.hsk.supper.dto.comm.SysRetrunMessage;
import com.hsk.xframe.api.service.IDSTService;
import com.hsk.exception.HSKException;

/**
 * agent业务操作接口类 
 * @author  作者:admin
 * @version  版本信息:v1.0   创建时间: 2018-08-14 13:31:11
 */
public interface IAgBusinessUserService  extends IDSTService{


		/**
	 * 查找AgBusinessUser对象记录，用于弹出添加、修改窗口时候初始化数据
	 * @param  agentId  Integer类型(ag_business_user表主键)
	  * @return SysRetrunMessage 对象记录
	 * @throws HSKException
	 */	
	public SysRetrunMessage findFormObject(Integer agentId) throws HSKException;

	
	/**
	 * 查找AgBusinessUser对象记录，用于弹出添加、修改窗口时候初始化数据
	 * @param  agentId  Integer类型(ag_business_user表主键)
	 * @return AgBusinessUser ag_business_user表记录
	 * @throws HSKException
	 */	
	public AgBusinessUser findObject(Integer agentId) throws HSKException;
	
	/**
	 * 根据ag_business_user表主键删除AgBusinessUser对象记录
     * @param  agentId  Integer类型(ag_business_user表主键)
     * @return SysRetrunMessage 对象记录
	 * @throws HSKException
	 */
	public SysRetrunMessage deleteObject(Integer agentId) throws HSKException;
	
	
	
	/**
	 * 根据ag_business_user表主键删除多条AgBusinessUser对象记录
     * @param  agentIds  Integer类型(ag_business_user表主键)
     * @return SysRetrunMessage 对象记录
	 * @throws HSKException
	 */
	public SysRetrunMessage deleteAllObject(String agentIds) throws HSKException;
	
	 /**
	 * 新增或修改ag_business_user表记录 ,如果ag_business_user表主键AgBusinessUser.agentId为空就是添加，如果非空就是修改
     * @param  att_AgBusinessUser  AgBusinessUser类型(ag_business_user表记录)
     * @return SysRetrunMessage 对象记录
	 * @throws HSKException
	 */
	public SysRetrunMessage   saveOrUpdateObject( AgBusinessUser att_AgBusinessUser) throws HSKException;
	
	/**
	 *根据AgBusinessUser对象作为对(ag_business_user表进行查询，获取分页对象
     * @param  att_AgBusinessUser  AgBusinessUser类型(ag_business_user表记录)
     * @return PagerModel  分页对象
	 * @throws HSKException 
	 */
	public PagerModel getPagerModelObject (AgBusinessUser att_AgBusinessUser) throws HSKException;
	/**
	 * 代理商员工列表
	 * @param createDateStart
	 * @param createDateEnd
	 * @param mobile
	 * @param name
	 * @param parentAgentName
	 * @param topReservedAgentName
	 * @param topReservedAgentRelateToName
	 * @return
	 * @throws HSKException
	 */
	public PagerModel getReservedAgentPagerModel(String createDateStart,String createDateEnd,String mobile,String name,String parentAgentName,String topReservedAgentName,String topReservedAgentRelateToName)throws HSKException;
	/**
	 * 获取初代业务员列表
	 * @param createDateStart
	 * @param createDateEnd
	 * @param mobile
	 * @param name
	 * @return
	 * @throws HSKException
	 */
	public PagerModel getPrimaryPagerModel(String createDateStart,String createDateEnd,String mobile,String name)throws HSKException;
	/**
	 * 获取业务员列表
	 * @param createDateStart
	 * @param createDateEnd
	 * @param mobile
	 * @param name
	 * @param parentAgentName
	 * @param topPrimaryAgentName
	 * @return
	 * @throws HSKException
	 */
	public PagerModel getPrimaryAgentsPagerModel(String createDateStart,String createDateEnd,String mobile,String name,String parentAgentName,String topPrimaryAgentName)throws HSKException;
	/**
	 * 获取代理商下业务员列表
	 * @param createDateStart
	 * @param createDateEnd
	 * @param name
	 * @return
	 * @throws HSKException
	 */
	public PagerModel getReservedPagerModel(String createDateStart,String createDateEnd,String name)throws HSKException;
	/**
	 * 获取业务员下级业务员列表
	 * @param name
	 * @return
	 * @throws HSKException
	 */
	public PagerModel getMyAgentPagerModel(String name)throws HSKException;
	/**
	 * 新增或修改业务员手机号、名称
	 * @param att_AgBusinessUser
	 * @return
	 * @throws HSKException
	 */
	public SysRetrunMessage saveOrUpdateAgBusinessUser( AgBusinessUser att_AgBusinessUser) throws HSKException;
	/**
	 * 获取员工业绩统计
	 * @param id
	 * @param filterKey
	 * @param filterStartDate
	 * @param filterEndDate
	 * @return
	 * @throws HSKException
	 */
	public PagerModel getBusinessCount(String name,String mobile,String filterKey,String filterStartDate,String filterEndDate,Integer belongingId) throws HSKException;
	/**
	 * 下线业绩总计
	 * @param name
	 * @param mobile
	 * @return
	 * @throws HSKException
	 */
	public PagerModel getDirectBusinessCount(String name,String mobile) throws HSKException;
}