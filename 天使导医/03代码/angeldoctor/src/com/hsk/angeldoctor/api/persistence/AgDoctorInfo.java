package com.hsk.angeldoctor.api.persistence;

import javax.persistence.*;

import org.hibernate.annotations.Formula;

import static javax.persistence.GenerationType.IDENTITY;
import java.util.Date;

/**
 * 根据ag_doctor_info表结构自动生成持久化对象<B> com.hsk.angeldoctor.api.persistence.AgDoctorInfo</B>
 *<hr/>
 *===============数据库表字段属性==========
 *  <table> 
 * <tr><th>字段名称:</th><td>医生ID(doctorId)</td><th>字段类型:</th><td>Integer(主键)</td></tr> 
 * <tr><th>字段名称:</th><td>医院ID(organizationId)</td><th>字段类型:</th><td>Integer(可以为空)</td></tr> 
 * <tr><th>字段名称:</th><td>角色id(roleId)</td><th>字段类型:</th><td>Integer(可以为空)</td></tr> 
 * <tr><th>字段名称:</th><td>岗位ID(jobTitleId)</td><th>字段类型:</th><td>Integer(可以为空)</td></tr> 
 * <tr><th>字段名称:</th><td>医生名称(name)</td><th>字段类型:</th><td>String(可以为空)</td></tr> 
 * <tr><th>字段名称:</th><td>性别(gender)</td><th>字段类型:</th><td>String(可以为空)</td></tr> 
 * <tr><th>字段名称:</th><td>生日(birthday)</td><th>字段类型:</th><td>String(可以为空)</td></tr> 
 * <tr><th>字段名称:</th><td>手机号(mobile)</td><th>字段类型:</th><td>String(可以为空)</td></tr> 
 * <tr><th>字段名称:</th><td>是否专家:0是1否(expert)</td><th>字段类型:</th><td>String(可以为空)</td></tr> 
 * <tr><th>字段名称:</th><td>简介(introduction)</td><th>字段类型:</th><td>String(可以为空)</td></tr> 
 * <tr><th>字段名称:</th><td>专业特长(major)</td><th>字段类型:</th><td>String(可以为空)</td></tr> 
 * <tr><th>字段名称:</th><td>是否可见:0可见1不可见(visible)</td><th>字段类型:</th><td>String(可以为空)</td></tr> 
 * <tr><th>字段名称:</th><td>头像(avatar)</td><th>字段类型:</th><td>String(可以为空)</td></tr> 
 * <tr><th>字段名称:</th><td>证书(images)</td><th>字段类型:</th><td>String(可以为空)</td></tr> 
 * <tr><th>字段名称:</th><td>是否在职,0是，1不是(status)</td><th>字段类型:</th><td>String(可以为空)</td></tr> 
 * <tr><th>字段名称:</th><td>创建人(createRen)</td><th>字段类型:</th><td>String(可以为空)</td></tr> 
 * <tr><th>字段名称:</th><td>创建时间(createDate)</td><th>字段类型:</th><td>Date(可以为空)</td></tr> 
 * <tr><th>字段名称:</th><td>修改人(editRen)</td><th>字段类型:</th><td>String(可以为空)</td></tr> 
 * <tr><th>字段名称:</th><td>修改时间(editDate)</td><th>字段类型:</th><td>Date(可以为空)</td></tr> 
 * * <tr><th>字段名称:</th><td>科室ID集合(departmentId)</td><th>字段类型:</th><td>String(可以为空)</td></tr> 
 * * <tr><th>字段名称:</th><td>科室名称集合(departmentName)</td><th>字段类型:</th><td>String(可以为空)</td></tr> 
 * </table> 
 *===============无关字段属性===============
 *  <table> 
 * 	<tr><th>字段名称:</th><td>医生ID(doctorId)	</td><th>属性名称:</th><td>doctorId</td></tr>
 * 	<tr><th>字段名称:</th><td>医院ID(organizationId)	</td><th>属性名称:</th><td>organizationId</td></tr>
 * 	<tr><th>字段名称:</th><td>角色id(roleId)	</td><th>属性名称:</th><td>roleId</td></tr>
 * 	<tr><th>字段名称:</th><td>岗位ID(jobTitleId)	</td><th>属性名称:</th><td>jobTitleId</td></tr>
 * 	<tr><th>字段名称:</th><td>创建时间(createDate)	</td><th>属性名称:</th><td>createDate</td></tr>
 * 	<tr><th>字段名称:</th><td>创建时间(createDate)	</td><th>属性名称:</th><td>createDate</td></tr>
 * 	<tr><th>字段名称:</th><td>修改时间(editDate)	</td><th>属性名称:</th><td>editDate</td></tr>
 * 	<tr><th>字段名称:</th><td>修改时间(editDate)	</td><th>属性名称:</th><td>editDate</td></tr>
 * 	<tr><th>字段名称:</th><td>(tab_like)	</td><th>属性名称:</th><td>tab_like</td></tr>
 * 	<tr><th>字段名称:</th><td>(tab_order)	</td><th>属性名称:</th><td>tab_order</td></tr>
 * </table>
 * <hr/>
 * @author  作者:admin  
 * @version  v1.0 创建时间: 2018-08-14 13:27:59
 */
 
 
@SuppressWarnings("serial")
@Entity
@Table(name = "ag_doctor_info" )
public class AgDoctorInfo {
///===============数据库表字段属性begin==========
			/**
			 *医生ID(doctorId):字段类型为Integer  
			 */
 			private Integer doctorId; 
 	
			/**
			 *医院ID(organizationId):字段类型为Integer  
			 */
 			private Integer organizationId; 
 	
			/**
			 *角色id(roleId):字段类型为Integer  
			 */
 			private Integer roleId; 
 	
			/**
			 *岗位ID(jobTitleId):字段类型为Integer  
			 */
 			private Integer jobTitleId; 
 	
			/**
			 *医生名称(name):字段类型为String  
			 */
 			private String name; 
 	
			/**
			 *性别(gender):字段类型为String  
			 */
 			private String gender; 
 	
			/**
			 *生日(birthday):字段类型为String  
			 */
 			private String birthday; 
 	
			/**
			 *手机号(mobile):字段类型为String  
			 */
 			private String mobile; 
 	
			/**
			 *是否专家:0是1否(expert):字段类型为String  
			 */
 			private String expert; 
 	
			/**
			 *简介(introduction):字段类型为String  
			 */
 			private String introduction; 
 	
			/**
			 *专业特长(major):字段类型为String  
			 */
 			private String major; 
 	
			/**
			 *是否可见:0可见1不可见(visible):字段类型为String  
			 */
 			private String visible; 
 	
			/**
			 *头像(avatar):字段类型为String  
			 */
 			private String avatar; 
 	
			/**
			 *证书(images):字段类型为String  
			 */
 			private String images; 
 	
			/**
			 *是否在职,0是，1不是(status):字段类型为String  
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
 			 * 科室ID集合
 			 */
 			private String departmentId; 
 			/**
 			 * 科室名称集合
 			 */
 			
 			private String departmentName; 
 	
			/**
			 *设置医生ID(doctor_id)字段方法 (该字段是主键)
			 *@return  返回 <b>AgDoctorInfo.DoctorId</b>的值
			 */	 
			@Id
			@GeneratedValue(strategy = IDENTITY)
			@Column(name = "doctor_id")
			public Integer getDoctorId(){
			    return this.doctorId;
			}

		  /**
		   *设置 doctor_id字段方法 
		   *@param att_doctorId 输入<b>AgDoctorInfo.doctorId</b>字段的值
		   */
		  public void setDoctorId(Integer att_doctorId){
		    this.doctorId = att_doctorId;
		  }
		  
		  
		  
		  /**
		   * 获取科室ID集合
		   * @return
		   */
			@Column(name = "department_Id")
			public String getDepartmentId() {
			return departmentId;
		}
/**
 * 设置科室ID集合
 * @param departmentId
 */
		public void setDepartmentId(String departmentId) {
			this.departmentId = departmentId;
		}
/**
 * 获取科室名称集合
 * @return
 */
		@Column(name = "department_Name")
		public String getDepartmentName() {
			return departmentName;
		}
/**
 * 设置科室名称集合
 * @param departmentName
 */
		public void setDepartmentName(String departmentName) {
			this.departmentName = departmentName;
		}

			/**
			 *设置医院ID(organization_id)字段方法 
			 *@return  返回 <b>AgDoctorInfo.OrganizationId</b>的值
			 */	 
			@Column(name = "organization_id" ) 
			public Integer getOrganizationId(){
			    return this.organizationId;
			}

		  /**
		   *设置 organization_id字段方法 
		   *@param att_organizationId 输入<b>AgDoctorInfo.organizationId</b>字段的值
		   */
		  public void setOrganizationId(Integer att_organizationId){
		    this.organizationId = att_organizationId;
		  }
  
			/**
			 *设置角色id(role_id)字段方法 
			 *@return  返回 <b>AgDoctorInfo.RoleId</b>的值
			 */	 
			@Column(name = "role_id" ) 
			public Integer getRoleId(){
			    return this.roleId;
			}

		  /**
		   *设置 role_id字段方法 
		   *@param att_roleId 输入<b>AgDoctorInfo.roleId</b>字段的值
		   */
		  public void setRoleId(Integer att_roleId){
		    this.roleId = att_roleId;
		  }
  
			/**
			 *设置岗位ID(job_title_id)字段方法 
			 *@return  返回 <b>AgDoctorInfo.JobTitleId</b>的值
			 */	 
			@Column(name = "job_title_id" ) 
			public Integer getJobTitleId(){
			    return this.jobTitleId;
			}

		  /**
		   *设置 job_title_id字段方法 
		   *@param att_jobTitleId 输入<b>AgDoctorInfo.jobTitleId</b>字段的值
		   */
		  public void setJobTitleId(Integer att_jobTitleId){
		    this.jobTitleId = att_jobTitleId;
		  }
  
			/**
			 *设置医生名称(name)字段方法 
			 *@return  返回 <b>AgDoctorInfo.Name</b>的值
			 */	 
			@Column(name = "name" ) 
			public String getName(){
			    return this.name;
			}

		  /**
		   *设置 name字段方法 
		   *@param att_name 输入<b>AgDoctorInfo.name</b>字段的值
		   */
		  public void setName(String att_name){
		    this.name = att_name;
		  }
  
			/**
			 *设置性别(gender)字段方法 
			 *@return  返回 <b>AgDoctorInfo.Gender</b>的值
			 */	 
			@Column(name = "gender" ) 
			public String getGender(){
			    return this.gender;
			}

		  /**
		   *设置 gender字段方法 
		   *@param att_gender 输入<b>AgDoctorInfo.gender</b>字段的值
		   */
		  public void setGender(String att_gender){
		    this.gender = att_gender;
		  }
  
			/**
			 *设置生日(birthday)字段方法 
			 *@return  返回 <b>AgDoctorInfo.Birthday</b>的值
			 */	 
			@Column(name = "birthday" ) 
			public String getBirthday(){
			    return this.birthday;
			}

		  /**
		   *设置 birthday字段方法 
		   *@param att_birthday 输入<b>AgDoctorInfo.birthday</b>字段的值
		   */
		  public void setBirthday(String att_birthday){
		    this.birthday = att_birthday;
		  }
  
			/**
			 *设置手机号(mobile)字段方法 
			 *@return  返回 <b>AgDoctorInfo.Mobile</b>的值
			 */	 
			@Column(name = "mobile" ) 
			public String getMobile(){
			    return this.mobile;
			}

		  /**
		   *设置 mobile字段方法 
		   *@param att_mobile 输入<b>AgDoctorInfo.mobile</b>字段的值
		   */
		  public void setMobile(String att_mobile){
		    this.mobile = att_mobile;
		  }
  
			/**
			 *设置是否专家:0是1否(expert)字段方法 
			 *@return  返回 <b>AgDoctorInfo.Expert</b>的值
			 */	 
			@Column(name = "expert" ) 
			public String getExpert(){
			    return this.expert;
			}

		  /**
		   *设置 expert字段方法 
		   *@param att_expert 输入<b>AgDoctorInfo.expert</b>字段的值
		   */
		  public void setExpert(String att_expert){
		    this.expert = att_expert;
		  }
  
			/**
			 *设置简介(introduction)字段方法 
			 *@return  返回 <b>AgDoctorInfo.Introduction</b>的值
			 */	 
			@Column(name = "introduction" ) 
			public String getIntroduction(){
			    return this.introduction;
			}

		  /**
		   *设置 introduction字段方法 
		   *@param att_introduction 输入<b>AgDoctorInfo.introduction</b>字段的值
		   */
		  public void setIntroduction(String att_introduction){
		    this.introduction = att_introduction;
		  }
  
			/**
			 *设置专业特长(major)字段方法 
			 *@return  返回 <b>AgDoctorInfo.Major</b>的值
			 */	 
			@Column(name = "major" ) 
			public String getMajor(){
			    return this.major;
			}

		  /**
		   *设置 major字段方法 
		   *@param att_major 输入<b>AgDoctorInfo.major</b>字段的值
		   */
		  public void setMajor(String att_major){
		    this.major = att_major;
		  }
  
			/**
			 *设置是否可见:0可见1不可见(visible)字段方法 
			 *@return  返回 <b>AgDoctorInfo.Visible</b>的值
			 */	 
			@Column(name = "visible" ) 
			public String getVisible(){
			    return this.visible;
			}

		  /**
		   *设置 visible字段方法 
		   *@param att_visible 输入<b>AgDoctorInfo.visible</b>字段的值
		   */
		  public void setVisible(String att_visible){
		    this.visible = att_visible;
		  }
  
			/**
			 *设置头像(avatar)字段方法 
			 *@return  返回 <b>AgDoctorInfo.Avatar</b>的值
			 */	 
			@Column(name = "avatar" ) 
			public String getAvatar(){
			    return this.avatar;
			}

		  /**
		   *设置 avatar字段方法 
		   *@param att_avatar 输入<b>AgDoctorInfo.avatar</b>字段的值
		   */
		  public void setAvatar(String att_avatar){
		    this.avatar = att_avatar;
		  }
  
			/**
			 *设置证书(images)字段方法 
			 *@return  返回 <b>AgDoctorInfo.Images</b>的值
			 */	 
			@Column(name = "images" ) 
			public String getImages(){
			    return this.images;
			}

		  /**
		   *设置 images字段方法 
		   *@param att_images 输入<b>AgDoctorInfo.images</b>字段的值
		   */
		  public void setImages(String att_images){
		    this.images = att_images;
		  }
  
			/**
			 *设置是否在职,0是，1不是(status)字段方法 
			 *@return  返回 <b>AgDoctorInfo.Status</b>的值
			 */	 
			@Column(name = "status" ) 
			public String getStatus(){
			    return this.status;
			}

		  /**
		   *设置 status字段方法 
		   *@param att_status 输入<b>AgDoctorInfo.status</b>字段的值
		   */
		  public void setStatus(String att_status){
		    this.status = att_status;
		  }
  
			/**
			 *设置创建人(create_ren)字段方法 
			 *@return  返回 <b>AgDoctorInfo.CreateRen</b>的值
			 */	 
			@Column(name = "create_ren" ) 
			public String getCreateRen(){
			    return this.createRen;
			}

		  /**
		   *设置 create_ren字段方法 
		   *@param att_createRen 输入<b>AgDoctorInfo.createRen</b>字段的值
		   */
		  public void setCreateRen(String att_createRen){
		    this.createRen = att_createRen;
		  }
  
			/**
			 *设置创建时间(create_date)字段方法 
			 *@return  返回 <b>AgDoctorInfo.CreateDate</b>的值
			 */	 
			@Temporal(TemporalType.TIMESTAMP)
			@Column(name = "create_date" ) 
			public Date getCreateDate(){
			    return this.createDate;
			}

		  /**
		   *设置 create_date字段方法 
		   *@param att_createDate 输入<b>AgDoctorInfo.createDate</b>字段的值
		   */
		  public void setCreateDate(Date att_createDate){
		    this.createDate = att_createDate;
		  }
  
			/**
			 *设置修改人(edit_ren)字段方法 
			 *@return  返回 <b>AgDoctorInfo.EditRen</b>的值
			 */	 
			@Column(name = "edit_ren" ) 
			public String getEditRen(){
			    return this.editRen;
			}

		  /**
		   *设置 edit_ren字段方法 
		   *@param att_editRen 输入<b>AgDoctorInfo.editRen</b>字段的值
		   */
		  public void setEditRen(String att_editRen){
		    this.editRen = att_editRen;
		  }
  
			/**
			 *设置修改时间(edit_date)字段方法 
			 *@return  返回 <b>AgDoctorInfo.EditDate</b>的值
			 */	 
			@Temporal(TemporalType.TIMESTAMP)
			@Column(name = "edit_date" ) 
			public Date getEditDate(){
			    return this.editDate;
			}

		  /**
		   *设置 edit_date字段方法 
		   *@param att_editDate 输入<b>AgDoctorInfo.editDate</b>字段的值
		   */
		  public void setEditDate(Date att_editDate){
		    this.editDate = att_editDate;
		  }
  

///===============数据库表字段属性end==========
		  /**
		   * 账号
		   */
			private String username;
			/**
			 * 密码
			 */
			private String password;
			
			 
			@Formula("(SELECT a.account FROM sys_user_info a WHERE a.user_type='3' AND a.srole_id=doctor_id)")
			public String getUsername() {
				return username;
			}
			
			public void setUsername(String username) {
				this.username = username;
			}
			@Transient
			public String getPassword() {
				return password;
			}
			
			public void setPassword(String password) {
				this.password = password;
			}


			///===============数据库表无关子段字段属性begin==========
			/**
			 *医生ID(doctor_id):字段类型为String
			 */
		  private String doctorId_str;  
		  private String doctorId_no_str;
			/**
			 *医院ID(organization_id):字段类型为String
			 */
		  private String organizationId_str;  
			/**
			 *角色id(role_id):字段类型为String
			 */
		  private String roleId_str;  
			/**
			 *岗位ID(job_title_id):字段类型为String
			 */
		  private String jobTitleId_str;  
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
			 *ag_doctor_info表里不用like作为条件的字符串
			 */
		  private String Tab_like;  
			/**
			 *():字段类型为String
			 *ag_doctor_info表里order by 字符串
			 */
		  private String Tab_order;  
			/**
			 *设置doctorId字段方法  
			 *@return  返回 <b>AgDoctorInfo.doctorId</b>的值
			 */ 
			@Transient
			public String getDoctorId_str(){
				return this.doctorId_str;
			}
			/**
			  *设置 doctor_id字段方法 
			  *@param att_doctorId 输入<b>AgDoctorInfo.doctorId</b>字段的值
			  */
			public void setDoctorId_str(String att_doctorId_str){
				this.doctorId_str = att_doctorId_str;
			}
			@Transient
			public String getDoctorId_no_str() {
				return doctorId_no_str;
			}

			public void setDoctorId_no_str(String doctorId_no_str) {
				this.doctorId_no_str = doctorId_no_str;
			}

			/**
			 *设置organizationId字段方法  
			 *@return  返回 <b>AgDoctorInfo.organizationId</b>的值
			 */ 
			@Transient
			public String getOrganizationId_str(){
				return this.organizationId_str;
			}
			/**
			  *设置 organization_id字段方法 
			  *@param att_organizationId 输入<b>AgDoctorInfo.organizationId</b>字段的值
			  */
			public void setOrganizationId_str(String att_organizationId_str){
				this.organizationId_str = att_organizationId_str;
			}
			/**
			 *设置roleId字段方法  
			 *@return  返回 <b>AgDoctorInfo.roleId</b>的值
			 */ 
			@Transient
			public String getRoleId_str(){
				return this.roleId_str;
			}
			/**
			  *设置 role_id字段方法 
			  *@param att_roleId 输入<b>AgDoctorInfo.roleId</b>字段的值
			  */
			public void setRoleId_str(String att_roleId_str){
				this.roleId_str = att_roleId_str;
			}
			/**
			 *设置jobTitleId字段方法  
			 *@return  返回 <b>AgDoctorInfo.jobTitleId</b>的值
			 */ 
			@Transient
			public String getJobTitleId_str(){
				return this.jobTitleId_str;
			}
			/**
			  *设置 job_title_id字段方法 
			  *@param att_jobTitleId 输入<b>AgDoctorInfo.jobTitleId</b>字段的值
			  */
			public void setJobTitleId_str(String att_jobTitleId_str){
				this.jobTitleId_str = att_jobTitleId_str;
			}
			/**
			 *设置createDate字段方法  
			 *@return  返回 <b>AgDoctorInfo.createDate</b>的值
			 */ 
			@Transient
			public Date getCreateDate_start(){
				return this.createDate_start;
			}
			/**
			  *设置 create_date字段方法 
			  *@param att_createDate 输入<b>AgDoctorInfo.createDate</b>字段的值
			  */
			public void setCreateDate_start(Date att_createDate_start){
				this.createDate_start = att_createDate_start;
			}
			/**
			 *设置createDate字段方法  
			 *@return  返回 <b>AgDoctorInfo.createDate</b>的值
			 */ 
			@Transient
			public Date getCreateDate_end(){
				return this.createDate_end;
			}
			/**
			  *设置 create_date字段方法 
			  *@param att_createDate 输入<b>AgDoctorInfo.createDate</b>字段的值
			  */
			public void setCreateDate_end(Date att_createDate_end){
				this.createDate_end = att_createDate_end;
			}
			/**
			 *设置editDate字段方法  
			 *@return  返回 <b>AgDoctorInfo.editDate</b>的值
			 */ 
			@Transient
			public Date getEditDate_start(){
				return this.editDate_start;
			}
			/**
			  *设置 edit_date字段方法 
			  *@param att_editDate 输入<b>AgDoctorInfo.editDate</b>字段的值
			  */
			public void setEditDate_start(Date att_editDate_start){
				this.editDate_start = att_editDate_start;
			}
			/**
			 *设置editDate字段方法  
			 *@return  返回 <b>AgDoctorInfo.editDate</b>的值
			 */ 
			@Transient
			public Date getEditDate_end(){
				return this.editDate_end;
			}
			/**
			  *设置 edit_date字段方法 
			  *@param att_editDate 输入<b>AgDoctorInfo.editDate</b>字段的值
			  */
			public void setEditDate_end(Date att_editDate_end){
				this.editDate_end = att_editDate_end;
			}
			/**
			 *设置tab_like字段方法  
			 *@return  返回 <b>AgDoctorInfo.tab_like</b>的值
			 */ 
			@Transient
			public String getTab_like(){
				return this.Tab_like;
			}
			/**
			  *设置 字段方法 
			  *@param att_tab_like 输入<b>AgDoctorInfo.tab_like</b>字段的值
			  */
			public void setTab_like(String att_Tab_like){
				this.Tab_like = att_Tab_like;
			}
			/**
			 *设置tab_order字段方法  
			 *@return  返回 <b>AgDoctorInfo.tab_order</b>的值
			 */ 
			@Transient
			public String getTab_order(){
				return this.Tab_order;
			}
			/**
			  *设置 字段方法 
			  *@param att_tab_order 输入<b>AgDoctorInfo.tab_order</b>字段的值
			  */
			public void setTab_order(String att_Tab_order){
				this.Tab_order = att_Tab_order;
			}
///===============数据库表无关子段字段属性end==========
			private String departments;
			private String jobTitleName;
			private String isColl;
			private String organizationName;
			private String isOrder;
			
			@Transient
			public String getIsColl() {
				return isColl;
			}

			public void setIsColl(String isColl) {
				this.isColl = isColl;
			}

			@Formula("(SELECT a.name FROM ag_hospital_job a WHERE a.job_id=job_title_id)")
			public String getJobTitleName() {
				return jobTitleName;
			}

			public void setJobTitleName(String jobTitleName) {
				this.jobTitleName = jobTitleName;
			}

			@Transient
			public String getDepartments() {
				return departments;
			}

			public void setDepartments(String departments) {
				this.departments = departments;
			}


			private Integer id;
			@Transient
			public Integer getId() {
				return doctorId;
			}

			public void setId(Integer id) {
				this.doctorId=id;
			}
			@Formula("(SELECT a.name FROM ag_hospital_info a WHERE a.organization_id=organization_id)")
			public String getOrganizationName() {
				return organizationName;
			}

			public void setOrganizationName(String organizationName) {
				this.organizationName = organizationName;
			}
			@Transient
			public String getIsOrder() {
				return isOrder;
			}

			public void setIsOrder(String isOrder) {
				this.isOrder = isOrder;
			}
			
			
			
			
} 