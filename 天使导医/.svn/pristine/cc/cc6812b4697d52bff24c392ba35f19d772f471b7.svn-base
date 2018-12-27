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
 * @version  版本信息:v1.0   创建时间: 2018-08-14 13:28:03
 */
public interface IAgWorkTimeService  extends IDSTService{


		/**
	 * 查找AgWorkTime对象记录，用于弹出添加、修改窗口时候初始化数据
	 * @param  shiftPeriodId  Integer类型(ag_work_time表主键)
	  * @return SysRetrunMessage 对象记录
	 * @throws HSKException
	 */	
	public SysRetrunMessage findFormObject(Integer shiftPeriodId) throws HSKException;

	
	/**
	 * 查找AgWorkTime对象记录，用于弹出添加、修改窗口时候初始化数据
	 * @param  shiftPeriodId  Integer类型(ag_work_time表主键)
	 * @return AgWorkTime ag_work_time表记录
	 * @throws HSKException
	 */	
	public AgWorkTime findObject(Integer shiftPeriodId) throws HSKException;
	
	/**
	 * 根据ag_work_time表主键删除AgWorkTime对象记录
     * @param  shiftPeriodId  Integer类型(ag_work_time表主键)
     * @return SysRetrunMessage 对象记录
	 * @throws HSKException
	 */
	public SysRetrunMessage deleteObject(Integer shiftPeriodId) throws HSKException;
	
	
	
	/**
	 * 根据ag_work_time表主键删除多条AgWorkTime对象记录
     * @param  shiftPeriodIds  Integer类型(ag_work_time表主键)
     * @return SysRetrunMessage 对象记录
	 * @throws HSKException
	 */
	public SysRetrunMessage deleteAllObject(String shiftPeriodIds) throws HSKException;
	
	 /**
	 * 新增或修改ag_work_time表记录 ,如果ag_work_time表主键AgWorkTime.shiftPeriodId为空就是添加，如果非空就是修改
     * @param  att_AgWorkTime  AgWorkTime类型(ag_work_time表记录)
     * @return SysRetrunMessage 对象记录
	 * @throws HSKException
	 */
	public SysRetrunMessage   saveOrUpdateObject( AgWorkTime att_AgWorkTime) throws HSKException;
	
	/**
	 *根据AgWorkTime对象作为对(ag_work_time表进行查询，获取分页对象
     * @param  att_AgWorkTime  AgWorkTime类型(ag_work_time表记录)
     * @return PagerModel  分页对象
	 * @throws HSKException 
	 */
	public PagerModel getPagerModelObject (AgWorkTime att_AgWorkTime) throws HSKException;
	
}