package com.hsk.angeldoctor.api.daobbase;

import java.util.*;
import com.hsk.angeldoctor.api.persistence.*;
import com.hsk.exception.HSKDBException;
import com.hsk.supper.dto.comm.PagerModel;

/**
 * ag_inside_info表数据库层面操作接口类 
 * @author  作者:admin
 * @version  版本信息:v1.0   创建时间: 2018-08-14 13:40:21
 */
public interface IAgInsideInfoDao{
	
	/**
	 * 根据ag_inside_info表主键查找AgInsideInfo对象记录
	 * @param  AiiId  Integer类型(ag_inside_info表主键)
	 * @return AgInsideInfo ag_inside_info表记录
	 * @throws HSKDBException
	 */	
	public AgInsideInfo findAgInsideInfoById(Integer AiiId) throws HSKDBException;
	
	/**
	 * 根据ag_inside_info表主键删除AgInsideInfo对象记录
     * @param  AiiId  Integer类型(ag_inside_info表主键)
	 * @throws HSKDBException
	 */
	public void deleteAgInsideInfoById(Integer AiiId) throws HSKDBException;
	 
	/**
 	 * 根据ag_inside_info表主键修改AgInsideInfo对象记录
	 * @param  AiiId  Integer类型(ag_inside_info表主键)
	 * @param  att_AgInsideInfo  AgInsideInfo类型(ag_inside_info表记录)
	 * @return AgInsideInfo  修改后的AgInsideInfo对象记录
	 * @throws HSKDBException
	 */
	public  AgInsideInfo updateAgInsideInfoById(Integer AiiId,AgInsideInfo att_AgInsideInfo) throws HSKDBException;
	
	/**
	 * 新增ag_inside_info表 记录
     * @param  att_AgInsideInfo  AgInsideInfo类型(ag_inside_info表记录)
     * @return ag_inside_info表主键值
	 * @throws HSKDBException
	 */
	public Integer saveAgInsideInfo(AgInsideInfo att_AgInsideInfo) throws HSKDBException;
	
	 /**
	 * 新增或修改ag_inside_info表记录 ,如果ag_inside_info表主键AgInsideInfo.AiiId为空就是添加，如果非空就是修改
     * @param  att_AgInsideInfo  AgInsideInfo类型(ag_inside_info表记录)
     * @return AgInsideInfo  修改后的AgInsideInfo对象记录
	 * @throws HSKDBException
	 */
	public  AgInsideInfo saveOrUpdateAgInsideInfo( AgInsideInfo att_AgInsideInfo) throws HSKDBException;
	
	/**
	 *根据AgInsideInfo对象作为对(ag_inside_info表进行查询，获取分页对象
     * @param  att_AgInsideInfo  AgInsideInfo类型(ag_inside_info表记录)
     * @return PagerModel  分页对象
	 * @throws HSKDBException 
	 */
	public PagerModel getPagerModelByAgInsideInfo (AgInsideInfo att_AgInsideInfo) throws HSKDBException;
	
    /**
	 *根据AgInsideInfo对象作为对(ag_inside_info表进行查询，获取分页对象
     * @param  att_AgInsideInfo  AgInsideInfo类型(ag_inside_info表记录)
     * @return List<AgInsideInfo>  列表对象
	 * @throws HSKDBException 
	 */
	public List<AgInsideInfo> getListByAgInsideInfo ( AgInsideInfo att_AgInsideInfo) throws HSKDBException;

}