package com.hsk.angeldoctor.web.order.service;

import java.util.*;
import com.hsk.angeldoctor.api.persistence.*;
import com.hsk.angeldoctor.api.daobbase.*;
import com.hsk.supper.dto.comm.PagerModel;
import com.hsk.supper.dto.comm.SysRetrunMessage;
import com.hsk.xframe.api.service.IDSTService;
import com.hsk.exception.HSKException;

/**
 * order业务操作接口类 
 * @author  作者:admin
 * @version  版本信息:v1.0   创建时间: 2018-08-14 13:35:37
 */
public interface IAgWechatInfoService extends IDSTService{


		/**
	 * 查找AgWechatInfo对象记录，用于弹出添加、修改窗口时候初始化数据
	 * @param  wechatUserId  Integer类型(ag_wechat_info表主键)
	  * @return SysRetrunMessage 对象记录
	 * @throws HSKException
	 */	
	public SysRetrunMessage findFormObject(Integer wechatUserId) throws HSKException;

	
	/**
	 * 查找AgWechatInfo对象记录，用于弹出添加、修改窗口时候初始化数据
	 * @param  wechatUserId  Integer类型(ag_wechat_info表主键)
	 * @return AgWechatInfo ag_wechat_info表记录
	 * @throws HSKException
	 */	
	public AgWechatInfo findObject(Integer wechatUserId) throws HSKException;
	
	/**
	 * 根据ag_wechat_info表主键删除AgWechatInfo对象记录
     * @param  wechatUserId  Integer类型(ag_wechat_info表主键)
     * @return SysRetrunMessage 对象记录
	 * @throws HSKException
	 */
	public SysRetrunMessage deleteObject(Integer wechatUserId) throws HSKException;
	
	
	
	/**
	 * 根据ag_wechat_info表主键删除多条AgWechatInfo对象记录
     * @param  wechatUserIds  Integer类型(ag_wechat_info表主键)
     * @return SysRetrunMessage 对象记录
	 * @throws HSKException
	 */
	public SysRetrunMessage deleteAllObject(String wechatUserIds) throws HSKException;
	
	 /**
	 * 新增或修改ag_wechat_info表记录 ,如果ag_wechat_info表主键AgWechatInfo.wechatUserId为空就是添加，如果非空就是修改
     * @param  att_AgWechatInfo  AgWechatInfo类型(ag_wechat_info表记录)
     * @return SysRetrunMessage 对象记录
	 * @throws HSKException
	 */
	public SysRetrunMessage   saveOrUpdateObject( AgWechatInfo att_AgWechatInfo) throws HSKException;
	
	/**
	 *根据AgWechatInfo对象作为对(ag_wechat_info表进行查询，获取分页对象
     * @param  att_AgWechatInfo  AgWechatInfo类型(ag_wechat_info表记录)
     * @return PagerModel  分页对象
	 * @throws HSKException 
	 */
	public PagerModel getPagerModelObject (AgWechatInfo att_AgWechatInfo) throws HSKException;
	/**
	 * 根据openID获取微信信息
	 * @param openId
	 * @return
	 * @throws HSKException
	 */
	public AgWechatInfo getAgWechatInfoByOpenId(String openId)  throws HSKException;
}