package com.hsk.angeldoctor.api.daobbase;

import java.util.*;
import com.hsk.angeldoctor.api.persistence.*;
import com.hsk.exception.HSKDBException;
import com.hsk.supper.dto.comm.PagerModel;

/**
 * ag_information_info表数据库层面操作接口类 
 * @author  作者:admin
 * @version  版本信息:v1.0   创建时间: 2018-08-14 13:40:21
 */
public interface IAgInformationInfoDao{
	
	/**
	 * 根据ag_information_info表主键查找AgInformationInfo对象记录
	 * @param  AiiId  Integer类型(ag_information_info表主键)
	 * @return AgInformationInfo ag_information_info表记录
	 * @throws HSKDBException
	 */	
	public AgInformationInfo findAgInformationInfoById(Integer AiiId) throws HSKDBException;
	
	/**
	 * 根据ag_information_info表主键删除AgInformationInfo对象记录
     * @param  AiiId  Integer类型(ag_information_info表主键)
	 * @throws HSKDBException
	 */
	public void deleteAgInformationInfoById(Integer AiiId) throws HSKDBException;
	 
	/**
 	 * 根据ag_information_info表主键修改AgInformationInfo对象记录
	 * @param  AiiId  Integer类型(ag_information_info表主键)
	 * @param  att_AgInformationInfo  AgInformationInfo类型(ag_information_info表记录)
	 * @return AgInformationInfo  修改后的AgInformationInfo对象记录
	 * @throws HSKDBException
	 */
	public  AgInformationInfo updateAgInformationInfoById(Integer AiiId,AgInformationInfo att_AgInformationInfo) throws HSKDBException;
	
	/**
	 * 新增ag_information_info表 记录
     * @param  att_AgInformationInfo  AgInformationInfo类型(ag_information_info表记录)
     * @return ag_information_info表主键值
	 * @throws HSKDBException
	 */
	public Integer saveAgInformationInfo(AgInformationInfo att_AgInformationInfo) throws HSKDBException;
	
	 /**
	 * 新增或修改ag_information_info表记录 ,如果ag_information_info表主键AgInformationInfo.AiiId为空就是添加，如果非空就是修改
     * @param  att_AgInformationInfo  AgInformationInfo类型(ag_information_info表记录)
     * @return AgInformationInfo  修改后的AgInformationInfo对象记录
	 * @throws HSKDBException
	 */
	public  AgInformationInfo saveOrUpdateAgInformationInfo( AgInformationInfo att_AgInformationInfo) throws HSKDBException;
	
	/**
	 *根据AgInformationInfo对象作为对(ag_information_info表进行查询，获取分页对象
     * @param  att_AgInformationInfo  AgInformationInfo类型(ag_information_info表记录)
     * @return PagerModel  分页对象
	 * @throws HSKDBException 
	 */
	public PagerModel getPagerModelByAgInformationInfo (AgInformationInfo att_AgInformationInfo) throws HSKDBException;
	
    /**
	 *根据AgInformationInfo对象作为对(ag_information_info表进行查询，获取分页对象
     * @param  att_AgInformationInfo  AgInformationInfo类型(ag_information_info表记录)
     * @return List<AgInformationInfo>  列表对象
	 * @throws HSKDBException 
	 */
	public List<AgInformationInfo> getListByAgInformationInfo ( AgInformationInfo att_AgInformationInfo) throws HSKDBException;

}