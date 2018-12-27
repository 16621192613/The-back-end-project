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
 * @version  版本信息:v1.0   创建时间: 2018-08-14 13:40:22
 */
public interface IAgNewsInfoService extends IDSTService{


		/**
	 * 查找AgNewsInfo对象记录，用于弹出添加、修改窗口时候初始化数据
	 * @param  aniId  Integer类型(ag_news_info表主键)
	  * @return SysRetrunMessage 对象记录
	 * @throws HSKException
	 */	
	public SysRetrunMessage findFormObject(Integer aniId) throws HSKException;

	
	/**
	 * 查找AgNewsInfo对象记录，用于弹出添加、修改窗口时候初始化数据
	 * @param  aniId  Integer类型(ag_news_info表主键)
	 * @return AgNewsInfo ag_news_info表记录
	 * @throws HSKException
	 */	
	public AgNewsInfo findObject(Integer aniId) throws HSKException;
	
	/**
	 * 根据ag_news_info表主键删除AgNewsInfo对象记录
     * @param  aniId  Integer类型(ag_news_info表主键)
     * @return SysRetrunMessage 对象记录
	 * @throws HSKException
	 */
	public SysRetrunMessage deleteObject(Integer aniId) throws HSKException;
	
	
	
	/**
	 * 根据ag_news_info表主键删除多条AgNewsInfo对象记录
     * @param  aniIds  Integer类型(ag_news_info表主键)
     * @return SysRetrunMessage 对象记录
	 * @throws HSKException
	 */
	public SysRetrunMessage deleteAllObject(String aniIds) throws HSKException;
	
	 /**
	 * 新增或修改ag_news_info表记录 ,如果ag_news_info表主键AgNewsInfo.aniId为空就是添加，如果非空就是修改
     * @param  att_AgNewsInfo  AgNewsInfo类型(ag_news_info表记录)
     * @return SysRetrunMessage 对象记录
	 * @throws HSKException
	 */
	public SysRetrunMessage   saveOrUpdateObject( AgNewsInfo att_AgNewsInfo) throws HSKException;
	
	/**
	 *根据AgNewsInfo对象作为对(ag_news_info表进行查询，获取分页对象
     * @param  att_AgNewsInfo  AgNewsInfo类型(ag_news_info表记录)
     * @return PagerModel  分页对象
	 * @throws HSKException 
	 */
	public PagerModel getPagerModelObject (AgNewsInfo att_AgNewsInfo) throws HSKException;
	/**
	 * 推送信息给所有用户
	 * @param title
	 * @param content
	 * @return
	 * @throws HSKException
	 */
	public SysRetrunMessage saveAllNews(String title,String content) throws HSKException; 
	
}