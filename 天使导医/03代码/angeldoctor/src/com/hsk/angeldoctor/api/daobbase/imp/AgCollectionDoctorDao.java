package com.hsk.angeldoctor.api.daobbase.imp;

import java.util.*;
import com.hsk.supper.dto.comm.PagerModel;
import org.springframework.stereotype.*;
import com.hsk.exception.HSKDBException;
import com.hsk.supper.dao.imp.SupperDao;
import com.hsk.angeldoctor.api.daobbase.*;
import com.hsk.angeldoctor.api.persistence.*;

/** 
 * ag_collection_doctor表数据库层面操作实现类 
 * @author  作者:admin
 * @version  版本信息:v1.0   创建时间: 2018-08-14 13:27:58
 */
@Component
public class  AgCollectionDoctorDao extends SupperDao implements IAgCollectionDoctorDao {	

	/**
	 * 根据ag_collection_doctor表主键查找AgCollectionDoctor对象记录
	 * 
	 * @param  McdId  Integer类型(ag_collection_doctor表主键)
	 * @return AgCollectionDoctor ag_collection_doctor表记录
	 * @throws HSKDBException
	 */	
	public AgCollectionDoctor findAgCollectionDoctorById(Integer McdId) throws HSKDBException{
				AgCollectionDoctor  att_AgCollectionDoctor=new AgCollectionDoctor();				
				if(McdId!=null){
					att_AgCollectionDoctor.setMcdId(McdId);	
				    Object obj=	this.getOne(att_AgCollectionDoctor);
					if(obj!=null){
						att_AgCollectionDoctor=(AgCollectionDoctor) obj;
					}
				}
				return  att_AgCollectionDoctor;
	}
	 /**
	  * 根据ag_collection_doctor表主键删除AgCollectionDoctor对象记录
	  * @param  McdId  Integer类型(ag_collection_doctor表主键)
	  * @throws HSKDBException
	  */
	public void deleteAgCollectionDoctorById(Integer McdId) throws HSKDBException{ 
		 AgCollectionDoctor  att_AgCollectionDoctor=new AgCollectionDoctor();	
		  if(McdId!=null){
					  att_AgCollectionDoctor.setMcdId(McdId);
				  	  Object obj=	this.getOne(att_AgCollectionDoctor);
					  if(obj!=null){
							this.deleteObject(obj); 
					  }
			}
	}

	/**
 	 * 根据ag_collection_doctor表主键修改AgCollectionDoctor对象记录
     * @param  McdId  Integer类型(ag_collection_doctor表主键)
     * @param  att_AgCollectionDoctor  AgCollectionDoctor类型(ag_collection_doctor表记录)
     * @return AgCollectionDoctor  修改后的AgCollectionDoctor对象记录
	 * @throws HSKDBException
	 */
	public  AgCollectionDoctor updateAgCollectionDoctorById(Integer McdId,AgCollectionDoctor att_AgCollectionDoctor) throws HSKDBException{
		  if(McdId!=null){
					att_AgCollectionDoctor.setMcdId(McdId);
				   	Object obj=	this.getOne(att_AgCollectionDoctor);
					if(obj!=null){							 
							this.updateObject(obj);
					}
			}
			return  att_AgCollectionDoctor;
	}
	
	/**
	 * 新增ag_collection_doctor表 记录
     * @param  att_AgCollectionDoctor  AgCollectionDoctor类型(ag_collection_doctor表记录)
	 * @throws HSKDBException
	 */
	public Integer saveAgCollectionDoctor(AgCollectionDoctor att_AgCollectionDoctor) throws HSKDBException{
		 return this.newObject(att_AgCollectionDoctor);
	} 
		
	/**
	 * 新增或修改ag_collection_doctor表记录 ,如果ag_collection_doctor表主键AgCollectionDoctor.McdId为空就是添加，如果非空就是修改
     * @param  att_AgCollectionDoctor  AgCollectionDoctor类型(ag_collection_doctor表记录)
	 * @throws HSKDBException
	 */
	public  AgCollectionDoctor saveOrUpdateAgCollectionDoctor(AgCollectionDoctor att_AgCollectionDoctor) throws HSKDBException{
		  this.getHibernateTemplate().saveOrUpdate(att_AgCollectionDoctor);
		  return att_AgCollectionDoctor;
	}
	
	/**
	 *根据AgCollectionDoctor对象作为对(ag_collection_doctor表进行查询，获取列表对象
     * @param  att_AgCollectionDoctor  AgCollectionDoctor类型(ag_collection_doctor表记录)
     * @return List<AgCollectionDoctor>  列表对象
	 * @throws HSKDBException 
	 */
	 @SuppressWarnings("unchecked")
	public List<AgCollectionDoctor> getListByAgCollectionDoctor(AgCollectionDoctor att_AgCollectionDoctor) throws HSKDBException{
		String Hql=this.getHql( att_AgCollectionDoctor); 
		List<AgCollectionDoctor> list=this.getHibernateTemplate().find(Hql);
		return  list;
	}
	/**
	 *根据AgCollectionDoctor对象作为对(ag_collection_doctor表进行查询，获取分页对象
     * @param  att_AgCollectionDoctor  AgCollectionDoctor类型(ag_collection_doctor表记录)
     * @return List<AgCollectionDoctor>  分页对象
	 * @throws HSKDBException 
	 */
	public PagerModel getPagerModelByAgCollectionDoctor(AgCollectionDoctor att_AgCollectionDoctor)
			throws HSKDBException {
		String Hql=this.getHql(att_AgCollectionDoctor);
		return this.getHibernateDao().findByPage(Hql); 
	} 
	/**
	 * 根据AgCollectionDoctor对象获取Hql字符串
     * @param  att_AgCollectionDoctor  AgCollectionDoctor类型(ag_collection_doctor表记录)
	 *  @return hql字符串
	 */
	private String  getHql(AgCollectionDoctor att_AgCollectionDoctor){
			 StringBuffer sbuffer = new StringBuffer( " from  AgCollectionDoctor  where  1=1  ");
			 String likeStr=  att_AgCollectionDoctor.getTab_like();
			 String orderStr= att_AgCollectionDoctor.getTab_order();
			 
			 //*****************无关字段处理begin*****************
						   		 //处理in条件 医生收藏ID(mcdId)
							     if(att_AgCollectionDoctor.getMcdId_str()!=null&&
						   		    !"".equals(att_AgCollectionDoctor.getMcdId_str().trim())){ 
											 String  intStr=att_AgCollectionDoctor.getMcdId_str().trim();
											 String[]  arrayStr=intStr.split(","); 
											 
											  if(arrayStr.length>0){
												 sbuffer.append(" and ( ");
												 for(int i=0;i<arrayStr.length;i++){
													 String did=arrayStr[i];
													 if(i==arrayStr.length-1){
														 sbuffer.append("  mcdId="+did+"   "); 
													 }else {
													 sbuffer.append("  mcdId="+did+" or "); 
													 }
												 }
												 sbuffer.append(" ) "); 
											 }
											   
								 	}
						   		 //处理in条件 医生ID(doctorId)
							     if(att_AgCollectionDoctor.getDoctorId_str()!=null&&
						   		    !"".equals(att_AgCollectionDoctor.getDoctorId_str().trim())){ 
											 String  intStr=att_AgCollectionDoctor.getDoctorId_str().trim();
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
						   		 //处理in条件 用户账号ID(suiId)
							     if(att_AgCollectionDoctor.getSuiId_str()!=null&&
						   		    !"".equals(att_AgCollectionDoctor.getSuiId_str().trim())){ 
											 String  intStr=att_AgCollectionDoctor.getSuiId_str().trim();
											 String[]  arrayStr=intStr.split(","); 
											 
											  if(arrayStr.length>0){
												 sbuffer.append(" and ( ");
												 for(int i=0;i<arrayStr.length;i++){
													 String did=arrayStr[i];
													 if(i==arrayStr.length-1){
														 sbuffer.append("  suiId="+did+"   "); 
													 }else {
													 sbuffer.append("  suiId="+did+" or "); 
													 }
												 }
												 sbuffer.append(" ) "); 
											 }
											   
								 	}
			 //*****************无关字段处理end*****************
			 //*****************数据库字段处理begin*************
								  		//医生收藏ID(mcdId)
					 					if(att_AgCollectionDoctor.getMcdId()!=null){
											 sbuffer.append( " and mcdId=" +att_AgCollectionDoctor.getMcdId() );
										 }
								  		//医生ID(doctorId)
					 					if(att_AgCollectionDoctor.getDoctorId()!=null){
											 sbuffer.append( " and doctorId=" +att_AgCollectionDoctor.getDoctorId() );
										 }
								  		//用户账号ID(suiId)
					 					if(att_AgCollectionDoctor.getSuiId()!=null){
											 sbuffer.append( " and suiId=" +att_AgCollectionDoctor.getSuiId() );
										 }
			 //*****************数据库字段处理end***************
			  		if(orderStr!=null&&!"".equals(orderStr.trim())){
									 sbuffer.append( " order by "+orderStr);
						 }
						 /*
						 else {
							  sbuffer.append( " order by  McdId   desc " );
					      }
					      */
			 
			 return  sbuffer.toString();
	}
}