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
 * @version  版本信息:v1.0   创建时间: 2018-08-14 13:27:58
 */
public interface IAgCollectionDoctorService extends IDSTService{


		/**
	 * 查找AgCollectionDoctor对象记录，用于弹出添加、修改窗口时候初始化数据
	 * @param  mcdId  Integer类型(ag_collection_doctor表主键)
	  * @return SysRetrunMessage 对象记录
	 * @throws HSKException
	 */	
	public SysRetrunMessage findFormObject(Integer mcdId) throws HSKException;

	
	/**
	 * 查找AgCollectionDoctor对象记录，用于弹出添加、修改窗口时候初始化数据
	 * @param  mcdId  Integer类型(ag_collection_doctor表主键)
	 * @return AgCollectionDoctor ag_collection_doctor表记录
	 * @throws HSKException
	 */	
	public AgCollectionDoctor findObject(Integer mcdId) throws HSKException;
	
	/**
	 * 根据ag_collection_doctor表主键删除AgCollectionDoctor对象记录
     * @param  mcdId  Integer类型(ag_collection_doctor表主键)
     * @return SysRetrunMessage 对象记录
	 * @throws HSKException
	 */
	public SysRetrunMessage deleteObject(Integer mcdId) throws HSKException;
	
	
	
	/**
	 * 根据ag_collection_doctor表主键删除多条AgCollectionDoctor对象记录
     * @param  mcdIds  Integer类型(ag_collection_doctor表主键)
     * @return SysRetrunMessage 对象记录
	 * @throws HSKException
	 */
	public SysRetrunMessage deleteAllObject(String mcdIds) throws HSKException;
	
	 /**
	 * 新增或修改ag_collection_doctor表记录 ,如果ag_collection_doctor表主键AgCollectionDoctor.mcdId为空就是添加，如果非空就是修改
     * @param  att_AgCollectionDoctor  AgCollectionDoctor类型(ag_collection_doctor表记录)
     * @return SysRetrunMessage 对象记录
	 * @throws HSKException
	 */
	public SysRetrunMessage   saveOrUpdateObject( AgCollectionDoctor att_AgCollectionDoctor) throws HSKException;
	
	/**
	 *根据AgCollectionDoctor对象作为对(ag_collection_doctor表进行查询，获取分页对象
     * @param  att_AgCollectionDoctor  AgCollectionDoctor类型(ag_collection_doctor表记录)
     * @return PagerModel  分页对象
	 * @throws HSKException 
	 */
	public PagerModel getPagerModelObject (AgCollectionDoctor att_AgCollectionDoctor) throws HSKException;
	
}