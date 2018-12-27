package com.hsk.angeldoctor.api.daobbase.imp;

import java.util.*;
import com.hsk.supper.dto.comm.PagerModel;
import org.springframework.stereotype.*;
import com.hsk.exception.HSKDBException;
import com.hsk.supper.dao.imp.SupperDao;
import com.hsk.angeldoctor.api.daobbase.*;
import com.hsk.angeldoctor.api.persistence.*;

/** 
 * ag_maid_info表数据库层面操作实现类 
 * @author  作者:admin
 * @version  版本信息:v1.0   创建时间: 2018-08-14 13:31:12
 */
@Component
public class  AgMaidInfoDao extends SupperDao implements IAgMaidInfoDao {	

	/**
	 * 根据ag_maid_info表主键查找AgMaidInfo对象记录
	 * 
	 * @param  AmiId  Integer类型(ag_maid_info表主键)
	 * @return AgMaidInfo ag_maid_info表记录
	 * @throws HSKDBException
	 */	
	public AgMaidInfo findAgMaidInfoById(Integer AmiId) throws HSKDBException{
				AgMaidInfo  att_AgMaidInfo=new AgMaidInfo();				
				if(AmiId!=null){
					att_AgMaidInfo.setAmiId(AmiId);	
				    Object obj=	this.getOne(att_AgMaidInfo);
					if(obj!=null){
						att_AgMaidInfo=(AgMaidInfo) obj;
					}
				}
				return  att_AgMaidInfo;
	}
	 /**
	  * 根据ag_maid_info表主键删除AgMaidInfo对象记录
	  * @param  AmiId  Integer类型(ag_maid_info表主键)
	  * @throws HSKDBException
	  */
	public void deleteAgMaidInfoById(Integer AmiId) throws HSKDBException{ 
		 AgMaidInfo  att_AgMaidInfo=new AgMaidInfo();	
		  if(AmiId!=null){
					  att_AgMaidInfo.setAmiId(AmiId);
				  	  Object obj=	this.getOne(att_AgMaidInfo);
					  if(obj!=null){
							this.deleteObject(obj); 
					  }
			}
	}

	/**
 	 * 根据ag_maid_info表主键修改AgMaidInfo对象记录
     * @param  AmiId  Integer类型(ag_maid_info表主键)
     * @param  att_AgMaidInfo  AgMaidInfo类型(ag_maid_info表记录)
     * @return AgMaidInfo  修改后的AgMaidInfo对象记录
	 * @throws HSKDBException
	 */
	public  AgMaidInfo updateAgMaidInfoById(Integer AmiId,AgMaidInfo att_AgMaidInfo) throws HSKDBException{
		  if(AmiId!=null){
					att_AgMaidInfo.setAmiId(AmiId);
				   	Object obj=	this.getOne(att_AgMaidInfo);
					if(obj!=null){							 
							this.updateObject(obj);
					}
			}
			return  att_AgMaidInfo;
	}
	
	/**
	 * 新增ag_maid_info表 记录
     * @param  att_AgMaidInfo  AgMaidInfo类型(ag_maid_info表记录)
	 * @throws HSKDBException
	 */
	public Integer saveAgMaidInfo(AgMaidInfo att_AgMaidInfo) throws HSKDBException{
		 return this.newObject(att_AgMaidInfo);
	} 
		
	/**
	 * 新增或修改ag_maid_info表记录 ,如果ag_maid_info表主键AgMaidInfo.AmiId为空就是添加，如果非空就是修改
     * @param  att_AgMaidInfo  AgMaidInfo类型(ag_maid_info表记录)
	 * @throws HSKDBException
	 */
	public  AgMaidInfo saveOrUpdateAgMaidInfo(AgMaidInfo att_AgMaidInfo) throws HSKDBException{
		  this.getHibernateTemplate().saveOrUpdate(att_AgMaidInfo);
		  return att_AgMaidInfo;
	}
	
	/**
	 *根据AgMaidInfo对象作为对(ag_maid_info表进行查询，获取列表对象
     * @param  att_AgMaidInfo  AgMaidInfo类型(ag_maid_info表记录)
     * @return List<AgMaidInfo>  列表对象
	 * @throws HSKDBException 
	 */
	 @SuppressWarnings("unchecked")
	public List<AgMaidInfo> getListByAgMaidInfo(AgMaidInfo att_AgMaidInfo) throws HSKDBException{
		String Hql=this.getHql( att_AgMaidInfo); 
		List<AgMaidInfo> list=this.getHibernateTemplate().find(Hql);
		return  list;
	}
	/**
	 *根据AgMaidInfo对象作为对(ag_maid_info表进行查询，获取分页对象
     * @param  att_AgMaidInfo  AgMaidInfo类型(ag_maid_info表记录)
     * @return List<AgMaidInfo>  分页对象
	 * @throws HSKDBException 
	 */
	public PagerModel getPagerModelByAgMaidInfo(AgMaidInfo att_AgMaidInfo)
			throws HSKDBException {
		String Hql=this.getHql(att_AgMaidInfo);
		return this.getHibernateDao().findByPage(Hql); 
	} 
	/**
	 * 根据AgMaidInfo对象获取Hql字符串
     * @param  att_AgMaidInfo  AgMaidInfo类型(ag_maid_info表记录)
	 *  @return hql字符串
	 */
	private String  getHql(AgMaidInfo att_AgMaidInfo){
			 StringBuffer sbuffer = new StringBuffer( " from  AgMaidInfo  where  1=1  ");
			 String likeStr=  att_AgMaidInfo.getTab_like();
			 String orderStr= att_AgMaidInfo.getTab_order();
			 
			 //*****************无关字段处理begin*****************
						   		 //处理in条件 分佣信息ID(amiId)
							     if(att_AgMaidInfo.getAmiId_str()!=null&&
						   		    !"".equals(att_AgMaidInfo.getAmiId_str().trim())){ 
											 String  intStr=att_AgMaidInfo.getAmiId_str().trim();
											 String[]  arrayStr=intStr.split(","); 
											 
											  if(arrayStr.length>0){
												 sbuffer.append(" and ( ");
												 for(int i=0;i<arrayStr.length;i++){
													 String did=arrayStr[i];
													 if(i==arrayStr.length-1){
														 sbuffer.append("  amiId="+did+"   "); 
													 }else {
													 sbuffer.append("  amiId="+did+" or "); 
													 }
												 }
												 sbuffer.append(" ) "); 
											 }
											   
								 	}
						   		 //处理in条件 诊疗ID(adiId)
							     if(att_AgMaidInfo.getAdiId_str()!=null&&
						   		    !"".equals(att_AgMaidInfo.getAdiId_str().trim())){ 
											 String  intStr=att_AgMaidInfo.getAdiId_str().trim();
											 String[]  arrayStr=intStr.split(","); 
											 
											  if(arrayStr.length>0){
												 sbuffer.append(" and ( ");
												 for(int i=0;i<arrayStr.length;i++){
													 String did=arrayStr[i];
													 if(i==arrayStr.length-1){
														 sbuffer.append("  adiId="+did+"   "); 
													 }else {
													 sbuffer.append("  adiId="+did+" or "); 
													 }
												 }
												 sbuffer.append(" ) "); 
											 }
											   
								 	}
						   		 //处理in条件 患者ID(sharePatientId)
							     if(att_AgMaidInfo.getSharePatientId_str()!=null&&
						   		    !"".equals(att_AgMaidInfo.getSharePatientId_str().trim())){ 
											 String  intStr=att_AgMaidInfo.getSharePatientId_str().trim();
											 String[]  arrayStr=intStr.split(","); 
											 
											  if(arrayStr.length>0){
												 sbuffer.append(" and ( ");
												 for(int i=0;i<arrayStr.length;i++){
													 String did=arrayStr[i];
													 if(i==arrayStr.length-1){
														 sbuffer.append("  sharePatientId="+did+"   "); 
													 }else {
													 sbuffer.append("  sharePatientId="+did+" or "); 
													 }
												 }
												 sbuffer.append(" ) "); 
											 }
											   
								 	}
						   		 //处理in条件 一级代理人ID(shareFirstAgentId)
							     if(att_AgMaidInfo.getShareFirstAgentId_str()!=null&&
						   		    !"".equals(att_AgMaidInfo.getShareFirstAgentId_str().trim())){ 
											 String  intStr=att_AgMaidInfo.getShareFirstAgentId_str().trim();
											 String[]  arrayStr=intStr.split(","); 
											 
											  if(arrayStr.length>0){
												 sbuffer.append(" and ( ");
												 for(int i=0;i<arrayStr.length;i++){
													 String did=arrayStr[i];
													 if(i==arrayStr.length-1){
														 sbuffer.append("  shareFirstAgentId="+did+"   "); 
													 }else {
													 sbuffer.append("  shareFirstAgentId="+did+" or "); 
													 }
												 }
												 sbuffer.append(" ) "); 
											 }
											   
								 	}
						   		 //处理in条件 二级代理人ID(shareSecondAgentId)
							     if(att_AgMaidInfo.getShareSecondAgentId_str()!=null&&
						   		    !"".equals(att_AgMaidInfo.getShareSecondAgentId_str().trim())){ 
											 String  intStr=att_AgMaidInfo.getShareSecondAgentId_str().trim();
											 String[]  arrayStr=intStr.split(","); 
											 
											  if(arrayStr.length>0){
												 sbuffer.append(" and ( ");
												 for(int i=0;i<arrayStr.length;i++){
													 String did=arrayStr[i];
													 if(i==arrayStr.length-1){
														 sbuffer.append("  shareSecondAgentId="+did+"   "); 
													 }else {
													 sbuffer.append("  shareSecondAgentId="+did+" or "); 
													 }
												 }
												 sbuffer.append(" ) "); 
											 }
											   
								 	}
						   		 //处理in条件 代理商ID(shareTopOrganizationId)
							     if(att_AgMaidInfo.getShareTopOrganizationId_str()!=null&&
						   		    !"".equals(att_AgMaidInfo.getShareTopOrganizationId_str().trim())){ 
											 String  intStr=att_AgMaidInfo.getShareTopOrganizationId_str().trim();
											 String[]  arrayStr=intStr.split(","); 
											 
											  if(arrayStr.length>0){
												 sbuffer.append(" and ( ");
												 for(int i=0;i<arrayStr.length;i++){
													 String did=arrayStr[i];
													 if(i==arrayStr.length-1){
														 sbuffer.append("  shareTopOrganizationId="+did+"   "); 
													 }else {
													 sbuffer.append("  shareTopOrganizationId="+did+" or "); 
													 }
												 }
												 sbuffer.append(" ) "); 
											 }
											   
								 	}
						   		 //处理in条件 预约代理人ID(shareTopReservedAgentid)
							     if(att_AgMaidInfo.getShareTopReservedAgentid_str()!=null&&
						   		    !"".equals(att_AgMaidInfo.getShareTopReservedAgentid_str().trim())){ 
											 String  intStr=att_AgMaidInfo.getShareTopReservedAgentid_str().trim();
											 String[]  arrayStr=intStr.split(","); 
											 
											  if(arrayStr.length>0){
												 sbuffer.append(" and ( ");
												 for(int i=0;i<arrayStr.length;i++){
													 String did=arrayStr[i];
													 if(i==arrayStr.length-1){
														 sbuffer.append("  shareTopReservedAgentid="+did+"   "); 
													 }else {
													 sbuffer.append("  shareTopReservedAgentid="+did+" or "); 
													 }
												 }
												 sbuffer.append(" ) "); 
											 }
											   
								 	}
						   		 //处理in条件 病人提现申请ID(patientWithdrawId)
							     if(att_AgMaidInfo.getPatientWithdrawId_str()!=null&&
						   		    !"".equals(att_AgMaidInfo.getPatientWithdrawId_str().trim())){ 
											 String  intStr=att_AgMaidInfo.getPatientWithdrawId_str().trim();
											 String[]  arrayStr=intStr.split(","); 
											 
											  if(arrayStr.length>0){
												 sbuffer.append(" and ( ");
												 for(int i=0;i<arrayStr.length;i++){
													 String did=arrayStr[i];
													 if(i==arrayStr.length-1){
														 sbuffer.append("  patientWithdrawId="+did+"   "); 
													 }else {
													 sbuffer.append("  patientWithdrawId="+did+" or "); 
													 }
												 }
												 sbuffer.append(" ) "); 
											 }
											   
								 	}
						   		 //处理in条件 一级代理人提现ID(firstAgentWithdrawId)
							     if(att_AgMaidInfo.getFirstAgentWithdrawId_str()!=null&&
						   		    !"".equals(att_AgMaidInfo.getFirstAgentWithdrawId_str().trim())){ 
											 String  intStr=att_AgMaidInfo.getFirstAgentWithdrawId_str().trim();
											 String[]  arrayStr=intStr.split(","); 
											 
											  if(arrayStr.length>0){
												 sbuffer.append(" and ( ");
												 for(int i=0;i<arrayStr.length;i++){
													 String did=arrayStr[i];
													 if(i==arrayStr.length-1){
														 sbuffer.append("  firstAgentWithdrawId="+did+"   "); 
													 }else {
													 sbuffer.append("  firstAgentWithdrawId="+did+" or "); 
													 }
												 }
												 sbuffer.append(" ) "); 
											 }
											   
								 	}
						   		 //处理in条件 二级代理人提现ID(secondAgentWithdrawId)
							     if(att_AgMaidInfo.getSecondAgentWithdrawId_str()!=null&&
						   		    !"".equals(att_AgMaidInfo.getSecondAgentWithdrawId_str().trim())){ 
											 String  intStr=att_AgMaidInfo.getSecondAgentWithdrawId_str().trim();
											 String[]  arrayStr=intStr.split(","); 
											 
											  if(arrayStr.length>0){
												 sbuffer.append(" and ( ");
												 for(int i=0;i<arrayStr.length;i++){
													 String did=arrayStr[i];
													 if(i==arrayStr.length-1){
														 sbuffer.append("  secondAgentWithdrawId="+did+"   "); 
													 }else {
													 sbuffer.append("  secondAgentWithdrawId="+did+" or "); 
													 }
												 }
												 sbuffer.append(" ) "); 
											 }
											   
								 	}
						   		 //处理in条件 代理商提现ID(topOrganizationWithdrawid)
							     if(att_AgMaidInfo.getTopOrganizationWithdrawid_str()!=null&&
						   		    !"".equals(att_AgMaidInfo.getTopOrganizationWithdrawid_str().trim())){ 
											 String  intStr=att_AgMaidInfo.getTopOrganizationWithdrawid_str().trim();
											 String[]  arrayStr=intStr.split(","); 
											 
											  if(arrayStr.length>0){
												 sbuffer.append(" and ( ");
												 for(int i=0;i<arrayStr.length;i++){
													 String did=arrayStr[i];
													 if(i==arrayStr.length-1){
														 sbuffer.append("  topOrganizationWithdrawid="+did+"   "); 
													 }else {
													 sbuffer.append("  topOrganizationWithdrawid="+did+" or "); 
													 }
												 }
												 sbuffer.append(" ) "); 
											 }
											   
								 	}
						   		 //处理in条件 预约代理人提现ID(topReservedAgentWithdrawId)
							     if(att_AgMaidInfo.getTopReservedAgentWithdrawId_str()!=null&&
						   		    !"".equals(att_AgMaidInfo.getTopReservedAgentWithdrawId_str().trim())){ 
											 String  intStr=att_AgMaidInfo.getTopReservedAgentWithdrawId_str().trim();
											 String[]  arrayStr=intStr.split(","); 
											 
											  if(arrayStr.length>0){
												 sbuffer.append(" and ( ");
												 for(int i=0;i<arrayStr.length;i++){
													 String did=arrayStr[i];
													 if(i==arrayStr.length-1){
														 sbuffer.append("  topReservedAgentWithdrawId="+did+"   "); 
													 }else {
													 sbuffer.append("  topReservedAgentWithdrawId="+did+" or "); 
													 }
												 }
												 sbuffer.append(" ) "); 
											 }
											   
								 	}
								 		//时间类型开始条件处理  创建时间(createDate)
									  if(att_AgMaidInfo.getCreateDate_start()!=null){
								   	    	sbuffer.append( " and  createDate<='" +att_AgMaidInfo.getCreateDate_start()+"'" );  
										 }
								 	  //时间类型结束条件处理 创建时间(createDate)
									 	if(att_AgMaidInfo.getCreateDate_end()!=null){
						   	      			sbuffer.append( " and  createDate>'" +att_AgMaidInfo.getCreateDate_end()+"'" );  
								  	     } 
								 		//时间类型开始条件处理  修改时间(editDate)
									  if(att_AgMaidInfo.getEditDate_start()!=null){
								   	    	sbuffer.append( " and  editDate<='" +att_AgMaidInfo.getEditDate_start()+"'" );  
										 }
								 	  //时间类型结束条件处理 修改时间(editDate)
									 	if(att_AgMaidInfo.getEditDate_end()!=null){
						   	      			sbuffer.append( " and  editDate>'" +att_AgMaidInfo.getEditDate_end()+"'" );  
								  	     } 
			 //*****************无关字段处理end*****************
			 //*****************数据库字段处理begin*************
								  		//分佣信息ID(amiId)
					 					if(att_AgMaidInfo.getAmiId()!=null){
											 sbuffer.append( " and amiId=" +att_AgMaidInfo.getAmiId() );
										 }
								  		//诊疗ID(adiId)
					 					if(att_AgMaidInfo.getAdiId()!=null){
											 sbuffer.append( " and adiId=" +att_AgMaidInfo.getAdiId() );
										 }
								  		//患者ID(sharePatientId)
					 					if(att_AgMaidInfo.getSharePatientId()!=null){
											 sbuffer.append( " and sharePatientId=" +att_AgMaidInfo.getSharePatientId() );
										 }
								  		//一级代理人ID(shareFirstAgentId)
					 					if(att_AgMaidInfo.getShareFirstAgentId()!=null){
											 sbuffer.append( " and shareFirstAgentId=" +att_AgMaidInfo.getShareFirstAgentId() );
										 }
								  		//二级代理人ID(shareSecondAgentId)
					 					if(att_AgMaidInfo.getShareSecondAgentId()!=null){
											 sbuffer.append( " and shareSecondAgentId=" +att_AgMaidInfo.getShareSecondAgentId() );
										 }
								  		//代理商ID(shareTopOrganizationId)
					 					if(att_AgMaidInfo.getShareTopOrganizationId()!=null){
											 sbuffer.append( " and shareTopOrganizationId=" +att_AgMaidInfo.getShareTopOrganizationId() );
										 }
								  		//预约代理人ID(shareTopReservedAgentid)
					 					if(att_AgMaidInfo.getShareTopReservedAgentid()!=null){
											 sbuffer.append( " and shareTopReservedAgentid=" +att_AgMaidInfo.getShareTopReservedAgentid() );
										 }
					       				//病人是否提现(isPatientWithdraw)		 					 
									 if(att_AgMaidInfo.getIsPatientWithdraw()!=null&&
									  !"".equals(att_AgMaidInfo.getIsPatientWithdraw().trim())){
										  if(likeStr!=null&&!"".equals(likeStr.trim())&&likeStr.indexOf("isPatientWithdraw")!=-1){
											  sbuffer.append( " and isPatientWithdraw  like '%"+att_AgMaidInfo.getIsPatientWithdraw()+"%'"   );
										  }else {
											  sbuffer.append( " and isPatientWithdraw   ='"+att_AgMaidInfo.getIsPatientWithdraw()+"'"   );
										  }
									 }
								  		//病人提现申请ID(patientWithdrawId)
					 					if(att_AgMaidInfo.getPatientWithdrawId()!=null){
											 sbuffer.append( " and patientWithdrawId=" +att_AgMaidInfo.getPatientWithdrawId() );
										 }
					       				//一级代理人是否提现(isFirstAgentWithdraw)		 					 
									 if(att_AgMaidInfo.getIsFirstAgentWithdraw()!=null&&
									  !"".equals(att_AgMaidInfo.getIsFirstAgentWithdraw().trim())){
										  if(likeStr!=null&&!"".equals(likeStr.trim())&&likeStr.indexOf("isFirstAgentWithdraw")!=-1){
											  sbuffer.append( " and isFirstAgentWithdraw  like '%"+att_AgMaidInfo.getIsFirstAgentWithdraw()+"%'"   );
										  }else {
											  sbuffer.append( " and isFirstAgentWithdraw   ='"+att_AgMaidInfo.getIsFirstAgentWithdraw()+"'"   );
										  }
									 }
								  		//一级代理人提现ID(firstAgentWithdrawId)
					 					if(att_AgMaidInfo.getFirstAgentWithdrawId()!=null){
											 sbuffer.append( " and firstAgentWithdrawId=" +att_AgMaidInfo.getFirstAgentWithdrawId() );
										 }
					       				//二级代理人是否提现(isSecondAgentWithdraw)		 					 
									 if(att_AgMaidInfo.getIsSecondAgentWithdraw()!=null&&
									  !"".equals(att_AgMaidInfo.getIsSecondAgentWithdraw().trim())){
										  if(likeStr!=null&&!"".equals(likeStr.trim())&&likeStr.indexOf("isSecondAgentWithdraw")!=-1){
											  sbuffer.append( " and isSecondAgentWithdraw  like '%"+att_AgMaidInfo.getIsSecondAgentWithdraw()+"%'"   );
										  }else {
											  sbuffer.append( " and isSecondAgentWithdraw   ='"+att_AgMaidInfo.getIsSecondAgentWithdraw()+"'"   );
										  }
									 }
								  		//二级代理人提现ID(secondAgentWithdrawId)
					 					if(att_AgMaidInfo.getSecondAgentWithdrawId()!=null){
											 sbuffer.append( " and secondAgentWithdrawId=" +att_AgMaidInfo.getSecondAgentWithdrawId() );
										 }
					       				//代理商是否提现(isTopOrganizationWithdraw)		 					 
									 if(att_AgMaidInfo.getIsTopOrganizationWithdraw()!=null&&
									  !"".equals(att_AgMaidInfo.getIsTopOrganizationWithdraw().trim())){
										  if(likeStr!=null&&!"".equals(likeStr.trim())&&likeStr.indexOf("isTopOrganizationWithdraw")!=-1){
											  sbuffer.append( " and isTopOrganizationWithdraw  like '%"+att_AgMaidInfo.getIsTopOrganizationWithdraw()+"%'"   );
										  }else {
											  sbuffer.append( " and isTopOrganizationWithdraw   ='"+att_AgMaidInfo.getIsTopOrganizationWithdraw()+"'"   );
										  }
									 }
								  		//代理商提现ID(topOrganizationWithdrawid)
					 					if(att_AgMaidInfo.getTopOrganizationWithdrawid()!=null){
											 sbuffer.append( " and topOrganizationWithdrawid=" +att_AgMaidInfo.getTopOrganizationWithdrawid() );
										 }
					       				//预约代理人是否提现(isTopReservedAgentWithdraw)		 					 
									 if(att_AgMaidInfo.getIsTopReservedAgentWithdraw()!=null&&
									  !"".equals(att_AgMaidInfo.getIsTopReservedAgentWithdraw().trim())){
										  if(likeStr!=null&&!"".equals(likeStr.trim())&&likeStr.indexOf("isTopReservedAgentWithdraw")!=-1){
											  sbuffer.append( " and isTopReservedAgentWithdraw  like '%"+att_AgMaidInfo.getIsTopReservedAgentWithdraw()+"%'"   );
										  }else {
											  sbuffer.append( " and isTopReservedAgentWithdraw   ='"+att_AgMaidInfo.getIsTopReservedAgentWithdraw()+"'"   );
										  }
									 }
								  		//预约代理人提现ID(topReservedAgentWithdrawId)
					 					if(att_AgMaidInfo.getTopReservedAgentWithdrawId()!=null){
											 sbuffer.append( " and topReservedAgentWithdrawId=" +att_AgMaidInfo.getTopReservedAgentWithdrawId() );
										 }
					       				//状态:0正常(status)		 					 
									 if(att_AgMaidInfo.getStatus()!=null&&
									  !"".equals(att_AgMaidInfo.getStatus().trim())){
										  if(likeStr!=null&&!"".equals(likeStr.trim())&&likeStr.indexOf("status")!=-1){
											  sbuffer.append( " and status  like '%"+att_AgMaidInfo.getStatus()+"%'"   );
										  }else {
											  sbuffer.append( " and status   ='"+att_AgMaidInfo.getStatus()+"'"   );
										  }
									 }
					       				//创建人(createRen)		 					 
									 if(att_AgMaidInfo.getCreateRen()!=null&&
									  !"".equals(att_AgMaidInfo.getCreateRen().trim())){
										  if(likeStr!=null&&!"".equals(likeStr.trim())&&likeStr.indexOf("createRen")!=-1){
											  sbuffer.append( " and createRen  like '%"+att_AgMaidInfo.getCreateRen()+"%'"   );
										  }else {
											  sbuffer.append( " and createRen   ='"+att_AgMaidInfo.getCreateRen()+"'"   );
										  }
									 }
						   				//创建时间(createDate)
						 				if(att_AgMaidInfo.getCreateDate()!=null){
						   	                   sbuffer.append( " and  createDate='" +att_AgMaidInfo.getCreateDate()+"'" );  
								  		}
					       				//修改人(editRen)		 					 
									 if(att_AgMaidInfo.getEditRen()!=null&&
									  !"".equals(att_AgMaidInfo.getEditRen().trim())){
										  if(likeStr!=null&&!"".equals(likeStr.trim())&&likeStr.indexOf("editRen")!=-1){
											  sbuffer.append( " and editRen  like '%"+att_AgMaidInfo.getEditRen()+"%'"   );
										  }else {
											  sbuffer.append( " and editRen   ='"+att_AgMaidInfo.getEditRen()+"'"   );
										  }
									 }
						   				//修改时间(editDate)
						 				if(att_AgMaidInfo.getEditDate()!=null){
						   	                   sbuffer.append( " and  editDate='" +att_AgMaidInfo.getEditDate()+"'" );  
								  		}
			 //*****************数据库字段处理end***************
			  		if(orderStr!=null&&!"".equals(orderStr.trim())){
									 sbuffer.append( " order by "+orderStr);
						 }
						 /*
						 else {
							  sbuffer.append( " order by  AmiId   desc " );
					      }
					      */
			 
			 return  sbuffer.toString();
	}
	@Override
	public Map<String, Object> getHosCountMap(Integer organizationId) throws HSKDBException {
		Map<String, Object> reMap = new HashMap<String,Object>();
		String sql = "SELECT SUM(b.total_fee) AS shareAmount,SUM(b.reception_fee) AS receptionAmount,SUM(b.reception_fee+b.total_fee_to_pay) AS freeAmount "
					+"FROM ag_deal_info a ,ag_maid_info b WHERE a.aoi_id=b.aoi_id AND a.organization_id="+organizationId;
		List<Map<String, Object>> reList = this.getJdbcDao().query(sql);
		if(reList!=null && reList.size() >0)
			reMap=reList.get(0);
		return reMap;
	}
}