package com.hsk.angeldoctor.api.daobbase.imp;

import java.util.*;
import com.hsk.supper.dto.comm.PagerModel;
import org.springframework.stereotype.*;
import com.hsk.exception.HSKDBException;
import com.hsk.supper.dao.imp.SupperDao;
import com.hsk.angeldoctor.api.daobbase.*;
import com.hsk.angeldoctor.api.persistence.*;

/** 
 * ag_doctor_department_gx表数据库层面操作实现类 
 * @author  作者:admin
 * @version  版本信息:v1.0   创建时间: 2018-08-14 13:27:59
 */
@Component
public class  AgDoctorDepartmentGxDao extends SupperDao implements IAgDoctorDepartmentGxDao {	

	/**
	 * 根据ag_doctor_department_gx表主键查找AgDoctorDepartmentGx对象记录
	 * 
	 * @param  AddgId  Integer类型(ag_doctor_department_gx表主键)
	 * @return AgDoctorDepartmentGx ag_doctor_department_gx表记录
	 * @throws HSKDBException
	 */	
	public AgDoctorDepartmentGx findAgDoctorDepartmentGxById(Integer AddgId) throws HSKDBException{
				AgDoctorDepartmentGx  att_AgDoctorDepartmentGx=new AgDoctorDepartmentGx();				
				if(AddgId!=null){
					att_AgDoctorDepartmentGx.setAddgId(AddgId);	
				    Object obj=	this.getOne(att_AgDoctorDepartmentGx);
					if(obj!=null){
						att_AgDoctorDepartmentGx=(AgDoctorDepartmentGx) obj;
					}
				}
				return  att_AgDoctorDepartmentGx;
	}
	 /**
	  * 根据ag_doctor_department_gx表主键删除AgDoctorDepartmentGx对象记录
	  * @param  AddgId  Integer类型(ag_doctor_department_gx表主键)
	  * @throws HSKDBException
	  */
	public void deleteAgDoctorDepartmentGxById(Integer AddgId) throws HSKDBException{ 
		 AgDoctorDepartmentGx  att_AgDoctorDepartmentGx=new AgDoctorDepartmentGx();	
		  if(AddgId!=null){
					  att_AgDoctorDepartmentGx.setAddgId(AddgId);
				  	  Object obj=	this.getOne(att_AgDoctorDepartmentGx);
					  if(obj!=null){
							this.deleteObject(obj); 
					  }
			}
	}

	/**
 	 * 根据ag_doctor_department_gx表主键修改AgDoctorDepartmentGx对象记录
     * @param  AddgId  Integer类型(ag_doctor_department_gx表主键)
     * @param  att_AgDoctorDepartmentGx  AgDoctorDepartmentGx类型(ag_doctor_department_gx表记录)
     * @return AgDoctorDepartmentGx  修改后的AgDoctorDepartmentGx对象记录
	 * @throws HSKDBException
	 */
	public  AgDoctorDepartmentGx updateAgDoctorDepartmentGxById(Integer AddgId,AgDoctorDepartmentGx att_AgDoctorDepartmentGx) throws HSKDBException{
		  if(AddgId!=null){
					att_AgDoctorDepartmentGx.setAddgId(AddgId);
				   	Object obj=	this.getOne(att_AgDoctorDepartmentGx);
					if(obj!=null){							 
							this.updateObject(obj);
					}
			}
			return  att_AgDoctorDepartmentGx;
	}
	
	/**
	 * 新增ag_doctor_department_gx表 记录
     * @param  att_AgDoctorDepartmentGx  AgDoctorDepartmentGx类型(ag_doctor_department_gx表记录)
	 * @throws HSKDBException
	 */
	public Integer saveAgDoctorDepartmentGx(AgDoctorDepartmentGx att_AgDoctorDepartmentGx) throws HSKDBException{
		 return this.newObject(att_AgDoctorDepartmentGx);
	} 
		
	/**
	 * 新增或修改ag_doctor_department_gx表记录 ,如果ag_doctor_department_gx表主键AgDoctorDepartmentGx.AddgId为空就是添加，如果非空就是修改
     * @param  att_AgDoctorDepartmentGx  AgDoctorDepartmentGx类型(ag_doctor_department_gx表记录)
	 * @throws HSKDBException
	 */
	public  AgDoctorDepartmentGx saveOrUpdateAgDoctorDepartmentGx(AgDoctorDepartmentGx att_AgDoctorDepartmentGx) throws HSKDBException{
		  this.getHibernateTemplate().saveOrUpdate(att_AgDoctorDepartmentGx);
		  return att_AgDoctorDepartmentGx;
	}
	
	/**
	 *根据AgDoctorDepartmentGx对象作为对(ag_doctor_department_gx表进行查询，获取列表对象
     * @param  att_AgDoctorDepartmentGx  AgDoctorDepartmentGx类型(ag_doctor_department_gx表记录)
     * @return List<AgDoctorDepartmentGx>  列表对象
	 * @throws HSKDBException 
	 */
	 @SuppressWarnings("unchecked")
	public List<AgDoctorDepartmentGx> getListByAgDoctorDepartmentGx(AgDoctorDepartmentGx att_AgDoctorDepartmentGx) throws HSKDBException{
		String Hql=this.getHql( att_AgDoctorDepartmentGx); 
		List<AgDoctorDepartmentGx> list=this.getHibernateTemplate().find(Hql);
		return  list;
	}
	/**
	 *根据AgDoctorDepartmentGx对象作为对(ag_doctor_department_gx表进行查询，获取分页对象
     * @param  att_AgDoctorDepartmentGx  AgDoctorDepartmentGx类型(ag_doctor_department_gx表记录)
     * @return List<AgDoctorDepartmentGx>  分页对象
	 * @throws HSKDBException 
	 */
	public PagerModel getPagerModelByAgDoctorDepartmentGx(AgDoctorDepartmentGx att_AgDoctorDepartmentGx)
			throws HSKDBException {
		String Hql=this.getHql(att_AgDoctorDepartmentGx);
		return this.getHibernateDao().findByPage(Hql); 
	} 
	/**
	 * 根据AgDoctorDepartmentGx对象获取Hql字符串
     * @param  att_AgDoctorDepartmentGx  AgDoctorDepartmentGx类型(ag_doctor_department_gx表记录)
	 *  @return hql字符串
	 */
	private String  getHql(AgDoctorDepartmentGx att_AgDoctorDepartmentGx){
			 StringBuffer sbuffer = new StringBuffer( " from  AgDoctorDepartmentGx  where  1=1  ");
			 String likeStr=  att_AgDoctorDepartmentGx.getTab_like();
			 String orderStr= att_AgDoctorDepartmentGx.getTab_order();
			 
			 //*****************无关字段处理begin*****************
						   		 //处理in条件 医生科室关系ID(addgId)
							     if(att_AgDoctorDepartmentGx.getAddgId_str()!=null&&
						   		    !"".equals(att_AgDoctorDepartmentGx.getAddgId_str().trim())){ 
											 String  intStr=att_AgDoctorDepartmentGx.getAddgId_str().trim();
											 String[]  arrayStr=intStr.split(","); 
											 
											  if(arrayStr.length>0){
												 sbuffer.append(" and ( ");
												 for(int i=0;i<arrayStr.length;i++){
													 String did=arrayStr[i];
													 if(i==arrayStr.length-1){
														 sbuffer.append("  addgId="+did+"   "); 
													 }else {
													 sbuffer.append("  addgId="+did+" or "); 
													 }
												 }
												 sbuffer.append(" ) "); 
											 }
											   
								 	}
						   		 //处理in条件 医生ID(doctorId)
							     if(att_AgDoctorDepartmentGx.getDoctorId_str()!=null&&
						   		    !"".equals(att_AgDoctorDepartmentGx.getDoctorId_str().trim())){ 
											 String  intStr=att_AgDoctorDepartmentGx.getDoctorId_str().trim();
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
						   		 //处理in条件 科室ID(departmentId)
							     if(att_AgDoctorDepartmentGx.getDepartmentId_str()!=null&&
						   		    !"".equals(att_AgDoctorDepartmentGx.getDepartmentId_str().trim())){ 
											 String  intStr=att_AgDoctorDepartmentGx.getDepartmentId_str().trim();
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
							     
							 	//名称 (name)		 					 
								 if(att_AgDoctorDepartmentGx.getName() !=null&&
								  !"".equals(att_AgDoctorDepartmentGx.getName().trim())){
									  if(likeStr!=null&&!"".equals(likeStr.trim())&&likeStr.indexOf("name")!=-1){
										  sbuffer.append( " and name  like '%"+att_AgDoctorDepartmentGx.getName()+"%'"   );
									  }else {
										  sbuffer.append( " and name   ='"+att_AgDoctorDepartmentGx.getName()+"'"   );
									  }
								 }
								//名称 (name)		 					 
								 if(att_AgDoctorDepartmentGx.getVisible() !=null&&
								  !"".equals(att_AgDoctorDepartmentGx.getVisible().trim())){
									  if(likeStr!=null&&!"".equals(likeStr.trim())&&likeStr.indexOf("visible")!=-1){
										  sbuffer.append( " and visible  like '%"+att_AgDoctorDepartmentGx.getVisible()+"%'"   );
									  }else {
										  sbuffer.append( " and visible   ='"+att_AgDoctorDepartmentGx.getVisible()+"'"   );
									  }
								 }
							     
			 //*****************无关字段处理end*****************
			 //*****************数据库字段处理begin*************
								  		//医生科室关系ID(addgId)
					 					if(att_AgDoctorDepartmentGx.getAddgId()!=null){
											 sbuffer.append( " and addgId=" +att_AgDoctorDepartmentGx.getAddgId() );
										 }
								  		//医生ID(doctorId)
					 					if(att_AgDoctorDepartmentGx.getDoctorId()!=null){
											 sbuffer.append( " and doctorId=" +att_AgDoctorDepartmentGx.getDoctorId() );
										 }
								  		//科室ID(departmentId)
					 					if(att_AgDoctorDepartmentGx.getDepartmentId()!=null){
											 sbuffer.append( " and departmentId=" +att_AgDoctorDepartmentGx.getDepartmentId() );
										 }
			 //*****************数据库字段处理end***************
			  		if(orderStr!=null&&!"".equals(orderStr.trim())){
									 sbuffer.append( " order by "+orderStr);
						 }
						 /*
						 else {
							  sbuffer.append( " order by  AddgId   desc " );
					      }
					      */
			 
			 return  sbuffer.toString();
	}
}