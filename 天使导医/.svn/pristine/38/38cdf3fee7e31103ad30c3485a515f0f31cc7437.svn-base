package com.hsk.angeldoctor.api.daobbase.imp;

import java.util.*;
import com.hsk.supper.dto.comm.PagerModel;
import org.springframework.stereotype.*;
import com.hsk.exception.HSKDBException;
import com.hsk.supper.dao.imp.SupperDao;
import com.hsk.angeldoctor.api.daobbase.*;
import com.hsk.angeldoctor.api.persistence.*;

/** 
 * ag_job_menu_gx表数据库层面操作实现类 
 * @author  作者:admin
 * @version  版本信息:v1.0   创建时间: 2018-08-14 13:28:02
 */
@Component
public class  AgJobMenuGxDao extends SupperDao implements IAgJobMenuGxDao {	

	/**
	 * 根据ag_job_menu_gx表主键查找AgJobMenuGx对象记录
	 * 
	 * @param  AjmgId  Integer类型(ag_job_menu_gx表主键)
	 * @return AgJobMenuGx ag_job_menu_gx表记录
	 * @throws HSKDBException
	 */	
	public AgJobMenuGx findAgJobMenuGxById(Integer AjmgId) throws HSKDBException{
				AgJobMenuGx  att_AgJobMenuGx=new AgJobMenuGx();				
				if(AjmgId!=null){
					att_AgJobMenuGx.setAjmgId(AjmgId);	
				    Object obj=	this.getOne(att_AgJobMenuGx);
					if(obj!=null){
						att_AgJobMenuGx=(AgJobMenuGx) obj;
					}
				}
				return  att_AgJobMenuGx;
	}
	 /**
	  * 根据ag_job_menu_gx表主键删除AgJobMenuGx对象记录
	  * @param  AjmgId  Integer类型(ag_job_menu_gx表主键)
	  * @throws HSKDBException
	  */
	public void deleteAgJobMenuGxById(Integer AjmgId) throws HSKDBException{ 
		 AgJobMenuGx  att_AgJobMenuGx=new AgJobMenuGx();	
		  if(AjmgId!=null){
					  att_AgJobMenuGx.setAjmgId(AjmgId);
				  	  Object obj=	this.getOne(att_AgJobMenuGx);
					  if(obj!=null){
							this.deleteObject(obj); 
					  }
			}
	}

	/**
 	 * 根据ag_job_menu_gx表主键修改AgJobMenuGx对象记录
     * @param  AjmgId  Integer类型(ag_job_menu_gx表主键)
     * @param  att_AgJobMenuGx  AgJobMenuGx类型(ag_job_menu_gx表记录)
     * @return AgJobMenuGx  修改后的AgJobMenuGx对象记录
	 * @throws HSKDBException
	 */
	public  AgJobMenuGx updateAgJobMenuGxById(Integer AjmgId,AgJobMenuGx att_AgJobMenuGx) throws HSKDBException{
		  if(AjmgId!=null){
					att_AgJobMenuGx.setAjmgId(AjmgId);
				   	Object obj=	this.getOne(att_AgJobMenuGx);
					if(obj!=null){							 
							this.updateObject(obj);
					}
			}
			return  att_AgJobMenuGx;
	}
	
	/**
	 * 新增ag_job_menu_gx表 记录
     * @param  att_AgJobMenuGx  AgJobMenuGx类型(ag_job_menu_gx表记录)
	 * @throws HSKDBException
	 */
	public Integer saveAgJobMenuGx(AgJobMenuGx att_AgJobMenuGx) throws HSKDBException{
		 return this.newObject(att_AgJobMenuGx);
	} 
		
	/**
	 * 新增或修改ag_job_menu_gx表记录 ,如果ag_job_menu_gx表主键AgJobMenuGx.AjmgId为空就是添加，如果非空就是修改
     * @param  att_AgJobMenuGx  AgJobMenuGx类型(ag_job_menu_gx表记录)
	 * @throws HSKDBException
	 */
	public  AgJobMenuGx saveOrUpdateAgJobMenuGx(AgJobMenuGx att_AgJobMenuGx) throws HSKDBException{
		  this.getHibernateTemplate().saveOrUpdate(att_AgJobMenuGx);
		  return att_AgJobMenuGx;
	}
	
	/**
	 *根据AgJobMenuGx对象作为对(ag_job_menu_gx表进行查询，获取列表对象
     * @param  att_AgJobMenuGx  AgJobMenuGx类型(ag_job_menu_gx表记录)
     * @return List<AgJobMenuGx>  列表对象
	 * @throws HSKDBException 
	 */
	 @SuppressWarnings("unchecked")
	public List<AgJobMenuGx> getListByAgJobMenuGx(AgJobMenuGx att_AgJobMenuGx) throws HSKDBException{
		String Hql=this.getHql( att_AgJobMenuGx); 
		List<AgJobMenuGx> list=this.getHibernateTemplate().find(Hql);
		return  list;
	}
	/**
	 *根据AgJobMenuGx对象作为对(ag_job_menu_gx表进行查询，获取分页对象
     * @param  att_AgJobMenuGx  AgJobMenuGx类型(ag_job_menu_gx表记录)
     * @return List<AgJobMenuGx>  分页对象
	 * @throws HSKDBException 
	 */
	public PagerModel getPagerModelByAgJobMenuGx(AgJobMenuGx att_AgJobMenuGx)
			throws HSKDBException {
		String Hql=this.getHql(att_AgJobMenuGx);
		return this.getHibernateDao().findByPage(Hql); 
	} 
	/**
	 * 根据AgJobMenuGx对象获取Hql字符串
     * @param  att_AgJobMenuGx  AgJobMenuGx类型(ag_job_menu_gx表记录)
	 *  @return hql字符串
	 */
	private String  getHql(AgJobMenuGx att_AgJobMenuGx){
			 StringBuffer sbuffer = new StringBuffer( " from  AgJobMenuGx  where  1=1  ");
			 String likeStr=  att_AgJobMenuGx.getTab_like();
			 String orderStr= att_AgJobMenuGx.getTab_order();
			 
			 //*****************无关字段处理begin*****************
						   		 //处理in条件 岗位菜单关系ID(ajmgId)
							     if(att_AgJobMenuGx.getAjmgId_str()!=null&&
						   		    !"".equals(att_AgJobMenuGx.getAjmgId_str().trim())){ 
											 String  intStr=att_AgJobMenuGx.getAjmgId_str().trim();
											 String[]  arrayStr=intStr.split(","); 
											 
											  if(arrayStr.length>0){
												 sbuffer.append(" and ( ");
												 for(int i=0;i<arrayStr.length;i++){
													 String did=arrayStr[i];
													 if(i==arrayStr.length-1){
														 sbuffer.append("  ajmgId="+did+"   "); 
													 }else {
													 sbuffer.append("  ajmgId="+did+" or "); 
													 }
												 }
												 sbuffer.append(" ) "); 
											 }
											   
								 	}
						   		 //处理in条件 医院菜单ID(menuId)
							     if(att_AgJobMenuGx.getMenuId_str()!=null&&
						   		    !"".equals(att_AgJobMenuGx.getMenuId_str().trim())){ 
											 String  intStr=att_AgJobMenuGx.getMenuId_str().trim();
											 String[]  arrayStr=intStr.split(","); 
											 
											  if(arrayStr.length>0){
												 sbuffer.append(" and ( ");
												 for(int i=0;i<arrayStr.length;i++){
													 String did=arrayStr[i];
													 if(i==arrayStr.length-1){
														 sbuffer.append("  menuId="+did+"   "); 
													 }else {
													 sbuffer.append("  menuId="+did+" or "); 
													 }
												 }
												 sbuffer.append(" ) "); 
											 }
											   
								 	}
						   		 //处理in条件 岗位ID(jobId)
							     if(att_AgJobMenuGx.getJobId_str()!=null&&
						   		    !"".equals(att_AgJobMenuGx.getJobId_str().trim())){ 
											 String  intStr=att_AgJobMenuGx.getJobId_str().trim();
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
			 //*****************无关字段处理end*****************
			 //*****************数据库字段处理begin*************
								  		//岗位菜单关系ID(ajmgId)
					 					if(att_AgJobMenuGx.getAjmgId()!=null){
											 sbuffer.append( " and ajmgId=" +att_AgJobMenuGx.getAjmgId() );
										 }
								  		//医院菜单ID(menuId)
					 					if(att_AgJobMenuGx.getMenuId()!=null){
											 sbuffer.append( " and menuId=" +att_AgJobMenuGx.getMenuId() );
										 }
								  		//岗位ID(jobId)
					 					if(att_AgJobMenuGx.getJobId()!=null){
											 sbuffer.append( " and jobId=" +att_AgJobMenuGx.getJobId() );
										 }
			 //*****************数据库字段处理end***************
			  		if(orderStr!=null&&!"".equals(orderStr.trim())){
									 sbuffer.append( " order by "+orderStr);
						 }
						 /*
						 else {
							  sbuffer.append( " order by  AjmgId   desc " );
					      }
					      */
			 
			 return  sbuffer.toString();
	}
	@Override
	public void delAgJobMenuGxByIds(Integer jobId,String menuIds) throws HSKDBException {
		String sql ="delete from ag_Job_menu_gx where menu_Id in ("+menuIds+") and job_id="+jobId;
		this.getJdbcDao().execute(sql);
	}
}