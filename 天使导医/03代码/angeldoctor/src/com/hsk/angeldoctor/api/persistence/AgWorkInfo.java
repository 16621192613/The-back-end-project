package com.hsk.angeldoctor.api.persistence;

import javax.persistence.*;

import org.hibernate.annotations.Formula;

import static javax.persistence.GenerationType.IDENTITY;
import java.util.Date;

/**
 * 根据ag_work_info表结构自动生成持久化对象<B> com.hsk.angeldoctor.api.persistence.AgWorkInfo</B>
 *<hr/>
 *===============数据库表字段属性==========
 *  <table> 
 * <tr><th>字段名称:</th><td>排班ID(shiftPlanId)</td><th>字段类型:</th><td>Integer(主键)</td></tr> 
 * <tr><th>字段名称:</th><td>科室ID(departmentId)</td><th>字段类型:</th><td>Integer(可以为空)</td></tr> 
 * <tr><th>字段名称:</th><td>医院ID(organizationId)</td><th>字段类型:</th><td>Integer(可以为空)</td></tr> 
 * <tr><th>字段名称:</th><td>医生ID(doctorId)</td><th>字段类型:</th><td>Integer(可以为空)</td></tr> 
 * <tr><th>字段名称:</th><td>排班时间ID(shiftPeriodId)</td><th>字段类型:</th><td>Integer(可以为空)</td></tr> 
 * <tr><th>字段名称:</th><td>日期(planDate)</td><th>字段类型:</th><td>String(可以为空)</td></tr> 
 * <tr><th>字段名称:</th><td>计划接待数(planCount)</td><th>字段类型:</th><td>Integer(可以为空)</td></tr> 
 * <tr><th>字段名称:</th><td>实际接待数(actualCount)</td><th>字段类型:</th><td>Integer(可以为空)</td></tr> 
 * <tr><th>字段名称:</th><td>状态:0启用；1禁用(status)</td><th>字段类型:</th><td>String(可以为空)</td></tr> 
 * <tr><th>字段名称:</th><td>创建人(createRen)</td><th>字段类型:</th><td>String(可以为空)</td></tr> 
 * <tr><th>字段名称:</th><td>创建时间(createDate)</td><th>字段类型:</th><td>Date(可以为空)</td></tr> 
 * <tr><th>字段名称:</th><td>修改人(editRen)</td><th>字段类型:</th><td>String(可以为空)</td></tr> 
 * <tr><th>字段名称:</th><td>修改时间(editDate)</td><th>字段类型:</th><td>Date(可以为空)</td></tr> 
 * </table>
 *===============无关字段属性===============
 *  <table> 
 * 	<tr><th>字段名称:</th><td>排班ID(shiftPlanId)	</td><th>属性名称:</th><td>shiftPlanId</td></tr>
 * 	<tr><th>字段名称:</th><td>科室ID(departmentId)	</td><th>属性名称:</th><td>departmentId</td></tr>
 * 	<tr><th>字段名称:</th><td>医院ID(organizationId)	</td><th>属性名称:</th><td>organizationId</td></tr>
 * 	<tr><th>字段名称:</th><td>医生ID(doctorId)	</td><th>属性名称:</th><td>doctorId</td></tr>
 * 	<tr><th>字段名称:</th><td>排班时间ID(shiftPeriodId)	</td><th>属性名称:</th><td>shiftPeriodId</td></tr>
 * 	<tr><th>字段名称:</th><td>计划接待数(planCount)	</td><th>属性名称:</th><td>planCount</td></tr>
 * 	<tr><th>字段名称:</th><td>实际接待数(actualCount)	</td><th>属性名称:</th><td>actualCount</td></tr>
 * 	<tr><th>字段名称:</th><td>创建时间(createDate)	</td><th>属性名称:</th><td>createDate</td></tr>
 * 	<tr><th>字段名称:</th><td>创建时间(createDate)	</td><th>属性名称:</th><td>createDate</td></tr>
 * 	<tr><th>字段名称:</th><td>修改时间(editDate)	</td><th>属性名称:</th><td>editDate</td></tr>
 * 	<tr><th>字段名称:</th><td>修改时间(editDate)	</td><th>属性名称:</th><td>editDate</td></tr>
 * 	<tr><th>字段名称:</th><td>(tab_like)	</td><th>属性名称:</th><td>tab_like</td></tr>
 * 	<tr><th>字段名称:</th><td>(tab_order)	</td><th>属性名称:</th><td>tab_order</td></tr>
 * </table>
 * <hr/>
 * @author  作者:admin  
 * @version  v1.0 创建时间: 2018-08-14 13:28:02
 */
 
 
@SuppressWarnings("serial")
@Entity
@Table(name = "ag_work_info" )
public class AgWorkInfo {
///===============数据库表字段属性begin==========
			/**
			 *排班ID(shiftPlanId):字段类型为Integer  
			 */
 			private Integer shiftPlanId; 
 	
			/**
			 *科室ID(departmentId):字段类型为Integer  
			 */
 			private Integer departmentId; 
 	
			/**
			 *医院ID(organizationId):字段类型为Integer  
			 */
 			private Integer organizationId; 
 	
			/**
			 *医生ID(doctorId):字段类型为Integer  
			 */
 			private Integer doctorId; 
 	
			/**
			 *排班时间ID(shiftPeriodId):字段类型为Integer  
			 */
 			private Integer shiftPeriodId; 
 	
			/**
			 *日期(planDate):字段类型为String  
			 */
 			private String planDate; 
 	
			/**
			 *计划接待数(planCount):字段类型为Integer  
			 */
 			private Integer planCount; 
 	
			/**
			 *状态:0启用；1禁用(status):字段类型为String  
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
			 *设置排班ID(shift_plan_id)字段方法 (该字段是主键)
			 *@return  返回 <b>AgWorkInfo.ShiftPlanId</b>的值
			 */	 
			@Id
			@GeneratedValue(strategy = IDENTITY)
			@Column(name = "shift_plan_id")
			public Integer getShiftPlanId(){
			    return this.shiftPlanId;
			}

		  /**
		   *设置 shift_plan_id字段方法 
		   *@param att_shiftPlanId 输入<b>AgWorkInfo.shiftPlanId</b>字段的值
		   */
		  public void setShiftPlanId(Integer att_shiftPlanId){
		    this.shiftPlanId = att_shiftPlanId;
		  }
  
			/**
			 *设置科室ID(department_id)字段方法 
			 *@return  返回 <b>AgWorkInfo.DepartmentId</b>的值
			 */	 
			@Column(name = "department_id" ) 
			public Integer getDepartmentId(){
			    return this.departmentId;
			}

		  /**
		   *设置 department_id字段方法 
		   *@param att_departmentId 输入<b>AgWorkInfo.departmentId</b>字段的值
		   */
		  public void setDepartmentId(Integer att_departmentId){
		    this.departmentId = att_departmentId;
		  }
  
			/**
			 *设置医院ID(organization_id)字段方法 
			 *@return  返回 <b>AgWorkInfo.OrganizationId</b>的值
			 */	 
			@Column(name = "organization_id" ) 
			public Integer getOrganizationId(){
			    return this.organizationId;
			}

		  /**
		   *设置 organization_id字段方法 
		   *@param att_organizationId 输入<b>AgWorkInfo.organizationId</b>字段的值
		   */
		  public void setOrganizationId(Integer att_organizationId){
		    this.organizationId = att_organizationId;
		  }
  
			/**
			 *设置医生ID(doctor_id)字段方法 
			 *@return  返回 <b>AgWorkInfo.DoctorId</b>的值
			 */	 
			@Column(name = "doctor_id" ) 
			public Integer getDoctorId(){
			    return this.doctorId;
			}

		  /**
		   *设置 doctor_id字段方法 
		   *@param att_doctorId 输入<b>AgWorkInfo.doctorId</b>字段的值
		   */
		  public void setDoctorId(Integer att_doctorId){
		    this.doctorId = att_doctorId;
		  }
  
			/**
			 *设置排班时间ID(shift_period_id)字段方法 
			 *@return  返回 <b>AgWorkInfo.ShiftPeriodId</b>的值
			 */	 
			@Column(name = "shift_period_id" ) 
			public Integer getShiftPeriodId(){
			    return this.shiftPeriodId;
			}

		  /**
		   *设置 shift_period_id字段方法 
		   *@param att_shiftPeriodId 输入<b>AgWorkInfo.shiftPeriodId</b>字段的值
		   */
		  public void setShiftPeriodId(Integer att_shiftPeriodId){
		    this.shiftPeriodId = att_shiftPeriodId;
		  }
  
			/**
			 *设置日期(plan_date)字段方法 
			 *@return  返回 <b>AgWorkInfo.PlanDate</b>的值
			 */	 
			@Column(name = "plan_date" ) 
			public String getPlanDate(){
			    return this.planDate;
			}

		  /**
		   *设置 plan_date字段方法 
		   *@param att_planDate 输入<b>AgWorkInfo.planDate</b>字段的值
		   */
		  public void setPlanDate(String att_planDate){
		    this.planDate = att_planDate;
		  }
  
			/**
			 *设置计划接待数(plan_count)字段方法 
			 *@return  返回 <b>AgWorkInfo.PlanCount</b>的值
			 */	 
			@Column(name = "plan_count" ) 
			public Integer getPlanCount(){
			    return this.planCount;
			}

		  /**
		   *设置 plan_count字段方法 
		   *@param att_planCount 输入<b>AgWorkInfo.planCount</b>字段的值
		   */
		  public void setPlanCount(Integer att_planCount){
		    this.planCount = att_planCount;
		  }
  
			/**
			 *设置状态:0启用；1禁用(status)字段方法 
			 *@return  返回 <b>AgWorkInfo.Status</b>的值
			 */	 
			@Column(name = "status" ) 
			public String getStatus(){
			    return this.status;
			}

		  /**
		   *设置 status字段方法 
		   *@param att_status 输入<b>AgWorkInfo.status</b>字段的值
		   */
		  public void setStatus(String att_status){
		    this.status = att_status;
		  }
  
			/**
			 *设置创建人(create_ren)字段方法 
			 *@return  返回 <b>AgWorkInfo.CreateRen</b>的值
			 */	 
			@Column(name = "create_ren" ) 
			public String getCreateRen(){
			    return this.createRen;
			}

		  /**
		   *设置 create_ren字段方法 
		   *@param att_createRen 输入<b>AgWorkInfo.createRen</b>字段的值
		   */
		  public void setCreateRen(String att_createRen){
		    this.createRen = att_createRen;
		  }
  
			/**
			 *设置创建时间(create_date)字段方法 
			 *@return  返回 <b>AgWorkInfo.CreateDate</b>的值
			 */	 
			@Temporal(TemporalType.TIMESTAMP)
			@Column(name = "create_date" ) 
			public Date getCreateDate(){
			    return this.createDate;
			}

		  /**
		   *设置 create_date字段方法 
		   *@param att_createDate 输入<b>AgWorkInfo.createDate</b>字段的值
		   */
		  public void setCreateDate(Date att_createDate){
		    this.createDate = att_createDate;
		  }
  
			/**
			 *设置修改人(edit_ren)字段方法 
			 *@return  返回 <b>AgWorkInfo.EditRen</b>的值
			 */	 
			@Column(name = "edit_ren" ) 
			public String getEditRen(){
			    return this.editRen;
			}

		  /**
		   *设置 edit_ren字段方法 
		   *@param att_editRen 输入<b>AgWorkInfo.editRen</b>字段的值
		   */
		  public void setEditRen(String att_editRen){
		    this.editRen = att_editRen;
		  }
  
			/**
			 *设置修改时间(edit_date)字段方法 
			 *@return  返回 <b>AgWorkInfo.EditDate</b>的值
			 */	 
			@Temporal(TemporalType.TIMESTAMP)
			@Column(name = "edit_date" ) 
			public Date getEditDate(){
			    return this.editDate;
			}

		  /**
		   *设置 edit_date字段方法 
		   *@param att_editDate 输入<b>AgWorkInfo.editDate</b>字段的值
		   */
		  public void setEditDate(Date att_editDate){
		    this.editDate = att_editDate;
		  }
  

///===============数据库表字段属性end==========

///===============数据库表无关子段字段属性begin==========
			/**
			 *排班ID(shift_plan_id):字段类型为String
			 */
		  private String shiftPlanId_str;  
			/**
			 *科室ID(department_id):字段类型为String
			 */
		  private String departmentId_str;  
			/**
			 *医院ID(organization_id):字段类型为String
			 */
		  private String organizationId_str;  
			/**
			 *医生ID(doctor_id):字段类型为String
			 */
		  private String doctorId_str;  
			/**
			 *排班时间ID(shift_period_id):字段类型为String
			 */
		  private String shiftPeriodId_str;  
			/**
			 *计划接待数(plan_count):字段类型为String
			 */
		  private String planCount_str;  
			/**
			 *实际接待数(actual_count):字段类型为String
			 */
		  private String actualCount_str;  
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
			 *ag_work_info表里不用like作为条件的字符串
			 */
		  private String Tab_like;  
			/**
			 *():字段类型为String
			 *ag_work_info表里order by 字符串
			 */
		  private String Tab_order;  
			/**
			 *设置shiftPlanId字段方法  
			 *@return  返回 <b>AgWorkInfo.shiftPlanId</b>的值
			 */ 
			@Transient
			public String getShiftPlanId_str(){
				return this.shiftPlanId_str;
			}
			/**
			  *设置 shift_plan_id字段方法 
			  *@param att_shiftPlanId 输入<b>AgWorkInfo.shiftPlanId</b>字段的值
			  */
			public void setShiftPlanId_str(String att_shiftPlanId_str){
				this.shiftPlanId_str = att_shiftPlanId_str;
			}
			/**
			 *设置departmentId字段方法  
			 *@return  返回 <b>AgWorkInfo.departmentId</b>的值
			 */ 
			@Transient
			public String getDepartmentId_str(){
				return this.departmentId_str;
			}
			/**
			  *设置 department_id字段方法 
			  *@param att_departmentId 输入<b>AgWorkInfo.departmentId</b>字段的值
			  */
			public void setDepartmentId_str(String att_departmentId_str){
				this.departmentId_str = att_departmentId_str;
			}
			/**
			 *设置organizationId字段方法  
			 *@return  返回 <b>AgWorkInfo.organizationId</b>的值
			 */ 
			@Transient
			public String getOrganizationId_str(){
				return this.organizationId_str;
			}
			/**
			  *设置 organization_id字段方法 
			  *@param att_organizationId 输入<b>AgWorkInfo.organizationId</b>字段的值
			  */
			public void setOrganizationId_str(String att_organizationId_str){
				this.organizationId_str = att_organizationId_str;
			}
			/**
			 *设置doctorId字段方法  
			 *@return  返回 <b>AgWorkInfo.doctorId</b>的值
			 */ 
			@Transient
			public String getDoctorId_str(){
				return this.doctorId_str;
			}
			/**
			  *设置 doctor_id字段方法 
			  *@param att_doctorId 输入<b>AgWorkInfo.doctorId</b>字段的值
			  */
			public void setDoctorId_str(String att_doctorId_str){
				this.doctorId_str = att_doctorId_str;
			}
			/**
			 *设置shiftPeriodId字段方法  
			 *@return  返回 <b>AgWorkInfo.shiftPeriodId</b>的值
			 */ 
			@Transient
			public String getShiftPeriodId_str(){
				return this.shiftPeriodId_str;
			}
			/**
			  *设置 shift_period_id字段方法 
			  *@param att_shiftPeriodId 输入<b>AgWorkInfo.shiftPeriodId</b>字段的值
			  */
			public void setShiftPeriodId_str(String att_shiftPeriodId_str){
				this.shiftPeriodId_str = att_shiftPeriodId_str;
			}
			/**
			 *设置planCount字段方法  
			 *@return  返回 <b>AgWorkInfo.planCount</b>的值
			 */ 
			@Transient
			public String getPlanCount_str(){
				return this.planCount_str;
			}
			/**
			  *设置 plan_count字段方法 
			  *@param att_planCount 输入<b>AgWorkInfo.planCount</b>字段的值
			  */
			public void setPlanCount_str(String att_planCount_str){
				this.planCount_str = att_planCount_str;
			}
			/**
			 *设置actualCount字段方法  
			 *@return  返回 <b>AgWorkInfo.actualCount</b>的值
			 */ 
			@Transient
			public String getActualCount_str(){
				return this.actualCount_str;
			}
			/**
			  *设置 actual_count字段方法 
			  *@param att_actualCount 输入<b>AgWorkInfo.actualCount</b>字段的值
			  */
			public void setActualCount_str(String att_actualCount_str){
				this.actualCount_str = att_actualCount_str;
			}
			/**
			 *设置createDate字段方法  
			 *@return  返回 <b>AgWorkInfo.createDate</b>的值
			 */ 
			@Transient
			public Date getCreateDate_start(){
				return this.createDate_start;
			}
			/**
			  *设置 create_date字段方法 
			  *@param att_createDate 输入<b>AgWorkInfo.createDate</b>字段的值
			  */
			public void setCreateDate_start(Date att_createDate_start){
				this.createDate_start = att_createDate_start;
			}
			/**
			 *设置createDate字段方法  
			 *@return  返回 <b>AgWorkInfo.createDate</b>的值
			 */ 
			@Transient
			public Date getCreateDate_end(){
				return this.createDate_end;
			}
			/**
			  *设置 create_date字段方法 
			  *@param att_createDate 输入<b>AgWorkInfo.createDate</b>字段的值
			  */
			public void setCreateDate_end(Date att_createDate_end){
				this.createDate_end = att_createDate_end;
			}
			/**
			 *设置editDate字段方法  
			 *@return  返回 <b>AgWorkInfo.editDate</b>的值
			 */ 
			@Transient
			public Date getEditDate_start(){
				return this.editDate_start;
			}
			/**
			  *设置 edit_date字段方法 
			  *@param att_editDate 输入<b>AgWorkInfo.editDate</b>字段的值
			  */
			public void setEditDate_start(Date att_editDate_start){
				this.editDate_start = att_editDate_start;
			}
			/**
			 *设置editDate字段方法  
			 *@return  返回 <b>AgWorkInfo.editDate</b>的值
			 */ 
			@Transient
			public Date getEditDate_end(){
				return this.editDate_end;
			}
			/**
			  *设置 edit_date字段方法 
			  *@param att_editDate 输入<b>AgWorkInfo.editDate</b>字段的值
			  */
			public void setEditDate_end(Date att_editDate_end){
				this.editDate_end = att_editDate_end;
			}
			/**
			 *设置tab_like字段方法  
			 *@return  返回 <b>AgWorkInfo.tab_like</b>的值
			 */ 
			@Transient
			public String getTab_like(){
				return this.Tab_like;
			}
			/**
			  *设置 字段方法 
			  *@param att_tab_like 输入<b>AgWorkInfo.tab_like</b>字段的值
			  */
			public void setTab_like(String att_Tab_like){
				this.Tab_like = att_Tab_like;
			}
			/**
			 *设置tab_order字段方法  
			 *@return  返回 <b>AgWorkInfo.tab_order</b>的值
			 */ 
			@Transient
			public String getTab_order(){
				return this.Tab_order;
			}
			/**
			  *设置 字段方法 
			  *@param att_tab_order 输入<b>AgWorkInfo.tab_order</b>字段的值
			  */
			public void setTab_order(String att_Tab_order){
				this.Tab_order = att_Tab_order;
			}
///===============数据库表无关子段字段属性end==========
			
			private Integer id;
			private Integer actualCount;
			
			@Formula("(SELECT COUNT(1) FROM ag_order_info a WHERE a.shift_plan_id=shift_plan_id AND a.status=0 and a.register_status in (0,1) )")
			public Integer getActualCount() {
				return actualCount;
			}

			public void setActualCount(Integer actualCount) {
				this.actualCount = actualCount;
			}

			@Transient
			public Integer getId() {
				return shiftPlanId;
			}

			public void setId(Integer id) {
				this.shiftPlanId=id;
			}
} 