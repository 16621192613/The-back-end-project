package com.hsk.angeldoctor.api.daobbase.imp;

import java.util.*;
import com.hsk.supper.dto.comm.PagerModel;
import org.springframework.stereotype.*;
import com.hsk.exception.HSKDBException;
import com.hsk.supper.dao.imp.SupperDao;
import com.hsk.angeldoctor.api.daobbase.*;
import com.hsk.angeldoctor.api.persistence.*;

/** 
 * ag_wechat_info表数据库层面操作实现类 
 * @author  作者:admin
 * @version  版本信息:v1.0   创建时间: 2018-08-14 13:35:37
 */
@Component
public class  AgWechatInfoDao extends SupperDao implements IAgWechatInfoDao {	

	/**
	 * 根据ag_wechat_info表主键查找AgWechatInfo对象记录
	 * 
	 * @param  WechatUserId  Integer类型(ag_wechat_info表主键)
	 * @return AgWechatInfo ag_wechat_info表记录
	 * @throws HSKDBException
	 */	
	public AgWechatInfo findAgWechatInfoById(Integer WechatUserId) throws HSKDBException{
				AgWechatInfo  att_AgWechatInfo=new AgWechatInfo();				
				if(WechatUserId!=null){
					att_AgWechatInfo.setWechatUserId(WechatUserId);	
				    Object obj=	this.getOne(att_AgWechatInfo);
					if(obj!=null){
						att_AgWechatInfo=(AgWechatInfo) obj;
					}
				}
				return  att_AgWechatInfo;
	}
	 /**
	  * 根据ag_wechat_info表主键删除AgWechatInfo对象记录
	  * @param  WechatUserId  Integer类型(ag_wechat_info表主键)
	  * @throws HSKDBException
	  */
	public void deleteAgWechatInfoById(Integer WechatUserId) throws HSKDBException{ 
		 AgWechatInfo  att_AgWechatInfo=new AgWechatInfo();	
		  if(WechatUserId!=null){
					  att_AgWechatInfo.setWechatUserId(WechatUserId);
				  	  Object obj=	this.getOne(att_AgWechatInfo);
					  if(obj!=null){
							this.deleteObject(obj); 
					  }
			}
	}

	/**
 	 * 根据ag_wechat_info表主键修改AgWechatInfo对象记录
     * @param  WechatUserId  Integer类型(ag_wechat_info表主键)
     * @param  att_AgWechatInfo  AgWechatInfo类型(ag_wechat_info表记录)
     * @return AgWechatInfo  修改后的AgWechatInfo对象记录
	 * @throws HSKDBException
	 */
	public  AgWechatInfo updateAgWechatInfoById(Integer WechatUserId,AgWechatInfo att_AgWechatInfo) throws HSKDBException{
		  if(WechatUserId!=null){
					att_AgWechatInfo.setWechatUserId(WechatUserId);
				   	Object obj=	this.getOne(att_AgWechatInfo);
					if(obj!=null){							 
							this.updateObject(obj);
					}
			}
			return  att_AgWechatInfo;
	}
	
	/**
	 * 新增ag_wechat_info表 记录
     * @param  att_AgWechatInfo  AgWechatInfo类型(ag_wechat_info表记录)
	 * @throws HSKDBException
	 */
	public Integer saveAgWechatInfo(AgWechatInfo att_AgWechatInfo) throws HSKDBException{
		 return this.newObject(att_AgWechatInfo);
	} 
		
	/**
	 * 新增或修改ag_wechat_info表记录 ,如果ag_wechat_info表主键AgWechatInfo.WechatUserId为空就是添加，如果非空就是修改
     * @param  att_AgWechatInfo  AgWechatInfo类型(ag_wechat_info表记录)
	 * @throws HSKDBException
	 */
	public  AgWechatInfo saveOrUpdateAgWechatInfo(AgWechatInfo att_AgWechatInfo) throws HSKDBException{
		  this.getHibernateTemplate().saveOrUpdate(att_AgWechatInfo);
		  return att_AgWechatInfo;
	}
	
	/**
	 *根据AgWechatInfo对象作为对(ag_wechat_info表进行查询，获取列表对象
     * @param  att_AgWechatInfo  AgWechatInfo类型(ag_wechat_info表记录)
     * @return List<AgWechatInfo>  列表对象
	 * @throws HSKDBException 
	 */
	 @SuppressWarnings("unchecked")
	public List<AgWechatInfo> getListByAgWechatInfo(AgWechatInfo att_AgWechatInfo) throws HSKDBException{
		String Hql=this.getHql( att_AgWechatInfo); 
		List<AgWechatInfo> list=this.getHibernateTemplate().find(Hql);
		return  list;
	}
	/**
	 *根据AgWechatInfo对象作为对(ag_wechat_info表进行查询，获取分页对象
     * @param  att_AgWechatInfo  AgWechatInfo类型(ag_wechat_info表记录)
     * @return List<AgWechatInfo>  分页对象
	 * @throws HSKDBException 
	 */
	public PagerModel getPagerModelByAgWechatInfo(AgWechatInfo att_AgWechatInfo)
			throws HSKDBException {
		String Hql=this.getHql(att_AgWechatInfo);
		return this.getHibernateDao().findByPage(Hql); 
	} 
	/**
	 * 根据AgWechatInfo对象获取Hql字符串
     * @param  att_AgWechatInfo  AgWechatInfo类型(ag_wechat_info表记录)
	 *  @return hql字符串
	 */
	private String  getHql(AgWechatInfo att_AgWechatInfo){
			 StringBuffer sbuffer = new StringBuffer( " from  AgWechatInfo  where  1=1  ");
			 String likeStr=  att_AgWechatInfo.getTab_like();
			 String orderStr= att_AgWechatInfo.getTab_order();
			 
			 //*****************无关字段处理begin*****************
						   		 //处理in条件 微信ID(wechatUserId)
							     if(att_AgWechatInfo.getWechatUserId_str()!=null&&
						   		    !"".equals(att_AgWechatInfo.getWechatUserId_str().trim())){ 
											 String  intStr=att_AgWechatInfo.getWechatUserId_str().trim();
											 String[]  arrayStr=intStr.split(","); 
											 
											  if(arrayStr.length>0){
												 sbuffer.append(" and ( ");
												 for(int i=0;i<arrayStr.length;i++){
													 String did=arrayStr[i];
													 if(i==arrayStr.length-1){
														 sbuffer.append("  wechatUserId="+did+"   "); 
													 }else {
													 sbuffer.append("  wechatUserId="+did+" or "); 
													 }
												 }
												 sbuffer.append(" ) "); 
											 }
											   
								 	}
						   		 //处理in条件 业务员ID(sceneId)
							     if(att_AgWechatInfo.getSceneId_str()!=null&&
						   		    !"".equals(att_AgWechatInfo.getSceneId_str().trim())){ 
											 String  intStr=att_AgWechatInfo.getSceneId_str().trim();
											 String[]  arrayStr=intStr.split(","); 
											 
											  if(arrayStr.length>0){
												 sbuffer.append(" and ( ");
												 for(int i=0;i<arrayStr.length;i++){
													 String did=arrayStr[i];
													 if(i==arrayStr.length-1){
														 sbuffer.append("  sceneId="+did+"   "); 
													 }else {
													 sbuffer.append("  sceneId="+did+" or "); 
													 }
												 }
												 sbuffer.append(" ) "); 
											 }
											   
								 	}
								 		//时间类型开始条件处理  创建时间(createDate)
									  if(att_AgWechatInfo.getCreateDate_start()!=null){
								   	    	sbuffer.append( " and  createDate<='" +att_AgWechatInfo.getCreateDate_start()+"'" );  
										 }
								 	  //时间类型结束条件处理 创建时间(createDate)
									 	if(att_AgWechatInfo.getCreateDate_end()!=null){
						   	      			sbuffer.append( " and  createDate>'" +att_AgWechatInfo.getCreateDate_end()+"'" );  
								  	     } 
			 //*****************无关字段处理end*****************
			 //*****************数据库字段处理begin*************
								  		//微信ID(wechatUserId)
					 					if(att_AgWechatInfo.getWechatUserId()!=null){
											 sbuffer.append( " and wechatUserId=" +att_AgWechatInfo.getWechatUserId() );
										 }
					       				//微信openId(openId)		 					 
									 if(att_AgWechatInfo.getOpenId()!=null&&
									  !"".equals(att_AgWechatInfo.getOpenId().trim())){
										  if(likeStr!=null&&!"".equals(likeStr.trim())&&likeStr.indexOf("openId")!=-1){
											  sbuffer.append( " and openId  like '%"+att_AgWechatInfo.getOpenId()+"%'"   );
										  }else {
											  sbuffer.append( " and openId   ='"+att_AgWechatInfo.getOpenId()+"'"   );
										  }
									 }
								  		//业务员ID(sceneId)
					 					if(att_AgWechatInfo.getSceneId()!=null){
											 sbuffer.append( " and sceneId=" +att_AgWechatInfo.getSceneId() );
										 }
					       				//微信昵称(wechatName)		 					 
									 if(att_AgWechatInfo.getWechatName()!=null&&
									  !"".equals(att_AgWechatInfo.getWechatName().trim())){
										  if(likeStr!=null&&!"".equals(likeStr.trim())&&likeStr.indexOf("wechatName")!=-1){
											  sbuffer.append( " and wechatName  like '%"+att_AgWechatInfo.getWechatName()+"%'"   );
										  }else {
											  sbuffer.append( " and wechatName   ='"+att_AgWechatInfo.getWechatName()+"'"   );
										  }
									 }
					       				//头像(avatar)		 					 
									 if(att_AgWechatInfo.getAvatar()!=null&&
									  !"".equals(att_AgWechatInfo.getAvatar().trim())){
										  if(likeStr!=null&&!"".equals(likeStr.trim())&&likeStr.indexOf("avatar")!=-1){
											  sbuffer.append( " and avatar  like '%"+att_AgWechatInfo.getAvatar()+"%'"   );
										  }else {
											  sbuffer.append( " and avatar   ='"+att_AgWechatInfo.getAvatar()+"'"   );
										  }
									 }
					       				//头像mediaId(avatarMediaId)		 					 
									 if(att_AgWechatInfo.getAvatarMediaId()!=null&&
									  !"".equals(att_AgWechatInfo.getAvatarMediaId().trim())){
										  if(likeStr!=null&&!"".equals(likeStr.trim())&&likeStr.indexOf("avatarMediaId")!=-1){
											  sbuffer.append( " and avatarMediaId  like '%"+att_AgWechatInfo.getAvatarMediaId()+"%'"   );
										  }else {
											  sbuffer.append( " and avatarMediaId   ='"+att_AgWechatInfo.getAvatarMediaId()+"'"   );
										  }
									 }
					       				//状态:0正常(status)		 					 
									 if(att_AgWechatInfo.getStatus()!=null&&
									  !"".equals(att_AgWechatInfo.getStatus().trim())){
										  if(likeStr!=null&&!"".equals(likeStr.trim())&&likeStr.indexOf("status")!=-1){
											  sbuffer.append( " and status  like '%"+att_AgWechatInfo.getStatus()+"%'"   );
										  }else {
											  sbuffer.append( " and status   ='"+att_AgWechatInfo.getStatus()+"'"   );
										  }
									 }
						   				//创建时间(createDate)
						 				if(att_AgWechatInfo.getCreateDate()!=null){
						   	                   sbuffer.append( " and  createDate='" +att_AgWechatInfo.getCreateDate()+"'" );  
								  		}
			 //*****************数据库字段处理end***************
			  		if(orderStr!=null&&!"".equals(orderStr.trim())){
									 sbuffer.append( " order by "+orderStr);
						 }
						 /*
						 else {
							  sbuffer.append( " order by  WechatUserId   desc " );
					      }
					      */
			 
			 return  sbuffer.toString();
	}
}