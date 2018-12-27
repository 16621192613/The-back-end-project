package com.hsk.xframe.web.sysLogin.controller.impl;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.hsk.angeldoctor.api.persistence.AgInsideInfo;
import com.hsk.angeldoctor.web.operate.service.IAgInsideInfoService;
import com.hsk.angeldoctor.web.operate.service.ISysRoleChannelGxService;
import com.hsk.supper.dto.comm.SysRetrunMessage;
import com.hsk.xframe.api.controller.imp.DSTController;
import com.hsk.xframe.web.sysLogin.controller.ISysLoginController;
import com.hsk.xframe.web.sysLogin.service.ISysLoginService;

@Controller
public class SysLoginController extends DSTController implements ISysLoginController {
	
	@Autowired
	private ISysLoginService sysLoginService;
	@Autowired
	private ISysRoleChannelGxService sysRoleChannelGxService;
	 
	/**
	 * 运维人员
	 * @param request
	 * @param response
	 * @param userName
	 * @param password
	 * @throws Exception
	 */
	@RequestMapping(value = "/system/login.htm")
	public void toLogin(HttpServletRequest request,HttpServletResponse response,String userName,String password) throws Exception{
		sysLoginService.setRequest(request);
		SysRetrunMessage srm=sysLoginService.doSysLogin(userName, password,null,"1");
		returnData(response,srm);
	}
	/**
	 * 代理商登录
	 * @param request
	 * @param response
	 * @param userName
	 * @param password
	 * @throws Exception
	 */
	@RequestMapping(value = "/system/agentlogin.htm")
	public void agentlogin(HttpServletRequest request,HttpServletResponse response,String userName,String password) throws Exception{
		sysLoginService.setRequest(request);
		SysRetrunMessage srm=sysLoginService.doSysLogin(userName, password,null,"4");
		returnData(response,srm);
	}
	/**
	 * 业务员登录
	 * @param request
	 * @param response
	 * @param mobile
	 * @param code
	 * @throws Exception
	 */
	@RequestMapping(value = "/system/businesslogin.htm")
	public void businesslogin(HttpServletRequest request,HttpServletResponse response,String mobile,String code) throws Exception{
		sysLoginService.setRequest(request);
		SysRetrunMessage srm=sysLoginService.doAngetlogin(mobile, code);
		returnData(response,srm);
	}
	/**
	 * 医院管理员、医生登录
	 * @param request
	 * @param response
	 * @param userName
	 * @param password
	 * @param origin
	 * @throws Exception
	 */
	@RequestMapping(value = "/system/hospitalLogin.htm")
	public void hospitalLogin(HttpServletRequest request,HttpServletResponse response,String userName,String password,String origin) throws Exception{
		sysLoginService.setRequest(request);
		if(origin==null || origin.trim().equals("")){
			origin= request.getHeader("Origin");
			origin = origin.replace("http://", "");
		}
			
		SysRetrunMessage srm=sysLoginService.doSysLogin(userName, password,origin,null);
		returnData(response,srm);
	}
	/**
	 * 系统登出
	 * @param request
	 * @param response
	 * @throws Exception
	 */
	@RequestMapping(value = "/system/loginOut.htm")
	public void loginOut(HttpServletRequest request,HttpServletResponse response) throws Exception{
		sysLoginService.setRequest(request);
		SysRetrunMessage srm=sysLoginService.ReceptionCancellation();
		returnData(response,srm);
	}
	/**
	 * 获取后台管理用户菜单
	 * @param request
	 * @param response
	 * @throws Exception
	 */
	@RequestMapping(value = "/system/usrMenuList.htm")
	public void usrMenuList(HttpServletRequest request,HttpServletResponse response) throws Exception{
		sysRoleChannelGxService.setRequest(request);
		SysRetrunMessage srm=new SysRetrunMessage(1l);
		srm.setObj(sysRoleChannelGxService.getLoginMenuList());
		returnData(response,srm);
	}
	
}
