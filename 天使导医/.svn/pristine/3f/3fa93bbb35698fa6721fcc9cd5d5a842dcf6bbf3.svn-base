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
public interface IAgHospitalInfoService  extends IDSTService{


		/**
	 * 查找AgHospitalInfo对象记录，用于弹出添加、修改窗口时候初始化数据
	 * @param  organizationId  Integer类型(ag_hospital_info表主键)
	  * @return SysRetrunMessage 对象记录
	 * @throws HSKException
	 */	
	public SysRetrunMessage findFormObject(Integer organizationId) throws HSKException;

	
	/**
	 * 查找AgHospitalInfo对象记录，用于弹出添加、修改窗口时候初始化数据
	 * @param  organizationId  Integer类型(ag_hospital_info表主键)
	 * @return AgHospitalInfo ag_hospital_info表记录
	 * @throws HSKException
	 */	
	public AgHospitalInfo findObject(Integer organizationId) throws HSKException;
	
	/**
	 * 根据ag_hospital_info表主键删除AgHospitalInfo对象记录
     * @param  organizationId  Integer类型(ag_hospital_info表主键)
     * @return SysRetrunMessage 对象记录
	 * @throws HSKException
	 */
	public SysRetrunMessage deleteObject(Integer organizationId) throws HSKException;
	
	
	
	/**
	 * 根据ag_hospital_info表主键删除多条AgHospitalInfo对象记录
     * @param  organizationIds  Integer类型(ag_hospital_info表主键)
     * @return SysRetrunMessage 对象记录
	 * @throws HSKException
	 */
	public SysRetrunMessage deleteAllObject(String organizationIds) throws HSKException;
	
	 /**
	 * 新增或修改ag_hospital_info表记录 ,如果ag_hospital_info表主键AgHospitalInfo.organizationId为空就是添加，如果非空就是修改
     * @param  att_AgHospitalInfo  AgHospitalInfo类型(ag_hospital_info表记录)
     * @return SysRetrunMessage 对象记录
	 * @throws HSKException
	 */
	public SysRetrunMessage   saveOrUpdateObject( AgHospitalInfo att_AgHospitalInfo) throws HSKException;
	
	/**
	 *根据AgHospitalInfo对象作为对(ag_hospital_info表进行查询，获取分页对象
     * @param  att_AgHospitalInfo  AgHospitalInfo类型(ag_hospital_info表记录)
     * @return PagerModel  分页对象
	 * @throws HSKException 
	 */
	public PagerModel getPagerModelObject (AgHospitalInfo att_AgHospitalInfo,String latitude,String longitude,String sort) throws HSKException;
	/**
	 * 根据医生名称获取医院列表
	 * @param att_AgHospitalInfo
	 * @param docName
	 * @return
	 * @throws HSKException
	 */
	public PagerModel getPagerModelByDocName(AgHospitalInfo att_AgHospitalInfo,String docName,String latitude,String longitude,String sort) throws HSKException;
	/**
	 * 根据科室名称获取医院列表
	 * @param att_AgHospitalInfo
	 * @param docName
	 * @return
	 * @throws HSKException
	 */
	public PagerModel getPagerModelByDepName(AgHospitalInfo att_AgHospitalInfo,String depName,String latitude,String longitude,String sort) throws HSKException;
	/**
	 * 获取省市列表
	 * @return
	 * @throws HSKException
	 */
	public List<Map<String,String>> getProvAndCityList() throws HSKException;
	/**
	 * 根据域名获取医院信息
	 * @param domainName
	 * @return
	 * @throws HSKException
	 */
	public AgHospitalInfo getAgHospitalInfoByDomainName(String domainName) throws HSKException;
}