package com.hsk.xframe.api.daobbase.imp;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.hsk.exception.HSKDBException;
import com.hsk.supper.dao.imp.SupperDao;
import com.hsk.xframe.api.daobbase.ISysFileInfoDao;
import com.hsk.xframe.api.persistence.SysFileInfo;

@Repository
public class SysFileInfoDao extends SupperDao implements ISysFileInfoDao {

	@Override
	public SysFileInfo getSysFileInfoByFileCode(String fileCode)
			throws HSKDBException {
		String hql="from SysFileInfo where fileCode='"+fileCode+"'";
		List<SysFileInfo> list=(List<SysFileInfo>) this.getHibernatesession().createQuery(hql).list();
		if(list != null && list.size() > 0)
			return list.get(0);
		else
			return null;
	}

	@Override
	public List<SysFileInfo> getSysFileInfoByCodes(String fileCodes)
			throws HSKDBException {
		String hql = "from SysFileInfo where fileCode in ("+fileCodes+")";
		return this.getHibernateTemplate().find(hql);
	}

}
