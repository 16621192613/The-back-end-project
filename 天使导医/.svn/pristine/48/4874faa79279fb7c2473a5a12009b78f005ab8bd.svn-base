package com.hsk.angeldoctor.api.persistence;

import javax.persistence.*; 

import org.hibernate.annotations.Formula;

import static javax.persistence.GenerationType.IDENTITY;
import java.util.Date;

/**
 * 根据ag_doctor_department_gx表结构自动生成持久化对象<B> com.hsk.angeldoctor.api.persistence.AgDoctorDepartmentGx</B>
 *<hr/>
 *===============数据库表字段属性==========
 *  <table> 
 * <tr><th>字段名称:</th><td>医生科室关系ID(addgId)</td><th>字段类型:</th><td>Integer(主键)</td></tr> 
 * <tr><th>字段名称:</th><td>医生ID(doctorId)</td><th>字段类型:</th><td>Integer(可以为空)</td></tr> 
 * <tr><th>字段名称:</th><td>科室ID(departmentId)</td><th>字段类型:</th><td>Integer(可以为空)</td></tr> 
 * </table>
 *===============无关字段属性===============
 *  <table> 
 * 	<tr><th>字段名称:</th><td>医生科室关系ID(addgId)	</td><th>属性名称:</th><td>addgId</td></tr>
 * 	<tr><th>字段名称:</th><td>医生ID(doctorId)	</td><th>属性名称:</th><td>doctorId</td></tr>
 * 	<tr><th>字段名称:</th><td>科室ID(departmentId)	</td><th>属性名称:</th><td>departmentId</td></tr>
 * 	<tr><th>字段名称:</th><td>(tab_like)	</td><th>属性名称:</th><td>tab_like</td></tr>
 * 	<tr><th>字段名称:</th><td>(tab_order)	</td><th>属性名称:</th><td>tab_order</td></tr>
 * </table>
 * <hr/>
 * @author  作者:admin  
 * @version  v1.0 创建时间: 2018-08-14 13:27:59
 */
 
 
@SuppressWarnings("serial")
@Entity
@Table(name = "ag_doctor_department_gx" )
public class AgDoctorDepartmentGx {
///===============数据库表字段属性begin==========
			/**
			 *医生科室关系ID(addgId):字段类型为Integer  
			 */
 			private Integer addgId; 
 	
			/**
			 *医生ID(doctorId):字段类型为Integer  
			 */
 			private Integer doctorId; 
 	
			/**
			 *科室ID(departmentId):字段类型为Integer  
			 */
 			private Integer departmentId; 
 	
			/**
			 *设置医生科室关系ID(addg_id)字段方法 (该字段是主键)
			 *@return  返回 <b>AgDoctorDepartmentGx.AddgId</b>的值
			 */	 
			@Id
			@GeneratedValue(strategy = IDENTITY)
			@Column(name = "addg_id")
			public Integer getAddgId(){
			    return this.addgId;
			}

		  /**
		   *设置 addg_id字段方法 
		   *@param att_addgId 输入<b>AgDoctorDepartmentGx.addgId</b>字段的值
		   */
		  public void setAddgId(Integer att_addgId){
		    this.addgId = att_addgId;
		  }
  
			/**
			 *设置医生ID(doctor_id)字段方法 
			 *@return  返回 <b>AgDoctorDepartmentGx.DoctorId</b>的值
			 */	 
			@Column(name = "doctor_id" ) 
			public Integer getDoctorId(){
			    return this.doctorId;
			}

		  /**
		   *设置 doctor_id字段方法 
		   *@param att_doctorId 输入<b>AgDoctorDepartmentGx.doctorId</b>字段的值
		   */
		  public void setDoctorId(Integer att_doctorId){
		    this.doctorId = att_doctorId;
		  }
  
			/**
			 *设置科室ID(department_id)字段方法 
			 *@return  返回 <b>AgDoctorDepartmentGx.DepartmentId</b>的值
			 */	 
			@Column(name = "department_id" ) 
			public Integer getDepartmentId(){
			    return this.departmentId;
			}

		  /**
		   *设置 department_id字段方法 
		   *@param att_departmentId 输入<b>AgDoctorDepartmentGx.departmentId</b>字段的值
		   */
		  public void setDepartmentId(Integer att_departmentId){
		    this.departmentId = att_departmentId;
		  }
  

///===============数据库表字段属性end==========

		  /**
			 *医生名称(name):字段类型为String  
			 */
			private String name; 
			/**
			 *是否可见:0可见1不可见(visible):字段类型为String  
			 */
 			private String visible; 
 			/**
			 *设置医生名称(name)字段方法 
			 *@return  返回 <b>AgDoctorInfo.Name</b>的值
			 */	 
 			@Formula("(SELECT a.name FROM ag_doctor_info a WHERE a.doctor_id= doctor_id   )")
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
			 *设置是否可见:0可见1不可见(visible)字段方法 
			 *@return  返回 <b>AgDoctorInfo.Visible</b>的值
			 */	 
		  @Formula("(SELECT a.visible FROM ag_doctor_info a WHERE a.doctor_id= doctor_id   )")
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
		  
		  
		  
///===============数据库表无关子段字段属性begin==========
			/**
			 *医生科室关系ID(addg_id):字段类型为String
			 */
		  private String addgId_str;  
			/**
			 *医生ID(doctor_id):字段类型为String
			 */
		  private String doctorId_str;  
			/**
			 *科室ID(department_id):字段类型为String
			 */
		  private String departmentId_str;  
			/**
			 *():字段类型为String
			 *ag_doctor_department_gx表里不用like作为条件的字符串
			 */
		  private String Tab_like;  
			/**
			 *():字段类型为String
			 *ag_doctor_department_gx表里order by 字符串
			 */
		  private String Tab_order;  
			/**
			 *设置addgId字段方法  
			 *@return  返回 <b>AgDoctorDepartmentGx.addgId</b>的值
			 */ 
			@Transient
			public String getAddgId_str(){
				return this.addgId_str;
			}
			/**
			  *设置 addg_id字段方法 
			  *@param att_addgId 输入<b>AgDoctorDepartmentGx.addgId</b>字段的值
			  */
			public void setAddgId_str(String att_addgId_str){
				this.addgId_str = att_addgId_str;
			}
			/**
			 *设置doctorId字段方法  
			 *@return  返回 <b>AgDoctorDepartmentGx.doctorId</b>的值
			 */ 
			@Transient
			public String getDoctorId_str(){
				return this.doctorId_str;
			}
			/**
			  *设置 doctor_id字段方法 
			  *@param att_doctorId 输入<b>AgDoctorDepartmentGx.doctorId</b>字段的值
			  */
			public void setDoctorId_str(String att_doctorId_str){
				this.doctorId_str = att_doctorId_str;
			}
			/**
			 *设置departmentId字段方法  
			 *@return  返回 <b>AgDoctorDepartmentGx.departmentId</b>的值
			 */ 
			@Transient
			public String getDepartmentId_str(){
				return this.departmentId_str;
			}
			/**
			  *设置 department_id字段方法 
			  *@param att_departmentId 输入<b>AgDoctorDepartmentGx.departmentId</b>字段的值
			  */
			public void setDepartmentId_str(String att_departmentId_str){
				this.departmentId_str = att_departmentId_str;
			}
			/**
			 *设置tab_like字段方法  
			 *@return  返回 <b>AgDoctorDepartmentGx.tab_like</b>的值
			 */ 
			@Transient
			public String getTab_like(){
				return this.Tab_like;
			}
			/**
			  *设置 字段方法 
			  *@param att_tab_like 输入<b>AgDoctorDepartmentGx.tab_like</b>字段的值
			  */
			public void setTab_like(String att_Tab_like){
				this.Tab_like = att_Tab_like;
			}
			/**
			 *设置tab_order字段方法  
			 *@return  返回 <b>AgDoctorDepartmentGx.tab_order</b>的值
			 */ 
			@Transient
			public String getTab_order(){
				return this.Tab_order;
			}
			/**
			  *设置 字段方法 
			  *@param att_tab_order 输入<b>AgDoctorDepartmentGx.tab_order</b>字段的值
			  */
			public void setTab_order(String att_Tab_order){
				this.Tab_order = att_Tab_order;
			}
///===============数据库表无关子段字段属性end==========
			private Integer id;
			@Transient
			public Integer getId() {
				return addgId;
			}

			public void setId(Integer id) {
				this.addgId=id;
			}
} 