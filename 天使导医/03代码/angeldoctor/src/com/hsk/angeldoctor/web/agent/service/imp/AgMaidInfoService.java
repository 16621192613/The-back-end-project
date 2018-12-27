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
public class  AgMaidInfoService extends DSTService implements IAgMaidInfoService {	
   /**
   *业务处理dao类  agMaidInfoDao 
   */
	@Autowired
	protected IAgMaidInfoDao agMaidInfoDao;
	@Autowired
	protected IAgDoctorInfoDao agDoctorInfoDao;
	
	@Autowired
	protected IAgMaidViewDao agMaidViewDao;

 /**
	 * 根据ag_maid_info表主键删除AgMaidInfo对象记录
     * @param  amiId  Integer类型(ag_maid_info表主键)
	 * @return SysRetrunMessage 对象记录
	 * @throws HSKException
	 */

	public SysRetrunMessage findFormObject(Integer amiId) throws HSKException{
	        SysRetrunMessage srm=new SysRetrunMessage(1l);
			  	
			try{
		   			AgMaidInfo     att_AgMaidInfo= agMaidInfoDao.findAgMaidInfoById( amiId) ;
					srm.setObj(att_AgMaidInfo);
				} catch (HSKDBException e) {
					e.printStackTrace(); 
					srm.setCode(0l);
					srm.setMeg(e.getMessage()); 
				}
				 return srm ;
	} 

    /**
	 * 根据ag_maid_info表主键删除AgMaidInfo对象记录
     * @param  amiId  Integer类型(ag_maid_info表主键)
	 * @throws HSKException
	 */

	public AgMaidInfo findObject(Integer amiId) throws HSKException{
			AgMaidInfo  att_AgMaidInfo=new AgMaidInfo();		
			try{
		        att_AgMaidInfo= agMaidInfoDao.findAgMaidInfoById( amiId) ;
				} catch (HSKDBException e) {
					e.printStackTrace(); 
					throw new  HSKException(e);
				}
				return  att_AgMaidInfo;
	}
	
	 
	 /**
	 * 根据ag_maid_info表主键删除AgMaidInfo对象记录
     * @param  amiId  Integer类型(ag_maid_info表主键)
     * @return SysRetrunMessage 对象记录
	 * @throws HSKException
	 */
	public SysRetrunMessage deleteObject(Integer amiId) throws HSKException{  
		    SysRetrunMessage srm=new SysRetrunMessage(1l);
		   try{ 
				agMaidInfoDao.deleteAgMaidInfoById(amiId);
			 } catch (Exception e) {
					e.printStackTrace(); 
					throw new  HSKException(e);
		     }
		   return srm;  
	}
	
	/**
	 * 根据ag_maid_info表主键删除多条AgMaidInfo对象记录
     * @param  AmiIds  Integer类型(ag_maid_info表主键)
     * @return SysRetrunMessage 对象记录
	 * @throws HSKException
	 */
	public SysRetrunMessage deleteAllObject(String amiIds) throws HSKException{
		SysRetrunMessage srm = new SysRetrunMessage(1l);
		try {
			String[] ids = amiIds.split(",");
			for (String did : ids) {
				if (did != null && !"".equals(did.trim())) {
					agMaidInfoDao.deleteAgMaidInfoById(Integer
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
	 * 新增或修改ag_maid_info表记录 ,如果ag_maid_info表主键AgMaidInfo.AmiId为空就是添加，如果非空就是修改
     * @param  att_AgMaidInfo  AgMaidInfo类型(ag_maid_info表记录)
     * @return AgMaidInfo  修改后的AgMaidInfo对象记录
	 * @throws HSKDBException
	 */
	public SysRetrunMessage saveOrUpdateObject( AgMaidInfo att_AgMaidInfo) throws HSKException{
			 SysRetrunMessage srm = new SysRetrunMessage(1l);
			  try{
					agMaidInfoDao.saveOrUpdateAgMaidInfo(att_AgMaidInfo); 
					srm.setObj(att_AgMaidInfo);
			    } catch (Exception e) {
					e.printStackTrace(); 
					throw new HSKException(e);
		        }
			return srm;	  
	}
	
	 
	/**
	 *根据AgMaidInfo对象作为对(ag_maid_info表进行查询，获取分页对象
     * @param  att_AgMaidInfo  AgMaidInfo类型(ag_maid_info表记录)
     * @return PagerModel  分页对象
	 * @throws HSKException 
	 */
	public PagerModel getPagerModelObject (AgMaidInfo att_AgMaidInfo) throws HSKException{
		PagerModel pm=new PagerModel(new ArrayList<AgMaidInfo>());
			  try{
					pm=agMaidInfoDao.getPagerModelByAgMaidInfo(att_AgMaidInfo);
			    } catch (Exception e) {
					e.printStackTrace(); 
		        }
		return pm;
	}

	 
	public PagerModel getPagerModelMaidView(AgMaidView att_AgMaidView)
			throws HSKException {
		PagerModel pm=new PagerModel(new ArrayList<AgMaidView>());
		  try{
				pm=agMaidViewDao.getPagerModelByAgMaidView(att_AgMaidView);
		    } catch (Exception e) {
				e.printStackTrace(); 
	        }
		  return pm; 
	}

	@Override
	public PagerModel getPagerModelAgDealCountView(
			AgDealCountView att_AgDealCountView) throws HSKException {
		PagerModel pm=new PagerModel(new ArrayList<AgMaidInfo>());
		  try{
			  if(this.GetOneSessionAccount().getUserType()==2){//如果是医院管理员登录
				  att_AgDealCountView.setOrganizationId(this.GetOneSessionAccount().getSroleId());
				}else if(this.GetOneSessionAccount().getUserType()==3){//如果是医生登录
					AgDoctorInfo att_AgDoctorInfo= agDoctorInfoDao.findAgDoctorInfoById(this.GetOneSessionAccount().getSroleId());
					att_AgDealCountView.setOrganizationId(att_AgDoctorInfo.getOrganizationId());
				}else if(this.GetOneSessionAccount().getUserType()==4){//如果是代理商登陆
					att_AgDealCountView.setAaiId(this.GetOneSessionAccount().getSroleId());
				}
			  	att_AgDealCountView.setRegisterType("0,1");
				pm=agMaidViewDao.getPagerModelByAgDealCountView(att_AgDealCountView);
		    } catch (Exception e) {
				e.printStackTrace(); 
	        }
		  return pm; 
	}

	@Override
	public PagerModel getPagerModelAgMaidOrView(AgMaidOrView att_AgMaidOrView) throws HSKException {
		PagerModel pm=new PagerModel(new ArrayList<AgMaidOrView>());
		  try{
				pm=agMaidViewDao.getPagerModelByAgMaidOrView(att_AgMaidOrView);
		    } catch (Exception e) {
				e.printStackTrace(); 
	        }
		  return pm; 
	} 
	 
}