package com.hsk.angeldoctor.api.persistence;

import javax.persistence.*; 
import static javax.persistence.GenerationType.IDENTITY;
import java.util.Date;

/**
 * 根据ag_integral_info表结构自动生成持久化对象<B> com.hsk.angeldoctor.api.persistence.AgIntegralInfo</B>
 *<hr/>
 *===============数据库表字段属性==========
 *  <table> 
 * <tr><th>字段名称:</th><td>积分记录ID(aiiId)</td><th>字段类型:</th><td>Integer(主键)</td></tr> 
 * <tr><th>字段名称:</th><td>用户ID(suiId)</td><th>字段类型:</th><td>Integer</td></tr> 
 * <tr><th>字段名称:</th><td>积分来源:1签到；2创建新的代约;3邀请新宣传员;4邀请的新用户注册(source)</td><th>字段类型:</th><td>String(可以为空)</td></tr> 
 * <tr><th>字段名称:</th><td>描述(comment)</td><th>字段类型:</th><td>String(可以为空)</td></tr> 
 * <tr><th>字段名称:</th><td>分数(count)</td><th>字段类型:</th><td>Integer(可以为空)</td></tr> 
 * <tr><th>字段名称:</th><td>状态:1正常，2禁用(status)</td><th>字段类型:</th><td>String(可以为空)</td></tr> 
 * <tr><th>字段名称:</th><td>创建时间(createDate)</td><th>字段类型:</th><td>Date(可以为空)</td></tr> 
 * <tr><th>字段名称:</th><td>用户类型:1业务员；2患者(userType)</td><th>字段类型:</th><td>String(可以为空)</td></tr> 
 * </table>
 *===============无关字段属性===============
 *  <table> 
 * 	<tr><th>字段名称:</th><td>积分记录ID(aiiId)	</td><th>属性名称:</th><td>aiiId</td></tr>
 * 	<tr><th>字段名称:</th><td>用户ID(suiId)	</td><th>属性名称:</th><td>suiId</td></tr>
 * 	<tr><th>字段名称:</th><td>分数(count)	</td><th>属性名称:</th><td>count</td></tr>
 * 	<tr><th>字段名称:</th><td>创建时间(createDate)	</td><th>属性名称:</th><td>createDate</td></tr>
 * 	<tr><th>字段名称:</th><td>创建时间(createDate)	</td><th>属性名称:</th><td>createDate</td></tr>
 * 	<tr><th>字段名称:</th><td>(tab_like)	</td><th>属性名称:</th><td>tab_like</td></tr>
 * 	<tr><th>字段名称:</th><td>(tab_order)	</td><th>属性名称:</th><td>tab_order</td></tr>
 * </table>
 * <hr/>
 * @author  作者:admin  
 * @version  v1.0 创建时间: 2018-08-14 13:41:32
 */
 
 
@SuppressWarnings("serial")
@Entity
@Table(name = "ag_integral_info" )
public class AgIntegralInfo {
///===============数据库表字段属性begin==========
			/**
			 *积分记录ID(aiiId):字段类型为Integer  
			 */
 			private Integer aiiId; 
 	
			/**
			 *用户ID(suiId):字段类型为Integer  
			 */
 			private Integer suiId; 
 	
			/**
			 *积分来源:1签到；2创建新的代约;3邀请新宣传员;4邀请的新用户注册(source):字段类型为String  
			 */
 			private String source; 
 	
			/**
			 *描述(comment):字段类型为String  
			 */
 			private String comment; 
 	
			/**
			 *分数(count):字段类型为Integer  
			 */
 			private Integer count; 
 	
			/**
			 *状态:1正常，2禁用(status):字段类型为String  
			 */
 			private String status; 
 	
			/**
			 *创建时间(createDate):字段类型为Date  
			 */
 			private Date createDate; 
 			/**
 			 * 用户类型(userType):1业务员；2患者
 			 */
 			private String userType;
 			/**
 			 * 业务ID
 			 */
 			private Integer appId;
 	
			/**
			 *设置积分记录ID(aii_id)字段方法 (该字段是主键)
			 *@return  返回 <b>AgIntegralInfo.AiiId</b>的值
			 */	 
			@Id
			@GeneratedValue(strategy = IDENTITY)
			@Column(name = "aii_id")
			public Integer getAiiId(){
			    return this.aiiId;
			}

		  /**
		   *设置 aii_id字段方法 
		   *@param att_aiiId 输入<b>AgIntegralInfo.aiiId</b>字段的值
		   */
		  public void setAiiId(Integer att_aiiId){
		    this.aiiId = att_aiiId;
		  }
  
			/**
			 *设置用户ID(sui_id)字段方法 
			 *@return  返回 <b>AgIntegralInfo.SuiId</b>的值
			 */	 
			@Column(name = "sui_id" ) 
			public Integer getSuiId(){
			    return this.suiId;
			}

		  /**
		   *设置 sui_id字段方法 
		   *@param att_suiId 输入<b>AgIntegralInfo.suiId</b>字段的值
		   */
		  public void setSuiId(Integer att_suiId){
		    this.suiId = att_suiId;
		  }
  
			/**
			 *设置积分来源:1签到；2创建新的代约;3邀请新宣传员;4邀请的新用户注册(source)字段方法 
			 *@return  返回 <b>AgIntegralInfo.Source</b>的值
			 */	 
			@Column(name = "source" ) 
			public String getSource(){
			    return this.source;
			}

		  /**
		   *设置 source字段方法 
		   *@param att_source 输入<b>AgIntegralInfo.source</b>字段的值
		   */
		  public void setSource(String att_source){
		    this.source = att_source;
		  }
  
			/**
			 *设置描述(comment)字段方法 
			 *@return  返回 <b>AgIntegralInfo.Comment</b>的值
			 */	 
			@Column(name = "comment" ) 
			public String getComment(){
			    return this.comment;
			}

		  /**
		   *设置 comment字段方法 
		   *@param att_comment 输入<b>AgIntegralInfo.comment</b>字段的值
		   */
		  public void setComment(String att_comment){
		    this.comment = att_comment;
		  }
  
			/**
			 *设置分数(count)字段方法 
			 *@return  返回 <b>AgIntegralInfo.Count</b>的值
			 */	 
			@Column(name = "count" ) 
			public Integer getCount(){
			    return this.count;
			}

		  /**
		   *设置 count字段方法 
		   *@param att_count 输入<b>AgIntegralInfo.count</b>字段的值
		   */
		  public void setCount(Integer att_count){
		    this.count = att_count;
		  }
		  
		  
		  @Column(name = "user_type" ) 
			public String getUserType() {
			return userType;
		}

		public void setUserType(String userType) {
			this.userType = userType;
		}

			/**
			 *设置状态:1正常，2禁用(status)字段方法 
			 *@return  返回 <b>AgIntegralInfo.Status</b>的值
			 */	 
			@Column(name = "status" ) 
			public String getStatus(){
			    return this.status;
			}

		  /**
		   *设置 status字段方法 
		   *@param att_status 输入<b>AgIntegralInfo.status</b>字段的值
		   */
		  public void setStatus(String att_status){
		    this.status = att_status;
		  }
  
			/**
			 *设置创建时间(create_date)字段方法 
			 *@return  返回 <b>AgIntegralInfo.CreateDate</b>的值
			 */	 
			@Temporal(TemporalType.TIMESTAMP)
			@Column(name = "create_date" ) 
			public Date getCreateDate(){
			    return this.createDate;
			}

		  /**
		   *设置 create_date字段方法 
		   *@param att_createDate 输入<b>AgIntegralInfo.createDate</b>字段的值
		   */
		  public void setCreateDate(Date att_createDate){
		    this.createDate = att_createDate;
		  }
		  @Column(name = "app_id" ) 
		  public Integer getAppId() {
				return appId;
			}

			public void setAppId(Integer appId) {
				this.appId = appId;
			}
  

///===============数据库表字段属性end==========

			///===============数据库表无关子段字段属性begin==========
			/**
			 *积分记录ID(aii_id):字段类型为String
			 */
		  private String aiiId_str;  
			/**
			 *用户ID(sui_id):字段类型为String
			 */
		  private String suiId_str;  
			/**
			 *分数(count):字段类型为String
			 */
		  private String count_str;  
			/**
			 *创建时间(create_date):字段类型为Date
			 */
		  private Date createDate_start;  
			/**
			 *创建时间(create_date):字段类型为Date
			 */
		  private Date createDate_end;  
			/**
			 *():字段类型为String
			 *ag_integral_info表里不用like作为条件的字符串
			 */
		  private String Tab_like;  
			/**
			 *():字段类型为String
			 *ag_integral_info表里order by 字符串
			 */
		  private String Tab_order;  
			/**
			 *设置aiiId字段方法  
			 *@return  返回 <b>AgIntegralInfo.aiiId</b>的值
			 */ 
			@Transient
			public String getAiiId_str(){
				return this.aiiId_str;
			}
			/**
			  *设置 aii_id字段方法 
			  *@param att_aiiId 输入<b>AgIntegralInfo.aiiId</b>字段的值
			  */
			public void setAiiId_str(String att_aiiId_str){
				this.aiiId_str = att_aiiId_str;
			}
			/**
			 *设置suiId字段方法  
			 *@return  返回 <b>AgIntegralInfo.suiId</b>的值
			 */ 
			@Transient
			public String getSuiId_str(){
				return this.suiId_str;
			}
			/**
			  *设置 sui_id字段方法 
			  *@param att_suiId 输入<b>AgIntegralInfo.suiId</b>字段的值
			  */
			public void setSuiId_str(String att_suiId_str){
				this.suiId_str = att_suiId_str;
			}
			/**
			 *设置count字段方法  
			 *@return  返回 <b>AgIntegralInfo.count</b>的值
			 */ 
			@Transient
			public String getCount_str(){
				return this.count_str;
			}
			/**
			  *设置 count字段方法 
			  *@param att_count 输入<b>AgIntegralInfo.count</b>字段的值
			  */
			public void setCount_str(String att_count_str){
				this.count_str = att_count_str;
			}
			/**
			 *设置createDate字段方法  
			 *@return  返回 <b>AgIntegralInfo.createDate</b>的值
			 */ 
			@Transient
			public Date getCreateDate_start(){
				return this.createDate_start;
			}
			/**
			  *设置 create_date字段方法 
			  *@param att_createDate 输入<b>AgIntegralInfo.createDate</b>字段的值
			  */
			public void setCreateDate_start(Date att_createDate_start){
				this.createDate_start = att_createDate_start;
			}
			/**
			 *设置createDate字段方法  
			 *@return  返回 <b>AgIntegralInfo.createDate</b>的值
			 */ 
			@Transient
			public Date getCreateDate_end(){
				return this.createDate_end;
			}
			/**
			  *设置 create_date字段方法 
			  *@param att_createDate 输入<b>AgIntegralInfo.createDate</b>字段的值
			  */
			public void setCreateDate_end(Date att_createDate_end){
				this.createDate_end = att_createDate_end;
			}
			/**
			 *设置tab_like字段方法  
			 *@return  返回 <b>AgIntegralInfo.tab_like</b>的值
			 */ 
			@Transient
			public String getTab_like(){
				return this.Tab_like;
			}
			/**
			  *设置 字段方法 
			  *@param att_tab_like 输入<b>AgIntegralInfo.tab_like</b>字段的值
			  */
			public void setTab_like(String att_Tab_like){
				this.Tab_like = att_Tab_like;
			}
			/**
			 *设置tab_order字段方法  
			 *@return  返回 <b>AgIntegralInfo.tab_order</b>的值
			 */ 
			@Transient
			public String getTab_order(){
				return this.Tab_order;
			}
			/**
			  *设置 字段方法 
			  *@param att_tab_order 输入<b>AgIntegralInfo.tab_order</b>字段的值
			  */
			public void setTab_order(String att_Tab_order){
				this.Tab_order = att_Tab_order;
			}
///===============数据库表无关子段字段属性end==========
			
			private Integer id;
			@Transient
			public Integer getId() {
				return aiiId;
			}

			public void setId(Integer id) {
				this.aiiId=id;
			}
} 