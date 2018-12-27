package com.hsk.xframe.web.sysLogin.service;

import com.hsk.exception.HSKException;
import com.hsk.supper.dto.comm.SysRetrunMessage;
import com.hsk.xframe.api.service.IDSTService;

/**
 * 用户登录接口
 * @author zhangshu
 *
 */
public interface ISysLoginService extends IDSTService {
	/**
	 * 基础平台用户登录
	 * @param userName
	 * @param password
	 * @return
	 * @throws HSKException
	 */
	public SysRetrunMessage doSysLogin(String userName,String password,String origin,String userType) throws HSKException;
	/**
	 * 业务员登录
	 * @param mobile
	 * @param code
	 * @return
	 * @throws HSKException
	 */
	public SysRetrunMessage doAngetlogin(String mobile,String code) throws HSKException;
	
	/**
	 * 用户登出
	 * @return
	 * @throws HSKException
	 */
	public SysRetrunMessage ReceptionCancellation() throws HSKException;
	
}
