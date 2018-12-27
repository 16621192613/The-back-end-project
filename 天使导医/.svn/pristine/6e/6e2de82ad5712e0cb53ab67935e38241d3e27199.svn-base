package com.hsk.angeldoctor.api.persistence;

import javax.persistence.*; 
import static javax.persistence.GenerationType.IDENTITY;
import java.util.Date;

/**
 * 根据ag_hospital_job表结构自动生成持久化对象<B> com.hsk.angeldoctor.api.persistence.AgHospitalJob</B>
 *<hr/>
 *===============数据库表字段属性==========
 *  <table> 
 * <tr><th>字段名称:</th><td>岗位ID(jobId)</td><th>字段类型:</th><td>Integer(主键)</td></tr> 
 * <tr><th>字段名称:</th><td>角色id(roleId)</td><th>字段类型:</th><td>Integer(可以为空)</td></tr> 
 * <tr><th>字段名称:</th><td>岗位名称(name)</td><th>字段类型:</th><td>String(可以为空)</td></tr> 
 * <tr><th>字段名称:</th><td>是否可编辑：0是1否(locked)</td><th>字段类型:</th><td>String(可以为空)</td></tr> 
 * <tr><th>字段名称:</th><td>状态(status)</td><th>字段类型:</th><td>String(可以为空)</td></tr> 
 * <tr><th>字段名称:</th><td>创建人(createRen)</td><th>字段类型:</th><td>String(可以为空)</td></tr> 
 * <tr><th>字段名称:</th><td>创建时间(createDate)</td><th>字段类型:</th><td>Date(可以为空)</td></tr> 
 * <tr><th>字段名称:</th><td>修改人(editRen)</td><th>字段类型:</th><td>String(可以为空)</td></tr> 
 * <tr><th>字段名称:</th><td>修改时间(editDate)</td><th>字段类型:</th><td>Date(可以为空)</td></tr> 
 * </table>
 *===============无关字段属性===============
 *  <table> 
 * 	<tr><th>字段名称:</th><td>岗位ID(jobId)	</td><th>属性名称:</th><td>jobId</td></tr>
 * 	<tr><th>字段名称:</th><td>角色id(roleId)	</td><th>属性名称:</th><td>roleId</td></tr>
 * 	<tr><th>字段名称:</th><td>创建时间(createDate)	</td><th>属性名称:</th><td>createDate</td></tr>
 * 	<tr><th>字段名称:</th><td>创建时间(createDate)	</td><th>属性名称:</th><td>createDate</td></tr>
 * 	<tr><th>字段名称:</th><td>修改时间(editDate)	</td><th>属性名称:</th><td>editDate</td></tr>
 * 	<tr><th>字段名称:</th><td>修改时间(editDate)	</td><th>属性名称:</th><td>editDate</td></tr>
 * 	<tr><th>字段名称:</th><td>(tab_like)	</td><th>属性名称:</th><td>tab_like</td></tr>
 * 	<tr><th>字段名称:</th><td>(tab_order)	</td><th>属性名称:</th><td>tab_order</td></tr>
 * </table>
 * <hr/>
 * @author  作者:admin  
 * @version  v1.0 创建时间: 2018-08-14 13:28:00
 */
 
 
@SuppressWarnings("serial")
@Entity
@Table(name = "ag_hospital_job" )
public class AgHospitalJob {
///===============数据库表字段属性begin==========
			/**
			 *岗位ID(jobId):字段类型为Integer  
			 */
 			private Integer jobId; 
 	
			/**
			 *角色id(roleId):字段类型为Integer  
			 */
 			private Integer roleId; 
 	
			/**
			 *岗位名称(name):字段类型为String  
			 */
 			private String name; 
 	
			/**
			 *是否可编辑：0是1否(locked):字段类型为String  
			 */
 			private String locked; 
 	
			/**
			 *状态(status):字段类型为String  
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
			 *设置岗位ID(job_id)字段方法 (该字段是主键)
			 *@return  返回 <b>AgHospitalJob.JobId</b>的值
			 */	 
			@Id
			@GeneratedValue(strategy = IDENTITY)
			@Column(name = "job_id")
			public Integer getJobId(){
			    return this.jobId;
			}

		  /**
		   *设置 job_id字段方法 
		   *@param att_jobId 输入<b>AgHospitalJob.jobId</b>字段的值
		   */
		  public void setJobId(Integer att_jobId){
		    this.jobId = att_jobId;
		  }
  
			/**
			 *设置角色id(role_id)字段方法 
			 *@return  返回 <b>AgHospitalJob.RoleId</b>的值
			 */	 
			@Column(name = "role_id" ) 
			public Integer getRoleId(){
			    return this.roleId;
			}

		  /**
		   *设置 role_id字段方法 
		   *@param att_roleId 输入<b>AgHospitalJob.roleId</b>字段的值
		   */
		  public void setRoleId(Integer att_roleId){
		    this.roleId = att_roleId;
		  }
  
			/**
			 *设置岗位名称(name)字段方法 
			 *@return  返回 <b>AgHospitalJob.Name</b>的值
			 */	 
			@Column(name = "name" ) 
			public String getName(){
			    return this.name;
			}

		  /**
		   *设置 name字段方法 
		   *@param att_name 输入<b>AgHospitalJob.name</b>字段的值
		   */
		  public void setName(String att_name){
		    this.name = att_name;
		  }
  
			/**
			 *设置是否可编辑：0是1否(locked)字段方法 
			 *@return  返回 <b>AgHospitalJob.Locked</b>的值
			 */	 
			@Column(name = "locked" ) 
			public String getLocked(){
			    return this.locked;
			}

		  /**
		   *设置 locked字段方法 
		   *@param att_locked 输入<b>AgHospitalJob.locked</b>字段的值
		   */
		  public void setLocked(String att_locked){
		    this.locked = att_locked;
		  }
  
			/**
			 *设置状态(status)字段方法 
			 *@return  返回 <b>AgHospitalJob.Status</b>的值
			 */	 
			@Column(name = "status" ) 
			public String getStatus(){
			    return this.status;
			}

		  /**
		   *设置 status字段方法 
		   *@param att_status 输入<b>AgHospitalJob.status</b>字段的值
		   */
		  public void setStatus(String att_status){
		    this.status = att_status;
		  }
  
			/**
			 *设置创建人(create_ren)字段方法 
			 *@return  返回 <b>AgHospitalJob.CreateRen</b>的值
			 */	 
			@Column(name = "create_ren" ) 
			public String getCreateRen(){
			    return this.createRen;
			}

		  /**
		   *设置 create_ren字段方法 
		   *@param att_createRen 输入<b>AgHospitalJob.createRen</b>字段的值
		   */
		  public void setCreateRen(String att_createRen){
		    this.createRen = att_createRen;
		  }
  
			/**
			 *设置创建时间(create_date)字段方法 
			 *@return  返回 <b>AgHospitalJob.CreateDate</b>的值
			 */	 
			@Temporal(TemporalType.TIMESTAMP)
			@Column(name = "create_date" ) 
			public Date getCreateDate(){
			    return this.createDate;
			}

		  /**
		   *设置 create_date字段方法 
		   *@param att_createDate 输入<b>AgHospitalJob.createDate</b>字段的值
		   */
		  public void setCreateDate(Date att_createDate){
		    this.createDate = att_createDate;
		  }
  
			/**
			 *设置修改人(edit_ren)字段方法 
			 *@return  返回 <b>AgHospitalJob.EditRen</b>的值
			 */	 
			@Column(name = "edit_ren" ) 
			public String getEditRen(){
			    return this.editRen;
			}

		  /**
		   *设置 edit_ren字段方法 
		   *@param att_editRen 输入<b>AgHospitalJob.editRen</b>字段的值
		   */
		  public void setEditRen(String att_editRen){
		    this.editRen = att_editRen;
		  }
  
			/**
			 *设置修改时间(edit_date)字段方法 
			 *@return  返回 <b>AgHospitalJob.EditDate</b>的值
			 */	 
			@Temporal(TemporalType.TIMESTAMP)
			@Column(name = "edit_date" ) 
			public Date getEditDate(){
			    return this.editDate;
			}

		  /**
		   *设置 edit_date字段方法 
		   *@param att_editDate 输入<b>AgHospitalJob.editDate</b>字段的值
		   */
		  public void setEditDate(Date att_editDate){
		    this.editDate = att_editDate;
		  }
  

///===============数据库表字段属性end==========

///===============数据库表无关子段字段属性begin==========
			/**
			 *岗位ID(job_id):字段类型为String
			 */
		  private String jobId_str;  
			/**
			 *角色id(role_id):字段类型为String
			 */
		  private String roleId_str;  
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
			 *ag_hospital_job表里不用like作为条件的字符串
			 */
		  private String Tab_like;  
			/**
			 *():字段类型为String
			 *ag_hospital_job表里order by 字符串
			 */
		  private String Tab_order;  
			/**
			 *设置jobId字段方法  
			 *@return  返回 <b>AgHospitalJob.jobId</b>的值
			 */ 
			@Transient
			public String getJobId_str(){
				return this.jobId_str;
			}
			/**
			  *设置 job_id字段方法 
			  *@param att_jobId 输入<b>AgHospitalJob.jobId</b>字段的值
			  */
			public void setJobId_str(String att_jobId_str){
				this.jobId_str = att_jobId_str;
			}
			/**
			 *设置roleId字段方法  
			 *@return  返回 <b>AgHospitalJob.roleId</b>的值
			 */ 
			@Transient
			public String getRoleId_str(){
				return this.roleId_str;
			}
			/**
			  *设置 role_id字段方法 
			  *@param att_roleId 输入<b>AgHospitalJob.roleId</b>字段的值
			  */
			public void setRoleId_str(String att_roleId_str){
				this.roleId_str = att_roleId_str;
			}
			/**
			 *设置createDate字段方法  
			 *@return  返回 <b>AgHospitalJob.createDate</b>的值
			 */ 
			@Transient
			public Date getCreateDate_start(){
				return this.createDate_start;
			}
			/**
			  *设置 create_date字段方法 
			  *@param att_createDate 输入<b>AgHospitalJob.createDate</b>字段的值
			  */
			public void setCreateDate_start(Date att_createDate_start){
				this.createDate_start = att_createDate_start;
			}
			/**
			 *设置createDate字段方法  
			 *@return  返回 <b>AgHospitalJob.createDate</b>的值
			 */ 
			@Transient
			public Date getCreateDate_end(){
				return this.createDate_end;
			}
			/**
			  *设置 create_date字段方法 
			  *@param att_createDate 输入<b>AgHospitalJob.createDate</b>字段的值
			  */
			public void setCreateDate_end(Date att_createDate_end){
				this.createDate_end = att_createDate_end;
			}
			/**
			 *设置editDate字段方法  
			 *@return  返回 <b>AgHospitalJob.editDate</b>的值
			 */ 
			@Transient
			public Date getEditDate_start(){
				return this.editDate_start;
			}
			/**
			  *设置 edit_date字段方法 
			  *@param att_editDate 输入<b>AgHospitalJob.editDate</b>字段的值
			  */
			public void setEditDate_start(Date att_editDate_start){
				this.editDate_start = att_editDate_start;
			}
			/**
			 *设置editDate字段方法  
			 *@return  返回 <b>AgHospitalJob.editDate</b>的值
			 */ 
			@Transient
			public Date getEditDate_end(){
				return this.editDate_end;
			}
			/**
			  *设置 edit_date字段方法 
			  *@param att_editDate 输入<b>AgHospitalJob.editDate</b>字段的值
			  */
			public void setEditDate_end(Date att_editDate_end){
				this.editDate_end = att_editDate_end;
			}
			/**
			 *设置tab_like字段方法  
			 *@return  返回 <b>AgHospitalJob.tab_like</b>的值
			 */ 
			@Transient
			public String getTab_like(){
				return this.Tab_like;
			}
			/**
			  *设置 字段方法 
			  *@param att_tab_like 输入<b>AgHospitalJob.tab_like</b>字段的值
			  */
			public void setTab_like(String att_Tab_like){
				this.Tab_like = att_Tab_like;
			}
			/**
			 *设置tab_order字段方法  
			 *@return  返回 <b>AgHospitalJob.tab_order</b>的值
			 */ 
			@Transient
			public String getTab_order(){
				return this.Tab_order;
			}
			/**
			  *设置 字段方法 
			  *@param att_tab_order 输入<b>AgHospitalJob.tab_order</b>字段的值
			  */
			public void setTab_order(String att_Tab_order){
				this.Tab_order = att_Tab_order;
			}
///===============数据库表无关子段字段属性end==========
			
			private Integer id;
			@Transient
			public Integer getId() {
				return jobId;
			}

			public void setId(Integer id) {
				this.jobId=id;
			}
} 