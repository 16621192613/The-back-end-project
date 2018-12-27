package com.hsk.angeldoctor.api.daobbase;

import java.util.*;
import com.hsk.angeldoctor.api.persistence.*;
import com.hsk.exception.HSKDBException;
import com.hsk.supper.dto.comm.PagerModel;

/**
 * ag_evaluate_info表数据库层面操作接口类 
 * @author  作者:admin
 * @version  版本信息:v1.0   创建时间: 2018-08-14 13:40:21
 */
public interface IAgEvaluateInfoDao{
	
	/**
	 * 根据ag_evaluate_info表主键查找AgEvaluateInfo对象记录
	 * @param  AeiId  Integer类型(ag_evaluate_info表主键)
	 * @return AgEvaluateInfo ag_evaluate_info表记录
	 * @throws HSKDBException
	 */	
	public AgEvaluateInfo findAgEvaluateInfoById(Integer AeiId) throws HSKDBException;
	
	/**
	 * 根据ag_evaluate_info表主键删除AgEvaluateInfo对象记录
     * @param  AeiId  Integer类型(ag_evaluate_info表主键)
	 * @throws HSKDBException
	 */
	public void deleteAgEvaluateInfoById(Integer AeiId) throws HSKDBException;
	 
	/**
 	 * 根据ag_evaluate_info表主键修改AgEvaluateInfo对象记录
	 * @param  AeiId  Integer类型(ag_evaluate_info表主键)
	 * @param  att_AgEvaluateInfo  AgEvaluateInfo类型(ag_evaluate_info表记录)
	 * @return AgEvaluateInfo  修改后的AgEvaluateInfo对象记录
	 * @throws HSKDBException
	 */
	public  AgEvaluateInfo updateAgEvaluateInfoById(Integer AeiId,AgEvaluateInfo att_AgEvaluateInfo) throws HSKDBException;
	
	/**
	 * 新增ag_evaluate_info表 记录
     * @param  att_AgEvaluateInfo  AgEvaluateInfo类型(ag_evaluate_info表记录)
     * @return ag_evaluate_info表主键值
	 * @throws HSKDBException
	 */
	public Integer saveAgEvaluateInfo(AgEvaluateInfo att_AgEvaluateInfo) throws HSKDBException;
	
	 /**
	 * 新增或修改ag_evaluate_info表记录 ,如果ag_evaluate_info表主键AgEvaluateInfo.AeiId为空就是添加，如果非空就是修改
     * @param  att_AgEvaluateInfo  AgEvaluateInfo类型(ag_evaluate_info表记录)
     * @return AgEvaluateInfo  修改后的AgEvaluateInfo对象记录
	 * @throws HSKDBException
	 */
	public  AgEvaluateInfo saveOrUpdateAgEvaluateInfo( AgEvaluateInfo att_AgEvaluateInfo) throws HSKDBException;
	
	/**
	 *根据AgEvaluateInfo对象作为对(ag_evaluate_info表进行查询，获取分页对象
     * @param  att_AgEvaluateInfo  AgEvaluateInfo类型(ag_evaluate_info表记录)
     * @return PagerModel  分页对象
	 * @throws HSKDBException 
	 */
	public PagerModel getPagerModelByAgEvaluateInfo (AgEvaluateInfo att_AgEvaluateInfo) throws HSKDBException;
	
    /**
	 *根据AgEvaluateInfo对象作为对(ag_evaluate_info表进行查询，获取分页对象
     * @param  att_AgEvaluateInfo  AgEvaluateInfo类型(ag_evaluate_info表记录)
     * @return List<AgEvaluateInfo>  列表对象
	 * @throws HSKDBException 
	 */
	public List<AgEvaluateInfo> getListByAgEvaluateInfo ( AgEvaluateInfo att_AgEvaluateInfo) throws HSKDBException;

}