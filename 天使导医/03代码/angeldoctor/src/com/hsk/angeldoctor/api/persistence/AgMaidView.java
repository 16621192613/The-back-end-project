package com.hsk.angeldoctor.api.persistence;

import java.sql.Timestamp;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Transient;

/**
 * 
 * 
 * 分佣视图持久化对象
 * 
 * @author xun
 */
@Entity
@Table(name = "ag_maid_view" )
public class AgMaidView {


	private Integer awmgId;
	private Integer awiId;
	private String withdrawNumber;
	private String contextName;
	private String contextAccountName;
	private String withdrawType;
	private Integer amiId;
	private Integer adiId;
	private Integer aoiId;
	private Double drugFee;
	private Double drugFeePercent;
	private Double treatmentFee;
	private Double treatmentFeePercent;
	private Double totalFee;
	private Double receptionFee;
	private Double totalFeeToPay;
	private Integer sharePatientId;
	private Double sharePatientAmount;
	private Integer shareFirstAgentId;
	private Double shareFirstAgentAmount;
	private Integer shareSecondAgentId;
	private Double shareSecondAgentAmount;
	private Integer shareTopOrganizationId;
	private Double shareTopOrganizationAmount;
	private Integer shareTopReservedAgentId;
	private Double shareTopReservedAgentAmount;
	private Double sharePortalAmount;
	private String isPatientWithdraw;
	private Integer patientWithdrawId;
	private String isFirstAgentWithdraw;
	private Integer firstAgentWithdrawId;
	private String isSecondAgentWithdraw;
	private Integer secondAgentWithdrawId;
	private String isTopOrganizationWithdraw;
	private Integer topOrganizationWithdrawId;
	private String isTopReservedAgentWithdraw;
	private Integer topReservedAgentWithdrawId;
	private String status;
	private String createRen;
	private Date createDate;
	private String editRen;
	private Date editDate;
	private String patientName;
	private String patientMobile;
	private String organizationName;
	private String patientSource;
	private String agentMobile;
	private String agentName;
	private Date orderTime;
	private String firstAgentName;
	private String firstAgentMobile;
	private String secondAgentName;
	private String secondAgentMobile;
	
	private String serialNumber;
	/**
	 * 平台佣金比例
	 */
	private Double platformSharePercent;
	/**
	 * 患者分润比例
	 */
	private Double patientSharePercent;
	/**
	 * 一级业务员分润比例
	 */
	private Double primarySalesmanSharePercent;
	/**
	 * 二级业务员分润比例
	 */
	private Double secondarySalesmanSharePercent;
	/**
	 * 医院分润比例
	 */
	private Double organizationSharePercent;
	
	/**
	 * 代理商分润比例
	 */
	private Double reservedSharePercent;
	
	
	
	@Column(name = "serial_Number" ) 
	public String getSerialNumber() {
		return serialNumber;
	}

	public void setSerialNumber(String serialNumber) {
		this.serialNumber = serialNumber;
	}

	@Column(name = "reserved_share_percent" )
	public Double getReservedSharePercent() {
		return reservedSharePercent;
	}

	public void setReservedSharePercent(Double reservedSharePercent) {
		this.reservedSharePercent = reservedSharePercent;
	}
	 
	// Constructors

	/** default constructor */
	public AgMaidView() {
	}

	/** minimal constructor */
	public AgMaidView(Integer awmgId) {
		this.awmgId = awmgId;
	}

 
	public AgMaidView(Integer awmgId, Integer awiId, String withdrawNumber,
			String contextName, String withdrawType, Integer amiId,
			Integer adiId, Integer aoiId, Double drugFee,
			Double drugFeePercent, Double treatmentFee,
			Double treatmentFeePercent, Double totalFee, Double receptionFee,
			Double totalFeeToPay, Integer sharePatientId,
			Double sharePatientAmount, Integer shareFirstAgentId,
			Double shareFirstAgentAmount, Integer shareSecondAgentId,
			Double shareSecondAgentAmount, Integer shareTopOrganizationId,
			Double shareTopOrganizationAmount, Integer shareTopReservedAgentId,
			Double shareTopReservedAgentAmount, Double sharePortalAmount,
			String isPatientWithdraw, Integer patientWithdrawId,
			String isFirstAgentWithdraw, Integer firstAgentWithdrawId,
			String isSecondAgentWithdraw, Integer secondAgentWithdrawId,
			String isTopOrganizationWithdraw,
			Integer topOrganizationWithdrawId,
			String isTopReservedAgentWithdraw,
			Integer topReservedAgentWithdrawId, String status,
			String createRen, Timestamp createDate, String editRen,
			Timestamp editDate, String patientName, String patientMobile,
			String organizationName, String patientSource, String agentMobile,
			String agentName, Timestamp orderTime, String firstAgentName,
			String firstAgentMobile, String secondAgentName,
			String secondAgentMobile, Double platformSharePercent,
			Double patientSharePercent, Double primarySalesmanSharePercent,
			Double secondarySalesmanSharePercent,
			Double organizationSharePercent) {
		this.awmgId = awmgId;
		this.awiId = awiId;
		this.withdrawNumber = withdrawNumber;
		this.contextName = contextName;
		this.withdrawType = withdrawType;
		this.amiId = amiId;
		this.adiId = adiId;
		this.aoiId = aoiId;
		this.drugFee = drugFee;
		this.drugFeePercent = drugFeePercent;
		this.treatmentFee = treatmentFee;
		this.treatmentFeePercent = treatmentFeePercent;
		this.totalFee = totalFee;
		this.receptionFee = receptionFee;
		this.totalFeeToPay = totalFeeToPay;
		this.sharePatientId = sharePatientId;
		this.sharePatientAmount = sharePatientAmount;
		this.shareFirstAgentId = shareFirstAgentId;
		this.shareFirstAgentAmount = shareFirstAgentAmount;
		this.shareSecondAgentId = shareSecondAgentId;
		this.shareSecondAgentAmount = shareSecondAgentAmount;
		this.shareTopOrganizationId = shareTopOrganizationId;
		this.shareTopOrganizationAmount = shareTopOrganizationAmount;
		this.shareTopReservedAgentId = shareTopReservedAgentId;
		this.shareTopReservedAgentAmount = shareTopReservedAgentAmount;
		this.sharePortalAmount = sharePortalAmount;
		this.isPatientWithdraw = isPatientWithdraw;
		this.patientWithdrawId = patientWithdrawId;
		this.isFirstAgentWithdraw = isFirstAgentWithdraw;
		this.firstAgentWithdrawId = firstAgentWithdrawId;
		this.isSecondAgentWithdraw = isSecondAgentWithdraw;
		this.secondAgentWithdrawId = secondAgentWithdrawId;
		this.isTopOrganizationWithdraw = isTopOrganizationWithdraw;
		this.topOrganizationWithdrawId = topOrganizationWithdrawId;
		this.isTopReservedAgentWithdraw = isTopReservedAgentWithdraw;
		this.topReservedAgentWithdrawId = topReservedAgentWithdrawId;
		this.status = status;
		this.createRen = createRen;
		this.createDate = createDate;
		this.editRen = editRen;
		this.editDate = editDate;
		this.patientName = patientName;
		this.patientMobile = patientMobile;
		this.organizationName = organizationName;
		this.patientSource = patientSource;
		this.agentMobile = agentMobile;
		this.agentName = agentName;
		this.orderTime = orderTime;
		this.firstAgentName = firstAgentName;
		this.firstAgentMobile = firstAgentMobile;
		this.secondAgentName = secondAgentName;
		this.secondAgentMobile = secondAgentMobile;
		this.platformSharePercent = platformSharePercent;
		this.patientSharePercent = patientSharePercent;
		this.primarySalesmanSharePercent = primarySalesmanSharePercent;
		this.secondarySalesmanSharePercent = secondarySalesmanSharePercent;
		this.organizationSharePercent = organizationSharePercent;
	}

	// Property accessors
	@Id
	@Column(name = "awmg_id")
	public Integer getAwmgId() {
		return this.awmgId;
	}

	public void setAwmgId(Integer awmgId) {
		this.awmgId = awmgId;
	}

	@Column(name = "awi_id")
	public Integer getAwiId() {
		return this.awiId;
	}

	public void setAwiId(Integer awiId) {
		this.awiId = awiId;
	}

	@Column(name = "withdraw_number", length = 100)
	public String getWithdrawNumber() {
		return this.withdrawNumber;
	}

	public void setWithdrawNumber(String withdrawNumber) {
		this.withdrawNumber = withdrawNumber;
	}

	@Column(name = "context_name", length = 100)
	public String getContextName() {
		return this.contextName;
	}

	public void setContextName(String contextName) {
		this.contextName = contextName;
	}

	@Column(name = "withdraw_type", length = 32)
	public String getWithdrawType() {
		return this.withdrawType;
	}

	public void setWithdrawType(String withdrawType) {
		this.withdrawType = withdrawType;
	}

	@Column(name = "ami_id")
	public Integer getAmiId() {
		return this.amiId;
	}

	public void setAmiId(Integer amiId) {
		this.amiId = amiId;
	}

	@Column(name = "adi_id")
	public Integer getAdiId() {
		return this.adiId;
	}

	public void setAdiId(Integer adiId) {
		this.adiId = adiId;
	}

	@Column(name = "aoi_id")
	public Integer getAoiId() {
		return this.aoiId;
	}

	public void setAoiId(Integer aoiId) {
		this.aoiId = aoiId;
	}

	@Column(name = "drug_fee", precision = 16)
	public Double getDrugFee() {
		return this.drugFee;
	}

	public void setDrugFee(Double drugFee) {
		this.drugFee = drugFee;
	}

	@Column(name = "drug_fee_percent", precision = 16)
	public Double getDrugFeePercent() {
		return this.drugFeePercent;
	}

	public void setDrugFeePercent(Double drugFeePercent) {
		this.drugFeePercent = drugFeePercent;
	}

	@Column(name = "treatment_fee", precision = 16)
	public Double getTreatmentFee() {
		return this.treatmentFee;
	}

	public void setTreatmentFee(Double treatmentFee) {
		this.treatmentFee = treatmentFee;
	}

	@Column(name = "treatment_fee_percent", precision = 16)
	public Double getTreatmentFeePercent() {
		return this.treatmentFeePercent;
	}

	public void setTreatmentFeePercent(Double treatmentFeePercent) {
		this.treatmentFeePercent = treatmentFeePercent;
	}

	@Column(name = "total_fee", precision = 16)
	public Double getTotalFee() {
		return this.totalFee;
	}

	public void setTotalFee(Double totalFee) {
		this.totalFee = totalFee;
	}

	@Column(name = "reception_fee", precision = 16)
	public Double getReceptionFee() {
		return this.receptionFee;
	}

	public void setReceptionFee(Double receptionFee) {
		this.receptionFee = receptionFee;
	}

	@Column(name = "total_fee_to_pay", precision = 16)
	public Double getTotalFeeToPay() {
		return this.totalFeeToPay;
	}

	public void setTotalFeeToPay(Double totalFeeToPay) {
		this.totalFeeToPay = totalFeeToPay;
	}

	@Column(name = "share_patient_id")
	public Integer getSharePatientId() {
		return this.sharePatientId;
	}

	public void setSharePatientId(Integer sharePatientId) {
		this.sharePatientId = sharePatientId;
	}

	@Column(name = "share_patient_amount", precision = 16)
	public Double getSharePatientAmount() {
		return this.sharePatientAmount;
	}

	public void setSharePatientAmount(Double sharePatientAmount) {
		this.sharePatientAmount = sharePatientAmount;
	}

	@Column(name = "share_first_agent_id")
	public Integer getShareFirstAgentId() {
		return this.shareFirstAgentId;
	}

	public void setShareFirstAgentId(Integer shareFirstAgentId) {
		this.shareFirstAgentId = shareFirstAgentId;
	}

	@Column(name = "share_first_agent_amount", precision = 16)
	public Double getShareFirstAgentAmount() {
		return this.shareFirstAgentAmount;
	}

	public void setShareFirstAgentAmount(Double shareFirstAgentAmount) {
		this.shareFirstAgentAmount = shareFirstAgentAmount;
	}

	@Column(name = "share_second_agent_id")
	public Integer getShareSecondAgentId() {
		return this.shareSecondAgentId;
	}

	public void setShareSecondAgentId(Integer shareSecondAgentId) {
		this.shareSecondAgentId = shareSecondAgentId;
	}

	@Column(name = "share_second_agent_amount", precision = 16)
	public Double getShareSecondAgentAmount() {
		return this.shareSecondAgentAmount;
	}

	public void setShareSecondAgentAmount(Double shareSecondAgentAmount) {
		this.shareSecondAgentAmount = shareSecondAgentAmount;
	}

	@Column(name = "share_top_organization_id")
	public Integer getShareTopOrganizationId() {
		return this.shareTopOrganizationId;
	}

	public void setShareTopOrganizationId(Integer shareTopOrganizationId) {
		this.shareTopOrganizationId = shareTopOrganizationId;
	}

	@Column(name = "share_top_organization_amount", precision = 16)
	public Double getShareTopOrganizationAmount() {
		return this.shareTopOrganizationAmount;
	}

	public void setShareTopOrganizationAmount(Double shareTopOrganizationAmount) {
		this.shareTopOrganizationAmount = shareTopOrganizationAmount;
	}

	@Column(name = "share_top_reserved_agentId")
	public Integer getShareTopReservedAgentId() {
		return this.shareTopReservedAgentId;
	}

	public void setShareTopReservedAgentId(Integer shareTopReservedAgentId) {
		this.shareTopReservedAgentId = shareTopReservedAgentId;
	}

	@Column(name = "share_top_reserved_agent_amount", precision = 16)
	public Double getShareTopReservedAgentAmount() {
		return this.shareTopReservedAgentAmount;
	}

	public void setShareTopReservedAgentAmount(
			Double shareTopReservedAgentAmount) {
		this.shareTopReservedAgentAmount = shareTopReservedAgentAmount;
	}

	@Column(name = "share_portal_amount", precision = 16)
	public Double getSharePortalAmount() {
		return this.sharePortalAmount;
	}

	public void setSharePortalAmount(Double sharePortalAmount) {
		this.sharePortalAmount = sharePortalAmount;
	}

	@Column(name = "is_patient_withdraw", length = 32)
	public String getIsPatientWithdraw() {
		return this.isPatientWithdraw;
	}

	public void setIsPatientWithdraw(String isPatientWithdraw) {
		this.isPatientWithdraw = isPatientWithdraw;
	}

	@Column(name = "patient_withdraw_id")
	public Integer getPatientWithdrawId() {
		return this.patientWithdrawId;
	}

	public void setPatientWithdrawId(Integer patientWithdrawId) {
		this.patientWithdrawId = patientWithdrawId;
	}

	@Column(name = "is_first_agent_withdraw", length = 32)
	public String getIsFirstAgentWithdraw() {
		return this.isFirstAgentWithdraw;
	}

	public void setIsFirstAgentWithdraw(String isFirstAgentWithdraw) {
		this.isFirstAgentWithdraw = isFirstAgentWithdraw;
	}

	@Column(name = "first_agent_withdraw_id")
	public Integer getFirstAgentWithdrawId() {
		return this.firstAgentWithdrawId;
	}

	public void setFirstAgentWithdrawId(Integer firstAgentWithdrawId) {
		this.firstAgentWithdrawId = firstAgentWithdrawId;
	}

	@Column(name = "is_second_agent_withdraw", length = 32)
	public String getIsSecondAgentWithdraw() {
		return this.isSecondAgentWithdraw;
	}

	public void setIsSecondAgentWithdraw(String isSecondAgentWithdraw) {
		this.isSecondAgentWithdraw = isSecondAgentWithdraw;
	}

	@Column(name = "second_agent_withdraw_id")
	public Integer getSecondAgentWithdrawId() {
		return this.secondAgentWithdrawId;
	}

	public void setSecondAgentWithdrawId(Integer secondAgentWithdrawId) {
		this.secondAgentWithdrawId = secondAgentWithdrawId;
	}

	@Column(name = "is_top_organization_withdraw", length = 32)
	public String getIsTopOrganizationWithdraw() {
		return this.isTopOrganizationWithdraw;
	}

	public void setIsTopOrganizationWithdraw(String isTopOrganizationWithdraw) {
		this.isTopOrganizationWithdraw = isTopOrganizationWithdraw;
	}

	@Column(name = "top_organization_withdrawId")
	public Integer getTopOrganizationWithdrawId() {
		return this.topOrganizationWithdrawId;
	}

	public void setTopOrganizationWithdrawId(Integer topOrganizationWithdrawId) {
		this.topOrganizationWithdrawId = topOrganizationWithdrawId;
	}

	@Column(name = "is_top_reserved_agent_withdraw", length = 32)
	public String getIsTopReservedAgentWithdraw() {
		return this.isTopReservedAgentWithdraw;
	}

	public void setIsTopReservedAgentWithdraw(String isTopReservedAgentWithdraw) {
		this.isTopReservedAgentWithdraw = isTopReservedAgentWithdraw;
	}

	@Column(name = "top_reserved_agent_withdraw_id")
	public Integer getTopReservedAgentWithdrawId() {
		return this.topReservedAgentWithdrawId;
	}

	public void setTopReservedAgentWithdrawId(Integer topReservedAgentWithdrawId) {
		this.topReservedAgentWithdrawId = topReservedAgentWithdrawId;
	}

	@Column(name = "status", length = 32)
	public String getStatus() {
		return this.status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	@Column(name = "create_ren", length = 512)
	public String getCreateRen() {
		return this.createRen;
	}

	public void setCreateRen(String createRen) {
		this.createRen = createRen;
	}
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "create_date" )
	public Date getCreateDate() {
		return this.createDate;
	}

	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}

	@Column(name = "edit_ren", length = 512)
	public String getEditRen() {
		return this.editRen;
	}

	public void setEditRen(String editRen) {
		this.editRen = editRen;
	}
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "edit_date" )
	public Date getEditDate() {
		return this.editDate;
	}

	public void setEditDate(Date editDate) {
		this.editDate = editDate;
	}

	@Column(name = "patient_name", length = 100)
	public String getPatientName() {
		return this.patientName;
	}

	public void setPatientName(String patientName) {
		this.patientName = patientName;
	}

	@Column(name = "patient_mobile", length = 100)
	public String getPatientMobile() {
		return this.patientMobile;
	}

	public void setPatientMobile(String patientMobile) {
		this.patientMobile = patientMobile;
	}

	@Column(name = "organization_name", length = 100)
	public String getOrganizationName() {
		return this.organizationName;
	}

	public void setOrganizationName(String organizationName) {
		this.organizationName = organizationName;
	}

	@Column(name = "patient_source", length = 32)
	public String getPatientSource() {
		return this.patientSource;
	}

	public void setPatientSource(String patientSource) {
		this.patientSource = patientSource;
	}

	@Column(name = "agent_mobile", length = 100)
	public String getAgentMobile() {
		return this.agentMobile;
	}

	public void setAgentMobile(String agentMobile) {
		this.agentMobile = agentMobile;
	}

	@Column(name = "agent_name", length = 100)
	public String getAgentName() {
		return this.agentName;
	}

	public void setAgentName(String agentName) {
		this.agentName = agentName;
	}
	
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "order_Time" )
	public Date getOrderTime() {
		return this.orderTime;
	}

	public void setOrderTime(Date orderTime) {
		this.orderTime = orderTime;
	}

	@Column(name = "first_agent_name", length = 100)
	public String getFirstAgentName() {
		return this.firstAgentName;
	}

	public void setFirstAgentName(String firstAgentName) {
		this.firstAgentName = firstAgentName;
	}

	@Column(name = "first_agent_mobile", length = 100)
	public String getFirstAgentMobile() {
		return this.firstAgentMobile;
	}

	public void setFirstAgentMobile(String firstAgentMobile) {
		this.firstAgentMobile = firstAgentMobile;
	}

	@Column(name = "second_agent_name", length = 100)
	public String getSecondAgentName() {
		return this.secondAgentName;
	}

	public void setSecondAgentName(String secondAgentName) {
		this.secondAgentName = secondAgentName;
	}

	@Column(name = "second_agent_mobile", length = 100)
	public String getSecondAgentMobile() {
		return this.secondAgentMobile;
	}

	public void setSecondAgentMobile(String secondAgentMobile) {
		this.secondAgentMobile = secondAgentMobile;
	}

	@Column(name = "platform_share_percent", precision = 16)
	public Double getPlatformSharePercent() {
		return this.platformSharePercent;
	}

	public void setPlatformSharePercent(Double platformSharePercent) {
		this.platformSharePercent = platformSharePercent;
	}

	@Column(name = "patient_share_percent", precision = 16)
	public Double getPatientSharePercent() {
		return this.patientSharePercent;
	}

	public void setPatientSharePercent(Double patientSharePercent) {
		this.patientSharePercent = patientSharePercent;
	}

	@Column(name = "primary_salesman_share_percent", precision = 16)
	public Double getPrimarySalesmanSharePercent() {
		return this.primarySalesmanSharePercent;
	}

	public void setPrimarySalesmanSharePercent(
			Double primarySalesmanSharePercent) {
		this.primarySalesmanSharePercent = primarySalesmanSharePercent;
	}

	@Column(name = "secondary_salesman_share_percent", precision = 16)
	public Double getSecondarySalesmanSharePercent() {
		return this.secondarySalesmanSharePercent;
	}

	public void setSecondarySalesmanSharePercent(
			Double secondarySalesmanSharePercent) {
		this.secondarySalesmanSharePercent = secondarySalesmanSharePercent;
	}

	@Column(name = "organization_share_percent", precision = 16)
	public Double getOrganizationSharePercent() {
		return this.organizationSharePercent;
	}

	public void setOrganizationSharePercent(Double organizationSharePercent) {
		this.organizationSharePercent = organizationSharePercent;
	}
 
	///===============数据库表无关子段字段属性end==========
	
	private Integer id;
	@Transient
	public Integer getId() {
		return awmgId;
	}

	public void setId(Integer id) {
		this.awmgId=id;
	}
	
	/**
	 * 订单开始时间
	 */
	private String createDateStart;
	/**
	 * 订单结束时间
	 */
	private String createDateEnd;
	
	/**
	 * 业务类型
	 */
	private String registerType;
	
	
	/**
	 * 是否自增
	 */
	private String  chargeType;
	
	 /**
	  * 交易类型
	  */
	private String transactionType;
	@Transient
	public String getCreateDateStart() {
		return createDateStart;
	}

	public void setCreateDateStart(String createDateStart) {
		this.createDateStart = createDateStart;
	}
	@Transient
	public String getCreateDateEnd() {
		return createDateEnd;
	}

	public void setCreateDateEnd(String createDateEnd) {
		this.createDateEnd = createDateEnd;
	}
	
	
	@Column(name = "register_Type" )
	public String getRegisterType() {
		return registerType;
	}

	public void setRegisterType(String registerType) {
		this.registerType = registerType;
	}
	@Column(name = "charge_Type" )
	public String getChargeType() {
		return chargeType;
	}

	public void setChargeType(String chargeType) {
		this.chargeType = chargeType;
	}
	@Column(name = "transaction_Type" )
	public String getTransactionType() {
		return transactionType;
	}

	public void setTransactionType(String transactionType) {
		this.transactionType = transactionType;
	}
	@Column(name = "context_account_name" )
	public String getContextAccountName() {
		return contextAccountName;
	}

	public void setContextAccountName(String contextAccountName) {
		this.contextAccountName = contextAccountName;
	}
	
	
	
	
	
	
	
	
}
