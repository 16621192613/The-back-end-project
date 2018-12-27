package com.hsk.angeldoctor.web.order.service.imp;

import java.text.SimpleDateFormat;
import java.util.*;

import org.springframework.stereotype.*;
import org.springframework.beans.factory.annotation.Autowired;
import com.hsk.supper.dto.comm.PagerModel;
import com.hsk.supper.dto.comm.SysRetrunMessage;
import com.hsk.xframe.api.im.IMUtile;
import com.hsk.xframe.api.service.imp.DSTService;
import com.hsk.xframe.api.utils.freeMarker.CommonUtil;
import com.hsk.exception.HSKDBException;
import com.hsk.exception.HSKException;
import com.hsk.angeldoctor.web.order.service.*;
import com.hsk.angeldoctor.api.persistence.*;
import com.hsk.angeldoctor.api.daobbase.*;


/** 
  order业务操作实现类 
 * @author  作者:admin
 * @version  版本信息:v1.0   创建时间: 2018-08-14 13:35:37
 */
 
@Service
public class  AgPatientInfoService extends DSTService implements IAgPatientInfoService {	
   /**
   *业务处理dao类  agPatientInfoDao 
   */
	@Autowired
	protected IAgPatientInfoDao agPatientInfoDao;
	@Autowired
	protected IAgDoctorInfoDao agDoctorInfoDao;
	@Autowired
	protected IAgOrderInfoDao agOrderInfoDao;
	@Autowired
	private IAgMoneyCountDao agMoneyCountDao;
	

 /**
	 * 根据ag_patient_info表主键删除AgPatientInfo对象记录
     * @param  patientId  Integer类型(ag_patient_info表主键)
	 * @return SysRetrunMessage 对象记录
	 * @throws HSKException
	 */

	public SysRetrunMessage findFormObject(Integer patientId) throws HSKException{
	        SysRetrunMessage srm=new SysRetrunMessage(1l);
			  	
			try{
		   			AgPatientInfo     att_AgPatientInfo= agPatientInfoDao.findAgPatientInfoById( patientId) ;
		   			AgMoneyCount att_AgMoneyCount = new AgMoneyCount();
					att_AgMoneyCount.setSuiId(patientId);
					att_AgMoneyCount.setAmcType("4");
					List<AgMoneyCount> countList = agMoneyCountDao.getListByAgMoneyCount(att_AgMoneyCount);
					att_AgPatientInfo.setConsumeCount(0d);
					if(countList!=null && countList.size() >0)
						att_AgPatientInfo.setConsumeCount(countList.get(0).getConsumeCount());
					srm.setObj(att_AgPatientInfo);
				} catch (HSKDBException e) {
					e.printStackTrace(); 
					srm.setCode(0l);
					srm.setMeg(e.getMessage()); 
				}
				 return srm ;
	} 

    /**
	 * 根据ag_patient_info表主键删除AgPatientInfo对象记录
     * @param  patientId  Integer类型(ag_patient_info表主键)
	 * @throws HSKException
	 */

	public AgPatientInfo findObject(Integer patientId) throws HSKException{
			AgPatientInfo  att_AgPatientInfo=new AgPatientInfo();		
			try{
		        att_AgPatientInfo= agPatientInfoDao.findAgPatientInfoById( patientId) ;
				} catch (HSKDBException e) {
					e.printStackTrace(); 
					throw new  HSKException(e);
				}
				return  att_AgPatientInfo;
	}
	
	 
	 /**
	 * 根据ag_patient_info表主键删除AgPatientInfo对象记录
     * @param  patientId  Integer类型(ag_patient_info表主键)
     * @return SysRetrunMessage 对象记录
	 * @throws HSKException
	 */
	public SysRetrunMessage deleteObject(Integer patientId) throws HSKException{  
		    SysRetrunMessage srm=new SysRetrunMessage(1l);
		   try{ 
				agPatientInfoDao.deleteAgPatientInfoById(patientId);
			 } catch (Exception e) {
					e.printStackTrace(); 
					throw new  HSKException(e);
		     }
		   return srm;  
	}
	
	/**
	 * 根据ag_patient_info表主键删除多条AgPatientInfo对象记录
     * @param  PatientIds  Integer类型(ag_patient_info表主键)
     * @return SysRetrunMessage 对象记录
	 * @throws HSKException
	 */
	public SysRetrunMessage deleteAllObject(String patientIds) throws HSKException{
		SysRetrunMessage srm = new SysRetrunMessage(1l);
		try {
			String[] ids = patientIds.split(",");
			for (String did : ids) {
				if (did != null && !"".equals(did.trim())) {
					agPatientInfoDao.deleteAgPatientInfoById(Integer
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
	 * 新增或修改ag_patient_info表记录 ,如果ag_patient_info表主键AgPatientInfo.PatientId为空就是添加，如果非空就是修改
     * @param  att_AgPatientInfo  AgPatientInfo类型(ag_patient_info表记录)
     * @return AgPatientInfo  修改后的AgPatientInfo对象记录
	 * @throws HSKDBException
	 */
	public SysRetrunMessage saveOrUpdateObject( AgPatientInfo att_AgPatientInfo) throws HSKException{
			 SysRetrunMessage srm = new SysRetrunMessage(1l);
			  try{
					agPatientInfoDao.saveOrUpdateAgPatientInfo(att_AgPatientInfo); 
					if(att_AgPatientInfo.getWechatUserId()!=null){//当时微信用户患者时
						//创建环信信息
						IMUtile iMUtile = new IMUtile();
			  			//查询该用户是否已经存在环信账号
			  			boolean isExist = iMUtile.checkIMUserByUserName(CommonUtil.IM_PAT_PRE+att_AgPatientInfo.getPatientId());
			  			if(!isExist){//如果不存在环信账号则创建
			  				iMUtile.createUser(CommonUtil.IM_PAT_PRE+att_AgPatientInfo.getPatientId(), CommonUtil.IM_PAT_PASS);
			  			}
					}
					srm.setObj(att_AgPatientInfo);
			    } catch (Exception e) {
					e.printStackTrace(); 
					throw new HSKException(e);
		        }
			return srm;	  
	}
	
	 
	/**
	 *根据AgPatientInfo对象作为对(ag_patient_info表进行查询，获取分页对象
     * @param  att_AgPatientInfo  AgPatientInfo类型(ag_patient_info表记录)
     * @return PagerModel  分页对象
	 * @throws HSKException 
	 */
	public PagerModel getPagerModelObject (AgPatientInfo att_AgPatientInfo) throws HSKException{
		PagerModel pm=new PagerModel(new ArrayList<AgPatientInfo>());
			  try{
					pm=agPatientInfoDao.getPagerModelByAgPatientInfo(att_AgPatientInfo);
			    } catch (Exception e) {
					e.printStackTrace(); 
		        }
		return pm;
	}

	@Override
	public SysRetrunMessage getAgPatientInfoByName(String name, String mobile) throws HSKException {
		 SysRetrunMessage srm = new SysRetrunMessage(1l);
		  try{
			  	AgPatientInfo agPatientInfo = new AgPatientInfo();
				agPatientInfo.setMobile(mobile);
				agPatientInfo.setName(name);
				List<AgPatientInfo> agPatientInfoList = agPatientInfoDao.getListByAgPatientInfo(agPatientInfo);
				if(agPatientInfoList!=null && agPatientInfoList.size()>0)
					agPatientInfo = agPatientInfoList.get(0);
				srm.setObj(agPatientInfo);
		    } catch (Exception e) {
				e.printStackTrace(); 
	        }
		return srm;	  
	}

 
	public PagerModel getPagerModeldealList(AgPatientInfo att_AgPatientInfo)
			throws HSKException {
		PagerModel pm=new PagerModel(new ArrayList<AgPatientInfo>());
		  try{
				pm=agPatientInfoDao.getPagerModelByAgPatientInfo(att_AgPatientInfo);
		    } catch (Exception e) {
				e.printStackTrace(); 
	        }
		  return pm;
	}
 
	public SysRetrunMessage getDealCount(Integer id) throws HSKException { 
		SysRetrunMessage srm = new SysRetrunMessage(1l);
		try {
			List<Object> list_obj=  agPatientInfoDao.getCount(id);
			srm.setObj(list_obj);
		} catch (HSKDBException e) { 
			e.printStackTrace(); 
			srm.setCode(0l);
			srm.setMeg(e.getMessage());
		}
		return srm;	
	}

	@Override
	public AgPatientInfo getAgPatientInfoByWechatUserId(Integer wechatUserId) throws HSKException {
		AgPatientInfo agPatientInfo = new AgPatientInfo();
		agPatientInfo.setWechatUserId(wechatUserId);
		agPatientInfo.setStatus("0");
		try {
			List<AgPatientInfo> reList = agPatientInfoDao.getListByAgPatientInfo(agPatientInfo);
			if(reList !=null && reList.size() >0)
				return reList.get(0);
		} catch (HSKDBException e) {
			e.printStackTrace();
		}
		
		return null;
	}
	/**
	 * 根据登陆的医院查询患者列表：患者列表需增加：上次截诊时间、累计消费、患者评价数、患者截诊数
	 */
	@Override
	public PagerModel getHosPagerModelObject(AgPatientInfo att_AgPatientInfo) throws HSKException {
		PagerModel pagerModel = new PagerModel(new ArrayList<Map<String,Object>>());
		try{
			 SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
			 //查询登陆的医院ID
			 Integer organizationId=null;
			 if(this.getUserType()==2)//如果是医院管理员登录
				organizationId = this.GetOneSessionAccount().getSroleId();
		  	 else if(this.getUserType()==3){//如果是医生登录
				AgDoctorInfo loginDoc= agDoctorInfoDao.findAgDoctorInfoById(this.GetOneSessionAccount().getSroleId());
				organizationId = loginDoc.getOrganizationId();
			}
			//根据登录的医院ID查询所有的结束医院订单
			 PagerModel pm=agPatientInfoDao.getHosPatienByAgPatientInfo(att_AgPatientInfo, organizationId);
			 if(pm!=null && pm.getItems()!=null && pm.getItems().size() >0){
				 List<Map<String,Object>> reList = new ArrayList<Map<String,Object>>();
				 for(Object obj : pm.getItems()){
					 Map<String,Object> reMap= new HashMap<String,Object>();
					 Map<String,Object> patient = (Map<String,Object>) obj;
					 reMap.put("id", patient.get("patient_id"));
					 reMap.put("patientName", patient.get("name"));
					 reMap.put("patientMobile", patient.get("mobile"));
					 reMap.put("patientAge",patient.get("age"));
					 reMap.put("avatar", patient.get("avatar")!=null?patient.get("avatar").toString():"");
					 reMap.put("patientGender", patient.get("gender"));
					 reMap.put("lastDealTime",patient.get("last_deal_date")!=null?patient.get("last_deal_date").toString():"");
					 reMap.put("evaluationsCount", patient.get("evaluationsCount"));
					 reMap.put("consumeCount", patient.get("countMoney"));
					 reMap.put("countMedicalRecordsCount", patient.get("countMedicalRecordsCount"));
					 reMap.put("imCode", CommonUtil.IM_PAT_PRE+patient.get("patient_id"));
					 reList.add(reMap);
				 }
				 pagerModel.setItems(reList);
				 pagerModel.setRows(reList);
				 pagerModel.setTotal(pm.getTotal());
				 pagerModel.setTotalCount(pm.getTotalCount());
			 }
		}catch(Exception e){
			e.printStackTrace();
		}
		return pagerModel;
	}

	@Override
	public PagerModel getSerPagerModelObject(String createDateStart, String createDateEnd, String mobile, String name,
			String sceneMobile) throws HSKException {
		PagerModel pm = new PagerModel();
		try {
			pm=agPatientInfoDao.getWechatPatienPager(createDateStart, createDateEnd, mobile, name, sceneMobile);
		} catch (HSKDBException e) {
			e.printStackTrace();
		}
		return pm;
	}

	@Override
	public PagerModel getAppPagerModelObject(String keyWords) throws HSKException {
		PagerModel pm = new PagerModel();
		try {
			pm=agPatientInfoDao.getAppPatienPager(this.GetOneSessionAccount().getSroleId(), keyWords);
		} catch (HSKDBException e) {
			e.printStackTrace();
		}
		return pm;
	}

	@Override
	public AgPatientInfo fingAgPatientInfoByNameAndPhone(String userName, String phone) throws HSKException {
		AgPatientInfo agPatientInfo = new AgPatientInfo();
		try {
			agPatientInfo.setName(userName);
			agPatientInfo.setMobile(phone);
			List<AgPatientInfo> reList = agPatientInfoDao.getListByAgPatientInfo(agPatientInfo);
			if(reList !=null && reList.size() >0)
				return reList.get(0);
		} catch (HSKDBException e) {
			e.printStackTrace();
		}
		
		return null;
	} 
	 
}