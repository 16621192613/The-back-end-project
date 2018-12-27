package com.hsk.angeldoctor.api.daobbase;

import com.hsk.angeldoctor.api.persistence.AgDealCountView;
import com.hsk.angeldoctor.api.persistence.AgMaidOrView;
import com.hsk.angeldoctor.api.persistence.AgMaidView;
import com.hsk.exception.HSKDBException;
import com.hsk.supper.dto.comm.PagerModel;

/**
 * ag_maid_view视图数据库层面操作接口类 
 * @author xun
 * @version v1.0
 *
 */
public interface IAgMaidViewDao {
	/**
	 * 查询出分佣信息的分页对象
	 * @param att_AgMaidView
	 * @return
	 * @throws HSKDBException
	 */
	public PagerModel getPagerModelByAgMaidView (AgMaidView att_AgMaidView) throws HSKDBException;
	
	/**
	 * 诊疗信息信息对象查询出分页对象
	 * @param att_AgDealCountView
	 * @return
	 * @throws HSKDBException
	 */
	public PagerModel getPagerModelByAgDealCountView (AgDealCountView att_AgDealCountView) throws HSKDBException;
	
	public PagerModel getPagerModelByAgMaidOrView (AgMaidOrView att_AgMaidOrView) throws HSKDBException;

}
