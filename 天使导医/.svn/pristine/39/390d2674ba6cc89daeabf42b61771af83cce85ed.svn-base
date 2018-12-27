package com.hsk.angeldoctor.api.daobbase;

import java.util.*;

import com.hsk.angeldoctor.api.persistence.*;
import com.hsk.exception.HSKDBException;
import com.hsk.supper.dto.comm.PagerModel;

/**
 * ag_hospital_info表数据库层面操作接口类 
 * @author  作者:admin
 * @version  版本信息:v1.0   创建时间: 2018-08-14 13:28:00
 */
public interface IAgHospitalInfoDao{
	public List<Map<String, Object>> getOrganizationId(String token) throws HSKDBException;
	
	/**
	 * 根据ag_hospital_info表主键查找AgHospitalInfo对象记录
	 * @param  OrganizationId  Integer类型(ag_hospital_info表主键)
	 * @return AgHospitalInfo ag_hospital_info表记录
	 * @throws HSKDBException
	 */	
	public AgHospitalInfo findAgHospitalInfoById(Integer OrganizationId) throws HSKDBException;
	
	/**
	 * 根据ag_hospital_info表主键删除AgHospitalInfo对象记录
     * @param  OrganizationId  Integer类型(ag_hospital_info表主键)
	 * @throws HSKDBException
	 */
	public void deleteAgHospitalInfoById(Integer OrganizationId) throws HSKDBException;
	 
	/**
 	 * 根据ag_hospital_info表主键修改AgHospitalInfo对象记录
	 * @param  OrganizationId  Integer类型(ag_hospital_info表主键)
	 * @param  att_AgHospitalInfo  AgHospitalInfo类型(ag_hospital_info表记录)
	 * @return AgHospitalInfo  修改后的AgHospitalInfo对象记录
	 * @throws HSKDBException
	 */
	public  AgHospitalInfo updateAgHospitalInfoById(Integer OrganizationId,AgHospitalInfo att_AgHospitalInfo) throws HSKDBException;
	
	/**
	 * 新增ag_hospital_info表 记录
     * @param  att_AgHospitalInfo  AgHospitalInfo类型(ag_hospital_info表记录)
     * @return ag_hospital_info表主键值
	 * @throws HSKDBException
	 */
	public Integer saveAgHospitalInfo(AgHospitalInfo att_AgHospitalInfo) throws HSKDBException;
	
	 /**
	 * 新增或修改ag_hospital_info表记录 ,如果ag_hospital_info表主键AgHospitalInfo.OrganizationId为空就是添加，如果非空就是修改
     * @param  att_AgHospitalInfo  AgHospitalInfo类型(ag_hospital_info表记录)
     * @return AgHospitalInfo  修改后的AgHospitalInfo对象记录
	 * @throws HSKDBException
	 */
	public  AgHospitalInfo saveOrUpdateAgHospitalInfo( AgHospitalInfo att_AgHospitalInfo) throws HSKDBException;
	
	/**
	 *根据AgHospitalInfo对象作为对(ag_hospital_info表进行查询，获取分页对象
     * @param  att_AgHospitalInfo  AgHospitalInfo类型(ag_hospital_info表记录)
     * @return PagerModel  分页对象
	 * @throws HSKDBException 
	 */
	public PagerModel getPagerModelByAgHospitalInfo (AgHospitalInfo att_AgHospitalInfo) throws HSKDBException;
	
    /**
	 *根据AgHospitalInfo对象作为对(ag_hospital_info表进行查询，获取分页对象
     * @param  att_AgHospitalInfo  AgHospitalInfo类型(ag_hospital_info表记录)
     * @return List<AgHospitalInfo>  列表对象
	 * @throws HSKDBException 
	 */
	public List<AgHospitalInfo> getListByAgHospitalInfo ( AgHospitalInfo att_AgHospitalInfo) throws HSKDBException;
	/**
	 * 获取医院所在省市列表
	 * @return
	 * @throws HSKDBException
	 */
	public List<Map<String,Object>> getProvAndCityList() throws HSKDBException;

}