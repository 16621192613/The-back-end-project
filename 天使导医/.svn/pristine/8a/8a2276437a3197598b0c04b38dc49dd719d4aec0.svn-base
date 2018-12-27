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
 * @version  版本信息:v1.0   创建时间: 2018-08-14 13:28:00
 */
 
@Service
public class  AgHospitalMenuService extends DSTService implements IAgHospitalMenuService {	
   /**
   *业务处理dao类  agHospitalMenuDao 
   */
	@Autowired
	protected IAgHospitalMenuDao agHospitalMenuDao;


 /**
	 * 根据ag_hospital_menu表主键删除AgHospitalMenu对象记录
     * @param  menuId  Integer类型(ag_hospital_menu表主键)
	 * @return SysRetrunMessage 对象记录
	 * @throws HSKException
	 */

	public SysRetrunMessage findFormObject(Integer menuId) throws HSKException{
	        SysRetrunMessage srm=new SysRetrunMessage(1l);
			  	
			try{
		   			AgHospitalMenu     att_AgHospitalMenu= agHospitalMenuDao.findAgHospitalMenuById( menuId) ;
					srm.setObj(att_AgHospitalMenu);
				} catch (HSKDBException e) {
					e.printStackTrace(); 
					srm.setCode(0l);
					srm.setMeg(e.getMessage()); 
				}
				 return srm ;
	} 

    /**
	 * 根据ag_hospital_menu表主键删除AgHospitalMenu对象记录
     * @param  menuId  Integer类型(ag_hospital_menu表主键)
	 * @throws HSKException
	 */

	public AgHospitalMenu findObject(Integer menuId) throws HSKException{
			AgHospitalMenu  att_AgHospitalMenu=new AgHospitalMenu();		
			try{
		        att_AgHospitalMenu= agHospitalMenuDao.findAgHospitalMenuById( menuId) ;
				} catch (HSKDBException e) {
					e.printStackTrace(); 
					throw new  HSKException(e);
				}
				return  att_AgHospitalMenu;
	}
	
	 
	 /**
	 * 根据ag_hospital_menu表主键删除AgHospitalMenu对象记录
     * @param  menuId  Integer类型(ag_hospital_menu表主键)
     * @return SysRetrunMessage 对象记录
	 * @throws HSKException
	 */
	public SysRetrunMessage deleteObject(Integer menuId) throws HSKException{  
		    SysRetrunMessage srm=new SysRetrunMessage(1l);
		   try{ 
				agHospitalMenuDao.deleteAgHospitalMenuById(menuId);
			 } catch (Exception e) {
					e.printStackTrace(); 
					throw new  HSKException(e);
		     }
		   return srm;  
	}
	
	/**
	 * 根据ag_hospital_menu表主键删除多条AgHospitalMenu对象记录
     * @param  MenuIds  Integer类型(ag_hospital_menu表主键)
     * @return SysRetrunMessage 对象记录
	 * @throws HSKException
	 */
	public SysRetrunMessage deleteAllObject(String menuIds) throws HSKException{
		SysRetrunMessage srm = new SysRetrunMessage(1l);
		try {
			String[] ids = menuIds.split(",");
			for (String did : ids) {
				if (did != null && !"".equals(did.trim())) {
					agHospitalMenuDao.deleteAgHospitalMenuById(Integer
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
	 * 新增或修改ag_hospital_menu表记录 ,如果ag_hospital_menu表主键AgHospitalMenu.MenuId为空就是添加，如果非空就是修改
     * @param  att_AgHospitalMenu  AgHospitalMenu类型(ag_hospital_menu表记录)
     * @return AgHospitalMenu  修改后的AgHospitalMenu对象记录
	 * @throws HSKDBException
	 */
	public SysRetrunMessage saveOrUpdateObject( AgHospitalMenu att_AgHospitalMenu) throws HSKException{
			 SysRetrunMessage srm = new SysRetrunMessage(1l);
			  try{
					agHospitalMenuDao.saveOrUpdateAgHospitalMenu(att_AgHospitalMenu); 
					srm.setObj(att_AgHospitalMenu);
			    } catch (Exception e) {
					e.printStackTrace(); 
					throw new HSKException(e);
		        }
			return srm;	  
	}
	
	 
	/**
	 *根据AgHospitalMenu对象作为对(ag_hospital_menu表进行查询，获取分页对象
     * @param  att_AgHospitalMenu  AgHospitalMenu类型(ag_hospital_menu表记录)
     * @return PagerModel  分页对象
	 * @throws HSKException 
	 */
	public PagerModel getPagerModelObject (AgHospitalMenu att_AgHospitalMenu) throws HSKException{
		PagerModel pm=new PagerModel(new ArrayList<AgHospitalMenu>());
			  try{
					pm=agHospitalMenuDao.getPagerModelByAgHospitalMenu(att_AgHospitalMenu);
			    } catch (Exception e) {
					e.printStackTrace(); 
		        }
		return pm;
	} 
	 
}