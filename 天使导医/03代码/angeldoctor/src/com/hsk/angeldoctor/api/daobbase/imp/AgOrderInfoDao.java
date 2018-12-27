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
 * ag_order_info表数据库层面操作实现类 
 * @author  作者:admin
 * @version  版本信息:v1.0   创建时间: 2018-08-14 13:35:36
 */
@Component
public class  AgOrderInfoDao extends SupperDao implements IAgOrderInfoDao {	

	/**
	 * 根据ag_order_info表主键查找AgOrderInfo对象记录
	 * 
	 * @param  AoiId  Integer类型(ag_order_info表主键)
	 * @return AgOrderInfo ag_order_info表记录
	 * @throws HSKDBException
	 */	
	public AgOrderInfo findAgOrderInfoById(Integer AoiId) throws HSKDBException{
				AgOrderInfo  att_AgOrderInfo=new AgOrderInfo();				
				if(AoiId!=null){
					att_AgOrderInfo.setAoiId(AoiId);	
				    Object obj=	this.getOne(att_AgOrderInfo);
					if(obj!=null){
						att_AgOrderInfo=(AgOrderInfo) obj;
					}
				}
				return  att_AgOrderInfo;
	}
	 /**
	  * 根据ag_order_info表主键删除AgOrderInfo对象记录
	  * @param  AoiId  Integer类型(ag_order_info表主键)
	  * @throws HSKDBException
	  */
	public void deleteAgOrderInfoById(Integer AoiId) throws HSKDBException{ 
		 AgOrderInfo  att_AgOrderInfo=new AgOrderInfo();	
		  if(AoiId!=null){
					  att_AgOrderInfo.setAoiId(AoiId);
				  	  Object obj=	this.getOne(att_AgOrderInfo);
					  if(obj!=null){
							this.deleteObject(obj); 
					  }
			}
	}

	/**
 	 * 根据ag_order_info表主键修改AgOrderInfo对象记录
     * @param  AoiId  Integer类型(ag_order_info表主键)
     * @param  att_AgOrderInfo  AgOrderInfo类型(ag_order_info表记录)
     * @return AgOrderInfo  修改后的AgOrderInfo对象记录
	 * @throws HSKDBException
	 */
	public  AgOrderInfo updateAgOrderInfoById(Integer AoiId,AgOrderInfo att_AgOrderInfo) throws HSKDBException{
		  if(AoiId!=null){
					att_AgOrderInfo.setAoiId(AoiId);
				   	Object obj=	this.getOne(att_AgOrderInfo);
					if(obj!=null){							 
							this.updateObject(obj);
					}
			}
			return  att_AgOrderInfo;
	}
	
	/**
	 * 新增ag_order_info表 记录
     * @param  att_AgOrderInfo  AgOrderInfo类型(ag_order_info表记录)
	 * @throws HSKDBException
	 */
	public Integer saveAgOrderInfo(AgOrderInfo att_AgOrderInfo) throws HSKDBException{
		 return this.newObject(att_AgOrderInfo);
	} 
		
	/**
	 * 新增或修改ag_order_info表记录 ,如果ag_order_info表主键AgOrderInfo.AoiId为空就是添加，如果非空就是修改
     * @param  att_AgOrderInfo  AgOrderInfo类型(ag_order_info表记录)
	 * @throws HSKDBException
	 */
	public  AgOrderInfo saveOrUpdateAgOrderInfo(AgOrderInfo att_AgOrderInfo) throws HSKDBException{
		  this.getHibernateTemplate().saveOrUpdate(att_AgOrderInfo);
		  return att_AgOrderInfo;
	}
	
	/**
	 *根据AgOrderInfo对象作为对(ag_order_info表进行查询，获取列表对象
     * @param  att_AgOrderInfo  AgOrderInfo类型(ag_order_info表记录)
     * @return List<AgOrderInfo>  列表对象
	 * @throws HSKDBException 
	 */
	 @SuppressWarnings("unchecked")
	public List<AgOrderInfo> getListByAgOrderInfo(AgOrderInfo att_AgOrderInfo) throws HSKDBException{
		String Hql=this.getHql( att_AgOrderInfo); 
		List<AgOrderInfo> list=this.getHibernateTemplate().find(Hql);
		return  list;
	}
	/**
	 *根据AgOrderInfo对象作为对(ag_order_info表进行查询，获取分页对象
     * @param  att_AgOrderInfo  AgOrderInfo类型(ag_order_info表记录)
     * @return List<AgOrderInfo>  分页对象
	 * @throws HSKDBException 
	 */
	public PagerModel getPagerModelByAgOrderInfo(AgOrderInfo att_AgOrderInfo)
			throws HSKDBException {
		String Hql=this.getHql(att_AgOrderInfo);
		return this.getHibernateDao().findByPage(Hql); 
	} 
	/**
	 * 根据AgOrderInfo对象获取Hql字符串
     * @param  att_AgOrderInfo  AgOrderInfo类型(ag_order_info表记录)
	 *  @return hql字符串
	 */
	private String  getHql(AgOrderInfo att_AgOrderInfo){
			 StringBuffer sbuffer = new StringBuffer( " from  AgOrderInfo  where  1=1  ");
			 String likeStr=  att_AgOrderInfo.getTab_like();
			 String orderStr= att_AgOrderInfo.getTab_order();
			 
			 //*****************无关字段处理begin*****************
						   		 //处理in条件 预约ID(aoiId)
							     if(att_AgOrderInfo.getAoiId_str()!=null&&
						   		    !"".equals(att_AgOrderInfo.getAoiId_str().trim())){ 
											 String  intStr=att_AgOrderInfo.getAoiId_str().trim();
											 String[]  arrayStr=intStr.split(","); 
											 
											  if(arrayStr.length>0){
												 sbuffer.append(" and ( ");
												 for(int i=0;i<arrayStr.length;i++){
													 String did=arrayStr[i];
													 if(i==arrayStr.length-1){
														 sbuffer.append("  aoiId="+did+"   "); 
													 }else {
													 sbuffer.append("  aoiId="+did+" or "); 
													 }
												 }
												 sbuffer.append(" ) "); 
											 }
											   
								 	}
						   		 //处理in条件 医院ID(organizationId)
							     if(att_AgOrderInfo.getOrganizationId_str()!=null&&
						   		    !"".equals(att_AgOrderInfo.getOrganizationId_str().trim())){ 
											 String  intStr=att_AgOrderInfo.getOrganizationId_str().trim();
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
						   		 //处理in条件 业务员ID(agentId)
							     if(att_AgOrderInfo.getAgentId_str()!=null&&
						   		    !"".equals(att_AgOrderInfo.getAgentId_str().trim())){ 
											 String  intStr=att_AgOrderInfo.getAgentId_str().trim();
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
						   		 //处理in条件 科室ID(departmentId)
							     if(att_AgOrderInfo.getDepartmentId_str()!=null&&
						   		    !"".equals(att_AgOrderInfo.getDepartmentId_str().trim())){ 
											 String  intStr=att_AgOrderInfo.getDepartmentId_str().trim();
											 String[]  arrayStr=intStr.split(","); 
											 
											  if(arrayStr.length>0){
												 sbuffer.append(" and ( ");
												 for(int i=0;i<arrayStr.length;i++){
													 String did=arrayStr[i];
													 if(i==arrayStr.length-1){
														 sbuffer.append("  departmentId="+did+"   "); 
													 }else {
													 sbuffer.append("  departmentId="+did+" or "); 
													 }
												 }
												 sbuffer.append(" ) "); 
											 }
											   
								 	}
						   		 //处理in条件 排班ID(shiftPlanId)
							     if(att_AgOrderInfo.getShiftPlanId_str()!=null&&
						   		    !"".equals(att_AgOrderInfo.getShiftPlanId_str().trim())){ 
											 String  intStr=att_AgOrderInfo.getShiftPlanId_str().trim();
											 String[]  arrayStr=intStr.split(","); 
											 
											  if(arrayStr.length>0){
												 sbuffer.append(" and ( ");
												 for(int i=0;i<arrayStr.length;i++){
													 String did=arrayStr[i];
													 if(i==arrayStr.length-1){
														 sbuffer.append("  shiftPlanId="+did+"   "); 
													 }else {
													 sbuffer.append("  shiftPlanId="+did+" or "); 
													 }
												 }
												 sbuffer.append(" ) "); 
											 }
											   
								 	}
						   		 //处理in条件 排班时间ID(shiftPeriodId)
							     if(att_AgOrderInfo.getShiftPeriodId_str()!=null&&
						   		    !"".equals(att_AgOrderInfo.getShiftPeriodId_str().trim())){ 
											 String  intStr=att_AgOrderInfo.getShiftPeriodId_str().trim();
											 String[]  arrayStr=intStr.split(","); 
											 
											  if(arrayStr.length>0){
												 sbuffer.append(" and ( ");
												 for(int i=0;i<arrayStr.length;i++){
													 String did=arrayStr[i];
													 if(i==arrayStr.length-1){
														 sbuffer.append("  shiftPeriodId="+did+"   "); 
													 }else {
													 sbuffer.append("  shiftPeriodId="+did+" or "); 
													 }
												 }
												 sbuffer.append(" ) "); 
											 }
											   
								 	}
						   		 //处理in条件 患者ID(patientId)
							     if(att_AgOrderInfo.getPatientId_str()!=null&&
						   		    !"".equals(att_AgOrderInfo.getPatientId_str().trim())){ 
											 String  intStr=att_AgOrderInfo.getPatientId_str().trim();
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
						   		 //处理in条件 医生ID(doctorId)
							     if(att_AgOrderInfo.getDoctorId_str()!=null&&
						   		    !"".equals(att_AgOrderInfo.getDoctorId_str().trim())){ 
											 String  intStr=att_AgOrderInfo.getDoctorId_str().trim();
											 String[]  arrayStr=intStr.split(","); 
											 
											  if(arrayStr.length>0){
												 sbuffer.append(" and ( ");
												 for(int i=0;i<arrayStr.length;i++){
													 String did=arrayStr[i];
													 if(i==arrayStr.length-1){
														 sbuffer.append("  doctorId="+did+"   "); 
													 }else {
													 sbuffer.append("  doctorId="+did+" or "); 
													 }
												 }
												 sbuffer.append(" ) "); 
											 }
											   
								 	}
						   		 //处理in条件 上一次预约ID(parentRegistrationId)
							     if(att_AgOrderInfo.getParentRegistrationId_str()!=null&&
						   		    !"".equals(att_AgOrderInfo.getParentRegistrationId_str().trim())){ 
											 String  intStr=att_AgOrderInfo.getParentRegistrationId_str().trim();
											 String[]  arrayStr=intStr.split(","); 
											 
											  if(arrayStr.length>0){
												 sbuffer.append(" and ( ");
												 for(int i=0;i<arrayStr.length;i++){
													 String did=arrayStr[i];
													 if(i==arrayStr.length-1){
														 sbuffer.append("  parentRegistrationId="+did+"   "); 
													 }else {
													 sbuffer.append("  parentRegistrationId="+did+" or "); 
													 }
												 }
												 sbuffer.append(" ) "); 
											 }
											   
								 	}
							     SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");
							 		//时间类型开始条件处理  创建时间(createDate)
								  if(att_AgOrderInfo.getCreateDate_start()!=null){
							   	    	sbuffer.append( " and  createDate >='" +sdf.format(att_AgOrderInfo.getCreateDate_start())+" 00:00:00'" );  
									 }
							 	  //时间类型结束条件处理 创建时间(createDate)
								 	if(att_AgOrderInfo.getCreateDate_end()!=null){
					   	      			sbuffer.append( " and  createDate<='" +sdf.format(att_AgOrderInfo.getCreateDate_end())+" 23:59:59'" );  
							  	     } 
								 		//时间类型开始条件处理  预约时间(registerDate)
									  if(att_AgOrderInfo.getRegisterDate_start()!=null){
								   	    	sbuffer.append( " and  registerDate>='" +sdf.format(att_AgOrderInfo.getRegisterDate_start())+" 00:00:00'" );  
										 }
								 	  //时间类型结束条件处理 预约时间(registerDate)
									 	if(att_AgOrderInfo.getRegisterDate_end()!=null){
						   	      			sbuffer.append( " and  registerDate<='" +sdf.format(att_AgOrderInfo.getRegisterDate_end())+" 23:59:59'" );  
								  	     } 
								 		
								 		//时间类型开始条件处理  修改时间(editDate)
									  if(att_AgOrderInfo.getEditDate_start()!=null){
								   	    	sbuffer.append( " and  editDate<='" +att_AgOrderInfo.getEditDate_start()+"'" );  
										 }
								 	  //时间类型结束条件处理 修改时间(editDate)
									 	if(att_AgOrderInfo.getEditDate_end()!=null){
						   	      			sbuffer.append( " and  editDate>'" +att_AgOrderInfo.getEditDate_end()+"'" );  
								  	     } 
			 //*****************无关字段处理end*****************
			 //*****************数据库字段处理begin*************
								  		//预约ID(aoiId)
					 					if(att_AgOrderInfo.getAoiId()!=null){
											 sbuffer.append( " and aoiId=" +att_AgOrderInfo.getAoiId() );
										 }
					       				//预约编号(serialNumber)		 					 
									 if(att_AgOrderInfo.getSerialNumber()!=null&&
									  !"".equals(att_AgOrderInfo.getSerialNumber().trim())){
										  if(likeStr!=null&&!"".equals(likeStr.trim())&&likeStr.indexOf("serialNumber")!=-1){
											  sbuffer.append( " and serialNumber  like '%"+att_AgOrderInfo.getSerialNumber()+"%'"   );
										  }else {
											  sbuffer.append( " and serialNumber   ='"+att_AgOrderInfo.getSerialNumber()+"'"   );
										  }
									 }
								  		//医院ID(organizationId)
					 					if(att_AgOrderInfo.getOrganizationId()!=null){
											 sbuffer.append( " and organizationId=" +att_AgOrderInfo.getOrganizationId() );
										 }
								  		//业务员ID(agentId)
					 					if(att_AgOrderInfo.getAgentId()!=null){
											 sbuffer.append( " and agentId=" +att_AgOrderInfo.getAgentId() );
										 }
								  		//科室ID(departmentId)
					 					if(att_AgOrderInfo.getDepartmentId()!=null){
											 sbuffer.append( " and departmentId=" +att_AgOrderInfo.getDepartmentId() );
										 }
								  		//排班ID(shiftPlanId)
					 					if(att_AgOrderInfo.getShiftPlanId()!=null){
											 sbuffer.append( " and shiftPlanId=" +att_AgOrderInfo.getShiftPlanId() );
										 }
								  		//排班时间ID(shiftPeriodId)
					 					if(att_AgOrderInfo.getShiftPeriodId()!=null){
											 sbuffer.append( " and shiftPeriodId=" +att_AgOrderInfo.getShiftPeriodId() );
										 }
								  		//患者ID(patientId)
					 					if(att_AgOrderInfo.getPatientId()!=null){
											 sbuffer.append( " and patientId=" +att_AgOrderInfo.getPatientId() );
										 }
					 					//代理商ID
					 					if(att_AgOrderInfo.getAaiId()!=null){
											 sbuffer.append( " and aaiId=" +att_AgOrderInfo.getAaiId() );
										 }
					 					//一级业务员ID
					 					if(att_AgOrderInfo.getFirstAgentId()!=null){
											 sbuffer.append( " and firstAgentId=" +att_AgOrderInfo.getFirstAgentId() );
										 }
					 					//二级业务员ID
					 					if(att_AgOrderInfo.getPatientId()!=null){
											 sbuffer.append( " and secondAgentId=" +att_AgOrderInfo.getSecondAgentId());
										 }
					 					//患者来源
					 					if(att_AgOrderInfo.getPatientSource()!=null){
											 sbuffer.append( " and patientSource=" +att_AgOrderInfo.getPatientSource());
										 }
								  		//医生ID(doctorId)
					 					if(att_AgOrderInfo.getDoctorId()!=null){
											 sbuffer.append( " and doctorId=" +att_AgOrderInfo.getDoctorId() );
										 }
								  		//上一次预约ID(parentRegistrationId)
					 					if(att_AgOrderInfo.getParentRegistrationId()!=null){
											 sbuffer.append( " and parentRegistrationId=" +att_AgOrderInfo.getParentRegistrationId() );
										 }
					       				//业务类型：0:app代约;1:微信预约；3复诊(registerType)		 					 
									 if(att_AgOrderInfo.getRegisterType()!=null&&
									  !"".equals(att_AgOrderInfo.getRegisterType().trim())){
										  if(likeStr!=null&&!"".equals(likeStr.trim())&&likeStr.indexOf("registerType")!=-1){
											  sbuffer.append( " and registerType  like '%"+att_AgOrderInfo.getRegisterType()+"%'"   );
										  }else {
											  sbuffer.append( " and registerType   ='"+att_AgOrderInfo.getRegisterType()+"'"   );
										  }
									 }
						   				//预约时间(registerDate)
						 				if(att_AgOrderInfo.getRegisterDate()!=null){
						   	                   sbuffer.append( " and  registerDate='" +att_AgOrderInfo.getRegisterDate()+"'" );  
								  		}
					       				//患者名称(patientName)		 					 
									 if(att_AgOrderInfo.getPatientName()!=null&&
									  !"".equals(att_AgOrderInfo.getPatientName().trim())){
										  if(likeStr!=null&&!"".equals(likeStr.trim())&&likeStr.indexOf("patientName")!=-1){
											  sbuffer.append( " and patientName  like '%"+att_AgOrderInfo.getPatientName()+"%'"   );
										  }else {
											  sbuffer.append( " and patientName   ='"+att_AgOrderInfo.getPatientName()+"'"   );
										  }
									 }
					       				//患者手机号(patientMobile)		 					 
									 if(att_AgOrderInfo.getPatientMobile()!=null&&
									  !"".equals(att_AgOrderInfo.getPatientMobile().trim())){
										  if(likeStr!=null&&!"".equals(likeStr.trim())&&likeStr.indexOf("patientMobile")!=-1){
											  sbuffer.append( " and patientMobile  like '%"+att_AgOrderInfo.getPatientMobile()+"%'"   );
										  }else {
											  sbuffer.append( " and patientMobile   ='"+att_AgOrderInfo.getPatientMobile()+"'"   );
										  }
									 }
					       				//性别(patientGender)		 					 
									 if(att_AgOrderInfo.getPatientGender()!=null&&
									  !"".equals(att_AgOrderInfo.getPatientGender().trim())){
										  if(likeStr!=null&&!"".equals(likeStr.trim())&&likeStr.indexOf("patientGender")!=-1){
											  sbuffer.append( " and patientGender  like '%"+att_AgOrderInfo.getPatientGender()+"%'"   );
										  }else {
											  sbuffer.append( " and patientGender   ='"+att_AgOrderInfo.getPatientGender()+"'"   );
										  }
									 }
					       				//年龄(patientAge)		 					 
									 if(att_AgOrderInfo.getPatientAge()!=null&&
									  !"".equals(att_AgOrderInfo.getPatientAge().trim())){
										  if(likeStr!=null&&!"".equals(likeStr.trim())&&likeStr.indexOf("patientAge")!=-1){
											  sbuffer.append( " and patientAge  like '%"+att_AgOrderInfo.getPatientAge()+"%'"   );
										  }else {
											  sbuffer.append( " and patientAge   ='"+att_AgOrderInfo.getPatientAge()+"'"   );
										  }
									 }
					       				//描述(description)		 					 
									 if(att_AgOrderInfo.getDescription()!=null&&
									  !"".equals(att_AgOrderInfo.getDescription().trim())){
										  if(likeStr!=null&&!"".equals(likeStr.trim())&&likeStr.indexOf("description")!=-1){
											  sbuffer.append( " and description  like '%"+att_AgOrderInfo.getDescription()+"%'"   );
										  }else {
											  sbuffer.append( " and description   ='"+att_AgOrderInfo.getDescription()+"'"   );
										  }
									 }
					       				//预约人姓名(outpatientName)		 					 
									 if(att_AgOrderInfo.getOutpatientName()!=null&&
									  !"".equals(att_AgOrderInfo.getOutpatientName().trim())){
										  if(likeStr!=null&&!"".equals(likeStr.trim())&&likeStr.indexOf("outpatientName")!=-1){
											  sbuffer.append( " and outpatientName  like '%"+att_AgOrderInfo.getOutpatientName()+"%'"   );
										  }else {
											  sbuffer.append( " and outpatientName   ='"+att_AgOrderInfo.getOutpatientName()+"'"   );
										  }
									 }
					       				//预约状态(0:预约成功;1:代约成功;2:代约取消)(registerStatus)		 					 
									 if(att_AgOrderInfo.getRegisterStatus()!=null&&
									  !"".equals(att_AgOrderInfo.getRegisterStatus().trim())){
										  if(likeStr!=null&&!"".equals(likeStr.trim())&&likeStr.indexOf("registerStatus")!=-1){
											  sbuffer.append( " and registerStatus  like '%"+att_AgOrderInfo.getRegisterStatus()+"%'"   );
										  }else {
											  sbuffer.append( " and registerStatus   ='"+att_AgOrderInfo.getRegisterStatus()+"'"   );
										  }
									 }
					       				//门诊状态(0:结诊;1:未到;2:待诊中;3:已取消)(outpatientStatus)		 					 
									 if(att_AgOrderInfo.getOutpatientStatus()!=null&&
									  !"".equals(att_AgOrderInfo.getOutpatientStatus().trim())){
										  if(likeStr!=null&&!"".equals(likeStr.trim())&&likeStr.indexOf("outpatientStatus")!=-1){
											  sbuffer.append( " and outpatientStatus  like '%"+att_AgOrderInfo.getOutpatientStatus()+"%'"   );
										  }else {
											  sbuffer.append( " and outpatientStatus   ='"+att_AgOrderInfo.getOutpatientStatus()+"'"   );
										  }
									 }
					       				//是否自增:0是1否(chargeType)		 					 
									 if(att_AgOrderInfo.getChargeType()!=null&&
									  !"".equals(att_AgOrderInfo.getChargeType().trim())){
										  if(likeStr!=null&&!"".equals(likeStr.trim())&&likeStr.indexOf("chargeType")!=-1){
											  sbuffer.append( " and chargeType  like '%"+att_AgOrderInfo.getChargeType()+"%'"   );
										  }else {
											  sbuffer.append( " and chargeType   ='"+att_AgOrderInfo.getChargeType()+"'"   );
										  }
									 }
					       				//状态:1正常，2禁用(status)		 					 
									 if(att_AgOrderInfo.getStatus()!=null&&
									  !"".equals(att_AgOrderInfo.getStatus().trim())){
										  if(likeStr!=null&&!"".equals(likeStr.trim())&&likeStr.indexOf("status")!=-1){
											  sbuffer.append( " and status  like '%"+att_AgOrderInfo.getStatus()+"%'"   );
										  }else {
											  sbuffer.append( " and status   ='"+att_AgOrderInfo.getStatus()+"'"   );
										  }
									 }
					       				//创建人(createRen)		 					 
									 if(att_AgOrderInfo.getCreateRen()!=null&&
									  !"".equals(att_AgOrderInfo.getCreateRen().trim())){
										  if(likeStr!=null&&!"".equals(likeStr.trim())&&likeStr.indexOf("createRen")!=-1){
											  sbuffer.append( " and createRen  like '%"+att_AgOrderInfo.getCreateRen()+"%'"   );
										  }else {
											  sbuffer.append( " and createRen   ='"+att_AgOrderInfo.getCreateRen()+"'"   );
										  }
									 }
						   				//创建时间(createDate)
						 				if(att_AgOrderInfo.getCreateDate()!=null){
						   	                   sbuffer.append( " and  createDate='" +att_AgOrderInfo.getCreateDate()+"'" );  
								  		}
					       				//修改人(editRen)		 					 
									 if(att_AgOrderInfo.getEditRen()!=null&&
									  !"".equals(att_AgOrderInfo.getEditRen().trim())){
										  if(likeStr!=null&&!"".equals(likeStr.trim())&&likeStr.indexOf("editRen")!=-1){
											  sbuffer.append( " and editRen  like '%"+att_AgOrderInfo.getEditRen()+"%'"   );
										  }else {
											  sbuffer.append( " and editRen   ='"+att_AgOrderInfo.getEditRen()+"'"   );
										  }
									 }
						   				//修改时间(editDate)
						 				if(att_AgOrderInfo.getEditDate()!=null){
						   	                   sbuffer.append( " and  editDate='" +att_AgOrderInfo.getEditDate()+"'" );  
								  		}
			 //*****************数据库字段处理end***************
			  		if(orderStr!=null&&!"".equals(orderStr.trim())){
									 sbuffer.append( " order by "+orderStr);
						 }
						 /*
						 else {
							  sbuffer.append( " order by  AoiId   desc " );
					      }
					      */
			 
			 return  sbuffer.toString();
	}
	@Override
	public PagerModel getPagerAgOrderView(AgOrderView agOrderView, String registerStartDate, String registerEndDate) throws HSKDBException {
		String hql ="from AgOrderView where 1=1";
		//患者姓名
		if(agOrderView.getPatientName() != null && !agOrderView.getPatientName().trim().equals(""))
			hql+=" and patientName like '%"+agOrderView.getPatientName().trim()+"%'";
		if(agOrderView.getOutpatientName() != null && !agOrderView.getOutpatientName().trim().equals(""))
			hql+=" and outpatientName like '%"+agOrderView.getOutpatientName().trim()+"%'";
		//医院名称
		if(agOrderView.getOrganizationName() != null && !agOrderView.getOrganizationName().trim().equals(""))
			hql+=" and organizationName like '%"+agOrderView.getOrganizationName().trim()+"%'";
		//患者手机号
		if(agOrderView.getPatientMobile() != null && !agOrderView.getPatientMobile().trim().equals(""))
			hql+=" and patientMobile like '%"+agOrderView.getPatientMobile().trim()+"%'";
		//医生名称
		if(agOrderView.getDoctorName() != null && !agOrderView.getDoctorName().trim().equals(""))
			hql+=" and doctorName like '%"+agOrderView.getDoctorName().trim()+"%'";
		//代约人手机号
		if(agOrderView.getAgentMobile() != null && !agOrderView.getAgentMobile().trim().equals(""))
			hql+=" and agentMobile like '%"+agOrderView.getAgentMobile().trim()+"%'";
		//一级业务员手机号
		if(agOrderView.getFirstAgentMobile() != null && !agOrderView.getFirstAgentMobile().trim().equals(""))
			hql+=" and firstAgentMobile like '%"+agOrderView.getFirstAgentMobile().trim()+"%'";
		//来源
		if(agOrderView.getPatientSource() != null && !agOrderView.getPatientSource().trim().equals(""))
			hql+=" and patientSource = '"+agOrderView.getPatientSource().trim()+"'";
		//类型
		if(agOrderView.getRegisterType() != null && !agOrderView.getRegisterType().trim().equals(""))
			hql+=" and registerType in ("+agOrderView.getRegisterType().trim()+")";
		if(agOrderView.getOutpatientStatus() != null && !agOrderView.getOutpatientStatus().trim().equals(""))
			hql+=" and outpatientStatus in ("+agOrderView.getOutpatientStatus().trim()+")";
		if(agOrderView.getRegisterStatus() != null && !agOrderView.getRegisterStatus().trim().equals(""))
			hql+=" and registerStatus in ("+agOrderView.getRegisterStatus().trim()+")";
		//
		if(registerStartDate != null && !registerStartDate.trim().equals(""))
			hql+=" and registerDate >='"+registerStartDate.trim()+" 00:00:00'";
		if(registerEndDate != null && !registerEndDate.trim().equals(""))
			hql+=" and registerDate <='"+registerEndDate.trim()+" 23:59:59'";
		if(agOrderView.getOrganizationId()!=null)
			hql += " and organizationId="+agOrderView.getOrganizationId();
		if(agOrderView.getAaiId()!=null)
			hql += " and aaiId="+agOrderView.getAaiId();
		if(agOrderView.getPreviousRegistrationStr()!=null && agOrderView.getPreviousRegistrationStr().equals("1"))
			hql += " and parentRegistrationId is not null";
		else if(agOrderView.getPreviousRegistrationStr()!=null && agOrderView.getPreviousRegistrationStr().equals("0"))
			hql += " and parentRegistrationId is null";
		if(agOrderView.getFilterStr() != null && !agOrderView.getFilterStr().trim().equals("")){
			hql += " and ("+agOrderView.getFilterStr()+")";
		}
		return this.getHibernateDao().findByPage(hql); 
	}
	@Override
	public AgOrderView getAgOrderViewById(Integer aoiId) throws HSKDBException {
		AgOrderView  att_AgOrderView=new AgOrderView();				
		if(aoiId!=null){
			att_AgOrderView.setAoiId(aoiId);	
		    Object obj=	this.getOne(att_AgOrderView);
			if(obj!=null){
				att_AgOrderView=(AgOrderView) obj;
			}
		}
		return  att_AgOrderView;
	}
	@Override
	public AgOrderView getAgOrderViewBySerialNumber(String serialNumber)
			throws HSKDBException {
		AgOrderView agOrderView = new AgOrderView();
		String hql="from AgOrderView where serialNumber='"+serialNumber+"'";
		List<AgOrderView> reList =this.getHibernateTemplate().find(hql);
		if(reList !=null && reList.size() >0)
			return reList.get(0);
		return agOrderView;
	}
	@Override
	public Map<String, List<Map<String, Object>>> getAchievementList(String aaiIds, String filterKey,
			String filterStartDate, String filterEndDate) throws HSKDBException {
		Map<String, List<Map<String, Object>>> reMap= new HashMap<String, List<Map<String, Object>>>();
		String filterStr="";
		String sql1="SELECT COUNT(1) AS shu,a.aai_id FROM ag_order_view a WHERE a.aai_id IN ("+aaiIds+") AND a.register_type='0'";//获取待约人次
		String sql2="SELECT COUNT(a.patient_id) AS shu,a.aai_id FROM ag_order_view a WHERE a.aai_id IN ("+aaiIds+") AND a.register_type='0'";//获取待约人数
		String sql3="SELECT COUNT(1) AS shu,SUM(drug_fee) AS drug_fee,SUM(treatment_fee) AS treatment_fee,a.aai_id "
				+"FROM ag_order_view a WHERE a.aai_id IN ("+aaiIds+") AND a.register_type='0' AND a.outpatient_status='0'";//获取待约结诊
		String sql4="SELECT COUNT(1) AS shu,a.aai_id FROM ag_order_view a WHERE a.aai_id IN ("+aaiIds+") AND a.register_type='1'";//获取预约人次
		String sql5="SELECT COUNT(a.patient_id) AS shu,a.aai_id FROM ag_order_view a WHERE a.aai_id IN ("+aaiIds+") AND a.register_type='1'";//获取预约人数
		String sql6="SELECT COUNT(1) AS shu,SUM(drug_fee) AS drug_fee,SUM(treatment_fee) AS treatment_fee,a.aai_id "
				+"FROM ag_order_view a WHERE a.aai_id IN ("+aaiIds+") AND a.register_type='0' AND a.outpatient_status='1'";//获取预约结诊
		if(filterKey!=null){
			if(filterKey.equals("agentRegistrationsCount") || filterKey.equals("agentRegistrationsPatientCount")){//待约时间
				sql4=null;
				sql5=null;
				sql6=null;
				if(filterStartDate !=null && !filterStartDate.trim().equals("")){
					sql1+=" and a.create_date>='"+filterStartDate.trim()+" 00:00:00'";
					sql2+=" and a.create_date>='"+filterStartDate.trim()+" 00:00:00'";
					sql3+=" and a.create_date>='"+filterStartDate.trim()+" 00:00:00'";
				}
				if(filterEndDate !=null && !filterEndDate.trim().equals("")){
					sql1+=" and a.create_date<='"+filterEndDate.trim()+" 23:59:59'";
					sql2+=" and a.create_date<='"+filterEndDate.trim()+" 23:59:59'";
					sql3+=" and a.create_date<='"+filterEndDate.trim()+" 23:59:59'";
				}
			}else if(filterKey.equals("agentRegistrationsOrderCount") || filterKey.equals("agentRegistrationsTotalTreatmentFee") 
					|| filterKey.equals("agentRegistrationsTotalTreatmentFee") || filterKey.equals("agentRegistrationsTotalDrugFee")){//待约结诊时间
				sql4=null;
				sql5=null;
				sql6=null;
				if(filterStartDate !=null && !filterStartDate.trim().equals("")){
					sql1+=" and a.deal_date>='"+filterStartDate.trim()+" 00:00:00'";
					sql2+=" and a.deal_date>='"+filterStartDate.trim()+" 00:00:00'";
					sql3+=" and a.deal_date>='"+filterStartDate.trim()+" 00:00:00'";
				}
				if(filterEndDate !=null && !filterEndDate.trim().equals("")){
					sql1+=" and a.deal_date<='"+filterEndDate.trim()+" 23:59:59'";
					sql2+=" and a.deal_date<='"+filterEndDate.trim()+" 23:59:59'";
					sql3+=" and a.deal_date<='"+filterEndDate.trim()+" 23:59:59'";
				}
			}else if(filterKey.equals("sceneRegistrationsCount") || filterKey.equals("sceneRegistrationsPatientCount") ){//预约时间
				sql1=null;
				sql2=null;
				sql3=null;
				if(filterStartDate !=null && !filterStartDate.trim().equals("")){
					sql4+=" and a.create_date>='"+filterStartDate.trim()+" 00:00:00'";
					sql5+=" and a.create_date>='"+filterStartDate.trim()+" 00:00:00'";
					sql6+=" and a.create_date>='"+filterStartDate.trim()+" 00:00:00'";
				}
				if(filterEndDate !=null && !filterEndDate.trim().equals("")){
					sql4+=" and a.create_date<='"+filterEndDate.trim()+" 23:59:59'";
					sql5+=" and a.create_date<='"+filterEndDate.trim()+" 23:59:59'";
					sql6+=" and a.create_date<='"+filterEndDate.trim()+" 23:59:59'";
				}
			}else if(filterKey.equals("sceneRegistrationsOrderCount") || filterKey.equals("sceneRegistrationsTotalTreatmentFee") 
					|| filterKey.equals("sceneRegistrationsTotalTreatmentFee") || filterKey.equals("sceneRegistrationsTotalDrugFee")){//预约结诊时间
				sql1=null;
				sql2=null;
				sql3=null;
				if(filterStartDate !=null && !filterStartDate.trim().equals("")){
					sql4+=" and a.deal_date>='"+filterStartDate.trim()+" 00:00:00'";
					sql5+=" and a.deal_date>='"+filterStartDate.trim()+" 00:00:00'";
					sql6+=" and a.deal_date>='"+filterStartDate.trim()+" 00:00:00'";
				}
				if(filterEndDate !=null && !filterEndDate.trim().equals("")){
					sql4+=" and a.deal_date<='"+filterEndDate.trim()+" 23:59:59'";
					sql5+=" and a.deal_date<='"+filterEndDate.trim()+" 23:59:59'";
					sql6+=" and a.deal_date<='"+filterEndDate.trim()+" 23:59:59'";
				}
			}
		}
		if(sql1!=null){
			sql1+=" GROUP BY a.aai_id  ";
			List<Map<String,Object>> dyrcList=this.getJdbcDao().query(sql1);
			reMap.put("dyrc", dyrcList);
		}
		if(sql2!=null){
			sql2+=" GROUP BY a.aai_id,a.patient_id";
			List<Map<String,Object>> dyrsList=this.getJdbcDao().query(sql2);
			reMap.put("dyrs", dyrsList);
		}
		if(sql3!=null){
			sql3+= " GROUP BY a.aai_id,a.patient_id";
			List<Map<String,Object>> dyjzList=this.getJdbcDao().query(sql3);
			reMap.put("dyjz", dyjzList);
		}
		if(sql4!=null){
			sql4+=" GROUP BY a.aai_id  ";
			List<Map<String,Object>> yyrcList=this.getJdbcDao().query(sql4);
			reMap.put("yyrc", yyrcList);
		}
		if(sql5!=null){
			sql5+=" GROUP BY a.aai_id,a.patient_id";
			List<Map<String,Object>> yyrsList=this.getJdbcDao().query(sql5);
			reMap.put("yyrs", yyrsList);
		}
		if(sql6!=null){
			sql6+= " GROUP BY a.aai_id,a.patient_id";
			List<Map<String,Object>> yyjzList=this.getJdbcDao().query(sql6);
			reMap.put("yyjz", yyjzList);
		}
		return reMap;
	}
	@Override
	public List<Map<String, Object>> getAgentAchievementList(String agentId, String filterKey,
			String filterStartDate, String filterEndDate) throws HSKDBException {
		 List<Map<String, Object>> reList= new ArrayList<Map<String, Object>>();
		String filterStr="";
		String sql="SELECT COUNT(1) AS shu,SUM(a.treatment_fee+a.drug_fee) AS total_free,SUM(treatment_fee) AS treatment_fee,SUM(drug_fee) AS drug_fee,a.agent_id "
				+"FROM ag_order_view a WHERE a.agent_id IN ("+agentId+") AND a.register_type='0'";//获取待约结诊
		if(filterKey!=null){
			if(filterKey.equals("agentRegistrationsCount") || filterKey.equals("agentRegistrationsPatientCount")){//待约时间
				if(filterStartDate !=null && !filterStartDate.trim().equals("")){
					sql+=" and a.create_date>='"+filterStartDate.trim()+" 00:00:00'";
					
				}
				if(filterEndDate !=null && !filterEndDate.trim().equals("")){
					sql+=" and a.create_date<='"+filterEndDate.trim()+" 23:59:59'";
				}
			}else if(filterKey.equals("agentRegistrationsOrderCount") || filterKey.equals("agentRegistrationsTotalTreatmentFee") 
					|| filterKey.equals("agentRegistrationsTotalTreatmentFee") || filterKey.equals("agentRegistrationsTotalDrugFee")){//待约结诊时间
				if(filterStartDate !=null && !filterStartDate.trim().equals("")){
					sql+=" and a.deal_date>='"+filterStartDate.trim()+" 00:00:00'";
				}
				if(filterEndDate !=null && !filterEndDate.trim().equals("")){
					sql+=" and a.deal_date<='"+filterEndDate.trim()+" 23:59:59'";
				}
			}
		}
		sql+=" GROUP BY a.agent_id";
		return this.getJdbcDao().query(sql);
	}
	@Override
	public Map<String,List<Map<String,Object>>> getDirectAgentAchievementList(String agentId) throws HSKDBException {
		
		Map<String, List<Map<String, Object>>> reMap= new HashMap<String, List<Map<String, Object>>>();
		String sql1="SELECT COUNT(1) AS shu,a.first_agent_id as agent_id FROM ag_order_view a WHERE a.first_agent_id IN ("+agentId+") AND a.register_type='0'";//获取待约人次
		String sql2="SELECT COUNT(a.patient_id) AS shu,a.first_agent_id as agent_id FROM ag_order_view a WHERE a.first_agent_id IN ("+agentId+") AND a.register_type='0'";//获取待约人数
		String sql3="SELECT COUNT(1) AS shu,SUM(drug_fee) AS drug_fee,SUM(treatment_fee) AS treatment_fee,a.first_agent_id as agent_id "
				+"FROM ag_order_view a WHERE a.first_agent_id IN ("+agentId+") AND a.register_type='0' AND a.outpatient_status='0'";//获取待约结诊
		String sql4="SELECT COUNT(1) AS shu,a.first_agent_id as agent_id FROM ag_order_view a WHERE a.first_agent_id IN ("+agentId+") AND a.register_type='1'";//获取预约人次
		String sql5="SELECT COUNT(a.patient_id) AS shu,a.first_agent_id as agent_id FROM ag_order_view a WHERE a.first_agent_id IN ("+agentId+") AND a.register_type='1'";//获取预约人数
		String sql6="SELECT COUNT(1) AS shu,SUM(drug_fee) AS drug_fee,SUM(treatment_fee) AS treatment_fee,a.first_agent_id as agent_id"
				+"FROM ag_order_view a WHERE a.first_agent_id IN ("+agentId+") AND a.register_type='0' AND a.outpatient_status='1'";//获取预约结诊
		
		sql1+=" GROUP BY a.first_agent_id  ";
		List<Map<String,Object>> dyrcList=this.getJdbcDao().query(sql1);
		reMap.put("dyrc", dyrcList);
		
		sql2+=" GROUP BY a.first_agent_id,a.patient_id";
		List<Map<String,Object>> dyrsList=this.getJdbcDao().query(sql2);
		reMap.put("dyrs", dyrsList);

		sql3+= " GROUP BY a.first_agent_id,a.patient_id";
		List<Map<String,Object>> dyjzList=this.getJdbcDao().query(sql3);
		reMap.put("dyjz", dyjzList);
		
		sql4+=" GROUP BY a.first_agent_id  ";
		List<Map<String,Object>> yyrcList=this.getJdbcDao().query(sql4);
		reMap.put("yyrc", yyrcList);
		
		sql5+=" GROUP BY a.first_agent_id,a.patient_id";
		List<Map<String,Object>> yyrsList=this.getJdbcDao().query(sql5);
		reMap.put("yyrs", yyrsList);
		
		sql6+= " GROUP BY a.first_agent_id,a.patient_id";
		List<Map<String,Object>> yyjzList=this.getJdbcDao().query(sql6);
		reMap.put("yyjz", yyjzList);
		return reMap;
	}
	@Override
	public List<AgOrderView> getAgOrderViewByAgentId(Integer agentId, String registerType) throws HSKDBException {
		String hql ="from AgOrderView where agent_id="+agentId+" and register_type='"+registerType+"' order by createDate desc";
		List<AgOrderView> list=this.getHibernateTemplate().find(hql);
		return list;
	}
	@Override
	public void updateOrderOver(String dateTime) throws HSKDBException {
		String  sql ="UPDATE ag_order_info a SET outpatient_status=1 WHERE outpatient_status=2 AND register_date>='"+dateTime+" 00:00:00' AND register_date<='"+dateTime+" 23:59:59'";
		this.getJdbcDao().execute(sql);
	}
}