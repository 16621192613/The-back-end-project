package com.hsk.angeldoctor.api.daobbase.imp;

import java.text.SimpleDateFormat;
import java.util.*;
import com.hsk.supper.dto.comm.PagerModel;
import org.springframework.stereotype.*;
import com.hsk.exception.HSKDBException;
import com.hsk.supper.dao.imp.SupperDao;
import com.hsk.angeldoctor.api.daobbase.*;
import com.hsk.angeldoctor.api.persistence.*;

/** 
 * ag_agent_info表数据库层面操作实现类 
 * @author  作者:admin
 * @version  版本信息:v1.0   创建时间: 2018-08-14 13:31:11
 */
@Component
public class  AgAgentInfoDao extends SupperDao implements IAgAgentInfoDao {	

	/**
	 * 根据ag_agent_info表主键查找AgAgentInfo对象记录
	 * 
	 * @param  AaiId  Integer类型(ag_agent_info表主键)
	 * @return AgAgentInfo ag_agent_info表记录
	 * @throws HSKDBException
	 */	
	public AgAgentInfo findAgAgentInfoById(Integer AaiId) throws HSKDBException{
				AgAgentInfo  att_AgAgentInfo=new AgAgentInfo();				
				if(AaiId!=null){
					att_AgAgentInfo.setAaiId(AaiId);	
				    Object obj=	this.getOne(att_AgAgentInfo);
					if(obj!=null){
						att_AgAgentInfo=(AgAgentInfo) obj;
					}
				}
				return  att_AgAgentInfo;
	}
	 /**
	  * 根据ag_agent_info表主键删除AgAgentInfo对象记录
	  * @param  AaiId  Integer类型(ag_agent_info表主键)
	  * @throws HSKDBException
	  */
	public void deleteAgAgentInfoById(Integer AaiId) throws HSKDBException{ 
		 AgAgentInfo  att_AgAgentInfo=new AgAgentInfo();	
		  if(AaiId!=null){
					  att_AgAgentInfo.setAaiId(AaiId);
				  	  Object obj=	this.getOne(att_AgAgentInfo);
					  if(obj!=null){
							this.deleteObject(obj); 
					  }
			}
	}

	/**
 	 * 根据ag_agent_info表主键修改AgAgentInfo对象记录
     * @param  AaiId  Integer类型(ag_agent_info表主键)
     * @param  att_AgAgentInfo  AgAgentInfo类型(ag_agent_info表记录)
     * @return AgAgentInfo  修改后的AgAgentInfo对象记录
	 * @throws HSKDBException
	 */
	public  AgAgentInfo updateAgAgentInfoById(Integer AaiId,AgAgentInfo att_AgAgentInfo) throws HSKDBException{
		  if(AaiId!=null){
					att_AgAgentInfo.setAaiId(AaiId);
				   	Object obj=	this.getOne(att_AgAgentInfo);
					if(obj!=null){							 
							this.updateObject(obj);
					}
			}
			return  att_AgAgentInfo;
	}
	
	/**
	 * 新增ag_agent_info表 记录
     * @param  att_AgAgentInfo  AgAgentInfo类型(ag_agent_info表记录)
	 * @throws HSKDBException
	 */
	public Integer saveAgAgentInfo(AgAgentInfo att_AgAgentInfo) throws HSKDBException{
		 return this.newObject(att_AgAgentInfo);
	} 
		
	/**
	 * 新增或修改ag_agent_info表记录 ,如果ag_agent_info表主键AgAgentInfo.AaiId为空就是添加，如果非空就是修改
     * @param  att_AgAgentInfo  AgAgentInfo类型(ag_agent_info表记录)
	 * @throws HSKDBException
	 */
	public  AgAgentInfo saveOrUpdateAgAgentInfo(AgAgentInfo att_AgAgentInfo) throws HSKDBException{
		  this.getHibernateTemplate().saveOrUpdate(att_AgAgentInfo);
		  return att_AgAgentInfo;
	}
	
	/**
	 *根据AgAgentInfo对象作为对(ag_agent_info表进行查询，获取列表对象
     * @param  att_AgAgentInfo  AgAgentInfo类型(ag_agent_info表记录)
     * @return List<AgAgentInfo>  列表对象
	 * @throws HSKDBException 
	 */
	 @SuppressWarnings("unchecked")
	public List<AgAgentInfo> getListByAgAgentInfo(AgAgentInfo att_AgAgentInfo) throws HSKDBException{
		String Hql=this.getHql( att_AgAgentInfo); 
		List<AgAgentInfo> list=this.getHibernateTemplate().find(Hql);
		return  list;
	}
	/**
	 *根据AgAgentInfo对象作为对(ag_agent_info表进行查询，获取分页对象
     * @param  att_AgAgentInfo  AgAgentInfo类型(ag_agent_info表记录)
     * @return List<AgAgentInfo>  分页对象
	 * @throws HSKDBException 
	 */
	public PagerModel getPagerModelByAgAgentInfo(AgAgentInfo att_AgAgentInfo)
			throws HSKDBException {
		String Hql=this.getHql(att_AgAgentInfo);
		return this.getHibernateDao().findByPage(Hql); 
	} 
	/**
	 * 根据AgAgentInfo对象获取Hql字符串
     * @param  att_AgAgentInfo  AgAgentInfo类型(ag_agent_info表记录)
	 *  @return hql字符串
	 */
	private String  getHql(AgAgentInfo att_AgAgentInfo){
			 StringBuffer sbuffer = new StringBuffer( " from  AgAgentInfo  where  1=1  ");
			 String likeStr=  att_AgAgentInfo.getTab_like();
			 String orderStr= att_AgAgentInfo.getTab_order();
			 
			 //*****************无关字段处理begin*****************
						   		 //处理in条件 代理商ID(aaiId)
							     if(att_AgAgentInfo.getAaiId_str()!=null&&
						   		    !"".equals(att_AgAgentInfo.getAaiId_str().trim())){ 
											 String  intStr=att_AgAgentInfo.getAaiId_str().trim();
											 String[]  arrayStr=intStr.split(","); 
											 
											  if(arrayStr.length>0){
												 sbuffer.append(" and ( ");
												 for(int i=0;i<arrayStr.length;i++){
													 String did=arrayStr[i];
													 if(i==arrayStr.length-1){
														 sbuffer.append("  aaiId="+did+"   "); 
													 }else {
													 sbuffer.append("  aaiId="+did+" or "); 
													 }
												 }
												 sbuffer.append(" ) "); 
											 }
											   
								 	}
						   		 //处理in条件 上级组织ID(reservedRelateToOrganizationId)
							     if(att_AgAgentInfo.getReservedRelateToOrganizationId_str()!=null&&
						   		    !"".equals(att_AgAgentInfo.getReservedRelateToOrganizationId_str().trim())){ 
											 String  intStr=att_AgAgentInfo.getReservedRelateToOrganizationId_str().trim();
											 String[]  arrayStr=intStr.split(","); 
											 
											  if(arrayStr.length>0){
												 sbuffer.append(" and ( ");
												 for(int i=0;i<arrayStr.length;i++){
													 String did=arrayStr[i];
													 if(i==arrayStr.length-1){
														 sbuffer.append("  reservedRelateToOrganizationId="+did+"   "); 
													 }else {
													 sbuffer.append("  reservedRelateToOrganizationId="+did+" or "); 
													 }
												 }
												 sbuffer.append(" ) "); 
											 }
											   
								 	}
							     SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");
							 		//时间类型开始条件处理  创建时间(createDate)
								  if(att_AgAgentInfo.getCreateDate_start()!=null){
							   	    	sbuffer.append( " and  createDate >='" +sdf.format(att_AgAgentInfo.getCreateDate_start())+" 00:00:00'" );  
									 }
							 	  //时间类型结束条件处理 创建时间(createDate)
								 	if(att_AgAgentInfo.getCreateDate_end()!=null){
					   	      			sbuffer.append( " and  createDate<='" +sdf.format(att_AgAgentInfo.getCreateDate_end())+" 23:59:59'" );  
							  	     } 
								 		//时间类型开始条件处理  修改时间(editDate)
									  if(att_AgAgentInfo.getEditDate_start()!=null){
								   	    	sbuffer.append( " and  editDate<='" +att_AgAgentInfo.getEditDate_start()+"'" );  
										 }
								 	  //时间类型结束条件处理 修改时间(editDate)
									 	if(att_AgAgentInfo.getEditDate_end()!=null){
						   	      			sbuffer.append( " and  editDate>'" +att_AgAgentInfo.getEditDate_end()+"'" );  
								  	     } 
			 //*****************无关字段处理end*****************
			 //*****************数据库字段处理begin*************
								  		//代理商ID(aaiId)
					 					if(att_AgAgentInfo.getAaiId()!=null){
											 sbuffer.append( " and aaiId=" +att_AgAgentInfo.getAaiId() );
										 }
					       				//代理商类型:0代理商，1医院(reservedRelateTo)		 					 
									 if(att_AgAgentInfo.getReservedRelateTo()!=null&&
									  !"".equals(att_AgAgentInfo.getReservedRelateTo().trim())){
										  if(likeStr!=null&&!"".equals(likeStr.trim())&&likeStr.indexOf("reservedRelateTo")!=-1){
											  sbuffer.append( " and reservedRelateTo  like '%"+att_AgAgentInfo.getReservedRelateTo()+"%'"   );
										  }else {
											  sbuffer.append( " and reservedRelateTo   ='"+att_AgAgentInfo.getReservedRelateTo()+"'"   );
										  }
									 }
								  		//上级组织ID(reservedRelateToOrganizationId)
					 					if(att_AgAgentInfo.getReservedRelateToOrganizationId()!=null){
											 sbuffer.append( " and reservedRelateToOrganizationId=" +att_AgAgentInfo.getReservedRelateToOrganizationId() );
										 }
					       				//代理商名称(name)		 					 
									 if(att_AgAgentInfo.getName()!=null&&
									  !"".equals(att_AgAgentInfo.getName().trim())){
										  if(likeStr!=null&&!"".equals(likeStr.trim())&&likeStr.indexOf("name")!=-1){
											  sbuffer.append( " and name  like '%"+att_AgAgentInfo.getName()+"%'"   );
										  }else {
											  sbuffer.append( " and name   ='"+att_AgAgentInfo.getName()+"'"   );
										  }
									 }
					       				//手机号(mobile)		 					 
									 if(att_AgAgentInfo.getMobile()!=null&&
									  !"".equals(att_AgAgentInfo.getMobile().trim())){
										  if(likeStr!=null&&!"".equals(likeStr.trim())&&likeStr.indexOf("mobile")!=-1){
											  sbuffer.append( " and mobile  like '%"+att_AgAgentInfo.getMobile()+"%'"   );
										  }else {
											  sbuffer.append( " and mobile   ='"+att_AgAgentInfo.getMobile()+"'"   );
										  }
									 }
					       				//省(reservedProvId)		 					 
									 if(att_AgAgentInfo.getReservedProvId()!=null&&
									  !"".equals(att_AgAgentInfo.getReservedProvId().trim())){
										  if(likeStr!=null&&!"".equals(likeStr.trim())&&likeStr.indexOf("reservedProvId")!=-1){
											  sbuffer.append( " and reservedProvId  like '%"+att_AgAgentInfo.getReservedProvId()+"%'"   );
										  }else {
											  sbuffer.append( " and reservedProvId   ='"+att_AgAgentInfo.getReservedProvId()+"'"   );
										  }
									 }
					       				//市(reservedCityId)		 					 
									 if(att_AgAgentInfo.getReservedCityId()!=null&&
									  !"".equals(att_AgAgentInfo.getReservedCityId().trim())){
										  if(likeStr!=null&&!"".equals(likeStr.trim())&&likeStr.indexOf("reservedCityId")!=-1){
											  sbuffer.append( " and reservedCityId  like '%"+att_AgAgentInfo.getReservedCityId()+"%'"   );
										  }else {
											  sbuffer.append( " and reservedCityId   ='"+att_AgAgentInfo.getReservedCityId()+"'"   );
										  }
									 }
					       				//银行名称(reservedBankName)		 					 
									 if(att_AgAgentInfo.getReservedBankName()!=null&&
									  !"".equals(att_AgAgentInfo.getReservedBankName().trim())){
										  if(likeStr!=null&&!"".equals(likeStr.trim())&&likeStr.indexOf("reservedBankName")!=-1){
											  sbuffer.append( " and reservedBankName  like '%"+att_AgAgentInfo.getReservedBankName()+"%'"   );
										  }else {
											  sbuffer.append( " and reservedBankName   ='"+att_AgAgentInfo.getReservedBankName()+"'"   );
										  }
									 }
					       				//银行账户名称(reservedAccountName)		 					 
									 if(att_AgAgentInfo.getReservedAccountName()!=null&&
									  !"".equals(att_AgAgentInfo.getReservedAccountName().trim())){
										  if(likeStr!=null&&!"".equals(likeStr.trim())&&likeStr.indexOf("reservedAccountName")!=-1){
											  sbuffer.append( " and reservedAccountName  like '%"+att_AgAgentInfo.getReservedAccountName()+"%'"   );
										  }else {
											  sbuffer.append( " and reservedAccountName   ='"+att_AgAgentInfo.getReservedAccountName()+"'"   );
										  }
									 }
					       				//银行账号(reservedAccountNumber)		 					 
									 if(att_AgAgentInfo.getReservedAccountNumber()!=null&&
									  !"".equals(att_AgAgentInfo.getReservedAccountNumber().trim())){
										  if(likeStr!=null&&!"".equals(likeStr.trim())&&likeStr.indexOf("reservedAccountNumber")!=-1){
											  sbuffer.append( " and reservedAccountNumber  like '%"+att_AgAgentInfo.getReservedAccountNumber()+"%'"   );
										  }else {
											  sbuffer.append( " and reservedAccountNumber   ='"+att_AgAgentInfo.getReservedAccountNumber()+"'"   );
										  }
									 }
					       				//所属团队(reservedRelateToTeamName)		 					 
									 if(att_AgAgentInfo.getReservedRelateToTeamName()!=null&&
									  !"".equals(att_AgAgentInfo.getReservedRelateToTeamName().trim())){
										  if(likeStr!=null&&!"".equals(likeStr.trim())&&likeStr.indexOf("reservedRelateToTeamName")!=-1){
											  sbuffer.append( " and reservedRelateToTeamName  like '%"+att_AgAgentInfo.getReservedRelateToTeamName()+"%'"   );
										  }else {
											  sbuffer.append( " and reservedRelateToTeamName   ='"+att_AgAgentInfo.getReservedRelateToTeamName()+"'"   );
										  }
									 }
					       				//状态:1正常，2禁用(status)		 					 
									 if(att_AgAgentInfo.getStatus()!=null&&
									  !"".equals(att_AgAgentInfo.getStatus().trim())){
										  if(likeStr!=null&&!"".equals(likeStr.trim())&&likeStr.indexOf("status")!=-1){
											  sbuffer.append( " and status  like '%"+att_AgAgentInfo.getStatus()+"%'"   );
										  }else {
											  sbuffer.append( " and status   ='"+att_AgAgentInfo.getStatus()+"'"   );
										  }
									 }
					       				//创建人(createRen)		 					 
									 if(att_AgAgentInfo.getCreateRen()!=null&&
									  !"".equals(att_AgAgentInfo.getCreateRen().trim())){
										  if(likeStr!=null&&!"".equals(likeStr.trim())&&likeStr.indexOf("createRen")!=-1){
											  sbuffer.append( " and createRen  like '%"+att_AgAgentInfo.getCreateRen()+"%'"   );
										  }else {
											  sbuffer.append( " and createRen   ='"+att_AgAgentInfo.getCreateRen()+"'"   );
										  }
									 }
						   				//创建时间(createDate)
						 				if(att_AgAgentInfo.getCreateDate()!=null){
						   	                   sbuffer.append( " and  createDate='" +att_AgAgentInfo.getCreateDate()+"'" );  
								  		}
						   				//修改时间(editDate)
						 				if(att_AgAgentInfo.getEditDate()!=null){
						   	                   sbuffer.append( " and  editDate='" +att_AgAgentInfo.getEditDate()+"'" );  
								  		}
					       				//修改人(editRen)		 					 
									 if(att_AgAgentInfo.getEditRen()!=null&&
									  !"".equals(att_AgAgentInfo.getEditRen().trim())){
										  if(likeStr!=null&&!"".equals(likeStr.trim())&&likeStr.indexOf("editRen")!=-1){
											  sbuffer.append( " and editRen  like '%"+att_AgAgentInfo.getEditRen()+"%'"   );
										  }else {
											  sbuffer.append( " and editRen   ='"+att_AgAgentInfo.getEditRen()+"'"   );
										  }
									 }
			 //*****************数据库字段处理end***************
			  		if(orderStr!=null&&!"".equals(orderStr.trim())){
									 sbuffer.append( " order by "+orderStr);
						 }
						 /*
						 else {
							  sbuffer.append( " order by  AaiId   desc " );
					      }
					      */
			 
			 return  sbuffer.toString();
	}
}