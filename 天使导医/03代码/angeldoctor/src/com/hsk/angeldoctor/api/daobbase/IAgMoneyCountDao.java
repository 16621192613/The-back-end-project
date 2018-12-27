package com.hsk.angeldoctor.api.daobbase;

import java.util.*;
import com.hsk.angeldoctor.api.persistence.*;
import com.hsk.exception.HSKDBException;
import com.hsk.supper.dto.comm.PagerModel;

/**
 * ag_money_count表数据库层面操作接口类 
 * @author  作者:admin
 * @version  版本信息:v1.0   创建时间: 2018-08-14 13:35:36
 */
public interface IAgMoneyCountDao{
	
	/**
	 * 根据ag_money_count表主键查找AgMoneyCount对象记录
	 * @param  AmcId  Integer类型(ag_money_count表主键)
	 * @return AgMoneyCount ag_money_count表记录
	 * @throws HSKDBException
	 */	
	public AgMoneyCount findAgMoneyCountById(Integer AmcId) throws HSKDBException;
	
	/**
	 * 根据ag_money_count表主键删除AgMoneyCount对象记录
     * @param  AmcId  Integer类型(ag_money_count表主键)
	 * @throws HSKDBException
	 */
	public void deleteAgMoneyCountById(Integer AmcId) throws HSKDBException;
	 
	/**
 	 * 根据ag_money_count表主键修改AgMoneyCount对象记录
	 * @param  AmcId  Integer类型(ag_money_count表主键)
	 * @param  att_AgMoneyCount  AgMoneyCount类型(ag_money_count表记录)
	 * @return AgMoneyCount  修改后的AgMoneyCount对象记录
	 * @throws HSKDBException
	 */
	public  AgMoneyCount updateAgMoneyCountById(Integer AmcId,AgMoneyCount att_AgMoneyCount) throws HSKDBException;
	
	/**
	 * 新增ag_money_count表 记录
     * @param  att_AgMoneyCount  AgMoneyCount类型(ag_money_count表记录)
     * @return ag_money_count表主键值
	 * @throws HSKDBException
	 */
	public Integer saveAgMoneyCount(AgMoneyCount att_AgMoneyCount) throws HSKDBException;
	
	 /**
	 * 新增或修改ag_money_count表记录 ,如果ag_money_count表主键AgMoneyCount.AmcId为空就是添加，如果非空就是修改
     * @param  att_AgMoneyCount  AgMoneyCount类型(ag_money_count表记录)
     * @return AgMoneyCount  修改后的AgMoneyCount对象记录
	 * @throws HSKDBException
	 */
	public  AgMoneyCount saveOrUpdateAgMoneyCount( AgMoneyCount att_AgMoneyCount) throws HSKDBException;
	
	/**
	 *根据AgMoneyCount对象作为对(ag_money_count表进行查询，获取分页对象
     * @param  att_AgMoneyCount  AgMoneyCount类型(ag_money_count表记录)
     * @return PagerModel  分页对象
	 * @throws HSKDBException 
	 */
	public PagerModel getPagerModelByAgMoneyCount (AgMoneyCount att_AgMoneyCount) throws HSKDBException;
	
	
	/**
	 * 获取医院账号信息
	 * @param att_AgHospitalView
	 * @return
	 * @throws HSKDBException
	 */
	public PagerModel getPagerModelByAgHospitalView (AgHospitalView att_AgHospitalView) throws HSKDBException;
	/**
	 * 获取业务员账号信息
	 * @param att_AgBusinessView
	 * @return
	 * @throws HSKDBException
	 */
	public PagerModel getPagerModelByAgBusinessView (AgBusinessView att_AgBusinessView) throws HSKDBException;
	
	/**
	 * 获取患者账号信息 
	 * @param att_AgPatientView
	 * @return
	 * @throws HSKDBException
	 */
	public PagerModel getPagerModelByAgPatientView (AgPatientView att_AgPatientView) throws HSKDBException;
    /**
	 *根据AgMoneyCount对象作为对(ag_money_count表进行查询，获取分页对象
     * @param  att_AgMoneyCount  AgMoneyCount类型(ag_money_count表记录)
     * @return List<AgMoneyCount>  列表对象
	 * @throws HSKDBException 
	 */
	public List<AgMoneyCount> getListByAgMoneyCount ( AgMoneyCount att_AgMoneyCount) throws HSKDBException;
	/**
	 * 根据用户ID用户类型查询统计信息
	 * @param userId
	 * @param amcType
	 * @return
	 * @throws HSKDBException
	 */
	public AgMoneyCount getAgMoneyCountByUserId(Integer userId,String amcType) throws HSKDBException;
	/**
	 * 更新统计信息
	 * @param att_AgMoneyCount
	 * @return
	 * @throws HSKDBException
	 */
	public AgMoneyCount updateAgMoneyCount( AgMoneyCount att_AgMoneyCount) throws HSKDBException;
	/**
	 * 获取一条 补贴详情、提现详情
	 * @param att_AgWithdrawMaidInfo
	 * @return
	 * @throws HSKDBException
	 */
	public  AgWithdrawMaidInfo  getOneWMInfo(
			AgWithdrawMaidInfo att_AgWithdrawMaidInfo) throws HSKDBException;
	
	/**
	 *  	获取业务员账单列表
	 * @param att_AgWithdrawMaidInfo
	 * @return
	 * @throws HSKDBException
	 */
	
	public List<AgWithdrawMaidInfo> getListByAgWithdrawMaidInfo ( AgWithdrawMaidInfo att_AgWithdrawMaidInfo) throws HSKDBException;
	
	/**
	 * 根据患者ID查询患者账单
	 * @param patientId
	 * @return
	 * @throws HSKDBException
	 */
	public List<Map<String,Object>> getPaitentBillList(Integer patientId) throws HSKDBException;
	/**
	 * 获取业务员账单列表
	 * @param agentId
	 * @return
	 * @throws HSKDBException
	 */
	public List<Map<String,Object>> getAgentBillList(Integer agentId) throws HSKDBException;
	/**
	 * 获取积分排名列表
	 * @return
	 * @throws HSKDBException
	 */
	public List<Map<String,Object>> getIntegralRanking() throws HSKDBException;
}