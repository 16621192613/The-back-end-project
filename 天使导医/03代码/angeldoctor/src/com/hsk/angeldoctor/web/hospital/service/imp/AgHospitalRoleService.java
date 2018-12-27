package com.hsk.angeldoctor.web.hospital.service.imp;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hsk.angeldoctor.api.daobbase.IAgDoctorInfoDao;
import com.hsk.angeldoctor.api.daobbase.IAgHospitalJobDao;
import com.hsk.angeldoctor.api.daobbase.IAgHospitalRoleDao;
import com.hsk.angeldoctor.api.persistence.AgDoctorInfo;
import com.hsk.angeldoctor.api.persistence.AgHospitalJob;
import com.hsk.angeldoctor.api.persistence.AgHospitalRole;
import com.hsk.angeldoctor.web.hospital.service.IAgHospitalRoleService;
import com.hsk.exception.HSKDBException;
import com.hsk.exception.HSKException;
import com.hsk.supper.dto.comm.PagerModel;
import com.hsk.supper.dto.comm.SysRetrunMessage;
import com.hsk.xframe.api.service.imp.DSTService;


/** 
  hospital业务操作实现类 
 * @author  作者:admin
 * @version  版本信息:v1.0   创建时间: 2018-08-14 13:28:01
 */
 
@Service
public class  AgHospitalRoleService extends DSTService implements IAgHospitalRoleService {	
   /**
   *业务处理dao类  agHospitalRoleDao 
   */
	@Autowired
	protected IAgHospitalRoleDao agHospitalRoleDao;
	@Autowired
	protected IAgDoctorInfoDao agDoctorInfoDao;
	@Autowired
	protected IAgHospitalJobDao agHospitalJobDao;

 /**
	 * 根据ag_hospital_role表主键删除AgHospitalRole对象记录
     * @param  roleId  Integer类型(ag_hospital_role表主键)
	 * @return SysRetrunMessage 对象记录
	 * @throws HSKException
	 */

	public SysRetrunMessage findFormObject(Integer roleId) throws HSKException{
	        SysRetrunMessage srm=new SysRetrunMessage(1l);
			  	
			try{
		   			AgHospitalRole     att_AgHospitalRole= agHospitalRoleDao.findAgHospitalRoleById( roleId) ;
					srm.setObj(att_AgHospitalRole);
				} catch (HSKDBException e) {
					e.printStackTrace(); 
					srm.setCode(0l);
					srm.setMeg(e.getMessage()); 
				}
				 return srm ;
	} 

    /**
	 * 根据ag_hospital_role表主键删除AgHospitalRole对象记录
     * @param  roleId  Integer类型(ag_hospital_role表主键)
	 * @throws HSKException
	 */

	public AgHospitalRole findObject(Integer roleId) throws HSKException{
			AgHospitalRole  att_AgHospitalRole=new AgHospitalRole();		
			try{
		        att_AgHospitalRole= agHospitalRoleDao.findAgHospitalRoleById( roleId) ;
				} catch (HSKDBException e) {
					e.printStackTrace(); 
					throw new  HSKException(e);
				}
				return  att_AgHospitalRole;
	}
	
	 
	 /**
	 * 根据ag_hospital_role表主键删除AgHospitalRole对象记录
     * @param  roleId  Integer类型(ag_hospital_role表主键)
     * @return SysRetrunMessage 对象记录
	 * @throws HSKException
	 */
	public SysRetrunMessage deleteObject(Integer roleId) throws HSKException{  
		    SysRetrunMessage srm=new SysRetrunMessage(1l);
		   try{ 
			   AgHospitalRole att_AgHospitalRole= agHospitalRoleDao.findAgHospitalRoleById( roleId) ;
			   if(att_AgHospitalRole.getLocked().equals("1")){
				   srm.setCode(0l);
				   srm.setMeg("该角色不可删除！");
				   return srm;
			   }else{
				   AgHospitalJob job = new AgHospitalJob();
				   job.setRoleId(roleId);
				   List<AgHospitalJob> list = agHospitalJobDao.getListByAgHospitalJob(job);
				   if(list != null && list.size() > 0){
					   srm.setCode(0l);
					   srm.setMeg("该角色下有岗位信息不可删除！");
					   return srm;
				   }else
					   agHospitalRoleDao.deleteAgHospitalRoleById(roleId);
			   }
			 } catch (Exception e) {
					e.printStackTrace(); 
					throw new  HSKException(e);
		     }
		   return srm;  
	}
	
	/**
	 * 根据ag_hospital_role表主键删除多条AgHospitalRole对象记录
     * @param  RoleIds  Integer类型(ag_hospital_role表主键)
     * @return SysRetrunMessage 对象记录
	 * @throws HSKException
	 */
	public SysRetrunMessage deleteAllObject(String roleIds) throws HSKException{
		SysRetrunMessage srm = new SysRetrunMessage(1l);
		try {
			String[] ids = roleIds.split(",");
			for (String did : ids) {
				if (did != null && !"".equals(did.trim())) {
					agHospitalRoleDao.deleteAgHospitalRoleById(Integer
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
	 * 新增或修改ag_hospital_role表记录 ,如果ag_hospital_role表主键AgHospitalRole.RoleId为空就是添加，如果非空就是修改
     * @param  att_AgHospitalRole  AgHospitalRole类型(ag_hospital_role表记录)
     * @return AgHospitalRole  修改后的AgHospitalRole对象记录
	 * @throws HSKDBException
	 */
	public SysRetrunMessage saveOrUpdateObject( AgHospitalRole att_AgHospitalRole) throws HSKException{
			 SysRetrunMessage srm = new SysRetrunMessage(1l);
			  try{
				  	if(this.getUserType()==2)//如果是医院管理员登录
			  			att_AgHospitalRole.setOrganizationId(this.GetOneSessionAccount().getSroleId());
			  		else if(this.getUserType()==3){//如果是医生登录
						AgDoctorInfo att_AgDoctorInfo= agDoctorInfoDao.findAgDoctorInfoById(this.GetOneSessionAccount().getSroleId());
						att_AgHospitalRole.setOrganizationId(att_AgDoctorInfo.getOrganizationId());
					}
				  	AgHospitalRole checkInfo = new AgHospitalRole();
					checkInfo.setName(att_AgHospitalRole.getName());
					checkInfo.setOrganizationId(att_AgHospitalRole.getOrganizationId());
					List<AgHospitalRole> checkList = agHospitalRoleDao.getListByAgHospitalRole(checkInfo);
					if(checkList !=null && checkList.size() >0){
						boolean isSec=false;
					  	if(att_AgHospitalRole.getRoleId()!=null){
					  		for(AgHospitalRole xInfo : checkList){
						  		if(xInfo.getRoleId().equals(att_AgHospitalRole.getRoleId()))
						  			checkInfo=xInfo;
						  		else
						  			isSec=true;
						  	}
					  	}else
					  		isSec=true;
					  	if(isSec){
					  		srm.setCode(0l);
						    srm.setMeg("角色名已被占用！");
						    return srm;
					  	}
					  }
				  	if(att_AgHospitalRole.getRoleId()==null){
				  		att_AgHospitalRole.setLocked("0");
				  		att_AgHospitalRole.setStatus("0");
				  		att_AgHospitalRole.setCreateDate(new Date());
				  		agHospitalRoleDao.saveOrUpdateAgHospitalRole(att_AgHospitalRole); 
				  	}else if(checkInfo!=null && checkInfo.getRoleId()!=null){
				  		checkInfo.setName(att_AgHospitalRole.getName());
				  		checkInfo.setLocked(att_AgHospitalRole.getLocked());
				  		checkInfo.setStatus(att_AgHospitalRole.getStatus());
				  		agHospitalRoleDao.saveOrUpdateAgHospitalRole(checkInfo); 
				  	}else
				  		agHospitalRoleDao.saveOrUpdateAgHospitalRole(att_AgHospitalRole); 
				  	
					srm.setObj(att_AgHospitalRole);
			    } catch (Exception e) {
					e.printStackTrace(); 
					throw new HSKException(e);
		        }
			return srm;	  
	}
	
	 
	/**
	 *根据AgHospitalRole对象作为对(ag_hospital_role表进行查询，获取分页对象
     * @param  att_AgHospitalRole  AgHospitalRole类型(ag_hospital_role表记录)
     * @return PagerModel  分页对象
	 * @throws HSKException 
	 */
	public PagerModel getPagerModelObject (AgHospitalRole att_AgHospitalRole) throws HSKException{
		PagerModel pm=new PagerModel(new ArrayList<AgHospitalRole>());
			  try{
					pm=agHospitalRoleDao.getPagerModelByAgHospitalRole(att_AgHospitalRole);
			    } catch (Exception e) {
					e.printStackTrace(); 
		        }
		return pm;
	}

	@Override
	public List<AgHospitalRole> getAgHospitalRoleList() throws HSKException {
		List<AgHospitalRole> reList = new ArrayList<AgHospitalRole>();
		try{
			AgHospitalRole att_AgHospitalRole = new AgHospitalRole();
			if(this.GetOneSessionAccount().getUserType()==2){//如果是医院管理员登录
				att_AgHospitalRole.setOrganizationId(this.GetOneSessionAccount().getSroleId());
			}else if(this.GetOneSessionAccount().getUserType()==3){//如果是医生登录
				AgDoctorInfo att_AgDoctorInfo= agDoctorInfoDao.findAgDoctorInfoById(this.GetOneSessionAccount().getSroleId());
				att_AgHospitalRole.setOrganizationId(att_AgDoctorInfo.getOrganizationId());
			}
			reList = agHospitalRoleDao.getListByAgHospitalRole(att_AgHospitalRole);
	    } catch (Exception e) {
			e.printStackTrace(); 
        }
		return reList;
	} 
	 
}