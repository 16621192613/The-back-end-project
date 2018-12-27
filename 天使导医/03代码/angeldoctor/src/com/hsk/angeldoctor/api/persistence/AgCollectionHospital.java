package com.hsk.angeldoctor.api.persistence;

import javax.persistence.*; 
import static javax.persistence.GenerationType.IDENTITY;
import java.util.Date;

/**
 * 根据ag_collection_hospital表结构自动生成持久化对象<B> com.hsk.angeldoctor.api.persistence.AgCollectionHospital</B>
 *<hr/>
 *===============数据库表字段属性==========
 *  <table> 
 * <tr><th>字段名称:</th><td>医院收藏ID(mchId)</td><th>字段类型:</th><td>Integer(主键)</td></tr> 
 * <tr><th>字段名称:</th><td>医院ID(organizationId)</td><th>字段类型:</th><td>Integer(可以为空)</td></tr> 
 * <tr><th>字段名称:</th><td>用户账号ID(suiId)</td><th>字段类型:</th><td>Integer(可以为空)</td></tr> 
 * </table>
 *===============无关字段属性===============
 *  <table> 
 * 	<tr><th>字段名称:</th><td>医院收藏ID(mchId)	</td><th>属性名称:</th><td>mchId</td></tr>
 * 	<tr><th>字段名称:</th><td>医院ID(organizationId)	</td><th>属性名称:</th><td>organizationId</td></tr>
 * 	<tr><th>字段名称:</th><td>用户账号ID(suiId)	</td><th>属性名称:</th><td>suiId</td></tr>
 * 	<tr><th>字段名称:</th><td>(tab_like)	</td><th>属性名称:</th><td>tab_like</td></tr>
 * 	<tr><th>字段名称:</th><td>(tab_order)	</td><th>属性名称:</th><td>tab_order</td></tr>
 * </table>
 * <hr/>
 * @author  作者:admin  
 * @version  v1.0 创建时间: 2018-08-14 13:27:59
 */
 
 
@SuppressWarnings("serial")
@Entity
@Table(name = "ag_collection_hospital" )
public class AgCollectionHospital {
///===============数据库表字段属性begin==========
			/**
			 *医院收藏ID(mchId):字段类型为Integer  
			 */
 			private Integer mchId; 
 	
			/**
			 *医院ID(organizationId):字段类型为Integer  
			 */
 			private Integer organizationId; 
 	
			/**
			 *用户账号ID(suiId):字段类型为Integer  
			 */
 			private Integer suiId; 
 	
			/**
			 *设置医院收藏ID(mch_id)字段方法 (该字段是主键)
			 *@return  返回 <b>AgCollectionHospital.MchId</b>的值
			 */	 
			@Id
			@GeneratedValue(strategy = IDENTITY)
			@Column(name = "mch_id")
			public Integer getMchId(){
			    return this.mchId;
			}

		  /**
		   *设置 mch_id字段方法 
		   *@param att_mchId 输入<b>AgCollectionHospital.mchId</b>字段的值
		   */
		  public void setMchId(Integer att_mchId){
		    this.mchId = att_mchId;
		  }
  
			/**
			 *设置医院ID(organization_id)字段方法 
			 *@return  返回 <b>AgCollectionHospital.OrganizationId</b>的值
			 */	 
			@Column(name = "organization_id" ) 
			public Integer getOrganizationId(){
			    return this.organizationId;
			}

		  /**
		   *设置 organization_id字段方法 
		   *@param att_organizationId 输入<b>AgCollectionHospital.organizationId</b>字段的值
		   */
		  public void setOrganizationId(Integer att_organizationId){
		    this.organizationId = att_organizationId;
		  }
  
			/**
			 *设置用户账号ID(sui_id)字段方法 
			 *@return  返回 <b>AgCollectionHospital.SuiId</b>的值
			 */	 
			@Column(name = "sui_id" ) 
			public Integer getSuiId(){
			    return this.suiId;
			}

		  /**
		   *设置 sui_id字段方法 
		   *@param att_suiId 输入<b>AgCollectionHospital.suiId</b>字段的值
		   */
		  public void setSuiId(Integer att_suiId){
		    this.suiId = att_suiId;
		  }
  

///===============数据库表字段属性end==========

///===============数据库表无关子段字段属性begin==========
			/**
			 *医院收藏ID(mch_id):字段类型为String
			 */
		  private String mchId_str;  
			/**
			 *医院ID(organization_id):字段类型为String
			 */
		  private String organizationId_str;  
			/**
			 *用户账号ID(sui_id):字段类型为String
			 */
		  private String suiId_str;  
			/**
			 *():字段类型为String
			 *ag_collection_hospital表里不用like作为条件的字符串
			 */
		  private String Tab_like;  
			/**
			 *():字段类型为String
			 *ag_collection_hospital表里order by 字符串
			 */
		  private String Tab_order;  
			/**
			 *设置mchId字段方法  
			 *@return  返回 <b>AgCollectionHospital.mchId</b>的值
			 */ 
			@Transient
			public String getMchId_str(){
				return this.mchId_str;
			}
			/**
			  *设置 mch_id字段方法 
			  *@param att_mchId 输入<b>AgCollectionHospital.mchId</b>字段的值
			  */
			public void setMchId_str(String att_mchId_str){
				this.mchId_str = att_mchId_str;
			}
			/**
			 *设置organizationId字段方法  
			 *@return  返回 <b>AgCollectionHospital.organizationId</b>的值
			 */ 
			@Transient
			public String getOrganizationId_str(){
				return this.organizationId_str;
			}
			/**
			  *设置 organization_id字段方法 
			  *@param att_organizationId 输入<b>AgCollectionHospital.organizationId</b>字段的值
			  */
			public void setOrganizationId_str(String att_organizationId_str){
				this.organizationId_str = att_organizationId_str;
			}
			/**
			 *设置suiId字段方法  
			 *@return  返回 <b>AgCollectionHospital.suiId</b>的值
			 */ 
			@Transient
			public String getSuiId_str(){
				return this.suiId_str;
			}
			/**
			  *设置 sui_id字段方法 
			  *@param att_suiId 输入<b>AgCollectionHospital.suiId</b>字段的值
			  */
			public void setSuiId_str(String att_suiId_str){
				this.suiId_str = att_suiId_str;
			}
			/**
			 *设置tab_like字段方法  
			 *@return  返回 <b>AgCollectionHospital.tab_like</b>的值
			 */ 
			@Transient
			public String getTab_like(){
				return this.Tab_like;
			}
			/**
			  *设置 字段方法 
			  *@param att_tab_like 输入<b>AgCollectionHospital.tab_like</b>字段的值
			  */
			public void setTab_like(String att_Tab_like){
				this.Tab_like = att_Tab_like;
			}
			/**
			 *设置tab_order字段方法  
			 *@return  返回 <b>AgCollectionHospital.tab_order</b>的值
			 */ 
			@Transient
			public String getTab_order(){
				return this.Tab_order;
			}
			/**
			  *设置 字段方法 
			  *@param att_tab_order 输入<b>AgCollectionHospital.tab_order</b>字段的值
			  */
			public void setTab_order(String att_Tab_order){
				this.Tab_order = att_Tab_order;
			}
///===============数据库表无关子段字段属性end==========
			private Integer id;
			@Transient
			public Integer getId() {
				return mchId;
			}

			public void setId(Integer id) {
				this.mchId=id;
			}
} 