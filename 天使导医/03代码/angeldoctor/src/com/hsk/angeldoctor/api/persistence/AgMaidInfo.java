package com.hsk.angeldoctor.api.persistence;

import javax.persistence.*; 
import static javax.persistence.GenerationType.IDENTITY;
import java.util.Date;

/**
 * 根据ag_maid_info表结构自动生成持久化对象<B> com.hsk.angeldoctor.api.persistence.AgMaidInfo</B>
 *<hr/>
 *===============数据库表字段属性==========
 *  <table> 
 * <tr><th>字段名称:</th><td>分佣信息ID(amiId)</td><th>字段类型:</th><td>Integer(主键)</td></tr> 
 * <tr><th>字段名称:</th><td>诊疗ID(adiId)</td><th>字段类型:</th><td>Integer(可以为空)</td></tr> 
 * <tr><th>字段名称:</th><td>药品费用(drugFee)</td><th>字段类型:</th><td>Double(可以为空)</td></tr> 
 * <tr><th>字段名称:</th><td>药品费用比例(drugFeePercent)</td><th>字段类型:</th><td>Double(可以为空)</td></tr> 
 * <tr><th>字段名称:</th><td>诊疗费用(treatmentFee)</td><th>字段类型:</th><td>Double</td></tr> 
 * <tr><th>字段名称:</th><td>诊疗费用比例(treatmentFeePercent)</td><th>字段类型:</th><td>Double</td></tr> 
 * <tr><th>字段名称:</th><td>接洽费(receptionFee)</td><th>字段类型:</th><td>Double</td></tr> 
 * <tr><th>字段名称:</th><td>共支付费用(totalFeeToPay)</td><th>字段类型:</th><td>Double</td></tr> 
 * <tr><th>字段名称:</th><td>患者ID(sharePatientId)</td><th>字段类型:</th><td>Integer(可以为空)</td></tr> 
 * <tr><th>字段名称:</th><td>患者补贴金额(sharePatientAmount)</td><th>字段类型:</th><td>Double(可以为空)</td></tr> 
 * <tr><th>字段名称:</th><td>一级代理人ID(shareFirstAgentId)</td><th>字段类型:</th><td>Integer(可以为空)</td></tr> 
 * <tr><th>字段名称:</th><td>一级代理人分佣金额(shareFirstAgentAmount)</td><th>字段类型:</th><td>Double(可以为空)</td></tr> 
 * <tr><th>字段名称:</th><td>二级代理人ID(shareSecondAgentId)</td><th>字段类型:</th><td>Integer(可以为空)</td></tr> 
 * <tr><th>字段名称:</th><td>二级代理人补贴金额(shareSecondAgentAmount)</td><th>字段类型:</th><td>Double(可以为空)</td></tr> 
 * <tr><th>字段名称:</th><td>代理商ID(shareTopOrganizationId)</td><th>字段类型:</th><td>Integer(可以为空)</td></tr> 
 * <tr><th>字段名称:</th><td>代理商分佣金额(shareTopOrganizationAmount)</td><th>字段类型:</th><td>Double(可以为空)</td></tr> 
 * <tr><th>字段名称:</th><td>预约代理人ID(shareTopReservedAgentid)</td><th>字段类型:</th><td>Integer(可以为空)</td></tr> 
 * <tr><th>字段名称:</th><td>预约代理人佣金(shareTopReservedAgentAmount)</td><th>字段类型:</th><td>Double(可以为空)</td></tr> 
 * <tr><th>字段名称:</th><td>平台佣金(sharePortalAmount)</td><th>字段类型:</th><td>Double</td></tr> 
 * <tr><th>字段名称:</th><td>病人是否提现(isPatientWithdraw)</td><th>字段类型:</th><td>String</td></tr> 
 * <tr><th>字段名称:</th><td>病人提现申请ID(patientWithdrawId)</td><th>字段类型:</th><td>Integer(可以为空)</td></tr> 
 * <tr><th>字段名称:</th><td>一级代理人是否提现(isFirstAgentWithdraw)</td><th>字段类型:</th><td>String</td></tr> 
 * <tr><th>字段名称:</th><td>一级代理人提现ID(firstAgentWithdrawId)</td><th>字段类型:</th><td>Integer(可以为空)</td></tr> 
 * <tr><th>字段名称:</th><td>二级代理人是否提现(isSecondAgentWithdraw)</td><th>字段类型:</th><td>String</td></tr> 
 * <tr><th>字段名称:</th><td>二级代理人提现ID(secondAgentWithdrawId)</td><th>字段类型:</th><td>Integer(可以为空)</td></tr> 
 * <tr><th>字段名称:</th><td>代理商是否提现(isTopOrganizationWithdraw)</td><th>字段类型:</th><td>String</td></tr> 
 * <tr><th>字段名称:</th><td>代理商提现ID(topOrganizationWithdrawid)</td><th>字段类型:</th><td>Integer(可以为空)</td></tr> 
 * <tr><th>字段名称:</th><td>预约代理人是否提现(isTopReservedAgentWithdraw)</td><th>字段类型:</th><td>String</td></tr> 
 * <tr><th>字段名称:</th><td>预约代理人提现ID(topReservedAgentWithdrawId)</td><th>字段类型:</th><td>Integer(可以为空)</td></tr> 
 * <tr><th>字段名称:</th><td>状态:0正常(status)</td><th>字段类型:</th><td>String(可以为空)</td></tr> 
 * <tr><th>字段名称:</th><td>创建人(createRen)</td><th>字段类型:</th><td>String(可以为空)</td></tr> 
 * <tr><th>字段名称:</th><td>创建时间(createDate)</td><th>字段类型:</th><td>Date(可以为空)</td></tr> 
 * <tr><th>字段名称:</th><td>修改人(editRen)</td><th>字段类型:</th><td>String(可以为空)</td></tr> 
 * <tr><th>字段名称:</th><td>修改时间(editDate)</td><th>字段类型:</th><td>Date(可以为空)</td></tr> 
 * <tr><th>字段名称:</th><td>修改时间(editDate)</td><th>字段类型:</th><td>Date(可以为空)</td></tr> 
 * <tr><th>字段名称:</th><td>修改时间(editDate)</td><th>字段类型:</th><td>Date(可以为空)</td></tr> 
 * </table>
 *===============无关字段属性===============
 *  <table> 
 * 	<tr><th>字段名称:</th><td>分佣信息ID(amiId)	</td><th>属性名称:</th><td>amiId</td></tr>
 * 	<tr><th>字段名称:</th><td>诊疗ID(adiId)	</td><th>属性名称:</th><td>adiId</td></tr>
 * 	<tr><th>字段名称:</th><td>患者ID(sharePatientId)	</td><th>属性名称:</th><td>sharePatientId</td></tr>
 * 	<tr><th>字段名称:</th><td>一级代理人ID(shareFirstAgentId)	</td><th>属性名称:</th><td>shareFirstAgentId</td></tr>
 * 	<tr><th>字段名称:</th><td>二级代理人ID(shareSecondAgentId)	</td><th>属性名称:</th><td>shareSecondAgentId</td></tr>
 * 	<tr><th>字段名称:</th><td>代理商ID(shareTopOrganizationId)	</td><th>属性名称:</th><td>shareTopOrganizationId</td></tr>
 * 	<tr><th>字段名称:</th><td>预约代理人ID(shareTopReservedAgentid)	</td><th>属性名称:</th><td>shareTopReservedAgentid</td></tr>
 * 	<tr><th>字段名称:</th><td>病人提现申请ID(patientWithdrawId)	</td><th>属性名称:</th><td>patientWithdrawId</td></tr>
 * 	<tr><th>字段名称:</th><td>一级代理人提现ID(firstAgentWithdrawId)	</td><th>属性名称:</th><td>firstAgentWithdrawId</td></tr>
 * 	<tr><th>字段名称:</th><td>二级代理人提现ID(secondAgentWithdrawId)	</td><th>属性名称:</th><td>secondAgentWithdrawId</td></tr>
 * 	<tr><th>字段名称:</th><td>代理商提现ID(topOrganizationWithdrawid)	</td><th>属性名称:</th><td>topOrganizationWithdrawid</td></tr>
 * 	<tr><th>字段名称:</th><td>预约代理人提现ID(topReservedAgentWithdrawId)	</td><th>属性名称:</th><td>topReservedAgentWithdrawId</td></tr>
 *  <tr><th>字段名称:</th><td>预约单号(serialNumber)	</td><th>属性名称:</th><td>serialNumber</td></tr>
 * 	<tr><th>字段名称:</th><td>创建时间(createDate)	</td><th>属性名称:</th><td>createDate</td></tr>
 * 	<tr><th>字段名称:</th><td>预约ID(aoiId)	</td><th>属性名称:</th><td>aoiId</td></tr>
 * 	<tr><th>字段名称:</th><td>消费金额(totalFee)	</td><th>属性名称:</th><td>totalFee</td></tr>
 * 	<tr><th>字段名称:</th><td>修改时间(editDate)	</td><th>属性名称:</th><td>editDate</td></tr>
 * 	<tr><th>字段名称:</th><td>(tab_like)	</td><th>属性名称:</th><td>tab_like</td></tr>
 * 	<tr><th>字段名称:</th><td>(tab_order)	</td><th>属性名称:</th><td>tab_order</td></tr>
 * </table>
 * <hr/>
 * @author  作者:admin  
 * @version  v1.0 创建时间: 2018-08-14 13:31:11
 */
 
 
@SuppressWarnings("serial")
@Entity
@Table(name = "ag_maid_info" )
public class AgMaidInfo {
///===============数据库表字段属性begin==========
			/**
			 *分佣信息ID(amiId):字段类型为Integer  
			 */
 			private Integer amiId; 
 	
			/**
			 *诊疗ID(adiId):字段类型为Integer  
			 */
 			private Integer adiId; 
 			/**
 			 * 预约单号
 			 */
 			private String serialNumber;
			/**
			 *药品费用(drugFee):字段类型为Double  
			 */
 			private Double drugFee; 
 	
			/**
			 *药品费用比例(drugFeePercent):字段类型为Double  
			 */
 			private Double drugFeePercent; 
 	
			/**
			 *诊疗费用(treatmentFee):字段类型为Double  
			 */
 			private Double treatmentFee; 
 	
			/**
			 *诊疗费用比例(treatmentFeePercent):字段类型为Double  
			 */
 			private Double treatmentFeePercent; 
 	
			/**
			 *接洽费(receptionFee):字段类型为Double  
			 */
 			private Double receptionFee; 
 	
			/**
			 *共支付费用(totalFeeToPay):字段类型为Double  
			 */
 			private Double totalFeeToPay; 
 			/**
 			 * 预约ID
 			 */
 			private Integer aoiId;
 			/**
 			 * 消费金额
 			 */
 			private Double totalFee;
			/**
			 *患者ID(sharePatientId):字段类型为Integer  
			 */
 			private Integer sharePatientId; 
 	
			/**
			 *患者补贴金额(sharePatientAmount):字段类型为Double  
			 */
 			private Double sharePatientAmount; 
 	
			/**
			 *一级代理人ID(shareFirstAgentId):字段类型为Integer  
			 */
 			private Integer shareFirstAgentId; 
 	
			/**
			 *一级代理人分佣金额(shareFirstAgentAmount):字段类型为Double  
			 */
 			private Double shareFirstAgentAmount; 
 	
			/**
			 *二级代理人ID(shareSecondAgentId):字段类型为Integer  
			 */
 			private Integer shareSecondAgentId; 
 	
			/**
			 *二级代理人补贴金额(shareSecondAgentAmount):字段类型为Double  
			 */
 			private Double shareSecondAgentAmount; 
 	
			/**
			 *代理商ID(shareTopOrganizationId):字段类型为Integer  
			 */
 			private Integer shareTopOrganizationId; 
 	
			/**
			 *代理商分佣金额(shareTopOrganizationAmount):字段类型为Double  
			 */
 			private Double shareTopOrganizationAmount; 
 	
			/**
			 *预约代理人ID(shareTopReservedAgentid):字段类型为Integer  
			 */
 			private Integer shareTopReservedAgentid; 
 	
			/**
			 *预约代理人佣金(shareTopReservedAgentAmount):字段类型为Double  
			 */
 			private Double shareTopReservedAgentAmount; 
 	
			/**
			 *平台佣金(sharePortalAmount):字段类型为Double  
			 */
 			private Double sharePortalAmount; 
 	
			/**
			 *病人是否提现(isPatientWithdraw):字段类型为String  
			 */
 			private String isPatientWithdraw; 
 	
			/**
			 *病人提现申请ID(patientWithdrawId):字段类型为Integer  
			 */
 			private Integer patientWithdrawId; 
 	
			/**
			 *一级代理人是否提现(isFirstAgentWithdraw):字段类型为String  
			 */
 			private String isFirstAgentWithdraw; 
 	
			/**
			 *一级代理人提现ID(firstAgentWithdrawId):字段类型为Integer  
			 */
 			private Integer firstAgentWithdrawId; 
 	
			/**
			 *二级代理人是否提现(isSecondAgentWithdraw):字段类型为String  
			 */
 			private String isSecondAgentWithdraw; 
 	
			/**
			 *二级代理人提现ID(secondAgentWithdrawId):字段类型为Integer  
			 */
 			private Integer secondAgentWithdrawId; 
 	
			/**
			 *代理商是否提现(isTopOrganizationWithdraw):字段类型为String  
			 */
 			private String isTopOrganizationWithdraw; 
 	
			/**
			 *代理商提现ID(topOrganizationWithdrawid):字段类型为Integer  
			 */
 			private Integer topOrganizationWithdrawid; 
 	
			/**
			 *预约代理人是否提现(isTopReservedAgentWithdraw):字段类型为String  
			 */
 			private String isTopReservedAgentWithdraw; 
 	
			/**
			 *预约代理人提现ID(topReservedAgentWithdrawId):字段类型为Integer  
			 */
 			private Integer topReservedAgentWithdrawId; 
 	
			/**
			 *状态:0正常(status):字段类型为String  
			 */
 			private String status; 
 	
			/**
			 *创建人(createRen):字段类型为String  
			 */
 			private String createRen; 
 	
			/**
			 *创建时间(createDate):字段类型为Date  
			 */
 			private Date createDate; 
 	
			/**
			 *修改人(editRen):字段类型为String  
			 */
 			private String editRen; 
 	
			/**
			 *修改时间(editDate):字段类型为Date  
			 */
 			private Date editDate; 
 	
			/**
			 *设置分佣信息ID(ami_id)字段方法 (该字段是主键)
			 *@return  返回 <b>AgMaidInfo.AmiId</b>的值
			 */	 
			@Id
			@GeneratedValue(strategy = IDENTITY)
			@Column(name = "ami_id")
			public Integer getAmiId(){
			    return this.amiId;
			}

		  /**
		   *设置 ami_id字段方法 
		   *@param att_amiId 输入<b>AgMaidInfo.amiId</b>字段的值
		   */
		  public void setAmiId(Integer att_amiId){
		    this.amiId = att_amiId;
		  }
		  
		  
		  @Column(name = "serial_number")
			public String getSerialNumber() {
			return serialNumber;
		}

		public void setSerialNumber(String serialNumber) {
			this.serialNumber = serialNumber;
		}

			/**
			 *设置诊疗ID(adi_id)字段方法 
			 *@return  返回 <b>AgMaidInfo.AdiId</b>的值
			 */	 
			@Column(name = "adi_id" ) 
			public Integer getAdiId(){
			    return this.adiId;
			}

		  /**
		   *设置 adi_id字段方法 
		   *@param att_adiId 输入<b>AgMaidInfo.adiId</b>字段的值
		   */
		  public void setAdiId(Integer att_adiId){
		    this.adiId = att_adiId;
		  }
  
			/**
			 *设置药品费用(drug_fee)字段方法 
			 *@return  返回 <b>AgMaidInfo.DrugFee</b>的值
			 */	 
			@Column(name = "drug_fee" ) 
			public Double getDrugFee(){
			    return this.drugFee;
			}

		  /**
		   *设置 drug_fee字段方法 
		   *@param att_drugFee 输入<b>AgMaidInfo.drugFee</b>字段的值
		   */
		  public void setDrugFee(Double att_drugFee){
		    this.drugFee = att_drugFee;
		  }
  
			/**
			 *设置药品费用比例(drug_fee_percent)字段方法 
			 *@return  返回 <b>AgMaidInfo.DrugFeePercent</b>的值
			 */	 
			@Column(name = "drug_fee_percent" ) 
			public Double getDrugFeePercent(){
			    return this.drugFeePercent;
			}

		  /**
		   *设置 drug_fee_percent字段方法 
		   *@param att_drugFeePercent 输入<b>AgMaidInfo.drugFeePercent</b>字段的值
		   */
		  public void setDrugFeePercent(Double att_drugFeePercent){
		    this.drugFeePercent = att_drugFeePercent;
		  }
  
			/**
			 *设置诊疗费用(treatment_fee)字段方法 
			 *@return  返回 <b>AgMaidInfo.TreatmentFee</b>的值
			 */	 
			@Column(name = "treatment_fee" ) 
			public Double getTreatmentFee(){
			    return this.treatmentFee;
			}

		  /**
		   *设置 treatment_fee字段方法 
		   *@param att_treatmentFee 输入<b>AgMaidInfo.treatmentFee</b>字段的值
		   */
		  public void setTreatmentFee(Double att_treatmentFee){
		    this.treatmentFee = att_treatmentFee;
		  }
  
			/**
			 *设置诊疗费用比例(treatment_fee_percent)字段方法 
			 *@return  返回 <b>AgMaidInfo.TreatmentFeePercent</b>的值
			 */	 
			@Column(name = "treatment_fee_percent" ) 
			public Double getTreatmentFeePercent(){
			    return this.treatmentFeePercent;
			}

		  /**
		   *设置 treatment_fee_percent字段方法 
		   *@param att_treatmentFeePercent 输入<b>AgMaidInfo.treatmentFeePercent</b>字段的值
		   */
		  public void setTreatmentFeePercent(Double att_treatmentFeePercent){
		    this.treatmentFeePercent = att_treatmentFeePercent;
		  }
  
			/**
			 *设置接洽费(reception_fee)字段方法 
			 *@return  返回 <b>AgMaidInfo.ReceptionFee</b>的值
			 */	 
			@Column(name = "reception_fee" ) 
			public Double getReceptionFee(){
			    return this.receptionFee;
			}

		  /**
		   *设置 reception_fee字段方法 
		   *@param att_receptionFee 输入<b>AgMaidInfo.receptionFee</b>字段的值
		   */
		  public void setReceptionFee(Double att_receptionFee){
		    this.receptionFee = att_receptionFee;
		  }
  
			/**
			 *设置共支付费用(total_fee_to_pay)字段方法 
			 *@return  返回 <b>AgMaidInfo.TotalFeeToPay</b>的值
			 */	 
			@Column(name = "total_fee_to_pay" ) 
			public Double getTotalFeeToPay(){
			    return this.totalFeeToPay;
			}

		  /**
		   *设置 total_fee_to_pay字段方法 
		   *@param att_totalFeeToPay 输入<b>AgMaidInfo.totalFeeToPay</b>字段的值
		   */
		  public void setTotalFeeToPay(Double att_totalFeeToPay){
		    this.totalFeeToPay = att_totalFeeToPay;
		  }
  
			/**
			 *设置患者ID(share_patient_id)字段方法 
			 *@return  返回 <b>AgMaidInfo.SharePatientId</b>的值
			 */	 
			@Column(name = "share_patient_id" ) 
			public Integer getSharePatientId(){
			    return this.sharePatientId;
			}

		  /**
		   *设置 share_patient_id字段方法 
		   *@param att_sharePatientId 输入<b>AgMaidInfo.sharePatientId</b>字段的值
		   */
		  public void setSharePatientId(Integer att_sharePatientId){
		    this.sharePatientId = att_sharePatientId;
		  }
  
			/**
			 *设置患者补贴金额(share_patient_amount)字段方法 
			 *@return  返回 <b>AgMaidInfo.SharePatientAmount</b>的值
			 */	 
			@Column(name = "share_patient_amount" ) 
			public Double getSharePatientAmount(){
			    return this.sharePatientAmount;
			}

		  /**
		   *设置 share_patient_amount字段方法 
		   *@param att_sharePatientAmount 输入<b>AgMaidInfo.sharePatientAmount</b>字段的值
		   */
		  public void setSharePatientAmount(Double att_sharePatientAmount){
		    this.sharePatientAmount = att_sharePatientAmount;
		  }
  
			/**
			 *设置一级代理人ID(share_first_agent_id)字段方法 
			 *@return  返回 <b>AgMaidInfo.ShareFirstAgentId</b>的值
			 */	 
			@Column(name = "share_first_agent_id" ) 
			public Integer getShareFirstAgentId(){
			    return this.shareFirstAgentId;
			}

		  /**
		   *设置 share_first_agent_id字段方法 
		   *@param att_shareFirstAgentId 输入<b>AgMaidInfo.shareFirstAgentId</b>字段的值
		   */
		  public void setShareFirstAgentId(Integer att_shareFirstAgentId){
		    this.shareFirstAgentId = att_shareFirstAgentId;
		  }
  
			/**
			 *设置一级代理人分佣金额(share_first_agent_amount)字段方法 
			 *@return  返回 <b>AgMaidInfo.ShareFirstAgentAmount</b>的值
			 */	 
			@Column(name = "share_first_agent_amount" ) 
			public Double getShareFirstAgentAmount(){
			    return this.shareFirstAgentAmount;
			}

		  /**
		   *设置 share_first_agent_amount字段方法 
		   *@param att_shareFirstAgentAmount 输入<b>AgMaidInfo.shareFirstAgentAmount</b>字段的值
		   */
		  public void setShareFirstAgentAmount(Double att_shareFirstAgentAmount){
		    this.shareFirstAgentAmount = att_shareFirstAgentAmount;
		  }
  
			/**
			 *设置二级代理人ID(share_second_agent_id)字段方法 
			 *@return  返回 <b>AgMaidInfo.ShareSecondAgentId</b>的值
			 */	 
			@Column(name = "share_second_agent_id" ) 
			public Integer getShareSecondAgentId(){
			    return this.shareSecondAgentId;
			}

		  /**
		   *设置 share_second_agent_id字段方法 
		   *@param att_shareSecondAgentId 输入<b>AgMaidInfo.shareSecondAgentId</b>字段的值
		   */
		  public void setShareSecondAgentId(Integer att_shareSecondAgentId){
		    this.shareSecondAgentId = att_shareSecondAgentId;
		  }
  
			/**
			 *设置二级代理人补贴金额(share_second_agent_amount)字段方法 
			 *@return  返回 <b>AgMaidInfo.ShareSecondAgentAmount</b>的值
			 */	 
			@Column(name = "share_second_agent_amount" ) 
			public Double getShareSecondAgentAmount(){
			    return this.shareSecondAgentAmount;
			}

		  /**
		   *设置 share_second_agent_amount字段方法 
		   *@param att_shareSecondAgentAmount 输入<b>AgMaidInfo.shareSecondAgentAmount</b>字段的值
		   */
		  public void setShareSecondAgentAmount(Double att_shareSecondAgentAmount){
		    this.shareSecondAgentAmount = att_shareSecondAgentAmount;
		  }
  
			/**
			 *设置代理商ID(share_top_organization_id)字段方法 
			 *@return  返回 <b>AgMaidInfo.ShareTopOrganizationId</b>的值
			 */	 
			@Column(name = "share_top_organization_id" ) 
			public Integer getShareTopOrganizationId(){
			    return this.shareTopOrganizationId;
			}

		  /**
		   *设置 share_top_organization_id字段方法 
		   *@param att_shareTopOrganizationId 输入<b>AgMaidInfo.shareTopOrganizationId</b>字段的值
		   */
		  public void setShareTopOrganizationId(Integer att_shareTopOrganizationId){
		    this.shareTopOrganizationId = att_shareTopOrganizationId;
		  }
  
			/**
			 *设置代理商分佣金额(share_top_organization_amount)字段方法 
			 *@return  返回 <b>AgMaidInfo.ShareTopOrganizationAmount</b>的值
			 */	 
			@Column(name = "share_top_organization_amount" ) 
			public Double getShareTopOrganizationAmount(){
			    return this.shareTopOrganizationAmount;
			}

		  /**
		   *设置 share_top_organization_amount字段方法 
		   *@param att_shareTopOrganizationAmount 输入<b>AgMaidInfo.shareTopOrganizationAmount</b>字段的值
		   */
		  public void setShareTopOrganizationAmount(Double att_shareTopOrganizationAmount){
		    this.shareTopOrganizationAmount = att_shareTopOrganizationAmount;
		  }
  
			/**
			 *设置预约代理人ID(share_top_reserved_agentId)字段方法 
			 *@return  返回 <b>AgMaidInfo.ShareTopReservedAgentid</b>的值
			 */	 
			@Column(name = "share_top_reserved_agentId" ) 
			public Integer getShareTopReservedAgentid(){
			    return this.shareTopReservedAgentid;
			}

		  /**
		   *设置 share_top_reserved_agentId字段方法 
		   *@param att_shareTopReservedAgentid 输入<b>AgMaidInfo.shareTopReservedAgentid</b>字段的值
		   */
		  public void setShareTopReservedAgentid(Integer att_shareTopReservedAgentid){
		    this.shareTopReservedAgentid = att_shareTopReservedAgentid;
		  }
  
			/**
			 *设置预约代理人佣金(share_top_reserved_agent_amount)字段方法 
			 *@return  返回 <b>AgMaidInfo.ShareTopReservedAgentAmount</b>的值
			 */	 
			@Column(name = "share_top_reserved_agent_amount" ) 
			public Double getShareTopReservedAgentAmount(){
			    return this.shareTopReservedAgentAmount;
			}

		  /**
		   *设置 share_top_reserved_agent_amount字段方法 
		   *@param att_shareTopReservedAgentAmount 输入<b>AgMaidInfo.shareTopReservedAgentAmount</b>字段的值
		   */
		  public void setShareTopReservedAgentAmount(Double att_shareTopReservedAgentAmount){
		    this.shareTopReservedAgentAmount = att_shareTopReservedAgentAmount;
		  }
  
			/**
			 *设置平台佣金(share_portal_amount)字段方法 
			 *@return  返回 <b>AgMaidInfo.SharePortalAmount</b>的值
			 */	 
			@Column(name = "share_portal_amount" ) 
			public Double getSharePortalAmount(){
			    return this.sharePortalAmount;
			}

		  /**
		   *设置 share_portal_amount字段方法 
		   *@param att_sharePortalAmount 输入<b>AgMaidInfo.sharePortalAmount</b>字段的值
		   */
		  public void setSharePortalAmount(Double att_sharePortalAmount){
		    this.sharePortalAmount = att_sharePortalAmount;
		  }
  
			/**
			 *设置病人是否提现(is_patient_withdraw)字段方法 
			 *@return  返回 <b>AgMaidInfo.IsPatientWithdraw</b>的值
			 */	 
			@Column(name = "is_patient_withdraw" ) 
			public String getIsPatientWithdraw(){
			    return this.isPatientWithdraw;
			}

		  /**
		   *设置 is_patient_withdraw字段方法 
		   *@param att_isPatientWithdraw 输入<b>AgMaidInfo.isPatientWithdraw</b>字段的值
		   */
		  public void setIsPatientWithdraw(String att_isPatientWithdraw){
		    this.isPatientWithdraw = att_isPatientWithdraw;
		  }
  
			/**
			 *设置病人提现申请ID(patient_withdraw_id)字段方法 
			 *@return  返回 <b>AgMaidInfo.PatientWithdrawId</b>的值
			 */	 
			@Column(name = "patient_withdraw_id" ) 
			public Integer getPatientWithdrawId(){
			    return this.patientWithdrawId;
			}

		  /**
		   *设置 patient_withdraw_id字段方法 
		   *@param att_patientWithdrawId 输入<b>AgMaidInfo.patientWithdrawId</b>字段的值
		   */
		  public void setPatientWithdrawId(Integer att_patientWithdrawId){
		    this.patientWithdrawId = att_patientWithdrawId;
		  }
  
			/**
			 *设置一级代理人是否提现(is_first_agent_withdraw)字段方法 
			 *@return  返回 <b>AgMaidInfo.IsFirstAgentWithdraw</b>的值
			 */	 
			@Column(name = "is_first_agent_withdraw" ) 
			public String getIsFirstAgentWithdraw(){
			    return this.isFirstAgentWithdraw;
			}

		  /**
		   *设置 is_first_agent_withdraw字段方法 
		   *@param att_isFirstAgentWithdraw 输入<b>AgMaidInfo.isFirstAgentWithdraw</b>字段的值
		   */
		  public void setIsFirstAgentWithdraw(String att_isFirstAgentWithdraw){
		    this.isFirstAgentWithdraw = att_isFirstAgentWithdraw;
		  }
  
			/**
			 *设置一级代理人提现ID(first_agent_withdraw_id)字段方法 
			 *@return  返回 <b>AgMaidInfo.FirstAgentWithdrawId</b>的值
			 */	 
			@Column(name = "first_agent_withdraw_id" ) 
			public Integer getFirstAgentWithdrawId(){
			    return this.firstAgentWithdrawId;
			}

		  /**
		   *设置 first_agent_withdraw_id字段方法 
		   *@param att_firstAgentWithdrawId 输入<b>AgMaidInfo.firstAgentWithdrawId</b>字段的值
		   */
		  public void setFirstAgentWithdrawId(Integer att_firstAgentWithdrawId){
		    this.firstAgentWithdrawId = att_firstAgentWithdrawId;
		  }
  
			/**
			 *设置二级代理人是否提现(is_second_agent_withdraw)字段方法 
			 *@return  返回 <b>AgMaidInfo.IsSecondAgentWithdraw</b>的值
			 */	 
			@Column(name = "is_second_agent_withdraw" ) 
			public String getIsSecondAgentWithdraw(){
			    return this.isSecondAgentWithdraw;
			}

		  /**
		   *设置 is_second_agent_withdraw字段方法 
		   *@param att_isSecondAgentWithdraw 输入<b>AgMaidInfo.isSecondAgentWithdraw</b>字段的值
		   */
		  public void setIsSecondAgentWithdraw(String att_isSecondAgentWithdraw){
		    this.isSecondAgentWithdraw = att_isSecondAgentWithdraw;
		  }
  
			/**
			 *设置二级代理人提现ID(second_agent_withdraw_id)字段方法 
			 *@return  返回 <b>AgMaidInfo.SecondAgentWithdrawId</b>的值
			 */	 
			@Column(name = "second_agent_withdraw_id" ) 
			public Integer getSecondAgentWithdrawId(){
			    return this.secondAgentWithdrawId;
			}

		  /**
		   *设置 second_agent_withdraw_id字段方法 
		   *@param att_secondAgentWithdrawId 输入<b>AgMaidInfo.secondAgentWithdrawId</b>字段的值
		   */
		  public void setSecondAgentWithdrawId(Integer att_secondAgentWithdrawId){
		    this.secondAgentWithdrawId = att_secondAgentWithdrawId;
		  }
  
			/**
			 *设置代理商是否提现(is_top_organization_withdraw)字段方法 
			 *@return  返回 <b>AgMaidInfo.IsTopOrganizationWithdraw</b>的值
			 */	 
			@Column(name = "is_top_organization_withdraw" ) 
			public String getIsTopOrganizationWithdraw(){
			    return this.isTopOrganizationWithdraw;
			}

		  /**
		   *设置 is_top_organization_withdraw字段方法 
		   *@param att_isTopOrganizationWithdraw 输入<b>AgMaidInfo.isTopOrganizationWithdraw</b>字段的值
		   */
		  public void setIsTopOrganizationWithdraw(String att_isTopOrganizationWithdraw){
		    this.isTopOrganizationWithdraw = att_isTopOrganizationWithdraw;
		  }
  
			/**
			 *设置代理商提现ID(top_organization_withdrawId)字段方法 
			 *@return  返回 <b>AgMaidInfo.TopOrganizationWithdrawid</b>的值
			 */	 
			@Column(name = "top_organization_withdrawId" ) 
			public Integer getTopOrganizationWithdrawid(){
			    return this.topOrganizationWithdrawid;
			}

		  /**
		   *设置 top_organization_withdrawId字段方法 
		   *@param att_topOrganizationWithdrawid 输入<b>AgMaidInfo.topOrganizationWithdrawid</b>字段的值
		   */
		  public void setTopOrganizationWithdrawid(Integer att_topOrganizationWithdrawid){
		    this.topOrganizationWithdrawid = att_topOrganizationWithdrawid;
		  }
  
			/**
			 *设置预约代理人是否提现(is_top_reserved_agent_withdraw)字段方法 
			 *@return  返回 <b>AgMaidInfo.IsTopReservedAgentWithdraw</b>的值
			 */	 
			@Column(name = "is_top_reserved_agent_withdraw" ) 
			public String getIsTopReservedAgentWithdraw(){
			    return this.isTopReservedAgentWithdraw;
			}

		  /**
		   *设置 is_top_reserved_agent_withdraw字段方法 
		   *@param att_isTopReservedAgentWithdraw 输入<b>AgMaidInfo.isTopReservedAgentWithdraw</b>字段的值
		   */
		  public void setIsTopReservedAgentWithdraw(String att_isTopReservedAgentWithdraw){
		    this.isTopReservedAgentWithdraw = att_isTopReservedAgentWithdraw;
		  }
  
			/**
			 *设置预约代理人提现ID(top_reserved_agent_withdraw_id)字段方法 
			 *@return  返回 <b>AgMaidInfo.TopReservedAgentWithdrawId</b>的值
			 */	 
			@Column(name = "top_reserved_agent_withdraw_id" ) 
			public Integer getTopReservedAgentWithdrawId(){
			    return this.topReservedAgentWithdrawId;
			}

		  /**
		   *设置 top_reserved_agent_withdraw_id字段方法 
		   *@param att_topReservedAgentWithdrawId 输入<b>AgMaidInfo.topReservedAgentWithdrawId</b>字段的值
		   */
		  public void setTopReservedAgentWithdrawId(Integer att_topReservedAgentWithdrawId){
		    this.topReservedAgentWithdrawId = att_topReservedAgentWithdrawId;
		  }
  
			/**
			 *设置状态:0正常(status)字段方法 
			 *@return  返回 <b>AgMaidInfo.Status</b>的值
			 */	 
			@Column(name = "status" ) 
			public String getStatus(){
			    return this.status;
			}

		  /**
		   *设置 status字段方法 
		   *@param att_status 输入<b>AgMaidInfo.status</b>字段的值
		   */
		  public void setStatus(String att_status){
		    this.status = att_status;
		  }
  
			/**
			 *设置创建人(create_ren)字段方法 
			 *@return  返回 <b>AgMaidInfo.CreateRen</b>的值
			 */	 
			@Column(name = "create_ren" ) 
			public String getCreateRen(){
			    return this.createRen;
			}

		  /**
		   *设置 create_ren字段方法 
		   *@param att_createRen 输入<b>AgMaidInfo.createRen</b>字段的值
		   */
		  public void setCreateRen(String att_createRen){
		    this.createRen = att_createRen;
		  }
  
			/**
			 *设置创建时间(create_date)字段方法 
			 *@return  返回 <b>AgMaidInfo.CreateDate</b>的值
			 */	 
			@Temporal(TemporalType.TIMESTAMP)
			@Column(name = "create_date" ) 
			public Date getCreateDate(){
			    return this.createDate;
			}

		  /**
		   *设置 create_date字段方法 
		   *@param att_createDate 输入<b>AgMaidInfo.createDate</b>字段的值
		   */
		  public void setCreateDate(Date att_createDate){
		    this.createDate = att_createDate;
		  }
  
			/**
			 *设置修改人(edit_ren)字段方法 
			 *@return  返回 <b>AgMaidInfo.EditRen</b>的值
			 */	 
			@Column(name = "edit_ren" ) 
			public String getEditRen(){
			    return this.editRen;
			}

		  /**
		   *设置 edit_ren字段方法 
		   *@param att_editRen 输入<b>AgMaidInfo.editRen</b>字段的值
		   */
		  public void setEditRen(String att_editRen){
		    this.editRen = att_editRen;
		  }
  
			/**
			 *设置修改时间(edit_date)字段方法 
			 *@return  返回 <b>AgMaidInfo.EditDate</b>的值
			 */	 
			@Temporal(TemporalType.TIMESTAMP)
			@Column(name = "edit_date" ) 
			public Date getEditDate(){
			    return this.editDate;
			}

		  /**
		   *设置 edit_date字段方法 
		   *@param att_editDate 输入<b>AgMaidInfo.editDate</b>字段的值
		   */
		  public void setEditDate(Date att_editDate){
		    this.editDate = att_editDate;
		  }
		  @Column(name = "aoi_id" )
		  public Integer getAoiId() {
				return aoiId;
			}

			public void setAoiId(Integer aoiId) {
				this.aoiId = aoiId;
			}
			@Column(name = "total_fee" )
			public Double getTotalFee() {
				return totalFee;
			}

			public void setTotalFee(Double totalFee) {
				this.totalFee = totalFee;
			}
  

///===============数据库表字段属性end==========

			///===============数据库表无关子段字段属性begin==========
			/**
			 *分佣信息ID(ami_id):字段类型为String
			 */
		  private String amiId_str;  
			/**
			 *诊疗ID(adi_id):字段类型为String
			 */
		  private String adiId_str;  
			/**
			 *患者ID(share_patient_id):字段类型为String
			 */
		  private String sharePatientId_str;  
			/**
			 *一级代理人ID(share_first_agent_id):字段类型为String
			 */
		  private String shareFirstAgentId_str;  
			/**
			 *二级代理人ID(share_second_agent_id):字段类型为String
			 */
		  private String shareSecondAgentId_str;  
			/**
			 *代理商ID(share_top_organization_id):字段类型为String
			 */
		  private String shareTopOrganizationId_str;  
			/**
			 *预约代理人ID(share_top_reserved_agentId):字段类型为String
			 */
		  private String shareTopReservedAgentid_str;  
			/**
			 *病人提现申请ID(patient_withdraw_id):字段类型为String
			 */
		  private String patientWithdrawId_str;  
			/**
			 *一级代理人提现ID(first_agent_withdraw_id):字段类型为String
			 */
		  private String firstAgentWithdrawId_str;  
			/**
			 *二级代理人提现ID(second_agent_withdraw_id):字段类型为String
			 */
		  private String secondAgentWithdrawId_str;  
			/**
			 *代理商提现ID(top_organization_withdrawId):字段类型为String
			 */
		  private String topOrganizationWithdrawid_str;  
			/**
			 *预约代理人提现ID(top_reserved_agent_withdraw_id):字段类型为String
			 */
		  private String topReservedAgentWithdrawId_str;  
			/**
			 *创建时间(create_date):字段类型为Date
			 */
		  private Date createDate_start;  
			/**
			 *创建时间(create_date):字段类型为Date
			 */
		  private Date createDate_end;  
			/**
			 *修改时间(edit_date):字段类型为Date
			 */
		  private Date editDate_start;  
			/**
			 *修改时间(edit_date):字段类型为Date
			 */
		  private Date editDate_end;  
			/**
			 *():字段类型为String
			 *ag_maid_info表里不用like作为条件的字符串
			 */
		  private String Tab_like;  
			/**
			 *():字段类型为String
			 *ag_maid_info表里order by 字符串
			 */
		  private String Tab_order;  
			/**
			 *设置amiId字段方法  
			 *@return  返回 <b>AgMaidInfo.amiId</b>的值
			 */ 
			@Transient
			public String getAmiId_str(){
				return this.amiId_str;
			}
			/**
			  *设置 ami_id字段方法 
			  *@param att_amiId 输入<b>AgMaidInfo.amiId</b>字段的值
			  */
			public void setAmiId_str(String att_amiId_str){
				this.amiId_str = att_amiId_str;
			}
			/**
			 *设置adiId字段方法  
			 *@return  返回 <b>AgMaidInfo.adiId</b>的值
			 */ 
			@Transient
			public String getAdiId_str(){
				return this.adiId_str;
			}
			/**
			  *设置 adi_id字段方法 
			  *@param att_adiId 输入<b>AgMaidInfo.adiId</b>字段的值
			  */
			public void setAdiId_str(String att_adiId_str){
				this.adiId_str = att_adiId_str;
			}
			/**
			 *设置sharePatientId字段方法  
			 *@return  返回 <b>AgMaidInfo.sharePatientId</b>的值
			 */ 
			@Transient
			public String getSharePatientId_str(){
				return this.sharePatientId_str;
			}
			/**
			  *设置 share_patient_id字段方法 
			  *@param att_sharePatientId 输入<b>AgMaidInfo.sharePatientId</b>字段的值
			  */
			public void setSharePatientId_str(String att_sharePatientId_str){
				this.sharePatientId_str = att_sharePatientId_str;
			}
			/**
			 *设置shareFirstAgentId字段方法  
			 *@return  返回 <b>AgMaidInfo.shareFirstAgentId</b>的值
			 */ 
			@Transient
			public String getShareFirstAgentId_str(){
				return this.shareFirstAgentId_str;
			}
			/**
			  *设置 share_first_agent_id字段方法 
			  *@param att_shareFirstAgentId 输入<b>AgMaidInfo.shareFirstAgentId</b>字段的值
			  */
			public void setShareFirstAgentId_str(String att_shareFirstAgentId_str){
				this.shareFirstAgentId_str = att_shareFirstAgentId_str;
			}
			/**
			 *设置shareSecondAgentId字段方法  
			 *@return  返回 <b>AgMaidInfo.shareSecondAgentId</b>的值
			 */ 
			@Transient
			public String getShareSecondAgentId_str(){
				return this.shareSecondAgentId_str;
			}
			/**
			  *设置 share_second_agent_id字段方法 
			  *@param att_shareSecondAgentId 输入<b>AgMaidInfo.shareSecondAgentId</b>字段的值
			  */
			public void setShareSecondAgentId_str(String att_shareSecondAgentId_str){
				this.shareSecondAgentId_str = att_shareSecondAgentId_str;
			}
			/**
			 *设置shareTopOrganizationId字段方法  
			 *@return  返回 <b>AgMaidInfo.shareTopOrganizationId</b>的值
			 */ 
			@Transient
			public String getShareTopOrganizationId_str(){
				return this.shareTopOrganizationId_str;
			}
			/**
			  *设置 share_top_organization_id字段方法 
			  *@param att_shareTopOrganizationId 输入<b>AgMaidInfo.shareTopOrganizationId</b>字段的值
			  */
			public void setShareTopOrganizationId_str(String att_shareTopOrganizationId_str){
				this.shareTopOrganizationId_str = att_shareTopOrganizationId_str;
			}
			/**
			 *设置shareTopReservedAgentid字段方法  
			 *@return  返回 <b>AgMaidInfo.shareTopReservedAgentid</b>的值
			 */ 
			@Transient
			public String getShareTopReservedAgentid_str(){
				return this.shareTopReservedAgentid_str;
			}
			/**
			  *设置 share_top_reserved_agentId字段方法 
			  *@param att_shareTopReservedAgentid 输入<b>AgMaidInfo.shareTopReservedAgentid</b>字段的值
			  */
			public void setShareTopReservedAgentid_str(String att_shareTopReservedAgentid_str){
				this.shareTopReservedAgentid_str = att_shareTopReservedAgentid_str;
			}
			/**
			 *设置patientWithdrawId字段方法  
			 *@return  返回 <b>AgMaidInfo.patientWithdrawId</b>的值
			 */ 
			@Transient
			public String getPatientWithdrawId_str(){
				return this.patientWithdrawId_str;
			}
			/**
			  *设置 patient_withdraw_id字段方法 
			  *@param att_patientWithdrawId 输入<b>AgMaidInfo.patientWithdrawId</b>字段的值
			  */
			public void setPatientWithdrawId_str(String att_patientWithdrawId_str){
				this.patientWithdrawId_str = att_patientWithdrawId_str;
			}
			/**
			 *设置firstAgentWithdrawId字段方法  
			 *@return  返回 <b>AgMaidInfo.firstAgentWithdrawId</b>的值
			 */ 
			@Transient
			public String getFirstAgentWithdrawId_str(){
				return this.firstAgentWithdrawId_str;
			}
			/**
			  *设置 first_agent_withdraw_id字段方法 
			  *@param att_firstAgentWithdrawId 输入<b>AgMaidInfo.firstAgentWithdrawId</b>字段的值
			  */
			public void setFirstAgentWithdrawId_str(String att_firstAgentWithdrawId_str){
				this.firstAgentWithdrawId_str = att_firstAgentWithdrawId_str;
			}
			/**
			 *设置secondAgentWithdrawId字段方法  
			 *@return  返回 <b>AgMaidInfo.secondAgentWithdrawId</b>的值
			 */ 
			@Transient
			public String getSecondAgentWithdrawId_str(){
				return this.secondAgentWithdrawId_str;
			}
			/**
			  *设置 second_agent_withdraw_id字段方法 
			  *@param att_secondAgentWithdrawId 输入<b>AgMaidInfo.secondAgentWithdrawId</b>字段的值
			  */
			public void setSecondAgentWithdrawId_str(String att_secondAgentWithdrawId_str){
				this.secondAgentWithdrawId_str = att_secondAgentWithdrawId_str;
			}
			/**
			 *设置topOrganizationWithdrawid字段方法  
			 *@return  返回 <b>AgMaidInfo.topOrganizationWithdrawid</b>的值
			 */ 
			@Transient
			public String getTopOrganizationWithdrawid_str(){
				return this.topOrganizationWithdrawid_str;
			}
			/**
			  *设置 top_organization_withdrawId字段方法 
			  *@param att_topOrganizationWithdrawid 输入<b>AgMaidInfo.topOrganizationWithdrawid</b>字段的值
			  */
			public void setTopOrganizationWithdrawid_str(String att_topOrganizationWithdrawid_str){
				this.topOrganizationWithdrawid_str = att_topOrganizationWithdrawid_str;
			}
			/**
			 *设置topReservedAgentWithdrawId字段方法  
			 *@return  返回 <b>AgMaidInfo.topReservedAgentWithdrawId</b>的值
			 */ 
			@Transient
			public String getTopReservedAgentWithdrawId_str(){
				return this.topReservedAgentWithdrawId_str;
			}
			/**
			  *设置 top_reserved_agent_withdraw_id字段方法 
			  *@param att_topReservedAgentWithdrawId 输入<b>AgMaidInfo.topReservedAgentWithdrawId</b>字段的值
			  */
			public void setTopReservedAgentWithdrawId_str(String att_topReservedAgentWithdrawId_str){
				this.topReservedAgentWithdrawId_str = att_topReservedAgentWithdrawId_str;
			}
			/**
			 *设置createDate字段方法  
			 *@return  返回 <b>AgMaidInfo.createDate</b>的值
			 */ 
			@Transient
			public Date getCreateDate_start(){
				return this.createDate_start;
			}
			/**
			  *设置 create_date字段方法 
			  *@param att_createDate 输入<b>AgMaidInfo.createDate</b>字段的值
			  */
			public void setCreateDate_start(Date att_createDate_start){
				this.createDate_start = att_createDate_start;
			}
			/**
			 *设置createDate字段方法  
			 *@return  返回 <b>AgMaidInfo.createDate</b>的值
			 */ 
			@Transient
			public Date getCreateDate_end(){
				return this.createDate_end;
			}
			/**
			  *设置 create_date字段方法 
			  *@param att_createDate 输入<b>AgMaidInfo.createDate</b>字段的值
			  */
			public void setCreateDate_end(Date att_createDate_end){
				this.createDate_end = att_createDate_end;
			}
			/**
			 *设置editDate字段方法  
			 *@return  返回 <b>AgMaidInfo.editDate</b>的值
			 */ 
			@Transient
			public Date getEditDate_start(){
				return this.editDate_start;
			}
			/**
			  *设置 edit_date字段方法 
			  *@param att_editDate 输入<b>AgMaidInfo.editDate</b>字段的值
			  */
			public void setEditDate_start(Date att_editDate_start){
				this.editDate_start = att_editDate_start;
			}
			/**
			 *设置editDate字段方法  
			 *@return  返回 <b>AgMaidInfo.editDate</b>的值
			 */ 
			@Transient
			public Date getEditDate_end(){
				return this.editDate_end;
			}
			/**
			  *设置 edit_date字段方法 
			  *@param att_editDate 输入<b>AgMaidInfo.editDate</b>字段的值
			  */
			public void setEditDate_end(Date att_editDate_end){
				this.editDate_end = att_editDate_end;
			}
			/**
			 *设置tab_like字段方法  
			 *@return  返回 <b>AgMaidInfo.tab_like</b>的值
			 */ 
			@Transient
			public String getTab_like(){
				return this.Tab_like;
			}
			/**
			  *设置 字段方法 
			  *@param att_tab_like 输入<b>AgMaidInfo.tab_like</b>字段的值
			  */
			public void setTab_like(String att_Tab_like){
				this.Tab_like = att_Tab_like;
			}
			/**
			 *设置tab_order字段方法  
			 *@return  返回 <b>AgMaidInfo.tab_order</b>的值
			 */ 
			@Transient
			public String getTab_order(){
				return this.Tab_order;
			}
			/**
			  *设置 字段方法 
			  *@param att_tab_order 输入<b>AgMaidInfo.tab_order</b>字段的值
			  */
			public void setTab_order(String att_Tab_order){
				this.Tab_order = att_Tab_order;
			}
///===============数据库表无关子段字段属性end==========
} 