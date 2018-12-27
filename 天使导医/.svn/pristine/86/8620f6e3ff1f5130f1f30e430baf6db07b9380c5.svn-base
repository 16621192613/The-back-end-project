package com.hsk.angeldoctor.web.integral.service;

import java.util.*;
import com.hsk.angeldoctor.api.persistence.*;
import com.hsk.angeldoctor.api.daobbase.*;
import com.hsk.supper.dto.comm.PagerModel;
import com.hsk.supper.dto.comm.SysRetrunMessage;
import com.hsk.xframe.api.service.IDSTService;
import com.hsk.exception.HSKException;

/**
 * integral业务操作接口类 
 * @author  作者:admin
 * @version  版本信息:v1.0   创建时间: 2018-08-14 13:41:32
 */
public interface IAgGoodsInfoService extends IDSTService{


		/**
	 * 查找AgGoodsInfo对象记录，用于弹出添加、修改窗口时候初始化数据
	 * @param  goodsId  Integer类型(ag_goods_info表主键)
	  * @return SysRetrunMessage 对象记录
	 * @throws HSKException
	 */	
	public SysRetrunMessage findFormObject(Integer goodsId) throws HSKException;

	
	/**
	 * 查找AgGoodsInfo对象记录，用于弹出添加、修改窗口时候初始化数据
	 * @param  goodsId  Integer类型(ag_goods_info表主键)
	 * @return AgGoodsInfo ag_goods_info表记录
	 * @throws HSKException
	 */	
	public AgGoodsInfo findObject(Integer goodsId) throws HSKException;
	
	/**
	 * 根据ag_goods_info表主键删除AgGoodsInfo对象记录
     * @param  goodsId  Integer类型(ag_goods_info表主键)
     * @return SysRetrunMessage 对象记录
	 * @throws HSKException
	 */
	public SysRetrunMessage deleteObject(Integer goodsId) throws HSKException;
	
	
	
	/**
	 * 根据ag_goods_info表主键删除多条AgGoodsInfo对象记录
     * @param  goodsIds  Integer类型(ag_goods_info表主键)
     * @return SysRetrunMessage 对象记录
	 * @throws HSKException
	 */
	public SysRetrunMessage deleteAllObject(String goodsIds) throws HSKException;
	
	 /**
	 * 新增或修改ag_goods_info表记录 ,如果ag_goods_info表主键AgGoodsInfo.goodsId为空就是添加，如果非空就是修改
     * @param  att_AgGoodsInfo  AgGoodsInfo类型(ag_goods_info表记录)
     * @return SysRetrunMessage 对象记录
	 * @throws HSKException
	 */
	public SysRetrunMessage   saveOrUpdateObject( AgGoodsInfo att_AgGoodsInfo) throws HSKException;
	
	/**
	 *根据AgGoodsInfo对象作为对(ag_goods_info表进行查询，获取分页对象
     * @param  att_AgGoodsInfo  AgGoodsInfo类型(ag_goods_info表记录)
     * @return PagerModel  分页对象
	 * @throws HSKException 
	 */
	public PagerModel getPagerModelObject (AgGoodsInfo att_AgGoodsInfo) throws HSKException;
	
}