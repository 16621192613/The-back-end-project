package com.hsk.angeldoctor.api.daobbase;

import java.util.*;
import com.hsk.angeldoctor.api.persistence.*;
import com.hsk.exception.HSKDBException;
import com.hsk.supper.dto.comm.PagerModel;

/**
 * ag_integral_info表数据库层面操作接口类 
 * @author  作者:admin
 * @version  版本信息:v1.0   创建时间: 2018-08-14 13:41:32
 */
public interface IAgIntegralInfoDao{
	
	/**
	 * 根据ag_integral_info表主键查找AgIntegralInfo对象记录
	 * @param  AiiId  Integer类型(ag_integral_info表主键)
	 * @return AgIntegralInfo ag_integral_info表记录
	 * @throws HSKDBException
	 */	
	public AgIntegralInfo findAgIntegralInfoById(Integer AiiId) throws HSKDBException;
	
	/**
	 * 根据ag_integral_info表主键删除AgIntegralInfo对象记录
     * @param  AiiId  Integer类型(ag_integral_info表主键)
	 * @throws HSKDBException
	 */
	public void deleteAgIntegralInfoById(Integer AiiId) throws HSKDBException;
	 
	/**
 	 * 根据ag_integral_info表主键修改AgIntegralInfo对象记录
	 * @param  AiiId  Integer类型(ag_integral_info表主键)
	 * @param  att_AgIntegralInfo  AgIntegralInfo类型(ag_integral_info表记录)
	 * @return AgIntegralInfo  修改后的AgIntegralInfo对象记录
	 * @throws HSKDBException
	 */
	public  AgIntegralInfo updateAgIntegralInfoById(Integer AiiId,AgIntegralInfo att_AgIntegralInfo) throws HSKDBException;
	
	/**
	 * 新增ag_integral_info表 记录
     * @param  att_AgIntegralInfo  AgIntegralInfo类型(ag_integral_info表记录)
     * @return ag_integral_info表主键值
	 * @throws HSKDBException
	 */
	public Integer saveAgIntegralInfo(AgIntegralInfo att_AgIntegralInfo) throws HSKDBException;
	
	 /**
	 * 新增或修改ag_integral_info表记录 ,如果ag_integral_info表主键AgIntegralInfo.AiiId为空就是添加，如果非空就是修改
     * @param  att_AgIntegralInfo  AgIntegralInfo类型(ag_integral_info表记录)
     * @return AgIntegralInfo  修改后的AgIntegralInfo对象记录
	 * @throws HSKDBException
	 */
	public  AgIntegralInfo saveOrUpdateAgIntegralInfo( AgIntegralInfo att_AgIntegralInfo) throws HSKDBException;
	
	/**
	 *根据AgIntegralInfo对象作为对(ag_integral_info表进行查询，获取分页对象
     * @param  att_AgIntegralInfo  AgIntegralInfo类型(ag_integral_info表记录)
     * @return PagerModel  分页对象
	 * @throws HSKDBException 
	 */
	public PagerModel getPagerModelByAgIntegralInfo (AgIntegralInfo att_AgIntegralInfo) throws HSKDBException;
	
    /**
	 *根据AgIntegralInfo对象作为对(ag_integral_info表进行查询，获取分页对象
     * @param  att_AgIntegralInfo  AgIntegralInfo类型(ag_integral_info表记录)
     * @return List<AgIntegralInfo>  列表对象
	 * @throws HSKDBException 
	 */
	public List<AgIntegralInfo> getListByAgIntegralInfo ( AgIntegralInfo att_AgIntegralInfo) throws HSKDBException;
	
	/**
	 *计算排名 
	 * @param att_AgIntegralInfo
	 * @return
	 * @throws HSKDBException
	 */
	public Integer getOrderNum( AgIntegralInfo att_AgIntegralInfo) throws HSKDBException;

}