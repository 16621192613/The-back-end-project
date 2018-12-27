package com.hsk.angeldoctor.api.daobbase.imp;

import java.text.SimpleDateFormat;
import java.util.*;
import com.hsk.supper.dto.comm.PagerModel;
import org.springframework.stereotype.*;
import com.hsk.exception.HSKDBException;
import com.hsk.supper.dao.imp.SupperDao;
import com.hsk.xframe.api.filter.TokenUtil;
import com.hsk.xframe.api.persistence.SysUserInfo;
import com.hsk.angeldoctor.api.daobbase.*;
import com.hsk.angeldoctor.api.persistence.*;

/** 
 * ag_hospital_info表数据库层面操作实现类 
 * @author  作者:admin
 * @version  版本信息:v1.0   创建时间: 2018-08-14 13:28:00
 */
@Component
public class  AgHospitalInfoDao extends SupperDao implements IAgHospitalInfoDao {	
	
	@Override
	public List<Map<String, Object>> getOrganizationId(String token) throws HSKDBException{
		SysUserInfo userAccount = (SysUserInfo) TokenUtil.getTokenInfo(token).get("account");
		String sql = "SELECT * FROM ag_hospital_info WHERE name='"+userAccount.getUserName()+"'";
		
		System.out.println(sql);
		return this.getJdbcDao().query(sql);
	}

	
	
	
	/**
	 * 根据ag_hospital_info表主键查找AgHospitalInfo对象记录
	 * 
	 * @param  OrganizationId  Integer类型(ag_hospital_info表主键)
	 * @return AgHospitalInfo ag_hospital_info表记录
	 * @throws HSKDBException
	 */	
	public AgHospitalInfo findAgHospitalInfoById(Integer OrganizationId) throws HSKDBException{
				AgHospitalInfo  att_AgHospitalInfo=new AgHospitalInfo();				
				if(OrganizationId!=null){
					att_AgHospitalInfo.setOrganizationId(OrganizationId);	
				    Object obj=	this.getOne(att_AgHospitalInfo);
					if(obj!=null){
						att_AgHospitalInfo=(AgHospitalInfo) obj;
					}
				}
				return  att_AgHospitalInfo;
	}
	 /**
	  * 根据ag_hospital_info表主键删除AgHospitalInfo对象记录
	  * @param  OrganizationId  Integer类型(ag_hospital_info表主键)
	  * @throws HSKDBException
	  */
	public void deleteAgHospitalInfoById(Integer OrganizationId) throws HSKDBException{ 
		 AgHospitalInfo  att_AgHospitalInfo=new AgHospitalInfo();	
		  if(OrganizationId!=null){
					  att_AgHospitalInfo.setOrganizationId(OrganizationId);
				  	  Object obj=	this.getOne(att_AgHospitalInfo);
					  if(obj!=null){
							this.deleteObject(obj); 
					  }
			}
	}

	/**
 	 * 根据ag_hospital_info表主键修改AgHospitalInfo对象记录
     * @param  OrganizationId  Integer类型(ag_hospital_info表主键)
     * @param  att_AgHospitalInfo  AgHospitalInfo类型(ag_hospital_info表记录)
     * @return AgHospitalInfo  修改后的AgHospitalInfo对象记录
	 * @throws HSKDBException
	 */
	public  AgHospitalInfo updateAgHospitalInfoById(Integer OrganizationId,AgHospitalInfo att_AgHospitalInfo) throws HSKDBException{
		  if(OrganizationId!=null){
					att_AgHospitalInfo.setOrganizationId(OrganizationId);
				   	Object obj=	this.getOne(att_AgHospitalInfo);
					if(obj!=null){							 
							this.updateObject(obj);
					}
			}
			return  att_AgHospitalInfo;
	}
	
	/**
	 * 新增ag_hospital_info表 记录
     * @param  att_AgHospitalInfo  AgHospitalInfo类型(ag_hospital_info表记录)
	 * @throws HSKDBException
	 */
	public Integer saveAgHospitalInfo(AgHospitalInfo att_AgHospitalInfo) throws HSKDBException{
		 return this.newObject(att_AgHospitalInfo);
	} 
		
	/**
	 * 新增或修改ag_hospital_info表记录 ,如果ag_hospital_info表主键AgHospitalInfo.OrganizationId为空就是添加，如果非空就是修改
     * @param  att_AgHospitalInfo  AgHospitalInfo类型(ag_hospital_info表记录)
	 * @throws HSKDBException
	 */
	public  AgHospitalInfo saveOrUpdateAgHospitalInfo(AgHospitalInfo att_AgHospitalInfo) throws HSKDBException{
		  this.getHibernateTemplate().saveOrUpdate(att_AgHospitalInfo);
		  return att_AgHospitalInfo;
	}
	
	/**
	 *根据AgHospitalInfo对象作为对(ag_hospital_info表进行查询，获取列表对象
     * @param  att_AgHospitalInfo  AgHospitalInfo类型(ag_hospital_info表记录)
     * @return List<AgHospitalInfo>  列表对象
	 * @throws HSKDBException 
	 */
	 @SuppressWarnings("unchecked")
	public List<AgHospitalInfo> getListByAgHospitalInfo(AgHospitalInfo att_AgHospitalInfo) throws HSKDBException{
		String Hql=this.getHql( att_AgHospitalInfo); 
		List<AgHospitalInfo> list=this.getHibernateTemplate().find(Hql);
		return  list;
	}
	/**
	 *根据AgHospitalInfo对象作为对(ag_hospital_info表进行查询，获取分页对象
     * @param  att_AgHospitalInfo  AgHospitalInfo类型(ag_hospital_info表记录)
     * @return List<AgHospitalInfo>  分页对象
	 * @throws HSKDBException 
	 */
	public PagerModel getPagerModelByAgHospitalInfo(AgHospitalInfo att_AgHospitalInfo)
			throws HSKDBException {
		String Hql=this.getHql(att_AgHospitalInfo);
		return this.getHibernateDao().findByPage(Hql); 
	} 
	/**
	 * 根据AgHospitalInfo对象获取Hql字符串
     * @param  att_AgHospitalInfo  AgHospitalInfo类型(ag_hospital_info表记录)
	 *  @return hql字符串
	 */
	private String  getHql(AgHospitalInfo att_AgHospitalInfo){
			 StringBuffer sbuffer = new StringBuffer( " from  AgHospitalInfo  where  1=1  ");
			 String likeStr=  att_AgHospitalInfo.getTab_like();
			 String orderStr= att_AgHospitalInfo.getTab_order();
			 
			 //*****************无关字段处理begin*****************
						   		 //处理in条件 医院ID(organizationId)
							     if(att_AgHospitalInfo.getOrganizationId_str()!=null&&
						   		    !"".equals(att_AgHospitalInfo.getOrganizationId_str().trim())){ 
											 String  intStr=att_AgHospitalInfo.getOrganizationId_str().trim();
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
						   		 //处理in条件 内部业务员ID(internalBusinessPeopleId)
							     if(att_AgHospitalInfo.getInternalBusinessPeopleId_str()!=null&&
						   		    !"".equals(att_AgHospitalInfo.getInternalBusinessPeopleId_str().trim())){ 
											 String  intStr=att_AgHospitalInfo.getInternalBusinessPeopleId_str().trim();
											 String[]  arrayStr=intStr.split(","); 
											 
											  if(arrayStr.length>0){
												 sbuffer.append(" and ( ");
												 for(int i=0;i<arrayStr.length;i++){
													 String did=arrayStr[i];
													 if(i==arrayStr.length-1){
														 sbuffer.append("  internalBusinessPeopleId="+did+"   "); 
													 }else {
													 sbuffer.append("  internalBusinessPeopleId="+did+" or "); 
													 }
												 }
												 sbuffer.append(" ) "); 
											 }
											   
								 	}
						   		 //处理in条件 是否医保：0是1否(medicalinsurance)
							     if(att_AgHospitalInfo.getMedicalinsurance_str()!=null&&
						   		    !"".equals(att_AgHospitalInfo.getMedicalinsurance_str().trim())){ 
											 String  intStr=att_AgHospitalInfo.getMedicalinsurance_str().trim();
											 String[]  arrayStr=intStr.split(","); 
											 
											  if(arrayStr.length>0){
												 sbuffer.append(" and ( ");
												 for(int i=0;i<arrayStr.length;i++){
													 String did=arrayStr[i];
													 if(i==arrayStr.length-1){
														 sbuffer.append("  medicalinsurance="+did+"   "); 
													 }else {
													 sbuffer.append("  medicalinsurance="+did+" or "); 
													 }
												 }
												 sbuffer.append(" ) "); 
											 }
											   
								 	}
						   		 //处理in条件 每月计划群发次数(monthlyMessagePlanCount)
							     if(att_AgHospitalInfo.getMonthlyMessagePlanCount_str()!=null&&
						   		    !"".equals(att_AgHospitalInfo.getMonthlyMessagePlanCount_str().trim())){ 
											 String  intStr=att_AgHospitalInfo.getMonthlyMessagePlanCount_str().trim();
											 String[]  arrayStr=intStr.split(","); 
											 
											  if(arrayStr.length>0){
												 sbuffer.append(" and ( ");
												 for(int i=0;i<arrayStr.length;i++){
													 String did=arrayStr[i];
													 if(i==arrayStr.length-1){
														 sbuffer.append("  monthlyMessagePlanCount="+did+"   "); 
													 }else {
													 sbuffer.append("  monthlyMessagePlanCount="+did+" or "); 
													 }
												 }
												 sbuffer.append(" ) "); 
											 }
											   
								 	}
						   		 //处理in条件 每月实际群发总数(monthlyMessageActualCount)
							     if(att_AgHospitalInfo.getMonthlyMessageActualCount_str()!=null&&
						   		    !"".equals(att_AgHospitalInfo.getMonthlyMessageActualCount_str().trim())){ 
											 String  intStr=att_AgHospitalInfo.getMonthlyMessageActualCount_str().trim();
											 String[]  arrayStr=intStr.split(","); 
											 
											  if(arrayStr.length>0){
												 sbuffer.append(" and ( ");
												 for(int i=0;i<arrayStr.length;i++){
													 String did=arrayStr[i];
													 if(i==arrayStr.length-1){
														 sbuffer.append("  monthlyMessageActualCount="+did+"   "); 
													 }else {
													 sbuffer.append("  monthlyMessageActualCount="+did+" or "); 
													 }
												 }
												 sbuffer.append(" ) "); 
											 }
											   
								 	}
							     	SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");
								 		//时间类型开始条件处理  创建时间(createDate)
									  if(att_AgHospitalInfo.getCreateDate_start()!=null){
								   	    	sbuffer.append( " and  createDate >='" +sdf.format(att_AgHospitalInfo.getCreateDate_start())+" 00:00:00'" );  
										 }
								 	  //时间类型结束条件处理 创建时间(createDate)
									 	if(att_AgHospitalInfo.getCreateDate_end()!=null){
						   	      			sbuffer.append( " and  createDate<='" +sdf.format(att_AgHospitalInfo.getCreateDate_end())+" 23:59:59'" );  
								  	     } 
								 		//时间类型开始条件处理  修改时间(editDate)
									  if(att_AgHospitalInfo.getEditDate_start()!=null){
								   	    	sbuffer.append( " and  editDate<='" +att_AgHospitalInfo.getEditDate_start()+"'" );  
										 }
								 	  //时间类型结束条件处理 修改时间(editDate)
									 	if(att_AgHospitalInfo.getEditDate_end()!=null){
						   	      			sbuffer.append( " and  editDate>'" +att_AgHospitalInfo.getEditDate_end()+"'" );  
								  	     } 
			 //*****************无关字段处理end*****************
			 //*****************数据库字段处理begin*************
								  		//医院ID(organizationId)
					 					if(att_AgHospitalInfo.getOrganizationId()!=null){
											 sbuffer.append( " and organizationId=" +att_AgHospitalInfo.getOrganizationId() );
										 }
								  		//内部业务员ID(internalBusinessPeopleId)
					 					if(att_AgHospitalInfo.getInternalBusinessPeopleId()!=null){
											 sbuffer.append( " and internalBusinessPeopleId=" +att_AgHospitalInfo.getInternalBusinessPeopleId() );
										 }
					       				//医院名称(name)		 					 
									 if(att_AgHospitalInfo.getName()!=null&&
									  !"".equals(att_AgHospitalInfo.getName().trim())){
										  if(likeStr!=null&&!"".equals(likeStr.trim())&&likeStr.indexOf("name")!=-1){
											  sbuffer.append( " and name  like '%"+att_AgHospitalInfo.getName()+"%'"   );
										  }else {
											  sbuffer.append( " and name   ='"+att_AgHospitalInfo.getName()+"'"   );
										  }
									 }
					       				//登录域名(domainName)		 					 
									 if(att_AgHospitalInfo.getDomainName()!=null&&
									  !"".equals(att_AgHospitalInfo.getDomainName().trim())){
										  if(likeStr!=null&&!"".equals(likeStr.trim())&&likeStr.indexOf("domainName")!=-1){
											  sbuffer.append( " and domainName  like '%"+att_AgHospitalInfo.getDomainName()+"%'"   );
										  }else {
											  sbuffer.append( " and domainName   ='"+att_AgHospitalInfo.getDomainName()+"'"   );
										  }
									 }
								  		//是否医保：0是1否(medicalinsurance)
					 					if(att_AgHospitalInfo.getMedicalInsurance()!=null){
											 sbuffer.append( " and medicalInsurance=" +att_AgHospitalInfo.getMedicalInsurance() );
										 }
					 					
					       				//医院类型(organizationType)		 					 
									 if(att_AgHospitalInfo.getOrganizationType()!=null&&
									  !"".equals(att_AgHospitalInfo.getOrganizationType().trim())){
										  if(likeStr!=null&&!"".equals(likeStr.trim())&&likeStr.indexOf("organizationType")!=-1){
											  sbuffer.append( " and organizationType  like '%"+att_AgHospitalInfo.getOrganizationType()+"%'"   );
										  }else {
											  sbuffer.append( " and organizationType   ='"+att_AgHospitalInfo.getOrganizationType()+"'"   );
										  }
									 }
					       				//省(provId)		 					 
									 if(att_AgHospitalInfo.getProvId()!=null&&
									  !"".equals(att_AgHospitalInfo.getProvId().trim())){
										  if(likeStr!=null&&!"".equals(likeStr.trim())&&likeStr.indexOf("provId")!=-1){
											  sbuffer.append( " and provId  like '%"+att_AgHospitalInfo.getProvId()+"%'"   );
										  }else {
											  sbuffer.append( " and provId   ='"+att_AgHospitalInfo.getProvId()+"'"   );
										  }
									 }
					       				//市(cityId)		 					 
									 if(att_AgHospitalInfo.getCityId()!=null&&
									  !"".equals(att_AgHospitalInfo.getCityId().trim())){
										  if(likeStr!=null&&!"".equals(likeStr.trim())&&likeStr.indexOf("cityId")!=-1){
											  sbuffer.append( " and cityId  like '%"+att_AgHospitalInfo.getCityId()+"%'"   );
										  }else {
											  sbuffer.append( " and cityId   ='"+att_AgHospitalInfo.getCityId()+"'"   );
										  }
									 }
					       				//分布区(districtId)		 					 
									 if(att_AgHospitalInfo.getDistrictId()!=null&&
									  !"".equals(att_AgHospitalInfo.getDistrictId().trim())){
										  if(likeStr!=null&&!"".equals(likeStr.trim())&&likeStr.indexOf("districtId")!=-1){
											  sbuffer.append( " and districtId  like '%"+att_AgHospitalInfo.getDistrictId()+"%'"   );
										  }else {
											  sbuffer.append( " and districtId   ='"+att_AgHospitalInfo.getDistrictId()+"'"   );
										  }
									 }
					       				//详细地址(address)		 					 
									 if(att_AgHospitalInfo.getAddress()!=null&&
									  !"".equals(att_AgHospitalInfo.getAddress().trim())){
										  if(likeStr!=null&&!"".equals(likeStr.trim())&&likeStr.indexOf("address")!=-1){
											  sbuffer.append( " and address  like '%"+att_AgHospitalInfo.getAddress()+"%'"   );
										  }else {
											  sbuffer.append( " and address   ='"+att_AgHospitalInfo.getAddress()+"'"   );
										  }
									 }
					       				//交通线路(trafficRoute)		 					 
									 if(att_AgHospitalInfo.getTrafficRoute()!=null&&
									  !"".equals(att_AgHospitalInfo.getTrafficRoute().trim())){
										  if(likeStr!=null&&!"".equals(likeStr.trim())&&likeStr.indexOf("trafficRoute")!=-1){
											  sbuffer.append( " and trafficRoute  like '%"+att_AgHospitalInfo.getTrafficRoute()+"%'"   );
										  }else {
											  sbuffer.append( " and trafficRoute   ='"+att_AgHospitalInfo.getTrafficRoute()+"'"   );
										  }
									 }
					       				//经度(longitude)		 					 
									 if(att_AgHospitalInfo.getLongitude()!=null&&
									  !"".equals(att_AgHospitalInfo.getLongitude().trim())){
										  if(likeStr!=null&&!"".equals(likeStr.trim())&&likeStr.indexOf("longitude")!=-1){
											  sbuffer.append( " and longitude  like '%"+att_AgHospitalInfo.getLongitude()+"%'"   );
										  }else {
											  sbuffer.append( " and longitude   ='"+att_AgHospitalInfo.getLongitude()+"'"   );
										  }
									 }
					       				//维度(latitude)		 					 
									 if(att_AgHospitalInfo.getLatitude()!=null&&
									  !"".equals(att_AgHospitalInfo.getLatitude().trim())){
										  if(likeStr!=null&&!"".equals(likeStr.trim())&&likeStr.indexOf("latitude")!=-1){
											  sbuffer.append( " and latitude  like '%"+att_AgHospitalInfo.getLatitude()+"%'"   );
										  }else {
											  sbuffer.append( " and latitude   ='"+att_AgHospitalInfo.getLatitude()+"'"   );
										  }
									 }
					       				//医院His管理人员名称(managerName)		 					 
									 if(att_AgHospitalInfo.getManagerName()!=null&&
									  !"".equals(att_AgHospitalInfo.getManagerName().trim())){
										  if(likeStr!=null&&!"".equals(likeStr.trim())&&likeStr.indexOf("managerName")!=-1){
											  sbuffer.append( " and managerName  like '%"+att_AgHospitalInfo.getManagerName()+"%'"   );
										  }else {
											  sbuffer.append( " and managerName   ='"+att_AgHospitalInfo.getManagerName()+"'"   );
										  }
									 }
					       				//管理员手机号(managerMobile)		 					 
									 if(att_AgHospitalInfo.getManagerMobile()!=null&&
									  !"".equals(att_AgHospitalInfo.getManagerMobile().trim())){
										  if(likeStr!=null&&!"".equals(likeStr.trim())&&likeStr.indexOf("managerMobile")!=-1){
											  sbuffer.append( " and managerMobile  like '%"+att_AgHospitalInfo.getManagerMobile()+"%'"   );
										  }else {
											  sbuffer.append( " and managerMobile   ='"+att_AgHospitalInfo.getManagerMobile()+"'"   );
										  }
									 }
					       				//管理员邮箱(managerEmail)		 					 
									 if(att_AgHospitalInfo.getManagerEmail()!=null&&
									  !"".equals(att_AgHospitalInfo.getManagerEmail().trim())){
										  if(likeStr!=null&&!"".equals(likeStr.trim())&&likeStr.indexOf("managerEmail")!=-1){
											  sbuffer.append( " and managerEmail  like '%"+att_AgHospitalInfo.getManagerEmail()+"%'"   );
										  }else {
											  sbuffer.append( " and managerEmail   ='"+att_AgHospitalInfo.getManagerEmail()+"'"   );
										  }
									 }
					       				//联系电话(contactMobile)		 					 
									 if(att_AgHospitalInfo.getContactMobile()!=null&&
									  !"".equals(att_AgHospitalInfo.getContactMobile().trim())){
										  if(likeStr!=null&&!"".equals(likeStr.trim())&&likeStr.indexOf("contactMobile")!=-1){
											  sbuffer.append( " and contactMobile  like '%"+att_AgHospitalInfo.getContactMobile()+"%'"   );
										  }else {
											  sbuffer.append( " and contactMobile   ='"+att_AgHospitalInfo.getContactMobile()+"'"   );
										  }
									 }
					       				//医院简介(introduction)		 					 
									 if(att_AgHospitalInfo.getIntroduction()!=null&&
									  !"".equals(att_AgHospitalInfo.getIntroduction().trim())){
										  if(likeStr!=null&&!"".equals(likeStr.trim())&&likeStr.indexOf("introduction")!=-1){
											  sbuffer.append( " and introduction  like '%"+att_AgHospitalInfo.getIntroduction()+"%'"   );
										  }else {
											  sbuffer.append( " and introduction   ='"+att_AgHospitalInfo.getIntroduction()+"'"   );
										  }
									 }
					       				//图标(icon)		 					 
									 if(att_AgHospitalInfo.getIcon()!=null&&
									  !"".equals(att_AgHospitalInfo.getIcon().trim())){
										  if(likeStr!=null&&!"".equals(likeStr.trim())&&likeStr.indexOf("icon")!=-1){
											  sbuffer.append( " and icon  like '%"+att_AgHospitalInfo.getIcon()+"%'"   );
										  }else {
											  sbuffer.append( " and icon   ='"+att_AgHospitalInfo.getIcon()+"'"   );
										  }
									 }
					       				//图片列表(images)		 					 
									 if(att_AgHospitalInfo.getImages()!=null&&
									  !"".equals(att_AgHospitalInfo.getImages().trim())){
										  if(likeStr!=null&&!"".equals(likeStr.trim())&&likeStr.indexOf("images")!=-1){
											  sbuffer.append( " and images  like '%"+att_AgHospitalInfo.getImages()+"%'"   );
										  }else {
											  sbuffer.append( " and images   ='"+att_AgHospitalInfo.getImages()+"'"   );
										  }
									 }
								  		//每月计划群发次数(monthlyMessagePlanCount)
					 					if(att_AgHospitalInfo.getMonthlyMessagePlanCount()!=null){
											 sbuffer.append( " and monthlyMessagePlanCount=" +att_AgHospitalInfo.getMonthlyMessagePlanCount() );
										 }
								  		//每月实际群发总数(monthlyMessageActualCount)
					 					if(att_AgHospitalInfo.getMonthlyMessageActualCount()!=null){
											 sbuffer.append( " and monthlyMessageActualCount=" +att_AgHospitalInfo.getMonthlyMessageActualCount() );
										 }
					       				//医院联系人姓名(registrationContactName)		 					 
									 if(att_AgHospitalInfo.getRegistrationContactName()!=null&&
									  !"".equals(att_AgHospitalInfo.getRegistrationContactName().trim())){
										  if(likeStr!=null&&!"".equals(likeStr.trim())&&likeStr.indexOf("registrationContactName")!=-1){
											  sbuffer.append( " and registrationContactName  like '%"+att_AgHospitalInfo.getRegistrationContactName()+"%'"   );
										  }else {
											  sbuffer.append( " and registrationContactName   ='"+att_AgHospitalInfo.getRegistrationContactName()+"'"   );
										  }
									 }
					       				//医院联系人电话(registrationContactMobile)		 					 
									 if(att_AgHospitalInfo.getRegistrationContactMobile()!=null&&
									  !"".equals(att_AgHospitalInfo.getRegistrationContactMobile().trim())){
										  if(likeStr!=null&&!"".equals(likeStr.trim())&&likeStr.indexOf("registrationContactMobile")!=-1){
											  sbuffer.append( " and registrationContactMobile  like '%"+att_AgHospitalInfo.getRegistrationContactMobile()+"%'"   );
										  }else {
											  sbuffer.append( " and registrationContactMobile   ='"+att_AgHospitalInfo.getRegistrationContactMobile()+"'"   );
										  }
									 }
					       				//医院联系人邮箱(registrationContactEmail)		 					 
									 if(att_AgHospitalInfo.getRegistrationContactEmail()!=null&&
									  !"".equals(att_AgHospitalInfo.getRegistrationContactEmail().trim())){
										  if(likeStr!=null&&!"".equals(likeStr.trim())&&likeStr.indexOf("registrationContactEmail")!=-1){
											  sbuffer.append( " and registrationContactEmail  like '%"+att_AgHospitalInfo.getRegistrationContactEmail()+"%'"   );
										  }else {
											  sbuffer.append( " and registrationContactEmail   ='"+att_AgHospitalInfo.getRegistrationContactEmail()+"'"   );
										  }
									 }
					       				//银行名称(bankName)		 					 
									 if(att_AgHospitalInfo.getBankName()!=null&&
									  !"".equals(att_AgHospitalInfo.getBankName().trim())){
										  if(likeStr!=null&&!"".equals(likeStr.trim())&&likeStr.indexOf("bankName")!=-1){
											  sbuffer.append( " and bankName  like '%"+att_AgHospitalInfo.getBankName()+"%'"   );
										  }else {
											  sbuffer.append( " and bankName   ='"+att_AgHospitalInfo.getBankName()+"'"   );
										  }
									 }
					       				//银行账户名称(bankAccountName)		 					 
									 if(att_AgHospitalInfo.getBankAccountName()!=null&&
									  !"".equals(att_AgHospitalInfo.getBankAccountName().trim())){
										  if(likeStr!=null&&!"".equals(likeStr.trim())&&likeStr.indexOf("bankAccountName")!=-1){
											  sbuffer.append( " and bankAccountName  like '%"+att_AgHospitalInfo.getBankAccountName()+"%'"   );
										  }else {
											  sbuffer.append( " and bankAccountName   ='"+att_AgHospitalInfo.getBankAccountName()+"'"   );
										  }
									 }
					       				//银行账号(bankAccountNumber)		 					 
									 if(att_AgHospitalInfo.getBankAccountNumber()!=null&&
									  !"".equals(att_AgHospitalInfo.getBankAccountNumber().trim())){
										  if(likeStr!=null&&!"".equals(likeStr.trim())&&likeStr.indexOf("bankAccountNumber")!=-1){
											  sbuffer.append( " and bankAccountNumber  like '%"+att_AgHospitalInfo.getBankAccountNumber()+"%'"   );
										  }else {
											  sbuffer.append( " and bankAccountNumber   ='"+att_AgHospitalInfo.getBankAccountNumber()+"'"   );
										  }
									 }
					       				//状态:0禁用1启用(status)		 					 
									 if(att_AgHospitalInfo.getStatus()!=null&&
									  !"".equals(att_AgHospitalInfo.getStatus().trim())){
										  if(likeStr!=null&&!"".equals(likeStr.trim())&&likeStr.indexOf("status")!=-1){
											  sbuffer.append( " and status  like '%"+att_AgHospitalInfo.getStatus()+"%'"   );
										  }else {
											  sbuffer.append( " and status   ='"+att_AgHospitalInfo.getStatus()+"'"   );
										  }
									 }
					       				//创建人(createRen)		 					 
									 if(att_AgHospitalInfo.getCreateRen()!=null&&
									  !"".equals(att_AgHospitalInfo.getCreateRen().trim())){
										  if(likeStr!=null&&!"".equals(likeStr.trim())&&likeStr.indexOf("createRen")!=-1){
											  sbuffer.append( " and createRen  like '%"+att_AgHospitalInfo.getCreateRen()+"%'"   );
										  }else {
											  sbuffer.append( " and createRen   ='"+att_AgHospitalInfo.getCreateRen()+"'"   );
										  }
									 }
						   				//创建时间(createDate)
						 				if(att_AgHospitalInfo.getCreateDate()!=null){
						   	                   sbuffer.append( " and  createDate='" +att_AgHospitalInfo.getCreateDate()+"'" );  
								  		}
					       				//修改人(editRen)		 					 
									 if(att_AgHospitalInfo.getEditRen()!=null&&
									  !"".equals(att_AgHospitalInfo.getEditRen().trim())){
										  if(likeStr!=null&&!"".equals(likeStr.trim())&&likeStr.indexOf("editRen")!=-1){
											  sbuffer.append( " and editRen  like '%"+att_AgHospitalInfo.getEditRen()+"%'"   );
										  }else {
											  sbuffer.append( " and editRen   ='"+att_AgHospitalInfo.getEditRen()+"'"   );
										  }
									 }
						   				//修改时间(editDate)
						 				if(att_AgHospitalInfo.getEditDate()!=null){
						   	                   sbuffer.append( " and  editDate='" +att_AgHospitalInfo.getEditDate()+"'" );  
								  		}
			 //*****************数据库字段处理end***************
			  		if(orderStr!=null&&!"".equals(orderStr.trim())){
									 sbuffer.append( " order by "+orderStr);
						 }
						 /*
						 else {
							  sbuffer.append( " order by  OrganizationId   desc " );
					      }
					      */
			 
			 return  sbuffer.toString();
	}
	@Override
	public List<Map<String, Object>> getProvAndCityList() throws HSKDBException {
		String sql = "SELECT prov_id,city_id FROM ag_hospital_info WHERE STATUS='0' GROUP BY prov_id,city_id ORDER BY prov_id,city_id";
		return this.getJdbcDao().query(sql);
	}
}