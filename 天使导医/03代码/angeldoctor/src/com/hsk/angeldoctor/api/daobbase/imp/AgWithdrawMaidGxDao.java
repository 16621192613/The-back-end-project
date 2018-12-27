package com.hsk.angeldoctor.api.daobbase.imp;

import java.util.*;
import com.hsk.supper.dto.comm.PagerModel;
import org.springframework.stereotype.*;
import com.hsk.exception.HSKDBException;
import com.hsk.supper.dao.imp.SupperDao;
import com.hsk.angeldoctor.api.daobbase.*;
import com.hsk.angeldoctor.api.persistence.*;

/** 
 * ag_withdraw_maid_gx表数据库层面操作实现类 
 * @author  作者:admin
 * @version  版本信息:v1.0   创建时间: 2018-08-14 13:31:12
 */
@Component
public class  AgWithdrawMaidGxDao extends SupperDao implements IAgWithdrawMaidGxDao {	

	/**
	 * 根据ag_withdraw_maid_gx表主键查找AgWithdrawMaidGx对象记录
	 * 
	 * @param  AwmgId  Integer类型(ag_withdraw_maid_gx表主键)
	 * @return AgWithdrawMaidGx ag_withdraw_maid_gx表记录
	 * @throws HSKDBException
	 */	
	public AgWithdrawMaidGx findAgWithdrawMaidGxById(Integer AwmgId) throws HSKDBException{
				AgWithdrawMaidGx  att_AgWithdrawMaidGx=new AgWithdrawMaidGx();				
				if(AwmgId!=null){
					att_AgWithdrawMaidGx.setAwmgId(AwmgId);	
				    Object obj=	this.getOne(att_AgWithdrawMaidGx);
					if(obj!=null){
						att_AgWithdrawMaidGx=(AgWithdrawMaidGx) obj;
					}
				}
				return  att_AgWithdrawMaidGx;
	}
	 /**
	  * 根据ag_withdraw_maid_gx表主键删除AgWithdrawMaidGx对象记录
	  * @param  AwmgId  Integer类型(ag_withdraw_maid_gx表主键)
	  * @throws HSKDBException
	  */
	public void deleteAgWithdrawMaidGxById(Integer AwmgId) throws HSKDBException{ 
		 AgWithdrawMaidGx  att_AgWithdrawMaidGx=new AgWithdrawMaidGx();	
		  if(AwmgId!=null){
					  att_AgWithdrawMaidGx.setAwmgId(AwmgId);
				  	  Object obj=	this.getOne(att_AgWithdrawMaidGx);
					  if(obj!=null){
							this.deleteObject(obj); 
					  }
			}
	}

	/**
 	 * 根据ag_withdraw_maid_gx表主键修改AgWithdrawMaidGx对象记录
     * @param  AwmgId  Integer类型(ag_withdraw_maid_gx表主键)
     * @param  att_AgWithdrawMaidGx  AgWithdrawMaidGx类型(ag_withdraw_maid_gx表记录)
     * @return AgWithdrawMaidGx  修改后的AgWithdrawMaidGx对象记录
	 * @throws HSKDBException
	 */
	public  AgWithdrawMaidGx updateAgWithdrawMaidGxById(Integer AwmgId,AgWithdrawMaidGx att_AgWithdrawMaidGx) throws HSKDBException{
		  if(AwmgId!=null){
					att_AgWithdrawMaidGx.setAwmgId(AwmgId);
				   	Object obj=	this.getOne(att_AgWithdrawMaidGx);
					if(obj!=null){							 
							this.updateObject(obj);
					}
			}
			return  att_AgWithdrawMaidGx;
	}
	
	/**
	 * 新增ag_withdraw_maid_gx表 记录
     * @param  att_AgWithdrawMaidGx  AgWithdrawMaidGx类型(ag_withdraw_maid_gx表记录)
	 * @throws HSKDBException
	 */
	public Integer saveAgWithdrawMaidGx(AgWithdrawMaidGx att_AgWithdrawMaidGx) throws HSKDBException{
		 return this.newObject(att_AgWithdrawMaidGx);
	} 
		
	/**
	 * 新增或修改ag_withdraw_maid_gx表记录 ,如果ag_withdraw_maid_gx表主键AgWithdrawMaidGx.AwmgId为空就是添加，如果非空就是修改
     * @param  att_AgWithdrawMaidGx  AgWithdrawMaidGx类型(ag_withdraw_maid_gx表记录)
	 * @throws HSKDBException
	 */
	public  AgWithdrawMaidGx saveOrUpdateAgWithdrawMaidGx(AgWithdrawMaidGx att_AgWithdrawMaidGx) throws HSKDBException{
		  this.getHibernateTemplate().saveOrUpdate(att_AgWithdrawMaidGx);
		  return att_AgWithdrawMaidGx;
	}
	
	/**
	 *根据AgWithdrawMaidGx对象作为对(ag_withdraw_maid_gx表进行查询，获取列表对象
     * @param  att_AgWithdrawMaidGx  AgWithdrawMaidGx类型(ag_withdraw_maid_gx表记录)
     * @return List<AgWithdrawMaidGx>  列表对象
	 * @throws HSKDBException 
	 */
	 @SuppressWarnings("unchecked")
	public List<AgWithdrawMaidGx> getListByAgWithdrawMaidGx(AgWithdrawMaidGx att_AgWithdrawMaidGx) throws HSKDBException{
		String Hql=this.getHql( att_AgWithdrawMaidGx); 
		List<AgWithdrawMaidGx> list=this.getHibernateTemplate().find(Hql);
		return  list;
	}
	/**
	 *根据AgWithdrawMaidGx对象作为对(ag_withdraw_maid_gx表进行查询，获取分页对象
     * @param  att_AgWithdrawMaidGx  AgWithdrawMaidGx类型(ag_withdraw_maid_gx表记录)
     * @return List<AgWithdrawMaidGx>  分页对象
	 * @throws HSKDBException 
	 */
	public PagerModel getPagerModelByAgWithdrawMaidGx(AgWithdrawMaidGx att_AgWithdrawMaidGx)
			throws HSKDBException {
		String Hql=this.getHql(att_AgWithdrawMaidGx);
		return this.getHibernateDao().findByPage(Hql); 
	} 
	/**
	 * 根据AgWithdrawMaidGx对象获取Hql字符串
     * @param  att_AgWithdrawMaidGx  AgWithdrawMaidGx类型(ag_withdraw_maid_gx表记录)
	 *  @return hql字符串
	 */
	private String  getHql(AgWithdrawMaidGx att_AgWithdrawMaidGx){
			 StringBuffer sbuffer = new StringBuffer( " from  AgWithdrawMaidGx  where  1=1  ");
			 String likeStr=  att_AgWithdrawMaidGx.getTab_like();
			 String orderStr= att_AgWithdrawMaidGx.getTab_order();
			 
			 //*****************无关字段处理begin*****************
						   		 //处理in条件 提现分佣ID(awmgId)
							     if(att_AgWithdrawMaidGx.getAwmgId_str()!=null&&
						   		    !"".equals(att_AgWithdrawMaidGx.getAwmgId_str().trim())){ 
											 String  intStr=att_AgWithdrawMaidGx.getAwmgId_str().trim();
											 String[]  arrayStr=intStr.split(","); 
											 
											  if(arrayStr.length>0){
												 sbuffer.append(" and ( ");
												 for(int i=0;i<arrayStr.length;i++){
													 String did=arrayStr[i];
													 if(i==arrayStr.length-1){
														 sbuffer.append("  awmgId="+did+"   "); 
													 }else {
													 sbuffer.append("  awmgId="+did+" or "); 
													 }
												 }
												 sbuffer.append(" ) "); 
											 }
											   
								 	}
						   		 //处理in条件 提现申请ID(awiId)
							     if(att_AgWithdrawMaidGx.getAwiId_str()!=null&&
						   		    !"".equals(att_AgWithdrawMaidGx.getAwiId_str().trim())){ 
											 String  intStr=att_AgWithdrawMaidGx.getAwiId_str().trim();
											 String[]  arrayStr=intStr.split(","); 
											 
											  if(arrayStr.length>0){
												 sbuffer.append(" and ( ");
												 for(int i=0;i<arrayStr.length;i++){
													 String did=arrayStr[i];
													 if(i==arrayStr.length-1){
														 sbuffer.append("  awiId="+did+"   "); 
													 }else {
													 sbuffer.append("  awiId="+did+" or "); 
													 }
												 }
												 sbuffer.append(" ) "); 
											 }
											   
								 	}
						   		 //处理in条件 分佣信息ID(amiId)
							     if(att_AgWithdrawMaidGx.getAmiId_str()!=null&&
						   		    !"".equals(att_AgWithdrawMaidGx.getAmiId_str().trim())){ 
											 String  intStr=att_AgWithdrawMaidGx.getAmiId_str().trim();
											 String[]  arrayStr=intStr.split(","); 
											 
											  if(arrayStr.length>0){
												 sbuffer.append(" and ( ");
												 for(int i=0;i<arrayStr.length;i++){
													 String did=arrayStr[i];
													 if(i==arrayStr.length-1){
														 sbuffer.append("  amiId="+did+"   "); 
													 }else {
													 sbuffer.append("  amiId="+did+" or "); 
													 }
												 }
												 sbuffer.append(" ) "); 
											 }
											   
								 	}
			 //*****************无关字段处理end*****************
			 //*****************数据库字段处理begin*************
								  		//提现分佣ID(awmgId)
					 					if(att_AgWithdrawMaidGx.getAwmgId()!=null){
											 sbuffer.append( " and awmgId=" +att_AgWithdrawMaidGx.getAwmgId() );
										 }
								  		//提现申请ID(awiId)
					 					if(att_AgWithdrawMaidGx.getAwiId()!=null){
											 sbuffer.append( " and awiId=" +att_AgWithdrawMaidGx.getAwiId() );
										 }
								  		//分佣信息ID(amiId)
					 					if(att_AgWithdrawMaidGx.getAmiId()!=null){
											 sbuffer.append( " and amiId=" +att_AgWithdrawMaidGx.getAmiId() );
										 }
			 //*****************数据库字段处理end***************
			  		if(orderStr!=null&&!"".equals(orderStr.trim())){
									 sbuffer.append( " order by "+orderStr);
						 }
						 /*
						 else {
							  sbuffer.append( " order by  AwmgId   desc " );
					      }
					      */
			 
			 return  sbuffer.toString();
	}
}