package com.hsk.angeldoctor.api.daobbase;

import java.util.*;
import com.hsk.angeldoctor.api.persistence.*;
import com.hsk.exception.HSKDBException;
import com.hsk.supper.dto.comm.PagerModel;

/**
 * ag_order_info表数据库层面操作接口类 
 * @author  作者:admin
 * @version  版本信息:v1.0   创建时间: 2018-08-14 13:35:36
 */
public interface IAgOrderInfoDao{
	
	/**
	 * 根据ag_order_info表主键查找AgOrderInfo对象记录
	 * @param  AoiId  Integer类型(ag_order_info表主键)
	 * @return AgOrderInfo ag_order_info表记录
	 * @throws HSKDBException
	 */	
	public AgOrderInfo findAgOrderInfoById(Integer AoiId) throws HSKDBException;
	
	/**
	 * 根据ag_order_info表主键删除AgOrderInfo对象记录
     * @param  AoiId  Integer类型(ag_order_info表主键)
	 * @throws HSKDBException
	 */
	public void deleteAgOrderInfoById(Integer AoiId) throws HSKDBException;
	 
	/**
 	 * 根据ag_order_info表主键修改AgOrderInfo对象记录
	 * @param  AoiId  Integer类型(ag_order_info表主键)
	 * @param  att_AgOrderInfo  AgOrderInfo类型(ag_order_info表记录)
	 * @return AgOrderInfo  修改后的AgOrderInfo对象记录
	 * @throws HSKDBException
	 */
	public  AgOrderInfo updateAgOrderInfoById(Integer AoiId,AgOrderInfo att_AgOrderInfo) throws HSKDBException;
	
	/**
	 * 新增ag_order_info表 记录
     * @param  att_AgOrderInfo  AgOrderInfo类型(ag_order_info表记录)
     * @return ag_order_info表主键值
	 * @throws HSKDBException
	 */
	public Integer saveAgOrderInfo(AgOrderInfo att_AgOrderInfo) throws HSKDBException;
	
	 /**
	 * 新增或修改ag_order_info表记录 ,如果ag_order_info表主键AgOrderInfo.AoiId为空就是添加，如果非空就是修改
     * @param  att_AgOrderInfo  AgOrderInfo类型(ag_order_info表记录)
     * @return AgOrderInfo  修改后的AgOrderInfo对象记录
	 * @throws HSKDBException
	 */
	public  AgOrderInfo saveOrUpdateAgOrderInfo( AgOrderInfo att_AgOrderInfo) throws HSKDBException;
	
	/**
	 *根据AgOrderInfo对象作为对(ag_order_info表进行查询，获取分页对象
     * @param  att_AgOrderInfo  AgOrderInfo类型(ag_order_info表记录)
     * @return PagerModel  分页对象
	 * @throws HSKDBException 
	 */
	public PagerModel getPagerModelByAgOrderInfo (AgOrderInfo att_AgOrderInfo) throws HSKDBException;
	
    /**
	 *根据AgOrderInfo对象作为对(ag_order_info表进行查询，获取分页对象
     * @param  att_AgOrderInfo  AgOrderInfo类型(ag_order_info表记录)
     * @return List<AgOrderInfo>  列表对象
	 * @throws HSKDBException 
	 */
	public List<AgOrderInfo> getListByAgOrderInfo ( AgOrderInfo att_AgOrderInfo) throws HSKDBException;
	/**
	 * 查询预约列表
	 * @param agOrderView
	 * @param registerStartDate
	 * @param registerEndDate
	 * @return
	 * @throws HSKDBException
	 */
	public PagerModel getPagerAgOrderView(AgOrderView agOrderView,String registerStartDate,String registerEndDate) throws HSKDBException;
	/**
	 * 根据ID获取预约详情
	 * @param aoiId
	 * @return
	 * @throws HSKDBException
	 */
	public AgOrderView getAgOrderViewById(Integer aoiId)  throws HSKDBException;
	/**
	 * 根据预约流水号查询预约详情
	 * @param serialNumber
	 * @return
	 * @throws HSKDBException
	 */
	public AgOrderView getAgOrderViewBySerialNumber(String serialNumber)  throws HSKDBException;
	/**
	 * 获取业绩管理所有统计信息
	 * @param aaiId
	 * @param filterKey
	 * @param filterStartDate
	 * @param filterEndDate
	 * @return
	 * @throws HSKDBException
	 */
	public Map<String,List<Map<String,Object>>> getAchievementList(String aaiIds,String filterKey,String filterStartDate,String filterEndDate)  throws HSKDBException;
	/**
	 * 获取员工业绩管理统计信息
	 * @param agentId
	 * @param filterKey
	 * @param filterStartDate
	 * @param filterEndDate
	 * @return
	 * @throws HSKDBException
	 */
	public List<Map<String, Object>> getAgentAchievementList(String agentId,String filterKey,String filterStartDate,String filterEndDate)  throws HSKDBException;
	/**
	 * 获取下线业务统计
	 * @param agentId
	 * @return
	 * @throws HSKDBException
	 */
	public Map<String,List<Map<String,Object>>> getDirectAgentAchievementList(String agentId)  throws HSKDBException;
	/**
	 * 根据业务员ID查询预约列表
	 * @param agentId
	 * @param registerType
	 * @return
	 * @throws HSKDBException
	 */
	public List<AgOrderView> getAgOrderViewByAgentId(Integer agentId,String registerType) throws HSKDBException;
	/**
	 * 将某一天的订单改成未到
	 * @param dateTime
	 * @throws HSKDBException
	 */
	public void updateOrderOver(String dateTime) throws HSKDBException;
}