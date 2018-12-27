package com.hsk.angeldoctor.web.order.service.imp;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hsk.angeldoctor.api.daobbase.IAgDealInfoDao;
import com.hsk.angeldoctor.api.daobbase.IAgDepositInfoDao;
import com.hsk.angeldoctor.api.daobbase.IAgDoctorInfoDao;
import com.hsk.angeldoctor.api.daobbase.IAgIntegralInfoDao;
import com.hsk.angeldoctor.api.daobbase.IAgMaidInfoDao;
import com.hsk.angeldoctor.api.daobbase.IAgMoneyCountDao;
import com.hsk.angeldoctor.api.daobbase.IAgWithdrawInfoDao;
import com.hsk.angeldoctor.api.persistence.AgBusinessView;
import com.hsk.angeldoctor.api.persistence.AgDealCountView;
import com.hsk.angeldoctor.api.persistence.AgDealInfo;
import com.hsk.angeldoctor.api.persistence.AgDoctorInfo;
import com.hsk.angeldoctor.api.persistence.AgHospitalView;
import com.hsk.angeldoctor.api.persistence.AgIntegralInfo;
import com.hsk.angeldoctor.api.persistence.AgMaidInfo;
import com.hsk.angeldoctor.api.persistence.AgMoneyCount;
import com.hsk.angeldoctor.api.persistence.AgOrderView;
import com.hsk.angeldoctor.api.persistence.AgPatientView;
import com.hsk.angeldoctor.api.persistence.AgWithdrawInfo;
import com.hsk.angeldoctor.api.persistence.AgWithdrawMaidInfo;
import com.hsk.angeldoctor.web.finance.controller.AgentCount;
import com.hsk.angeldoctor.web.order.service.IAgMoneyCountService;
import com.hsk.exception.HSKDBException;
import com.hsk.exception.HSKException;
import com.hsk.supper.dto.comm.PagerModel;
import com.hsk.supper.dto.comm.SysRetrunMessage;
import com.hsk.xframe.api.persistence.SysUserInfo;
import com.hsk.xframe.api.service.imp.DSTService;
import com.hsk.xframe.api.utils.freeMarker.DoubleAndBigDecimal;


/** 
  order业务操作实现类 
 * @author  作者:admin
 * @version  版本信息:v1.0   创建时间: 2018-08-14 13:35:36
 */
 
@Service
public class  AgMoneyCountService extends DSTService implements IAgMoneyCountService {	
   /**
   *业务处理dao类  agMoneyCountDao 
   */
	@Autowired
	protected IAgMoneyCountDao agMoneyCountDao;
	@Autowired
	protected IAgMaidInfoDao agMaidInfoDao;
	@Autowired
	protected IAgIntegralInfoDao agIntegralInfoDao;
	@Autowired
	protected IAgWithdrawInfoDao agWithdrawInfoDao;
	@Autowired
	private IAgDepositInfoDao agDepositInfoDao;
	@Autowired
	protected IAgDoctorInfoDao agDoctorInfoDao;
	@Autowired
	private IAgDealInfoDao agDealInfoDao;

 /**
	 * 根据ag_money_count表主键删除AgMoneyCount对象记录
     * @param  amcId  Integer类型(ag_money_count表主键)
	 * @return SysRetrunMessage 对象记录
	 * @throws HSKException
	 */

	public SysRetrunMessage findFormObject(Integer amcId) throws HSKException{
	        SysRetrunMessage srm=new SysRetrunMessage(1l);
			  	
			try{
		   			AgMoneyCount     att_AgMoneyCount= agMoneyCountDao.findAgMoneyCountById( amcId) ;
					srm.setObj(att_AgMoneyCount);
				} catch (HSKDBException e) {
					e.printStackTrace(); 
					srm.setCode(0l);
					srm.setMeg(e.getMessage()); 
				}
				 return srm ;
	} 

    /**
	 * 根据ag_money_count表主键删除AgMoneyCount对象记录
     * @param  amcId  Integer类型(ag_money_count表主键)
	 * @throws HSKException
	 */

	public AgMoneyCount findObject(Integer amcId) throws HSKException{
			AgMoneyCount  att_AgMoneyCount=new AgMoneyCount();		
			try{
		        att_AgMoneyCount= agMoneyCountDao.findAgMoneyCountById( amcId) ;
				} catch (HSKDBException e) {
					e.printStackTrace(); 
					throw new  HSKException(e);
				}
				return  att_AgMoneyCount;
	}
	
	 
	 /**
	 * 根据ag_money_count表主键删除AgMoneyCount对象记录
     * @param  amcId  Integer类型(ag_money_count表主键)
     * @return SysRetrunMessage 对象记录
	 * @throws HSKException
	 */
	public SysRetrunMessage deleteObject(Integer amcId) throws HSKException{  
		    SysRetrunMessage srm=new SysRetrunMessage(1l);
		   try{ 
				agMoneyCountDao.deleteAgMoneyCountById(amcId);
			 } catch (Exception e) {
					e.printStackTrace(); 
					throw new  HSKException(e);
		     }
		   return srm;  
	}
	
	/**
	 * 根据ag_money_count表主键删除多条AgMoneyCount对象记录
     * @param  AmcIds  Integer类型(ag_money_count表主键)
     * @return SysRetrunMessage 对象记录
	 * @throws HSKException
	 */
	public SysRetrunMessage deleteAllObject(String amcIds) throws HSKException{
		SysRetrunMessage srm = new SysRetrunMessage(1l);
		try {
			String[] ids = amcIds.split(",");
			for (String did : ids) {
				if (did != null && !"".equals(did.trim())) {
					agMoneyCountDao.deleteAgMoneyCountById(Integer
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
	 * 新增或修改ag_money_count表记录 ,如果ag_money_count表主键AgMoneyCount.AmcId为空就是添加，如果非空就是修改
     * @param  att_AgMoneyCount  AgMoneyCount类型(ag_money_count表记录)
     * @return AgMoneyCount  修改后的AgMoneyCount对象记录
	 * @throws HSKDBException
	 */
	public SysRetrunMessage saveOrUpdateObject( AgMoneyCount att_AgMoneyCount) throws HSKException{
			 SysRetrunMessage srm = new SysRetrunMessage(1l);
			  try{
					agMoneyCountDao.saveOrUpdateAgMoneyCount(att_AgMoneyCount); 
					srm.setObj(att_AgMoneyCount);
			    } catch (Exception e) {
					e.printStackTrace(); 
					throw new HSKException(e);
		        }
			return srm;	  
	}
	
	 
	/**
	 *根据AgMoneyCount对象作为对(ag_money_count表进行查询，获取分页对象
     * @param  att_AgMoneyCount  AgMoneyCount类型(ag_money_count表记录)
     * @return PagerModel  分页对象
	 * @throws HSKException 
	 */
	public PagerModel getPagerModelObject (AgMoneyCount att_AgMoneyCount) throws HSKException{
		PagerModel pm=new PagerModel(new ArrayList<AgMoneyCount>());
			  try{
					pm=agMoneyCountDao.getPagerModelByAgMoneyCount(att_AgMoneyCount);
			    } catch (Exception e) {
					e.printStackTrace(); 
		        }
		return pm;
	}

	@Override
	public SysRetrunMessage findCountObject(AgMoneyCount amc)
			throws HSKException {
		 SysRetrunMessage srm = new SysRetrunMessage(1l);
		  try{
			Map<String,Object> reMap = new HashMap<String,Object>();
			List<AgMoneyCount> list_obj=  agMoneyCountDao.getListByAgMoneyCount(amc);
				if(list_obj!=null&&list_obj.size()>0){
					reMap.put("shareAmount", list_obj.get(0).getTotalShare());
					reMap.put("remainingAmount", list_obj.get(0).getMoneyCount());
					
				}else{
					reMap.put("shareAmount", 0);
					reMap.put("remainingAmount", 0);
					
				}
				srm.setObj(reMap);
		    } catch (Exception e) {
				e.printStackTrace(); 
				throw new HSKException(e);
	        }
		return srm;	  
	}

	 
	public PagerModel getPagerModelAgHospitalView(
			AgHospitalView att_AgHospitalView) throws HSKException {
		PagerModel pm=new PagerModel(new ArrayList<AgHospitalView>());
		  try{
				pm=agMoneyCountDao.getPagerModelByAgHospitalView(att_AgHospitalView);
		    } catch (Exception e) {
				e.printStackTrace(); 
	        }
	return pm;
	}

	@Override
	public PagerModel getPagerModelAgBusinessView(
			AgBusinessView att_AgBusinessView) throws HSKException {
		PagerModel pm=new PagerModel(new ArrayList<AgBusinessView>());
		  try{
			  	if(this.getUserType()==4){
			  		att_AgBusinessView.setAaiId(this.GetOneSessionAccount().getSroleId());
			  		att_AgBusinessView.setIsHasPatient("1");
			  	}
			  		
				pm=agMoneyCountDao.getPagerModelByAgBusinessView(att_AgBusinessView);
				if(pm != null && pm.getItems().size() >0){
					for(Object obj : pm.getItems()){
						AgBusinessView view = (AgBusinessView) obj;
						if(view.getName()==null || view.getName().trim().equals(""))
							view.setName(view.getMobile());
					}
					pm.setRows(pm.getItems());
				}
		    } catch (Exception e) {
				e.printStackTrace(); 
	        }
	return pm;
	}

	 
	public PagerModel getPagerModelAgPatientView(AgPatientView att_AgPatientView)
			throws HSKException {
		PagerModel pm=new PagerModel(new ArrayList<AgPatientView>());
		  try{
				pm=agMoneyCountDao.getPagerModelByAgPatientView(att_AgPatientView);
		    } catch (Exception e) {
				e.printStackTrace(); 
	        }
	return pm;
	} 
	
	
	public AgentCount getPagerModelAgentCount(AgentCount att_AgentCount)
			throws HSKException {
		PagerModel pm=new PagerModel(new ArrayList<AgentCount>());
		AgentCount ac=new AgentCount();
		  try{
//				pm=agMoneyCountDao.getPagerModelByAgPatientView(att_AgPatientView);
			  
			  AgDealCountView amc=new AgDealCountView();
			 // List<AgMoneyCount> list_obj=  agMoneyCountDao.getListByAgMoneyCount(amc);
			  
			  
			  
			  //查询代理商账号信息
		    } catch (Exception e) {
				e.printStackTrace(); 
	        }
	    return ac;
	}

	 
	public List<Map<String,Object>> getListPatientBill(Integer id) throws HSKException {
		AgWithdrawMaidInfo att_AgWithdrawMaidInfo =new AgWithdrawMaidInfo ();
	 
		att_AgWithdrawMaidInfo.setId(id);
		List<Map<String,Object>> list_back=new ArrayList<Map<String,Object>>();
		try {
			List<Map<String,Object>> list = agMoneyCountDao.getPaitentBillList(id);
			if(list !=null && list.size() >0){
				boolean isTx=false;
				boolean isBt=false;
				for(Map<String,Object> m1 : list){
					Map<String,Object> map = new HashMap<String,Object>();
					if(m1.get("type").toString().equals("1")){//就医补贴
						map.put("transactionId", m1.get("transactionId"));//补贴ID
						map.put("shareAgentAmount", m1.get("shareAgentAmount"));
					}else if(m1.get("type").toString().equals("2")){//提现
						map.put("withdrawId", m1.get("transactionId"));//补贴ID
						map.put("withdrawAmount", m1.get("shareAgentAmount"));
						map.put("withdrawStatus", m1.get("busstatus"));
					}
					map.put("type", m1.get("type"));
					map.put("createDate", m1.get("createDate"));
					
					if( m1.get("type").toString().equals("1") && !isBt){
						map.put("isFirstAgent", "0");
						isBt=true;
					}else if( m1.get("type").toString().equals("1") && isBt){
						map.put("isFirstAgent", "1");
					}
					
					if( m1.get("type").toString().equals("2") && !isTx){
						map.put("isAgentWithdraw", "0");
						isTx=true;
					}else if( m1.get("type").toString().equals("2") && isTx){
						map.put("isAgentWithdraw", "1");
					}
					list_back.add(map);
				}
			}
		} catch (HSKDBException e) { 
			e.printStackTrace();
		}
 
		return list_back;
	} 
	
	public List<Map<String,Object>> getListAgentBill(Integer id) throws HSKException {
		AgWithdrawMaidInfo att_AgWithdrawMaidInfo =new AgWithdrawMaidInfo ();
	 
		att_AgWithdrawMaidInfo.setId(id);
		List<Map<String,Object>> list_back=new ArrayList<Map<String,Object>>();
		try {
			List<Map<String,Object>> list = agMoneyCountDao.getAgentBillList(id);
			if(list !=null && list.size() >0){
				boolean isTx=false;
				boolean isBt=false;
				for(Map<String,Object> m1 : list){
					Map<String,Object> map = new HashMap<String,Object>();
					map.put("transactionId", m1.get("transactionId"));
					map.put("type", m1.get("type"));
					map.put("createDate", m1.get("createDate"));
					
					if( m1.get("type").toString().equals("1") && !isBt){
						map.put("isFirstAgent", "0");
						map.put("shareAgentAmount", m1.get("shareAgentAmount"));
						isBt=true;
					}else if( m1.get("type").toString().equals("1") && isBt){
						map.put("isFirstAgent", "1");
						map.put("shareAgentAmount", m1.get("shareAgentAmount"));
					}
					
					if( m1.get("type").toString().equals("2") && !isTx){
						map.put("isAgentWithdraw", "0");
						map.put("withDrawAmount", m1.get("shareAgentAmount"));
						isTx=true;
					}else if( m1.get("type").toString().equals("2") && isTx){
						map.put("isAgentWithdraw", "1");
						map.put("withDrawAmount", m1.get("shareAgentAmount"));
					}
					list_back.add(map);
				}
			}
		} catch (HSKDBException e) { 
			e.printStackTrace();
		}
 
		return list_back;
	} 
	
	public  AgWithdrawMaidInfo  getOneAgentBill(AgWithdrawMaidInfo att_AgWithdrawMaidInfo) throws HSKException {
		  
	 
		try {
			return  agMoneyCountDao.getOneWMInfo(att_AgWithdrawMaidInfo);
		} catch (HSKDBException e) { 
			e.printStackTrace();
		} 
		return null;
	}

	@Override
	public AgMoneyCount getAgMoneyCount(AgMoneyCount att_AgMoneyCount) throws HSKException {
		AgMoneyCount reAgMoneyCount = new AgMoneyCount();
		try {
			List<AgMoneyCount> reList = agMoneyCountDao.getListByAgMoneyCount(att_AgMoneyCount);
			if(reList!= null && reList.size() >0)
				return reList.get(0);
		} catch (HSKDBException e) {
			e.printStackTrace();
		}
		return reAgMoneyCount;
	}

	@Override
	public Map<String, Object> getSubsidyInfo(Integer id) throws HSKException {
		Map<String, Object> reMap = new HashMap<String,Object>();
		try {
			SimpleDateFormat sdf1= new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
			SimpleDateFormat sdf2= new SimpleDateFormat("yyyy-MM-dd");
			SysUserInfo sysUserInfo = this.GetOneSessionAccount();
			AgMaidInfo agMaidInfo = agMaidInfoDao.findAgMaidInfoById(id);
			AgOrderView agOrderView = new AgOrderView();
			Double shareAgentAmount=0d;
			agOrderView.setAoiId(agMaidInfo.getAoiId());
			agOrderView=(AgOrderView) this.getOne(agOrderView);
			reMap.put("id", agMaidInfo.getAdiId());
			reMap.put("serialNumber", agMaidInfo.getSerialNumber());
			reMap.put("createDate", sdf1.format(agMaidInfo.getCreateDate()));
			shareAgentAmount = agMaidInfo.getSharePatientAmount();
			reMap.put("organizationName", agOrderView.getOrganizationName());
			reMap.put("agentMobile", agOrderView.getAgentMobile());
			reMap.put("agentName", agOrderView.getAgentName());
			reMap.put("patientName", agOrderView.getPatientName());
			reMap.put("registerDate", sdf2.format(agOrderView.getRegisterDate()));
			reMap.put("shiftPeriod", agOrderView.getShiftPeriod());
			if(agMaidInfo.getShareFirstAgentId()!=null && agMaidInfo.getShareFirstAgentId().equals(sysUserInfo.getSroleId()))
				shareAgentAmount=agMaidInfo.getShareFirstAgentAmount();
			else if(agMaidInfo.getShareSecondAgentId()!=null && agMaidInfo.getShareSecondAgentId().equals(sysUserInfo.getSroleId()))
				shareAgentAmount=agMaidInfo.getShareSecondAgentAmount();
			reMap.put("shareAgentAmount", shareAgentAmount);
		} catch (HSKDBException e) {
			e.printStackTrace();
		}
		return reMap;
	}

	@Override
	public SysRetrunMessage getIntegrationInfo(Integer suiId, String userType) throws HSKException {
		SysRetrunMessage srm = new SysRetrunMessage(1l);
		try {
			Map<String,Object> reMap = new HashMap<String,Object>();
			Integer currentRanking=0;
			Integer previousRanking=0;
			Integer totalAccumulatePoints=0;
			List<Map<String,Object>> reList = new ArrayList<Map<String,Object>>();
			String amcType="";
			if(userType.equals("2"))
				amcType="4";
			else if(userType.equals("1"))
				amcType="3";
			AgMoneyCount ac=agMoneyCountDao.getAgMoneyCountByUserId(suiId, amcType);
			if(ac!=null && ac.getAmcId()!=null){
				previousRanking=ac.getPreviousRanking();
				totalAccumulatePoints = ac.getIntegralCount();
				AgIntegralInfo att_AgIntegralInfo=new AgIntegralInfo();
				att_AgIntegralInfo.setSuiId(suiId);
				att_AgIntegralInfo.setUserType(userType);
				att_AgIntegralInfo.setStatus("0");
				att_AgIntegralInfo.setTab_like("createDate desc");
				List<AgIntegralInfo> list = agIntegralInfoDao.getListByAgIntegralInfo(att_AgIntegralInfo);
				List<Map<String,Object>> rankingList = agMoneyCountDao.getIntegralRanking();
				if(rankingList !=null && rankingList.size() >0){
					int i=0;
					for(Map<String,Object> ranking : rankingList){
						i++;
						if(ranking.get("integral_count").toString().equals(ac.getIntegralCount().toString()))
							break;
					}
					currentRanking=i;
				}
				if(list !=null && list.size() >0){
					SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
					for(AgIntegralInfo integralInfo : list){
						Map<String,Object> xMap = new HashMap<String,Object>();
						Integer serieType=0;
						Integer goodsAccumulatePointValue=0;
						Integer accumulatePointValue=0;
						Integer type=Integer.parseInt(integralInfo.getSource());
						String createDate = sdf.format(integralInfo.getCreateDate());
						if(integralInfo.getSource().equals("6")){//消费
							serieType=1;
							goodsAccumulatePointValue=integralInfo.getCount();
						}else{//获得积分
							accumulatePointValue=integralInfo.getCount();
						}
						xMap.put("serieType", serieType);
						xMap.put("type", type);
						xMap.put("createDate", createDate);
						xMap.put("goodsAccumulatePointValue", goodsAccumulatePointValue);
						xMap.put("accumulatePointValue", accumulatePointValue);
						reList.add(xMap);
					}
				}
				
			}
			reMap.put("currentRanking", currentRanking);
			reMap.put("previousRanking", previousRanking);
			reMap.put("totalAccumulatePoints", totalAccumulatePoints);
			reMap.put("dataList", reList);
			srm.setObj(reMap);
		}catch (HSKDBException e) {
			e.printStackTrace();
		}
		return srm;
	}

	@Override
	public SysRetrunMessage getAgentCount(Integer suiId) throws HSKException {
		SysRetrunMessage srm = new SysRetrunMessage(1l);
		try {
			Map<String,Object> reMap = new HashMap<String,Object>();
			Double remainingAmount=0d;//账户余额
			Double shareAmount=0d;//累计收入
			Double withdrawAmount=0d;//累计提现
			boolean hasPendingWithdraw=false;
			AgMoneyCount ac=agMoneyCountDao.getAgMoneyCountByUserId(suiId, "2");
			if(ac !=null && ac.getAmcId()!=null){
				remainingAmount=ac.getMoneyCount();
				shareAmount = ac.getTotalShare();
				withdrawAmount=ac.getWithdrawCount();
			}
			AgWithdrawInfo att_AgWithdrawInfo=new AgWithdrawInfo ();
			att_AgWithdrawInfo.setAwiUserId(suiId);
			att_AgWithdrawInfo.setWithdrawStatus("0,1");
			att_AgWithdrawInfo.setWithdrawType("3");
			List<AgWithdrawInfo> list_obj=agWithdrawInfoDao.getListByAgWithdrawInfo(att_AgWithdrawInfo);
			if(list_obj!=null && list_obj.size() >0)
				hasPendingWithdraw=true;
			reMap.put("remainingAmount", remainingAmount);
			reMap.put("shareAmount", shareAmount);
			reMap.put("withdrawAmount", withdrawAmount);
			reMap.put("hasPendingWithdraw", hasPendingWithdraw);
			srm.setObj(reMap);
		}catch (HSKDBException e) {
			e.printStackTrace();
		}
		return srm;
	}

	@Override
	public SysRetrunMessage getTranCount() throws HSKException {
		SysRetrunMessage srm = new SysRetrunMessage(1l);
		try {
			Map<String,Object> reMap = new HashMap<String,Object>();
			double totalAmount=0d;//账户总额
			double depositAmount=0d;//累计充值
			double withdrawAmount=0d;//累计提现
			depositAmount = agDepositInfoDao.countDepositMoney(null);
			withdrawAmount=agWithdrawInfoDao.countAgWithdrawInfoMoney();
			totalAmount=depositAmount-withdrawAmount;
			reMap.put("totalAmount", totalAmount);
			reMap.put("depositAmount", depositAmount);
			reMap.put("withdrawAmount", withdrawAmount);
			srm.setObj(reMap);
		}catch (HSKDBException e) {
			e.printStackTrace();
		}
		return srm;
	}

	@Override
	public SysRetrunMessage getHosCount() throws HSKException {
		SysRetrunMessage srm = new SysRetrunMessage(1l);
		try {
			Map<String,Object> reMap = new HashMap<String,Object>();
			double totalAmount=0d;//账户余额
			double shareAmount=0d;//应收
			double depositAmount=0d;//充值
			double receptionAmount=0d;//接洽费
			double freeAmount=0d;//应付
			Integer organizationId=null;
			if(this.getUserType()==2)//如果是医院管理员登录
				organizationId=this.GetOneSessionAccount().getSroleId();
		  	else if(this.getUserType()==3){//如果是医生登录
				AgDoctorInfo loginDoc= agDoctorInfoDao.findAgDoctorInfoById(this.GetOneSessionAccount().getSroleId());
				organizationId=loginDoc.getOrganizationId();
			}// agDealInfoDao
			depositAmount = agDepositInfoDao.countDepositMoney(organizationId);
			Map<String,Object> countMap = agMaidInfoDao.getHosCountMap(organizationId);
			if(countMap!=null && countMap.containsKey("shareAmount"))
				shareAmount=Double.parseDouble(countMap.get("shareAmount").toString());
			if(countMap!=null && countMap.containsKey("receptionAmount"))
				receptionAmount=Double.parseDouble(countMap.get("receptionAmount").toString());
			if(countMap!=null && countMap.containsKey("freeAmount"))
				freeAmount=Double.parseDouble(countMap.get("freeAmount").toString());
			totalAmount=depositAmount-freeAmount;
			reMap.put("totalAmount", totalAmount);
			reMap.put("shareAmount", shareAmount);
			reMap.put("depositAmount", depositAmount);
			reMap.put("receptionAmount", receptionAmount);
			reMap.put("freeAmount", freeAmount);
			srm.setObj(reMap);
		}catch (HSKDBException e) {
			e.printStackTrace();
		}
		return srm;
	} 
	 
}