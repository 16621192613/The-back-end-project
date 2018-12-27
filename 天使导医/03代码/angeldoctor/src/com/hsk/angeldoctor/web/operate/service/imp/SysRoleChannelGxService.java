package com.hsk.angeldoctor.web.operate.service.imp;

import java.util.*;
import org.springframework.stereotype.*;
import org.springframework.beans.factory.annotation.Autowired;
import com.hsk.supper.dto.comm.PagerModel;
import com.hsk.supper.dto.comm.SysRetrunMessage; 
import com.hsk.xframe.api.service.imp.DSTService;
import com.hsk.exception.HSKDBException;
import com.hsk.exception.HSKException;
import com.hsk.angeldoctor.web.operate.service.*;
import com.hsk.angeldoctor.api.persistence.*;
import com.hsk.angeldoctor.api.daobbase.*;


/** 
  operate业务操作实现类 
 * @author  作者:admin
 * @version  版本信息:v1.0   创建时间: 2018-08-14 13:40:22
 */
 
@Service
public class  SysRoleChannelGxService extends DSTService implements ISysRoleChannelGxService {	
   /**
   *业务处理dao类  sysRoleChannelGxDao 
   */
	@Autowired
	protected ISysRoleChannelGxDao sysRoleChannelGxDao;
	@Autowired
	protected ISysChannelInfoDao sysChannelInfoDao;

 /**
	 * 根据sys_role_channel_gx表主键删除SysRoleChannelGx对象记录
     * @param  srcgId  Integer类型(sys_role_channel_gx表主键)
	 * @return SysRetrunMessage 对象记录
	 * @throws HSKException
	 */

	public SysRetrunMessage findFormObject(Integer srcgId) throws HSKException{
	        SysRetrunMessage srm=new SysRetrunMessage(1l);
			  	
			try{
		   			SysRoleChannelGx     att_SysRoleChannelGx= sysRoleChannelGxDao.findSysRoleChannelGxById( srcgId) ;
					srm.setObj(att_SysRoleChannelGx);
				} catch (HSKDBException e) {
					e.printStackTrace(); 
					srm.setCode(0l);
					srm.setMeg(e.getMessage()); 
				}
				 return srm ;
	} 

    /**
	 * 根据sys_role_channel_gx表主键删除SysRoleChannelGx对象记录
     * @param  srcgId  Integer类型(sys_role_channel_gx表主键)
	 * @throws HSKException
	 */

	public SysRoleChannelGx findObject(Integer srcgId) throws HSKException{
			SysRoleChannelGx  att_SysRoleChannelGx=new SysRoleChannelGx();		
			try{
		        att_SysRoleChannelGx= sysRoleChannelGxDao.findSysRoleChannelGxById( srcgId) ;
				} catch (HSKDBException e) {
					e.printStackTrace(); 
					throw new  HSKException(e);
				}
				return  att_SysRoleChannelGx;
	}
	
	 
	 /**
	 * 根据sys_role_channel_gx表主键删除SysRoleChannelGx对象记录
     * @param  srcgId  Integer类型(sys_role_channel_gx表主键)
     * @return SysRetrunMessage 对象记录
	 * @throws HSKException
	 */
	public SysRetrunMessage deleteObject(Integer srcgId) throws HSKException{  
		    SysRetrunMessage srm=new SysRetrunMessage(1l);
		   try{ 
				sysRoleChannelGxDao.deleteSysRoleChannelGxById(srcgId);
			 } catch (Exception e) {
					e.printStackTrace(); 
					throw new  HSKException(e);
		     }
		   return srm;  
	}
	
	/**
	 * 根据sys_role_channel_gx表主键删除多条SysRoleChannelGx对象记录
     * @param  SrcgIds  Integer类型(sys_role_channel_gx表主键)
     * @return SysRetrunMessage 对象记录
	 * @throws HSKException
	 */
	public SysRetrunMessage deleteAllObject(String srcgIds) throws HSKException{
		SysRetrunMessage srm = new SysRetrunMessage(1l);
		try {
			String[] ids = srcgIds.split(",");
			for (String did : ids) {
				if (did != null && !"".equals(did.trim())) {
					sysRoleChannelGxDao.deleteSysRoleChannelGxById(Integer
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
	 * 新增或修改sys_role_channel_gx表记录 ,如果sys_role_channel_gx表主键SysRoleChannelGx.SrcgId为空就是添加，如果非空就是修改
     * @param  att_SysRoleChannelGx  SysRoleChannelGx类型(sys_role_channel_gx表记录)
     * @return SysRoleChannelGx  修改后的SysRoleChannelGx对象记录
	 * @throws HSKDBException
	 */
	public SysRetrunMessage saveOrUpdateObject( SysRoleChannelGx att_SysRoleChannelGx) throws HSKException{
			 SysRetrunMessage srm = new SysRetrunMessage(1l);
			  try{
					sysRoleChannelGxDao.saveOrUpdateSysRoleChannelGx(att_SysRoleChannelGx); 
					srm.setObj(att_SysRoleChannelGx);
			    } catch (Exception e) {
					e.printStackTrace(); 
					throw new HSKException(e);
		        }
			return srm;	  
	}
	
	 
	/**
	 *根据SysRoleChannelGx对象作为对(sys_role_channel_gx表进行查询，获取分页对象
     * @param  att_SysRoleChannelGx  SysRoleChannelGx类型(sys_role_channel_gx表记录)
     * @return PagerModel  分页对象
	 * @throws HSKException 
	 */
	public PagerModel getPagerModelObject (SysRoleChannelGx att_SysRoleChannelGx) throws HSKException{
		PagerModel pm=new PagerModel(new ArrayList<SysRoleChannelGx>());
			  try{
					pm=sysRoleChannelGxDao.getPagerModelBySysRoleChannelGx(att_SysRoleChannelGx);
			    } catch (Exception e) {
					e.printStackTrace(); 
		        }
		return pm;
	}

	@Override
	public List<Map<String, Object>> getLoginMenuList() throws HSKException {
		List<Map<String, Object>> reList = new ArrayList<Map<String, Object>>();
		try {
			SysRoleChannelGx att_SysRoleChannelGx= new SysRoleChannelGx();
			att_SysRoleChannelGx.setSroleId(this.GetOneSessionAccount().getUserRole());
			List<SysRoleChannelGx> gxList = sysRoleChannelGxDao.getListBySysRoleChannelGx(att_SysRoleChannelGx);
			String menuIdStr="";
			if(gxList !=null && gxList.size() > 0){
				for(SysRoleChannelGx gx :gxList)
					menuIdStr+=gx.getMenuId()+",";
				menuIdStr=menuIdStr.substring(0, menuIdStr.length()-1);
				SysChannelInfo att_SysChannelInfo= new SysChannelInfo();
				att_SysChannelInfo.setMenuId_str(menuIdStr);
				List<SysChannelInfo> sysChannelInfoList = sysChannelInfoDao.getListBySysChannelInfo(att_SysChannelInfo);
				if(sysChannelInfoList !=null && sysChannelInfoList.size() > 0){
					for(SysChannelInfo info :sysChannelInfoList){
						for(SysRoleChannelGx gx :gxList){
							if(info.getMenuId().equals(gx.getMenuId())){
								Map<String,Object> reMap= new HashMap<String,Object>();
								reMap.put("id", gx.getSrcgId());
								reMap.put("portalRoleId", gx.getSroleId());
								reMap.put("portalMenuId", info.getMenuId());
								reMap.put("orderNum", info.getOrderNum());
								reList.add(reMap);
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
	public SysRetrunMessage saveSysRoleChannelGx(Integer sroId, String menuIds) throws HSKException {
		SysRetrunMessage srm = new SysRetrunMessage(1l);
		  try{
			  String[] menuIdArry = menuIds.split(",");
				for(String menuIdStr:menuIdArry){
					if(menuIdStr!= null && !menuIdStr.trim().equals("")){
						SysRoleChannelGx att_SysRoleChannelGx= new SysRoleChannelGx();
						att_SysRoleChannelGx.setSroleId(sroId);
						att_SysRoleChannelGx.setMenuId(Integer.parseInt(menuIdStr));
						sysRoleChannelGxDao.saveOrUpdateSysRoleChannelGx(att_SysRoleChannelGx);
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
	public SysRetrunMessage deleteSysRoleChannelGx(String gxIds) throws HSKException {
		SysRetrunMessage srm = new SysRetrunMessage(1l);
		  try{
			  sysRoleChannelGxDao.delBySysRoleChannelGxByIds(gxIds);
		    } catch (Exception e) {
				e.printStackTrace(); 
				srm.setCode(0l);
				srm.setMeg("操作失败!");
				throw new HSKException(e);
	        }
		return srm;	
	}

	@Override
	public List<Map<String, Object>> getSysRoleChannelGxListByRoleId(Integer sroId) throws HSKException {
		List<Map<String, Object>> reList = new ArrayList<Map<String, Object>>();
		try {
			SysRoleChannelGx att_SysRoleChannelGx= new SysRoleChannelGx();
			att_SysRoleChannelGx.setSroleId(sroId);
			List<SysRoleChannelGx> gxList = sysRoleChannelGxDao.getListBySysRoleChannelGx(att_SysRoleChannelGx);
			String menuIdStr="";
			if(gxList !=null && gxList.size() > 0){
				for(SysRoleChannelGx gx :gxList)
					menuIdStr+=gx.getMenuId()+",";
				menuIdStr=menuIdStr.substring(0, menuIdStr.length()-1);
				SysChannelInfo att_SysChannelInfo= new SysChannelInfo();
				att_SysChannelInfo.setMenuId_str(menuIdStr);
				List<SysChannelInfo> sysChannelInfoList = sysChannelInfoDao.getListBySysChannelInfo(att_SysChannelInfo);
				if(sysChannelInfoList !=null && sysChannelInfoList.size() > 0){
					for(SysChannelInfo info :sysChannelInfoList){
						for(SysRoleChannelGx gx :gxList){
							if(info.getMenuId().equals(gx.getMenuId())){
								Map<String,Object> reMap= new HashMap<String,Object>();
								reMap.put("id", gx.getSrcgId());
								reMap.put("portalRoleId", gx.getSroleId());
								reMap.put("portalMenuId", info.getMenuId());
								reMap.put("orderNum", info.getOrderNum());
								reList.add(reMap);
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
	 
}