package com.hsk.angeldoctor.api.daobbase;

import java.util.*;
import com.hsk.angeldoctor.api.persistence.*;
import com.hsk.exception.HSKDBException;
import com.hsk.supper.dto.comm.PagerModel;

/**
 * ag_withdraw_info表数据库层面操作接口类 
 * @author  作者:admin
 * @version  版本信息:v1.0   创建时间: 2018-08-14 13:31:12
 */
public interface IAgWithdrawInfoDao{
	
	/**
	 * 根据ag_withdraw_info表主键查找AgWithdrawInfo对象记录
	 * @param  AwiId  Integer类型(ag_withdraw_info表主键)
	 * @return AgWithdrawInfo ag_withdraw_info表记录
	 * @throws HSKDBException
	 */	
	public AgWithdrawInfo findAgWithdrawInfoById(Integer AwiId) throws HSKDBException;
	
	/**
	 * 根据ag_withdraw_info表主键删除AgWithdrawInfo对象记录
     * @param  AwiId  Integer类型(ag_withdraw_info表主键)
	 * @throws HSKDBException
	 */
	public void deleteAgWithdrawInfoById(Integer AwiId) throws HSKDBException;
	 
	/**
 	 * 根据ag_withdraw_info表主键修改AgWithdrawInfo对象记录
	 * @param  AwiId  Integer类型(ag_withdraw_info表主键)
	 * @param  att_AgWithdrawInfo  AgWithdrawInfo类型(ag_withdraw_info表记录)
	 * @return AgWithdrawInfo  修改后的AgWithdrawInfo对象记录
	 * @throws HSKDBException
	 */
	public  AgWithdrawInfo updateAgWithdrawInfoById(Integer AwiId,AgWithdrawInfo att_AgWithdrawInfo) throws HSKDBException;
	
	/**
	 * 新增ag_withdraw_info表 记录
     * @param  att_AgWithdrawInfo  AgWithdrawInfo类型(ag_withdraw_info表记录)
     * @return ag_withdraw_info表主键值
	 * @throws HSKDBException
	 */
	public Integer saveAgWithdrawInfo(AgWithdrawInfo att_AgWithdrawInfo) throws HSKDBException;
	
	 /**
	 * 新增或修改ag_withdraw_info表记录 ,如果ag_withdraw_info表主键AgWithdrawInfo.AwiId为空就是添加，如果非空就是修改
     * @param  att_AgWithdrawInfo  AgWithdrawInfo类型(ag_withdraw_info表记录)
     * @return AgWithdrawInfo  修改后的AgWithdrawInfo对象记录
	 * @throws HSKDBException
	 */
	public  AgWithdrawInfo saveOrUpdateAgWithdrawInfo( AgWithdrawInfo att_AgWithdrawInfo) throws HSKDBException;
	
	/**
	 *根据AgWithdrawInfo对象作为对(ag_withdraw_info表进行查询，获取分页对象
     * @param  att_AgWithdrawInfo  AgWithdrawInfo类型(ag_withdraw_info表记录)
     * @return PagerModel  分页对象
	 * @throws HSKDBException 
	 */
	public PagerModel getPagerModelByAgWithdrawInfo (AgWithdrawInfo att_AgWithdrawInfo) throws HSKDBException;
	
    /**
	 *根据AgWithdrawInfo对象作为对(ag_withdraw_info表进行查询，获取分页对象
     * @param  att_AgWithdrawInfo  AgWithdrawInfo类型(ag_withdraw_info表记录)
     * @return List<AgWithdrawInfo>  列表对象
	 * @throws HSKDBException 
	 */
	public List<AgWithdrawInfo> getListByAgWithdrawInfo ( AgWithdrawInfo att_AgWithdrawInfo) throws HSKDBException;
	/**
	 * 统计提现总额
	 * @return
	 * @throws HSKDBException
	 */
	public Double countAgWithdrawInfoMoney() throws HSKDBException;

}