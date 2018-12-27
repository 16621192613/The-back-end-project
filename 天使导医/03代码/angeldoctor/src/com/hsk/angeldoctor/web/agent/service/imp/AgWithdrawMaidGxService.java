package com.hsk.angeldoctor.web.agent.service.imp;

import java.util.*;
import org.springframework.stereotype.*;
import org.springframework.beans.factory.annotation.Autowired;
import com.hsk.supper.dto.comm.PagerModel;
import com.hsk.supper.dto.comm.SysRetrunMessage; 
import com.hsk.xframe.api.service.imp.DSTService;
import com.hsk.exception.HSKDBException;
import com.hsk.exception.HSKException;
import com.hsk.angeldoctor.web.agent.service.*;
import com.hsk.angeldoctor.api.persistence.*;
import com.hsk.angeldoctor.api.daobbase.*;


/** 
  agent业务操作实现类 
 * @author  作者:admin
 * @version  版本信息:v1.0   创建时间: 2018-08-14 13:31:12
 */
 
@Service
public class  AgWithdrawMaidGxService extends DSTService implements IAgWithdrawMaidGxService {	
   /**
   *业务处理dao类  agWithdrawMaidGxDao 
   */
	@Autowired
	protected IAgWithdrawMaidGxDao agWithdrawMaidGxDao;


 /**
	 * 根据ag_withdraw_maid_gx表主键删除AgWithdrawMaidGx对象记录
     * @param  awmgId  Integer类型(ag_withdraw_maid_gx表主键)
	 * @return SysRetrunMessage 对象记录
	 * @throws HSKException
	 */

	public SysRetrunMessage findFormObject(Integer awmgId) throws HSKException{
	        SysRetrunMessage srm=new SysRetrunMessage(1l);
			  	
			try{
		   			AgWithdrawMaidGx     att_AgWithdrawMaidGx= agWithdrawMaidGxDao.findAgWithdrawMaidGxById( awmgId) ;
					srm.setObj(att_AgWithdrawMaidGx);
				} catch (HSKDBException e) {
					e.printStackTrace(); 
					srm.setCode(0l);
					srm.setMeg(e.getMessage()); 
				}
				 return srm ;
	} 

    /**
	 * 根据ag_withdraw_maid_gx表主键删除AgWithdrawMaidGx对象记录
     * @param  awmgId  Integer类型(ag_withdraw_maid_gx表主键)
	 * @throws HSKException
	 */

	public AgWithdrawMaidGx findObject(Integer awmgId) throws HSKException{
			AgWithdrawMaidGx  att_AgWithdrawMaidGx=new AgWithdrawMaidGx();		
			try{
		        att_AgWithdrawMaidGx= agWithdrawMaidGxDao.findAgWithdrawMaidGxById( awmgId) ;
				} catch (HSKDBException e) {
					e.printStackTrace(); 
					throw new  HSKException(e);
				}
				return  att_AgWithdrawMaidGx;
	}
	
	 
	 /**
	 * 根据ag_withdraw_maid_gx表主键删除AgWithdrawMaidGx对象记录
     * @param  awmgId  Integer类型(ag_withdraw_maid_gx表主键)
     * @return SysRetrunMessage 对象记录
	 * @throws HSKException
	 */
	public SysRetrunMessage deleteObject(Integer awmgId) throws HSKException{  
		    SysRetrunMessage srm=new SysRetrunMessage(1l);
		   try{ 
				agWithdrawMaidGxDao.deleteAgWithdrawMaidGxById(awmgId);
			 } catch (Exception e) {
					e.printStackTrace(); 
					throw new  HSKException(e);
		     }
		   return srm;  
	}
	
	/**
	 * 根据ag_withdraw_maid_gx表主键删除多条AgWithdrawMaidGx对象记录
     * @param  AwmgIds  Integer类型(ag_withdraw_maid_gx表主键)
     * @return SysRetrunMessage 对象记录
	 * @throws HSKException
	 */
	public SysRetrunMessage deleteAllObject(String awmgIds) throws HSKException{
		SysRetrunMessage srm = new SysRetrunMessage(1l);
		try {
			String[] ids = awmgIds.split(",");
			for (String did : ids) {
				if (did != null && !"".equals(did.trim())) {
					agWithdrawMaidGxDao.deleteAgWithdrawMaidGxById(Integer
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
	 * 新增或修改ag_withdraw_maid_gx表记录 ,如果ag_withdraw_maid_gx表主键AgWithdrawMaidGx.AwmgId为空就是添加，如果非空就是修改
     * @param  att_AgWithdrawMaidGx  AgWithdrawMaidGx类型(ag_withdraw_maid_gx表记录)
     * @return AgWithdrawMaidGx  修改后的AgWithdrawMaidGx对象记录
	 * @throws HSKDBException
	 */
	public SysRetrunMessage saveOrUpdateObject( AgWithdrawMaidGx att_AgWithdrawMaidGx) throws HSKException{
			 SysRetrunMessage srm = new SysRetrunMessage(1l);
			  try{
					agWithdrawMaidGxDao.saveOrUpdateAgWithdrawMaidGx(att_AgWithdrawMaidGx); 
					srm.setObj(att_AgWithdrawMaidGx);
			    } catch (Exception e) {
					e.printStackTrace(); 
					throw new HSKException(e);
		        }
			return srm;	  
	}
	
	 
	/**
	 *根据AgWithdrawMaidGx对象作为对(ag_withdraw_maid_gx表进行查询，获取分页对象
     * @param  att_AgWithdrawMaidGx  AgWithdrawMaidGx类型(ag_withdraw_maid_gx表记录)
     * @return PagerModel  分页对象
	 * @throws HSKException 
	 */
	public PagerModel getPagerModelObject (AgWithdrawMaidGx att_AgWithdrawMaidGx) throws HSKException{
		PagerModel pm=new PagerModel(new ArrayList<AgWithdrawMaidGx>());
			  try{
					pm=agWithdrawMaidGxDao.getPagerModelByAgWithdrawMaidGx(att_AgWithdrawMaidGx);
			    } catch (Exception e) {
					e.printStackTrace(); 
		        }
		return pm;
	} 
	 
}