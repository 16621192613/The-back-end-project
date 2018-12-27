package com.hsk.angeldoctor.web.operate.service;

import com.hsk.exception.HSKException;
import com.hsk.supper.dto.comm.SysRetrunMessage;
import com.hsk.xframe.api.service.IDSTService;

/**
 * 医院充值操作
 * @author Administrator
 *
 */
public interface IAgDepositInfoService extends IDSTService{
	
	/**
	 * 保存医院充值记录
	 * @param organizationId
	 * @param depositAmount
	 * @return
	 * @throws HSKException
	 */
	public SysRetrunMessage saveAgDepositInfo(Integer organizationId,Double depositAmount) throws HSKException;
}
