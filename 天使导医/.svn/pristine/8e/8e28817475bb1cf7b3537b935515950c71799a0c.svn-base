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
public class  AgWorkModelService extends DSTService implements IAgWorkModelService {	
   /**
   *业务处理dao类  agWorkModelDao 
   */
	@Autowired
	protected IAgWorkModelDao agWorkModelDao;
	@Autowired
	protected IAgDoctorInfoDao agDoctorInfoDao;
	
	/**
	 * 关系表
	 */
	@Autowired
	private IAgWorkModelGxDao agWorkModelGxDao;


 /**
	 * 根据ag_work_model表主键删除AgWorkModel对象记录
     * @param  shiftTemplateId  Integer类型(ag_work_model表主键)
	 * @return SysRetrunMessage 对象记录
	 * @throws HSKException
	 */

	public SysRetrunMessage findFormObject(Integer shiftTemplateId) throws HSKException{
	        SysRetrunMessage srm=new SysRetrunMessage(1l);
			  	
			try{
		   			AgWorkModel     att_AgWorkModel= agWorkModelDao.findAgWorkModelById( shiftTemplateId) ;
					srm.setObj(att_AgWorkModel);
				} catch (HSKDBException e) {
					e.printStackTrace(); 
					srm.setCode(0l);
					srm.setMeg(e.getMessage()); 
				}
				 return srm ;
	} 

    /**
	 * 根据ag_work_model表主键删除AgWorkModel对象记录
     * @param  shiftTemplateId  Integer类型(ag_work_model表主键)
	 * @throws HSKException
	 */

	public AgWorkModel findObject(Integer shiftTemplateId) throws HSKException{
			AgWorkModel  att_AgWorkModel=new AgWorkModel();		
			try{
		        att_AgWorkModel= agWorkModelDao.findAgWorkModelById( shiftTemplateId) ;
				} catch (HSKDBException e) {
					e.printStackTrace(); 
					throw new  HSKException(e);
				}
				return  att_AgWorkModel;
	}
	
	 
	 /**
	 * 根据ag_work_model表主键删除AgWorkModel对象记录
     * @param  shiftTemplateId  Integer类型(ag_work_model表主键)
     * @return SysRetrunMessage 对象记录
	 * @throws HSKException
	 */
	public SysRetrunMessage deleteObject(Integer shiftTemplateId) throws HSKException{  
		    SysRetrunMessage srm=new SysRetrunMessage(1l);
		   try{ 
				agWorkModelDao.deleteAgWorkModelById(shiftTemplateId);
			 } catch (Exception e) {
					e.printStackTrace(); 
					throw new  HSKException(e);
		     }
		   return srm;  
	}
	
	/**
	 * 根据ag_work_model表主键删除多条AgWorkModel对象记录
     * @param  ShiftTemplateIds  Integer类型(ag_work_model表主键)
     * @return SysRetrunMessage 对象记录
	 * @throws HSKException
	 */
	public SysRetrunMessage deleteAllObject(String shiftTemplateIds) throws HSKException{
		SysRetrunMessage srm = new SysRetrunMessage(1l);
		try {
			String[] ids = shiftTemplateIds.split(",");
			for (String did : ids) {
				if (did != null && !"".equals(did.trim())) {
					agWorkModelDao.deleteAgWorkModelById(Integer
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
	 * 新增或修改ag_work_model表记录 ,如果ag_work_model表主键AgWorkModel.ShiftTemplateId为空就是添加，如果非空就是修改
     * @param  att_AgWorkModel  AgWorkModel类型(ag_work_model表记录)
     * @return AgWorkModel  修改后的AgWorkModel对象记录
	 * @throws HSKDBException
	 */
	public SysRetrunMessage saveOrUpdateObject( AgWorkModel att_AgWorkModel) throws HSKException{
			 SysRetrunMessage srm = new SysRetrunMessage(1l);
			  try{
					agWorkModelDao.saveOrUpdateAgWorkModel(att_AgWorkModel); 
					srm.setObj(att_AgWorkModel);
			    } catch (Exception e) {
					e.printStackTrace(); 
					throw new HSKException(e);
		        }
			return srm;	  
	}
	
	 
	/**
	 *根据AgWorkModel对象作为对(ag_work_model表进行查询，获取分页对象
     * @param  att_AgWorkModel  AgWorkModel类型(ag_work_model表记录)
     * @return PagerModel  分页对象
	 * @throws HSKException 
	 */
	public PagerModel getPagerModelObject (AgWorkModel att_AgWorkModel) throws HSKException{
		PagerModel pm=new PagerModel(new ArrayList<AgWorkModel>());
			  try{
				  if(this.GetOneSessionAccount().getUserType()==2){//如果是医院管理员登录
					  att_AgWorkModel.setOrganizationId(this.GetOneSessionAccount().getSroleId());
					}else if(this.GetOneSessionAccount().getUserType()==3){//如果是医生登录
						AgDoctorInfo att_AgDoctorInfo= agDoctorInfoDao.findAgDoctorInfoById(this.GetOneSessionAccount().getSroleId());
						att_AgWorkModel.setOrganizationId(att_AgDoctorInfo.getOrganizationId());
					}
					pm=agWorkModelDao.getPagerModelByAgWorkModel(att_AgWorkModel);
			    } catch (Exception e) {
					e.printStackTrace(); 
		        }
		return pm;
	} 
	 
	
	public SysRetrunMessage saveOrUpdateAgWorkModel(AgWorkModel  att_AgWorkModel ,List<AgWorkModelGx> list_obj) throws HSKException{
		 SysRetrunMessage srm = new SysRetrunMessage(1l);
		  try{
			  if(this.GetOneSessionAccount().getUserType()==2){//如果是医院管理员登录
				  att_AgWorkModel.setOrganizationId(this.GetOneSessionAccount().getSroleId());
				}else if(this.GetOneSessionAccount().getUserType()==3){//如果是医生登录
					AgDoctorInfo att_AgDoctorInfo= agDoctorInfoDao.findAgDoctorInfoById(this.GetOneSessionAccount().getSroleId());
					att_AgWorkModel.setOrganizationId(att_AgDoctorInfo.getOrganizationId());
				}
			   if(list_obj!=null&&list_obj.size()>0){ 
				   agWorkModelDao.saveOrUpdateAgWorkModel(att_AgWorkModel);  
			     for(AgWorkModelGx  att_AgWorkModelGx:list_obj){  
			    	 att_AgWorkModelGx.setShiftTemplateId(att_AgWorkModel.getId()); 
			    	 agWorkModelGxDao .saveAgWorkModelGx(att_AgWorkModelGx);
			     } 
			   } 
		    } catch (Exception e) {
				e.printStackTrace(); 
				throw new HSKException(e);
	        }
		return srm;
	}
	
}