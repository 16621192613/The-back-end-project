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
 * ag_business_user表数据库层面操作实现类 
 * @author  作者:admin
 * @version  版本信息:v1.0   创建时间: 2018-08-14 13:31:11
 */
@Component
public class  AgBusinessUserDao extends SupperDao implements IAgBusinessUserDao {	

	/**
	 * 根据ag_business_user表主键查找AgBusinessUser对象记录
	 * 
	 * @param  AgentId  Integer类型(ag_business_user表主键)
	 * @return AgBusinessUser ag_business_user表记录
	 * @throws HSKDBException
	 */	
	public AgBusinessUser findAgBusinessUserById(Integer AgentId) throws HSKDBException{
				AgBusinessUser  att_AgBusinessUser=new AgBusinessUser();				
				if(AgentId!=null){
					att_AgBusinessUser.setAgentId(AgentId);	
				    Object obj=	this.getOne(att_AgBusinessUser);
					if(obj!=null){
						att_AgBusinessUser=(AgBusinessUser) obj;
					}
				}
				return  att_AgBusinessUser;
	}
	 /**
	  * 根据ag_business_user表主键删除AgBusinessUser对象记录
	  * @param  AgentId  Integer类型(ag_business_user表主键)
	  * @throws HSKDBException
	  */
	public void deleteAgBusinessUserById(Integer AgentId) throws HSKDBException{ 
		 AgBusinessUser  att_AgBusinessUser=new AgBusinessUser();	
		  if(AgentId!=null){
					  att_AgBusinessUser.setAgentId(AgentId);
				  	  Object obj=	this.getOne(att_AgBusinessUser);
					  if(obj!=null){
							this.deleteObject(obj); 
					  }
			}
	}

	/**
 	 * 根据ag_business_user表主键修改AgBusinessUser对象记录
     * @param  AgentId  Integer类型(ag_business_user表主键)
     * @param  att_AgBusinessUser  AgBusinessUser类型(ag_business_user表记录)
     * @return AgBusinessUser  修改后的AgBusinessUser对象记录
	 * @throws HSKDBException
	 */
	public  AgBusinessUser updateAgBusinessUserById(Integer AgentId,AgBusinessUser att_AgBusinessUser) throws HSKDBException{
		  if(AgentId!=null){
					att_AgBusinessUser.setAgentId(AgentId);
				   	Object obj=	this.getOne(att_AgBusinessUser);
					if(obj!=null){							 
							this.updateObject(obj);
					}
			}
			return  att_AgBusinessUser;
	}
	
	/**
	 * 新增ag_business_user表 记录
     * @param  att_AgBusinessUser  AgBusinessUser类型(ag_business_user表记录)
	 * @throws HSKDBException
	 */
	public Integer saveAgBusinessUser(AgBusinessUser att_AgBusinessUser) throws HSKDBException{
		 return this.newObject(att_AgBusinessUser);
	} 
		
	/**
	 * 新增或修改ag_business_user表记录 ,如果ag_business_user表主键AgBusinessUser.AgentId为空就是添加，如果非空就是修改
     * @param  att_AgBusinessUser  AgBusinessUser类型(ag_business_user表记录)
	 * @throws HSKDBException
	 */
	public  AgBusinessUser saveOrUpdateAgBusinessUser(AgBusinessUser att_AgBusinessUser) throws HSKDBException{
		  this.getHibernateTemplate().saveOrUpdate(att_AgBusinessUser);
		  return att_AgBusinessUser;
	}
	
	/**
	 *根据AgBusinessUser对象作为对(ag_business_user表进行查询，获取列表对象
     * @param  att_AgBusinessUser  AgBusinessUser类型(ag_business_user表记录)
     * @return List<AgBusinessUser>  列表对象
	 * @throws HSKDBException 
	 */
	 @SuppressWarnings("unchecked")
	public List<AgBusinessUser> getListByAgBusinessUser(AgBusinessUser att_AgBusinessUser) throws HSKDBException{
		String Hql=this.getHql( att_AgBusinessUser); 
		List<AgBusinessUser> list=this.getHibernateTemplate().find(Hql);
		return  list;
	}
	/**
	 *根据AgBusinessUser对象作为对(ag_business_user表进行查询，获取分页对象
     * @param  att_AgBusinessUser  AgBusinessUser类型(ag_business_user表记录)
     * @return List<AgBusinessUser>  分页对象
	 * @throws HSKDBException 
	 */
	public PagerModel getPagerModelByAgBusinessUser(AgBusinessUser att_AgBusinessUser)
			throws HSKDBException {
		String Hql=this.getHql(att_AgBusinessUser);
		return this.getHibernateDao().findByPage(Hql); 
	} 
	/**
	 * 根据AgBusinessUser对象获取Hql字符串
     * @param  att_AgBusinessUser  AgBusinessUser类型(ag_business_user表记录)
	 *  @return hql字符串
	 */
	private String  getHql(AgBusinessUser att_AgBusinessUser){
			 StringBuffer sbuffer = new StringBuffer( " from  AgBusinessUser  where  1=1  ");
			 String likeStr=  att_AgBusinessUser.getTab_like();
			 String orderStr= att_AgBusinessUser.getTab_order();
			 
			 //*****************无关字段处理begin*****************
						   		 //处理in条件 业务员ID(agentId)
							     if(att_AgBusinessUser.getAgentId_str()!=null&&
						   		    !"".equals(att_AgBusinessUser.getAgentId_str().trim())){ 
											 String  intStr=att_AgBusinessUser.getAgentId_str().trim();
											 String[]  arrayStr=intStr.split(","); 
											 
											  if(arrayStr.length>0){
												 sbuffer.append(" and ( ");
												 for(int i=0;i<arrayStr.length;i++){
													 String did=arrayStr[i];
													 if(i==arrayStr.length-1){
														 sbuffer.append("  agentId="+did+"   "); 
													 }else {
													 sbuffer.append("  agentId="+did+" or "); 
													 }
												 }
												 sbuffer.append(" ) "); 
											 }
											   
								 	}
						   		 //处理in条件 代理商ID(aaiId)
							     if(att_AgBusinessUser.getAaiId_str()!=null&&
						   		    !"".equals(att_AgBusinessUser.getAaiId_str().trim())){ 
											 String  intStr=att_AgBusinessUser.getAaiId_str().trim();
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
						   		 //处理in条件 上级代理人ID(parentAgentId)
							     if(att_AgBusinessUser.getParentAgentId_str()!=null&&
						   		    !"".equals(att_AgBusinessUser.getParentAgentId_str().trim())){ 
											 String  intStr=att_AgBusinessUser.getParentAgentId_str().trim();
											 String[]  arrayStr=intStr.split(","); 
											 
											  if(arrayStr.length>0){
												 sbuffer.append(" and ( ");
												 for(int i=0;i<arrayStr.length;i++){
													 String did=arrayStr[i];
													 if(i==arrayStr.length-1){
														 sbuffer.append("  parentAgentId="+did+"   "); 
													 }else {
													 sbuffer.append("  parentAgentId="+did+" or "); 
													 }
												 }
												 sbuffer.append(" ) "); 
											 }
											   
								 	}
							     SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");
							 		//时间类型开始条件处理  创建时间(createDate)
								  if(att_AgBusinessUser.getCreateDate_start()!=null){
							   	    	sbuffer.append( " and  createDate >='" +sdf.format(att_AgBusinessUser.getCreateDate_start())+" 00:00:00'" );  
									 }
							 	  //时间类型结束条件处理 创建时间(createDate)
								 	if(att_AgBusinessUser.getCreateDate_end()!=null){
					   	      			sbuffer.append( " and  createDate<='" +sdf.format(att_AgBusinessUser.getCreateDate_end())+" 23:59:59'" );  
							  	     } 
								 		//时间类型开始条件处理  修改时间(editDate)
									  if(att_AgBusinessUser.getEditDate_start()!=null){
								   	    	sbuffer.append( " and  editDate<='" +att_AgBusinessUser.getEditDate_start()+"'" );  
										 }
								 	  //时间类型结束条件处理 修改时间(editDate)
									 	if(att_AgBusinessUser.getEditDate_end()!=null){
						   	      			sbuffer.append( " and  editDate>'" +att_AgBusinessUser.getEditDate_end()+"'" );  
								  	     } 
			 //*****************无关字段处理end*****************
			 //*****************数据库字段处理begin*************
								  		//业务员ID(agentId)
					 					if(att_AgBusinessUser.getAgentId()!=null){
											 sbuffer.append( " and agentId=" +att_AgBusinessUser.getAgentId() );
										 }
								  		//代理商ID(aaiId)
					 					if(att_AgBusinessUser.getAaiId()!=null){
											 sbuffer.append( " and aaiId=" +att_AgBusinessUser.getAaiId() );
										 }
								  		//上级代理人ID(parentAgentId)
					 					if(att_AgBusinessUser.getParentAgentId()!=null){
											 sbuffer.append( " and parentAgentId=" +att_AgBusinessUser.getParentAgentId() );
										 }
					       				//手机号(mobile)		 					 
									 if(att_AgBusinessUser.getMobile()!=null&&
									  !"".equals(att_AgBusinessUser.getMobile().trim())){
										  if(likeStr!=null&&!"".equals(likeStr.trim())&&likeStr.indexOf("mobile")!=-1){
											  sbuffer.append( " and mobile  like '%"+att_AgBusinessUser.getMobile()+"%'"   );
										  }else {
											  sbuffer.append( " and mobile   ='"+att_AgBusinessUser.getMobile()+"'"   );
										  }
									 }
					       				//代理人类型:1医院内部员工；2一级代理商员工；3二级员工(agentType)		 					 
									 if(att_AgBusinessUser.getAgentType()!=null&&
									  !"".equals(att_AgBusinessUser.getAgentType().trim())){
										  if(likeStr!=null&&!"".equals(likeStr.trim())&&likeStr.indexOf("agentType")!=-1){
											  sbuffer.append( " and agentType  like '%"+att_AgBusinessUser.getAgentType()+"%'"   );
										  }else if("4".equals(att_AgBusinessUser.getAgentType().trim())) {
											  sbuffer.append( " and agentType ='4'"   );
										  }else
											  sbuffer.append( " and (agentType !='4' or agentType is null)"   );
									 }
					       				//业务员姓名(name)		 					 
									 if(att_AgBusinessUser.getName()!=null&&
									  !"".equals(att_AgBusinessUser.getName().trim())){
										  if(likeStr!=null&&!"".equals(likeStr.trim())&&likeStr.indexOf("name")!=-1){
											  sbuffer.append( " and name  like '%"+att_AgBusinessUser.getName()+"%'"   );
										  }else {
											  sbuffer.append( " and name   ='"+att_AgBusinessUser.getName()+"'"   );
										  }
									 }
					       				//银行名称(reservedBankName)		 					 
									 if(att_AgBusinessUser.getReservedBankName()!=null&&
									  !"".equals(att_AgBusinessUser.getReservedBankName().trim())){
										  if(likeStr!=null&&!"".equals(likeStr.trim())&&likeStr.indexOf("reservedBankName")!=-1){
											  sbuffer.append( " and reservedBankName  like '%"+att_AgBusinessUser.getReservedBankName()+"%'"   );
										  }else {
											  sbuffer.append( " and reservedBankName   ='"+att_AgBusinessUser.getReservedBankName()+"'"   );
										  }
									 }
					       				//银行账户名称(reservedAccountName)		 					 
									 if(att_AgBusinessUser.getReservedAccountName()!=null&&
									  !"".equals(att_AgBusinessUser.getReservedAccountName().trim())){
										  if(likeStr!=null&&!"".equals(likeStr.trim())&&likeStr.indexOf("reservedAccountName")!=-1){
											  sbuffer.append( " and reservedAccountName  like '%"+att_AgBusinessUser.getReservedAccountName()+"%'"   );
										  }else {
											  sbuffer.append( " and reservedAccountName   ='"+att_AgBusinessUser.getReservedAccountName()+"'"   );
										  }
									 }
					       				//银行账号(reservedAccountNumber)		 					 
									 if(att_AgBusinessUser.getReservedAccountNumber()!=null&&
									  !"".equals(att_AgBusinessUser.getReservedAccountNumber().trim())){
										  if(likeStr!=null&&!"".equals(likeStr.trim())&&likeStr.indexOf("reservedAccountNumber")!=-1){
											  sbuffer.append( " and reservedAccountNumber  like '%"+att_AgBusinessUser.getReservedAccountNumber()+"%'"   );
										  }else {
											  sbuffer.append( " and reservedAccountNumber   ='"+att_AgBusinessUser.getReservedAccountNumber()+"'"   );
										  }
									 }
					       				//备注(remark)		 					 
									 if(att_AgBusinessUser.getRemark()!=null&&
									  !"".equals(att_AgBusinessUser.getRemark().trim())){
										  if(likeStr!=null&&!"".equals(likeStr.trim())&&likeStr.indexOf("remark")!=-1){
											  sbuffer.append( " and remark  like '%"+att_AgBusinessUser.getRemark()+"%'"   );
										  }else {
											  sbuffer.append( " and remark   ='"+att_AgBusinessUser.getRemark()+"'"   );
										  }
									 }
					       				//头像(avatar)		 					 
									 if(att_AgBusinessUser.getAvatar()!=null&&
									  !"".equals(att_AgBusinessUser.getAvatar().trim())){
										  if(likeStr!=null&&!"".equals(likeStr.trim())&&likeStr.indexOf("avatar")!=-1){
											  sbuffer.append( " and avatar  like '%"+att_AgBusinessUser.getAvatar()+"%'"   );
										  }else {
											  sbuffer.append( " and avatar   ='"+att_AgBusinessUser.getAvatar()+"'"   );
										  }
									 }
					       				//二维码(qrCode)		 					 
									 if(att_AgBusinessUser.getQrCode()!=null&&
									  !"".equals(att_AgBusinessUser.getQrCode().trim())){
										  if(likeStr!=null&&!"".equals(likeStr.trim())&&likeStr.indexOf("qrCode")!=-1){
											  sbuffer.append( " and qrCode  like '%"+att_AgBusinessUser.getQrCode()+"%'"   );
										  }else {
											  sbuffer.append( " and qrCode   ='"+att_AgBusinessUser.getQrCode()+"'"   );
										  }
									 }
					       				//状态:1正常，2禁用(status)		 					 
									 if(att_AgBusinessUser.getStatus()!=null&&
									  !"".equals(att_AgBusinessUser.getStatus().trim())){
										  if(likeStr!=null&&!"".equals(likeStr.trim())&&likeStr.indexOf("status")!=-1){
											  sbuffer.append( " and status  like '%"+att_AgBusinessUser.getStatus()+"%'"   );
										  }else {
											  sbuffer.append( " and status   ='"+att_AgBusinessUser.getStatus()+"'"   );
										  }
									 }
					       				//创建人(createRen)		 					 
									 if(att_AgBusinessUser.getCreateRen()!=null&&
									  !"".equals(att_AgBusinessUser.getCreateRen().trim())){
										  if(likeStr!=null&&!"".equals(likeStr.trim())&&likeStr.indexOf("createRen")!=-1){
											  sbuffer.append( " and createRen  like '%"+att_AgBusinessUser.getCreateRen()+"%'"   );
										  }else {
											  sbuffer.append( " and createRen   ='"+att_AgBusinessUser.getCreateRen()+"'"   );
										  }
									 }
						   				//创建时间(createDate)
						 				if(att_AgBusinessUser.getCreateDate()!=null){
						   	                   sbuffer.append( " and  createDate='" +att_AgBusinessUser.getCreateDate()+"'" );  
								  		}
						   				//修改时间(editDate)
						 				if(att_AgBusinessUser.getEditDate()!=null){
						   	                   sbuffer.append( " and  editDate='" +att_AgBusinessUser.getEditDate()+"'" );  
								  		}
					       				//修改人(editRen)		 					 
									 if(att_AgBusinessUser.getEditRen()!=null&&
									  !"".equals(att_AgBusinessUser.getEditRen().trim())){
										  if(likeStr!=null&&!"".equals(likeStr.trim())&&likeStr.indexOf("editRen")!=-1){
											  sbuffer.append( " and editRen  like '%"+att_AgBusinessUser.getEditRen()+"%'"   );
										  }else {
											  sbuffer.append( " and editRen   ='"+att_AgBusinessUser.getEditRen()+"'"   );
										  }
									 }
									 //初代人 
									 if(att_AgBusinessUser.getTopPrimaryAgentName()!=null&&
											  !"".equals(att_AgBusinessUser.getTopPrimaryAgentName().trim())){
												  if(likeStr!=null&&!"".equals(likeStr.trim())&&likeStr.indexOf("topPrimaryAgentName")!=-1){
													  sbuffer.append( " and topPrimaryAgentName  like '%"+att_AgBusinessUser.getTopPrimaryAgentName()+"%'"   );
												  }else {
													  sbuffer.append( " and topPrimaryAgentName   ='"+att_AgBusinessUser.getTopPrimaryAgentName()+"'"   );
												  }
											 }
									 //上级业务员名称
									 if(att_AgBusinessUser.getParentAgentName()!=null&&
											  !"".equals(att_AgBusinessUser.getParentAgentName().trim())){
												  if(likeStr!=null&&!"".equals(likeStr.trim())&&likeStr.indexOf("parentAgentName")!=-1){
													  sbuffer.append( " and parentAgentName  like '%"+att_AgBusinessUser.getParentAgentName()+"%'"   );
												  }else {
													  sbuffer.append( " and parentAgentName   ='"+att_AgBusinessUser.getParentAgentName()+"'"   );
												  }
											 }
									// 代理商姓名
									 if(att_AgBusinessUser.getTopReservedAgentName() !=null&&
											  !"".equals(att_AgBusinessUser.getTopReservedAgentName().trim())){
												  if(likeStr!=null&&!"".equals(likeStr.trim())&&likeStr.indexOf("topReservedAgentName")!=-1){
													  sbuffer.append( " and topReservedAgentName  like '%"+att_AgBusinessUser.getTopReservedAgentName()+"%'"   );
												  }else {
													  sbuffer.append( " and topReservedAgentName   ='"+att_AgBusinessUser.getTopReservedAgentName()+"'"   );
												  }
											 }
									//上级业务员名称
									 if(att_AgBusinessUser.getTopReservedAgentRelateToName()!=null&&
											  !"".equals(att_AgBusinessUser.getTopReservedAgentRelateToName().trim())){
												  if(likeStr!=null&&!"".equals(likeStr.trim())&&likeStr.indexOf("topReservedAgentRelateToName")!=-1){
													  sbuffer.append( " and topReservedAgentRelateToName  like '%"+att_AgBusinessUser.getTopReservedAgentRelateToName()+"%'"   );
												  }else {
													  sbuffer.append( " and topReservedAgentRelateToName   ='"+att_AgBusinessUser.getTopReservedAgentRelateToName()+"'"   );
												  }
											 }
									 if(att_AgBusinessUser.getAaiIdType()!=null && att_AgBusinessUser.getAaiIdType().trim().equals("1"))
										 sbuffer.append( " and aaiId is null"   );
									 else if(att_AgBusinessUser.getAaiIdType()!=null && att_AgBusinessUser.getAaiIdType().trim().equals("2"))
										 sbuffer.append( " and aaiId is not null"   );
									 if(att_AgBusinessUser.getParentAgentIdType()!=null && att_AgBusinessUser.getParentAgentIdType().trim().equals("1"))
										 sbuffer.append( " and parentAgentId is null"   );
									 else if(att_AgBusinessUser.getParentAgentIdType()!=null && att_AgBusinessUser.getParentAgentIdType().trim().equals("2"))
										 sbuffer.append( " and parentAgentId is not null"   );
									 
									 
			 //*****************数据库字段处理end***************
			  		if(orderStr!=null&&!"".equals(orderStr.trim())){
									 sbuffer.append( " order by "+orderStr);
						 }
						 /*
						 else {
							  sbuffer.append( " order by  AgentId   desc " );
					      }
					      */
			 
			 return  sbuffer.toString();
	}
	@Override
	public String getBusinessIds(Integer id) throws HSKDBException {
		String reStr=id+",";
		AgBusinessUser agBusinessUser = this.findAgBusinessUserById(id);
		if(agBusinessUser.getParentAgentId()!=null)
			reStr +=getBusinessIds(agBusinessUser.getParentAgentId());
		//else
		//	reStr+=agBusinessUser.getId()+",";
		return reStr;
	}
}