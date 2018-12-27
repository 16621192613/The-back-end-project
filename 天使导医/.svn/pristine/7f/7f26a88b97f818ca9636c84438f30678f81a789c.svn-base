package com.hsk.angeldoctor.api.daobbase;

import java.util.List;

import com.hsk.angeldoctor.api.persistence.AgAppDevice;
import com.hsk.exception.HSKDBException;

public interface IAgAppDeviceDao {
	
	/**
	 * 根据ag_app_device表主键查找AgAppDevice对象记录
	 * @param  AadId  Integer类型(ag_app_device表主键)
	 * @return AgAppDevice ag_app_device表记录
	 * @throws HSKDBException
	 */	
	public AgAppDevice findAgAppDeviceById(Integer AadId) throws HSKDBException;
	
	/**
	 * 根据ag_app_device表主键删除AgAppDevice对象记录
     * @param  AadId  Integer类型(ag_app_device表主键)
	 * @throws HSKDBException
	 */
	public void deleteAgAppDeviceById(Integer AadId) throws HSKDBException;
	
	/**
	 * 新增ag_app_device表 记录
     * @param  att_AgAppDevice  AgAppDevice类型(ag_app_device表记录)
     * @return ag_app_device表主键值
	 * @throws HSKDBException
	 */
	public Integer saveAgAppDevice(AgAppDevice att_AgAppDevice) throws HSKDBException;
	
	 /**
	 * 新增或修改ag_app_device表记录 ,如果ag_app_device表主键AgAppDevice.AadId为空就是添加，如果非空就是修改
     * @param  att_AgAppDevice  AgAppDevice类型(ag_app_device表记录)
     * @return AgAppDevice  修改后的AgAppDevice对象记录
	 * @throws HSKDBException
	 */
	public  AgAppDevice saveOrUpdateAgAppDevice( AgAppDevice att_AgAppDevice) throws HSKDBException;
	/**
	 * 查询所有的设备
	 * @param att_AgAppDevice
	 * @return
	 * @throws HSKDBException
	 */
	public List<AgAppDevice> getListByAgAppDevice ( AgAppDevice att_AgAppDevice) throws HSKDBException;
	/**
	 * 根据业务员ID查询设备信息
	 * @param agentId
	 * @return
	 * @throws HSKDBException
	 */
	public AgAppDevice getAgAppDeviceByAgentId(Integer agentId) throws HSKDBException;
}
