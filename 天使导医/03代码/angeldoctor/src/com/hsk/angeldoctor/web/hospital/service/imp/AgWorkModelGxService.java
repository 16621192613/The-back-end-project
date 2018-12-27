package com.hsk.angeldoctor.web.hospital.service.imp;

import java.util.*;

import org.springframework.stereotype.*;
import org.springframework.beans.factory.annotation.Autowired;
import com.hsk.supper.dto.comm.PagerModel;
import com.hsk.supper.dto.comm.SysRetrunMessage; 
import com.hsk.xframe.api.service.imp.DSTService;
import com.hsk.exception.HSKDBException;
import com.hsk.exception.HSKException;
import com.hsk.angeldoctor.web.hospital.service.*;
import com.hsk.angeldoctor.api.persistence.*;
import com.hsk.angeldoctor.api.daobbase.*;


/** 
  hospital业务操作实现类 
 * @author  作者:admin
 * @version  版本信息:v1.0   创建时间: 2018-08-14 13:28:02
 */
 
@Service
public class  AgWorkModelGxService extends DSTService implements IAgWorkModelGxService {	
   /**
   *业务处理dao类  agWorkModelGxDao 
   */
	@Autowired
	protected IAgWorkModelGxDao agWorkModelGxDao;


 /**
	 * 根据ag_work_model_gx表主键删除AgWorkModelGx对象记录
     * @param  awmgId  Integer类型(ag_work_model_gx表主键)
	 * @return SysRetrunMessage 对象记录
	 * @throws HSKException
	 */

	public SysRetrunMessage findFormObject(Integer awmgId) throws HSKException{
	        SysRetrunMessage srm=new SysRetrunMessage(1l);
			  	
			try{
		   			AgWorkModelGx     att_AgWorkModelGx= agWorkModelGxDao.findAgWorkModelGxById( awmgId) ;
					srm.setObj(att_AgWorkModelGx);
				} catch (HSKDBException e) {
					e.printStackTrace(); 
					srm.setCode(0l);
					srm.setMeg(e.getMessage()); 
				}
				 return srm ;
	} 

    /**
	 * 根据ag_work_model_gx表主键删除AgWorkModelGx对象记录
     * @param  awmgId  Integer类型(ag_work_model_gx表主键)
	 * @throws HSKException
	 */

	public AgWorkModelGx findObject(Integer awmgId) throws HSKException{
			AgWorkModelGx  att_AgWorkModelGx=new AgWorkModelGx();		
			try{
		        att_AgWorkModelGx= agWorkModelGxDao.findAgWorkModelGxById( awmgId) ;
				} catch (HSKDBException e) {
					e.printStackTrace(); 
					throw new  HSKException(e);
				}
				return  att_AgWorkModelGx;
	}
	
	 
	 /**
	 * 根据ag_work_model_gx表主键删除AgWorkModelGx对象记录
     * @param  awmgId  Integer类型(ag_work_model_gx表主键)
     * @return SysRetrunMessage 对象记录
	 * @throws HSKException
	 */
	public SysRetrunMessage deleteObject(Integer awmgId) throws HSKException{  
		    SysRetrunMessage srm=new SysRetrunMessage(1l);
		   try{ 
				agWorkModelGxDao.deleteAgWorkModelGxById(awmgId);
			 } catch (Exception e) {
					e.printStackTrace(); 
					throw new  HSKException(e);
		     }
		   return srm;  
	}
	
	/**
	 * 根据ag_work_model_gx表主键删除多条AgWorkModelGx对象记录
     * @param  AwmgIds  Integer类型(ag_work_model_gx表主键)
     * @return SysRetrunMessage 对象记录
	 * @throws HSKException
	 */
	public SysRetrunMessage deleteAllObject(String awmgIds) throws HSKException{
		SysRetrunMessage srm = new SysRetrunMessage(1l);
		try {
			String[] ids = awmgIds.split(",");
			for (String did : ids) {
				if (did != null && !"".equals(did.trim())) {
					agWorkModelGxDao.deleteAgWorkModelGxById(Integer
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
	 * 新增或修改ag_work_model_gx表记录 ,如果ag_work_model_gx表主键AgWorkModelGx.AwmgId为空就是添加，如果非空就是修改
     * @param  att_AgWorkModelGx  AgWorkModelGx类型(ag_work_model_gx表记录)
     * @return AgWorkModelGx  修改后的AgWorkModelGx对象记录
	 * @throws HSKDBException
	 */
	public SysRetrunMessage saveOrUpdateObject( AgWorkModelGx att_AgWorkModelGx) throws HSKException{
			 SysRetrunMessage srm = new SysRetrunMessage(1l);
			  try{
					agWorkModelGxDao.saveOrUpdateAgWorkModelGx(att_AgWorkModelGx); 
					srm.setObj(att_AgWorkModelGx);
			    } catch (Exception e) {
					e.printStackTrace(); 
					throw new HSKException(e);
		        }
			return srm;	  
	}
	
	 
	/**
	 *根据AgWorkModelGx对象作为对(ag_work_model_gx表进行查询，获取分页对象
     * @param  att_AgWorkModelGx  AgWorkModelGx类型(ag_work_model_gx表记录)
     * @return PagerModel  分页对象
	 * @throws HSKException 
	 */
	public PagerModel getPagerModelObject (AgWorkModelGx att_AgWorkModelGx) throws HSKException{
		PagerModel pm=new PagerModel(new ArrayList<AgWorkModelGx>());
			  try{
					pm=agWorkModelGxDao.getPagerModelByAgWorkModelGx(att_AgWorkModelGx);
			    } catch (Exception e) {
					e.printStackTrace(); 
		        }
		return pm;
	}

	 
	public List<AgWorkModelGx> getListObject(AgWorkModelGx att_AgWorkModelGx)
			throws HSKException {
		List<AgWorkModelGx> list_obj=null;
		try {
			list_obj = agWorkModelGxDao.getListByAgWorkModelGx(att_AgWorkModelGx);
		} catch (HSKDBException e) {
			e.printStackTrace();
		}
		 return list_obj;
	} 
	 
}