package com.hsk.angeldoctor.api.daobbase;

import java.util.*;
import com.hsk.angeldoctor.api.persistence.*;
import com.hsk.exception.HSKDBException;
import com.hsk.supper.dto.comm.PagerModel;

/**
 * ag_hospital_menu表数据库层面操作接口类 
 * @author  作者:admin
 * @version  版本信息:v1.0   创建时间: 2018-08-14 13:28:00
 */
public interface IAgHospitalMenuDao{
	
	/**
	 * 根据ag_hospital_menu表主键查找AgHospitalMenu对象记录
	 * @param  MenuId  Integer类型(ag_hospital_menu表主键)
	 * @return AgHospitalMenu ag_hospital_menu表记录
	 * @throws HSKDBException
	 */	
	public AgHospitalMenu findAgHospitalMenuById(Integer MenuId) throws HSKDBException;
	
	/**
	 * 根据ag_hospital_menu表主键删除AgHospitalMenu对象记录
     * @param  MenuId  Integer类型(ag_hospital_menu表主键)
	 * @throws HSKDBException
	 */
	public void deleteAgHospitalMenuById(Integer MenuId) throws HSKDBException;
	 
	/**
 	 * 根据ag_hospital_menu表主键修改AgHospitalMenu对象记录
	 * @param  MenuId  Integer类型(ag_hospital_menu表主键)
	 * @param  att_AgHospitalMenu  AgHospitalMenu类型(ag_hospital_menu表记录)
	 * @return AgHospitalMenu  修改后的AgHospitalMenu对象记录
	 * @throws HSKDBException
	 */
	public  AgHospitalMenu updateAgHospitalMenuById(Integer MenuId,AgHospitalMenu att_AgHospitalMenu) throws HSKDBException;
	
	/**
	 * 新增ag_hospital_menu表 记录
     * @param  att_AgHospitalMenu  AgHospitalMenu类型(ag_hospital_menu表记录)
     * @return ag_hospital_menu表主键值
	 * @throws HSKDBException
	 */
	public Integer saveAgHospitalMenu(AgHospitalMenu att_AgHospitalMenu) throws HSKDBException;
	
	 /**
	 * 新增或修改ag_hospital_menu表记录 ,如果ag_hospital_menu表主键AgHospitalMenu.MenuId为空就是添加，如果非空就是修改
     * @param  att_AgHospitalMenu  AgHospitalMenu类型(ag_hospital_menu表记录)
     * @return AgHospitalMenu  修改后的AgHospitalMenu对象记录
	 * @throws HSKDBException
	 */
	public  AgHospitalMenu saveOrUpdateAgHospitalMenu( AgHospitalMenu att_AgHospitalMenu) throws HSKDBException;
	
	/**
	 *根据AgHospitalMenu对象作为对(ag_hospital_menu表进行查询，获取分页对象
     * @param  att_AgHospitalMenu  AgHospitalMenu类型(ag_hospital_menu表记录)
     * @return PagerModel  分页对象
	 * @throws HSKDBException 
	 */
	public PagerModel getPagerModelByAgHospitalMenu (AgHospitalMenu att_AgHospitalMenu) throws HSKDBException;
	
    /**
	 *根据AgHospitalMenu对象作为对(ag_hospital_menu表进行查询，获取分页对象
     * @param  att_AgHospitalMenu  AgHospitalMenu类型(ag_hospital_menu表记录)
     * @return List<AgHospitalMenu>  列表对象
	 * @throws HSKDBException 
	 */
	public List<AgHospitalMenu> getListByAgHospitalMenu ( AgHospitalMenu att_AgHospitalMenu) throws HSKDBException;

}