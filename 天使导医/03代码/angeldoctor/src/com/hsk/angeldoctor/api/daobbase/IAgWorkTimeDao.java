package com.hsk.angeldoctor.api.daobbase;

import java.util.*;
import com.hsk.angeldoctor.api.persistence.*;
import com.hsk.exception.HSKDBException;
import com.hsk.supper.dto.comm.PagerModel;

/**
 * ag_work_time表数据库层面操作接口类 
 * @author  作者:admin
 * @version  版本信息:v1.0   创建时间: 2018-08-14 13:28:03
 */
public interface IAgWorkTimeDao{
	
	/**
	 * 根据ag_work_time表主键查找AgWorkTime对象记录
	 * @param  ShiftPeriodId  Integer类型(ag_work_time表主键)
	 * @return AgWorkTime ag_work_time表记录
	 * @throws HSKDBException
	 */	
	public AgWorkTime findAgWorkTimeById(Integer ShiftPeriodId) throws HSKDBException;
	
	/**
	 * 根据ag_work_time表主键删除AgWorkTime对象记录
     * @param  ShiftPeriodId  Integer类型(ag_work_time表主键)
	 * @throws HSKDBException
	 */
	public void deleteAgWorkTimeById(Integer ShiftPeriodId) throws HSKDBException;
	 
	/**
 	 * 根据ag_work_time表主键修改AgWorkTime对象记录
	 * @param  ShiftPeriodId  Integer类型(ag_work_time表主键)
	 * @param  att_AgWorkTime  AgWorkTime类型(ag_work_time表记录)
	 * @return AgWorkTime  修改后的AgWorkTime对象记录
	 * @throws HSKDBException
	 */
	public  AgWorkTime updateAgWorkTimeById(Integer ShiftPeriodId,AgWorkTime att_AgWorkTime) throws HSKDBException;
	
	/**
	 * 新增ag_work_time表 记录
     * @param  att_AgWorkTime  AgWorkTime类型(ag_work_time表记录)
     * @return ag_work_time表主键值
	 * @throws HSKDBException
	 */
	public Integer saveAgWorkTime(AgWorkTime att_AgWorkTime) throws HSKDBException;
	
	 /**
	 * 新增或修改ag_work_time表记录 ,如果ag_work_time表主键AgWorkTime.ShiftPeriodId为空就是添加，如果非空就是修改
     * @param  att_AgWorkTime  AgWorkTime类型(ag_work_time表记录)
     * @return AgWorkTime  修改后的AgWorkTime对象记录
	 * @throws HSKDBException
	 */
	public  AgWorkTime saveOrUpdateAgWorkTime( AgWorkTime att_AgWorkTime) throws HSKDBException;
	
	/**
	 *根据AgWorkTime对象作为对(ag_work_time表进行查询，获取分页对象
     * @param  att_AgWorkTime  AgWorkTime类型(ag_work_time表记录)
     * @return PagerModel  分页对象
	 * @throws HSKDBException 
	 */
	public PagerModel getPagerModelByAgWorkTime (AgWorkTime att_AgWorkTime) throws HSKDBException;
	
    /**
	 *根据AgWorkTime对象作为对(ag_work_time表进行查询，获取分页对象
     * @param  att_AgWorkTime  AgWorkTime类型(ag_work_time表记录)
     * @return List<AgWorkTime>  列表对象
	 * @throws HSKDBException 
	 */
	public List<AgWorkTime> getListByAgWorkTime ( AgWorkTime att_AgWorkTime) throws HSKDBException;

}