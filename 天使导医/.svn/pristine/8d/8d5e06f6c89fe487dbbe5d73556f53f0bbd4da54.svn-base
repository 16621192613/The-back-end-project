package com.hsk.angeldoctor.api.daobbase.imp;

import java.text.SimpleDateFormat;
import java.util.*;
import com.hsk.supper.dto.comm.PagerModel;
import org.springframework.stereotype.*;
import com.hsk.exception.HSKDBException;
import com.hsk.supper.dao.imp.SupperDao;
import com.hsk.angeldoctor.api.daobbase.*;
import com.hsk.angeldoctor.api.persistence.*;

/** 
 * ag_evaluate_info表数据库层面操作实现类 
 * @author  作者:admin
 * @version  版本信息:v1.0   创建时间: 2018-08-14 13:40:21
 */
@Component
public class  AgEvaluateInfoDao extends SupperDao implements IAgEvaluateInfoDao {	

	/**
	 * 根据ag_evaluate_info表主键查找AgEvaluateInfo对象记录
	 * 
	 * @param  AeiId  Integer类型(ag_evaluate_info表主键)
	 * @return AgEvaluateInfo ag_evaluate_info表记录
	 * @throws HSKDBException
	 */	
	public AgEvaluateInfo findAgEvaluateInfoById(Integer AeiId) throws HSKDBException{
				AgEvaluateInfo  att_AgEvaluateInfo=new AgEvaluateInfo();				
				if(AeiId!=null){
					att_AgEvaluateInfo.setAeiId(AeiId);	
				    Object obj=	this.getOne(att_AgEvaluateInfo);
					if(obj!=null){
						att_AgEvaluateInfo=(AgEvaluateInfo) obj;
					}
				}
				return  att_AgEvaluateInfo;
	}
	 /**
	  * 根据ag_evaluate_info表主键删除AgEvaluateInfo对象记录
	  * @param  AeiId  Integer类型(ag_evaluate_info表主键)
	  * @throws HSKDBException
	  */
	public void deleteAgEvaluateInfoById(Integer AeiId) throws HSKDBException{ 
		 AgEvaluateInfo  att_AgEvaluateInfo=new AgEvaluateInfo();	
		  if(AeiId!=null){
					  att_AgEvaluateInfo.setAeiId(AeiId);
				  	  Object obj=	this.getOne(att_AgEvaluateInfo);
					  if(obj!=null){
							this.deleteObject(obj); 
					  }
			}
	}

	/**
 	 * 根据ag_evaluate_info表主键修改AgEvaluateInfo对象记录
     * @param  AeiId  Integer类型(ag_evaluate_info表主键)
     * @param  att_AgEvaluateInfo  AgEvaluateInfo类型(ag_evaluate_info表记录)
     * @return AgEvaluateInfo  修改后的AgEvaluateInfo对象记录
	 * @throws HSKDBException
	 */
	public  AgEvaluateInfo updateAgEvaluateInfoById(Integer AeiId,AgEvaluateInfo att_AgEvaluateInfo) throws HSKDBException{
		  if(AeiId!=null){
					att_AgEvaluateInfo.setAeiId(AeiId);
				   	Object obj=	this.getOne(att_AgEvaluateInfo);
					if(obj!=null){							 
							this.updateObject(obj);
					}
			}
			return  att_AgEvaluateInfo;
	}
	
	/**
	 * 新增ag_evaluate_info表 记录
     * @param  att_AgEvaluateInfo  AgEvaluateInfo类型(ag_evaluate_info表记录)
	 * @throws HSKDBException
	 */
	public Integer saveAgEvaluateInfo(AgEvaluateInfo att_AgEvaluateInfo) throws HSKDBException{
		 return this.newObject(att_AgEvaluateInfo);
	} 
		
	/**
	 * 新增或修改ag_evaluate_info表记录 ,如果ag_evaluate_info表主键AgEvaluateInfo.AeiId为空就是添加，如果非空就是修改
     * @param  att_AgEvaluateInfo  AgEvaluateInfo类型(ag_evaluate_info表记录)
	 * @throws HSKDBException
	 */
	public  AgEvaluateInfo saveOrUpdateAgEvaluateInfo(AgEvaluateInfo att_AgEvaluateInfo) throws HSKDBException{
		  this.getHibernateTemplate().saveOrUpdate(att_AgEvaluateInfo);
		  return att_AgEvaluateInfo;
	}
	
	/**
	 *根据AgEvaluateInfo对象作为对(ag_evaluate_info表进行查询，获取列表对象
     * @param  att_AgEvaluateInfo  AgEvaluateInfo类型(ag_evaluate_info表记录)
     * @return List<AgEvaluateInfo>  列表对象
	 * @throws HSKDBException 
	 */
	 @SuppressWarnings("unchecked")
	public List<AgEvaluateInfo> getListByAgEvaluateInfo(AgEvaluateInfo att_AgEvaluateInfo) throws HSKDBException{
		String Hql=this.getHql( att_AgEvaluateInfo); 
		List<AgEvaluateInfo> list=this.getHibernateTemplate().find(Hql);
		return  list;
	}
	/**
	 *根据AgEvaluateInfo对象作为对(ag_evaluate_info表进行查询，获取分页对象
     * @param  att_AgEvaluateInfo  AgEvaluateInfo类型(ag_evaluate_info表记录)
     * @return List<AgEvaluateInfo>  分页对象
	 * @throws HSKDBException 
	 */
	public PagerModel getPagerModelByAgEvaluateInfo(AgEvaluateInfo att_AgEvaluateInfo)
			throws HSKDBException {
		String Hql=this.getHql(att_AgEvaluateInfo);
		return this.getHibernateDao().findByPage(Hql); 
	} 
	/**
	 * 根据AgEvaluateInfo对象获取Hql字符串
     * @param  att_AgEvaluateInfo  AgEvaluateInfo类型(ag_evaluate_info表记录)
	 *  @return hql字符串
	 */
	private String  getHql(AgEvaluateInfo att_AgEvaluateInfo){
			 StringBuffer sbuffer = new StringBuffer( " from  AgEvaluateInfo  where  1=1  ");
			 String likeStr=  att_AgEvaluateInfo.getTab_like();
			 String orderStr= att_AgEvaluateInfo.getTab_order();
			 
			 //*****************无关字段处理begin*****************
						   		 //处理in条件 评价ID(aeiId)
							     if(att_AgEvaluateInfo.getAeiId_str()!=null&&
						   		    !"".equals(att_AgEvaluateInfo.getAeiId_str().trim())){ 
											 String  intStr=att_AgEvaluateInfo.getAeiId_str().trim();
											 String[]  arrayStr=intStr.split(","); 
											 
											  if(arrayStr.length>0){
												 sbuffer.append(" and ( ");
												 for(int i=0;i<arrayStr.length;i++){
													 String did=arrayStr[i];
													 if(i==arrayStr.length-1){
														 sbuffer.append("  aeiId="+did+"   "); 
													 }else {
													 sbuffer.append("  aeiId="+did+" or "); 
													 }
												 }
												 sbuffer.append(" ) "); 
											 }
											   
								 	}
						   		 //处理in条件 患者ID(patientId)
							     if(att_AgEvaluateInfo.getPatientId_str()!=null&&
						   		    !"".equals(att_AgEvaluateInfo.getPatientId_str().trim())){ 
											 String  intStr=att_AgEvaluateInfo.getPatientId_str().trim();
											 String[]  arrayStr=intStr.split(","); 
											 
											  if(arrayStr.length>0){
												 sbuffer.append(" and ( ");
												 for(int i=0;i<arrayStr.length;i++){
													 String did=arrayStr[i];
													 if(i==arrayStr.length-1){
														 sbuffer.append("  patientId="+did+"   "); 
													 }else {
													 sbuffer.append("  patientId="+did+" or "); 
													 }
												 }
												 sbuffer.append(" ) "); 
											 }
											   
								 	}
						   		 //处理in条件 预约ID(medicalRecordId)
							     if(att_AgEvaluateInfo.getMedicalRecordId_str()!=null&&
						   		    !"".equals(att_AgEvaluateInfo.getMedicalRecordId_str().trim())){ 
											 String  intStr=att_AgEvaluateInfo.getMedicalRecordId_str().trim();
											 String[]  arrayStr=intStr.split(","); 
											 
											  if(arrayStr.length>0){
												 sbuffer.append(" and ( ");
												 for(int i=0;i<arrayStr.length;i++){
													 String did=arrayStr[i];
													 if(i==arrayStr.length-1){
														 sbuffer.append("  medicalRecordId="+did+"   "); 
													 }else {
													 sbuffer.append("  medicalRecordId="+did+" or "); 
													 }
												 }
												 sbuffer.append(" ) "); 
											 }
											   
								 	}
						   		 //处理in条件 医院ID(organizationId)
							     if(att_AgEvaluateInfo.getOrganizationId_str()!=null&&
						   		    !"".equals(att_AgEvaluateInfo.getOrganizationId_str().trim())){ 
											 String  intStr=att_AgEvaluateInfo.getOrganizationId_str().trim();
											 String[]  arrayStr=intStr.split(","); 
											 
											  if(arrayStr.length>0){
												 sbuffer.append(" and ( ");
												 for(int i=0;i<arrayStr.length;i++){
													 String did=arrayStr[i];
													 if(i==arrayStr.length-1){
														 sbuffer.append("  organizationId="+did+"   "); 
													 }else {
													 sbuffer.append("  organizationId="+did+" or "); 
													 }
												 }
												 sbuffer.append(" ) "); 
											 }
											   
								 	}
						   		 //处理in条件 医生ID(doctorId)
							     if(att_AgEvaluateInfo.getDoctorId_str()!=null&&
						   		    !"".equals(att_AgEvaluateInfo.getDoctorId_str().trim())){ 
											 String  intStr=att_AgEvaluateInfo.getDoctorId_str().trim();
											 String[]  arrayStr=intStr.split(","); 
											 
											  if(arrayStr.length>0){
												 sbuffer.append(" and ( ");
												 for(int i=0;i<arrayStr.length;i++){
													 String did=arrayStr[i];
													 if(i==arrayStr.length-1){
														 sbuffer.append("  doctorId="+did+"   "); 
													 }else {
													 sbuffer.append("  doctorId="+did+" or "); 
													 }
												 }
												 sbuffer.append(" ) "); 
											 }
											   
								 	}
						   		 //处理in条件 回复人ID(repUserId)
							     if(att_AgEvaluateInfo.getRepUserId_str()!=null&&
						   		    !"".equals(att_AgEvaluateInfo.getRepUserId_str().trim())){ 
											 String  intStr=att_AgEvaluateInfo.getRepUserId_str().trim();
											 String[]  arrayStr=intStr.split(","); 
											 
											  if(arrayStr.length>0){
												 sbuffer.append(" and ( ");
												 for(int i=0;i<arrayStr.length;i++){
													 String did=arrayStr[i];
													 if(i==arrayStr.length-1){
														 sbuffer.append("  repUserId="+did+"   "); 
													 }else {
													 sbuffer.append("  repUserId="+did+" or "); 
													 }
												 }
												 sbuffer.append(" ) "); 
											 }
											   
								 	}
							     SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");
							 		//时间类型开始条件处理  创建时间(createDate)
								  if(att_AgEvaluateInfo.getCreateDate_start()!=null){
							   	    	sbuffer.append( " and  createDate >='" +sdf.format(att_AgEvaluateInfo.getCreateDate_start())+" 00:00:00'" );  
									 }
							 	  //时间类型结束条件处理 创建时间(createDate)
								 	if(att_AgEvaluateInfo.getCreateDate_end()!=null){
					   	      			sbuffer.append( " and  createDate<='" +sdf.format(att_AgEvaluateInfo.getCreateDate_end())+" 23:59:59'" );  
							  	     } 
								 		//时间类型开始条件处理  创建时间(createDate)
									  if(att_AgEvaluateInfo.getCreateDate_start()!=null){
								   	    	sbuffer.append( " and  createDate<='" +att_AgEvaluateInfo.getCreateDate_start()+"'" );  
										 }
								 	  //时间类型结束条件处理 创建时间(createDate)
									 	if(att_AgEvaluateInfo.getCreateDate_end()!=null){
						   	      			sbuffer.append( " and  createDate>'" +att_AgEvaluateInfo.getCreateDate_end()+"'" );  
								  	     } 
								 		//时间类型开始条件处理  修改时间(editDate)
									  if(att_AgEvaluateInfo.getEditDate_start()!=null){
								   	    	sbuffer.append( " and  editDate<='" +att_AgEvaluateInfo.getEditDate_start()+"'" );  
										 }
								 	  //时间类型结束条件处理 修改时间(editDate)
									 	if(att_AgEvaluateInfo.getEditDate_end()!=null){
						   	      			sbuffer.append( " and  editDate>'" +att_AgEvaluateInfo.getEditDate_end()+"'" );  
								  	     } 
			 //*****************无关字段处理end*****************
			 //*****************数据库字段处理begin*************
								  		//评价ID(aeiId)
					 					if(att_AgEvaluateInfo.getAeiId()!=null){
											 sbuffer.append( " and aeiId=" +att_AgEvaluateInfo.getAeiId() );
										 }
					 					if(att_AgEvaluateInfo.getOrderPatientId()!=null){
											 sbuffer.append( " and orderPatientId=" +att_AgEvaluateInfo.getOrderPatientId() );
										 }
					       				//评价编号(serialNumber)		 					 
									 if(att_AgEvaluateInfo.getSerialNumber()!=null&&
									  !"".equals(att_AgEvaluateInfo.getSerialNumber().trim())){
										  if(likeStr!=null&&!"".equals(likeStr.trim())&&likeStr.indexOf("serialNumber")!=-1){
											  sbuffer.append( " and serialNumber  like '%"+att_AgEvaluateInfo.getSerialNumber()+"%'"   );
										  }else {
											  sbuffer.append( " and serialNumber   ='"+att_AgEvaluateInfo.getSerialNumber()+"'"   );
										  }
									 }
								  		//患者ID(patientId)
					 					if(att_AgEvaluateInfo.getPatientId()!=null){
											 sbuffer.append( " and patientId=" +att_AgEvaluateInfo.getPatientId() );
										 }
								  		//预约ID(medicalRecordId)
					 					if(att_AgEvaluateInfo.getMedicalRecordId()!=null){
											 sbuffer.append( " and medicalRecordId=" +att_AgEvaluateInfo.getMedicalRecordId() );
										 }
								  		//医院ID(organizationId)
					 					if(att_AgEvaluateInfo.getOrganizationId()!=null){
											 sbuffer.append( " and organizationId=" +att_AgEvaluateInfo.getOrganizationId() );
										 }
								  		//医生ID(doctorId)
					 					if(att_AgEvaluateInfo.getDoctorId()!=null){
											 sbuffer.append( " and doctorId=" +att_AgEvaluateInfo.getDoctorId() );
										 }
					       				//医院评分(organizationScore)		 					 
									 if(att_AgEvaluateInfo.getOrganizationScore()!=null&&
									  !"".equals(att_AgEvaluateInfo.getOrganizationScore().trim())){
										  if(likeStr!=null&&!"".equals(likeStr.trim())&&likeStr.indexOf("organizationScore")!=-1){
											  sbuffer.append( " and organizationScore  like '%"+att_AgEvaluateInfo.getOrganizationScore()+"%'"   );
										  }else {
											  sbuffer.append( " and organizationScore   ='"+att_AgEvaluateInfo.getOrganizationScore()+"'"   );
										  }
									 }
					       				//医生评分(doctorScore)		 					 
									 if(att_AgEvaluateInfo.getDoctorScore()!=null&&
									  !"".equals(att_AgEvaluateInfo.getDoctorScore().trim())){
										  if(likeStr!=null&&!"".equals(likeStr.trim())&&likeStr.indexOf("doctorScore")!=-1){
											  sbuffer.append( " and doctorScore  like '%"+att_AgEvaluateInfo.getDoctorScore()+"%'"   );
										  }else {
											  sbuffer.append( " and doctorScore   ='"+att_AgEvaluateInfo.getDoctorScore()+"'"   );
										  }
									 }
					       				//标签(evaluationLabels)		 					 
									 if(att_AgEvaluateInfo.getEvaluationLabels()!=null&&
									  !"".equals(att_AgEvaluateInfo.getEvaluationLabels().trim())){
										  if(likeStr!=null&&!"".equals(likeStr.trim())&&likeStr.indexOf("evaluationLabels")!=-1){
											  sbuffer.append( " and evaluationLabels  like '%"+att_AgEvaluateInfo.getEvaluationLabels()+"%'"   );
										  }else {
											  sbuffer.append( " and evaluationLabels   ='"+att_AgEvaluateInfo.getEvaluationLabels()+"'"   );
										  }
									 }
					       				//评价内容(evaluationContent)		 					 
									 if(att_AgEvaluateInfo.getEvaluationContent()!=null&&
									  !"".equals(att_AgEvaluateInfo.getEvaluationContent().trim())){
										  if(likeStr!=null&&!"".equals(likeStr.trim())&&likeStr.indexOf("evaluationContent")!=-1){
											  sbuffer.append( " and evaluationContent  like '%"+att_AgEvaluateInfo.getEvaluationContent()+"%'"   );
										  }else {
											  sbuffer.append( " and evaluationContent   ='"+att_AgEvaluateInfo.getEvaluationContent()+"'"   );
										  }
									 }
					       				//是否回复(replied)		 					 
									 if(att_AgEvaluateInfo.getReplied()!=null&&
									  !"".equals(att_AgEvaluateInfo.getReplied().trim())){
										  if(likeStr!=null&&!"".equals(likeStr.trim())&&likeStr.indexOf("replied")!=-1){
											  sbuffer.append( " and replied  like '%"+att_AgEvaluateInfo.getReplied()+"%'"   );
										  }else {
											  sbuffer.append( " and replied   ='"+att_AgEvaluateInfo.getReplied()+"'"   );
										  }
									 }
								  		//回复人ID(repUserId)
					 					if(att_AgEvaluateInfo.getRepUserId()!=null){
											 sbuffer.append( " and repUserId=" +att_AgEvaluateInfo.getRepUserId() );
										 }
					       				//是否医院回复(isHosRep)		 					 
									 if(att_AgEvaluateInfo.getIsHosRep()!=null&&
									  !"".equals(att_AgEvaluateInfo.getIsHosRep().trim())){
										  if(likeStr!=null&&!"".equals(likeStr.trim())&&likeStr.indexOf("isHosRep")!=-1){
											  sbuffer.append( " and isHosRep  like '%"+att_AgEvaluateInfo.getIsHosRep()+"%'"   );
										  }else {
											  sbuffer.append( " and isHosRep   ='"+att_AgEvaluateInfo.getIsHosRep()+"'"   );
										  }
									 }
					       				//回复内容(repliedContent)		 					 
									 if(att_AgEvaluateInfo.getRepliedContent()!=null&&
									  !"".equals(att_AgEvaluateInfo.getRepliedContent().trim())){
										  if(likeStr!=null&&!"".equals(likeStr.trim())&&likeStr.indexOf("repliedContent")!=-1){
											  sbuffer.append( " and repliedContent  like '%"+att_AgEvaluateInfo.getRepliedContent()+"%'"   );
										  }else {
											  sbuffer.append( " and repliedContent   ='"+att_AgEvaluateInfo.getRepliedContent()+"'"   );
										  }
									 }
						   				//回复时间(repliedDate)
						 				if(att_AgEvaluateInfo.getRepliedDate()!=null){
						   	                   sbuffer.append( " and  repliedDate='" +att_AgEvaluateInfo.getRepliedDate()+"'" );  
								  		}
					       				//图片(images)		 					 
									 if(att_AgEvaluateInfo.getImages()!=null&&
									  !"".equals(att_AgEvaluateInfo.getImages().trim())){
										  if(likeStr!=null&&!"".equals(likeStr.trim())&&likeStr.indexOf("images")!=-1){
											  sbuffer.append( " and images  like '%"+att_AgEvaluateInfo.getImages()+"%'"   );
										  }else {
											  sbuffer.append( " and images   ='"+att_AgEvaluateInfo.getImages()+"'"   );
										  }
									 }
					       				//状态:1正常，2禁用(status)		 					 
									 if(att_AgEvaluateInfo.getStatus()!=null&&
									  !"".equals(att_AgEvaluateInfo.getStatus().trim())){
										  if(likeStr!=null&&!"".equals(likeStr.trim())&&likeStr.indexOf("status")!=-1){
											  sbuffer.append( " and status  like '%"+att_AgEvaluateInfo.getStatus()+"%'"   );
										  }else {
											  sbuffer.append( " and status   ='"+att_AgEvaluateInfo.getStatus()+"'"   );
										  }
									 }
					       				//创建人(createRen)		 					 
									 if(att_AgEvaluateInfo.getCreateRen()!=null&&
									  !"".equals(att_AgEvaluateInfo.getCreateRen().trim())){
										  if(likeStr!=null&&!"".equals(likeStr.trim())&&likeStr.indexOf("createRen")!=-1){
											  sbuffer.append( " and createRen  like '%"+att_AgEvaluateInfo.getCreateRen()+"%'"   );
										  }else {
											  sbuffer.append( " and createRen   ='"+att_AgEvaluateInfo.getCreateRen()+"'"   );
										  }
									 }
						   				//创建时间(createDate)
						 				if(att_AgEvaluateInfo.getCreateDate()!=null){
						   	                   sbuffer.append( " and  createDate='" +att_AgEvaluateInfo.getCreateDate()+"'" );  
								  		}
					       				//修改人(editRen)		 					 
									 if(att_AgEvaluateInfo.getEditRen()!=null&&
									  !"".equals(att_AgEvaluateInfo.getEditRen().trim())){
										  if(likeStr!=null&&!"".equals(likeStr.trim())&&likeStr.indexOf("editRen")!=-1){
											  sbuffer.append( " and editRen  like '%"+att_AgEvaluateInfo.getEditRen()+"%'"   );
										  }else {
											  sbuffer.append( " and editRen   ='"+att_AgEvaluateInfo.getEditRen()+"'"   );
										  }
									 }
						   				//修改时间(editDate)
						 				if(att_AgEvaluateInfo.getEditDate()!=null){
						   	                   sbuffer.append( " and  editDate='" +att_AgEvaluateInfo.getEditDate()+"'" );  
								  		}
			 //*****************数据库字段处理end***************
			  		if(orderStr!=null&&!"".equals(orderStr.trim())){
									 sbuffer.append( " order by "+orderStr);
						 }
						 /*
						 else {
							  sbuffer.append( " order by  AeiId   desc " );
					      }
					      */
			 
			 return  sbuffer.toString();
	}
}