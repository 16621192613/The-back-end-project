package com.hsk.angeldoctor.web.integral.service.imp;

import java.util.*;
import org.springframework.stereotype.*;
import org.springframework.beans.factory.annotation.Autowired;
import com.hsk.supper.dto.comm.PagerModel;
import com.hsk.supper.dto.comm.SysRetrunMessage; 
import com.hsk.xframe.api.service.imp.DSTService;
import com.hsk.xframe.api.utils.freeMarker.CreateCodeUtil;
import com.hsk.exception.HSKDBException;
import com.hsk.exception.HSKException;
import com.hsk.angeldoctor.web.integral.service.*;
import com.hsk.angeldoctor.api.persistence.*;
import com.hsk.angeldoctor.api.daobbase.*;


/** 
  integral业务操作实现类 
 * @author  作者:admin
 * @version  版本信息:v1.0   创建时间: 2018-08-14 13:41:33
 */
 
@Service
public class  AgIntegralOrderService extends DSTService implements IAgIntegralOrderService {	
   /**
   *业务处理dao类  agIntegralOrderDao 
   */
	@Autowired
	protected IAgIntegralOrderDao agIntegralOrderDao;
	@Autowired
	protected IAgGoodsInfoDao agGoodsInfoDao;
	@Autowired
	protected IAgMoneyCountDao agMoneyCountDao;


 /**
	 * 根据ag_integral_order表主键删除AgIntegralOrder对象记录
     * @param  aioId  Integer类型(ag_integral_order表主键)
	 * @return SysRetrunMessage 对象记录
	 * @throws HSKException
	 */

	public SysRetrunMessage findFormObject(Integer aioId) throws HSKException{
	        SysRetrunMessage srm=new SysRetrunMessage(1l);
			  	
			try{
		   			AgIntegralOrder     att_AgIntegralOrder= agIntegralOrderDao.findAgIntegralOrderById( aioId) ;
					srm.setObj(att_AgIntegralOrder);
				} catch (HSKDBException e) {
					e.printStackTrace(); 
					srm.setCode(0l);
					srm.setMeg(e.getMessage()); 
				}
				 return srm ;
	} 

    /**
	 * 根据ag_integral_order表主键删除AgIntegralOrder对象记录
     * @param  aioId  Integer类型(ag_integral_order表主键)
	 * @throws HSKException
	 */

	public AgIntegralOrder findObject(Integer aioId) throws HSKException{
			AgIntegralOrder  att_AgIntegralOrder=new AgIntegralOrder();		
			try{
		        att_AgIntegralOrder= agIntegralOrderDao.findAgIntegralOrderById( aioId) ;
				} catch (HSKDBException e) {
					e.printStackTrace(); 
					throw new  HSKException(e);
				}
				return  att_AgIntegralOrder;
	}
	
	 
	 /**
	 * 根据ag_integral_order表主键删除AgIntegralOrder对象记录
     * @param  aioId  Integer类型(ag_integral_order表主键)
     * @return SysRetrunMessage 对象记录
	 * @throws HSKException
	 */
	public SysRetrunMessage deleteObject(Integer aioId) throws HSKException{  
		    SysRetrunMessage srm=new SysRetrunMessage(1l);
		   try{ 
				agIntegralOrderDao.deleteAgIntegralOrderById(aioId);
			 } catch (Exception e) {
					e.printStackTrace(); 
					throw new  HSKException(e);
		     }
		   return srm;  
	}
	
	/**
	 * 根据ag_integral_order表主键删除多条AgIntegralOrder对象记录
     * @param  AioIds  Integer类型(ag_integral_order表主键)
     * @return SysRetrunMessage 对象记录
	 * @throws HSKException
	 */
	public SysRetrunMessage deleteAllObject(String aioIds) throws HSKException{
		SysRetrunMessage srm = new SysRetrunMessage(1l);
		try {
			String[] ids = aioIds.split(",");
			for (String did : ids) {
				if (did != null && !"".equals(did.trim())) {
					agIntegralOrderDao.deleteAgIntegralOrderById(Integer
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
	 * 新增或修改ag_integral_order表记录 ,如果ag_integral_order表主键AgIntegralOrder.AioId为空就是添加，如果非空就是修改
     * @param  att_AgIntegralOrder  AgIntegralOrder类型(ag_integral_order表记录)
     * @return AgIntegralOrder  修改后的AgIntegralOrder对象记录
	 * @throws HSKDBException
	 */
	public SysRetrunMessage saveOrUpdateObject( AgIntegralOrder att_AgIntegralOrder) throws HSKException{
			 SysRetrunMessage srm = new SysRetrunMessage(1l);
			  try{
				  if(att_AgIntegralOrder.getAioId()==null){//扣除积分
					  AgGoodsInfo agGoodsInfo = agGoodsInfoDao.findAgGoodsInfoById(att_AgIntegralOrder.getGoodsId());
					  att_AgIntegralOrder.setGoodsName(agGoodsInfo.getName());
					  att_AgIntegralOrder.setGoodsType(agGoodsInfo.getType());
					  att_AgIntegralOrder.setSupplierName(agGoodsInfo.getSupplierName());
					  att_AgIntegralOrder.setAmount(1);
					  att_AgIntegralOrder.setIntegralPrice(agGoodsInfo.getAccumulatePointValue());
					  att_AgIntegralOrder.setGoodsAccumulatePointValue(agGoodsInfo.getAccumulatePointValue());
					  att_AgIntegralOrder.setSerialNumber(CreateCodeUtil.getNo("OL"));
					  AgMoneyCount agMoneyCount = new AgMoneyCount();
					  agMoneyCount.setSuiId(att_AgIntegralOrder.getSuiId());
					  if(att_AgIntegralOrder.getUserType().equals("1"))
						  agMoneyCount.setAmcType("3");
					  else if(att_AgIntegralOrder.getUserType().equals("2"))
						  agMoneyCount.setAmcType("4");
					  List<AgMoneyCount> countList = agMoneyCountDao.getListByAgMoneyCount(agMoneyCount);
					  if(countList!=null && countList.size() >0){
						  agMoneyCount=countList.get(0);
						  if(agMoneyCount.getIntegralCount() !=null && agMoneyCount.getIntegralCount()>=att_AgIntegralOrder.getGoodsAccumulatePointValue()){
							  agMoneyCount.setIntegralCount(agMoneyCount.getIntegralCount()-att_AgIntegralOrder.getGoodsAccumulatePointValue());
							  this.updateObject(agMoneyCount);
						  }else{
							  srm.setCode(0l);
							  srm.setMeg("积分不够!");
							  return srm;
						  }
					  }else{
						  srm.setCode(0l);
						  srm.setMeg("积分不够!");
						  return srm;
					  }
					  att_AgIntegralOrder.setStatus("0");
					  att_AgIntegralOrder.setCreateDate(new Date());
					  att_AgIntegralOrder.setDeliveryStatus("1");
				  }
				  
				  agIntegralOrderDao.saveOrUpdateAgIntegralOrder(att_AgIntegralOrder); 
				  srm.setObj(att_AgIntegralOrder);
			    } catch (Exception e) {
					e.printStackTrace(); 
					throw new HSKException(e);
		        }
			return srm;	  
	}
	
	 
	/**
	 *根据AgIntegralOrder对象作为对(ag_integral_order表进行查询，获取分页对象
     * @param  att_AgIntegralOrder  AgIntegralOrder类型(ag_integral_order表记录)
     * @return PagerModel  分页对象
	 * @throws HSKException 
	 */
	public PagerModel getPagerModelObject (AgIntegralOrder att_AgIntegralOrder) throws HSKException{
		PagerModel pm=new PagerModel(new ArrayList<AgIntegralOrder>());
			  try{
					pm=agIntegralOrderDao.getPagerModelByAgIntegralOrder(att_AgIntegralOrder);
			    } catch (Exception e) {
					e.printStackTrace(); 
		        }
		return pm;
	}

	 
	public SysRetrunMessage savefire(AgIntegralOrder att_AgIntegralOrder)
			throws HSKException {
		 SysRetrunMessage srm = new SysRetrunMessage(1l);
		  try{
			  AgIntegralOrder searcharObj=	agIntegralOrderDao.findAgIntegralOrderById(att_AgIntegralOrder.getAioId());
				if(searcharObj!=null){
					searcharObj.setDeliveryStatus("2");
					searcharObj.setExpressName(att_AgIntegralOrder.getExpressName());
					searcharObj.setExpressSerialNumber(att_AgIntegralOrder.getExpressSerialNumber());
					agIntegralOrderDao.updateAgIntegralOrderById(att_AgIntegralOrder.getAioId(), searcharObj);
				}else {
					srm.setCode(0l);
					srm.setMeg("未找到 订单积分记录 ！");
					}
				srm.setObj(att_AgIntegralOrder);
		    } catch (Exception e) {
				e.printStackTrace(); 
				throw new HSKException(e);
	        }
		return srm;	  
	}
}