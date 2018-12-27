package com.hsk.angeldoctor.web.integral.service;

import java.util.*;
import com.hsk.angeldoctor.api.persistence.*;
import com.hsk.angeldoctor.api.daobbase.*;
import com.hsk.supper.dto.comm.PagerModel;
import com.hsk.supper.dto.comm.SysRetrunMessage;
import com.hsk.xframe.api.service.IDSTService;
import com.hsk.exception.HSKException;

/**
 * integral业务操作接口类 
 * @author  作者:admin
 * @version  版本信息:v1.0   创建时间: 2018-08-14 13:41:33
 */
public interface IAgIntegralOrderService extends IDSTService{


		/**
	 * 查找AgIntegralOrder对象记录，用于弹出添加、修改窗口时候初始化数据
	 * @param  aioId  Integer类型(ag_integral_order表主键)
	  * @return SysRetrunMessage 对象记录
	 * @throws HSKException
	 */	
	public SysRetrunMessage findFormObject(Integer aioId) throws HSKException;

	
	/**
	 * 查找AgIntegralOrder对象记录，用于弹出添加、修改窗口时候初始化数据
	 * @param  aioId  Integer类型(ag_integral_order表主键)
	 * @return AgIntegralOrder ag_integral_order表记录
	 * @throws HSKException
	 */	
	public AgIntegralOrder findObject(Integer aioId) throws HSKException;
	
	/**
	 * 根据ag_integral_order表主键删除AgIntegralOrder对象记录
     * @param  aioId  Integer类型(ag_integral_order表主键)
     * @return SysRetrunMessage 对象记录
	 * @throws HSKException
	 */
	public SysRetrunMessage deleteObject(Integer aioId) throws HSKException;
	
	
	
	/**
	 * 根据ag_integral_order表主键删除多条AgIntegralOrder对象记录
     * @param  aioIds  Integer类型(ag_integral_order表主键)
     * @return SysRetrunMessage 对象记录
	 * @throws HSKException
	 */
	public SysRetrunMessage deleteAllObject(String aioIds) throws HSKException;
	
	 /**
	 * 新增或修改ag_integral_order表记录 ,如果ag_integral_order表主键AgIntegralOrder.aioId为空就是添加，如果非空就是修改
     * @param  att_AgIntegralOrder  AgIntegralOrder类型(ag_integral_order表记录)
     * @return SysRetrunMessage 对象记录
	 * @throws HSKException
	 */
	public SysRetrunMessage   saveOrUpdateObject( AgIntegralOrder att_AgIntegralOrder) throws HSKException;
	/**
	 * 发货操作
	 * @param att_AgIntegralOrder
	 * @return
	 * @throws HSKException
	 */
	public SysRetrunMessage   savefire( AgIntegralOrder att_AgIntegralOrder) throws HSKException;
	
	/**
	 *根据AgIntegralOrder对象作为对(ag_integral_order表进行查询，获取分页对象
     * @param  att_AgIntegralOrder  AgIntegralOrder类型(ag_integral_order表记录)
     * @return PagerModel  分页对象
	 * @throws HSKException 
	 */
	public PagerModel getPagerModelObject (AgIntegralOrder att_AgIntegralOrder) throws HSKException;
	
	
}