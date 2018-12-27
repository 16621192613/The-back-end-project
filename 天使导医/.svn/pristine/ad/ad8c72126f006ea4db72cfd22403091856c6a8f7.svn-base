package com.hsk.angeldoctor.api.daobbase;

import java.util.*;
import com.hsk.angeldoctor.api.persistence.*;
import com.hsk.exception.HSKDBException;
import com.hsk.supper.dto.comm.PagerModel;

/**
 * ag_work_model表数据库层面操作接口类 
 * @author  作者:admin
 * @version  版本信息:v1.0   创建时间: 2018-08-14 13:28:02
 */
public interface IAgWorkModelDao{
	
	/**
	 * 根据ag_work_model表主键查找AgWorkModel对象记录
	 * @param  ShiftTemplateId  Integer类型(ag_work_model表主键)
	 * @return AgWorkModel ag_work_model表记录
	 * @throws HSKDBException
	 */	
	public AgWorkModel findAgWorkModelById(Integer ShiftTemplateId) throws HSKDBException;
	
	/**
	 * 根据ag_work_model表主键删除AgWorkModel对象记录
     * @param  ShiftTemplateId  Integer类型(ag_work_model表主键)
	 * @throws HSKDBException
	 */
	public void deleteAgWorkModelById(Integer ShiftTemplateId) throws HSKDBException;
	 
	/**
 	 * 根据ag_work_model表主键修改AgWorkModel对象记录
	 * @param  ShiftTemplateId  Integer类型(ag_work_model表主键)
	 * @param  att_AgWorkModel  AgWorkModel类型(ag_work_model表记录)
	 * @return AgWorkModel  修改后的AgWorkModel对象记录
	 * @throws HSKDBException
	 */
	public  AgWorkModel updateAgWorkModelById(Integer ShiftTemplateId,AgWorkModel att_AgWorkModel) throws HSKDBException;
	
	/**
	 * 新增ag_work_model表 记录
     * @param  att_AgWorkModel  AgWorkModel类型(ag_work_model表记录)
     * @return ag_work_model表主键值
	 * @throws HSKDBException
	 */
	public Integer saveAgWorkModel(AgWorkModel att_AgWorkModel) throws HSKDBException;
	
	 /**
	 * 新增或修改ag_work_model表记录 ,如果ag_work_model表主键AgWorkModel.ShiftTemplateId为空就是添加，如果非空就是修改
     * @param  att_AgWorkModel  AgWorkModel类型(ag_work_model表记录)
     * @return AgWorkModel  修改后的AgWorkModel对象记录
	 * @throws HSKDBException
	 */
	public  AgWorkModel saveOrUpdateAgWorkModel( AgWorkModel att_AgWorkModel) throws HSKDBException;
	
	/**
	 *根据AgWorkModel对象作为对(ag_work_model表进行查询，获取分页对象
     * @param  att_AgWorkModel  AgWorkModel类型(ag_work_model表记录)
     * @return PagerModel  分页对象
	 * @throws HSKDBException 
	 */
	public PagerModel getPagerModelByAgWorkModel (AgWorkModel att_AgWorkModel) throws HSKDBException;
	
    /**
	 *根据AgWorkModel对象作为对(ag_work_model表进行查询，获取分页对象
     * @param  att_AgWorkModel  AgWorkModel类型(ag_work_model表记录)
     * @return List<AgWorkModel>  列表对象
	 * @throws HSKDBException 
	 */
	public List<AgWorkModel> getListByAgWorkModel ( AgWorkModel att_AgWorkModel) throws HSKDBException;

}