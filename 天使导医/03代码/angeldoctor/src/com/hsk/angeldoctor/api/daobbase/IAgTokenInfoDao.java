package com.hsk.angeldoctor.api.daobbase;

import java.util.List;

import com.hsk.angeldoctor.api.persistence.AgTokenInfo;
import com.hsk.exception.HSKDBException;
import com.hsk.exception.HSKException;

public interface IAgTokenInfoDao {
	
	/**
	 * 获取token列表
	 * @return
	 * @throws HSKException
	 */
	public List<AgTokenInfo> getAgTokenInfoList() throws HSKDBException;
	/**
	 * 增加token信息
	 * @param att_AgTokenInfo
	 * @throws HSKException
	 */
	public void addAgTokenInfo(AgTokenInfo att_AgTokenInfo) throws HSKDBException;
	/**
	 * 删除token信息
	 * @param token
	 * @throws HSKException
	 */
	public void delAgTokenInfo(String token) throws HSKDBException;


}
