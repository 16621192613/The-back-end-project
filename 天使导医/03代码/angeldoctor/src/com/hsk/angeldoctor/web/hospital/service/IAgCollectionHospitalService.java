package com.hsk.angeldoctor.web.hospital.service;

import java.util.*;
import com.hsk.angeldoctor.api.persistence.*;
import com.hsk.angeldoctor.api.daobbase.*;
import com.hsk.supper.dto.comm.PagerModel;
import com.hsk.supper.dto.comm.SysRetrunMessage;
import com.hsk.xframe.api.service.IDSTService;
import com.hsk.exception.HSKException;

/**
 * hospital业务操作接口类 
 * @author  作者:admin
 * @version  版本信息:v1.0   创建时间: 2018-08-14 13:27:59
 */
public interface IAgCollectionHospitalService extends IDSTService{


		/**
	 * 查找AgCollectionHospital对象记录，用于弹出添加、修改窗口时候初始化数据
	 * @param  mchId  Integer类型(ag_collection_hospital表主键)
	  * @return SysRetrunMessage 对象记录
	 * @throws HSKException
	 */	
	public SysRetrunMessage findFormObject(Integer mchId) throws HSKException;

	
	/**
	 * 查找AgCollectionHospital对象记录，用于弹出添加、修改窗口时候初始化数据
	 * @param  mchId  Integer类型(ag_collection_hospital表主键)
	 * @return AgCollectionHospital ag_collection_hospital表记录
	 * @throws HSKException
	 */	
	public AgCollectionHospital findObject(Integer mchId) throws HSKException;
	
	/**
	 * 根据ag_collection_hospital表主键删除AgCollectionHospital对象记录
     * @param  mchId  Integer类型(ag_collection_hospital表主键)
     * @return SysRetrunMessage 对象记录
	 * @throws HSKException
	 */
	public SysRetrunMessage deleteObject(Integer mchId) throws HSKException;
	
	
	
	/**
	 * 根据ag_collection_hospital表主键删除多条AgCollectionHospital对象记录
     * @param  mchIds  Integer类型(ag_collection_hospital表主键)
     * @return SysRetrunMessage 对象记录
	 * @throws HSKException
	 */
	public SysRetrunMessage deleteAllObject(String mchIds) throws HSKException;
	
	 /**
	 * 新增或修改ag_collection_hospital表记录 ,如果ag_collection_hospital表主键AgCollectionHospital.mchId为空就是添加，如果非空就是修改
     * @param  att_AgCollectionHospital  AgCollectionHospital类型(ag_collection_hospital表记录)
     * @return SysRetrunMessage 对象记录
	 * @throws HSKException
	 */
	public SysRetrunMessage   saveOrUpdateObject( AgCollectionHospital att_AgCollectionHospital) throws HSKException;
	
	/**
	 *根据AgCollectionHospital对象作为对(ag_collection_hospital表进行查询，获取分页对象
     * @param  att_AgCollectionHospital  AgCollectionHospital类型(ag_collection_hospital表记录)
     * @return PagerModel  分页对象
	 * @throws HSKException 
	 */
	public PagerModel getPagerModelObject (AgCollectionHospital att_AgCollectionHospital) throws HSKException;
	
}