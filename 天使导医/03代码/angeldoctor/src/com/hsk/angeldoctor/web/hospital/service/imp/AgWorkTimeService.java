package com.hsk.angeldoctor.web.hospital.service.imp;

import java.util.*;
import org.springframework.stereotype.*;
import org.springframework.beans.factory.annotation.Autowired;
import com.hsk.supper.dto.comm.PagerModel;
import com.hsk.supper.dto.comm.SysRetrunMessage; 
import com.hsk.xframe.api.service.imp.DSTService;
import com.hsk.exception.HSKDBException;
import com.hsk.exception.HSKException;
import com.hsk.angeldoctor.web.hospital.service.*;
import com.hsk.angeldoctor.api.persistence.*;
import com.hsk.angeldoctor.api.daobbase.*;


/** 
  hospital业务操作实现类 
 * @author  作者:admin
 * @version  版本信息:v1.0   创建时间: 2018-08-14 13:28:03
 */
 
@Service
public class  AgWorkTimeService extends DSTService implements IAgWorkTimeService {	
   /**
   *业务处理dao类  agWorkTimeDao 
   */
	@Autowired
	protected IAgWorkTimeDao agWorkTimeDao;
	@Autowired
	private IAgDoctorInfoDao agDoctorInfoDao;
	@Autowired
	protected IAgWorkInfoDao agWorkInfoDao;

 /**
	 * 根据ag_work_time表主键删除AgWorkTime对象记录
     * @param  shiftPeriodId  Integer类型(ag_work_time表主键)
	 * @return SysRetrunMessage 对象记录
	 * @throws HSKException
	 */

	public SysRetrunMessage findFormObject(Integer shiftPeriodId) throws HSKException{
	        SysRetrunMessage srm=new SysRetrunMessage(1l);
			  	
			try{
		   			AgWorkTime     att_AgWorkTime= agWorkTimeDao.findAgWorkTimeById( shiftPeriodId) ;
					srm.setObj(att_AgWorkTime);
				} catch (HSKDBException e) {
					e.printStackTrace(); 
					srm.setCode(0l);
					srm.setMeg(e.getMessage()); 
				}
				 return srm ;
	} 

    /**
	 * 根据ag_work_time表主键删除AgWorkTime对象记录
     * @param  shiftPeriodId  Integer类型(ag_work_time表主键)
	 * @throws HSKException
	 */

	public AgWorkTime findObject(Integer shiftPeriodId) throws HSKException{
			AgWorkTime  att_AgWorkTime=new AgWorkTime();		
			try{
		        att_AgWorkTime= agWorkTimeDao.findAgWorkTimeById( shiftPeriodId) ;
				} catch (HSKDBException e) {
					e.printStackTrace(); 
					throw new  HSKException(e);
				}
				return  att_AgWorkTime;
	}
	
	 
	 /**
	 * 根据ag_work_time表主键删除AgWorkTime对象记录
     * @param  shiftPeriodId  Integer类型(ag_work_time表主键)
     * @return SysRetrunMessage 对象记录
	 * @throws HSKException
	 */
	public SysRetrunMessage deleteObject(Integer shiftPeriodId) throws HSKException{  
		    SysRetrunMessage srm=new SysRetrunMessage(1l);
		   try{ 
			   	//查看排版时段是否被使用
			   AgWorkInfo agWorkInfo = new AgWorkInfo();
			   agWorkInfo.setShiftPeriodId(shiftPeriodId);
			   List<AgWorkInfo> checkList = agWorkInfoDao.getListByAgWorkInfo(agWorkInfo);
			   if(checkList!=null && checkList.size() >0){
				   srm.setCode(0l);
				   srm.setMeg("排班时段已被使用!");
				   return srm;
			   }
				agWorkTimeDao.deleteAgWorkTimeById(shiftPeriodId);
			 } catch (Exception e) {
					e.printStackTrace(); 
					throw new  HSKException(e);
		     }
		   return srm;  
	}
	
	/**
	 * 根据ag_work_time表主键删除多条AgWorkTime对象记录
     * @param  ShiftPeriodIds  Integer类型(ag_work_time表主键)
     * @return SysRetrunMessage 对象记录
	 * @throws HSKException
	 */
	public SysRetrunMessage deleteAllObject(String shiftPeriodIds) throws HSKException{
		SysRetrunMessage srm = new SysRetrunMessage(1l);
		try {
			String[] ids = shiftPeriodIds.split(",");
			for (String did : ids) {
				if (did != null && !"".equals(did.trim())) {
					agWorkTimeDao.deleteAgWorkTimeById(Integer
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
	 * 新增或修改ag_work_time表记录 ,如果ag_work_time表主键AgWorkTime.ShiftPeriodId为空就是添加，如果非空就是修改
     * @param  att_AgWorkTime  AgWorkTime类型(ag_work_time表记录)
     * @return AgWorkTime  修改后的AgWorkTime对象记录
	 * @throws HSKDBException
	 */
	public SysRetrunMessage saveOrUpdateObject( AgWorkTime att_AgWorkTime) throws HSKException{
			 SysRetrunMessage srm = new SysRetrunMessage(1l);
			  try{
				  	Integer doStart=Integer.parseInt(att_AgWorkTime.getStartH()+att_AgWorkTime.getStartM());
				  	Integer doEnd=Integer.parseInt(att_AgWorkTime.getEndH()+att_AgWorkTime.getEndM());
				  	if(doEnd <= doStart){
				  		srm.setCode(0l);
				  		srm.setMeg("结束时间不能大于开始时间!");
				  		return srm;
				  	}
				  	if(this.GetOneSessionAccount().getUserType()==2){//如果是医院管理员登录
				  		att_AgWorkTime.setOrganizationId(this.GetOneSessionAccount().getSroleId());
					}else if(this.GetOneSessionAccount().getUserType()==3){//如果是医生登录
						AgDoctorInfo att_AgDoctorInfo= agDoctorInfoDao.findAgDoctorInfoById(this.GetOneSessionAccount().getSroleId());
						att_AgWorkTime.setOrganizationId(att_AgDoctorInfo.getOrganizationId());
					}
				  	AgWorkTime time = new AgWorkTime();
				  	time.setOrganizationId(att_AgWorkTime.getOrganizationId());
				  	List<AgWorkTime> timeList = agWorkTimeDao.getListByAgWorkTime(time);
				  	if(timeList!=null && timeList.size() >0){
				  		for(AgWorkTime at:timeList){
				  			boolean flag =false;
				  			if(att_AgWorkTime.getShiftPeriodId()==null)
				  				flag=true;
				  			else if(!at.getShiftPeriodId().equals(att_AgWorkTime.getShiftPeriodId()))
				  				flag=true;
				  			if(!flag)
				  				time=at;
				  			if(flag){
				  				Integer doStart2=Integer.parseInt(at.getStartH()+at.getStartM());
							  	Integer doEnd2=Integer.parseInt(at.getEndH()+at.getEndM());
							  	if(doEnd<=doStart2 || doStart>=doEnd2){}
							  	else{
							  		srm.setCode(0l);
							  		srm.setMeg("该时间段已存在!");
							  		return srm;
							  	}
				  			}
				  			
				  		}
				  	}
				  	if(time!=null && time.getShiftPeriodId()!=null){
				  		time.setStartH(att_AgWorkTime.getStartH());
				  		time.setStartM(att_AgWorkTime.getStartM());
				  		time.setEndH(att_AgWorkTime.getEndH());
				  		time.setEndM(att_AgWorkTime.getEndM());
				  		agWorkTimeDao.saveOrUpdateAgWorkTime(time); 
				  	}else
				  		agWorkTimeDao.saveOrUpdateAgWorkTime(att_AgWorkTime); 
					srm.setObj(att_AgWorkTime);
			    } catch (Exception e) {
			    	srm.setCode(0l);
			    	srm.setMeg("操作失败!");
					e.printStackTrace(); 
					throw new HSKException(e);
		        }
			return srm;	  
	}
	
	 
	/**
	 *根据AgWorkTime对象作为对(ag_work_time表进行查询，获取分页对象
     * @param  att_AgWorkTime  AgWorkTime类型(ag_work_time表记录)
     * @return PagerModel  分页对象
	 * @throws HSKException 
	 */
	public PagerModel getPagerModelObject (AgWorkTime att_AgWorkTime) throws HSKException{
		PagerModel pm=new PagerModel(new ArrayList<AgWorkTime>());
			  try{
				  if(this.GetOneSessionAccount().getUserType()==2){//如果是医院管理员登录
					  att_AgWorkTime.setOrganizationId(this.GetOneSessionAccount().getSroleId());
					}else if(this.GetOneSessionAccount().getUserType()==3){//如果是医生登录
						AgDoctorInfo att_AgDoctorInfo= agDoctorInfoDao.findAgDoctorInfoById(this.GetOneSessionAccount().getSroleId());
						att_AgWorkTime.setOrganizationId(att_AgDoctorInfo.getOrganizationId());
					}
					pm=agWorkTimeDao.getPagerModelByAgWorkTime(att_AgWorkTime);
			    } catch (Exception e) {
					e.printStackTrace(); 
		        }
		return pm;
	} 
	 
}