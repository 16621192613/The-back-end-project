package com.hsk.angeldoctor.api.daobbase.imp;

import java.util.List;

import org.springframework.stereotype.Component;

import com.hsk.angeldoctor.api.daobbase.IAgWorkInfoDao;
import com.hsk.angeldoctor.api.persistence.AgWorkInfo;
import com.hsk.angeldoctor.api.persistence.AgWorkView;
import com.hsk.exception.HSKDBException;
import com.hsk.supper.dao.imp.SupperDao;
import com.hsk.supper.dto.comm.PagerModel;

/** 
 * ag_work_info表数据库层面操作实现类 
 * @author  作者:admin
 * @version  版本信息:v1.0   创建时间: 2018-08-14 13:28:02
 */
@Component
public class  AgWorkInfoDao extends SupperDao implements IAgWorkInfoDao {	

	/**
	 * 根据ag_work_info表主键查找AgWorkInfo对象记录
	 * 
	 * @param  ShiftPlanId  Integer类型(ag_work_info表主键)
	 * @return AgWorkInfo ag_work_info表记录
	 * @throws HSKDBException
	 */	
	public AgWorkInfo findAgWorkInfoById(Integer ShiftPlanId) throws HSKDBException{
				AgWorkInfo  att_AgWorkInfo=new AgWorkInfo();				
				if(ShiftPlanId!=null){
					att_AgWorkInfo.setShiftPlanId(ShiftPlanId);	
				    Object obj=	this.getOne(att_AgWorkInfo);
					if(obj!=null){
						att_AgWorkInfo=(AgWorkInfo) obj;
					}
				}
				return  att_AgWorkInfo;
	}
	 /**
	  * 根据ag_work_info表主键删除AgWorkInfo对象记录
	  * @param  ShiftPlanId  Integer类型(ag_work_info表主键)
	  * @throws HSKDBException
	  */
	public void deleteAgWorkInfoById(Integer ShiftPlanId) throws HSKDBException{ 
		 AgWorkInfo  att_AgWorkInfo=new AgWorkInfo();	
		  if(ShiftPlanId!=null){
					  att_AgWorkInfo.setShiftPlanId(ShiftPlanId);
				  	  Object obj=	this.getOne(att_AgWorkInfo);
					  if(obj!=null){
							this.deleteObject(obj); 
					  }
			}
	}

	/**
 	 * 根据ag_work_info表主键修改AgWorkInfo对象记录
     * @param  ShiftPlanId  Integer类型(ag_work_info表主键)
     * @param  att_AgWorkInfo  AgWorkInfo类型(ag_work_info表记录)
     * @return AgWorkInfo  修改后的AgWorkInfo对象记录
	 * @throws HSKDBException
	 */
	public  AgWorkInfo updateAgWorkInfoById(Integer ShiftPlanId,AgWorkInfo att_AgWorkInfo) throws HSKDBException{
		  if(ShiftPlanId!=null){
					att_AgWorkInfo.setShiftPlanId(ShiftPlanId);
				   	Object obj=	this.getOne(att_AgWorkInfo);
					if(obj!=null){							 
							this.updateObject(obj);
					}
			}
			return  att_AgWorkInfo;
	}
	
	/**
	 * 新增ag_work_info表 记录
     * @param  att_AgWorkInfo  AgWorkInfo类型(ag_work_info表记录)
	 * @throws HSKDBException
	 */
	public Integer saveAgWorkInfo(AgWorkInfo att_AgWorkInfo) throws HSKDBException{
		 return this.newObject(att_AgWorkInfo);
	} 
		
	/**
	 * 新增或修改ag_work_info表记录 ,如果ag_work_info表主键AgWorkInfo.ShiftPlanId为空就是添加，如果非空就是修改
     * @param  att_AgWorkInfo  AgWorkInfo类型(ag_work_info表记录)
	 * @throws HSKDBException
	 */
	public  AgWorkInfo saveOrUpdateAgWorkInfo(AgWorkInfo att_AgWorkInfo) throws HSKDBException{
		  this.getHibernateTemplate().saveOrUpdate(att_AgWorkInfo);
		  return att_AgWorkInfo;
	}
	
	/**
	 *根据AgWorkInfo对象作为对(ag_work_info表进行查询，获取列表对象
     * @param  att_AgWorkInfo  AgWorkInfo类型(ag_work_info表记录)
     * @return List<AgWorkInfo>  列表对象
	 * @throws HSKDBException 
	 */
	 @SuppressWarnings("unchecked")
	public List<AgWorkInfo> getListByAgWorkInfo(AgWorkInfo att_AgWorkInfo) throws HSKDBException{
		String Hql=this.getHql( att_AgWorkInfo); 
		List<AgWorkInfo> list=this.getHibernateTemplate().find(Hql);
		return  list;
	}
	/**
	 *根据AgWorkInfo对象作为对(ag_work_info表进行查询，获取分页对象
     * @param  att_AgWorkInfo  AgWorkInfo类型(ag_work_info表记录)
     * @return List<AgWorkInfo>  分页对象
	 * @throws HSKDBException 
	 */
	public PagerModel getPagerModelByAgWorkInfo(AgWorkInfo att_AgWorkInfo)
			throws HSKDBException {
		String Hql=this.getHql(att_AgWorkInfo);
		return this.getHibernateDao().findByPage(Hql); 
	} 
	/**
	 * 根据AgWorkInfo对象获取Hql字符串
     * @param  att_AgWorkInfo  AgWorkInfo类型(ag_work_info表记录)
	 *  @return hql字符串
	 */
	private String  getHql(AgWorkInfo att_AgWorkInfo){
			 StringBuffer sbuffer = new StringBuffer( " from  AgWorkInfo  where  1=1  ");
			 String likeStr=  att_AgWorkInfo.getTab_like();
			 String orderStr= att_AgWorkInfo.getTab_order();
			 
			 //*****************无关字段处理begin*****************
						   		 //处理in条件 排班ID(shiftPlanId)
							     if(att_AgWorkInfo.getShiftPlanId_str()!=null&&
						   		    !"".equals(att_AgWorkInfo.getShiftPlanId_str().trim())){ 
											 String  intStr=att_AgWorkInfo.getShiftPlanId_str().trim();
											 String[]  arrayStr=intStr.split(","); 
											 
											  if(arrayStr.length>0){
												 sbuffer.append(" and ( ");
												 for(int i=0;i<arrayStr.length;i++){
													 String did=arrayStr[i];
													 if(i==arrayStr.length-1){
														 sbuffer.append("  shiftPlanId="+did+"   "); 
													 }else {
													 sbuffer.append("  shiftPlanId="+did+" or "); 
													 }
												 }
												 sbuffer.append(" ) "); 
											 }
											   
								 	}
						   		 //处理in条件 科室ID(departmentId)
							     if(att_AgWorkInfo.getDepartmentId_str()!=null&&
						   		    !"".equals(att_AgWorkInfo.getDepartmentId_str().trim())){ 
											 String  intStr=att_AgWorkInfo.getDepartmentId_str().trim();
											 String[]  arrayStr=intStr.split(","); 
											 
											  if(arrayStr.length>0){
												 sbuffer.append(" and ( ");
												 for(int i=0;i<arrayStr.length;i++){
													 String did=arrayStr[i];
													 if(i==arrayStr.length-1){
														 sbuffer.append("  departmentId="+did+"   "); 
													 }else {
													 sbuffer.append("  departmentId="+did+" or "); 
													 }
												 }
												 sbuffer.append(" ) "); 
											 }
											   
								 	}
						   		 //处理in条件 医院ID(organizationId)
							     if(att_AgWorkInfo.getOrganizationId_str()!=null&&
						   		    !"".equals(att_AgWorkInfo.getOrganizationId_str().trim())){ 
											 String  intStr=att_AgWorkInfo.getOrganizationId_str().trim();
											 String[]  arrayStr=intStr.split(","); 
											 
											  if(arrayStr.length>0){
												 sbuffer.append(" and ( ");
												 for(int i=0;i<arrayStr.length;i++){
													 String did=arrayStr[i];
													 if(i==arrayStr.length-1){
														 sbuffer.append("  organizationId="+did+"   "); 
													 }else {
													 sbuffer.append("  organizationId="+did+" or "); 
													 }
												 }
												 sbuffer.append(" ) "); 
											 }
											   
								 	}
						   		 //处理in条件 医生ID(doctorId)
							     if(att_AgWorkInfo.getDoctorId_str()!=null&&
						   		    !"".equals(att_AgWorkInfo.getDoctorId_str().trim())){ 
											 String  intStr=att_AgWorkInfo.getDoctorId_str().trim();
											 String[]  arrayStr=intStr.split(","); 
											 
											  if(arrayStr.length>0){
												 sbuffer.append(" and ( ");
												 for(int i=0;i<arrayStr.length;i++){
													 String did=arrayStr[i];
													 if(i==arrayStr.length-1){
														 sbuffer.append("  doctorId="+did+"   "); 
													 }else {
													 sbuffer.append("  doctorId="+did+" or "); 
													 }
												 }
												 sbuffer.append(" ) "); 
											 }
											   
								 	}
						   		 //处理in条件 排班时间ID(shiftPeriodId)
							     if(att_AgWorkInfo.getShiftPeriodId_str()!=null&&
						   		    !"".equals(att_AgWorkInfo.getShiftPeriodId_str().trim())){ 
											 String  intStr=att_AgWorkInfo.getShiftPeriodId_str().trim();
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
						   		 //处理in条件 计划接待数(planCount)
							     if(att_AgWorkInfo.getPlanCount_str()!=null&&
						   		    !"".equals(att_AgWorkInfo.getPlanCount_str().trim())){ 
											 String  intStr=att_AgWorkInfo.getPlanCount_str().trim();
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
						   		 //处理in条件 实际接待数(actualCount)
							     if(att_AgWorkInfo.getActualCount_str()!=null&&
						   		    !"".equals(att_AgWorkInfo.getActualCount_str().trim())){ 
											 String  intStr=att_AgWorkInfo.getActualCount_str().trim();
											 String[]  arrayStr=intStr.split(","); 
											 
											  if(arrayStr.length>0){
												 sbuffer.append(" and ( ");
												 for(int i=0;i<arrayStr.length;i++){
													 String did=arrayStr[i];
													 if(i==arrayStr.length-1){
														 sbuffer.append("  actualCount="+did+"   "); 
													 }else {
													 sbuffer.append("  actualCount="+did+" or "); 
													 }
												 }
												 sbuffer.append(" ) "); 
											 }
											   
								 	}
								 		//时间类型开始条件处理  创建时间(createDate)
									  if(att_AgWorkInfo.getCreateDate_start()!=null){
								   	    	sbuffer.append( " and  createDate<='" +att_AgWorkInfo.getCreateDate_start()+"'" );  
										 }
								 	  //时间类型结束条件处理 创建时间(createDate)
									 	if(att_AgWorkInfo.getCreateDate_end()!=null){
						   	      			sbuffer.append( " and  createDate>'" +att_AgWorkInfo.getCreateDate_end()+"'" );  
								  	     } 
								 		//时间类型开始条件处理  修改时间(editDate)
									  if(att_AgWorkInfo.getEditDate_start()!=null){
								   	    	sbuffer.append( " and  editDate<='" +att_AgWorkInfo.getEditDate_start()+"'" );  
										 }
								 	  //时间类型结束条件处理 修改时间(editDate)
									 	if(att_AgWorkInfo.getEditDate_end()!=null){
						   	      			sbuffer.append( " and  editDate>'" +att_AgWorkInfo.getEditDate_end()+"'" );  
								  	     } 
			 //*****************无关字段处理end*****************
			 //*****************数据库字段处理begin*************
								  		//排班ID(shiftPlanId)
					 					if(att_AgWorkInfo.getShiftPlanId()!=null){
											 sbuffer.append( " and shiftPlanId=" +att_AgWorkInfo.getShiftPlanId() );
										 }
								  		//科室ID(departmentId)
					 					if(att_AgWorkInfo.getDepartmentId()!=null){
											 sbuffer.append( " and departmentId=" +att_AgWorkInfo.getDepartmentId() );
										 }
								  		//医院ID(organizationId)
					 					if(att_AgWorkInfo.getOrganizationId()!=null){
											 sbuffer.append( " and organizationId=" +att_AgWorkInfo.getOrganizationId() );
										 }
								  		//医生ID(doctorId)
					 					if(att_AgWorkInfo.getDoctorId()!=null){
											 sbuffer.append( " and doctorId=" +att_AgWorkInfo.getDoctorId() );
										 }
								  		//排班时间ID(shiftPeriodId)
					 					if(att_AgWorkInfo.getShiftPeriodId()!=null){
											 sbuffer.append( " and shiftPeriodId=" +att_AgWorkInfo.getShiftPeriodId() );
										 }
					       				//日期(planDate)		 					 
									 if(att_AgWorkInfo.getPlanDate()!=null&&
									  !"".equals(att_AgWorkInfo.getPlanDate().trim())){
										  if(likeStr!=null&&!"".equals(likeStr.trim())&&likeStr.indexOf("planDate")!=-1){
											  sbuffer.append( " and planDate  like '%"+att_AgWorkInfo.getPlanDate()+"%'"   );
										  }else {
											  sbuffer.append( " and planDate   in ("+att_AgWorkInfo.getPlanDate()+")"   );
										  }
									 }
								  		//计划接待数(planCount)
					 					if(att_AgWorkInfo.getPlanCount()!=null){
											 sbuffer.append( " and planCount=" +att_AgWorkInfo.getPlanCount() );
										 }
								  		
					       				//状态:0启用；1禁用(status)		 					 
									 if(att_AgWorkInfo.getStatus()!=null&&
									  !"".equals(att_AgWorkInfo.getStatus().trim())){
										  if(likeStr!=null&&!"".equals(likeStr.trim())&&likeStr.indexOf("status")!=-1){
											  sbuffer.append( " and status  like '%"+att_AgWorkInfo.getStatus()+"%'"   );
										  }else {
											  sbuffer.append( " and status   ='"+att_AgWorkInfo.getStatus()+"'"   );
										  }
									 }
					       				//创建人(createRen)		 					 
									 if(att_AgWorkInfo.getCreateRen()!=null&&
									  !"".equals(att_AgWorkInfo.getCreateRen().trim())){
										  if(likeStr!=null&&!"".equals(likeStr.trim())&&likeStr.indexOf("createRen")!=-1){
											  sbuffer.append( " and createRen  like '%"+att_AgWorkInfo.getCreateRen()+"%'"   );
										  }else {
											  sbuffer.append( " and createRen   ='"+att_AgWorkInfo.getCreateRen()+"'"   );
										  }
									 }
						   				//创建时间(createDate)
						 				if(att_AgWorkInfo.getCreateDate()!=null){
						   	                   sbuffer.append( " and  createDate='" +att_AgWorkInfo.getCreateDate()+"'" );  
								  		}
					       				//修改人(editRen)		 					 
									 if(att_AgWorkInfo.getEditRen()!=null&&
									  !"".equals(att_AgWorkInfo.getEditRen().trim())){
										  if(likeStr!=null&&!"".equals(likeStr.trim())&&likeStr.indexOf("editRen")!=-1){
											  sbuffer.append( " and editRen  like '%"+att_AgWorkInfo.getEditRen()+"%'"   );
										  }else {
											  sbuffer.append( " and editRen   ='"+att_AgWorkInfo.getEditRen()+"'"   );
										  }
									 }
						   				//修改时间(editDate)
						 				if(att_AgWorkInfo.getEditDate()!=null){
						   	                   sbuffer.append( " and  editDate='" +att_AgWorkInfo.getEditDate()+"'" );  
								  		}
			 //*****************数据库字段处理end***************
			  		if(orderStr!=null&&!"".equals(orderStr.trim())){
									 sbuffer.append( " order by "+orderStr);
						 }
						 /*
						 else {
							  sbuffer.append( " order by  ShiftPlanId   desc " );
					      }
					      */
			 
			 return  sbuffer.toString();
	}
	@Override
	public List<AgWorkView> getAgWorkViewList(AgWorkView att_AgWorkView) throws HSKDBException {
		String hql="from AgWorkView where 1=1";
		if(att_AgWorkView.getOrganizationId()!=null)
			hql += " and organizationId="+att_AgWorkView.getOrganizationId();
		if(att_AgWorkView.getDepartmentId()!=null)
			hql += " and departmentId="+att_AgWorkView.getDepartmentId();
		if(att_AgWorkView.getDoctorId()!=null)
			hql += " and doctorId="+att_AgWorkView.getDoctorId();
		if(att_AgWorkView.getShiftStart_start()!=null && !att_AgWorkView.getShiftStart_start().trim().equals(""))
			hql +=" and shiftStart > '"+att_AgWorkView.getShiftStart_start()+"'" ;
		if(att_AgWorkView.getShiftStart_end()!=null && !att_AgWorkView.getShiftStart_end().trim().equals(""))
			hql +=" and shiftStart <= '"+att_AgWorkView.getShiftStart_end()+"'" ;
		if(att_AgWorkView.getShiftEnd_start()!=null && !att_AgWorkView.getShiftEnd_start().trim().equals(""))
			hql +=" and shiftEnd > '"+att_AgWorkView.getShiftEnd_start()+"'" ;
		if(att_AgWorkView.getShiftEnd_end()!=null && !att_AgWorkView.getShiftEnd_end().trim().equals(""))
			hql +=" and shiftEnd <= '"+att_AgWorkView.getShiftEnd_end()+"'" ;
		if(att_AgWorkView.getDocIds()!=null && !att_AgWorkView.getDocIds().trim().equals(""))
			hql +=" and doctorId in ("+att_AgWorkView.getDocIds()+")" ;
		List<AgWorkView> list=this.getHibernateTemplate().find(hql);
		return  list;
	}
}