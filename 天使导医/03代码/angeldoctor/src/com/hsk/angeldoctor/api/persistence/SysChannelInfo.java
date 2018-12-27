package com.hsk.angeldoctor.api.persistence;

import javax.persistence.*; 
import static javax.persistence.GenerationType.IDENTITY;
import java.util.Date;

/**
 * 根据sys_channel_info表结构自动生成持久化对象<B> com.hsk.angeldoctor.api.persistence.SysChannelInfo</B>
 *<hr/>
 *===============数据库表字段属性==========
 *  <table> 
 * <tr><th>字段名称:</th><td>频道ID(menuId)</td><th>字段类型:</th><td>Integer(主键)</td></tr> 
 * <tr><th>字段名称:</th><td>频道名称(name)</td><th>字段类型:</th><td>String(可以为空)</td></tr> 
 * <tr><th>字段名称:</th><td>频道顺序(orderNum)</td><th>字段类型:</th><td>Integer(可以为空)</td></tr> 
 * </table>
 *===============无关字段属性===============
 *  <table> 
 * 	<tr><th>字段名称:</th><td>频道ID(menuId)	</td><th>属性名称:</th><td>menuId</td></tr>
 * 	<tr><th>字段名称:</th><td>频道顺序(orderNum)	</td><th>属性名称:</th><td>orderNum</td></tr>
 * 	<tr><th>字段名称:</th><td>(tab_like)	</td><th>属性名称:</th><td>tab_like</td></tr>
 * 	<tr><th>字段名称:</th><td>(tab_order)	</td><th>属性名称:</th><td>tab_order</td></tr>
 * </table>
 * <hr/>
 * @author  作者:admin  
 * @version  v1.0 创建时间: 2018-08-14 13:40:22
 */
 
 
@SuppressWarnings("serial")
@Entity
@Table(name = "sys_channel_info" )
public class SysChannelInfo {
///===============数据库表字段属性begin==========
			/**
			 *频道ID(menuId):字段类型为Integer  
			 */
 			private Integer menuId; 
 	
			/**
			 *频道名称(name):字段类型为String  
			 */
 			private String name; 
 	
			/**
			 *频道顺序(orderNum):字段类型为Integer  
			 */
 			private Integer orderNum; 
 	
			/**
			 *设置频道ID(menu_id)字段方法 (该字段是主键)
			 *@return  返回 <b>SysChannelInfo.MenuId</b>的值
			 */	 
			@Id
			@GeneratedValue(strategy = IDENTITY)
			@Column(name = "menu_id")
			public Integer getMenuId(){
			    return this.menuId;
			}

		  /**
		   *设置 menu_id字段方法 
		   *@param att_menuId 输入<b>SysChannelInfo.menuId</b>字段的值
		   */
		  public void setMenuId(Integer att_menuId){
		    this.menuId = att_menuId;
		  }
  
			/**
			 *设置频道名称(name)字段方法 
			 *@return  返回 <b>SysChannelInfo.Name</b>的值
			 */	 
			@Column(name = "name" ) 
			public String getName(){
			    return this.name;
			}

		  /**
		   *设置 name字段方法 
		   *@param att_name 输入<b>SysChannelInfo.name</b>字段的值
		   */
		  public void setName(String att_name){
		    this.name = att_name;
		  }
  
			/**
			 *设置频道顺序(order_num)字段方法 
			 *@return  返回 <b>SysChannelInfo.OrderNum</b>的值
			 */	 
			@Column(name = "order_num" ) 
			public Integer getOrderNum(){
			    return this.orderNum;
			}

		  /**
		   *设置 order_num字段方法 
		   *@param att_orderNum 输入<b>SysChannelInfo.orderNum</b>字段的值
		   */
		  public void setOrderNum(Integer att_orderNum){
		    this.orderNum = att_orderNum;
		  }
  

///===============数据库表字段属性end==========

///===============数据库表无关子段字段属性begin==========
			/**
			 *频道ID(menu_id):字段类型为String
			 */
		  private String menuId_str;  
			/**
			 *频道顺序(order_num):字段类型为String
			 */
		  private String orderNum_str;  
			/**
			 *():字段类型为String
			 *sys_channel_info表里不用like作为条件的字符串
			 */
		  private String Tab_like;  
			/**
			 *():字段类型为String
			 *sys_channel_info表里order by 字符串
			 */
		  private String Tab_order;  
			/**
			 *设置menuId字段方法  
			 *@return  返回 <b>SysChannelInfo.menuId</b>的值
			 */ 
			@Transient
			public String getMenuId_str(){
				return this.menuId_str;
			}
			/**
			  *设置 menu_id字段方法 
			  *@param att_menuId 输入<b>SysChannelInfo.menuId</b>字段的值
			  */
			public void setMenuId_str(String att_menuId_str){
				this.menuId_str = att_menuId_str;
			}
			/**
			 *设置orderNum字段方法  
			 *@return  返回 <b>SysChannelInfo.orderNum</b>的值
			 */ 
			@Transient
			public String getOrderNum_str(){
				return this.orderNum_str;
			}
			/**
			  *设置 order_num字段方法 
			  *@param att_orderNum 输入<b>SysChannelInfo.orderNum</b>字段的值
			  */
			public void setOrderNum_str(String att_orderNum_str){
				this.orderNum_str = att_orderNum_str;
			}
			/**
			 *设置tab_like字段方法  
			 *@return  返回 <b>SysChannelInfo.tab_like</b>的值
			 */ 
			@Transient
			public String getTab_like(){
				return this.Tab_like;
			}
			/**
			  *设置 字段方法 
			  *@param att_tab_like 输入<b>SysChannelInfo.tab_like</b>字段的值
			  */
			public void setTab_like(String att_Tab_like){
				this.Tab_like = att_Tab_like;
			}
			/**
			 *设置tab_order字段方法  
			 *@return  返回 <b>SysChannelInfo.tab_order</b>的值
			 */ 
			@Transient
			public String getTab_order(){
				return this.Tab_order;
			}
			/**
			  *设置 字段方法 
			  *@param att_tab_order 输入<b>SysChannelInfo.tab_order</b>字段的值
			  */
			public void setTab_order(String att_Tab_order){
				this.Tab_order = att_Tab_order;
			}
///===============数据库表无关子段字段属性end==========
			
			private Integer id;
			@Transient
			public Integer getId() {
				return menuId;
			}

			public void setId(Integer id) {
				this.menuId=id;
			}
} 