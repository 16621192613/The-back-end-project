package com.hsk.angeldoctor.api.persistence;

import javax.persistence.*;

import org.hibernate.annotations.Formula;

import static javax.persistence.GenerationType.IDENTITY;
import java.util.Date;

/**
 * 根据ag_wechat_info表结构自动生成持久化对象<B> com.hsk.angeldoctor.api.persistence.AgWechatInfo</B>
 *<hr/>
 *===============数据库表字段属性==========
 *  <table> 
 * <tr><th>字段名称:</th><td>微信ID(wechatUserId)</td><th>字段类型:</th><td>Integer(主键)</td></tr> 
 * <tr><th>字段名称:</th><td>微信openId(openId)</td><th>字段类型:</th><td>String</td></tr> 
 * <tr><th>字段名称:</th><td>业务员ID(sceneId)</td><th>字段类型:</th><td>Integer(可以为空)</td></tr> 
 * <tr><th>字段名称:</th><td>微信昵称(wechatName)</td><th>字段类型:</th><td>String(可以为空)</td></tr> 
 * <tr><th>字段名称:</th><td>头像(avatar)</td><th>字段类型:</th><td>String(可以为空)</td></tr> 
 * <tr><th>字段名称:</th><td>头像mediaId(avatarMediaId)</td><th>字段类型:</th><td>String(可以为空)</td></tr> 
 * <tr><th>字段名称:</th><td>状态:0正常(status)</td><th>字段类型:</th><td>String(可以为空)</td></tr> 
 * <tr><th>字段名称:</th><td>创建时间(createDate)</td><th>字段类型:</th><td>Date(可以为空)</td></tr> 
 * </table>
 *===============无关字段属性===============
 *  <table> 
 * 	<tr><th>字段名称:</th><td>微信ID(wechatUserId)	</td><th>属性名称:</th><td>wechatUserId</td></tr>
 * 	<tr><th>字段名称:</th><td>业务员ID(sceneId)	</td><th>属性名称:</th><td>sceneId</td></tr>
 * 	<tr><th>字段名称:</th><td>创建时间(createDate)	</td><th>属性名称:</th><td>createDate</td></tr>
 * 	<tr><th>字段名称:</th><td>创建时间(createDate)	</td><th>属性名称:</th><td>createDate</td></tr>
 * 	<tr><th>字段名称:</th><td>(tab_like)	</td><th>属性名称:</th><td>tab_like</td></tr>
 * 	<tr><th>字段名称:</th><td>(tab_order)	</td><th>属性名称:</th><td>tab_order</td></tr>
 * </table>
 * <hr/>
 * @author  作者:admin  
 * @version  v1.0 创建时间: 2018-08-14 13:35:37
 */
 
 
@SuppressWarnings("serial")
@Entity
@Table(name = "ag_wechat_info" )
public class AgWechatInfo {
///===============数据库表字段属性begin==========
			/**
			 *微信ID(wechatUserId):字段类型为Integer  
			 */
 			private Integer wechatUserId; 
 	
			/**
			 *微信openId(openId):字段类型为String  
			 */
 			private String openId; 
 	
			/**
			 *业务员ID(sceneId):字段类型为Integer  
			 */
 			private Integer sceneId; 
 	
			/**
			 *微信昵称(wechatName):字段类型为String  
			 */
 			private String wechatName; 
 	
			/**
			 *头像(avatar):字段类型为String  
			 */
 			private String avatar; 
 	
			/**
			 *头像mediaId(avatarMediaId):字段类型为String  
			 */
 			private String avatarMediaId; 
 	
			/**
			 *状态:0正常(status):字段类型为String  
			 */
 			private String status; 
 	
			/**
			 *创建时间(createDate):字段类型为Date  
			 */
 			private Date createDate; 
 	
			/**
			 *设置微信ID(wechat_user_id)字段方法 (该字段是主键)
			 *@return  返回 <b>AgWechatInfo.WechatUserId</b>的值
			 */	 
			@Id
			@GeneratedValue(strategy = IDENTITY)
			@Column(name = "wechat_user_id")
			public Integer getWechatUserId(){
			    return this.wechatUserId;
			}

		  /**
		   *设置 wechat_user_id字段方法 
		   *@param att_wechatUserId 输入<b>AgWechatInfo.wechatUserId</b>字段的值
		   */
		  public void setWechatUserId(Integer att_wechatUserId){
		    this.wechatUserId = att_wechatUserId;
		  }
  
			/**
			 *设置微信openId(open_id)字段方法 
			 *@return  返回 <b>AgWechatInfo.OpenId</b>的值
			 */	 
			@Column(name = "open_id" ) 
			public String getOpenId(){
			    return this.openId;
			}

		  /**
		   *设置 open_id字段方法 
		   *@param att_openId 输入<b>AgWechatInfo.openId</b>字段的值
		   */
		  public void setOpenId(String att_openId){
		    this.openId = att_openId;
		  }
  
			/**
			 *设置业务员ID(scene_id)字段方法 
			 *@return  返回 <b>AgWechatInfo.SceneId</b>的值
			 */	 
			@Column(name = "scene_id" ) 
			public Integer getSceneId(){
			    return this.sceneId;
			}

		  /**
		   *设置 scene_id字段方法 
		   *@param att_sceneId 输入<b>AgWechatInfo.sceneId</b>字段的值
		   */
		  public void setSceneId(Integer att_sceneId){
		    this.sceneId = att_sceneId;
		  }
  
			/**
			 *设置微信昵称(wechat_name)字段方法 
			 *@return  返回 <b>AgWechatInfo.WechatName</b>的值
			 */	 
			@Column(name = "wechat_name" ) 
			public String getWechatName(){
			    return this.wechatName;
			}

		  /**
		   *设置 wechat_name字段方法 
		   *@param att_wechatName 输入<b>AgWechatInfo.wechatName</b>字段的值
		   */
		  public void setWechatName(String att_wechatName){
		    this.wechatName = att_wechatName;
		  }
  
			/**
			 *设置头像(avatar)字段方法 
			 *@return  返回 <b>AgWechatInfo.Avatar</b>的值
			 */	 
			@Column(name = "avatar" ) 
			public String getAvatar(){
			    return this.avatar;
			}

		  /**
		   *设置 avatar字段方法 
		   *@param att_avatar 输入<b>AgWechatInfo.avatar</b>字段的值
		   */
		  public void setAvatar(String att_avatar){
		    this.avatar = att_avatar;
		  }
  
			/**
			 *设置头像mediaId(avatar_media_id)字段方法 
			 *@return  返回 <b>AgWechatInfo.AvatarMediaId</b>的值
			 */	 
			@Column(name = "avatar_media_id" ) 
			public String getAvatarMediaId(){
			    return this.avatarMediaId;
			}

		  /**
		   *设置 avatar_media_id字段方法 
		   *@param att_avatarMediaId 输入<b>AgWechatInfo.avatarMediaId</b>字段的值
		   */
		  public void setAvatarMediaId(String att_avatarMediaId){
		    this.avatarMediaId = att_avatarMediaId;
		  }
  
			/**
			 *设置状态:0正常(status)字段方法 
			 *@return  返回 <b>AgWechatInfo.Status</b>的值
			 */	 
			@Column(name = "status" ) 
			public String getStatus(){
			    return this.status;
			}

		  /**
		   *设置 status字段方法 
		   *@param att_status 输入<b>AgWechatInfo.status</b>字段的值
		   */
		  public void setStatus(String att_status){
		    this.status = att_status;
		  }
  
			/**
			 *设置创建时间(create_date)字段方法 
			 *@return  返回 <b>AgWechatInfo.CreateDate</b>的值
			 */	 
			@Temporal(TemporalType.TIMESTAMP)
			@Column(name = "create_date" ) 
			public Date getCreateDate(){
			    return this.createDate;
			}

		  /**
		   *设置 create_date字段方法 
		   *@param att_createDate 输入<b>AgWechatInfo.createDate</b>字段的值
		   */
		  public void setCreateDate(Date att_createDate){
		    this.createDate = att_createDate;
		  }
  

///===============数据库表字段属性end==========

///===============数据库表无关子段字段属性begin==========
			/**
			 *微信ID(wechat_user_id):字段类型为String
			 */
		  private String wechatUserId_str;  
			/**
			 *业务员ID(scene_id):字段类型为String
			 */
		  private String sceneId_str;  
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
			 *ag_wechat_info表里不用like作为条件的字符串
			 */
		  private String Tab_like;  
			/**
			 *():字段类型为String
			 *ag_wechat_info表里order by 字符串
			 */
		  private String Tab_order;  
			/**
			 *设置wechatUserId字段方法  
			 *@return  返回 <b>AgWechatInfo.wechatUserId</b>的值
			 */ 
			@Transient
			public String getWechatUserId_str(){
				return this.wechatUserId_str;
			}
			/**
			  *设置 wechat_user_id字段方法 
			  *@param att_wechatUserId 输入<b>AgWechatInfo.wechatUserId</b>字段的值
			  */
			public void setWechatUserId_str(String att_wechatUserId_str){
				this.wechatUserId_str = att_wechatUserId_str;
			}
			/**
			 *设置sceneId字段方法  
			 *@return  返回 <b>AgWechatInfo.sceneId</b>的值
			 */ 
			@Transient
			public String getSceneId_str(){
				return this.sceneId_str;
			}
			/**
			  *设置 scene_id字段方法 
			  *@param att_sceneId 输入<b>AgWechatInfo.sceneId</b>字段的值
			  */
			public void setSceneId_str(String att_sceneId_str){
				this.sceneId_str = att_sceneId_str;
			}
			/**
			 *设置createDate字段方法  
			 *@return  返回 <b>AgWechatInfo.createDate</b>的值
			 */ 
			@Transient
			public Date getCreateDate_start(){
				return this.createDate_start;
			}
			/**
			  *设置 create_date字段方法 
			  *@param att_createDate 输入<b>AgWechatInfo.createDate</b>字段的值
			  */
			public void setCreateDate_start(Date att_createDate_start){
				this.createDate_start = att_createDate_start;
			}
			/**
			 *设置createDate字段方法  
			 *@return  返回 <b>AgWechatInfo.createDate</b>的值
			 */ 
			@Transient
			public Date getCreateDate_end(){
				return this.createDate_end;
			}
			/**
			  *设置 create_date字段方法 
			  *@param att_createDate 输入<b>AgWechatInfo.createDate</b>字段的值
			  */
			public void setCreateDate_end(Date att_createDate_end){
				this.createDate_end = att_createDate_end;
			}
			/**
			 *设置tab_like字段方法  
			 *@return  返回 <b>AgWechatInfo.tab_like</b>的值
			 */ 
			@Transient
			public String getTab_like(){
				return this.Tab_like;
			}
			/**
			  *设置 字段方法 
			  *@param att_tab_like 输入<b>AgWechatInfo.tab_like</b>字段的值
			  */
			public void setTab_like(String att_Tab_like){
				this.Tab_like = att_Tab_like;
			}
			/**
			 *设置tab_order字段方法  
			 *@return  返回 <b>AgWechatInfo.tab_order</b>的值
			 */ 
			@Transient
			public String getTab_order(){
				return this.Tab_order;
			}
			/**
			  *设置 字段方法 
			  *@param att_tab_order 输入<b>AgWechatInfo.tab_order</b>字段的值
			  */
			public void setTab_order(String att_Tab_order){
				this.Tab_order = att_Tab_order;
			}
///===============数据库表无关子段字段属性end==========
			
			private Integer id;
			private Integer patientId;//患者ID
			
			@Formula("(SELECT a.patient_id FROM ag_patient_info a WHERE a.wechat_user_id=wechat_user_id)")
			public Integer getPatientId() {
				return patientId;
			}

			public void setPatientId(Integer patientId) {
				this.patientId = patientId;
			}

			@Transient
			public Integer getId() {
				return wechatUserId;
			}

			public void setId(Integer id) {
				this.wechatUserId=id;
			}
} 