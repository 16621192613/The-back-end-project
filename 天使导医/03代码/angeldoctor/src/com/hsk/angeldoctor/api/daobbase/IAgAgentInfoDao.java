package com.hsk.angeldoctor.api.daobbase;

import java.util.*;
import com.hsk.angeldoctor.api.persistence.*;
import com.hsk.exception.HSKDBException;
import com.hsk.supper.dto.comm.PagerModel;

/**
 * ag_agent_info表数据库层面操作接口类 
 * @author  作者:admin
 * @version  版本信息:v1.0   创建时间: 2018-08-14 13:31:11
 */
public interface IAgAgentInfoDao{
	
	/**
	 * 根据ag_agent_info表主键查找AgAgentInfo对象记录
	 * @param  AaiId  Integer类型(ag_agent_info表主键)
	 * @return AgAgentInfo ag_agent_info表记录
	 * @throws HSKDBException
	 */	
	public AgAgentInfo findAgAgentInfoById(Integer AaiId) throws HSKDBException;
	
	/**
	 * 根据ag_agent_info表主键删除AgAgentInfo对象记录
     * @param  AaiId  Integer类型(ag_agent_info表主键)
	 * @throws HSKDBException
	 */
	public void deleteAgAgentInfoById(Integer AaiId) throws HSKDBException;
	 
	/**
 	 * 根据ag_agent_info表主键修改AgAgentInfo对象记录
	 * @param  AaiId  Integer类型(ag_agent_info表主键)
	 * @param  att_AgAgentInfo  AgAgentInfo类型(ag_agent_info表记录)
	 * @return AgAgentInfo  修改后的AgAgentInfo对象记录
	 * @throws HSKDBException
	 */
	public  AgAgentInfo updateAgAgentInfoById(Integer AaiId,AgAgentInfo att_AgAgentInfo) throws HSKDBException;
	
	/**
	 * 新增ag_agent_info表 记录
     * @param  att_AgAgentInfo  AgAgentInfo类型(ag_agent_info表记录)
     * @return ag_agent_info表主键值
	 * @throws HSKDBException
	 */
	public Integer saveAgAgentInfo(AgAgentInfo att_AgAgentInfo) throws HSKDBException;
	
	 /**
	 * 新增或修改ag_agent_info表记录 ,如果ag_agent_info表主键AgAgentInfo.AaiId为空就是添加，如果非空就是修改
     * @param  att_AgAgentInfo  AgAgentInfo类型(ag_agent_info表记录)
     * @return AgAgentInfo  修改后的AgAgentInfo对象记录
	 * @throws HSKDBException
	 */
	public  AgAgentInfo saveOrUpdateAgAgentInfo( AgAgentInfo att_AgAgentInfo) throws HSKDBException;
	
	/**
	 *根据AgAgentInfo对象作为对(ag_agent_info表进行查询，获取分页对象
     * @param  att_AgAgentInfo  AgAgentInfo类型(ag_agent_info表记录)
     * @return PagerModel  分页对象
	 * @throws HSKDBException 
	 */
	public PagerModel getPagerModelByAgAgentInfo (AgAgentInfo att_AgAgentInfo) throws HSKDBException;
	
    /**
	 *根据AgAgentInfo对象作为对(ag_agent_info表进行查询，获取分页对象
     * @param  att_AgAgentInfo  AgAgentInfo类型(ag_agent_info表记录)
     * @return List<AgAgentInfo>  列表对象
	 * @throws HSKDBException 
	 */
	public List<AgAgentInfo> getListByAgAgentInfo ( AgAgentInfo att_AgAgentInfo) throws HSKDBException;

}