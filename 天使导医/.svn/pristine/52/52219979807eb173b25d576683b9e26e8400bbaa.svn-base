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
 * @version  版本信息:v1.0   创建时间: 2018-08-14 13:41:32
 */
public interface IAgIntegralInfoService extends IDSTService{


		/**
	 * 查找AgIntegralInfo对象记录，用于弹出添加、修改窗口时候初始化数据
	 * @param  aiiId  Integer类型(ag_integral_info表主键)
	  * @return SysRetrunMessage 对象记录
	 * @throws HSKException
	 */	
	public SysRetrunMessage findFormObject(Integer aiiId) throws HSKException;

	
	/**
	 * 查找AgIntegralInfo对象记录，用于弹出添加、修改窗口时候初始化数据
	 * @param  aiiId  Integer类型(ag_integral_info表主键)
	 * @return AgIntegralInfo ag_integral_info表记录
	 * @throws HSKException
	 */	
	public AgIntegralInfo findObject(Integer aiiId) throws HSKException;
	
	/**
	 * 根据ag_integral_info表主键删除AgIntegralInfo对象记录
     * @param  aiiId  Integer类型(ag_integral_info表主键)
     * @return SysRetrunMessage 对象记录
	 * @throws HSKException
	 */
	public SysRetrunMessage deleteObject(Integer aiiId) throws HSKException;
	
	
	
	/**
	 * 根据ag_integral_info表主键删除多条AgIntegralInfo对象记录
     * @param  aiiIds  Integer类型(ag_integral_info表主键)
     * @return SysRetrunMessage 对象记录
	 * @throws HSKException
	 */
	public SysRetrunMessage deleteAllObject(String aiiIds) throws HSKException;
	
	 /**
	 * 新增或修改ag_integral_info表记录 ,如果ag_integral_info表主键AgIntegralInfo.aiiId为空就是添加，如果非空就是修改
     * @param  att_AgIntegralInfo  AgIntegralInfo类型(ag_integral_info表记录)
     * @return SysRetrunMessage 对象记录
	 * @throws HSKException
	 */
	public SysRetrunMessage   saveOrUpdateObject( AgIntegralInfo att_AgIntegralInfo) throws HSKException;
	/**
	 * 签到 
	 * @param att_AgIntegralInfo
	 * @return
	 * @throws HSKException
	 */
	public SysRetrunMessage   savedoSign(Integer userId,String userType) throws HSKException;
	
	/**
	 *根据AgIntegralInfo对象作为对(ag_integral_info表进行查询，获取分页对象
     * @param  att_AgIntegralInfo  AgIntegralInfo类型(ag_integral_info表记录)
     * @return PagerModel  分页对象
	 * @throws HSKException 
	 */
	public PagerModel getPagerModelObject (AgIntegralInfo att_AgIntegralInfo) throws HSKException;
	/**
	 * 获取列表
	 * @param att_AgIntegralInfo
	 * @return
	 * @throws HSKException
	 */
	public List<AgIntegralInfo> getAgIntegralInfoList(AgIntegralInfo att_AgIntegralInfo) throws HSKException;
	
	/**
	 * 获取当天任务记录
	 * @param att_AgIntegralInfo
	 * @return
	 * @throws HSKException
	 */
	public SysRetrunMessage   getCountInfo( AgIntegralInfo att_AgIntegralInfo) throws HSKException;
	
	/**
	 * 获取业务员当天个人统计信息
	 * @return
	 * @throws HSKException
	 */
	public SysRetrunMessage getAgentBussCount(Integer agentId) throws HSKException;
	/**
	 * 患者获取每日积分任务信息
	 * @param patientId
	 * @return
	 * @throws HSKException
	 */
	public SysRetrunMessage getPatientCountInfo(Integer patientId)throws HSKException;
	/**
	 * 获取积分信息
	 * @param att_AgIntegralInfo
	 * @return
	 * @throws HSKException
	 */
	public SysRetrunMessage getCountIntegral(AgIntegralInfo att_AgIntegralInfo)
			throws HSKException;
	/**
	 * 获取业务员当天积分信息
	 * @param att_AgIntegralInfo
	 * @return
	 * @throws HSKException
	 */
	public SysRetrunMessage getCountDayIntegral()
			throws HSKException;
	/**
	 * 设置分享积分
	 * @param att_AgIntegralInfo
	 * @return
	 * @throws HSKException
	 */
	public SysRetrunMessage addShareIntegral(AgIntegralInfo att_AgIntegralInfo)throws HSKException;
	
}