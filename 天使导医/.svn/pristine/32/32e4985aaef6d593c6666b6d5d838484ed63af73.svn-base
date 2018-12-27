package com.hsk.angeldoctor.api.daobbase.imp;

import java.text.SimpleDateFormat;
import java.util.*;
import com.hsk.supper.dto.comm.PagerModel;
import org.springframework.stereotype.*;
import com.hsk.exception.HSKDBException;
import com.hsk.supper.dao.imp.SupperDao;
import com.hsk.angeldoctor.api.daobbase.*;
import com.hsk.angeldoctor.api.persistence.*;

/** 
 * ag_maid_info表数据库层面操作实现类 
 * @author  作者:admin
 * @version  版本信息:v1.0   创建时间: 2018-08-14 13:31:12
 */
@Component
public class  AgMaidViewDao extends SupperDao implements IAgMaidViewDao {

 
	public PagerModel getPagerModelByAgMaidView(AgMaidView att_AgMaidView)
			throws HSKDBException {  
	 
		 StringBuffer sbuffer = new StringBuffer( " from  AgMaidView where  1=1  ");
		//提现申请ID
			if(att_AgMaidView.getAwiId()!=null ){
				sbuffer.append( " and awiId=" +att_AgMaidView.getAwiId());
			 }
			
			if(att_AgMaidView.getShareTopReservedAgentId()!=null ){
				sbuffer.append( " and shareTopReservedAgentId=" +att_AgMaidView.getShareTopReservedAgentId());
			 }
			
			//时间类型开始条件处理  创建时间(createDate)
			  if(att_AgMaidView.getCreateDateStart()!=null && !"".equals(att_AgMaidView.getCreateDateStart().trim())){
		   	    	sbuffer.append( " and  createDate>='" +att_AgMaidView.getCreateDateStart()+"'" );  
				 }
		 	  //时间类型结束条件处理 创建时间(createDate)
			 	if(att_AgMaidView.getCreateDateEnd()!=null && !"".equals(att_AgMaidView.getCreateDateEnd().trim())){
 	      			sbuffer.append( " and  createDate<'" +att_AgMaidView.getCreateDateEnd()+"'" );  
		  	     } 
//			 	organizationName	String	医院名称
			 	if(att_AgMaidView.getOrganizationName()  !=null&&
						  !"".equals(att_AgMaidView.getOrganizationName().trim())){ 
								  sbuffer.append( " and organizationName   like '%"+att_AgMaidView.getOrganizationName()+"%'"   );
						 }	
//			registerType	String	业务类型
			 	if(att_AgMaidView.getRegisterType()!=null&&
						  !"".equals(att_AgMaidView.getRegisterType().trim())){ 
								  sbuffer.append( " and registerType   ='"+att_AgMaidView.getRegisterType()+"'"   ); 
						 }
			 	
//			agentMobile	String	业务员手机号
				if(att_AgMaidView.getAgentMobile()!=null&&
						  !"".equals(att_AgMaidView.getAgentMobile().trim())){ 
								  sbuffer.append( " and agentMobile   ='"+att_AgMaidView.getAgentMobile()+"'"   ); 
						 }
			 	
//			patientName	String	患者名称
				if(att_AgMaidView.getPatientName() !=null&&
						  !"".equals(att_AgMaidView.getPatientName().trim())){ 
								  sbuffer.append( " and patientName   like '%"+att_AgMaidView.getPatientName()+"%'"   );
						 }	
//			chargeType	String	是否自增
				if(att_AgMaidView.getChargeType() !=null&&
						  !"".equals(att_AgMaidView.getChargeType().trim())){ 
								  sbuffer.append( " and chargeType   ='"+att_AgMaidView.getChargeType()+"'"   ); 
						 }	
				//一级业务员手机
				if(att_AgMaidView.getFirstAgentMobile() !=null&&
						  !"".equals(att_AgMaidView.getFirstAgentMobile().trim())){ 
								  sbuffer.append( " and firstAgentMobile   ='"+att_AgMaidView.getFirstAgentMobile()+"'"   ); 
						 }
				//二级业务员手机
				if(att_AgMaidView.getSecondAgentMobile() !=null&&
						  !"".equals(att_AgMaidView.getSecondAgentMobile().trim())){ 
								  sbuffer.append( " and secondAgentMobile   ='"+att_AgMaidView.getSecondAgentMobile()+"'"   ); 
						 }	 
				sbuffer.append(" order by createDate desc");
		PagerModel pm= this.getHibernateDao().findByPage(sbuffer.toString()); 
		return pm;
	}

	@Override
	public PagerModel getPagerModelByAgDealCountView(
			AgDealCountView att_AgDealCountView) throws HSKDBException {
		 StringBuffer sbuffer = new StringBuffer( " from  AgDealCountView  where  1=1  ");
		//提现申请ID
			if(att_AgDealCountView.getOrganizationId()!=null ){
				sbuffer.append( " and organizationId=" +att_AgDealCountView.getOrganizationId());
			 }
			if(att_AgDealCountView.getAaiId()!=null)
				sbuffer.append( " and aaiId=" +att_AgDealCountView.getAaiId());
				
		 
//		 	organizationName	String	医院名称
		 	if(att_AgDealCountView.getOrganizationName()  !=null&&
					  !"".equals(att_AgDealCountView.getOrganizationName().trim())){ 
							  sbuffer.append( " and organizationName   like '%"+att_AgDealCountView.getOrganizationName()+"%'"   );
					 }	
				//时间类型开始条件处理  创建时间(createDate)
				  if(att_AgDealCountView.getCreateDateStart()!=null && !att_AgDealCountView.getCreateDateStart().trim().equals("")){
					  sbuffer.append( " and  createDate >='" +att_AgDealCountView.getCreateDateStart()+" 00:00:00'" );  
					 }
			 	  //时间类型结束条件处理 创建时间(createDate)
				 	if(att_AgDealCountView.getCreateDateEnd()!=null && !att_AgDealCountView.getCreateDateEnd().trim().equals("")){
	 	      			sbuffer.append( " and  createDate<='" +att_AgDealCountView.getCreateDateEnd()+" 23:59:59'" );  
			  	     } 
//				 	 
//				registerType	String	业务类型
				 	if(att_AgDealCountView.getRegisterType()!=null&&
							  !"".equals(att_AgDealCountView.getRegisterType().trim())){ 
									  sbuffer.append( " and registerType in ("+att_AgDealCountView.getRegisterType()+")"   ); 
							 }
				 	
//				agentMobile	String	业务员手机号
					if(att_AgDealCountView.getAgentMobile()!=null&&
							  !"".equals(att_AgDealCountView.getAgentMobile().trim())){ 
									  sbuffer.append( " and agentMobile   like '%"+att_AgDealCountView.getAgentMobile()+"%'"   ); 
							 }
				 	
//				patientName	String	患者名称
					if(att_AgDealCountView.getPatientName() !=null&&
							  !"".equals(att_AgDealCountView.getPatientName().trim())){ 
									  sbuffer.append( " and patientName   like '%"+att_AgDealCountView.getPatientName()+"%'"   );
							 }	
//				chargeType	String	是否自增
					if(att_AgDealCountView.getChargeType() !=null&&
							  !"".equals(att_AgDealCountView.getChargeType().trim())){ 
									  sbuffer.append( " and chargeType   ='"+att_AgDealCountView.getChargeType()+"'"   ); 
							 } 
				if(att_AgDealCountView.getCreateDateStart()!=null && !att_AgDealCountView.getCreateDateStart().equals(""))
					sbuffer.append( " and createDate   >='"+att_AgDealCountView.getCreateDateStart()+" 00:00:00'"   ); 
				if(att_AgDealCountView.getCreateDateEnd()!=null && !att_AgDealCountView.getCreateDateEnd().equals(""))
					sbuffer.append( " and createDate   <='"+att_AgDealCountView.getCreateDateEnd()+" 23:59:59'"   );
				sbuffer.append(" order by adiId desc");
			PagerModel pm= this.getHibernateDao().findByPage(sbuffer.toString()); 
			return pm;
	}

	@Override
	public PagerModel getPagerModelByAgMaidOrView(AgMaidOrView att_AgMaidOrView) throws HSKDBException {
		 StringBuffer sbuffer = new StringBuffer( " from  AgMaidOrView where  1=1  ");
			//提现申请ID
				if(att_AgMaidOrView.getAaiId()!=null ){
					sbuffer.append( " and aaiId=" +att_AgMaidOrView.getAaiId());
				 }
				
				if(att_AgMaidOrView.getSerialNumber()!=null && !"".equals(att_AgMaidOrView.getSerialNumber().trim())){
					sbuffer.append( " and serialNumber like '%" +att_AgMaidOrView.getSerialNumber().trim()+"%'");
				 }
				
				//时间类型开始条件处理  创建时间(createDate)
				  if(att_AgMaidOrView.getCreateDateStart()!=null && !"".equals(att_AgMaidOrView.getCreateDateStart().trim())){
			   	    	sbuffer.append( " and  createDate>='" +att_AgMaidOrView.getCreateDateStart()+"'" );  
					 }
			 	  //时间类型结束条件处理 创建时间(createDate)
				 	if(att_AgMaidOrView.getCreateDateEnd()!=null && !"".equals(att_AgMaidOrView.getCreateDateEnd().trim())){
	 	      			sbuffer.append( " and  createDate<'" +att_AgMaidOrView.getCreateDateEnd()+"'" );  
			  	     } 
				 	
//				patientName	String	患者名称
					if(att_AgMaidOrView.getPatientName() !=null&&
							  !"".equals(att_AgMaidOrView.getPatientName().trim())){ 
									  sbuffer.append( " and patientName   like '%"+att_AgMaidOrView.getPatientName()+"%'"   );
							 }	

					//一级业务员手机
					if(att_AgMaidOrView.getFirstAgentMobile() !=null&&
							  !"".equals(att_AgMaidOrView.getFirstAgentMobile().trim())){ 
									  sbuffer.append( " and firstAgentMobile   like '%"+att_AgMaidOrView.getFirstAgentMobile()+"%'"   ); 
							 }
					//二级业务员手机
					if(att_AgMaidOrView.getSecondAgentMobile() !=null&&
							  !"".equals(att_AgMaidOrView.getSecondAgentMobile().trim())){ 
									  sbuffer.append( " and secondAgentMobile   like '%"+att_AgMaidOrView.getSecondAgentMobile()+"%'"   ); 
							 }	 
					if(att_AgMaidOrView.getShareTopReservedAgentId() !=null){ 
									  sbuffer.append( " and shareTopReservedAgentId   ='"+att_AgMaidOrView.getShareTopReservedAgentId()+"'"   ); 
							 }	 
					sbuffer.append(" order by createDate desc");
			PagerModel pm= this.getHibernateDao().findByPage(sbuffer.toString()); 
			return pm;
	}	
 
}