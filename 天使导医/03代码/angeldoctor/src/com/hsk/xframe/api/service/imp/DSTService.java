package com.hsk.xframe.api.service.imp;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Date;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hsk.angeldoctor.api.persistence.AgPatientInfo;
import com.hsk.angeldoctor.api.persistence.AgWechatInfo;
/*import com.hsk.dentistmall.api.persistence.MdCompanyGroup;
import com.hsk.dentistmall.api.persistence.MdDentalClinic;
import com.hsk.dentistmall.api.persistence.MdDentistHospital;
import com.hsk.dentistmall.api.persistence.MdSupplier;*/
import com.hsk.exception.HSKDBException;
import com.hsk.exception.HSKException;
import com.hsk.supper.dao.IsupperDao;
import com.hsk.supper.dto.comm.PagerModel;
import com.hsk.supper.dto.config.HqlConfig;
import com.hsk.supper.service.imp.SupperService;
import com.hsk.xframe.api.filter.TokenUtil;
import com.hsk.xframe.api.persistence.SysUserInfo;
import com.hsk.xframe.api.service.IDSTService;

/**
 * 基础业务处理函数实现类
 * 
 * @author xun
 * @version v1.0 2015-02-23
 * 
 */
@Service 
public class DSTService extends SupperService implements IDSTService {
	@Autowired
	private IsupperDao supperDao;
	public static String TEMP_EXPORT_PATH = "/export/";
	public static String EXPORT_PATH= "/fileInfo/updown/export/";
	
	/**
	 * 获取当前登录用户token
	 * @param request
	 * @return
	 */
	public String getToken(){
		String token = request.getHeader("token");
		return token;
	}
	/**
	 * 获取当前登录用户类型：用户类型：1后台管理员；2医院管理员；3医生；4：代理商；5业务员
	 * @param request
	 * @return
	 */
	public Integer getUserType(){
		String token = request.getHeader("token");
		Integer userType=null;
		if(token!=null && !token.equals("")){
			Map<String,Object> tokenData=TokenUtil.TOKEN_MAP.get(token);
			SysUserInfo sysUserInfo = null;
			
			if(tokenData.get("account") !=null){
				sysUserInfo =  (SysUserInfo) tokenData.get("account");
				userType=sysUserInfo.getUserType();
			}
		}
		return userType;
	}
	/**
	 * 获取当前登录用户
	 */
	@Override
	public SysUserInfo GetOneSessionAccount() throws HSKException {
		String token = request.getHeader("token");
		Map<String,Object> tokenData=TokenUtil.TOKEN_MAP.get(token);
		SysUserInfo sysUserInfo = null;
		if(tokenData!=null && tokenData.get("account") !=null){
			sysUserInfo =  (SysUserInfo) tokenData.get("account");
			System.out.println(sysUserInfo.getSuiId());
		}
		return sysUserInfo;
	}
	/**
	 * 跟新当前登录用户
	 */
	@Override
	public void SetSessionAccount(SysUserInfo account) throws HSKException {
		String token = request.getHeader("token");
		Map<String,Object> tokenData = TokenUtil.TOKEN_MAP.get(token);
		tokenData.put("account",account);
		TokenUtil.TOKEN_MAP.put(token, tokenData);
	}
	
	/**
	 * 删除实体信息
	 * @param val
	 * @throws HSKDBException
	 */
	public void deleteObjects(Object val) throws HSKDBException {
		supperDao.deleteObject(val);
	}
	/**
	 * 新建实体信息
	 * @param val
	 * @return
	 * @throws HSKDBException
	 * @throws NoSuchMethodException 
	 * @throws SecurityException 
	 * @throws InvocationTargetException 
	 * @throws IllegalAccessException 
	 * @throws IllegalArgumentException 
	 */
	public Integer newObject(Object val) throws Exception {
		Field[] fields = val.getClass().getDeclaredFields();
		SysUserInfo account =   this.GetOneSessionAccount();
		if(account!=null){
			if(fields != null && fields.length > 0){
				for(Field field : fields){
					if(field.getName().equals("createDate")){
						Method m = val.getClass().getDeclaredMethod("setCreateDate",Date.class);
						m.invoke(val, new Date());
					}
					if(field.getName().equals("createRen")){
						Method m = val.getClass().getDeclaredMethod("setCreateRen",String.class);
						if(account!=null)
							m.invoke(val, account.getUserName());
					}
					
				}
			}
		}
		
		return supperDao.newObject(val);
	}
	/**
	 * 修改实体信息
	 * @param val
	 * @throws HSKDBException
	 */
	public void updateObject(Object val) throws Exception {
		supperDao.updateObject(val);
	}
 
	/**
	 * 查找实体信息
	 */
	public Object getOne(Object val){
		return supperDao.getOne(val);
	}
	/**
	 * 查询实体集合
	 * @param val
	 * @return
	 * @throws HSKDBException
	 */
	public <T> List<T> getList(T obj) throws HSKDBException{
		return  supperDao.getList(obj);
	}
	
	/**
	 * 查询实体集合
	 * @param val
	 * @return
	 * @throws HSKDBException
	 */
	public <T> List<T> getList(T obj,HqlConfig conf) throws HSKDBException{
		return  supperDao.getList(obj,conf);
	}
	
	/**
	 * 获取分页对象
	 * @param obj
	 * @return
	 * @throws HSKDBException
	 */
	public PagerModel getPagerModel(Object obj) throws HSKDBException{
		return  supperDao.getPagerModel(obj);
	}
}
