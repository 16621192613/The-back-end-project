package com.hsk.angeldoctor.web.operate.service;

import java.util.*;
import com.hsk.angeldoctor.api.persistence.*;
import com.hsk.angeldoctor.api.daobbase.*;
import com.hsk.supper.dto.comm.PagerModel;
import com.hsk.supper.dto.comm.SysRetrunMessage;
import com.hsk.xframe.api.service.IDSTService;
import com.hsk.xframe.api.service.imp.DSTService;
import com.hsk.exception.HSKException;

/**
 * operate业务操作接口类 
 * @author  作者:admin
 * @version  版本信息:v1.0   创建时间: 2018-08-14 13:40:21
 */
public interface IAgInsideInfoService extends IDSTService{


		/**
	 * 查找AgInsideInfo对象记录，用于弹出添加、修改窗口时候初始化数据
	 * @param  aiiId  Integer类型(ag_inside_info表主键)
	  * @return SysRetrunMessage 对象记录
	 * @throws HSKException
	 */	
	public SysRetrunMessage findFormObject(Integer aiiId) throws HSKException;

	
	/**
	 * 查找AgInsideInfo对象记录，用于弹出添加、修改窗口时候初始化数据
	 * @param  aiiId  Integer类型(ag_inside_info表主键)
	 * @return AgInsideInfo ag_inside_info表记录
	 * @throws HSKException
	 */	
	public AgInsideInfo findObject(Integer aiiId) throws HSKException;
	
	/**
	 * 根据ag_inside_info表主键删除AgInsideInfo对象记录
     * @param  aiiId  Integer类型(ag_inside_info表主键)
     * @return SysRetrunMessage 对象记录
	 * @throws HSKException
	 */
	public SysRetrunMessage deleteObject(Integer aiiId) throws HSKException;
	
	
	
	/**
	 * 根据ag_inside_info表主键删除多条AgInsideInfo对象记录
     * @param  aiiIds  Integer类型(ag_inside_info表主键)
     * @return SysRetrunMessage 对象记录
	 * @throws HSKException
	 */
	public SysRetrunMessage deleteAllObject(String aiiIds) throws HSKException;
	
	 /**
	 * 新增或修改ag_inside_info表记录 ,如果ag_inside_info表主键AgInsideInfo.aiiId为空就是添加，如果非空就是修改
     * @param  att_AgInsideInfo  AgInsideInfo类型(ag_inside_info表记录)
     * @return SysRetrunMessage 对象记录
	 * @throws HSKException
	 */
	public SysRetrunMessage   saveOrUpdateObject( AgInsideInfo att_AgInsideInfo) throws HSKException;
	
	/**
	 *根据AgInsideInfo对象作为对(ag_inside_info表进行查询，获取分页对象
     * @param  att_AgInsideInfo  AgInsideInfo类型(ag_inside_info表记录)
     * @return PagerModel  分页对象
	 * @throws HSKException 
	 */
	public PagerModel getPagerModelObject (AgInsideInfo att_AgInsideInfo) throws HSKException;
	/**
	 * 获取全部数据
	 * @param att_AgInsideInfo
	 * @return
	 * @throws HSKException
	 */
	public List<AgInsideInfo> getAgInsideInfoList(AgInsideInfo att_AgInsideInfo) throws HSKException;
	
}