package com.hsk.angeldoctor.api.daobbase.imp;

import java.util.*;
import com.hsk.supper.dto.comm.PagerModel;
import org.springframework.stereotype.*;
import com.hsk.exception.HSKDBException;
import com.hsk.supper.dao.imp.SupperDao;
import com.hsk.angeldoctor.api.daobbase.*;
import com.hsk.angeldoctor.api.persistence.*;

/** 
 * ag_hospital_job表数据库层面操作实现类 
 * @author  作者:admin
 * @version  版本信息:v1.0   创建时间: 2018-08-14 13:28:00
 */
@Component
public class  AgHospitalJobDao extends SupperDao implements IAgHospitalJobDao {	

	/**
	 * 根据ag_hospital_job表主键查找AgHospitalJob对象记录
	 * 
	 * @param  JobId  Integer类型(ag_hospital_job表主键)
	 * @return AgHospitalJob ag_hospital_job表记录
	 * @throws HSKDBException
	 */	
	public AgHospitalJob findAgHospitalJobById(Integer JobId) throws HSKDBException{
				AgHospitalJob  att_AgHospitalJob=new AgHospitalJob();				
				if(JobId!=null){
					att_AgHospitalJob.setJobId(JobId);	
				    Object obj=	this.getOne(att_AgHospitalJob);
					if(obj!=null){
						att_AgHospitalJob=(AgHospitalJob) obj;
					}
				}
				return  att_AgHospitalJob;
	}
	 /**
	  * 根据ag_hospital_job表主键删除AgHospitalJob对象记录
	  * @param  JobId  Integer类型(ag_hospital_job表主键)
	  * @throws HSKDBException
	  */
	public void deleteAgHospitalJobById(Integer JobId) throws HSKDBException{ 
		 AgHospitalJob  att_AgHospitalJob=new AgHospitalJob();	
		  if(JobId!=null){
					  att_AgHospitalJob.setJobId(JobId);
				  	  Object obj=	this.getOne(att_AgHospitalJob);
					  if(obj!=null){
							this.deleteObject(obj); 
					  }
			}
	}

	/**
 	 * 根据ag_hospital_job表主键修改AgHospitalJob对象记录
     * @param  JobId  Integer类型(ag_hospital_job表主键)
     * @param  att_AgHospitalJob  AgHospitalJob类型(ag_hospital_job表记录)
     * @return AgHospitalJob  修改后的AgHospitalJob对象记录
	 * @throws HSKDBException
	 */
	public  AgHospitalJob updateAgHospitalJobById(Integer JobId,AgHospitalJob att_AgHospitalJob) throws HSKDBException{
		  if(JobId!=null){
					att_AgHospitalJob.setJobId(JobId);
				   	Object obj=	this.getOne(att_AgHospitalJob);
					if(obj!=null){							 
							this.updateObject(obj);
					}
			}
			return  att_AgHospitalJob;
	}
	
	/**
	 * 新增ag_hospital_job表 记录
     * @param  att_AgHospitalJob  AgHospitalJob类型(ag_hospital_job表记录)
	 * @throws HSKDBException
	 */
	public Integer saveAgHospitalJob(AgHospitalJob att_AgHospitalJob) throws HSKDBException{
		 return this.newObject(att_AgHospitalJob);
	} 
		
	/**
	 * 新增或修改ag_hospital_job表记录 ,如果ag_hospital_job表主键AgHospitalJob.JobId为空就是添加，如果非空就是修改
     * @param  att_AgHospitalJob  AgHospitalJob类型(ag_hospital_job表记录)
	 * @throws HSKDBException
	 */
	public  AgHospitalJob saveOrUpdateAgHospitalJob(AgHospitalJob att_AgHospitalJob) throws HSKDBException{
		  this.getHibernateTemplate().saveOrUpdate(att_AgHospitalJob);
		  return att_AgHospitalJob;
	}
	
	/**
	 *根据AgHospitalJob对象作为对(ag_hospital_job表进行查询，获取列表对象
     * @param  att_AgHospitalJob  AgHospitalJob类型(ag_hospital_job表记录)
     * @return List<AgHospitalJob>  列表对象
	 * @throws HSKDBException 
	 */
	 @SuppressWarnings("unchecked")
	public List<AgHospitalJob> getListByAgHospitalJob(AgHospitalJob att_AgHospitalJob) throws HSKDBException{
		String Hql=this.getHql( att_AgHospitalJob); 
		List<AgHospitalJob> list=this.getHibernateTemplate().find(Hql);
		return  list;
	}
	/**
	 *根据AgHospitalJob对象作为对(ag_hospital_job表进行查询，获取分页对象
     * @param  att_AgHospitalJob  AgHospitalJob类型(ag_hospital_job表记录)
     * @return List<AgHospitalJob>  分页对象
	 * @throws HSKDBException 
	 */
	public PagerModel getPagerModelByAgHospitalJob(AgHospitalJob att_AgHospitalJob)
			throws HSKDBException {
		String Hql=this.getHql(att_AgHospitalJob);
		return this.getHibernateDao().findByPage(Hql); 
	} 
	/**
	 * 根据AgHospitalJob对象获取Hql字符串
     * @param  att_AgHospitalJob  AgHospitalJob类型(ag_hospital_job表记录)
	 *  @return hql字符串
	 */
	private String  getHql(AgHospitalJob att_AgHospitalJob){
			 StringBuffer sbuffer = new StringBuffer( " from  AgHospitalJob  where  1=1  ");
			 String likeStr=  att_AgHospitalJob.getTab_like();
			 String orderStr= att_AgHospitalJob.getTab_order();
			 
			 //*****************无关字段处理begin*****************
						   		 //处理in条件 岗位ID(jobId)
							     if(att_AgHospitalJob.getJobId_str()!=null&&
						   		    !"".equals(att_AgHospitalJob.getJobId_str().trim())){ 
											 String  intStr=att_AgHospitalJob.getJobId_str().trim();
											 String[]  arrayStr=intStr.split(","); 
											 
											  if(arrayStr.length>0){
												 sbuffer.append(" and ( ");
												 for(int i=0;i<arrayStr.length;i++){
													 String did=arrayStr[i];
													 if(i==arrayStr.length-1){
														 sbuffer.append("  jobId="+did+"   "); 
													 }else {
													 sbuffer.append("  jobId="+did+" or "); 
													 }
												 }
												 sbuffer.append(" ) "); 
											 }
											   
								 	}
						   		 //处理in条件 角色id(roleId)
							     if(att_AgHospitalJob.getRoleId_str()!=null&&
						   		    !"".equals(att_AgHospitalJob.getRoleId_str().trim())){ 
											 String  intStr=att_AgHospitalJob.getRoleId_str().trim();
											 String[]  arrayStr=intStr.split(","); 
											 
											  if(arrayStr.length>0){
												 sbuffer.append(" and ( ");
												 for(int i=0;i<arrayStr.length;i++){
													 String did=arrayStr[i];
													 if(i==arrayStr.length-1){
														 sbuffer.append("  roleId="+did+"   "); 
													 }else {
													 sbuffer.append("  roleId="+did+" or "); 
													 }
												 }
												 sbuffer.append(" ) "); 
											 }
											   
								 	}
								 		//时间类型开始条件处理  创建时间(createDate)
									  if(att_AgHospitalJob.getCreateDate_start()!=null){
								   	    	sbuffer.append( " and  createDate<='" +att_AgHospitalJob.getCreateDate_start()+"'" );  
										 }
								 	  //时间类型结束条件处理 创建时间(createDate)
									 	if(att_AgHospitalJob.getCreateDate_end()!=null){
						   	      			sbuffer.append( " and  createDate>'" +att_AgHospitalJob.getCreateDate_end()+"'" );  
								  	     } 
								 		//时间类型开始条件处理  修改时间(editDate)
									  if(att_AgHospitalJob.getEditDate_start()!=null){
								   	    	sbuffer.append( " and  editDate<='" +att_AgHospitalJob.getEditDate_start()+"'" );  
										 }
								 	  //时间类型结束条件处理 修改时间(editDate)
									 	if(att_AgHospitalJob.getEditDate_end()!=null){
						   	      			sbuffer.append( " and  editDate>'" +att_AgHospitalJob.getEditDate_end()+"'" );  
								  	     } 
			 //*****************无关字段处理end*****************
			 //*****************数据库字段处理begin*************
								  		//岗位ID(jobId)
					 					if(att_AgHospitalJob.getJobId()!=null){
											 sbuffer.append( " and jobId=" +att_AgHospitalJob.getJobId() );
										 }
								  		//角色id(roleId)
					 					if(att_AgHospitalJob.getRoleId()!=null){
											 sbuffer.append( " and roleId=" +att_AgHospitalJob.getRoleId() );
										 }
					       				//岗位名称(name)		 					 
									 if(att_AgHospitalJob.getName()!=null&&
									  !"".equals(att_AgHospitalJob.getName().trim())){
										  if(likeStr!=null&&!"".equals(likeStr.trim())&&likeStr.indexOf("name")!=-1){
											  sbuffer.append( " and name  like '%"+att_AgHospitalJob.getName()+"%'"   );
										  }else {
											  sbuffer.append( " and name   ='"+att_AgHospitalJob.getName()+"'"   );
										  }
									 }
					       				//是否可编辑：0是1否(locked)		 					 
									 if(att_AgHospitalJob.getLocked()!=null&&
									  !"".equals(att_AgHospitalJob.getLocked().trim())){
										  if(likeStr!=null&&!"".equals(likeStr.trim())&&likeStr.indexOf("locked")!=-1){
											  sbuffer.append( " and locked  like '%"+att_AgHospitalJob.getLocked()+"%'"   );
										  }else {
											  sbuffer.append( " and locked   ='"+att_AgHospitalJob.getLocked()+"'"   );
										  }
									 }
					       				//状态(status)		 					 
									 if(att_AgHospitalJob.getStatus()!=null&&
									  !"".equals(att_AgHospitalJob.getStatus().trim())){
										  if(likeStr!=null&&!"".equals(likeStr.trim())&&likeStr.indexOf("status")!=-1){
											  sbuffer.append( " and status  like '%"+att_AgHospitalJob.getStatus()+"%'"   );
										  }else {
											  sbuffer.append( " and status   ='"+att_AgHospitalJob.getStatus()+"'"   );
										  }
									 }
					       				//创建人(createRen)		 					 
									 if(att_AgHospitalJob.getCreateRen()!=null&&
									  !"".equals(att_AgHospitalJob.getCreateRen().trim())){
										  if(likeStr!=null&&!"".equals(likeStr.trim())&&likeStr.indexOf("createRen")!=-1){
											  sbuffer.append( " and createRen  like '%"+att_AgHospitalJob.getCreateRen()+"%'"   );
										  }else {
											  sbuffer.append( " and createRen   ='"+att_AgHospitalJob.getCreateRen()+"'"   );
										  }
									 }
						   				//创建时间(createDate)
						 				if(att_AgHospitalJob.getCreateDate()!=null){
						   	                   sbuffer.append( " and  createDate='" +att_AgHospitalJob.getCreateDate()+"'" );  
								  		}
					       				//修改人(editRen)		 					 
									 if(att_AgHospitalJob.getEditRen()!=null&&
									  !"".equals(att_AgHospitalJob.getEditRen().trim())){
										  if(likeStr!=null&&!"".equals(likeStr.trim())&&likeStr.indexOf("editRen")!=-1){
											  sbuffer.append( " and editRen  like '%"+att_AgHospitalJob.getEditRen()+"%'"   );
										  }else {
											  sbuffer.append( " and editRen   ='"+att_AgHospitalJob.getEditRen()+"'"   );
										  }
									 }
						   				//修改时间(editDate)
						 				if(att_AgHospitalJob.getEditDate()!=null){
						   	                   sbuffer.append( " and  editDate='" +att_AgHospitalJob.getEditDate()+"'" );  
								  		}
			 //*****************数据库字段处理end***************
			  		if(orderStr!=null&&!"".equals(orderStr.trim())){
									 sbuffer.append( " order by "+orderStr);
						 }
						 /*
						 else {
							  sbuffer.append( " order by  JobId   desc " );
					      }
					      */
			 
			 return  sbuffer.toString();
	}
}