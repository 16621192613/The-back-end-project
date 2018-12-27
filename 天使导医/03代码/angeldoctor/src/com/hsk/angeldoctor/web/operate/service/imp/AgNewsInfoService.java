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
import com.hsk.angeldoctor.web.operate.thread.NewsRunnable;
import com.hsk.angeldoctor.api.persistence.*;
import com.hsk.angeldoctor.api.daobbase.*;


/** 
  operate业务操作实现类 
 * @author  作者:admin
 * @version  版本信息:v1.0   创建时间: 2018-08-14 13:40:22
 */
 
@Service
public class  AgNewsInfoService extends DSTService implements IAgNewsInfoService {	
   /**
   *业务处理dao类  agNewsInfoDao 
   */
	@Autowired
	protected IAgNewsInfoDao agNewsInfoDao;
	@Autowired
	private IAgAppNotificationDao agAppNotificationDao;
	@Autowired
	private IAgAppDeviceDao agAppDeviceDao;


 /**
	 * 根据ag_news_info表主键删除AgNewsInfo对象记录
     * @param  aniId  Integer类型(ag_news_info表主键)
	 * @return SysRetrunMessage 对象记录
	 * @throws HSKException
	 */

	public SysRetrunMessage findFormObject(Integer aniId) throws HSKException{
	        SysRetrunMessage srm=new SysRetrunMessage(1l);
			  	
			try{
		   			AgNewsInfo     att_AgNewsInfo= agNewsInfoDao.findAgNewsInfoById( aniId) ;
					srm.setObj(att_AgNewsInfo);
				} catch (HSKDBException e) {
					e.printStackTrace(); 
					srm.setCode(0l);
					srm.setMeg(e.getMessage()); 
				}
				 return srm ;
	} 

    /**
	 * 根据ag_news_info表主键删除AgNewsInfo对象记录
     * @param  aniId  Integer类型(ag_news_info表主键)
	 * @throws HSKException
	 */

	public AgNewsInfo findObject(Integer aniId) throws HSKException{
			AgNewsInfo  att_AgNewsInfo=new AgNewsInfo();		
			try{
		        att_AgNewsInfo= agNewsInfoDao.findAgNewsInfoById( aniId) ;
				} catch (HSKDBException e) {
					e.printStackTrace(); 
					throw new  HSKException(e);
				}
				return  att_AgNewsInfo;
	}
	
	 
	 /**
	 * 根据ag_news_info表主键删除AgNewsInfo对象记录
     * @param  aniId  Integer类型(ag_news_info表主键)
     * @return SysRetrunMessage 对象记录
	 * @throws HSKException
	 */
	public SysRetrunMessage deleteObject(Integer aniId) throws HSKException{  
		    SysRetrunMessage srm=new SysRetrunMessage(1l);
		   try{ 
				agNewsInfoDao.deleteAgNewsInfoById(aniId);
			 } catch (Exception e) {
					e.printStackTrace(); 
					throw new  HSKException(e);
		     }
		   return srm;  
	}
	
	/**
	 * 根据ag_news_info表主键删除多条AgNewsInfo对象记录
     * @param  AniIds  Integer类型(ag_news_info表主键)
     * @return SysRetrunMessage 对象记录
	 * @throws HSKException
	 */
	public SysRetrunMessage deleteAllObject(String aniIds) throws HSKException{
		SysRetrunMessage srm = new SysRetrunMessage(1l);
		try {
			String[] ids = aniIds.split(",");
			for (String did : ids) {
				if (did != null && !"".equals(did.trim())) {
					agNewsInfoDao.deleteAgNewsInfoById(Integer
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
	 * 新增或修改ag_news_info表记录 ,如果ag_news_info表主键AgNewsInfo.AniId为空就是添加，如果非空就是修改
     * @param  att_AgNewsInfo  AgNewsInfo类型(ag_news_info表记录)
     * @return AgNewsInfo  修改后的AgNewsInfo对象记录
	 * @throws HSKDBException
	 */
	public SysRetrunMessage saveOrUpdateObject( AgNewsInfo att_AgNewsInfo) throws HSKException{
			 SysRetrunMessage srm = new SysRetrunMessage(1l);
			  try{
					agNewsInfoDao.saveOrUpdateAgNewsInfo(att_AgNewsInfo); 
					//启动一个线程发送信息
					NewsRunnable newsRunnable = new NewsRunnable(att_AgNewsInfo.getTitle(),att_AgNewsInfo.getBody());
					Thread newsThread = new Thread(newsRunnable);
					newsThread.start();
					srm.setObj(att_AgNewsInfo);
			    } catch (Exception e) {
					e.printStackTrace(); 
					throw new HSKException(e);
		        }
			return srm;	  
	}
	
	 
	/**
	 *根据AgNewsInfo对象作为对(ag_news_info表进行查询，获取分页对象
     * @param  att_AgNewsInfo  AgNewsInfo类型(ag_news_info表记录)
     * @return PagerModel  分页对象
	 * @throws HSKException 
	 */
	public PagerModel getPagerModelObject (AgNewsInfo att_AgNewsInfo) throws HSKException{
		PagerModel pm=new PagerModel(new ArrayList<AgNewsInfo>());
			  try{	
				  att_AgNewsInfo.setTab_order("aniId desc");
					pm=agNewsInfoDao.getPagerModelByAgNewsInfo(att_AgNewsInfo);
			    } catch (Exception e) {
					e.printStackTrace(); 
		        }
		return pm;
	}

	@Override
	public SysRetrunMessage saveAllNews(String title, String content) throws HSKException {
		SysRetrunMessage srm = new SysRetrunMessage(1l);
		try{	
			AgAppDevice agAppDevice = new AgAppDevice();
			List<AgAppDevice> deList = agAppDeviceDao.getListByAgAppDevice(agAppDevice);
			if(deList !=null && deList.size() >0){
				for(AgAppDevice de : deList){
					AgAppNotification agAppNotification = new AgAppNotification();
					agAppNotification.setTitle(title);
					agAppNotification.setBody(content);
					agAppNotification.setType("0");;
					agAppNotification.setCreateDate(new Date());
					agAppNotification.setAgentId(de.getAgentId());
					agAppNotificationDao.saveAgAppNotification(de, agAppNotification);
				}
			}
		} catch (Exception e) {
			e.printStackTrace(); 
	    }
		return srm;
	} 
	 
}