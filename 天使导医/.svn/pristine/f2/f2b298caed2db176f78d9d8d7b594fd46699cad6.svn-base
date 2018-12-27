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
public interface ISysRoleChannelGxService extends IDSTService{


		/**
	 * 查找SysRoleChannelGx对象记录，用于弹出添加、修改窗口时候初始化数据
	 * @param  srcgId  Integer类型(sys_role_channel_gx表主键)
	  * @return SysRetrunMessage 对象记录
	 * @throws HSKException
	 */	
	public SysRetrunMessage findFormObject(Integer srcgId) throws HSKException;

	
	/**
	 * 查找SysRoleChannelGx对象记录，用于弹出添加、修改窗口时候初始化数据
	 * @param  srcgId  Integer类型(sys_role_channel_gx表主键)
	 * @return SysRoleChannelGx sys_role_channel_gx表记录
	 * @throws HSKException
	 */	
	public SysRoleChannelGx findObject(Integer srcgId) throws HSKException;
	
	/**
	 * 根据sys_role_channel_gx表主键删除SysRoleChannelGx对象记录
     * @param  srcgId  Integer类型(sys_role_channel_gx表主键)
     * @return SysRetrunMessage 对象记录
	 * @throws HSKException
	 */
	public SysRetrunMessage deleteObject(Integer srcgId) throws HSKException;
	
	
	
	/**
	 * 根据sys_role_channel_gx表主键删除多条SysRoleChannelGx对象记录
     * @param  srcgIds  Integer类型(sys_role_channel_gx表主键)
     * @return SysRetrunMessage 对象记录
	 * @throws HSKException
	 */
	public SysRetrunMessage deleteAllObject(String srcgIds) throws HSKException;
	
	 /**
	 * 新增或修改sys_role_channel_gx表记录 ,如果sys_role_channel_gx表主键SysRoleChannelGx.srcgId为空就是添加，如果非空就是修改
     * @param  att_SysRoleChannelGx  SysRoleChannelGx类型(sys_role_channel_gx表记录)
     * @return SysRetrunMessage 对象记录
	 * @throws HSKException
	 */
	public SysRetrunMessage   saveOrUpdateObject( SysRoleChannelGx att_SysRoleChannelGx) throws HSKException;
	
	/**
	 *根据SysRoleChannelGx对象作为对(sys_role_channel_gx表进行查询，获取分页对象
     * @param  att_SysRoleChannelGx  SysRoleChannelGx类型(sys_role_channel_gx表记录)
     * @return PagerModel  分页对象
	 * @throws HSKException 
	 */
	public PagerModel getPagerModelObject (SysRoleChannelGx att_SysRoleChannelGx) throws HSKException;
	/**
	 * 获取当前登录用户菜单信息
	 * @return
	 * @throws HSKException
	 */
	public List<Map<String,Object>> getLoginMenuList () throws HSKException;
	/**
	 * 保存频道角色
	 * @param sroId
	 * @param menuIds
	 * @return
	 * @throws HSKException
	 */
	public SysRetrunMessage saveSysRoleChannelGx(Integer sroId,String menuIds) throws HSKException;
	/**
	 * 删除频道角色
	 * @param gxIds
	 * @return
	 * @throws HSKException
	 */
	public SysRetrunMessage deleteSysRoleChannelGx(String gxIds) throws HSKException;
	/**
	 * 根据角色ID获取频道列表
	 * @param sroId
	 * @return
	 * @throws HSKException
	 */
	public List<Map<String,Object>> getSysRoleChannelGxListByRoleId(Integer sroId) throws HSKException;
}