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
public interface ISysChannelInfoService extends IDSTService{


		/**
	 * 查找SysChannelInfo对象记录，用于弹出添加、修改窗口时候初始化数据
	 * @param  menuId  Integer类型(sys_channel_info表主键)
	  * @return SysRetrunMessage 对象记录
	 * @throws HSKException
	 */	
	public SysRetrunMessage findFormObject(Integer menuId) throws HSKException;

	
	/**
	 * 查找SysChannelInfo对象记录，用于弹出添加、修改窗口时候初始化数据
	 * @param  menuId  Integer类型(sys_channel_info表主键)
	 * @return SysChannelInfo sys_channel_info表记录
	 * @throws HSKException
	 */	
	public SysChannelInfo findObject(Integer menuId) throws HSKException;
	
	/**
	 * 根据sys_channel_info表主键删除SysChannelInfo对象记录
     * @param  menuId  Integer类型(sys_channel_info表主键)
     * @return SysRetrunMessage 对象记录
	 * @throws HSKException
	 */
	public SysRetrunMessage deleteObject(Integer menuId) throws HSKException;
	
	
	
	/**
	 * 根据sys_channel_info表主键删除多条SysChannelInfo对象记录
     * @param  menuIds  Integer类型(sys_channel_info表主键)
     * @return SysRetrunMessage 对象记录
	 * @throws HSKException
	 */
	public SysRetrunMessage deleteAllObject(String menuIds) throws HSKException;
	
	 /**
	 * 新增或修改sys_channel_info表记录 ,如果sys_channel_info表主键SysChannelInfo.menuId为空就是添加，如果非空就是修改
     * @param  att_SysChannelInfo  SysChannelInfo类型(sys_channel_info表记录)
     * @return SysRetrunMessage 对象记录
	 * @throws HSKException
	 */
	public SysRetrunMessage   saveOrUpdateObject( SysChannelInfo att_SysChannelInfo) throws HSKException;
	
	/**
	 *根据SysChannelInfo对象作为对(sys_channel_info表进行查询，获取分页对象
     * @param  att_SysChannelInfo  SysChannelInfo类型(sys_channel_info表记录)
     * @return PagerModel  分页对象
	 * @throws HSKException 
	 */
	public PagerModel getPagerModelObject (SysChannelInfo att_SysChannelInfo) throws HSKException;
	/**
	 * 获取所有菜单列表
	 * @return
	 * @throws HSKException
	 */
	public List<SysChannelInfo> getSysChannelInfoList() throws HSKException;
	
}