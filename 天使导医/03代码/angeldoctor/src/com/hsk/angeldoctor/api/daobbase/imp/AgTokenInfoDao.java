package com.hsk.angeldoctor.api.daobbase.imp;

import java.util.List;

import org.springframework.stereotype.Component;

import com.hsk.angeldoctor.api.daobbase.IAgTokenInfoDao;
import com.hsk.angeldoctor.api.persistence.AgTokenInfo;
import com.hsk.exception.HSKDBException;
import com.hsk.supper.dao.imp.SupperDao;

@Component
public class AgTokenInfoDao extends SupperDao implements IAgTokenInfoDao {

	@Override
	public List<AgTokenInfo> getAgTokenInfoList() throws HSKDBException {
		String hql="from AgTokenInfo where 1=1";
		return this.getHibernateTemplate().find(hql);
	}

	@Override
	public void addAgTokenInfo(AgTokenInfo att_AgTokenInfo) throws HSKDBException {
		this.newObject(att_AgTokenInfo);
	}

	@Override
	public void delAgTokenInfo(String token) throws HSKDBException {
		String sql="delete from ag_token_info where token='"+token+"'";
		this.getJdbcDao().execute(sql);
	}

}
