package com.hsk.angeldoctor.web.finance.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.hsk.exception.HSKException;
import com.hsk.xframe.api.controller.imp.DSTController;
import com.hsk.xframe.api.utils.freeMarker.WeixinUtils;
import com.hsk.xframe.api.utils.freeMarker.WeixinUtils.OAuthAccessToken;

@Controller
public class WechatReqController extends DSTController{
	
	private static String http_url="redirect:http://wechat.hisforce.cn/tempWechat/pages/";
	
	/**
	 * 精准预约
	 * @param request
	 * @param response
	 * @return
	 * @throws HSKException
	 */
	@RequestMapping(value = "/wechatreq/chooseHospital.htm")
	public String chooseHospital(HttpServletRequest request ,HttpServletResponse response) throws HSKException{
		String reUrl="";
		String userAgent = request.getHeader("User-Agent");
		if (userAgent.indexOf("MicroMessenger") > -1 || userAgent.toLowerCase().indexOf("micromessenger") > -1) {
			String openId="";
		    if(request.getSession().getAttribute("wx_openId")!=null)
		    	openId=request.getSession().getAttribute("wx_openId").toString();
		    if(openId==null || openId.equals("")){
		    	String code = request.getParameter("code");
				OAuthAccessToken oAuthAccessToken = WeixinUtils.getOAuthAccessToken(code);
				openId = oAuthAccessToken.getOpenid();
				request.getSession().setAttribute("wx_openId", openId);
		    }
		    if(openId!=null){
		    	reUrl=http_url+"chooseHospital/chooseHospital.html?openId="+openId;
			}
		}
		return reUrl;
	}
	/**
	 * 常见问题
	 * @param request
	 * @param response
	 * @return
	 * @throws HSKException
	 */
	@RequestMapping(value = "/wechatreq/questions.htm")
	public String questions(HttpServletRequest request ,HttpServletResponse response) throws HSKException{
		String reUrl="";
		String userAgent = request.getHeader("User-Agent");
		if (userAgent.indexOf("MicroMessenger") > -1 || userAgent.toLowerCase().indexOf("micromessenger") > -1) {
			String openId="";
		    if(request.getSession().getAttribute("wx_openId")!=null)
		    	openId=request.getSession().getAttribute("wx_openId").toString();
		    if(openId==null || openId.equals("")){
		    	String code = request.getParameter("code");
				OAuthAccessToken oAuthAccessToken = WeixinUtils.getOAuthAccessToken(code);
				openId = oAuthAccessToken.getOpenid();
				request.getSession().setAttribute("wx_openId", openId);
		    }
		    if(openId!=null){
		    	reUrl=http_url+"questions/questions.html?openId="+openId;
			}
		}
		return reUrl;
	}
	/**
	 * 健康养生
	 * @param request
	 * @param response
	 * @return
	 * @throws HSKException
	 */
	@RequestMapping(value = "/wechatreq/health.htm")
	public String health(HttpServletRequest request ,HttpServletResponse response) throws HSKException{
		String reUrl="";
		String userAgent = request.getHeader("User-Agent");
		if (userAgent.indexOf("MicroMessenger") > -1 || userAgent.toLowerCase().indexOf("micromessenger") > -1) {
			String openId="";
		    if(request.getSession().getAttribute("wx_openId")!=null)
		    	openId=request.getSession().getAttribute("wx_openId").toString();
		    if(openId==null || openId.equals("")){
		    	String code = request.getParameter("code");
				OAuthAccessToken oAuthAccessToken = WeixinUtils.getOAuthAccessToken(code);
				openId = oAuthAccessToken.getOpenid();
				request.getSession().setAttribute("wx_openId", openId);
		    }
		    if(openId!=null){
		    	reUrl=http_url+"activitiesList/activitiesList.html?type=0&openId="+openId;
			}
		}
		return reUrl;
	}
	/**
	 * 医疗知识
	 * @param request
	 * @param response
	 * @return
	 * @throws HSKException
	 */
	@RequestMapping(value = "/wechatreq/knowledge.htm")
	public String knowledge(HttpServletRequest request ,HttpServletResponse response) throws HSKException{
		String reUrl="";
		String userAgent = request.getHeader("User-Agent");
		if (userAgent.indexOf("MicroMessenger") > -1 || userAgent.toLowerCase().indexOf("micromessenger") > -1) {
			String openId="";
		    if(request.getSession().getAttribute("wx_openId")!=null)
		    	openId=request.getSession().getAttribute("wx_openId").toString();
		    if(openId==null || openId.equals("")){
		    	String code = request.getParameter("code");
				OAuthAccessToken oAuthAccessToken = WeixinUtils.getOAuthAccessToken(code);
				openId = oAuthAccessToken.getOpenid();
				request.getSession().setAttribute("wx_openId", openId);
		    }
		    if(openId!=null){
		    	reUrl=http_url+"activitiesList/activitiesList.html?type=1&openId="+openId;
			}
		}
		return reUrl;
	}
	/**
	 * 最新资讯
	 * @param request
	 * @param response
	 * @return
	 * @throws HSKException
	 */
	@RequestMapping(value = "/wechatreq/news.htm")
	public String news(HttpServletRequest request ,HttpServletResponse response) throws HSKException{
		String reUrl="";
		String userAgent = request.getHeader("User-Agent");
		if (userAgent.indexOf("MicroMessenger") > -1 || userAgent.toLowerCase().indexOf("micromessenger") > -1) {
			String openId="";
		    if(request.getSession().getAttribute("wx_openId")!=null)
		    	openId=request.getSession().getAttribute("wx_openId").toString();
		    if(openId==null || openId.equals("")){
		    	String code = request.getParameter("code");
				OAuthAccessToken oAuthAccessToken = WeixinUtils.getOAuthAccessToken(code);
				openId = oAuthAccessToken.getOpenid();
				request.getSession().setAttribute("wx_openId", openId);
		    }
		    if(openId!=null){
		    	reUrl=http_url+"activitiesList/activitiesList.html?type=2&openId="+openId;
			}
		}
		return reUrl;
	}
	
	/**
	 * 平台活动
	 * @param request
	 * @param response
	 * @return
	 * @throws HSKException
	 */
	@RequestMapping(value = "/wechatreq/activity.htm")
	public String activity(HttpServletRequest request ,HttpServletResponse response) throws HSKException{
		String reUrl="";
		String userAgent = request.getHeader("User-Agent");
		if (userAgent.indexOf("MicroMessenger") > -1 || userAgent.toLowerCase().indexOf("micromessenger") > -1) {
			String openId="";
		    if(request.getSession().getAttribute("wx_openId")!=null)
		    	openId=request.getSession().getAttribute("wx_openId").toString();
		    if(openId==null || openId.equals("")){
		    	String code = request.getParameter("code");
				OAuthAccessToken oAuthAccessToken = WeixinUtils.getOAuthAccessToken(code);
				openId = oAuthAccessToken.getOpenid();
				request.getSession().setAttribute("wx_openId", openId);
		    }
		    if(openId!=null){
		    	reUrl=http_url+"activitiesList/activitiesList.html?type=3&openId="+openId;
			}
		}
		return reUrl;
	}
	/**
	 * 天使导医
	 * @param request
	 * @param response
	 * @return
	 * @throws HSKException
	 */
	@RequestMapping(value = "/wechatreq/introduce.htm")
	public String introduce(HttpServletRequest request ,HttpServletResponse response) throws HSKException{
		String reUrl="";
		String userAgent = request.getHeader("User-Agent");
		if (userAgent.indexOf("MicroMessenger") > -1 || userAgent.toLowerCase().indexOf("micromessenger") > -1) {
			String openId="";
		    if(request.getSession().getAttribute("wx_openId")!=null)
		    	openId=request.getSession().getAttribute("wx_openId").toString();
		    if(openId==null || openId.equals("")){
		    	String code = request.getParameter("code");
				OAuthAccessToken oAuthAccessToken = WeixinUtils.getOAuthAccessToken(code);
				openId = oAuthAccessToken.getOpenid();
				request.getSession().setAttribute("wx_openId", openId);
		    }
		    if(openId!=null){
		    	reUrl=http_url+"activitiesList/activitiesList.html?type=4&openId="+openId;
			}
		}
		return reUrl;
	}
	/**
	 * 个人信息
	 * @param request
	 * @param response
	 * @return
	 * @throws HSKException
	 */
	@RequestMapping(value = "/wechatreq/personalInformation.htm")
	public String personalInformation(HttpServletRequest request ,HttpServletResponse response) throws HSKException{
		String reUrl="";
		String userAgent = request.getHeader("User-Agent");
		if (userAgent.indexOf("MicroMessenger") > -1 || userAgent.toLowerCase().indexOf("micromessenger") > -1) {
			String openId="";
		    if(request.getSession().getAttribute("wx_openId")!=null)
		    	openId=request.getSession().getAttribute("wx_openId").toString();
		    if(openId==null || openId.equals("")){
		    	String code = request.getParameter("code");
				OAuthAccessToken oAuthAccessToken = WeixinUtils.getOAuthAccessToken(code);
				openId = oAuthAccessToken.getOpenid();
				request.getSession().setAttribute("wx_openId", openId);
		    }
		    if(openId!=null){
		    	reUrl=http_url+"personalInformation/personalInformation.html?openId="+openId;
			}
		}
		return reUrl;
	}
	/**
	 * 积分有礼
	 * @param request
	 * @param response
	 * @return
	 * @throws HSKException
	 */
	@RequestMapping(value = "/wechatreq/dailyTask.htm")
	public String dailyTask(HttpServletRequest request ,HttpServletResponse response) throws HSKException{
		String reUrl="";
		String userAgent = request.getHeader("User-Agent");
		if (userAgent.indexOf("MicroMessenger") > -1 || userAgent.toLowerCase().indexOf("micromessenger") > -1) {
			String openId="";
		    if(request.getSession().getAttribute("wx_openId")!=null)
		    	openId=request.getSession().getAttribute("wx_openId").toString();
		    if(openId==null || openId.equals("")){
		    	String code = request.getParameter("code");
				OAuthAccessToken oAuthAccessToken = WeixinUtils.getOAuthAccessToken(code);
				openId = oAuthAccessToken.getOpenid();
				request.getSession().setAttribute("wx_openId", openId);
		    }
		    if(openId!=null){
		    	reUrl=http_url+"dailyTask/dailyTask.html?openId="+openId;
			}
		}
		return reUrl;
	}
	/**
	 * 补贴提现
	 * @param request
	 * @param response
	 * @return
	 * @throws HSKException
	 */
	@RequestMapping(value = "/wechatreq/cashAllowance.htm")
	public String cashAllowance(HttpServletRequest request ,HttpServletResponse response) throws HSKException{
		String reUrl="";
		String userAgent = request.getHeader("User-Agent");
		if (userAgent.indexOf("MicroMessenger") > -1 || userAgent.toLowerCase().indexOf("micromessenger") > -1) {
			String openId="";
		    if(request.getSession().getAttribute("wx_openId")!=null)
		    	openId=request.getSession().getAttribute("wx_openId").toString();
		    if(openId==null || openId.equals("")){
		    	String code = request.getParameter("code");
				OAuthAccessToken oAuthAccessToken = WeixinUtils.getOAuthAccessToken(code);
				openId = oAuthAccessToken.getOpenid();
				request.getSession().setAttribute("wx_openId", openId);
		    }
		    if(openId!=null){
		    	reUrl=http_url+"cashAllowance/cashAllowance.html?openId="+openId;
			}
		}
		return reUrl;
	}
	/**
	 * 就医点评
	 * @param request
	 * @param response
	 * @return
	 * @throws HSKException
	 */
	@RequestMapping(value = "/wechatreq/medicalRecords.htm")
	public String medicalRecords(HttpServletRequest request ,HttpServletResponse response) throws HSKException{
		String reUrl="";
		String userAgent = request.getHeader("User-Agent");
		if (userAgent.indexOf("MicroMessenger") > -1 || userAgent.toLowerCase().indexOf("micromessenger") > -1) {
			String openId="";
		    if(request.getSession().getAttribute("wx_openId")!=null)
		    	openId=request.getSession().getAttribute("wx_openId").toString();
		    if(openId==null || openId.equals("")){
		    	String code = request.getParameter("code");
				OAuthAccessToken oAuthAccessToken = WeixinUtils.getOAuthAccessToken(code);
				openId = oAuthAccessToken.getOpenid();
				request.getSession().setAttribute("wx_openId", openId);
		    }
		    if(openId!=null){
		    	reUrl=http_url+"medicalRecords/medicalRecords.html?openId="+openId;
			}
		}
		return reUrl;
	}
	/**
	 * 导医医生
	 * @param request
	 * @param response
	 * @return
	 * @throws HSKException
	 */
	@RequestMapping(value = "/wechatreq/chatRoom.htm")
	public String chatRoom(HttpServletRequest request ,HttpServletResponse response) throws HSKException{
		String reUrl="";
		String userAgent = request.getHeader("User-Agent");
		if (userAgent.indexOf("MicroMessenger") > -1 || userAgent.toLowerCase().indexOf("micromessenger") > -1) {
			String openId="";
		    if(request.getSession().getAttribute("wx_openId")!=null)
		    	openId=request.getSession().getAttribute("wx_openId").toString();
		    if(openId==null || openId.equals("")){
		    	String code = request.getParameter("code");
				OAuthAccessToken oAuthAccessToken = WeixinUtils.getOAuthAccessToken(code);
				openId = oAuthAccessToken.getOpenid();
				request.getSession().setAttribute("wx_openId", openId);
		    }
		    if(openId!=null){
		    	reUrl=http_url+"chatRoom/chatRoom.html?openId="+openId;
			}
		}
		return reUrl;
	}
	
	
}
