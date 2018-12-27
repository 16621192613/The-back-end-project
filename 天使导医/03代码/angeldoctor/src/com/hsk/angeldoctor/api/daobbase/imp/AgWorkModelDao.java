package com.hsk.angeldoctor.api.daobbase.imp;

import java.util.*;
import com.hsk.supper.dto.comm.PagerModel;
import org.springframework.stereotype.*;
import com.hsk.exception.HSKDBException;
import com.hsk.supper.dao.imp.SupperDao;
import com.hsk.angeldoctor.api.daobbase.*;
import com.hsk.angeldoctor.api.persistence.*;

/** 
 * ag_work_model表数据库层面操作实现类 
 * @author  作者:admin
 * @version  版本信息:v1.0   创建时间: 2018-08-14 13:28:02
 */
@Component
public class  AgWorkModelDao extends SupperDao implements IAgWorkModelDao {	

	/**
	 * 根据ag_work_model表主键查找AgWorkModel对象记录
	 * 
	 * @param  ShiftTemplateId  Integer类型(ag_work_model表主键)
	 * @return AgWorkModel ag_work_model表记录
	 * @throws HSKDBException
	 */	
	public AgWorkModel findAgWorkModelById(Integer ShiftTemplateId) throws HSKDBException{
				AgWorkModel  att_AgWorkModel=new AgWorkModel();				
				if(ShiftTemplateId!=null){
					att_AgWorkModel.setShiftTemplateId(ShiftTemplateId);	
				    Object obj=	this.getOne(att_AgWorkModel);
					if(obj!=null){
						att_AgWorkModel=(AgWorkModel) obj;
					}
				}
				return  att_AgWorkModel;
	}
	 /**
	  * 根据ag_work_model表主键删除AgWorkModel对象记录
	  * @param  ShiftTemplateId  Integer类型(ag_work_model表主键)
	  * @throws HSKDBException
	  */
	public void deleteAgWorkModelById(Integer ShiftTemplateId) throws HSKDBException{ 
		 AgWorkModel  att_AgWorkModel=new AgWorkModel();	
		  if(ShiftTemplateId!=null){
					  att_AgWorkModel.setShiftTemplateId(ShiftTemplateId);
				  	  Object obj=	this.getOne(att_AgWorkModel);
					  if(obj!=null){
							this.deleteObject(obj); 
					  }
			}
	}

	/**
 	 * 根据ag_work_model表主键修改AgWorkModel对象记录
     * @param  ShiftTemplateId  Integer类型(ag_work_model表主键)
     * @param  att_AgWorkModel  AgWorkModel类型(ag_work_model表记录)
     * @return AgWorkModel  修改后的AgWorkModel对象记录
	 * @throws HSKDBException
	 */
	public  AgWorkModel updateAgWorkModelById(Integer ShiftTemplateId,AgWorkModel att_AgWorkModel) throws HSKDBException{
		  if(ShiftTemplateId!=null){
					att_AgWorkModel.setShiftTemplateId(ShiftTemplateId);
				   	Object obj=	this.getOne(att_AgWorkModel);
					if(obj!=null){							 
							this.updateObject(obj);
					}
			}
			return  att_AgWorkModel;
	}
	
	/**
	 * 新增ag_work_model表 记录
     * @param  att_AgWorkModel  AgWorkModel类型(ag_work_model表记录)
	 * @throws HSKDBException
	 */
	public Integer saveAgWorkModel(AgWorkModel att_AgWorkModel) throws HSKDBException{
		 return this.newObject(att_AgWorkModel);
	} 
		
	/**
	 * 新增或修改ag_work_model表记录 ,如果ag_work_model表主键AgWorkModel.ShiftTemplateId为空就是添加，如果非空就是修改
     * @param  att_AgWorkModel  AgWorkModel类型(ag_work_model表记录)
	 * @throws HSKDBException
	 */
	public  AgWorkModel saveOrUpdateAgWorkModel(AgWorkModel att_AgWorkModel) throws HSKDBException{
		  this.getHibernateTemplate().saveOrUpdate(att_AgWorkModel);
		  return att_AgWorkModel;
	}
	
	/**
	 *根据AgWorkModel对象作为对(ag_work_model表进行查询，获取列表对象
     * @param  att_AgWorkModel  AgWorkModel类型(ag_work_model表记录)
     * @return List<AgWorkModel>  列表对象
	 * @throws HSKDBException 
	 */
	 @SuppressWarnings("unchecked")
	public List<AgWorkModel> getListByAgWorkModel(AgWorkModel att_AgWorkModel) throws HSKDBException{
		String Hql=this.getHql( att_AgWorkModel); 
		List<AgWorkModel> list=this.getHibernateTemplate().find(Hql);
		return  list;
	}
	/**
	 *根据AgWorkModel对象作为对(ag_work_model表进行查询，获取分页对象
     * @param  att_AgWorkModel  AgWorkModel类型(ag_work_model表记录)
     * @return List<AgWorkModel>  分页对象
	 * @throws HSKDBException 
	 */
	public PagerModel getPagerModelByAgWorkModel(AgWorkModel att_AgWorkModel)
			throws HSKDBException {
		String Hql=this.getHql(att_AgWorkModel);
		return this.getHibernateDao().findByPage(Hql); 
	} 
	/**
	 * 根据AgWorkModel对象获取Hql字符串
     * @param  att_AgWorkModel  AgWorkModel类型(ag_work_model表记录)
	 *  @return hql字符串
	 */
	private String  getHql(AgWorkModel att_AgWorkModel){
			 StringBuffer sbuffer = new StringBuffer( " from  AgWorkModel  where  1=1  ");
			 String likeStr=  att_AgWorkModel.getTab_like();
			 String orderStr= att_AgWorkModel.getTab_order();
			 
			 //*****************无关字段处理begin*****************
						   		 //处理in条件 排班模板ID(shiftTemplateId)
							     if(att_AgWorkModel.getShiftTemplateId_str()!=null&&
						   		    !"".equals(att_AgWorkModel.getShiftTemplateId_str().trim())){ 
											 String  intStr=att_AgWorkModel.getShiftTemplateId_str().trim();
											 String[]  arrayStr=intStr.split(","); 
											 
											  if(arrayStr.length>0){
												 sbuffer.append(" and ( ");
												 for(int i=0;i<arrayStr.length;i++){
													 String did=arrayStr[i];
													 if(i==arrayStr.length-1){
														 sbuffer.append("  shiftTemplateId="+did+"   "); 
													 }else {
													 sbuffer.append("  shiftTemplateId="+did+" or "); 
													 }
												 }
												 sbuffer.append(" ) "); 
											 }
											   
								 	}
						   		 //处理in条件 医院ID(organizationId)
							     if(att_AgWorkModel.getOrganizationId_str()!=null&&
						   		    !"".equals(att_AgWorkModel.getOrganizationId_str().trim())){ 
											 String  intStr=att_AgWorkModel.getOrganizationId_str().trim();
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
								 		//时间类型开始条件处理  创建时间(createDate)
									  if(att_AgWorkModel.getCreateDate_start()!=null){
								   	    	sbuffer.append( " and  createDate<='" +att_AgWorkModel.getCreateDate_start()+"'" );  
										 }
								 	  //时间类型结束条件处理 创建时间(createDate)
									 	if(att_AgWorkModel.getCreateDate_end()!=null){
						   	      			sbuffer.append( " and  createDate>'" +att_AgWorkModel.getCreateDate_end()+"'" );  
								  	     } 
								 		//时间类型开始条件处理  修改时间(editDate)
									  if(att_AgWorkModel.getEditDate_start()!=null){
								   	    	sbuffer.append( " and  editDate<='" +att_AgWorkModel.getEditDate_start()+"'" );  
										 }
								 	  //时间类型结束条件处理 修改时间(editDate)
									 	if(att_AgWorkModel.getEditDate_end()!=null){
						   	      			sbuffer.append( " and  editDate>'" +att_AgWorkModel.getEditDate_end()+"'" );  
								  	     } 
			 //*****************无关字段处理end*****************
			 //*****************数据库字段处理begin*************
								  		//排班模板ID(shiftTemplateId)
					 					if(att_AgWorkModel.getShiftTemplateId()!=null){
											 sbuffer.append( " and shiftTemplateId=" +att_AgWorkModel.getShiftTemplateId() );
										 }
								  		//医院ID(organizationId)
					 					if(att_AgWorkModel.getOrganizationId()!=null){
											 sbuffer.append( " and organizationId=" +att_AgWorkModel.getOrganizationId() );
										 }
					       				//模板名称(name)		 					 
									 if(att_AgWorkModel.getName()!=null&&
									  !"".equals(att_AgWorkModel.getName().trim())){
										  if(likeStr!=null&&!"".equals(likeStr.trim())&&likeStr.indexOf("name")!=-1){
											  sbuffer.append( " and name  like '%"+att_AgWorkModel.getName()+"%'"   );
										  }else {
											  sbuffer.append( " and name   ='"+att_AgWorkModel.getName()+"'"   );
										  }
									 }
					       				//状态:0正常；1禁用(status)		 					 
									 if(att_AgWorkModel.getStatus()!=null&&
									  !"".equals(att_AgWorkModel.getStatus().trim())){
										  if(likeStr!=null&&!"".equals(likeStr.trim())&&likeStr.indexOf("status")!=-1){
											  sbuffer.append( " and status  like '%"+att_AgWorkModel.getStatus()+"%'"   );
										  }else {
											  sbuffer.append( " and status   ='"+att_AgWorkModel.getStatus()+"'"   );
										  }
									 }
					       				//创建人(createRen)		 					 
									 if(att_AgWorkModel.getCreateRen()!=null&&
									  !"".equals(att_AgWorkModel.getCreateRen().trim())){
										  if(likeStr!=null&&!"".equals(likeStr.trim())&&likeStr.indexOf("createRen")!=-1){
											  sbuffer.append( " and createRen  like '%"+att_AgWorkModel.getCreateRen()+"%'"   );
										  }else {
											  sbuffer.append( " and createRen   ='"+att_AgWorkModel.getCreateRen()+"'"   );
										  }
									 }
						   				//创建时间(createDate)
						 				if(att_AgWorkModel.getCreateDate()!=null){
						   	                   sbuffer.append( " and  createDate='" +att_AgWorkModel.getCreateDate()+"'" );  
								  		}
					       				//修改人(editRen)		 					 
									 if(att_AgWorkModel.getEditRen()!=null&&
									  !"".equals(att_AgWorkModel.getEditRen().trim())){
										  if(likeStr!=null&&!"".equals(likeStr.trim())&&likeStr.indexOf("editRen")!=-1){
											  sbuffer.append( " and editRen  like '%"+att_AgWorkModel.getEditRen()+"%'"   );
										  }else {
											  sbuffer.append( " and editRen   ='"+att_AgWorkModel.getEditRen()+"'"   );
										  }
									 }
						   				//修改时间(editDate)
						 				if(att_AgWorkModel.getEditDate()!=null){
						   	                   sbuffer.append( " and  editDate='" +att_AgWorkModel.getEditDate()+"'" );  
								  		}
			 //*****************数据库字段处理end***************
			  		if(orderStr!=null&&!"".equals(orderStr.trim())){
									 sbuffer.append( " order by "+orderStr);
						 }
						 /*
						 else {
							  sbuffer.append( " order by  ShiftTemplateId   desc " );
					      }
					      */
			 
			 return  sbuffer.toString();
	}
}