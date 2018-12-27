package com.hsk.angeldoctor.api.persistence;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * AgWithdrawMaidInfoId entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "ag_withdraw_maid_info")
public class AgWithdrawMaidInfo implements java.io.Serializable {

	private String type;
	private Date createDate;
	private Double shareAgentAmount;
	private String isFirstAgent;
	private String isAgentWithdraw;
	private Integer transactionId;
	private Integer id;
	private String serialNumber;
	private String organizationName;
	private String agentMobile;
	private String agentName;
	private String patientName;
	private Date registerDate;
	private String shiftPeriod;
	@Column(name = "TYPE", nullable = false, length = 5)
	public String getType() {
		return this.type;
	}

	public void setType(String type) {
		this.type = type;
	}
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "create_date" )
	public Date getCreateDate() {
		return this.createDate;
	}

	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}

	@Column(name = "share_Agent_Amount", precision = 16)
	public Double getShareAgentAmount() {
		return this.shareAgentAmount;
	}

	public void setShareAgentAmount(Double shareAgentAmount) {
		this.shareAgentAmount = shareAgentAmount;
	}

	@Column(name = "is_First_Agent", length = 32)
	public String getIsFirstAgent() {
		return this.isFirstAgent;
	}

	public void setIsFirstAgent(String isFirstAgent) {
		this.isFirstAgent = isFirstAgent;
	}

	@Column(name = "is_Agent_Withdraw", nullable = false, length = 1)
	public String getIsAgentWithdraw() {
		return this.isAgentWithdraw;
	}

	public void setIsAgentWithdraw(String isAgentWithdraw) {
		this.isAgentWithdraw = isAgentWithdraw;
	}

	@Column(name = "transaction_Id")
	public Integer getTransactionId() {
		return this.transactionId;
	}

	public void setTransactionId(Integer transactionId) {
		this.transactionId = transactionId;
	}
	@Id
	@Column(name = "id")
	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	@Column(name = "serial_Number", length = 100)
	public String getSerialNumber() {
		return this.serialNumber;
	}

	public void setSerialNumber(String serialNumber) {
		this.serialNumber = serialNumber;
	}

	@Column(name = "organization_Name", length = 100)
	public String getOrganizationName() {
		return this.organizationName;
	}

	public void setOrganizationName(String organizationName) {
		this.organizationName = organizationName;
	}

	@Column(name = "agent_Mobile", length = 100)
	public String getAgentMobile() {
		return this.agentMobile;
	}

	public void setAgentMobile(String agentMobile) {
		this.agentMobile = agentMobile;
	}

	@Column(name = "agent_Name", length = 100)
	public String getAgentName() {
		return this.agentName;
	}

	public void setAgentName(String agentName) {
		this.agentName = agentName;
	}

	@Column(name = "patient_Name", length = 100)
	public String getPatientName() {
		return this.patientName;
	}

	public void setPatientName(String patientName) {
		this.patientName = patientName;
	}
	@Temporal(TemporalType.DATE)
	@Column(name = "register_Date" )
	public Date getRegisterDate() {
		return this.registerDate;
	}

	public void setRegisterDate(Date registerDate) {
		this.registerDate = registerDate;
	}

	@Column(name = "shift_Period", length = 131)
	public String getShiftPeriod() {
		return this.shiftPeriod;
	}

	public void setShiftPeriod(String shiftPeriod) {
		this.shiftPeriod = shiftPeriod;
	}

}