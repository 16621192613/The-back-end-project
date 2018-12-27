package com.hsk.xframe.api.filter;

import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

import org.springframework.web.context.ContextLoader;
import org.springframework.web.context.WebApplicationContext;

import com.hsk.angeldoctor.api.persistence.AgTokenInfo;
import com.hsk.angeldoctor.web.operate.service.IAgTokenInfoService;
import com.hsk.exception.HSKException;
import com.hsk.xframe.api.persistence.SysUserInfo;
import com.hsk.xframe.web.sysUser.service.ISysUserService;

public class TokenListener implements ServletContextListener{
	
	private IAgTokenInfoService agTokenInfoService;
	private ISysUserService sysUserService;

	@Override
	public void contextDestroyed(ServletContextEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void contextInitialized(ServletContextEvent arg0) {
		try {
			WebApplicationContext wac = ContextLoader.getCurrentWebApplicationContext();
			agTokenInfoService=wac.getBean("agTokenInfoService",IAgTokenInfoService.class);
			sysUserService = wac.getBean("sysUserService",ISysUserService.class);
			List<AgTokenInfo> tokenList = agTokenInfoService.getAgTokenInfoList();
			
			if(tokenList !=null && tokenList.size() >0){
				String suiIds="";
				for(AgTokenInfo tokenInfo : tokenList){
					suiIds+= tokenInfo.getSuiId()+",";
				}
				suiIds=suiIds.substring(0, suiIds.length()-1);
				List<SysUserInfo> userList =sysUserService.getSysUserInfoListInSuiIds(suiIds);
				if(userList!=null && userList.size() > 0){
					for(AgTokenInfo tokenInfo : tokenList){
						for(SysUserInfo userInfo : userList){
							if(tokenInfo.getSuiId().equals(userInfo.getSuiId())){
								Map<String,Object> tokenMap = new HashMap<String,Object>();
								tokenMap.put("createTime", tokenInfo.getCreateDate());//登录时间
								tokenMap.put("account", userInfo);//登录账号信息
								TokenUtil.TOKEN_MAP.put(tokenInfo.getToken(), tokenMap);
								break;
							}
							
						}
					}
					
				}
			}
		} catch (HSKException e) {
			e.printStackTrace();
		}
	}

}
