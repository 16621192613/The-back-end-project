package com.hsk.angeldoctor.api.persistence;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Transient;

@Entity
@Table(name = "ag_maid_or_view" )
public class AgMaidOrView {
	
	private Integer amiId;
	private String serialNumber;
	private Date createDate;
	private Integer aaiId;
	private Double totalFee;
	private Double sharePatientAmount;
	private Double shareFirstAgentAmount;
	private Double shareSecondAgentAmount;
	private Double shareTopOrganizationAmount;
	private Double shareTopReservedAgentAmount;
	private String organizationName;
	private String patientName;
	private String firstAgentMobile;
	private String secondAgentMobile;
	private String agentName;
	private Double receptionFee;
	private Double reservedSharePercent;
	private Double organizationSharePercent;
	private Double patientSharePercent;
	private Double primarySalesmanSharePercent;
	private Double secondarySalesmanSharePercent;
	private Integer shareTopReservedAgentId;
	private Integer shareTopOrganizationId;
	
	@Id
	@Column(name = "ami_id")
	public Integer getAmiId() {
		return amiId;
	}
	public void setAmiId(Integer amiId) {
		this.amiId = amiId;
	}
	@Column(name = "serial_number")
	public String getSerialNumber() {
		return serialNumber;
	}
	public void setSerialNumber(String serialNumber) {
		this.serialNumber = serialNumber;
	}
	@Temporal(TemporalType.DATE)
	@Column(name = "create_date" )
	public Date getCreateDate() {
		return createDate;
	}
	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}
	@Column(name = "aai_id")
	public Integer getAaiId() {
		return aaiId;
	}
	public void setAaiId(Integer aaiId) {
		this.aaiId = aaiId;
	}
	@Column(name = "share_top_reserved_agentId")
	public Integer getShareTopReservedAgentId() {
		return shareTopReservedAgentId;
	}
	public void setShareTopReservedAgentId(Integer shareTopReservedAgentId) {
		this.shareTopReservedAgentId = shareTopReservedAgentId;
	}
	@Column(name = "share_top_organization_id")
	public Integer getShareTopOrganizationId() {
		return shareTopOrganizationId;
	}
	public void setShareTopOrganizationId(Integer shareTopOrganizationId) {
		this.shareTopOrganizationId = shareTopOrganizationId;
	}
	@Column(name = "total_fee")
	public Double getTotalFee() {
		return totalFee;
	}
	public void setTotalFee(Double totalFee) {
		this.totalFee = totalFee;
	}
	@Column(name = "share_patient_amount")
	public Double getSharePatientAmount() {
		return sharePatientAmount;
	}
	public void setSharePatientAmount(Double sharePatientAmount) {
		this.sharePatientAmount = sharePatientAmount;
	}
	@Column(name = "share_first_agent_amount")
	public Double getShareFirstAgentAmount() {
		return shareFirstAgentAmount;
	}
	public void setShareFirstAgentAmount(Double shareFirstAgentAmount) {
		this.shareFirstAgentAmount = shareFirstAgentAmount;
	}
	@Column(name = "share_second_agent_amount")
	public Double getShareSecondAgentAmount() {
		return shareSecondAgentAmount;
	}
	public void setShareSecondAgentAmount(Double shareSecondAgentAmount) {
		this.shareSecondAgentAmount = shareSecondAgentAmount;
	}
	@Column(name = "share_top_organization_amount")
	public Double getShareTopOrganizationAmount() {
		return shareTopOrganizationAmount;
	}
	public void setShareTopOrganizationAmount(Double shareTopOrganizationAmount) {
		this.shareTopOrganizationAmount = shareTopOrganizationAmount;
	}
	@Column(name = "share_top_reserved_agent_amount")
	public Double getShareTopReservedAgentAmount() {
		return shareTopReservedAgentAmount;
	}
	public void setShareTopReservedAgentAmount(Double shareTopReservedAgentAmount) {
		this.shareTopReservedAgentAmount = shareTopReservedAgentAmount;
	}
	@Column(name = "organization_name")
	public String getOrganizationName() {
		return organizationName;
	}
	public void setOrganizationName(String organizationName) {
		this.organizationName = organizationName;
	}
	@Column(name = "patient_name")
	public String getPatientName() {
		return patientName;
	}
	public void setPatientName(String patientName) {
		this.patientName = patientName;
	}
	@Column(name = "first_agent_mobile")
	public String getFirstAgentMobile() {
		return firstAgentMobile;
	}
	public void setFirstAgentMobile(String firstAgentMobile) {
		this.firstAgentMobile = firstAgentMobile;
	}
	@Column(name = "second_agent_mobile")
	public String getSecondAgentMobile() {
		return secondAgentMobile;
	}
	public void setSecondAgentMobile(String secondAgentMobile) {
		this.secondAgentMobile = secondAgentMobile;
	}
	@Column(name = "agent_name")
	public String getAgentName() {
		return agentName;
	}
	public void setAgentName(String agentName) {
		this.agentName = agentName;
	}
	@Column(name = "reception_fee")
	public Double getReceptionFee() {
		return receptionFee;
	}
	public void setReceptionFee(Double receptionFee) {
		this.receptionFee = receptionFee;
	}
	@Column(name = "reserved_share_percent")
	public Double getReservedSharePercent() {
		return reservedSharePercent;
	}
	public void setReservedSharePercent(Double reservedSharePercent) {
		this.reservedSharePercent = reservedSharePercent;
	}
	@Column(name = "organization_share_percent")
	public Double getOrganizationSharePercent() {
		return organizationSharePercent;
	}
	public void setOrganizationSharePercent(Double organizationSharePercent) {
		this.organizationSharePercent = organizationSharePercent;
	}
	@Column(name = "patient_share_percent")
	public Double getPatientSharePercent() {
		return patientSharePercent;
	}
	public void setPatientSharePercent(Double patientSharePercent) {
		this.patientSharePercent = patientSharePercent;
	}
	@Column(name = "primary_salesman_share_percent")
	public Double getPrimarySalesmanSharePercent() {
		return primarySalesmanSharePercent;
	}
	public void setPrimarySalesmanSharePercent(Double primarySalesmanSharePercent) {
		this.primarySalesmanSharePercent = primarySalesmanSharePercent;
	}
	@Column(name = "secondary_salesman_share_percent")
	public Double getSecondarySalesmanSharePercent() {
		return secondarySalesmanSharePercent;
	}
	public void setSecondarySalesmanSharePercent(Double secondarySalesmanSharePercent) {
		this.secondarySalesmanSharePercent = secondarySalesmanSharePercent;
	}
	
	/**
	 * 订单开始时间
	 */
	private String createDateStart;
	/**
	 * 订单结束时间
	 */
	private String createDateEnd;
	
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
}
