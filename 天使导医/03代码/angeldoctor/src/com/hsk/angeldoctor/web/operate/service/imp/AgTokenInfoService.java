package com.hsk.angeldoctor.web.operate.service.imp;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hsk.angeldoctor.api.daobbase.IAgTokenInfoDao;
import com.hsk.angeldoctor.api.persistence.AgTokenInfo;
import com.hsk.angeldoctor.web.operate.service.IAgTokenInfoService;
import com.hsk.exception.HSKDBException;
import com.hsk.exception.HSKException;
import com.hsk.xframe.api.service.imp.DSTService;

@Service
public class AgTokenInfoService extends DSTService implements IAgTokenInfoService {
	@Autowired
	private IAgTokenInfoDao agTokenInfoDao;

	@Override
	public List<AgTokenInfo> getAgTokenInfoList() throws HSKException {
		List<AgTokenInfo> tokenList = new ArrayList<AgTokenInfo>();
		try {
			tokenList = agTokenInfoDao.getAgTokenInfoList();
		} catch (HSKDBException e) {
			e.printStackTrace();
		}
		return tokenList;
	}

	@Override
	public void addAgTokenInfo(AgTokenInfo att_AgTokenInfo) throws HSKException {
		try {
			agTokenInfoDao.addAgTokenInfo(att_AgTokenInfo);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Override
	public void delAgTokenInfo(String token) throws HSKException {
		try {
			agTokenInfoDao.delAgTokenInfo(token);
		} catch (HSKDBException e) {
			e.printStackTrace();
		}
	}

}
