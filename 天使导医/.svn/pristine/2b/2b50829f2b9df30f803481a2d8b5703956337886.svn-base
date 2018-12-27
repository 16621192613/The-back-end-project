package com.hsk.angeldoctor.api.daobbase;

import java.util.*;
import com.hsk.angeldoctor.api.persistence.*;
import com.hsk.exception.HSKDBException;
import com.hsk.supper.dto.comm.PagerModel;

/**
 * ag_news_info表数据库层面操作接口类 
 * @author  作者:admin
 * @version  版本信息:v1.0   创建时间: 2018-08-14 13:40:22
 */
public interface IAgNewsInfoDao{
	
	/**
	 * 根据ag_news_info表主键查找AgNewsInfo对象记录
	 * @param  AniId  Integer类型(ag_news_info表主键)
	 * @return AgNewsInfo ag_news_info表记录
	 * @throws HSKDBException
	 */	
	public AgNewsInfo findAgNewsInfoById(Integer AniId) throws HSKDBException;
	
	/**
	 * 根据ag_news_info表主键删除AgNewsInfo对象记录
     * @param  AniId  Integer类型(ag_news_info表主键)
	 * @throws HSKDBException
	 */
	public void deleteAgNewsInfoById(Integer AniId) throws HSKDBException;
	 
	/**
 	 * 根据ag_news_info表主键修改AgNewsInfo对象记录
	 * @param  AniId  Integer类型(ag_news_info表主键)
	 * @param  att_AgNewsInfo  AgNewsInfo类型(ag_news_info表记录)
	 * @return AgNewsInfo  修改后的AgNewsInfo对象记录
	 * @throws HSKDBException
	 */
	public  AgNewsInfo updateAgNewsInfoById(Integer AniId,AgNewsInfo att_AgNewsInfo) throws HSKDBException;
	
	/**
	 * 新增ag_news_info表 记录
     * @param  att_AgNewsInfo  AgNewsInfo类型(ag_news_info表记录)
     * @return ag_news_info表主键值
	 * @throws HSKDBException
	 */
	public Integer saveAgNewsInfo(AgNewsInfo att_AgNewsInfo) throws HSKDBException;
	
	 /**
	 * 新增或修改ag_news_info表记录 ,如果ag_news_info表主键AgNewsInfo.AniId为空就是添加，如果非空就是修改
     * @param  att_AgNewsInfo  AgNewsInfo类型(ag_news_info表记录)
     * @return AgNewsInfo  修改后的AgNewsInfo对象记录
	 * @throws HSKDBException
	 */
	public  AgNewsInfo saveOrUpdateAgNewsInfo( AgNewsInfo att_AgNewsInfo) throws HSKDBException;
	
	/**
	 *根据AgNewsInfo对象作为对(ag_news_info表进行查询，获取分页对象
     * @param  att_AgNewsInfo  AgNewsInfo类型(ag_news_info表记录)
     * @return PagerModel  分页对象
	 * @throws HSKDBException 
	 */
	public PagerModel getPagerModelByAgNewsInfo (AgNewsInfo att_AgNewsInfo) throws HSKDBException;
	
    /**
	 *根据AgNewsInfo对象作为对(ag_news_info表进行查询，获取分页对象
     * @param  att_AgNewsInfo  AgNewsInfo类型(ag_news_info表记录)
     * @return List<AgNewsInfo>  列表对象
	 * @throws HSKDBException 
	 */
	public List<AgNewsInfo> getListByAgNewsInfo ( AgNewsInfo att_AgNewsInfo) throws HSKDBException;

}