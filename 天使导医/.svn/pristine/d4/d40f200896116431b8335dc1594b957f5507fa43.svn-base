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
 * @version  版本信息:v1.0   创建时间: 2018-08-14 13:28:02
 */
 
@Service
public class  AgJobMenuGxService extends DSTService implements IAgJobMenuGxService {	
   /**
   *业务处理dao类  agJobMenuGxDao 
   */
	@Autowired
	protected IAgJobMenuGxDao agJobMenuGxDao;
	@Autowired
	protected IAgHospitalMenuDao agHospitalMenuDao;
	@Autowired
	protected IAgDoctorInfoDao agDoctorInfoDao;


 /**
	 * 根据ag_job_menu_gx表主键删除AgJobMenuGx对象记录
     * @param  ajmgId  Integer类型(ag_job_menu_gx表主键)
	 * @return SysRetrunMessage 对象记录
	 * @throws HSKException
	 */

	public SysRetrunMessage findFormObject(Integer ajmgId) throws HSKException{
	        SysRetrunMessage srm=new SysRetrunMessage(1l);
			  	
			try{
		   			AgJobMenuGx     att_AgJobMenuGx= agJobMenuGxDao.findAgJobMenuGxById( ajmgId) ;
					srm.setObj(att_AgJobMenuGx);
				} catch (HSKDBException e) {
					e.printStackTrace(); 
					srm.setCode(0l);
					srm.setMeg(e.getMessage()); 
				}
				 return srm ;
	} 

    /**
	 * 根据ag_job_menu_gx表主键删除AgJobMenuGx对象记录
     * @param  ajmgId  Integer类型(ag_job_menu_gx表主键)
	 * @throws HSKException
	 */

	public AgJobMenuGx findObject(Integer ajmgId) throws HSKException{
			AgJobMenuGx  att_AgJobMenuGx=new AgJobMenuGx();		
			try{
		        att_AgJobMenuGx= agJobMenuGxDao.findAgJobMenuGxById( ajmgId) ;
				} catch (HSKDBException e) {
					e.printStackTrace(); 
					throw new  HSKException(e);
				}
				return  att_AgJobMenuGx;
	}
	
	 
	 /**
	 * 根据ag_job_menu_gx表主键删除AgJobMenuGx对象记录
     * @param  ajmgId  Integer类型(ag_job_menu_gx表主键)
     * @return SysRetrunMessage 对象记录
	 * @throws HSKException
	 */
	public SysRetrunMessage deleteObject(Integer ajmgId) throws HSKException{  
		    SysRetrunMessage srm=new SysRetrunMessage(1l);
		   try{ 
				agJobMenuGxDao.deleteAgJobMenuGxById(ajmgId);
			 } catch (Exception e) {
					e.printStackTrace(); 
					throw new  HSKException(e);
		     }
		   return srm;  
	}
	
	/**
	 * 根据ag_job_menu_gx表主键删除多条AgJobMenuGx对象记录
     * @param  AjmgIds  Integer类型(ag_job_menu_gx表主键)
     * @return SysRetrunMessage 对象记录
	 * @throws HSKException
	 */
	public SysRetrunMessage deleteAllObject(String ajmgIds) throws HSKException{
		SysRetrunMessage srm = new SysRetrunMessage(1l);
		try {
			String[] ids = ajmgIds.split(",");
			for (String did : ids) {
				if (did != null && !"".equals(did.trim())) {
					agJobMenuGxDao.deleteAgJobMenuGxById(Integer
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
	 * 新增或修改ag_job_menu_gx表记录 ,如果ag_job_menu_gx表主键AgJobMenuGx.AjmgId为空就是添加，如果非空就是修改
     * @param  att_AgJobMenuGx  AgJobMenuGx类型(ag_job_menu_gx表记录)
     * @return AgJobMenuGx  修改后的AgJobMenuGx对象记录
	 * @throws HSKDBException
	 */
	public SysRetrunMessage saveOrUpdateObject( AgJobMenuGx att_AgJobMenuGx) throws HSKException{
			 SysRetrunMessage srm = new SysRetrunMessage(1l);
			  try{
					agJobMenuGxDao.saveOrUpdateAgJobMenuGx(att_AgJobMenuGx); 
					srm.setObj(att_AgJobMenuGx);
			    } catch (Exception e) {
					e.printStackTrace(); 
					throw new HSKException(e);
		        }
			return srm;	  
	}
	
	 
	/**
	 *根据AgJobMenuGx对象作为对(ag_job_menu_gx表进行查询，获取分页对象
     * @param  att_AgJobMenuGx  AgJobMenuGx类型(ag_job_menu_gx表记录)
     * @return PagerModel  分页对象
	 * @throws HSKException 
	 */
	public PagerModel getPagerModelObject (AgJobMenuGx att_AgJobMenuGx) throws HSKException{
		PagerModel pm=new PagerModel(new ArrayList<AgJobMenuGx>());
			  try{
					pm=agJobMenuGxDao.getPagerModelByAgJobMenuGx(att_AgJobMenuGx);
			    } catch (Exception e) {
					e.printStackTrace(); 
		        }
		return pm;
	}

	@Override
	public List<AgHospitalMenu> getMenuListByJobId(Integer jobId) throws HSKException {
		List<AgHospitalMenu> reList = new ArrayList<AgHospitalMenu>();
		List<AgHospitalMenu> menuList = new ArrayList<AgHospitalMenu>();
		try{
			if(jobId != null){
				AgJobMenuGx att_AgJobMenuGx = new AgJobMenuGx();
				att_AgJobMenuGx.setJobId(jobId);
				List<AgJobMenuGx> gxList = agJobMenuGxDao.getListByAgJobMenuGx(att_AgJobMenuGx);
				if(gxList != null && gxList.size() >0){
					String menuIdStr="";
					for(AgJobMenuGx gx : gxList)
						menuIdStr+=gx.getMenuId()+",";
					menuIdStr=menuIdStr.substring(0, menuIdStr.length()-1);
					AgHospitalMenu att_AgHospitalMenu = new AgHospitalMenu();
					att_AgHospitalMenu.setMenuId_str(menuIdStr);
					menuList = agHospitalMenuDao.getListByAgHospitalMenu(att_AgHospitalMenu);
				}
				
			}else{
				AgHospitalMenu att_AgHospitalMenu = new AgHospitalMenu();
				menuList = agHospitalMenuDao.getListByAgHospitalMenu(att_AgHospitalMenu);
			}
			if(menuList!=null && menuList.size() >0){
				reList = initAgHospitalMenu(menuList,null);
			}
		}catch(Exception e){
			e.printStackTrace();
		}
		
		return reList;
	}
	
	public List<AgHospitalMenu> initAgHospitalMenu(List<AgHospitalMenu> menuList,Integer parentId){
		List<AgHospitalMenu> reList = new ArrayList<AgHospitalMenu>();
		if(parentId ==null){
			for(AgHospitalMenu menu : menuList){
				if(menu.getParentId()==null){
					AgHospitalMenu reData=menu;
					List<AgHospitalMenu> childeList=initAgHospitalMenu(menuList,reData.getMenuId());
					reData.setList(childeList);
					reList.add(reData);
				}
			}
		}else{
			for(AgHospitalMenu menu : menuList){
				if(menu.getParentId()!=null && menu.getParentId().equals(parentId)){
					AgHospitalMenu reData=menu;
					List<AgHospitalMenu> childeList=initAgHospitalMenu(menuList,reData.getMenuId());
					reData.setList(childeList);
					reList.add(reData);
				}
			}
		}
		return reList;
	}

	@Override
	public List<AgHospitalMenu> getLoginMenuList() throws HSKException {
		List<AgHospitalMenu> reList = new ArrayList<AgHospitalMenu>();
		try{
			if(this.GetOneSessionAccount().getUserType()==2){//如果是医院管理员登录
				reList = getMenuListByJobId(1);
			}else if(this.GetOneSessionAccount().getUserType()==3){//如果是医生登录
				AgDoctorInfo att_AgDoctorInfo= agDoctorInfoDao.findAgDoctorInfoById(this.GetOneSessionAccount().getSroleId());
				reList = getMenuListByJobId(att_AgDoctorInfo.getJobTitleId());
			}
			
	    } catch (Exception e) {
			e.printStackTrace(); 
        }
		return reList;
	}

	@Override
	public List<Map<String, Object>> getAgHospitalMenuGxList(Integer jobId) throws HSKException {
		List<Map<String, Object>> reList = new ArrayList<Map<String, Object>>();
		List<AgHospitalMenu> menuList = new ArrayList<AgHospitalMenu>();
		try{
			AgJobMenuGx att_AgJobMenuGx = new AgJobMenuGx();
			att_AgJobMenuGx.setJobId(jobId);
			List<AgJobMenuGx> gxList = agJobMenuGxDao.getListByAgJobMenuGx(att_AgJobMenuGx);
			if(gxList != null && gxList.size() >0){
				String menuIdStr="";
				for(AgJobMenuGx gx : gxList)
					menuIdStr+=gx.getMenuId()+",";
				menuIdStr=menuIdStr.substring(0, menuIdStr.length()-1);
				AgHospitalMenu att_AgHospitalMenu = new AgHospitalMenu();
				att_AgHospitalMenu.setMenuId_str(menuIdStr);
				menuList = agHospitalMenuDao.getListByAgHospitalMenu(att_AgHospitalMenu);
			}
			
			if(menuList!=null && menuList.size() >0){
				reList = initAgHospitalMenuGx(menuList,gxList,null);
			}
		}catch(Exception e){
			e.printStackTrace();
		}
		
		return reList;
	}
	
	public List<Map<String, Object>> initAgHospitalMenuGx(List<AgHospitalMenu> menuList,List<AgJobMenuGx> gxList,Integer parentId){
		List<Map<String, Object>> reList = new ArrayList<Map<String, Object>>();
		if(parentId ==null){
			for(AgHospitalMenu menu : menuList){
				if(menu.getParentId()==null){
					Map<String, Object> reData=new HashMap<String, Object>();
					for(AgJobMenuGx gx:gxList){
						if(gx.getMenuId().equals(menu.getMenuId())){
							reData.put("id", gx.getId());
							break;
						}
					}
					reData.put("menuId", menu.getMenuId());
					reData.put("name", menu.getName());
					reData.put("parentId", menu.getParentId());
					reData.put("parentName", menu.getParentName());
					reData.put("orderNum", menu.getOrderNum());
					List<Map<String, Object>> childeList=initAgHospitalMenuGx(menuList,gxList,menu.getMenuId());
					reData.put("list", childeList);
					reList.add(reData);
				}
			}
		}else{
			for(AgHospitalMenu menu : menuList){
				if(menu.getParentId()!=null && menu.getParentId().equals(parentId)){
					Map<String, Object> reData=new HashMap<String, Object>();
					for(AgJobMenuGx gx:gxList){
						if(gx.getMenuId().equals(menu.getMenuId())){
							reData.put("id", gx.getId());
							break;
						}
					}
					reData.put("menuId", menu.getMenuId());
					reData.put("name", menu.getName());
					reData.put("parentId", menu.getParentId());
					reData.put("parentName", menu.getParentName());
					reData.put("orderNum", menu.getOrderNum());
					List<Map<String, Object>> childeList=initAgHospitalMenuGx(menuList,gxList,menu.getMenuId());
					reData.put("list", childeList);
					reList.add(reData);
				}
			}
		}
		return reList;
	}

	@Override
	public SysRetrunMessage saveAgHospitalMenuGxs(Integer jobId, String menuIds) throws HSKException {
		SysRetrunMessage srm = new SysRetrunMessage(1l);
		  try{
			  	String[] menuIdArray=menuIds.split(",");
			  	if(menuIdArray!=null && menuIdArray.length>0){
			  		for(String menuId : menuIdArray){
			  			AgJobMenuGx agJobMenuGx = new AgJobMenuGx();
						agJobMenuGx.setJobId(jobId);
						agJobMenuGx.setMenuId(Integer.parseInt(menuId));
						AgJobMenuGx checkGx = (AgJobMenuGx) this.getOne(agJobMenuGx);
						if(checkGx!=null && checkGx.getId()!=null){
//							srm.setCode(0l);
//							srm.setMeg("该菜单不允许重复增加!");
//							return srm;
						}else{
							//检查是否有父亲节点
							AgHospitalMenu agHospitalMenu = new AgHospitalMenu();
							agHospitalMenu.setMenuId(agJobMenuGx.getMenuId());
							agHospitalMenu = (AgHospitalMenu) this.getOne(agHospitalMenu);
							if(agHospitalMenu.getParentId()!=null){//当存在父亲节点时
								 AgJobMenuGx parentMenuGx = new AgJobMenuGx();
								 parentMenuGx.setJobId(jobId);
								 parentMenuGx.setMenuId(agHospitalMenu.getParentId());
								 AgJobMenuGx checkParentGx = (AgJobMenuGx) this.getOne(parentMenuGx);
								 if(checkParentGx==null  ||  checkParentGx.getId()==null){
									 agJobMenuGxDao.saveOrUpdateAgJobMenuGx(parentMenuGx);
								}
							}
							agJobMenuGxDao.saveOrUpdateAgJobMenuGx(agJobMenuGx);
						}
			  		}
			  	}
			  	
		    } catch (Exception e) {
				e.printStackTrace(); 
				srm.setCode(0l);
				srm.setMeg("操作失败!");
				throw new HSKException(e);
	        }
		return srm;	
	}

	@Override
	public SysRetrunMessage deleteAgHospitalMenuGxs(Integer jobId,String menuIds) throws HSKException {
		SysRetrunMessage srm = new SysRetrunMessage(1l);
		  try{String[] menuIdArray=menuIds.split(",");
		  	if(menuIdArray!=null && menuIdArray.length>0){
		  		for(String menuId : menuIdArray){
		  			agJobMenuGxDao.delAgJobMenuGxByIds(jobId,menuIds+"");
					  AgHospitalMenu agHospitalMenu = new AgHospitalMenu();
					  agHospitalMenu.setMenuId(Integer.parseInt(menuId));
					  agHospitalMenu = (AgHospitalMenu) this.getOne(agHospitalMenu);
					  if(agHospitalMenu.getParentId()!=null){//当存在父亲节点时
						  AgHospitalMenu att_AgHospitalMenu = new AgHospitalMenu();
						  att_AgHospitalMenu.setParentId(agHospitalMenu.getParentId());
						  List<AgHospitalMenu> menuList = agHospitalMenuDao.getListByAgHospitalMenu(att_AgHospitalMenu);
						  if(menuList !=null &&menuList.size() >0){
							  String mIds="";
							  for(AgHospitalMenu mobj:menuList)
								  mIds += mobj.getMenuId()+",";
							  mIds=mIds.substring(0, mIds.length()-1);
							  //查看该父亲节点下是否有子节点被绑定赋权
							  AgJobMenuGx agJobMenuGx = new AgJobMenuGx();
							  agJobMenuGx.setJobId(jobId);
							  agJobMenuGx.setMenuId_str(mIds);
							  List<AgJobMenuGx> gxList = agJobMenuGxDao.getListByAgJobMenuGx(agJobMenuGx);
							  if(gxList==null || gxList.size()==0){
								  agJobMenuGxDao.delAgJobMenuGxByIds(jobId,agHospitalMenu.getParentId()+"");
							  }
						  }
					  }
		  		}
		  	}
		  	
		  		
		  		
			  
		    } catch (Exception e) {
				e.printStackTrace(); 
				srm.setCode(0l);
				srm.setMeg("操作失败!");
				throw new HSKException(e);
	        }
		return srm;	
	}
	 
}