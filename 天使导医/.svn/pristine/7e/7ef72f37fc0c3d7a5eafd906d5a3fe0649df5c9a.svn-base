package com.hsk.angeldoctor.api.daobbase.imp;

import java.util.*;
import com.hsk.supper.dto.comm.PagerModel;
import org.springframework.stereotype.*;
import com.hsk.exception.HSKDBException;
import com.hsk.supper.dao.imp.SupperDao;
import com.hsk.angeldoctor.api.daobbase.*;
import com.hsk.angeldoctor.api.persistence.*;

/** 
 * ag_hospital_role表数据库层面操作实现类 
 * @author  作者:admin
 * @version  版本信息:v1.0   创建时间: 2018-08-14 13:28:01
 */
@Component
public class  AgHospitalRoleDao extends SupperDao implements IAgHospitalRoleDao {	

	/**
	 * 根据ag_hospital_role表主键查找AgHospitalRole对象记录
	 * 
	 * @param  RoleId  Integer类型(ag_hospital_role表主键)
	 * @return AgHospitalRole ag_hospital_role表记录
	 * @throws HSKDBException
	 */	
	public AgHospitalRole findAgHospitalRoleById(Integer RoleId) throws HSKDBException{
				AgHospitalRole  att_AgHospitalRole=new AgHospitalRole();				
				if(RoleId!=null){
					att_AgHospitalRole.setRoleId(RoleId);	
				    Object obj=	this.getOne(att_AgHospitalRole);
					if(obj!=null){
						att_AgHospitalRole=(AgHospitalRole) obj;
					}
				}
				return  att_AgHospitalRole;
	}
	 /**
	  * 根据ag_hospital_role表主键删除AgHospitalRole对象记录
	  * @param  RoleId  Integer类型(ag_hospital_role表主键)
	  * @throws HSKDBException
	  */
	public void deleteAgHospitalRoleById(Integer RoleId) throws HSKDBException{ 
		 AgHospitalRole  att_AgHospitalRole=new AgHospitalRole();	
		  if(RoleId!=null){
					  att_AgHospitalRole.setRoleId(RoleId);
				  	  Object obj=	this.getOne(att_AgHospitalRole);
					  if(obj!=null){
							this.deleteObject(obj); 
					  }
			}
	}

	/**
 	 * 根据ag_hospital_role表主键修改AgHospitalRole对象记录
     * @param  RoleId  Integer类型(ag_hospital_role表主键)
     * @param  att_AgHospitalRole  AgHospitalRole类型(ag_hospital_role表记录)
     * @return AgHospitalRole  修改后的AgHospitalRole对象记录
	 * @throws HSKDBException
	 */
	public  AgHospitalRole updateAgHospitalRoleById(Integer RoleId,AgHospitalRole att_AgHospitalRole) throws HSKDBException{
		  if(RoleId!=null){
					att_AgHospitalRole.setRoleId(RoleId);
				   	Object obj=	this.getOne(att_AgHospitalRole);
					if(obj!=null){							 
							this.updateObject(obj);
					}
			}
			return  att_AgHospitalRole;
	}
	
	/**
	 * 新增ag_hospital_role表 记录
     * @param  att_AgHospitalRole  AgHospitalRole类型(ag_hospital_role表记录)
	 * @throws HSKDBException
	 */
	public Integer saveAgHospitalRole(AgHospitalRole att_AgHospitalRole) throws HSKDBException{
		 return this.newObject(att_AgHospitalRole);
	} 
		
	/**
	 * 新增或修改ag_hospital_role表记录 ,如果ag_hospital_role表主键AgHospitalRole.RoleId为空就是添加，如果非空就是修改
     * @param  att_AgHospitalRole  AgHospitalRole类型(ag_hospital_role表记录)
	 * @throws HSKDBException
	 */
	public  AgHospitalRole saveOrUpdateAgHospitalRole(AgHospitalRole att_AgHospitalRole) throws HSKDBException{
		  this.getHibernateTemplate().saveOrUpdate(att_AgHospitalRole);
		  return att_AgHospitalRole;
	}
	
	/**
	 *根据AgHospitalRole对象作为对(ag_hospital_role表进行查询，获取列表对象
     * @param  att_AgHospitalRole  AgHospitalRole类型(ag_hospital_role表记录)
     * @return List<AgHospitalRole>  列表对象
	 * @throws HSKDBException 
	 */
	 @SuppressWarnings("unchecked")
	public List<AgHospitalRole> getListByAgHospitalRole(AgHospitalRole att_AgHospitalRole) throws HSKDBException{
		String Hql=this.getHql( att_AgHospitalRole); 
		List<AgHospitalRole> list=this.getHibernateTemplate().find(Hql);
		return  list;
	}
	/**
	 *根据AgHospitalRole对象作为对(ag_hospital_role表进行查询，获取分页对象
     * @param  att_AgHospitalRole  AgHospitalRole类型(ag_hospital_role表记录)
     * @return List<AgHospitalRole>  分页对象
	 * @throws HSKDBException 
	 */
	public PagerModel getPagerModelByAgHospitalRole(AgHospitalRole att_AgHospitalRole)
			throws HSKDBException {
		String Hql=this.getHql(att_AgHospitalRole);
		return this.getHibernateDao().findByPage(Hql); 
	} 
	/**
	 * 根据AgHospitalRole对象获取Hql字符串
     * @param  att_AgHospitalRole  AgHospitalRole类型(ag_hospital_role表记录)
	 *  @return hql字符串
	 */
	private String  getHql(AgHospitalRole att_AgHospitalRole){
			 StringBuffer sbuffer = new StringBuffer( " from  AgHospitalRole  where  1=1  ");
			 String likeStr=  att_AgHospitalRole.getTab_like();
			 String orderStr= att_AgHospitalRole.getTab_order();
			 
			 //*****************无关字段处理begin*****************
						   		 //处理in条件 角色id(roleId)
							     if(att_AgHospitalRole.getRoleId_str()!=null&&
						   		    !"".equals(att_AgHospitalRole.getRoleId_str().trim())){ 
											 String  intStr=att_AgHospitalRole.getRoleId_str().trim();
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
						   		 //处理in条件 医院ID(organizationId)
							     if(att_AgHospitalRole.getOrganizationId_str()!=null&&
						   		    !"".equals(att_AgHospitalRole.getOrganizationId_str().trim())){ 
											 String  intStr=att_AgHospitalRole.getOrganizationId_str().trim();
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
									  if(att_AgHospitalRole.getCreateDate_start()!=null){
								   	    	sbuffer.append( " and  createDate<='" +att_AgHospitalRole.getCreateDate_start()+"'" );  
										 }
								 	  //时间类型结束条件处理 创建时间(createDate)
									 	if(att_AgHospitalRole.getCreateDate_end()!=null){
						   	      			sbuffer.append( " and  createDate>'" +att_AgHospitalRole.getCreateDate_end()+"'" );  
								  	     } 
								 		//时间类型开始条件处理  修改时间(editDate)
									  if(att_AgHospitalRole.getEditDate_start()!=null){
								   	    	sbuffer.append( " and  editDate<='" +att_AgHospitalRole.getEditDate_start()+"'" );  
										 }
								 	  //时间类型结束条件处理 修改时间(editDate)
									 	if(att_AgHospitalRole.getEditDate_end()!=null){
						   	      			sbuffer.append( " and  editDate>'" +att_AgHospitalRole.getEditDate_end()+"'" );  
								  	     } 
			 //*****************无关字段处理end*****************
			 //*****************数据库字段处理begin*************
								  		//角色id(roleId)
					 					if(att_AgHospitalRole.getRoleId()!=null){
											 sbuffer.append( " and roleId=" +att_AgHospitalRole.getRoleId() );
										 }
								  		//医院ID(organizationId)
					 					if(att_AgHospitalRole.getOrganizationId()!=null){
											 sbuffer.append( " and organizationId=" +att_AgHospitalRole.getOrganizationId() );
										 }
					       				//角色名称(name)		 					 
									 if(att_AgHospitalRole.getName()!=null&&
									  !"".equals(att_AgHospitalRole.getName().trim())){
										  if(likeStr!=null&&!"".equals(likeStr.trim())&&likeStr.indexOf("name")!=-1){
											  sbuffer.append( " and name  like '%"+att_AgHospitalRole.getName()+"%'"   );
										  }else {
											  sbuffer.append( " and name   ='"+att_AgHospitalRole.getName()+"'"   );
										  }
									 }
					       				//是否可编辑：0是1否(locked)		 					 
									 if(att_AgHospitalRole.getLocked()!=null&&
									  !"".equals(att_AgHospitalRole.getLocked().trim())){
										  if(likeStr!=null&&!"".equals(likeStr.trim())&&likeStr.indexOf("locked")!=-1){
											  sbuffer.append( " and locked  like '%"+att_AgHospitalRole.getLocked()+"%'"   );
										  }else {
											  sbuffer.append( " and locked   ='"+att_AgHospitalRole.getLocked()+"'"   );
										  }
									 }
					       				//状态(status)		 					 
									 if(att_AgHospitalRole.getStatus()!=null&&
									  !"".equals(att_AgHospitalRole.getStatus().trim())){
										  if(likeStr!=null&&!"".equals(likeStr.trim())&&likeStr.indexOf("status")!=-1){
											  sbuffer.append( " and status  like '%"+att_AgHospitalRole.getStatus()+"%'"   );
										  }else {
											  sbuffer.append( " and status   ='"+att_AgHospitalRole.getStatus()+"'"   );
										  }
									 }
					       				//创建人(createRen)		 					 
									 if(att_AgHospitalRole.getCreateRen()!=null&&
									  !"".equals(att_AgHospitalRole.getCreateRen().trim())){
										  if(likeStr!=null&&!"".equals(likeStr.trim())&&likeStr.indexOf("createRen")!=-1){
											  sbuffer.append( " and createRen  like '%"+att_AgHospitalRole.getCreateRen()+"%'"   );
										  }else {
											  sbuffer.append( " and createRen   ='"+att_AgHospitalRole.getCreateRen()+"'"   );
										  }
									 }
						   				//创建时间(createDate)
						 				if(att_AgHospitalRole.getCreateDate()!=null){
						   	                   sbuffer.append( " and  createDate='" +att_AgHospitalRole.getCreateDate()+"'" );  
								  		}
					       				//修改人(editRen)		 					 
									 if(att_AgHospitalRole.getEditRen()!=null&&
									  !"".equals(att_AgHospitalRole.getEditRen().trim())){
										  if(likeStr!=null&&!"".equals(likeStr.trim())&&likeStr.indexOf("editRen")!=-1){
											  sbuffer.append( " and editRen  like '%"+att_AgHospitalRole.getEditRen()+"%'"   );
										  }else {
											  sbuffer.append( " and editRen   ='"+att_AgHospitalRole.getEditRen()+"'"   );
										  }
									 }
						   				//修改时间(editDate)
						 				if(att_AgHospitalRole.getEditDate()!=null){
						   	                   sbuffer.append( " and  editDate='" +att_AgHospitalRole.getEditDate()+"'" );  
								  		}
			 //*****************数据库字段处理end***************
			  		if(orderStr!=null&&!"".equals(orderStr.trim())){
									 sbuffer.append( " order by "+orderStr);
						 }
						 /*
						 else {
							  sbuffer.append( " order by  RoleId   desc " );
					      }
					      */
			 
			 return  sbuffer.toString();
	}
}