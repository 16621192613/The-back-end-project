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
public interface IAgWorkModelService  extends IDSTService{


		/**
	 * 查找AgWorkModel对象记录，用于弹出添加、修改窗口时候初始化数据
	 * @param  shiftTemplateId  Integer类型(ag_work_model表主键)
	  * @return SysRetrunMessage 对象记录
	 * @throws HSKException
	 */	
	public SysRetrunMessage findFormObject(Integer shiftTemplateId) throws HSKException;

	
	/**
	 * 查找AgWorkModel对象记录，用于弹出添加、修改窗口时候初始化数据
	 * @param  shiftTemplateId  Integer类型(ag_work_model表主键)
	 * @return AgWorkModel ag_work_model表记录
	 * @throws HSKException
	 */	
	public AgWorkModel findObject(Integer shiftTemplateId) throws HSKException;
	
	/**
	 * 根据ag_work_model表主键删除AgWorkModel对象记录
     * @param  shiftTemplateId  Integer类型(ag_work_model表主键)
     * @return SysRetrunMessage 对象记录
	 * @throws HSKException
	 */
	public SysRetrunMessage deleteObject(Integer shiftTemplateId) throws HSKException;
	
	
	
	/**
	 * 根据ag_work_model表主键删除多条AgWorkModel对象记录
     * @param  shiftTemplateIds  Integer类型(ag_work_model表主键)
     * @return SysRetrunMessage 对象记录
	 * @throws HSKException
	 */
	public SysRetrunMessage deleteAllObject(String shiftTemplateIds) throws HSKException;
	
	 /**
	 * 新增或修改ag_work_model表记录 ,如果ag_work_model表主键AgWorkModel.shiftTemplateId为空就是添加，如果非空就是修改
     * @param  att_AgWorkModel  AgWorkModel类型(ag_work_model表记录)
     * @return SysRetrunMessage 对象记录
	 * @throws HSKException
	 */
	public SysRetrunMessage   saveOrUpdateObject( AgWorkModel att_AgWorkModel) throws HSKException;
	
	/**
	 *根据AgWorkModel对象作为对(ag_work_model表进行查询，获取分页对象
     * @param  att_AgWorkModel  AgWorkModel类型(ag_work_model表记录)
     * @return PagerModel  分页对象
	 * @throws HSKException 
	 */
	public PagerModel getPagerModelObject (AgWorkModel att_AgWorkModel) throws HSKException;
	
	/**
	 * 
	 * @param name
	 * @param list_obj
	 * @return
	 * @throws HSKException
	 */
	public SysRetrunMessage saveOrUpdateAgWorkModel( AgWorkModel  att_AgWorkModel ,List<AgWorkModelGx> list_obj) throws HSKException;
	
}