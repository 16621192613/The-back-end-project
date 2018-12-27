package com.hsk.angeldoctor.api.daobbase;

import java.util.*;
import com.hsk.angeldoctor.api.persistence.*;
import com.hsk.exception.HSKDBException;
import com.hsk.supper.dto.comm.PagerModel;

/**
 * ag_collection_doctor表数据库层面操作接口类 
 * @author  作者:admin
 * @version  版本信息:v1.0   创建时间: 2018-08-14 13:27:58
 */
public interface IAgCollectionDoctorDao{
	
	/**
	 * 根据ag_collection_doctor表主键查找AgCollectionDoctor对象记录
	 * @param  McdId  Integer类型(ag_collection_doctor表主键)
	 * @return AgCollectionDoctor ag_collection_doctor表记录
	 * @throws HSKDBException
	 */	
	public AgCollectionDoctor findAgCollectionDoctorById(Integer McdId) throws HSKDBException;
	
	/**
	 * 根据ag_collection_doctor表主键删除AgCollectionDoctor对象记录
     * @param  McdId  Integer类型(ag_collection_doctor表主键)
	 * @throws HSKDBException
	 */
	public void deleteAgCollectionDoctorById(Integer McdId) throws HSKDBException;
	 
	/**
 	 * 根据ag_collection_doctor表主键修改AgCollectionDoctor对象记录
	 * @param  McdId  Integer类型(ag_collection_doctor表主键)
	 * @param  att_AgCollectionDoctor  AgCollectionDoctor类型(ag_collection_doctor表记录)
	 * @return AgCollectionDoctor  修改后的AgCollectionDoctor对象记录
	 * @throws HSKDBException
	 */
	public  AgCollectionDoctor updateAgCollectionDoctorById(Integer McdId,AgCollectionDoctor att_AgCollectionDoctor) throws HSKDBException;
	
	/**
	 * 新增ag_collection_doctor表 记录
     * @param  att_AgCollectionDoctor  AgCollectionDoctor类型(ag_collection_doctor表记录)
     * @return ag_collection_doctor表主键值
	 * @throws HSKDBException
	 */
	public Integer saveAgCollectionDoctor(AgCollectionDoctor att_AgCollectionDoctor) throws HSKDBException;
	
	 /**
	 * 新增或修改ag_collection_doctor表记录 ,如果ag_collection_doctor表主键AgCollectionDoctor.McdId为空就是添加，如果非空就是修改
     * @param  att_AgCollectionDoctor  AgCollectionDoctor类型(ag_collection_doctor表记录)
     * @return AgCollectionDoctor  修改后的AgCollectionDoctor对象记录
	 * @throws HSKDBException
	 */
	public  AgCollectionDoctor saveOrUpdateAgCollectionDoctor( AgCollectionDoctor att_AgCollectionDoctor) throws HSKDBException;
	
	/**
	 *根据AgCollectionDoctor对象作为对(ag_collection_doctor表进行查询，获取分页对象
     * @param  att_AgCollectionDoctor  AgCollectionDoctor类型(ag_collection_doctor表记录)
     * @return PagerModel  分页对象
	 * @throws HSKDBException 
	 */
	public PagerModel getPagerModelByAgCollectionDoctor (AgCollectionDoctor att_AgCollectionDoctor) throws HSKDBException;
	
    /**
	 *根据AgCollectionDoctor对象作为对(ag_collection_doctor表进行查询，获取分页对象
     * @param  att_AgCollectionDoctor  AgCollectionDoctor类型(ag_collection_doctor表记录)
     * @return List<AgCollectionDoctor>  列表对象
	 * @throws HSKDBException 
	 */
	public List<AgCollectionDoctor> getListByAgCollectionDoctor ( AgCollectionDoctor att_AgCollectionDoctor) throws HSKDBException;

}