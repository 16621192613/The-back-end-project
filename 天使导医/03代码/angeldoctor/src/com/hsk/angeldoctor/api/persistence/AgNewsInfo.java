package com.hsk.angeldoctor.api.persistence;

import javax.persistence.*;

import org.hibernate.annotations.Formula;

import static javax.persistence.GenerationType.IDENTITY;
import java.util.Date;

/**
 * 根据ag_news_info表结构自动生成持久化对象<B> com.hsk.angeldoctor.api.persistence.AgNewsInfo</B>
 *<hr/>
 *===============数据库表字段属性==========
 *  <table> 
 * <tr><th>字段名称:</th><td>消息ID(aniId)</td><th>字段类型:</th><td>Integer(主键)</td></tr> 
 * <tr><th>字段名称:</th><td>标题(title)</td><th>字段类型:</th><td>String(可以为空)</td></tr> 
 * <tr><th>字段名称:</th><td>内容(body)</td><th>字段类型:</th><td>String(可以为空)</td></tr> 
 * <tr><th>字段名称:</th><td>状态:1正常，2禁用(status)</td><th>字段类型:</th><td>String(可以为空)</td></tr> 
 * <tr><th>字段名称:</th><td>创建时间(createDate)</td><th>字段类型:</th><td>Date(可以为空)</td></tr> 
 * <tr><th>字段名称:</th><td>创建人ID(portalUserId)</td><th>字段类型:</th><td>Integer(可以为空)</td></tr> 
 * </table>
 *===============无关字段属性===============
 *  <table> 
 * 	<tr><th>字段名称:</th><td>消息ID(aniId)	</td><th>属性名称:</th><td>aniId</td></tr>
 * 	<tr><th>字段名称:</th><td>创建时间(createDate)	</td><th>属性名称:</th><td>createDate</td></tr>
 * 	<tr><th>字段名称:</th><td>创建时间(createDate)	</td><th>属性名称:</th><td>createDate</td></tr>
 * 	<tr><th>字段名称:</th><td>创建人ID(portalUserId)	</td><th>属性名称:</th><td>portalUserId</td></tr>
 * 	<tr><th>字段名称:</th><td>(tab_like)	</td><th>属性名称:</th><td>tab_like</td></tr>
 * 	<tr><th>字段名称:</th><td>(tab_order)	</td><th>属性名称:</th><td>tab_order</td></tr>
 * </table>
 * <hr/>
 * @author  作者:admin  
 * @version  v1.0 创建时间: 2018-08-14 13:40:21
 */
 
 
@SuppressWarnings("serial")
@Entity
@Table(name = "ag_news_info" )
public class AgNewsInfo {
///===============数据库表字段属性begin==========
			/**
			 *消息ID(aniId):字段类型为Integer  
			 */
 			private Integer aniId; 
 	
			/**
			 *标题(title):字段类型为String  
			 */
 			private String title; 
 	
			/**
			 *内容(body):字段类型为String  
			 */
 			private String body; 
 	
			/**
			 *状态:1正常，2禁用(status):字段类型为String  
			 */
 			private String status; 
 	
			/**
			 *创建时间(createDate):字段类型为Date  
			 */
 			private Date createDate; 
 	
			/**
			 *创建人ID(portalUserId):字段类型为Integer  
			 */
 			private Integer portalUserId; 
 	
			/**
			 *设置消息ID(ani_id)字段方法 (该字段是主键)
			 *@return  返回 <b>AgNewsInfo.AniId</b>的值
			 */	 
			@Id
			@GeneratedValue(strategy = IDENTITY)
			@Column(name = "ani_id")
			public Integer getAniId(){
			    return this.aniId;
			}

		  /**
		   *设置 ani_id字段方法 
		   *@param att_aniId 输入<b>AgNewsInfo.aniId</b>字段的值
		   */
		  public void setAniId(Integer att_aniId){
		    this.aniId = att_aniId;
		  }
  
			/**
			 *设置标题(title)字段方法 
			 *@return  返回 <b>AgNewsInfo.Title</b>的值
			 */	 
			@Column(name = "title" ) 
			public String getTitle(){
			    return this.title;
			}

		  /**
		   *设置 title字段方法 
		   *@param att_title 输入<b>AgNewsInfo.title</b>字段的值
		   */
		  public void setTitle(String att_title){
		    this.title = att_title;
		  }
  
			/**
			 *设置内容(body)字段方法 
			 *@return  返回 <b>AgNewsInfo.Body</b>的值
			 */	 
			@Column(name = "body" ) 
			public String getBody(){
			    return this.body;
			}

		  /**
		   *设置 body字段方法 
		   *@param att_body 输入<b>AgNewsInfo.body</b>字段的值
		   */
		  public void setBody(String att_body){
		    this.body = att_body;
		  }
  
			/**
			 *设置状态:1正常，2禁用(status)字段方法 
			 *@return  返回 <b>AgNewsInfo.Status</b>的值
			 */	 
			@Column(name = "status" ) 
			public String getStatus(){
			    return this.status;
			}

		  /**
		   *设置 status字段方法 
		   *@param att_status 输入<b>AgNewsInfo.status</b>字段的值
		   */
		  public void setStatus(String att_status){
		    this.status = att_status;
		  }
  
			/**
			 *设置创建时间(create_date)字段方法 
			 *@return  返回 <b>AgNewsInfo.CreateDate</b>的值
			 */	 
			@Temporal(TemporalType.TIMESTAMP)
			@Column(name = "create_date" ) 
			public Date getCreateDate(){
			    return this.createDate;
			}

		  /**
		   *设置 create_date字段方法 
		   *@param att_createDate 输入<b>AgNewsInfo.createDate</b>字段的值
		   */
		  public void setCreateDate(Date att_createDate){
		    this.createDate = att_createDate;
		  }
  
			/**
			 *设置创建人ID(portal_user_id)字段方法 
			 *@return  返回 <b>AgNewsInfo.PortalUserId</b>的值
			 */	 
			@Column(name = "portal_user_id" ) 
			public Integer getPortalUserId(){
			    return this.portalUserId;
			}

		  /**
		   *设置 portal_user_id字段方法 
		   *@param att_portalUserId 输入<b>AgNewsInfo.portalUserId</b>字段的值
		   */
		  public void setPortalUserId(Integer att_portalUserId){
		    this.portalUserId = att_portalUserId;
		  }
  

///===============数据库表字段属性end==========

///===============数据库表无关子段字段属性begin==========
			/**
			 *消息ID(ani_id):字段类型为String
			 */
		  private String aniId_str;  
			/**
			 *创建时间(create_date):字段类型为Date
			 */
		  private Date createDate_start;  
			/**
			 *创建时间(create_date):字段类型为Date
			 */
		  private Date createDate_end;  
			/**
			 *创建人ID(portal_user_id):字段类型为String
			 */
		  private String portalUserId_str;  
			/**
			 *():字段类型为String
			 *ag_news_info表里不用like作为条件的字符串
			 */
		  private String Tab_like;  
			/**
			 *():字段类型为String
			 *ag_news_info表里order by 字符串
			 */
		  private String Tab_order;  
			/**
			 *设置aniId字段方法  
			 *@return  返回 <b>AgNewsInfo.aniId</b>的值
			 */ 
			@Transient
			public String getAniId_str(){
				return this.aniId_str;
			}
			/**
			  *设置 ani_id字段方法 
			  *@param att_aniId 输入<b>AgNewsInfo.aniId</b>字段的值
			  */
			public void setAniId_str(String att_aniId_str){
				this.aniId_str = att_aniId_str;
			}
			/**
			 *设置createDate字段方法  
			 *@return  返回 <b>AgNewsInfo.createDate</b>的值
			 */ 
			@Transient
			public Date getCreateDate_start(){
				return this.createDate_start;
			}
			/**
			  *设置 create_date字段方法 
			  *@param att_createDate 输入<b>AgNewsInfo.createDate</b>字段的值
			  */
			public void setCreateDate_start(Date att_createDate_start){
				this.createDate_start = att_createDate_start;
			}
			/**
			 *设置createDate字段方法  
			 *@return  返回 <b>AgNewsInfo.createDate</b>的值
			 */ 
			@Transient
			public Date getCreateDate_end(){
				return this.createDate_end;
			}
			/**
			  *设置 create_date字段方法 
			  *@param att_createDate 输入<b>AgNewsInfo.createDate</b>字段的值
			  */
			public void setCreateDate_end(Date att_createDate_end){
				this.createDate_end = att_createDate_end;
			}
			/**
			 *设置portalUserId字段方法  
			 *@return  返回 <b>AgNewsInfo.portalUserId</b>的值
			 */ 
			@Transient
			public String getPortalUserId_str(){
				return this.portalUserId_str;
			}
			/**
			  *设置 portal_user_id字段方法 
			  *@param att_portalUserId 输入<b>AgNewsInfo.portalUserId</b>字段的值
			  */
			public void setPortalUserId_str(String att_portalUserId_str){
				this.portalUserId_str = att_portalUserId_str;
			}
			/**
			 *设置tab_like字段方法  
			 *@return  返回 <b>AgNewsInfo.tab_like</b>的值
			 */ 
			@Transient
			public String getTab_like(){
				return this.Tab_like;
			}
			/**
			  *设置 字段方法 
			  *@param att_tab_like 输入<b>AgNewsInfo.tab_like</b>字段的值
			  */
			public void setTab_like(String att_Tab_like){
				this.Tab_like = att_Tab_like;
			}
			/**
			 *设置tab_order字段方法  
			 *@return  返回 <b>AgNewsInfo.tab_order</b>的值
			 */ 
			@Transient
			public String getTab_order(){
				return this.Tab_order;
			}
			/**
			  *设置 字段方法 
			  *@param att_tab_order 输入<b>AgNewsInfo.tab_order</b>字段的值
			  */
			public void setTab_order(String att_Tab_order){
				this.Tab_order = att_Tab_order;
			}
///===============数据库表无关子段字段属性end==========
			private Integer id;
			private String portalUserName;
			private String portalRoleName;
			
			@Formula("(SELECT a.user_name FROM sys_user_info a WHERE a.sui_id= portal_user_id)")
			public String getPortalUserName() {
				return portalUserName;
			}

			public void setPortalUserName(String portalUserName) {
				this.portalUserName = portalUserName;
			}
			@Formula("(SELECT b.menu_name FROM sys_user_info a,sys_role_info b WHERE a.sui_id= portal_user_id and a.user_role=b.srole_id)")
			public String getPortalRoleName() {
				return portalRoleName;
			}

			public void setPortalRoleName(String portalRoleName) {
				this.portalRoleName = portalRoleName;
			}

			@Transient
			public Integer getId() {
				return aniId;
			}

			public void setId(Integer id) {
				this.aniId=id;
			}
} 