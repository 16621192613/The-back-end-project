package com.hsk.angeldoctor.api.daobbase.imp;

import java.text.SimpleDateFormat;
import java.util.*;
import com.hsk.supper.dto.comm.PagerModel;
import org.springframework.stereotype.*;
import com.hsk.exception.HSKDBException;
import com.hsk.supper.dao.imp.SupperDao;
import com.hsk.angeldoctor.api.daobbase.*;
import com.hsk.angeldoctor.api.persistence.*;

/** 
 * ag_integral_order表数据库层面操作实现类 
 * @author  作者:admin
 * @version  版本信息:v1.0   创建时间: 2018-08-14 13:41:32
 */
@Component
public class  AgIntegralOrderDao extends SupperDao implements IAgIntegralOrderDao {	

	/**
	 * 根据ag_integral_order表主键查找AgIntegralOrder对象记录
	 * 
	 * @param  AioId  Integer类型(ag_integral_order表主键)
	 * @return AgIntegralOrder ag_integral_order表记录
	 * @throws HSKDBException
	 */	
	public AgIntegralOrder findAgIntegralOrderById(Integer AioId) throws HSKDBException{
				AgIntegralOrder  att_AgIntegralOrder=new AgIntegralOrder();				
				if(AioId!=null){
					att_AgIntegralOrder.setAioId(AioId);	
				    Object obj=	this.getOne(att_AgIntegralOrder);
					if(obj!=null){
						att_AgIntegralOrder=(AgIntegralOrder) obj;
					}
				}
				return  att_AgIntegralOrder;
	}
	 /**
	  * 根据ag_integral_order表主键删除AgIntegralOrder对象记录
	  * @param  AioId  Integer类型(ag_integral_order表主键)
	  * @throws HSKDBException
	  */
	public void deleteAgIntegralOrderById(Integer AioId) throws HSKDBException{ 
		 AgIntegralOrder  att_AgIntegralOrder=new AgIntegralOrder();	
		  if(AioId!=null){
					  att_AgIntegralOrder.setAioId(AioId);
				  	  Object obj=	this.getOne(att_AgIntegralOrder);
					  if(obj!=null){
							this.deleteObject(obj); 
					  }
			}
	}

	/**
 	 * 根据ag_integral_order表主键修改AgIntegralOrder对象记录
     * @param  AioId  Integer类型(ag_integral_order表主键)
     * @param  att_AgIntegralOrder  AgIntegralOrder类型(ag_integral_order表记录)
     * @return AgIntegralOrder  修改后的AgIntegralOrder对象记录
	 * @throws HSKDBException
	 */
	public  AgIntegralOrder updateAgIntegralOrderById(Integer AioId,AgIntegralOrder att_AgIntegralOrder) throws HSKDBException{
		  if(AioId!=null){
					att_AgIntegralOrder.setAioId(AioId);
				   	Object obj=	this.getOne(att_AgIntegralOrder);
					if(obj!=null){							 
							this.updateObject(obj);
					}
			}
			return  att_AgIntegralOrder;
	}
	
	/**
	 * 新增ag_integral_order表 记录
     * @param  att_AgIntegralOrder  AgIntegralOrder类型(ag_integral_order表记录)
	 * @throws HSKDBException
	 */
	public Integer saveAgIntegralOrder(AgIntegralOrder att_AgIntegralOrder) throws HSKDBException{
		 return this.newObject(att_AgIntegralOrder);
	} 
		
	/**
	 * 新增或修改ag_integral_order表记录 ,如果ag_integral_order表主键AgIntegralOrder.AioId为空就是添加，如果非空就是修改
     * @param  att_AgIntegralOrder  AgIntegralOrder类型(ag_integral_order表记录)
	 * @throws HSKDBException
	 */
	public  AgIntegralOrder saveOrUpdateAgIntegralOrder(AgIntegralOrder att_AgIntegralOrder) throws HSKDBException{
		  this.getHibernateTemplate().saveOrUpdate(att_AgIntegralOrder);
		  return att_AgIntegralOrder;
	}
	
	/**
	 *根据AgIntegralOrder对象作为对(ag_integral_order表进行查询，获取列表对象
     * @param  att_AgIntegralOrder  AgIntegralOrder类型(ag_integral_order表记录)
     * @return List<AgIntegralOrder>  列表对象
	 * @throws HSKDBException 
	 */
	 @SuppressWarnings("unchecked")
	public List<AgIntegralOrder> getListByAgIntegralOrder(AgIntegralOrder att_AgIntegralOrder) throws HSKDBException{
		String Hql=this.getHql( att_AgIntegralOrder); 
		List<AgIntegralOrder> list=this.getHibernateTemplate().find(Hql);
		return  list;
	}
	/**
	 *根据AgIntegralOrder对象作为对(ag_integral_order表进行查询，获取分页对象
     * @param  att_AgIntegralOrder  AgIntegralOrder类型(ag_integral_order表记录)
     * @return List<AgIntegralOrder>  分页对象
	 * @throws HSKDBException 
	 */
	public PagerModel getPagerModelByAgIntegralOrder(AgIntegralOrder att_AgIntegralOrder)
			throws HSKDBException {
		String Hql=this.getHql(att_AgIntegralOrder);
		return this.getHibernateDao().findByPage(Hql); 
	} 
	/**
	 * 根据AgIntegralOrder对象获取Hql字符串
     * @param  att_AgIntegralOrder  AgIntegralOrder类型(ag_integral_order表记录)
	 *  @return hql字符串
	 */
	private String  getHql(AgIntegralOrder att_AgIntegralOrder){
			 StringBuffer sbuffer = new StringBuffer( " from  AgIntegralOrder  where  1=1  ");
			 String likeStr=  att_AgIntegralOrder.getTab_like();
			 String orderStr= att_AgIntegralOrder.getTab_order();
			 
			 //*****************无关字段处理begin*****************
						   		 //处理in条件 积分订单ID(aioId)
							     if(att_AgIntegralOrder.getAioId_str()!=null&&
						   		    !"".equals(att_AgIntegralOrder.getAioId_str().trim())){ 
											 String  intStr=att_AgIntegralOrder.getAioId_str().trim();
											 String[]  arrayStr=intStr.split(","); 
											 
											  if(arrayStr.length>0){
												 sbuffer.append(" and ( ");
												 for(int i=0;i<arrayStr.length;i++){
													 String did=arrayStr[i];
													 if(i==arrayStr.length-1){
														 sbuffer.append("  aioId="+did+"   "); 
													 }else {
													 sbuffer.append("  aioId="+did+" or "); 
													 }
												 }
												 sbuffer.append(" ) "); 
											 }
											   
								 	}
						   		 //处理in条件 用户ID(suiId)
							     if(att_AgIntegralOrder.getSuiId_str()!=null&&
						   		    !"".equals(att_AgIntegralOrder.getSuiId_str().trim())){ 
											 String  intStr=att_AgIntegralOrder.getSuiId_str().trim();
											 String[]  arrayStr=intStr.split(","); 
											 
											  if(arrayStr.length>0){
												 sbuffer.append(" and ( ");
												 for(int i=0;i<arrayStr.length;i++){
													 String did=arrayStr[i];
													 if(i==arrayStr.length-1){
														 sbuffer.append("  suiId="+did+"   "); 
													 }else {
													 sbuffer.append("  suiId="+did+" or "); 
													 }
												 }
												 sbuffer.append(" ) "); 
											 }
											   
								 	}
						   		 //处理in条件 积分商品ID(goodsId)
							     if(att_AgIntegralOrder.getGoodsId_str()!=null&&
						   		    !"".equals(att_AgIntegralOrder.getGoodsId_str().trim())){ 
											 String  intStr=att_AgIntegralOrder.getGoodsId_str().trim();
											 String[]  arrayStr=intStr.split(","); 
											 
											  if(arrayStr.length>0){
												 sbuffer.append(" and ( ");
												 for(int i=0;i<arrayStr.length;i++){
													 String did=arrayStr[i];
													 if(i==arrayStr.length-1){
														 sbuffer.append("  goodsId="+did+"   "); 
													 }else {
													 sbuffer.append("  goodsId="+did+" or "); 
													 }
												 }
												 sbuffer.append(" ) "); 
											 }
											   
								 	}
						   		 //处理in条件 积分单价(integralPrice)
							     if(att_AgIntegralOrder.getIntegralPrice_str()!=null&&
						   		    !"".equals(att_AgIntegralOrder.getIntegralPrice_str().trim())){ 
											 String  intStr=att_AgIntegralOrder.getIntegralPrice_str().trim();
											 String[]  arrayStr=intStr.split(","); 
											 
											  if(arrayStr.length>0){
												 sbuffer.append(" and ( ");
												 for(int i=0;i<arrayStr.length;i++){
													 String did=arrayStr[i];
													 if(i==arrayStr.length-1){
														 sbuffer.append("  integralPrice="+did+"   "); 
													 }else {
													 sbuffer.append("  integralPrice="+did+" or "); 
													 }
												 }
												 sbuffer.append(" ) "); 
											 }
											   
								 	}
						   		 //处理in条件 商品数量(amount)
							     if(att_AgIntegralOrder.getAmount_str()!=null&&
						   		    !"".equals(att_AgIntegralOrder.getAmount_str().trim())){ 
											 String  intStr=att_AgIntegralOrder.getAmount_str().trim();
											 String[]  arrayStr=intStr.split(","); 
											 
											  if(arrayStr.length>0){
												 sbuffer.append(" and ( ");
												 for(int i=0;i<arrayStr.length;i++){
													 String did=arrayStr[i];
													 if(i==arrayStr.length-1){
														 sbuffer.append("  amount="+did+"   "); 
													 }else {
													 sbuffer.append("  amount="+did+" or "); 
													 }
												 }
												 sbuffer.append(" ) "); 
											 }
											   
								 	}
						   		 //处理in条件 积分总数(goodsAccumulatePointValue)
							     if(att_AgIntegralOrder.getGoodsAccumulatePointValue_str()!=null&&
						   		    !"".equals(att_AgIntegralOrder.getGoodsAccumulatePointValue_str().trim())){ 
											 String  intStr=att_AgIntegralOrder.getGoodsAccumulatePointValue_str().trim();
											 String[]  arrayStr=intStr.split(","); 
											 
											  if(arrayStr.length>0){
												 sbuffer.append(" and ( ");
												 for(int i=0;i<arrayStr.length;i++){
													 String did=arrayStr[i];
													 if(i==arrayStr.length-1){
														 sbuffer.append("  goodsAccumulatePointValue="+did+"   "); 
													 }else {
													 sbuffer.append("  goodsAccumulatePointValue="+did+" or "); 
													 }
												 }
												 sbuffer.append(" ) "); 
											 }
											   
								 	}
								 		//时间类型开始条件处理  发货日期(deliveryDate)
									  if(att_AgIntegralOrder.getDeliveryDate_start()!=null){
								   	    	sbuffer.append( " and  deliveryDate<='" +att_AgIntegralOrder.getDeliveryDate_start()+"'" );  
										 }
								 	  //时间类型结束条件处理 发货日期(deliveryDate)
									 	if(att_AgIntegralOrder.getDeliveryDate_end()!=null){
						   	      			sbuffer.append( " and  deliveryDate>'" +att_AgIntegralOrder.getDeliveryDate_end()+"'" );  
								  	     } 
									 	
									 	
									 	SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");
								 		//时间类型开始条件处理  创建时间(createDate)
									  if(att_AgIntegralOrder.getCreateDate_start()!=null){
								   	    	sbuffer.append( " and  createDate >='" +sdf.format(att_AgIntegralOrder.getCreateDate_start())+" 00:00:00'" );  
										 }
								 	  //时间类型结束条件处理 创建时间(createDate)
									 	if(att_AgIntegralOrder.getCreateDate_end()!=null){
						   	      			sbuffer.append( " and  createDate<='" +sdf.format(att_AgIntegralOrder.getCreateDate_end())+" 23:59:59'" );  
								  	     } 
								 		//时间类型开始条件处理  修改时间(editDate)
									  if(att_AgIntegralOrder.getEditDate_start()!=null){
								   	    	sbuffer.append( " and  editDate<='" +att_AgIntegralOrder.getEditDate_start()+"'" );  
										 }
								 	  //时间类型结束条件处理 修改时间(editDate)
									 	if(att_AgIntegralOrder.getEditDate_end()!=null){
						   	      			sbuffer.append( " and  editDate>'" +att_AgIntegralOrder.getEditDate_end()+"'" );  
								  	     } 
			 //*****************无关字段处理end*****************
			 //*****************数据库字段处理begin*************
								  		//积分订单ID(aioId)
					 					if(att_AgIntegralOrder.getAioId()!=null){
											 sbuffer.append( " and aioId=" +att_AgIntegralOrder.getAioId() );
										 }
					       				//订单编号(serialNumber)		 					 
									 if(att_AgIntegralOrder.getSerialNumber()!=null&&
									  !"".equals(att_AgIntegralOrder.getSerialNumber().trim())){
										  if(likeStr!=null&&!"".equals(likeStr.trim())&&likeStr.indexOf("serialNumber")!=-1){
											  sbuffer.append( " and serialNumber  like '%"+att_AgIntegralOrder.getSerialNumber()+"%'"   );
										  }else {
											  sbuffer.append( " and serialNumber   ='"+att_AgIntegralOrder.getSerialNumber()+"'"   );
										  }
									 }
								  		//用户ID(suiId)
					 					if(att_AgIntegralOrder.getSuiId()!=null){
											 sbuffer.append( " and suiId=" +att_AgIntegralOrder.getSuiId() );
										 }
								  		//积分商品ID(goodsId)
					 					if(att_AgIntegralOrder.getGoodsId()!=null){
											 sbuffer.append( " and goodsId=" +att_AgIntegralOrder.getGoodsId() );
										 }
								  		//积分单价(integralPrice)
					 					if(att_AgIntegralOrder.getIntegralPrice()!=null){
											 sbuffer.append( " and integralPrice=" +att_AgIntegralOrder.getIntegralPrice() );
										 }
					       				//商品名称(goodsName)		 					 
									 if(att_AgIntegralOrder.getGoodsName()!=null&&
									  !"".equals(att_AgIntegralOrder.getGoodsName().trim())){
										  if(likeStr!=null&&!"".equals(likeStr.trim())&&likeStr.indexOf("goodsName")!=-1){
											  sbuffer.append( " and goodsName  like '%"+att_AgIntegralOrder.getGoodsName()+"%'"   );
										  }else {
											  sbuffer.append( " and goodsName   ='"+att_AgIntegralOrder.getGoodsName()+"'"   );
										  }
									 }
					       				//商品类型：0:实物类;1:电子类(goodsType)		 					 
									 if(att_AgIntegralOrder.getGoodsType()!=null&&
									  !"".equals(att_AgIntegralOrder.getGoodsType().trim())){
										  if(likeStr!=null&&!"".equals(likeStr.trim())&&likeStr.indexOf("goodsType")!=-1){
											  sbuffer.append( " and goodsType  like '%"+att_AgIntegralOrder.getGoodsType()+"%'"   );
										  }else {
											  sbuffer.append( " and goodsType   ='"+att_AgIntegralOrder.getGoodsType()+"'"   );
										  }
									 }
					       				//(supplierName)		 					 
									 if(att_AgIntegralOrder.getSupplierName()!=null&&
									  !"".equals(att_AgIntegralOrder.getSupplierName().trim())){
										  if(likeStr!=null&&!"".equals(likeStr.trim())&&likeStr.indexOf("supplierName")!=-1){
											  sbuffer.append( " and supplierName  like '%"+att_AgIntegralOrder.getSupplierName()+"%'"   );
										  }else {
											  sbuffer.append( " and supplierName   ='"+att_AgIntegralOrder.getSupplierName()+"'"   );
										  }
									 }
								  		//商品数量(amount)
					 					if(att_AgIntegralOrder.getAmount()!=null){
											 sbuffer.append( " and amount=" +att_AgIntegralOrder.getAmount() );
										 }
					 					if(att_AgIntegralOrder.getUserType()!=null && !att_AgIntegralOrder.getUserType().trim().equals(""))
					 						sbuffer.append( " and userType='" +att_AgIntegralOrder.getUserType().trim()+"'" );
								  		//积分总数(goodsAccumulatePointValue)
					 					if(att_AgIntegralOrder.getGoodsAccumulatePointValue()!=null){
											 sbuffer.append( " and goodsAccumulatePointValue=" +att_AgIntegralOrder.getGoodsAccumulatePointValue() );
										 }
					       				//(deliveryName)		 					 
									 if(att_AgIntegralOrder.getDeliveryName()!=null&&
									  !"".equals(att_AgIntegralOrder.getDeliveryName().trim())){
										  if(likeStr!=null&&!"".equals(likeStr.trim())&&likeStr.indexOf("deliveryName")!=-1){
											  sbuffer.append( " and deliveryName  like '%"+att_AgIntegralOrder.getDeliveryName()+"%'"   );
										  }else {
											  sbuffer.append( " and deliveryName   ='"+att_AgIntegralOrder.getDeliveryName()+"'"   );
										  }
									 }
					       				//(deliveryMobile)		 					 
									 if(att_AgIntegralOrder.getDeliveryMobile()!=null&&
									  !"".equals(att_AgIntegralOrder.getDeliveryMobile().trim())){
										  if(likeStr!=null&&!"".equals(likeStr.trim())&&likeStr.indexOf("deliveryMobile")!=-1){
											  sbuffer.append( " and deliveryMobile  like '%"+att_AgIntegralOrder.getDeliveryMobile()+"%'"   );
										  }else {
											  sbuffer.append( " and deliveryMobile   ='"+att_AgIntegralOrder.getDeliveryMobile()+"'"   );
										  }
									 }
					       				//收货地址--省(deliveryProvId)		 					 
									 if(att_AgIntegralOrder.getDeliveryProvId()!=null&&
									  !"".equals(att_AgIntegralOrder.getDeliveryProvId().trim())){
										  if(likeStr!=null&&!"".equals(likeStr.trim())&&likeStr.indexOf("deliveryProvId")!=-1){
											  sbuffer.append( " and deliveryProvId  like '%"+att_AgIntegralOrder.getDeliveryProvId()+"%'"   );
										  }else {
											  sbuffer.append( " and deliveryProvId   ='"+att_AgIntegralOrder.getDeliveryProvId()+"'"   );
										  }
									 }
					       				//收货地址-市(deliveryCityId)		 					 
									 if(att_AgIntegralOrder.getDeliveryCityId()!=null&&
									  !"".equals(att_AgIntegralOrder.getDeliveryCityId().trim())){
										  if(likeStr!=null&&!"".equals(likeStr.trim())&&likeStr.indexOf("deliveryCityId")!=-1){
											  sbuffer.append( " and deliveryCityId  like '%"+att_AgIntegralOrder.getDeliveryCityId()+"%'"   );
										  }else {
											  sbuffer.append( " and deliveryCityId   ='"+att_AgIntegralOrder.getDeliveryCityId()+"'"   );
										  }
									 }
					       				//收货地址-地区(deliveryDistrictId)		 					 
									 if(att_AgIntegralOrder.getDeliveryDistrictId()!=null&&
									  !"".equals(att_AgIntegralOrder.getDeliveryDistrictId().trim())){
										  if(likeStr!=null&&!"".equals(likeStr.trim())&&likeStr.indexOf("deliveryDistrictId")!=-1){
											  sbuffer.append( " and deliveryDistrictId  like '%"+att_AgIntegralOrder.getDeliveryDistrictId()+"%'"   );
										  }else {
											  sbuffer.append( " and deliveryDistrictId   ='"+att_AgIntegralOrder.getDeliveryDistrictId()+"'"   );
										  }
									 }
					       				//收货地址-详细地址(deliveryAddress)		 					 
									 if(att_AgIntegralOrder.getDeliveryAddress()!=null&&
									  !"".equals(att_AgIntegralOrder.getDeliveryAddress().trim())){
										  if(likeStr!=null&&!"".equals(likeStr.trim())&&likeStr.indexOf("deliveryAddress")!=-1){
											  sbuffer.append( " and deliveryAddress  like '%"+att_AgIntegralOrder.getDeliveryAddress()+"%'"   );
										  }else {
											  sbuffer.append( " and deliveryAddress   ='"+att_AgIntegralOrder.getDeliveryAddress()+"'"   );
										  }
									 }
					       				//发货状态(deliveryStatus)		 					 
									 if(att_AgIntegralOrder.getDeliveryStatus()!=null&&
									  !"".equals(att_AgIntegralOrder.getDeliveryStatus().trim())){
										  if(likeStr!=null&&!"".equals(likeStr.trim())&&likeStr.indexOf("deliveryStatus")!=-1){
											  sbuffer.append( " and deliveryStatus  like '%"+att_AgIntegralOrder.getDeliveryStatus()+"%'"   );
										  }else {
											  sbuffer.append( " and deliveryStatus   ='"+att_AgIntegralOrder.getDeliveryStatus()+"'"   );
										  }
									 }
						   				//发货日期(deliveryDate)
						 				if(att_AgIntegralOrder.getDeliveryDate()!=null){
						   	                   sbuffer.append( " and  deliveryDate='" +att_AgIntegralOrder.getDeliveryDate()+"'" );  
								  		}
					       				//快递公司(expressName)		 					 
									 if(att_AgIntegralOrder.getExpressName()!=null&&
									  !"".equals(att_AgIntegralOrder.getExpressName().trim())){
										  if(likeStr!=null&&!"".equals(likeStr.trim())&&likeStr.indexOf("expressName")!=-1){
											  sbuffer.append( " and expressName  like '%"+att_AgIntegralOrder.getExpressName()+"%'"   );
										  }else {
											  sbuffer.append( " and expressName   ='"+att_AgIntegralOrder.getExpressName()+"'"   );
										  }
									 }
					       				//(expressSerialNumber)		 					 
									 if(att_AgIntegralOrder.getExpressSerialNumber()!=null&&
									  !"".equals(att_AgIntegralOrder.getExpressSerialNumber().trim())){
										  if(likeStr!=null&&!"".equals(likeStr.trim())&&likeStr.indexOf("expressSerialNumber")!=-1){
											  sbuffer.append( " and expressSerialNumber  like '%"+att_AgIntegralOrder.getExpressSerialNumber()+"%'"   );
										  }else {
											  sbuffer.append( " and expressSerialNumber   ='"+att_AgIntegralOrder.getExpressSerialNumber()+"'"   );
										  }
									 }
					       				//状态:1正常，2禁用(status)		 					 
									 if(att_AgIntegralOrder.getStatus()!=null&&
									  !"".equals(att_AgIntegralOrder.getStatus().trim())){
										  if(likeStr!=null&&!"".equals(likeStr.trim())&&likeStr.indexOf("status")!=-1){
											  sbuffer.append( " and status  like '%"+att_AgIntegralOrder.getStatus()+"%'"   );
										  }else {
											  sbuffer.append( " and status   ='"+att_AgIntegralOrder.getStatus()+"'"   );
										  }
									 }
					       				//创建人(createRen)		 					 
									 if(att_AgIntegralOrder.getCreateRen()!=null&&
									  !"".equals(att_AgIntegralOrder.getCreateRen().trim())){
										  if(likeStr!=null&&!"".equals(likeStr.trim())&&likeStr.indexOf("createRen")!=-1){
											  sbuffer.append( " and createRen  like '%"+att_AgIntegralOrder.getCreateRen()+"%'"   );
										  }else {
											  sbuffer.append( " and createRen   ='"+att_AgIntegralOrder.getCreateRen()+"'"   );
										  }
									 }
						   				//创建时间(createDate)
						 				if(att_AgIntegralOrder.getCreateDate()!=null){
						   	                   sbuffer.append( " and  createDate='" +att_AgIntegralOrder.getCreateDate()+"'" );  
								  		}
					       				//修改人(editRen)		 					 
									 if(att_AgIntegralOrder.getEditRen()!=null&&
									  !"".equals(att_AgIntegralOrder.getEditRen().trim())){
										  if(likeStr!=null&&!"".equals(likeStr.trim())&&likeStr.indexOf("editRen")!=-1){
											  sbuffer.append( " and editRen  like '%"+att_AgIntegralOrder.getEditRen()+"%'"   );
										  }else {
											  sbuffer.append( " and editRen   ='"+att_AgIntegralOrder.getEditRen()+"'"   );
										  }
									 }
						   				//修改时间(editDate)
						 				if(att_AgIntegralOrder.getEditDate()!=null){
						   	                   sbuffer.append( " and  editDate='" +att_AgIntegralOrder.getEditDate()+"'" );  
								  		}
			 //*****************数据库字段处理end***************
			  		if(orderStr!=null&&!"".equals(orderStr.trim())){
									 sbuffer.append( " order by "+orderStr);
						 }
						 /*
						 else {
							  sbuffer.append( " order by  AioId   desc " );
					      }
					      */
			 
			 return  sbuffer.toString();
	}
	 
	
	
	 
}