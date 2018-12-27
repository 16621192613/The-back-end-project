package com.hsk.angeldoctor.web.integral.service.imp;

import java.util.*;
import org.springframework.stereotype.*;
import org.springframework.beans.factory.annotation.Autowired;
import com.hsk.supper.dto.comm.PagerModel;
import com.hsk.supper.dto.comm.SysRetrunMessage; 
import com.hsk.xframe.api.service.imp.DSTService;
import com.hsk.exception.HSKDBException;
import com.hsk.exception.HSKException;
import com.hsk.angeldoctor.web.integral.service.*;
import com.hsk.angeldoctor.api.persistence.*;
import com.hsk.angeldoctor.api.daobbase.*;


/** 
  integral业务操作实现类 
 * @author  作者:admin
 * @version  版本信息:v1.0   创建时间: 2018-08-14 13:41:32
 */
 
@Service
public class  AgGoodsInfoService extends DSTService implements IAgGoodsInfoService {	
   /**
   *业务处理dao类  agGoodsInfoDao 
   */
	@Autowired
	protected IAgGoodsInfoDao agGoodsInfoDao;


 /**
	 * 根据ag_goods_info表主键删除AgGoodsInfo对象记录
     * @param  goodsId  Integer类型(ag_goods_info表主键)
	 * @return SysRetrunMessage 对象记录
	 * @throws HSKException
	 */

	public SysRetrunMessage findFormObject(Integer goodsId) throws HSKException{
	        SysRetrunMessage srm=new SysRetrunMessage(1l);
			  	
			try{
		   			AgGoodsInfo     att_AgGoodsInfo= agGoodsInfoDao.findAgGoodsInfoById( goodsId) ;
					srm.setObj(att_AgGoodsInfo);
				} catch (HSKDBException e) {
					e.printStackTrace(); 
					srm.setCode(0l);
					srm.setMeg(e.getMessage()); 
				}
				 return srm ;
	} 

    /**
	 * 根据ag_goods_info表主键删除AgGoodsInfo对象记录
     * @param  goodsId  Integer类型(ag_goods_info表主键)
	 * @throws HSKException
	 */

	public AgGoodsInfo findObject(Integer goodsId) throws HSKException{
			AgGoodsInfo  att_AgGoodsInfo=new AgGoodsInfo();		
			try{
		        att_AgGoodsInfo= agGoodsInfoDao.findAgGoodsInfoById( goodsId) ;
				} catch (HSKDBException e) {
					e.printStackTrace(); 
					throw new  HSKException(e);
				}
				return  att_AgGoodsInfo;
	}
	
	 
	 /**
	 * 根据ag_goods_info表主键删除AgGoodsInfo对象记录
     * @param  goodsId  Integer类型(ag_goods_info表主键)
     * @return SysRetrunMessage 对象记录
	 * @throws HSKException
	 */
	public SysRetrunMessage deleteObject(Integer goodsId) throws HSKException{  
		    SysRetrunMessage srm=new SysRetrunMessage(1l);
		   try{ 
				agGoodsInfoDao.deleteAgGoodsInfoById(goodsId);
			 } catch (Exception e) {
					e.printStackTrace(); 
					throw new  HSKException(e);
		     }
		   return srm;  
	}
	
	/**
	 * 根据ag_goods_info表主键删除多条AgGoodsInfo对象记录
     * @param  GoodsIds  Integer类型(ag_goods_info表主键)
     * @return SysRetrunMessage 对象记录
	 * @throws HSKException
	 */
	public SysRetrunMessage deleteAllObject(String goodsIds) throws HSKException{
		SysRetrunMessage srm = new SysRetrunMessage(1l);
		try {
			String[] ids = goodsIds.split(",");
			for (String did : ids) {
				if (did != null && !"".equals(did.trim())) {
					agGoodsInfoDao.deleteAgGoodsInfoById(Integer
							.valueOf(did));
				}
			}
		} catch (NumberFormatException e) {
			e.printStackTrace();
			HSKException hse = new HSKException(e);
			hse.setDisposeType("01");
			throw hse;
		} catch (HSKDBException e) {
			e.printStackTrace();
			throw new HSKException(e);
		}
		return srm;	  
	 }
	 
 
	 /**
	 * 新增或修改ag_goods_info表记录 ,如果ag_goods_info表主键AgGoodsInfo.GoodsId为空就是添加，如果非空就是修改
     * @param  att_AgGoodsInfo  AgGoodsInfo类型(ag_goods_info表记录)
     * @return AgGoodsInfo  修改后的AgGoodsInfo对象记录
	 * @throws HSKDBException
	 */
	public SysRetrunMessage saveOrUpdateObject( AgGoodsInfo att_AgGoodsInfo) throws HSKException{
			 SysRetrunMessage srm = new SysRetrunMessage(1l);
			  try{
					agGoodsInfoDao.saveOrUpdateAgGoodsInfo(att_AgGoodsInfo); 
					srm.setObj(att_AgGoodsInfo);
			    } catch (Exception e) {
					e.printStackTrace(); 
					throw new HSKException(e);
		        }
			return srm;	  
	}
	
	 
	/**
	 *根据AgGoodsInfo对象作为对(ag_goods_info表进行查询，获取分页对象
     * @param  att_AgGoodsInfo  AgGoodsInfo类型(ag_goods_info表记录)
     * @return PagerModel  分页对象
	 * @throws HSKException 
	 */
	public PagerModel getPagerModelObject (AgGoodsInfo att_AgGoodsInfo) throws HSKException{
		PagerModel pm=new PagerModel(new ArrayList<AgGoodsInfo>());
			  try{
					pm=agGoodsInfoDao.getPagerModelByAgGoodsInfo(att_AgGoodsInfo);
			    } catch (Exception e) {
					e.printStackTrace(); 
		        }
		return pm;
	} 
	 
}