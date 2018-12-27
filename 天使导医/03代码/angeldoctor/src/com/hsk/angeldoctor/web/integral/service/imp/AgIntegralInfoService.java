package com.hsk.angeldoctor.web.integral.service.imp;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hsk.angeldoctor.api.daobbase.IAgBusinessUserDao;
import com.hsk.angeldoctor.api.daobbase.IAgIntegralInfoDao;
import com.hsk.angeldoctor.api.daobbase.IAgIntegralOrderDao;
import com.hsk.angeldoctor.api.daobbase.IAgMoneyCountDao;
import com.hsk.angeldoctor.api.daobbase.IAgOrderInfoDao;
import com.hsk.angeldoctor.api.daobbase.IAgPatientInfoDao;
import com.hsk.angeldoctor.api.persistence.AgBusinessUser;
import com.hsk.angeldoctor.api.persistence.AgIntegralInfo;
import com.hsk.angeldoctor.api.persistence.AgIntegralOrder;
import com.hsk.angeldoctor.api.persistence.AgMoneyCount;
import com.hsk.angeldoctor.api.persistence.AgOrderView;
import com.hsk.angeldoctor.api.persistence.AgPatientInfo;
import com.hsk.angeldoctor.web.integral.service.IAgIntegralInfoService;
import com.hsk.exception.HSKDBException;
import com.hsk.exception.HSKException;
import com.hsk.supper.dto.comm.PagerModel;
import com.hsk.supper.dto.comm.SysRetrunMessage;
import com.hsk.supper.until.datetime.DateTime;
import com.hsk.xframe.api.service.imp.DSTService;


/** 
  integral业务操作实现类 
 * @author  作者:admin
 * @version  版本信息:v1.0   创建时间: 2018-08-14 13:41:32
 */
 
@Service
public class  AgIntegralInfoService extends DSTService implements IAgIntegralInfoService {	
   /**
   *业务处理dao类  agIntegralInfoDao 
   */
	@Autowired
	protected IAgIntegralInfoDao agIntegralInfoDao;
	@Autowired
	protected	IAgIntegralOrderDao agIntegralOrderDao;
	@Autowired
	private IAgMoneyCountDao agMoneyCountDao;
	@Autowired
	protected IAgPatientInfoDao agPatientInfoDao;
	@Autowired
	protected IAgBusinessUserDao agBusinessUserDao;
	@Autowired
	private IAgOrderInfoDao agOrderInfoDao;
 /**
	 * 根据ag_integral_info表主键删除AgIntegralInfo对象记录
     * @param  aiiId  Integer类型(ag_integral_info表主键)
	 * @return SysRetrunMessage 对象记录
	 * @throws HSKException
	 */

	public SysRetrunMessage findFormObject(Integer aiiId) throws HSKException{
	        SysRetrunMessage srm=new SysRetrunMessage(1l);
			  	
			try{
		   			AgIntegralInfo     att_AgIntegralInfo= agIntegralInfoDao.findAgIntegralInfoById( aiiId) ;
					srm.setObj(att_AgIntegralInfo);
				} catch (HSKDBException e) {
					e.printStackTrace(); 
					srm.setCode(0l);
					srm.setMeg(e.getMessage()); 
				}
				 return srm ;
	} 

    /**
	 * 根据ag_integral_info表主键删除AgIntegralInfo对象记录
     * @param  aiiId  Integer类型(ag_integral_info表主键)
	 * @throws HSKException
	 */

	public AgIntegralInfo findObject(Integer aiiId) throws HSKException{
			AgIntegralInfo  att_AgIntegralInfo=new AgIntegralInfo();		
			try{
		        att_AgIntegralInfo= agIntegralInfoDao.findAgIntegralInfoById( aiiId) ;
				} catch (HSKDBException e) {
					e.printStackTrace(); 
					throw new  HSKException(e);
				}
				return  att_AgIntegralInfo;
	}
	
	 
	 /**
	 * 根据ag_integral_info表主键删除AgIntegralInfo对象记录
     * @param  aiiId  Integer类型(ag_integral_info表主键)
     * @return SysRetrunMessage 对象记录
	 * @throws HSKException
	 */
	public SysRetrunMessage deleteObject(Integer aiiId) throws HSKException{  
		    SysRetrunMessage srm=new SysRetrunMessage(1l);
		   try{ 
				agIntegralInfoDao.deleteAgIntegralInfoById(aiiId);
			 } catch (Exception e) {
					e.printStackTrace(); 
					throw new  HSKException(e);
		     }
		   return srm;  
	}
	
	/**
	 * 根据ag_integral_info表主键删除多条AgIntegralInfo对象记录
     * @param  AiiIds  Integer类型(ag_integral_info表主键)
     * @return SysRetrunMessage 对象记录
	 * @throws HSKException
	 */
	public SysRetrunMessage deleteAllObject(String aiiIds) throws HSKException{
		SysRetrunMessage srm = new SysRetrunMessage(1l);
		try {
			String[] ids = aiiIds.split(",");
			for (String did : ids) {
				if (did != null && !"".equals(did.trim())) {
					agIntegralInfoDao.deleteAgIntegralInfoById(Integer
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
	 * 新增或修改ag_integral_info表记录 ,如果ag_integral_info表主键AgIntegralInfo.AiiId为空就是添加，如果非空就是修改
     * @param  att_AgIntegralInfo  AgIntegralInfo类型(ag_integral_info表记录)
     * @return AgIntegralInfo  修改后的AgIntegralInfo对象记录
	 * @throws HSKDBException
	 */
	public SysRetrunMessage saveOrUpdateObject( AgIntegralInfo att_AgIntegralInfo) throws HSKException{
			 SysRetrunMessage srm = new SysRetrunMessage(1l);
			  try{
					agIntegralInfoDao.saveOrUpdateAgIntegralInfo(att_AgIntegralInfo); 
					srm.setObj(att_AgIntegralInfo);
			    } catch (Exception e) {
					e.printStackTrace(); 
					throw new HSKException(e);
		        }
			return srm;	  
	}
	
	 
	/**
	 *根据AgIntegralInfo对象作为对(ag_integral_info表进行查询，获取分页对象
     * @param  att_AgIntegralInfo  AgIntegralInfo类型(ag_integral_info表记录)
     * @return PagerModel  分页对象
	 * @throws HSKException 
	 */
	public PagerModel getPagerModelObject (AgIntegralInfo att_AgIntegralInfo) throws HSKException{
		PagerModel pm=new PagerModel(new ArrayList<AgIntegralInfo>());
			  try{
					pm=agIntegralInfoDao.getPagerModelByAgIntegralInfo(att_AgIntegralInfo);
			    } catch (Exception e) {
					e.printStackTrace(); 
		        }
		return pm;
	}

	 
	public SysRetrunMessage savedoSign(Integer userId,String userType)
			throws HSKException {
		SysRetrunMessage srm = new SysRetrunMessage(1l);
		  try{
			  SimpleDateFormat sdf =new SimpleDateFormat("yyyy-MM-dd");
			  AgIntegralInfo att_search=new AgIntegralInfo ();		
			  att_search.setUserType(userType);//用户类型
			  att_search.setSource("1");//签到
			  att_search.setSuiId(userId);//用户ID
			  Date now=new Date();
			  att_search.setCreateDate_end(now); 
			  att_search.setCreateDate_start(now); 
			  att_search.setStatus("0");
			  List<AgIntegralInfo>  list= agIntegralInfoDao.getListByAgIntegralInfo(att_search);
			  if(list!=null&& list.size()>0){
				  srm.setObj(0l);
				  srm.setMeg("今天已经签过到了！");
			  }else {
				  att_search.setCount(15);//签到给15积分
				  att_search.setComment("签到");
				  att_search.setCreateDate(new Date());//创建时间
				  agIntegralInfoDao.saveOrUpdateAgIntegralInfo(att_search);
				  //增加总积分
				  AgMoneyCount agMoneyCount = new AgMoneyCount();
				  if(userType.equals("1")){//业务员
					  agMoneyCount.setSuiId(userId);
					  agMoneyCount.setAmcType("3");
				  }else if(userType.equals("2")){//患者
					  agMoneyCount.setSuiId(userId);
					  agMoneyCount.setAmcType("4");
				  }
				  agMoneyCount.setIntegralCount(att_search.getCount());
				  agMoneyCountDao.updateAgMoneyCount(agMoneyCount);
			  }
		    } catch (Exception e) {
				e.printStackTrace(); 
				throw new HSKException(e);
	        }
		return srm;	  
	} 
	@Override
	public List<AgIntegralInfo> getAgIntegralInfoList(AgIntegralInfo att_AgIntegralInfo) throws HSKException {
		List<AgIntegralInfo> reList=new ArrayList<AgIntegralInfo>();
		  try{
			  reList=agIntegralInfoDao.getListByAgIntegralInfo(att_AgIntegralInfo);
		    } catch (Exception e) {
				e.printStackTrace(); 
	        }
		  return reList;
	}

	 
	public SysRetrunMessage getCountInfo(AgIntegralInfo att_AgIntegralInfo)
			throws HSKException {
		SysRetrunMessage srm = new SysRetrunMessage(1l);
		Map<String ,Object > map_back=new HashMap<String,Object>();
		//获取当天任务 记录 
		 try{
			 List<AgIntegralInfo> reList=agIntegralInfoDao.getListByAgIntegralInfo(att_AgIntegralInfo);
			 Integer totalAccumulatePoints=0;
//						是否签到
			 boolean signed=false;
//					已经完成的项目
			 int	countTasks=0;
//					创建新的代约
			 boolean	agentCreated=false;
//				邀请新宣传员
			 boolean	registered=false;
//					邀请的新用户注册
			 boolean	patientInvited=false;
			 
			 if(reList!=null&&reList.size()>0){
				 for(AgIntegralInfo did:reList ){
					 totalAccumulatePoints+=did.getCount();
					 if("1".equals(did.getSource())){
						 signed=true;
					 }
					 if("2".equals(did.getSource())){
						 agentCreated=true;
					 }
					 if("3".equals(did.getSource())){
						 registered=true;
					 }
					 if("4".equals(did.getSource())){
						 patientInvited=true;
					 }
					 countTasks++;
				 }
			 } 
			 map_back.put("signed", signed);
			 map_back.put("countTasks", countTasks);
			 map_back.put("agentCreated", agentCreated);
			 map_back.put("registered", registered);
			 map_back.put("patientInvited", patientInvited); 
			 map_back.put("totalAccumulatePoints", totalAccumulatePoints); 
			 srm.setObj(map_back);
		    } catch (Exception e) {
				e.printStackTrace(); 
				srm.setCode(0l);
				srm.setMeg(e.getMessage());
	        } 
		return srm;
	} 
	
	public SysRetrunMessage getCountIntegral(AgIntegralInfo att_AgIntegralInfo)
			throws HSKException {
		SysRetrunMessage srm = new SysRetrunMessage(1l);
//		previousRanking	Int	前日积分排名
//		goodsAccumulatePointValue	Int	消费的积分
//		currentRanking	Int	目前积分排名
		Map<String ,Object > map_back=new HashMap<String,Object>();
		//获取当天任务 记录 
		 try{
			 List<AgIntegralInfo> reList=agIntegralInfoDao.getListByAgIntegralInfo(att_AgIntegralInfo); 
			 map_back.put("series", reList);
			 AgIntegralInfo att_search=new  AgIntegralInfo ();
			 att_search.setCreateDate_start(DateTime.after(new Date(),-2)  );
			 att_search.setCreateDate_end(DateTime.after(new Date(),-1));
			 att_search.setSuiId(att_AgIntegralInfo.getSuiId());
			 map_back.put("previousRanking",  agIntegralInfoDao.getOrderNum( att_search)); 
			 
			 att_search=new  AgIntegralInfo ();
			 att_search.setCreateDate_start(new Date());
			 att_search.setCreateDate_end(DateTime.after(att_search.getCreateDate_start(),1) );
			 att_search.setSuiId(att_AgIntegralInfo.getSuiId());
			 map_back.put("currentRanking",  agIntegralInfoDao.getOrderNum( att_search)); 
			  
			 Integer registered=0;
			 AgIntegralOrder att_AgIntegralOrder=new AgIntegralOrder();
			 List<AgIntegralOrder> list_obj= this.agIntegralOrderDao.getListByAgIntegralOrder(  att_AgIntegralOrder);
			 for(AgIntegralOrder did:list_obj){ 
				 registered+=(did.getGoodsAccumulatePointValue()!=null?did.getGoodsAccumulatePointValue():0);
			 } 
			 map_back.put("goodsAccumulatePointValue", registered); 
			 srm.setObj(map_back);
		    } catch (Exception e) {
				e.printStackTrace(); 
				srm.setCode(0l);
				srm.setMeg(e.getMessage());
	        } 
		return srm;
	}

	@Override
	public SysRetrunMessage addShareIntegral(AgIntegralInfo att_AgIntegralInfo) throws HSKException {
		SysRetrunMessage srm = new SysRetrunMessage(1l);
		att_AgIntegralInfo.setSource("5");
		att_AgIntegralInfo.setCreateDate_start(new Date());
		att_AgIntegralInfo.setCreateDate_end(new Date());
		att_AgIntegralInfo.setStatus("0");
		try {
			List<AgIntegralInfo> checkList = agIntegralInfoDao.getListByAgIntegralInfo(att_AgIntegralInfo);
			if(checkList!= null && checkList.size()>2){
				srm.setCode(0l);
				srm.setMeg("已经分享过两次，本次分享没有积分");
			}else{
				att_AgIntegralInfo.setCount(10);
				att_AgIntegralInfo.setCreateDate(new Date());
				att_AgIntegralInfo.setComment("分享文章获得积分!");
				agIntegralInfoDao.saveAgIntegralInfo(att_AgIntegralInfo);
				AgMoneyCount att_AgMoneyCount =new AgMoneyCount();
				att_AgMoneyCount.setSuiId(att_AgIntegralInfo.getSuiId());
				att_AgMoneyCount.setAmcType("4");
				att_AgMoneyCount.setIntegralCount(att_AgIntegralInfo.getCount());
				agMoneyCountDao.updateAgMoneyCount(att_AgMoneyCount);
			}
		} catch (HSKDBException e) {
			e.printStackTrace();
		}
		return srm;
	}

	@Override
	public SysRetrunMessage getPatientCountInfo(Integer patientId) throws HSKException {
		//获取每日积分任务信息：“今日积分totalAccumulatePoints”、今日是否分享shared,今日是否预约registered,今日是否消费charged,是否绑定bound,是否签到signed
		SysRetrunMessage srm =new SysRetrunMessage(1l);
		try{
			AgIntegralInfo att_AgIntegralInfo = new AgIntegralInfo();
			att_AgIntegralInfo.setSuiId(patientId);
			att_AgIntegralInfo.setUserType("2");
			att_AgIntegralInfo.setCreateDate_start(new Date());
			att_AgIntegralInfo.setCreateDate_end(new Date());
			List<AgIntegralInfo> list = agIntegralInfoDao.getListByAgIntegralInfo(att_AgIntegralInfo);
			int totalAccumulatePoints=0;//今日几分熟
			boolean signed=false;//是否签到
			boolean shared=false;//是否分享
			boolean registered=false;//是否待约
			boolean charged=false;//是否消费
			boolean bound=false;//是否绑定
			Integer totalTasks=0;
			
			if(list !=null && list.size() >0){
				for(AgIntegralInfo info :list){
					totalAccumulatePoints+=info.getCount();
					if(info.getSource().equals("1"))
						signed=true;
					else if(info.getSource().equals("5"))
						shared=true;
					else if(info.getSource().equals("2"))
						registered=true;
				}
			}
			if(signed)
				 totalTasks++;
			 if(shared)
				 totalTasks++;
			 if(registered)
				 totalTasks++;
			//查询是否绑定
			AgPatientInfo agPatientInfo = agPatientInfoDao.findAgPatientInfoById(patientId);
			if(agPatientInfo !=null && agPatientInfo.getMobile()!=null && !agPatientInfo.getMobile().trim().equals(""))
				bound=true;
			//查询是否消费
			AgIntegralOrder att_AgIntegralOrder=new AgIntegralOrder();
			att_AgIntegralOrder.setSuiId(patientId);
			att_AgIntegralOrder.setUserType("2");
			att_AgIntegralOrder.setCreateDate_start(new Date());
			att_AgIntegralOrder.setCreateDate_end(new Date());
			att_AgIntegralOrder.setStatus("0");
			List<AgIntegralOrder> list_obj= this.agIntegralOrderDao.getListByAgIntegralOrder(  att_AgIntegralOrder);
			if(list_obj!=null && list_obj.size() >0)
				charged=true;
			Map<String,Object> reMap =new HashMap<String,Object>();
			reMap.put("totalAccumulatePoints", totalAccumulatePoints);
			reMap.put("signed", signed);
			reMap.put("shared", shared);
			reMap.put("registered", registered);
			reMap.put("charged", charged);
			reMap.put("bound", bound);
			reMap.put("totalTasks", totalTasks);
			srm.setObj(reMap);
		}catch (HSKDBException e) {
			srm.setCode(0l);
			e.printStackTrace();
		}
		return srm;
	}

	@Override
	public SysRetrunMessage getAgentBussCount(Integer agentId) throws HSKException {
		SysRetrunMessage srm = new SysRetrunMessage(1l);
		Map<String ,Object > map_back=new HashMap<String,Object>();
		//获取当天任务 记录 
		 try{
			 int patientsCount=0;//患者总数
			 int agentCount=0;//下级业务员总数
			 double shareAmount=0d;//总分润额
			 double remainingAmount=0d;//剩余金额
			 int totalAccumulatePoints=0;//积分总数
			 int totalTasks=4;//当日任务完成数
			 int mothOrder=0;//本月预约数
			 int totalOrder=0;//历史预约数
			 int totalDeal=0;//就医数
			 if(agentId==null)
				 agentId = this.GetOneSessionAccount().getSroleId();
			 AgIntegralInfo att_AgIntegralInfo = new AgIntegralInfo();
			 att_AgIntegralInfo.setSuiId(agentId);
			 att_AgIntegralInfo.setUserType("1");
			 att_AgIntegralInfo.setCreateDate_start(new Date());
			 att_AgIntegralInfo.setCreateDate_end(new Date());
			 List<AgIntegralInfo> reList=agIntegralInfoDao.getListByAgIntegralInfo(att_AgIntegralInfo);
			//				是否签到
				 boolean signed=false;
			//			创建新的代约
				 boolean	agentCreated=false;
			//		邀请新宣传员
				 boolean	registered=false;
			//			邀请的新用户注册
				 boolean	patientInvited=false;
			 if(reList!=null&&reList.size()>0){
				 for(AgIntegralInfo did:reList ){
					 if("1".equals(did.getSource())){
						 signed=true;
					 }
					 if("2".equals(did.getSource())){
						 agentCreated=true;
					 }
					 if("3".equals(did.getSource())){
						 registered=true;
					 }
					 if("4".equals(did.getSource())){
						 patientInvited=true;
					 }
				 }
			 }
			 if(signed)
				 totalTasks--;
			 if(agentCreated)
				 totalTasks--;
			 if(registered)
				 totalTasks--;
			 if(patientInvited)
				 totalTasks--;
			 AgMoneyCount agMoneyCount = agMoneyCountDao.getAgMoneyCountByUserId(agentId, "3");
			 if(agMoneyCount!=null && agMoneyCount.getAmcId()!=null){
				 shareAmount=agMoneyCount.getTotalShare();
				 remainingAmount=agMoneyCount.getMoneyCount();
				 totalAccumulatePoints = agMoneyCount.getIntegralCount();
			 }
			 //统计下级业务员
			 AgBusinessUser att_AgBusinessUser = new AgBusinessUser();
			 att_AgBusinessUser.setParentAgentId(agentId);
			 att_AgBusinessUser.setStatus("0");
			 List<AgBusinessUser> agentList = agBusinessUserDao.getListByAgBusinessUser(att_AgBusinessUser);
			 if(agentList !=null && agentList.size() >0)
				 agentCount=agentList.size();
			 //统计患者总数
			 patientsCount= agPatientInfoDao.countAppPatient(agentId);
			 map_back.put("patientsCount", patientsCount);
			 map_back.put("agentCount", agentCount);
			 map_back.put("shareAmount", shareAmount);
			 map_back.put("remainingAmount", remainingAmount);
			 map_back.put("totalAccumulatePoints", totalAccumulatePoints); 
			 map_back.put("totalTasks", totalTasks); 
			 SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM");
			 String now = sdf.format(new Date());
			 List<AgOrderView> orderList = agOrderInfoDao.getAgOrderViewByAgentId(agentId, "0");
			 if(orderList !=null && orderList.size() >0){
				 for(AgOrderView view : orderList){
					 totalOrder++;
					 if(view.getOutpatientStatus().equals("0"))
						 totalDeal++;
					 if(view.getCreateDate()!=null && now.equals(sdf.format(view.getCreateDate())))
						 mothOrder++;
				 }
			 }
			 map_back.put("mothOrder", mothOrder); 
			 map_back.put("totalOrder", totalOrder); 
			 map_back.put("totalDeal", totalDeal); 
			 srm.setObj(map_back);
		    } catch (Exception e) {
				e.printStackTrace(); 
				srm.setCode(0l);
				srm.setMeg(e.getMessage());
	        } 
		return srm;
	}

	@Override
	public SysRetrunMessage getCountDayIntegral() throws HSKException {
		SysRetrunMessage srm = new SysRetrunMessage(1l);
		Map<String ,Object > map_back=new HashMap<String,Object>();
		//获取当天任务 记录 
		 try{
			 int totalAccumulatePoints=0;//积分总数
			 int totalTasks=0;//当日任务完成数
			 AgIntegralInfo att_AgIntegralInfo = new AgIntegralInfo();
			 att_AgIntegralInfo.setSuiId(this.GetOneSessionAccount().getSroleId());
			 att_AgIntegralInfo.setUserType("1");
			 att_AgIntegralInfo.setCreateDate_start(new Date());
			 att_AgIntegralInfo.setCreateDate_end(new Date());
			 List<AgIntegralInfo> reList=agIntegralInfoDao.getListByAgIntegralInfo(att_AgIntegralInfo);
			//				是否签到
				 boolean signed=false;
			//			创建新的代约
				 boolean	agentCreated=false;
			//		邀请新宣传员
				 boolean	registered=false;
			//			邀请的新用户注册
				 boolean	patientInvited=false;
			 if(reList!=null&&reList.size()>0){
				 for(AgIntegralInfo did:reList ){
					 if("1".equals(did.getSource())){
						 signed=true;
						 
					 }
					 if("2".equals(did.getSource())){
						 agentCreated=true;
					 }
					 if("3".equals(did.getSource())){
						 registered=true;
					 }
					 if("4".equals(did.getSource())){
						 patientInvited=true;
					 }
				 }
			 }
			 if(signed)
				 totalTasks++;
			 if(agentCreated)
				 totalTasks++;
			 if(registered)
				 totalTasks++;
			 if(patientInvited)
				 totalTasks++;
			 AgMoneyCount agMoneyCount = agMoneyCountDao.getAgMoneyCountByUserId(this.GetOneSessionAccount().getSroleId(), "3");
			 if(agMoneyCount!=null && agMoneyCount.getAmcId()!=null){
				 totalAccumulatePoints = agMoneyCount.getIntegralCount();
			 }
			 map_back.put("totalAccumulatePoints", totalAccumulatePoints); 
			 map_back.put("totalTasks", totalTasks); 
			 srm.setObj(map_back);
		    } catch (Exception e) {
				e.printStackTrace(); 
				srm.setCode(0l);
				srm.setMeg(e.getMessage());
	        } 
		return srm;
	}
}