package com.hsk.angeldoctor.web.agent.service.imp;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hsk.angeldoctor.api.daobbase.IAgAgentInfoDao;
import com.hsk.angeldoctor.api.daobbase.IAgBusinessUserDao;
import com.hsk.angeldoctor.api.daobbase.IAgMaidInfoDao;
import com.hsk.angeldoctor.api.daobbase.IAgMoneyCountDao;
import com.hsk.angeldoctor.api.daobbase.IAgPatientInfoDao;
import com.hsk.angeldoctor.api.daobbase.IAgWithdrawInfoDao;
import com.hsk.angeldoctor.api.daobbase.IAgWithdrawMaidGxDao;
import com.hsk.angeldoctor.api.persistence.AgAgentInfo;
import com.hsk.angeldoctor.api.persistence.AgBusinessUser;
import com.hsk.angeldoctor.api.persistence.AgMaidInfo;
import com.hsk.angeldoctor.api.persistence.AgMoneyCount;
import com.hsk.angeldoctor.api.persistence.AgPatientInfo;
import com.hsk.angeldoctor.api.persistence.AgWithdrawInfo;
import com.hsk.angeldoctor.api.persistence.AgWithdrawMaidGx;
import com.hsk.angeldoctor.web.agent.service.IAgWithdrawInfoService;
import com.hsk.exception.HSKDBException;
import com.hsk.exception.HSKException;
import com.hsk.supper.dto.comm.PagerModel;
import com.hsk.supper.dto.comm.SysRetrunMessage;
import com.hsk.xframe.api.service.imp.DSTService;
import com.hsk.xframe.api.utils.freeMarker.CreateCodeUtil;


/** 
  agent业务操作实现类 
 * @author  作者:admin
 * @version  版本信息:v1.0   创建时间: 2018-08-14 13:31:12
 */
 
@Service
public class  AgWithdrawInfoService extends DSTService implements IAgWithdrawInfoService {	
   /**
   *业务处理dao类  agWithdrawInfoDao 
   */
	@Autowired
	protected IAgWithdrawInfoDao agWithdrawInfoDao;
/**
 * 提现分佣信息关系表
 */
	@Autowired
	private IAgWithdrawMaidGxDao agWithdrawMaidGxDao;
	/**
	 * 分佣信息表
	 */
	@Autowired
	private IAgMaidInfoDao agMaidInfoDao;
	
	
	@Autowired
	private IAgBusinessUserDao agBusinessUserDao;
	@Autowired
	private IAgAgentInfoDao agAgentInfoDao;
	/**
	 * 患者业务表
	 */
	@Autowired
	private IAgPatientInfoDao agPatientInfoDao;
	@Autowired
	protected IAgMoneyCountDao agMoneyCountDao;
	 
 /**
	 * 根据ag_withdraw_info表主键删除AgWithdrawInfo对象记录
     * @param  awiId  Integer类型(ag_withdraw_info表主键)
	 * @return SysRetrunMessage 对象记录
	 * @throws HSKException
	 */

	public SysRetrunMessage findFormObject(Integer awiId) throws HSKException{
	        SysRetrunMessage srm=new SysRetrunMessage(1l);
			  	
			try{
		   			AgWithdrawInfo     att_AgWithdrawInfo= agWithdrawInfoDao.findAgWithdrawInfoById( awiId) ;
					srm.setObj(att_AgWithdrawInfo);
				} catch (HSKDBException e) {
					e.printStackTrace(); 
					srm.setCode(0l);
					srm.setMeg(e.getMessage()); 
				}
				 return srm ;
	} 

    /**
	 * 根据ag_withdraw_info表主键删除AgWithdrawInfo对象记录
     * @param  awiId  Integer类型(ag_withdraw_info表主键)
	 * @throws HSKException
	 */

	public AgWithdrawInfo findObject(Integer awiId) throws HSKException{
			AgWithdrawInfo  att_AgWithdrawInfo=new AgWithdrawInfo();		
			try{
		        att_AgWithdrawInfo= agWithdrawInfoDao.findAgWithdrawInfoById( awiId) ;
				} catch (HSKDBException e) {
					e.printStackTrace(); 
					throw new  HSKException(e);
				}
				return  att_AgWithdrawInfo;
	}
	
	 
	 /**
	 * 根据ag_withdraw_info表主键删除AgWithdrawInfo对象记录
     * @param  awiId  Integer类型(ag_withdraw_info表主键)
     * @return SysRetrunMessage 对象记录
	 * @throws HSKException
	 */
	public SysRetrunMessage deleteObject(Integer awiId) throws HSKException{  
		    SysRetrunMessage srm=new SysRetrunMessage(1l);
		   try{ 
				agWithdrawInfoDao.deleteAgWithdrawInfoById(awiId);
			 } catch (Exception e) {
					e.printStackTrace(); 
					throw new  HSKException(e);
		     }
		   return srm;  
	}
	
	/**
	 * 根据ag_withdraw_info表主键删除多条AgWithdrawInfo对象记录
     * @param  AwiIds  Integer类型(ag_withdraw_info表主键)
     * @return SysRetrunMessage 对象记录
	 * @throws HSKException
	 */
	public SysRetrunMessage deleteAllObject(String awiIds) throws HSKException{
		SysRetrunMessage srm = new SysRetrunMessage(1l);
		try {
			String[] ids = awiIds.split(",");
			for (String did : ids) {
				if (did != null && !"".equals(did.trim())) {
					agWithdrawInfoDao.deleteAgWithdrawInfoById(Integer
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
	 * 新增或修改ag_withdraw_info表记录 ,如果ag_withdraw_info表主键AgWithdrawInfo.AwiId为空就是添加，如果非空就是修改
     * @param  att_AgWithdrawInfo  AgWithdrawInfo类型(ag_withdraw_info表记录)
     * @return AgWithdrawInfo  修改后的AgWithdrawInfo对象记录
	 * @throws HSKDBException
	 */
	public SysRetrunMessage saveOrUpdateObject( AgWithdrawInfo att_AgWithdrawInfo) throws HSKException{
			 SysRetrunMessage srm = new SysRetrunMessage(1l);
			  try{
					agWithdrawInfoDao.saveOrUpdateAgWithdrawInfo(att_AgWithdrawInfo); 
					srm.setObj(att_AgWithdrawInfo);
			    } catch (Exception e) {
					e.printStackTrace(); 
					throw new HSKException(e);
		        }
			return srm;	  
	}
	
	 
	/**
	 *根据AgWithdrawInfo对象作为对(ag_withdraw_info表进行查询，获取分页对象
     * @param  att_AgWithdrawInfo  AgWithdrawInfo类型(ag_withdraw_info表记录)
     * @return PagerModel  分页对象
	 * @throws HSKException 
	 */
	public PagerModel getPagerModelObject (AgWithdrawInfo att_AgWithdrawInfo) throws HSKException{
		PagerModel pm=new PagerModel(new ArrayList<AgWithdrawInfo>());
			  try{
				  	if(this.getUserType()!=null && this.getUserType()==4){//如果当前登陆用户为代理商
				  		att_AgWithdrawInfo.setAwiUserId(this.GetOneSessionAccount().getSroleId());
				  		att_AgWithdrawInfo.setWithdrawType("3");
				  	}
				  	att_AgWithdrawInfo.setTab_order("awiId desc");
					pm=agWithdrawInfoDao.getPagerModelByAgWithdrawInfo(att_AgWithdrawInfo);
			    } catch (Exception e) {
					e.printStackTrace(); 
		        }
		return pm;
	}

	@Override
	public SysRetrunMessage getIfWithdrawInfo(AgWithdrawInfo att_AgWithdrawInfo)
			throws HSKException {
		SysRetrunMessage srm=new SysRetrunMessage(1l);
		try {
			List<AgWithdrawInfo> list_obj=agWithdrawInfoDao.getListByAgWithdrawInfo(att_AgWithdrawInfo);
			Map<String,String> map_back=new HashMap<String,String>();
			if(list_obj!=null&&list_obj.size()>0){
				map_back.put("disableWithdraw", "true");
				map_back.put("withdrawStatus", list_obj.get(0).getWithdrawStatus());
			} else {
				map_back.put("disableWithdraw", "false");
			}
			srm.setObj(map_back);
		} catch (HSKDBException e) {
			e.printStackTrace();
		}
		return srm;
	}

	 
	public SysRetrunMessage saveOrUpdateAdopt(AgWithdrawInfo att_AgWithdrawInfo)
			throws HSKException {
		SysRetrunMessage srm = new SysRetrunMessage(1l);
		try {
			if ("1".equals(att_AgWithdrawInfo.getRunType())) {
				att_AgWithdrawInfo.setCheckStatus("1");
				att_AgWithdrawInfo.setWithdrawStatus("1");
			}
			if ("2".equals(att_AgWithdrawInfo.getRunType())) {//驳回需要将所有的关联恢复
				att_AgWithdrawInfo.setCheckStatus("2");
				att_AgWithdrawInfo.setWithdrawStatus("2");
				att_AgWithdrawInfo.setCheckFailureReason(att_AgWithdrawInfo
						.getRunReason());
				AgMaidInfo att_AgMaidInfo = new AgMaidInfo();
				AgMoneyCount agMoneyCount = new AgMoneyCount();
				agMoneyCount.setSuiId(att_AgWithdrawInfo.getAwiUserId());
				
				if(att_AgWithdrawInfo.getWithdrawType().equals("2")){
					//业务员
					AgBusinessUser abu= agBusinessUserDao.findAgBusinessUserById(att_AgWithdrawInfo.getAwiUserId());
					agMoneyCount.setAmcType("3");
					if(abu.getParentAgentId()!=null){
						att_AgMaidInfo.setSecondAgentWithdrawId(att_AgWithdrawInfo.getAwiId());
					}else
						att_AgMaidInfo.setFirstAgentWithdrawId(att_AgWithdrawInfo.getAwiId());
				}else if(att_AgWithdrawInfo.getWithdrawType().equals("3")){
					att_AgMaidInfo.setTopReservedAgentWithdrawId(att_AgWithdrawInfo.getAwiId());
					agMoneyCount.setAmcType("2");
				}else if(att_AgWithdrawInfo.getWithdrawType().equals("4")){
					att_AgMaidInfo.setPatientWithdrawId(att_AgWithdrawInfo.getAwiId());
					agMoneyCount.setAmcType("4");
				}
				List<AgMaidInfo> list_Obj=agMaidInfoDao.getListByAgMaidInfo(att_AgMaidInfo);
				Double withdraw_amount =0d;
				 //添加 提现分佣信息
				if(list_Obj!=null&&list_Obj.size()>0){
					for(AgMaidInfo did:list_Obj){
						//修改分佣信息记录
						 if( att_AgWithdrawInfo.getWithdrawType().equals("2"))  { //业务员
							 did.setIsFirstAgentWithdraw("0");
							 did.setFirstAgentWithdrawId(null); 
							 did.setIsSecondAgentWithdraw("0");
							 did.setSecondAgentWithdrawId(null);
							 withdraw_amount+= did.getShareFirstAgentAmount() !=null? did.getShareFirstAgentAmount():0d;
						 }else if(att_AgWithdrawInfo.getWithdrawType().equals("3"))  { //代理商
							 did.setIsTopReservedAgentWithdraw("0");
							 did.setTopReservedAgentWithdrawId(null);
							 withdraw_amount+= did.getShareTopReservedAgentAmount() !=null? did.getShareTopReservedAgentAmount():0d;
						 }else if( att_AgWithdrawInfo.getWithdrawType().equals("4"))  { 
							 //患者
							 did.setIsPatientWithdraw( "0");
							 did.setPatientWithdrawId(null);
							 withdraw_amount+= did.getSharePatientAmount() !=null? did.getSharePatientAmount():0d;
						 }
						agMaidInfoDao.saveOrUpdateAgMaidInfo(did);
					}
				}
				//设置 金额 
				agMoneyCount.setWithdrawCount(0-withdraw_amount);
				agMoneyCountDao.updateAgMoneyCount(agMoneyCount);
			}
			att_AgWithdrawInfo.setCheckFinishDate(new Date());
			agWithdrawInfoDao.saveOrUpdateAgWithdrawInfo(att_AgWithdrawInfo);

		} catch (HSKDBException e) {
			e.printStackTrace();
			srm.setCode(0l);
			srm.setMeg(e.getMessage());
		}
		return srm;
	}

 
	public SysRetrunMessage saveOrUpdateMakeMoney(
			AgWithdrawInfo att_AgWithdrawInfo) throws HSKException {
		SysRetrunMessage srm = new SysRetrunMessage(1l);
		try {
			if ("3".equals(att_AgWithdrawInfo.getRunType())) {
				att_AgWithdrawInfo.setWithdrawStatus("4");
			}
			if ("4".equals(att_AgWithdrawInfo.getRunType())) {
				att_AgWithdrawInfo.setWithdrawStatus("3");
				att_AgWithdrawInfo.setWithdrawFailureReason(att_AgWithdrawInfo
						.getRunReason());
				AgMaidInfo att_AgMaidInfo = new AgMaidInfo();
				AgMoneyCount agMoneyCount = new AgMoneyCount();
				agMoneyCount.setSuiId(att_AgWithdrawInfo.getAwiUserId());
				
				if(att_AgWithdrawInfo.getWithdrawType().equals("2")){
					//业务员
					AgBusinessUser abu= agBusinessUserDao.findAgBusinessUserById(att_AgWithdrawInfo.getAwiUserId());
					agMoneyCount.setAmcType("3");
					if(abu.getParentAgentId()!=null){
						att_AgMaidInfo.setSecondAgentWithdrawId(att_AgWithdrawInfo.getAwiId());
					}else
						att_AgMaidInfo.setFirstAgentWithdrawId(att_AgWithdrawInfo.getAwiId());
				}else if(att_AgWithdrawInfo.getWithdrawType().equals("3")){
					att_AgMaidInfo.setTopReservedAgentWithdrawId(att_AgWithdrawInfo.getAwiId());
					agMoneyCount.setAmcType("2");
				}else if(att_AgWithdrawInfo.getWithdrawType().equals("4")){
					att_AgMaidInfo.setPatientWithdrawId(att_AgWithdrawInfo.getAwiId());
					agMoneyCount.setAmcType("4");
				}
				List<AgMaidInfo> list_Obj=agMaidInfoDao.getListByAgMaidInfo(att_AgMaidInfo);
				Double withdraw_amount =0d;
				 //添加 提现分佣信息
				if(list_Obj!=null&&list_Obj.size()>0){
					for(AgMaidInfo did:list_Obj){
						//修改分佣信息记录
						 if( att_AgWithdrawInfo.getWithdrawType().equals("2"))  { //业务员
							 did.setIsFirstAgentWithdraw("0");
							 did.setFirstAgentWithdrawId(null); 
							 did.setIsSecondAgentWithdraw("0");
							 did.setSecondAgentWithdrawId(null);
							 withdraw_amount+= did.getShareFirstAgentAmount() !=null? did.getShareFirstAgentAmount():0d;
						 }else if(att_AgWithdrawInfo.getWithdrawType().equals("3"))  { //代理商
							 did.setIsTopReservedAgentWithdraw("0");
							 did.setTopReservedAgentWithdrawId(null);
							 withdraw_amount+= did.getShareTopReservedAgentAmount() !=null? did.getShareTopReservedAgentAmount():0d;
						 }else if( att_AgWithdrawInfo.getWithdrawType().equals("4"))  { 
							 //患者
							 did.setIsPatientWithdraw( "0");
							 did.setPatientWithdrawId(null);
							 withdraw_amount+= did.getSharePatientAmount() !=null? did.getSharePatientAmount():0d;
						 }
						agMaidInfoDao.saveOrUpdateAgMaidInfo(did);
					}
				}
				//设置 金额 
				agMoneyCount.setWithdrawCount(0-withdraw_amount);
				agMoneyCountDao.updateAgMoneyCount(agMoneyCount);
			}
			att_AgWithdrawInfo.setWithdrawFinishDate(new Date());
			agWithdrawInfoDao.saveOrUpdateAgWithdrawInfo(att_AgWithdrawInfo);

		} catch (HSKDBException e) {
			e.printStackTrace();
			srm.setCode(0l);
			srm.setMeg(e.getMessage());
		}
		return srm;
	}

	 
	public SysRetrunMessage saveWithdrawMaid(String runType, AgWithdrawInfo att_AgWithdrawInfo)
			throws HSKException {
		SysRetrunMessage srm = new SysRetrunMessage(1l);
		try {
			
			 //获取未体现分佣信息 记录
			AgMaidInfo att_AgMaidInfo=new AgMaidInfo();
			AgMoneyCount agMoneyCount = new AgMoneyCount();
			agMoneyCount.setSuiId(att_AgWithdrawInfo.getAwiUserId());
			if("1".equals(runType)){
				//获取代理商信息
				AgAgentInfo aai=agAgentInfoDao.findAgAgentInfoById(att_AgWithdrawInfo.getAwiUserId());
//				申请编号
				att_AgWithdrawInfo.setSerialNumber( CreateCodeUtil.getNo("AAI") );
				att_AgWithdrawInfo.setWithdrawType("3");
//				申请类型	 	申请类型:1医院提现申请，2员工提现申请，3供应商提现申请，4患者提现申请	 
//				提现申请金额	withdraw_amount	提现申请金额 
//				申请人姓名	context_name	申请人姓名	varchar(100) 
				if(aai.getName()!=null && !aai.getName().trim().equals(""))
					att_AgWithdrawInfo.setContextName(aai.getName());
				else
					att_AgWithdrawInfo.setContextName(aai.getMobile());
				att_AgWithdrawInfo.setContextName(aai.getName());
//				申请人手机号	context_mobile	申请人手机号	varchar(100) 
				att_AgWithdrawInfo.setContextMobile(aai.getMobile());
//				银行名称	context_bank_name	银行名称	varchar(100) 
				att_AgWithdrawInfo.setContextBankName( aai.getReservedBankName() );
//				银行账户名称	context_account_name	银行账户名称 
				att_AgWithdrawInfo.setContextAccountName(aai.getReservedAccountName());
//				银行账号	context_account_number	银行账号	 
				att_AgWithdrawInfo.setContextAccountNumber(aai.getReservedAccountNumber() );
//				最后一次操作人	last_portal_user_id	最后一次操作人	 
//				att_AgWithdrawInfo.setLastPortalUserId( this.get);
//				打款状态	withdraw_status	打款状态	varchar(32) 
				att_AgWithdrawInfo.setWithdrawStatus("0");
				//审批状态
				att_AgWithdrawInfo.setCheckStatus("0");
//				状态	status	状态:1正常，2禁用	
				att_AgWithdrawInfo.setStatus("0");
				att_AgWithdrawInfo.setTransactionType("4");
				
				
				att_AgMaidInfo.setShareTopReservedAgentid( att_AgWithdrawInfo.getAwiUserId());
				att_AgMaidInfo.setIsTopReservedAgentWithdraw("0");
				agMoneyCount.setAmcType("2");
				
			}else if ("2".equals(runType)){
				//业务员
				AgBusinessUser abu= agBusinessUserDao.findAgBusinessUserById(att_AgWithdrawInfo.getAwiUserId());
//				申请编号
				att_AgWithdrawInfo.setSerialNumber( CreateCodeUtil.getNo("AAI") );
//				申请类型	 	申请类型:0:微信提现;1:app提现;2:医院提现;3:代理商提现;4:患者提现
				att_AgWithdrawInfo.setWithdrawType("2");
//				提现申请金额	withdraw_amount	提现申请金额 
//				申请人姓名	context_name	申请人姓名	varchar(100) 
				if(abu.getName()!=null && !abu.getName().trim().equals(""))
					att_AgWithdrawInfo.setContextName(abu.getName());
				else
					att_AgWithdrawInfo.setContextName(abu.getMobile());
//				申请人手机号	context_mobile	申请人手机号	varchar(100) 
				att_AgWithdrawInfo.setContextMobile(abu.getMobile());
//				银行名称	context_bank_name	银行名称	varchar(100) 
				att_AgWithdrawInfo.setContextBankName( abu.getReservedBankName() );
//				银行账户名称	context_account_name	银行账户名称 
				att_AgWithdrawInfo.setContextAccountName(abu.getReservedAccountName());
//				银行账号	context_account_number	银行账号	 
				att_AgWithdrawInfo.setContextAccountNumber(abu.getReservedAccountNumber() );
//				最后一次操作人	last_portal_user_id	最后一次操作人	 
//				att_AgWithdrawInfo.setLastPortalUserId( this.get);
//				打款状态	withdraw_status	打款状态	varchar(32) 
				att_AgWithdrawInfo.setWithdrawStatus("0");
				//审批状态
				att_AgWithdrawInfo.setCheckStatus("0");
//				状态	status	状态:1正常，2禁用	
				att_AgWithdrawInfo.setStatus("0");
				att_AgWithdrawInfo.setTransactionType("2");
				if(abu!=null&&abu.getParentAgentId()!=null){
					//二级代理商
					runType="3"; 
					att_AgMaidInfo.setIsSecondAgentWithdraw("0"); 
					att_AgMaidInfo.setShareSecondAgentId( att_AgWithdrawInfo.getAwiUserId());
				} else {
					//一级代理商
					att_AgMaidInfo.setIsFirstAgentWithdraw("0");
					att_AgMaidInfo.setShareFirstAgentId( att_AgWithdrawInfo.getAwiUserId());
				}
				agMoneyCount.setAmcType("3");
			}else if ("4".equals(runType)){
				//患者提现
				
				AgPatientInfo api=agPatientInfoDao.findAgPatientInfoById(att_AgWithdrawInfo.getAwiUserId());
//				申请编号
				att_AgWithdrawInfo.setSerialNumber( CreateCodeUtil.getNo("AAI") );
				att_AgWithdrawInfo.setWithdrawType("4");
//				申请类型	 	申请类型:1医院提现申请，2员工提现申请，3供应商提现申请，4患者提现申请	 
//				提现申请金额	withdraw_amount	提现申请金额 
//				申请人姓名	context_name	申请人姓名	varchar(100) 
				if(api.getName()!=null && !api.getName().trim().equals(""))
					att_AgWithdrawInfo.setContextName(api.getName());
				else
					att_AgWithdrawInfo.setContextName(api.getMobile());
				att_AgWithdrawInfo.setContextName(api.getName());
//				申请人手机号	context_mobile	申请人手机号	varchar(100) 
				att_AgWithdrawInfo.setContextMobile(api.getMobile());
//				银行名称	context_bank_name	银行名称	varchar(100) 
				att_AgWithdrawInfo.setContextBankName( api.getBankName() );
//				银行账户名称	context_account_name	银行账户名称 
				att_AgWithdrawInfo.setContextAccountName(api.getBankAccountName());
//				银行账号	context_account_number	银行账号	 
				att_AgWithdrawInfo.setContextAccountNumber(api.getBankAccountNumber() );
//				最后一次操作人	last_portal_user_id	最后一次操作人	 
//				att_AgWithdrawInfo.setLastPortalUserId( this.get);
//				打款状态	withdraw_status	打款状态	varchar(32) 
				att_AgWithdrawInfo.setWithdrawStatus("0");
				//审批状态
				att_AgWithdrawInfo.setCheckStatus("0");
//				状态	status	状态:1正常，2禁用	
				att_AgWithdrawInfo.setStatus("0");
				att_AgWithdrawInfo.setTransactionType("1");
				 
				att_AgMaidInfo.setSharePatientId(att_AgWithdrawInfo.getAwiUserId());
				att_AgMaidInfo.setIsPatientWithdraw("0");
				agMoneyCount.setAmcType("4");
			}
			if(att_AgWithdrawInfo.getContextAccountNumber()==null || att_AgWithdrawInfo.getContextAccountNumber().equals("")){
				srm.setCode(0l);
				srm.setMeg("请先添加银行卡信息！");
				return srm;
			}
			List<AgMaidInfo> list_Obj=agMaidInfoDao.getListByAgMaidInfo(att_AgMaidInfo);
			//添加提现申请记录 
			agWithdrawInfoDao.saveAgWithdrawInfo(att_AgWithdrawInfo);
			Integer ids= att_AgWithdrawInfo.getAwiId();
			Double withdraw_amount =0d;
			 //添加 提现分佣信息
			if(list_Obj!=null&&list_Obj.size()>0){
				for(AgMaidInfo did:list_Obj){
					AgWithdrawMaidGx att_AgWithdrawMaidGx =new AgWithdrawMaidGx ();
					att_AgWithdrawMaidGx.setAmiId( did.getAmiId());
					att_AgWithdrawMaidGx.setAwiId(  ids );
					agWithdrawMaidGxDao.saveAgWithdrawMaidGx(att_AgWithdrawMaidGx); 
					//修改分佣信息记录
					 if("1".equals(runType)){
						 did.setIsTopReservedAgentWithdraw("1");
						 did.setTopReservedAgentWithdrawId(ids);
						 withdraw_amount+= did.getShareTopReservedAgentAmount()!=null? did.getShareTopReservedAgentAmount():0d;
					 }else if( "2".equals(runType))  { 
						 did.setIsFirstAgentWithdraw("1");
						 did.setFirstAgentWithdrawId(ids); 
						 withdraw_amount+= did.getShareFirstAgentAmount() !=null? did.getShareFirstAgentAmount():0d;
					 }else if( "3".equals(runType))  { 
						 did.setIsSecondAgentWithdraw("1");
						 did.setSecondAgentWithdrawId(ids);
						 withdraw_amount+= did.getShareSecondAgentAmount() !=null? did.getShareSecondAgentAmount():0d;
					 }else if( "4".equals(runType))  { 
						 //患者
						 did.setIsPatientWithdraw( "1");
						 did.setPatientWithdrawId(ids);
						 withdraw_amount+= did.getSharePatientAmount() !=null? did.getSharePatientAmount():0d;
					 }
					agMaidInfoDao.saveOrUpdateAgMaidInfo(did);
				}
			}
			//设置 金额 
			att_AgWithdrawInfo.setWithdrawAmount(withdraw_amount);
			
			agMoneyCount.setWithdrawCount(withdraw_amount);
			agMoneyCountDao.updateAgMoneyCount(agMoneyCount);
			srm.setObj(att_AgWithdrawInfo);
		} catch (HSKDBException e) {
			e.printStackTrace();
			srm.setCode(0l);
			srm.setMeg(e.getMessage());
		}
		return srm;
	}
	 
}