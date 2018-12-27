package com.hsk.xframe.api.daobbase;

import java.util.List;
import java.util.Map;

import com.hsk.exception.HSKDBException;
import com.hsk.supper.dto.comm.PagerModel;
import com.hsk.xframe.api.persistence.SysFieldInfo;
import com.hsk.xframe.api.persistence.SysGxControlUser;
import com.hsk.xframe.api.persistence.SysUserInfo;
/**
 * 用户管理
 * @author 张曙
 *
 */
public interface ISysUserInfoDao {
	/**
	 * 系统登录
	 * @param userName
	 * @return
	 * @throws HSKDBException
	 */
	public SysUserInfo userLogin(String userName,String origin,String userType) throws HSKDBException;
	/**
	 * 根据用户账号查询用户信息
	 * @param ssiId
	 * @param userName
	 * @return
	 * @throws HSKDBException
	 */
	public SysUserInfo getSysUserInfoByName(SysUserInfo sysUserInfo)  throws HSKDBException;
	/**
	 * 删除用户角色信息
	 * @param suiId
	 * @param dels
	 * @throws HSKDBException
	 */
	public void delUserRoleByUsertAndRoles(Integer suiId,String dels) throws HSKDBException;
	/**
	 * 删除用户菜单信息
	 * @param suiId
	 * @param sroleId
	 * @param menuIds
	 * @param roleIds
	 * @throws HSKDBException
	 */
	public void delUserMenus(Integer suiId,Integer sroleId,String menuIds,String roleIds) throws HSKDBException; 
	/**
	 * 删除用户控件信息
	 * @param suiId
	 * @param sroleId
	 * @param sconIds
	 * @param roleIds
	 * @throws HSKDBException
	 */
	public void delUserControls(Integer suiId,Integer sroleId,String sconIds,String roleIds) throws HSKDBException; 
	/**
	 * 根据用户id和菜单ID查询角色控件关系
	 * @param suiId
	 * @param smenuId
	 * @return
	 * @throws HSKDBException
	 */
	public List<Map<String,Object>> getSysUserControlList(Integer suiId,Integer smenuId) throws HSKDBException;
	
	public List<SysGxControlUser> getSysGxControlUserListBySconIds(Integer suiId,String sconIds) throws HSKDBException;
	
	public List<Map<Object, Object>> getSysUserMenuListBySuiId(Integer suiId) throws HSKDBException;
	
	public List<Map<Object, Object>> getSysUserControlListBySuiId(Integer suiId) throws HSKDBException;
	
	public void saveUser(SysUserInfo user01)throws HSKDBException ;	
	/**
	 *  获取用户列表的分页查询
	 * @param user  用户对象
	 * @return   分页对象
	 * @throws HSKDBException
	 */
	public PagerModel getSysUserInfoPage(SysUserInfo user) throws HSKDBException;
	/**
	 * 获取用户对象
	 * @param sysUserInfo
	 * @return
	 * @throws HSKDBException
	 */
	public SysUserInfo getSysUserInfoByObj(SysUserInfo sysUserInfo)
			throws HSKDBException;
	/**
	 * 根据用户ID字符串查询用户列表
	 * @param suiIds
	 * @return
	 * @throws HSKDBException
	 */
	public List<SysUserInfo> getSysUserInfoListInSuiIds(String suiIds) throws HSKDBException;
	
}
