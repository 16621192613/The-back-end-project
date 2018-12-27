package com.hsk.angeldoctor.web.agent.service;

import java.util.*;
import com.hsk.angeldoctor.api.persistence.*;
import com.hsk.angeldoctor.api.daobbase.*;
import com.hsk.supper.dto.comm.PagerModel;
import com.hsk.supper.dto.comm.SysRetrunMessage;
import com.hsk.xframe.api.service.IDSTService;
import com.hsk.exception.HSKException;

/**
 * agent业务操作接口类 
 * @author  作者:admin
 * @version  版本信息:v1.0   创建时间: 2018-08-14 13:31:12
 */
public interface IAgMaidInfoService  extends IDSTService {


		/**
	 * 查找AgMaidInfo对象记录，用于弹出添加、修改窗口时候初始化数据
	 * @param  amiId  Integer类型(ag_maid_info表主键)
	  * @return SysRetrunMessage 对象记录
	 * @throws HSKException
	 */	
	public SysRetrunMessage findFormObject(Integer amiId) throws HSKException;

	
	/**
	 * 查找AgMaidInfo对象记录，用于弹出添加、修改窗口时候初始化数据
	 * @param  amiId  Integer类型(ag_maid_info表主键)
	 * @return AgMaidInfo ag_maid_info表记录
	 * @throws HSKException
	 */	
	public AgMaidInfo findObject(Integer amiId) throws HSKException;
	
	/**
	 * 根据ag_maid_info表主键删除AgMaidInfo对象记录
     * @param  amiId  Integer类型(ag_maid_info表主键)
     * @return SysRetrunMessage 对象记录
	 * @throws HSKException
	 */
	public SysRetrunMessage deleteObject(Integer amiId) throws HSKException;
	
	
	
	/**
	 * 根据ag_maid_info表主键删除多条AgMaidInfo对象记录
     * @param  amiIds  Integer类型(ag_maid_info表主键)
     * @return SysRetrunMessage 对象记录
	 * @throws HSKException
	 */
	public SysRetrunMessage deleteAllObject(String amiIds) throws HSKException;
	
	 /**
	 * 新增或修改ag_maid_info表记录 ,如果ag_maid_info表主键AgMaidInfo.amiId为空就是添加，如果非空就是修改
     * @param  att_AgMaidInfo  AgMaidInfo类型(ag_maid_info表记录)
     * @return SysRetrunMessage 对象记录
	 * @throws HSKException
	 */
	public SysRetrunMessage   saveOrUpdateObject( AgMaidInfo att_AgMaidInfo) throws HSKException;
	
	/**
	 *根据AgMaidInfo对象作为对(ag_maid_info表进行查询，获取分页对象
     * @param  att_AgMaidInfo  AgMaidInfo类型(ag_maid_info表记录)
     * @return PagerModel  分页对象
	 * @throws HSKException 
	 */
	public PagerModel getPagerModelObject (AgMaidInfo att_AgMaidInfo) throws HSKException;
	
	
	/**
	 *	根据AgMaidView 对象作为条件查询出分页对象
	 * @param att_AgMaidView
	 * @return
	 * @throws HSKException
	 */
	public PagerModel getPagerModelMaidView (AgMaidView att_AgMaidView) throws HSKException;
	
	public PagerModel getPagerModelAgMaidOrView (AgMaidOrView att_AgMaidOrView) throws HSKException;
	
	/**
	 * 
	 * @param att_AgMaidView
	 * @return
	 * @throws HSKException
	 */
	public PagerModel getPagerModelAgDealCountView (AgDealCountView att_AgDealCountView) throws HSKException;
	
}