package com.hsk.angeldoctor.api.persistence;

import javax.persistence.*; 
import static javax.persistence.GenerationType.IDENTITY;
import java.util.Date;

/**
 * 根据ag_order_info表结构自动生成持久化对象<B> com.hsk.angeldoctor.api.persistence.AgOrderInfo</B>
 *<hr/>
 *===============数据库表字段属性==========
 *  <table> 
 * <tr><th>字段名称:</th><td>预约ID(aoiId)</td><th>字段类型:</th><td>Integer(主键)</td></tr> 
 * <tr><th>字段名称:</th><td>预约编号(serialNumber)</td><th>字段类型:</th><td>String(可以为空)</td></tr> 
 * <tr><th>字段名称:</th><td>医院ID(organizationId)</td><th>字段类型:</th><td>Integer(可以为空)</td></tr> 
 * <tr><th>字段名称:</th><td>业务员ID(agentId)</td><th>字段类型:</th><td>Integer(可以为空)</td></tr> 
 * <tr><th>字段名称:</th><td>科室ID(departmentId)</td><th>字段类型:</th><td>Integer(可以为空)</td></tr> 
 * <tr><th>字段名称:</th><td>排班ID(shiftPlanId)</td><th>字段类型:</th><td>Integer(可以为空)</td></tr> 
 * <tr><th>字段名称:</th><td>排班时间ID(shiftPeriodId)</td><th>字段类型:</th><td>Integer(可以为空)</td></tr> 
 * <tr><th>字段名称:</th><td>患者ID(patientId)</td><th>字段类型:</th><td>Integer(可以为空)</td></tr> 
 * <tr><th>字段名称:</th><td>医生ID(doctorId)</td><th>字段类型:</th><td>Integer(可以为空)</td></tr> 
 * <tr><th>字段名称:</th><td>上一次预约ID(parentRegistrationId)</td><th>字段类型:</th><td>Integer(可以为空)</td></tr> 
 * <tr><th>字段名称:</th><td>业务类型：0:app代约;1:微信预约；3复诊(registerType)</td><th>字段类型:</th><td>String(可以为空)</td></tr> 
 * <tr><th>字段名称:</th><td>预约时间(registerDate)</td><th>字段类型:</th><td>Date(可以为空)</td></tr> 
 * <tr><th>字段名称:</th><td>患者名称(patientName)</td><th>字段类型:</th><td>String(可以为空)</td></tr> 
 * <tr><th>字段名称:</th><td>患者手机号(patientMobile)</td><th>字段类型:</th><td>String(可以为空)</td></tr> 
 * <tr><th>字段名称:</th><td>性别(patientGender)</td><th>字段类型:</th><td>String(可以为空)</td></tr> 
 * <tr><th>字段名称:</th><td>年龄(patientAge)</td><th>字段类型:</th><td>String(可以为空)</td></tr> 
 * <tr><th>字段名称:</th><td>描述(description)</td><th>字段类型:</th><td>String(可以为空)</td></tr> 
 * <tr><th>字段名称:</th><td>预约人姓名(outpatientName)</td><th>字段类型:</th><td>String(可以为空)</td></tr> 
 * <tr><th>字段名称:</th><td>预约状态(0:预约成功;1:代约成功;2:代约取消)(registerStatus)</td><th>字段类型:</th><td>String(可以为空)</td></tr> 
 * <tr><th>字段名称:</th><td>门诊状态(0:结诊;1:未到;2:待诊中;3:已取消)(outpatientStatus)</td><th>字段类型:</th><td>String(可以为空)</td></tr> 
 * <tr><th>字段名称:</th><td>是否自增:0是1否(chargeType)</td><th>字段类型:</th><td>String(可以为空)</td></tr> 
 * <tr><th>字段名称:</th><td>状态:1正常，2禁用(status)</td><th>字段类型:</th><td>String(可以为空)</td></tr> 
 * <tr><th>字段名称:</th><td>创建人(createRen)</td><th>字段类型:</th><td>String(可以为空)</td></tr> 
 * <tr><th>字段名称:</th><td>创建时间(createDate)</td><th>字段类型:</th><td>Date(可以为空)</td></tr> 
 * <tr><th>字段名称:</th><td>修改人(editRen)</td><th>字段类型:</th><td>String(可以为空)</td></tr> 
 * <tr><th>字段名称:</th><td>修改时间(editDate)</td><th>字段类型:</th><td>Date(可以为空)</td></tr> 
 * <tr><th>字段名称:</th><td>是否首次代约:0是1否(isFirstAgent)</td><th>字段类型:</th><td>String(可以为空)</td></tr> 
 * </table>
 *===============无关字段属性===============
 *  <table> 
 * 	<tr><th>字段名称:</th><td>预约ID(aoiId)	</td><th>属性名称:</th><td>aoiId</td></tr>
 * 	<tr><th>字段名称:</th><td>医院ID(organizationId)	</td><th>属性名称:</th><td>organizationId</td></tr>
 * 	<tr><th>字段名称:</th><td>业务员ID(agentId)	</td><th>属性名称:</th><td>agentId</td></tr>
 * 	<tr><th>字段名称:</th><td>科室ID(departmentId)	</td><th>属性名称:</th><td>departmentId</td></tr>
 * 	<tr><th>字段名称:</th><td>排班ID(shiftPlanId)	</td><th>属性名称:</th><td>shiftPlanId</td></tr>
 * 	<tr><th>字段名称:</th><td>排班时间ID(shiftPeriodId)	</td><th>属性名称:</th><td>shiftPeriodId</td></tr>
 * 	<tr><th>字段名称:</th><td>患者ID(patientId)	</td><th>属性名称:</th><td>patientId</td></tr>
 * 	<tr><th>字段名称:</th><td>医生ID(doctorId)	</td><th>属性名称:</th><td>doctorId</td></tr>
 * 	<tr><th>字段名称:</th><td>上一次预约ID(parentRegistrationId)	</td><th>属性名称:</th><td>parentRegistrationId</td></tr>
 * 	<tr><th>字段名称:</th><td>预约时间(registerDate)	</td><th>属性名称:</th><td>registerDate</td></tr>
 * 	<tr><th>字段名称:</th><td>预约时间(registerDate)	</td><th>属性名称:</th><td>registerDate</td></tr>
 * 	<tr><th>字段名称:</th><td>创建时间(createDate)	</td><th>属性名称:</th><td>createDate</td></tr>
 * 	<tr><th>字段名称:</th><td>创建时间(createDate)	</td><th>属性名称:</th><td>createDate</td></tr>
 * 	<tr><th>字段名称:</th><td>修改时间(editDate)	</td><th>属性名称:</th><td>editDate</td></tr>
 * 	<tr><th>字段名称:</th><td>修改时间(editDate)	</td><th>属性名称:</th><td>editDate</td></tr>
 * 	<tr><th>字段名称:</th><td>(tab_like)	</td><th>属性名称:</th><td>tab_like</td></tr>
 * 	<tr><th>字段名称:</th><td>(tab_order)	</td><th>属性名称:</th><td>tab_order</td></tr>
 * </table>
 * <hr/>
 * @author  作者:admin  
 * @version  v1.0 创建时间: 2018-08-14 13:35:36
 */
 
 
@SuppressWarnings("serial")
@Entity
@Table(name = "ag_order_info" )
public class AgOrderInfo {
///===============数据库表字段属性begin==========
			/**
			 *预约ID(aoiId):字段类型为Integer  
			 */
 			private Integer aoiId; 
 	
			/**
			 *预约编号(serialNumber):字段类型为String  
			 */
 			private String serialNumber; 
 	
			/**
			 *医院ID(organizationId):字段类型为Integer  
			 */
 			private Integer organizationId; 
 	
			/**
			 *业务员ID(agentId):字段类型为Integer  
			 */
 			private Integer agentId; 
 	
			/**
			 *科室ID(departmentId):字段类型为Integer  
			 */
 			private Integer departmentId; 
 	
			/**
			 *排班ID(shiftPlanId):字段类型为Integer  
			 */
 			private Integer shiftPlanId; 
 	
			/**
			 *排班时间ID(shiftPeriodId):字段类型为Integer  
			 */
 			private Integer shiftPeriodId; 
 	
			/**
			 *患者ID(patientId):字段类型为Integer  
			 */
 			private Integer patientId; 
 	
			/**
			 *医生ID(doctorId):字段类型为Integer  
			 */
 			private Integer doctorId; 
 			/**
 			 * 代理商ID
 			 */
 			private Integer aaiId;
 			/**
 			 * 一级业务员ID
 			 */
 			private Integer firstAgentId;
 			/**
 			 * 二级业务员ID
 			 */
 			private Integer secondAgentId;
			/**
			 *上一次预约ID(parentRegistrationId):字段类型为Integer  
			 */
 			private Integer parentRegistrationId; 
 			/**
 			 * 患者来源
 			 */
 			private String patientSource;
 	
			/**
			 *业务类型：0:app代约;1:微信预约；3复诊(registerType):字段类型为String  
			 */
 			private String registerType; 
 	
			/**
			 *预约时间(registerDate):字段类型为Date  
			 */
 			private Date registerDate; 
 	
			/**
			 *患者名称(patientName):字段类型为String  
			 */
 			private String patientName; 
 	
			/**
			 *患者手机号(patientMobile):字段类型为String  
			 */
 			private String patientMobile; 
 	
			/**
			 *性别(patientGender):字段类型为String  
			 */
 			private String patientGender; 
 	
			/**
			 *年龄(patientAge):字段类型为String  
			 */
 			private String patientAge; 
 	
			/**
			 *描述(description):字段类型为String  
			 */
 			private String description; 
 	
			/**
			 *预约人姓名(outpatientName):字段类型为String  
			 */
 			private String outpatientName; 
 	
			/**
			 *预约状态(0:预约成功;1:代约成功;2:代约取消)(registerStatus):字段类型为String  
			 */
 			private String registerStatus; 
 	
			/**
			 *门诊状态(0:结诊;1:未到;2:待诊中;3:已取消)(outpatientStatus):字段类型为String  
			 */
 			private String outpatientStatus; 
 	
			/**
			 *是否自增:0是1否(chargeType):字段类型为String  
			 */
 			private String chargeType; 
 	
			/**
			 *状态:1正常，2禁用(status):字段类型为String  
			 */
 			private String status; 
 	
			/**
			 *创建人(createRen):字段类型为String  
			 */
 			private String createRen; 
 	
			/**
			 *创建时间(createDate):字段类型为Date  
			 */
 			private Date createDate; 
 	
			/**
			 *修改人(editRen):字段类型为String  
			 */
 			private String editRen; 
 	
			/**
			 *修改时间(editDate):字段类型为Date  
			 */
 			private Date editDate; 
 			/**
 			 * 是否首次预约
 			 */
 			private String isFirstAgent;
			/**
			 *设置预约ID(aoi_id)字段方法 (该字段是主键)
			 *@return  返回 <b>AgOrderInfo.AoiId</b>的值
			 */	 
			@Id
			@GeneratedValue(strategy = IDENTITY)
			@Column(name = "aoi_id")
			public Integer getAoiId(){
			    return this.aoiId;
			}

		  /**
		   *设置 aoi_id字段方法 
		   *@param att_aoiId 输入<b>AgOrderInfo.aoiId</b>字段的值
		   */
		  public void setAoiId(Integer att_aoiId){
		    this.aoiId = att_aoiId;
		  }
  
			/**
			 *设置预约编号(serial_number)字段方法 
			 *@return  返回 <b>AgOrderInfo.SerialNumber</b>的值
			 */	 
			@Column(name = "serial_number" ) 
			public String getSerialNumber(){
			    return this.serialNumber;
			}

		  /**
		   *设置 serial_number字段方法 
		   *@param att_serialNumber 输入<b>AgOrderInfo.serialNumber</b>字段的值
		   */
		  public void setSerialNumber(String att_serialNumber){
		    this.serialNumber = att_serialNumber;
		  }
  
			/**
			 *设置医院ID(organization_id)字段方法 
			 *@return  返回 <b>AgOrderInfo.OrganizationId</b>的值
			 */	 
			@Column(name = "organization_id" ) 
			public Integer getOrganizationId(){
			    return this.organizationId;
			}

		  /**
		   *设置 organization_id字段方法 
		   *@param att_organizationId 输入<b>AgOrderInfo.organizationId</b>字段的值
		   */
		  public void setOrganizationId(Integer att_organizationId){
		    this.organizationId = att_organizationId;
		  }
  
			/**
			 *设置业务员ID(agent_id)字段方法 
			 *@return  返回 <b>AgOrderInfo.AgentId</b>的值
			 */	 
			@Column(name = "agent_id" ) 
			public Integer getAgentId(){
			    return this.agentId;
			}

		  /**
		   *设置 agent_id字段方法 
		   *@param att_agentId 输入<b>AgOrderInfo.agentId</b>字段的值
		   */
		  public void setAgentId(Integer att_agentId){
		    this.agentId = att_agentId;
		  }
  
			/**
			 *设置科室ID(department_id)字段方法 
			 *@return  返回 <b>AgOrderInfo.DepartmentId</b>的值
			 */	 
			@Column(name = "department_id" ) 
			public Integer getDepartmentId(){
			    return this.departmentId;
			}

		  /**
		   *设置 department_id字段方法 
		   *@param att_departmentId 输入<b>AgOrderInfo.departmentId</b>字段的值
		   */
		  public void setDepartmentId(Integer att_departmentId){
		    this.departmentId = att_departmentId;
		  }
  
			/**
			 *设置排班ID(shift_plan_id)字段方法 
			 *@return  返回 <b>AgOrderInfo.ShiftPlanId</b>的值
			 */	 
			@Column(name = "shift_plan_id" ) 
			public Integer getShiftPlanId(){
			    return this.shiftPlanId;
			}

		  /**
		   *设置 shift_plan_id字段方法 
		   *@param att_shiftPlanId 输入<b>AgOrderInfo.shiftPlanId</b>字段的值
		   */
		  public void setShiftPlanId(Integer att_shiftPlanId){
		    this.shiftPlanId = att_shiftPlanId;
		  }
  
			/**
			 *设置排班时间ID(shift_period_id)字段方法 
			 *@return  返回 <b>AgOrderInfo.ShiftPeriodId</b>的值
			 */	 
			@Column(name = "shift_period_id" ) 
			public Integer getShiftPeriodId(){
			    return this.shiftPeriodId;
			}

		  /**
		   *设置 shift_period_id字段方法 
		   *@param att_shiftPeriodId 输入<b>AgOrderInfo.shiftPeriodId</b>字段的值
		   */
		  public void setShiftPeriodId(Integer att_shiftPeriodId){
		    this.shiftPeriodId = att_shiftPeriodId;
		  }
  
			/**
			 *设置患者ID(patient_id)字段方法 
			 *@return  返回 <b>AgOrderInfo.PatientId</b>的值
			 */	 
			@Column(name = "patient_id" ) 
			public Integer getPatientId(){
			    return this.patientId;
			}

		  /**
		   *设置 patient_id字段方法 
		   *@param att_patientId 输入<b>AgOrderInfo.patientId</b>字段的值
		   */
		  public void setPatientId(Integer att_patientId){
		    this.patientId = att_patientId;
		  }
  
			/**
			 *设置医生ID(doctor_id)字段方法 
			 *@return  返回 <b>AgOrderInfo.DoctorId</b>的值
			 */	 
			@Column(name = "doctor_id" ) 
			public Integer getDoctorId(){
			    return this.doctorId;
			}

		  /**
		   *设置 doctor_id字段方法 
		   *@param att_doctorId 输入<b>AgOrderInfo.doctorId</b>字段的值
		   */
		  public void setDoctorId(Integer att_doctorId){
		    this.doctorId = att_doctorId;
		  }
  
			/**
			 *设置上一次预约ID(parent_registration_id)字段方法 
			 *@return  返回 <b>AgOrderInfo.ParentRegistrationId</b>的值
			 */	 
			@Column(name = "parent_registration_id" ) 
			public Integer getParentRegistrationId(){
			    return this.parentRegistrationId;
			}

		  /**
		   *设置 parent_registration_id字段方法 
		   *@param att_parentRegistrationId 输入<b>AgOrderInfo.parentRegistrationId</b>字段的值
		   */
		  public void setParentRegistrationId(Integer att_parentRegistrationId){
		    this.parentRegistrationId = att_parentRegistrationId;
		  }
  
			/**
			 *设置业务类型：0:app代约;1:微信预约；3复诊(register_type)字段方法 
			 *@return  返回 <b>AgOrderInfo.RegisterType</b>的值
			 */	 
			@Column(name = "register_type" ) 
			public String getRegisterType(){
			    return this.registerType;
			}

		  /**
		   *设置 register_type字段方法 
		   *@param att_registerType 输入<b>AgOrderInfo.registerType</b>字段的值
		   */
		  public void setRegisterType(String att_registerType){
		    this.registerType = att_registerType;
		  }
  
			/**
			 *设置预约时间(register_date)字段方法 
			 *@return  返回 <b>AgOrderInfo.RegisterDate</b>的值
			 */	 
			@Temporal(TemporalType.DATE)
			@Column(name = "register_date" ) 
			public Date getRegisterDate(){
			    return this.registerDate;
			}

		  /**
		   *设置 register_date字段方法 
		   *@param att_registerDate 输入<b>AgOrderInfo.registerDate</b>字段的值
		   */
		  public void setRegisterDate(Date att_registerDate){
		    this.registerDate = att_registerDate;
		  }
  
			/**
			 *设置患者名称(patient_name)字段方法 
			 *@return  返回 <b>AgOrderInfo.PatientName</b>的值
			 */	 
			@Column(name = "patient_name" ) 
			public String getPatientName(){
			    return this.patientName;
			}

		  /**
		   *设置 patient_name字段方法 
		   *@param att_patientName 输入<b>AgOrderInfo.patientName</b>字段的值
		   */
		  public void setPatientName(String att_patientName){
		    this.patientName = att_patientName;
		  }
  
			/**
			 *设置患者手机号(patient_mobile)字段方法 
			 *@return  返回 <b>AgOrderInfo.PatientMobile</b>的值
			 */	 
			@Column(name = "patient_mobile" ) 
			public String getPatientMobile(){
			    return this.patientMobile;
			}

		  /**
		   *设置 patient_mobile字段方法 
		   *@param att_patientMobile 输入<b>AgOrderInfo.patientMobile</b>字段的值
		   */
		  public void setPatientMobile(String att_patientMobile){
		    this.patientMobile = att_patientMobile;
		  }
  
			/**
			 *设置性别(patient_gender)字段方法 
			 *@return  返回 <b>AgOrderInfo.PatientGender</b>的值
			 */	 
			@Column(name = "patient_gender" ) 
			public String getPatientGender(){
			    return this.patientGender;
			}

		  /**
		   *设置 patient_gender字段方法 
		   *@param att_patientGender 输入<b>AgOrderInfo.patientGender</b>字段的值
		   */
		  public void setPatientGender(String att_patientGender){
		    this.patientGender = att_patientGender;
		  }
  
			/**
			 *设置年龄(patient_age)字段方法 
			 *@return  返回 <b>AgOrderInfo.PatientAge</b>的值
			 */	 
			@Column(name = "patient_age" ) 
			public String getPatientAge(){
			    return this.patientAge;
			}

		  /**
		   *设置 patient_age字段方法 
		   *@param att_patientAge 输入<b>AgOrderInfo.patientAge</b>字段的值
		   */
		  public void setPatientAge(String att_patientAge){
		    this.patientAge = att_patientAge;
		  }
  
			/**
			 *设置描述(description)字段方法 
			 *@return  返回 <b>AgOrderInfo.Description</b>的值
			 */	 
			@Column(name = "description" ) 
			public String getDescription(){
			    return this.description;
			}

		  /**
		   *设置 description字段方法 
		   *@param att_description 输入<b>AgOrderInfo.description</b>字段的值
		   */
		  public void setDescription(String att_description){
		    this.description = att_description;
		  }
  
			/**
			 *设置预约人姓名(outpatient_name)字段方法 
			 *@return  返回 <b>AgOrderInfo.OutpatientName</b>的值
			 */	 
			@Column(name = "outpatient_name" ) 
			public String getOutpatientName(){
			    return this.outpatientName;
			}

		  /**
		   *设置 outpatient_name字段方法 
		   *@param att_outpatientName 输入<b>AgOrderInfo.outpatientName</b>字段的值
		   */
		  public void setOutpatientName(String att_outpatientName){
		    this.outpatientName = att_outpatientName;
		  }
  
			/**
			 *设置预约状态(0:预约成功;1:代约成功;2:代约取消)(register_status)字段方法 
			 *@return  返回 <b>AgOrderInfo.RegisterStatus</b>的值
			 */	 
			@Column(name = "register_status" ) 
			public String getRegisterStatus(){
			    return this.registerStatus;
			}

		  /**
		   *设置 register_status字段方法 
		   *@param att_registerStatus 输入<b>AgOrderInfo.registerStatus</b>字段的值
		   */
		  public void setRegisterStatus(String att_registerStatus){
		    this.registerStatus = att_registerStatus;
		  }
  
			/**
			 *设置门诊状态(0:结诊;1:未到;2:待诊中;3:已取消)(outpatient_status)字段方法 
			 *@return  返回 <b>AgOrderInfo.OutpatientStatus</b>的值
			 */	 
			@Column(name = "outpatient_status" ) 
			public String getOutpatientStatus(){
			    return this.outpatientStatus;
			}

		  /**
		   *设置 outpatient_status字段方法 
		   *@param att_outpatientStatus 输入<b>AgOrderInfo.outpatientStatus</b>字段的值
		   */
		  public void setOutpatientStatus(String att_outpatientStatus){
		    this.outpatientStatus = att_outpatientStatus;
		  }
  
			/**
			 *设置是否自增:0是1否(charge_type)字段方法 
			 *@return  返回 <b>AgOrderInfo.ChargeType</b>的值
			 */	 
			@Column(name = "charge_type" ) 
			public String getChargeType(){
			    return this.chargeType;
			}

		  /**
		   *设置 charge_type字段方法 
		   *@param att_chargeType 输入<b>AgOrderInfo.chargeType</b>字段的值
		   */
		  public void setChargeType(String att_chargeType){
		    this.chargeType = att_chargeType;
		  }
  
			/**
			 *设置状态:1正常，2禁用(status)字段方法 
			 *@return  返回 <b>AgOrderInfo.Status</b>的值
			 */	 
			@Column(name = "status" ) 
			public String getStatus(){
			    return this.status;
			}

		  /**
		   *设置 status字段方法 
		   *@param att_status 输入<b>AgOrderInfo.status</b>字段的值
		   */
		  public void setStatus(String att_status){
		    this.status = att_status;
		  }
  
			/**
			 *设置创建人(create_ren)字段方法 
			 *@return  返回 <b>AgOrderInfo.CreateRen</b>的值
			 */	 
			@Column(name = "create_ren" ) 
			public String getCreateRen(){
			    return this.createRen;
			}

		  /**
		   *设置 create_ren字段方法 
		   *@param att_createRen 输入<b>AgOrderInfo.createRen</b>字段的值
		   */
		  public void setCreateRen(String att_createRen){
		    this.createRen = att_createRen;
		  }
  
			/**
			 *设置创建时间(create_date)字段方法 
			 *@return  返回 <b>AgOrderInfo.CreateDate</b>的值
			 */	 
			@Temporal(TemporalType.TIMESTAMP)
			@Column(name = "create_date" ) 
			public Date getCreateDate(){
			    return this.createDate;
			}

		  /**
		   *设置 create_date字段方法 
		   *@param att_createDate 输入<b>AgOrderInfo.createDate</b>字段的值
		   */
		  public void setCreateDate(Date att_createDate){
		    this.createDate = att_createDate;
		  }
  
			/**
			 *设置修改人(edit_ren)字段方法 
			 *@return  返回 <b>AgOrderInfo.EditRen</b>的值
			 */	 
			@Column(name = "edit_ren" ) 
			public String getEditRen(){
			    return this.editRen;
			}

		  /**
		   *设置 edit_ren字段方法 
		   *@param att_editRen 输入<b>AgOrderInfo.editRen</b>字段的值
		   */
		  public void setEditRen(String att_editRen){
		    this.editRen = att_editRen;
		  }
  
			/**
			 *设置修改时间(edit_date)字段方法 
			 *@return  返回 <b>AgOrderInfo.EditDate</b>的值
			 */	 
			@Temporal(TemporalType.TIMESTAMP)
			@Column(name = "edit_date" ) 
			public Date getEditDate(){
			    return this.editDate;
			}

		  /**
		   *设置 edit_date字段方法 
		   *@param att_editDate 输入<b>AgOrderInfo.editDate</b>字段的值
		   */
		  public void setEditDate(Date att_editDate){
		    this.editDate = att_editDate;
		  }
		  @Column(name = "aai_id" ) 
		  public Integer getAaiId() {
				return aaiId;
			}

			public void setAaiId(Integer aaiId) {
				this.aaiId = aaiId;
			}
			@Column(name = "first_agent_id" ) 
			public Integer getFirstAgentId() {
				return firstAgentId;
			}

			public void setFirstAgentId(Integer firstAgentId) {
				this.firstAgentId = firstAgentId;
			}
			@Column(name = "second_agent_id" ) 
			public Integer getSecondAgentId() {
				return secondAgentId;
			}

			public void setSecondAgentId(Integer secondAgentId) {
				this.secondAgentId = secondAgentId;
			}
			@Column(name = "patient_source" ) 
			public String getPatientSource() {
				return patientSource;
			}

			public void setPatientSource(String patientSource) {
				this.patientSource = patientSource;
			}
			 @Column(name = "is_first_agent" ) 
			  public String getIsFirstAgent() {
				return isFirstAgent;
			}

			public void setIsFirstAgent(String isFirstAgent) {
				this.isFirstAgent = isFirstAgent;
			}
///===============数据库表字段属性end==========
			///===============数据库表无关子段字段属性begin==========
			/**
			 *预约ID(aoi_id):字段类型为String
			 */
		  private String aoiId_str;  
			/**
			 *医院ID(organization_id):字段类型为String
			 */
		  private String organizationId_str;  
			/**
			 *业务员ID(agent_id):字段类型为String
			 */
		  private String agentId_str;  
			/**
			 *科室ID(department_id):字段类型为String
			 */
		  private String departmentId_str;  
			/**
			 *排班ID(shift_plan_id):字段类型为String
			 */
		  private String shiftPlanId_str;  
			/**
			 *排班时间ID(shift_period_id):字段类型为String
			 */
		  private String shiftPeriodId_str;  
			/**
			 *患者ID(patient_id):字段类型为String
			 */
		  private String patientId_str;  
			/**
			 *医生ID(doctor_id):字段类型为String
			 */
		  private String doctorId_str;  
			/**
			 *上一次预约ID(parent_registration_id):字段类型为String
			 */
		  private String parentRegistrationId_str;  
			/**
			 *预约时间(register_date):字段类型为Date
			 */
		  private Date registerDate_start;  
			/**
			 *预约时间(register_date):字段类型为Date
			 */
		  private Date registerDate_end;  
			/**
			 *创建时间(create_date):字段类型为Date
			 */
		  private Date createDate_start;  
			/**
			 *创建时间(create_date):字段类型为Date
			 */
		  private Date createDate_end;  
			/**
			 *修改时间(edit_date):字段类型为Date
			 */
		  private Date editDate_start;  
			/**
			 *修改时间(edit_date):字段类型为Date
			 */
		  private Date editDate_end;  
			/**
			 *():字段类型为String
			 *ag_order_info表里不用like作为条件的字符串
			 */
		  private String Tab_like;  
			/**
			 *():字段类型为String
			 *ag_order_info表里order by 字符串
			 */
		  private String Tab_order;  
			/**
			 *设置aoiId字段方法  
			 *@return  返回 <b>AgOrderInfo.aoiId</b>的值
			 */ 
			@Transient
			public String getAoiId_str(){
				return this.aoiId_str;
			}
			/**
			  *设置 aoi_id字段方法 
			  *@param att_aoiId 输入<b>AgOrderInfo.aoiId</b>字段的值
			  */
			public void setAoiId_str(String att_aoiId_str){
				this.aoiId_str = att_aoiId_str;
			}
			/**
			 *设置organizationId字段方法  
			 *@return  返回 <b>AgOrderInfo.organizationId</b>的值
			 */ 
			@Transient
			public String getOrganizationId_str(){
				return this.organizationId_str;
			}
			/**
			  *设置 organization_id字段方法 
			  *@param att_organizationId 输入<b>AgOrderInfo.organizationId</b>字段的值
			  */
			public void setOrganizationId_str(String att_organizationId_str){
				this.organizationId_str = att_organizationId_str;
			}
			/**
			 *设置agentId字段方法  
			 *@return  返回 <b>AgOrderInfo.agentId</b>的值
			 */ 
			@Transient
			public String getAgentId_str(){
				return this.agentId_str;
			}
			/**
			  *设置 agent_id字段方法 
			  *@param att_agentId 输入<b>AgOrderInfo.agentId</b>字段的值
			  */
			public void setAgentId_str(String att_agentId_str){
				this.agentId_str = att_agentId_str;
			}
			/**
			 *设置departmentId字段方法  
			 *@return  返回 <b>AgOrderInfo.departmentId</b>的值
			 */ 
			@Transient
			public String getDepartmentId_str(){
				return this.departmentId_str;
			}
			/**
			  *设置 department_id字段方法 
			  *@param att_departmentId 输入<b>AgOrderInfo.departmentId</b>字段的值
			  */
			public void setDepartmentId_str(String att_departmentId_str){
				this.departmentId_str = att_departmentId_str;
			}
			/**
			 *设置shiftPlanId字段方法  
			 *@return  返回 <b>AgOrderInfo.shiftPlanId</b>的值
			 */ 
			@Transient
			public String getShiftPlanId_str(){
				return this.shiftPlanId_str;
			}
			/**
			  *设置 shift_plan_id字段方法 
			  *@param att_shiftPlanId 输入<b>AgOrderInfo.shiftPlanId</b>字段的值
			  */
			public void setShiftPlanId_str(String att_shiftPlanId_str){
				this.shiftPlanId_str = att_shiftPlanId_str;
			}
			/**
			 *设置shiftPeriodId字段方法  
			 *@return  返回 <b>AgOrderInfo.shiftPeriodId</b>的值
			 */ 
			@Transient
			public String getShiftPeriodId_str(){
				return this.shiftPeriodId_str;
			}
			/**
			  *设置 shift_period_id字段方法 
			  *@param att_shiftPeriodId 输入<b>AgOrderInfo.shiftPeriodId</b>字段的值
			  */
			public void setShiftPeriodId_str(String att_shiftPeriodId_str){
				this.shiftPeriodId_str = att_shiftPeriodId_str;
			}
			/**
			 *设置patientId字段方法  
			 *@return  返回 <b>AgOrderInfo.patientId</b>的值
			 */ 
			@Transient
			public String getPatientId_str(){
				return this.patientId_str;
			}
			/**
			  *设置 patient_id字段方法 
			  *@param att_patientId 输入<b>AgOrderInfo.patientId</b>字段的值
			  */
			public void setPatientId_str(String att_patientId_str){
				this.patientId_str = att_patientId_str;
			}
			/**
			 *设置doctorId字段方法  
			 *@return  返回 <b>AgOrderInfo.doctorId</b>的值
			 */ 
			@Transient
			public String getDoctorId_str(){
				return this.doctorId_str;
			}
			/**
			  *设置 doctor_id字段方法 
			  *@param att_doctorId 输入<b>AgOrderInfo.doctorId</b>字段的值
			  */
			public void setDoctorId_str(String att_doctorId_str){
				this.doctorId_str = att_doctorId_str;
			}
			/**
			 *设置parentRegistrationId字段方法  
			 *@return  返回 <b>AgOrderInfo.parentRegistrationId</b>的值
			 */ 
			@Transient
			public String getParentRegistrationId_str(){
				return this.parentRegistrationId_str;
			}
			/**
			  *设置 parent_registration_id字段方法 
			  *@param att_parentRegistrationId 输入<b>AgOrderInfo.parentRegistrationId</b>字段的值
			  */
			public void setParentRegistrationId_str(String att_parentRegistrationId_str){
				this.parentRegistrationId_str = att_parentRegistrationId_str;
			}
			/**
			 *设置registerDate字段方法  
			 *@return  返回 <b>AgOrderInfo.registerDate</b>的值
			 */ 
			@Transient
			public Date getRegisterDate_start(){
				return this.registerDate_start;
			}
			/**
			  *设置 register_date字段方法 
			  *@param att_registerDate 输入<b>AgOrderInfo.registerDate</b>字段的值
			  */
			public void setRegisterDate_start(Date att_registerDate_start){
				this.registerDate_start = att_registerDate_start;
			}
			/**
			 *设置registerDate字段方法  
			 *@return  返回 <b>AgOrderInfo.registerDate</b>的值
			 */ 
			@Transient
			public Date getRegisterDate_end(){
				return this.registerDate_end;
			}
			/**
			  *设置 register_date字段方法 
			  *@param att_registerDate 输入<b>AgOrderInfo.registerDate</b>字段的值
			  */
			public void setRegisterDate_end(Date att_registerDate_end){
				this.registerDate_end = att_registerDate_end;
			}
			/**
			 *设置createDate字段方法  
			 *@return  返回 <b>AgOrderInfo.createDate</b>的值
			 */ 
			@Transient
			public Date getCreateDate_start(){
				return this.createDate_start;
			}
			/**
			  *设置 create_date字段方法 
			  *@param att_createDate 输入<b>AgOrderInfo.createDate</b>字段的值
			  */
			public void setCreateDate_start(Date att_createDate_start){
				this.createDate_start = att_createDate_start;
			}
			/**
			 *设置createDate字段方法  
			 *@return  返回 <b>AgOrderInfo.createDate</b>的值
			 */ 
			@Transient
			public Date getCreateDate_end(){
				return this.createDate_end;
			}
			/**
			  *设置 create_date字段方法 
			  *@param att_createDate 输入<b>AgOrderInfo.createDate</b>字段的值
			  */
			public void setCreateDate_end(Date att_createDate_end){
				this.createDate_end = att_createDate_end;
			}
			/**
			 *设置editDate字段方法  
			 *@return  返回 <b>AgOrderInfo.editDate</b>的值
			 */ 
			@Transient
			public Date getEditDate_start(){
				return this.editDate_start;
			}
			/**
			  *设置 edit_date字段方法 
			  *@param att_editDate 输入<b>AgOrderInfo.editDate</b>字段的值
			  */
			public void setEditDate_start(Date att_editDate_start){
				this.editDate_start = att_editDate_start;
			}
			/**
			 *设置editDate字段方法  
			 *@return  返回 <b>AgOrderInfo.editDate</b>的值
			 */ 
			@Transient
			public Date getEditDate_end(){
				return this.editDate_end;
			}
			/**
			  *设置 edit_date字段方法 
			  *@param att_editDate 输入<b>AgOrderInfo.editDate</b>字段的值
			  */
			public void setEditDate_end(Date att_editDate_end){
				this.editDate_end = att_editDate_end;
			}
			/**
			 *设置tab_like字段方法  
			 *@return  返回 <b>AgOrderInfo.tab_like</b>的值
			 */ 
			@Transient
			public String getTab_like(){
				return this.Tab_like;
			}
			/**
			  *设置 字段方法 
			  *@param att_tab_like 输入<b>AgOrderInfo.tab_like</b>字段的值
			  */
			public void setTab_like(String att_Tab_like){
				this.Tab_like = att_Tab_like;
			}
			/**
			 *设置tab_order字段方法  
			 *@return  返回 <b>AgOrderInfo.tab_order</b>的值
			 */ 
			@Transient
			public String getTab_order(){
				return this.Tab_order;
			}
			/**
			  *设置 字段方法 
			  *@param att_tab_order 输入<b>AgOrderInfo.tab_order</b>字段的值
			  */
			public void setTab_order(String att_Tab_order){
				this.Tab_order = att_Tab_order;
			}
///===============数据库表无关子段字段属性end==========
			
			private Integer id;
			@Transient
			public Integer getId() {
				return aoiId;
			}

			public void setId(Integer id) {
				this.aoiId=id;
			}
} 