package com.hsk.angeldoctor.api.daobbase;

import java.util.*;
import com.hsk.angeldoctor.api.persistence.*;
import com.hsk.exception.HSKDBException;
import com.hsk.supper.dto.comm.PagerModel;

/**
 * ag_withdraw_maid_gx表数据库层面操作接口类 
 * @author  作者:admin
 * @version  版本信息:v1.0   创建时间: 2018-08-14 13:31:12
 */
public interface IAgWithdrawMaidGxDao{
	
	/**
	 * 根据ag_withdraw_maid_gx表主键查找AgWithdrawMaidGx对象记录
	 * @param  AwmgId  Integer类型(ag_withdraw_maid_gx表主键)
	 * @return AgWithdrawMaidGx ag_withdraw_maid_gx表记录
	 * @throws HSKDBException
	 */	
	public AgWithdrawMaidGx findAgWithdrawMaidGxById(Integer AwmgId) throws HSKDBException;
	
	/**
	 * 根据ag_withdraw_maid_gx表主键删除AgWithdrawMaidGx对象记录
     * @param  AwmgId  Integer类型(ag_withdraw_maid_gx表主键)
	 * @throws HSKDBException
	 */
	public void deleteAgWithdrawMaidGxById(Integer AwmgId) throws HSKDBException;
	 
	/**
 	 * 根据ag_withdraw_maid_gx表主键修改AgWithdrawMaidGx对象记录
	 * @param  AwmgId  Integer类型(ag_withdraw_maid_gx表主键)
	 * @param  att_AgWithdrawMaidGx  AgWithdrawMaidGx类型(ag_withdraw_maid_gx表记录)
	 * @return AgWithdrawMaidGx  修改后的AgWithdrawMaidGx对象记录
	 * @throws HSKDBException
	 */
	public  AgWithdrawMaidGx updateAgWithdrawMaidGxById(Integer AwmgId,AgWithdrawMaidGx att_AgWithdrawMaidGx) throws HSKDBException;
	
	/**
	 * 新增ag_withdraw_maid_gx表 记录
     * @param  att_AgWithdrawMaidGx  AgWithdrawMaidGx类型(ag_withdraw_maid_gx表记录)
     * @return ag_withdraw_maid_gx表主键值
	 * @throws HSKDBException
	 */
	public Integer saveAgWithdrawMaidGx(AgWithdrawMaidGx att_AgWithdrawMaidGx) throws HSKDBException;
	
	 /**
	 * 新增或修改ag_withdraw_maid_gx表记录 ,如果ag_withdraw_maid_gx表主键AgWithdrawMaidGx.AwmgId为空就是添加，如果非空就是修改
     * @param  att_AgWithdrawMaidGx  AgWithdrawMaidGx类型(ag_withdraw_maid_gx表记录)
     * @return AgWithdrawMaidGx  修改后的AgWithdrawMaidGx对象记录
	 * @throws HSKDBException
	 */
	public  AgWithdrawMaidGx saveOrUpdateAgWithdrawMaidGx( AgWithdrawMaidGx att_AgWithdrawMaidGx) throws HSKDBException;
	
	/**
	 *根据AgWithdrawMaidGx对象作为对(ag_withdraw_maid_gx表进行查询，获取分页对象
     * @param  att_AgWithdrawMaidGx  AgWithdrawMaidGx类型(ag_withdraw_maid_gx表记录)
     * @return PagerModel  分页对象
	 * @throws HSKDBException 
	 */
	public PagerModel getPagerModelByAgWithdrawMaidGx (AgWithdrawMaidGx att_AgWithdrawMaidGx) throws HSKDBException;
	
    /**
	 *根据AgWithdrawMaidGx对象作为对(ag_withdraw_maid_gx表进行查询，获取分页对象
     * @param  att_AgWithdrawMaidGx  AgWithdrawMaidGx类型(ag_withdraw_maid_gx表记录)
     * @return List<AgWithdrawMaidGx>  列表对象
	 * @throws HSKDBException 
	 */
	public List<AgWithdrawMaidGx> getListByAgWithdrawMaidGx ( AgWithdrawMaidGx att_AgWithdrawMaidGx) throws HSKDBException;

}