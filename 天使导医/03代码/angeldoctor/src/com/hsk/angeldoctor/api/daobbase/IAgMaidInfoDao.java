package com.hsk.angeldoctor.api.daobbase;

import java.util.*;
import com.hsk.angeldoctor.api.persistence.*;
import com.hsk.exception.HSKDBException;
import com.hsk.supper.dto.comm.PagerModel;

/**
 * ag_maid_info表数据库层面操作接口类 
 * @author  作者:admin
 * @version  版本信息:v1.0   创建时间: 2018-08-14 13:31:12
 */
public interface IAgMaidInfoDao{
	
	/**
	 * 根据ag_maid_info表主键查找AgMaidInfo对象记录
	 * @param  AmiId  Integer类型(ag_maid_info表主键)
	 * @return AgMaidInfo ag_maid_info表记录
	 * @throws HSKDBException
	 */	
	public AgMaidInfo findAgMaidInfoById(Integer AmiId) throws HSKDBException;
	
	/**
	 * 根据ag_maid_info表主键删除AgMaidInfo对象记录
     * @param  AmiId  Integer类型(ag_maid_info表主键)
	 * @throws HSKDBException
	 */
	public void deleteAgMaidInfoById(Integer AmiId) throws HSKDBException;
	 
	/**
 	 * 根据ag_maid_info表主键修改AgMaidInfo对象记录
	 * @param  AmiId  Integer类型(ag_maid_info表主键)
	 * @param  att_AgMaidInfo  AgMaidInfo类型(ag_maid_info表记录)
	 * @return AgMaidInfo  修改后的AgMaidInfo对象记录
	 * @throws HSKDBException
	 */
	public  AgMaidInfo updateAgMaidInfoById(Integer AmiId,AgMaidInfo att_AgMaidInfo) throws HSKDBException;
	
	/**
	 * 新增ag_maid_info表 记录
     * @param  att_AgMaidInfo  AgMaidInfo类型(ag_maid_info表记录)
     * @return ag_maid_info表主键值
	 * @throws HSKDBException
	 */
	public Integer saveAgMaidInfo(AgMaidInfo att_AgMaidInfo) throws HSKDBException;
	
	 /**
	 * 新增或修改ag_maid_info表记录 ,如果ag_maid_info表主键AgMaidInfo.AmiId为空就是添加，如果非空就是修改
     * @param  att_AgMaidInfo  AgMaidInfo类型(ag_maid_info表记录)
     * @return AgMaidInfo  修改后的AgMaidInfo对象记录
	 * @throws HSKDBException
	 */
	public  AgMaidInfo saveOrUpdateAgMaidInfo( AgMaidInfo att_AgMaidInfo) throws HSKDBException;
	
	/**
	 *根据AgMaidInfo对象作为对(ag_maid_info表进行查询，获取分页对象
     * @param  att_AgMaidInfo  AgMaidInfo类型(ag_maid_info表记录)
     * @return PagerModel  分页对象
	 * @throws HSKDBException 
	 */
	public PagerModel getPagerModelByAgMaidInfo (AgMaidInfo att_AgMaidInfo) throws HSKDBException;
	
    /**
	 *根据AgMaidInfo对象作为对(ag_maid_info表进行查询，获取分页对象
     * @param  att_AgMaidInfo  AgMaidInfo类型(ag_maid_info表记录)
     * @return List<AgMaidInfo>  列表对象
	 * @throws HSKDBException 
	 */
	public List<AgMaidInfo> getListByAgMaidInfo ( AgMaidInfo att_AgMaidInfo) throws HSKDBException;
	/**
	 * 统计医院信息
	 * @param organizationId
	 * @return
	 * @throws HSKDBException
	 */
	public Map<String,Object> getHosCountMap(Integer organizationId) throws HSKDBException;

}