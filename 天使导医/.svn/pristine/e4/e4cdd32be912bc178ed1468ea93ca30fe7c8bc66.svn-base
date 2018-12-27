package com.hsk.angeldoctor.web.operate.service.imp;

import java.util.*;
import org.springframework.stereotype.*;
import org.springframework.beans.factory.annotation.Autowired;
import com.hsk.supper.dto.comm.PagerModel;
import com.hsk.supper.dto.comm.SysRetrunMessage; 
import com.hsk.xframe.api.service.imp.DSTService;
import com.hsk.exception.HSKDBException;
import com.hsk.exception.HSKException;
import com.hsk.angeldoctor.web.operate.service.*;
import com.hsk.angeldoctor.api.persistence.*;
import com.hsk.angeldoctor.api.daobbase.*;


/** 
  operate业务操作实现类 
 * @author  作者:admin
 * @version  版本信息:v1.0   创建时间: 2018-08-14 13:40:21
 */
 
@Service
public class  AgInsideInfoService extends DSTService implements IAgInsideInfoService {	
   /**
   *业务处理dao类  agInsideInfoDao 
   */
	@Autowired
	protected IAgInsideInfoDao agInsideInfoDao;
	@Autowired
	protected IAgHospitalInfoDao agHospitalInfoDao;
 /**
	 * 根据ag_inside_info表主键删除AgInsideInfo对象记录
     * @param  aiiId  Integer类型(ag_inside_info表主键)
	 * @return SysRetrunMessage 对象记录
	 * @throws HSKException
	 */

	public SysRetrunMessage findFormObject(Integer aiiId) throws HSKException{
	        SysRetrunMessage srm=new SysRetrunMessage(1l);
			  	
			try{
		   			AgInsideInfo     att_AgInsideInfo= agInsideInfoDao.findAgInsideInfoById( aiiId) ;
					srm.setObj(att_AgInsideInfo);
				} catch (HSKDBException e) {
					e.printStackTrace(); 
					srm.setCode(0l);
					srm.setMeg(e.getMessage()); 
				}
				 return srm ;
	} 

    /**
	 * 根据ag_inside_info表主键删除AgInsideInfo对象记录
     * @param  aiiId  Integer类型(ag_inside_info表主键)
	 * @throws HSKException
	 */

	public AgInsideInfo findObject(Integer aiiId) throws HSKException{
			AgInsideInfo  att_AgInsideInfo=new AgInsideInfo();		
			try{
		        att_AgInsideInfo= agInsideInfoDao.findAgInsideInfoById( aiiId) ;
				} catch (HSKDBException e) {
					e.printStackTrace(); 
					throw new  HSKException(e);
				}
				return  att_AgInsideInfo;
	}
	
	 
	 /**
	 * 根据ag_inside_info表主键删除AgInsideInfo对象记录
     * @param  aiiId  Integer类型(ag_inside_info表主键)
     * @return SysRetrunMessage 对象记录
	 * @throws HSKException
	 */
	public SysRetrunMessage deleteObject(Integer aiiId) throws HSKException{  
		    SysRetrunMessage srm=new SysRetrunMessage(1l);
		   try{ 
			    //检查商务人士是否被使用如果被使用不允许删除
			   AgHospitalInfo agHospitalInfo = new AgHospitalInfo();
			   agHospitalInfo.setInternalBusinessPeopleId(aiiId);
			   List<AgHospitalInfo> agHospitalInfoList = agHospitalInfoDao.getListByAgHospitalInfo(agHospitalInfo);
			   if(agHospitalInfoList !=null && agHospitalInfoList.size() >0){
				   srm.setCode(0l);
				   srm.setMeg("商务人士已经被绑定！");
				   return srm;
			   }
				agInsideInfoDao.deleteAgInsideInfoById(aiiId);
			 } catch (Exception e) {
				 	srm.setCode(0l);
				 	srm.setMeg("操作失败！");
					e.printStackTrace(); 
					throw new  HSKException(e);
		     }
		   return srm;  
	}
	
	/**
	 * 根据ag_inside_info表主键删除多条AgInsideInfo对象记录
     * @param  AiiIds  Integer类型(ag_inside_info表主键)
     * @return SysRetrunMessage 对象记录
	 * @throws HSKException
	 */
	public SysRetrunMessage deleteAllObject(String aiiIds) throws HSKException{
		SysRetrunMessage srm = new SysRetrunMessage(1l);
		try {
			String[] ids = aiiIds.split(",");
			for (String did : ids) {
				if (did != null && !"".equals(did.trim())) {
					agInsideInfoDao.deleteAgInsideInfoById(Integer
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
	 * 新增或修改ag_inside_info表记录 ,如果ag_inside_info表主键AgInsideInfo.AiiId为空就是添加，如果非空就是修改
     * @param  att_AgInsideInfo  AgInsideInfo类型(ag_inside_info表记录)
     * @return AgInsideInfo  修改后的AgInsideInfo对象记录
	 * @throws HSKDBException
	 */
	public SysRetrunMessage saveOrUpdateObject( AgInsideInfo att_AgInsideInfo) throws HSKException{
			 SysRetrunMessage srm = new SysRetrunMessage(1l);
			  try{
					agInsideInfoDao.saveOrUpdateAgInsideInfo(att_AgInsideInfo); 
					srm.setObj(att_AgInsideInfo);
			    } catch (Exception e) {
					e.printStackTrace(); 
					throw new HSKException(e);
		        }
			return srm;	  
	}
	
	 
	/**
	 *根据AgInsideInfo对象作为对(ag_inside_info表进行查询，获取分页对象
     * @param  att_AgInsideInfo  AgInsideInfo类型(ag_inside_info表记录)
     * @return PagerModel  分页对象
	 * @throws HSKException 
	 */
	public PagerModel getPagerModelObject (AgInsideInfo att_AgInsideInfo) throws HSKException{
		PagerModel pm=new PagerModel(new ArrayList<AgInsideInfo>());
			  try{
					pm=agInsideInfoDao.getPagerModelByAgInsideInfo(att_AgInsideInfo);
			    } catch (Exception e) {
					e.printStackTrace(); 
		        }
		return pm;
	}

	@Override
	public List<AgInsideInfo> getAgInsideInfoList(AgInsideInfo att_AgInsideInfo) throws HSKException {
		List<AgInsideInfo> reList=new ArrayList<AgInsideInfo>();
		  try{
			  att_AgInsideInfo.setTab_like("name,mobile");
			  reList = agInsideInfoDao.getListByAgInsideInfo(att_AgInsideInfo);
		    } catch (Exception e) {
				e.printStackTrace(); 
	        }
		  return reList;
	} 
	 
}