package com.hsk.angeldoctor.api.daobbase.imp;

import java.util.*;
import com.hsk.supper.dto.comm.PagerModel;
import org.springframework.stereotype.*;
import com.hsk.exception.HSKDBException;
import com.hsk.supper.dao.imp.SupperDao;
import com.hsk.angeldoctor.api.daobbase.*;
import com.hsk.angeldoctor.api.persistence.*;

/** 
 * ag_news_info表数据库层面操作实现类 
 * @author  作者:admin
 * @version  版本信息:v1.0   创建时间: 2018-08-14 13:40:22
 */
@Component
public class  AgNewsInfoDao extends SupperDao implements IAgNewsInfoDao {	

	/**
	 * 根据ag_news_info表主键查找AgNewsInfo对象记录
	 * 
	 * @param  AniId  Integer类型(ag_news_info表主键)
	 * @return AgNewsInfo ag_news_info表记录
	 * @throws HSKDBException
	 */	
	public AgNewsInfo findAgNewsInfoById(Integer AniId) throws HSKDBException{
				AgNewsInfo  att_AgNewsInfo=new AgNewsInfo();				
				if(AniId!=null){
					att_AgNewsInfo.setAniId(AniId);	
				    Object obj=	this.getOne(att_AgNewsInfo);
					if(obj!=null){
						att_AgNewsInfo=(AgNewsInfo) obj;
					}
				}
				return  att_AgNewsInfo;
	}
	 /**
	  * 根据ag_news_info表主键删除AgNewsInfo对象记录
	  * @param  AniId  Integer类型(ag_news_info表主键)
	  * @throws HSKDBException
	  */
	public void deleteAgNewsInfoById(Integer AniId) throws HSKDBException{ 
		 AgNewsInfo  att_AgNewsInfo=new AgNewsInfo();	
		  if(AniId!=null){
					  att_AgNewsInfo.setAniId(AniId);
				  	  Object obj=	this.getOne(att_AgNewsInfo);
					  if(obj!=null){
							this.deleteObject(obj); 
					  }
			}
	}

	/**
 	 * 根据ag_news_info表主键修改AgNewsInfo对象记录
     * @param  AniId  Integer类型(ag_news_info表主键)
     * @param  att_AgNewsInfo  AgNewsInfo类型(ag_news_info表记录)
     * @return AgNewsInfo  修改后的AgNewsInfo对象记录
	 * @throws HSKDBException
	 */
	public  AgNewsInfo updateAgNewsInfoById(Integer AniId,AgNewsInfo att_AgNewsInfo) throws HSKDBException{
		  if(AniId!=null){
					att_AgNewsInfo.setAniId(AniId);
				   	Object obj=	this.getOne(att_AgNewsInfo);
					if(obj!=null){							 
							this.updateObject(obj);
					}
			}
			return  att_AgNewsInfo;
	}
	
	/**
	 * 新增ag_news_info表 记录
     * @param  att_AgNewsInfo  AgNewsInfo类型(ag_news_info表记录)
	 * @throws HSKDBException
	 */
	public Integer saveAgNewsInfo(AgNewsInfo att_AgNewsInfo) throws HSKDBException{
		 return this.newObject(att_AgNewsInfo);
	} 
		
	/**
	 * 新增或修改ag_news_info表记录 ,如果ag_news_info表主键AgNewsInfo.AniId为空就是添加，如果非空就是修改
     * @param  att_AgNewsInfo  AgNewsInfo类型(ag_news_info表记录)
	 * @throws HSKDBException
	 */
	public  AgNewsInfo saveOrUpdateAgNewsInfo(AgNewsInfo att_AgNewsInfo) throws HSKDBException{
		  this.getHibernateTemplate().saveOrUpdate(att_AgNewsInfo);
		  return att_AgNewsInfo;
	}
	
	/**
	 *根据AgNewsInfo对象作为对(ag_news_info表进行查询，获取列表对象
     * @param  att_AgNewsInfo  AgNewsInfo类型(ag_news_info表记录)
     * @return List<AgNewsInfo>  列表对象
	 * @throws HSKDBException 
	 */
	 @SuppressWarnings("unchecked")
	public List<AgNewsInfo> getListByAgNewsInfo(AgNewsInfo att_AgNewsInfo) throws HSKDBException{
		String Hql=this.getHql( att_AgNewsInfo); 
		List<AgNewsInfo> list=this.getHibernateTemplate().find(Hql);
		return  list;
	}
	/**
	 *根据AgNewsInfo对象作为对(ag_news_info表进行查询，获取分页对象
     * @param  att_AgNewsInfo  AgNewsInfo类型(ag_news_info表记录)
     * @return List<AgNewsInfo>  分页对象
	 * @throws HSKDBException 
	 */
	public PagerModel getPagerModelByAgNewsInfo(AgNewsInfo att_AgNewsInfo)
			throws HSKDBException {
		String Hql=this.getHql(att_AgNewsInfo);
		return this.getHibernateDao().findByPage(Hql); 
	} 
	/**
	 * 根据AgNewsInfo对象获取Hql字符串
     * @param  att_AgNewsInfo  AgNewsInfo类型(ag_news_info表记录)
	 *  @return hql字符串
	 */
	private String  getHql(AgNewsInfo att_AgNewsInfo){
			 StringBuffer sbuffer = new StringBuffer( " from  AgNewsInfo  where  1=1  ");
			 String likeStr=  att_AgNewsInfo.getTab_like();
			 String orderStr= att_AgNewsInfo.getTab_order();
			 
			 //*****************无关字段处理begin*****************
						   		 //处理in条件 消息ID(aniId)
							     if(att_AgNewsInfo.getAniId_str()!=null&&
						   		    !"".equals(att_AgNewsInfo.getAniId_str().trim())){ 
											 String  intStr=att_AgNewsInfo.getAniId_str().trim();
											 String[]  arrayStr=intStr.split(","); 
											 
											  if(arrayStr.length>0){
												 sbuffer.append(" and ( ");
												 for(int i=0;i<arrayStr.length;i++){
													 String did=arrayStr[i];
													 if(i==arrayStr.length-1){
														 sbuffer.append("  aniId="+did+"   "); 
													 }else {
													 sbuffer.append("  aniId="+did+" or "); 
													 }
												 }
												 sbuffer.append(" ) "); 
											 }
											   
								 	}
								 		//时间类型开始条件处理  创建时间(createDate)
									  if(att_AgNewsInfo.getCreateDate_start()!=null){
								   	    	sbuffer.append( " and  createDate<='" +att_AgNewsInfo.getCreateDate_start()+"'" );  
										 }
								 	  //时间类型结束条件处理 创建时间(createDate)
									 	if(att_AgNewsInfo.getCreateDate_end()!=null){
						   	      			sbuffer.append( " and  createDate>'" +att_AgNewsInfo.getCreateDate_end()+"'" );  
								  	     } 
						   		 //处理in条件 创建人ID(portalUserId)
							     if(att_AgNewsInfo.getPortalUserId_str()!=null&&
						   		    !"".equals(att_AgNewsInfo.getPortalUserId_str().trim())){ 
											 String  intStr=att_AgNewsInfo.getPortalUserId_str().trim();
											 String[]  arrayStr=intStr.split(","); 
											 
											  if(arrayStr.length>0){
												 sbuffer.append(" and ( ");
												 for(int i=0;i<arrayStr.length;i++){
													 String did=arrayStr[i];
													 if(i==arrayStr.length-1){
														 sbuffer.append("  portalUserId="+did+"   "); 
													 }else {
													 sbuffer.append("  portalUserId="+did+" or "); 
													 }
												 }
												 sbuffer.append(" ) "); 
											 }
											   
								 	}
			 //*****************无关字段处理end*****************
			 //*****************数据库字段处理begin*************
								  		//消息ID(aniId)
					 					if(att_AgNewsInfo.getAniId()!=null){
											 sbuffer.append( " and aniId=" +att_AgNewsInfo.getAniId() );
										 }
					       				//标题(title)		 					 
									 if(att_AgNewsInfo.getTitle()!=null&&
									  !"".equals(att_AgNewsInfo.getTitle().trim())){
										  if(likeStr!=null&&!"".equals(likeStr.trim())&&likeStr.indexOf("title")!=-1){
											  sbuffer.append( " and title  like '%"+att_AgNewsInfo.getTitle()+"%'"   );
										  }else {
											  sbuffer.append( " and title   ='"+att_AgNewsInfo.getTitle()+"'"   );
										  }
									 }
					       				//内容(body)		 					 
									 if(att_AgNewsInfo.getBody()!=null&&
									  !"".equals(att_AgNewsInfo.getBody().trim())){
										  if(likeStr!=null&&!"".equals(likeStr.trim())&&likeStr.indexOf("body")!=-1){
											  sbuffer.append( " and body  like '%"+att_AgNewsInfo.getBody()+"%'"   );
										  }else {
											  sbuffer.append( " and body   ='"+att_AgNewsInfo.getBody()+"'"   );
										  }
									 }
					       				//状态:1正常，2禁用(status)		 					 
									 if(att_AgNewsInfo.getStatus()!=null&&
									  !"".equals(att_AgNewsInfo.getStatus().trim())){
										  if(likeStr!=null&&!"".equals(likeStr.trim())&&likeStr.indexOf("status")!=-1){
											  sbuffer.append( " and status  like '%"+att_AgNewsInfo.getStatus()+"%'"   );
										  }else {
											  sbuffer.append( " and status   ='"+att_AgNewsInfo.getStatus()+"'"   );
										  }
									 }
						   				//创建时间(createDate)
						 				if(att_AgNewsInfo.getCreateDate()!=null){
						   	                   sbuffer.append( " and  createDate='" +att_AgNewsInfo.getCreateDate()+"'" );  
								  		}
								  		//创建人ID(portalUserId)
					 					if(att_AgNewsInfo.getPortalUserId()!=null){
											 sbuffer.append( " and portalUserId=" +att_AgNewsInfo.getPortalUserId() );
										 }
			 //*****************数据库字段处理end***************
			  		if(orderStr!=null&&!"".equals(orderStr.trim())){
									 sbuffer.append( " order by "+orderStr);
						 }
						 /*
						 else {
							  sbuffer.append( " order by  AniId   desc " );
					      }
					      */
			 
			 return  sbuffer.toString();
	}
}