package com.hsk.xframe.api.service ;

import javax.servlet.http.HttpServletRequest;

import com.hsk.exception.HSKException;
import com.hsk.supper.service.ISupperService;
import com.hsk.xframe.api.persistence.SysUserInfo;

/**
 * 基础业务处理函数接口类
 * @author xun
 * @version v1.0 2015-02-23
 *
 */
public interface IDSTService  extends ISupperService { 
	/**
	 * 获取帐号对象
	 * @return
	 * @throws HSKException
	 */
	public SysUserInfo GetOneSessionAccount() throws HSKException ;
	
	/**
	 * 设置帐号对象
	 * @throws HSKException
	 */
	public void SetSessionAccount(SysUserInfo account) throws HSKException ;
}
