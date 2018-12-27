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
 * @version  版本信息:v1.0   创建时间: 2018-08-14 13:40:22
 */
 
@Service
public class  SysChannelInfoService extends DSTService implements ISysChannelInfoService {	
   /**
   *业务处理dao类  sysChannelInfoDao 
   */
	@Autowired
	protected ISysChannelInfoDao sysChannelInfoDao;


 /**
	 * 根据sys_channel_info表主键删除SysChannelInfo对象记录
     * @param  menuId  Integer类型(sys_channel_info表主键)
	 * @return SysRetrunMessage 对象记录
	 * @throws HSKException
	 */

	public SysRetrunMessage findFormObject(Integer menuId) throws HSKException{
	        SysRetrunMessage srm=new SysRetrunMessage(1l);
			  	
			try{
		   			SysChannelInfo     att_SysChannelInfo= sysChannelInfoDao.findSysChannelInfoById( menuId) ;
					srm.setObj(att_SysChannelInfo);
				} catch (HSKDBException e) {
					e.printStackTrace(); 
					srm.setCode(0l);
					srm.setMeg(e.getMessage()); 
				}
				 return srm ;
	} 

    /**
	 * 根据sys_channel_info表主键删除SysChannelInfo对象记录
     * @param  menuId  Integer类型(sys_channel_info表主键)
	 * @throws HSKException
	 */

	public SysChannelInfo findObject(Integer menuId) throws HSKException{
			SysChannelInfo  att_SysChannelInfo=new SysChannelInfo();		
			try{
		        att_SysChannelInfo= sysChannelInfoDao.findSysChannelInfoById( menuId) ;
				} catch (HSKDBException e) {
					e.printStackTrace(); 
					throw new  HSKException(e);
				}
				return  att_SysChannelInfo;
	}
	
	 
	 /**
	 * 根据sys_channel_info表主键删除SysChannelInfo对象记录
     * @param  menuId  Integer类型(sys_channel_info表主键)
     * @return SysRetrunMessage 对象记录
	 * @throws HSKException
	 */
	public SysRetrunMessage deleteObject(Integer menuId) throws HSKException{  
		    SysRetrunMessage srm=new SysRetrunMessage(1l);
		   try{ 
				sysChannelInfoDao.deleteSysChannelInfoById(menuId);
			 } catch (Exception e) {
					e.printStackTrace(); 
					throw new  HSKException(e);
		     }
		   return srm;  
	}
	
	/**
	 * 根据sys_channel_info表主键删除多条SysChannelInfo对象记录
     * @param  MenuIds  Integer类型(sys_channel_info表主键)
     * @return SysRetrunMessage 对象记录
	 * @throws HSKException
	 */
	public SysRetrunMessage deleteAllObject(String menuIds) throws HSKException{
		SysRetrunMessage srm = new SysRetrunMessage(1l);
		try {
			String[] ids = menuIds.split(",");
			for (String did : ids) {
				if (did != null && !"".equals(did.trim())) {
					sysChannelInfoDao.deleteSysChannelInfoById(Integer
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
	 * 新增或修改sys_channel_info表记录 ,如果sys_channel_info表主键SysChannelInfo.MenuId为空就是添加，如果非空就是修改
     * @param  att_SysChannelInfo  SysChannelInfo类型(sys_channel_info表记录)
     * @return SysChannelInfo  修改后的SysChannelInfo对象记录
	 * @throws HSKDBException
	 */
	public SysRetrunMessage saveOrUpdateObject( SysChannelInfo att_SysChannelInfo) throws HSKException{
			 SysRetrunMessage srm = new SysRetrunMessage(1l);
			  try{
					sysChannelInfoDao.saveOrUpdateSysChannelInfo(att_SysChannelInfo); 
					srm.setObj(att_SysChannelInfo);
			    } catch (Exception e) {
					e.printStackTrace(); 
					throw new HSKException(e);
		        }
			return srm;	  
	}
	
	 
	/**
	 *根据SysChannelInfo对象作为对(sys_channel_info表进行查询，获取分页对象
     * @param  att_SysChannelInfo  SysChannelInfo类型(sys_channel_info表记录)
     * @return PagerModel  分页对象
	 * @throws HSKException 
	 */
	public PagerModel getPagerModelObject (SysChannelInfo att_SysChannelInfo) throws HSKException{
		PagerModel pm=new PagerModel(new ArrayList<SysChannelInfo>());
			  try{
					pm=sysChannelInfoDao.getPagerModelBySysChannelInfo(att_SysChannelInfo);
			    } catch (Exception e) {
					e.printStackTrace(); 
		        }
		return pm;
	}

	@Override
	public List<SysChannelInfo> getSysChannelInfoList() throws HSKException {
		List<SysChannelInfo> list = new ArrayList<SysChannelInfo>();
		SysChannelInfo sysChannelInfo = new SysChannelInfo();
		try {
			sysChannelInfo.setTab_order("orderNum");
			list=sysChannelInfoDao.getListBySysChannelInfo(sysChannelInfo);
		} catch (HSKDBException e) {
			e.printStackTrace();
		}
		return list;
	} 
	 
}