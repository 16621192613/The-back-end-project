package com.hsk.angeldoctor.api.persistence;

import javax.persistence.*; 
import static javax.persistence.GenerationType.IDENTITY;
import java.util.Date;

/**
 * 根据ag_goods_info表结构自动生成持久化对象<B> com.hsk.angeldoctor.api.persistence.AgGoodsInfo</B>
 *<hr/>
 *===============数据库表字段属性==========
 *  <table> 
 * <tr><th>字段名称:</th><td>积分商品ID(goodsId)</td><th>字段类型:</th><td>Integer(主键)</td></tr> 
 * <tr><th>字段名称:</th><td>商品名称(name)</td><th>字段类型:</th><td>String(可以为空)</td></tr> 
 * <tr><th>字段名称:</th><td>积分单价(accumulatePointValue)</td><th>字段类型:</th><td>Integer(可以为空)</td></tr> 
 * <tr><th>字段名称:</th><td>实际价格(actualValue)</td><th>字段类型:</th><td>Double(可以为空)</td></tr> 
 * <tr><th>字段名称:</th><td>商品图片(icon)</td><th>字段类型:</th><td>String(可以为空)</td></tr> 
 * <tr><th>字段名称:</th><td>(supplierName)</td><th>字段类型:</th><td>String(可以为空)</td></tr> 
 * <tr><th>字段名称:</th><td>供应商联系方式(supplierMobile)</td><th>字段类型:</th><td>String(可以为空)</td></tr> 
 * <tr><th>字段名称:</th><td>商品类型：0:实物类;1:电子类(type)</td><th>字段类型:</th><td>String(可以为空)</td></tr> 
 * <tr><th>字段名称:</th><td>状态:1正常，2禁用(status)</td><th>字段类型:</th><td>String(可以为空)</td></tr> 
 * <tr><th>字段名称:</th><td>创建人(creatorname)</td><th>字段类型:</th><td>String(可以为空)</td></tr> 
 * <tr><th>字段名称:</th><td>创建时间(createDate)</td><th>字段类型:</th><td>Date(可以为空)</td></tr> 
 * <tr><th>字段名称:</th><td>创建人ID(creatorid)</td><th>字段类型:</th><td>Integer(可以为空)</td></tr> 
 * </table>
 *===============无关字段属性===============
 *  <table> 
 * 	<tr><th>字段名称:</th><td>积分商品ID(goodsId)	</td><th>属性名称:</th><td>goodsId</td></tr>
 * 	<tr><th>字段名称:</th><td>积分单价(accumulatePointValue)	</td><th>属性名称:</th><td>accumulatePointValue</td></tr>
 * 	<tr><th>字段名称:</th><td>创建时间(createDate)	</td><th>属性名称:</th><td>createDate</td></tr>
 * 	<tr><th>字段名称:</th><td>创建时间(createDate)	</td><th>属性名称:</th><td>createDate</td></tr>
 * 	<tr><th>字段名称:</th><td>创建人ID(creatorid)	</td><th>属性名称:</th><td>creatorid</td></tr>
 * 	<tr><th>字段名称:</th><td>(tab_like)	</td><th>属性名称:</th><td>tab_like</td></tr>
 * 	<tr><th>字段名称:</th><td>(tab_order)	</td><th>属性名称:</th><td>tab_order</td></tr>
 * </table>
 * <hr/>
 * @author  作者:admin  
 * @version  v1.0 创建时间: 2018-08-14 13:41:32
 */
 
 
@SuppressWarnings("serial")
@Entity
@Table(name = "ag_goods_info" )
public class AgGoodsInfo {
///===============数据库表字段属性begin==========
			/**
			 *积分商品ID(goodsId):字段类型为Integer  
			 */
 			private Integer goodsId; 
 	
			/**
			 *商品名称(name):字段类型为String  
			 */
 			private String name; 
 	
			/**
			 *积分单价(accumulatePointValue):字段类型为Integer  
			 */
 			private Integer accumulatePointValue; 
 	
			/**
			 *实际价格(actualValue):字段类型为Double  
			 */
 			private Double actualValue; 
 	
			/**
			 *商品图片(icon):字段类型为String  
			 */
 			private String icon; 
 	
			/**
			 *(supplierName):字段类型为String  
			 */
 			private String supplierName; 
 	
			/**
			 *供应商联系方式(supplierMobile):字段类型为String  
			 */
 			private String supplierMobile; 
 			
 			private String description;
 	
			/**
			 *商品类型：0:实物类;1:电子类(type):字段类型为String  
			 */
 			private String type; 
 	
			/**
			 *状态:1正常，2禁用(status):字段类型为String  
			 */
 			private String status; 
 	
			/**
			 *创建人(creatorname):字段类型为String  
			 */
 			private String creatorname; 
 	
			/**
			 *创建时间(createDate):字段类型为Date  
			 */
 			private Date createDate; 
 	
			/**
			 *创建人ID(creatorid):字段类型为Integer  
			 */
 			private Integer creatorid; 
 	
			/**
			 *设置积分商品ID(goods_id)字段方法 (该字段是主键)
			 *@return  返回 <b>AgGoodsInfo.GoodsId</b>的值
			 */	 
			@Id
			@GeneratedValue(strategy = IDENTITY)
			@Column(name = "goods_id")
			public Integer getGoodsId(){
			    return this.goodsId;
			}

		  /**
		   *设置 goods_id字段方法 
		   *@param att_goodsId 输入<b>AgGoodsInfo.goodsId</b>字段的值
		   */
		  public void setGoodsId(Integer att_goodsId){
		    this.goodsId = att_goodsId;
		  }
  
			/**
			 *设置商品名称(name)字段方法 
			 *@return  返回 <b>AgGoodsInfo.Name</b>的值
			 */	 
			@Column(name = "name" ) 
			public String getName(){
			    return this.name;
			}

		  /**
		   *设置 name字段方法 
		   *@param att_name 输入<b>AgGoodsInfo.name</b>字段的值
		   */
		  public void setName(String att_name){
		    this.name = att_name;
		  }
  
			/**
			 *设置积分单价(accumulate_point_value)字段方法 
			 *@return  返回 <b>AgGoodsInfo.AccumulatePointValue</b>的值
			 */	 
			@Column(name = "accumulate_point_value" ) 
			public Integer getAccumulatePointValue(){
			    return this.accumulatePointValue;
			}

		  /**
		   *设置 accumulate_point_value字段方法 
		   *@param att_accumulatePointValue 输入<b>AgGoodsInfo.accumulatePointValue</b>字段的值
		   */
		  public void setAccumulatePointValue(Integer att_accumulatePointValue){
		    this.accumulatePointValue = att_accumulatePointValue;
		  }
  
			/**
			 *设置实际价格(actual_value)字段方法 
			 *@return  返回 <b>AgGoodsInfo.ActualValue</b>的值
			 */	 
			@Column(name = "actual_value" ) 
			public Double getActualValue(){
			    return this.actualValue;
			}

		  /**
		   *设置 actual_value字段方法 
		   *@param att_actualValue 输入<b>AgGoodsInfo.actualValue</b>字段的值
		   */
		  public void setActualValue(Double att_actualValue){
		    this.actualValue = att_actualValue;
		  }
  
			/**
			 *设置商品图片(icon)字段方法 
			 *@return  返回 <b>AgGoodsInfo.Icon</b>的值
			 */	 
			@Column(name = "icon" ) 
			public String getIcon(){
			    return this.icon;
			}

		  /**
		   *设置 icon字段方法 
		   *@param att_icon 输入<b>AgGoodsInfo.icon</b>字段的值
		   */
		  public void setIcon(String att_icon){
		    this.icon = att_icon;
		  }
  
			/**
			 *设置(supplier_name)字段方法 
			 *@return  返回 <b>AgGoodsInfo.SupplierName</b>的值
			 */	 
			@Column(name = "supplier_name" ) 
			public String getSupplierName(){
			    return this.supplierName;
			}

		  /**
		   *设置 supplier_name字段方法 
		   *@param att_supplierName 输入<b>AgGoodsInfo.supplierName</b>字段的值
		   */
		  public void setSupplierName(String att_supplierName){
		    this.supplierName = att_supplierName;
		  }
  
			/**
			 *设置供应商联系方式(supplier_mobile)字段方法 
			 *@return  返回 <b>AgGoodsInfo.SupplierMobile</b>的值
			 */	 
			@Column(name = "supplier_mobile" ) 
			public String getSupplierMobile(){
			    return this.supplierMobile;
			}

		  /**
		   *设置 supplier_mobile字段方法 
		   *@param att_supplierMobile 输入<b>AgGoodsInfo.supplierMobile</b>字段的值
		   */
		  public void setSupplierMobile(String att_supplierMobile){
		    this.supplierMobile = att_supplierMobile;
		  }
  
			/**
			 *设置商品类型：0:实物类;1:电子类(type)字段方法 
			 *@return  返回 <b>AgGoodsInfo.Type</b>的值
			 */	 
			@Column(name = "type" ) 
			public String getType(){
			    return this.type;
			}

		  /**
		   *设置 type字段方法 
		   *@param att_type 输入<b>AgGoodsInfo.type</b>字段的值
		   */
		  public void setType(String att_type){
		    this.type = att_type;
		  }
  
			/**
			 *设置状态:1正常，2禁用(status)字段方法 
			 *@return  返回 <b>AgGoodsInfo.Status</b>的值
			 */	 
			@Column(name = "status" ) 
			public String getStatus(){
			    return this.status;
			}

		  /**
		   *设置 status字段方法 
		   *@param att_status 输入<b>AgGoodsInfo.status</b>字段的值
		   */
		  public void setStatus(String att_status){
		    this.status = att_status;
		  }
  
			/**
			 *设置创建人(creatorName)字段方法 
			 *@return  返回 <b>AgGoodsInfo.Creatorname</b>的值
			 */	 
			@Column(name = "creatorName" ) 
			public String getCreatorname(){
			    return this.creatorname;
			}

		  /**
		   *设置 creatorName字段方法 
		   *@param att_creatorname 输入<b>AgGoodsInfo.creatorname</b>字段的值
		   */
		  public void setCreatorname(String att_creatorname){
		    this.creatorname = att_creatorname;
		  }
  
			/**
			 *设置创建时间(create_date)字段方法 
			 *@return  返回 <b>AgGoodsInfo.CreateDate</b>的值
			 */	 
			@Temporal(TemporalType.TIMESTAMP)
			@Column(name = "create_date" ) 
			public Date getCreateDate(){
			    return this.createDate;
			}

		  /**
		   *设置 create_date字段方法 
		   *@param att_createDate 输入<b>AgGoodsInfo.createDate</b>字段的值
		   */
		  public void setCreateDate(Date att_createDate){
		    this.createDate = att_createDate;
		  }
  
			/**
			 *设置创建人ID(creatorId)字段方法 
			 *@return  返回 <b>AgGoodsInfo.Creatorid</b>的值
			 */	 
			@Column(name = "creatorId" ) 
			public Integer getCreatorid(){
			    return this.creatorid;
			}

		  /**
		   *设置 creatorId字段方法 
		   *@param att_creatorid 输入<b>AgGoodsInfo.creatorid</b>字段的值
		   */
		  public void setCreatorid(Integer att_creatorid){
		    this.creatorid = att_creatorid;
		  }
		  @Column(name = "description" ) 
		  public String getDescription() {
				return description;
			}

			public void setDescription(String description) {
				this.description = description;
			}
  

///===============数据库表字段属性end==========

		 




			///===============数据库表无关子段字段属性begin==========
			/**
			 *积分商品ID(goods_id):字段类型为String
			 */
		  private String goodsId_str;  
			/**
			 *积分单价(accumulate_point_value):字段类型为String
			 */
		  private String accumulatePointValue_str;  
			/**
			 *创建时间(create_date):字段类型为Date
			 */
		  private Date createDate_start;  
			/**
			 *创建时间(create_date):字段类型为Date
			 */
		  private Date createDate_end;  
			/**
			 *创建人ID(creatorId):字段类型为String
			 */
		  private String creatorid_str;  
			/**
			 *():字段类型为String
			 *ag_goods_info表里不用like作为条件的字符串
			 */
		  private String Tab_like;  
			/**
			 *():字段类型为String
			 *ag_goods_info表里order by 字符串
			 */
		  private String Tab_order;  
			/**
			 *设置goodsId字段方法  
			 *@return  返回 <b>AgGoodsInfo.goodsId</b>的值
			 */ 
			@Transient
			public String getGoodsId_str(){
				return this.goodsId_str;
			}
			/**
			  *设置 goods_id字段方法 
			  *@param att_goodsId 输入<b>AgGoodsInfo.goodsId</b>字段的值
			  */
			public void setGoodsId_str(String att_goodsId_str){
				this.goodsId_str = att_goodsId_str;
			}
			/**
			 *设置accumulatePointValue字段方法  
			 *@return  返回 <b>AgGoodsInfo.accumulatePointValue</b>的值
			 */ 
			@Transient
			public String getAccumulatePointValue_str(){
				return this.accumulatePointValue_str;
			}
			/**
			  *设置 accumulate_point_value字段方法 
			  *@param att_accumulatePointValue 输入<b>AgGoodsInfo.accumulatePointValue</b>字段的值
			  */
			public void setAccumulatePointValue_str(String att_accumulatePointValue_str){
				this.accumulatePointValue_str = att_accumulatePointValue_str;
			}
			/**
			 *设置createDate字段方法  
			 *@return  返回 <b>AgGoodsInfo.createDate</b>的值
			 */ 
			@Transient
			public Date getCreateDate_start(){
				return this.createDate_start;
			}
			/**
			  *设置 create_date字段方法 
			  *@param att_createDate 输入<b>AgGoodsInfo.createDate</b>字段的值
			  */
			public void setCreateDate_start(Date att_createDate_start){
				this.createDate_start = att_createDate_start;
			}
			/**
			 *设置createDate字段方法  
			 *@return  返回 <b>AgGoodsInfo.createDate</b>的值
			 */ 
			@Transient
			public Date getCreateDate_end(){
				return this.createDate_end;
			}
			/**
			  *设置 create_date字段方法 
			  *@param att_createDate 输入<b>AgGoodsInfo.createDate</b>字段的值
			  */
			public void setCreateDate_end(Date att_createDate_end){
				this.createDate_end = att_createDate_end;
			}
			/**
			 *设置creatorid字段方法  
			 *@return  返回 <b>AgGoodsInfo.creatorid</b>的值
			 */ 
			@Transient
			public String getCreatorid_str(){
				return this.creatorid_str;
			}
			/**
			  *设置 creatorId字段方法 
			  *@param att_creatorid 输入<b>AgGoodsInfo.creatorid</b>字段的值
			  */
			public void setCreatorid_str(String att_creatorid_str){
				this.creatorid_str = att_creatorid_str;
			}
			/**
			 *设置tab_like字段方法  
			 *@return  返回 <b>AgGoodsInfo.tab_like</b>的值
			 */ 
			@Transient
			public String getTab_like(){
				return this.Tab_like;
			}
			/**
			  *设置 字段方法 
			  *@param att_tab_like 输入<b>AgGoodsInfo.tab_like</b>字段的值
			  */
			public void setTab_like(String att_Tab_like){
				this.Tab_like = att_Tab_like;
			}
			/**
			 *设置tab_order字段方法  
			 *@return  返回 <b>AgGoodsInfo.tab_order</b>的值
			 */ 
			@Transient
			public String getTab_order(){
				return this.Tab_order;
			}
			/**
			  *设置 字段方法 
			  *@param att_tab_order 输入<b>AgGoodsInfo.tab_order</b>字段的值
			  */
			public void setTab_order(String att_Tab_order){
				this.Tab_order = att_Tab_order;
			}
///===============数据库表无关子段字段属性end==========
			
			private Integer id;
			@Transient
			public Integer getId() {
				return goodsId;
			}

			public void setId(Integer id) {
				this.goodsId=id;
			}
} 