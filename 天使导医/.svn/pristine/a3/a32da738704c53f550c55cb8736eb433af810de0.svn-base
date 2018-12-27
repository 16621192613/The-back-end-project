package com.hsk.angeldoctor.api.daobbase.imp;

import java.util.*;
import com.hsk.supper.dto.comm.PagerModel;
import org.springframework.stereotype.*;
import com.hsk.exception.HSKDBException;
import com.hsk.supper.dao.imp.SupperDao;
import com.hsk.angeldoctor.api.daobbase.*;
import com.hsk.angeldoctor.api.persistence.*;

/** 
 * ag_inside_info表数据库层面操作实现类 
 * @author  作者:admin
 * @version  版本信息:v1.0   创建时间: 2018-08-14 13:40:21
 */
@Component
public class  AgInsideInfoDao extends SupperDao implements IAgInsideInfoDao {	

	/**
	 * 根据ag_inside_info表主键查找AgInsideInfo对象记录
	 * 
	 * @param  AiiId  Integer类型(ag_inside_info表主键)
	 * @return AgInsideInfo ag_inside_info表记录
	 * @throws HSKDBException
	 */	
	public AgInsideInfo findAgInsideInfoById(Integer AiiId) throws HSKDBException{
				AgInsideInfo  att_AgInsideInfo=new AgInsideInfo();				
				if(AiiId!=null){
					att_AgInsideInfo.setAiiId(AiiId);	
				    Object obj=	this.getOne(att_AgInsideInfo);
					if(obj!=null){
						att_AgInsideInfo=(AgInsideInfo) obj;
					}
				}
				return  att_AgInsideInfo;
	}
	 /**
	  * 根据ag_inside_info表主键删除AgInsideInfo对象记录
	  * @param  AiiId  Integer类型(ag_inside_info表主键)
	  * @throws HSKDBException
	  */
	public void deleteAgInsideInfoById(Integer AiiId) throws HSKDBException{ 
		 AgInsideInfo  att_AgInsideInfo=new AgInsideInfo();	
		  if(AiiId!=null){
					  att_AgInsideInfo.setAiiId(AiiId);
				  	  Object obj=	this.getOne(att_AgInsideInfo);
					  if(obj!=null){
							this.deleteObject(obj); 
					  }
			}
	}

	/**
 	 * 根据ag_inside_info表主键修改AgInsideInfo对象记录
     * @param  AiiId  Integer类型(ag_inside_info表主键)
     * @param  att_AgInsideInfo  AgInsideInfo类型(ag_inside_info表记录)
     * @return AgInsideInfo  修改后的AgInsideInfo对象记录
	 * @throws HSKDBException
	 */
	public  AgInsideInfo updateAgInsideInfoById(Integer AiiId,AgInsideInfo att_AgInsideInfo) throws HSKDBException{
		  if(AiiId!=null){
					att_AgInsideInfo.setAiiId(AiiId);
				   	Object obj=	this.getOne(att_AgInsideInfo);
					if(obj!=null){							 
							this.updateObject(obj);
					}
			}
			return  att_AgInsideInfo;
	}
	
	/**
	 * 新增ag_inside_info表 记录
     * @param  att_AgInsideInfo  AgInsideInfo类型(ag_inside_info表记录)
	 * @throws HSKDBException
	 */
	public Integer saveAgInsideInfo(AgInsideInfo att_AgInsideInfo) throws HSKDBException{
		 return this.newObject(att_AgInsideInfo);
	} 
		
	/**
	 * 新增或修改ag_inside_info表记录 ,如果ag_inside_info表主键AgInsideInfo.AiiId为空就是添加，如果非空就是修改
     * @param  att_AgInsideInfo  AgInsideInfo类型(ag_inside_info表记录)
	 * @throws HSKDBException
	 */
	public  AgInsideInfo saveOrUpdateAgInsideInfo(AgInsideInfo att_AgInsideInfo) throws HSKDBException{
		  this.getHibernateTemplate().saveOrUpdate(att_AgInsideInfo);
		  return att_AgInsideInfo;
	}
	
	/**
	 *根据AgInsideInfo对象作为对(ag_inside_info表进行查询，获取列表对象
     * @param  att_AgInsideInfo  AgInsideInfo类型(ag_inside_info表记录)
     * @return List<AgInsideInfo>  列表对象
	 * @throws HSKDBException 
	 */
	 @SuppressWarnings("unchecked")
	public List<AgInsideInfo> getListByAgInsideInfo(AgInsideInfo att_AgInsideInfo) throws HSKDBException{
		String Hql=this.getHql( att_AgInsideInfo); 
		List<AgInsideInfo> list=this.getHibernateTemplate().find(Hql);
		return  list;
	}
	/**
	 *根据AgInsideInfo对象作为对(ag_inside_info表进行查询，获取分页对象
     * @param  att_AgInsideInfo  AgInsideInfo类型(ag_inside_info表记录)
     * @return List<AgInsideInfo>  分页对象
	 * @throws HSKDBException 
	 */
	public PagerModel getPagerModelByAgInsideInfo(AgInsideInfo att_AgInsideInfo)
			throws HSKDBException {
		String Hql=this.getHql(att_AgInsideInfo);
		return this.getHibernateDao().findByPage(Hql); 
	} 
	/**
	 * 根据AgInsideInfo对象获取Hql字符串
     * @param  att_AgInsideInfo  AgInsideInfo类型(ag_inside_info表记录)
	 *  @return hql字符串
	 */
	private String  getHql(AgInsideInfo att_AgInsideInfo){
			 StringBuffer sbuffer = new StringBuffer( " from  AgInsideInfo  where  1=1  ");
			 String likeStr=  att_AgInsideInfo.getTab_like();
			 String orderStr= att_AgInsideInfo.getTab_order();
			 
			 //*****************无关字段处理begin*****************
						   		 //处理in条件 内部业务员ID(aiiId)
							     if(att_AgInsideInfo.getAiiId_str()!=null&&
						   		    !"".equals(att_AgInsideInfo.getAiiId_str().trim())){ 
											 String  intStr=att_AgInsideInfo.getAiiId_str().trim();
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
								 		//时间类型开始条件处理  创建时间(createDate)
									  if(att_AgInsideInfo.getCreateDate_start()!=null){
								   	    	sbuffer.append( " and  createDate<='" +att_AgInsideInfo.getCreateDate_start()+"'" );  
										 }
								 	  //时间类型结束条件处理 创建时间(createDate)
									 	if(att_AgInsideInfo.getCreateDate_end()!=null){
						   	      			sbuffer.append( " and  createDate>'" +att_AgInsideInfo.getCreateDate_end()+"'" );  
								  	     } 
								 		//时间类型开始条件处理  修改时间(editDate)
									  if(att_AgInsideInfo.getEditDate_start()!=null){
								   	    	sbuffer.append( " and  editDate<='" +att_AgInsideInfo.getEditDate_start()+"'" );  
										 }
								 	  //时间类型结束条件处理 修改时间(editDate)
									 	if(att_AgInsideInfo.getEditDate_end()!=null){
						   	      			sbuffer.append( " and  editDate>'" +att_AgInsideInfo.getEditDate_end()+"'" );  
								  	     } 
			 //*****************无关字段处理end*****************
			 //*****************数据库字段处理begin*************
								  		//内部业务员ID(aiiId)
					 					if(att_AgInsideInfo.getAiiId()!=null){
											 sbuffer.append( " and aiiId=" +att_AgInsideInfo.getAiiId() );
										 }
					       				//业务员名称(name)		 					 
									 if(att_AgInsideInfo.getName()!=null&&
									  !"".equals(att_AgInsideInfo.getName().trim())){
										  if(likeStr!=null&&!"".equals(likeStr.trim())&&likeStr.indexOf("name")!=-1){
											  sbuffer.append( " and name  like '%"+att_AgInsideInfo.getName()+"%'"   );
										  }else {
											  sbuffer.append( " and name   ='"+att_AgInsideInfo.getName()+"'"   );
										  }
									 }
					       				//手机号(mobile)		 					 
									 if(att_AgInsideInfo.getMobile()!=null&&
									  !"".equals(att_AgInsideInfo.getMobile().trim())){
										  if(likeStr!=null&&!"".equals(likeStr.trim())&&likeStr.indexOf("mobile")!=-1){
											  sbuffer.append( " and mobile  like '%"+att_AgInsideInfo.getMobile()+"%'"   );
										  }else {
											  sbuffer.append( " and mobile   ='"+att_AgInsideInfo.getMobile()+"'"   );
										  }
									 }
					       				//邮箱(email)		 					 
									 if(att_AgInsideInfo.getEmail()!=null&&
									  !"".equals(att_AgInsideInfo.getEmail().trim())){
										  if(likeStr!=null&&!"".equals(likeStr.trim())&&likeStr.indexOf("email")!=-1){
											  sbuffer.append( " and email  like '%"+att_AgInsideInfo.getEmail()+"%'"   );
										  }else {
											  sbuffer.append( " and email   ='"+att_AgInsideInfo.getEmail()+"'"   );
										  }
									 }
					       				//状态:1正常，2禁用(status)		 					 
									 if(att_AgInsideInfo.getStatus()!=null&&
									  !"".equals(att_AgInsideInfo.getStatus().trim())){
										  if(likeStr!=null&&!"".equals(likeStr.trim())&&likeStr.indexOf("status")!=-1){
											  sbuffer.append( " and status  like '%"+att_AgInsideInfo.getStatus()+"%'"   );
										  }else {
											  sbuffer.append( " and status   ='"+att_AgInsideInfo.getStatus()+"'"   );
										  }
									 }
					       				//创建人(createRen)		 					 
									 if(att_AgInsideInfo.getCreateRen()!=null&&
									  !"".equals(att_AgInsideInfo.getCreateRen().trim())){
										  if(likeStr!=null&&!"".equals(likeStr.trim())&&likeStr.indexOf("createRen")!=-1){
											  sbuffer.append( " and createRen  like '%"+att_AgInsideInfo.getCreateRen()+"%'"   );
										  }else {
											  sbuffer.append( " and createRen   ='"+att_AgInsideInfo.getCreateRen()+"'"   );
										  }
									 }
						   				//创建时间(createDate)
						 				if(att_AgInsideInfo.getCreateDate()!=null){
						   	                   sbuffer.append( " and  createDate='" +att_AgInsideInfo.getCreateDate()+"'" );  
								  		}
					       				//修改人(editRen)		 					 
									 if(att_AgInsideInfo.getEditRen()!=null&&
									  !"".equals(att_AgInsideInfo.getEditRen().trim())){
										  if(likeStr!=null&&!"".equals(likeStr.trim())&&likeStr.indexOf("editRen")!=-1){
											  sbuffer.append( " and editRen  like '%"+att_AgInsideInfo.getEditRen()+"%'"   );
										  }else {
											  sbuffer.append( " and editRen   ='"+att_AgInsideInfo.getEditRen()+"'"   );
										  }
									 }
						   				//修改时间(editDate)
						 				if(att_AgInsideInfo.getEditDate()!=null){
						   	                   sbuffer.append( " and  editDate='" +att_AgInsideInfo.getEditDate()+"'" );  
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