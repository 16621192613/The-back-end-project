package com.hsk.angeldoctor.api.daobbase;

import java.util.*;
import com.hsk.angeldoctor.api.persistence.*;
import com.hsk.exception.HSKDBException;
import com.hsk.supper.dto.comm.PagerModel;

/**
 * ag_wechat_info表数据库层面操作接口类 
 * @author  作者:admin
 * @version  版本信息:v1.0   创建时间: 2018-08-14 13:35:37
 */
public interface IAgWechatInfoDao{
	
	/**
	 * 根据ag_wechat_info表主键查找AgWechatInfo对象记录
	 * @param  WechatUserId  Integer类型(ag_wechat_info表主键)
	 * @return AgWechatInfo ag_wechat_info表记录
	 * @throws HSKDBException
	 */	
	public AgWechatInfo findAgWechatInfoById(Integer WechatUserId) throws HSKDBException;
	
	/**
	 * 根据ag_wechat_info表主键删除AgWechatInfo对象记录
     * @param  WechatUserId  Integer类型(ag_wechat_info表主键)
	 * @throws HSKDBException
	 */
	public void deleteAgWechatInfoById(Integer WechatUserId) throws HSKDBException;
	 
	/**
 	 * 根据ag_wechat_info表主键修改AgWechatInfo对象记录
	 * @param  WechatUserId  Integer类型(ag_wechat_info表主键)
	 * @param  att_AgWechatInfo  AgWechatInfo类型(ag_wechat_info表记录)
	 * @return AgWechatInfo  修改后的AgWechatInfo对象记录
	 * @throws HSKDBException
	 */
	public  AgWechatInfo updateAgWechatInfoById(Integer WechatUserId,AgWechatInfo att_AgWechatInfo) throws HSKDBException;
	
	/**
	 * 新增ag_wechat_info表 记录
     * @param  att_AgWechatInfo  AgWechatInfo类型(ag_wechat_info表记录)
     * @return ag_wechat_info表主键值
	 * @throws HSKDBException
	 */
	public Integer saveAgWechatInfo(AgWechatInfo att_AgWechatInfo) throws HSKDBException;
	
	 /**
	 * 新增或修改ag_wechat_info表记录 ,如果ag_wechat_info表主键AgWechatInfo.WechatUserId为空就是添加，如果非空就是修改
     * @param  att_AgWechatInfo  AgWechatInfo类型(ag_wechat_info表记录)
     * @return AgWechatInfo  修改后的AgWechatInfo对象记录
	 * @throws HSKDBException
	 */
	public  AgWechatInfo saveOrUpdateAgWechatInfo( AgWechatInfo att_AgWechatInfo) throws HSKDBException;
	
	/**
	 *根据AgWechatInfo对象作为对(ag_wechat_info表进行查询，获取分页对象
     * @param  att_AgWechatInfo  AgWechatInfo类型(ag_wechat_info表记录)
     * @return PagerModel  分页对象
	 * @throws HSKDBException 
	 */
	public PagerModel getPagerModelByAgWechatInfo (AgWechatInfo att_AgWechatInfo) throws HSKDBException;
	
    /**
	 *根据AgWechatInfo对象作为对(ag_wechat_info表进行查询，获取分页对象
     * @param  att_AgWechatInfo  AgWechatInfo类型(ag_wechat_info表记录)
     * @return List<AgWechatInfo>  列表对象
	 * @throws HSKDBException 
	 */
	public List<AgWechatInfo> getListByAgWechatInfo ( AgWechatInfo att_AgWechatInfo) throws HSKDBException;
}