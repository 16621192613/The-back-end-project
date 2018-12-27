package com.hsk.angeldoctor.api.daobbase.imp;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.List;

import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

import com.hsk.angeldoctor.api.daobbase.IAgIntegralInfoDao;
import com.hsk.angeldoctor.api.persistence.AgIntegralInfo;
import com.hsk.exception.HSKDBException;
import com.hsk.supper.dao.imp.SupperDao;
import com.hsk.supper.dto.comm.PagerModel;

/** 
 * ag_integral_info表数据库层面操作实现类 
 * @author  作者:admin
 * @version  版本信息:v1.0   创建时间: 2018-08-14 13:41:32
 */
@Component
public class  AgIntegralInfoDao extends SupperDao implements IAgIntegralInfoDao {	

	/**
	 * 根据ag_integral_info表主键查找AgIntegralInfo对象记录
	 * 
	 * @param  AiiId  Integer类型(ag_integral_info表主键)
	 * @return AgIntegralInfo ag_integral_info表记录
	 * @throws HSKDBException
	 */	
	public AgIntegralInfo findAgIntegralInfoById(Integer AiiId) throws HSKDBException{
				AgIntegralInfo  att_AgIntegralInfo=new AgIntegralInfo();				
				if(AiiId!=null){
					att_AgIntegralInfo.setAiiId(AiiId);	
				    Object obj=	this.getOne(att_AgIntegralInfo);
					if(obj!=null){
						att_AgIntegralInfo=(AgIntegralInfo) obj;
					}
				}
				return  att_AgIntegralInfo;
	}
	 /**
	  * 根据ag_integral_info表主键删除AgIntegralInfo对象记录
	  * @param  AiiId  Integer类型(ag_integral_info表主键)
	  * @throws HSKDBException
	  */
	public void deleteAgIntegralInfoById(Integer AiiId) throws HSKDBException{ 
		 AgIntegralInfo  att_AgIntegralInfo=new AgIntegralInfo();	
		  if(AiiId!=null){
					  att_AgIntegralInfo.setAiiId(AiiId);
				  	  Object obj=	this.getOne(att_AgIntegralInfo);
					  if(obj!=null){
							this.deleteObject(obj); 
					  }
			}
	}

	/**
 	 * 根据ag_integral_info表主键修改AgIntegralInfo对象记录
     * @param  AiiId  Integer类型(ag_integral_info表主键)
     * @param  att_AgIntegralInfo  AgIntegralInfo类型(ag_integral_info表记录)
     * @return AgIntegralInfo  修改后的AgIntegralInfo对象记录
	 * @throws HSKDBException
	 */
	public  AgIntegralInfo updateAgIntegralInfoById(Integer AiiId,AgIntegralInfo att_AgIntegralInfo) throws HSKDBException{
		  if(AiiId!=null){
					att_AgIntegralInfo.setAiiId(AiiId);
				   	Object obj=	this.getOne(att_AgIntegralInfo);
					if(obj!=null){							 
							this.updateObject(obj);
					}
			}
			return  att_AgIntegralInfo;
	}
	
	/**
	 * 新增ag_integral_info表 记录
     * @param  att_AgIntegralInfo  AgIntegralInfo类型(ag_integral_info表记录)
	 * @throws HSKDBException
	 */
	public Integer saveAgIntegralInfo(AgIntegralInfo att_AgIntegralInfo) throws HSKDBException{
		 return this.newObject(att_AgIntegralInfo);
	} 
		
	/**
	 * 新增或修改ag_integral_info表记录 ,如果ag_integral_info表主键AgIntegralInfo.AiiId为空就是添加，如果非空就是修改
     * @param  att_AgIntegralInfo  AgIntegralInfo类型(ag_integral_info表记录)
	 * @throws HSKDBException
	 */
	public  AgIntegralInfo saveOrUpdateAgIntegralInfo(AgIntegralInfo att_AgIntegralInfo) throws HSKDBException{
		  this.getHibernateTemplate().saveOrUpdate(att_AgIntegralInfo);
		  return att_AgIntegralInfo;
	}
	
	/**
	 *根据AgIntegralInfo对象作为对(ag_integral_info表进行查询，获取列表对象
     * @param  att_AgIntegralInfo  AgIntegralInfo类型(ag_integral_info表记录)
     * @return List<AgIntegralInfo>  列表对象
	 * @throws HSKDBException 
	 */
	 @SuppressWarnings("unchecked")
	public List<AgIntegralInfo> getListByAgIntegralInfo(AgIntegralInfo att_AgIntegralInfo) throws HSKDBException{
		String Hql=this.getHql( att_AgIntegralInfo); 
		List<AgIntegralInfo> list=this.getHibernateTemplate().find(Hql);
		return  list;
	}
	/**
	 *根据AgIntegralInfo对象作为对(ag_integral_info表进行查询，获取分页对象
     * @param  att_AgIntegralInfo  AgIntegralInfo类型(ag_integral_info表记录)
     * @return List<AgIntegralInfo>  分页对象
	 * @throws HSKDBException 
	 */
	public PagerModel getPagerModelByAgIntegralInfo(AgIntegralInfo att_AgIntegralInfo)
			throws HSKDBException {
		String Hql=this.getHql(att_AgIntegralInfo);
		return this.getHibernateDao().findByPage(Hql); 
	} 
	/**
	 * 根据AgIntegralInfo对象获取Hql字符串
     * @param  att_AgIntegralInfo  AgIntegralInfo类型(ag_integral_info表记录)
	 *  @return hql字符串
	 */
	private String  getHql(AgIntegralInfo att_AgIntegralInfo){
			 StringBuffer sbuffer = new StringBuffer( " from  AgIntegralInfo  where  1=1  ");
			 String likeStr=  att_AgIntegralInfo.getTab_like();
			 String orderStr= att_AgIntegralInfo.getTab_order();
			 
			 //*****************无关字段处理begin*****************
						   		 //处理in条件 积分记录ID(aiiId)
							     if(att_AgIntegralInfo.getAiiId_str()!=null&&
						   		    !"".equals(att_AgIntegralInfo.getAiiId_str().trim())){ 
											 String  intStr=att_AgIntegralInfo.getAiiId_str().trim();
											 String[]  arrayStr=intStr.split(","); 
											 
											  if(arrayStr.length>0){
												 sbuffer.append(" and ( ");
												 for(int i=0;i<arrayStr.length;i++){
													 String did=arrayStr[i];
													 if(i==arrayStr.length-1){
														 sbuffer.append("  aiiId="+did+"   "); 
													 }else {
													 sbuffer.append("  aiiId="+did+" or "); 
													 }
												 }
												 sbuffer.append(" ) "); 
											 }
											   
								 	}
						   		 //处理in条件 用户ID(suiId)
							     if(att_AgIntegralInfo.getSuiId_str()!=null&&
						   		    !"".equals(att_AgIntegralInfo.getSuiId_str().trim())){ 
											 String  intStr=att_AgIntegralInfo.getSuiId_str().trim();
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
						   		 //处理in条件 分数(count)
							     if(att_AgIntegralInfo.getCount_str()!=null&&
						   		    !"".equals(att_AgIntegralInfo.getCount_str().trim())){ 
											 String  intStr=att_AgIntegralInfo.getCount_str().trim();
											 String[]  arrayStr=intStr.split(","); 
											 
											  if(arrayStr.length>0){
												 sbuffer.append(" and ( ");
												 for(int i=0;i<arrayStr.length;i++){
													 String did=arrayStr[i];
													 if(i==arrayStr.length-1){
														 sbuffer.append("  count="+did+"   "); 
													 }else {
													 sbuffer.append("  count="+did+" or "); 
													 }
												 }
												 sbuffer.append(" ) "); 
											 }
											   
								 	}
							        SimpleDateFormat sdf= new SimpleDateFormat("yyyy-MM-dd");
								 		//时间类型开始条件处理  创建时间(createDate)
									  if(att_AgIntegralInfo.getCreateDate_start()!=null){
								   	    	sbuffer.append( " and  createDate>='" +sdf.format(att_AgIntegralInfo.getCreateDate_start())+" 00:00:00'" );  
										 }
								 	  //时间类型结束条件处理 创建时间(createDate)
									 	if(att_AgIntegralInfo.getCreateDate_end()!=null){
						   	      			sbuffer.append( " and  createDate<'" +sdf.format(att_AgIntegralInfo.getCreateDate_end())+" 23:59:59'" );  
								  	     } 
									 	
			 //*****************无关字段处理end*****************
			 //*****************数据库字段处理begin*************
								  		//积分记录ID(aiiId)
					 					if(att_AgIntegralInfo.getAiiId()!=null){
											 sbuffer.append( " and aiiId=" +att_AgIntegralInfo.getAiiId() );
										 }
					 					//积分记录ID(aiiId)
					 					if(att_AgIntegralInfo.getUserType()!=null){
											 sbuffer.append( " and userType='" +att_AgIntegralInfo.getUserType()+"'" );
										 }
								  		//用户ID(suiId)
					 					if(att_AgIntegralInfo.getSuiId()!=null){
											 sbuffer.append( " and suiId=" +att_AgIntegralInfo.getSuiId() );
										 }
					 					if(att_AgIntegralInfo.getAppId()!=null){
											 sbuffer.append( " and appId=" +att_AgIntegralInfo.getAppId() );
										 }
					       				//积分来源:1签到；2创建新的代约;3邀请新宣传员;4邀请的新用户注册(source)		 					 
									 if(att_AgIntegralInfo.getSource()!=null&&
									  !"".equals(att_AgIntegralInfo.getSource().trim())){
										  if(likeStr!=null&&!"".equals(likeStr.trim())&&likeStr.indexOf("source")!=-1){
											  sbuffer.append( " and source  like '%"+att_AgIntegralInfo.getSource()+"%'"   );
										  }else {
											  sbuffer.append( " and source   ='"+att_AgIntegralInfo.getSource()+"'"   );
										  }
									 }
					       				//描述(comment)		 					 
									 if(att_AgIntegralInfo.getComment()!=null&&
									  !"".equals(att_AgIntegralInfo.getComment().trim())){
										  if(likeStr!=null&&!"".equals(likeStr.trim())&&likeStr.indexOf("comment")!=-1){
											  sbuffer.append( " and comment  like '%"+att_AgIntegralInfo.getComment()+"%'"   );
										  }else {
											  sbuffer.append( " and comment   ='"+att_AgIntegralInfo.getComment()+"'"   );
										  }
									 }
								  		//分数(count)
					 					if(att_AgIntegralInfo.getCount()!=null){
											 sbuffer.append( " and count=" +att_AgIntegralInfo.getCount() );
										 }
					       				//状态:1正常，2禁用(status)		 					 
									 if(att_AgIntegralInfo.getStatus()!=null&&
									  !"".equals(att_AgIntegralInfo.getStatus().trim())){
										  if(likeStr!=null&&!"".equals(likeStr.trim())&&likeStr.indexOf("status")!=-1){
											  sbuffer.append( " and status  like '%"+att_AgIntegralInfo.getStatus()+"%'"   );
										  }else {
											  sbuffer.append( " and status   ='"+att_AgIntegralInfo.getStatus()+"'"   );
										  }
									 }
						   				//创建时间(createDate)
						 				if(att_AgIntegralInfo.getCreateDate()!=null){
						   	                   sbuffer.append( " and  createDate='" +att_AgIntegralInfo.getCreateDate()+"'" );  
								  		}
			 //*****************数据库字段处理end***************
			  		if(orderStr!=null&&!"".equals(orderStr.trim())){
									 sbuffer.append( " order by "+orderStr);
						 }
						 /*
						 else {
							  sbuffer.append( " order by  AiiId   desc " );
					      }
					      */
			 
			 return  sbuffer.toString();
	}
	
	public Integer getOrderNum( AgIntegralInfo att_AgIntegralInfo) throws HSKDBException{
		 StringBuffer sbuffer = new StringBuffer( " SELECT   sui_id as ID,  SUM(COUNT) AS NUM,  create_date as CDATA FROM  ag_integral_info where 1=1 ");
		  	//时间类型开始条件处理  创建时间(createDate)
		  if(att_AgIntegralInfo.getCreateDate_start()!=null){
	   	    	sbuffer.append( " and  create_date>='" +att_AgIntegralInfo.getCreateDate_start()+"'" );  
			 }
	 	  //时间类型结束条件处理 创建时间(createDate)
		 	if(att_AgIntegralInfo.getCreateDate_end()!=null){
	      			sbuffer.append( " and  create_date<'" +att_AgIntegralInfo.getCreateDate_end()+"'" );  
	  	     } 
		 
		 	sbuffer.append( "  GROUP BY sui_id,  create_date    ORDER BY NUM DESC  " ); 
		 	
		List<AgIntegralInfo> list_obj= this.getJdbcTemplate().query(sbuffer.toString(), 
				 new RowMapper<AgIntegralInfo>() {  
             public AgIntegralInfo mapRow(ResultSet rs, int rowNum) throws SQLException {  
            	 AgIntegralInfo row = new AgIntegralInfo();   
            	 row.setSuiId(  rs.getInt("ID")); 
            	 row.setCount(rs.getInt("NUM"));
            	 row.setCreateDate(rs.getDate("CDATA")); 
                 return row;  
             }  
         } ); 
		int i=0;
		if(list_obj!=null&&list_obj.size()>0){  
			for(AgIntegralInfo did:list_obj){
				i++;
				if(did.getSuiId().equals(att_AgIntegralInfo.getSuiId())){
					return i; 
				}
			} 
		}
		return i;
	}
	
	
}