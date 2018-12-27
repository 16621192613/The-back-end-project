package com.hsk.angeldoctor.api.daobbase.imp;

import java.util.*;
import com.hsk.supper.dto.comm.PagerModel;
import org.springframework.stereotype.*;
import com.hsk.exception.HSKDBException;
import com.hsk.supper.dao.imp.SupperDao;
import com.hsk.angeldoctor.api.daobbase.*;
import com.hsk.angeldoctor.api.persistence.*;

/** 
 * ag_department_info表数据库层面操作实现类 
 * @author  作者:admin
 * @version  版本信息:v1.0   创建时间: 2018-08-14 13:27:59
 */
@Component
public class  AgDepartmentInfoDao extends SupperDao implements IAgDepartmentInfoDao {	

	/**
	 * 根据ag_department_info表主键查找AgDepartmentInfo对象记录
	 * 
	 * @param  DepartmentId  Integer类型(ag_department_info表主键)
	 * @return AgDepartmentInfo ag_department_info表记录
	 * @throws HSKDBException
	 */	
	public AgDepartmentInfo findAgDepartmentInfoById(Integer DepartmentId) throws HSKDBException{
				AgDepartmentInfo  att_AgDepartmentInfo=new AgDepartmentInfo();				
				if(DepartmentId!=null){
					att_AgDepartmentInfo.setDepartmentId(DepartmentId);	
				    Object obj=	this.getOne(att_AgDepartmentInfo);
					if(obj!=null){
						att_AgDepartmentInfo=(AgDepartmentInfo) obj;
					}
				}
				return  att_AgDepartmentInfo;
	}
	 /**
	  * 根据ag_department_info表主键删除AgDepartmentInfo对象记录
	  * @param  DepartmentId  Integer类型(ag_department_info表主键)
	  * @throws HSKDBException
	  */
	public void deleteAgDepartmentInfoById(Integer DepartmentId) throws HSKDBException{ 
		 AgDepartmentInfo  att_AgDepartmentInfo=new AgDepartmentInfo();	
		  if(DepartmentId!=null){
					  att_AgDepartmentInfo.setDepartmentId(DepartmentId);
				  	  Object obj=	this.getOne(att_AgDepartmentInfo);
					  if(obj!=null){
							this.deleteObject(obj); 
					  }
			}
	}

	/**
 	 * 根据ag_department_info表主键修改AgDepartmentInfo对象记录
     * @param  DepartmentId  Integer类型(ag_department_info表主键)
     * @param  att_AgDepartmentInfo  AgDepartmentInfo类型(ag_department_info表记录)
     * @return AgDepartmentInfo  修改后的AgDepartmentInfo对象记录
	 * @throws HSKDBException
	 */
	public  AgDepartmentInfo updateAgDepartmentInfoById(Integer DepartmentId,AgDepartmentInfo att_AgDepartmentInfo) throws HSKDBException{
		  if(DepartmentId!=null){
					att_AgDepartmentInfo.setDepartmentId(DepartmentId);
				   	Object obj=	this.getOne(att_AgDepartmentInfo);
					if(obj!=null){							 
							this.updateObject(obj);
					}
			}
			return  att_AgDepartmentInfo;
	}
	
	/**
	 * 新增ag_department_info表 记录
     * @param  att_AgDepartmentInfo  AgDepartmentInfo类型(ag_department_info表记录)
	 * @throws HSKDBException
	 */
	public Integer saveAgDepartmentInfo(AgDepartmentInfo att_AgDepartmentInfo) throws HSKDBException{
		 return this.newObject(att_AgDepartmentInfo);
	} 
		
	/**
	 * 新增或修改ag_department_info表记录 ,如果ag_department_info表主键AgDepartmentInfo.DepartmentId为空就是添加，如果非空就是修改
     * @param  att_AgDepartmentInfo  AgDepartmentInfo类型(ag_department_info表记录)
	 * @throws HSKDBException
	 */
	public  AgDepartmentInfo saveOrUpdateAgDepartmentInfo(AgDepartmentInfo att_AgDepartmentInfo) throws HSKDBException{
		  this.getHibernateTemplate().saveOrUpdate(att_AgDepartmentInfo);
		  return att_AgDepartmentInfo;
	}
	
	/**
	 *根据AgDepartmentInfo对象作为对(ag_department_info表进行查询，获取列表对象
     * @param  att_AgDepartmentInfo  AgDepartmentInfo类型(ag_department_info表记录)
     * @return List<AgDepartmentInfo>  列表对象
	 * @throws HSKDBException 
	 */
	 @SuppressWarnings("unchecked")
	public List<AgDepartmentInfo> getListByAgDepartmentInfo(AgDepartmentInfo att_AgDepartmentInfo) throws HSKDBException{
		String Hql=this.getHql( att_AgDepartmentInfo); 
		List<AgDepartmentInfo> list=this.getHibernateTemplate().find(Hql);
		return  list;
	}
	/**
	 *根据AgDepartmentInfo对象作为对(ag_department_info表进行查询，获取分页对象
     * @param  att_AgDepartmentInfo  AgDepartmentInfo类型(ag_department_info表记录)
     * @return List<AgDepartmentInfo>  分页对象
	 * @throws HSKDBException 
	 */
	public PagerModel getPagerModelByAgDepartmentInfo(AgDepartmentInfo att_AgDepartmentInfo)
			throws HSKDBException {
		String Hql=this.getHql(att_AgDepartmentInfo);
		return this.getHibernateDao().findByPage(Hql); 
	} 
	/**
	 * 根据AgDepartmentInfo对象获取Hql字符串
     * @param  att_AgDepartmentInfo  AgDepartmentInfo类型(ag_department_info表记录)
	 *  @return hql字符串
	 */
	private String  getHql(AgDepartmentInfo att_AgDepartmentInfo){
			 StringBuffer sbuffer = new StringBuffer( " from  AgDepartmentInfo  where  1=1  ");
			 String likeStr=  att_AgDepartmentInfo.getTab_like();
			 String orderStr= att_AgDepartmentInfo.getTab_order();
			 
			 //*****************无关字段处理begin*****************
						   		 //处理in条件 科室ID(departmentId)
							     if(att_AgDepartmentInfo.getDepartmentId_str()!=null&&
						   		    !"".equals(att_AgDepartmentInfo.getDepartmentId_str().trim())){ 
											 String  intStr=att_AgDepartmentInfo.getDepartmentId_str().trim();
											 String[]  arrayStr=intStr.split(","); 
											 
											  if(arrayStr.length>0){
												 sbuffer.append(" and ( ");
												 for(int i=0;i<arrayStr.length;i++){
													 String did=arrayStr[i];
													 if(i==arrayStr.length-1){
														 sbuffer.append("  departmentId="+did+"   "); 
													 }else {
													 sbuffer.append("  departmentId="+did+" or "); 
													 }
												 }
												 sbuffer.append(" ) "); 
											 }
											   
								 	}
						   		 //处理in条件 医院ID(organizationId)
							     if(att_AgDepartmentInfo.getOrganizationId_str()!=null&&
						   		    !"".equals(att_AgDepartmentInfo.getOrganizationId_str().trim())){ 
											 String  intStr=att_AgDepartmentInfo.getOrganizationId_str().trim();
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
									  if(att_AgDepartmentInfo.getCreateDate_start()!=null){
								   	    	sbuffer.append( " and  createDate<='" +att_AgDepartmentInfo.getCreateDate_start()+"'" );  
										 }
								 	  //时间类型结束条件处理 创建时间(createDate)
									 	if(att_AgDepartmentInfo.getCreateDate_end()!=null){
						   	      			sbuffer.append( " and  createDate>'" +att_AgDepartmentInfo.getCreateDate_end()+"'" );  
								  	     } 
								 		//时间类型开始条件处理  修改时间(editDate)
									  if(att_AgDepartmentInfo.getEditDate_start()!=null){
								   	    	sbuffer.append( " and  editDate<='" +att_AgDepartmentInfo.getEditDate_start()+"'" );  
										 }
								 	  //时间类型结束条件处理 修改时间(editDate)
									 	if(att_AgDepartmentInfo.getEditDate_end()!=null){
						   	      			sbuffer.append( " and  editDate>'" +att_AgDepartmentInfo.getEditDate_end()+"'" );  
								  	     } 
			 //*****************无关字段处理end*****************
			 //*****************数据库字段处理begin*************
								  		//科室ID(departmentId)
					 					if(att_AgDepartmentInfo.getDepartmentId()!=null){
											 sbuffer.append( " and departmentId=" +att_AgDepartmentInfo.getDepartmentId() );
										 }
								  		//医院ID(organizationId)
					 					if(att_AgDepartmentInfo.getOrganizationId()!=null){
											 sbuffer.append( " and organizationId=" +att_AgDepartmentInfo.getOrganizationId() );
										 }
					       				//科室名称(name)		 					 
									 if(att_AgDepartmentInfo.getName()!=null&&
									  !"".equals(att_AgDepartmentInfo.getName().trim())){
										  if(likeStr!=null&&!"".equals(likeStr.trim())&&likeStr.indexOf("name")!=-1){
											  sbuffer.append( " and name  like '%"+att_AgDepartmentInfo.getName()+"%'"   );
										  }else {
											  sbuffer.append( " and name   ='"+att_AgDepartmentInfo.getName()+"'"   );
										  }
									 }
					       				//是否对外显示，1显示，0不显示(visible)		 					 
									 if(att_AgDepartmentInfo.getVisible()!=null&&
									  !"".equals(att_AgDepartmentInfo.getVisible().trim())){
										  if(likeStr!=null&&!"".equals(likeStr.trim())&&likeStr.indexOf("visible")!=-1){
											  sbuffer.append( " and visible  like '%"+att_AgDepartmentInfo.getVisible()+"%'"   );
										  }else {
											  sbuffer.append( " and visible   ='"+att_AgDepartmentInfo.getVisible()+"'"   );
										  }
									 }
					       				//是否排班到科室(regToDepartment)		 					 
									 if(att_AgDepartmentInfo.getRegToDepartment()!=null&&
									  !"".equals(att_AgDepartmentInfo.getRegToDepartment().trim())){
										  if(likeStr!=null&&!"".equals(likeStr.trim())&&likeStr.indexOf("regToDepartment")!=-1){
											  sbuffer.append( " and regToDepartment  like '%"+att_AgDepartmentInfo.getRegToDepartment()+"%'"   );
										  }else {
											  sbuffer.append( " and regToDepartment   ='"+att_AgDepartmentInfo.getRegToDepartment()+"'"   );
										  }
									 }
					       				//状态:1正常，2禁用(status)		 					 
									 if(att_AgDepartmentInfo.getStatus()!=null&&
									  !"".equals(att_AgDepartmentInfo.getStatus().trim())){
										  if(likeStr!=null&&!"".equals(likeStr.trim())&&likeStr.indexOf("status")!=-1){
											  sbuffer.append( " and status  like '%"+att_AgDepartmentInfo.getStatus()+"%'"   );
										  }else {
											  sbuffer.append( " and status   ='"+att_AgDepartmentInfo.getStatus()+"'"   );
										  }
									 }
					       				//创建人(createRen)		 					 
									 if(att_AgDepartmentInfo.getCreateRen()!=null&&
									  !"".equals(att_AgDepartmentInfo.getCreateRen().trim())){
										  if(likeStr!=null&&!"".equals(likeStr.trim())&&likeStr.indexOf("createRen")!=-1){
											  sbuffer.append( " and createRen  like '%"+att_AgDepartmentInfo.getCreateRen()+"%'"   );
										  }else {
											  sbuffer.append( " and createRen   ='"+att_AgDepartmentInfo.getCreateRen()+"'"   );
										  }
									 }
						   				//创建时间(createDate)
						 				if(att_AgDepartmentInfo.getCreateDate()!=null){
						   	                   sbuffer.append( " and  createDate='" +att_AgDepartmentInfo.getCreateDate()+"'" );  
								  		}
					       				//修改人(editRen)		 					 
									 if(att_AgDepartmentInfo.getEditRen()!=null&&
									  !"".equals(att_AgDepartmentInfo.getEditRen().trim())){
										  if(likeStr!=null&&!"".equals(likeStr.trim())&&likeStr.indexOf("editRen")!=-1){
											  sbuffer.append( " and editRen  like '%"+att_AgDepartmentInfo.getEditRen()+"%'"   );
										  }else {
											  sbuffer.append( " and editRen   ='"+att_AgDepartmentInfo.getEditRen()+"'"   );
										  }
									 }
						   				//修改时间(editDate)
						 				if(att_AgDepartmentInfo.getEditDate()!=null){
						   	                   sbuffer.append( " and  editDate='" +att_AgDepartmentInfo.getEditDate()+"'" );  
								  		}
			 //*****************数据库字段处理end***************
			  		if(orderStr!=null&&!"".equals(orderStr.trim())){
									 sbuffer.append( " order by "+orderStr);
						 }
						 /*
						 else {
							  sbuffer.append( " order by  DepartmentId   desc " );
					      }
					      */
			 
			 return  sbuffer.toString();
	}
}