package com.hsk.angeldoctor.api.daobbase;

import java.util.List;

import com.hsk.angeldoctor.api.persistence.AgAppDevice;
import com.hsk.angeldoctor.api.persistence.AgAppNotification;
import com.hsk.exception.HSKDBException;
import com.hsk.supper.dto.comm.PagerModel;

public interface IAgAppNotificationDao {
	
	/**
	 * 根据ag_app_notification表主键查找AgAppNotification对象记录
	 * @param  AanId  Integer类型(ag_app_notification表主键)
	 * @return AgAppNotification ag_app_notification表记录
	 * @throws HSKDBException
	 */	
	public AgAppNotification findAgAppNotificationById(Integer AanId) throws HSKDBException;
	
	/**
	 * 根据ag_app_notification表主键删除AgAppNotification对象记录
     * @param  AanId  Integer类型(ag_app_notification表主键)
	 * @throws HSKDBException
	 */
	public void deleteAgAppNotificationById(Integer AanId) throws HSKDBException;
	
	/**
	 * 新增ag_app_notification表 记录
     * @param  att_AgAppNotification  AgAppNotification类型(ag_app_notification表记录)
     * @return ag_app_notification表主键值
	 * @throws HSKDBException
	 */
	public Integer saveAgAppNotification(AgAppDevice att_AgAppDevice,AgAppNotification att_AgAppNotification) throws HSKDBException;
	
	 /**
	 * 新增或修改ag_app_notification表记录 ,如果ag_app_notification表主键AgAppNotification.AanId为空就是添加，如果非空就是修改
     * @param  att_AgAppNotification  AgAppNotification类型(ag_app_notification表记录)
     * @return AgAppNotification  修改后的AgAppNotification对象记录
	 * @throws HSKDBException
	 */
	public  AgAppNotification saveOrUpdateAgAppNotification( AgAppNotification att_AgAppNotification) throws HSKDBException;
	/**
	 * 查询所有
	 * @param att_AgAppNotification
	 * @return
	 * @throws HSKDBException
	 */
	public List<AgAppNotification> getListByAgAppNotification ( AgAppNotification att_AgAppNotification) throws HSKDBException;
	
	/**
	 *根据AgAppNotification对象作为对(ag_app_notification表进行查询，获取分页对象
     * @param  att_AgAppNotification  AgAppNotification类型(ag_app_notification表记录)
     * @return PagerModel  分页对象
	 * @throws HSKDBException 
	 */
	public PagerModel getPagerModelByAgAppNotification (AgAppNotification att_AgAppNotification) throws HSKDBException;

}
