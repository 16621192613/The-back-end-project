package com.hsk.angeldoctor.api.persistence;

import javax.persistence.*; 
import static javax.persistence.GenerationType.IDENTITY;
import java.util.Date;

/**
 * 根据ag_withdraw_maid_gx表结构自动生成持久化对象<B> com.hsk.angeldoctor.api.persistence.AgWithdrawMaidGx</B>
 *<hr/>
 *===============数据库表字段属性==========
 *  <table> 
 * <tr><th>字段名称:</th><td>提现分佣ID(awmgId)</td><th>字段类型:</th><td>Integer(主键)</td></tr> 
 * <tr><th>字段名称:</th><td>提现申请ID(awiId)</td><th>字段类型:</th><td>Integer(可以为空)</td></tr> 
 * <tr><th>字段名称:</th><td>分佣信息ID(amiId)</td><th>字段类型:</th><td>Integer(可以为空)</td></tr> 
 * </table>
 *===============无关字段属性===============
 *  <table> 
 * 	<tr><th>字段名称:</th><td>提现分佣ID(awmgId)	</td><th>属性名称:</th><td>awmgId</td></tr>
 * 	<tr><th>字段名称:</th><td>提现申请ID(awiId)	</td><th>属性名称:</th><td>awiId</td></tr>
 * 	<tr><th>字段名称:</th><td>分佣信息ID(amiId)	</td><th>属性名称:</th><td>amiId</td></tr>
 * 	<tr><th>字段名称:</th><td>(tab_like)	</td><th>属性名称:</th><td>tab_like</td></tr>
 * 	<tr><th>字段名称:</th><td>(tab_order)	</td><th>属性名称:</th><td>tab_order</td></tr>
 * </table>
 * <hr/>
 * @author  作者:admin  
 * @version  v1.0 创建时间: 2018-08-14 13:31:12
 */
 
 
@SuppressWarnings("serial")
@Entity
@Table(name = "ag_withdraw_maid_gx" )
public class AgWithdrawMaidGx {
///===============数据库表字段属性begin==========
			/**
			 *提现分佣ID(awmgId):字段类型为Integer  
			 */
 			private Integer awmgId; 
 	
			/**
			 *提现申请ID(awiId):字段类型为Integer  
			 */
 			private Integer awiId; 
 	
			/**
			 *分佣信息ID(amiId):字段类型为Integer  
			 */
 			private Integer amiId; 
 	
			/**
			 *设置提现分佣ID(awmg_id)字段方法 (该字段是主键)
			 *@return  返回 <b>AgWithdrawMaidGx.AwmgId</b>的值
			 */	 
			@Id
			@GeneratedValue(strategy = IDENTITY)
			@Column(name = "awmg_id")
			public Integer getAwmgId(){
			    return this.awmgId;
			}

		  /**
		   *设置 awmg_id字段方法 
		   *@param att_awmgId 输入<b>AgWithdrawMaidGx.awmgId</b>字段的值
		   */
		  public void setAwmgId(Integer att_awmgId){
		    this.awmgId = att_awmgId;
		  }
  
			/**
			 *设置提现申请ID(awi_id)字段方法 
			 *@return  返回 <b>AgWithdrawMaidGx.AwiId</b>的值
			 */	 
			@Column(name = "awi_id" ) 
			public Integer getAwiId(){
			    return this.awiId;
			}

		  /**
		   *设置 awi_id字段方法 
		   *@param att_awiId 输入<b>AgWithdrawMaidGx.awiId</b>字段的值
		   */
		  public void setAwiId(Integer att_awiId){
		    this.awiId = att_awiId;
		  }
  
			/**
			 *设置分佣信息ID(ami_id)字段方法 
			 *@return  返回 <b>AgWithdrawMaidGx.AmiId</b>的值
			 */	 
			@Column(name = "ami_id" ) 
			public Integer getAmiId(){
			    return this.amiId;
			}

		  /**
		   *设置 ami_id字段方法 
		   *@param att_amiId 输入<b>AgWithdrawMaidGx.amiId</b>字段的值
		   */
		  public void setAmiId(Integer att_amiId){
		    this.amiId = att_amiId;
		  }
  

///===============数据库表字段属性end==========

///===============数据库表无关子段字段属性begin==========
			/**
			 *提现分佣ID(awmg_id):字段类型为String
			 */
		  private String awmgId_str;  
			/**
			 *提现申请ID(awi_id):字段类型为String
			 */
		  private String awiId_str;  
			/**
			 *分佣信息ID(ami_id):字段类型为String
			 */
		  private String amiId_str;  
			/**
			 *():字段类型为String
			 *ag_withdraw_maid_gx表里不用like作为条件的字符串
			 */
		  private String Tab_like;  
			/**
			 *():字段类型为String
			 *ag_withdraw_maid_gx表里order by 字符串
			 */
		  private String Tab_order;  
			/**
			 *设置awmgId字段方法  
			 *@return  返回 <b>AgWithdrawMaidGx.awmgId</b>的值
			 */ 
			@Transient
			public String getAwmgId_str(){
				return this.awmgId_str;
			}
			/**
			  *设置 awmg_id字段方法 
			  *@param att_awmgId 输入<b>AgWithdrawMaidGx.awmgId</b>字段的值
			  */
			public void setAwmgId_str(String att_awmgId_str){
				this.awmgId_str = att_awmgId_str;
			}
			/**
			 *设置awiId字段方法  
			 *@return  返回 <b>AgWithdrawMaidGx.awiId</b>的值
			 */ 
			@Transient
			public String getAwiId_str(){
				return this.awiId_str;
			}
			/**
			  *设置 awi_id字段方法 
			  *@param att_awiId 输入<b>AgWithdrawMaidGx.awiId</b>字段的值
			  */
			public void setAwiId_str(String att_awiId_str){
				this.awiId_str = att_awiId_str;
			}
			/**
			 *设置amiId字段方法  
			 *@return  返回 <b>AgWithdrawMaidGx.amiId</b>的值
			 */ 
			@Transient
			public String getAmiId_str(){
				return this.amiId_str;
			}
			/**
			  *设置 ami_id字段方法 
			  *@param att_amiId 输入<b>AgWithdrawMaidGx.amiId</b>字段的值
			  */
			public void setAmiId_str(String att_amiId_str){
				this.amiId_str = att_amiId_str;
			}
			/**
			 *设置tab_like字段方法  
			 *@return  返回 <b>AgWithdrawMaidGx.tab_like</b>的值
			 */ 
			@Transient
			public String getTab_like(){
				return this.Tab_like;
			}
			/**
			  *设置 字段方法 
			  *@param att_tab_like 输入<b>AgWithdrawMaidGx.tab_like</b>字段的值
			  */
			public void setTab_like(String att_Tab_like){
				this.Tab_like = att_Tab_like;
			}
			/**
			 *设置tab_order字段方法  
			 *@return  返回 <b>AgWithdrawMaidGx.tab_order</b>的值
			 */ 
			@Transient
			public String getTab_order(){
				return this.Tab_order;
			}
			/**
			  *设置 字段方法 
			  *@param att_tab_order 输入<b>AgWithdrawMaidGx.tab_order</b>字段的值
			  */
			public void setTab_order(String att_Tab_order){
				this.Tab_order = att_Tab_order;
			}
///===============数据库表无关子段字段属性end==========
			
			private Integer id;
			@Transient
			public Integer getId() {
				return awmgId;
			}

			public void setId(Integer id) {
				this.awmgId=id;
			}
} 