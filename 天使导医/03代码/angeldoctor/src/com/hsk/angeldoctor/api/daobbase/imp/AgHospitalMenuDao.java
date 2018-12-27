package com.hsk.angeldoctor.api.daobbase.imp;

import java.util.*;
import com.hsk.supper.dto.comm.PagerModel;
import org.springframework.stereotype.*;
import com.hsk.exception.HSKDBException;
import com.hsk.supper.dao.imp.SupperDao;
import com.hsk.angeldoctor.api.daobbase.*;
import com.hsk.angeldoctor.api.persistence.*;

/** 
 * ag_hospital_menu表数据库层面操作实现类 
 * @author  作者:admin
 * @version  版本信息:v1.0   创建时间: 2018-08-14 13:28:00
 */
@Component
public class  AgHospitalMenuDao extends SupperDao implements IAgHospitalMenuDao {	

	/**
	 * 根据ag_hospital_menu表主键查找AgHospitalMenu对象记录
	 * 
	 * @param  MenuId  Integer类型(ag_hospital_menu表主键)
	 * @return AgHospitalMenu ag_hospital_menu表记录
	 * @throws HSKDBException
	 */	
	public AgHospitalMenu findAgHospitalMenuById(Integer MenuId) throws HSKDBException{
				AgHospitalMenu  att_AgHospitalMenu=new AgHospitalMenu();				
				if(MenuId!=null){
					att_AgHospitalMenu.setMenuId(MenuId);	
				    Object obj=	this.getOne(att_AgHospitalMenu);
					if(obj!=null){
						att_AgHospitalMenu=(AgHospitalMenu) obj;
					}
				}
				return  att_AgHospitalMenu;
	}
	 /**
	  * 根据ag_hospital_menu表主键删除AgHospitalMenu对象记录
	  * @param  MenuId  Integer类型(ag_hospital_menu表主键)
	  * @throws HSKDBException
	  */
	public void deleteAgHospitalMenuById(Integer MenuId) throws HSKDBException{ 
		 AgHospitalMenu  att_AgHospitalMenu=new AgHospitalMenu();	
		  if(MenuId!=null){
					  att_AgHospitalMenu.setMenuId(MenuId);
				  	  Object obj=	this.getOne(att_AgHospitalMenu);
					  if(obj!=null){
							this.deleteObject(obj); 
					  }
			}
	}

	/**
 	 * 根据ag_hospital_menu表主键修改AgHospitalMenu对象记录
     * @param  MenuId  Integer类型(ag_hospital_menu表主键)
     * @param  att_AgHospitalMenu  AgHospitalMenu类型(ag_hospital_menu表记录)
     * @return AgHospitalMenu  修改后的AgHospitalMenu对象记录
	 * @throws HSKDBException
	 */
	public  AgHospitalMenu updateAgHospitalMenuById(Integer MenuId,AgHospitalMenu att_AgHospitalMenu) throws HSKDBException{
		  if(MenuId!=null){
					att_AgHospitalMenu.setMenuId(MenuId);
				   	Object obj=	this.getOne(att_AgHospitalMenu);
					if(obj!=null){							 
							this.updateObject(obj);
					}
			}
			return  att_AgHospitalMenu;
	}
	
	/**
	 * 新增ag_hospital_menu表 记录
     * @param  att_AgHospitalMenu  AgHospitalMenu类型(ag_hospital_menu表记录)
	 * @throws HSKDBException
	 */
	public Integer saveAgHospitalMenu(AgHospitalMenu att_AgHospitalMenu) throws HSKDBException{
		 return this.newObject(att_AgHospitalMenu);
	} 
		
	/**
	 * 新增或修改ag_hospital_menu表记录 ,如果ag_hospital_menu表主键AgHospitalMenu.MenuId为空就是添加，如果非空就是修改
     * @param  att_AgHospitalMenu  AgHospitalMenu类型(ag_hospital_menu表记录)
	 * @throws HSKDBException
	 */
	public  AgHospitalMenu saveOrUpdateAgHospitalMenu(AgHospitalMenu att_AgHospitalMenu) throws HSKDBException{
		  this.getHibernateTemplate().saveOrUpdate(att_AgHospitalMenu);
		  return att_AgHospitalMenu;
	}
	
	/**
	 *根据AgHospitalMenu对象作为对(ag_hospital_menu表进行查询，获取列表对象
     * @param  att_AgHospitalMenu  AgHospitalMenu类型(ag_hospital_menu表记录)
     * @return List<AgHospitalMenu>  列表对象
	 * @throws HSKDBException 
	 */
	 @SuppressWarnings("unchecked")
	public List<AgHospitalMenu> getListByAgHospitalMenu(AgHospitalMenu att_AgHospitalMenu) throws HSKDBException{
		String Hql=this.getHql( att_AgHospitalMenu); 
		List<AgHospitalMenu> list=this.getHibernateTemplate().find(Hql);
		return  list;
	}
	/**
	 *根据AgHospitalMenu对象作为对(ag_hospital_menu表进行查询，获取分页对象
     * @param  att_AgHospitalMenu  AgHospitalMenu类型(ag_hospital_menu表记录)
     * @return List<AgHospitalMenu>  分页对象
	 * @throws HSKDBException 
	 */
	public PagerModel getPagerModelByAgHospitalMenu(AgHospitalMenu att_AgHospitalMenu)
			throws HSKDBException {
		String Hql=this.getHql(att_AgHospitalMenu);
		return this.getHibernateDao().findByPage(Hql); 
	} 
	/**
	 * 根据AgHospitalMenu对象获取Hql字符串
     * @param  att_AgHospitalMenu  AgHospitalMenu类型(ag_hospital_menu表记录)
	 *  @return hql字符串
	 */
	private String  getHql(AgHospitalMenu att_AgHospitalMenu){
			 StringBuffer sbuffer = new StringBuffer( " from  AgHospitalMenu  where  1=1  ");
			 String likeStr=  att_AgHospitalMenu.getTab_like();
			 String orderStr= att_AgHospitalMenu.getTab_order();
			 
			 //*****************无关字段处理begin*****************
						   		 //处理in条件 医院菜单ID(menuId)
							     if(att_AgHospitalMenu.getMenuId_str()!=null&&
						   		    !"".equals(att_AgHospitalMenu.getMenuId_str().trim())){ 
											 String  intStr=att_AgHospitalMenu.getMenuId_str().trim();
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
						   		 //处理in条件 上级菜单ID(parentId)
							     if(att_AgHospitalMenu.getParentId_str()!=null&&
						   		    !"".equals(att_AgHospitalMenu.getParentId_str().trim())){ 
											 String  intStr=att_AgHospitalMenu.getParentId_str().trim();
											 String[]  arrayStr=intStr.split(","); 
											 
											  if(arrayStr.length>0){
												 sbuffer.append(" and ( ");
												 for(int i=0;i<arrayStr.length;i++){
													 String did=arrayStr[i];
													 if(i==arrayStr.length-1){
														 sbuffer.append("  parentId="+did+"   "); 
													 }else {
													 sbuffer.append("  parentId="+did+" or "); 
													 }
												 }
												 sbuffer.append(" ) "); 
											 }
											   
								 	}
						   		 //处理in条件 序号(orderNum)
							     if(att_AgHospitalMenu.getOrderNum_str()!=null&&
						   		    !"".equals(att_AgHospitalMenu.getOrderNum_str().trim())){ 
											 String  intStr=att_AgHospitalMenu.getOrderNum_str().trim();
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
								  		//医院菜单ID(menuId)
					 					if(att_AgHospitalMenu.getMenuId()!=null){
											 sbuffer.append( " and menuId=" +att_AgHospitalMenu.getMenuId() );
										 }
								  		//上级菜单ID(parentId)
					 					if(att_AgHospitalMenu.getParentId()!=null){
											 sbuffer.append( " and parentId=" +att_AgHospitalMenu.getParentId() );
										 }
					       				//菜单名称(name)		 					 
									 if(att_AgHospitalMenu.getName()!=null&&
									  !"".equals(att_AgHospitalMenu.getName().trim())){
										  if(likeStr!=null&&!"".equals(likeStr.trim())&&likeStr.indexOf("name")!=-1){
											  sbuffer.append( " and name  like '%"+att_AgHospitalMenu.getName()+"%'"   );
										  }else {
											  sbuffer.append( " and name   ='"+att_AgHospitalMenu.getName()+"'"   );
										  }
									 }
					       				//上级菜单名称(parentName)		 					 
									 if(att_AgHospitalMenu.getParentName()!=null&&
									  !"".equals(att_AgHospitalMenu.getParentName().trim())){
										  if(likeStr!=null&&!"".equals(likeStr.trim())&&likeStr.indexOf("parentName")!=-1){
											  sbuffer.append( " and parentName  like '%"+att_AgHospitalMenu.getParentName()+"%'"   );
										  }else {
											  sbuffer.append( " and parentName   ='"+att_AgHospitalMenu.getParentName()+"'"   );
										  }
									 }
								  		//序号(orderNum)
					 					if(att_AgHospitalMenu.getOrderNum()!=null){
											 sbuffer.append( " and orderNum=" +att_AgHospitalMenu.getOrderNum() );
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