package com.hsk.angeldoctor.web.order.service.imp;

import java.util.*;
import org.springframework.stereotype.*;
import org.springframework.beans.factory.annotation.Autowired;
import com.hsk.supper.dto.comm.PagerModel;
import com.hsk.supper.dto.comm.SysRetrunMessage;
import com.hsk.xframe.api.persistence.SysFileInfo;
import com.hsk.xframe.api.service.imp.DSTService;
import com.hsk.xframe.api.utils.freeMarker.CommonUtil;
import com.hsk.xframe.web.sysfile.service.IFileService;
import com.hsk.exception.HSKDBException;
import com.hsk.exception.HSKException;
import com.hsk.angeldoctor.web.order.service.*;
import com.hsk.angeldoctor.api.persistence.*;
import com.hsk.angeldoctor.api.daobbase.*;


/** 
  order业务操作实现类 
 * @author  作者:admin
 * @version  版本信息:v1.0   创建时间: 2018-08-14 13:35:37
 */
 
@Service
public class  AgWechatInfoService extends DSTService implements IAgWechatInfoService {	
   /**
   *业务处理dao类  agWechatInfoDao 
   */
	@Autowired
	protected IAgWechatInfoDao agWechatInfoDao;

 /**
	 * 根据ag_wechat_info表主键删除AgWechatInfo对象记录
     * @param  wechatUserId  Integer类型(ag_wechat_info表主键)
	 * @return SysRetrunMessage 对象记录
	 * @throws HSKException
	 */

	public SysRetrunMessage findFormObject(Integer wechatUserId) throws HSKException{
	        SysRetrunMessage srm=new SysRetrunMessage(1l);
			  	
			try{
		   			AgWechatInfo     att_AgWechatInfo= agWechatInfoDao.findAgWechatInfoById( wechatUserId) ;
					srm.setObj(att_AgWechatInfo);
				} catch (HSKDBException e) {
					e.printStackTrace(); 
					srm.setCode(0l);
					srm.setMeg(e.getMessage()); 
				}
				 return srm ;
	} 

    /**
	 * 根据ag_wechat_info表主键删除AgWechatInfo对象记录
     * @param  wechatUserId  Integer类型(ag_wechat_info表主键)
	 * @throws HSKException
	 */

	public AgWechatInfo findObject(Integer wechatUserId) throws HSKException{
			AgWechatInfo  att_AgWechatInfo=new AgWechatInfo();		
			try{
		        att_AgWechatInfo= agWechatInfoDao.findAgWechatInfoById( wechatUserId) ;
				} catch (HSKDBException e) {
					e.printStackTrace(); 
					throw new  HSKException(e);
				}
				return  att_AgWechatInfo;
	}
	
	 
	 /**
	 * 根据ag_wechat_info表主键删除AgWechatInfo对象记录
     * @param  wechatUserId  Integer类型(ag_wechat_info表主键)
     * @return SysRetrunMessage 对象记录
	 * @throws HSKException
	 */
	public SysRetrunMessage deleteObject(Integer wechatUserId) throws HSKException{  
		    SysRetrunMessage srm=new SysRetrunMessage(1l);
		   try{ 
				agWechatInfoDao.deleteAgWechatInfoById(wechatUserId);
			 } catch (Exception e) {
					e.printStackTrace(); 
					throw new  HSKException(e);
		     }
		   return srm;  
	}
	
	/**
	 * 根据ag_wechat_info表主键删除多条AgWechatInfo对象记录
     * @param  WechatUserIds  Integer类型(ag_wechat_info表主键)
     * @return SysRetrunMessage 对象记录
	 * @throws HSKException
	 */
	public SysRetrunMessage deleteAllObject(String wechatUserIds) throws HSKException{
		SysRetrunMessage srm = new SysRetrunMessage(1l);
		try {
			String[] ids = wechatUserIds.split(",");
			for (String did : ids) {
				if (did != null && !"".equals(did.trim())) {
					agWechatInfoDao.deleteAgWechatInfoById(Integer
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
	 * 新增或修改ag_wechat_info表记录 ,如果ag_wechat_info表主键AgWechatInfo.WechatUserId为空就是添加，如果非空就是修改
     * @param  att_AgWechatInfo  AgWechatInfo类型(ag_wechat_info表记录)
     * @return AgWechatInfo  修改后的AgWechatInfo对象记录
	 * @throws HSKDBException
	 */
	public SysRetrunMessage saveOrUpdateObject( AgWechatInfo att_AgWechatInfo) throws HSKException{
			 SysRetrunMessage srm = new SysRetrunMessage(1l);
			  try{
				  	agWechatInfoDao.saveOrUpdateAgWechatInfo(att_AgWechatInfo); 
					srm.setObj(att_AgWechatInfo);
			    } catch (Exception e) {
					e.printStackTrace(); 
					throw new HSKException(e);
		        }
			return srm;	  
	}
	
	 
	/**
	 *根据AgWechatInfo对象作为对(ag_wechat_info表进行查询，获取分页对象
     * @param  att_AgWechatInfo  AgWechatInfo类型(ag_wechat_info表记录)
     * @return PagerModel  分页对象
	 * @throws HSKException 
	 */
	public PagerModel getPagerModelObject (AgWechatInfo att_AgWechatInfo) throws HSKException{
		PagerModel pm=new PagerModel(new ArrayList<AgWechatInfo>());
			  try{
					pm=agWechatInfoDao.getPagerModelByAgWechatInfo(att_AgWechatInfo);
			    } catch (Exception e) {
					e.printStackTrace(); 
		        }
		return pm;
	}

	@Override
	public AgWechatInfo getAgWechatInfoByOpenId(String openId) throws HSKException {
		AgWechatInfo agWechatInfo = new AgWechatInfo();
		agWechatInfo.setOpenId(openId);
		agWechatInfo.setStatus("0");
		List<AgWechatInfo> reList;
		try {
			reList = agWechatInfoDao.getListByAgWechatInfo(agWechatInfo);
			if(reList !=null && reList.size() >0)
				return reList.get(0);
		} catch (HSKDBException e) {
			e.printStackTrace();
		}
		return null;
	}
	 
}