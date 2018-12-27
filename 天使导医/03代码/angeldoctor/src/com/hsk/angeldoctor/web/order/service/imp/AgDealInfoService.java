package com.hsk.angeldoctor.web.order.service.imp;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hsk.angeldoctor.api.daobbase.IAgAgentInfoDao;
import com.hsk.angeldoctor.api.daobbase.IAgBusinessUserDao;
import com.hsk.angeldoctor.api.daobbase.IAgDealInfoDao;
import com.hsk.angeldoctor.api.daobbase.IAgDoctorInfoDao;
import com.hsk.angeldoctor.api.daobbase.IAgHospitalInfoDao;
import com.hsk.angeldoctor.api.daobbase.IAgIntegralInfoDao;
import com.hsk.angeldoctor.api.daobbase.IAgMaidInfoDao;
import com.hsk.angeldoctor.api.daobbase.IAgMoneyCountDao;
import com.hsk.angeldoctor.api.daobbase.IAgOrderInfoDao;
import com.hsk.angeldoctor.api.daobbase.IAgPatientInfoDao;
import com.hsk.angeldoctor.api.daobbase.IAgWechatInfoDao;
import com.hsk.angeldoctor.api.persistence.AgAgentInfo;
import com.hsk.angeldoctor.api.persistence.AgDealInfo;
import com.hsk.angeldoctor.api.persistence.AgDealView;
import com.hsk.angeldoctor.api.persistence.AgDoctorInfo;
import com.hsk.angeldoctor.api.persistence.AgHospitalInfo;
import com.hsk.angeldoctor.api.persistence.AgIntegralInfo;
import com.hsk.angeldoctor.api.persistence.AgMaidInfo;
import com.hsk.angeldoctor.api.persistence.AgMoneyCount;
import com.hsk.angeldoctor.api.persistence.AgOrderInfo;
import com.hsk.angeldoctor.api.persistence.AgOrderView;
import com.hsk.angeldoctor.api.persistence.AgPatientInfo;
import com.hsk.angeldoctor.web.order.service.IAgDealInfoService;
import com.hsk.exception.HSKDBException;
import com.hsk.exception.HSKException;
import com.hsk.supper.dto.comm.PagerModel;
import com.hsk.supper.dto.comm.SysRetrunMessage;
import com.hsk.xframe.api.service.imp.DSTService;
import com.hsk.xframe.api.utils.freeMarker.CommonUtil;
import com.hsk.xframe.api.utils.freeMarker.CreateCodeUtil;
import com.hsk.xframe.api.utils.freeMarker.DoubleAndBigDecimal;


/** 
  order业务操作实现类 
 * @author  作者:admin
 * @version  版本信息:v1.0   创建时间: 2018-08-14 13:35:36
 */
 
@Service
public class  AgDealInfoService extends DSTService implements IAgDealInfoService {	
   /**
   *业务处理dao类  agDealInfoDao 
   */
	@Autowired
	protected IAgOrderInfoDao agOrderInfoDao;
	@Autowired
	protected IAgDoctorInfoDao agDoctorInfoDao;
	@Autowired
	protected IAgMaidInfoDao agMaidInfoDao;
	@Autowired
	protected IAgPatientInfoDao agPatientInfoDao;
	@Autowired
	protected IAgWechatInfoDao agWechatInfoDao;
	@Autowired
	protected IAgDealInfoDao agDealInfoDao;
	@Autowired
	protected IAgHospitalInfoDao agHospitalInfoDao;
	@Autowired
	protected IAgAgentInfoDao agAgentInfoDao;
	@Autowired
	private IAgMoneyCountDao agMoneyCountDao;
	@Autowired
	protected IAgIntegralInfoDao agIntegralInfoDao;

 /**
	 * 根据ag_deal_info表主键删除AgDealInfo对象记录
     * @param  adiId  Integer类型(ag_deal_info表主键)
	 * @return SysRetrunMessage 对象记录
	 * @throws HSKException
	 */

	public SysRetrunMessage findFormObject(Integer adiId) throws HSKException{
	        SysRetrunMessage srm=new SysRetrunMessage(1l);
			  	
			try{
		   			AgDealInfo     att_AgDealInfo= agDealInfoDao.findAgDealInfoById( adiId) ;
					srm.setObj(att_AgDealInfo);
				} catch (HSKDBException e) {
					e.printStackTrace(); 
					srm.setCode(0l);
					srm.setMeg(e.getMessage()); 
				}
				 return srm ;
	} 

    /**
	 * 根据ag_deal_info表主键删除AgDealInfo对象记录
     * @param  adiId  Integer类型(ag_deal_info表主键)
	 * @throws HSKException
	 */

	public AgDealInfo findObject(Integer adiId) throws HSKException{
			AgDealInfo  att_AgDealInfo=new AgDealInfo();		
			try{
		        att_AgDealInfo= agDealInfoDao.findAgDealInfoById( adiId) ;
				} catch (HSKDBException e) {
					e.printStackTrace(); 
					throw new  HSKException(e);
				}
				return  att_AgDealInfo;
	}
	
	 
	 /**
	 * 根据ag_deal_info表主键删除AgDealInfo对象记录
     * @param  adiId  Integer类型(ag_deal_info表主键)
     * @return SysRetrunMessage 对象记录
	 * @throws HSKException
	 */
	public SysRetrunMessage deleteObject(Integer adiId) throws HSKException{  
		    SysRetrunMessage srm=new SysRetrunMessage(1l);
		   try{ 
				agDealInfoDao.deleteAgDealInfoById(adiId);
			 } catch (Exception e) {
					e.printStackTrace(); 
					throw new  HSKException(e);
		     }
		   return srm;  
	}
	
	/**
	 * 根据ag_deal_info表主键删除多条AgDealInfo对象记录
     * @param  AdiIds  Integer类型(ag_deal_info表主键)
     * @return SysRetrunMessage 对象记录
	 * @throws HSKException
	 */
	public SysRetrunMessage deleteAllObject(String adiIds) throws HSKException{
		SysRetrunMessage srm = new SysRetrunMessage(1l);
		try {
			String[] ids = adiIds.split(",");
			for (String did : ids) {
				if (did != null && !"".equals(did.trim())) {
					agDealInfoDao.deleteAgDealInfoById(Integer
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
	 * 新增或修改ag_deal_info表记录 ,如果ag_deal_info表主键AgDealInfo.AdiId为空就是添加，如果非空就是修改
     * @param  att_AgDealInfo  AgDealInfo类型(ag_deal_info表记录)
     * @return AgDealInfo  修改后的AgDealInfo对象记录
	 * @throws HSKDBException
	 */
	public SysRetrunMessage saveOrUpdateObject( AgDealInfo att_AgDealInfo) throws HSKException{
			 SysRetrunMessage srm = new SysRetrunMessage(1l);
			  try{
					agDealInfoDao.saveOrUpdateAgDealInfo(att_AgDealInfo); 
					srm.setObj(att_AgDealInfo);
			    } catch (Exception e) {
					e.printStackTrace(); 
					throw new HSKException(e);
		        }
			return srm;	  
	}
	
	 
	/**
	 *根据AgDealInfo对象作为对(ag_deal_info表进行查询，获取分页对象
     * @param  att_AgDealInfo  AgDealInfo类型(ag_deal_info表记录)
     * @return PagerModel  分页对象
	 * @throws HSKException 
	 */
	public PagerModel getPagerModelObject (AgDealInfo att_AgDealInfo) throws HSKException{
		PagerModel pm=new PagerModel(new ArrayList<AgDealInfo>());
			  try{
					pm=agDealInfoDao.getPagerModelByAgDealInfo(att_AgDealInfo);
			    } catch (Exception e) {
					e.printStackTrace(); 
		        }
		return pm;
	}

	@Override
	public PagerModel getPagerAgDealView(AgDealView agDealView) throws HSKException {
		PagerModel pm=new PagerModel(new ArrayList<AgOrderView>());
		try{
			Integer organizationId=null;
			 if(this.getUserType()==2)//如果是医院管理员登录
				organizationId = this.GetOneSessionAccount().getSroleId();
		  	 else if(this.getUserType()==3){//如果是医生登录
				AgDoctorInfo loginDoc= agDoctorInfoDao.findAgDoctorInfoById(this.GetOneSessionAccount().getSroleId());
				organizationId = loginDoc.getOrganizationId();
			}
			 agDealView.setOrganizationId(organizationId);
			pm = agDealInfoDao.getPagerAgDealView(agDealView);
		} catch (Exception e) {
			e.printStackTrace(); 
	    }
		return pm;
	}

	@Override
	public SysRetrunMessage addVisit(Integer registrationId, Double treatmentFee, Double drugFee,
			Integer departmentId, Integer doctorId, String comment, Integer regDepartmentId, Integer regDoctorId,
			String registerDate, Integer shiftPeriodId, Integer shiftPlanId, String description) throws HSKException {
		SysRetrunMessage srm = new SysRetrunMessage(1l);
		try{
			AgOrderInfo att_AgOrderInfo =agOrderInfoDao.findAgOrderInfoById(registrationId);
			if(att_AgOrderInfo.getOutpatientStatus().equals("0")){
				srm.setCode(0l);
				srm.setMeg("该记录已经收费，不允许再次收费！");
				return srm;
			}
			//获取代约医院信息
			AgHospitalInfo agHospitalInfo =agHospitalInfoDao.findAgHospitalInfoById(att_AgOrderInfo.getOrganizationId());
			//根据患者手机号检查患者是否存在 
			AgPatientInfo agPatientInfo = new AgPatientInfo();
			agPatientInfo.setMobile(att_AgOrderInfo.getPatientMobile());
			agPatientInfo.setName(att_AgOrderInfo.getPatientName());
			List<AgPatientInfo> agPatientInfoList = agPatientInfoDao.getListByAgPatientInfo(agPatientInfo);
			if(agPatientInfoList!=null && agPatientInfoList.size()>0){
				agPatientInfo = agPatientInfoList.get(0);
				agPatientInfo.setLastDealDate(new Date());
				agPatientInfoDao.saveAgPatientInfo(agPatientInfo);
			}else{
				agPatientInfo=new AgPatientInfo();
				agPatientInfo.setName(att_AgOrderInfo.getPatientName());
				agPatientInfo.setMobile(att_AgOrderInfo.getPatientMobile());
				agPatientInfo.setGender(att_AgOrderInfo.getPatientGender());
				agPatientInfo.setAge(att_AgOrderInfo.getPatientAge());
				agPatientInfo.setSource(0);
				agPatientInfo.setStatus("0");
				agPatientInfo.setCreateDate(new Date());
				agPatientInfo.setLastDealDate(new Date());
				agPatientInfoDao.saveAgPatientInfo(agPatientInfo);
			}
			att_AgOrderInfo.setPatientId(agPatientInfo.getPatientId());
			att_AgOrderInfo.setOutpatientStatus("0");//预约状态设置为已就诊
			agOrderInfoDao.saveOrUpdateAgOrderInfo(att_AgOrderInfo);
			//创建就诊信息
			AgDealInfo agDealInfo = new AgDealInfo();
			agDealInfo.setAoiId(att_AgOrderInfo.getAoiId());
			agDealInfo.setOrganizationId(att_AgOrderInfo.getOrganizationId());
			agDealInfo.setDepartmentId(departmentId);
			agDealInfo.setDoctorId(doctorId);
			agDealInfo.setPatientId(agPatientInfo.getPatientId());
			agDealInfo.setTreatmentFee(treatmentFee);
			agDealInfo.setDrugFee(drugFee);
			agDealInfo.setReceptionFee(agHospitalInfo.getReceptionFee());
			agDealInfo.setComment(comment);
			agDealInfo.setStatus("0");
			agDealInfo.setCreateDate(new Date());
			agDealInfoDao.saveAgDealInfo(agDealInfo);
			//判断是否需要创建复诊信息
			if(regDepartmentId != null){
				SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
				
				AgOrderInfo fz_AgOrderInfo = new AgOrderInfo();
				fz_AgOrderInfo.setSerialNumber(CreateCodeUtil.getNo("OR"));
				fz_AgOrderInfo.setPatientId(agPatientInfo.getPatientId());
				fz_AgOrderInfo.setPatientName(att_AgOrderInfo.getPatientName());
				fz_AgOrderInfo.setPatientMobile(att_AgOrderInfo.getPatientMobile());
				fz_AgOrderInfo.setPatientGender(att_AgOrderInfo.getPatientGender());
				fz_AgOrderInfo.setPatientAge(att_AgOrderInfo.getPatientAge());
				fz_AgOrderInfo.setPatientSource("0");
				fz_AgOrderInfo.setParentRegistrationId(att_AgOrderInfo.getAoiId());
				fz_AgOrderInfo.setDepartmentId(regDepartmentId);
				fz_AgOrderInfo.setDoctorId(regDoctorId);
				fz_AgOrderInfo.setOrganizationId(att_AgOrderInfo.getOrganizationId());
				fz_AgOrderInfo.setRegisterDate(sdf.parse(registerDate));
				fz_AgOrderInfo.setShiftPeriodId(shiftPeriodId);
				fz_AgOrderInfo.setShiftPlanId(shiftPlanId);
				fz_AgOrderInfo.setDescription(description);
				if(att_AgOrderInfo.getRegisterType().equals("0")){//如果是app代约
					fz_AgOrderInfo.setRegisterType("0");//
					fz_AgOrderInfo.setAgentId(att_AgOrderInfo.getAgentId());
					fz_AgOrderInfo.setFirstAgentId(att_AgOrderInfo.getFirstAgentId());
					fz_AgOrderInfo.setSecondAgentId(att_AgOrderInfo.getSecondAgentId());
					fz_AgOrderInfo.setAaiId(att_AgOrderInfo.getAaiId());
					fz_AgOrderInfo.setOutpatientName(att_AgOrderInfo.getOutpatientName());
				}else
					fz_AgOrderInfo.setRegisterType("1");//
				fz_AgOrderInfo.setRegisterStatus("1");
				fz_AgOrderInfo.setChargeType("0");
				fz_AgOrderInfo.setOutpatientStatus("2");
				fz_AgOrderInfo.setStatus("0");
				fz_AgOrderInfo.setCreateDate(new Date());
				agOrderInfoDao.saveAgOrderInfo(fz_AgOrderInfo);
			}
			//刷新总待约次数
			if(att_AgOrderInfo.getRegisterType().equals("0")){
				AgMoneyCount att_AgMoneyCount =new AgMoneyCount();
				att_AgMoneyCount.setSuiId(att_AgOrderInfo.getAgentId());
				att_AgMoneyCount.setAmcType("3");
				att_AgMoneyCount.setRegistrationsCount(1);
				agMoneyCountDao.updateAgMoneyCount(att_AgMoneyCount);
			}else if(att_AgOrderInfo.getRegisterType().equals("1")){//如果是患者预约
				AgMoneyCount att_AgMoneyCount =new AgMoneyCount();
				att_AgMoneyCount.setSuiId(att_AgOrderInfo.getAgentId());
				att_AgMoneyCount.setAmcType("4");
				att_AgMoneyCount.setRegistrationsCount(1);
				agMoneyCountDao.updateAgMoneyCount(att_AgMoneyCount);
			}
			//设置患者消费信息
			AgMoneyCount att_AgMoneyCount =new AgMoneyCount();
			att_AgMoneyCount.setSuiId(att_AgOrderInfo.getPatientId());
			att_AgMoneyCount.setAmcType("4");
			
			att_AgMoneyCount.setConsumeCount(agDealInfo.getDrugFee()+agDealInfo.getTreatmentFee());
			att_AgMoneyCount.setCountMedicalRecordsCount(1);//患者累计到诊次数+1
			agMoneyCountDao.updateAgMoneyCount(att_AgMoneyCount);
			//如果是非自增的数据创建分佣信息
			if(att_AgOrderInfo.getChargeType().equals("1")){
				this.addAgMaidInfo(att_AgOrderInfo,agDealInfo,agHospitalInfo);
				//查看是否需要给业务员积分
				AgIntegralInfo agIntegralInfo = new AgIntegralInfo();
				agIntegralInfo.setSource("2");
				agIntegralInfo.setAppId(att_AgOrderInfo.getAoiId());
				List<AgIntegralInfo> integralList = agIntegralInfoDao.getListByAgIntegralInfo(agIntegralInfo);
				if(integralList!=null && integralList.size() >0){
					agIntegralInfo = integralList.get(0);
					agIntegralInfo.setStatus("1");
					agIntegralInfoDao.saveOrUpdateAgIntegralInfo(agIntegralInfo);
					AgMoneyCount agMoneyCount = new AgMoneyCount();
					if(agIntegralInfo.getUserType().equals("1")){//业务员
						agMoneyCount.setSuiId(agIntegralInfo.getSuiId());
						agMoneyCount.setAmcType("3");
					}else if(agIntegralInfo.getUserType().equals("2")){//患者
						agMoneyCount.setSuiId(agIntegralInfo.getSuiId());
						agMoneyCount.setAmcType("4");
					}
					agMoneyCount.setIntegralCount(agIntegralInfo.getCount());
					agMoneyCountDao.updateAgMoneyCount(agMoneyCount);
				}
			}
		}catch(Exception e){
			srm.setCode(0l);
			srm.setMeg("操作失败!");
			e.printStackTrace(); 
			throw new HSKException(e);
		}
		return srm;
	} 
	//增加分佣信息
	private void addAgMaidInfo(AgOrderInfo att_AgOrderInfo,AgDealInfo agDealInfo,AgHospitalInfo agHospitalInfo) throws Exception{
		AgMaidInfo agMaidInfo = new AgMaidInfo();
		agMaidInfo.setSerialNumber(att_AgOrderInfo.getSerialNumber());
		agMaidInfo.setAdiId(agDealInfo.getAdiId());
		agMaidInfo.setAoiId(att_AgOrderInfo.getAoiId());
		agMaidInfo.setDrugFee(agDealInfo.getDrugFee());
		agMaidInfo.setTreatmentFee(agDealInfo.getTreatmentFee());
		agMaidInfo.setDrugFeePercent(agHospitalInfo.getDrugFeePercent());
		agMaidInfo.setTreatmentFeePercent(agHospitalInfo.getTreatmentFeePercent());
		agMaidInfo.setReceptionFee(agHospitalInfo.getReceptionFee());
		agMaidInfo.setTotalFee(agDealInfo.getDrugFee()+agDealInfo.getTreatmentFee());//设置消费总金额
		//获取代理商佣金比例
		Double aaiSharePercent=0d;
		if(att_AgOrderInfo.getAaiId()!=null){
			//获取代理商信息
			AgAgentInfo agAgentInfo =agAgentInfoDao.findAgAgentInfoById(att_AgOrderInfo.getAaiId());
			if(agAgentInfo.getReservedRelateTo().equals("1"))//如果代理商类型为代理商
				aaiSharePercent=agAgentInfo.getReservedSharePercent();
			else if(agAgentInfo.getReservedRelateTo().equals("0")){//如果代理商类型为医院,则为医院的分润比例
				AgHospitalInfo agHospitalInfo2 =agHospitalInfoDao.findAgHospitalInfoById(agAgentInfo.getReservedRelateToOrganizationId());
				aaiSharePercent = agHospitalInfo2.getOrganizationSharePercent();
			}
		}
		//药费*比例+诊疗费*比例
		Double xShare = agMaidInfo.getDrugFee()*agMaidInfo.getDrugFeePercent()/100.00+agMaidInfo.getTreatmentFee()*agMaidInfo.getTreatmentFeePercent()/100.00;
		agMaidInfo.setTotalFeeToPay(xShare);//设置返利总金额
		//患者分佣
		Double sharePatientAmount=0d;
		//一级代理人分佣
		Double shareFirstAgentAmount=0d;
		//二级代理人分佣
		Double shareSecondAgentAmount=0d;
		//代理商分佣
		Double shareTopReservedAgentAmount=0d;
		//如果是微信预约，患者参与分成
		if(att_AgOrderInfo.getRegisterType().equals("1")){
			//设置患者分成  返利=（药费*比例+诊疗费*比例）*患者返利比例
			sharePatientAmount = DoubleAndBigDecimal.mul(xShare,DoubleAndBigDecimal.div(agHospitalInfo.getPatientSharePercent(), 100.00, 2, 0));
			agMaidInfo.setSharePatientAmount(sharePatientAmount);
			agMaidInfo.setSharePatientId(att_AgOrderInfo.getAgentId());//
			if(att_AgOrderInfo.getFirstAgentId()!=null){//如果有一级业务员
				//设置一级业务员佣金：佣金=（药费*比例+诊疗费*比例）*一级业务员返利比例
				Double a=agHospitalInfo.getPrimarySalesmanSharePercent();
				Double b=DoubleAndBigDecimal.div(a, 100.00, 2, 0);
				shareSecondAgentAmount = DoubleAndBigDecimal.mul(xShare,b);
				agMaidInfo.setShareFirstAgentId(att_AgOrderInfo.getFirstAgentId());
				agMaidInfo.setShareFirstAgentAmount(shareFirstAgentAmount);
			}
		}
		//如果是业务员代约，患者不参与分成
		else if(att_AgOrderInfo.getRegisterType().equals("0")){
			if(att_AgOrderInfo.getFirstAgentId()!=null){//如果有一级业务员
				//设置一级业务员佣金：佣金=（药费*比例+诊疗费*比例）*一级业务员返利比例+（药费*比例+诊疗费*比例）*患者返利比例
				Double a=agHospitalInfo.getPrimarySalesmanSharePercent()+agHospitalInfo.getPatientSharePercent();
				Double b=DoubleAndBigDecimal.div(a, 100.00, 2, 0);
				shareFirstAgentAmount = DoubleAndBigDecimal.mul(xShare,b);
				agMaidInfo.setShareFirstAgentId(att_AgOrderInfo.getFirstAgentId());
				agMaidInfo.setShareFirstAgentAmount(shareFirstAgentAmount);
			}
		}
		//如果有二级业务员
		if(att_AgOrderInfo.getSecondAgentId()!=null){
			//设置二级业务员佣金：佣金=（药费*比例+诊疗费*比例）*二级业务员返利比例
			Double a=agHospitalInfo.getSecondarySalesmanSharePercent();
			Double b=DoubleAndBigDecimal.div(a, 100.00, 2, 0);
			shareSecondAgentAmount = DoubleAndBigDecimal.mul(xShare,b);
			agMaidInfo.setShareSecondAgentId(att_AgOrderInfo.getSecondAgentId());
			agMaidInfo.setShareSecondAgentAmount(shareSecondAgentAmount);
		}
		//如果有代理商
		if(att_AgOrderInfo.getAaiId()!=null){
			//代理商佣金：（药费*比例+诊疗费*比例）*平台收入比例*其它代理商比例
			Double a=agHospitalInfo.getPlatformSharePercent()+aaiSharePercent;
			Double b=DoubleAndBigDecimal.div(a, 100.00, 2, 0);
			shareTopReservedAgentAmount = DoubleAndBigDecimal.mul(xShare,b);
			agMaidInfo.setShareTopReservedAgentid(att_AgOrderInfo.getAaiId());
			agMaidInfo.setShareTopReservedAgentAmount(shareTopReservedAgentAmount);
		}
		//获取平台收入
		Double sharePortalAmount = xShare-sharePatientAmount-shareFirstAgentAmount-shareSecondAgentAmount-shareTopReservedAgentAmount;
		agMaidInfo.setSharePortalAmount(sharePortalAmount);
		agMaidInfo.setStatus("0");
		agMaidInfo.setIsFirstAgentWithdraw("0");
		agMaidInfo.setIsPatientWithdraw("0");
		agMaidInfo.setIsSecondAgentWithdraw("0");
		agMaidInfo.setIsTopOrganizationWithdraw("0");
		agMaidInfo.setIsTopReservedAgentWithdraw("0");
		agMaidInfo.setCreateDate(new Date());
		agMaidInfoDao.saveOrUpdateAgMaidInfo(agMaidInfo);
		//刷新统计信息
		if(sharePatientAmount>0){
			AgMoneyCount att_AgMoneyCount =new AgMoneyCount();
			att_AgMoneyCount.setSuiId(agMaidInfo.getSharePatientId());
			att_AgMoneyCount.setAmcType("4");
			att_AgMoneyCount.setTotalShare(sharePatientAmount);
			agMoneyCountDao.updateAgMoneyCount(att_AgMoneyCount);
		}
		if(shareFirstAgentAmount>0){
			AgMoneyCount att_AgMoneyCount =new AgMoneyCount();
			att_AgMoneyCount.setSuiId(agMaidInfo.getShareFirstAgentId());
			att_AgMoneyCount.setAmcType("3");
			att_AgMoneyCount.setTotalShare(shareFirstAgentAmount);
			agMoneyCountDao.updateAgMoneyCount(att_AgMoneyCount);
		}
		if(shareSecondAgentAmount>0){
			AgMoneyCount att_AgMoneyCount =new AgMoneyCount();
			att_AgMoneyCount.setSuiId(agMaidInfo.getShareSecondAgentId());
			att_AgMoneyCount.setAmcType("3");
			att_AgMoneyCount.setTotalShare(shareSecondAgentAmount);
			agMoneyCountDao.updateAgMoneyCount(att_AgMoneyCount);
		}
		if(shareTopReservedAgentAmount>0){
			AgMoneyCount att_AgMoneyCount =new AgMoneyCount();
			att_AgMoneyCount.setSuiId(agMaidInfo.getShareTopReservedAgentid());
			att_AgMoneyCount.setAmcType("2");
			att_AgMoneyCount.setTotalShare(shareTopReservedAgentAmount);
			agMoneyCountDao.updateAgMoneyCount(att_AgMoneyCount);
		}
			
	}

	@Override
	public PagerModel getDealDocPager(Integer agentId,String registerType) throws HSKException {
		PagerModel pm = new PagerModel();
		try{
			AgDealView agDealView = new AgDealView();
			//agDealView.setRegisterType(registerType);
			//agDealView.setAgentId(agentId);
			agDealView.setOutpatientStatus("0");
			agDealView.setPatientId(agentId);
			List<AgDealView> viewList = agDealInfoDao.getAgDealViewList(agDealView);
			if(viewList !=null && viewList.size() >0){
				String docIds="";
				for(AgDealView view:viewList)
					docIds+=view.getRegDoctorId()+",";
				docIds=docIds.substring(0, docIds.length()-1);
				AgDoctorInfo att_AgDoctorInfo = new AgDoctorInfo();
				att_AgDoctorInfo.setDoctorId_str(docIds);
				PagerModel pa = agDoctorInfoDao.getPagerModelByAgDoctorInfo(att_AgDoctorInfo);
				pm.setTotal(pa.getTotal());
				pm.setTotalCount(pa.getTotalCount());
				List<Map<String,Object>> reList = new ArrayList<Map<String,Object>>();
				if(pa.getTotal() >0){
					SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
					for(Object obj : pa.getItems()){
						Map<String,Object> reMap = new HashMap<String,Object>();
						AgDoctorInfo doc = (AgDoctorInfo)obj;
						reMap.put("id", doc.getDoctorId());
						reMap.put("mobile", doc.getMobile());
						reMap.put("organizationId", doc.getOrganizationId());
						reMap.put("name", doc.getName());
						reMap.put("visible", doc.getVisible());
						reMap.put("status", doc.getStatus());
						reMap.put("gender", doc.getGender());
						reMap.put("expert", doc.getExpert());
						if(doc.getCreateDate()!=null)
							reMap.put("createDate", sdf.format(doc.getCreateDate()));
						else
							reMap.put("createDate", "");
						reMap.put("birthday", doc.getBirthday());
						reMap.put("avatar", doc.getAvatar());
						reMap.put("images", doc.getImages());
						reMap.put("introduction", doc.getIntroduction());
						reMap.put("major", doc.getMajor());
						reMap.put("jobTitleName", doc.getJobTitleName());
						reMap.put("jobTitleId", doc.getJobTitleId());
						if(doc.getDepartmentName() !=null && !doc.getDepartmentName().trim().equals(""))
							reMap.put("departmentName", doc.getDepartmentName().substring(0, doc.getDepartmentName().length()-1));
						else
							reMap.put("departmentName", "");
						reMap.put("organizationName", doc.getOrganizationName());
						reMap.put("easemobUsername", CommonUtil.IM_DOC_PRE+doc.getDoctorId());
						reList.add(reMap);
					}
				}
				pm.setItems(reList);
				pm.setRows(reList);
			}
		}catch(Exception e){
			e.printStackTrace();
		}
		return pm;
	}
	 
}