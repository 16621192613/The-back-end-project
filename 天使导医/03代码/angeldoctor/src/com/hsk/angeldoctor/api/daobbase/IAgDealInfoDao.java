package com.hsk.angeldoctor.api.daobbase;

import java.util.*;
import com.hsk.angeldoctor.api.persistence.*;
import com.hsk.exception.HSKDBException;
import com.hsk.supper.dto.comm.PagerModel;

/**
 * ag_deal_info表数据库层面操作接口类 
 * @author  作者:admin
 * @version  版本信息:v1.0   创建时间: 2018-08-14 13:35:36
 */
public interface IAgDealInfoDao{
	
	/**
	 * 根据ag_deal_info表主键查找AgDealInfo对象记录
	 * @param  AdiId  Integer类型(ag_deal_info表主键)
	 * @return AgDealInfo ag_deal_info表记录
	 * @throws HSKDBException
	 */	
	public AgDealInfo findAgDealInfoById(Integer AdiId) throws HSKDBException;
	
	/**
	 * 根据ag_deal_info表主键删除AgDealInfo对象记录
     * @param  AdiId  Integer类型(ag_deal_info表主键)
	 * @throws HSKDBException
	 */
	public void deleteAgDealInfoById(Integer AdiId) throws HSKDBException;
	 
	/**
 	 * 根据ag_deal_info表主键修改AgDealInfo对象记录
	 * @param  AdiId  Integer类型(ag_deal_info表主键)
	 * @param  att_AgDealInfo  AgDealInfo类型(ag_deal_info表记录)
	 * @return AgDealInfo  修改后的AgDealInfo对象记录
	 * @throws HSKDBException
	 */
	public  AgDealInfo updateAgDealInfoById(Integer AdiId,AgDealInfo att_AgDealInfo) throws HSKDBException;
	
	/**
	 * 新增ag_deal_info表 记录
     * @param  att_AgDealInfo  AgDealInfo类型(ag_deal_info表记录)
     * @return ag_deal_info表主键值
	 * @throws HSKDBException
	 */
	public Integer saveAgDealInfo(AgDealInfo att_AgDealInfo) throws HSKDBException;
	
	 /**
	 * 新增或修改ag_deal_info表记录 ,如果ag_deal_info表主键AgDealInfo.AdiId为空就是添加，如果非空就是修改
     * @param  att_AgDealInfo  AgDealInfo类型(ag_deal_info表记录)
     * @return AgDealInfo  修改后的AgDealInfo对象记录
	 * @throws HSKDBException
	 */
	public  AgDealInfo saveOrUpdateAgDealInfo( AgDealInfo att_AgDealInfo) throws HSKDBException;
	
	/**
	 *根据AgDealInfo对象作为对(ag_deal_info表进行查询，获取分页对象
     * @param  att_AgDealInfo  AgDealInfo类型(ag_deal_info表记录)
     * @return PagerModel  分页对象
	 * @throws HSKDBException 
	 */
	public PagerModel getPagerModelByAgDealInfo (AgDealInfo att_AgDealInfo) throws HSKDBException;
	
    /**
	 *根据AgDealInfo对象作为对(ag_deal_info表进行查询，获取分页对象
     * @param  att_AgDealInfo  AgDealInfo类型(ag_deal_info表记录)
     * @return List<AgDealInfo>  列表对象
	 * @throws HSKDBException 
	 */
	public List<AgDealInfo> getListByAgDealInfo ( AgDealInfo att_AgDealInfo) throws HSKDBException;
	/**
	 * 查询预约列表分页信息
	 * @param agDealView
	 * @param registerStartDate
	 * @param registerEndDate
	 * @return
	 * @throws HSKDBException
	 */
	public PagerModel getPagerAgDealView(AgDealView agDealView) throws HSKDBException;
	/**
	 * 根据ID获取预约详情
	 * @param aoiId
	 * @return
	 * @throws HSKDBException
	 */
	public AgDealView getAgDealViewById(Integer aoiId)  throws HSKDBException;
	/**
	 * 获取预约列表信息
	 * @param agDealView
	 * @return
	 * @throws HSKDBException
	 */
	public List<AgDealView> getAgDealViewList(AgDealView agDealView) throws HSKDBException;
}