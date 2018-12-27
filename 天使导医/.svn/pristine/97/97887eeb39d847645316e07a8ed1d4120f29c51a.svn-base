package com.hsk.angeldoctor.api.daobbase.imp;

import java.text.SimpleDateFormat;
import java.util.*;

import com.hsk.supper.dto.comm.PagerModel;
import com.hsk.xframe.api.utils.freeMarker.CommonUtil;

import org.springframework.stereotype.*;
import com.hsk.exception.HSKDBException;
import com.hsk.supper.dao.imp.SupperDao;
import com.hsk.angeldoctor.api.daobbase.*;
import com.hsk.angeldoctor.api.persistence.*;

/** 
 * ag_patient_info表数据库层面操作实现类 
 * @author  作者:admin
 * @version  版本信息:v1.0   创建时间: 2018-08-14 13:35:37
 */
@Component
public class  AgPatientInfoDao extends SupperDao implements IAgPatientInfoDao {	

	/**
	 * 根据ag_patient_info表主键查找AgPatientInfo对象记录
	 * 
	 * @param  PatientId  Integer类型(ag_patient_info表主键)
	 * @return AgPatientInfo ag_patient_info表记录
	 * @throws HSKDBException
	 */	
	public AgPatientInfo findAgPatientInfoById(Integer PatientId) throws HSKDBException{
				AgPatientInfo  att_AgPatientInfo=new AgPatientInfo();				
				if(PatientId!=null){
					att_AgPatientInfo.setPatientId(PatientId);	
				    Object obj=	this.getOne(att_AgPatientInfo);
					if(obj!=null){
						att_AgPatientInfo=(AgPatientInfo) obj;
					}
				}
				return  att_AgPatientInfo;
	}
	 /**
	  * 根据ag_patient_info表主键删除AgPatientInfo对象记录
	  * @param  PatientId  Integer类型(ag_patient_info表主键)
	  * @throws HSKDBException
	  */
	public void deleteAgPatientInfoById(Integer PatientId) throws HSKDBException{ 
		 AgPatientInfo  att_AgPatientInfo=new AgPatientInfo();	
		  if(PatientId!=null){
					  att_AgPatientInfo.setPatientId(PatientId);
				  	  Object obj=	this.getOne(att_AgPatientInfo);
					  if(obj!=null){
							this.deleteObject(obj); 
					  }
			}
	}

	/**
 	 * 根据ag_patient_info表主键修改AgPatientInfo对象记录
     * @param  PatientId  Integer类型(ag_patient_info表主键)
     * @param  att_AgPatientInfo  AgPatientInfo类型(ag_patient_info表记录)
     * @return AgPatientInfo  修改后的AgPatientInfo对象记录
	 * @throws HSKDBException
	 */
	public  AgPatientInfo updateAgPatientInfoById(Integer PatientId,AgPatientInfo att_AgPatientInfo) throws HSKDBException{
		  if(PatientId!=null){
					att_AgPatientInfo.setPatientId(PatientId);
				   	Object obj=	this.getOne(att_AgPatientInfo);
					if(obj!=null){							 
							this.updateObject(obj);
					}
			}
			return  att_AgPatientInfo;
	}
	
	/**
	 * 新增ag_patient_info表 记录
     * @param  att_AgPatientInfo  AgPatientInfo类型(ag_patient_info表记录)
	 * @throws HSKDBException
	 */
	public Integer saveAgPatientInfo(AgPatientInfo att_AgPatientInfo) throws HSKDBException{
		 return this.newObject(att_AgPatientInfo);
	} 
		
	/**
	 * 新增或修改ag_patient_info表记录 ,如果ag_patient_info表主键AgPatientInfo.PatientId为空就是添加，如果非空就是修改
     * @param  att_AgPatientInfo  AgPatientInfo类型(ag_patient_info表记录)
	 * @throws HSKDBException
	 */
	public  AgPatientInfo saveOrUpdateAgPatientInfo(AgPatientInfo att_AgPatientInfo) throws HSKDBException{
		  this.getHibernateTemplate().saveOrUpdate(att_AgPatientInfo);
		  return att_AgPatientInfo;
	}
	
	/**
	 *根据AgPatientInfo对象作为对(ag_patient_info表进行查询，获取列表对象
     * @param  att_AgPatientInfo  AgPatientInfo类型(ag_patient_info表记录)
     * @return List<AgPatientInfo>  列表对象
	 * @throws HSKDBException 
	 */
	 @SuppressWarnings("unchecked")
	public List<AgPatientInfo> getListByAgPatientInfo(AgPatientInfo att_AgPatientInfo) throws HSKDBException{
		String Hql=this.getHql( att_AgPatientInfo); 
		List<AgPatientInfo> list=this.getHibernateTemplate().find(Hql);
		return  list;
	}
	/**
	 *根据AgPatientInfo对象作为对(ag_patient_info表进行查询，获取分页对象
     * @param  att_AgPatientInfo  AgPatientInfo类型(ag_patient_info表记录)
     * @return List<AgPatientInfo>  分页对象
	 * @throws HSKDBException 
	 */
	public PagerModel getPagerModelByAgPatientInfo(AgPatientInfo att_AgPatientInfo)
			throws HSKDBException {
		String Hql=this.getHql(att_AgPatientInfo);
		return this.getHibernateDao().findByPage(Hql); 
	} 
	/**
	 * 根据AgPatientInfo对象获取Hql字符串
     * @param  att_AgPatientInfo  AgPatientInfo类型(ag_patient_info表记录)
	 *  @return hql字符串
	 */
	private String  getHql(AgPatientInfo att_AgPatientInfo){
			 StringBuffer sbuffer = new StringBuffer( " from  AgPatientInfo  where  1=1  ");
			 String likeStr=  att_AgPatientInfo.getTab_like();
			 String orderStr= att_AgPatientInfo.getTab_order();
			 
			 //*****************无关字段处理begin*****************
						   		 //处理in条件 患者ID(patientId)
							     if(att_AgPatientInfo.getPatientId_str()!=null&&
						   		    !"".equals(att_AgPatientInfo.getPatientId_str().trim())){ 
											 String  intStr=att_AgPatientInfo.getPatientId_str().trim();
											 String[]  arrayStr=intStr.split(","); 
											 
											  if(arrayStr.length>0){
												 sbuffer.append(" and ( ");
												 for(int i=0;i<arrayStr.length;i++){
													 String did=arrayStr[i];
													 if(i==arrayStr.length-1){
														 sbuffer.append("  patientId="+did+"   "); 
													 }else {
													 sbuffer.append("  patientId="+did+" or "); 
													 }
												 }
												 sbuffer.append(" ) "); 
											 }
											   
								 	}
						   		 //处理in条件 微信ID(wechatUserId)
							     if(att_AgPatientInfo.getWechatUserId_str()!=null&&
						   		    !"".equals(att_AgPatientInfo.getWechatUserId_str().trim())){ 
											 String  intStr=att_AgPatientInfo.getWechatUserId_str().trim();
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
						   		 //处理in条件 来源:上级业务员ID(source)
							     if(att_AgPatientInfo.getSource_str()!=null&&
						   		    !"".equals(att_AgPatientInfo.getSource_str().trim())){ 
											 String  intStr=att_AgPatientInfo.getSource_str().trim();
											 String[]  arrayStr=intStr.split(","); 
											 
											  if(arrayStr.length>0){
												 sbuffer.append(" and ( ");
												 for(int i=0;i<arrayStr.length;i++){
													 String did=arrayStr[i];
													 if(i==arrayStr.length-1){
														 sbuffer.append("  source="+did+"   "); 
													 }else {
													 sbuffer.append("  source="+did+" or "); 
													 }
												 }
												 sbuffer.append(" ) "); 
											 }
											   
								 	}
							     	  SimpleDateFormat sdf =new SimpleDateFormat("yyyy-MM-dd");
								 		//时间类型开始条件处理  创建时间(createDate)
									  if(att_AgPatientInfo.getCreateDate_start()!=null){
								   	    	sbuffer.append( " and  createDate<='" +att_AgPatientInfo.getCreateDate_start()+"'" );  
										 }
								 	  //时间类型结束条件处理 创建时间(createDate)
									 	if(att_AgPatientInfo.getCreateDate_end()!=null){
						   	      			sbuffer.append( " and  createDate>'" +att_AgPatientInfo.getCreateDate_end()+"'" );  
								  	     } 
									 	if(att_AgPatientInfo.getLastDealDate_start()!=null){
								   	    	sbuffer.append( " and  lastDealDate>='" +sdf.format(att_AgPatientInfo.getLastDealDate_start())+" 00:00:00'" );  
										 }
								 	  //时间类型结束条件处理 创建时间(createDate)
									 	if(att_AgPatientInfo.getLastDealDate_end()!=null){
						   	      			sbuffer.append( " and  lastDealDate<='" +sdf.format(att_AgPatientInfo.getLastDealDate_end())+" 23:59:59'" );  
								  	     } 
								 		//时间类型开始条件处理  修改时间(editDate)
									  if(att_AgPatientInfo.getEditDate_start()!=null){
								   	    	sbuffer.append( " and  editDate<='" +att_AgPatientInfo.getEditDate_start()+"'" );  
										 }
								 	  //时间类型结束条件处理 修改时间(editDate)
									 	if(att_AgPatientInfo.getEditDate_end()!=null){
						   	      			sbuffer.append( " and  editDate>'" +att_AgPatientInfo.getEditDate_end()+"'" );  
								  	     } 
			 //*****************无关字段处理end*****************
			 //*****************数据库字段处理begin*************
								  		//患者ID(patientId)
					 					if(att_AgPatientInfo.getPatientId()!=null){
											 sbuffer.append( " and patientId=" +att_AgPatientInfo.getPatientId() );
										 }
								  		//微信ID(wechatUserId)
					 					if(att_AgPatientInfo.getWechatUserId()!=null){
											 sbuffer.append( " and wechatUserId=" +att_AgPatientInfo.getWechatUserId() );
										 }
					       				//患者姓名(name)		 					 
									 if(att_AgPatientInfo.getName()!=null&&
									  !"".equals(att_AgPatientInfo.getName().trim())){
										  if(likeStr!=null&&!"".equals(likeStr.trim())&&likeStr.indexOf("name")!=-1){
											  sbuffer.append( " and name  like '%"+att_AgPatientInfo.getName()+"%'"   );
										  }else {
											  sbuffer.append( " and name   ='"+att_AgPatientInfo.getName()+"'"   );
										  }
									 }
					       				//患者手机号(mobile)		 					 
									 if(att_AgPatientInfo.getMobile()!=null&&
									  !"".equals(att_AgPatientInfo.getMobile().trim())){
										  if(likeStr!=null&&!"".equals(likeStr.trim())&&likeStr.indexOf("mobile")!=-1){
											  sbuffer.append( " and mobile  like '%"+att_AgPatientInfo.getMobile()+"%'"   );
										  }else {
											  sbuffer.append( " and mobile   ='"+att_AgPatientInfo.getMobile()+"'"   );
										  }
									 }
					       				//性别(gender)		 					 
									 if(att_AgPatientInfo.getGender()!=null&&
									  !"".equals(att_AgPatientInfo.getGender().trim())){
										  if(likeStr!=null&&!"".equals(likeStr.trim())&&likeStr.indexOf("gender")!=-1){
											  sbuffer.append( " and gender  like '%"+att_AgPatientInfo.getGender()+"%'"   );
										  }else {
											  sbuffer.append( " and gender   ='"+att_AgPatientInfo.getGender()+"'"   );
										  }
									 }
					       				//年龄(age)		 					 
									 if(att_AgPatientInfo.getAge()!=null&&
									  !"".equals(att_AgPatientInfo.getAge().trim())){
										  if(likeStr!=null&&!"".equals(likeStr.trim())&&likeStr.indexOf("age")!=-1){
											  sbuffer.append( " and age  like '%"+att_AgPatientInfo.getAge()+"%'"   );
										  }else {
											  sbuffer.append( " and age   ='"+att_AgPatientInfo.getAge()+"'"   );
										  }
									 }
								  		//来源:上级业务员ID(source)
					 					if(att_AgPatientInfo.getSource()!=null){
											 sbuffer.append( " and source=" +att_AgPatientInfo.getSource() );
										 }
					       				//银行名称(bankName)		 					 
									 if(att_AgPatientInfo.getBankName()!=null&&
									  !"".equals(att_AgPatientInfo.getBankName().trim())){
										  if(likeStr!=null&&!"".equals(likeStr.trim())&&likeStr.indexOf("bankName")!=-1){
											  sbuffer.append( " and bankName  like '%"+att_AgPatientInfo.getBankName()+"%'"   );
										  }else {
											  sbuffer.append( " and bankName   ='"+att_AgPatientInfo.getBankName()+"'"   );
										  }
									 }
					       				//银行账户名称(bankAccountName)		 					 
									 if(att_AgPatientInfo.getBankAccountName()!=null&&
									  !"".equals(att_AgPatientInfo.getBankAccountName().trim())){
										  if(likeStr!=null&&!"".equals(likeStr.trim())&&likeStr.indexOf("bankAccountName")!=-1){
											  sbuffer.append( " and bankAccountName  like '%"+att_AgPatientInfo.getBankAccountName()+"%'"   );
										  }else {
											  sbuffer.append( " and bankAccountName   ='"+att_AgPatientInfo.getBankAccountName()+"'"   );
										  }
									 }
					       				//银行账号(bankAccountNumber)		 					 
									 if(att_AgPatientInfo.getBankAccountNumber()!=null&&
									  !"".equals(att_AgPatientInfo.getBankAccountNumber().trim())){
										  if(likeStr!=null&&!"".equals(likeStr.trim())&&likeStr.indexOf("bankAccountNumber")!=-1){
											  sbuffer.append( " and bankAccountNumber  like '%"+att_AgPatientInfo.getBankAccountNumber()+"%'"   );
										  }else {
											  sbuffer.append( " and bankAccountNumber   ='"+att_AgPatientInfo.getBankAccountNumber()+"'"   );
										  }
									 }
					       				//状态:0正常(status)		 					 
									 if(att_AgPatientInfo.getStatus()!=null&&
									  !"".equals(att_AgPatientInfo.getStatus().trim())){
										  if(likeStr!=null&&!"".equals(likeStr.trim())&&likeStr.indexOf("status")!=-1){
											  sbuffer.append( " and status  like '%"+att_AgPatientInfo.getStatus()+"%'"   );
										  }else {
											  sbuffer.append( " and status   ='"+att_AgPatientInfo.getStatus()+"'"   );
										  }
									 }
					       				//创建人(createRen)		 					 
									 if(att_AgPatientInfo.getCreateRen()!=null&&
									  !"".equals(att_AgPatientInfo.getCreateRen().trim())){
										  if(likeStr!=null&&!"".equals(likeStr.trim())&&likeStr.indexOf("createRen")!=-1){
											  sbuffer.append( " and createRen  like '%"+att_AgPatientInfo.getCreateRen()+"%'"   );
										  }else {
											  sbuffer.append( " and createRen   ='"+att_AgPatientInfo.getCreateRen()+"'"   );
										  }
									 }
						   				//创建时间(createDate)
						 				if(att_AgPatientInfo.getCreateDate()!=null){
						   	                   sbuffer.append( " and  createDate='" +att_AgPatientInfo.getCreateDate()+"'" );  
								  		}
					       				//修改人(editRen)		 					 
									 if(att_AgPatientInfo.getEditRen()!=null&&
									  !"".equals(att_AgPatientInfo.getEditRen().trim())){
										  if(likeStr!=null&&!"".equals(likeStr.trim())&&likeStr.indexOf("editRen")!=-1){
											  sbuffer.append( " and editRen  like '%"+att_AgPatientInfo.getEditRen()+"%'"   );
										  }else {
											  sbuffer.append( " and editRen   ='"+att_AgPatientInfo.getEditRen()+"'"   );
										  }
									 }
						   				//修改时间(editDate)
						 				if(att_AgPatientInfo.getEditDate()!=null){
						   	                   sbuffer.append( " and  editDate='" +att_AgPatientInfo.getEditDate()+"'" );  
								  		}
						 				
						 				//一级业务员手机号(scene_Mobile)		 					 
										 if(att_AgPatientInfo.getEditRen()!=null&&
										  !"".equals(att_AgPatientInfo.getSceneMobile().trim())){
											  if(likeStr!=null&&!"".equals(likeStr.trim())&&likeStr.indexOf("sceneMobile")!=-1){
												  sbuffer.append( " and sceneMobile  like '%"+att_AgPatientInfo.getSceneMobile()+"%'"   );
											  }else {
												  sbuffer.append( " and sceneMobile   ='"+att_AgPatientInfo.getSceneMobile()+"'"   );
											  }
										 }
						 				
						 				
						 				
			 //*****************数据库字段处理end***************
			  		if(orderStr!=null&&!"".equals(orderStr.trim())){
									 sbuffer.append( " order by "+orderStr);
						 }
						 /*
						 else {
							  sbuffer.append( " order by  PatientId   desc " );
					      }
					      */
			 
			 return  sbuffer.toString();
	}
 
	public List<Object> getCount(Integer id) throws HSKDBException {
		 String sql="";
		 
//		 1	registrationsCount	int	预约/代约总次数
//		 2	totalFee	int	总消费金额
//		 3	totalShare	int	总返利金额
//		 4	evaluationsCount	int	评论数
//		 5	feedbacksCount	int	反馈数 
		 return this.getHibernateDao().findColBySqlQuery(sql) ; 
	}
	@Override
	public PagerModel getWechatPatienPager(String createDateStart, String createDateEnd, String mobile, String name,
			String sceneMobile) throws HSKDBException {
		String sql ="SELECT b.patient_id as id,b.name,b.mobile,b.age,b.gender,date_format(a.create_date,'%Y-%m-%d') as createDate,c.mobile AS sceneMobile,c.name AS sceneName,"
					+"d.registrations_count as registrationsCount,d.consume_count as consumeCount,d.total_share as totalShare,a.wechat_name as wechatName FROM ag_patient_info b,ag_money_count d,ag_wechat_info a "
					+"LEFT JOIN ag_business_user c ON a.scene_id=c.agent_id WHERE a.wechat_user_id=b.wechat_user_id AND b.patient_id=d.sui_id AND d.amc_type=4 AND b.status=0 ";
		if(createDateStart !=null && !createDateStart.trim().equals(""))
			sql +=" and a.create_date>='"+createDateStart.trim()+" 00:00:00'";
		if(createDateEnd !=null && !createDateEnd.trim().equals(""))
			sql +=" and a.create_date<='"+createDateEnd.trim()+" 23:59:59'";
		if(mobile !=null && !mobile.trim().equals(""))
			sql +=" and b.mobile like '%"+mobile.trim()+"%'";
		if(name !=null && !name.trim().equals(""))
			sql +=" and b.name like '%"+name.trim()+"%'";
		if(sceneMobile !=null && !sceneMobile.trim().equals(""))
			sql +=" and c.mobile like '%"+sceneMobile.trim()+"%'";
		sql +=" order by a.create_date desc";
		return this.getJdbcDao().findByPage(sql);
	}
	@Override
	public PagerModel getAppPatienPager(Integer agentId, String keyWords) throws HSKDBException {
		String sql="SELECT a.patient_id AS id,a.patient_id,a.name AS patientName,a.mobile AS patientMobile,a.age,a.gender,d.wechat_name as nickName,d.avatar"
					+",(SELECT COUNT(1) FROM ag_order_info c WHERE c.patient_id=a.patient_id) AS totalMedicalRecordsCount,CONCAT('"+CommonUtil.IM_PAT_PRE+"',a.patient_id) as easemobUsername "
					+"FROM ag_wechat_info d,ag_patient_info a WHERE d.scene_id="+agentId+" and a.wechat_user_id=d.wechat_user_id AND a.status=0 ";
		if(keyWords !=null && !keyWords.trim().equals(""))
			sql +=" and (a.name like '%"+keyWords.trim()+"%' or a.mobile like '%"+keyWords.trim()+"%')";
		return this.getJdbcDao().findByPage(sql);
	}
	@Override
	public Integer countAppPatient(Integer agentId) throws HSKDBException {
		int reCount=0;
		String sql = "select count(1) as shu from ag_wechat_info where scene_id="+agentId;
		List<Map<String,Object>> reList = this.getJdbcDao().query(sql);
		if(reList!=null && reList.size() >0)
			reCount=Integer.parseInt(reList.get(0).get("shu").toString());
		return reCount;
	}
	@Override
	public PagerModel getHosPatienByAgPatientInfo(AgPatientInfo att_AgPatientInfo,Integer organizationId) throws HSKDBException {
		SimpleDateFormat sdf =new SimpleDateFormat("yyyy-MM-dd");
		String sql ="SELECT DISTINCT b.patient_id,b.name,b.mobile,b.gender,b.age,d.avatar,DATE_FORMAT(b.last_deal_date,'%Y-%m-%d %H:%i:%s') AS last_deal_date,"
				+"(SELECT SUM(c.treatment_fee+c.drug_fee) FROM ag_deal_info c WHERE c.organization_id ="+organizationId+" AND c.patient_id=b.patient_id ) AS 'countMoney', "
				+"(SELECT COUNT(1) FROM ag_deal_info c WHERE c.organization_id ="+organizationId+" AND c.patient_id=b.patient_id ) AS 'countMedicalRecordsCount', "
				+"(SELECT COUNT(1) FROM ag_evaluate_info e WHERE e.organization_id ="+organizationId+" and e.order_patient_id=b.patient_id AND e.status=0)  AS 'evaluationsCount'"
				+" FROM ag_order_info a,ag_patient_info b LEFT JOIN ag_wechat_info d ON d.wechat_user_id=b.wechat_user_id WHERE b.patient_id=a.patient_id AND a.status=0 AND a.outpatient_status=0 AND a.organization_id="+organizationId;
		if(att_AgPatientInfo.getPatientId()!=null )
			sql +=" and b.patient_id ="+att_AgPatientInfo.getPatientId()+"";	
		if(att_AgPatientInfo.getName()!=null&&!"".equals(att_AgPatientInfo.getName().trim())){
			sql +=" and b.name like '%"+att_AgPatientInfo.getName().trim()+"%'";	
		}
		if(att_AgPatientInfo.getMobile()!=null&&!"".equals(att_AgPatientInfo.getMobile().trim())){
			sql +=" and b.mobile like '%"+att_AgPatientInfo.getMobile().trim()+"%'";	
		}
		if(att_AgPatientInfo.getLastDealDate_start()!=null){
			sql +=" and b.last_deal_date >='" +sdf.format(att_AgPatientInfo.getLastDealDate_start())+" 00:00:00'";	
		 }
 	  //时间类型结束条件处理 创建时间(createDate)
	 	if(att_AgPatientInfo.getLastDealDate_end()!=null){
	 		sql +=" and b.last_deal_date <='" +sdf.format(att_AgPatientInfo.getLastDealDate_end())+" 23:59:59'";	
  	     } 
		sql +=" ORDER BY b.last_deal_date DESC";
		return this.getJdbcDao().findByPage(sql);
	}
}