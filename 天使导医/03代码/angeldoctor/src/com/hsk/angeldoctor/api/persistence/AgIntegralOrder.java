package com.hsk.angeldoctor.api.persistence;

import javax.persistence.*;

import org.hibernate.annotations.Formula;

import static javax.persistence.GenerationType.IDENTITY;
import java.util.Date;

/**
 * 根据ag_integral_order表结构自动生成持久化对象<B> com.hsk.angeldoctor.api.persistence.AgIntegralOrder</B>
 *<hr/>
 *===============数据库表字段属性==========
 *  <table> 
 * <tr><th>字段名称:</th><td>积分订单ID(aioId)</td><th>字段类型:</th><td>Integer(主键)</td></tr> 
 * <tr><th>字段名称:</th><td>订单编号(serialNumber)</td><th>字段类型:</th><td>String(可以为空)</td></tr> 
 * <tr><th>字段名称:</th><td>用户ID(suiId)</td><th>字段类型:</th><td>Integer(可以为空)</td></tr> 
 * <tr><th>字段名称:</th><td>积分商品ID(goodsId)</td><th>字段类型:</th><td>Integer(可以为空)</td></tr> 
 * <tr><th>字段名称:</th><td>积分单价(integralPrice)</td><th>字段类型:</th><td>Integer(可以为空)</td></tr> 
 * <tr><th>字段名称:</th><td>商品名称(goodsName)</td><th>字段类型:</th><td>String(可以为空)</td></tr> 
 * <tr><th>字段名称:</th><td>商品类型：0:实物类;1:电子类(goodsType)</td><th>字段类型:</th><td>String(可以为空)</td></tr> 
 * <tr><th>字段名称:</th><td>供应商名称(supplierName)</td><th>字段类型:</th><td>String(可以为空)</td></tr> 
 * <tr><th>字段名称:</th><td>商品数量(amount)</td><th>字段类型:</th><td>Integer(可以为空)</td></tr> 
 * <tr><th>字段名称:</th><td>积分总数(goodsAccumulatePointValue)</td><th>字段类型:</th><td>Integer(可以为空)</td></tr> 
 * <tr><th>字段名称:</th><td>收货人姓名(deliveryName)</td><th>字段类型:</th><td>String(可以为空)</td></tr> 
 * <tr><th>字段名称:</th><td>联系电话(deliveryMobile)</td><th>字段类型:</th><td>String(可以为空)</td></tr> 
 * <tr><th>字段名称:</th><td>收货地址--省(deliveryProvId)</td><th>字段类型:</th><td>String(可以为空)</td></tr> 
 * <tr><th>字段名称:</th><td>收货地址-市(deliveryCityId)</td><th>字段类型:</th><td>String(可以为空)</td></tr> 
 * <tr><th>字段名称:</th><td>收货地址-地区(deliveryDistrictId)</td><th>字段类型:</th><td>String(可以为空)</td></tr> 
 * <tr><th>字段名称:</th><td>收货地址-详细地址(deliveryAddress)</td><th>字段类型:</th><td>String(可以为空)</td></tr> 
 * <tr><th>字段名称:</th><td>发货状态(deliveryStatus)</td><th>字段类型:</th><td>String(可以为空)</td></tr> 
 * <tr><th>字段名称:</th><td>发货日期(deliveryDate)</td><th>字段类型:</th><td>Date(可以为空)</td></tr> 
 * <tr><th>字段名称:</th><td>快递公司(expressName)</td><th>字段类型:</th><td>String(可以为空)</td></tr> 
 * <tr><th>字段名称:</th><td>(expressSerialNumber)</td><th>字段类型:</th><td>String(可以为空)</td></tr> 
 * <tr><th>字段名称:</th><td>状态:1正常，2禁用(status)</td><th>字段类型:</th><td>String(可以为空)</td></tr> 
 * <tr><th>字段名称:</th><td>创建人(createRen)</td><th>字段类型:</th><td>String(可以为空)</td></tr> 
 * <tr><th>字段名称:</th><td>创建时间(createDate)</td><th>字段类型:</th><td>Date(可以为空)</td></tr> 
 * <tr><th>字段名称:</th><td>修改人(editRen)</td><th>字段类型:</th><td>String(可以为空)</td></tr> 
 * <tr><th>字段名称:</th><td>修改时间(editDate)</td><th>字段类型:</th><td>Date(可以为空)</td></tr> 
 * </table>
 *===============无关字段属性===============
 *  <table> 
 * 	<tr><th>字段名称:</th><td>积分订单ID(aioId)	</td><th>属性名称:</th><td>aioId</td></tr>
 * 	<tr><th>字段名称:</th><td>用户ID(suiId)	</td><th>属性名称:</th><td>suiId</td></tr>
 * 	<tr><th>字段名称:</th><td>积分商品ID(goodsId)	</td><th>属性名称:</th><td>goodsId</td></tr>
 * 	<tr><th>字段名称:</th><td>积分单价(integralPrice)	</td><th>属性名称:</th><td>integralPrice</td></tr>
 * 	<tr><th>字段名称:</th><td>商品数量(amount)	</td><th>属性名称:</th><td>amount</td></tr>
 * 	<tr><th>字段名称:</th><td>积分总数(goodsAccumulatePointValue)	</td><th>属性名称:</th><td>goodsAccumulatePointValue</td></tr>
 * 	<tr><th>字段名称:</th><td>发货日期(deliveryDate)	</td><th>属性名称:</th><td>deliveryDate</td></tr>
 * 	<tr><th>字段名称:</th><td>发货日期(deliveryDate)	</td><th>属性名称:</th><td>deliveryDate</td></tr>
 * 	<tr><th>字段名称:</th><td>创建时间(createDate)	</td><th>属性名称:</th><td>createDate</td></tr>
 * 	<tr><th>字段名称:</th><td>创建时间(createDate)	</td><th>属性名称:</th><td>createDate</td></tr>
 * 	<tr><th>字段名称:</th><td>修改时间(editDate)	</td><th>属性名称:</th><td>editDate</td></tr>
 * 	<tr><th>字段名称:</th><td>修改时间(editDate)	</td><th>属性名称:</th><td>editDate</td></tr>
 * 	<tr><th>字段名称:</th><td>(tab_like)	</td><th>属性名称:</th><td>tab_like</td></tr>
 * 	<tr><th>字段名称:</th><td>(tab_order)	</td><th>属性名称:</th><td>tab_order</td></tr>
 * </table>
 * <hr/>
 * @author  作者:admin  
 * @version  v1.0 创建时间: 2018-08-14 13:41:32
 */
 
 
@SuppressWarnings("serial")
@Entity
@Table(name = "ag_integral_order" )
public class AgIntegralOrder {
///===============数据库表字段属性begin==========
			/**
			 *积分订单ID(aioId):字段类型为Integer  
			 */
 			private Integer aioId; 
 	
			/**
			 *订单编号(serialNumber):字段类型为String  
			 */
 			private String serialNumber; 
 	
			/**
			 *用户ID(suiId):字段类型为Integer  
			 */
 			private Integer suiId; 
 	
			/**
			 *积分商品ID(goodsId):字段类型为Integer  
			 */
 			private Integer goodsId; 
 	
			/**
			 *积分单价(integralPrice):字段类型为Integer  
			 */
 			private Integer integralPrice; 
 	
			/**
			 *商品名称(goodsName):字段类型为String  
			 */
 			private String goodsName; 
 	
			/**
			 *商品类型：0:实物类;1:电子类(goodsType):字段类型为String  
			 */
 			private String goodsType; 
 	
			/**
			 *(supplierName):字段类型为String  
			 */
 			private String supplierName; 
 	
			/**
			 *商品数量(amount):字段类型为Integer  
			 */
 			private Integer amount; 
 	
			/**
			 *积分总数(goodsAccumulatePointValue):字段类型为Integer  
			 */
 			private Integer goodsAccumulatePointValue; 
 	
			/**
			 *(deliveryName):字段类型为String  
			 */
 			private String deliveryName; 
 	
			/**
			 *(deliveryMobile):字段类型为String  
			 */
 			private String deliveryMobile; 
 	
			/**
			 *收货地址--省(deliveryProvId):字段类型为String  
			 */
 			private String deliveryProvId; 
 	
			/**
			 *收货地址-市(deliveryCityId):字段类型为String  
			 */
 			private String deliveryCityId; 
 	
			/**
			 *收货地址-地区(deliveryDistrictId):字段类型为String  
			 */
 			private String deliveryDistrictId; 
 	
			/**
			 *收货地址-详细地址(deliveryAddress):字段类型为String  
			 */
 			private String deliveryAddress; 
 	
			/**
			 *发货状态(deliveryStatus):字段类型为String  
			 */
 			private String deliveryStatus; 
 	
			/**
			 *发货日期(deliveryDate):字段类型为Date  
			 */
 			private Date deliveryDate; 
 	
			/**
			 *快递公司(expressName):字段类型为String  
			 */
 			private String expressName; 
 	
			/**
			 *(expressSerialNumber):字段类型为String  
			 */
 			private String expressSerialNumber; 
 	
			/**
			 *状态:1正常，2禁用(status):字段类型为String  
			 */
 			private String status; 
 	
			/**
			 *创建人(createRen):字段类型为String  
			 */
 			private String createRen; 
 	
			/**
			 *创建时间(createDate):字段类型为Date  
			 */
 			private Date createDate; 
 	
			/**
			 *修改人(editRen):字段类型为String  
			 */
 			private String editRen; 
 	
			/**
			 *修改时间(editDate):字段类型为Date  
			 */
 			private Date editDate; 
 			/**
 			 * 用户类型:1业务员；2患者
 			 */
 			private String userType;
 	
			/**
			 *设置积分订单ID(aio_id)字段方法 (该字段是主键)
			 *@return  返回 <b>AgIntegralOrder.AioId</b>的值
			 */	 
			@Id
			@GeneratedValue(strategy = IDENTITY)
			@Column(name = "aio_id")
			public Integer getAioId(){
			    return this.aioId;
			}

		  /**
		   *设置 aio_id字段方法 
		   *@param att_aioId 输入<b>AgIntegralOrder.aioId</b>字段的值
		   */
		  public void setAioId(Integer att_aioId){
		    this.aioId = att_aioId;
		  }
  
			/**
			 *设置订单编号(serial_number)字段方法 
			 *@return  返回 <b>AgIntegralOrder.SerialNumber</b>的值
			 */	 
			@Column(name = "serial_number" ) 
			public String getSerialNumber(){
			    return this.serialNumber;
			}

		  /**
		   *设置 serial_number字段方法 
		   *@param att_serialNumber 输入<b>AgIntegralOrder.serialNumber</b>字段的值
		   */
		  public void setSerialNumber(String att_serialNumber){
		    this.serialNumber = att_serialNumber;
		  }
  
			/**
			 *设置用户ID(sui_id)字段方法 
			 *@return  返回 <b>AgIntegralOrder.SuiId</b>的值
			 */	 
			@Column(name = "sui_id" ) 
			public Integer getSuiId(){
			    return this.suiId;
			}

		  /**
		   *设置 sui_id字段方法 
		   *@param att_suiId 输入<b>AgIntegralOrder.suiId</b>字段的值
		   */
		  public void setSuiId(Integer att_suiId){
		    this.suiId = att_suiId;
		  }
  
			/**
			 *设置积分商品ID(goods_id)字段方法 
			 *@return  返回 <b>AgIntegralOrder.GoodsId</b>的值
			 */	 
			@Column(name = "goods_id" ) 
			public Integer getGoodsId(){
			    return this.goodsId;
			}

		  /**
		   *设置 goods_id字段方法 
		   *@param att_goodsId 输入<b>AgIntegralOrder.goodsId</b>字段的值
		   */
		  public void setGoodsId(Integer att_goodsId){
		    this.goodsId = att_goodsId;
		  }
  
			/**
			 *设置积分单价(integral_price)字段方法 
			 *@return  返回 <b>AgIntegralOrder.IntegralPrice</b>的值
			 */	 
			@Column(name = "integral_price" ) 
			public Integer getIntegralPrice(){
			    return this.integralPrice;
			}

		  /**
		   *设置 integral_price字段方法 
		   *@param att_integralPrice 输入<b>AgIntegralOrder.integralPrice</b>字段的值
		   */
		  public void setIntegralPrice(Integer att_integralPrice){
		    this.integralPrice = att_integralPrice;
		  }
  
			/**
			 *设置商品名称(goods_name)字段方法 
			 *@return  返回 <b>AgIntegralOrder.GoodsName</b>的值
			 */	 
			@Column(name = "goods_name" ) 
			public String getGoodsName(){
			    return this.goodsName;
			}

		  /**
		   *设置 goods_name字段方法 
		   *@param att_goodsName 输入<b>AgIntegralOrder.goodsName</b>字段的值
		   */
		  public void setGoodsName(String att_goodsName){
		    this.goodsName = att_goodsName;
		  }
  
			/**
			 *设置商品类型：0:实物类;1:电子类(goods_type)字段方法 
			 *@return  返回 <b>AgIntegralOrder.GoodsType</b>的值
			 */	 
			@Column(name = "goods_type" ) 
			public String getGoodsType(){
			    return this.goodsType;
			}

		  /**
		   *设置 goods_type字段方法 
		   *@param att_goodsType 输入<b>AgIntegralOrder.goodsType</b>字段的值
		   */
		  public void setGoodsType(String att_goodsType){
		    this.goodsType = att_goodsType;
		  }
		  
		  
		  @Column(name = "user_type" )
			public String getUserType() {
			return userType;
		}

		public void setUserType(String userType) {
			this.userType = userType;
		}

			/**
			 *设置(supplier_name)字段方法 
			 *@return  返回 <b>AgIntegralOrder.SupplierName</b>的值
			 */	 
			@Column(name = "supplier_name" ) 
			public String getSupplierName(){
			    return this.supplierName;
			}

		  /**
		   *设置 supplier_name字段方法 
		   *@param att_supplierName 输入<b>AgIntegralOrder.supplierName</b>字段的值
		   */
		  public void setSupplierName(String att_supplierName){
		    this.supplierName = att_supplierName;
		  }
  
			/**
			 *设置商品数量(amount)字段方法 
			 *@return  返回 <b>AgIntegralOrder.Amount</b>的值
			 */	 
			@Column(name = "amount" ) 
			public Integer getAmount(){
			    return this.amount;
			}

		  /**
		   *设置 amount字段方法 
		   *@param att_amount 输入<b>AgIntegralOrder.amount</b>字段的值
		   */
		  public void setAmount(Integer att_amount){
		    this.amount = att_amount;
		  }
  
			/**
			 *设置积分总数(goods_accumulate_point_value)字段方法 
			 *@return  返回 <b>AgIntegralOrder.GoodsAccumulatePointValue</b>的值
			 */	 
			@Column(name = "goods_accumulate_point_value" ) 
			public Integer getGoodsAccumulatePointValue(){
			    return this.goodsAccumulatePointValue;
			}

		  /**
		   *设置 goods_accumulate_point_value字段方法 
		   *@param att_goodsAccumulatePointValue 输入<b>AgIntegralOrder.goodsAccumulatePointValue</b>字段的值
		   */
		  public void setGoodsAccumulatePointValue(Integer att_goodsAccumulatePointValue){
		    this.goodsAccumulatePointValue = att_goodsAccumulatePointValue;
		  }
  
			/**
			 *设置(delivery_name)字段方法 
			 *@return  返回 <b>AgIntegralOrder.DeliveryName</b>的值
			 */	 
			@Column(name = "delivery_name" ) 
			public String getDeliveryName(){
			    return this.deliveryName;
			}

		  /**
		   *设置 delivery_name字段方法 
		   *@param att_deliveryName 输入<b>AgIntegralOrder.deliveryName</b>字段的值
		   */
		  public void setDeliveryName(String att_deliveryName){
		    this.deliveryName = att_deliveryName;
		  }
  
			/**
			 *设置(delivery_mobile)字段方法 
			 *@return  返回 <b>AgIntegralOrder.DeliveryMobile</b>的值
			 */	 
			@Column(name = "delivery_mobile" ) 
			public String getDeliveryMobile(){
			    return this.deliveryMobile;
			}

		  /**
		   *设置 delivery_mobile字段方法 
		   *@param att_deliveryMobile 输入<b>AgIntegralOrder.deliveryMobile</b>字段的值
		   */
		  public void setDeliveryMobile(String att_deliveryMobile){
		    this.deliveryMobile = att_deliveryMobile;
		  }
  
			/**
			 *设置收货地址--省(delivery_prov_id)字段方法 
			 *@return  返回 <b>AgIntegralOrder.DeliveryProvId</b>的值
			 */	 
			@Column(name = "delivery_prov_id" ) 
			public String getDeliveryProvId(){
			    return this.deliveryProvId;
			}

		  /**
		   *设置 delivery_prov_id字段方法 
		   *@param att_deliveryProvId 输入<b>AgIntegralOrder.deliveryProvId</b>字段的值
		   */
		  public void setDeliveryProvId(String att_deliveryProvId){
		    this.deliveryProvId = att_deliveryProvId;
		  }
  
			/**
			 *设置收货地址-市(delivery_city_id)字段方法 
			 *@return  返回 <b>AgIntegralOrder.DeliveryCityId</b>的值
			 */	 
			@Column(name = "delivery_city_id" ) 
			public String getDeliveryCityId(){
			    return this.deliveryCityId;
			}

		  /**
		   *设置 delivery_city_id字段方法 
		   *@param att_deliveryCityId 输入<b>AgIntegralOrder.deliveryCityId</b>字段的值
		   */
		  public void setDeliveryCityId(String att_deliveryCityId){
		    this.deliveryCityId = att_deliveryCityId;
		  }
  
			/**
			 *设置收货地址-地区(delivery_district_id)字段方法 
			 *@return  返回 <b>AgIntegralOrder.DeliveryDistrictId</b>的值
			 */	 
			@Column(name = "delivery_district_id" ) 
			public String getDeliveryDistrictId(){
			    return this.deliveryDistrictId;
			}

		  /**
		   *设置 delivery_district_id字段方法 
		   *@param att_deliveryDistrictId 输入<b>AgIntegralOrder.deliveryDistrictId</b>字段的值
		   */
		  public void setDeliveryDistrictId(String att_deliveryDistrictId){
		    this.deliveryDistrictId = att_deliveryDistrictId;
		  }
  
			/**
			 *设置收货地址-详细地址(delivery_address)字段方法 
			 *@return  返回 <b>AgIntegralOrder.DeliveryAddress</b>的值
			 */	 
			@Column(name = "delivery_address" ) 
			public String getDeliveryAddress(){
			    return this.deliveryAddress;
			}

		  /**
		   *设置 delivery_address字段方法 
		   *@param att_deliveryAddress 输入<b>AgIntegralOrder.deliveryAddress</b>字段的值
		   */
		  public void setDeliveryAddress(String att_deliveryAddress){
		    this.deliveryAddress = att_deliveryAddress;
		  }
  
			/**
			 *设置发货状态(delivery_status)字段方法 
			 *@return  返回 <b>AgIntegralOrder.DeliveryStatus</b>的值
			 */	 
			@Column(name = "delivery_status" ) 
			public String getDeliveryStatus(){
			    return this.deliveryStatus;
			}

		  /**
		   *设置 delivery_status字段方法 
		   *@param att_deliveryStatus 输入<b>AgIntegralOrder.deliveryStatus</b>字段的值
		   */
		  public void setDeliveryStatus(String att_deliveryStatus){
		    this.deliveryStatus = att_deliveryStatus;
		  }
  
			/**
			 *设置发货日期(delivery_date)字段方法 
			 *@return  返回 <b>AgIntegralOrder.DeliveryDate</b>的值
			 */	 
			@Temporal(TemporalType.TIMESTAMP)
			@Column(name = "delivery_date" ) 
			public Date getDeliveryDate(){
			    return this.deliveryDate;
			}

		  /**
		   *设置 delivery_date字段方法 
		   *@param att_deliveryDate 输入<b>AgIntegralOrder.deliveryDate</b>字段的值
		   */
		  public void setDeliveryDate(Date att_deliveryDate){
		    this.deliveryDate = att_deliveryDate;
		  }
  
			/**
			 *设置快递公司(express_name)字段方法 
			 *@return  返回 <b>AgIntegralOrder.ExpressName</b>的值
			 */	 
			@Column(name = "express_name" ) 
			public String getExpressName(){
			    return this.expressName;
			}

		  /**
		   *设置 express_name字段方法 
		   *@param att_expressName 输入<b>AgIntegralOrder.expressName</b>字段的值
		   */
		  public void setExpressName(String att_expressName){
		    this.expressName = att_expressName;
		  }
  
			/**
			 *设置(express_serial_number)字段方法 
			 *@return  返回 <b>AgIntegralOrder.ExpressSerialNumber</b>的值
			 */	 
			@Column(name = "express_serial_number" ) 
			public String getExpressSerialNumber(){
			    return this.expressSerialNumber;
			}

		  /**
		   *设置 express_serial_number字段方法 
		   *@param att_expressSerialNumber 输入<b>AgIntegralOrder.expressSerialNumber</b>字段的值
		   */
		  public void setExpressSerialNumber(String att_expressSerialNumber){
		    this.expressSerialNumber = att_expressSerialNumber;
		  }
  
			/**
			 *设置状态:1正常，2禁用(status)字段方法 
			 *@return  返回 <b>AgIntegralOrder.Status</b>的值
			 */	 
			@Column(name = "status" ) 
			public String getStatus(){
			    return this.status;
			}

		  /**
		   *设置 status字段方法 
		   *@param att_status 输入<b>AgIntegralOrder.status</b>字段的值
		   */
		  public void setStatus(String att_status){
		    this.status = att_status;
		  }
  
			/**
			 *设置创建人(create_ren)字段方法 
			 *@return  返回 <b>AgIntegralOrder.CreateRen</b>的值
			 */	 
			@Column(name = "create_ren" ) 
			public String getCreateRen(){
			    return this.createRen;
			}

		  /**
		   *设置 create_ren字段方法 
		   *@param att_createRen 输入<b>AgIntegralOrder.createRen</b>字段的值
		   */
		  public void setCreateRen(String att_createRen){
		    this.createRen = att_createRen;
		  }
  
			/**
			 *设置创建时间(create_date)字段方法 
			 *@return  返回 <b>AgIntegralOrder.CreateDate</b>的值
			 */	 
			@Temporal(TemporalType.TIMESTAMP)
			@Column(name = "create_date" ) 
			public Date getCreateDate(){
			    return this.createDate;
			}

		  /**
		   *设置 create_date字段方法 
		   *@param att_createDate 输入<b>AgIntegralOrder.createDate</b>字段的值
		   */
		  public void setCreateDate(Date att_createDate){
		    this.createDate = att_createDate;
		  }
  
			/**
			 *设置修改人(edit_ren)字段方法 
			 *@return  返回 <b>AgIntegralOrder.EditRen</b>的值
			 */	 
			@Column(name = "edit_ren" ) 
			public String getEditRen(){
			    return this.editRen;
			}

		  /**
		   *设置 edit_ren字段方法 
		   *@param att_editRen 输入<b>AgIntegralOrder.editRen</b>字段的值
		   */
		  public void setEditRen(String att_editRen){
		    this.editRen = att_editRen;
		  }
  
			/**
			 *设置修改时间(edit_date)字段方法 
			 *@return  返回 <b>AgIntegralOrder.EditDate</b>的值
			 */	 
			@Temporal(TemporalType.TIMESTAMP)
			@Column(name = "edit_date" ) 
			public Date getEditDate(){
			    return this.editDate;
			}

		  /**
		   *设置 edit_date字段方法 
		   *@param att_editDate 输入<b>AgIntegralOrder.editDate</b>字段的值
		   */
		  public void setEditDate(Date att_editDate){
		    this.editDate = att_editDate;
		  }
  

///===============数据库表字段属性end==========

///===============数据库表无关子段字段属性begin==========
			/**
			 *积分订单ID(aio_id):字段类型为String
			 */
		  private String aioId_str;  
			/**
			 *用户ID(sui_id):字段类型为String
			 */
		  private String suiId_str;  
			/**
			 *积分商品ID(goods_id):字段类型为String
			 */
		  private String goodsId_str;  
			/**
			 *积分单价(integral_price):字段类型为String
			 */
		  private String integralPrice_str;  
			/**
			 *商品数量(amount):字段类型为String
			 */
		  private String amount_str;  
			/**
			 *积分总数(goods_accumulate_point_value):字段类型为String
			 */
		  private String goodsAccumulatePointValue_str;  
			/**
			 *发货日期(delivery_date):字段类型为Date
			 */
		  private Date deliveryDate_start;  
			/**
			 *发货日期(delivery_date):字段类型为Date
			 */
		  private Date deliveryDate_end;  
			/**
			 *创建时间(create_date):字段类型为Date
			 */
		  private Date createDate_start;  
			/**
			 *创建时间(create_date):字段类型为Date
			 */
		  private Date createDate_end;  
			/**
			 *修改时间(edit_date):字段类型为Date
			 */
		  private Date editDate_start;  
			/**
			 *修改时间(edit_date):字段类型为Date
			 */
		  private Date editDate_end;  
			/**
			 *():字段类型为String
			 *ag_integral_order表里不用like作为条件的字符串
			 */
		  private String Tab_like;  
			/**
			 *():字段类型为String
			 *ag_integral_order表里order by 字符串
			 */
		  private String Tab_order;  
			/**
			 *设置aioId字段方法  
			 *@return  返回 <b>AgIntegralOrder.aioId</b>的值
			 */ 
			@Transient
			public String getAioId_str(){
				return this.aioId_str;
			}
			/**
			  *设置 aio_id字段方法 
			  *@param att_aioId 输入<b>AgIntegralOrder.aioId</b>字段的值
			  */
			public void setAioId_str(String att_aioId_str){
				this.aioId_str = att_aioId_str;
			}
			/**
			 *设置suiId字段方法  
			 *@return  返回 <b>AgIntegralOrder.suiId</b>的值
			 */ 
			@Transient
			public String getSuiId_str(){
				return this.suiId_str;
			}
			/**
			  *设置 sui_id字段方法 
			  *@param att_suiId 输入<b>AgIntegralOrder.suiId</b>字段的值
			  */
			public void setSuiId_str(String att_suiId_str){
				this.suiId_str = att_suiId_str;
			}
			/**
			 *设置goodsId字段方法  
			 *@return  返回 <b>AgIntegralOrder.goodsId</b>的值
			 */ 
			@Transient
			public String getGoodsId_str(){
				return this.goodsId_str;
			}
			/**
			  *设置 goods_id字段方法 
			  *@param att_goodsId 输入<b>AgIntegralOrder.goodsId</b>字段的值
			  */
			public void setGoodsId_str(String att_goodsId_str){
				this.goodsId_str = att_goodsId_str;
			}
			/**
			 *设置integralPrice字段方法  
			 *@return  返回 <b>AgIntegralOrder.integralPrice</b>的值
			 */ 
			@Transient
			public String getIntegralPrice_str(){
				return this.integralPrice_str;
			}
			/**
			  *设置 integral_price字段方法 
			  *@param att_integralPrice 输入<b>AgIntegralOrder.integralPrice</b>字段的值
			  */
			public void setIntegralPrice_str(String att_integralPrice_str){
				this.integralPrice_str = att_integralPrice_str;
			}
			/**
			 *设置amount字段方法  
			 *@return  返回 <b>AgIntegralOrder.amount</b>的值
			 */ 
			@Transient
			public String getAmount_str(){
				return this.amount_str;
			}
			/**
			  *设置 amount字段方法 
			  *@param att_amount 输入<b>AgIntegralOrder.amount</b>字段的值
			  */
			public void setAmount_str(String att_amount_str){
				this.amount_str = att_amount_str;
			}
			/**
			 *设置goodsAccumulatePointValue字段方法  
			 *@return  返回 <b>AgIntegralOrder.goodsAccumulatePointValue</b>的值
			 */ 
			@Transient
			public String getGoodsAccumulatePointValue_str(){
				return this.goodsAccumulatePointValue_str;
			}
			/**
			  *设置 goods_accumulate_point_value字段方法 
			  *@param att_goodsAccumulatePointValue 输入<b>AgIntegralOrder.goodsAccumulatePointValue</b>字段的值
			  */
			public void setGoodsAccumulatePointValue_str(String att_goodsAccumulatePointValue_str){
				this.goodsAccumulatePointValue_str = att_goodsAccumulatePointValue_str;
			}
			/**
			 *设置deliveryDate字段方法  
			 *@return  返回 <b>AgIntegralOrder.deliveryDate</b>的值
			 */ 
			@Transient
			public Date getDeliveryDate_start(){
				return this.deliveryDate_start;
			}
			/**
			  *设置 delivery_date字段方法 
			  *@param att_deliveryDate 输入<b>AgIntegralOrder.deliveryDate</b>字段的值
			  */
			public void setDeliveryDate_start(Date att_deliveryDate_start){
				this.deliveryDate_start = att_deliveryDate_start;
			}
			/**
			 *设置deliveryDate字段方法  
			 *@return  返回 <b>AgIntegralOrder.deliveryDate</b>的值
			 */ 
			@Transient
			public Date getDeliveryDate_end(){
				return this.deliveryDate_end;
			}
			/**
			  *设置 delivery_date字段方法 
			  *@param att_deliveryDate 输入<b>AgIntegralOrder.deliveryDate</b>字段的值
			  */
			public void setDeliveryDate_end(Date att_deliveryDate_end){
				this.deliveryDate_end = att_deliveryDate_end;
			}
			/**
			 *设置createDate字段方法  
			 *@return  返回 <b>AgIntegralOrder.createDate</b>的值
			 */ 
			@Transient
			public Date getCreateDate_start(){
				return this.createDate_start;
			}
			/**
			  *设置 create_date字段方法 
			  *@param att_createDate 输入<b>AgIntegralOrder.createDate</b>字段的值
			  */
			public void setCreateDate_start(Date att_createDate_start){
				this.createDate_start = att_createDate_start;
			}
			/**
			 *设置createDate字段方法  
			 *@return  返回 <b>AgIntegralOrder.createDate</b>的值
			 */ 
			@Transient
			public Date getCreateDate_end(){
				return this.createDate_end;
			}
			/**
			  *设置 create_date字段方法 
			  *@param att_createDate 输入<b>AgIntegralOrder.createDate</b>字段的值
			  */
			public void setCreateDate_end(Date att_createDate_end){
				this.createDate_end = att_createDate_end;
			}
			/**
			 *设置editDate字段方法  
			 *@return  返回 <b>AgIntegralOrder.editDate</b>的值
			 */ 
			@Transient
			public Date getEditDate_start(){
				return this.editDate_start;
			}
			/**
			  *设置 edit_date字段方法 
			  *@param att_editDate 输入<b>AgIntegralOrder.editDate</b>字段的值
			  */
			public void setEditDate_start(Date att_editDate_start){
				this.editDate_start = att_editDate_start;
			}
			/**
			 *设置editDate字段方法  
			 *@return  返回 <b>AgIntegralOrder.editDate</b>的值
			 */ 
			@Transient
			public Date getEditDate_end(){
				return this.editDate_end;
			}
			/**
			  *设置 edit_date字段方法 
			  *@param att_editDate 输入<b>AgIntegralOrder.editDate</b>字段的值
			  */
			public void setEditDate_end(Date att_editDate_end){
				this.editDate_end = att_editDate_end;
			}
			/**
			 *设置tab_like字段方法  
			 *@return  返回 <b>AgIntegralOrder.tab_like</b>的值
			 */ 
			@Transient
			public String getTab_like(){
				return this.Tab_like;
			}
			/**
			  *设置 字段方法 
			  *@param att_tab_like 输入<b>AgIntegralOrder.tab_like</b>字段的值
			  */
			public void setTab_like(String att_Tab_like){
				this.Tab_like = att_Tab_like;
			}
			/**
			 *设置tab_order字段方法  
			 *@return  返回 <b>AgIntegralOrder.tab_order</b>的值
			 */ 
			@Transient
			public String getTab_order(){
				return this.Tab_order;
			}
			/**
			  *设置 字段方法 
			  *@param att_tab_order 输入<b>AgIntegralOrder.tab_order</b>字段的值
			  */
			public void setTab_order(String att_Tab_order){
				this.Tab_order = att_Tab_order;
			}
///===============数据库表无关子段字段属性end==========
			
			private Integer id;
			private String goodsIcon;
			@Formula("(SELECT a.icon FROM ag_goods_info a WHERE a.goods_id=goods_id)")
			public String getGoodsIcon() {
				return goodsIcon;
			}

			public void setGoodsIcon(String goodsIcon) {
				this.goodsIcon = goodsIcon;
			}

			@Transient
			public Integer getId() {
				return aioId;
			}

			public void setId(Integer id) {
				this.aioId=id;
			}
} 