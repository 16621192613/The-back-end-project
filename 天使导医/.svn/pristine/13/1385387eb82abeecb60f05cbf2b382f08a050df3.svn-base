package com.hsk.angeldoctor.api.daobbase.imp;

import java.util.*;
import com.hsk.supper.dto.comm.PagerModel;
import org.springframework.stereotype.*;
import com.hsk.exception.HSKDBException;
import com.hsk.supper.dao.imp.SupperDao;
import com.hsk.angeldoctor.api.daobbase.*;
import com.hsk.angeldoctor.api.persistence.*;

/** 
 * ag_work_model_gx表数据库层面操作实现类 
 * @author  作者:admin
 * @version  版本信息:v1.0   创建时间: 2018-08-14 13:28:02
 */
@Component
public class  AgWorkModelGxDao extends SupperDao implements IAgWorkModelGxDao {	

	/**
	 * 根据ag_work_model_gx表主键查找AgWorkModelGx对象记录
	 * 
	 * @param  AwmgId  Integer类型(ag_work_model_gx表主键)
	 * @return AgWorkModelGx ag_work_model_gx表记录
	 * @throws HSKDBException
	 */	
	public AgWorkModelGx findAgWorkModelGxById(Integer AwmgId) throws HSKDBException{
				AgWorkModelGx  att_AgWorkModelGx=new AgWorkModelGx();				
				if(AwmgId!=null){
					att_AgWorkModelGx.setAwmgId(AwmgId);	
				    Object obj=	this.getOne(att_AgWorkModelGx);
					if(obj!=null){
						att_AgWorkModelGx=(AgWorkModelGx) obj;
					}
				}
				return  att_AgWorkModelGx;
	}
	 /**
	  * 根据ag_work_model_gx表主键删除AgWorkModelGx对象记录
	  * @param  AwmgId  Integer类型(ag_work_model_gx表主键)
	  * @throws HSKDBException
	  */
	public void deleteAgWorkModelGxById(Integer AwmgId) throws HSKDBException{ 
		 AgWorkModelGx  att_AgWorkModelGx=new AgWorkModelGx();	
		  if(AwmgId!=null){
					  att_AgWorkModelGx.setAwmgId(AwmgId);
				  	  Object obj=	this.getOne(att_AgWorkModelGx);
					  if(obj!=null){
							this.deleteObject(obj); 
					  }
			}
	}

	/**
 	 * 根据ag_work_model_gx表主键修改AgWorkModelGx对象记录
     * @param  AwmgId  Integer类型(ag_work_model_gx表主键)
     * @param  att_AgWorkModelGx  AgWorkModelGx类型(ag_work_model_gx表记录)
     * @return AgWorkModelGx  修改后的AgWorkModelGx对象记录
	 * @throws HSKDBException
	 */
	public  AgWorkModelGx updateAgWorkModelGxById(Integer AwmgId,AgWorkModelGx att_AgWorkModelGx) throws HSKDBException{
		  if(AwmgId!=null){
					att_AgWorkModelGx.setAwmgId(AwmgId);
				   	Object obj=	this.getOne(att_AgWorkModelGx);
					if(obj!=null){							 
							this.updateObject(obj);
					}
			}
			return  att_AgWorkModelGx;
	}
	
	/**
	 * 新增ag_work_model_gx表 记录
     * @param  att_AgWorkModelGx  AgWorkModelGx类型(ag_work_model_gx表记录)
	 * @throws HSKDBException
	 */
	public Integer saveAgWorkModelGx(AgWorkModelGx att_AgWorkModelGx) throws HSKDBException{
		 return this.newObject(att_AgWorkModelGx);
	} 
		
	/**
	 * 新增或修改ag_work_model_gx表记录 ,如果ag_work_model_gx表主键AgWorkModelGx.AwmgId为空就是添加，如果非空就是修改
     * @param  att_AgWorkModelGx  AgWorkModelGx类型(ag_work_model_gx表记录)
	 * @throws HSKDBException
	 */
	public  AgWorkModelGx saveOrUpdateAgWorkModelGx(AgWorkModelGx att_AgWorkModelGx) throws HSKDBException{
		  this.getHibernateTemplate().saveOrUpdate(att_AgWorkModelGx);
		  return att_AgWorkModelGx;
	}
	
	/**
	 *根据AgWorkModelGx对象作为对(ag_work_model_gx表进行查询，获取列表对象
     * @param  att_AgWorkModelGx  AgWorkModelGx类型(ag_work_model_gx表记录)
     * @return List<AgWorkModelGx>  列表对象
	 * @throws HSKDBException 
	 */
	 @SuppressWarnings("unchecked")
	public List<AgWorkModelGx> getListByAgWorkModelGx(AgWorkModelGx att_AgWorkModelGx) throws HSKDBException{
		String Hql=this.getHql( att_AgWorkModelGx); 
		List<AgWorkModelGx> list=this.getHibernateTemplate().find(Hql);
		return  list;
	}
	/**
	 *根据AgWorkModelGx对象作为对(ag_work_model_gx表进行查询，获取分页对象
     * @param  att_AgWorkModelGx  AgWorkModelGx类型(ag_work_model_gx表记录)
     * @return List<AgWorkModelGx>  分页对象
	 * @throws HSKDBException 
	 */
	public PagerModel getPagerModelByAgWorkModelGx(AgWorkModelGx att_AgWorkModelGx)
			throws HSKDBException {
		String Hql=this.getHql(att_AgWorkModelGx);
		return this.getHibernateDao().findByPage(Hql); 
	} 
	/**
	 * 根据AgWorkModelGx对象获取Hql字符串
     * @param  att_AgWorkModelGx  AgWorkModelGx类型(ag_work_model_gx表记录)
	 *  @return hql字符串
	 */
	private String  getHql(AgWorkModelGx att_AgWorkModelGx){
			 StringBuffer sbuffer = new StringBuffer( " from  AgWorkModelGx  where  1=1  ");
			 String likeStr=  att_AgWorkModelGx.getTab_like();
			 String orderStr= att_AgWorkModelGx.getTab_order();
			 
			 //*****************无关字段处理begin*****************
						   		 //处理in条件 排班模板关系ID(awmgId)
							     if(att_AgWorkModelGx.getAwmgId_str()!=null&&
						   		    !"".equals(att_AgWorkModelGx.getAwmgId_str().trim())){ 
											 String  intStr=att_AgWorkModelGx.getAwmgId_str().trim();
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
						   		 //处理in条件 排班时间ID(shiftPeriodId)
							     if(att_AgWorkModelGx.getShiftPeriodId_str()!=null&&
						   		    !"".equals(att_AgWorkModelGx.getShiftPeriodId_str().trim())){ 
											 String  intStr=att_AgWorkModelGx.getShiftPeriodId_str().trim();
											 String[]  arrayStr=intStr.split(","); 
											 
											  if(arrayStr.length>0){
												 sbuffer.append(" and ( ");
												 for(int i=0;i<arrayStr.length;i++){
													 String did=arrayStr[i];
													 if(i==arrayStr.length-1){
														 sbuffer.append("  shiftPeriodId="+did+"   "); 
													 }else {
													 sbuffer.append("  shiftPeriodId="+did+" or "); 
													 }
												 }
												 sbuffer.append(" ) "); 
											 }
											   
								 	}
						   		 //处理in条件 排班模板ID(shiftTemplateId)
							     if(att_AgWorkModelGx.getShiftTemplateId_str()!=null&&
						   		    !"".equals(att_AgWorkModelGx.getShiftTemplateId_str().trim())){ 
											 String  intStr=att_AgWorkModelGx.getShiftTemplateId_str().trim();
											 String[]  arrayStr=intStr.split(","); 
											 
											  if(arrayStr.length>0){
												 sbuffer.append(" and ( ");
												 for(int i=0;i<arrayStr.length;i++){
													 String did=arrayStr[i];
													 if(i==arrayStr.length-1){
														 sbuffer.append("  shiftTemplateId="+did+"   "); 
													 }else {
													 sbuffer.append("  shiftTemplateId="+did+" or "); 
													 }
												 }
												 sbuffer.append(" ) "); 
											 }
											   
								 	}
						   		 //处理in条件 接诊数量(planCount)
							     if(att_AgWorkModelGx.getPlanCount_str()!=null&&
						   		    !"".equals(att_AgWorkModelGx.getPlanCount_str().trim())){ 
											 String  intStr=att_AgWorkModelGx.getPlanCount_str().trim();
											 String[]  arrayStr=intStr.split(","); 
											 
											  if(arrayStr.length>0){
												 sbuffer.append(" and ( ");
												 for(int i=0;i<arrayStr.length;i++){
													 String did=arrayStr[i];
													 if(i==arrayStr.length-1){
														 sbuffer.append("  planCount="+did+"   "); 
													 }else {
													 sbuffer.append("  planCount="+did+" or "); 
													 }
												 }
												 sbuffer.append(" ) "); 
											 }
											   
								 	}
			 //*****************无关字段处理end*****************
			 //*****************数据库字段处理begin*************
								  		//排班模板关系ID(awmgId)
					 					if(att_AgWorkModelGx.getAwmgId()!=null){
											 sbuffer.append( " and awmgId=" +att_AgWorkModelGx.getAwmgId() );
										 }
								  		//排班时间ID(shiftPeriodId)
					 					if(att_AgWorkModelGx.getShiftPeriodId()!=null){
											 sbuffer.append( " and shiftPeriodId=" +att_AgWorkModelGx.getShiftPeriodId() );
										 }
								  		//排班模板ID(shiftTemplateId)
					 					if(att_AgWorkModelGx.getShiftTemplateId()!=null){
											 sbuffer.append( " and shiftTemplateId=" +att_AgWorkModelGx.getShiftTemplateId() );
										 }
								  		//接诊数量(planCount)
					 					if(att_AgWorkModelGx.getPlanCount()!=null){
											 sbuffer.append( " and planCount=" +att_AgWorkModelGx.getPlanCount() );
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