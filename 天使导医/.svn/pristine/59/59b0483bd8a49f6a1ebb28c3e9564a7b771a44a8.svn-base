package com.hsk.angeldoctor.web.hospital.service.imp;

import java.text.SimpleDateFormat;
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
 * @version  版本信息:v1.0   创建时间: 2018-08-14 13:27:58
 */
 
@Service
public class  AgCollectionDoctorService extends DSTService implements IAgCollectionDoctorService {	
   /**
   *业务处理dao类  agCollectionDoctorDao 
   */
	@Autowired
	protected IAgCollectionDoctorDao agCollectionDoctorDao;
	@Autowired
	protected 	IAgDoctorInfoDao agDoctorInfoDao;
	@Autowired
	private IAgWorkInfoDao agWorkInfoDao;


 /**
	 * 根据ag_collection_doctor表主键删除AgCollectionDoctor对象记录
     * @param  mcdId  Integer类型(ag_collection_doctor表主键)
	 * @return SysRetrunMessage 对象记录
	 * @throws HSKException
	 */

	public SysRetrunMessage findFormObject(Integer mcdId) throws HSKException{
	        SysRetrunMessage srm=new SysRetrunMessage(1l);
			  	
			try{
		   			AgCollectionDoctor     att_AgCollectionDoctor= agCollectionDoctorDao.findAgCollectionDoctorById( mcdId) ;
					srm.setObj(att_AgCollectionDoctor);
				} catch (HSKDBException e) {
					e.printStackTrace(); 
					srm.setCode(0l);
					srm.setMeg(e.getMessage()); 
				}
				 return srm ;
	} 

    /**
	 * 根据ag_collection_doctor表主键删除AgCollectionDoctor对象记录
     * @param  mcdId  Integer类型(ag_collection_doctor表主键)
	 * @throws HSKException
	 */

	public AgCollectionDoctor findObject(Integer mcdId) throws HSKException{
			AgCollectionDoctor  att_AgCollectionDoctor=new AgCollectionDoctor();		
			try{
		        att_AgCollectionDoctor= agCollectionDoctorDao.findAgCollectionDoctorById( mcdId) ;
				} catch (HSKDBException e) {
					e.printStackTrace(); 
					throw new  HSKException(e);
				}
				return  att_AgCollectionDoctor;
	}
	
	 
	 /**
	 * 根据ag_collection_doctor表主键删除AgCollectionDoctor对象记录
     * @param  mcdId  Integer类型(ag_collection_doctor表主键)
     * @return SysRetrunMessage 对象记录
	 * @throws HSKException
	 */
	public SysRetrunMessage deleteObject(Integer mcdId) throws HSKException{  
		    SysRetrunMessage srm=new SysRetrunMessage(1l);
		   try{ 
			   AgCollectionDoctor agCollectionDoctor = new AgCollectionDoctor();
			   agCollectionDoctor.setDoctorId(mcdId);
			   agCollectionDoctor.setSuiId(this.GetOneSessionAccount().getSuiId());
			   agCollectionDoctor = (AgCollectionDoctor) this.getOne(agCollectionDoctor);
			   if(agCollectionDoctor!=null)
				   this.deleteObjects(agCollectionDoctor);
			 } catch (Exception e) {
					e.printStackTrace(); 
					throw new  HSKException(e);
		     }
		   return srm;  
	}
	
	/**
	 * 根据ag_collection_doctor表主键删除多条AgCollectionDoctor对象记录
     * @param  McdIds  Integer类型(ag_collection_doctor表主键)
     * @return SysRetrunMessage 对象记录
	 * @throws HSKException
	 */
	public SysRetrunMessage deleteAllObject(String mcdIds) throws HSKException{
		SysRetrunMessage srm = new SysRetrunMessage(1l);
		try {
			String[] ids = mcdIds.split(",");
			for (String did : ids) {
				if (did != null && !"".equals(did.trim())) {
					agCollectionDoctorDao.deleteAgCollectionDoctorById(Integer
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
	 * 新增或修改ag_collection_doctor表记录 ,如果ag_collection_doctor表主键AgCollectionDoctor.McdId为空就是添加，如果非空就是修改
     * @param  att_AgCollectionDoctor  AgCollectionDoctor类型(ag_collection_doctor表记录)
     * @return AgCollectionDoctor  修改后的AgCollectionDoctor对象记录
	 * @throws HSKDBException
	 */
	public SysRetrunMessage saveOrUpdateObject( AgCollectionDoctor att_AgCollectionDoctor) throws HSKException{
			 SysRetrunMessage srm = new SysRetrunMessage(1l);
			  try{
				  AgCollectionDoctor agCollectionDoctor = (AgCollectionDoctor) this.getOne(att_AgCollectionDoctor);
				  if(agCollectionDoctor==null)
					   agCollectionDoctorDao.saveOrUpdateAgCollectionDoctor(att_AgCollectionDoctor); 
					srm.setObj(att_AgCollectionDoctor);
			    } catch (Exception e) {
					e.printStackTrace(); 
					throw new HSKException(e);
		        }
			return srm;	  
	}
	
	 
	/**
	 *根据AgCollectionDoctor对象作为对(ag_collection_doctor表进行查询，获取分页对象
     * @param  att_AgCollectionDoctor  AgCollectionDoctor类型(ag_collection_doctor表记录)
     * @return PagerModel  分页对象
	 * @throws HSKException 
	 */
	public PagerModel getPagerModelObject (AgCollectionDoctor att_AgCollectionDoctor) throws HSKException{
		PagerModel pm=new PagerModel(new ArrayList<AgCollectionDoctor>());
			  try{
					pm=agCollectionDoctorDao.getPagerModelByAgCollectionDoctor(att_AgCollectionDoctor);
					 List<AgCollectionDoctor> list_obj= pm.getItems();
					 if(list_obj!=null&&list_obj.size()>0){
						 String ids="";
						 for(AgCollectionDoctor did:list_obj){
							 ids+=did.getDoctorId()+",";
						 }
						 ids= ids.substring(0, ids.length()-1);
						 AgDoctorInfo att_AgDoctorInfo=new AgDoctorInfo ();
						 att_AgDoctorInfo.setDoctorId_str(ids);
						 
						List<AgDoctorInfo> list_search= agDoctorInfoDao.getListByAgDoctorInfo(att_AgDoctorInfo);
						if(list_search!=null && list_search.size() >0){
							String docIds="";
							for(AgDoctorInfo info : list_search)
								docIds+=info.getDoctorId()+",";
							docIds=docIds.substring(0, docIds.length()-1);
							AgWorkView att_AgWorkView = new AgWorkView();
							att_AgWorkView.setDocIds(docIds);
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
							for(AgDoctorInfo info : list_search){
								info.setIsOrder("0");
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
						
						pm.setRows(list_search);
					 }
			    } catch (Exception e) {
					e.printStackTrace(); 
		        }
		return pm;
	} 
	 
}