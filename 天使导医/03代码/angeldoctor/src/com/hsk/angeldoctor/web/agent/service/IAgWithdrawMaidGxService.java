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
public interface IAgWithdrawMaidGxService{


		/**
	 * 查找AgWithdrawMaidGx对象记录，用于弹出添加、修改窗口时候初始化数据
	 * @param  awmgId  Integer类型(ag_withdraw_maid_gx表主键)
	  * @return SysRetrunMessage 对象记录
	 * @throws HSKException
	 */	
	public SysRetrunMessage findFormObject(Integer awmgId) throws HSKException;

	
	/**
	 * 查找AgWithdrawMaidGx对象记录，用于弹出添加、修改窗口时候初始化数据
	 * @param  awmgId  Integer类型(ag_withdraw_maid_gx表主键)
	 * @return AgWithdrawMaidGx ag_withdraw_maid_gx表记录
	 * @throws HSKException
	 */	
	public AgWithdrawMaidGx findObject(Integer awmgId) throws HSKException;
	
	/**
	 * 根据ag_withdraw_maid_gx表主键删除AgWithdrawMaidGx对象记录
     * @param  awmgId  Integer类型(ag_withdraw_maid_gx表主键)
     * @return SysRetrunMessage 对象记录
	 * @throws HSKException
	 */
	public SysRetrunMessage deleteObject(Integer awmgId) throws HSKException;
	
	
	
	/**
	 * 根据ag_withdraw_maid_gx表主键删除多条AgWithdrawMaidGx对象记录
     * @param  awmgIds  Integer类型(ag_withdraw_maid_gx表主键)
     * @return SysRetrunMessage 对象记录
	 * @throws HSKException
	 */
	public SysRetrunMessage deleteAllObject(String awmgIds) throws HSKException;
	
	 /**
	 * 新增或修改ag_withdraw_maid_gx表记录 ,如果ag_withdraw_maid_gx表主键AgWithdrawMaidGx.awmgId为空就是添加，如果非空就是修改
     * @param  att_AgWithdrawMaidGx  AgWithdrawMaidGx类型(ag_withdraw_maid_gx表记录)
     * @return SysRetrunMessage 对象记录
	 * @throws HSKException
	 */
	public SysRetrunMessage   saveOrUpdateObject( AgWithdrawMaidGx att_AgWithdrawMaidGx) throws HSKException;
	
	/**
	 *根据AgWithdrawMaidGx对象作为对(ag_withdraw_maid_gx表进行查询，获取分页对象
     * @param  att_AgWithdrawMaidGx  AgWithdrawMaidGx类型(ag_withdraw_maid_gx表记录)
     * @return PagerModel  分页对象
	 * @throws HSKException 
	 */
	public PagerModel getPagerModelObject (AgWithdrawMaidGx att_AgWithdrawMaidGx) throws HSKException;
	
}