package com.hsk.angeldoctor.web.hospital.service.imp;

import java.util.*;

import org.springframework.stereotype.*;
import org.springframework.beans.factory.annotation.Autowired;
import com.hsk.supper.dto.comm.PagerModel;
import com.hsk.supper.dto.comm.SysRetrunMessage; 
import com.hsk.xframe.api.service.imp.DSTService;
import com.hsk.exception.HSKDBException;
import com.hsk.exception.HSKException;
import com.hsk.angeldoctor.web.hospital.service.*;
import com.hsk.angeldoctor.api.persistence.*;
import com.hsk.angeldoctor.api.daobbase.*;


/** 
  hospital业务操作实现类 
 * @author  作者:admin
 * @version  版本信息:v1.0   创建时间: 2018-08-14 13:28:02
 */
 
@Service
public class  AgWorkInfoService extends DSTService implements IAgWorkInfoService {	
   /**
   *业务处理dao类  agWorkInfoDao 
   */
	@Autowired
	protected IAgWorkInfoDao agWorkInfoDao;
	@Autowired
	protected IAgDoctorInfoDao agDoctorInfoDao;

 /**
	 * 根据ag_work_info表主键删除AgWorkInfo对象记录
     * @param  shiftPlanId  Integer类型(ag_work_info表主键)
	 * @return SysRetrunMessage 对象记录
	 * @throws HSKException
	 */

	public SysRetrunMessage findFormObject(Integer shiftPlanId) throws HSKException{
	        SysRetrunMessage srm=new SysRetrunMessage(1l);
			  	
			try{
		   			AgWorkInfo     att_AgWorkInfo= agWorkInfoDao.findAgWorkInfoById( shiftPlanId) ;
					srm.setObj(att_AgWorkInfo);
				} catch (HSKDBException e) {
					e.printStackTrace(); 
					srm.setCode(0l);
					srm.setMeg(e.getMessage()); 
				}
				 return srm ;
	} 

    /**
	 * 根据ag_work_info表主键删除AgWorkInfo对象记录
     * @param  shiftPlanId  Integer类型(ag_work_info表主键)
	 * @throws HSKException
	 */

	public AgWorkInfo findObject(Integer shiftPlanId) throws HSKException{
			AgWorkInfo  att_AgWorkInfo=new AgWorkInfo();		
			try{
		        att_AgWorkInfo= agWorkInfoDao.findAgWorkInfoById( shiftPlanId) ;
				} catch (HSKDBException e) {
					e.printStackTrace(); 
					throw new  HSKException(e);
				}
				return  att_AgWorkInfo;
	}
	
	 
	 /**
	 * 根据ag_work_info表主键删除AgWorkInfo对象记录
     * @param  shiftPlanId  Integer类型(ag_work_info表主键)
     * @return SysRetrunMessage 对象记录
	 * @throws HSKException
	 */
	public SysRetrunMessage deleteObject(Integer shiftPlanId) throws HSKException{  
		    SysRetrunMessage srm=new SysRetrunMessage(1l);
		   try{ 
				agWorkInfoDao.deleteAgWorkInfoById(shiftPlanId);
			 } catch (Exception e) {
					e.printStackTrace(); 
					throw new  HSKException(e);
		     }
		   return srm;  
	}
	
	/**
	 * 根据ag_work_info表主键删除多条AgWorkInfo对象记录
     * @param  ShiftPlanIds  Integer类型(ag_work_info表主键)
     * @return SysRetrunMessage 对象记录
	 * @throws HSKException
	 */
	public SysRetrunMessage deleteAllObject(String shiftPlanIds) throws HSKException{
		SysRetrunMessage srm = new SysRetrunMessage(1l);
		try {
			String[] ids = shiftPlanIds.split(",");
			for (String did : ids) {
				if (did != null && !"".equals(did.trim())) {
					agWorkInfoDao.deleteAgWorkInfoById(Integer
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
	 * 新增或修改ag_work_info表记录 ,如果ag_work_info表主键AgWorkInfo.ShiftPlanId为空就是添加，如果非空就是修改
     * @param  att_AgWorkInfo  AgWorkInfo类型(ag_work_info表记录)
     * @return AgWorkInfo  修改后的AgWorkInfo对象记录
	 * @throws HSKDBException
	 */
	public SysRetrunMessage saveOrUpdateObject( AgWorkInfo att_AgWorkInfo) throws HSKException{
			 SysRetrunMessage srm = new SysRetrunMessage(1l);
			  try{
					agWorkInfoDao.saveOrUpdateAgWorkInfo(att_AgWorkInfo); 
					srm.setObj(att_AgWorkInfo);
			    } catch (Exception e) {
					e.printStackTrace(); 
					throw new HSKException(e);
		        }
			return srm;	  
	}
	
	 
	/**
	 *根据AgWorkInfo对象作为对(ag_work_info表进行查询，获取分页对象
     * @param  att_AgWorkInfo  AgWorkInfo类型(ag_work_info表记录)
     * @return PagerModel  分页对象
	 * @throws HSKException 
	 */
	public PagerModel getPagerModelObject (AgWorkInfo att_AgWorkInfo) throws HSKException{
		
		PagerModel pm=new PagerModel(new ArrayList<AgWorkInfo>());
			  try{
				  if(this.GetOneSessionAccount().getUserType()==2){//如果是医院管理员登录
					  att_AgWorkInfo.setOrganizationId(this.GetOneSessionAccount().getSroleId());
					}else if(this.GetOneSessionAccount().getUserType()==3){//如果是医生登录
						AgDoctorInfo att_AgDoctorInfo= agDoctorInfoDao.findAgDoctorInfoById(this.GetOneSessionAccount().getSroleId());
						att_AgWorkInfo.setOrganizationId(att_AgDoctorInfo.getOrganizationId());
					}
				    if(att_AgWorkInfo.getPlanDate()!=null && !att_AgWorkInfo.getPlanDate().trim().equals("")){
				    	String[] planDateArray = att_AgWorkInfo.getPlanDate().split(",");
				    	String plans="";
				    	for(String date : planDateArray){
				    		plans+="'"+date+"',";
				    	}
				    	plans=plans.substring(0, plans.length()-1);
				    	att_AgWorkInfo.setPlanDate(plans);
				    }
					pm=agWorkInfoDao.getPagerModelByAgWorkInfo(att_AgWorkInfo);
			    } catch (Exception e) {
					e.printStackTrace(); 
		        }
		return pm;
	}

	 
	public SysRetrunMessage saveOrUpdateListWork(List<AgWorkInfo> AgWorkInfo_list) throws HSKException {
		SysRetrunMessage srm = new SysRetrunMessage(1l);
		try {
			for(AgWorkInfo did:AgWorkInfo_list){
						Integer id= did.getId();
						AgWorkInfo att_AgWorkInfo =agWorkInfoDao.findAgWorkInfoById(id);
						att_AgWorkInfo.setPlanCount(did.getPlanCount());
						agWorkInfoDao.updateAgWorkInfoById(id, att_AgWorkInfo);
			}
		} catch (HSKDBException e) { 
			e.printStackTrace();
			srm.setCode(0l);
			srm.setMeg(e.getMessage());
		} 
		return srm;	
	}

	@Override
	public List<AgWorkView> getAgWorkViewList(AgWorkView att_AgWorkView) throws HSKException {
		List<AgWorkView> reList = new ArrayList<AgWorkView>();
		try {
			reList = agWorkInfoDao.getAgWorkViewList(att_AgWorkView);
		} catch (HSKDBException e) {
			e.printStackTrace();
		}
		return reList;
	}
	 
}