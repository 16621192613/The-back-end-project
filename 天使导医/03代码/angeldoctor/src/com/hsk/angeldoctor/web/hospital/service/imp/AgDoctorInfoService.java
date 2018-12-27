package com.hsk.angeldoctor.web.hospital.service.imp;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.providers.encoding.Md5PasswordEncoder;
import org.springframework.stereotype.Service;

import com.hsk.angeldoctor.api.daobbase.IAgCollectionDoctorDao;
import com.hsk.angeldoctor.api.daobbase.IAgDepartmentInfoDao;
import com.hsk.angeldoctor.api.daobbase.IAgDoctorInfoDao;
import com.hsk.angeldoctor.api.daobbase.IAgHospitalInfoDao;
import com.hsk.angeldoctor.api.daobbase.IAgHospitalJobDao;
import com.hsk.angeldoctor.api.daobbase.IAgWorkInfoDao;
import com.hsk.angeldoctor.api.persistence.AgCollectionDoctor;
import com.hsk.angeldoctor.api.persistence.AgDepartmentInfo;
import com.hsk.angeldoctor.api.persistence.AgDoctorInfo;
import com.hsk.angeldoctor.api.persistence.AgHospitalInfo;
import com.hsk.angeldoctor.api.persistence.AgWorkView;
import com.hsk.angeldoctor.web.hospital.service.IAgDoctorInfoService;
import com.hsk.exception.HSKDBException;
import com.hsk.exception.HSKException;
import com.hsk.supper.dto.comm.PagerModel;
import com.hsk.supper.dto.comm.SysRetrunMessage;
import com.hsk.xframe.api.daobbase.ISysUserInfoDao;
import com.hsk.xframe.api.im.IMUtile;
import com.hsk.xframe.api.persistence.SysUserInfo;
import com.hsk.xframe.api.service.imp.DSTService;
import com.hsk.xframe.api.utils.freeMarker.CommonUtil;


/** 
  hospital业务操作实现类 
 * @author  作者:admin
 * @version  版本信息:v1.0   创建时间: 2018-08-14 13:28:00
 */
 
@Service
public class  AgDoctorInfoService extends DSTService implements IAgDoctorInfoService {	
   /**
   *业务处理dao类  agDoctorInfoDao 
   */
	@Autowired
	protected IAgDoctorInfoDao agDoctorInfoDao;
	@Autowired
	protected IAgHospitalJobDao agHospitalJobDao;
	   /**
	   *科室 业务处理dao类  agDepartmentInfoDao 
	   */
		@Autowired
		protected IAgDepartmentInfoDao agDepartmentInfoDao;
		@Autowired
		protected IAgHospitalInfoDao agHospitalInfoDao;
		@Autowired
		protected IAgCollectionDoctorDao agCollectionDoctorDao;
		/**
		 * 用户处理dao类 
		 */
		@Autowired
		protected	ISysUserInfoDao sysUserInfoDao;
		@Autowired
		private IAgWorkInfoDao agWorkInfoDao;


 /**
	 * 根据ag_doctor_info表主键删除AgDoctorInfo对象记录
     * @param  doctorId  Integer类型(ag_doctor_info表主键)
	 * @return SysRetrunMessage 对象记录
	 * @throws HSKException
	 */

	public SysRetrunMessage findFormObject(Integer doctorId) throws HSKException{
	        SysRetrunMessage srm=new SysRetrunMessage(1l);
			  	
			try{
		   			AgDoctorInfo     att_AgDoctorInfo= agDoctorInfoDao.findAgDoctorInfoById( doctorId) ;
		   			if(this.getUserType()!=null && this.getUserType()==5){
						AgCollectionDoctor agCollectionDoctor = new AgCollectionDoctor();
				  		agCollectionDoctor.setSuiId(this.GetOneSessionAccount().getSuiId());
				  		agCollectionDoctor.setDoctorId(doctorId);
				  		agCollectionDoctor = (AgCollectionDoctor) this.getOne(agCollectionDoctor);
				  		if(agCollectionDoctor!=null && agCollectionDoctor.getMcdId()!=null)
				  			att_AgDoctorInfo.setIsColl("1");//已收藏
				  		else
				  			att_AgDoctorInfo.setIsColl("2");//未收藏
					}
					srm.setObj(att_AgDoctorInfo);
				} catch (HSKDBException e) {
					e.printStackTrace(); 
					srm.setCode(0l);
					srm.setMeg(e.getMessage()); 
				}
				 return srm ;
	} 

    /**
	 * 根据ag_doctor_info表主键删除AgDoctorInfo对象记录
     * @param  doctorId  Integer类型(ag_doctor_info表主键)
	 * @throws HSKException
	 */

	public AgDoctorInfo findObject(Integer doctorId) throws HSKException{
			AgDoctorInfo  att_AgDoctorInfo=new AgDoctorInfo();		
			try{
		        att_AgDoctorInfo= agDoctorInfoDao.findAgDoctorInfoById( doctorId) ;
		        if(att_AgDoctorInfo.getDepartmentName()!=null && !att_AgDoctorInfo.getDepartmentName().equals(""))
		        	att_AgDoctorInfo.setDepartmentName(att_AgDoctorInfo.getDepartmentName().substring(1, att_AgDoctorInfo.getDepartmentName().length()-1));
				} catch (HSKDBException e) {
					e.printStackTrace(); 
					throw new  HSKException(e);
				}
				return  att_AgDoctorInfo;
	}
	
	 
	 /**
	 * 根据ag_doctor_info表主键删除AgDoctorInfo对象记录
     * @param  doctorId  Integer类型(ag_doctor_info表主键)
     * @return SysRetrunMessage 对象记录
	 * @throws HSKException
	 */
	public SysRetrunMessage deleteObject(Integer doctorId) throws HSKException{  
		    SysRetrunMessage srm=new SysRetrunMessage(1l);
		   try{ 
				agDoctorInfoDao.deleteAgDoctorInfoById(doctorId);
			 } catch (Exception e) {
					e.printStackTrace(); 
					throw new  HSKException(e);
		     }
		   return srm;  
	}
	
	/**
	 * 根据ag_doctor_info表主键删除多条AgDoctorInfo对象记录
     * @param  DoctorIds  Integer类型(ag_doctor_info表主键)
     * @return SysRetrunMessage 对象记录
	 * @throws HSKException
	 */
	public SysRetrunMessage deleteAllObject(String doctorIds) throws HSKException{
		SysRetrunMessage srm = new SysRetrunMessage(1l);
		try {
			String[] ids = doctorIds.split(",");
			for (String did : ids) {
				if (did != null && !"".equals(did.trim())) {
					agDoctorInfoDao.deleteAgDoctorInfoById(Integer
							.valueOf(did));
				}
			}
		} catch (NumberFormatException e) {
			e.printStackTrace();
			HSKException hse = new HSKException(e);
			hse.setDisposeType("01");
			throw hse;
		} catch (HSKDBException e) {
			e.printStackTrace();
			throw new HSKException(e);
		}
		return srm;	  
	 }
	 
 
	 /**
	 * 新增或修改ag_doctor_info表记录 ,如果ag_doctor_info表主键AgDoctorInfo.DoctorId为空就是添加，如果非空就是修改
     * @param  att_AgDoctorInfo  AgDoctorInfo类型(ag_doctor_info表记录)
     * @return AgDoctorInfo  修改后的AgDoctorInfo对象记录
	 * @throws HSKDBException
	 */
	public SysRetrunMessage saveOrUpdateObject( AgDoctorInfo att_AgDoctorInfo) throws HSKException{
			 SysRetrunMessage srm = new SysRetrunMessage(1l);
			  try{
				  Md5PasswordEncoder md5= new Md5PasswordEncoder();
				  //获取
				  String departments=att_AgDoctorInfo.getDepartments();
				  AgDepartmentInfo att_AgDepartmentInfo=new AgDepartmentInfo();
				  att_AgDepartmentInfo.setDepartmentId_str(departments); 
				  List<AgDepartmentInfo> list_obj=  agDepartmentInfoDao.getListByAgDepartmentInfo(att_AgDepartmentInfo);
				  String departmentId=",";
				  String departmentName=",";
				  for(AgDepartmentInfo did:list_obj){
					  departmentId+= did.getDepartmentId()+",";
					  departmentName+=did.getName()+",";
				  }
				 // departmentId=  departmentId.substring(0, departmentId.length()-1);
				 // departmentName=  departmentName.substring(0, departmentName.length()-1);
				  att_AgDoctorInfo.setDepartmentId(departmentId);
				  att_AgDoctorInfo.setDepartmentName(departmentName);
				  
				  if(this.getUserType()==2)//如果是医院管理员登录
					  att_AgDoctorInfo.setOrganizationId(this.GetOneSessionAccount().getSroleId());
			  		else if(this.getUserType()==3){//如果是医生登录
						AgDoctorInfo loginDoc= agDoctorInfoDao.findAgDoctorInfoById(this.GetOneSessionAccount().getSroleId());
						att_AgDoctorInfo.setOrganizationId(loginDoc.getOrganizationId());
					}
				  
				  if (att_AgDoctorInfo.getDoctorId() != null) {	
					  //修改 
					  AgDoctorInfo att_new= agDoctorInfoDao.findAgDoctorInfoById(att_AgDoctorInfo.getDoctorId());
					  	if(att_new!=null){
					  		att_new.setEditDate(new Date());			
					  		att_new.setEditRen(att_AgDoctorInfo.getEditRen());
					  		att_new.setDepartmentId(departmentId);
					  		att_new.setDepartmentName(departmentName);
					  		
					  		att_new.setName(att_AgDoctorInfo.getName());
					  		att_new.setGender(att_AgDoctorInfo.getGender());
					  		att_new.setBirthday(att_AgDoctorInfo.getBirthday());
					  		att_new.setRoleId(att_AgDoctorInfo.getRoleId());
					  		
					  		 
					  		att_new.setJobTitleId(att_AgDoctorInfo.getJobTitleId());
					  		att_new.setExpert(att_AgDoctorInfo.getExpert() );
					  		
					  		att_new.setMobile(att_AgDoctorInfo.getMobile());
					  		
					  		att_new.setStatus(att_AgDoctorInfo.getStatus());
					  		att_new.setAvatar(att_AgDoctorInfo.getAvatar());
					  		
					  		att_new.setIntroduction(att_AgDoctorInfo.getIntroduction());

					  		att_new.setMajor(att_AgDoctorInfo.getMajor());
					  		att_new.setImages(att_AgDoctorInfo.getImages()); 
					  		
					  		att_new.setVisible(att_AgDoctorInfo.getVisible());
					  		
					  		agDoctorInfoDao.saveOrUpdateAgDoctorInfo(att_new);
					  		//agDoctorInfoDao.updateAgDoctorInfoById(att_AgDoctorInfo.getId(), att_new);
					  	}
					}else {
						//检查重名  
						String userName = att_AgDoctorInfo.getUsername();
						if (userName != null && userName.trim().length() > 0) {
							AgHospitalInfo agHospitalInfo = agHospitalInfoDao.findAgHospitalInfoById(att_AgDoctorInfo.getOrganizationId());
							SysUserInfo checkUser = new SysUserInfo();
							checkUser.setState(1);
							checkUser.setUserType(3);
							checkUser.setBarCodeFileCode(agHospitalInfo.getDomainName());
							checkUser.setAccount(userName);
							SysUserInfo searchUser = sysUserInfoDao
									.getSysUserInfoByObj(checkUser);
							if (searchUser != null) {
								srm.setCode(0l);
								srm.setMeg("账号名称已存在 ！");
								return srm;
							} else {
								//添加  
								agDoctorInfoDao.saveAgDoctorInfo(att_AgDoctorInfo);
								att_AgDoctorInfo.getOrganizationId();
								// 添加账号记录
								SysUserInfo newUser = new SysUserInfo();
								newUser.setAccount(att_AgDoctorInfo.getUsername());
								newUser.setBarCodeFileCode(agHospitalInfo.getDomainName());// 域名
								newUser.setPassword(md5.encodePassword(att_AgDoctorInfo.getPassword(), null));
								newUser.setUserType(3);
								newUser.setSroleId(att_AgDoctorInfo.getDoctorId());
								newUser.setState(0);
								newUser.setUserName(att_AgDoctorInfo.getName());
								newUser.setCreateDate(new Date());
								sysUserInfoDao.saveUser(newUser);
								
								
							} 
						}else{
							srm.setCode(0l);
							srm.setMeg("未填写账号名称！");
							return srm;
						}
					}
				  	//创建环信账号
			  		IMUtile iMUtile = new IMUtile();
		  			//查询该用户是否已经存在环信账号
		  			boolean isExist = iMUtile.checkIMUserByUserName(CommonUtil.IM_DOC_PRE+att_AgDoctorInfo.getDoctorId());
		  			if(!isExist){//如果不存在环信账号则创建
		  				iMUtile.createUser(CommonUtil.IM_DOC_PRE+att_AgDoctorInfo.getDoctorId(), CommonUtil.IM_DOC_PASS);
		  			}
				  	srm.setObj(att_AgDoctorInfo);
			    } catch (Exception e) {
					e.printStackTrace(); 
					throw new HSKException(e);
		        }
			return srm;	  
	}
	
	 
	/**
	 *根据AgDoctorInfo对象作为对(ag_doctor_info表进行查询，获取分页对象
     * @param  att_AgDoctorInfo  AgDoctorInfo类型(ag_doctor_info表记录)
     * @return PagerModel  分页对象
	 * @throws HSKException 
	 */
	public PagerModel getPagerModelObject (AgDoctorInfo att_AgDoctorInfo,String isColl) throws HSKException{
		PagerModel pm=new PagerModel(new ArrayList<AgDoctorInfo>());
			  try{
				  	List<AgCollectionDoctor> collList = new ArrayList<AgCollectionDoctor>();
				  	if(isColl!=null && (isColl.equals("1") || isColl.equals("2"))){//查询收藏的医生列表
				  		AgCollectionDoctor agCollectionDoctor = new AgCollectionDoctor();
				  		agCollectionDoctor.setSuiId(this.GetOneSessionAccount().getSuiId());
				  		collList = agCollectionDoctorDao.getListByAgCollectionDoctor(agCollectionDoctor);
				  		String docIds="";
				  		if(collList !=null && collList.size() >0){
				  			for(AgCollectionDoctor coll : collList)
				  				docIds+= coll.getDoctorId()+",";
				  			docIds=docIds.substring(0, docIds.length()-1);
				  		}
				  		if(isColl.equals("1")){//查询收藏医生
				  			if(collList !=null && collList.size() >0)
				  				att_AgDoctorInfo.setDoctorId_str(docIds);
				  			else
				  				return pm;
				  		}else if(isColl.equals("2")){//查询没有收藏医生
				  			if(collList !=null && collList.size() >0)
				  				att_AgDoctorInfo.setDoctorId_no_str(docIds);
				  			else
				  				return pm;
				  		}
				  		
				  	}
					pm=agDoctorInfoDao.getPagerModelByAgDoctorInfo(att_AgDoctorInfo);
					if(this.getUserType()!=null && this.getUserType()==5){
						if(pm.getItems()!=null && pm.getItems().size() >0){
							for(Object obj:pm.getItems()){
								AgDoctorInfo doc = (AgDoctorInfo) obj;
								boolean collFlag=false;
								if(collList !=null && collList.size() >0){
						  			for(AgCollectionDoctor coll : collList){
						  				if(coll.getDoctorId().equals(doc.getDoctorId())){
						  					doc.setIsColl("1");
						  					collFlag=true;
						  					break;
						  				}
						  			}
						  		}
								if(collFlag)
									doc.setIsColl("1");
								else
									doc.setIsColl("2");
							}
							
						}
					}
					if(pm.getItems()!=null && pm.getItems().size() >0){
						for(Object obj:pm.getItems()){
							AgDoctorInfo doc = (AgDoctorInfo) obj;
							if(doc.getDepartmentName()!=null && !doc.getDepartmentName().equals("")){
								String dn= doc.getDepartmentName().substring(1, doc.getDepartmentName().length()-1);
								doc.setDepartmentName(dn);
							}
								
							
						}
					}
					pm.setRows(pm.getItems());
					
			    } catch (Exception e) {
					e.printStackTrace(); 
		        }
		return pm;
	}

	 
	public SysRetrunMessage saveMyDoctor(AgDoctorInfo att_AgDoctorInfo)
			throws HSKException {
		SysRetrunMessage srm = new SysRetrunMessage(1l);
		try {
			AgDoctorInfo adi=agDoctorInfoDao.findAgDoctorInfoById(att_AgDoctorInfo.getDoctorId()); 
			if(adi!=null){
				 agDoctorInfoDao.updateAgDoctorInfoById(att_AgDoctorInfo.getDoctorId(), att_AgDoctorInfo);
				srm.setObj(att_AgDoctorInfo);
			}
			
		} catch (HSKDBException e) {
			e.printStackTrace();
		}
		return srm;
	}

	@Override
	public List<AgDoctorInfo> getAgDoctorInfoList(AgDoctorInfo att_AgDoctorInfo) throws HSKException {
		List<AgDoctorInfo> reList = new ArrayList<AgDoctorInfo>();
		try {
			reList = agDoctorInfoDao.getListByAgDoctorInfo(att_AgDoctorInfo);
		} catch (HSKDBException e) {
			e.printStackTrace();
		}
		return reList;
	}

	@Override
	public List<AgDoctorInfo> getAgDoctorInfoListByDepId(Integer departmentId) throws HSKException {
		List<AgDoctorInfo> reList = new ArrayList<AgDoctorInfo>();
		try {
			AgDoctorInfo att_AgDoctorInfo = new AgDoctorInfo();
			att_AgDoctorInfo.setDepartmentId(","+departmentId+",");
			att_AgDoctorInfo.setTab_like("departmentId");	
			att_AgDoctorInfo.setVisible("1");
			reList = agDoctorInfoDao.getListByAgDoctorInfo(att_AgDoctorInfo);
			if(reList !=null && reList.size() >0){
				String docIds="";
				for(AgDoctorInfo info : reList)
					docIds+=info.getDoctorId()+",";
				docIds=docIds.substring(0, docIds.length()-1);
				AgWorkView att_AgWorkView = new AgWorkView();
				att_AgWorkView.setDocIds(docIds);
				att_AgWorkView.setDepartmentId(departmentId);
				SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm");
				Date now = new Date();
				Calendar cal = Calendar.getInstance();
				cal.setTime(now);
				cal.set(Calendar.HOUR_OF_DAY, cal.get(Calendar.HOUR_OF_DAY) - 1);     
				String searchStart = sdf.format(cal.getTime());
				//2周后的今天
				cal.setTime(now);
				cal.add(cal.DATE,14);
				String searchEnd = sdf.format(cal.getTime());
				att_AgWorkView.setShiftEnd_start(searchStart);
				att_AgWorkView.setShiftEnd_end(searchEnd);
				List<AgWorkView> workList = agWorkInfoDao.getAgWorkViewList(att_AgWorkView);
				for(AgDoctorInfo info : reList){
					info.setIsOrder("0");
					if(info.getDepartmentName()!=null && !info.getDepartmentName().equals("") && info.getDepartmentName().length()>1)
						info.setDepartmentName(info.getDepartmentName().substring(1, info.getDepartmentName().length()-1));
					if(workList!=null && workList.size()>0){
						for(AgWorkView work : workList){
							if(work.getDoctorId().equals(info.getDoctorId())){
								info.setIsOrder("1");
								break;
							}
						}
					}
				}
				
			}
		} catch (HSKDBException e) {
			e.printStackTrace();
		}
		return reList;
	}

	@Override
	public List<AgDoctorInfo> getAppAgDoctorInfoListByDepId(Integer departmentId, String isColl) throws HSKException {
		List<AgDoctorInfo> reList = new ArrayList<AgDoctorInfo>();
		try {
			List<AgCollectionDoctor> collList = new ArrayList<AgCollectionDoctor>();
			AgDoctorInfo att_AgDoctorInfo = new AgDoctorInfo();
		  	if(isColl!=null && (isColl.equals("1") || isColl.equals("2"))){//查询收藏的医生列表
		  		AgCollectionDoctor agCollectionDoctor = new AgCollectionDoctor();
		  		agCollectionDoctor.setSuiId(this.GetOneSessionAccount().getSuiId());
		  		collList = agCollectionDoctorDao.getListByAgCollectionDoctor(agCollectionDoctor);
		  		String docIds="";
		  		if(collList !=null && collList.size() >0){
		  			for(AgCollectionDoctor coll : collList)
		  				docIds+= coll.getDoctorId()+",";
		  			docIds=docIds.substring(0, docIds.length()-1);
		  		}
		  		if(isColl.equals("1")){//查询收藏医生
		  			if(collList !=null && collList.size() >0)
		  				att_AgDoctorInfo.setDoctorId_str(docIds);
		  			else
		  				return reList;
		  		}else if(isColl.equals("2")){//查询没有收藏医生
		  			if(collList !=null && collList.size() >0)
		  				att_AgDoctorInfo.setDoctorId_no_str(docIds);
		  			else
		  				return reList;
		  		}
		  		
		  	}
			att_AgDoctorInfo.setDepartmentId(","+departmentId+",");
			att_AgDoctorInfo.setTab_like("departmentId");	
			att_AgDoctorInfo.setVisible("1");
			reList = agDoctorInfoDao.getListByAgDoctorInfo(att_AgDoctorInfo);
			if(reList !=null && reList.size() >0){
				String docIds="";
				for(AgDoctorInfo info : reList)
					docIds+=info.getDoctorId()+",";
				docIds=docIds.substring(0, docIds.length()-1);
				AgWorkView att_AgWorkView = new AgWorkView();
				att_AgWorkView.setDocIds(docIds);
				att_AgWorkView.setDepartmentId(departmentId);
				SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm");
				Date now = new Date();
				Calendar cal = Calendar.getInstance();
				cal.setTime(now);
				cal.set(Calendar.HOUR_OF_DAY, cal.get(Calendar.HOUR_OF_DAY) - 1);     
				String searchStart = sdf.format(cal.getTime());
				//2周后的今天
				cal.setTime(now);
				cal.add(cal.DATE,14);
				String searchEnd = sdf.format(cal.getTime());
				att_AgWorkView.setShiftEnd_start(searchStart);
				att_AgWorkView.setShiftEnd_end(searchEnd);
				List<AgWorkView> workList = agWorkInfoDao.getAgWorkViewList(att_AgWorkView);
				for(AgDoctorInfo info : reList){
					info.setIsOrder("0");
					if(info.getDepartmentName()!=null && !info.getDepartmentName().equals("") && info.getDepartmentName().length()>1)
						info.setDepartmentName(info.getDepartmentName().substring(1, info.getDepartmentName().length()-1));
					if(workList!=null && workList.size()>0){
						for(AgWorkView work : workList){
							if(work.getDoctorId().equals(info.getDoctorId())){
								info.setIsOrder("1");
								break;
							}
						}
					}
					boolean collFlag=false;
					if(collList !=null && collList.size() >0){
			  			for(AgCollectionDoctor coll : collList){
			  				if(coll.getDoctorId().equals(info.getDoctorId())){
			  					info.setIsColl("1");
			  					collFlag=true;
			  					break;
			  				}
			  			}
			  		}
					if(collFlag)
						info.setIsColl("1");
					else
						info.setIsColl("2");
					
					
				}
				
			}
		} catch (HSKDBException e) {
			e.printStackTrace();
		}
		return reList;
	} 
	 
}