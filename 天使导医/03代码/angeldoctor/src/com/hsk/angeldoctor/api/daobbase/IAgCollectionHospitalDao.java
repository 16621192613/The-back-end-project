package com.hsk.angeldoctor.api.daobbase;

import java.util.*;
import com.hsk.angeldoctor.api.persistence.*;
import com.hsk.exception.HSKDBException;
import com.hsk.supper.dto.comm.PagerModel;

/**
 * ag_collection_hospital表数据库层面操作接口类 
 * @author  作者:admin
 * @version  版本信息:v1.0   创建时间: 2018-08-14 13:27:59
 */
public interface IAgCollectionHospitalDao{
	
	/**
	 * 根据ag_collection_hospital表主键查找AgCollectionHospital对象记录
	 * @param  MchId  Integer类型(ag_collection_hospital表主键)
	 * @return AgCollectionHospital ag_collection_hospital表记录
	 * @throws HSKDBException
	 */	
	public AgCollectionHospital findAgCollectionHospitalById(Integer MchId) throws HSKDBException;
	
	/**
	 * 根据ag_collection_hospital表主键删除AgCollectionHospital对象记录
     * @param  MchId  Integer类型(ag_collection_hospital表主键)
	 * @throws HSKDBException
	 */
	public void deleteAgCollectionHospitalById(Integer MchId) throws HSKDBException;
	 
	/**
 	 * 根据ag_collection_hospital表主键修改AgCollectionHospital对象记录
	 * @param  MchId  Integer类型(ag_collection_hospital表主键)
	 * @param  att_AgCollectionHospital  AgCollectionHospital类型(ag_collection_hospital表记录)
	 * @return AgCollectionHospital  修改后的AgCollectionHospital对象记录
	 * @throws HSKDBException
	 */
	public  AgCollectionHospital updateAgCollectionHospitalById(Integer MchId,AgCollectionHospital att_AgCollectionHospital) throws HSKDBException;
	
	/**
	 * 新增ag_collection_hospital表 记录
     * @param  att_AgCollectionHospital  AgCollectionHospital类型(ag_collection_hospital表记录)
     * @return ag_collection_hospital表主键值
	 * @throws HSKDBException
	 */
	public Integer saveAgCollectionHospital(AgCollectionHospital att_AgCollectionHospital) throws HSKDBException;
	
	 /**
	 * 新增或修改ag_collection_hospital表记录 ,如果ag_collection_hospital表主键AgCollectionHospital.MchId为空就是添加，如果非空就是修改
     * @param  att_AgCollectionHospital  AgCollectionHospital类型(ag_collection_hospital表记录)
     * @return AgCollectionHospital  修改后的AgCollectionHospital对象记录
	 * @throws HSKDBException
	 */
	public  AgCollectionHospital saveOrUpdateAgCollectionHospital( AgCollectionHospital att_AgCollectionHospital) throws HSKDBException;
	
	/**
	 *根据AgCollectionHospital对象作为对(ag_collection_hospital表进行查询，获取分页对象
     * @param  att_AgCollectionHospital  AgCollectionHospital类型(ag_collection_hospital表记录)
     * @return PagerModel  分页对象
	 * @throws HSKDBException 
	 */
	public PagerModel getPagerModelByAgCollectionHospital (AgCollectionHospital att_AgCollectionHospital) throws HSKDBException;
	
    /**
	 *根据AgCollectionHospital对象作为对(ag_collection_hospital表进行查询，获取分页对象
     * @param  att_AgCollectionHospital  AgCollectionHospital类型(ag_collection_hospital表记录)
     * @return List<AgCollectionHospital>  列表对象
	 * @throws HSKDBException 
	 */
	public List<AgCollectionHospital> getListByAgCollectionHospital ( AgCollectionHospital att_AgCollectionHospital) throws HSKDBException;

}