package com.hsk.angeldoctor.web.agent.service;



import com.hsk.angeldoctor.api.persistence.*;
import com.hsk.supper.dto.comm.PagerModel;
import com.hsk.supper.dto.comm.SysRetrunMessage;
import com.hsk.xframe.api.service.IDSTService;
import com.hsk.exception.HSKException;

/**
 * agent业务操作接口类 
 * @author  作者:admin
 * @version  版本信息:v1.0   创建时间: 2018-08-14 13:31:11
 */
public interface IAgAgentInfoService extends IDSTService{


		/**
	 * 查找AgAgentInfo对象记录，用于弹出添加、修改窗口时候初始化数据
	 * @param  aaiId  Integer类型(ag_agent_info表主键)
	  * @return SysRetrunMessage 对象记录
	 * @throws HSKException
	 */	
	public SysRetrunMessage findFormObject(Integer aaiId) throws HSKException;

	
	/**
	 * 查找AgAgentInfo对象记录，用于弹出添加、修改窗口时候初始化数据
	 * @param  aaiId  Integer类型(ag_agent_info表主键)
	 * @return AgAgentInfo ag_agent_info表记录
	 * @throws HSKException
	 */	
	public AgAgentInfo findObject(Integer aaiId) throws HSKException;
	
	/**
	 * 根据ag_agent_info表主键删除AgAgentInfo对象记录
     * @param  aaiId  Integer类型(ag_agent_info表主键)
     * @return SysRetrunMessage 对象记录
	 * @throws HSKException
	 */
	public SysRetrunMessage deleteObject(Integer aaiId) throws HSKException;
	
	
	
	/**
	 * 根据ag_agent_info表主键删除多条AgAgentInfo对象记录
     * @param  aaiIds  Integer类型(ag_agent_info表主键)
     * @return SysRetrunMessage 对象记录
	 * @throws HSKException
	 */
	public SysRetrunMessage deleteAllObject(String aaiIds) throws HSKException;
	
	 /**
	 * 新增或修改ag_agent_info表记录 ,如果ag_agent_info表主键AgAgentInfo.aaiId为空就是添加，如果非空就是修改
     * @param  att_AgAgentInfo  AgAgentInfo类型(ag_agent_info表记录)
     * @return SysRetrunMessage 对象记录
	 * @throws HSKException
	 */
	public SysRetrunMessage   saveOrUpdateObject( AgAgentInfo att_AgAgentInfo) throws HSKException;
	
	/**
	 *根据AgAgentInfo对象作为对(ag_agent_info表进行查询，获取分页对象
     * @param  att_AgAgentInfo  AgAgentInfo类型(ag_agent_info表记录)
     * @return PagerModel  分页对象
	 * @throws HSKException 
	 */
	public PagerModel getPagerModelObject (AgAgentInfo att_AgAgentInfo) throws HSKException;
	/**
	 * 获取业绩管理列表
	 * @param reservedProvId
	 * @param reservedCityId
	 * @param reservedRelateToTeamName
	 * @return
	 * @throws HSKException
	 */
	public PagerModel getAchievementPager(String reservedProvId,String reservedCityId,String reservedRelateToTeamName) throws HSKException;
	/**
	 * 获取单个代理商业绩管理统计
	 * @param id
	 * @param filterKey
	 * @param filterStartDate
	 * @param filterEndDate
	 * @return
	 * @throws HSKException
	 */
	public PagerModel getOneAchievementPager(Integer id,String filterKey,String filterStartDate,String filterEndDate) throws HSKException;
	
}