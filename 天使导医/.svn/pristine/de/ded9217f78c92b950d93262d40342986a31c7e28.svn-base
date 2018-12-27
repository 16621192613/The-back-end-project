package com.hsk.angeldoctor.api.daobbase.imp;

import java.util.*;
import com.hsk.supper.dto.comm.PagerModel;
import org.springframework.stereotype.*;
import com.hsk.exception.HSKDBException;
import com.hsk.supper.dao.imp.SupperDao;
import com.hsk.angeldoctor.api.daobbase.*;
import com.hsk.angeldoctor.api.persistence.*;

/** 
 * sys_role_channel_gx表数据库层面操作实现类 
 * @author  作者:admin
 * @version  版本信息:v1.0   创建时间: 2018-08-14 13:40:22
 */
@Component
public class  SysRoleChannelGxDao extends SupperDao implements ISysRoleChannelGxDao {	

	/**
	 * 根据sys_role_channel_gx表主键查找SysRoleChannelGx对象记录
	 * 
	 * @param  SrcgId  Integer类型(sys_role_channel_gx表主键)
	 * @return SysRoleChannelGx sys_role_channel_gx表记录
	 * @throws HSKDBException
	 */	
	public SysRoleChannelGx findSysRoleChannelGxById(Integer SrcgId) throws HSKDBException{
				SysRoleChannelGx  att_SysRoleChannelGx=new SysRoleChannelGx();				
				if(SrcgId!=null){
					att_SysRoleChannelGx.setSrcgId(SrcgId);	
				    Object obj=	this.getOne(att_SysRoleChannelGx);
					if(obj!=null){
						att_SysRoleChannelGx=(SysRoleChannelGx) obj;
					}
				}
				return  att_SysRoleChannelGx;
	}
	 /**
	  * 根据sys_role_channel_gx表主键删除SysRoleChannelGx对象记录
	  * @param  SrcgId  Integer类型(sys_role_channel_gx表主键)
	  * @throws HSKDBException
	  */
	public void deleteSysRoleChannelGxById(Integer SrcgId) throws HSKDBException{ 
		 SysRoleChannelGx  att_SysRoleChannelGx=new SysRoleChannelGx();	
		  if(SrcgId!=null){
					  att_SysRoleChannelGx.setSrcgId(SrcgId);
				  	  Object obj=	this.getOne(att_SysRoleChannelGx);
					  if(obj!=null){
							this.deleteObject(obj); 
					  }
			}
	}

	/**
 	 * 根据sys_role_channel_gx表主键修改SysRoleChannelGx对象记录
     * @param  SrcgId  Integer类型(sys_role_channel_gx表主键)
     * @param  att_SysRoleChannelGx  SysRoleChannelGx类型(sys_role_channel_gx表记录)
     * @return SysRoleChannelGx  修改后的SysRoleChannelGx对象记录
	 * @throws HSKDBException
	 */
	public  SysRoleChannelGx updateSysRoleChannelGxById(Integer SrcgId,SysRoleChannelGx att_SysRoleChannelGx) throws HSKDBException{
		  if(SrcgId!=null){
					att_SysRoleChannelGx.setSrcgId(SrcgId);
				   	Object obj=	this.getOne(att_SysRoleChannelGx);
					if(obj!=null){							 
							this.updateObject(obj);
					}
			}
			return  att_SysRoleChannelGx;
	}
	
	/**
	 * 新增sys_role_channel_gx表 记录
     * @param  att_SysRoleChannelGx  SysRoleChannelGx类型(sys_role_channel_gx表记录)
	 * @throws HSKDBException
	 */
	public Integer saveSysRoleChannelGx(SysRoleChannelGx att_SysRoleChannelGx) throws HSKDBException{
		 return this.newObject(att_SysRoleChannelGx);
	} 
		
	/**
	 * 新增或修改sys_role_channel_gx表记录 ,如果sys_role_channel_gx表主键SysRoleChannelGx.SrcgId为空就是添加，如果非空就是修改
     * @param  att_SysRoleChannelGx  SysRoleChannelGx类型(sys_role_channel_gx表记录)
	 * @throws HSKDBException
	 */
	public  SysRoleChannelGx saveOrUpdateSysRoleChannelGx(SysRoleChannelGx att_SysRoleChannelGx) throws HSKDBException{
		  this.getHibernateTemplate().saveOrUpdate(att_SysRoleChannelGx);
		  return att_SysRoleChannelGx;
	}
	
	/**
	 *根据SysRoleChannelGx对象作为对(sys_role_channel_gx表进行查询，获取列表对象
     * @param  att_SysRoleChannelGx  SysRoleChannelGx类型(sys_role_channel_gx表记录)
     * @return List<SysRoleChannelGx>  列表对象
	 * @throws HSKDBException 
	 */
	 @SuppressWarnings("unchecked")
	public List<SysRoleChannelGx> getListBySysRoleChannelGx(SysRoleChannelGx att_SysRoleChannelGx) throws HSKDBException{
		String Hql=this.getHql( att_SysRoleChannelGx); 
		List<SysRoleChannelGx> list=this.getHibernateTemplate().find(Hql);
		return  list;
	}
	/**
	 *根据SysRoleChannelGx对象作为对(sys_role_channel_gx表进行查询，获取分页对象
     * @param  att_SysRoleChannelGx  SysRoleChannelGx类型(sys_role_channel_gx表记录)
     * @return List<SysRoleChannelGx>  分页对象
	 * @throws HSKDBException 
	 */
	public PagerModel getPagerModelBySysRoleChannelGx(SysRoleChannelGx att_SysRoleChannelGx)
			throws HSKDBException {
		String Hql=this.getHql(att_SysRoleChannelGx);
		return this.getHibernateDao().findByPage(Hql); 
	} 
	/**
	 * 根据SysRoleChannelGx对象获取Hql字符串
     * @param  att_SysRoleChannelGx  SysRoleChannelGx类型(sys_role_channel_gx表记录)
	 *  @return hql字符串
	 */
	private String  getHql(SysRoleChannelGx att_SysRoleChannelGx){
			 StringBuffer sbuffer = new StringBuffer( " from  SysRoleChannelGx  where  1=1  ");
			 String likeStr=  att_SysRoleChannelGx.getTab_like();
			 String orderStr= att_SysRoleChannelGx.getTab_order();
			 
			 //*****************无关字段处理begin*****************
						   		 //处理in条件 角色频道关系ID(srcgId)
							     if(att_SysRoleChannelGx.getSrcgId_str()!=null&&
						   		    !"".equals(att_SysRoleChannelGx.getSrcgId_str().trim())){ 
											 String  intStr=att_SysRoleChannelGx.getSrcgId_str().trim();
											 String[]  arrayStr=intStr.split(","); 
											 
											  if(arrayStr.length>0){
												 sbuffer.append(" and ( ");
												 for(int i=0;i<arrayStr.length;i++){
													 String did=arrayStr[i];
													 if(i==arrayStr.length-1){
														 sbuffer.append("  srcgId="+did+"   "); 
													 }else {
													 sbuffer.append("  srcgId="+did+" or "); 
													 }
												 }
												 sbuffer.append(" ) "); 
											 }
											   
								 	}
						   		 //处理in条件 频道ID(menuId)
							     if(att_SysRoleChannelGx.getMenuId_str()!=null&&
						   		    !"".equals(att_SysRoleChannelGx.getMenuId_str().trim())){ 
											 String  intStr=att_SysRoleChannelGx.getMenuId_str().trim();
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
						   		 //处理in条件 角色id(sroleId)
							     if(att_SysRoleChannelGx.getSroleId_str()!=null&&
						   		    !"".equals(att_SysRoleChannelGx.getSroleId_str().trim())){ 
											 String  intStr=att_SysRoleChannelGx.getSroleId_str().trim();
											 String[]  arrayStr=intStr.split(","); 
											 
											  if(arrayStr.length>0){
												 sbuffer.append(" and ( ");
												 for(int i=0;i<arrayStr.length;i++){
													 String did=arrayStr[i];
													 if(i==arrayStr.length-1){
														 sbuffer.append("  sroleId="+did+"   "); 
													 }else {
													 sbuffer.append("  sroleId="+did+" or "); 
													 }
												 }
												 sbuffer.append(" ) "); 
											 }
											   
								 	}
			 //*****************无关字段处理end*****************
			 //*****************数据库字段处理begin*************
								  		//角色频道关系ID(srcgId)
					 					if(att_SysRoleChannelGx.getSrcgId()!=null){
											 sbuffer.append( " and srcgId=" +att_SysRoleChannelGx.getSrcgId() );
										 }
								  		//频道ID(menuId)
					 					if(att_SysRoleChannelGx.getMenuId()!=null){
											 sbuffer.append( " and menuId=" +att_SysRoleChannelGx.getMenuId() );
										 }
								  		//角色id(sroleId)
					 					if(att_SysRoleChannelGx.getSroleId()!=null){
											 sbuffer.append( " and sroleId=" +att_SysRoleChannelGx.getSroleId() );
										 }
			 //*****************数据库字段处理end***************
			  		if(orderStr!=null&&!"".equals(orderStr.trim())){
									 sbuffer.append( " order by "+orderStr);
						 }
						 /*
						 else {
							  sbuffer.append( " order by  SrcgId   desc " );
					      }
					      */
			 
			 return  sbuffer.toString();
	}
	@Override
	public void delBySysRoleChannelGxByIds(String Ids) throws HSKDBException {
		String sql="delete from sys_role_channel_gx where srcg_id in ("+Ids+")";
		this.getJdbcDao().execute(sql);
	}
}