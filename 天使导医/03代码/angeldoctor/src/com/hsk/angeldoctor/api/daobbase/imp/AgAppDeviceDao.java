package com.hsk.angeldoctor.api.daobbase.imp;

import java.util.List;

import org.springframework.stereotype.Component;

import com.hsk.angeldoctor.api.daobbase.IAgAppDeviceDao;
import com.hsk.angeldoctor.api.persistence.AgAppDevice;
import com.hsk.exception.HSKDBException;
import com.hsk.supper.dao.imp.SupperDao;

@Component
public class AgAppDeviceDao extends SupperDao implements IAgAppDeviceDao {

	@Override
	public AgAppDevice findAgAppDeviceById(Integer AadId) throws HSKDBException {
		AgAppDevice  att_AgAppDevice=new AgAppDevice();				
		if(AadId!=null){
			att_AgAppDevice.setAadId(AadId);	
		    Object obj=	this.getOne(att_AgAppDevice);
			if(obj!=null){
				att_AgAppDevice=(AgAppDevice) obj;
			}
		}
		return  att_AgAppDevice;
	}

	@Override
	public void deleteAgAppDeviceById(Integer AadId) throws HSKDBException {
		 AgAppDevice  att_AgAppDevice=new AgAppDevice();	
		  if(AadId!=null){
			  			att_AgAppDevice.setAadId(AadId);
				  	  Object obj=	this.getOne(att_AgAppDevice);
					  if(obj!=null){
							this.deleteObject(obj); 
					  }
			}
	}

	@Override
	public Integer saveAgAppDevice(AgAppDevice att_AgAppDevice) throws HSKDBException {
		 return this.newObject(att_AgAppDevice);
	}

	@Override
	public AgAppDevice saveOrUpdateAgAppDevice(AgAppDevice att_AgAppDevice) throws HSKDBException {
		 this.getHibernateTemplate().saveOrUpdate(att_AgAppDevice);
		  return att_AgAppDevice;
	}

	@Override
	public List<AgAppDevice> getListByAgAppDevice(AgAppDevice att_AgAppDevice) throws HSKDBException {
		String Hql=this.getHql( att_AgAppDevice); 
		List<AgAppDevice> list=this.getHibernateTemplate().find(Hql);
		return  list;
	}
	
	public String getHql(AgAppDevice att_AgAppDevice){
		String hql ="from AgAppDevice where 1=1";
		if(att_AgAppDevice.getAgentId()!=null)
			hql +=" and agentId="+att_AgAppDevice.getAgentId();
		if(att_AgAppDevice.getAppType()!=null && !att_AgAppDevice.getAppType().trim().equals(""))
			hql +=" and appType='"+att_AgAppDevice.getAppType().trim()+"'";
		return hql;
	}

	@Override
	public AgAppDevice getAgAppDeviceByAgentId(Integer agentId) throws HSKDBException {
		String hql ="from AgAppDevice where agentId="+agentId;
		List<AgAppDevice> list=this.getHibernateTemplate().find(hql);
		if(list!=null && list.size()>0)
			return list.get(0);
		return null;
	}

}
