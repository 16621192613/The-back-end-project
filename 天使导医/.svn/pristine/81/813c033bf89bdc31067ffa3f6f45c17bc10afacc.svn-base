package com.hsk.angeldoctor.web.operate.service;

import com.hsk.angeldoctor.api.persistence.AgAppNotification;
import com.hsk.exception.HSKException;
import com.hsk.supper.dto.comm.PagerModel;
import com.hsk.supper.dto.comm.SysRetrunMessage;
import com.hsk.xframe.api.service.IDSTService;

/**
 * app设备和消息集合类
 * @author Administrator
 *
 */
public interface IAgAppDeviceService extends IDSTService{
	/**
	 * 保存极光注册码
	 * @param type
	 * @param registrationID
	 * @return
	 * @throws HSKException
	 */
	public SysRetrunMessage saveAgAppDevice(String type,String registrationID) throws HSKException;
	/**
	 * 获取推送消息列表
	 * @param att_AgAppNotification
	 * @return
	 * @throws HSKException
	 */
	public PagerModel getPagerModelObject (AgAppNotification att_AgAppNotification) throws HSKException;
	

}
