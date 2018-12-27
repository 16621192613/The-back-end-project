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
 * @version  版本信息:v1.0   创建时间: 2018-08-14 13:31:12
 */
public interface IAgWithdrawInfoService extends IDSTService{


		/**
	 * 查找AgWithdrawInfo对象记录，用于弹出添加、修改窗口时候初始化数据
	 * @param  awiId  Integer类型(ag_withdraw_info表主键)
	  * @return SysRetrunMessage 对象记录
	 * @throws HSKException
	 */	
	public SysRetrunMessage findFormObject(Integer awiId) throws HSKException;

	
	/**
	 * 查找AgWithdrawInfo对象记录，用于弹出添加、修改窗口时候初始化数据
	 * @param  awiId  Integer类型(ag_withdraw_info表主键)
	 * @return AgWithdrawInfo ag_withdraw_info表记录
	 * @throws HSKException
	 */	
	public AgWithdrawInfo findObject(Integer awiId) throws HSKException;
	
	/**
	 * 根据ag_withdraw_info表主键删除AgWithdrawInfo对象记录
     * @param  awiId  Integer类型(ag_withdraw_info表主键)
     * @return SysRetrunMessage 对象记录
	 * @throws HSKException
	 */
	public SysRetrunMessage deleteObject(Integer awiId) throws HSKException;
	
	
	
	/**
	 * 根据ag_withdraw_info表主键删除多条AgWithdrawInfo对象记录
     * @param  awiIds  Integer类型(ag_withdraw_info表主键)
     * @return SysRetrunMessage 对象记录
	 * @throws HSKException
	 */
	public SysRetrunMessage deleteAllObject(String awiIds) throws HSKException;
	
	 /**
	 * 新增或修改ag_withdraw_info表记录 ,如果ag_withdraw_info表主键AgWithdrawInfo.awiId为空就是添加，如果非空就是修改
     * @param  att_AgWithdrawInfo  AgWithdrawInfo类型(ag_withdraw_info表记录)
     * @return SysRetrunMessage 对象记录
	 * @throws HSKException
	 */
	public SysRetrunMessage   saveOrUpdateObject( AgWithdrawInfo att_AgWithdrawInfo) throws HSKException;
	
	
	/**
	 * 审核操作 
	 * @param att_AgWithdrawInfo
	 * @return
	 * @throws HSKException
	 */
	public SysRetrunMessage   saveOrUpdateAdopt( AgWithdrawInfo att_AgWithdrawInfo) throws HSKException;
	
	/**
	 *  打款操作 
	 * @param att_AgWithdrawInfo
	 * @return
	 * @throws HSKException
	 */
	public SysRetrunMessage   saveOrUpdateMakeMoney( AgWithdrawInfo att_AgWithdrawInfo) throws HSKException;
	
	/**
	 *根据AgWithdrawInfo对象作为对(ag_withdraw_info表进行查询，获取分页对象
     * @param  att_AgWithdrawInfo  AgWithdrawInfo类型(ag_withdraw_info表记录)
     * @return PagerModel  分页对象
	 * @throws HSKException 
	 */
	public PagerModel getPagerModelObject (AgWithdrawInfo att_AgWithdrawInfo) throws HSKException;
	
	/**
	 * 查询是否正在提现
	 * @param att_AgWithdrawInfo
	 * @return
	 * @throws HSKException
	 */
	
	public SysRetrunMessage getIfWithdrawInfo (AgWithdrawInfo att_AgWithdrawInfo) throws HSKException;
	
	/**
	 * 添加 申请提现
	  * @param runType 1表示 代理商提现，2表示业务提现
	 * @param att_AgWithdrawInfo
	 * @return
	 * @throws HSKException
	 */
	public SysRetrunMessage   saveWithdrawMaid( String runType, AgWithdrawInfo att_AgWithdrawInfo) throws HSKException;
	
	
}