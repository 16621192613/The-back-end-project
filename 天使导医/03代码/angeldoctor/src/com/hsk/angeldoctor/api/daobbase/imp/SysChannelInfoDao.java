package com.hsk.angeldoctor.api.daobbase.imp;

import java.util.*;
import com.hsk.supper.dto.comm.PagerModel;
import org.springframework.stereotype.*;
import com.hsk.exception.HSKDBException;
import com.hsk.supper.dao.imp.SupperDao;
import com.hsk.angeldoctor.api.daobbase.*;
import com.hsk.angeldoctor.api.persistence.*;

/** 
 * sys_channel_info表数据库层面操作实现类 
 * @author  作者:admin
 * @version  版本信息:v1.0   创建时间: 2018-08-14 13:40:22
 */
@Component
public class  SysChannelInfoDao extends SupperDao implements ISysChannelInfoDao {	

	/**
	 * 根据sys_channel_info表主键查找SysChannelInfo对象记录
	 * 
	 * @param  MenuId  Integer类型(sys_channel_info表主键)
	 * @return SysChannelInfo sys_channel_info表记录
	 * @throws HSKDBException
	 */	
	public SysChannelInfo findSysChannelInfoById(Integer MenuId) throws HSKDBException{
				SysChannelInfo  att_SysChannelInfo=new SysChannelInfo();				
				if(MenuId!=null){
					att_SysChannelInfo.setMenuId(MenuId);	
				    Object obj=	this.getOne(att_SysChannelInfo);
					if(obj!=null){
						att_SysChannelInfo=(SysChannelInfo) obj;
					}
				}
				return  att_SysChannelInfo;
	}
	 /**
	  * 根据sys_channel_info表主键删除SysChannelInfo对象记录
	  * @param  MenuId  Integer类型(sys_channel_info表主键)
	  * @throws HSKDBException
	  */
	public void deleteSysChannelInfoById(Integer MenuId) throws HSKDBException{ 
		 SysChannelInfo  att_SysChannelInfo=new SysChannelInfo();	
		  if(MenuId!=null){
					  att_SysChannelInfo.setMenuId(MenuId);
				  	  Object obj=	this.getOne(att_SysChannelInfo);
					  if(obj!=null){
							this.deleteObject(obj); 
					  }
			}
	}

	/**
 	 * 根据sys_channel_info表主键修改SysChannelInfo对象记录
     * @param  MenuId  Integer类型(sys_channel_info表主键)
     * @param  att_SysChannelInfo  SysChannelInfo类型(sys_channel_info表记录)
     * @return SysChannelInfo  修改后的SysChannelInfo对象记录
	 * @throws HSKDBException
	 */
	public  SysChannelInfo updateSysChannelInfoById(Integer MenuId,SysChannelInfo att_SysChannelInfo) throws HSKDBException{
		  if(MenuId!=null){
					att_SysChannelInfo.setMenuId(MenuId);
				   	Object obj=	this.getOne(att_SysChannelInfo);
					if(obj!=null){							 
							this.updateObject(obj);
					}
			}
			return  att_SysChannelInfo;
	}
	
	/**
	 * 新增sys_channel_info表 记录
     * @param  att_SysChannelInfo  SysChannelInfo类型(sys_channel_info表记录)
	 * @throws HSKDBException
	 */
	public Integer saveSysChannelInfo(SysChannelInfo att_SysChannelInfo) throws HSKDBException{
		 return this.newObject(att_SysChannelInfo);
	} 
		
	/**
	 * 新增或修改sys_channel_info表记录 ,如果sys_channel_info表主键SysChannelInfo.MenuId为空就是添加，如果非空就是修改
     * @param  att_SysChannelInfo  SysChannelInfo类型(sys_channel_info表记录)
	 * @throws HSKDBException
	 */
	public  SysChannelInfo saveOrUpdateSysChannelInfo(SysChannelInfo att_SysChannelInfo) throws HSKDBException{
		  this.getHibernateTemplate().saveOrUpdate(att_SysChannelInfo);
		  return att_SysChannelInfo;
	}
	
	/**
	 *根据SysChannelInfo对象作为对(sys_channel_info表进行查询，获取列表对象
     * @param  att_SysChannelInfo  SysChannelInfo类型(sys_channel_info表记录)
     * @return List<SysChannelInfo>  列表对象
	 * @throws HSKDBException 
	 */
	 @SuppressWarnings("unchecked")
	public List<SysChannelInfo> getListBySysChannelInfo(SysChannelInfo att_SysChannelInfo) throws HSKDBException{
		String Hql=this.getHql( att_SysChannelInfo); 
		List<SysChannelInfo> list=this.getHibernateTemplate().find(Hql);
		return  list;
	}
	/**
	 *根据SysChannelInfo对象作为对(sys_channel_info表进行查询，获取分页对象
     * @param  att_SysChannelInfo  SysChannelInfo类型(sys_channel_info表记录)
     * @return List<SysChannelInfo>  分页对象
	 * @throws HSKDBException 
	 */
	public PagerModel getPagerModelBySysChannelInfo(SysChannelInfo att_SysChannelInfo)
			throws HSKDBException {
		String Hql=this.getHql(att_SysChannelInfo);
		return this.getHibernateDao().findByPage(Hql); 
	} 
	/**
	 * 根据SysChannelInfo对象获取Hql字符串
     * @param  att_SysChannelInfo  SysChannelInfo类型(sys_channel_info表记录)
	 *  @return hql字符串
	 */
	private String  getHql(SysChannelInfo att_SysChannelInfo){
			 StringBuffer sbuffer = new StringBuffer( " from  SysChannelInfo  where  1=1  ");
			 String likeStr=  att_SysChannelInfo.getTab_like();
			 String orderStr= att_SysChannelInfo.getTab_order();
			 
			 //*****************无关字段处理begin*****************
						   		 //处理in条件 频道ID(menuId)
							     if(att_SysChannelInfo.getMenuId_str()!=null&&
						   		    !"".equals(att_SysChannelInfo.getMenuId_str().trim())){ 
											 String  intStr=att_SysChannelInfo.getMenuId_str().trim();
											 String[]  arrayStr=intStr.split(","); 
											 
											  if(arrayStr.length>0){
												 sbuffer.append(" and ( ");
												 for(int i=0;i<arrayStr.length;i++){
													 String did=arrayStr[i];
													 if(i==arrayStr.length-1){
														 sbuffer.append("  menuId="+did+"   "); 
													 }else {
													 sbuffer.append("  menuId="+did+" or "); 
													 }
												 }
												 sbuffer.append(" ) "); 
											 }
											   
								 	}
						   		 //处理in条件 频道顺序(orderNum)
							     if(att_SysChannelInfo.getOrderNum_str()!=null&&
						   		    !"".equals(att_SysChannelInfo.getOrderNum_str().trim())){ 
											 String  intStr=att_SysChannelInfo.getOrderNum_str().trim();
											 String[]  arrayStr=intStr.split(","); 
											 
											  if(arrayStr.length>0){
												 sbuffer.append(" and ( ");
												 for(int i=0;i<arrayStr.length;i++){
													 String did=arrayStr[i];
													 if(i==arrayStr.length-1){
														 sbuffer.append("  orderNum="+did+"   "); 
													 }else {
													 sbuffer.append("  orderNum="+did+" or "); 
													 }
												 }
												 sbuffer.append(" ) "); 
											 }
											   
								 	}
			 //*****************无关字段处理end*****************
			 //*****************数据库字段处理begin*************
								  		//频道ID(menuId)
					 					if(att_SysChannelInfo.getMenuId()!=null){
											 sbuffer.append( " and menuId=" +att_SysChannelInfo.getMenuId() );
										 }
					       				//频道名称(name)		 					 
									 if(att_SysChannelInfo.getName()!=null&&
									  !"".equals(att_SysChannelInfo.getName().trim())){
										  if(likeStr!=null&&!"".equals(likeStr.trim())&&likeStr.indexOf("name")!=-1){
											  sbuffer.append( " and name  like '%"+att_SysChannelInfo.getName()+"%'"   );
										  }else {
											  sbuffer.append( " and name   ='"+att_SysChannelInfo.getName()+"'"   );
										  }
									 }
								  		//频道顺序(orderNum)
					 					if(att_SysChannelInfo.getOrderNum()!=null){
											 sbuffer.append( " and orderNum=" +att_SysChannelInfo.getOrderNum() );
										 }
			 //*****************数据库字段处理end***************
			  		if(orderStr!=null&&!"".equals(orderStr.trim())){
									 sbuffer.append( " order by "+orderStr);
						 }
						 /*
						 else {
							  sbuffer.append( " order by  MenuId   desc " );
					      }
					      */
			 
			 return  sbuffer.toString();
	}
}