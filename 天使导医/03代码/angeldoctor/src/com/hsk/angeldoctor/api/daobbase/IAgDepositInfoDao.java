package com.hsk.angeldoctor.api.daobbase;

import com.hsk.angeldoctor.api.persistence.AgDepositInfo;
import com.hsk.exception.HSKDBException;

/**
 * 医院充值记录
 * @author Administrator
 *
 */
public interface IAgDepositInfoDao {
	/**
	 * 新建充值记录信息
	 * @param att_AgDepositInfo
	 * @return
	 * @throws HSKDBException
	 */
	public  AgDepositInfo saveOrUpdateAgDepositInfo( AgDepositInfo att_AgDepositInfo) throws HSKDBException;
	/**
	 * 统计充值金额
	 * @param organizationId
	 * @return
	 * @throws HSKDBException
	 */
	public Double countDepositMoney(Integer organizationId) throws HSKDBException;
}
