package com.hsk.angeldoctor.web.operate.service;

import java.util.*;
import com.hsk.angeldoctor.api.persistence.*;
import com.hsk.angeldoctor.api.daobbase.*;
import com.hsk.supper.dto.comm.PagerModel;
import com.hsk.supper.dto.comm.SysRetrunMessage;
import com.hsk.xframe.api.service.IDSTService;
import com.hsk.exception.HSKException;

/**
 * operate业务操作接口类 
 * @author  作者:admin
 * @version  版本信息:v1.0   创建时间: 2018-08-14 13:40:21
 */
public interface IAgFeedbackInfoService extends IDSTService{


		/**
	 * 查找AgFeedbackInfo对象记录，用于弹出添加、修改窗口时候初始化数据
	 * @param  afbiId  Integer类型(ag_feedback_info表主键)
	  * @return SysRetrunMessage 对象记录
	 * @throws HSKException
	 */	
	public SysRetrunMessage findFormObject(Integer afbiId) throws HSKException;

	
	/**
	 * 查找AgFeedbackInfo对象记录，用于弹出添加、修改窗口时候初始化数据
	 * @param  afbiId  Integer类型(ag_feedback_info表主键)
	 * @return AgFeedbackInfo ag_feedback_info表记录
	 * @throws HSKException
	 */	
	public AgFeedbackInfo findObject(Integer afbiId) throws HSKException;
	
	/**
	 * 根据ag_feedback_info表主键删除AgFeedbackInfo对象记录
     * @param  afbiId  Integer类型(ag_feedback_info表主键)
     * @return SysRetrunMessage 对象记录
	 * @throws HSKException
	 */
	public SysRetrunMessage deleteObject(Integer afbiId) throws HSKException;
	
	
	
	/**
	 * 根据ag_feedback_info表主键删除多条AgFeedbackInfo对象记录
     * @param  afbiIds  Integer类型(ag_feedback_info表主键)
     * @return SysRetrunMessage 对象记录
	 * @throws HSKException
	 */
	public SysRetrunMessage deleteAllObject(String afbiIds) throws HSKException;
	
	 /**
	 * 新增或修改ag_feedback_info表记录 ,如果ag_feedback_info表主键AgFeedbackInfo.afbiId为空就是添加，如果非空就是修改
     * @param  att_AgFeedbackInfo  AgFeedbackInfo类型(ag_feedback_info表记录)
     * @return SysRetrunMessage 对象记录
	 * @throws HSKException
	 */
	public SysRetrunMessage   saveOrUpdateObject( AgFeedbackInfo att_AgFeedbackInfo) throws HSKException;
	
	/**
	 *根据AgFeedbackInfo对象作为对(ag_feedback_info表进行查询，获取分页对象
     * @param  att_AgFeedbackInfo  AgFeedbackInfo类型(ag_feedback_info表记录)
     * @return PagerModel  分页对象
	 * @throws HSKException 
	 */
	public PagerModel getPagerModelObject (AgFeedbackInfo att_AgFeedbackInfo) throws HSKException;
	
}