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
 * @version  版本信息:v1.0   创建时间: 2018-08-14 13:28:02
 */
public interface IAgWorkModelGxService extends IDSTService{


		/**
	 * 查找AgWorkModelGx对象记录，用于弹出添加、修改窗口时候初始化数据
	 * @param  awmgId  Integer类型(ag_work_model_gx表主键)
	  * @return SysRetrunMessage 对象记录
	 * @throws HSKException
	 */	
	public SysRetrunMessage findFormObject(Integer awmgId) throws HSKException;

	
	/**
	 * 查找AgWorkModelGx对象记录，用于弹出添加、修改窗口时候初始化数据
	 * @param  awmgId  Integer类型(ag_work_model_gx表主键)
	 * @return AgWorkModelGx ag_work_model_gx表记录
	 * @throws HSKException
	 */	
	public AgWorkModelGx findObject(Integer awmgId) throws HSKException;
	
	/**
	 * 根据ag_work_model_gx表主键删除AgWorkModelGx对象记录
     * @param  awmgId  Integer类型(ag_work_model_gx表主键)
     * @return SysRetrunMessage 对象记录
	 * @throws HSKException
	 */
	public SysRetrunMessage deleteObject(Integer awmgId) throws HSKException;
	
	
	
	/**
	 * 根据ag_work_model_gx表主键删除多条AgWorkModelGx对象记录
     * @param  awmgIds  Integer类型(ag_work_model_gx表主键)
     * @return SysRetrunMessage 对象记录
	 * @throws HSKException
	 */
	public SysRetrunMessage deleteAllObject(String awmgIds) throws HSKException;
	
	 /**
	 * 新增或修改ag_work_model_gx表记录 ,如果ag_work_model_gx表主键AgWorkModelGx.awmgId为空就是添加，如果非空就是修改
     * @param  att_AgWorkModelGx  AgWorkModelGx类型(ag_work_model_gx表记录)
     * @return SysRetrunMessage 对象记录
	 * @throws HSKException
	 */
	public SysRetrunMessage   saveOrUpdateObject( AgWorkModelGx att_AgWorkModelGx) throws HSKException;
	
	/**
	 *根据AgWorkModelGx对象作为对(ag_work_model_gx表进行查询，获取分页对象
     * @param  att_AgWorkModelGx  AgWorkModelGx类型(ag_work_model_gx表记录)
     * @return PagerModel  分页对象
	 * @throws HSKException 
	 */
	public PagerModel getPagerModelObject (AgWorkModelGx att_AgWorkModelGx) throws HSKException;
	
	/**
	 * 根据AgWorkModelGx对象作为对(ag_work_model_gx表进行查询，获取List对象
	 * @param att_AgWorkModelGx  AgWorkModelGx类型(ag_work_model_gx表记录)
	 * @return
	 * @throws HSKException
	 */
	public List<AgWorkModelGx> getListObject (AgWorkModelGx att_AgWorkModelGx) throws HSKException;
	
}