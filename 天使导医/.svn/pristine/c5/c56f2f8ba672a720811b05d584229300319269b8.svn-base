package com.hsk.angeldoctor.api.daobbase;

import java.util.*;
import com.hsk.angeldoctor.api.persistence.*;
import com.hsk.exception.HSKDBException;
import com.hsk.supper.dto.comm.PagerModel;

/**
 * ag_work_model_gx表数据库层面操作接口类 
 * @author  作者:admin
 * @version  版本信息:v1.0   创建时间: 2018-08-14 13:28:02
 */
public interface IAgWorkModelGxDao{
	
	/**
	 * 根据ag_work_model_gx表主键查找AgWorkModelGx对象记录
	 * @param  AwmgId  Integer类型(ag_work_model_gx表主键)
	 * @return AgWorkModelGx ag_work_model_gx表记录
	 * @throws HSKDBException
	 */	
	public AgWorkModelGx findAgWorkModelGxById(Integer AwmgId) throws HSKDBException;
	
	/**
	 * 根据ag_work_model_gx表主键删除AgWorkModelGx对象记录
     * @param  AwmgId  Integer类型(ag_work_model_gx表主键)
	 * @throws HSKDBException
	 */
	public void deleteAgWorkModelGxById(Integer AwmgId) throws HSKDBException;
	 
	/**
 	 * 根据ag_work_model_gx表主键修改AgWorkModelGx对象记录
	 * @param  AwmgId  Integer类型(ag_work_model_gx表主键)
	 * @param  att_AgWorkModelGx  AgWorkModelGx类型(ag_work_model_gx表记录)
	 * @return AgWorkModelGx  修改后的AgWorkModelGx对象记录
	 * @throws HSKDBException
	 */
	public  AgWorkModelGx updateAgWorkModelGxById(Integer AwmgId,AgWorkModelGx att_AgWorkModelGx) throws HSKDBException;
	
	/**
	 * 新增ag_work_model_gx表 记录
     * @param  att_AgWorkModelGx  AgWorkModelGx类型(ag_work_model_gx表记录)
     * @return ag_work_model_gx表主键值
	 * @throws HSKDBException
	 */
	public Integer saveAgWorkModelGx(AgWorkModelGx att_AgWorkModelGx) throws HSKDBException;
	
	 /**
	 * 新增或修改ag_work_model_gx表记录 ,如果ag_work_model_gx表主键AgWorkModelGx.AwmgId为空就是添加，如果非空就是修改
     * @param  att_AgWorkModelGx  AgWorkModelGx类型(ag_work_model_gx表记录)
     * @return AgWorkModelGx  修改后的AgWorkModelGx对象记录
	 * @throws HSKDBException
	 */
	public  AgWorkModelGx saveOrUpdateAgWorkModelGx( AgWorkModelGx att_AgWorkModelGx) throws HSKDBException;
	
	/**
	 *根据AgWorkModelGx对象作为对(ag_work_model_gx表进行查询，获取分页对象
     * @param  att_AgWorkModelGx  AgWorkModelGx类型(ag_work_model_gx表记录)
     * @return PagerModel  分页对象
	 * @throws HSKDBException 
	 */
	public PagerModel getPagerModelByAgWorkModelGx (AgWorkModelGx att_AgWorkModelGx) throws HSKDBException;
	
    /**
	 *根据AgWorkModelGx对象作为对(ag_work_model_gx表进行查询，获取分页对象
     * @param  att_AgWorkModelGx  AgWorkModelGx类型(ag_work_model_gx表记录)
     * @return List<AgWorkModelGx>  列表对象
	 * @throws HSKDBException 
	 */
	public List<AgWorkModelGx> getListByAgWorkModelGx ( AgWorkModelGx att_AgWorkModelGx) throws HSKDBException;

}