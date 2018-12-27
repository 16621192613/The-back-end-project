package com.hsk.angeldoctor.api.daobbase.imp;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Component;

import com.hsk.angeldoctor.api.daobbase.IAgDepositInfoDao;
import com.hsk.angeldoctor.api.persistence.AgDepositInfo;
import com.hsk.exception.HSKDBException;
import com.hsk.supper.dao.imp.SupperDao;

@Component
public class AgDepositInfoDao extends SupperDao implements IAgDepositInfoDao {

	@Override
	public AgDepositInfo saveOrUpdateAgDepositInfo(AgDepositInfo att_AgDepositInfo) throws HSKDBException {
		this.getHibernateTemplate().saveOrUpdate(att_AgDepositInfo);
		return att_AgDepositInfo;
	}

	@Override
	public Double countDepositMoney(Integer organizationId) throws HSKDBException {
		Double count=0d;
		String sql="select sum(deposit_amount) as shu  from ag_deposit_info where status='0' ";
		if(organizationId !=null)
			sql +=" and organization_id="+organizationId;
		List<Map<String,Object>> list = this.getJdbcDao().query(sql);
		if(list != null && list.size() >0 && list.get(0).get("shu")!=null)
			count = Double.parseDouble(list.get(0).get("shu").toString());
		return count;
	}

}
