package com.hsk.angeldoctor.api.daobbase;

import java.util.*;
import com.hsk.angeldoctor.api.persistence.*;
import com.hsk.exception.HSKDBException;
import com.hsk.supper.dto.comm.PagerModel;

/**
 * ag_feedback_info表数据库层面操作接口类 
 * @author  作者:admin
 * @version  版本信息:v1.0   创建时间: 2018-08-14 13:40:21
 */
public interface IAgFeedbackInfoDao{
	
	/**
	 * 根据ag_feedback_info表主键查找AgFeedbackInfo对象记录
	 * @param  AfbiId  Integer类型(ag_feedback_info表主键)
	 * @return AgFeedbackInfo ag_feedback_info表记录
	 * @throws HSKDBException
	 */	
	public AgFeedbackInfo findAgFeedbackInfoById(Integer AfbiId) throws HSKDBException;
	
	/**
	 * 根据ag_feedback_info表主键删除AgFeedbackInfo对象记录
     * @param  AfbiId  Integer类型(ag_feedback_info表主键)
	 * @throws HSKDBException
	 */
	public void deleteAgFeedbackInfoById(Integer AfbiId) throws HSKDBException;
	 
	/**
 	 * 根据ag_feedback_info表主键修改AgFeedbackInfo对象记录
	 * @param  AfbiId  Integer类型(ag_feedback_info表主键)
	 * @param  att_AgFeedbackInfo  AgFeedbackInfo类型(ag_feedback_info表记录)
	 * @return AgFeedbackInfo  修改后的AgFeedbackInfo对象记录
	 * @throws HSKDBException
	 */
	public  AgFeedbackInfo updateAgFeedbackInfoById(Integer AfbiId,AgFeedbackInfo att_AgFeedbackInfo) throws HSKDBException;
	
	/**
	 * 新增ag_feedback_info表 记录
     * @param  att_AgFeedbackInfo  AgFeedbackInfo类型(ag_feedback_info表记录)
     * @return ag_feedback_info表主键值
	 * @throws HSKDBException
	 */
	public Integer saveAgFeedbackInfo(AgFeedbackInfo att_AgFeedbackInfo) throws HSKDBException;
	
	 /**
	 * 新增或修改ag_feedback_info表记录 ,如果ag_feedback_info表主键AgFeedbackInfo.AfbiId为空就是添加，如果非空就是修改
     * @param  att_AgFeedbackInfo  AgFeedbackInfo类型(ag_feedback_info表记录)
     * @return AgFeedbackInfo  修改后的AgFeedbackInfo对象记录
	 * @throws HSKDBException
	 */
	public  AgFeedbackInfo saveOrUpdateAgFeedbackInfo( AgFeedbackInfo att_AgFeedbackInfo) throws HSKDBException;
	
	/**
	 *根据AgFeedbackInfo对象作为对(ag_feedback_info表进行查询，获取分页对象
     * @param  att_AgFeedbackInfo  AgFeedbackInfo类型(ag_feedback_info表记录)
     * @return PagerModel  分页对象
	 * @throws HSKDBException 
	 */
	public PagerModel getPagerModelByAgFeedbackInfo (AgFeedbackInfo att_AgFeedbackInfo) throws HSKDBException;
	
    /**
	 *根据AgFeedbackInfo对象作为对(ag_feedback_info表进行查询，获取分页对象
     * @param  att_AgFeedbackInfo  AgFeedbackInfo类型(ag_feedback_info表记录)
     * @return List<AgFeedbackInfo>  列表对象
	 * @throws HSKDBException 
	 */
	public List<AgFeedbackInfo> getListByAgFeedbackInfo ( AgFeedbackInfo att_AgFeedbackInfo) throws HSKDBException;

}