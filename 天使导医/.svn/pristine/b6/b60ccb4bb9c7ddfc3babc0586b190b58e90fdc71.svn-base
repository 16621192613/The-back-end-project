package com.hsk.angeldoctor.web.agent.controller;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.hsk.angeldoctor.api.persistence.AgAgentInfo;
import com.hsk.angeldoctor.api.persistence.AgBusinessUser;
import com.hsk.angeldoctor.api.persistence.AgMaidView;
import com.hsk.angeldoctor.api.persistence.AgPatientInfo;
import com.hsk.angeldoctor.api.persistence.AgWithdrawInfo;
import com.hsk.angeldoctor.web.agent.service.IAgAgentInfoService;
import com.hsk.angeldoctor.web.agent.service.IAgBusinessUserService;
import com.hsk.angeldoctor.web.agent.service.IAgMaidInfoService;
import com.hsk.angeldoctor.web.agent.service.IAgWithdrawInfoService;
import com.hsk.supper.dto.comm.SysRetrunMessage;
import com.hsk.xframe.api.controller.imp.DSTController;
import com.hsk.xframe.api.dto.model.TreeNode;
import com.hsk.xframe.api.persistence.SysUserInfo;
import com.hsk.xframe.api.utils.freeMarker.CommonUtil;

/**
 * 代理商业务接口类
 * 
 * @author xun
 * @version v.10
 * 
 */
@Controller
public class AgentController extends DSTController {
	/* 
	 * 保存业务员信息 
	 */
	/**
	 * agent业务操作实现类
	 */
	@Autowired
	private IAgAgentInfoService agAgentInfoService;
	/**
	 * agent业务操作接口类 
	 */
	@Autowired
	private	IAgBusinessUserService agBusinessUserService;
	
	/**
	 * 提现申请业务实现类 
	 */
	@Autowired
	private IAgWithdrawInfoService agWithdrawInfoService;
	
	/**
	 * 分佣业务
	 */
	@Autowired
	private	IAgMaidInfoService agMaidInfoService;

	/**
	 * 代理商列表查询
	 * 
	 * @param request
	 * @param response
	 * @param att_AgAgentInfo
	 *            <b>代理商对象 </b><br/>
	 *            mobile String 手机号<br/>
	 *            name String 代理商名称<br/>
	 *            reservedProvId String 负责区域-省<br/>
	 *            reservedCityId String 负责区域-市<br/>
	 *            pageSize int 每页显示条数<br/>
	 *            pageIndex int 第几页<br/>
	 * 
	 * @throws Exception
	 */
	@RequestMapping(value = "/agent/getAgentPager.htm")
	public void AgentList(HttpServletRequest request,
			HttpServletResponse response,
			@ModelAttribute AgAgentInfo att_AgAgentInfo) throws Exception {
		SysRetrunMessage srm = new SysRetrunMessage(1l);
		agAgentInfoService.setRequest(request);
		att_AgAgentInfo.setTab_like("name,mobile");
		srm.setObj(agAgentInfoService.getPagerModelObject(att_AgAgentInfo));
		returnData(response, srm);
	}

	/**
	 * 获取代理商信息
	 * 
	 * @param request
	 * @param response
	 * @param id
	 *            代理商ID
	 * @throws Exception
	 */
	@RequestMapping(value = "/agent/agentInfo.htm")
	public void AgentInfo(HttpServletRequest request,
			HttpServletResponse response, Integer id) throws Exception {
		agAgentInfoService.setRequest(request); 
		SysRetrunMessage srm=agAgentInfoService.findFormObject(id);
		returnData(response,srm);
	}
	
	 
	/**
	 * 新增或修改代理商信息接口：当代理商ID为空时新增，不为空时修改。当为新增时需要填写登录账号和密码。
	 * @param request
	 * @param response
	 * @throws Exception
	 */
	@RequestMapping(value = "/agent/saveAgent.htm")
	public void saveAgent(HttpServletRequest request ,HttpServletResponse response,@ModelAttribute  AgAgentInfo att_AgAgentInfo ) throws Exception{
		agAgentInfoService.setRequest(request); 
		SysUserInfo userinfo=this.getLoginSysUserInfo(request);
		if (att_AgAgentInfo.getAaiId() != null) {			
			att_AgAgentInfo.setEditDate(new Date());			
			att_AgAgentInfo.setEditRen(userinfo.getUserName());
		}else {
			att_AgAgentInfo.setCreateDate(new Date());			
			att_AgAgentInfo.setCreateRen(userinfo.getUserName());
		}
		SysRetrunMessage srm=agAgentInfoService.saveOrUpdateObject(att_AgAgentInfo);
		returnData(response,srm);
	}
	
	/**
	 * 根据代理商ID解除代理商
	 * @param request
	 * @param response
	 * @param id  代理商ID
	 * @throws Exception
	 */
	@RequestMapping(value = "/agent/delAgent.htm")
	public void delAgent(HttpServletRequest request ,HttpServletResponse response,Integer id) throws Exception{
		agAgentInfoService.setRequest(request); 
		SysRetrunMessage srm=agAgentInfoService.deleteObject(id);
		returnData(response,srm);
	}
	/**
	 * 业务员列表查询
	 * @param request
	 * @param response
	 * @param att_AgBusinessUser
	 * @throws Exception
	 */
	@RequestMapping(value = "/agent/getbussiPager.htm")
	public void BussiList(HttpServletRequest request,
			HttpServletResponse response,
			@ModelAttribute AgBusinessUser att_AgBusinessUser) throws Exception {
		SysRetrunMessage srm = new SysRetrunMessage(1l);
		agBusinessUserService.setRequest(request);
		att_AgBusinessUser.setTab_like("name,topPrimaryAgentName");
		srm.setObj(agBusinessUserService.getPagerModelObject(att_AgBusinessUser));
		returnData(response, srm);
	}
	/**
	 * 代理商员工管理
	 * @param request
	 * @param response
	 * @param createDateStart
	 * @param createDateEnd
	 * @param mobile
	 * @param name
	 * @param parentAgentName
	 * @param topReservedAgentName
	 * @param topReservedAgentRelateToName
	 * @throws Exception
	 */
	@RequestMapping(value = "/agent/getReservedAgentsBelongings.htm")
	public void getReservedAgentsBelongings(HttpServletRequest request,HttpServletResponse response,
			String createDateStart,String createDateEnd,String mobile,String name,String parentAgentName,
			String topReservedAgentName,String topReservedAgentRelateToName) throws Exception {
		SysRetrunMessage srm = new SysRetrunMessage(1l);
		agBusinessUserService.setRequest(request);
		srm.setObj(agBusinessUserService.getReservedAgentPagerModel(createDateStart, createDateEnd, mobile, name, parentAgentName, topReservedAgentName, topReservedAgentRelateToName));
		returnData(response, srm);
	}
	/**
	 * 获取初代业务员列表
	 * @param request
	 * @param response
	 * @param createDateStart
	 * @param createDateEnd
	 * @param mobile
	 * @param name
	 * @throws Exception
	 */
	@RequestMapping(value = "/agent/getPrimaryAgents.htm")
	public void getPrimaryAgents(HttpServletRequest request,HttpServletResponse response,
			String createDateStart,String createDateEnd,String mobile,String name) throws Exception {
		SysRetrunMessage srm = new SysRetrunMessage(1l);
		agBusinessUserService.setRequest(request);
		srm.setObj(agBusinessUserService.getPrimaryPagerModel(createDateStart, createDateEnd, mobile, name));
		returnData(response, srm);
	}
	/**
	 * 获取业务员列表
	 * @param request
	 * @param response
	 * @param createDateStart
	 * @param createDateEnd
	 * @param mobile
	 * @param name
	 * @param parentAgentName
	 * @param topPrimaryAgentName
	 * @throws Exception
	 */
	@RequestMapping(value = "/agent/getPrimaryAgentsBelongings.htm")
	public void getgetPrimaryAgentsBelongings(HttpServletRequest request,HttpServletResponse response,
			String createDateStart,String createDateEnd,String mobile,String name,String parentAgentName,String topPrimaryAgentName) throws Exception {
		SysRetrunMessage srm = new SysRetrunMessage(1l);
		agBusinessUserService.setRequest(request);
		srm.setObj(agBusinessUserService.getPrimaryAgentsPagerModel(createDateStart, createDateEnd, mobile, name, parentAgentName,topPrimaryAgentName));
		returnData(response, srm);
	}
	/**
	 * 代理商用户获取员工列表
	 * @param request
	 * @param response
	 * @param createDateStart
	 * @param createDateEnd
	 * @param mobile
	 * @param name
	 * @param parentAgentName
	 * @param topReservedAgentName
	 * @param topReservedAgentRelateToName
	 * @throws Exception
	 */
	@RequestMapping(value = "/agent/getMyAgentPagerModel.htm")
	public void getReservedAgents(HttpServletRequest request,HttpServletResponse response,
			String createDateStart,String createDateEnd,String name) throws Exception {
		SysRetrunMessage srm = new SysRetrunMessage(1l);
		agBusinessUserService.setRequest(request);
		srm.setObj(agBusinessUserService.getReservedPagerModel(createDateStart, createDateEnd, name));
		returnData(response, srm);
	}
	
	/**
	 * app业务员获取下级业务员列表
	 * @param request
	 * @param response
	 * @param name
	 * @throws Exception
	 */
	@RequestMapping(value = "/agent/getMyAgents.htm")
	public void getMyAgents(HttpServletRequest request,HttpServletResponse response,String name) throws Exception {
		SysRetrunMessage srm = new SysRetrunMessage(1l);
		agBusinessUserService.setRequest(request);
		srm.setObj(agBusinessUserService.getMyAgentPagerModel(name));
		returnData(response, srm);
	}
	
	/**
	 * 新增或修改业务员信息接口：当业务员ID为空时新增，不为空时修改
	 * @param request
	 * @param response
	 * @param att_AgBusinessUser
	 * @throws Exception
	 */
	@RequestMapping(value = "/agent/saveBussi.htm")
	public void saveBussi(HttpServletRequest request ,HttpServletResponse response,Integer id,String name,String mobile) throws Exception{
		agBusinessUserService.setRequest(request); 
		AgBusinessUser att_AgBusinessUser= new AgBusinessUser();
		att_AgBusinessUser.setMobile(mobile);
		att_AgBusinessUser.setName(name);
		att_AgBusinessUser.setAgentId(id);
		SysRetrunMessage srm=agBusinessUserService.saveOrUpdateAgBusinessUser(att_AgBusinessUser);
		returnData(response,srm);
	}
	/**
	 * 后台保存代理商员工信息
	 * @param request
	 * @param response
	 * @param mobile
	 * @param name
	 * @param parentAgentId 代理商ID
	 * @throws Exception
	 */
	@RequestMapping(value = "/agent/addReservedBelongingAgents.htm")
	public void addReservedBelongingAgents(HttpServletRequest request ,HttpServletResponse response,String mobile,String name,Integer parentAgentId,Integer id ) throws Exception{
		agBusinessUserService.setRequest(request); 
		AgBusinessUser att_AgBusinessUser= new AgBusinessUser();
		att_AgBusinessUser.setMobile(mobile);
		att_AgBusinessUser.setName(name);
		att_AgBusinessUser.setAaiId(parentAgentId);
		att_AgBusinessUser.setAgentId(id);
		SysRetrunMessage srm=agBusinessUserService.saveOrUpdateAgBusinessUser(att_AgBusinessUser);
		returnData(response,srm);
	}
	/**
	 * 后台保存初代业务员
	 * @param request
	 * @param response
	 * @param mobile
	 * @param name
	 * @throws Exception
	 */
	@RequestMapping(value = "/agent/addPrimaryAgents.htm")
	public void addPrimaryAgents(HttpServletRequest request ,HttpServletResponse response,String mobile,String name,Integer id) throws Exception{
		agBusinessUserService.setRequest(request); 
		AgBusinessUser att_AgBusinessUser= new AgBusinessUser();
		att_AgBusinessUser.setMobile(mobile);
		att_AgBusinessUser.setName(name);
		att_AgBusinessUser.setAgentId(id);
		SysRetrunMessage srm=agBusinessUserService.saveOrUpdateAgBusinessUser(att_AgBusinessUser);
		returnData(response,srm);
	}
	/**
	 * 后台保存业务员信息
	 * @param request
	 * @param response
	 * @param mobile
	 * @param name
	 * @param parentAgentId
	 * @throws Exception
	 */
	@RequestMapping(value = "/agent/addPrimaryBelongingAgents.htm")
	public void addPrimaryBelongingAgents(HttpServletRequest request ,HttpServletResponse response,String mobile,String name,Integer parentAgentId,Integer id ) throws Exception{
		agBusinessUserService.setRequest(request); 
		AgBusinessUser att_AgBusinessUser= new AgBusinessUser();
		att_AgBusinessUser.setMobile(mobile);
		att_AgBusinessUser.setName(name);
		att_AgBusinessUser.setParentAgentId(parentAgentId);
		att_AgBusinessUser.setAgentId(id);
		SysRetrunMessage srm=agBusinessUserService.saveOrUpdateAgBusinessUser(att_AgBusinessUser);
		returnData(response,srm);
	}
	/**
	 * app增加下级导医信息
	 * @param request
	 * @param response
	 * @param mobile
	 * @param name
	 * @param code
	 * @throws Exception
	 */
	@RequestMapping(value = "/agent/addMyAgent.htm")
	public void addMyAgent(HttpServletRequest request ,HttpServletResponse response,String mobile,String name,String code) throws Exception{
		agBusinessUserService.setRequest(request); 
		SysRetrunMessage srm=new SysRetrunMessage();
		if(CommonUtil.getSmsCode(mobile, code)){
			AgBusinessUser att_AgBusinessUser= new AgBusinessUser();
			att_AgBusinessUser.setMobile(mobile);
			att_AgBusinessUser.setName(name);
			srm=agBusinessUserService.saveOrUpdateAgBusinessUser(att_AgBusinessUser);
		}else{
			srm.setCode(0l);
			srm.setMeg("验证码不正确!");
		}
		returnData(response,srm);
	}
	/**
	 * app业务员注册
	 * @param request
	 * @param response
	 * @param mobile
	 * @param code
	 * @throws Exception
	 */
	@RequestMapping(value = "/agent/registerAgent.htm")
	public void registerAgent(HttpServletRequest request ,HttpServletResponse response,String mobile,String code) throws Exception{
		agBusinessUserService.setRequest(request); 
		SysRetrunMessage srm=new SysRetrunMessage();
		if(CommonUtil.getSmsCode(mobile, code)){
			AgBusinessUser att_AgBusinessUser= new AgBusinessUser();
			att_AgBusinessUser.setMobile(mobile);
			srm=agBusinessUserService.saveOrUpdateAgBusinessUser(att_AgBusinessUser);
		}else{
			srm.setCode(0l);
			srm.setMeg("验证码不正确!");
		}
		returnData(response,srm);
	}
	/**
	 * app更新个人信息
	 * @param request
	 * @param response
	 * @param primaryBelongTo
	 * @param primaryBelongToOrganizationId
	 * @param avatar
	 * @throws Exception
	 */
	@RequestMapping(value = "/agent/renewAgent.htm")
	public void renewAgent(HttpServletRequest request ,HttpServletResponse response,Integer primaryBelongTo,Integer primaryBelongToOrganizationId,String avatar) throws Exception{
		agBusinessUserService.setRequest(request);
		AgBusinessUser agBusinessUser = agBusinessUserService.findObject(this.getLoginSysUserInfo(request).getSroleId());
		agBusinessUser.setAvatar(avatar);
		SysRetrunMessage srm=agBusinessUserService.saveOrUpdateObject(agBusinessUser);
		returnData(response,srm);
	}
	
	
	 /**
	  * 根据业务员ID删除业务员信息
	  * @param request
	  * @param response
	  * @param id
	  * @throws Exception
	  */
	@RequestMapping(value = "/agent/delBussi.htm")
	public void delBussi(HttpServletRequest request ,HttpServletResponse response,Integer id ) throws Exception{
		agBusinessUserService.setRequest(request);
		
		SysRetrunMessage srm=agBusinessUserService.deleteObject(id);
		returnData(response,srm);
	}
	 
	/**
	 * 检查当前用户是否正在提现
	 * @param request
	 * @param response
	 * @throws Exception
	 */
	@RequestMapping(value = "/agent/addWithdraw.htm")
	public void addWithdraw(HttpServletRequest request,
			HttpServletResponse response ) throws Exception {
		SysRetrunMessage srm = new SysRetrunMessage(1l);
		agWithdrawInfoService.setRequest(request);
		SysUserInfo sui=this.getLoginSysUserInfo(request);
		AgWithdrawInfo att_AgWithdrawInfo=new AgWithdrawInfo ();
		att_AgWithdrawInfo.setAwiUserId(sui.getSroleId());
		att_AgWithdrawInfo.setWithdrawStatus("0,1");
		att_AgWithdrawInfo.setCheckStatus("0,1");
		if(this.getUserType(request).equals("4"))
			att_AgWithdrawInfo.setWithdrawType("3");
		else if(this.getUserType(request).equals("5"))
			att_AgWithdrawInfo.setWithdrawType("2");
 		srm=agWithdrawInfoService.getIfWithdrawInfo(att_AgWithdrawInfo);
		returnData(response, srm);
	}
	
	
	/**
	 * 提现申请的审核通过操作
	 * @param request
	 * @param response
	 * @param id 提现申请ID
	 * @throws Exception
	 */
	@RequestMapping(value = "/agent/addAdoptWithdraw.htm")
	public void addAdoptWithdraw(HttpServletRequest request,
			HttpServletResponse response ,Integer id) throws Exception {
		SysRetrunMessage srm = new SysRetrunMessage(1l);
		agWithdrawInfoService.setRequest(request);
		AgWithdrawInfo att_AgWithdrawInfo=agWithdrawInfoService.findObject(id);
		att_AgWithdrawInfo.setEditDate(new Date());
		att_AgWithdrawInfo.setLastPortalUserId(this.getLoginSysUserInfo(request).getSuiId());
		att_AgWithdrawInfo.setLastPortalUserName(this.getLoginSysUserInfo(request).getUserName());
		att_AgWithdrawInfo.setRunType("1");
 		srm.setObj( agWithdrawInfoService.saveOrUpdateAdopt(att_AgWithdrawInfo));
		returnData(response, srm);
	}
	/**
	 * 提现申请的审核 不通过
	 * @param request
	 * @param response
	 * @param id
	 * @param checkFailureReason
	 * @throws Exception
	 */
	@RequestMapping(value = "/agent/addNotAdoptWithdraw.htm")
	public void addNotAdoptWithdraw(HttpServletRequest request,
			HttpServletResponse response ,Integer id,String checkFailureReason) throws Exception {
		SysRetrunMessage srm = new SysRetrunMessage(1l);
		agWithdrawInfoService.setRequest(request);
		AgWithdrawInfo att_AgWithdrawInfo=agWithdrawInfoService.findObject(id);
		att_AgWithdrawInfo.setEditDate(new Date());
		att_AgWithdrawInfo.setLastPortalUserId(this.getLoginSysUserInfo(request).getSuiId());
		att_AgWithdrawInfo.setLastPortalUserName(this.getLoginSysUserInfo(request).getUserName());
		att_AgWithdrawInfo.setRunType("2");
		att_AgWithdrawInfo.setRunReason(checkFailureReason);
 		srm.setObj( agWithdrawInfoService.saveOrUpdateAdopt(att_AgWithdrawInfo));
		returnData(response, srm);
	}
	
	
	/**
	 * 提现申请的打款成功
	 * @param request
	 * @param response
	 * @param id
	 * @throws Exception
	 */
	@RequestMapping(value = "/agent/addSuccessMakeMoney.htm")
	public void addSuccessMakeMoney(HttpServletRequest request,
			HttpServletResponse response,Integer id ) throws Exception {
		SysRetrunMessage srm = new SysRetrunMessage(1l);
		agWithdrawInfoService.setRequest(request);
		AgWithdrawInfo att_AgWithdrawInfo=agWithdrawInfoService.findObject(id);
		att_AgWithdrawInfo.setEditDate(new Date());
		att_AgWithdrawInfo.setLastPortalUserId(this.getLoginSysUserInfo(request).getSuiId());
		att_AgWithdrawInfo.setLastPortalUserName(this.getLoginSysUserInfo(request).getUserName());
		att_AgWithdrawInfo.setRunType("3");
 		srm.setObj( agWithdrawInfoService.saveOrUpdateMakeMoney(att_AgWithdrawInfo));
		returnData(response, srm);
	}
	 /**
	  * 提现申请的打款失败
	  * @param request
	  * @param response
	  * @param id
	  * @param withdrawFailureReason
	  * @throws Exception
	  */
	@RequestMapping(value = "/agent/addFailMakeMoney.htm")
	public void addFailMakeMoney(HttpServletRequest request,
			HttpServletResponse response ,Integer id,String withdrawFailureReason) throws Exception {
		SysRetrunMessage srm = new SysRetrunMessage(1l);
		agWithdrawInfoService.setRequest(request);
		AgWithdrawInfo att_AgWithdrawInfo=agWithdrawInfoService.findObject(id);
		att_AgWithdrawInfo.setEditDate(new Date());
		att_AgWithdrawInfo.setLastPortalUserId(this.getLoginSysUserInfo(request).getSuiId());
		att_AgWithdrawInfo.setLastPortalUserName(this.getLoginSysUserInfo(request).getUserName());
		att_AgWithdrawInfo.setRunType("4");
		att_AgWithdrawInfo.setRunReason(withdrawFailureReason);
 		srm.setObj( agWithdrawInfoService.saveOrUpdateMakeMoney(att_AgWithdrawInfo));
		returnData(response, srm);
	}
	
	/**
	 * 添加代理商申请提现
	 * @param request
	 * @param response
	 * @throws Exception
	 */
	@RequestMapping(value = "/agent/addAgentWithdraw.htm")
	public void addAgentWithdraw(HttpServletRequest request ,HttpServletResponse response  ) throws Exception{
		agWithdrawInfoService.setRequest(request); 
		SysUserInfo userinfo=this.getLoginSysUserInfo(request);
		AgWithdrawInfo att_AgWithdrawInfo=new AgWithdrawInfo (); 
		att_AgWithdrawInfo.setAwiUserId(userinfo.getSroleId());
		if (att_AgWithdrawInfo.getId() != null) {			
			att_AgWithdrawInfo.setEditDate(new Date());			
			att_AgWithdrawInfo.setEditRen(userinfo.getUserName());
		}else {
			att_AgWithdrawInfo.setCreateDate(new Date());			
			att_AgWithdrawInfo.setCreateRen(userinfo.getUserName());
		}
		SysRetrunMessage srm=agWithdrawInfoService.saveWithdrawMaid("1",att_AgWithdrawInfo);
		returnData(response,srm);
	}
	
	/**
	 * 添加业务员申请提现
	 * @param request
	 * @param response
	 * @param att_AgWithdrawInfo
	 * @throws Exception
	 */
	@RequestMapping(value = "/agent/addBusinessWithdraw.htm")
	public void addBusinessWithdraw(HttpServletRequest request ,HttpServletResponse response ,String code,String mobile ) throws Exception{
		agWithdrawInfoService.setRequest(request); 
		SysRetrunMessage srm=new SysRetrunMessage(1l);
		if(mobile==null || mobile.trim().equals("")){
			srm.setCode(0l);
			srm.setMeg("请输入手机号!");
		}
		if(CommonUtil.getSmsCode(mobile, code)){
			SysUserInfo userinfo=this.getLoginSysUserInfo(request);
			AgWithdrawInfo att_AgWithdrawInfo=new AgWithdrawInfo (); 
			att_AgWithdrawInfo.setAwiUserId(userinfo.getSroleId());
			if (att_AgWithdrawInfo.getId() != null) {			
				att_AgWithdrawInfo.setEditDate(new Date());			
				att_AgWithdrawInfo.setEditRen(userinfo.getUserName());
			}else {
				att_AgWithdrawInfo.setCreateDate(new Date());			
				att_AgWithdrawInfo.setCreateRen(userinfo.getUserName());
			}
			srm=agWithdrawInfoService.saveWithdrawMaid("2",att_AgWithdrawInfo);
		}else{
			srm.setCode(0l);
			srm.setMeg("验证码不正确!");
		}
		
		returnData(response,srm);
	}
	
	/**
	 * 根据条件查询出提现信息列表
	 * @param request
	 * @param response
	 * @param att_AgWithdrawInfo
	 * @throws Exception
	 */
	@RequestMapping(value = "/agent/withdrawList.htm")
	public void withdrawList(HttpServletRequest request,
			HttpServletResponse response,String contextMobile,String serialNumber,String withdrawStatus,String withdrawType,String createDateStart,String createDateEnd) throws Exception {
		SysRetrunMessage srm = new SysRetrunMessage(1l);
		agWithdrawInfoService.setRequest(request);
		AgWithdrawInfo att_AgWithdrawInfo= new AgWithdrawInfo();
		att_AgWithdrawInfo.setContextMobile(contextMobile);
		att_AgWithdrawInfo.setSerialNumber(serialNumber);
		att_AgWithdrawInfo.setWithdrawType(withdrawType);
		att_AgWithdrawInfo.setWithdrawStatus(withdrawStatus);
		SimpleDateFormat sdf =new SimpleDateFormat("yyyy-MM-dd");
		if(createDateStart!=null && !createDateStart.trim().equals(""))
			att_AgWithdrawInfo.setCreateDate_start(sdf.parse(createDateStart));
		if(createDateEnd!=null && !createDateEnd.trim().equals(""))
			att_AgWithdrawInfo.setCreateDate_end(sdf.parse(createDateEnd));
		att_AgWithdrawInfo.setTab_like("serialNumber,contextMobile");
		srm.setObj(agWithdrawInfoService.getPagerModelObject(att_AgWithdrawInfo));
		returnData(response, srm);
	}
	
	/**
	 * 获取单条提现申请的交易明细
	 * @param request
	 * @param response
	 * @param att_AgWithdrawInfo
	 * @throws Exception
	 */
	@RequestMapping(value = "/agent/withdrawTransaction.htm")
	public void withdrawTransaction (HttpServletRequest request,
			HttpServletResponse response,Integer id) throws Exception {
		SysRetrunMessage srm = new SysRetrunMessage(1l);
		agMaidInfoService.setRequest(request);
		AgMaidView att_AgMaidView = new AgMaidView();
		att_AgMaidView.setAwiId(id);
		srm.setObj( agMaidInfoService.getPagerModelMaidView(att_AgMaidView));  
		returnData(response, srm);
	}
}
