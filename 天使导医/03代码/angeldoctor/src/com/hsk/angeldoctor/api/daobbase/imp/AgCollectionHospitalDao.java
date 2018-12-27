package com.hsk.angeldoctor.api.daobbase.imp;

import java.util.*;
import com.hsk.supper.dto.comm.PagerModel;
import org.springframework.stereotype.*;
import com.hsk.exception.HSKDBException;
import com.hsk.supper.dao.imp.SupperDao;
import com.hsk.angeldoctor.api.daobbase.*;
import com.hsk.angeldoctor.api.persistence.*;

/** 
 * ag_collection_hospital表数据库层面操作实现类 
 * @author  作者:admin
 * @version  版本信息:v1.0   创建时间: 2018-08-14 13:27:59
 */
@Component
public class  AgCollectionHospitalDao extends SupperDao implements IAgCollectionHospitalDao {	

	/**
	 * 根据ag_collection_hospital表主键查找AgCollectionHospital对象记录
	 * 
	 * @param  MchId  Integer类型(ag_collection_hospital表主键)
	 * @return AgCollectionHospital ag_collection_hospital表记录
	 * @throws HSKDBException
	 */	
	public AgCollectionHospital findAgCollectionHospitalById(Integer MchId) throws HSKDBException{
				AgCollectionHospital  att_AgCollectionHospital=new AgCollectionHospital();				
				if(MchId!=null){
					att_AgCollectionHospital.setMchId(MchId);	
				    Object obj=	this.getOne(att_AgCollectionHospital);
					if(obj!=null){
						att_AgCollectionHospital=(AgCollectionHospital) obj;
					}
				}
				return  att_AgCollectionHospital;
	}
	 /**
	  * 根据ag_collection_hospital表主键删除AgCollectionHospital对象记录
	  * @param  MchId  Integer类型(ag_collection_hospital表主键)
	  * @throws HSKDBException
	  */
	public void deleteAgCollectionHospitalById(Integer MchId) throws HSKDBException{ 
		 AgCollectionHospital  att_AgCollectionHospital=new AgCollectionHospital();	
		  if(MchId!=null){
					  att_AgCollectionHospital.setMchId(MchId);
				  	  Object obj=	this.getOne(att_AgCollectionHospital);
					  if(obj!=null){
							this.deleteObject(obj); 
					  }
			}
	}

	/**
 	 * 根据ag_collection_hospital表主键修改AgCollectionHospital对象记录
     * @param  MchId  Integer类型(ag_collection_hospital表主键)
     * @param  att_AgCollectionHospital  AgCollectionHospital类型(ag_collection_hospital表记录)
     * @return AgCollectionHospital  修改后的AgCollectionHospital对象记录
	 * @throws HSKDBException
	 */
	public  AgCollectionHospital updateAgCollectionHospitalById(Integer MchId,AgCollectionHospital att_AgCollectionHospital) throws HSKDBException{
		  if(MchId!=null){
					att_AgCollectionHospital.setMchId(MchId);
				   	Object obj=	this.getOne(att_AgCollectionHospital);
					if(obj!=null){							 
							this.updateObject(obj);
					}
			}
			return  att_AgCollectionHospital;
	}
	
	/**
	 * 新增ag_collection_hospital表 记录
     * @param  att_AgCollectionHospital  AgCollectionHospital类型(ag_collection_hospital表记录)
	 * @throws HSKDBException
	 */
	public Integer saveAgCollectionHospital(AgCollectionHospital att_AgCollectionHospital) throws HSKDBException{
		 return this.newObject(att_AgCollectionHospital);
	} 
		
	/**
	 * 新增或修改ag_collection_hospital表记录 ,如果ag_collection_hospital表主键AgCollectionHospital.MchId为空就是添加，如果非空就是修改
     * @param  att_AgCollectionHospital  AgCollectionHospital类型(ag_collection_hospital表记录)
	 * @throws HSKDBException
	 */
	public  AgCollectionHospital saveOrUpdateAgCollectionHospital(AgCollectionHospital att_AgCollectionHospital) throws HSKDBException{
		  this.getHibernateTemplate().saveOrUpdate(att_AgCollectionHospital);
		  return att_AgCollectionHospital;
	}
	
	/**
	 *根据AgCollectionHospital对象作为对(ag_collection_hospital表进行查询，获取列表对象
     * @param  att_AgCollectionHospital  AgCollectionHospital类型(ag_collection_hospital表记录)
     * @return List<AgCollectionHospital>  列表对象
	 * @throws HSKDBException 
	 */
	 @SuppressWarnings("unchecked")
	public List<AgCollectionHospital> getListByAgCollectionHospital(AgCollectionHospital att_AgCollectionHospital) throws HSKDBException{
		String Hql=this.getHql( att_AgCollectionHospital); 
		List<AgCollectionHospital> list=this.getHibernateTemplate().find(Hql);
		return  list;
	}
	/**
	 *根据AgCollectionHospital对象作为对(ag_collection_hospital表进行查询，获取分页对象
     * @param  att_AgCollectionHospital  AgCollectionHospital类型(ag_collection_hospital表记录)
     * @return List<AgCollectionHospital>  分页对象
	 * @throws HSKDBException 
	 */
	public PagerModel getPagerModelByAgCollectionHospital(AgCollectionHospital att_AgCollectionHospital)
			throws HSKDBException {
		String Hql=this.getHql(att_AgCollectionHospital);
		return this.getHibernateDao().findByPage(Hql); 
	} 
	/**
	 * 根据AgCollectionHospital对象获取Hql字符串
     * @param  att_AgCollectionHospital  AgCollectionHospital类型(ag_collection_hospital表记录)
	 *  @return hql字符串
	 */
	private String  getHql(AgCollectionHospital att_AgCollectionHospital){
			 StringBuffer sbuffer = new StringBuffer( " from  AgCollectionHospital  where  1=1  ");
			 String likeStr=  att_AgCollectionHospital.getTab_like();
			 String orderStr= att_AgCollectionHospital.getTab_order();
			 
			 //*****************无关字段处理begin*****************
						   		 //处理in条件 医院收藏ID(mchId)
							     if(att_AgCollectionHospital.getMchId_str()!=null&&
						   		    !"".equals(att_AgCollectionHospital.getMchId_str().trim())){ 
											 String  intStr=att_AgCollectionHospital.getMchId_str().trim();
											 String[]  arrayStr=intStr.split(","); 
											 
											  if(arrayStr.length>0){
												 sbuffer.append(" and ( ");
												 for(int i=0;i<arrayStr.length;i++){
													 String did=arrayStr[i];
													 if(i==arrayStr.length-1){
														 sbuffer.append("  mchId="+did+"   "); 
													 }else {
													 sbuffer.append("  mchId="+did+" or "); 
													 }
												 }
												 sbuffer.append(" ) "); 
											 }
											   
								 	}
						   		 //处理in条件 医院ID(organizationId)
							     if(att_AgCollectionHospital.getOrganizationId_str()!=null&&
						   		    !"".equals(att_AgCollectionHospital.getOrganizationId_str().trim())){ 
											 String  intStr=att_AgCollectionHospital.getOrganizationId_str().trim();
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
						   		 //处理in条件 用户账号ID(suiId)
							     if(att_AgCollectionHospital.getSuiId_str()!=null&&
						   		    !"".equals(att_AgCollectionHospital.getSuiId_str().trim())){ 
											 String  intStr=att_AgCollectionHospital.getSuiId_str().trim();
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
								  		//医院收藏ID(mchId)
					 					if(att_AgCollectionHospital.getMchId()!=null){
											 sbuffer.append( " and mchId=" +att_AgCollectionHospital.getMchId() );
										 }
								  		//医院ID(organizationId)
					 					if(att_AgCollectionHospital.getOrganizationId()!=null){
											 sbuffer.append( " and organizationId=" +att_AgCollectionHospital.getOrganizationId() );
										 }
								  		//用户账号ID(suiId)
					 					if(att_AgCollectionHospital.getSuiId()!=null){
											 sbuffer.append( " and suiId=" +att_AgCollectionHospital.getSuiId() );
										 }
			 //*****************数据库字段处理end***************
			  		if(orderStr!=null&&!"".equals(orderStr.trim())){
									 sbuffer.append( " order by "+orderStr);
						 }
						 /*
						 else {
							  sbuffer.append( " order by  MchId   desc " );
					      }
					      */
			 
			 return  sbuffer.toString();
	}
}