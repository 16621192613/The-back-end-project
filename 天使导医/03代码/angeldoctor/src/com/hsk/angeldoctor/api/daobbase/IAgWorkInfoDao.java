package com.hsk.angeldoctor.api.daobbase;

import java.util.*;
import com.hsk.angeldoctor.api.persistence.*;
import com.hsk.exception.HSKDBException;
import com.hsk.supper.dto.comm.PagerModel;

/**
 * ag_work_info表数据库层面操作接口类 
 * @author  作者:admin
 * @version  版本信息:v1.0   创建时间: 2018-08-14 13:28:02
 */
public interface IAgWorkInfoDao{
	
	/**
	 * 根据ag_work_info表主键查找AgWorkInfo对象记录
	 * @param  ShiftPlanId  Integer类型(ag_work_info表主键)
	 * @return AgWorkInfo ag_work_info表记录
	 * @throws HSKDBException
	 */	
	public AgWorkInfo findAgWorkInfoById(Integer ShiftPlanId) throws HSKDBException;
	
	/**
	 * 根据ag_work_info表主键删除AgWorkInfo对象记录
     * @param  ShiftPlanId  Integer类型(ag_work_info表主键)
	 * @throws HSKDBException
	 */
	public void deleteAgWorkInfoById(Integer ShiftPlanId) throws HSKDBException;
	 
	/**
 	 * 根据ag_work_info表主键修改AgWorkInfo对象记录
	 * @param  ShiftPlanId  Integer类型(ag_work_info表主键)
	 * @param  att_AgWorkInfo  AgWorkInfo类型(ag_work_info表记录)
	 * @return AgWorkInfo  修改后的AgWorkInfo对象记录
	 * @throws HSKDBException
	 */
	public  AgWorkInfo updateAgWorkInfoById(Integer ShiftPlanId,AgWorkInfo att_AgWorkInfo) throws HSKDBException;
	
	/**
	 * 新增ag_work_info表 记录
     * @param  att_AgWorkInfo  AgWorkInfo类型(ag_work_info表记录)
     * @return ag_work_info表主键值
	 * @throws HSKDBException
	 */
	public Integer saveAgWorkInfo(AgWorkInfo att_AgWorkInfo) throws HSKDBException;
	
	 /**
	 * 新增或修改ag_work_info表记录 ,如果ag_work_info表主键AgWorkInfo.ShiftPlanId为空就是添加，如果非空就是修改
     * @param  att_AgWorkInfo  AgWorkInfo类型(ag_work_info表记录)
     * @return AgWorkInfo  修改后的AgWorkInfo对象记录
	 * @throws HSKDBException
	 */
	public  AgWorkInfo saveOrUpdateAgWorkInfo( AgWorkInfo att_AgWorkInfo) throws HSKDBException;
	
	/**
	 *根据AgWorkInfo对象作为对(ag_work_info表进行查询，获取分页对象
     * @param  att_AgWorkInfo  AgWorkInfo类型(ag_work_info表记录)
     * @return PagerModel  分页对象
	 * @throws HSKDBException 
	 */
	public PagerModel getPagerModelByAgWorkInfo (AgWorkInfo att_AgWorkInfo) throws HSKDBException;
	
    /**
	 *根据AgWorkInfo对象作为对(ag_work_info表进行查询，获取分页对象
     * @param  att_AgWorkInfo  AgWorkInfo类型(ag_work_info表记录)
     * @return List<AgWorkInfo>  列表对象
	 * @throws HSKDBException 
	 */
	public List<AgWorkInfo> getListByAgWorkInfo ( AgWorkInfo att_AgWorkInfo) throws HSKDBException;
	/**
	 * 获取排班视图列表
	 * @param att_AgWorkView
	 * @return
	 * @throws HSKDBException
	 */
	public List<AgWorkView> getAgWorkViewList ( AgWorkView att_AgWorkView) throws HSKDBException;

}