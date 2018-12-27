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
 * ag_goods_info表数据库层面操作实现类 
 * @author  作者:admin
 * @version  版本信息:v1.0   创建时间: 2018-08-14 13:41:32
 */
@Component
public class  AgGoodsInfoDao extends SupperDao implements IAgGoodsInfoDao {	

	/**
	 * 根据ag_goods_info表主键查找AgGoodsInfo对象记录
	 * 
	 * @param  GoodsId  Integer类型(ag_goods_info表主键)
	 * @return AgGoodsInfo ag_goods_info表记录
	 * @throws HSKDBException
	 */	
	public AgGoodsInfo findAgGoodsInfoById(Integer GoodsId) throws HSKDBException{
				AgGoodsInfo  att_AgGoodsInfo=new AgGoodsInfo();				
				if(GoodsId!=null){
					att_AgGoodsInfo.setGoodsId(GoodsId);	
				    Object obj=	this.getOne(att_AgGoodsInfo);
					if(obj!=null){
						att_AgGoodsInfo=(AgGoodsInfo) obj;
					}
				}
				return  att_AgGoodsInfo;
	}
	 /**
	  * 根据ag_goods_info表主键删除AgGoodsInfo对象记录
	  * @param  GoodsId  Integer类型(ag_goods_info表主键)
	  * @throws HSKDBException
	  */
	public void deleteAgGoodsInfoById(Integer GoodsId) throws HSKDBException{ 
		 AgGoodsInfo  att_AgGoodsInfo=new AgGoodsInfo();	
		  if(GoodsId!=null){
					  att_AgGoodsInfo.setGoodsId(GoodsId);
				  	  Object obj=	this.getOne(att_AgGoodsInfo);
					  if(obj!=null){
							this.deleteObject(obj); 
					  }
			}
	}

	/**
 	 * 根据ag_goods_info表主键修改AgGoodsInfo对象记录
     * @param  GoodsId  Integer类型(ag_goods_info表主键)
     * @param  att_AgGoodsInfo  AgGoodsInfo类型(ag_goods_info表记录)
     * @return AgGoodsInfo  修改后的AgGoodsInfo对象记录
	 * @throws HSKDBException
	 */
	public  AgGoodsInfo updateAgGoodsInfoById(Integer GoodsId,AgGoodsInfo att_AgGoodsInfo) throws HSKDBException{
		  if(GoodsId!=null){
					att_AgGoodsInfo.setGoodsId(GoodsId);
				   	Object obj=	this.getOne(att_AgGoodsInfo);
					if(obj!=null){							 
							this.updateObject(obj);
					}
			}
			return  att_AgGoodsInfo;
	}
	
	/**
	 * 新增ag_goods_info表 记录
     * @param  att_AgGoodsInfo  AgGoodsInfo类型(ag_goods_info表记录)
	 * @throws HSKDBException
	 */
	public Integer saveAgGoodsInfo(AgGoodsInfo att_AgGoodsInfo) throws HSKDBException{
		 return this.newObject(att_AgGoodsInfo);
	} 
		
	/**
	 * 新增或修改ag_goods_info表记录 ,如果ag_goods_info表主键AgGoodsInfo.GoodsId为空就是添加，如果非空就是修改
     * @param  att_AgGoodsInfo  AgGoodsInfo类型(ag_goods_info表记录)
	 * @throws HSKDBException
	 */
	public  AgGoodsInfo saveOrUpdateAgGoodsInfo(AgGoodsInfo att_AgGoodsInfo) throws HSKDBException{
		  this.getHibernateTemplate().saveOrUpdate(att_AgGoodsInfo);
		  return att_AgGoodsInfo;
	}
	
	/**
	 *根据AgGoodsInfo对象作为对(ag_goods_info表进行查询，获取列表对象
     * @param  att_AgGoodsInfo  AgGoodsInfo类型(ag_goods_info表记录)
     * @return List<AgGoodsInfo>  列表对象
	 * @throws HSKDBException 
	 */
	 @SuppressWarnings("unchecked")
	public List<AgGoodsInfo> getListByAgGoodsInfo(AgGoodsInfo att_AgGoodsInfo) throws HSKDBException{
		String Hql=this.getHql( att_AgGoodsInfo); 
		List<AgGoodsInfo> list=this.getHibernateTemplate().find(Hql);
		return  list;
	}
	/**
	 *根据AgGoodsInfo对象作为对(ag_goods_info表进行查询，获取分页对象
     * @param  att_AgGoodsInfo  AgGoodsInfo类型(ag_goods_info表记录)
     * @return List<AgGoodsInfo>  分页对象
	 * @throws HSKDBException 
	 */
	public PagerModel getPagerModelByAgGoodsInfo(AgGoodsInfo att_AgGoodsInfo)
			throws HSKDBException {
		String Hql=this.getHql(att_AgGoodsInfo);
		return this.getHibernateDao().findByPage(Hql); 
	} 
	/**
	 * 根据AgGoodsInfo对象获取Hql字符串
     * @param  att_AgGoodsInfo  AgGoodsInfo类型(ag_goods_info表记录)
	 *  @return hql字符串
	 */
	private String  getHql(AgGoodsInfo att_AgGoodsInfo){
			 StringBuffer sbuffer = new StringBuffer( " from  AgGoodsInfo  where  1=1  ");
			 String likeStr=  att_AgGoodsInfo.getTab_like();
			 String orderStr= att_AgGoodsInfo.getTab_order();
			 
			 //*****************无关字段处理begin*****************
						   		 //处理in条件 积分商品ID(goodsId)
							     if(att_AgGoodsInfo.getGoodsId_str()!=null&&
						   		    !"".equals(att_AgGoodsInfo.getGoodsId_str().trim())){ 
											 String  intStr=att_AgGoodsInfo.getGoodsId_str().trim();
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
						   		 //处理in条件 积分单价(accumulatePointValue)
							     if(att_AgGoodsInfo.getAccumulatePointValue_str()!=null&&
						   		    !"".equals(att_AgGoodsInfo.getAccumulatePointValue_str().trim())){ 
											 String  intStr=att_AgGoodsInfo.getAccumulatePointValue_str().trim();
											 String[]  arrayStr=intStr.split(","); 
											 
											  if(arrayStr.length>0){
												 sbuffer.append(" and ( ");
												 for(int i=0;i<arrayStr.length;i++){
													 String did=arrayStr[i];
													 if(i==arrayStr.length-1){
														 sbuffer.append("  accumulatePointValue="+did+"   "); 
													 }else {
													 sbuffer.append("  accumulatePointValue="+did+" or "); 
													 }
												 }
												 sbuffer.append(" ) "); 
											 }
											   
								 	}
							     SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");
							 		//时间类型开始条件处理  创建时间(createDate)
								  if(att_AgGoodsInfo.getCreateDate_start()!=null){
							   	    	sbuffer.append( " and  createDate >='" +sdf.format(att_AgGoodsInfo.getCreateDate_start())+" 00:00:00'" );  
									 }
							 	  //时间类型结束条件处理 创建时间(createDate)
								 	if(att_AgGoodsInfo.getCreateDate_end()!=null){
					   	      			sbuffer.append( " and  createDate<='" +sdf.format(att_AgGoodsInfo.getCreateDate_end())+" 23:59:59'" );  
							  	     } 
						   		 //处理in条件 创建人ID(creatorid)
							     if(att_AgGoodsInfo.getCreatorid_str()!=null&&
						   		    !"".equals(att_AgGoodsInfo.getCreatorid_str().trim())){ 
											 String  intStr=att_AgGoodsInfo.getCreatorid_str().trim();
											 String[]  arrayStr=intStr.split(","); 
											 
											  if(arrayStr.length>0){
												 sbuffer.append(" and ( ");
												 for(int i=0;i<arrayStr.length;i++){
													 String did=arrayStr[i];
													 if(i==arrayStr.length-1){
														 sbuffer.append("  creatorid="+did+"   "); 
													 }else {
													 sbuffer.append("  creatorid="+did+" or "); 
													 }
												 }
												 sbuffer.append(" ) "); 
											 }
											   
								 	}
			 //*****************无关字段处理end*****************
			 //*****************数据库字段处理begin*************
								  		//积分商品ID(goodsId)
					 					if(att_AgGoodsInfo.getGoodsId()!=null){
											 sbuffer.append( " and goodsId=" +att_AgGoodsInfo.getGoodsId() );
										 }
					       				//商品名称(name)		 					 
									 if(att_AgGoodsInfo.getName()!=null&&
									  !"".equals(att_AgGoodsInfo.getName().trim())){
										  if(likeStr!=null&&!"".equals(likeStr.trim())&&likeStr.indexOf("name")!=-1){
											  sbuffer.append( " and name  like '%"+att_AgGoodsInfo.getName()+"%'"   );
										  }else {
											  sbuffer.append( " and name   ='"+att_AgGoodsInfo.getName()+"'"   );
										  }
									 }
								  		//积分单价(accumulatePointValue)
					 					if(att_AgGoodsInfo.getAccumulatePointValue()!=null){
											 sbuffer.append( " and accumulatePointValue=" +att_AgGoodsInfo.getAccumulatePointValue() );
										 }
					       				//商品图片(icon)		 					 
									 if(att_AgGoodsInfo.getIcon()!=null&&
									  !"".equals(att_AgGoodsInfo.getIcon().trim())){
										  if(likeStr!=null&&!"".equals(likeStr.trim())&&likeStr.indexOf("icon")!=-1){
											  sbuffer.append( " and icon  like '%"+att_AgGoodsInfo.getIcon()+"%'"   );
										  }else {
											  sbuffer.append( " and icon   ='"+att_AgGoodsInfo.getIcon()+"'"   );
										  }
									 }
					       				//(supplierName)		 					 
									 if(att_AgGoodsInfo.getSupplierName()!=null&&
									  !"".equals(att_AgGoodsInfo.getSupplierName().trim())){
										  if(likeStr!=null&&!"".equals(likeStr.trim())&&likeStr.indexOf("supplierName")!=-1){
											  sbuffer.append( " and supplierName  like '%"+att_AgGoodsInfo.getSupplierName()+"%'"   );
										  }else {
											  sbuffer.append( " and supplierName   ='"+att_AgGoodsInfo.getSupplierName()+"'"   );
										  }
									 }
					       				//供应商联系方式(supplierMobile)		 					 
									 if(att_AgGoodsInfo.getSupplierMobile()!=null&&
									  !"".equals(att_AgGoodsInfo.getSupplierMobile().trim())){
										  if(likeStr!=null&&!"".equals(likeStr.trim())&&likeStr.indexOf("supplierMobile")!=-1){
											  sbuffer.append( " and supplierMobile  like '%"+att_AgGoodsInfo.getSupplierMobile()+"%'"   );
										  }else {
											  sbuffer.append( " and supplierMobile   ='"+att_AgGoodsInfo.getSupplierMobile()+"'"   );
										  }
									 }
					       				//商品类型：0:实物类;1:电子类(type)		 					 
									 if(att_AgGoodsInfo.getType()!=null&&
									  !"".equals(att_AgGoodsInfo.getType().trim())){
										  if(likeStr!=null&&!"".equals(likeStr.trim())&&likeStr.indexOf("type")!=-1){
											  sbuffer.append( " and type  like '%"+att_AgGoodsInfo.getType()+"%'"   );
										  }else {
											  sbuffer.append( " and type   ='"+att_AgGoodsInfo.getType()+"'"   );
										  }
									 }
					       				//状态:1正常，2禁用(status)		 					 
									 if(att_AgGoodsInfo.getStatus()!=null&&
									  !"".equals(att_AgGoodsInfo.getStatus().trim())){
										  if(likeStr!=null&&!"".equals(likeStr.trim())&&likeStr.indexOf("status")!=-1){
											  sbuffer.append( " and status  like '%"+att_AgGoodsInfo.getStatus()+"%'"   );
										  }else {
											  sbuffer.append( " and status   ='"+att_AgGoodsInfo.getStatus()+"'"   );
										  }
									 }
					       				//创建人(creatorname)		 					 
									 if(att_AgGoodsInfo.getCreatorname()!=null&&
									  !"".equals(att_AgGoodsInfo.getCreatorname().trim())){
										  if(likeStr!=null&&!"".equals(likeStr.trim())&&likeStr.indexOf("creatorname")!=-1){
											  sbuffer.append( " and creatorname  like '%"+att_AgGoodsInfo.getCreatorname()+"%'"   );
										  }else {
											  sbuffer.append( " and creatorname   ='"+att_AgGoodsInfo.getCreatorname()+"'"   );
										  }
									 }
						   				//创建时间(createDate)
						 				if(att_AgGoodsInfo.getCreateDate()!=null){
						   	                   sbuffer.append( " and  createDate='" +att_AgGoodsInfo.getCreateDate()+"'" );  
								  		}
								  		//创建人ID(creatorid)
					 					if(att_AgGoodsInfo.getCreatorid()!=null){
											 sbuffer.append( " and creatorid=" +att_AgGoodsInfo.getCreatorid() );
										 }
			 //*****************数据库字段处理end***************
			  		if(orderStr!=null&&!"".equals(orderStr.trim())){
									 sbuffer.append( " order by "+orderStr);
						 }
						 /*
						 else {
							  sbuffer.append( " order by  GoodsId   desc " );
					      }
					      */
			 
			 return  sbuffer.toString();
	}
}