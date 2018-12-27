package com.hsk.angeldoctor.web.agent.service.imp;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.providers.encoding.Md5PasswordEncoder;
import org.springframework.stereotype.Service;

import com.github.abel533.echarts.data.Data;
import com.hsk.angeldoctor.api.daobbase.IAgAgentInfoDao;
import com.hsk.angeldoctor.api.daobbase.IAgBusinessUserDao;
import com.hsk.angeldoctor.api.daobbase.IAgHospitalInfoDao;
import com.hsk.angeldoctor.api.daobbase.IAgOrderInfoDao;
import com.hsk.angeldoctor.api.persistence.AgAgentInfo;
import com.hsk.angeldoctor.api.persistence.AgBusinessUser;
import com.hsk.angeldoctor.api.persistence.AgHospitalInfo;
import com.hsk.angeldoctor.web.agent.service.IAgAgentInfoService;
import com.hsk.exception.HSKDBException;
import com.hsk.exception.HSKException;
import com.hsk.supper.dto.comm.PagerModel;
import com.hsk.supper.dto.comm.SysRetrunMessage;
import com.hsk.xframe.api.daobbase.ISysUserInfoDao;
import com.hsk.xframe.api.persistence.SysUserInfo;
import com.hsk.xframe.api.service.imp.DSTService;


/** 
  agent业务操作实现类 
 * @author  作者:admin
 * @version  版本信息:v1.0   创建时间: 2018-08-14 13:31:11
 */
 
@Service
public class  AgAgentInfoService extends DSTService implements IAgAgentInfoService {	
   /**
   *业务处理dao类  agAgentInfoDao 
   */
	@Autowired
	protected IAgAgentInfoDao agAgentInfoDao;
	
	/**
	 * 用户处理dao类 
	 */
	@Autowired
	protected	ISysUserInfoDao sysUserInfoDao;
	@Autowired
	protected IAgHospitalInfoDao agHospitalInfoDao;
	@Autowired
	private IAgOrderInfoDao agOrderInfoDao;
	@Autowired
	protected IAgBusinessUserDao agBusinessUserDao;


 /**
	 * 根据ag_agent_info表主键删除AgAgentInfo对象记录
     * @param  aaiId  Integer类型(ag_agent_info表主键)
	 * @return SysRetrunMessage 对象记录
	 * @throws HSKException
	 */

	public SysRetrunMessage findFormObject(Integer aaiId) throws HSKException{
	        SysRetrunMessage srm=new SysRetrunMessage(1l);
			   
			try{
		   			AgAgentInfo     att_AgAgentInfo= agAgentInfoDao.findAgAgentInfoById( aaiId) ;
					srm.setObj(att_AgAgentInfo);
				} catch (HSKDBException e) {
					e.printStackTrace(); 
					srm.setCode(0l);
					srm.setMeg(e.getMessage()); 
				}
				 return srm ;
	} 

    /**
	 * 根据ag_agent_info表主键删除AgAgentInfo对象记录
     * @param  aaiId  Integer类型(ag_agent_info表主键)
	 * @throws HSKException
	 */

	public AgAgentInfo findObject(Integer aaiId) throws HSKException{
			AgAgentInfo  att_AgAgentInfo=new AgAgentInfo();		
			try{
		        att_AgAgentInfo= agAgentInfoDao.findAgAgentInfoById( aaiId) ;
				} catch (HSKDBException e) {
					e.printStackTrace(); 
					throw new  HSKException(e);
				}
				return  att_AgAgentInfo;
	}
	
	 
	 /**
	 * 根据ag_agent_info表主键删除AgAgentInfo对象记录
     * @param  aaiId  Integer类型(ag_agent_info表主键)
     * @return SysRetrunMessage 对象记录
	 * @throws HSKException
	 */
	public SysRetrunMessage deleteObject(Integer aaiId) throws HSKException{  
		    SysRetrunMessage srm=new SysRetrunMessage(1l);
		   try{ 
			   //删除相关 账号  
				agAgentInfoDao.deleteAgAgentInfoById(aaiId); 
			 } catch (Exception e) {
					e.printStackTrace(); 
					throw new  HSKException(e);
		     }
		   return srm;  
	}
	
	/**
	 * 根据ag_agent_info表主键删除多条AgAgentInfo对象记录
     * @param  AaiIds  Integer类型(ag_agent_info表主键)
     * @return SysRetrunMessage 对象记录
	 * @throws HSKException
	 */
	public SysRetrunMessage deleteAllObject(String aaiIds) throws HSKException{
		SysRetrunMessage srm = new SysRetrunMessage(1l);
		try {
			String[] ids = aaiIds.split(",");
			for (String did : ids) {
				if (did != null && !"".equals(did.trim())) {
					agAgentInfoDao.deleteAgAgentInfoById(Integer
							.valueOf(did));
				}
			}
		} catch (NumberFormatException e) {
			e.printStackTrace();
			HSKException hse = new HSKException(e);
			hse.setDisposeType("01");
			throw hse;
		} catch (HSKDBException e) {
			e.printStackTrace();
			throw new HSKException(e);
		}
		return srm;	  
	 }
	 
 
	 /**
	 * 新增或修改ag_agent_info表记录 ,如果ag_agent_info表主键AgAgentInfo.AaiId为空就是添加，如果非空就是修改
     * @param  att_AgAgentInfo  AgAgentInfo类型(ag_agent_info表记录)
     * @return AgAgentInfo  修改后的AgAgentInfo对象记录
	 * @throws HSKDBException
	 */
	public SysRetrunMessage saveOrUpdateObject(AgAgentInfo att_AgAgentInfo)
			throws HSKException {
		SysRetrunMessage srm = new SysRetrunMessage(1l);
		try {
			if(att_AgAgentInfo.getReservedRelateToOrganizationId()!=null){
				AgHospitalInfo ag = agHospitalInfoDao.findAgHospitalInfoById(att_AgAgentInfo.getReservedRelateToOrganizationId());
				att_AgAgentInfo.setReservedRelateToTeamName(ag.getName());
			}
			if (att_AgAgentInfo.getAaiId() != null) {
				agAgentInfoDao.saveOrUpdateAgAgentInfo(att_AgAgentInfo);
			} else {

				String userName = att_AgAgentInfo.getReservedUsername();
				if (userName != null && userName.trim().length() > 0) {
					// 检查重名
					SysUserInfo checkUser = new SysUserInfo();
					checkUser.setUserType(4);
					checkUser.setAccount(userName);
					SysUserInfo searchUser = sysUserInfoDao
							.getSysUserInfoByObj(checkUser);
					if (searchUser != null) {
						srm.setCode(0l);
						srm.setMeg("账号名称已存在 ！");
						return srm;
					} else {
						Md5PasswordEncoder md5= new Md5PasswordEncoder();
						agAgentInfoDao.saveAgAgentInfo(att_AgAgentInfo);
						// 添加账号记录
						SysUserInfo newUser = new SysUserInfo();
						newUser.setAccount(att_AgAgentInfo
								.getReservedUsername());
						newUser.setPassword(md5.encodePassword(att_AgAgentInfo.getReservedPassword(), null));
						newUser.setUserType(4);
						newUser.setSroleId(att_AgAgentInfo.getAaiId());
						newUser.setState(0);
						newUser.setUserName(att_AgAgentInfo.getName());
						newUser.setCreateDate(new Date());
						sysUserInfoDao.saveUser(newUser);
						AgBusinessUser att_agBusinessUser = new AgBusinessUser();
						att_agBusinessUser.setName(att_AgAgentInfo.getName());
						att_agBusinessUser.setMobile(att_AgAgentInfo.getMobile());
						att_agBusinessUser.setAaiId(att_AgAgentInfo.getAaiId());
						att_agBusinessUser.setStatus("0");
						att_agBusinessUser.setCreateDate(new Date());
						att_agBusinessUser.setAgentType("4");
						agBusinessUserDao.saveOrUpdateAgBusinessUser(att_agBusinessUser);
						SysUserInfo newUser2 = new SysUserInfo();
						newUser2.setUserName(att_agBusinessUser.getName());
						newUser2.setUserType(5);
						newUser2.setSroleId(att_agBusinessUser.getAgentId());
						newUser2.setPhoneNumber(att_agBusinessUser.getMobile());
						newUser2.setState(0);
						newUser2.setCreateDate(new Date());
						sysUserInfoDao.saveUser(newUser2);
					}

				} else {
					srm.setCode(0l);
					srm.setMeg("未填写账号名称！");
					return srm;
				}
			}
			srm.setObj(att_AgAgentInfo);
		} catch (Exception e) {
			e.printStackTrace();
			throw new HSKException(e);
		}
		return srm;
	}
	
	 
	/**
	 *根据AgAgentInfo对象作为对(ag_agent_info表进行查询，获取分页对象
     * @param  att_AgAgentInfo  AgAgentInfo类型(ag_agent_info表记录)
     * @return PagerModel  分页对象
	 * @throws HSKException 
	 */
	public PagerModel getPagerModelObject (AgAgentInfo att_AgAgentInfo) throws HSKException{
		PagerModel pm=new PagerModel(new ArrayList<AgAgentInfo>());
			  try{
					pm=agAgentInfoDao.getPagerModelByAgAgentInfo(att_AgAgentInfo);
			    } catch (Exception e) {
					e.printStackTrace(); 
		        }
		return pm;
	}

	@Override
	public PagerModel getAchievementPager(String reservedProvId, String reservedCityId, String reservedRelateToTeamName)
			throws HSKException {
		PagerModel pm=new PagerModel();
		try{
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
			List<Map<String,Object>> reList = new ArrayList<Map<String,Object>>();
			AgAgentInfo att_AgAgentInfo = new AgAgentInfo();
			att_AgAgentInfo.setReservedProvId(reservedProvId);
			att_AgAgentInfo.setReservedCityId(reservedCityId);
			att_AgAgentInfo.setReservedRelateToTeamName(reservedRelateToTeamName);
			att_AgAgentInfo.setTab_like("reservedRelateToTeamName");
			PagerModel pm2=agAgentInfoDao.getPagerModelByAgAgentInfo(att_AgAgentInfo);
			if(pm2 !=null && pm2.getRows()!=null && pm2.getRows().size() >0){
				List<AgAgentInfo> att_List= new ArrayList<AgAgentInfo>();
				String aaiIds="";
				for(Object obj:pm2.getRows()){
					AgAgentInfo info = (AgAgentInfo)obj;
					att_List.add(info);
					aaiIds=info.getAaiId()+",";
				}
				aaiIds=aaiIds.substring(0, aaiIds.length()-1);
				Map<String, List<Map<String, Object>>> achievementMap = agOrderInfoDao.getAchievementList(aaiIds, null, null, null);
				List<Map<String,Object>> dyrcList=achievementMap.get("dyrc");
				List<Map<String,Object>> dyrsList=achievementMap.get("dyrs");
				List<Map<String,Object>> dyjzList=achievementMap.get("dyjz");
				List<Map<String,Object>> yyrcList=achievementMap.get("yyrc");
				List<Map<String,Object>> yyrsList=achievementMap.get("yyrs");
				List<Map<String,Object>> yyjzList=achievementMap.get("yyjz");
				for(AgAgentInfo info :att_List){
					Map<String,Object> reMap= new HashMap<String,Object>();
					reMap.put("id", info.getAaiId());//代理商ID
					reMap.put("name", info.getName());//代理商名称
					reMap.put("mobile", info.getAaiId());//代理商电话
					if(info.getCreateDate()!=null)
						reMap.put("createDate", sdf.format(info.getCreateDate()));//代理商创建时间
					else
						reMap.put("createDate", "");//代理商创建时间
					reMap.put("reservedRelateToTeamName", info.getReservedRelateToTeamName());//代理商组织名称
					reMap.put("reservedProvId", info.getReservedProvId());//省
					reMap.put("reservedCityId", info.getReservedCityId());//市
					reMap.put("belongingsCount", info.getBelongingsCount());//员工数量
					reMap.put("directBelongingsCount", 0);//发展下线数量
					reMap.put("scenesCount", 0);//患者数量
					reMap.put("boundCount", 0);//患者绑定手机数
					Integer agentRegistrationsCount=0;//累计代约人次
					Integer agentRegistrationsPatientCount=0;//累计代约人数
					Integer agentRegistrationsOrderCount=0;//累计代约结诊人次
					Double agentRegistrationsTotalDrugFee=0d;//累计代约药费总额
					Double agentRegistrationsTotalTreatmentFee=0d;//累计代约诊疗费总额
					Integer sceneRegistrationsCount=0;//累计预约人次
					Integer sceneRegistrationsPatientCount=0;//累计预约人数
					Integer sceneRegistrationsOrderCount=0;//累计预约结诊人次
					Double sceneRegistrationsTotalDrugFee=0d;//累计预约药费总额
					Double sceneRegistrationsTotalTreatmentFee=0d;//累计预约诊疗费总额
					if(dyrcList !=null && dyrcList.size()>0){
						for(Map<String,Object> map : dyrcList){
							if(map.get("aai_id").toString().equals(info.getAaiId()+"")){
								agentRegistrationsCount=Integer.parseInt(map.get("shu").toString());
								break;
							}
						}
					}
					if(dyrsList !=null && dyrsList.size()>0){
						for(Map<String,Object> map : dyrsList){
							if(map.get("aai_id").toString().equals(info.getAaiId()+"")){
								agentRegistrationsPatientCount=Integer.parseInt(map.get("shu").toString());
								break;
							}
						}
					}
					if(dyjzList !=null && dyjzList.size()>0){
						for(Map<String,Object> map : dyjzList){
							if(map.get("aai_id").toString().equals(info.getAaiId()+"")){
								agentRegistrationsOrderCount=Integer.parseInt(map.get("shu").toString());
								agentRegistrationsTotalTreatmentFee=Double.parseDouble(map.get("drug_fee").toString());
								agentRegistrationsTotalTreatmentFee=Double.parseDouble(map.get("treatment_fee").toString());
								break;
							}
						}
					}
					
					if(yyrcList !=null && yyrcList.size()>0){
						for(Map<String,Object> map : yyrcList){
							if(map.get("aai_id").toString().equals(info.getAaiId()+"")){
								sceneRegistrationsCount=Integer.parseInt(map.get("shu").toString());
								break;
							}
						}
					}
					if(yyrsList !=null && yyrsList.size()>0){
						for(Map<String,Object> map : yyrsList){
							if(map.get("aai_id").toString().equals(info.getAaiId()+"")){
								sceneRegistrationsPatientCount=Integer.parseInt(map.get("shu").toString());
								break;
							}
						}
					}
					if(yyjzList !=null && yyjzList.size()>0){
						for(Map<String,Object> map : yyjzList){
							if(map.get("aai_id").toString().equals(info.getAaiId()+"")){
								sceneRegistrationsPatientCount=Integer.parseInt(map.get("shu").toString());
								sceneRegistrationsTotalDrugFee=Double.parseDouble(map.get("drug_fee").toString());
								sceneRegistrationsTotalTreatmentFee=Double.parseDouble(map.get("treatment_fee").toString());
								break;
							}
						}
					}
					
					reMap.put("agentRegistrationsCount", agentRegistrationsCount);
					reMap.put("agentRegistrationsPatientCount", agentRegistrationsPatientCount);
					reMap.put("agentRegistrationsOrderCount", agentRegistrationsOrderCount);
					reMap.put("agentRegistrationsTotalDrugFee", agentRegistrationsTotalDrugFee);
					reMap.put("agentRegistrationsTotalTreatmentFee", agentRegistrationsTotalTreatmentFee);
					reMap.put("sceneRegistrationsCount", sceneRegistrationsCount);
					reMap.put("sceneRegistrationsPatientCount", sceneRegistrationsPatientCount);
					reMap.put("sceneRegistrationsOrderCount", sceneRegistrationsOrderCount);
					reMap.put("sceneRegistrationsTotalDrugFee", sceneRegistrationsTotalDrugFee);
					reMap.put("sceneRegistrationsTotalTreatmentFee", sceneRegistrationsTotalTreatmentFee);
					reList.add(reMap);
				}
			}
			pm.setItems(reList);
			pm.setRows(reList);
			pm.setTotal(pm2.getTotal());
			pm.setTotalCount(pm2.getTotalCount());
		}catch (Exception e) {
			e.printStackTrace(); 
        }
		return pm;
	}

	@Override
	public PagerModel getOneAchievementPager(Integer id, String filterKey, String filterStartDate, String filterEndDate)
			throws HSKException {
		PagerModel pm=new PagerModel();
		try{
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
			List<Map<String,Object>> reList = new ArrayList<Map<String,Object>>();
			AgAgentInfo att_AgAgentInfo = new AgAgentInfo();
			att_AgAgentInfo.setAaiId(id);
			PagerModel pm2=agAgentInfoDao.getPagerModelByAgAgentInfo(att_AgAgentInfo);
			if(pm2 !=null && pm2.getRows()!=null && pm2.getRows().size() >0){
				List<AgAgentInfo> att_List= new ArrayList<AgAgentInfo>();
				String aaiIds="";
				for(Object obj:pm2.getRows()){
					AgAgentInfo info = (AgAgentInfo)obj;
					att_List.add(info);
					aaiIds=info.getAaiId()+",";
				}
				aaiIds=aaiIds.substring(0, aaiIds.length()-1);
				Map<String, List<Map<String, Object>>> achievementMap = agOrderInfoDao.getAchievementList(aaiIds, filterKey, filterStartDate, filterEndDate);
				List<Map<String,Object>> dyrcList=achievementMap.get("dyrc");
				List<Map<String,Object>> dyrsList=achievementMap.get("dyrs");
				List<Map<String,Object>> dyjzList=achievementMap.get("dyjz");
				List<Map<String,Object>> yyrcList=achievementMap.get("yyrc");
				List<Map<String,Object>> yyrsList=achievementMap.get("yyrs");
				List<Map<String,Object>> yyjzList=achievementMap.get("yyjz");
				for(AgAgentInfo info :att_List){
					Map<String,Object> reMap= new HashMap<String,Object>();
					reMap.put("id", info.getAaiId());//代理商ID
					reMap.put("name", info.getName());//代理商名称
					reMap.put("mobile", info.getAaiId());//代理商电话
					if(info.getCreateDate()!=null)
						reMap.put("createDate", sdf.format(info.getCreateDate()));//代理商创建时间
					else
						reMap.put("createDate", "");//代理商创建时间
					reMap.put("reservedRelateToTeamName", info.getReservedRelateToTeamName());//代理商组织名称
					reMap.put("reservedProvId", info.getReservedProvId());//省
					reMap.put("reservedCityId", info.getReservedCityId());//市
					reMap.put("belongingsCount", info.getBelongingsCount());//员工数量
					reMap.put("directBelongingsCount", 0);//发展下线数量
					reMap.put("scenesCount", 0);//患者数量
					reMap.put("boundCount", 0);//患者绑定手机数
					Integer agentRegistrationsCount=0;//累计代约人次
					Integer agentRegistrationsPatientCount=0;//累计代约人数
					Integer agentRegistrationsOrderCount=0;//累计代约结诊人次
					Double agentRegistrationsTotalDrugFee=0d;//累计代约药费总额
					Double agentRegistrationsTotalTreatmentFee=0d;//累计代约诊疗费总额
					Integer sceneRegistrationsCount=0;//累计预约人次
					Integer sceneRegistrationsPatientCount=0;//累计预约人数
					Integer sceneRegistrationsOrderCount=0;//累计预约结诊人次
					Double sceneRegistrationsTotalDrugFee=0d;//累计预约药费总额
					Double sceneRegistrationsTotalTreatmentFee=0d;//累计预约诊疗费总额
					if(dyrcList !=null && dyrcList.size()>0){
						for(Map<String,Object> map : dyrcList){
							if(map.get("aai_id").toString().equals(info.getAaiId()+"")){
								agentRegistrationsCount=Integer.parseInt(map.get("shu").toString());
								break;
							}
						}
					}
					if(dyrsList !=null && dyrsList.size()>0){
						for(Map<String,Object> map : dyrsList){
							if(map.get("aai_id").toString().equals(info.getAaiId()+"")){
								agentRegistrationsPatientCount=Integer.parseInt(map.get("shu").toString());
								break;
							}
						}
					}
					if(dyjzList !=null && dyjzList.size()>0){
						for(Map<String,Object> map : dyjzList){
							if(map.get("aai_id").toString().equals(info.getAaiId()+"")){
								agentRegistrationsOrderCount=Integer.parseInt(map.get("shu").toString());
								agentRegistrationsTotalTreatmentFee=Double.parseDouble(map.get("drug_fee").toString());
								agentRegistrationsTotalTreatmentFee=Double.parseDouble(map.get("treatment_fee").toString());
								break;
							}
						}
					}
					
					if(yyrcList !=null && yyrcList.size()>0){
						for(Map<String,Object> map : yyrcList){
							if(map.get("aai_id").toString().equals(info.getAaiId()+"")){
								sceneRegistrationsCount=Integer.parseInt(map.get("shu").toString());
								break;
							}
						}
					}
					if(yyrsList !=null && yyrsList.size()>0){
						for(Map<String,Object> map : yyrsList){
							if(map.get("aai_id").toString().equals(info.getAaiId()+"")){
								sceneRegistrationsPatientCount=Integer.parseInt(map.get("shu").toString());
								break;
							}
						}
					}
					if(yyjzList !=null && yyjzList.size()>0){
						for(Map<String,Object> map : yyjzList){
							if(map.get("aai_id").toString().equals(info.getAaiId()+"")){
								sceneRegistrationsPatientCount=Integer.parseInt(map.get("shu").toString());
								sceneRegistrationsTotalDrugFee=Double.parseDouble(map.get("drug_fee").toString());
								sceneRegistrationsTotalTreatmentFee=Double.parseDouble(map.get("treatment_fee").toString());
								break;
							}
						}
					}
					
					reMap.put("agentRegistrationsCount", agentRegistrationsCount);
					reMap.put("agentRegistrationsPatientCount", agentRegistrationsPatientCount);
					reMap.put("agentRegistrationsOrderCount", agentRegistrationsOrderCount);
					reMap.put("agentRegistrationsTotalDrugFee", agentRegistrationsTotalDrugFee);
					reMap.put("agentRegistrationsTotalTreatmentFee", agentRegistrationsTotalTreatmentFee);
					reMap.put("sceneRegistrationsCount", sceneRegistrationsCount);
					reMap.put("sceneRegistrationsPatientCount", sceneRegistrationsPatientCount);
					reMap.put("sceneRegistrationsOrderCount", sceneRegistrationsOrderCount);
					reMap.put("sceneRegistrationsTotalDrugFee", sceneRegistrationsTotalDrugFee);
					reMap.put("sceneRegistrationsTotalTreatmentFee", sceneRegistrationsTotalTreatmentFee);
					reList.add(reMap);
				}
			}
			pm.setItems(reList);
			pm.setRows(reList);
			pm.setTotal(pm2.getTotal());
			pm.setTotalCount(pm2.getTotalCount());
		}catch (Exception e) {
			e.printStackTrace(); 
        }
		return pm;
	} 
	 
}