package com.hsk.angeldoctor.web.operate.service.imp;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hsk.angeldoctor.api.daobbase.IAgDepositInfoDao;
import com.hsk.angeldoctor.api.persistence.AgDepositInfo;
import com.hsk.angeldoctor.web.operate.service.IAgDepositInfoService;
import com.hsk.exception.HSKException;
import com.hsk.supper.dto.comm.SysRetrunMessage;
import com.hsk.xframe.api.service.imp.DSTService;

@Service
public class AgDepositInfoService extends DSTService implements IAgDepositInfoService {
	
	@Autowired
	private IAgDepositInfoDao agDepositInfoDao;

	@Override
	public SysRetrunMessage saveAgDepositInfo(Integer organizationId, Double depositAmount) throws HSKException {
		SysRetrunMessage srm = new SysRetrunMessage(1l);
		try{
			AgDepositInfo agDepositInfo = new AgDepositInfo();
			agDepositInfo.setOrganizationId(organizationId);
			agDepositInfo.setDepositAmount(depositAmount);
			agDepositInfo.setCreateDate(new Date());
			agDepositInfo.setStatus("0");
			agDepositInfoDao.saveOrUpdateAgDepositInfo(agDepositInfo);
			srm.setObj(agDepositInfo);
		}catch(Exception e){
			e.printStackTrace();
		}
		
		return srm;
	}

}
