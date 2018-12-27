package com.hsk.angeldoctor.api.daobbase;

import java.util.*;
import com.hsk.angeldoctor.api.persistence.*;
import com.hsk.exception.HSKDBException;
import com.hsk.supper.dto.comm.PagerModel;

/**
 * sys_role_channel_gx表数据库层面操作接口类 
 * @author  作者:admin
 * @version  版本信息:v1.0   创建时间: 2018-08-14 13:40:22
 */
public interface ISysRoleChannelGxDao{
	
	/**
	 * 根据sys_role_channel_gx表主键查找SysRoleChannelGx对象记录
	 * @param  SrcgId  Integer类型(sys_role_channel_gx表主键)
	 * @return SysRoleChannelGx sys_role_channel_gx表记录
	 * @throws HSKDBException
	 */	
	public SysRoleChannelGx findSysRoleChannelGxById(Integer SrcgId) throws HSKDBException;
	
	/**
	 * 根据sys_role_channel_gx表主键删除SysRoleChannelGx对象记录
     * @param  SrcgId  Integer类型(sys_role_channel_gx表主键)
	 * @throws HSKDBException
	 */
	public void deleteSysRoleChannelGxById(Integer SrcgId) throws HSKDBException;
	 
	/**
 	 * 根据sys_role_channel_gx表主键修改SysRoleChannelGx对象记录
	 * @param  SrcgId  Integer类型(sys_role_channel_gx表主键)
	 * @param  att_SysRoleChannelGx  SysRoleChannelGx类型(sys_role_channel_gx表记录)
	 * @return SysRoleChannelGx  修改后的SysRoleChannelGx对象记录
	 * @throws HSKDBException
	 */
	public  SysRoleChannelGx updateSysRoleChannelGxById(Integer SrcgId,SysRoleChannelGx att_SysRoleChannelGx) throws HSKDBException;
	
	/**
	 * 新增sys_role_channel_gx表 记录
     * @param  att_SysRoleChannelGx  SysRoleChannelGx类型(sys_role_channel_gx表记录)
     * @return sys_role_channel_gx表主键值
	 * @throws HSKDBException
	 */
	public Integer saveSysRoleChannelGx(SysRoleChannelGx att_SysRoleChannelGx) throws HSKDBException;
	
	 /**
	 * 新增或修改sys_role_channel_gx表记录 ,如果sys_role_channel_gx表主键SysRoleChannelGx.SrcgId为空就是添加，如果非空就是修改
     * @param  att_SysRoleChannelGx  SysRoleChannelGx类型(sys_role_channel_gx表记录)
     * @return SysRoleChannelGx  修改后的SysRoleChannelGx对象记录
	 * @throws HSKDBException
	 */
	public  SysRoleChannelGx saveOrUpdateSysRoleChannelGx( SysRoleChannelGx att_SysRoleChannelGx) throws HSKDBException;
	
	/**
	 *根据SysRoleChannelGx对象作为对(sys_role_channel_gx表进行查询，获取分页对象
     * @param  att_SysRoleChannelGx  SysRoleChannelGx类型(sys_role_channel_gx表记录)
     * @return PagerModel  分页对象
	 * @throws HSKDBException 
	 */
	public PagerModel getPagerModelBySysRoleChannelGx (SysRoleChannelGx att_SysRoleChannelGx) throws HSKDBException;
	
    /**
	 *根据SysRoleChannelGx对象作为对(sys_role_channel_gx表进行查询，获取分页对象
     * @param  att_SysRoleChannelGx  SysRoleChannelGx类型(sys_role_channel_gx表记录)
     * @return List<SysRoleChannelGx>  列表对象
	 * @throws HSKDBException 
	 */
	public List<SysRoleChannelGx> getListBySysRoleChannelGx ( SysRoleChannelGx att_SysRoleChannelGx) throws HSKDBException;
	/**
	 * 根据gxIds删除关系列表
	 * @param Ids
	 * @throws HSKDBException
	 */
	public void delBySysRoleChannelGxByIds(String Ids)  throws HSKDBException;

}