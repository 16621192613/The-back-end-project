package com.hsk.angeldoctor.web.hospital.service;

import java.util.*;
import com.hsk.angeldoctor.api.persistence.*;
import com.hsk.angeldoctor.api.daobbase.*;
import com.hsk.supper.dto.comm.PagerModel;
import com.hsk.supper.dto.comm.SysRetrunMessage;
import com.hsk.xframe.api.service.IDSTService;
import com.hsk.exception.HSKDBException;
import com.hsk.exception.HSKException;

/**
 * hospital业务操作接口类 
 * @author  作者:admin
 * @version  版本信息:v1.0   创建时间: 2018-08-14 13:28:02
 */
public interface IAgWorkInfoService extends IDSTService{


		/**
	 * 查找AgWorkInfo对象记录，用于弹出添加、修改窗口时候初始化数据
	 * @param  shiftPlanId  Integer类型(ag_work_info表主键)
	  * @return SysRetrunMessage 对象记录
	 * @throws HSKException
	 */	
	public SysRetrunMessage findFormObject(Integer shiftPlanId) throws HSKException;

	
	/**
	 * 查找AgWorkInfo对象记录，用于弹出添加、修改窗口时候初始化数据
	 * @param  shiftPlanId  Integer类型(ag_work_info表主键)
	 * @return AgWorkInfo ag_work_info表记录
	 * @throws HSKException
	 */	
	public AgWorkInfo findObject(Integer shiftPlanId) throws HSKException;
	
	/**
	 * 根据ag_work_info表主键删除AgWorkInfo对象记录
     * @param  shiftPlanId  Integer类型(ag_work_info表主键)
     * @return SysRetrunMessage 对象记录
	 * @throws HSKException
	 */
	public SysRetrunMessage deleteObject(Integer shiftPlanId) throws HSKException;
	
	
	
	/**
	 * 根据ag_work_info表主键删除多条AgWorkInfo对象记录
     * @param  shiftPlanIds  Integer类型(ag_work_info表主键)
     * @return SysRetrunMessage 对象记录
	 * @throws HSKException
	 */
	public SysRetrunMessage deleteAllObject(String shiftPlanIds) throws HSKException;
	
	 /**
	 * 新增或修改ag_work_info表记录 ,如果ag_work_info表主键AgWorkInfo.shiftPlanId为空就是添加，如果非空就是修改
     * @param  att_AgWorkInfo  AgWorkInfo类型(ag_work_info表记录)
     * @return SysRetrunMessage 对象记录
	 * @throws HSKException
	 */
	public SysRetrunMessage   saveOrUpdateObject( AgWorkInfo att_AgWorkInfo) throws HSKException;
	
	/**
	 * 修改 ag_work_info 表
	 * @param AgWorkInfo_list
	 * @return
	 * @throws HSKException
	 */
	public SysRetrunMessage   saveOrUpdateListWork( List<AgWorkInfo>  AgWorkInfo_list) throws HSKException;
	
	
	/**
	 *根据AgWorkInfo对象作为对(ag_work_info表进行查询，获取分页对象
     * @param  att_AgWorkInfo  AgWorkInfo类型(ag_work_info表记录)
     * @return PagerModel  分页对象
	 * @throws HSKException 
	 */
	public PagerModel getPagerModelObject (AgWorkInfo att_AgWorkInfo) throws HSKException;
	/**
	 * 获取排班视图列表
	 * @param att_AgWorkView
	 * @return
	 * @throws HSKException
	 */
	public List<AgWorkView> getAgWorkViewList( AgWorkView att_AgWorkView) throws HSKException;
	
}