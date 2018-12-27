package com.hsk.angeldoctor.web.operate.service.imp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hsk.angeldoctor.api.daobbase.IAgAppDeviceDao;
import com.hsk.angeldoctor.api.daobbase.IAgAppNotificationDao;
import com.hsk.angeldoctor.api.persistence.AgAppDevice;
import com.hsk.angeldoctor.api.persistence.AgAppNotification;
import com.hsk.angeldoctor.web.operate.service.IAgAppDeviceService;
import com.hsk.exception.HSKDBException;
import com.hsk.exception.HSKException;
import com.hsk.supper.dto.comm.PagerModel;
import com.hsk.supper.dto.comm.SysRetrunMessage;
import com.hsk.xframe.api.service.imp.DSTService;
@Service
public class AgAppDeviceService extends DSTService implements IAgAppDeviceService {
	
	@Autowired
	private IAgAppNotificationDao agAppNotificationDao;
	@Autowired
	private IAgAppDeviceDao agAppDeviceDao;
	@Override
	public SysRetrunMessage saveAgAppDevice(String type, String registrationID) throws HSKException {
		SysRetrunMessage srm = new SysRetrunMessage(1l);
		try{
			AgAppDevice agAppDevice = agAppDeviceDao.getAgAppDeviceByAgentId(this.GetOneSessionAccount().getSroleId());
			if(agAppDevice!=null && agAppDevice.getAadId()!=null){
				agAppDevice.setToken(registrationID);
				agAppDevice.setAppType(type);
			}else{
				agAppDevice = new AgAppDevice();
				agAppDevice.setAgentId(this.GetOneSessionAccount().getSroleId());
				agAppDevice.setToken(registrationID);
				agAppDevice.setAppType(type);
			}
			agAppDeviceDao.saveOrUpdateAgAppDevice(agAppDevice);
		}catch(Exception e){
			e.printStackTrace();
		}
		
		return srm;
	}

	@Override
	public PagerModel getPagerModelObject(AgAppNotification att_AgAppNotification) throws HSKException {
		PagerModel pm = new PagerModel();
		try {
			pm= agAppNotificationDao.getPagerModelByAgAppNotification(att_AgAppNotification);
		} catch (HSKDBException e) {
			e.printStackTrace();
		}
		return pm;
	}

}
