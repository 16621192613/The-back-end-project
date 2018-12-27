package com.hsk.angeldoctor.api.daobbase;

import java.util.*;
import com.hsk.angeldoctor.api.persistence.*;
import com.hsk.exception.HSKDBException;
import com.hsk.supper.dto.comm.PagerModel;

/**
 * ag_hospital_job表数据库层面操作接口类 
 * @author  作者:admin
 * @version  版本信息:v1.0   创建时间: 2018-08-14 13:28:00
 */
public interface IAgHospitalJobDao{
	
	/**
	 * 根据ag_hospital_job表主键查找AgHospitalJob对象记录
	 * @param  JobId  Integer类型(ag_hospital_job表主键)
	 * @return AgHospitalJob ag_hospital_job表记录
	 * @throws HSKDBException
	 */	
	public AgHospitalJob findAgHospitalJobById(Integer JobId) throws HSKDBException;
	
	/**
	 * 根据ag_hospital_job表主键删除AgHospitalJob对象记录
     * @param  JobId  Integer类型(ag_hospital_job表主键)
	 * @throws HSKDBException
	 */
	public void deleteAgHospitalJobById(Integer JobId) throws HSKDBException;
	 
	/**
 	 * 根据ag_hospital_job表主键修改AgHospitalJob对象记录
	 * @param  JobId  Integer类型(ag_hospital_job表主键)
	 * @param  att_AgHospitalJob  AgHospitalJob类型(ag_hospital_job表记录)
	 * @return AgHospitalJob  修改后的AgHospitalJob对象记录
	 * @throws HSKDBException
	 */
	public  AgHospitalJob updateAgHospitalJobById(Integer JobId,AgHospitalJob att_AgHospitalJob) throws HSKDBException;
	
	/**
	 * 新增ag_hospital_job表 记录
     * @param  att_AgHospitalJob  AgHospitalJob类型(ag_hospital_job表记录)
     * @return ag_hospital_job表主键值
	 * @throws HSKDBException
	 */
	public Integer saveAgHospitalJob(AgHospitalJob att_AgHospitalJob) throws HSKDBException;
	
	 /**
	 * 新增或修改ag_hospital_job表记录 ,如果ag_hospital_job表主键AgHospitalJob.JobId为空就是添加，如果非空就是修改
     * @param  att_AgHospitalJob  AgHospitalJob类型(ag_hospital_job表记录)
     * @return AgHospitalJob  修改后的AgHospitalJob对象记录
	 * @throws HSKDBException
	 */
	public  AgHospitalJob saveOrUpdateAgHospitalJob( AgHospitalJob att_AgHospitalJob) throws HSKDBException;
	
	/**
	 *根据AgHospitalJob对象作为对(ag_hospital_job表进行查询，获取分页对象
     * @param  att_AgHospitalJob  AgHospitalJob类型(ag_hospital_job表记录)
     * @return PagerModel  分页对象
	 * @throws HSKDBException 
	 */
	public PagerModel getPagerModelByAgHospitalJob (AgHospitalJob att_AgHospitalJob) throws HSKDBException;
	
    /**
	 *根据AgHospitalJob对象作为对(ag_hospital_job表进行查询，获取分页对象
     * @param  att_AgHospitalJob  AgHospitalJob类型(ag_hospital_job表记录)
     * @return List<AgHospitalJob>  列表对象
	 * @throws HSKDBException 
	 */
	public List<AgHospitalJob> getListByAgHospitalJob ( AgHospitalJob att_AgHospitalJob) throws HSKDBException;

}