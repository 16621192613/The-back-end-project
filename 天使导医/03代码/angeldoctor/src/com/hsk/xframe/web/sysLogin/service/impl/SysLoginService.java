package com.hsk.xframe.web.sysLogin.service.impl;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.providers.encoding.Md5PasswordEncoder;
import org.springframework.stereotype.Service;

import com.hsk.angeldoctor.api.daobbase.IAgAgentInfoDao;
import com.hsk.angeldoctor.api.daobbase.IAgBusinessUserDao;
import com.hsk.angeldoctor.api.daobbase.IAgDoctorDepartmentGxDao;
import com.hsk.angeldoctor.api.daobbase.IAgDoctorInfoDao;
import com.hsk.angeldoctor.api.daobbase.IAgHospitalInfoDao;
import com.hsk.angeldoctor.api.daobbase.IAgHospitalJobDao;
import com.hsk.angeldoctor.api.daobbase.IAgHospitalRoleDao;
import com.hsk.angeldoctor.api.persistence.AgAgentInfo;
import com.hsk.angeldoctor.api.persistence.AgBusinessUser;
import com.hsk.angeldoctor.api.persistence.AgDoctorDepartmentGx;
import com.hsk.angeldoctor.api.persistence.AgDoctorInfo;
import com.hsk.angeldoctor.api.persistence.AgHospitalInfo;
import com.hsk.angeldoctor.api.persistence.AgHospitalJob;
import com.hsk.angeldoctor.api.persistence.AgHospitalRole;
/*import com.hsk.dentistmall.api.daobbase.IMdCompanyGroupDao;
import com.hsk.dentistmall.api.daobbase.IMdDentalClinicDao;
import com.hsk.dentistmall.api.daobbase.IMdDentistHospitalDao;
import com.hsk.dentistmall.api.daobbase.IMdSupplierDao;
import com.hsk.dentistmall.api.persistence.MdCompanyGroup;
import com.hsk.dentistmall.api.persistence.MdDentalClinic;
import com.hsk.dentistmall.api.persistence.MdDentistHospital;
import com.hsk.dentistmall.api.persistence.MdSupplier;*/
import com.hsk.exception.HSKDBException;
import com.hsk.exception.HSKException;
import com.hsk.supper.dto.comm.SysRetrunMessage;
import com.hsk.xframe.api.daobbase.ISysUserInfoDao;
import com.hsk.xframe.api.filter.TokenUtil;
import com.hsk.xframe.api.persistence.SysUserInfo;
import com.hsk.xframe.api.service.imp.DSTService;
import com.hsk.xframe.api.utils.freeMarker.CommonUtil;
import com.hsk.xframe.api.utils.freeMarker.WeixinUtils;
import com.hsk.xframe.web.sysLogin.service.ISysLoginService;

/**
 * 
 * @author 张曙
 *
 */
@Service
public class SysLoginService extends DSTService implements ISysLoginService {
	
	@Autowired
	private ISysUserInfoDao sysUserInfoDao;
	@Autowired
	private IAgAgentInfoDao agAgentInfoDao;
	@Autowired
	private IAgDoctorInfoDao agDoctorInfoDao;
	@Autowired
	private IAgHospitalInfoDao agHospitalInfoDao;
	@Autowired
	private IAgDoctorDepartmentGxDao agDoctorDepartmentGxDao;
	@Autowired
	private IAgHospitalJobDao agHospitalJobDao;
	@Autowired
	protected IAgBusinessUserDao agBusinessUserDao;
	@Autowired
	protected IAgHospitalRoleDao agHospitalRoleDao;

	
	@Override
	public SysRetrunMessage doSysLogin(String userName, String password,String origin,String userType)
			throws HSKException {
		SysRetrunMessage srm = new SysRetrunMessage(1l);
		try { 
			SysUserInfo sysUserInfo = sysUserInfoDao.userLogin(userName,origin,userType);
			if(sysUserInfo == null || !sysUserInfo.getState().equals(0)){
				srm.setCode(0l);
				srm.setMeg("该用户不存在!");
				return srm;
			}
			Md5PasswordEncoder md5= new Md5PasswordEncoder();
			String password2=md5.encodePassword(password, null);
			if(!sysUserInfo.getPassword().equals(password2)){
				srm.setCode(0l);
				srm.setMeg("密码错误!");
				return srm;
			}
			String token = TokenUtil.addToken(sysUserInfo);
			Map<String,Object> reMap = new HashMap<String,Object>();
			SimpleDateFormat sdf =new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
			if(sysUserInfo.getUserType()==1){//如果当前用户是后台管理员
				reMap.put("id", sysUserInfo.getSuiId());
				reMap.put("portalRoleId", sysUserInfo.getUserRole());
				reMap.put("name", sysUserInfo.getAccount());
				reMap.put("actualName", sysUserInfo.getUserName());
				if(sysUserInfo.getCreateDate() !=null)
					reMap.put("createDate",sdf.format(sysUserInfo.getCreateDate()));
				else
					reMap.put("createDate","");
				if(sysUserInfo.getEditDate() !=null)
					reMap.put("lastLoginDate",sdf.format(sysUserInfo.getEditDate()));
				else
					reMap.put("lastLoginDate","");
				reMap.put("token", token);
			}else if(sysUserInfo.getUserType()==2){//如果当前用户是医院管理员
				reMap.put("id", sysUserInfo.getSuiId());
				//查询医院的管理员权限ID
				AgHospitalRole att_AgHospitalRole = new AgHospitalRole();
		  		att_AgHospitalRole.setOrganizationId(sysUserInfo.getSroleId());
		  		att_AgHospitalRole.setLocked("1");
		  		att_AgHospitalRole.setStatus("0");
		  		List<AgHospitalRole> roleList = agHospitalRoleDao.getListByAgHospitalRole(att_AgHospitalRole);
				if(roleList !=null && roleList.size() >0){
					AgHospitalJob att_AgHospitalJob = new AgHospitalJob();
					att_AgHospitalJob.setRoleId(roleList.get(0).getRoleId());
		  			att_AgHospitalJob.setLocked("1");
		  			att_AgHospitalJob.setStatus("0");
		  			List<AgHospitalJob> jobList = agHospitalJobDao.getListByAgHospitalJob(att_AgHospitalJob);
		  			if(jobList !=null && jobList.size() >0)
		  				reMap.put("jobTitleId", jobList.get(0).getJobId());
				}
				reMap.put("organizationId", sysUserInfo.getSroleId());
				reMap.put("name", sysUserInfo.getAccount());
				reMap.put("gender", null);
				reMap.put("mobile", null);
				reMap.put("avatar", null);
				reMap.put("birthday", null);
				reMap.put("doctorId", null);
				reMap.put("departmentId", null);
				reMap.put("jobTitleName", "管理员");
				reMap.put("organizationDomain", origin);
				reMap.put("isCustomerService", false);
				if(sysUserInfo.getCreateDate() !=null)
					reMap.put("createDate",sdf.format(sysUserInfo.getCreateDate()));
				else
					reMap.put("createDate","");
				reMap.put("token", token);
			}else if(sysUserInfo.getUserType()==3){//如果当前用户是医生
				AgDoctorInfo doctorInfo = agDoctorInfoDao.findAgDoctorInfoById(sysUserInfo.getSroleId());
				//检查当前医院是否下架
				AgHospitalInfo agHospitalInfo= agHospitalInfoDao.findAgHospitalInfoById(doctorInfo.getOrganizationId()); 
				if(agHospitalInfo!= null && agHospitalInfo.getStatus()!=null &&agHospitalInfo.getStatus().equals("0")){
					reMap.put("id", sysUserInfo.getSuiId());
					reMap.put("jobTitleId", doctorInfo.getJobTitleId());
					reMap.put("organizationId", doctorInfo.getOrganizationId());
					reMap.put("name", sysUserInfo.getAccount());
					reMap.put("gender", doctorInfo.getGender());
					reMap.put("mobile", doctorInfo.getMobile());
					reMap.put("avatar", doctorInfo.getAvatar());
					reMap.put("birthday", doctorInfo.getBirthday());
					reMap.put("doctorId", doctorInfo.getDoctorId());
					AgDoctorDepartmentGx att_AgDoctorDepartmentGx = new AgDoctorDepartmentGx();
					att_AgDoctorDepartmentGx.setDoctorId(doctorInfo.getDoctorId());
					List<AgDoctorDepartmentGx> depList = agDoctorDepartmentGxDao.getListByAgDoctorDepartmentGx(att_AgDoctorDepartmentGx);
					String departmentIdStr ="";
					if(depList!=null && depList.size() >0){
						for(AgDoctorDepartmentGx gx : depList)
							departmentIdStr+=gx.getDepartmentId()+",";
						departmentIdStr=departmentIdStr.substring(0, departmentIdStr.length()-1);
					}
					reMap.put("departmentId", departmentIdStr);
					AgHospitalJob agHospitalJob = agHospitalJobDao.findAgHospitalJobById(doctorInfo.getJobTitleId());
					reMap.put("jobTitleName",agHospitalJob.getName());
					reMap.put("organizationDomain", origin);
					reMap.put("isCustomerService", false);
					reMap.put("imCode", CommonUtil.IM_DOC_PRE+doctorInfo.getDoctorId());
					if(sysUserInfo.getCreateDate() !=null)
						reMap.put("createDate",sdf.format(sysUserInfo.getCreateDate()));
					else
						reMap.put("createDate","");
					reMap.put("token", token);
				}else{
					srm.setCode(0l);
					srm.setMeg("医院已下架!");
					return srm;
				}
				
			}else if(sysUserInfo.getUserType()==4){//如果当前用户是代理商
				AgAgentInfo agInfo = agAgentInfoDao.findAgAgentInfoById(sysUserInfo.getSroleId());
				reMap.put("id", agInfo.getAaiId());
				reMap.put("mobile", agInfo.getMobile());
				reMap.put("name", agInfo.getName());
				reMap.put("reservedAccountName", agInfo.getReservedAccountName());
				reMap.put("reservedAccountNumber", agInfo.getReservedAccountNumber());
				reMap.put("reservedBankName", agInfo.getReservedBankName());
				reMap.put("reservedCityId", agInfo.getReservedCityId());
				reMap.put("reservedProvId", agInfo.getReservedProvId());
				reMap.put("reservedRelateTo", agInfo.getReservedRelateTo());
				reMap.put("reservedRelateToTeamName",agInfo.getReservedRelateToTeamName());
				reMap.put("reservedSharePercent", agInfo.getReservedSharePercent());
				reMap.put("reservedUsername", sysUserInfo.getAccount());
				reMap.put("token", token);
			}
			sysUserInfo.setEditDate(new Date());
			this.updateObject(sysUserInfo);
			srm.setObj(reMap);
			srm.setMeg("登录成功!");
		} catch (Exception e) {
			e.printStackTrace();
			srm.setCode(0l);
			srm.setMeg("查询失败!");
		}
		return srm;
	}
	
	@Override
	public SysRetrunMessage doAngetlogin(String mobile, String code) throws HSKException {
		SysRetrunMessage srm = new SysRetrunMessage(1l);
		try {
			if(mobile==null || mobile.trim().equals("")){
				srm.setCode(0l);
				srm.setMeg("请输入手机号!");
				return srm;
			}
			if(CommonUtil.getSmsCode(mobile, code)){
				SysUserInfo sysUserInfo = new SysUserInfo();
				sysUserInfo.setPhoneNumber(mobile);
				sysUserInfo.setUserType(5);
				sysUserInfo.setState(0);
				SimpleDateFormat sdf =new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
				List<SysUserInfo> userList= this.getList(sysUserInfo);
				if(userList!= null && userList.size() >0){
					sysUserInfo = userList.get(0);
					String token = TokenUtil.addToken(sysUserInfo);
					Map<String,Object> reMap = new HashMap<String,Object>();
					AgBusinessUser agBusinessUser =agBusinessUserDao.findAgBusinessUserById(sysUserInfo.getSroleId());
					reMap.put("token", token);
					reMap.put("id", sysUserInfo.getSroleId());
					reMap.put("mobile", agBusinessUser.getMobile());
					reMap.put("parentAgentId", agBusinessUser.getParentAgentId());
					reMap.put("name", agBusinessUser.getName());
					reMap.put("avatar", agBusinessUser.getAvatar());
					if(sysUserInfo.getCreateDate() !=null)
						reMap.put("createDate",sdf.format(sysUserInfo.getCreateDate()));
					else
						reMap.put("createDate","");
					reMap.put("bankName", agBusinessUser.getReservedBankName());
					reMap.put("accountName", agBusinessUser.getReservedAccountName());
					reMap.put("accountNumber", agBusinessUser.getReservedAccountNumber());
					if(agBusinessUser.getQrCode()==null || agBusinessUser.getQrCode().equals("")){
						agBusinessUser.setQrCode(WeixinUtils.createForeverTicket(agBusinessUser.getAgentId()));
						agBusinessUserDao.saveOrUpdateAgBusinessUser(agBusinessUser);
					}
					if(agBusinessUser.getAgentType()!=null){
						reMap.put("agentType", agBusinessUser.getAgentType());
					}else
						reMap.put("agentType", "3");
					reMap.put("appQRCode", agBusinessUser.getQrCode());
					if(agBusinessUser.getAaiId()!=null){
						AgAgentInfo agInfo = agAgentInfoDao.findAgAgentInfoById(agBusinessUser.getAaiId());
						reMap.put("primaryBelongTo", agInfo.getReservedRelateTo());
						reMap.put("primaryBelongToOrganizationId",agInfo.getReservedRelateToOrganizationId());
					}else{
						reMap.put("primaryBelongTo", "0");
					}
					
					sysUserInfo.setEditDate(new Date());
					sysUserInfoDao.saveUser(sysUserInfo);
					srm.setObj(reMap);
				}else{
					AgBusinessUser agBusinessUser = new AgBusinessUser();
					agBusinessUser.setMobile(mobile);
					agBusinessUser.setCreateDate(new Date());
					agBusinessUser.setStatus("0");
					agBusinessUserDao.saveOrUpdateAgBusinessUser(agBusinessUser);
					SysUserInfo newUser = new SysUserInfo();
					agBusinessUser.setQrCode(WeixinUtils.createForeverTicket(agBusinessUser.getAgentId()));
					agBusinessUserDao.saveOrUpdateAgBusinessUser(agBusinessUser);
					newUser.setUserType(5);
					newUser.setSroleId(agBusinessUser.getAgentId());
					newUser.setPhoneNumber(agBusinessUser.getMobile());
					newUser.setState(0);
					newUser.setCreateDate(new Date());
					newUser.setEditDate(new Date());
					sysUserInfoDao.saveUser(newUser);
					Map<String,Object> reMap = new HashMap<String,Object>();
					String token = TokenUtil.addToken(newUser);
					reMap.put("token", token);
					reMap.put("id", newUser.getSroleId());
					reMap.put("mobile", agBusinessUser.getMobile());
					reMap.put("appQRCode", agBusinessUser.getQrCode());
					if(newUser.getCreateDate() !=null)
						reMap.put("createDate",sdf.format(newUser.getCreateDate()));
					else
						reMap.put("createDate","");
					if(agBusinessUser.getAgentType()!=null){
						reMap.put("agentType", agBusinessUser.getAgentType());
					}else
						reMap.put("agentType", "3");
					if(agBusinessUser.getAaiId()!=null){
						AgAgentInfo agInfo = agAgentInfoDao.findAgAgentInfoById(agBusinessUser.getAaiId());
						reMap.put("primaryBelongTo", agInfo.getReservedRelateTo());
						reMap.put("primaryBelongToOrganizationId",agInfo.getReservedRelateToOrganizationId());
					}else{
						reMap.put("primaryBelongTo", "0");
					}
					srm.setObj(reMap);
				}
			}else{
				srm.setCode(0l);
				srm.setMeg("验证码不正确!");
				return srm;
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return srm;
	}
	
	@Override
	public SysRetrunMessage ReceptionCancellation()
			throws HSKException {
		SysRetrunMessage srm = new SysRetrunMessage(1);
		String token = this.getToken();
		TokenUtil.delToken(token);
		return srm;
	}


	
}
