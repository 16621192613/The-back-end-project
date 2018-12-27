package com.hsk.angeldoctor.web.hospital.service;

import java.util.*;
import com.hsk.angeldoctor.api.persistence.*;
import com.hsk.angeldoctor.api.daobbase.*;
import com.hsk.supper.dto.comm.PagerModel;
import com.hsk.supper.dto.comm.SysRetrunMessage;
import com.hsk.xframe.api.service.IDSTService;
import com.hsk.exception.HSKException;

/**
 * hospital业务操作接口类 
 * @author  作者:admin
 * @version  版本信息:v1.0   创建时间: 2018-08-14 13:28:00
 */
public interface IAgHospitalMenuService extends IDSTService{


		/**
	 * 查找AgHospitalMenu对象记录，用于弹出添加、修改窗口时候初始化数据
	 * @param  menuId  Integer类型(ag_hospital_menu表主键)
	  * @return SysRetrunMessage 对象记录
	 * @throws HSKException
	 */	
	public SysRetrunMessage findFormObject(Integer menuId) throws HSKException;

	
	/**
	 * 查找AgHospitalMenu对象记录，用于弹出添加、修改窗口时候初始化数据
	 * @param  menuId  Integer类型(ag_hospital_menu表主键)
	 * @return AgHospitalMenu ag_hospital_menu表记录
	 * @throws HSKException
	 */	
	public AgHospitalMenu findObject(Integer menuId) throws HSKException;
	
	/**
	 * 根据ag_hospital_menu表主键删除AgHospitalMenu对象记录
     * @param  menuId  Integer类型(ag_hospital_menu表主键)
     * @return SysRetrunMessage 对象记录
	 * @throws HSKException
	 */
	public SysRetrunMessage deleteObject(Integer menuId) throws HSKException;
	
	
	
	/**
	 * 根据ag_hospital_menu表主键删除多条AgHospitalMenu对象记录
     * @param  menuIds  Integer类型(ag_hospital_menu表主键)
     * @return SysRetrunMessage 对象记录
	 * @throws HSKException
	 */
	public SysRetrunMessage deleteAllObject(String menuIds) throws HSKException;
	
	 /**
	 * 新增或修改ag_hospital_menu表记录 ,如果ag_hospital_menu表主键AgHospitalMenu.menuId为空就是添加，如果非空就是修改
     * @param  att_AgHospitalMenu  AgHospitalMenu类型(ag_hospital_menu表记录)
     * @return SysRetrunMessage 对象记录
	 * @throws HSKException
	 */
	public SysRetrunMessage   saveOrUpdateObject( AgHospitalMenu att_AgHospitalMenu) throws HSKException;
	
	/**
	 *根据AgHospitalMenu对象作为对(ag_hospital_menu表进行查询，获取分页对象
     * @param  att_AgHospitalMenu  AgHospitalMenu类型(ag_hospital_menu表记录)
     * @return PagerModel  分页对象
	 * @throws HSKException 
	 */
	public PagerModel getPagerModelObject (AgHospitalMenu att_AgHospitalMenu) throws HSKException;
	
}