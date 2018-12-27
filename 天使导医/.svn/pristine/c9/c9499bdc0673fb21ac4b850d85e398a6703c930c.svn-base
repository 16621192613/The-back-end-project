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
 * @version  版本信息:v1.0   创建时间: 2018-08-14 13:27:59
 */
 
@Service
public class  AgDoctorDepartmentGxService extends DSTService implements IAgDoctorDepartmentGxService {	
   /**
   *业务处理dao类  agDoctorDepartmentGxDao 
   */
	@Autowired
	protected IAgDoctorDepartmentGxDao agDoctorDepartmentGxDao;


 /**
	 * 根据ag_doctor_department_gx表主键删除AgDoctorDepartmentGx对象记录
     * @param  addgId  Integer类型(ag_doctor_department_gx表主键)
	 * @return SysRetrunMessage 对象记录
	 * @throws HSKException
	 */

	public SysRetrunMessage findFormObject(Integer addgId) throws HSKException{
	        SysRetrunMessage srm=new SysRetrunMessage(1l);
			  	
			try{
		   			AgDoctorDepartmentGx     att_AgDoctorDepartmentGx= agDoctorDepartmentGxDao.findAgDoctorDepartmentGxById( addgId) ;
					srm.setObj(att_AgDoctorDepartmentGx);
				} catch (HSKDBException e) {
					e.printStackTrace(); 
					srm.setCode(0l);
					srm.setMeg(e.getMessage()); 
				}
				 return srm ;
	} 

    /**
	 * 根据ag_doctor_department_gx表主键删除AgDoctorDepartmentGx对象记录
     * @param  addgId  Integer类型(ag_doctor_department_gx表主键)
	 * @throws HSKException
	 */

	public AgDoctorDepartmentGx findObject(Integer addgId) throws HSKException{
			AgDoctorDepartmentGx  att_AgDoctorDepartmentGx=new AgDoctorDepartmentGx();		
			try{
		        att_AgDoctorDepartmentGx= agDoctorDepartmentGxDao.findAgDoctorDepartmentGxById( addgId) ;
				} catch (HSKDBException e) {
					e.printStackTrace(); 
					throw new  HSKException(e);
				}
				return  att_AgDoctorDepartmentGx;
	}
	
	 
	 /**
	 * 根据ag_doctor_department_gx表主键删除AgDoctorDepartmentGx对象记录
     * @param  addgId  Integer类型(ag_doctor_department_gx表主键)
     * @return SysRetrunMessage 对象记录
	 * @throws HSKException
	 */
	public SysRetrunMessage deleteObject(Integer addgId) throws HSKException{  
		    SysRetrunMessage srm=new SysRetrunMessage(1l);
		   try{ 
				agDoctorDepartmentGxDao.deleteAgDoctorDepartmentGxById(addgId);
			 } catch (Exception e) {
					e.printStackTrace(); 
					throw new  HSKException(e);
		     }
		   return srm;  
	}
	
	/**
	 * 根据ag_doctor_department_gx表主键删除多条AgDoctorDepartmentGx对象记录
     * @param  AddgIds  Integer类型(ag_doctor_department_gx表主键)
     * @return SysRetrunMessage 对象记录
	 * @throws HSKException
	 */
	public SysRetrunMessage deleteAllObject(String addgIds) throws HSKException{
		SysRetrunMessage srm = new SysRetrunMessage(1l);
		try {
			String[] ids = addgIds.split(",");
			for (String did : ids) {
				if (did != null && !"".equals(did.trim())) {
					agDoctorDepartmentGxDao.deleteAgDoctorDepartmentGxById(Integer
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
	 * 新增或修改ag_doctor_department_gx表记录 ,如果ag_doctor_department_gx表主键AgDoctorDepartmentGx.AddgId为空就是添加，如果非空就是修改
     * @param  att_AgDoctorDepartmentGx  AgDoctorDepartmentGx类型(ag_doctor_department_gx表记录)
     * @return AgDoctorDepartmentGx  修改后的AgDoctorDepartmentGx对象记录
	 * @throws HSKDBException
	 */
	public SysRetrunMessage saveOrUpdateObject( AgDoctorDepartmentGx att_AgDoctorDepartmentGx) throws HSKException{
			 SysRetrunMessage srm = new SysRetrunMessage(1l);
			  try{
					agDoctorDepartmentGxDao.saveOrUpdateAgDoctorDepartmentGx(att_AgDoctorDepartmentGx); 
					srm.setObj(att_AgDoctorDepartmentGx);
			    } catch (Exception e) {
					e.printStackTrace(); 
					throw new HSKException(e);
		        }
			return srm;	  
	}
	
	 
	/**
	 *根据AgDoctorDepartmentGx对象作为对(ag_doctor_department_gx表进行查询，获取分页对象
     * @param  att_AgDoctorDepartmentGx  AgDoctorDepartmentGx类型(ag_doctor_department_gx表记录)
     * @return PagerModel  分页对象
	 * @throws HSKException 
	 */
	public PagerModel getPagerModelObject (AgDoctorDepartmentGx att_AgDoctorDepartmentGx) throws HSKException{
		PagerModel pm=new PagerModel(new ArrayList<AgDoctorDepartmentGx>());
			  try{
					pm=agDoctorDepartmentGxDao.getPagerModelByAgDoctorDepartmentGx(att_AgDoctorDepartmentGx);
					 List<AgDoctorDepartmentGx>  listobj=(ArrayList<AgDoctorDepartmentGx>) pm.getItems();
					 List<AgDoctorInfo> list_back=new ArrayList<AgDoctorInfo>();
					if(listobj!=null&&listobj.size()>0){
						for(AgDoctorDepartmentGx did : listobj){
							AgDoctorInfo  adone=new AgDoctorInfo();
							list_back.add(adone);
						}
					}
					pm.setItems(list_back);
			    } catch (Exception e) {
					e.printStackTrace(); 
		        }
		return pm;
	} 
	 
}