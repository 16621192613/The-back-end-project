package com.hsk.angeldoctor.web.operate.service.imp;

import java.util.*;
import org.springframework.stereotype.*;
import org.springframework.beans.factory.annotation.Autowired;
import com.hsk.supper.dto.comm.PagerModel;
import com.hsk.supper.dto.comm.SysRetrunMessage;
import com.hsk.xframe.api.persistence.SysUserInfo;
import com.hsk.xframe.api.service.imp.DSTService;
import com.hsk.exception.HSKDBException;
import com.hsk.exception.HSKException;
import com.hsk.angeldoctor.web.operate.service.*;
import com.hsk.angeldoctor.api.persistence.*;
import com.hsk.angeldoctor.api.daobbase.*;


/** 
  operate业务操作实现类 
 * @author  作者:admin
 * @version  版本信息:v1.0   创建时间: 2018-08-14 13:40:21
 */
 
@Service
public class  AgFeedbackInfoService extends DSTService implements IAgFeedbackInfoService {	
   /**
   *业务处理dao类  agFeedbackInfoDao 
   */
	@Autowired
	protected IAgFeedbackInfoDao agFeedbackInfoDao;
	@Autowired
	protected IAgPatientInfoDao agPatientInfoDao;
	@Autowired
	private IAgMoneyCountDao agMoneyCountDao;

 /**
	 * 根据ag_feedback_info表主键删除AgFeedbackInfo对象记录
     * @param  afbiId  Integer类型(ag_feedback_info表主键)
	 * @return SysRetrunMessage 对象记录
	 * @throws HSKException
	 */

	public SysRetrunMessage findFormObject(Integer afbiId) throws HSKException{
	        SysRetrunMessage srm=new SysRetrunMessage(1l);
			  	
			try{
		   			AgFeedbackInfo     att_AgFeedbackInfo= agFeedbackInfoDao.findAgFeedbackInfoById( afbiId) ;
					srm.setObj(att_AgFeedbackInfo);
				} catch (HSKDBException e) {
					e.printStackTrace(); 
					srm.setCode(0l);
					srm.setMeg(e.getMessage()); 
				}
				 return srm ;
	} 

    /**
	 * 根据ag_feedback_info表主键删除AgFeedbackInfo对象记录
     * @param  afbiId  Integer类型(ag_feedback_info表主键)
	 * @throws HSKException
	 */

	public AgFeedbackInfo findObject(Integer afbiId) throws HSKException{
			AgFeedbackInfo  att_AgFeedbackInfo=new AgFeedbackInfo();		
			try{
		        att_AgFeedbackInfo= agFeedbackInfoDao.findAgFeedbackInfoById( afbiId) ;
				} catch (HSKDBException e) {
					e.printStackTrace(); 
					throw new  HSKException(e);
				}
				return  att_AgFeedbackInfo;
	}
	
	 
	 /**
	 * 根据ag_feedback_info表主键删除AgFeedbackInfo对象记录
     * @param  afbiId  Integer类型(ag_feedback_info表主键)
     * @return SysRetrunMessage 对象记录
	 * @throws HSKException
	 */
	public SysRetrunMessage deleteObject(Integer afbiId) throws HSKException{  
		    SysRetrunMessage srm=new SysRetrunMessage(1l);
		   try{ 
				agFeedbackInfoDao.deleteAgFeedbackInfoById(afbiId);
			 } catch (Exception e) {
					e.printStackTrace(); 
					throw new  HSKException(e);
		     }
		   return srm;  
	}
	
	/**
	 * 根据ag_feedback_info表主键删除多条AgFeedbackInfo对象记录
     * @param  AfbiIds  Integer类型(ag_feedback_info表主键)
     * @return SysRetrunMessage 对象记录
	 * @throws HSKException
	 */
	public SysRetrunMessage deleteAllObject(String afbiIds) throws HSKException{
		SysRetrunMessage srm = new SysRetrunMessage(1l);
		try {
			String[] ids = afbiIds.split(",");
			for (String did : ids) {
				if (did != null && !"".equals(did.trim())) {
					agFeedbackInfoDao.deleteAgFeedbackInfoById(Integer
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
	 * 新增或修改ag_feedback_info表记录 ,如果ag_feedback_info表主键AgFeedbackInfo.AfbiId为空就是添加，如果非空就是修改
     * @param  att_AgFeedbackInfo  AgFeedbackInfo类型(ag_feedback_info表记录)
     * @return AgFeedbackInfo  修改后的AgFeedbackInfo对象记录
	 * @throws HSKDBException
	 */
	public SysRetrunMessage saveOrUpdateObject( AgFeedbackInfo att_AgFeedbackInfo) throws HSKException{
			 SysRetrunMessage srm = new SysRetrunMessage(1l);
			  try{
				  	if(att_AgFeedbackInfo.getAfbiId()!=null)
				  		agFeedbackInfoDao.saveOrUpdateAgFeedbackInfo(att_AgFeedbackInfo); 
				  	else{
				  		//检验是否已经评价过了 
				  		AgFeedbackInfo check_AgFeedbackInfo=new AgFeedbackInfo();
				  		check_AgFeedbackInfo.setMedicalRecordId(att_AgFeedbackInfo.getMedicalRecordId());
				  		List<AgFeedbackInfo> checkList = agFeedbackInfoDao.getListByAgFeedbackInfo(check_AgFeedbackInfo);
				  		if(checkList!=null && checkList.size() >0){
				  			srm.setCode(0l);
				  			srm.setMeg("该信息已经反馈，不允许多次反馈!");
				  			return srm;
				  		}
				  		
				  		if(att_AgFeedbackInfo.getFeedbackType().equals("1")){
				  			AgMoneyCount att_AgMoneyCount =new AgMoneyCount();
							att_AgMoneyCount.setSuiId(att_AgFeedbackInfo.getUserId());
							att_AgMoneyCount.setAmcType("4");
							att_AgMoneyCount.setEvaluationsCount(1);
							agMoneyCountDao.updateAgMoneyCount(att_AgMoneyCount);
				  		}else if(att_AgFeedbackInfo.getFeedbackType().equals("2")){
				  			AgMoneyCount att_AgMoneyCount =new AgMoneyCount();
							att_AgMoneyCount.setSuiId(att_AgFeedbackInfo.getUserId());
							att_AgMoneyCount.setAmcType("3");
							att_AgMoneyCount.setEvaluationsCount(1);
							agMoneyCountDao.updateAgMoneyCount(att_AgMoneyCount);
				  		}
				  		att_AgFeedbackInfo.setReplied("0");
				  		att_AgFeedbackInfo.setStatus("0");
				  		att_AgFeedbackInfo.setCreateDate(new Date());
				  		agFeedbackInfoDao.saveOrUpdateAgFeedbackInfo(att_AgFeedbackInfo); 
				  	}
					srm.setObj(att_AgFeedbackInfo);
			    } catch (Exception e) {
					e.printStackTrace(); 
	
					throw new HSKException(e);
		        }
			return srm;	  
	}
	
	 
	/**
	 *根据AgFeedbackInfo对象作为对(ag_feedback_info表进行查询，获取分页对象
     * @param  att_AgFeedbackInfo  AgFeedbackInfo类型(ag_feedback_info表记录)
     * @return PagerModel  分页对象
	 * @throws HSKException 
	 */
	public PagerModel getPagerModelObject (AgFeedbackInfo att_AgFeedbackInfo) throws HSKException{
		PagerModel pm=new PagerModel(new ArrayList<AgFeedbackInfo>());
			  try{
				  if(att_AgFeedbackInfo.getPatientName()!=null && !att_AgFeedbackInfo.getPatientName().trim().equals("")){
				  		AgPatientInfo att_AgPatientInfo = new AgPatientInfo();
				  		att_AgPatientInfo.setName(att_AgFeedbackInfo.getPatientName());
				  		att_AgPatientInfo.setTab_like("name");
				  		List<AgPatientInfo> list=agPatientInfoDao.getListByAgPatientInfo(att_AgPatientInfo);
				  		if(list !=null && list.size()>0){
				  			String patientId_str="";
				  			for(AgPatientInfo info:list)
				  				patientId_str+=info.getPatientId()+",";
				  			patientId_str=patientId_str.substring(0, patientId_str.length()-1);
				  			att_AgFeedbackInfo.setUserId_str(patientId_str);
				  		}else
				  			return pm;
				  	}
				  if(this.GetOneSessionAccount().getUserType()==5){//如果是业务员只查询本业务员的反馈信息
					  att_AgFeedbackInfo.setUserId(this.GetOneSessionAccount().getSroleId());
					}
				  att_AgFeedbackInfo.setTab_order("afbiId desc");
					pm=agFeedbackInfoDao.getPagerModelByAgFeedbackInfo(att_AgFeedbackInfo);
			    } catch (Exception e) {
					e.printStackTrace(); 
		        }
			  return pm;
	} 
	 
}