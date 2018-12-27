package com.hsk.angeldoctor.api.daobbase.imp;

import java.util.*;

import com.hsk.supper.dto.comm.PagerModel;
import org.springframework.stereotype.*;
import com.hsk.exception.HSKDBException;
import com.hsk.supper.dao.imp.SupperDao;
import com.hsk.angeldoctor.api.daobbase.*;
import com.hsk.angeldoctor.api.persistence.*;

/** 
 * ag_money_count表数据库层面操作实现类 
 * @author  作者:admin
 * @version  版本信息:v1.0   创建时间: 2018-08-14 13:35:36
 */
@Component
public class  AgMoneyCountDao extends SupperDao implements IAgMoneyCountDao {	

	/**
	 * 根据ag_money_count表主键查找AgMoneyCount对象记录
	 * 
	 * @param  AmcId  Integer类型(ag_money_count表主键)
	 * @return AgMoneyCount ag_money_count表记录
	 * @throws HSKDBException
	 */	
	public AgMoneyCount findAgMoneyCountById(Integer AmcId) throws HSKDBException{
				AgMoneyCount  att_AgMoneyCount=new AgMoneyCount();				
				if(AmcId!=null){
					att_AgMoneyCount.setAmcId(AmcId);	
				    Object obj=	this.getOne(att_AgMoneyCount);
					if(obj!=null){
						att_AgMoneyCount=(AgMoneyCount) obj;
					}
				}
				return  att_AgMoneyCount;
	}
	 /**
	  * 根据ag_money_count表主键删除AgMoneyCount对象记录
	  * @param  AmcId  Integer类型(ag_money_count表主键)
	  * @throws HSKDBException
	  */
	public void deleteAgMoneyCountById(Integer AmcId) throws HSKDBException{ 
		 AgMoneyCount  att_AgMoneyCount=new AgMoneyCount();	
		  if(AmcId!=null){
					  att_AgMoneyCount.setAmcId(AmcId);
				  	  Object obj=	this.getOne(att_AgMoneyCount);
					  if(obj!=null){
							this.deleteObject(obj); 
					  }
			}
	}

	/**
 	 * 根据ag_money_count表主键修改AgMoneyCount对象记录
     * @param  AmcId  Integer类型(ag_money_count表主键)
     * @param  att_AgMoneyCount  AgMoneyCount类型(ag_money_count表记录)
     * @return AgMoneyCount  修改后的AgMoneyCount对象记录
	 * @throws HSKDBException
	 */
	public  AgMoneyCount updateAgMoneyCountById(Integer AmcId,AgMoneyCount att_AgMoneyCount) throws HSKDBException{
		  if(AmcId!=null){
					att_AgMoneyCount.setAmcId(AmcId);
				   	Object obj=	this.getOne(att_AgMoneyCount);
					if(obj!=null){							 
							this.updateObject(obj);
					}
			}
			return  att_AgMoneyCount;
	}
	
	/**
	 * 新增ag_money_count表 记录
     * @param  att_AgMoneyCount  AgMoneyCount类型(ag_money_count表记录)
	 * @throws HSKDBException
	 */
	public Integer saveAgMoneyCount(AgMoneyCount att_AgMoneyCount) throws HSKDBException{
		 return this.newObject(att_AgMoneyCount);
	} 
		
	/**
	 * 新增或修改ag_money_count表记录 ,如果ag_money_count表主键AgMoneyCount.AmcId为空就是添加，如果非空就是修改
     * @param  att_AgMoneyCount  AgMoneyCount类型(ag_money_count表记录)
	 * @throws HSKDBException
	 */
	public  AgMoneyCount saveOrUpdateAgMoneyCount(AgMoneyCount att_AgMoneyCount) throws HSKDBException{
		  this.getHibernateTemplate().saveOrUpdate(att_AgMoneyCount);
		  return att_AgMoneyCount;
	}
	
	/**
	 *根据AgMoneyCount对象作为对(ag_money_count表进行查询，获取列表对象
     * @param  att_AgMoneyCount  AgMoneyCount类型(ag_money_count表记录)
     * @return List<AgMoneyCount>  列表对象
	 * @throws HSKDBException 
	 */
	 @SuppressWarnings("unchecked")
	public List<AgMoneyCount> getListByAgMoneyCount(AgMoneyCount att_AgMoneyCount) throws HSKDBException{
		String Hql=this.getHql( att_AgMoneyCount); 
		List<AgMoneyCount> list=this.getHibernateTemplate().find(Hql);
		return  list;
	}
	/**
	 *根据AgMoneyCount对象作为对(ag_money_count表进行查询，获取分页对象
     * @param  att_AgMoneyCount  AgMoneyCount类型(ag_money_count表记录)
     * @return List<AgMoneyCount>  分页对象
	 * @throws HSKDBException 
	 */
	public PagerModel getPagerModelByAgMoneyCount(AgMoneyCount att_AgMoneyCount)
			throws HSKDBException {
		String Hql=this.getHql(att_AgMoneyCount);
		return this.getHibernateDao().findByPage(Hql); 
	} 
	/**
	 * 根据AgMoneyCount对象获取Hql字符串
     * @param  att_AgMoneyCount  AgMoneyCount类型(ag_money_count表记录)
	 *  @return hql字符串
	 */
	private String  getHql(AgMoneyCount att_AgMoneyCount){
			 StringBuffer sbuffer = new StringBuffer( " from  AgMoneyCount  where  1=1  ");
			 String likeStr=  att_AgMoneyCount.getTab_like();
			 String orderStr= att_AgMoneyCount.getTab_order();
			 
			 //*****************无关字段处理begin*****************
						   		 //处理in条件 余额信息ID(amcId)
							     if(att_AgMoneyCount.getAmcId_str()!=null&&
						   		    !"".equals(att_AgMoneyCount.getAmcId_str().trim())){ 
											 String  intStr=att_AgMoneyCount.getAmcId_str().trim();
											 String[]  arrayStr=intStr.split(","); 
											 
											  if(arrayStr.length>0){
												 sbuffer.append(" and ( ");
												 for(int i=0;i<arrayStr.length;i++){
													 String did=arrayStr[i];
													 if(i==arrayStr.length-1){
														 sbuffer.append("  amcId="+did+"   "); 
													 }else {
													 sbuffer.append("  amcId="+did+" or "); 
													 }
												 }
												 sbuffer.append(" ) "); 
											 }
											   
								 	}
						   		 //处理in条件 用户ID(suiId)
							     if(att_AgMoneyCount.getSuiId_str()!=null&&
						   		    !"".equals(att_AgMoneyCount.getSuiId_str().trim())){ 
											 String  intStr=att_AgMoneyCount.getSuiId_str().trim();
											 String[]  arrayStr=intStr.split(","); 
											 
											  if(arrayStr.length>0){
												 sbuffer.append(" and ( ");
												 for(int i=0;i<arrayStr.length;i++){
													 String did=arrayStr[i];
													 if(i==arrayStr.length-1){
														 sbuffer.append("  suiId="+did+"   "); 
													 }else {
													 sbuffer.append("  suiId="+did+" or "); 
													 }
												 }
												 sbuffer.append(" ) "); 
											 }
											   
								 	}
						   		 //处理in条件 积分总数(integralCount)
							     if(att_AgMoneyCount.getIntegralCount_str()!=null&&
						   		    !"".equals(att_AgMoneyCount.getIntegralCount_str().trim())){ 
											 String  intStr=att_AgMoneyCount.getIntegralCount_str().trim();
											 String[]  arrayStr=intStr.split(","); 
											 
											  if(arrayStr.length>0){
												 sbuffer.append(" and ( ");
												 for(int i=0;i<arrayStr.length;i++){
													 String did=arrayStr[i];
													 if(i==arrayStr.length-1){
														 sbuffer.append("  integralCount="+did+"   "); 
													 }else {
													 sbuffer.append("  integralCount="+did+" or "); 
													 }
												 }
												 sbuffer.append(" ) "); 
											 }
											   
								 	}
			 //*****************无关字段处理end*****************
			 //*****************数据库字段处理begin*************
								  		//余额信息ID(amcId)
					 					if(att_AgMoneyCount.getAmcId()!=null){
											 sbuffer.append( " and amcId=" +att_AgMoneyCount.getAmcId() );
										 }
								  		//用户ID(suiId)
					 					if(att_AgMoneyCount.getSuiId()!=null){
											 sbuffer.append( " and suiId=" +att_AgMoneyCount.getSuiId() );
										 }
					       				//用户类型:1医院；2代理商；3业务员；4患者(amcType)		 					 
									 if(att_AgMoneyCount.getAmcType()!=null&&
									  !"".equals(att_AgMoneyCount.getAmcType().trim())){
										  if(likeStr!=null&&!"".equals(likeStr.trim())&&likeStr.indexOf("amcType")!=-1){
											  sbuffer.append( " and amcType  like '%"+att_AgMoneyCount.getAmcType()+"%'"   );
										  }else {
											  sbuffer.append( " and amcType   ='"+att_AgMoneyCount.getAmcType()+"'"   );
										  }
									 }
								  		//积分总数(integralCount)
					 					if(att_AgMoneyCount.getIntegralCount()!=null){
											 sbuffer.append( " and integralCount=" +att_AgMoneyCount.getIntegralCount() );
										 }
			 //*****************数据库字段处理end***************
			  		if(orderStr!=null&&!"".equals(orderStr.trim())){
									 sbuffer.append( " order by "+orderStr);
						 }
						 /*
						 else {
							  sbuffer.append( " order by  AmcId   desc " );
					      }
					      */
			 
			 return  sbuffer.toString();
	}
	@Override
	public AgMoneyCount updateAgMoneyCount(AgMoneyCount att_AgMoneyCount) throws HSKDBException {
		AgMoneyCount data=new AgMoneyCount();
		data.setSuiId(att_AgMoneyCount.getSuiId());
		data.setAmcType(att_AgMoneyCount.getAmcType());
		List<AgMoneyCount> reList = this.getListByAgMoneyCount(data);
		if(reList !=null && reList.size()>0)
			data=reList.get(0);
		else{
			data=new AgMoneyCount();
			data.setSuiId(att_AgMoneyCount.getSuiId());
			data.setAmcType(att_AgMoneyCount.getAmcType());
			data.setConsumeCount(0d);
			data.setMoneyCount(0d);
			data.setWithdrawCount(0d);
			data.setIntegralCount(0);
			data.setTotalShare(0d);
			data.setRegistrationsCount(0);
			data.setEvaluationsCount(0);
			data.setFeedbacksCount(0);
			data.setCountMedicalRecordsCount(0);
		}
		if(att_AgMoneyCount.getConsumeCount()!=null)//设置消费总额
			data.setConsumeCount(data.getConsumeCount()+att_AgMoneyCount.getConsumeCount());
		if(att_AgMoneyCount.getWithdrawCount()!=null)//设置提现总额
			data.setWithdrawCount(data.getWithdrawCount()+att_AgMoneyCount.getWithdrawCount());
		if(att_AgMoneyCount.getIntegralCount()!=null)//设置积分总数
			data.setIntegralCount(data.getIntegralCount()+att_AgMoneyCount.getIntegralCount());
		if(att_AgMoneyCount.getTotalShare()!=null)//设置总额
			data.setTotalShare(data.getTotalShare()+att_AgMoneyCount.getTotalShare());
		data.setMoneyCount(data.getTotalShare()-data.getWithdrawCount());//余额：总返利金额-提现总金额
		if(att_AgMoneyCount.getRegistrationsCount()!=null)//设置待约预约总数
			data.setRegistrationsCount(data.getRegistrationsCount()+att_AgMoneyCount.getRegistrationsCount());
		if(att_AgMoneyCount.getEvaluationsCount()!=null)//设置评论总数
			data.setEvaluationsCount(data.getEvaluationsCount()+att_AgMoneyCount.getEvaluationsCount());
		if(att_AgMoneyCount.getFeedbacksCount()!=null)//设置反馈总数
			data.setFeedbacksCount(data.getFeedbacksCount()+att_AgMoneyCount.getFeedbacksCount());
		if(att_AgMoneyCount.getCountMedicalRecordsCount()!=null)//设置累计到诊次数
			data.setCountMedicalRecordsCount(data.getCountMedicalRecordsCount()+att_AgMoneyCount.getCountMedicalRecordsCount());
		this.saveOrUpdateAgMoneyCount(data);
		
		return data;
	}
	 
	public PagerModel getPagerModelByAgHospitalView(
			AgHospitalView att_AgHospitalView) throws HSKDBException {
		 StringBuffer sbuffer = new StringBuffer( " from  AgHospitalView  where  1=1  ");
//		 provId	String	省 (provId)		 					 
		 if(att_AgHospitalView.getProvId() !=null&&
		  !"".equals(att_AgHospitalView.getProvId().trim())){ 
				  sbuffer.append( " and provId   ='"+att_AgHospitalView.getProvId()+"'"   ); 
		 }
		 
//		 cityId	String	市
		 if(att_AgHospitalView.getCityId() !=null&&
				  !"".equals(att_AgHospitalView.getCityId().trim())){ 
						  sbuffer.append( " and cityId   ='"+att_AgHospitalView.getCityId()+"'"   ); 
				 }
//		 createDateStart	String	订单开始时间
		 
		 
		  if(att_AgHospitalView.getCreateDateStart()!=null && !"".equals(att_AgHospitalView.getCreateDateStart().trim())){
	   	    	sbuffer.append( " and  createDate<='" +att_AgHospitalView.getCreateDateStart()+"'" );  
			 }
//			 createDateEnd	String	订单结束时间
		 	if(att_AgHospitalView.getCreateDateEnd()!=null && !"".equals(att_AgHospitalView.getCreateDateEnd().trim())){
	      			sbuffer.append( " and  createDate>'" +att_AgHospitalView.getCreateDateEnd()+"'" );  
	  	     } 
		 

//		 name	String	医院名称
		 	if(att_AgHospitalView.getName() !=null&&
					  !"".equals(att_AgHospitalView.getName().trim())){ 
							  sbuffer.append( " and name   like '%"+att_AgHospitalView.getName()+"%'"   ); 
					 }
		return this.getHibernateDao().findByPage(sbuffer.toString());
	}
	 
	public PagerModel getPagerModelByAgBusinessView(
			AgBusinessView att_AgBusinessView) throws HSKDBException {
		 StringBuffer sbuffer = new StringBuffer( " from  AgBusinessView  where  1=1  ");
		 if(att_AgBusinessView.getAaiId()!=null)
			 sbuffer.append( " and  aaiId=" +att_AgBusinessView.getAaiId()+"" );  
		 if(att_AgBusinessView.getIsHasPatient()!=null && att_AgBusinessView.getIsHasPatient().equals("1"))
			 sbuffer.append( " and  parentAgentId is null" );  
		  if(att_AgBusinessView.getCreateDateStart()!=null && !"".equals(att_AgBusinessView.getCreateDateStart().trim())){
	   	    	sbuffer.append( " and  createDate<='" +att_AgBusinessView.getCreateDateStart()+"'" );  
			 }
//			 createDateEnd	String	订单结束时间
		 	if(att_AgBusinessView.getCreateDateEnd()!=null && !"".equals(att_AgBusinessView.getCreateDateEnd().trim())){
	      			sbuffer.append( " and  createDate>'" +att_AgBusinessView.getCreateDateEnd()+"'" );  
	  	     } 
//		name	String	业务员名称
		 	if(att_AgBusinessView.getName() !=null&&
					  !"".equals(att_AgBusinessView.getName().trim())){ 
							  sbuffer.append( " and name   like '%"+att_AgBusinessView.getName()+"%'"   ); 
					 }
//		mobile	String	业务员手机号
		 	if(att_AgBusinessView.getMobile() !=null&&
					  !"".equals(att_AgBusinessView.getMobile().trim())){ 
							  sbuffer.append( " and mobile   like '%"+att_AgBusinessView.getMobile()+"%'"   ); 
					 }
		 	
		 	sbuffer.append(" order by suiId desc");
		 	PagerModel pm=this.getHibernateDao().findByPage(sbuffer.toString());
		 	this.getHibernatesession().clear();
		 	return pm;
	}
	@Override
	public PagerModel getPagerModelByAgPatientView(
			AgPatientView att_AgPatientView) throws HSKDBException {
		 StringBuffer sbuffer = new StringBuffer( " from  AgPatientView  where  1=1  ");
		 if(att_AgPatientView.getCreateDateStart()!=null && !"".equals(att_AgPatientView.getCreateDateStart().trim())){
	   	    	sbuffer.append( " and  createDate>='" +att_AgPatientView.getCreateDateStart()+"'" );  
			 }
//			 createDateEnd	String	订单结束时间
		 	if(att_AgPatientView.getCreateDateEnd()!=null && !"".equals(att_AgPatientView.getCreateDateEnd().trim())){
	      			sbuffer.append( " and  createDate<='" +att_AgPatientView.getCreateDateEnd()+"'" );  
	  	     } 
//		name	String	业务员名称
		 	if(att_AgPatientView.getName() !=null&&
					  !"".equals(att_AgPatientView.getName().trim())){ 
							  sbuffer.append( " and name   like '%"+att_AgPatientView.getName()+"%'"   ); 
					 }
//		mobile	String	业务员手机号
		 	if(att_AgPatientView.getMobile() !=null&&
					  !"".equals(att_AgPatientView.getMobile().trim())){ 
							  sbuffer.append( " and mobile   like '%"+att_AgPatientView.getMobile()+"%"   ); 
					 }
		 	
		 	 sbuffer.append( " order by createDate desc"   ); 
		 	return this.getHibernateDao().findByPage(sbuffer.toString());
 
	}
 
	public List<AgWithdrawMaidInfo> getListByAgWithdrawMaidInfo(
			AgWithdrawMaidInfo att_AgWithdrawMaidInfo) throws HSKDBException {
		
		StringBuffer sbuffer = new StringBuffer( " from  AgWithdrawMaidInfo  where  1=1  ");
		
		if(att_AgWithdrawMaidInfo.getId()!=null){
	   	    	sbuffer.append( " and  id ='" +att_AgWithdrawMaidInfo.getId()+"'" );  
			 } 
		 sbuffer.append( " order by createDate ");
		List list_obj= this.getHibernateDao().findColByHqlQuery(sbuffer.toString());
		 return list_obj!=null?(List<AgWithdrawMaidInfo>)list_obj:null;
		 
	}
	public  AgWithdrawMaidInfo  getOneWMInfo(
			AgWithdrawMaidInfo att_AgWithdrawMaidInfo) throws HSKDBException {
		
		StringBuffer sbuffer = new StringBuffer( " from  AgWithdrawMaidInfo  where  1=1  ");
		
		if(att_AgWithdrawMaidInfo.getTransactionId() !=null){
	   	    	sbuffer.append( " and  transactionId ='" +att_AgWithdrawMaidInfo.getTransactionId()+"'" );  
			 } 
		
		if(att_AgWithdrawMaidInfo.getIsFirstAgent() !=null){
   	    	sbuffer.append( " and  isFirstAgent ='" +att_AgWithdrawMaidInfo.getIsFirstAgent()+"'" );  
		 } 
		
		 sbuffer.append( " order by createDate ");
		  List list_obj= this.getHibernateDao().findColByHqlQuery(sbuffer.toString());
		  if(list_obj!=null&&list_obj.size()>0){
			  return (AgWithdrawMaidInfo) list_obj.get(0);
		  }
		  
		 return  null;
		 
	}
	@Override
	public List<Map<String, Object>> getPaitentBillList(Integer patientId) throws HSKDBException {
		String sql ="SELECT a.*,DATE_FORMAT(a.create_date,'%Y-%m-%d') AS createDate FROM (SELECT ami_id AS transactionId,share_patient_amount AS shareAgentAmount,"
					+"'1' AS type,share_patient_id AS patient_id,create_date,'1' as busstatus FROM ag_maid_info WHERE STATUS=0 UNION ALL "
					+"SELECT awi_id AS transactionId,withdraw_amount AS shareAgentAmount,'2' AS type,awi_user_id AS patient_id,create_date,withdraw_status as busstatus FROM "
					+"ag_withdraw_info WHERE STATUS=0 AND withdraw_type=4 AND withdraw_status in (0,1,4)) a WHERE a.patient_id ="+patientId+"  ORDER BY a.create_date DESC";
		return this.getJdbcDao().query(sql);
	}
	@Override
	public List<Map<String, Object>> getAgentBillList(Integer agentId)
			throws HSKDBException {
		String sql="SELECT a.*,DATE_FORMAT(a.create_date,'%Y-%m-%d') AS createDate  FROM (SELECT ami_id AS transactionId,share_first_agent_amount AS shareAgentAmount,"
				+"'1' AS TYPE,share_first_agent_id AS agent_id,create_date FROM ag_maid_info WHERE STATUS=0 "
				+"UNION ALL SELECT ami_id AS transactionId,share_second_agent_amount AS shareAgentAmount,"
				+"'1' AS TYPE,share_second_agent_id AS agent_id,create_date FROM ag_maid_info WHERE STATUS=0 "
				+"UNION ALL SELECT awi_id AS transactionId,withdraw_amount AS shareAgentAmount,'2' AS TYPE,awi_user_id AS agent_id,"
				+"create_date FROM ag_withdraw_info WHERE STATUS=0 AND withdraw_type=2 AND withdraw_status in (0,1,4)) a WHERE a.agent_id ="+agentId+"  ORDER BY a.create_date DESC";
		return this.getJdbcDao().query(sql);
	}
	@Override
	public AgMoneyCount getAgMoneyCountByUserId(Integer userId, String amcType)
			throws HSKDBException {
		AgMoneyCount data=new AgMoneyCount();
		data.setSuiId(userId);
		data.setAmcType(amcType);
		List<AgMoneyCount> reList = this.getListByAgMoneyCount(data);
		if(reList !=null && reList.size()>0)
			data=reList.get(0);
		return data;
	}
	@Override
	public List<Map<String, Object>> getIntegralRanking() throws HSKDBException {
		String sql ="SELECT a.integral_count FROM ag_money_count a GROUP BY a.integral_count ORDER BY integral_count DESC";
		List<Map<String,Object>> reList = this.getJdbcDao().query(sql);
		return reList;
	}
}