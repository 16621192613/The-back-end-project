package com.hsk.angeldoctor.web.operate.service;

import java.util.*;

import javax.servlet.http.HttpServletRequest;

import com.hsk.angeldoctor.api.persistence.*;
import com.hsk.angeldoctor.api.daobbase.*;
import com.hsk.supper.dto.comm.PagerModel;
import com.hsk.supper.dto.comm.SysRetrunMessage;
import com.hsk.xframe.api.service.IDSTService;
import com.hsk.exception.HSKException;

/**
 * operate业务操作接口类 
 * @author  作者:admin
 * @version  版本信息:v1.0   创建时间: 2018-08-14 13:40:21
 */
public interface IAgInformationInfoService extends IDSTService{


		/**
	 * 查找AgInformationInfo对象记录，用于弹出添加、修改窗口时候初始化数据
	 * @param  aiiId  Integer类型(ag_information_info表主键)
	  * @return SysRetrunMessage 对象记录
	 * @throws HSKException
	 */	
	public SysRetrunMessage findFormObject(Integer aiiId) throws HSKException;

	
	/**
	 * 查找AgInformationInfo对象记录，用于弹出添加、修改窗口时候初始化数据
	 * @param  aiiId  Integer类型(ag_information_info表主键)
	 * @return AgInformationInfo ag_information_info表记录
	 * @throws HSKException
	 */	
	public AgInformationInfo findObject(Integer aiiId) throws HSKException;
	
	/**
	 * 根据ag_information_info表主键删除AgInformationInfo对象记录
     * @param  aiiId  Integer类型(ag_information_info表主键)
     * @return SysRetrunMessage 对象记录
	 * @throws HSKException
	 */
	public SysRetrunMessage deleteObject(Integer aiiId) throws HSKException;
	
	
	
	/**
	 * 根据ag_information_info表主键删除多条AgInformationInfo对象记录
     * @param  aiiIds  Integer类型(ag_information_info表主键)
     * @return SysRetrunMessage 对象记录
	 * @throws HSKException
	 */
	public SysRetrunMessage deleteAllObject(String aiiIds) throws HSKException;
	
	 /**
	 * 新增或修改ag_information_info表记录 ,如果ag_information_info表主键AgInformationInfo.aiiId为空就是添加，如果非空就是修改
     * @param  att_AgInformationInfo  AgInformationInfo类型(ag_information_info表记录)
     * @return SysRetrunMessage 对象记录
	 * @throws HSKException
	 */
	public SysRetrunMessage   saveOrUpdateObject( AgInformationInfo att_AgInformationInfo) throws HSKException;
	
	/**
	 *根据AgInformationInfo对象作为对(ag_information_info表进行查询，获取分页对象
     * @param  att_AgInformationInfo  AgInformationInfo类型(ag_information_info表记录)
     * @return PagerModel  分页对象
	 * @throws HSKException 
	 */
	public PagerModel getPagerModelObject (AgInformationInfo att_AgInformationInfo) throws HSKException;
	/**
	 * 查询咨询列表
	 * @param att_AgInformationInfo
	 * @return
	 * @throws HSKException
	 */
	public List<AgInformationInfo> getAgInformationInfoList(AgInformationInfo att_AgInformationInfo) throws HSKException;
	/**
	 * 获取banner列表
	 * @return
	 * @throws HSKException
	 */
	public List<Map<String,Object>> getBannerList(String provId,String cityId) throws HSKException;
	
}