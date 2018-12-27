package com.hsk.angeldoctor.web.hospital.service.imp;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hsk.angeldoctor.api.daobbase.IAgDoctorInfoDao;
import com.hsk.angeldoctor.api.daobbase.IAgHospitalJobDao;
import com.hsk.angeldoctor.api.persistence.AgDoctorInfo;
import com.hsk.angeldoctor.api.persistence.AgHospitalJob;
import com.hsk.angeldoctor.web.hospital.service.IAgHospitalJobService;
import com.hsk.exception.HSKDBException;
import com.hsk.exception.HSKException;
import com.hsk.supper.dto.comm.PagerModel;
import com.hsk.supper.dto.comm.SysRetrunMessage;
import com.hsk.xframe.api.service.imp.DSTService;


/** 
  hospital业务操作实现类 
 * @author  作者:admin
 * @version  版本信息:v1.0   创建时间: 2018-08-14 13:28:00
 */
 
@Service
public class  AgHospitalJobService extends DSTService implements IAgHospitalJobService {	
   /**
   *业务处理dao类  agHospitalJobDao 
   */
	@Autowired
	protected IAgHospitalJobDao agHospitalJobDao;
	@Autowired
	protected IAgDoctorInfoDao agDoctorInfoDao;

 /**
	 * 根据ag_hospital_job表主键删除AgHospitalJob对象记录
     * @param  jobId  Integer类型(ag_hospital_job表主键)
	 * @return SysRetrunMessage 对象记录
	 * @throws HSKException
	 */

	public SysRetrunMessage findFormObject(Integer jobId) throws HSKException{
	        SysRetrunMessage srm=new SysRetrunMessage(1l);
			  	
			try{
		   			AgHospitalJob     att_AgHospitalJob= agHospitalJobDao.findAgHospitalJobById( jobId) ;
					srm.setObj(att_AgHospitalJob);
				} catch (HSKDBException e) {
					e.printStackTrace(); 
					srm.setCode(0l);
					srm.setMeg(e.getMessage()); 
				}
				 return srm ;
	} 

    /**
	 * 根据ag_hospital_job表主键删除AgHospitalJob对象记录
     * @param  jobId  Integer类型(ag_hospital_job表主键)
	 * @throws HSKException
	 */

	public AgHospitalJob findObject(Integer jobId) throws HSKException{
			AgHospitalJob  att_AgHospitalJob=new AgHospitalJob();		
			try{
		        att_AgHospitalJob= agHospitalJobDao.findAgHospitalJobById( jobId) ;
				} catch (HSKDBException e) {
					e.printStackTrace(); 
					throw new  HSKException(e);
				}
				return  att_AgHospitalJob;
	}
	
	 
	 /**
	 * 根据ag_hospital_job表主键删除AgHospitalJob对象记录
     * @param  jobId  Integer类型(ag_hospital_job表主键)
     * @return SysRetrunMessage 对象记录
	 * @throws HSKException
	 */
	public SysRetrunMessage deleteObject(Integer jobId) throws HSKException{  
		    SysRetrunMessage srm=new SysRetrunMessage(1l);
		   try{ 
			   AgHospitalJob att_AgHospitalJob= agHospitalJobDao.findAgHospitalJobById( jobId) ;
			   if(att_AgHospitalJob.getLocked().equals("1")){
				   srm.setCode(0l);
				   srm.setMeg("该岗位不可删除！");
				   return srm;
			   }else{
				   AgDoctorInfo doc = new AgDoctorInfo();
				   doc.setJobTitleId(jobId);
				   List<AgDoctorInfo> list = agDoctorInfoDao.getListByAgDoctorInfo(doc);
				   if(list != null && list.size() > 0){
					   srm.setCode(0l);
					   srm.setMeg("该岗位下有医生信息不可删除！");
					   return srm;
				   }else
					   agHospitalJobDao.deleteAgHospitalJobById(jobId);
			   }
			 } catch (Exception e) {
					e.printStackTrace(); 
					throw new  HSKException(e);
		     }
		   return srm;  
	}
	
	/**
	 * 根据ag_hospital_job表主键删除多条AgHospitalJob对象记录
     * @param  JobIds  Integer类型(ag_hospital_job表主键)
     * @return SysRetrunMessage 对象记录
	 * @throws HSKException
	 */
	public SysRetrunMessage deleteAllObject(String jobIds) throws HSKException{
		SysRetrunMessage srm = new SysRetrunMessage(1l);
		try {
			String[] ids = jobIds.split(",");
			for (String did : ids) {
				if (did != null && !"".equals(did.trim())) {
					agHospitalJobDao.deleteAgHospitalJobById(Integer
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
	 * 新增或修改ag_hospital_job表记录 ,如果ag_hospital_job表主键AgHospitalJob.JobId为空就是添加，如果非空就是修改
     * @param  att_AgHospitalJob  AgHospitalJob类型(ag_hospital_job表记录)
     * @return AgHospitalJob  修改后的AgHospitalJob对象记录
	 * @throws HSKDBException
	 */
	public SysRetrunMessage saveOrUpdateObject( AgHospitalJob att_AgHospitalJob) throws HSKException{
			 SysRetrunMessage srm = new SysRetrunMessage(1l);
			  try{
				 //查看岗位名称是否重复
				 //检查科室名称是否重复
				 AgHospitalJob checkInfo = new AgHospitalJob();
				 checkInfo.setName(att_AgHospitalJob.getName());
				 checkInfo.setRoleId(att_AgHospitalJob.getRoleId());
				 List<AgHospitalJob> checkList = agHospitalJobDao.getListByAgHospitalJob(checkInfo);
				 if(checkList !=null && checkList.size() >0){
					 boolean isSec=false;
				  	 if(att_AgHospitalJob.getJobId()!=null){
				  		for(AgHospitalJob xInfo : checkList){
					  		if(xInfo.getJobId().equals(att_AgHospitalJob.getJobId()))
					  			checkInfo=xInfo;
					  		else
					  			isSec=true;
					  	}
				  	}else
				  		isSec=true;
				  	if(isSec){
				  		srm.setCode(0l);
					    srm.setMeg("岗位名已被占用！");
					    return srm;
				  	}
				  }
				  if(att_AgHospitalJob.getJobId()==null){
					  att_AgHospitalJob.setLocked("0");
					  att_AgHospitalJob.setStatus("0");
					  att_AgHospitalJob.setCreateDate(new Date());
					  agHospitalJobDao.saveOrUpdateAgHospitalJob(att_AgHospitalJob); 
				  	}else if(checkInfo!=null && checkInfo.getJobId()!=null){
				  		checkInfo.setName(att_AgHospitalJob.getName());
				  		checkInfo.setRoleId(att_AgHospitalJob.getRoleId());
				  		agHospitalJobDao.saveOrUpdateAgHospitalJob(checkInfo); 
				  	}else
				  		agHospitalJobDao.saveOrUpdateAgHospitalJob(att_AgHospitalJob); 
					srm.setObj(att_AgHospitalJob);
			    } catch (Exception e) {
					e.printStackTrace(); 
					throw new HSKException(e);
		        }
			return srm;	  
	}
	
	 
	/**
	 *根据AgHospitalJob对象作为对(ag_hospital_job表进行查询，获取分页对象
     * @param  att_AgHospitalJob  AgHospitalJob类型(ag_hospital_job表记录)
     * @return PagerModel  分页对象
	 * @throws HSKException 
	 */
	public PagerModel getPagerModelObject (AgHospitalJob att_AgHospitalJob) throws HSKException{
		PagerModel pm=new PagerModel(new ArrayList<AgHospitalJob>());
			  try{
					pm=agHospitalJobDao.getPagerModelByAgHospitalJob(att_AgHospitalJob);
			    } catch (Exception e) {
					e.printStackTrace(); 
		        }
		return pm;
	}

	@Override
	public List<AgHospitalJob> getAgHospitalJobListByRoleId(Integer roleId) throws HSKException {
		List<AgHospitalJob> reList =new ArrayList<AgHospitalJob>();
		  try{
			  AgHospitalJob att_AgHospitalJob = new AgHospitalJob();
			  att_AgHospitalJob.setRoleId(roleId);
			  reList=agHospitalJobDao.getListByAgHospitalJob(att_AgHospitalJob);
		  } catch (Exception e) {
			e.printStackTrace(); 
		  }
		  return reList;
	} 
	 
}