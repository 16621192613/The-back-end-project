package com.hsk.angeldoctor.api.persistence;

import javax.persistence.*; 
import static javax.persistence.GenerationType.IDENTITY;
import java.util.Date;

/**
 * 根据ag_job_menu_gx表结构自动生成持久化对象<B> com.hsk.angeldoctor.api.persistence.AgJobMenuGx</B>
 *<hr/>
 *===============数据库表字段属性==========
 *  <table> 
 * <tr><th>字段名称:</th><td>岗位菜单关系ID(ajmgId)</td><th>字段类型:</th><td>Integer(主键)</td></tr> 
 * <tr><th>字段名称:</th><td>医院菜单ID(menuId)</td><th>字段类型:</th><td>Integer(可以为空)</td></tr> 
 * <tr><th>字段名称:</th><td>岗位ID(jobId)</td><th>字段类型:</th><td>Integer(可以为空)</td></tr> 
 * </table>
 *===============无关字段属性===============
 *  <table> 
 * 	<tr><th>字段名称:</th><td>岗位菜单关系ID(ajmgId)	</td><th>属性名称:</th><td>ajmgId</td></tr>
 * 	<tr><th>字段名称:</th><td>医院菜单ID(menuId)	</td><th>属性名称:</th><td>menuId</td></tr>
 * 	<tr><th>字段名称:</th><td>岗位ID(jobId)	</td><th>属性名称:</th><td>jobId</td></tr>
 * 	<tr><th>字段名称:</th><td>(tab_like)	</td><th>属性名称:</th><td>tab_like</td></tr>
 * 	<tr><th>字段名称:</th><td>(tab_order)	</td><th>属性名称:</th><td>tab_order</td></tr>
 * </table>
 * <hr/>
 * @author  作者:admin  
 * @version  v1.0 创建时间: 2018-08-14 13:28:01
 */
 
 
@SuppressWarnings("serial")
@Entity
@Table(name = "ag_job_menu_gx" )
public class AgJobMenuGx {
///===============数据库表字段属性begin==========
			/**
			 *岗位菜单关系ID(ajmgId):字段类型为Integer  
			 */
 			private Integer ajmgId; 
 	
			/**
			 *医院菜单ID(menuId):字段类型为Integer  
			 */
 			private Integer menuId; 
 	
			/**
			 *岗位ID(jobId):字段类型为Integer  
			 */
 			private Integer jobId; 
 	
			/**
			 *设置岗位菜单关系ID(ajmg_id)字段方法 (该字段是主键)
			 *@return  返回 <b>AgJobMenuGx.AjmgId</b>的值
			 */	 
			@Id
			@GeneratedValue(strategy = IDENTITY)
			@Column(name = "ajmg_id")
			public Integer getAjmgId(){
			    return this.ajmgId;
			}

		  /**
		   *设置 ajmg_id字段方法 
		   *@param att_ajmgId 输入<b>AgJobMenuGx.ajmgId</b>字段的值
		   */
		  public void setAjmgId(Integer att_ajmgId){
		    this.ajmgId = att_ajmgId;
		  }
  
			/**
			 *设置医院菜单ID(menu_Id)字段方法 
			 *@return  返回 <b>AgJobMenuGx.MenuId</b>的值
			 */	 
			@Column(name = "menu_Id" ) 
			public Integer getMenuId(){
			    return this.menuId;
			}

		  /**
		   *设置 menu_Id字段方法 
		   *@param att_menuId 输入<b>AgJobMenuGx.menuId</b>字段的值
		   */
		  public void setMenuId(Integer att_menuId){
		    this.menuId = att_menuId;
		  }
  
			/**
			 *设置岗位ID(job_id)字段方法 
			 *@return  返回 <b>AgJobMenuGx.JobId</b>的值
			 */	 
			@Column(name = "job_id" ) 
			public Integer getJobId(){
			    return this.jobId;
			}

		  /**
		   *设置 job_id字段方法 
		   *@param att_jobId 输入<b>AgJobMenuGx.jobId</b>字段的值
		   */
		  public void setJobId(Integer att_jobId){
		    this.jobId = att_jobId;
		  }
  

///===============数据库表字段属性end==========

///===============数据库表无关子段字段属性begin==========
			/**
			 *岗位菜单关系ID(ajmg_id):字段类型为String
			 */
		  private String ajmgId_str;  
			/**
			 *医院菜单ID(menu_Id):字段类型为String
			 */
		  private String menuId_str;  
			/**
			 *岗位ID(job_id):字段类型为String
			 */
		  private String jobId_str;  
			/**
			 *():字段类型为String
			 *ag_job_menu_gx表里不用like作为条件的字符串
			 */
		  private String Tab_like;  
			/**
			 *():字段类型为String
			 *ag_job_menu_gx表里order by 字符串
			 */
		  private String Tab_order;  
			/**
			 *设置ajmgId字段方法  
			 *@return  返回 <b>AgJobMenuGx.ajmgId</b>的值
			 */ 
			@Transient
			public String getAjmgId_str(){
				return this.ajmgId_str;
			}
			/**
			  *设置 ajmg_id字段方法 
			  *@param att_ajmgId 输入<b>AgJobMenuGx.ajmgId</b>字段的值
			  */
			public void setAjmgId_str(String att_ajmgId_str){
				this.ajmgId_str = att_ajmgId_str;
			}
			/**
			 *设置menuId字段方法  
			 *@return  返回 <b>AgJobMenuGx.menuId</b>的值
			 */ 
			@Transient
			public String getMenuId_str(){
				return this.menuId_str;
			}
			/**
			  *设置 menu_Id字段方法 
			  *@param att_menuId 输入<b>AgJobMenuGx.menuId</b>字段的值
			  */
			public void setMenuId_str(String att_menuId_str){
				this.menuId_str = att_menuId_str;
			}
			/**
			 *设置jobId字段方法  
			 *@return  返回 <b>AgJobMenuGx.jobId</b>的值
			 */ 
			@Transient
			public String getJobId_str(){
				return this.jobId_str;
			}
			/**
			  *设置 job_id字段方法 
			  *@param att_jobId 输入<b>AgJobMenuGx.jobId</b>字段的值
			  */
			public void setJobId_str(String att_jobId_str){
				this.jobId_str = att_jobId_str;
			}
			/**
			 *设置tab_like字段方法  
			 *@return  返回 <b>AgJobMenuGx.tab_like</b>的值
			 */ 
			@Transient
			public String getTab_like(){
				return this.Tab_like;
			}
			/**
			  *设置 字段方法 
			  *@param att_tab_like 输入<b>AgJobMenuGx.tab_like</b>字段的值
			  */
			public void setTab_like(String att_Tab_like){
				this.Tab_like = att_Tab_like;
			}
			/**
			 *设置tab_order字段方法  
			 *@return  返回 <b>AgJobMenuGx.tab_order</b>的值
			 */ 
			@Transient
			public String getTab_order(){
				return this.Tab_order;
			}
			/**
			  *设置 字段方法 
			  *@param att_tab_order 输入<b>AgJobMenuGx.tab_order</b>字段的值
			  */
			public void setTab_order(String att_Tab_order){
				this.Tab_order = att_Tab_order;
			}
///===============数据库表无关子段字段属性end==========
			
			private Integer id;
			@Transient
			public Integer getId() {
				return ajmgId;
			}

			public void setId(Integer id) {
				this.ajmgId=id;
			}
} 