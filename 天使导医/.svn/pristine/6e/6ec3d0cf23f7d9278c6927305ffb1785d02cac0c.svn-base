package com.hsk.angeldoctor.api.daobbase;

import java.util.*;
import com.hsk.angeldoctor.api.persistence.*;
import com.hsk.exception.HSKDBException;
import com.hsk.supper.dto.comm.PagerModel;

/**
 * sys_channel_info表数据库层面操作接口类 
 * @author  作者:admin
 * @version  版本信息:v1.0   创建时间: 2018-08-14 13:40:22
 */
public interface ISysChannelInfoDao{
	
	/**
	 * 根据sys_channel_info表主键查找SysChannelInfo对象记录
	 * @param  MenuId  Integer类型(sys_channel_info表主键)
	 * @return SysChannelInfo sys_channel_info表记录
	 * @throws HSKDBException
	 */	
	public SysChannelInfo findSysChannelInfoById(Integer MenuId) throws HSKDBException;
	
	/**
	 * 根据sys_channel_info表主键删除SysChannelInfo对象记录
     * @param  MenuId  Integer类型(sys_channel_info表主键)
	 * @throws HSKDBException
	 */
	public void deleteSysChannelInfoById(Integer MenuId) throws HSKDBException;
	 
	/**
 	 * 根据sys_channel_info表主键修改SysChannelInfo对象记录
	 * @param  MenuId  Integer类型(sys_channel_info表主键)
	 * @param  att_SysChannelInfo  SysChannelInfo类型(sys_channel_info表记录)
	 * @return SysChannelInfo  修改后的SysChannelInfo对象记录
	 * @throws HSKDBException
	 */
	public  SysChannelInfo updateSysChannelInfoById(Integer MenuId,SysChannelInfo att_SysChannelInfo) throws HSKDBException;
	
	/**
	 * 新增sys_channel_info表 记录
     * @param  att_SysChannelInfo  SysChannelInfo类型(sys_channel_info表记录)
     * @return sys_channel_info表主键值
	 * @throws HSKDBException
	 */
	public Integer saveSysChannelInfo(SysChannelInfo att_SysChannelInfo) throws HSKDBException;
	
	 /**
	 * 新增或修改sys_channel_info表记录 ,如果sys_channel_info表主键SysChannelInfo.MenuId为空就是添加，如果非空就是修改
     * @param  att_SysChannelInfo  SysChannelInfo类型(sys_channel_info表记录)
     * @return SysChannelInfo  修改后的SysChannelInfo对象记录
	 * @throws HSKDBException
	 */
	public  SysChannelInfo saveOrUpdateSysChannelInfo( SysChannelInfo att_SysChannelInfo) throws HSKDBException;
	
	/**
	 *根据SysChannelInfo对象作为对(sys_channel_info表进行查询，获取分页对象
     * @param  att_SysChannelInfo  SysChannelInfo类型(sys_channel_info表记录)
     * @return PagerModel  分页对象
	 * @throws HSKDBException 
	 */
	public PagerModel getPagerModelBySysChannelInfo (SysChannelInfo att_SysChannelInfo) throws HSKDBException;
	
    /**
	 *根据SysChannelInfo对象作为对(sys_channel_info表进行查询，获取分页对象
     * @param  att_SysChannelInfo  SysChannelInfo类型(sys_channel_info表记录)
     * @return List<SysChannelInfo>  列表对象
	 * @throws HSKDBException 
	 */
	public List<SysChannelInfo> getListBySysChannelInfo ( SysChannelInfo att_SysChannelInfo) throws HSKDBException;

}