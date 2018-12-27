package com.hsk.angeldoctor.api.daobbase;

import java.util.*;
import com.hsk.angeldoctor.api.persistence.*;
import com.hsk.exception.HSKDBException;
import com.hsk.supper.dto.comm.PagerModel;

/**
 * ag_goods_info表数据库层面操作接口类 
 * @author  作者:admin
 * @version  版本信息:v1.0   创建时间: 2018-08-14 13:41:32
 */
public interface IAgGoodsInfoDao{
	
	/**
	 * 根据ag_goods_info表主键查找AgGoodsInfo对象记录
	 * @param  GoodsId  Integer类型(ag_goods_info表主键)
	 * @return AgGoodsInfo ag_goods_info表记录
	 * @throws HSKDBException
	 */	
	public AgGoodsInfo findAgGoodsInfoById(Integer GoodsId) throws HSKDBException;
	
	/**
	 * 根据ag_goods_info表主键删除AgGoodsInfo对象记录
     * @param  GoodsId  Integer类型(ag_goods_info表主键)
	 * @throws HSKDBException
	 */
	public void deleteAgGoodsInfoById(Integer GoodsId) throws HSKDBException;
	 
	/**
 	 * 根据ag_goods_info表主键修改AgGoodsInfo对象记录
	 * @param  GoodsId  Integer类型(ag_goods_info表主键)
	 * @param  att_AgGoodsInfo  AgGoodsInfo类型(ag_goods_info表记录)
	 * @return AgGoodsInfo  修改后的AgGoodsInfo对象记录
	 * @throws HSKDBException
	 */
	public  AgGoodsInfo updateAgGoodsInfoById(Integer GoodsId,AgGoodsInfo att_AgGoodsInfo) throws HSKDBException;
	
	/**
	 * 新增ag_goods_info表 记录
     * @param  att_AgGoodsInfo  AgGoodsInfo类型(ag_goods_info表记录)
     * @return ag_goods_info表主键值
	 * @throws HSKDBException
	 */
	public Integer saveAgGoodsInfo(AgGoodsInfo att_AgGoodsInfo) throws HSKDBException;
	
	 /**
	 * 新增或修改ag_goods_info表记录 ,如果ag_goods_info表主键AgGoodsInfo.GoodsId为空就是添加，如果非空就是修改
     * @param  att_AgGoodsInfo  AgGoodsInfo类型(ag_goods_info表记录)
     * @return AgGoodsInfo  修改后的AgGoodsInfo对象记录
	 * @throws HSKDBException
	 */
	public  AgGoodsInfo saveOrUpdateAgGoodsInfo( AgGoodsInfo att_AgGoodsInfo) throws HSKDBException;
	
	/**
	 *根据AgGoodsInfo对象作为对(ag_goods_info表进行查询，获取分页对象
     * @param  att_AgGoodsInfo  AgGoodsInfo类型(ag_goods_info表记录)
     * @return PagerModel  分页对象
	 * @throws HSKDBException 
	 */
	public PagerModel getPagerModelByAgGoodsInfo (AgGoodsInfo att_AgGoodsInfo) throws HSKDBException;
	
    /**
	 *根据AgGoodsInfo对象作为对(ag_goods_info表进行查询，获取分页对象
     * @param  att_AgGoodsInfo  AgGoodsInfo类型(ag_goods_info表记录)
     * @return List<AgGoodsInfo>  列表对象
	 * @throws HSKDBException 
	 */
	public List<AgGoodsInfo> getListByAgGoodsInfo ( AgGoodsInfo att_AgGoodsInfo) throws HSKDBException;

}