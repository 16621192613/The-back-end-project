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
 * ag_withdraw_info表数据库层面操作实现类 
 * @author  作者:admin
 * @version  版本信息:v1.0   创建时间: 2018-08-14 13:31:12
 */
@Component
public class  AgWithdrawInfoDao extends SupperDao implements IAgWithdrawInfoDao {	

	/**
	 * 根据ag_withdraw_info表主键查找AgWithdrawInfo对象记录
	 * 
	 * @param  AwiId  Integer类型(ag_withdraw_info表主键)
	 * @return AgWithdrawInfo ag_withdraw_info表记录
	 * @throws HSKDBException
	 */	
	public AgWithdrawInfo findAgWithdrawInfoById(Integer AwiId) throws HSKDBException{
				AgWithdrawInfo  att_AgWithdrawInfo=new AgWithdrawInfo();				
				if(AwiId!=null){
					att_AgWithdrawInfo.setAwiId(AwiId);	
				    Object obj=	this.getOne(att_AgWithdrawInfo);
					if(obj!=null){
						att_AgWithdrawInfo=(AgWithdrawInfo) obj;
					}
				}
				return  att_AgWithdrawInfo;
	}
	 /**
	  * 根据ag_withdraw_info表主键删除AgWithdrawInfo对象记录
	  * @param  AwiId  Integer类型(ag_withdraw_info表主键)
	  * @throws HSKDBException
	  */
	public void deleteAgWithdrawInfoById(Integer AwiId) throws HSKDBException{ 
		 AgWithdrawInfo  att_AgWithdrawInfo=new AgWithdrawInfo();	
		  if(AwiId!=null){
					  att_AgWithdrawInfo.setAwiId(AwiId);
				  	  Object obj=	this.getOne(att_AgWithdrawInfo);
					  if(obj!=null){
							this.deleteObject(obj); 
					  }
			}
	}

	/**
 	 * 根据ag_withdraw_info表主键修改AgWithdrawInfo对象记录
     * @param  AwiId  Integer类型(ag_withdraw_info表主键)
     * @param  att_AgWithdrawInfo  AgWithdrawInfo类型(ag_withdraw_info表记录)
     * @return AgWithdrawInfo  修改后的AgWithdrawInfo对象记录
	 * @throws HSKDBException
	 */
	public  AgWithdrawInfo updateAgWithdrawInfoById(Integer AwiId,AgWithdrawInfo att_AgWithdrawInfo) throws HSKDBException{
		  if(AwiId!=null){
					att_AgWithdrawInfo.setAwiId(AwiId);
				   	Object obj=	this.getOne(att_AgWithdrawInfo);
					if(obj!=null){							 
							this.updateObject(obj);
					}
			}
			return  att_AgWithdrawInfo;
	}
	
	/**
	 * 新增ag_withdraw_info表 记录
     * @param  att_AgWithdrawInfo  AgWithdrawInfo类型(ag_withdraw_info表记录)
	 * @throws HSKDBException
	 */
	public Integer saveAgWithdrawInfo(AgWithdrawInfo att_AgWithdrawInfo) throws HSKDBException{
		 return this.newObject(att_AgWithdrawInfo);
	} 
		
	/**
	 * 新增或修改ag_withdraw_info表记录 ,如果ag_withdraw_info表主键AgWithdrawInfo.AwiId为空就是添加，如果非空就是修改
     * @param  att_AgWithdrawInfo  AgWithdrawInfo类型(ag_withdraw_info表记录)
	 * @throws HSKDBException
	 */
	public  AgWithdrawInfo saveOrUpdateAgWithdrawInfo(AgWithdrawInfo att_AgWithdrawInfo) throws HSKDBException{
		  this.getHibernateTemplate().saveOrUpdate(att_AgWithdrawInfo);
		  return att_AgWithdrawInfo;
	}
	
	/**
	 *根据AgWithdrawInfo对象作为对(ag_withdraw_info表进行查询，获取列表对象
     * @param  att_AgWithdrawInfo  AgWithdrawInfo类型(ag_withdraw_info表记录)
     * @return List<AgWithdrawInfo>  列表对象
	 * @throws HSKDBException 
	 */
	 @SuppressWarnings("unchecked")
	public List<AgWithdrawInfo> getListByAgWithdrawInfo(AgWithdrawInfo att_AgWithdrawInfo) throws HSKDBException{
		String Hql=this.getHql( att_AgWithdrawInfo); 
		List<AgWithdrawInfo> list=this.getHibernateTemplate().find(Hql);
		return  list;
	}
	/**
	 *根据AgWithdrawInfo对象作为对(ag_withdraw_info表进行查询，获取分页对象
     * @param  att_AgWithdrawInfo  AgWithdrawInfo类型(ag_withdraw_info表记录)
     * @return List<AgWithdrawInfo>  分页对象
	 * @throws HSKDBException 
	 */
	public PagerModel getPagerModelByAgWithdrawInfo(AgWithdrawInfo att_AgWithdrawInfo)
			throws HSKDBException {
		String Hql=this.getHql(att_AgWithdrawInfo);
		return this.getHibernateDao().findByPage(Hql); 
	} 
	/**
	 * 根据AgWithdrawInfo对象获取Hql字符串
     * @param  att_AgWithdrawInfo  AgWithdrawInfo类型(ag_withdraw_info表记录)
	 *  @return hql字符串
	 */
	private String  getHql(AgWithdrawInfo att_AgWithdrawInfo){
			 StringBuffer sbuffer = new StringBuffer( " from  AgWithdrawInfo  where  1=1  ");
			 String likeStr=  att_AgWithdrawInfo.getTab_like();
			 String orderStr= att_AgWithdrawInfo.getTab_order();
			 
			 //*****************无关字段处理begin*****************
						   		 //处理in条件 提现申请ID(awiId)
							     if(att_AgWithdrawInfo.getAwiId_str()!=null&&
						   		    !"".equals(att_AgWithdrawInfo.getAwiId_str().trim())){ 
											 String  intStr=att_AgWithdrawInfo.getAwiId_str().trim();
											 String[]  arrayStr=intStr.split(","); 
											 
											  if(arrayStr.length>0){
												 sbuffer.append(" and ( ");
												 for(int i=0;i<arrayStr.length;i++){
													 String did=arrayStr[i];
													 if(i==arrayStr.length-1){
														 sbuffer.append("  awiId="+did+"   "); 
													 }else {
													 sbuffer.append("  awiId="+did+" or "); 
													 }
												 }
												 sbuffer.append(" ) "); 
											 }
											   
								 	}
						   		 //处理in条件 申请人ID(awiUserId)
							     if(att_AgWithdrawInfo.getAwiUserId_str()!=null&&
						   		    !"".equals(att_AgWithdrawInfo.getAwiUserId_str().trim())){ 
											 String  intStr=att_AgWithdrawInfo.getAwiUserId_str().trim();
											 String[]  arrayStr=intStr.split(","); 
											 
											  if(arrayStr.length>0){
												 sbuffer.append(" and ( ");
												 for(int i=0;i<arrayStr.length;i++){
													 String did=arrayStr[i];
													 if(i==arrayStr.length-1){
														 sbuffer.append("  awiUserId="+did+"   "); 
													 }else {
													 sbuffer.append("  awiUserId="+did+" or "); 
													 }
												 }
												 sbuffer.append(" ) "); 
											 }
											   
								 	}
								 		//时间类型开始条件处理  审核时间(checkFinishDate)
									  if(att_AgWithdrawInfo.getCheckFinishDate_start()!=null){
								   	    	sbuffer.append( " and  checkFinishDate<='" +att_AgWithdrawInfo.getCheckFinishDate_start()+"'" );  
										 }
								 	  //时间类型结束条件处理 审核时间(checkFinishDate)
									 	if(att_AgWithdrawInfo.getCheckFinishDate_end()!=null){
						   	      			sbuffer.append( " and  checkFinishDate>'" +att_AgWithdrawInfo.getCheckFinishDate_end()+"'" );  
								  	     } 
								 		//时间类型开始条件处理  打款时间(withdrawFinishDate)
									  if(att_AgWithdrawInfo.getWithdrawFinishDate_start()!=null){
								   	    	sbuffer.append( " and  withdrawFinishDate<='" +att_AgWithdrawInfo.getWithdrawFinishDate_start()+"'" );  
										 }
								 	  //时间类型结束条件处理 打款时间(withdrawFinishDate)
									 	if(att_AgWithdrawInfo.getWithdrawFinishDate_end()!=null){
						   	      			sbuffer.append( " and  withdrawFinishDate>'" +att_AgWithdrawInfo.getWithdrawFinishDate_end()+"'" );  
								  	     } 
						   		 //处理in条件 最后一次操作人(lastPortalUserId)
							     if(att_AgWithdrawInfo.getLastPortalUserId_str()!=null&&
						   		    !"".equals(att_AgWithdrawInfo.getLastPortalUserId_str().trim())){ 
											 String  intStr=att_AgWithdrawInfo.getLastPortalUserId_str().trim();
											 String[]  arrayStr=intStr.split(","); 
											 
											  if(arrayStr.length>0){
												 sbuffer.append(" and ( ");
												 for(int i=0;i<arrayStr.length;i++){
													 String did=arrayStr[i];
													 if(i==arrayStr.length-1){
														 sbuffer.append("  lastPortalUserId="+did+"   "); 
													 }else {
													 sbuffer.append("  lastPortalUserId="+did+" or "); 
													 }
												 }
												 sbuffer.append(" ) "); 
											 }
											   
								 	}
							     SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");
							 		//时间类型开始条件处理  创建时间(createDate)
								  if(att_AgWithdrawInfo.getCreateDate_start()!=null){
							   	    	sbuffer.append( " and  createDate >='" +sdf.format(att_AgWithdrawInfo.getCreateDate_start())+" 00:00:00'" );  
									 }
							 	  //时间类型结束条件处理 创建时间(createDate)
								 	if(att_AgWithdrawInfo.getCreateDate_end()!=null){
					   	      			sbuffer.append( " and  createDate<='" +sdf.format(att_AgWithdrawInfo.getCreateDate_end())+" 23:59:59'" );  
							  	     } 
								 		//时间类型开始条件处理  修改时间(editDate)
									  if(att_AgWithdrawInfo.getEditDate_start()!=null){
								   	    	sbuffer.append( " and  editDate<='" +att_AgWithdrawInfo.getEditDate_start()+"'" );  
										 }
								 	  //时间类型结束条件处理 修改时间(editDate)
									 	if(att_AgWithdrawInfo.getEditDate_end()!=null){
						   	      			sbuffer.append( " and  editDate>'" +att_AgWithdrawInfo.getEditDate_end()+"'" );  
								  	     } 
			 //*****************无关字段处理end*****************
			 //*****************数据库字段处理begin*************
								  		//提现申请ID(awiId)
					 					if(att_AgWithdrawInfo.getAwiId()!=null){
											 sbuffer.append( " and awiId=" +att_AgWithdrawInfo.getAwiId() );
										 }
								  		//申请人ID(awiUserId)
					 					if(att_AgWithdrawInfo.getAwiUserId()!=null){
											 sbuffer.append( " and awiUserId=" +att_AgWithdrawInfo.getAwiUserId() );
										 }
					       				//申请编号(serialNumber)		 					 
									 if(att_AgWithdrawInfo.getSerialNumber()!=null&&
									  !"".equals(att_AgWithdrawInfo.getSerialNumber().trim())){
										  if(likeStr!=null&&!"".equals(likeStr.trim())&&likeStr.indexOf("serialNumber")!=-1){
											  sbuffer.append( " and serialNumber  like '%"+att_AgWithdrawInfo.getSerialNumber()+"%'"   );
										  }else {
											  sbuffer.append( " and serialNumber   ='"+att_AgWithdrawInfo.getSerialNumber()+"'"   );
										  }
									 }
					       				//申请类型:1医院提现申请，2员工提现申请，3供应商提现申请，4患者提现申请(withdrawType)		 					 
									 if(att_AgWithdrawInfo.getWithdrawType()!=null&&
									  !"".equals(att_AgWithdrawInfo.getWithdrawType().trim())){
										  if(likeStr!=null&&!"".equals(likeStr.trim())&&likeStr.indexOf("withdrawType")!=-1){
											  sbuffer.append( " and withdrawType  like '%"+att_AgWithdrawInfo.getWithdrawType()+"%'"   );
										  }else {
											  sbuffer.append( " and withdrawType   ='"+att_AgWithdrawInfo.getWithdrawType()+"'"   );
										  }
									 }
					       				//申请人姓名(contextName)		 					 
									 if(att_AgWithdrawInfo.getContextName()!=null&&
									  !"".equals(att_AgWithdrawInfo.getContextName().trim())){
										  if(likeStr!=null&&!"".equals(likeStr.trim())&&likeStr.indexOf("contextName")!=-1){
											  sbuffer.append( " and contextName  like '%"+att_AgWithdrawInfo.getContextName()+"%'"   );
										  }else {
											  sbuffer.append( " and contextName   ='"+att_AgWithdrawInfo.getContextName()+"'"   );
										  }
									 }
					       				//申请人手机号(contextMobile)		 					 
									 if(att_AgWithdrawInfo.getContextMobile()!=null&&
									  !"".equals(att_AgWithdrawInfo.getContextMobile().trim())){
										  if(likeStr!=null&&!"".equals(likeStr.trim())&&likeStr.indexOf("contextMobile")!=-1){
											  sbuffer.append( " and contextMobile  like '%"+att_AgWithdrawInfo.getContextMobile()+"%'"   );
										  }else {
											  sbuffer.append( " and contextMobile   ='"+att_AgWithdrawInfo.getContextMobile()+"'"   );
										  }
									 }
					       				//银行名称(contextBankName)		 					 
									 if(att_AgWithdrawInfo.getContextBankName()!=null&&
									  !"".equals(att_AgWithdrawInfo.getContextBankName().trim())){
										  if(likeStr!=null&&!"".equals(likeStr.trim())&&likeStr.indexOf("contextBankName")!=-1){
											  sbuffer.append( " and contextBankName  like '%"+att_AgWithdrawInfo.getContextBankName()+"%'"   );
										  }else {
											  sbuffer.append( " and contextBankName   ='"+att_AgWithdrawInfo.getContextBankName()+"'"   );
										  }
									 }
					       				//银行账户名称(contextAccountName)		 					 
									 if(att_AgWithdrawInfo.getContextAccountName()!=null&&
									  !"".equals(att_AgWithdrawInfo.getContextAccountName().trim())){
										  if(likeStr!=null&&!"".equals(likeStr.trim())&&likeStr.indexOf("contextAccountName")!=-1){
											  sbuffer.append( " and contextAccountName  like '%"+att_AgWithdrawInfo.getContextAccountName()+"%'"   );
										  }else {
											  sbuffer.append( " and contextAccountName   ='"+att_AgWithdrawInfo.getContextAccountName()+"'"   );
										  }
									 }
					       				//银行账号(contextAccountNumber)		 					 
									 if(att_AgWithdrawInfo.getContextAccountNumber()!=null&&
									  !"".equals(att_AgWithdrawInfo.getContextAccountNumber().trim())){
										  if(likeStr!=null&&!"".equals(likeStr.trim())&&likeStr.indexOf("contextAccountNumber")!=-1){
											  sbuffer.append( " and contextAccountNumber  like '%"+att_AgWithdrawInfo.getContextAccountNumber()+"%'"   );
										  }else {
											  sbuffer.append( " and contextAccountNumber   ='"+att_AgWithdrawInfo.getContextAccountNumber()+"'"   );
										  }
									 }
						   				//审核时间(checkFinishDate)
						 				if(att_AgWithdrawInfo.getCheckFinishDate()!=null){
						   	                   sbuffer.append( " and  checkFinishDate='" +att_AgWithdrawInfo.getCheckFinishDate()+"'" );  
								  		}
						   				//打款时间(withdrawFinishDate)
						 				if(att_AgWithdrawInfo.getWithdrawFinishDate()!=null){
						   	                   sbuffer.append( " and  withdrawFinishDate='" +att_AgWithdrawInfo.getWithdrawFinishDate()+"'" );  
								  		}
								  		//最后一次操作人(lastPortalUserId)
					 					if(att_AgWithdrawInfo.getLastPortalUserId()!=null){
											 sbuffer.append( " and lastPortalUserId=" +att_AgWithdrawInfo.getLastPortalUserId() );
										 }
					       				//审核失败原因(checkFailureReason)		 					 
									 if(att_AgWithdrawInfo.getCheckFailureReason()!=null&&
									  !"".equals(att_AgWithdrawInfo.getCheckFailureReason().trim())){
										  if(likeStr!=null&&!"".equals(likeStr.trim())&&likeStr.indexOf("checkFailureReason")!=-1){
											  sbuffer.append( " and checkFailureReason  like '%"+att_AgWithdrawInfo.getCheckFailureReason()+"%'"   );
										  }else {
											  sbuffer.append( " and checkFailureReason   ='"+att_AgWithdrawInfo.getCheckFailureReason()+"'"   );
										  }
									 }
					       				//审核状态(checkStatus)		 					 
									 if(att_AgWithdrawInfo.getCheckStatus()!=null&&
									  !"".equals(att_AgWithdrawInfo.getCheckStatus().trim())){
										  if(likeStr!=null&&!"".equals(likeStr.trim())&&likeStr.indexOf("checkStatus")!=-1){
											  sbuffer.append( " and checkStatus  like '%"+att_AgWithdrawInfo.getCheckStatus()+"%'"   );
										  }else {
											  sbuffer.append( " and checkStatus   ='"+att_AgWithdrawInfo.getCheckStatus()+"'"   );
										  }
									 }
					       				//打款状态(withdrawStatus)		 					 
									 if(att_AgWithdrawInfo.getWithdrawStatus()!=null&&
									  !"".equals(att_AgWithdrawInfo.getWithdrawStatus().trim())){
										  if(likeStr!=null&&!"".equals(likeStr.trim())&&likeStr.indexOf("withdrawStatus")!=-1){
											  sbuffer.append( " and withdrawStatus  like '%"+att_AgWithdrawInfo.getWithdrawStatus()+"%'"   );
										  }else {
											  sbuffer.append( " and withdrawStatus   in ( "+att_AgWithdrawInfo.getWithdrawStatus()+" )"   );
										  }
									 }
					       				//打款失败原因(withdrawFailureReason)		 					 
									 if(att_AgWithdrawInfo.getWithdrawFailureReason()!=null&&
									  !"".equals(att_AgWithdrawInfo.getWithdrawFailureReason().trim())){
										  if(likeStr!=null&&!"".equals(likeStr.trim())&&likeStr.indexOf("withdrawFailureReason")!=-1){
											  sbuffer.append( " and withdrawFailureReason  like '%"+att_AgWithdrawInfo.getWithdrawFailureReason()+"%'"   );
										  }else {
											  sbuffer.append( " and withdrawFailureReason   ='"+att_AgWithdrawInfo.getWithdrawFailureReason()+"'"   );
										  }
									 }
					       				//状态:1正常，2禁用(status)		 					 
									 if(att_AgWithdrawInfo.getStatus()!=null&&
									  !"".equals(att_AgWithdrawInfo.getStatus().trim())){
										  if(likeStr!=null&&!"".equals(likeStr.trim())&&likeStr.indexOf("status")!=-1){
											  sbuffer.append( " and status  like '%"+att_AgWithdrawInfo.getStatus()+"%'"   );
										  }else {
											  sbuffer.append( " and status   ='"+att_AgWithdrawInfo.getStatus()+"'"   );
										  }
									 }
									 
										//交易类型(0:充值转入;1:患者提现转出;2:业务员提现转出;3:医院提现转出;4:代理商提现转出)(transactionType)		 					 
									 if(att_AgWithdrawInfo.getTransactionType() !=null&&
									  !"".equals(att_AgWithdrawInfo.getTransactionType().trim())){
										  if(likeStr!=null&&!"".equals(likeStr.trim())&&likeStr.indexOf("transactionType")!=-1){
											  sbuffer.append( " and transactionType  like '%"+att_AgWithdrawInfo.getTransactionType()+"%'"   );
										  }else {
											  sbuffer.append( " and transactionType   ='"+att_AgWithdrawInfo.getTransactionType()+"'"   );
										  }
									 } 
									 
					       				//创建人(createRen)		 					 
									 if(att_AgWithdrawInfo.getCreateRen()!=null&&
									  !"".equals(att_AgWithdrawInfo.getCreateRen().trim())){
										  if(likeStr!=null&&!"".equals(likeStr.trim())&&likeStr.indexOf("createRen")!=-1){
											  sbuffer.append( " and createRen  like '%"+att_AgWithdrawInfo.getCreateRen()+"%'"   );
										  }else {
											  sbuffer.append( " and createRen   ='"+att_AgWithdrawInfo.getCreateRen()+"'"   );
										  }
									 }
						   				//创建时间(createDate)
						 				if(att_AgWithdrawInfo.getCreateDate()!=null){
						   	                   sbuffer.append( " and  createDate='" +att_AgWithdrawInfo.getCreateDate()+"'" );  
								  		}
					       				//修改人(editRen)		 					 
									 if(att_AgWithdrawInfo.getEditRen()!=null&&
									  !"".equals(att_AgWithdrawInfo.getEditRen().trim())){
										  if(likeStr!=null&&!"".equals(likeStr.trim())&&likeStr.indexOf("editRen")!=-1){
											  sbuffer.append( " and editRen  like '%"+att_AgWithdrawInfo.getEditRen()+"%'"   );
										  }else {
											  sbuffer.append( " and editRen   ='"+att_AgWithdrawInfo.getEditRen()+"'"   );
										  }
									 }
						   				//修改时间(editDate)
						 				if(att_AgWithdrawInfo.getEditDate()!=null){
						   	                   sbuffer.append( " and  editDate='" +att_AgWithdrawInfo.getEditDate()+"'" );  
								  		}
			 //*****************数据库字段处理end***************
			  		if(orderStr!=null&&!"".equals(orderStr.trim())){
									 sbuffer.append( " order by "+orderStr);
						 }
						 /*
						 else {
							  sbuffer.append( " order by  AwiId   desc " );
					      }
					      */
			 
			 return  sbuffer.toString();
	}
	@Override
	public Double countAgWithdrawInfoMoney() throws HSKDBException {
		Double count=0d;
		String sql="select sum(withdraw_amount) as shu  from ag_withdraw_info where status='0' and withdraw_status='4'";
		List<Map<String,Object>> list = this.getJdbcDao().query(sql);
		if(list != null && list.size() >0 && list.get(0).get("shu")!=null)
			count = Double.parseDouble(list.get(0).get("shu").toString());
		return count;
	}
}