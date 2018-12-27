package com.hsk.angeldoctor.api.persistence;

import javax.persistence.*; 
import static javax.persistence.GenerationType.IDENTITY;
import java.util.Date;

/**
 * 根据sys_role_channel_gx表结构自动生成持久化对象<B> com.hsk.angeldoctor.api.persistence.SysRoleChannelGx</B>
 *<hr/>
 *===============数据库表字段属性==========
 *  <table> 
 * <tr><th>字段名称:</th><td>角色频道关系ID(srcgId)</td><th>字段类型:</th><td>Integer(主键)</td></tr> 
 * <tr><th>字段名称:</th><td>频道ID(menuId)</td><th>字段类型:</th><td>Integer(可以为空)</td></tr> 
 * <tr><th>字段名称:</th><td>角色id(sroleId)</td><th>字段类型:</th><td>Integer(可以为空)</td></tr> 
 * </table>
 *===============无关字段属性===============
 *  <table> 
 * 	<tr><th>字段名称:</th><td>角色频道关系ID(srcgId)	</td><th>属性名称:</th><td>srcgId</td></tr>
 * 	<tr><th>字段名称:</th><td>频道ID(menuId)	</td><th>属性名称:</th><td>menuId</td></tr>
 * 	<tr><th>字段名称:</th><td>角色id(sroleId)	</td><th>属性名称:</th><td>sroleId</td></tr>
 * 	<tr><th>字段名称:</th><td>(tab_like)	</td><th>属性名称:</th><td>tab_like</td></tr>
 * 	<tr><th>字段名称:</th><td>(tab_order)	</td><th>属性名称:</th><td>tab_order</td></tr>
 * </table>
 * <hr/>
 * @author  作者:admin  
 * @version  v1.0 创建时间: 2018-08-14 13:40:22
 */
 
 
@SuppressWarnings("serial")
@Entity
@Table(name = "sys_role_channel_gx" )
public class SysRoleChannelGx {
///===============数据库表字段属性begin==========
			/**
			 *角色频道关系ID(srcgId):字段类型为Integer  
			 */
 			private Integer srcgId; 
 	
			/**
			 *频道ID(menuId):字段类型为Integer  
			 */
 			private Integer menuId; 
 	
			/**
			 *角色id(sroleId):字段类型为Integer  
			 */
 			private Integer sroleId; 
 	
			/**
			 *设置角色频道关系ID(srcg_id)字段方法 (该字段是主键)
			 *@return  返回 <b>SysRoleChannelGx.SrcgId</b>的值
			 */	 
			@Id
			@GeneratedValue(strategy = IDENTITY)
			@Column(name = "srcg_id")
			public Integer getSrcgId(){
			    return this.srcgId;
			}

		  /**
		   *设置 srcg_id字段方法 
		   *@param att_srcgId 输入<b>SysRoleChannelGx.srcgId</b>字段的值
		   */
		  public void setSrcgId(Integer att_srcgId){
		    this.srcgId = att_srcgId;
		  }
  
			/**
			 *设置频道ID(menu_id)字段方法 
			 *@return  返回 <b>SysRoleChannelGx.MenuId</b>的值
			 */	 
			@Column(name = "menu_id" ) 
			public Integer getMenuId(){
			    return this.menuId;
			}

		  /**
		   *设置 menu_id字段方法 
		   *@param att_menuId 输入<b>SysRoleChannelGx.menuId</b>字段的值
		   */
		  public void setMenuId(Integer att_menuId){
		    this.menuId = att_menuId;
		  }
  
			/**
			 *设置角色id(srole_id)字段方法 
			 *@return  返回 <b>SysRoleChannelGx.SroleId</b>的值
			 */	 
			@Column(name = "srole_id" ) 
			public Integer getSroleId(){
			    return this.sroleId;
			}

		  /**
		   *设置 srole_id字段方法 
		   *@param att_sroleId 输入<b>SysRoleChannelGx.sroleId</b>字段的值
		   */
		  public void setSroleId(Integer att_sroleId){
		    this.sroleId = att_sroleId;
		  }
  

///===============数据库表字段属性end==========

///===============数据库表无关子段字段属性begin==========
			/**
			 *角色频道关系ID(srcg_id):字段类型为String
			 */
		  private String srcgId_str;  
			/**
			 *频道ID(menu_id):字段类型为String
			 */
		  private String menuId_str;  
			/**
			 *角色id(srole_id):字段类型为String
			 */
		  private String sroleId_str;  
			/**
			 *():字段类型为String
			 *sys_role_channel_gx表里不用like作为条件的字符串
			 */
		  private String Tab_like;  
			/**
			 *():字段类型为String
			 *sys_role_channel_gx表里order by 字符串
			 */
		  private String Tab_order;  
			/**
			 *设置srcgId字段方法  
			 *@return  返回 <b>SysRoleChannelGx.srcgId</b>的值
			 */ 
			@Transient
			public String getSrcgId_str(){
				return this.srcgId_str;
			}
			/**
			  *设置 srcg_id字段方法 
			  *@param att_srcgId 输入<b>SysRoleChannelGx.srcgId</b>字段的值
			  */
			public void setSrcgId_str(String att_srcgId_str){
				this.srcgId_str = att_srcgId_str;
			}
			/**
			 *设置menuId字段方法  
			 *@return  返回 <b>SysRoleChannelGx.menuId</b>的值
			 */ 
			@Transient
			public String getMenuId_str(){
				return this.menuId_str;
			}
			/**
			  *设置 menu_id字段方法 
			  *@param att_menuId 输入<b>SysRoleChannelGx.menuId</b>字段的值
			  */
			public void setMenuId_str(String att_menuId_str){
				this.menuId_str = att_menuId_str;
			}
			/**
			 *设置sroleId字段方法  
			 *@return  返回 <b>SysRoleChannelGx.sroleId</b>的值
			 */ 
			@Transient
			public String getSroleId_str(){
				return this.sroleId_str;
			}
			/**
			  *设置 srole_id字段方法 
			  *@param att_sroleId 输入<b>SysRoleChannelGx.sroleId</b>字段的值
			  */
			public void setSroleId_str(String att_sroleId_str){
				this.sroleId_str = att_sroleId_str;
			}
			/**
			 *设置tab_like字段方法  
			 *@return  返回 <b>SysRoleChannelGx.tab_like</b>的值
			 */ 
			@Transient
			public String getTab_like(){
				return this.Tab_like;
			}
			/**
			  *设置 字段方法 
			  *@param att_tab_like 输入<b>SysRoleChannelGx.tab_like</b>字段的值
			  */
			public void setTab_like(String att_Tab_like){
				this.Tab_like = att_Tab_like;
			}
			/**
			 *设置tab_order字段方法  
			 *@return  返回 <b>SysRoleChannelGx.tab_order</b>的值
			 */ 
			@Transient
			public String getTab_order(){
				return this.Tab_order;
			}
			/**
			  *设置 字段方法 
			  *@param att_tab_order 输入<b>SysRoleChannelGx.tab_order</b>字段的值
			  */
			public void setTab_order(String att_Tab_order){
				this.Tab_order = att_Tab_order;
			}
///===============数据库表无关子段字段属性end==========
			
			private Integer id;
			@Transient
			public Integer getId() {
				return srcgId;
			}

			public void setId(Integer id) {
				this.srcgId=id;
			}
} 