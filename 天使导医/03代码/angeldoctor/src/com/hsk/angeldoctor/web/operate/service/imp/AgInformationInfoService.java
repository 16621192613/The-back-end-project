package com.hsk.angeldoctor.web.operate.service.imp;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.*;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.*;
import org.springframework.beans.factory.annotation.Autowired;

import com.barcodelib.barcode.a.g.m.r;
import com.hsk.supper.dto.SystemContext;
import com.hsk.supper.dto.comm.PagerModel;
import com.hsk.supper.dto.comm.SysRetrunMessage; 
import com.hsk.xframe.api.service.imp.DSTService;
import com.hsk.xframe.api.utils.freeMarker.CommonUtil;

import freemarker.template.Configuration;
import freemarker.template.Template;

import com.hsk.exception.HSKDBException;
import com.hsk.exception.HSKException;
import com.hsk.angeldoctor.web.operate.service.*;
import com.hsk.angeldoctor.api.persistence.*;
import com.hsk.angeldoctor.api.daobbase.*;


/** 
  operate业务操作实现类 
 * @author  作者:admin
 * @version  版本信息:v1.0   创建时间: 2018-08-14 13:40:21
 */
 
@Service
public class  AgInformationInfoService extends DSTService implements IAgInformationInfoService {	
   /**
   *业务处理dao类  agInformationInfoDao 
   */
	@Autowired
	protected IAgInformationInfoDao agInformationInfoDao;

 /**
	 * 根据ag_information_info表主键删除AgInformationInfo对象记录
     * @param  aiiId  Integer类型(ag_information_info表主键)
	 * @return SysRetrunMessage 对象记录
	 * @throws HSKException
	 */

	public SysRetrunMessage findFormObject(Integer aiiId) throws HSKException{
	        SysRetrunMessage srm=new SysRetrunMessage(1l);
			  	
			try{
		   			AgInformationInfo     att_AgInformationInfo= agInformationInfoDao.findAgInformationInfoById( aiiId) ;
					srm.setObj(att_AgInformationInfo);
				} catch (HSKDBException e) {
					e.printStackTrace(); 
					srm.setCode(0l);
					srm.setMeg(e.getMessage()); 
				}
				 return srm ;
	} 

    /**
	 * 根据ag_information_info表主键删除AgInformationInfo对象记录
     * @param  aiiId  Integer类型(ag_information_info表主键)
	 * @throws HSKException
	 */

	public AgInformationInfo findObject(Integer aiiId) throws HSKException{
			AgInformationInfo  att_AgInformationInfo=new AgInformationInfo();		
			try{
		        att_AgInformationInfo= agInformationInfoDao.findAgInformationInfoById( aiiId) ;
				} catch (HSKDBException e) {
					e.printStackTrace(); 
					throw new  HSKException(e);
				}
				return  att_AgInformationInfo;
	}
	
	 
	 /**
	 * 根据ag_information_info表主键删除AgInformationInfo对象记录
     * @param  aiiId  Integer类型(ag_information_info表主键)
     * @return SysRetrunMessage 对象记录
	 * @throws HSKException
	 */
	public SysRetrunMessage deleteObject(Integer aiiId) throws HSKException{  
		    SysRetrunMessage srm=new SysRetrunMessage(1l);
		   try{ 
				agInformationInfoDao.deleteAgInformationInfoById(aiiId);
			 } catch (Exception e) {
					e.printStackTrace(); 
					throw new  HSKException(e);
		     }
		   return srm;  
	}
	
	/**
	 * 根据ag_information_info表主键删除多条AgInformationInfo对象记录
     * @param  AiiIds  Integer类型(ag_information_info表主键)
     * @return SysRetrunMessage 对象记录
	 * @throws HSKException
	 */
	public SysRetrunMessage deleteAllObject(String aiiIds) throws HSKException{
		SysRetrunMessage srm = new SysRetrunMessage(1l);
		try {
			String[] ids = aiiIds.split(",");
			for (String did : ids) {
				if (did != null && !"".equals(did.trim())) {
					agInformationInfoDao.deleteAgInformationInfoById(Integer
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
	 * 新增或修改ag_information_info表记录 ,如果ag_information_info表主键AgInformationInfo.AiiId为空就是添加，如果非空就是修改
     * @param  att_AgInformationInfo  AgInformationInfo类型(ag_information_info表记录)
     * @return AgInformationInfo  修改后的AgInformationInfo对象记录
	 * @throws HSKDBException
	 */
	public SysRetrunMessage saveOrUpdateObject( AgInformationInfo att_AgInformationInfo) throws HSKException{
			 SysRetrunMessage srm = new SysRetrunMessage(1l);
			  try{
				  	if(att_AgInformationInfo.getAiiId()==null){
				  		att_AgInformationInfo.setCreateDate(new Date());
				  		att_AgInformationInfo.setCreatorId(this.GetOneSessionAccount().getSuiId());
				  		att_AgInformationInfo.setCreatorName(this.GetOneSessionAccount().getUserName());
				  	}
					agInformationInfoDao.saveOrUpdateAgInformationInfo(att_AgInformationInfo); 
					SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
					Map<String, Object> dataMap = new HashMap<String,Object>();
					dataMap.put("title", att_AgInformationInfo.getTitle()!=null?att_AgInformationInfo.getTitle():"");
					dataMap.put("author", att_AgInformationInfo.getAuthor()!=null?att_AgInformationInfo.getAuthor():"");
					dataMap.put("content", att_AgInformationInfo.getContent()!=null?att_AgInformationInfo.getContent():"");
					if(att_AgInformationInfo.getCreateDate()!=null)
						dataMap.put("createDate", sdf.format(att_AgInformationInfo.getCreateDate()));
					else
						dataMap.put("createDate", sdf.format(new Date()));
					Configuration configuration = new Configuration();
					configuration.setDefaultEncoding("UTF-8");
					// 设置模本装置方法和路径,FreeMarker支持多种模板装载方法。可以servlet，classpath，数据库装载，
					// 这里我们的模板是放在org.cnzjw.template包下面
					configuration.setClassForTemplateLoading(this.getClass(),
							"/ftl");
					Template t = configuration.getTemplate("template.ftl");
					// 输出文档路径及名称
					Calendar now = Calendar.getInstance();
					long l = now.getTimeInMillis();
					String tmpPath = SystemContext.updown_File_path+CommonUtil.HTML_PATH;//获得工程运行web的目录
					File file = new File(tmpPath);
					if(!file.exists()) {
						file.mkdirs();
					}
			        String realPath =tmpPath+ att_AgInformationInfo.getAiiId()+ ".html";
					File outFile = new File(realPath);
					Writer out = null;
					out = new BufferedWriter(new OutputStreamWriter(
							new FileOutputStream(outFile),"UTF-8"));
					t.process(dataMap, out);
					out.close();
					srm.setObj(att_AgInformationInfo);
			    } catch (Exception e) {
					e.printStackTrace(); 
					throw new HSKException(e);
		        }
			return srm;	  
	}
	
	 
	/**
	 *根据AgInformationInfo对象作为对(ag_information_info表进行查询，获取分页对象
     * @param  att_AgInformationInfo  AgInformationInfo类型(ag_information_info表记录)
     * @return PagerModel  分页对象
	 * @throws HSKException 
	 */
	public PagerModel getPagerModelObject (AgInformationInfo att_AgInformationInfo) throws HSKException{
		PagerModel pm=new PagerModel();
		try{
			att_AgInformationInfo.setTab_like("author");
			att_AgInformationInfo.setTab_order("aiiId desc");
			PagerModel pm2=agInformationInfoDao.getPagerModelByAgInformationInfo(att_AgInformationInfo);
			SimpleDateFormat sdf =new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
			List<Map<String,Object>> reList = new ArrayList<Map<String,Object>>();
			if(pm2.getRows()!=null && pm2.getRows().size()>0){
				for(Object obj : pm2.getRows()){
					AgInformationInfo info = (AgInformationInfo)obj;
					Map<String,Object> reMap = new HashMap<String,Object>();
					reMap.put("id", info.getAiiId());
					reMap.put("provId", info.getProvId());
					reMap.put("cityId", info.getCityId());
					reMap.put("title", info.getTitle());
					reMap.put("author", info.getAuthor());
					reMap.put("content", info.getUrl());
					reMap.put("icon", info.getIcon());
					if(info.getCreateDate()!=null)
						reMap.put("createDate", sdf.format(info.getCreateDate()));
					else
						reMap.put("createDate","");
					reMap.put("digest", info.getDigest());
					reMap.put("isBanner", info.getIsBanner());
					reMap.put("bannerIcon", info.getBannerIcon());
					if(info.getBannerStartDate()!=null)
						reMap.put("bannerStartDate", sdf.format(info.getBannerStartDate()));
					else
						reMap.put("bannerStartDate","");
					if(info.getBannerEndDate()!=null)
						reMap.put("bannerEndDate", sdf.format(info.getBannerEndDate()));
					else
						reMap.put("bannerEndDate","");
					reMap.put("pageRead", info.getPageRead());
					reMap.put("creatorId", info.getCreatorId());
					reMap.put("status", info.getStatus());
					reMap.put("type", info.getType());
					reMap.put("creatorName", info.getCreatorName());
					reList.add(reMap);
				}
			}
			pm.setRows(reList);
			pm.setItems(reList);
			pm.setTotal(pm2.getTotal());
			pm.setTotalCount(pm2.getTotalCount());
//			AgInformationInfo x = new AgInformationInfo();
//			List<AgInformationInfo> list = agInformationInfoDao.getListByAgInformationInfo(x);
//			for(AgInformationInfo info : list){
//				Map<String, Object> dataMap = new HashMap<String,Object>();
//				dataMap.put("title", info.getTitle()!=null?info.getTitle():"");
//				dataMap.put("author", info.getAuthor()!=null?info.getAuthor():"");
//				dataMap.put("content", info.getContent()!=null?info.getContent():"");
//				if(info.getCreateDate()!=null)
//					dataMap.put("createDate", sdf.format(info.getCreateDate()));
//				else
//					dataMap.put("createDate", sdf.format(new Date()));
//				Configuration configuration = new Configuration();
//				configuration.setDefaultEncoding("UTF-8");
//				// 设置模本装置方法和路径,FreeMarker支持多种模板装载方法。可以servlet，classpath，数据库装载，
//				// 这里我们的模板是放在org.cnzjw.template包下面
//				configuration.setClassForTemplateLoading(this.getClass(),
//						"/ftl");
//				Template t = configuration.getTemplate("template.ftl");
//				// 输出文档路径及名称
//				Calendar now = Calendar.getInstance();
//				long l = now.getTimeInMillis();
//				String tmpPath = SystemContext.updown_File_path+CommonUtil.HTML_PATH;//获得工程运行web的目录
//				File file = new File(tmpPath);
//				if(!file.exists()) {
//					file.mkdirs();
//				}
//		        String realPath =tmpPath+ info.getAiiId()+ ".html";
//				File outFile = new File(realPath);
//				Writer out = null;
//				out = new BufferedWriter(new OutputStreamWriter(
//						new FileOutputStream(outFile),"UTF-8"));
//				t.process(dataMap, out);
//				out.close();
//			}
		} catch (Exception e) {
			e.printStackTrace(); 
		}
		return pm;
	}

	@Override
	public List<AgInformationInfo> getAgInformationInfoList(AgInformationInfo att_AgInformationInfo)
			throws HSKException {
		List<AgInformationInfo> reList = new ArrayList<AgInformationInfo>();
		att_AgInformationInfo.setTab_order("aiiId desc");
		try {
			reList = agInformationInfoDao.getListByAgInformationInfo(att_AgInformationInfo);
		} catch (HSKDBException e) {
			e.printStackTrace();
		}
		return reList;
	}

	@Override
	public List<Map<String, Object>> getBannerList(String provId,String cityId) throws HSKException {
		List<Map<String, Object>> list = new ArrayList<Map<String, Object>>();
		List<AgInformationInfo> reList = new ArrayList<AgInformationInfo>();
		try {
			AgInformationInfo att_AgInformationInfo= new AgInformationInfo();
			att_AgInformationInfo.setProvId(provId);
			att_AgInformationInfo.setCityId(cityId);
			att_AgInformationInfo.setIsBanner("1");
			att_AgInformationInfo.setTab_order("aiiId desc");
			att_AgInformationInfo.setStatus("0");
			reList = agInformationInfoDao.getListByAgInformationInfo(att_AgInformationInfo);
			if(reList !=null && reList.size() >0){
				Date now = new Date();
				SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
				for(AgInformationInfo info : reList){
					boolean isAdd=true;
					if(info.getBannerStartDate()!=null && info.getBannerStartDate().after(now))
						isAdd=false;
					if(info.getBannerEndDate()!=null && info.getBannerEndDate().before(now))
						isAdd=false;
					if(isAdd){
						Map<String, Object> reMap = new HashMap<String,Object>();
						reMap.put("icon", info.getIcon());
						reMap.put("url", info.getUrl());
						reMap.put("type", 0);
						reMap.put("params", "");
						if(info.getBannerStartDate()!=null)
							reMap.put("startDate", sdf.format(info.getBannerStartDate()));
						else
							reMap.put("startDate", "");
						if(info.getBannerEndDate()!=null)
							reMap.put("endDate", sdf.format(info.getBannerEndDate()));
						else
							reMap.put("endDate", "");
						reMap.put("hasShare", 0);
						reMap.put("shareUrl","");
						reMap.put("bannerIcon", info.getBannerIcon());
						reMap.put("shareTitle", "");
						reMap.put("shareContent", "");
						reMap.put("from", info.getCreatorName());
						list.add(reMap);
					}
				}
			}
		} catch (HSKDBException e) {
			e.printStackTrace();
		}
		return list;
	} 
	 
}