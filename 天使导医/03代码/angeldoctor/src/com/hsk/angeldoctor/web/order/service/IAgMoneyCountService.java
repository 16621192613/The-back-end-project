package com.hsk.angeldoctor.web.order.service;

import java.util.*;

import com.hsk.angeldoctor.api.persistence.*;
import com.hsk.angeldoctor.api.daobbase.*;
import com.hsk.angeldoctor.web.finance.controller.AgentCount;
import com.hsk.supper.dto.comm.PagerModel;
import com.hsk.supper.dto.comm.SysRetrunMessage;
import com.hsk.xframe.api.service.IDSTService;
import com.hsk.exception.HSKException;

/**
 * order业务操作接口类 
 * @author  作者:admin
 * @version  版本信息:v1.0   创建时间: 2018-08-14 13:35:36
 */
public interface IAgMoneyCountService extends IDSTService{

 
	/**
	 * 根据用户id和用户类型 查询余额信息
	 * @param amc
	 * @return
	 * @throws HSKException
	 */
	public SysRetrunMessage findCountObject(AgMoneyCount amc ) throws HSKException;
	
	/**
	 * 查找AgMoneyCount对象记录，用于弹出添加、修改窗口时候初始化数据
	 * @param  amcId  Integer类型(ag_money_count表主键)
	  * @return SysRetrunMessage 对象记录
	 * @throws HSKException
	 */	
	public SysRetrunMessage findFormObject(Integer amcId) throws HSKException;

	
	/**
	 * 查找AgMoneyCount对象记录，用于弹出添加、修改窗口时候初始化数据
	 * @param  amcId  Integer类型(ag_money_count表主键)
	 * @return AgMoneyCount ag_money_count表记录
	 * @throws HSKException
	 */	
	public AgMoneyCount findObject(Integer amcId) throws HSKException;
	
	/**
	 * 根据ag_money_count表主键删除AgMoneyCount对象记录
     * @param  amcId  Integer类型(ag_money_count表主键)
     * @return SysRetrunMessage 对象记录
	 * @throws HSKException
	 */
	public SysRetrunMessage deleteObject(Integer amcId) throws HSKException;
	
	
	
	/**
	 * 根据ag_money_count表主键删除多条AgMoneyCount对象记录
     * @param  amcIds  Integer类型(ag_money_count表主键)
     * @return SysRetrunMessage 对象记录
	 * @throws HSKException
	 */
	public SysRetrunMessage deleteAllObject(String amcIds) throws HSKException;
	
	 /**
	 * 新增或修改ag_money_count表记录 ,如果ag_money_count表主键AgMoneyCount.amcId为空就是添加，如果非空就是修改
     * @param  att_AgMoneyCount  AgMoneyCount类型(ag_money_count表记录)
     * @return SysRetrunMessage 对象记录
	 * @throws HSKException
	 */
	public SysRetrunMessage   saveOrUpdateObject( AgMoneyCount att_AgMoneyCount) throws HSKException;
	
	/**
	 *根据AgMoneyCount对象作为对(ag_money_count表进行查询，获取分页对象
     * @param  att_AgMoneyCount  AgMoneyCount类型(ag_money_count表记录)
     * @return PagerModel  分页对象
	 * @throws HSKException 
	 */
	public PagerModel getPagerModelObject (AgMoneyCount att_AgMoneyCount) throws HSKException;
	
	
	/**
	 * 查询医院账号汇总 
	 * @param att_AgHospitalView
	 * @return
	 * @throws HSKException
	 */
	public PagerModel getPagerModelAgHospitalView (AgHospitalView att_AgHospitalView) throws HSKException;
	
	/**
	 * 查询业务员账号汇总
	 * @param att_AgBusinessView
	 * @return
	 * @throws HSKException
	 */
	public PagerModel getPagerModelAgBusinessView (AgBusinessView att_AgBusinessView) throws HSKException;
	/**
	 * 查询患者账号汇总
	 * @param att_AgPatientView
	 * @return
	 * @throws HSKException
	 */
	public PagerModel getPagerModelAgPatientView (AgPatientView att_AgPatientView) throws HSKException;
	
	
	/**
	 * 查询代理商账号信息 
	 * @param att_AgentCount
	 * @return
	 * @throws HSKException
	 */
	public AgentCount getPagerModelAgentCount(AgentCount att_AgentCount)
			throws HSKException ;
	
	/**
	 * 患者账单列表
	 * @param id  业务员id
	 * @return
	 * @throws HSKException
	 */
	public  List<Map<String,Object>> getListPatientBill(Integer id )throws HSKException ;
	/**
	 * 业务员账单列表
	 * @param id  业务员id
	 * @return
	 * @throws HSKException
	 */
	public  List<Map<String,Object>> getListAgentBill(Integer id )throws HSKException ;
	/**
	 * 获取单笔补贴详情
	 * @param id
	 * @return
	 * @throws HSKException
	 */
	public Map<String,Object> getSubsidyInfo(Integer id)throws HSKException ;
	
	/**
	 * 查询余额信息
	 * @param att_AgMoneyCount
	 * @return
	 * @throws HSKException
	 */
	public AgMoneyCount getAgMoneyCount(AgMoneyCount att_AgMoneyCount) throws HSKException;
	/**
	 * 查询用户积分明细
	 * @param suiId
	 * @param userType
	 * @return
	 * @throws HSKException
	 */
	public SysRetrunMessage getIntegrationInfo(Integer suiId,String userType)throws HSKException;
	/**
	 * 获取代理商统计信息
	 * @param suiId
	 * @return
	 * @throws HSKException
	 */
	public SysRetrunMessage getAgentCount(Integer suiId)throws HSKException;
	/**
	 * 获取平台统计信息
	 * @return
	 * @throws HSKException
	 */
	public SysRetrunMessage getTranCount() throws HSKException;
	/**
	 * 获取登陆医院的统计信息
	 * @return
	 * @throws HSKException
	 */
	public SysRetrunMessage getHosCount() throws HSKException;
	
}