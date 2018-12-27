package com.hsk.angeldoctor.api.daobbase;

import java.util.*;
import com.hsk.angeldoctor.api.persistence.*;
import com.hsk.exception.HSKDBException;
import com.hsk.supper.dto.comm.PagerModel;

/**
 * ag_integral_order表数据库层面操作接口类 
 * @author  作者:admin
 * @version  版本信息:v1.0   创建时间: 2018-08-14 13:41:32
 */
public interface IAgIntegralOrderDao{
	
	/**
	 * 根据ag_integral_order表主键查找AgIntegralOrder对象记录
	 * @param  AioId  Integer类型(ag_integral_order表主键)
	 * @return AgIntegralOrder ag_integral_order表记录
	 * @throws HSKDBException
	 */	
	public AgIntegralOrder findAgIntegralOrderById(Integer AioId) throws HSKDBException;
	
	/**
	 * 根据ag_integral_order表主键删除AgIntegralOrder对象记录
     * @param  AioId  Integer类型(ag_integral_order表主键)
	 * @throws HSKDBException
	 */
	public void deleteAgIntegralOrderById(Integer AioId) throws HSKDBException;
	 
	/**
 	 * 根据ag_integral_order表主键修改AgIntegralOrder对象记录
	 * @param  AioId  Integer类型(ag_integral_order表主键)
	 * @param  att_AgIntegralOrder  AgIntegralOrder类型(ag_integral_order表记录)
	 * @return AgIntegralOrder  修改后的AgIntegralOrder对象记录
	 * @throws HSKDBException
	 */
	public  AgIntegralOrder updateAgIntegralOrderById(Integer AioId,AgIntegralOrder att_AgIntegralOrder) throws HSKDBException;
	
	/**
	 * 新增ag_integral_order表 记录
     * @param  att_AgIntegralOrder  AgIntegralOrder类型(ag_integral_order表记录)
     * @return ag_integral_order表主键值
	 * @throws HSKDBException
	 */
	public Integer saveAgIntegralOrder(AgIntegralOrder att_AgIntegralOrder) throws HSKDBException;
	
	 /**
	 * 新增或修改ag_integral_order表记录 ,如果ag_integral_order表主键AgIntegralOrder.AioId为空就是添加，如果非空就是修改
     * @param  att_AgIntegralOrder  AgIntegralOrder类型(ag_integral_order表记录)
     * @return AgIntegralOrder  修改后的AgIntegralOrder对象记录
	 * @throws HSKDBException
	 */
	public  AgIntegralOrder saveOrUpdateAgIntegralOrder( AgIntegralOrder att_AgIntegralOrder) throws HSKDBException;
	
	/**
	 *根据AgIntegralOrder对象作为对(ag_integral_order表进行查询，获取分页对象
     * @param  att_AgIntegralOrder  AgIntegralOrder类型(ag_integral_order表记录)
     * @return PagerModel  分页对象
	 * @throws HSKDBException 
	 */
	public PagerModel getPagerModelByAgIntegralOrder (AgIntegralOrder att_AgIntegralOrder) throws HSKDBException;
	
    /**
	 *根据AgIntegralOrder对象作为对(ag_integral_order表进行查询，获取分页对象
     * @param  att_AgIntegralOrder  AgIntegralOrder类型(ag_integral_order表记录)
     * @return List<AgIntegralOrder>  列表对象
	 * @throws HSKDBException 
	 */
	public List<AgIntegralOrder> getListByAgIntegralOrder ( AgIntegralOrder att_AgIntegralOrder) throws HSKDBException;
	
	 

}