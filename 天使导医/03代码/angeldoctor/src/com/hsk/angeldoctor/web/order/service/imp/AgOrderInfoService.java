package com.hsk.angeldoctor.web.order.service.imp;

import java.text.SimpleDateFormat;
import java.util.*;
import org.springframework.stereotype.*;
import org.springframework.beans.factory.annotation.Autowired;
import com.hsk.supper.dto.comm.PagerModel;
import com.hsk.supper.dto.comm.SysRetrunMessage; 
import com.hsk.xframe.api.service.imp.DSTService;
import com.hsk.xframe.api.utils.freeMarker.CreateCodeUtil;
import com.hsk.xframe.api.utils.freeMarker.SendSms;
import com.hsk.xframe.api.utils.freeMarker.WeixinUtils;
import com.hsk.exception.HSKDBException;
import com.hsk.exception.HSKException;
import com.hsk.angeldoctor.web.order.service.*;
import com.hsk.angeldoctor.api.persistence.*;
import com.hsk.angeldoctor.api.daobbase.*;


/** 
  order业务操作实现类 
 * @author  作者:admin
 * @version  版本信息:v1.0   创建时间: 2018-08-14 13:35:36
 */
 
@Service
public class  AgOrderInfoService extends DSTService implements IAgOrderInfoService {	
   /**
   *业务处理dao类  agOrderInfoDao 
   */
	@Autowired
	protected IAgOrderInfoDao agOrderInfoDao;
	@Autowired
	protected IAgDoctorInfoDao agDoctorInfoDao;
	@Autowired
	protected IAgDepartmentInfoDao agDepartmentInfoDao;
	@Autowired
	private IAgBusinessUserDao agBusinessUserDao;
	@Autowired
	protected IAgPatientInfoDao agPatientInfoDao;
	@Autowired
	protected IAgWechatInfoDao agWechatInfoDao;
	@Autowired
	protected IAgDealInfoDao agDealInfoDao;
	@Autowired
	private IAgMoneyCountDao agMoneyCountDao;
	@Autowired
	protected IAgHospitalInfoDao agHospitalInfoDao;
	@Autowired
	protected IAgIntegralInfoDao agIntegralInfoDao;
	@Autowired
	private IAgAppDeviceDao agAppDeviceDao;
	@Autowired
	private IAgAppNotificationDao agAppNotificationDao;
	
	
 /**
	 * 根据ag_order_info表主键删除AgOrderInfo对象记录
     * @param  aoiId  Integer类型(ag_order_info表主键)
	 * @return SysRetrunMessage 对象记录
	 * @throws HSKException
	 */

	public SysRetrunMessage findFormObject(Integer aoiId) throws HSKException{
	        SysRetrunMessage srm=new SysRetrunMessage(1l);
			  	
			try{
				AgOrderView     att_AgOrderView= agOrderInfoDao.getAgOrderViewById( aoiId) ;
					srm.setObj(att_AgOrderView);
				} catch (HSKDBException e) {
					e.printStackTrace(); 
					srm.setCode(0l);
					srm.setMeg(e.getMessage()); 
				}
				 return srm ;
	} 

    /**
	 * 根据ag_order_info表主键删除AgOrderInfo对象记录
     * @param  aoiId  Integer类型(ag_order_info表主键)
	 * @throws HSKException
	 */

	public AgOrderInfo findObject(Integer aoiId) throws HSKException{
			AgOrderInfo  att_AgOrderInfo=new AgOrderInfo();		
			try{
		        att_AgOrderInfo= agOrderInfoDao.findAgOrderInfoById( aoiId) ;
				} catch (HSKDBException e) {
					e.printStackTrace(); 
					throw new  HSKException(e);
				}
				return  att_AgOrderInfo;
	}
	
	 
	 /**
	 * 根据ag_order_info表主键删除AgOrderInfo对象记录
     * @param  aoiId  Integer类型(ag_order_info表主键)
     * @return SysRetrunMessage 对象记录
	 * @throws HSKException
	 */
	public SysRetrunMessage deleteObject(Integer aoiId) throws HSKException{  
		    SysRetrunMessage srm=new SysRetrunMessage(1l);
		   try{ 
				agOrderInfoDao.deleteAgOrderInfoById(aoiId);
			 } catch (Exception e) {
					e.printStackTrace(); 
					throw new  HSKException(e);
		     }
		   return srm;  
	}
	
	/**
	 * 根据ag_order_info表主键删除多条AgOrderInfo对象记录
     * @param  AoiIds  Integer类型(ag_order_info表主键)
     * @return SysRetrunMessage 对象记录
	 * @throws HSKException
	 */
	public SysRetrunMessage deleteAllObject(String aoiIds) throws HSKException{
		SysRetrunMessage srm = new SysRetrunMessage(1l);
		try {
			String[] ids = aoiIds.split(",");
			for (String did : ids) {
				if (did != null && !"".equals(did.trim())) {
					agOrderInfoDao.deleteAgOrderInfoById(Integer
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
	 * 新增或修改ag_order_info表记录 ,如果ag_order_info表主键AgOrderInfo.AoiId为空就是添加，如果非空就是修改
     * @param  att_AgOrderInfo  AgOrderInfo类型(ag_order_info表记录)
     * @return AgOrderInfo  修改后的AgOrderInfo对象记录
	 * @throws HSKDBException
	 */
	public SysRetrunMessage saveOrUpdateObject( AgOrderInfo att_AgOrderInfo) throws HSKException{
			 SysRetrunMessage srm = new SysRetrunMessage(1l);
			  try{
					agOrderInfoDao.saveOrUpdateAgOrderInfo(att_AgOrderInfo); 
					srm.setObj(att_AgOrderInfo);
			    } catch (Exception e) {
					e.printStackTrace(); 
					throw new HSKException(e);
		        }
			return srm;	  
	}
	
	 
	/**
	 *根据AgOrderInfo对象作为对(ag_order_info表进行查询，获取分页对象
     * @param  att_AgOrderInfo  AgOrderInfo类型(ag_order_info表记录)
     * @return PagerModel  分页对象
	 * @throws HSKException 
	 */
	public PagerModel getPagerModelObject (AgOrderInfo att_AgOrderInfo) throws HSKException{
		PagerModel pm=new PagerModel(new ArrayList<AgOrderInfo>());
			  try{
					pm=agOrderInfoDao.getPagerModelByAgOrderInfo(att_AgOrderInfo);
			    } catch (Exception e) {
					e.printStackTrace(); 
		        }
		return pm;
	}

	@Override
	public PagerModel getPagerAgOrderView(AgOrderView agOrderView, String registerStartDate, String registerEndDate,String previousRegistration)
			throws HSKException {
		PagerModel pm=new PagerModel(new ArrayList<AgOrderView>());
		try{
			Integer userType=this.getUserType();//获取登录用户类型；
			if(userType==1){//如果是管理员用户
				if(agOrderView.getRegisterType()==null || agOrderView.getRegisterType().trim().equals(""))
					agOrderView.setRegisterType("0,1");
			}else if(userType==2){//如果是医院管理员用户
				agOrderView.setOrganizationId(this.GetOneSessionAccount().getSroleId());
				if(previousRegistration!=null && previousRegistration.equals("0"))//非复诊
					agOrderView.setPreviousRegistrationStr(previousRegistration);
				else if(previousRegistration!=null && previousRegistration.equals("1"))//复诊
					agOrderView.setPreviousRegistrationStr("1");
				if(agOrderView.getOutpatientStatus()==null || agOrderView.getOutpatientStatus().equals(""))
					agOrderView.setOutpatientStatus("1,2");
			}else if(userType==3){//如果是医生用户
				AgDoctorInfo att_AgDoctorInfo= agDoctorInfoDao.findAgDoctorInfoById(this.GetOneSessionAccount().getSroleId());
				agOrderView.setOrganizationId(att_AgDoctorInfo.getOrganizationId());
				if(att_AgDoctorInfo.getJobTitleName().equals("管理员") || att_AgDoctorInfo.getJobTitleName().equals("前台接待")){//如果是管理员查询所有
				}else{
					//查看该医生的科室是否是只能预约到科室
					String departmentIds = att_AgDoctorInfo.getDepartmentId();
					if(departmentIds!=null && !departmentIds.equals(""))
						departmentIds=departmentIds.substring(1, departmentIds.length()-1);
					AgDepartmentInfo att_AgDepartmentInfo = new AgDepartmentInfo();
					att_AgDepartmentInfo.setDepartmentId_str(departmentIds);
					List<AgDepartmentInfo> depList=agDepartmentInfoDao.getListByAgDepartmentInfo(att_AgDepartmentInfo);
					String depFi="";
					if(depList!=null && depList.size() >0){
						for(AgDepartmentInfo info : depList){
							if(info.getRegToDepartment()!=null && info.getRegToDepartment().equals("1")){
								depFi +=" (departmentId="+info.getId()+") ,";
							}else
								depFi +=" (departmentId="+info.getId()+" and doctorId="+att_AgDoctorInfo.getId()+") ,";
						}
						depFi=depFi.substring(0,depFi.length()-1);
						depFi=depFi.replaceAll(",", "or");
						agOrderView.setFilterStr(depFi);
					}
					
				}
				if(previousRegistration!=null && previousRegistration.equals("0"))//非复诊
					agOrderView.setPreviousRegistrationStr(previousRegistration);
				else if(previousRegistration!=null && previousRegistration.equals("1"))//复诊
					agOrderView.setPreviousRegistrationStr("1");
				if(agOrderView.getOutpatientStatus()==null || agOrderView.getOutpatientStatus().equals(""))
					agOrderView.setOutpatientStatus("1,2");
			}else if(userType==4){//如果是代理商
				agOrderView.setAaiId(this.GetOneSessionAccount().getSroleId());
				if(agOrderView.getRegisterType()==null || agOrderView.getRegisterType().trim().equals(""))
					agOrderView.setRegisterType("0,1");
			}
			pm = agOrderInfoDao.getPagerAgOrderView(agOrderView, registerStartDate, registerEndDate);
		} catch (Exception e) {
			e.printStackTrace(); 
	    }
		return pm;
	}

	@Override
	public SysRetrunMessage saveAppyInfo(AgOrderInfo att_AgOrderInfo) throws HSKException {
		SysRetrunMessage srm = new SysRetrunMessage(1l);
		try{
			//检查是否首次代约
			AgOrderInfo chInfo = new AgOrderInfo(); 
			chInfo.setRegisterType(att_AgOrderInfo.getRegisterType());
			chInfo.setAgentId(att_AgOrderInfo.getAgentId());
			List<AgOrderInfo> infoList = agOrderInfoDao.getListByAgOrderInfo(chInfo);
			if(infoList!=null && infoList.size()>0)
				att_AgOrderInfo.setIsFirstAgent("0");
			else
				att_AgOrderInfo.setIsFirstAgent("1");
			//流水号
			att_AgOrderInfo.setSerialNumber(CreateCodeUtil.getNo("OR"));
			AgBusinessUser agBusinessUser = new AgBusinessUser();
			AgPatientInfo agPatientInfo=new AgPatientInfo();
			AgWechatInfo agWechatInfo = new AgWechatInfo();
			if(att_AgOrderInfo.getRegisterType().equals("0")){//业务员代约
				agBusinessUser=agBusinessUserDao.findAgBusinessUserById(att_AgOrderInfo.getAgentId());
				att_AgOrderInfo.setRegisterStatus("1");//代约成功
			}else if(att_AgOrderInfo.getRegisterType().equals("1")){//如果是患者预约
				att_AgOrderInfo.setRegisterStatus("0");//预约成功
				//获取患者信息
				agPatientInfo = agPatientInfoDao.findAgPatientInfoById(att_AgOrderInfo.getAgentId());
				//获取患者微信信息
				agWechatInfo = agWechatInfoDao.findAgWechatInfoById(agPatientInfo.getWechatUserId());
				if(agWechatInfo.getSceneId()!=null)
					agBusinessUser=agBusinessUserDao.findAgBusinessUserById(agWechatInfo.getSceneId());//获取业务员信息
			}else{
				att_AgOrderInfo.setRegisterStatus("0");
			}
			if(agBusinessUser!=null && agBusinessUser.getAgentId()!=null){
				//设置代理商Id
				att_AgOrderInfo.setAaiId(agBusinessUser.getAaiId());
				if(agBusinessUser.getAgentId()!=null){
					String agentIds = agBusinessUserDao.getBusinessIds(agBusinessUser.getAgentId());
					if(agentIds!=null && !agentIds.equals("")){
						agentIds = agentIds.substring(0, agentIds.length()-1);
						String[] agentArry  = agentIds.split(",");
						att_AgOrderInfo.setFirstAgentId(Integer.parseInt(agentArry[agentArry.length-1]));//设置一级业务员ID
						if(agentArry.length>1)
							att_AgOrderInfo.setSecondAgentId(Integer.parseInt(agentArry[agentArry.length-2]));//设置二级业务员ID
					}
				}
			}
			att_AgOrderInfo.setOutpatientStatus("2");//待诊中
			att_AgOrderInfo.setChargeType("1");//非医院自增
			att_AgOrderInfo.setPatientSource("0");//患者来源天使导医
			att_AgOrderInfo.setStatus("0");
			att_AgOrderInfo.setCreateDate(new Date());
			agOrderInfoDao.saveAgOrderInfo(att_AgOrderInfo);
			//保存积分信息
			//查看是否是当天第一次预约
			 AgIntegralInfo att_search=new AgIntegralInfo ();	
			 if(att_AgOrderInfo.getRegisterType().equals("0")){//业务员代约
				 att_search.setUserType("1");//用户类型
			 }else if(att_AgOrderInfo.getRegisterType().equals("1")){//如果是患者预约
				att_search.setUserType("2");
			 }
			 att_search.setSource("2");//预约
			 att_search.setSuiId(att_AgOrderInfo.getAgentId());//用户ID
			 Date now=new Date();
			 att_search.setCreateDate_end(now); 
			 att_search.setCreateDate_start(now); 
			 List<AgIntegralInfo>  list= agIntegralInfoDao.getListByAgIntegralInfo(att_search);
			 if(list==null|| list.size()==0){
				 att_search.setCount(30);//每日初次预约给与30积分
				 att_search.setComment("每日初次预约！");
				 att_search.setCreateDate(new Date());//创建时间
				 att_search.setStatus("1");
				 att_search.setAppId(att_AgOrderInfo.getAoiId());
				 agIntegralInfoDao.saveOrUpdateAgIntegralInfo(att_search);
			 }
			srm.setObj(att_AgOrderInfo);
			
			//发送通知患者信息
			AgWorkView agWorkView = new AgWorkView();
			agWorkView.setShiftPlanId(att_AgOrderInfo.getShiftPlanId());
			agWorkView = (AgWorkView) this.getOne(agWorkView);
			String docStr="";
			if(agWorkView.getDoctorName()!=null && !agWorkView.getDoctorName().equals(""))
				docStr="-"+agWorkView.getDoctorName()+"医生";
			SendSms.sendNoticeInfo(att_AgOrderInfo.getPatientMobile(), att_AgOrderInfo.getPatientName(), 
					agWorkView.getOrganizationName()+"-"+agWorkView.getDepartmentName()+docStr, 
					agWorkView.getPlanDate()+" "+agWorkView.getShiftPeriod());
			//推送消息
			if(att_AgOrderInfo.getRegisterType().equals("0")){//业务员代约
				String mess="【天使导医】尊敬的"+agBusinessUser.getName()+"您好，您已通过天使导医成功为"+att_AgOrderInfo.getPatientName()+"预约"
						+agWorkView.getOrganizationName()+"-"+agWorkView.getDepartmentName()+docStr+"，就诊时间"+agWorkView.getPlanDate()+" "+agWorkView.getShiftPeriod()+"。祝您早日康复！";
				AgAppDevice agAppDevice = agAppDeviceDao.getAgAppDeviceByAgentId(agBusinessUser.getAgentId());
				if(agAppDevice!=null && agAppDevice.getAadId()!=null){
					AgAppNotification agAppNotification = new AgAppNotification();
					agAppNotification.setTitle("代约成功");
					agAppNotification.setBody(mess);
					agAppNotification.setType("1");;
					agAppNotification.setCreateDate(new Date());
					agAppNotification.setAgentId(agAppDevice.getAgentId());
					agAppNotificationDao.saveAgAppNotification(agAppDevice, agAppNotification);
				}
			}else if(att_AgOrderInfo.getRegisterType().equals("1")){//患者预约
				String mess="【天使导医】尊敬的"+agPatientInfo.getName()+"您好，您已通过天使导医成功预约"
						+agWorkView.getOrganizationName()+"-"+agWorkView.getDepartmentName()+docStr+"，就诊时间"+agWorkView.getPlanDate()+" "+agWorkView.getShiftPeriod()+"。祝您早日康复！";
				WeixinUtils.sendMess(agWechatInfo.getOpenId(), mess);
			}
		}catch(Exception e){
			srm.setCode(0l);
			srm.setMeg("操作失败!");
			e.printStackTrace(); 
			throw new HSKException(e);
		}
		return srm;
	}

	@Override
	public SysRetrunMessage addHosAgOrderInfo(String patientName, String patientMobile, String patientGender,
			String patientAge, String patientSource, Double treatmentFee, Double drugFee, Integer departmentId,
			Integer doctorId, String comment, Integer regDepartmentId, Integer regDoctorId,
			String registerDate, Integer shiftPeriodId, Integer shiftPlanId, String description) throws HSKException {
		SysRetrunMessage srm = new SysRetrunMessage(1l);
		try{
			//获取医院ID
			Integer hosId=null;
			Integer userType=this.getUserType();//获取登录用户类型；
			if(userType==2){//果是医院管理员用户
				hosId = this.GetOneSessionAccount().getSroleId();
			}else if(userType==3){//如果是医生用户
				AgDoctorInfo att_AgDoctorInfo= agDoctorInfoDao.findAgDoctorInfoById(this.GetOneSessionAccount().getSroleId());
				hosId=att_AgDoctorInfo.getOrganizationId();
			}
			//获取代约医院信息
			AgHospitalInfo agHospitalInfo =agHospitalInfoDao.findAgHospitalInfoById(hosId);
			//创建新增的待约信息
			AgOrderInfo att_AgOrderInfo = new AgOrderInfo();
			att_AgOrderInfo.setSerialNumber(CreateCodeUtil.getNo("OR"));
			att_AgOrderInfo.setPatientName(patientName);
			att_AgOrderInfo.setPatientMobile(patientMobile);
			att_AgOrderInfo.setPatientGender(patientGender);
			att_AgOrderInfo.setPatientAge(patientAge);
			att_AgOrderInfo.setPatientSource(patientSource);
			att_AgOrderInfo.setDepartmentId(departmentId);
			att_AgOrderInfo.setDoctorId(doctorId);
			att_AgOrderInfo.setRegisterDate(new Date());
			att_AgOrderInfo.setOrganizationId(hosId);
			att_AgOrderInfo.setRegisterType("2");//自增
			att_AgOrderInfo.setRegisterStatus("1");
			att_AgOrderInfo.setChargeType("0");
			att_AgOrderInfo.setOutpatientStatus("0");
			att_AgOrderInfo.setStatus("0");
			att_AgOrderInfo.setCreateDate(new Date());
			//根据患者手机号检查患者是否存在 
			AgPatientInfo agPatientInfo = new AgPatientInfo();
			agPatientInfo.setMobile(patientMobile);
			agPatientInfo.setName(patientName);
			List<AgPatientInfo> agPatientInfoList = agPatientInfoDao.getListByAgPatientInfo(agPatientInfo);
			if(agPatientInfoList!=null && agPatientInfoList.size()>0){
				agPatientInfo = agPatientInfoList.get(0);
				agPatientInfo.setLastDealDate(new Date());
				agPatientInfoDao.saveAgPatientInfo(agPatientInfo);
			}else{
				agPatientInfo=new AgPatientInfo();
				agPatientInfo.setName(patientName);
				agPatientInfo.setMobile(patientMobile);
				agPatientInfo.setGender(patientGender);
				agPatientInfo.setAge(patientAge);
				if(patientSource!=null && !patientSource.equals(""))
					agPatientInfo.setSource(Integer.parseInt(patientSource));
				agPatientInfo.setStatus("0");
				agPatientInfo.setCreateDate(new Date());
				agPatientInfo.setLastDealDate(new Date());
				agPatientInfoDao.saveAgPatientInfo(agPatientInfo);
			}
			att_AgOrderInfo.setPatientId(agPatientInfo.getPatientId());
			agOrderInfoDao.saveAgOrderInfo(att_AgOrderInfo);
			//创建就诊信息
			AgDealInfo agDealInfo = new AgDealInfo();
			agDealInfo.setAoiId(att_AgOrderInfo.getAoiId());
			agDealInfo.setOrganizationId(att_AgOrderInfo.getOrganizationId());
			agDealInfo.setDepartmentId(departmentId);
			agDealInfo.setDoctorId(doctorId);
			agDealInfo.setPatientId(agPatientInfo.getPatientId());
			agDealInfo.setTreatmentFee(treatmentFee);
			agDealInfo.setDrugFee(drugFee);
			//agDealInfo.setReceptionFee(agHospitalInfo.getReceptionFee());
			agDealInfo.setComment(comment);
			agDealInfo.setStatus("0");
			agDealInfo.setCreateDate(new Date());
			agDealInfoDao.saveAgDealInfo(agDealInfo);
			//设置患者消费信息
			AgMoneyCount att_AgMoneyCount =new AgMoneyCount();
			att_AgMoneyCount.setSuiId(att_AgOrderInfo.getPatientId());
			att_AgMoneyCount.setAmcType("4");
			
			att_AgMoneyCount.setConsumeCount(agDealInfo.getDrugFee()+agDealInfo.getTreatmentFee());
			att_AgMoneyCount.setCountMedicalRecordsCount(1);//患者累计到诊次数+1
			
			agMoneyCountDao.updateAgMoneyCount(att_AgMoneyCount);
			
			//判断是否需要创建复诊信息
			if(regDepartmentId != null){
				SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
				AgOrderInfo fz_AgOrderInfo = new AgOrderInfo();
				fz_AgOrderInfo.setSerialNumber(CreateCodeUtil.getNo("OR"));
				fz_AgOrderInfo.setPatientId(agPatientInfo.getPatientId());
				fz_AgOrderInfo.setPatientName(patientName);
				fz_AgOrderInfo.setPatientMobile(patientMobile);
				fz_AgOrderInfo.setPatientGender(patientGender);
				fz_AgOrderInfo.setPatientAge(patientAge);
				fz_AgOrderInfo.setParentRegistrationId(att_AgOrderInfo.getAoiId());
				fz_AgOrderInfo.setPatientSource(patientSource);
				fz_AgOrderInfo.setDepartmentId(regDepartmentId);
				fz_AgOrderInfo.setDoctorId(regDoctorId);
				fz_AgOrderInfo.setOrganizationId(hosId);
				fz_AgOrderInfo.setRegisterDate(sdf.parse(registerDate));
				fz_AgOrderInfo.setShiftPeriodId(shiftPeriodId);
				fz_AgOrderInfo.setShiftPlanId(shiftPlanId);
				fz_AgOrderInfo.setDescription(description);
				fz_AgOrderInfo.setRegisterType("1");//自增
				fz_AgOrderInfo.setRegisterStatus("0");
				fz_AgOrderInfo.setChargeType("0");
				fz_AgOrderInfo.setOutpatientStatus("2");
				fz_AgOrderInfo.setStatus("0");
				fz_AgOrderInfo.setCreateDate(new Date());
				agOrderInfoDao.saveAgOrderInfo(fz_AgOrderInfo);
			}
		}catch(Exception e){
			srm.setCode(0l);
			srm.setMeg("操作失败!");
			e.printStackTrace(); 
			throw new HSKException(e);
		}
		return srm;
	}

	@Override
	public SysRetrunMessage findFormObjectBySerialNumber(String serialNumber)
			throws HSKException {
		SysRetrunMessage srm=new SysRetrunMessage(1l);
	  	
		try{
			AgOrderView     att_AgOrderView= agOrderInfoDao.getAgOrderViewBySerialNumber( serialNumber) ;
				srm.setObj(att_AgOrderView);
			} catch (HSKDBException e) {
				e.printStackTrace(); 
				srm.setCode(0l);
				srm.setMeg(e.getMessage()); 
			}
			 return srm ;
	}
}