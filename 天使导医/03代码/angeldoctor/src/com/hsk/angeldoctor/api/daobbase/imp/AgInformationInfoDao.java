package com.hsk.angeldoctor.api.daobbase.imp;

import java.util.*;
import com.hsk.supper.dto.comm.PagerModel;
import org.springframework.stereotype.*;
import com.hsk.exception.HSKDBException;
import com.hsk.supper.dao.imp.SupperDao;
import com.hsk.angeldoctor.api.daobbase.*;
import com.hsk.angeldoctor.api.persistence.*;

/** 
 * ag_information_info表数据库层面操作实现类 
 * @author  作者:admin
 * @version  版本信息:v1.0   创建时间: 2018-08-14 13:40:21
 */
@Component
public class  AgInformationInfoDao extends SupperDao implements IAgInformationInfoDao {	

	/**
	 * 根据ag_information_info表主键查找AgInformationInfo对象记录
	 * 
	 * @param  AiiId  Integer类型(ag_information_info表主键)
	 * @return AgInformationInfo ag_information_info表记录
	 * @throws HSKDBException
	 */	
	public AgInformationInfo findAgInformationInfoById(Integer AiiId) throws HSKDBException{
				AgInformationInfo  att_AgInformationInfo=new AgInformationInfo();				
				if(AiiId!=null){
					att_AgInformationInfo.setAiiId(AiiId);	
				    Object obj=	this.getOne(att_AgInformationInfo);
					if(obj!=null){
						att_AgInformationInfo=(AgInformationInfo) obj;
					}
				}
				return  att_AgInformationInfo;
	}
	 /**
	  * 根据ag_information_info表主键删除AgInformationInfo对象记录
	  * @param  AiiId  Integer类型(ag_information_info表主键)
	  * @throws HSKDBException
	  */
	public void deleteAgInformationInfoById(Integer AiiId) throws HSKDBException{ 
		 AgInformationInfo  att_AgInformationInfo=new AgInformationInfo();	
		  if(AiiId!=null){
					  att_AgInformationInfo.setAiiId(AiiId);
				  	  Object obj=	this.getOne(att_AgInformationInfo);
					  if(obj!=null){
							this.deleteObject(obj); 
					  }
			}
	}

	/**
 	 * 根据ag_information_info表主键修改AgInformationInfo对象记录
     * @param  AiiId  Integer类型(ag_information_info表主键)
     * @param  att_AgInformationInfo  AgInformationInfo类型(ag_information_info表记录)
     * @return AgInformationInfo  修改后的AgInformationInfo对象记录
	 * @throws HSKDBException
	 */
	public  AgInformationInfo updateAgInformationInfoById(Integer AiiId,AgInformationInfo att_AgInformationInfo) throws HSKDBException{
		  if(AiiId!=null){
					att_AgInformationInfo.setAiiId(AiiId);
				   	Object obj=	this.getOne(att_AgInformationInfo);
					if(obj!=null){							 
							this.updateObject(obj);
					}
			}
			return  att_AgInformationInfo;
	}
	
	/**
	 * 新增ag_information_info表 记录
     * @param  att_AgInformationInfo  AgInformationInfo类型(ag_information_info表记录)
	 * @throws HSKDBException
	 */
	public Integer saveAgInformationInfo(AgInformationInfo att_AgInformationInfo) throws HSKDBException{
		 return this.newObject(att_AgInformationInfo);
	} 
		
	/**
	 * 新增或修改ag_information_info表记录 ,如果ag_information_info表主键AgInformationInfo.AiiId为空就是添加，如果非空就是修改
     * @param  att_AgInformationInfo  AgInformationInfo类型(ag_information_info表记录)
	 * @throws HSKDBException
	 */
	public  AgInformationInfo saveOrUpdateAgInformationInfo(AgInformationInfo att_AgInformationInfo) throws HSKDBException{
		  this.getHibernateTemplate().saveOrUpdate(att_AgInformationInfo);
		  return att_AgInformationInfo;
	}
	
	/**
	 *根据AgInformationInfo对象作为对(ag_information_info表进行查询，获取列表对象
     * @param  att_AgInformationInfo  AgInformationInfo类型(ag_information_info表记录)
     * @return List<AgInformationInfo>  列表对象
	 * @throws HSKDBException 
	 */
	 @SuppressWarnings("unchecked")
	public List<AgInformationInfo> getListByAgInformationInfo(AgInformationInfo att_AgInformationInfo) throws HSKDBException{
		String Hql=this.getHql( att_AgInformationInfo); 
		List<AgInformationInfo> list=this.getHibernateTemplate().find(Hql);
		return  list;
	}
	/**
	 *根据AgInformationInfo对象作为对(ag_information_info表进行查询，获取分页对象
     * @param  att_AgInformationInfo  AgInformationInfo类型(ag_information_info表记录)
     * @return List<AgInformationInfo>  分页对象
	 * @throws HSKDBException 
	 */
	public PagerModel getPagerModelByAgInformationInfo(AgInformationInfo att_AgInformationInfo)
			throws HSKDBException {
		String Hql=this.getHql(att_AgInformationInfo);
		return this.getHibernateDao().findByPage(Hql); 
	} 
	/**
	 * 根据AgInformationInfo对象获取Hql字符串
     * @param  att_AgInformationInfo  AgInformationInfo类型(ag_information_info表记录)
	 *  @return hql字符串
	 */
	private String  getHql(AgInformationInfo att_AgInformationInfo){
			 StringBuffer sbuffer = new StringBuffer( " from  AgInformationInfo  where  1=1  ");
			 String likeStr=  att_AgInformationInfo.getTab_like();
			 String orderStr= att_AgInformationInfo.getTab_order();
			 
			 //*****************无关字段处理begin*****************
						   		 //处理in条件 咨询ID(aiiId)
							     if(att_AgInformationInfo.getAiiId_str()!=null&&
						   		    !"".equals(att_AgInformationInfo.getAiiId_str().trim())){ 
											 String  intStr=att_AgInformationInfo.getAiiId_str().trim();
											 String[]  arrayStr=intStr.split(","); 
											 
											  if(arrayStr.length>0){
												 sbuffer.append(" and ( ");
												 for(int i=0;i<arrayStr.length;i++){
													 String did=arrayStr[i];
													 if(i==arrayStr.length-1){
														 sbuffer.append("  aiiId="+did+"   "); 
													 }else {
													 sbuffer.append("  aiiId="+did+" or "); 
													 }
												 }
												 sbuffer.append(" ) "); 
											 }
											   
								 	}
								 		//时间类型开始条件处理  bannerStartDate(bannerStartDate)
									  if(att_AgInformationInfo.getBannerStartDate_start()!=null){
								   	    	sbuffer.append( " and  bannerStartDate<='" +att_AgInformationInfo.getBannerStartDate_start()+"'" );  
										 }
								 	  //时间类型结束条件处理 bannerStartDate(bannerStartDate)
									 	if(att_AgInformationInfo.getBannerStartDate_end()!=null){
						   	      			sbuffer.append( " and  bannerStartDate>'" +att_AgInformationInfo.getBannerStartDate_end()+"'" );  
								  	     } 
								 		//时间类型开始条件处理  banner结束时间(bannerEndDate)
									  if(att_AgInformationInfo.getBannerEndDate_start()!=null){
								   	    	sbuffer.append( " and  bannerEndDate<='" +att_AgInformationInfo.getBannerEndDate_start()+"'" );  
										 }
								 	  //时间类型结束条件处理 banner结束时间(bannerEndDate)
									 	if(att_AgInformationInfo.getBannerEndDate_end()!=null){
						   	      			sbuffer.append( " and  bannerEndDate>'" +att_AgInformationInfo.getBannerEndDate_end()+"'" );  
								  	     } 
						   		 //处理in条件 访问次数(pageRead)
							     if(att_AgInformationInfo.getPageRead_str()!=null&&
						   		    !"".equals(att_AgInformationInfo.getPageRead_str().trim())){ 
											 String  intStr=att_AgInformationInfo.getPageRead_str().trim();
											 String[]  arrayStr=intStr.split(","); 
											 
											  if(arrayStr.length>0){
												 sbuffer.append(" and ( ");
												 for(int i=0;i<arrayStr.length;i++){
													 String did=arrayStr[i];
													 if(i==arrayStr.length-1){
														 sbuffer.append("  pageRead="+did+"   "); 
													 }else {
													 sbuffer.append("  pageRead="+did+" or "); 
													 }
												 }
												 sbuffer.append(" ) "); 
											 }
											   
								 	}
								 		//时间类型开始条件处理  创建时间(createDate)
									  if(att_AgInformationInfo.getCreateDate_start()!=null){
								   	    	sbuffer.append( " and  createDate<='" +att_AgInformationInfo.getCreateDate_start()+"'" );  
										 }
								 	  //时间类型结束条件处理 创建时间(createDate)
									 	if(att_AgInformationInfo.getCreateDate_end()!=null){
						   	      			sbuffer.append( " and  createDate>'" +att_AgInformationInfo.getCreateDate_end()+"'" );  
								  	     } 
						   		 //处理in条件 创建人ID(creatorId)
							     if(att_AgInformationInfo.getCreatorId_str()!=null&&
						   		    !"".equals(att_AgInformationInfo.getCreatorId_str().trim())){ 
											 String  intStr=att_AgInformationInfo.getCreatorId_str().trim();
											 String[]  arrayStr=intStr.split(","); 
											 
											  if(arrayStr.length>0){
												 sbuffer.append(" and ( ");
												 for(int i=0;i<arrayStr.length;i++){
													 String did=arrayStr[i];
													 if(i==arrayStr.length-1){
														 sbuffer.append("  creatorId="+did+"   "); 
													 }else {
													 sbuffer.append("  creatorId="+did+" or "); 
													 }
												 }
												 sbuffer.append(" ) "); 
											 }
											   
								 	}
			 //*****************无关字段处理end*****************
			 //*****************数据库字段处理begin*************
								  		//咨询ID(aiiId)
					 					if(att_AgInformationInfo.getAiiId()!=null){
											 sbuffer.append( " and aiiId=" +att_AgInformationInfo.getAiiId() );
										 }
					       				//类型(type)		 					 
									 if(att_AgInformationInfo.getType()!=null&&
									  !"".equals(att_AgInformationInfo.getType().trim())){
										  if(likeStr!=null&&!"".equals(likeStr.trim())&&likeStr.indexOf("type")!=-1){
											  sbuffer.append( " and type  like '%"+att_AgInformationInfo.getType()+"%'"   );
										  }else {
											  sbuffer.append( " and type   ='"+att_AgInformationInfo.getType()+"'"   );
										  }
									 }
					       				//省(provId)		 					 
									 if(att_AgInformationInfo.getProvId()!=null&&
									  !"".equals(att_AgInformationInfo.getProvId().trim())){
										  if(likeStr!=null&&!"".equals(likeStr.trim())&&likeStr.indexOf("provId")!=-1){
											  sbuffer.append( " and provId  like '%"+att_AgInformationInfo.getProvId()+"%'"   );
										  }else {
											  sbuffer.append( " and provId   ='"+att_AgInformationInfo.getProvId()+"'"   );
										  }
									 }
					       				//市(cityId)		 					 
									 if(att_AgInformationInfo.getCityId()!=null&&
									  !"".equals(att_AgInformationInfo.getCityId().trim())){
										  if(likeStr!=null&&!"".equals(likeStr.trim())&&likeStr.indexOf("cityId")!=-1){
											  sbuffer.append( " and cityId  like '%"+att_AgInformationInfo.getCityId()+"%'"   );
										  }else {
											  sbuffer.append( " and cityId   ='"+att_AgInformationInfo.getCityId()+"'"   );
										  }
									 }
					       				//标题(title)		 					 
									 if(att_AgInformationInfo.getTitle()!=null&&
									  !"".equals(att_AgInformationInfo.getTitle().trim())){
										  if(likeStr!=null&&!"".equals(likeStr.trim())&&likeStr.indexOf("title")!=-1){
											  sbuffer.append( " and title  like '%"+att_AgInformationInfo.getTitle()+"%'"   );
										  }else {
											  sbuffer.append( " and title   ='"+att_AgInformationInfo.getTitle()+"'"   );
										  }
									 }
					       				//作者(author)		 					 
									 if(att_AgInformationInfo.getAuthor()!=null&&
									  !"".equals(att_AgInformationInfo.getAuthor().trim())){
										  if(likeStr!=null&&!"".equals(likeStr.trim())&&likeStr.indexOf("author")!=-1){
											  sbuffer.append( " and author  like '%"+att_AgInformationInfo.getAuthor()+"%'"   );
										  }else {
											  sbuffer.append( " and author   ='"+att_AgInformationInfo.getAuthor()+"'"   );
										  }
									 }
					       				//图标(icon)		 					 
									 if(att_AgInformationInfo.getIcon()!=null&&
									  !"".equals(att_AgInformationInfo.getIcon().trim())){
										  if(likeStr!=null&&!"".equals(likeStr.trim())&&likeStr.indexOf("icon")!=-1){
											  sbuffer.append( " and icon  like '%"+att_AgInformationInfo.getIcon()+"%'"   );
										  }else {
											  sbuffer.append( " and icon   ='"+att_AgInformationInfo.getIcon()+"'"   );
										  }
									 }
					       				//摘要(digest)		 					 
									 if(att_AgInformationInfo.getDigest()!=null&&
									  !"".equals(att_AgInformationInfo.getDigest().trim())){
										  if(likeStr!=null&&!"".equals(likeStr.trim())&&likeStr.indexOf("digest")!=-1){
											  sbuffer.append( " and digest  like '%"+att_AgInformationInfo.getDigest()+"%'"   );
										  }else {
											  sbuffer.append( " and digest   ='"+att_AgInformationInfo.getDigest()+"'"   );
										  }
									 }
					       				//内容(content)		 					 
									 if(att_AgInformationInfo.getContent()!=null&&
									  !"".equals(att_AgInformationInfo.getContent().trim())){
										  if(likeStr!=null&&!"".equals(likeStr.trim())&&likeStr.indexOf("content")!=-1){
											  sbuffer.append( " and content  like '%"+att_AgInformationInfo.getContent()+"%'"   );
										  }else {
											  sbuffer.append( " and content   ='"+att_AgInformationInfo.getContent()+"'"   );
										  }
									 }
					       				//是否设置为Banner(isBanner)		 					 
									 if(att_AgInformationInfo.getIsBanner()!=null&&
									  !"".equals(att_AgInformationInfo.getIsBanner().trim())){
										  if(likeStr!=null&&!"".equals(likeStr.trim())&&likeStr.indexOf("isBanner")!=-1){
											  sbuffer.append( " and isBanner  like '%"+att_AgInformationInfo.getIsBanner()+"%'"   );
										  }else {
											  sbuffer.append( " and isBanner   ='"+att_AgInformationInfo.getIsBanner()+"'"   );
										  }
									 }
					       				//bannerIconbanner图标(bannerIcon)		 					 
									 if(att_AgInformationInfo.getBannerIcon()!=null&&
									  !"".equals(att_AgInformationInfo.getBannerIcon().trim())){
										  if(likeStr!=null&&!"".equals(likeStr.trim())&&likeStr.indexOf("bannerIcon")!=-1){
											  sbuffer.append( " and bannerIcon  like '%"+att_AgInformationInfo.getBannerIcon()+"%'"   );
										  }else {
											  sbuffer.append( " and bannerIcon   ='"+att_AgInformationInfo.getBannerIcon()+"'"   );
										  }
									 }
						   				//bannerStartDate(bannerStartDate)
						 				if(att_AgInformationInfo.getBannerStartDate()!=null){
						   	                   sbuffer.append( " and  bannerStartDate='" +att_AgInformationInfo.getBannerStartDate()+"'" );  
								  		}
						   				//banner结束时间(bannerEndDate)
						 				if(att_AgInformationInfo.getBannerEndDate()!=null){
						   	                   sbuffer.append( " and  bannerEndDate='" +att_AgInformationInfo.getBannerEndDate()+"'" );  
								  		}
								  		//访问次数(pageRead)
					 					if(att_AgInformationInfo.getPageRead()!=null){
											 sbuffer.append( " and pageRead=" +att_AgInformationInfo.getPageRead() );
										 }
					       				//状态:1正常，2禁用(status)		 					 
									 if(att_AgInformationInfo.getStatus()!=null&&
									  !"".equals(att_AgInformationInfo.getStatus().trim())){
										  if(likeStr!=null&&!"".equals(likeStr.trim())&&likeStr.indexOf("status")!=-1){
											  sbuffer.append( " and status  like '%"+att_AgInformationInfo.getStatus()+"%'"   );
										  }else {
											  sbuffer.append( " and status   ='"+att_AgInformationInfo.getStatus()+"'"   );
										  }
									 }
					       				//创建人(creatorName)		 					 
									 if(att_AgInformationInfo.getCreatorName()!=null&&
									  !"".equals(att_AgInformationInfo.getCreatorName().trim())){
										  if(likeStr!=null&&!"".equals(likeStr.trim())&&likeStr.indexOf("creatorName")!=-1){
											  sbuffer.append( " and creatorName  like '%"+att_AgInformationInfo.getCreatorName()+"%'"   );
										  }else {
											  sbuffer.append( " and creatorName   ='"+att_AgInformationInfo.getCreatorName()+"'"   );
										  }
									 }
						   				//创建时间(createDate)
						 				if(att_AgInformationInfo.getCreateDate()!=null){
						   	                   sbuffer.append( " and  createDate='" +att_AgInformationInfo.getCreateDate()+"'" );  
								  		}
								  		//创建人ID(creatorId)
					 					if(att_AgInformationInfo.getCreatorId()!=null){
											 sbuffer.append( " and creatorId=" +att_AgInformationInfo.getCreatorId() );
										 }
			 //*****************数据库字段处理end***************
			  		if(orderStr!=null&&!"".equals(orderStr.trim())){
									 sbuffer.append( " order by "+orderStr);
						 }
						 /*
						 else {
							  sbuffer.append( " order by  AiiId   desc " );
					      }
					      */
			 
			 return  sbuffer.toString();
	}
}