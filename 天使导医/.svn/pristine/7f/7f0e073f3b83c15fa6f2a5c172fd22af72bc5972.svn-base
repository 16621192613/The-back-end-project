package com.hsk.angeldoctor.api.daobbase.imp;

import java.util.*;
import com.hsk.supper.dto.comm.PagerModel;
import org.springframework.stereotype.*;
import com.hsk.exception.HSKDBException;
import com.hsk.supper.dao.imp.SupperDao;
import com.hsk.angeldoctor.api.daobbase.*;
import com.hsk.angeldoctor.api.persistence.*;

/** 
 * ag_work_time表数据库层面操作实现类 
 * @author  作者:admin
 * @version  版本信息:v1.0   创建时间: 2018-08-14 13:28:03
 */
@Component
public class  AgWorkTimeDao extends SupperDao implements IAgWorkTimeDao {	

	/**
	 * 根据ag_work_time表主键查找AgWorkTime对象记录
	 * 
	 * @param  ShiftPeriodId  Integer类型(ag_work_time表主键)
	 * @return AgWorkTime ag_work_time表记录
	 * @throws HSKDBException
	 */	
	public AgWorkTime findAgWorkTimeById(Integer ShiftPeriodId) throws HSKDBException{
				AgWorkTime  att_AgWorkTime=new AgWorkTime();				
				if(ShiftPeriodId!=null){
					att_AgWorkTime.setShiftPeriodId(ShiftPeriodId);	
				    Object obj=	this.getOne(att_AgWorkTime);
					if(obj!=null){
						att_AgWorkTime=(AgWorkTime) obj;
					}
				}
				return  att_AgWorkTime;
	}
	 /**
	  * 根据ag_work_time表主键删除AgWorkTime对象记录
	  * @param  ShiftPeriodId  Integer类型(ag_work_time表主键)
	  * @throws HSKDBException
	  */
	public void deleteAgWorkTimeById(Integer ShiftPeriodId) throws HSKDBException{ 
		 AgWorkTime  att_AgWorkTime=new AgWorkTime();	
		  if(ShiftPeriodId!=null){
					  att_AgWorkTime.setShiftPeriodId(ShiftPeriodId);
				  	  Object obj=	this.getOne(att_AgWorkTime);
					  if(obj!=null){
							this.deleteObject(obj); 
					  }
			}
	}

	/**
 	 * 根据ag_work_time表主键修改AgWorkTime对象记录
     * @param  ShiftPeriodId  Integer类型(ag_work_time表主键)
     * @param  att_AgWorkTime  AgWorkTime类型(ag_work_time表记录)
     * @return AgWorkTime  修改后的AgWorkTime对象记录
	 * @throws HSKDBException
	 */
	public  AgWorkTime updateAgWorkTimeById(Integer ShiftPeriodId,AgWorkTime att_AgWorkTime) throws HSKDBException{
		  if(ShiftPeriodId!=null){
					att_AgWorkTime.setShiftPeriodId(ShiftPeriodId);
				   	Object obj=	this.getOne(att_AgWorkTime);
					if(obj!=null){							 
							this.updateObject(obj);
					}
			}
			return  att_AgWorkTime;
	}
	
	/**
	 * 新增ag_work_time表 记录
     * @param  att_AgWorkTime  AgWorkTime类型(ag_work_time表记录)
	 * @throws HSKDBException
	 */
	public Integer saveAgWorkTime(AgWorkTime att_AgWorkTime) throws HSKDBException{
		 return this.newObject(att_AgWorkTime);
	} 
		
	/**
	 * 新增或修改ag_work_time表记录 ,如果ag_work_time表主键AgWorkTime.ShiftPeriodId为空就是添加，如果非空就是修改
     * @param  att_AgWorkTime  AgWorkTime类型(ag_work_time表记录)
	 * @throws HSKDBException
	 */
	public  AgWorkTime saveOrUpdateAgWorkTime(AgWorkTime att_AgWorkTime) throws HSKDBException{
		  this.getHibernateTemplate().saveOrUpdate(att_AgWorkTime);
		  return att_AgWorkTime;
	}
	
	/**
	 *根据AgWorkTime对象作为对(ag_work_time表进行查询，获取列表对象
     * @param  att_AgWorkTime  AgWorkTime类型(ag_work_time表记录)
     * @return List<AgWorkTime>  列表对象
	 * @throws HSKDBException 
	 */
	 @SuppressWarnings("unchecked")
	public List<AgWorkTime> getListByAgWorkTime(AgWorkTime att_AgWorkTime) throws HSKDBException{
		String Hql=this.getHql( att_AgWorkTime); 
		List<AgWorkTime> list=this.getHibernateTemplate().find(Hql);
		return  list;
	}
	/**
	 *根据AgWorkTime对象作为对(ag_work_time表进行查询，获取分页对象
     * @param  att_AgWorkTime  AgWorkTime类型(ag_work_time表记录)
     * @return List<AgWorkTime>  分页对象
	 * @throws HSKDBException 
	 */
	public PagerModel getPagerModelByAgWorkTime(AgWorkTime att_AgWorkTime)
			throws HSKDBException {
		String Hql=this.getHql(att_AgWorkTime);
		return this.getHibernateDao().findByPage(Hql); 
	} 
	/**
	 * 根据AgWorkTime对象获取Hql字符串
     * @param  att_AgWorkTime  AgWorkTime类型(ag_work_time表记录)
	 *  @return hql字符串
	 */
	private String  getHql(AgWorkTime att_AgWorkTime){
			 StringBuffer sbuffer = new StringBuffer( " from  AgWorkTime  where  1=1  ");
			 String likeStr=  att_AgWorkTime.getTab_like();
			 String orderStr= att_AgWorkTime.getTab_order();
			 
			 //*****************无关字段处理begin*****************
						   		 //处理in条件 排班时间ID(shiftPeriodId)
							     if(att_AgWorkTime.getShiftPeriodId_str()!=null&&
						   		    !"".equals(att_AgWorkTime.getShiftPeriodId_str().trim())){ 
											 String  intStr=att_AgWorkTime.getShiftPeriodId_str().trim();
											 String[]  arrayStr=intStr.split(","); 
											 
											  if(arrayStr.length>0){
												 sbuffer.append(" and ( ");
												 for(int i=0;i<arrayStr.length;i++){
													 String did=arrayStr[i];
													 if(i==arrayStr.length-1){
														 sbuffer.append("  shiftPeriodId="+did+"   "); 
													 }else {
													 sbuffer.append("  shiftPeriodId="+did+" or "); 
													 }
												 }
												 sbuffer.append(" ) "); 
											 }
											   
								 	}
						   		 //处理in条件 医院ID(organizationId)
							     if(att_AgWorkTime.getOrganizationId_str()!=null&&
						   		    !"".equals(att_AgWorkTime.getOrganizationId_str().trim())){ 
											 String  intStr=att_AgWorkTime.getOrganizationId_str().trim();
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
									  if(att_AgWorkTime.getCreateDate_start()!=null){
								   	    	sbuffer.append( " and  createDate<='" +att_AgWorkTime.getCreateDate_start()+"'" );  
										 }
								 	  //时间类型结束条件处理 创建时间(createDate)
									 	if(att_AgWorkTime.getCreateDate_end()!=null){
						   	      			sbuffer.append( " and  createDate>'" +att_AgWorkTime.getCreateDate_end()+"'" );  
								  	     } 
								 		//时间类型开始条件处理  修改时间(editDate)
									  if(att_AgWorkTime.getEditDate_start()!=null){
								   	    	sbuffer.append( " and  editDate<='" +att_AgWorkTime.getEditDate_start()+"'" );  
										 }
								 	  //时间类型结束条件处理 修改时间(editDate)
									 	if(att_AgWorkTime.getEditDate_end()!=null){
						   	      			sbuffer.append( " and  editDate>'" +att_AgWorkTime.getEditDate_end()+"'" );  
								  	     } 
			 //*****************无关字段处理end*****************
			 //*****************数据库字段处理begin*************
								  		//排班时间ID(shiftPeriodId)
					 					if(att_AgWorkTime.getShiftPeriodId()!=null){
											 sbuffer.append( " and shiftPeriodId=" +att_AgWorkTime.getShiftPeriodId() );
										 }
								  		//医院ID(organizationId)
					 					if(att_AgWorkTime.getOrganizationId()!=null){
											 sbuffer.append( " and organizationId=" +att_AgWorkTime.getOrganizationId() );
										 }
					       				//开始时(startH)		 					 
									 if(att_AgWorkTime.getStartH()!=null&&
									  !"".equals(att_AgWorkTime.getStartH().trim())){
										  if(likeStr!=null&&!"".equals(likeStr.trim())&&likeStr.indexOf("startH")!=-1){
											  sbuffer.append( " and startH  like '%"+att_AgWorkTime.getStartH()+"%'"   );
										  }else {
											  sbuffer.append( " and startH   ='"+att_AgWorkTime.getStartH()+"'"   );
										  }
									 }
					       				//(startM)		 					 
									 if(att_AgWorkTime.getStartM()!=null&&
									  !"".equals(att_AgWorkTime.getStartM().trim())){
										  if(likeStr!=null&&!"".equals(likeStr.trim())&&likeStr.indexOf("startM")!=-1){
											  sbuffer.append( " and startM  like '%"+att_AgWorkTime.getStartM()+"%'"   );
										  }else {
											  sbuffer.append( " and startM   ='"+att_AgWorkTime.getStartM()+"'"   );
										  }
									 }
					       				//结束时(endH)		 					 
									 if(att_AgWorkTime.getEndH()!=null&&
									  !"".equals(att_AgWorkTime.getEndH().trim())){
										  if(likeStr!=null&&!"".equals(likeStr.trim())&&likeStr.indexOf("endH")!=-1){
											  sbuffer.append( " and endH  like '%"+att_AgWorkTime.getEndH()+"%'"   );
										  }else {
											  sbuffer.append( " and endH   ='"+att_AgWorkTime.getEndH()+"'"   );
										  }
									 }
					       				//结束分(endM)		 					 
									 if(att_AgWorkTime.getEndM()!=null&&
									  !"".equals(att_AgWorkTime.getEndM().trim())){
										  if(likeStr!=null&&!"".equals(likeStr.trim())&&likeStr.indexOf("endM")!=-1){
											  sbuffer.append( " and endM  like '%"+att_AgWorkTime.getEndM()+"%'"   );
										  }else {
											  sbuffer.append( " and endM   ='"+att_AgWorkTime.getEndM()+"'"   );
										  }
									 }
					       				//状态:0禁用1启用(status)		 					 
									 if(att_AgWorkTime.getStatus()!=null&&
									  !"".equals(att_AgWorkTime.getStatus().trim())){
										  if(likeStr!=null&&!"".equals(likeStr.trim())&&likeStr.indexOf("status")!=-1){
											  sbuffer.append( " and status  like '%"+att_AgWorkTime.getStatus()+"%'"   );
										  }else {
											  sbuffer.append( " and status   ='"+att_AgWorkTime.getStatus()+"'"   );
										  }
									 }
					       				//创建人(createRen)		 					 
									 if(att_AgWorkTime.getCreateRen()!=null&&
									  !"".equals(att_AgWorkTime.getCreateRen().trim())){
										  if(likeStr!=null&&!"".equals(likeStr.trim())&&likeStr.indexOf("createRen")!=-1){
											  sbuffer.append( " and createRen  like '%"+att_AgWorkTime.getCreateRen()+"%'"   );
										  }else {
											  sbuffer.append( " and createRen   ='"+att_AgWorkTime.getCreateRen()+"'"   );
										  }
									 }
						   				//创建时间(createDate)
						 				if(att_AgWorkTime.getCreateDate()!=null){
						   	                   sbuffer.append( " and  createDate='" +att_AgWorkTime.getCreateDate()+"'" );  
								  		}
					       				//修改人(editRen)		 					 
									 if(att_AgWorkTime.getEditRen()!=null&&
									  !"".equals(att_AgWorkTime.getEditRen().trim())){
										  if(likeStr!=null&&!"".equals(likeStr.trim())&&likeStr.indexOf("editRen")!=-1){
											  sbuffer.append( " and editRen  like '%"+att_AgWorkTime.getEditRen()+"%'"   );
										  }else {
											  sbuffer.append( " and editRen   ='"+att_AgWorkTime.getEditRen()+"'"   );
										  }
									 }
						   				//修改时间(editDate)
						 				if(att_AgWorkTime.getEditDate()!=null){
						   	                   sbuffer.append( " and  editDate='" +att_AgWorkTime.getEditDate()+"'" );  
								  		}
			 //*****************数据库字段处理end***************
			  		if(orderStr!=null&&!"".equals(orderStr.trim())){
									 sbuffer.append( " order by "+orderStr);
						 }
						 /*
						 else {
							  sbuffer.append( " order by  ShiftPeriodId   desc " );
					      }
					      */
			 
			 return  sbuffer.toString();
	}
}