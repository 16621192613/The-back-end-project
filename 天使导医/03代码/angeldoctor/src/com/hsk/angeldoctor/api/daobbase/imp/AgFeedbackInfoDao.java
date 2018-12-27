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
 * ag_feedback_info表数据库层面操作实现类 
 * @author  作者:admin
 * @version  版本信息:v1.0   创建时间: 2018-08-14 13:40:21
 */
@Component
public class  AgFeedbackInfoDao extends SupperDao implements IAgFeedbackInfoDao {	

	/**
	 * 根据ag_feedback_info表主键查找AgFeedbackInfo对象记录
	 * 
	 * @param  AfbiId  Integer类型(ag_feedback_info表主键)
	 * @return AgFeedbackInfo ag_feedback_info表记录
	 * @throws HSKDBException
	 */	
	public AgFeedbackInfo findAgFeedbackInfoById(Integer AfbiId) throws HSKDBException{
				AgFeedbackInfo  att_AgFeedbackInfo=new AgFeedbackInfo();				
				if(AfbiId!=null){
					att_AgFeedbackInfo.setAfbiId(AfbiId);	
				    Object obj=	this.getOne(att_AgFeedbackInfo);
					if(obj!=null){
						att_AgFeedbackInfo=(AgFeedbackInfo) obj;
					}
				}
				return  att_AgFeedbackInfo;
	}
	 /**
	  * 根据ag_feedback_info表主键删除AgFeedbackInfo对象记录
	  * @param  AfbiId  Integer类型(ag_feedback_info表主键)
	  * @throws HSKDBException
	  */
	public void deleteAgFeedbackInfoById(Integer AfbiId) throws HSKDBException{ 
		 AgFeedbackInfo  att_AgFeedbackInfo=new AgFeedbackInfo();	
		  if(AfbiId!=null){
					  att_AgFeedbackInfo.setAfbiId(AfbiId);
				  	  Object obj=	this.getOne(att_AgFeedbackInfo);
					  if(obj!=null){
							this.deleteObject(obj); 
					  }
			}
	}

	/**
 	 * 根据ag_feedback_info表主键修改AgFeedbackInfo对象记录
     * @param  AfbiId  Integer类型(ag_feedback_info表主键)
     * @param  att_AgFeedbackInfo  AgFeedbackInfo类型(ag_feedback_info表记录)
     * @return AgFeedbackInfo  修改后的AgFeedbackInfo对象记录
	 * @throws HSKDBException
	 */
	public  AgFeedbackInfo updateAgFeedbackInfoById(Integer AfbiId,AgFeedbackInfo att_AgFeedbackInfo) throws HSKDBException{
		  if(AfbiId!=null){
					att_AgFeedbackInfo.setAfbiId(AfbiId);
				   	Object obj=	this.getOne(att_AgFeedbackInfo);
					if(obj!=null){							 
							this.updateObject(obj);
					}
			}
			return  att_AgFeedbackInfo;
	}
	
	/**
	 * 新增ag_feedback_info表 记录
     * @param  att_AgFeedbackInfo  AgFeedbackInfo类型(ag_feedback_info表记录)
	 * @throws HSKDBException
	 */
	public Integer saveAgFeedbackInfo(AgFeedbackInfo att_AgFeedbackInfo) throws HSKDBException{
		 return this.newObject(att_AgFeedbackInfo);
	} 
		
	/**
	 * 新增或修改ag_feedback_info表记录 ,如果ag_feedback_info表主键AgFeedbackInfo.AfbiId为空就是添加，如果非空就是修改
     * @param  att_AgFeedbackInfo  AgFeedbackInfo类型(ag_feedback_info表记录)
	 * @throws HSKDBException
	 */
	public  AgFeedbackInfo saveOrUpdateAgFeedbackInfo(AgFeedbackInfo att_AgFeedbackInfo) throws HSKDBException{
		  this.getHibernateTemplate().saveOrUpdate(att_AgFeedbackInfo);
		  return att_AgFeedbackInfo;
	}
	
	/**
	 *根据AgFeedbackInfo对象作为对(ag_feedback_info表进行查询，获取列表对象
     * @param  att_AgFeedbackInfo  AgFeedbackInfo类型(ag_feedback_info表记录)
     * @return List<AgFeedbackInfo>  列表对象
	 * @throws HSKDBException 
	 */
	 @SuppressWarnings("unchecked")
	public List<AgFeedbackInfo> getListByAgFeedbackInfo(AgFeedbackInfo att_AgFeedbackInfo) throws HSKDBException{
		String Hql=this.getHql( att_AgFeedbackInfo); 
		List<AgFeedbackInfo> list=this.getHibernateTemplate().find(Hql);
		return  list;
	}
	/**
	 *根据AgFeedbackInfo对象作为对(ag_feedback_info表进行查询，获取分页对象
     * @param  att_AgFeedbackInfo  AgFeedbackInfo类型(ag_feedback_info表记录)
     * @return List<AgFeedbackInfo>  分页对象
	 * @throws HSKDBException 
	 */
	public PagerModel getPagerModelByAgFeedbackInfo(AgFeedbackInfo att_AgFeedbackInfo)
			throws HSKDBException {
		String Hql=this.getHql(att_AgFeedbackInfo);
		return this.getHibernateDao().findByPage(Hql); 
	} 
	/**
	 * 根据AgFeedbackInfo对象获取Hql字符串
     * @param  att_AgFeedbackInfo  AgFeedbackInfo类型(ag_feedback_info表记录)
	 *  @return hql字符串
	 */
	private String  getHql(AgFeedbackInfo att_AgFeedbackInfo){
			 StringBuffer sbuffer = new StringBuffer( " from  AgFeedbackInfo  where  1=1  ");
			 String likeStr=  att_AgFeedbackInfo.getTab_like();
			 String orderStr= att_AgFeedbackInfo.getTab_order();
			 
			 //*****************无关字段处理begin*****************
						   		 //处理in条件 意见反馈ID(afbiId)
							     if(att_AgFeedbackInfo.getAfbiId_str()!=null&&
						   		    !"".equals(att_AgFeedbackInfo.getAfbiId_str().trim())){ 
											 String  intStr=att_AgFeedbackInfo.getAfbiId_str().trim();
											 String[]  arrayStr=intStr.split(","); 
											 
											  if(arrayStr.length>0){
												 sbuffer.append(" and ( ");
												 for(int i=0;i<arrayStr.length;i++){
													 String did=arrayStr[i];
													 if(i==arrayStr.length-1){
														 sbuffer.append("  afbiId="+did+"   "); 
													 }else {
													 sbuffer.append("  afbiId="+did+" or "); 
													 }
												 }
												 sbuffer.append(" ) "); 
											 }
											   
								 	}
						   		 //处理in条件 反馈人ID(userId)
							     if(att_AgFeedbackInfo.getUserId_str()!=null&&
						   		    !"".equals(att_AgFeedbackInfo.getUserId_str().trim())){ 
											 String  intStr=att_AgFeedbackInfo.getUserId_str().trim();
											 String[]  arrayStr=intStr.split(","); 
											 
											  if(arrayStr.length>0){
												 sbuffer.append(" and ( ");
												 for(int i=0;i<arrayStr.length;i++){
													 String did=arrayStr[i];
													 if(i==arrayStr.length-1){
														 sbuffer.append("  userId="+did+"   "); 
													 }else {
													 sbuffer.append("  userId="+did+" or "); 
													 }
												 }
												 sbuffer.append(" ) "); 
											 }
											   
								 	}
						   		 //处理in条件 预约ID(medicalRecordId)
							     if(att_AgFeedbackInfo.getMedicalRecordId_str()!=null&&
						   		    !"".equals(att_AgFeedbackInfo.getMedicalRecordId_str().trim())){ 
											 String  intStr=att_AgFeedbackInfo.getMedicalRecordId_str().trim();
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
						   		 //处理in条件 回复人ID(repUserId)
							     if(att_AgFeedbackInfo.getRepUserId_str()!=null&&
						   		    !"".equals(att_AgFeedbackInfo.getRepUserId_str().trim())){ 
											 String  intStr=att_AgFeedbackInfo.getRepUserId_str().trim();
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
								  if(att_AgFeedbackInfo.getCreateDate_start()!=null){
							   	    	sbuffer.append( " and  createDate >='" +sdf.format(att_AgFeedbackInfo.getCreateDate_start())+" 00:00:00'" );  
									 }
							 	  //时间类型结束条件处理 创建时间(createDate)
								 	if(att_AgFeedbackInfo.getCreateDate_end()!=null){
					   	      			sbuffer.append( " and  createDate<='" +sdf.format(att_AgFeedbackInfo.getCreateDate_end())+" 23:59:59'" );  
							  	     } 
								 		//时间类型开始条件处理  创建时间(createDate)
									  if(att_AgFeedbackInfo.getCreateDate_start()!=null){
								   	    	sbuffer.append( " and  createDate<='" +att_AgFeedbackInfo.getCreateDate_start()+"'" );  
										 }
								 	  //时间类型结束条件处理 创建时间(createDate)
									 	if(att_AgFeedbackInfo.getCreateDate_end()!=null){
						   	      			sbuffer.append( " and  createDate>'" +att_AgFeedbackInfo.getCreateDate_end()+"'" );  
								  	     } 
								 		//时间类型开始条件处理  修改时间(editDate)
									  if(att_AgFeedbackInfo.getEditDate_start()!=null){
								   	    	sbuffer.append( " and  editDate<='" +att_AgFeedbackInfo.getEditDate_start()+"'" );  
										 }
								 	  //时间类型结束条件处理 修改时间(editDate)
									 	if(att_AgFeedbackInfo.getEditDate_end()!=null){
						   	      			sbuffer.append( " and  editDate>'" +att_AgFeedbackInfo.getEditDate_end()+"'" );  
								  	     } 
			 //*****************无关字段处理end*****************
			 //*****************数据库字段处理begin*************
								  		//意见反馈ID(afbiId)
					 					if(att_AgFeedbackInfo.getAfbiId()!=null){
											 sbuffer.append( " and afbiId=" +att_AgFeedbackInfo.getAfbiId() );
										 }
					       				//编号(serialNumber)		 					 
									 if(att_AgFeedbackInfo.getSerialNumber()!=null&&
									  !"".equals(att_AgFeedbackInfo.getSerialNumber().trim())){
										  if(likeStr!=null&&!"".equals(likeStr.trim())&&likeStr.indexOf("serialNumber")!=-1){
											  sbuffer.append( " and serialNumber  like '%"+att_AgFeedbackInfo.getSerialNumber()+"%'"   );
										  }else {
											  sbuffer.append( " and serialNumber   ='"+att_AgFeedbackInfo.getSerialNumber()+"'"   );
										  }
									 }
								  		//反馈人ID(userId)
					 					if(att_AgFeedbackInfo.getUserId()!=null){
											 sbuffer.append( " and userId=" +att_AgFeedbackInfo.getUserId() );
										 }
					 					if(att_AgFeedbackInfo.getOrderPatientId()!=null){
											 sbuffer.append( " and orderPatientId=" +att_AgFeedbackInfo.getOrderPatientId() );
										 }
					       				//反馈类型:1患者；2业务员(feedbackType)		 					 
									 if(att_AgFeedbackInfo.getFeedbackType()!=null&&
									  !"".equals(att_AgFeedbackInfo.getFeedbackType().trim())){
										  if(likeStr!=null&&!"".equals(likeStr.trim())&&likeStr.indexOf("feedbackType")!=-1){
											  sbuffer.append( " and feedbackType  like '%"+att_AgFeedbackInfo.getFeedbackType()+"%'"   );
										  }else {
											  sbuffer.append( " and feedbackType   ='"+att_AgFeedbackInfo.getFeedbackType()+"'"   );
										  }
									 }
								  		//预约ID(medicalRecordId)
					 					if(att_AgFeedbackInfo.getMedicalRecordId()!=null){
											 sbuffer.append( " and medicalRecordId=" +att_AgFeedbackInfo.getMedicalRecordId() );
										 }
					       				//标签(feedbackLabels)		 					 
									 if(att_AgFeedbackInfo.getFeedbackLabels()!=null&&
									  !"".equals(att_AgFeedbackInfo.getFeedbackLabels().trim())){
										  if(likeStr!=null&&!"".equals(likeStr.trim())&&likeStr.indexOf("feedbackLabels")!=-1){
											  sbuffer.append( " and feedbackLabels  like '%"+att_AgFeedbackInfo.getFeedbackLabels()+"%'"   );
										  }else {
											  sbuffer.append( " and feedbackLabels   ='"+att_AgFeedbackInfo.getFeedbackLabels()+"'"   );
										  }
									 }
					       				//反馈内容(feedbackContent)		 					 
									 if(att_AgFeedbackInfo.getFeedbackContent()!=null&&
									  !"".equals(att_AgFeedbackInfo.getFeedbackContent().trim())){
										  if(likeStr!=null&&!"".equals(likeStr.trim())&&likeStr.indexOf("feedbackContent")!=-1){
											  sbuffer.append( " and feedbackContent  like '%"+att_AgFeedbackInfo.getFeedbackContent()+"%'"   );
										  }else {
											  sbuffer.append( " and feedbackContent   ='"+att_AgFeedbackInfo.getFeedbackContent()+"'"   );
										  }
									 }
					       				//是否回复(replied)		 					 
									 if(att_AgFeedbackInfo.getReplied()!=null&&
									  !"".equals(att_AgFeedbackInfo.getReplied().trim())){
										  if(likeStr!=null&&!"".equals(likeStr.trim())&&likeStr.indexOf("replied")!=-1){
											  sbuffer.append( " and replied  like '%"+att_AgFeedbackInfo.getReplied()+"%'"   );
										  }else {
											  sbuffer.append( " and replied   ='"+att_AgFeedbackInfo.getReplied()+"'"   );
										  }
									 }
								  		//回复人ID(repUserId)
					 					if(att_AgFeedbackInfo.getRepUserId()!=null){
											 sbuffer.append( " and repUserId=" +att_AgFeedbackInfo.getRepUserId() );
										 }
					       				//回复内容(repliedContent)		 					 
									 if(att_AgFeedbackInfo.getRepliedContent()!=null&&
									  !"".equals(att_AgFeedbackInfo.getRepliedContent().trim())){
										  if(likeStr!=null&&!"".equals(likeStr.trim())&&likeStr.indexOf("repliedContent")!=-1){
											  sbuffer.append( " and repliedContent  like '%"+att_AgFeedbackInfo.getRepliedContent()+"%'"   );
										  }else {
											  sbuffer.append( " and repliedContent   ='"+att_AgFeedbackInfo.getRepliedContent()+"'"   );
										  }
									 }
						   				//回复时间(repliedDate)
						 				if(att_AgFeedbackInfo.getRepliedDate()!=null){
						   	                   sbuffer.append( " and  repliedDate='" +att_AgFeedbackInfo.getRepliedDate()+"'" );  
								  		}
					       				//图片(images)		 					 
									 if(att_AgFeedbackInfo.getImages()!=null&&
									  !"".equals(att_AgFeedbackInfo.getImages().trim())){
										  if(likeStr!=null&&!"".equals(likeStr.trim())&&likeStr.indexOf("images")!=-1){
											  sbuffer.append( " and images  like '%"+att_AgFeedbackInfo.getImages()+"%'"   );
										  }else {
											  sbuffer.append( " and images   ='"+att_AgFeedbackInfo.getImages()+"'"   );
										  }
									 }
					       				//状态:1正常，2禁用(status)		 					 
									 if(att_AgFeedbackInfo.getStatus()!=null&&
									  !"".equals(att_AgFeedbackInfo.getStatus().trim())){
										  if(likeStr!=null&&!"".equals(likeStr.trim())&&likeStr.indexOf("status")!=-1){
											  sbuffer.append( " and status  like '%"+att_AgFeedbackInfo.getStatus()+"%'"   );
										  }else {
											  sbuffer.append( " and status   ='"+att_AgFeedbackInfo.getStatus()+"'"   );
										  }
									 }
					       				//创建人(createRen)		 					 
									 if(att_AgFeedbackInfo.getCreateRen()!=null&&
									  !"".equals(att_AgFeedbackInfo.getCreateRen().trim())){
										  if(likeStr!=null&&!"".equals(likeStr.trim())&&likeStr.indexOf("createRen")!=-1){
											  sbuffer.append( " and createRen  like '%"+att_AgFeedbackInfo.getCreateRen()+"%'"   );
										  }else {
											  sbuffer.append( " and createRen   ='"+att_AgFeedbackInfo.getCreateRen()+"'"   );
										  }
									 }
						   				//创建时间(createDate)
						 				if(att_AgFeedbackInfo.getCreateDate()!=null){
						   	                   sbuffer.append( " and  createDate='" +att_AgFeedbackInfo.getCreateDate()+"'" );  
								  		}
					       				//修改人(editRen)		 					 
									 if(att_AgFeedbackInfo.getEditRen()!=null&&
									  !"".equals(att_AgFeedbackInfo.getEditRen().trim())){
										  if(likeStr!=null&&!"".equals(likeStr.trim())&&likeStr.indexOf("editRen")!=-1){
											  sbuffer.append( " and editRen  like '%"+att_AgFeedbackInfo.getEditRen()+"%'"   );
										  }else {
											  sbuffer.append( " and editRen   ='"+att_AgFeedbackInfo.getEditRen()+"'"   );
										  }
									 }
						   				//修改时间(editDate)
						 				if(att_AgFeedbackInfo.getEditDate()!=null){
						   	                   sbuffer.append( " and  editDate='" +att_AgFeedbackInfo.getEditDate()+"'" );  
								  		}
			 //*****************数据库字段处理end***************
			  		if(orderStr!=null&&!"".equals(orderStr.trim())){
									 sbuffer.append( " order by "+orderStr);
						 }
						 /*
						 else {
							  sbuffer.append( " order by  AfbiId   desc " );
					      }
					      */
			 
			 return  sbuffer.toString();
	}
}