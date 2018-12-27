package com.hsk.angeldoctor.web.agent.service.imp;

import java.text.SimpleDateFormat;
import java.util.*;
import org.springframework.stereotype.*;
import org.springframework.beans.factory.annotation.Autowired;
import com.hsk.supper.dto.comm.PagerModel;
import com.hsk.supper.dto.comm.SysRetrunMessage;
import com.hsk.xframe.api.daobbase.ISysUserInfoDao;
import com.hsk.xframe.api.persistence.SysUserInfo;
import com.hsk.xframe.api.service.imp.DSTService;
import com.hsk.xframe.api.utils.freeMarker.DoubleAndBigDecimal;
import com.hsk.exception.HSKDBException;
import com.hsk.exception.HSKException;
import com.hsk.angeldoctor.web.agent.service.*;
import com.hsk.angeldoctor.api.persistence.*;
import com.hsk.angeldoctor.api.daobbase.*;


/** 
  agent业务操作实现类 
 * @author  作者:admin
 * @version  版本信息:v1.0   创建时间: 2018-08-14 13:31:11
 */
 
@Service
public class  AgBusinessUserService extends DSTService implements IAgBusinessUserService {	
   /**
   *业务处理dao类  agBusinessUserDao 
   */
	@Autowired
	protected IAgBusinessUserDao agBusinessUserDao;
	@Autowired
	protected	ISysUserInfoDao sysUserInfoDao;
	@Autowired
	protected IAgAgentInfoDao agAgentInfoDao;
	@Autowired
	private IAgMoneyCountDao agMoneyCountDao;
	@Autowired
	protected IAgIntegralInfoDao agIntegralInfoDao;
	@Autowired
	private IAgWechatInfoDao agWechatInfoDao;
	@Autowired
	private IAgOrderInfoDao agOrderInfoDao;

 /**
	 * 根据ag_business_user表主键删除AgBusinessUser对象记录
     * @param  agentId  Integer类型(ag_business_user表主键)
	 * @return SysRetrunMessage 对象记录
	 * @throws HSKException
	 */

	public SysRetrunMessage findFormObject(Integer agentId) throws HSKException{
	        SysRetrunMessage srm=new SysRetrunMessage(1l);
			  	
			try{
		   			AgBusinessUser     att_AgBusinessUser= agBusinessUserDao.findAgBusinessUserById( agentId) ;
					srm.setObj(att_AgBusinessUser);
				} catch (HSKDBException e) {
					e.printStackTrace(); 
					srm.setCode(0l);
					srm.setMeg(e.getMessage()); 
				}
				 return srm ;
	} 

    /**
	 * 根据ag_business_user表主键删除AgBusinessUser对象记录
     * @param  agentId  Integer类型(ag_business_user表主键)
	 * @throws HSKException
	 */

	public AgBusinessUser findObject(Integer agentId) throws HSKException{
			AgBusinessUser  att_AgBusinessUser=new AgBusinessUser();		
			try{
		        att_AgBusinessUser= agBusinessUserDao.findAgBusinessUserById( agentId) ;
				} catch (HSKDBException e) {
					e.printStackTrace(); 
					throw new  HSKException(e);
				}
				return  att_AgBusinessUser;
	}
	
	 
	 /**
	 * 根据ag_business_user表主键删除AgBusinessUser对象记录
     * @param  agentId  Integer类型(ag_business_user表主键)
     * @return SysRetrunMessage 对象记录
	 * @throws HSKException
	 */
	public SysRetrunMessage deleteObject(Integer agentId) throws HSKException{  
		    SysRetrunMessage srm=new SysRetrunMessage(1l);
		   try{ 
			   AgBusinessUser att_AgBusinessUser = agBusinessUserDao.findAgBusinessUserById(agentId);
			   att_AgBusinessUser.setStatus("1");
			   SysUserInfo updateUser = new  SysUserInfo();
		  		updateUser.setUserType(5);
		  		updateUser.setSroleId(att_AgBusinessUser.getAgentId());
		  		updateUser=(SysUserInfo) this.getOne(updateUser);
		  		if(updateUser!=null){
		  			updateUser.setState(1);
		  			sysUserInfoDao.saveUser(updateUser);
		  		}
			   agBusinessUserDao.saveOrUpdateAgBusinessUser(att_AgBusinessUser);
			 } catch (Exception e) {
					e.printStackTrace(); 
					throw new  HSKException(e);
		     }
		   return srm;  
	}
	
	/**
	 * 根据ag_business_user表主键删除多条AgBusinessUser对象记录
     * @param  AgentIds  Integer类型(ag_business_user表主键)
     * @return SysRetrunMessage 对象记录
	 * @throws HSKException
	 */
	public SysRetrunMessage deleteAllObject(String agentIds) throws HSKException{
		SysRetrunMessage srm = new SysRetrunMessage(1l);
		try {
			String[] ids = agentIds.split(",");
			for (String did : ids) {
				if (did != null && !"".equals(did.trim())) {
					agBusinessUserDao.deleteAgBusinessUserById(Integer
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
	public SysRetrunMessage saveOrUpdateObject( AgBusinessUser att_AgBusinessUser) throws HSKException{
		SysRetrunMessage srm = new SysRetrunMessage(1l);
		  try{
			  agBusinessUserDao.saveOrUpdateAgBusinessUser(att_AgBusinessUser); 
			  srm.setObj(att_AgBusinessUser);
		    } catch (Exception e) {
				e.printStackTrace(); 
				throw new HSKException(e);
	        }
		return srm;	  
	}
	
	 /**
	 * 新增或修改ag_business_user表记录 ,如果ag_business_user表主键AgBusinessUser.AgentId为空就是添加，如果非空就是修改
     * @param  att_AgBusinessUser  AgBusinessUser类型(ag_business_user表记录)
     * @return AgBusinessUser  修改后的AgBusinessUser对象记录
	 * @throws HSKDBException
	 */
	public SysRetrunMessage saveOrUpdateAgBusinessUser( AgBusinessUser att_AgBusinessUser) throws HSKException{
			 SysRetrunMessage srm = new SysRetrunMessage(1l);
			  try{
				  	//手机号不允许重复
				  	AgBusinessUser checkInfo = new AgBusinessUser();
				  	checkInfo.setMobile(att_AgBusinessUser.getMobile());
					List<AgBusinessUser> checkList = agBusinessUserDao.getListByAgBusinessUser(checkInfo);
					if(checkList !=null && checkList.size() >0){
						boolean isSec=false;
					  	if(att_AgBusinessUser.getAgentId()!=null){
					  		for(AgBusinessUser xInfo : checkList){
						  		if(xInfo.getAgentId().equals(att_AgBusinessUser.getAgentId()))
						  			checkInfo=xInfo;
						  		else
						  			isSec=true;
						  	}
					  	}else
					  		isSec=true;
					  	if(isSec){
					  		srm.setCode(0l);
						    srm.setMeg("手机号已被占用！");
						    return srm;
					  	}
					 }
				  	if(att_AgBusinessUser.getAgentId()!=null){
				  		SysUserInfo updateUser = new  SysUserInfo();
				  		updateUser.setUserType(5);
				  		updateUser.setSroleId(att_AgBusinessUser.getAgentId());
				  		updateUser=(SysUserInfo) this.getOne(updateUser);
				  		if(updateUser!=null){
				  			updateUser.setPhoneNumber(att_AgBusinessUser.getMobile());
				  			updateUser.setUserName(att_AgBusinessUser.getName());
				  			sysUserInfoDao.saveUser(updateUser);
				  		}
				  		if(checkInfo==null || checkInfo.getAgentId()==null)
				  			checkInfo= agBusinessUserDao.findAgBusinessUserById(att_AgBusinessUser.getAgentId());
				  		checkInfo.setMobile(att_AgBusinessUser.getMobile());
				  		checkInfo.setName(att_AgBusinessUser.getName());
				  		agBusinessUserDao.saveOrUpdateAgBusinessUser(checkInfo); 
				  	}else{
				  		if(this.getUserType()==4){//如果当前登陆人为代理商
				  			att_AgBusinessUser.setAaiId(this.GetOneSessionAccount().getSroleId());
				  		}else if(this.getUserType()==5){//如果当前登陆人为业务员
				  			att_AgBusinessUser.setParentAgentId(this.GetOneSessionAccount().getSroleId());
				  			//查看是否需要给与积分
				  			AgBusinessUser agBusinessUser1 = new AgBusinessUser();
				  			agBusinessUser1.setParentAgentId(this.GetOneSessionAccount().getSroleId());
				  			agBusinessUser1.setStatus("0");
				  			List<AgBusinessUser> xlist = agBusinessUserDao.getListByAgBusinessUser(agBusinessUser1);
				  			if(xlist!=null && xlist.size()>=38 && xlist.size() <40){//当下级会员数量再38-40之间的时候给与积分
				  				AgIntegralInfo att_AgIntegralInfo = new AgIntegralInfo();
				  				att_AgIntegralInfo.setSuiId(this.GetOneSessionAccount().getSroleId());
				  				att_AgIntegralInfo.setUserType("1");
				  				att_AgIntegralInfo.setSource("3");
				  				att_AgIntegralInfo.setComment("增加有效的下级业务员!");
				  				att_AgIntegralInfo.setCreateDate(new Date());
				  				att_AgIntegralInfo.setCount(500);//给与500积分
				  				att_AgIntegralInfo.setStatus("0");
				  				agIntegralInfoDao.saveAgIntegralInfo(att_AgIntegralInfo);
								AgMoneyCount att_AgMoneyCount =new AgMoneyCount();
								att_AgMoneyCount.setSuiId(att_AgIntegralInfo.getSuiId());
								att_AgMoneyCount.setAmcType("3");
								att_AgMoneyCount.setIntegralCount(att_AgIntegralInfo.getCount());
								agMoneyCountDao.updateAgMoneyCount(att_AgMoneyCount);
				  			}
				  		}
				  		if(att_AgBusinessUser.getParentAgentId()!=null){
				  			AgBusinessUser parent_AgBusinessUser=agBusinessUserDao.findAgBusinessUserById(att_AgBusinessUser.getParentAgentId());
				  			if(parent_AgBusinessUser.getTopPrimaryAgentId()!=null){
				  				att_AgBusinessUser.setTopPrimaryAgentName(parent_AgBusinessUser.getTopPrimaryAgentName());
					  			att_AgBusinessUser.setTopPrimaryAgentId(parent_AgBusinessUser.getTopPrimaryAgentId());
				  			}else{
				  				att_AgBusinessUser.setTopPrimaryAgentName(parent_AgBusinessUser.getName());
					  			att_AgBusinessUser.setTopPrimaryAgentId(parent_AgBusinessUser.getAgentId());
				  			}
				  			
				  			att_AgBusinessUser.setAaiId(parent_AgBusinessUser.getAaiId());
				  		}
				  		att_AgBusinessUser.setCreateDate(new Date());
				  		att_AgBusinessUser.setStatus("0");
				  		agBusinessUserDao.saveOrUpdateAgBusinessUser(att_AgBusinessUser); 
				  		SysUserInfo newUser = new SysUserInfo();
						newUser.setUserName(att_AgBusinessUser.getName());
						newUser.setUserType(5);
						newUser.setSroleId(att_AgBusinessUser.getAgentId());
						newUser.setPhoneNumber(att_AgBusinessUser.getMobile());
						newUser.setState(0);
						newUser.setCreateDate(new Date());
						sysUserInfoDao.saveUser(newUser);
				  	}
					
					srm.setObj(att_AgBusinessUser);
			    } catch (Exception e) {
					e.printStackTrace(); 
					throw new HSKException(e);
		        }
			return srm;	  
	}
	
	 
	/**
	 *根据AgBusinessUser对象作为对(ag_business_user表进行查询，获取分页对象
     * @param  att_AgBusinessUser  AgBusinessUser类型(ag_business_user表记录)
     * @return PagerModel  分页对象
	 * @throws HSKException 
	 */
	public PagerModel getPagerModelObject (AgBusinessUser att_AgBusinessUser) throws HSKException{
		PagerModel pm=new PagerModel(new ArrayList<AgBusinessUser>());
			  try{
				  	att_AgBusinessUser.setTab_order("agentId desc");
					pm=agBusinessUserDao.getPagerModelByAgBusinessUser(att_AgBusinessUser);
			    } catch (Exception e) {
					e.printStackTrace(); 
		        }
		return pm;
	}

	@Override
	public PagerModel getReservedAgentPagerModel(String createDateStart, String createDateEnd, String mobile,
			String name, String parentAgentName, String topReservedAgentName, String topReservedAgentRelateToName)
			throws HSKException {
		PagerModel pm=new PagerModel(new ArrayList<AgBusinessUser>());
		  try{
			  AgBusinessUser att_AgBusinessUser = new AgBusinessUser();
			  att_AgBusinessUser.setMobile(mobile);
			  att_AgBusinessUser.setName(name);
			  att_AgBusinessUser.setTab_order("agentId desc");
			  //设置开始时间结束时间
			  SimpleDateFormat sdf =new SimpleDateFormat("yyyy-MM-dd");
			  if(createDateStart!=null && !createDateStart.trim().equals(""))
				att_AgBusinessUser.setCreateDate_start(sdf.parse(createDateStart));
			  if(createDateEnd!=null && !createDateEnd.trim().equals(""))
				att_AgBusinessUser.setCreateDate_end(sdf.parse(createDateEnd));
			  att_AgBusinessUser.setTab_like("name,mobile");
			  boolean flag=true;
			  if(parentAgentName!=null && !parentAgentName.trim().equals("")){
				  AgBusinessUser user=new AgBusinessUser();
				  user.setName(parentAgentName);
				  user.setTab_like("name"); 
				  user.setAaiIdType("2");
				  List<AgBusinessUser> userList = agBusinessUserDao.getListByAgBusinessUser(user);
				  if(userList!=null && userList.size() >0){
					  String parentAgentIds="";
					  for(AgBusinessUser ag : userList)
						  parentAgentIds+=ag.getAgentId()+",";
					  parentAgentIds=parentAgentIds.substring(0, parentAgentIds.length()-1);
					  att_AgBusinessUser.setParentAgentId_str(parentAgentIds);
				  }else
					  flag=false;
			  }
			  if((topReservedAgentName !=null && !topReservedAgentName.trim().equals("")) || (topReservedAgentRelateToName !=null && !topReservedAgentRelateToName.trim().equals(""))){
				  AgAgentInfo att_AgAgentInfo=new AgAgentInfo();
				  att_AgAgentInfo.setName(topReservedAgentName);
				  att_AgAgentInfo.setReservedRelateToTeamName(topReservedAgentRelateToName);
				  att_AgAgentInfo.setTab_like("name,reservedRelateToTeamName");
				  List<AgAgentInfo> agentList=agAgentInfoDao.getListByAgAgentInfo(att_AgAgentInfo);
				  if(agentList!=null && agentList.size()>0){
					  String aaiIds="";
					  for(AgAgentInfo info: agentList)
						  aaiIds+=info.getAaiId()+",";
					  aaiIds=aaiIds.substring(0, aaiIds.length()-1);
					  att_AgBusinessUser.setAaiId_str(aaiIds);
				  }else
					  flag=false;
			  }
			  if(flag)
				  pm=agBusinessUserDao.getPagerModelByAgBusinessUser(att_AgBusinessUser);
		    } catch (Exception e) {
				e.printStackTrace(); 
	        }
		  return pm;
	}

	@Override
	public PagerModel getPrimaryPagerModel(String createDateStart, String createDateEnd, String mobile, String name)
			throws HSKException {
		PagerModel pm=new PagerModel(new ArrayList<AgBusinessUser>());
		  try{
			  AgBusinessUser att_AgBusinessUser = new AgBusinessUser();
			  att_AgBusinessUser.setMobile(mobile);
			  att_AgBusinessUser.setName(name);
			  //设置开始时间结束时间
			  SimpleDateFormat sdf =new SimpleDateFormat("yyyy-MM-dd");
			  if(createDateStart!=null && !createDateStart.trim().equals(""))
				att_AgBusinessUser.setCreateDate_start(sdf.parse(createDateStart));
			  if(createDateEnd!=null && !createDateEnd.trim().equals(""))
				att_AgBusinessUser.setCreateDate_end(sdf.parse(createDateEnd));
			  //初代业务员：上级业务员ID为空，代理商id为空
			  att_AgBusinessUser.setParentAgentIdType("1");
			  att_AgBusinessUser.setAaiIdType("1");
			  att_AgBusinessUser.setTab_like("name,mobile");
			  att_AgBusinessUser.setTab_order("agentId desc");
			  pm=agBusinessUserDao.getPagerModelByAgBusinessUser(att_AgBusinessUser);
		    } catch (Exception e) {
				e.printStackTrace(); 
	        }
		  return pm;
	}

	@Override
	public PagerModel getPrimaryAgentsPagerModel(String createDateStart, String createDateEnd, String mobile,
			String name, String parentAgentName, String topPrimaryAgentName) throws HSKException {
		  PagerModel pm=new PagerModel(new ArrayList<AgBusinessUser>());
		  try{
			  AgBusinessUser att_AgBusinessUser = new AgBusinessUser();
			  att_AgBusinessUser.setMobile(mobile);
			  att_AgBusinessUser.setName(name);
			  att_AgBusinessUser.setTab_order("agentId desc");
			  //设置开始时间结束时间
			  SimpleDateFormat sdf =new SimpleDateFormat("yyyy-MM-dd");
			  if(createDateStart!=null && !createDateStart.trim().equals(""))
				att_AgBusinessUser.setCreateDate_start(sdf.parse(createDateStart));
			  if(createDateEnd!=null && !createDateEnd.trim().equals(""))
				att_AgBusinessUser.setCreateDate_end(sdf.parse(createDateEnd));
			  //业务员：上级业务员ID不为空，代理商id为空
			  att_AgBusinessUser.setParentAgentIdType("2");
			  att_AgBusinessUser.setAaiIdType("1");
			  att_AgBusinessUser.setTopPrimaryAgentName(topPrimaryAgentName);
			  att_AgBusinessUser.setTab_like("name,mobile,topPrimaryAgentName");
			  boolean flag=true;
			  if(parentAgentName!=null && !parentAgentName.trim().equals("")){
				  AgBusinessUser user=new AgBusinessUser();
				  user.setName(parentAgentName);
				  user.setTab_like("name"); 
				  user.setParentAgentIdType("2");
				  user.setAaiIdType("1");
				  List<AgBusinessUser> userList = agBusinessUserDao.getListByAgBusinessUser(user);
				  if(userList!=null && userList.size() >0){
					  String parentAgentIds="";
					  for(AgBusinessUser ag : userList)
						  parentAgentIds+=ag.getAgentId()+",";
					  parentAgentIds=parentAgentIds.substring(0, parentAgentIds.length()-1);
					  att_AgBusinessUser.setParentAgentId_str(parentAgentIds);
				  }else
					  flag=false;
			  }
			  if(flag)
				  pm=agBusinessUserDao.getPagerModelByAgBusinessUser(att_AgBusinessUser);
		    } catch (Exception e) {
				e.printStackTrace(); 
	        }
		  return pm;
	}

	@Override
	public PagerModel getReservedPagerModel(String createDateStart, String createDateEnd, String name)
			throws HSKException {
		 PagerModel pm=new PagerModel(new ArrayList<AgBusinessUser>());
		  try{
			  AgBusinessUser att_AgBusinessUser = new AgBusinessUser();
			  att_AgBusinessUser.setName(name);
			  att_AgBusinessUser.setTab_order("agentId desc");
			  //设置开始时间结束时间
			  SimpleDateFormat sdf =new SimpleDateFormat("yyyy-MM-dd");
			  if(createDateStart!=null && !createDateStart.trim().equals(""))
				att_AgBusinessUser.setCreateDate_start(sdf.parse(createDateStart));
			  if(createDateEnd!=null && !createDateEnd.trim().equals(""))
				att_AgBusinessUser.setCreateDate_end(sdf.parse(createDateEnd));
			  //业务员：上级业务员ID不为空，代理商id为空
			  att_AgBusinessUser.setTab_like("name");
			  att_AgBusinessUser.setAaiId(this.GetOneSessionAccount().getSroleId());//当前登陆人的代理商ID
			  pm=agBusinessUserDao.getPagerModelByAgBusinessUser(att_AgBusinessUser);
			  
		    } catch (Exception e) {
				e.printStackTrace(); 
	        }
		  return pm;
	}

	@Override
	public PagerModel getMyAgentPagerModel(String name) throws HSKException {
		PagerModel pm=new PagerModel(new ArrayList<AgBusinessUser>());
		  try{
			  AgBusinessUser att_AgBusinessUser = new AgBusinessUser();
			  att_AgBusinessUser.setName(name);
			  att_AgBusinessUser.setTab_order("agentId desc");
			  //业务员：上级业务员ID不为空，代理商id为空
			  att_AgBusinessUser.setTab_like("name");
			  att_AgBusinessUser.setParentAgentId(this.GetOneSessionAccount().getSroleId());//当前登陆人的代理商ID
			  pm=agBusinessUserDao.getPagerModelByAgBusinessUser(att_AgBusinessUser);
		    } catch (Exception e) {
				e.printStackTrace(); 
	        }
		  return pm;
	}

	@Override
	public PagerModel getBusinessCount(String name, String mobile, String filterKey, String filterStartDate,String filterEndDate,Integer belongingId) throws HSKException {
		PagerModel pm=new PagerModel();
		try{
			List<Map<String,Object>> reList = new ArrayList<Map<String,Object>>();
			AgBusinessUser att_AgBusinessUser = new AgBusinessUser();
			att_AgBusinessUser.setMobile(mobile);
			att_AgBusinessUser.setName(name);
			//初代业务员：上级业务员ID为空，代理商id为空
			att_AgBusinessUser.setParentAgentIdType("1");
			if(belongingId==null)
				att_AgBusinessUser.setAaiId(this.GetOneSessionAccount().getSroleId());//当前登陆人的代理商ID
			else{
				att_AgBusinessUser.setAaiId(belongingId);//当前登陆人的代理商ID
				att_AgBusinessUser.setAgentType("1,2");
			}
				
			att_AgBusinessUser.setTab_like("name,mobile");
			att_AgBusinessUser.setTab_order("agentId desc");
			PagerModel pm2=agBusinessUserDao.getPagerModelByAgBusinessUser(att_AgBusinessUser);
			if(pm2 !=null && pm2.getRows()!=null && pm2.getRows().size() >0){
				List<AgBusinessUser> att_List = new ArrayList<AgBusinessUser>();
				String agentIds="";
				for(Object obj:pm2.getRows()){
					AgBusinessUser info = (AgBusinessUser)obj;
					att_List.add(info);
					agentIds+=info.getAgentId()+",";
				}
				agentIds=agentIds.substring(0, agentIds.length()-1);
				//查询所有患者数据  
				AgWechatInfo att_AgWechatInfo = new AgWechatInfo();
				att_AgWechatInfo.setSceneId_str(agentIds);
				List<AgWechatInfo> wechatList = agWechatInfoDao.getListByAgWechatInfo(att_AgWechatInfo);
				//查询待约数据
				List<Map<String, Object>> achievementList= agOrderInfoDao.getAgentAchievementList(agentIds,filterKey,filterStartDate,filterEndDate);
				for(AgBusinessUser info :att_List){
					Map<String,Object> reMap= new HashMap<String,Object>();
					reMap.put("id", info.getAaiId());//业务员ID
					reMap.put("name", info.getName());//业务员姓名
					reMap.put("mobile", info.getMobile());//手机号
					reMap.put("reservedProvId", info.getReservedProvId());//负责省
					reMap.put("reservedCityId", info.getReservedCityId());//负责市
					reMap.put("parentAgentName", "");//上级代理人
					reMap.put("belongingsCount", info.getBelongingsCount());//员工数量
					reMap.put("directBelongingsCount", info.getDirectBelongingsCount());//发展下线数量
					Integer scenesCount=0;//患者数量
					Integer boundCount=0;//绑定数量
					if(wechatList!=null && wechatList.size() >0){
						for(AgWechatInfo wInfo:wechatList){
							if(wInfo.getSceneId().equals(info.getAgentId())){
								scenesCount++;
								if(wInfo.getPatientId()!=null)
									boundCount++;
							}
						}
					}
					reMap.put("scenesCount", scenesCount);//患者数量
					reMap.put("boundCount", boundCount);//绑定数量
					Integer registrationsCount=0;//待约人次
					Double totalFree=0d;//业绩总额
					Double totalDrugFee=0d;//药费总额
					Double totalTreatmentFee=0d;//医疗费总额
					if(achievementList !=null && achievementList.size() >0){
						for(Map<String, Object> map: achievementList){
							if(map.get("agent_id").toString().equals(info.getAgentId().toString())){
								if(map.get("shu")!=null)
									registrationsCount=Integer.parseInt(map.get("shu").toString());
								if(map.get("total_free")!=null)
									totalFree=Double.parseDouble(map.get("total_free").toString());
								if(map.get("treatment_fee")!=null)
									totalDrugFee=Double.parseDouble(map.get("treatment_fee").toString());
								if(map.get("drug_fee")!=null)
									totalTreatmentFee=Double.parseDouble(map.get("drug_fee").toString());
							}
						}
					}
					reMap.put("registrationsCount",registrationsCount);//待约人次
					reMap.put("totalFree",totalFree);//业绩总额
					reMap.put("totalDrugFee",totalDrugFee);//药费总额
					reMap.put("totalTreatmentFee",totalTreatmentFee);//医疗费总额
					reList.add(reMap);
				}
				
			}
			pm.setItems(reList);
			pm.setRows(reList);
			pm.setTotal(pm2.getTotal());
			pm.setTotalCount(pm2.getTotalCount());
		}catch(Exception e){
			e.printStackTrace();
		}
		return pm;
	}

	@Override
	public PagerModel getDirectBusinessCount(String name, String mobile) throws HSKException {
		PagerModel pm=new PagerModel();
		try{
			List<Map<String,Object>> reList = new ArrayList<Map<String,Object>>();
			AgBusinessUser att_AgBusinessUser = new AgBusinessUser();
			att_AgBusinessUser.setMobile(mobile);
			att_AgBusinessUser.setName(name);
			//初代业务员：上级业务员ID为空，代理商id为空
			att_AgBusinessUser.setParentAgentIdType("1");
			att_AgBusinessUser.setAaiId(this.GetOneSessionAccount().getSroleId());//当前登陆人的代理商ID
			att_AgBusinessUser.setTab_like("name,mobile");
			att_AgBusinessUser.setTab_order("agentId desc");
			PagerModel pm2=agBusinessUserDao.getPagerModelByAgBusinessUser(att_AgBusinessUser);
			if(pm2 !=null && pm2.getRows()!=null && pm2.getRows().size() >0){
				List<AgBusinessUser> att_List = new ArrayList<AgBusinessUser>();
				String agentIds="";
				for(Object obj:pm2.getRows()){
					AgBusinessUser info = (AgBusinessUser)obj;
					att_List.add(info);
					agentIds+=info.getAgentId()+",";
				}
				agentIds=agentIds.substring(0, agentIds.length()-1);
				//查询所有患者数据  
				AgWechatInfo att_AgWechatInfo = new AgWechatInfo();
				att_AgWechatInfo.setSceneId_str(agentIds);
				List<AgWechatInfo> wechatList = agWechatInfoDao.getListByAgWechatInfo(att_AgWechatInfo);
				//查询待约数据
				Map<String, List<Map<String, Object>>> achievementMap = agOrderInfoDao.getDirectAgentAchievementList(agentIds);
				List<Map<String,Object>> dyrcList=achievementMap.get("dyrc");
				List<Map<String,Object>> dyrsList=achievementMap.get("dyrs");
				List<Map<String,Object>> dyjzList=achievementMap.get("dyjz");
				List<Map<String,Object>> yyrcList=achievementMap.get("yyrc");
				List<Map<String,Object>> yyrsList=achievementMap.get("yyrs");
				List<Map<String,Object>> yyjzList=achievementMap.get("yyjz");
				for(AgBusinessUser info :att_List){
					Map<String,Object> reMap= new HashMap<String,Object>();
					reMap.put("id", info.getAaiId());//业务员ID
					reMap.put("name", info.getName());//业务员姓名
					reMap.put("mobile", info.getAaiId());//手机号
					reMap.put("reservedProvId", info.getReservedProvId());//负责省
					reMap.put("reservedCityId", info.getReservedCityId());//负责市
					reMap.put("parentAgentName", "");//上级代理人
					reMap.put("belongingsCount", info.getBelongingsCount());//员工数量
					reMap.put("directBelongingsCount", info.getDirectBelongingsCount());//发展下线数量
					Integer scenesCount=0;//患者数量
					Integer boundCount=0;//绑定数量
					if(wechatList!=null && wechatList.size() >0){
						for(AgWechatInfo wInfo:wechatList){
							if(wInfo.getSceneId().equals(info.getAgentId())){
								scenesCount++;
								if(wInfo.getPatientId()!=null)
									boundCount++;
							}
						}
					}
					reMap.put("scenesCount", scenesCount);//患者数量
					reMap.put("boundCount", boundCount);//绑定数量
					
					Integer agentRegistrationsCount=0;//累计代约人次
					Integer agentRegistrationsPatientCount=0;//累计代约人数
					Integer agentRegistrationsOrderCount=0;//累计代约结诊人次
					Double agentRegistrationsTotalFee=0d;//累计待约总额
					Double agentRegistrationsTotalDrugFee=0d;//累计代约药费总额
					Double agentRegistrationsTotalTreatmentFee=0d;//累计代约诊疗费总额
					Integer sceneRegistrationsCount=0;//累计预约人次
					Integer sceneRegistrationsPatientCount=0;//累计预约人数
					Integer sceneRegistrationsOrderCount=0;//累计预约结诊人次
					Double sceneRegistrationsTotalFee=0d;//累计预约总额
					Double sceneRegistrationsTotalDrugFee=0d;//累计预约药费总额
					Double sceneRegistrationsTotalTreatmentFee=0d;//累计预约诊疗费总额
					if(dyrcList !=null && dyrcList.size()>0){
						for(Map<String,Object> map : dyrcList){
							if(map.get("agent_id").toString().equals(info.getAgentId()+"")){
								agentRegistrationsCount=Integer.parseInt(map.get("shu").toString());
								break;
							}
						}
					}
					if(dyrsList !=null && dyrsList.size()>0){
						for(Map<String,Object> map : dyrsList){
							if(map.get("agent_id").toString().equals(info.getAgentId()+"")){
								agentRegistrationsPatientCount=Integer.parseInt(map.get("shu").toString());
								break;
							}
						}
					}
					if(dyjzList !=null && dyjzList.size()>0){
						for(Map<String,Object> map : dyjzList){
							if(map.get("agent_id").toString().equals(info.getAgentId()+"")){
								agentRegistrationsOrderCount=Integer.parseInt(map.get("shu").toString());
								agentRegistrationsTotalTreatmentFee=Double.parseDouble(map.get("drug_fee").toString());
								agentRegistrationsTotalTreatmentFee=Double.parseDouble(map.get("treatment_fee").toString());
								break;
							}
						}
					}
					
					if(yyrcList !=null && yyrcList.size()>0){
						for(Map<String,Object> map : yyrcList){
							if(map.get("agent_id").toString().equals(info.getAgentId()+"")){
								sceneRegistrationsCount=Integer.parseInt(map.get("shu").toString());
								break;
							}
						}
					}
					if(yyrsList !=null && yyrsList.size()>0){
						for(Map<String,Object> map : yyrsList){
							if(map.get("agent_id").toString().equals(info.getAgentId()+"")){
								sceneRegistrationsPatientCount=Integer.parseInt(map.get("shu").toString());
								break;
							}
						}
					}
					if(yyjzList !=null && yyjzList.size()>0){
						for(Map<String,Object> map : yyjzList){
							if(map.get("agent_id").toString().equals(info.getAgentId()+"")){
								sceneRegistrationsPatientCount=Integer.parseInt(map.get("shu").toString());
								sceneRegistrationsTotalDrugFee=Double.parseDouble(map.get("drug_fee").toString());
								sceneRegistrationsTotalTreatmentFee=Double.parseDouble(map.get("treatment_fee").toString());
								break;
							}
						}
					}
					agentRegistrationsTotalFee=DoubleAndBigDecimal.add(agentRegistrationsTotalDrugFee, agentRegistrationsTotalTreatmentFee);
					sceneRegistrationsTotalFee=DoubleAndBigDecimal.add(sceneRegistrationsTotalDrugFee, sceneRegistrationsTotalTreatmentFee);
					reMap.put("agentRegistrationsCount", agentRegistrationsCount);
					reMap.put("agentRegistrationsPatientCount", agentRegistrationsPatientCount);
					reMap.put("agentRegistrationsOrderCount", agentRegistrationsOrderCount);
					reMap.put("agentRegistrationsTotalDrugFee", agentRegistrationsTotalDrugFee);
					reMap.put("agentRegistrationsTotalTreatmentFee", agentRegistrationsTotalTreatmentFee);
					reMap.put("sceneRegistrationsCount", sceneRegistrationsCount);
					reMap.put("agentRegistrationsTotalFee", agentRegistrationsTotalFee);
					reMap.put("sceneRegistrationsPatientCount", sceneRegistrationsPatientCount);
					reMap.put("sceneRegistrationsOrderCount", sceneRegistrationsOrderCount);
					reMap.put("sceneRegistrationsTotalFee", sceneRegistrationsTotalFee);
					reMap.put("sceneRegistrationsTotalDrugFee", sceneRegistrationsTotalDrugFee);
					reMap.put("sceneRegistrationsTotalTreatmentFee", sceneRegistrationsTotalTreatmentFee);
					reList.add(reMap);
				}
				
			}
			pm.setItems(reList);
			pm.setRows(reList);
			pm.setTotal(pm2.getTotal());
			pm.setTotalCount(pm2.getTotalCount());
		}catch(Exception e){
			e.printStackTrace();
		}
		return pm;
	} 
	 
}