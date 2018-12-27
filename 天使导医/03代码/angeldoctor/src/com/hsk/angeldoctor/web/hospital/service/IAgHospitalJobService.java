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
public interface IAgHospitalJobService extends IDSTService{


		/**
	 * 查找AgHospitalJob对象记录，用于弹出添加、修改窗口时候初始化数据
	 * @param  jobId  Integer类型(ag_hospital_job表主键)
	  * @return SysRetrunMessage 对象记录
	 * @throws HSKException
	 */	
	public SysRetrunMessage findFormObject(Integer jobId) throws HSKException;

	
	/**
	 * 查找AgHospitalJob对象记录，用于弹出添加、修改窗口时候初始化数据
	 * @param  jobId  Integer类型(ag_hospital_job表主键)
	 * @return AgHospitalJob ag_hospital_job表记录
	 * @throws HSKException
	 */	
	public AgHospitalJob findObject(Integer jobId) throws HSKException;
	
	/**
	 * 根据ag_hospital_job表主键删除AgHospitalJob对象记录
     * @param  jobId  Integer类型(ag_hospital_job表主键)
     * @return SysRetrunMessage 对象记录
	 * @throws HSKException
	 */
	public SysRetrunMessage deleteObject(Integer jobId) throws HSKException;
	
	
	
	/**
	 * 根据ag_hospital_job表主键删除多条AgHospitalJob对象记录
     * @param  jobIds  Integer类型(ag_hospital_job表主键)
     * @return SysRetrunMessage 对象记录
	 * @throws HSKException
	 */
	public SysRetrunMessage deleteAllObject(String jobIds) throws HSKException;
	
	 /**
	 * 新增或修改ag_hospital_job表记录 ,如果ag_hospital_job表主键AgHospitalJob.jobId为空就是添加，如果非空就是修改
     * @param  att_AgHospitalJob  AgHospitalJob类型(ag_hospital_job表记录)
     * @return SysRetrunMessage 对象记录
	 * @throws HSKException
	 */
	public SysRetrunMessage   saveOrUpdateObject( AgHospitalJob att_AgHospitalJob) throws HSKException;
	
	/**
	 *根据AgHospitalJob对象作为对(ag_hospital_job表进行查询，获取分页对象
     * @param  att_AgHospitalJob  AgHospitalJob类型(ag_hospital_job表记录)
     * @return PagerModel  分页对象
	 * @throws HSKException 
	 */
	public PagerModel getPagerModelObject (AgHospitalJob att_AgHospitalJob) throws HSKException;
	/**
	 * 根绝角色ID获取所有岗位列表
	 * @param roleId
	 * @return
	 * @throws HSKException
	 */
	public List<AgHospitalJob> getAgHospitalJobListByRoleId (Integer roleId) throws HSKException;
	
}