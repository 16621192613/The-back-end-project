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
 * AgPatientViewId entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "ag_patient_view" )
public class AgPatientView implements java.io.Serializable {

	// Fields

	private Date createDate;
	private String name;
	private String mobile;
	private Integer suiId;
	private Double totalShare;
	private Double withdrawCount;
	private Double moneyCount;
	private Integer registrationsCount;
	private Double consumeCount;
	private Integer countMedicalRecordsCount;

	// Constructors

	/** default constructor */
	public AgPatientView() {
	}

	/** full constructor */
	public AgPatientView(Date createDate, String name, String mobile,
			Integer suiId, Double totalShare, Double withdrawCount,
			Double moneyCount, Integer registrationsCount, Double consumeCount,
			Integer countMedicalRecordsCount) {
		this.createDate = createDate;
		this.name = name;
		this.mobile = mobile;
		this.suiId = suiId;
		this.totalShare = totalShare;
		this.withdrawCount = withdrawCount;
		this.moneyCount = moneyCount;
		this.registrationsCount = registrationsCount;
		this.consumeCount = consumeCount;
		this.countMedicalRecordsCount = countMedicalRecordsCount;
	}

	// Property accessors
	@Temporal(TemporalType.DATE)
	@Column(name = "create_date" )
	public Date getCreateDate() {
		return this.createDate;
	}

	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}

	@Column(name = "name", length = 100)
	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Column(name = "mobile" )
	public String getMobile() {
		return this.mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	@Id
	@Column(name = "sui_id")
	public Integer getSuiId() {
		return this.suiId;
	}

	public void setSuiId(Integer suiId) {
		this.suiId = suiId;
	}

	@Column(name = "total_share", precision = 16)
	public Double getTotalShare() {
		return this.totalShare;
	}

	public void setTotalShare(Double totalShare) {
		this.totalShare = totalShare;
	}

	@Column(name = "withdraw_count", precision = 16)
	public Double getWithdrawCount() {
		return this.withdrawCount;
	}

	public void setWithdrawCount(Double withdrawCount) {
		this.withdrawCount = withdrawCount;
	}

	@Column(name = "money_count", precision = 16)
	public Double getMoneyCount() {
		return this.moneyCount;
	}

	public void setMoneyCount(Double moneyCount) {
		this.moneyCount = moneyCount;
	}

	@Column(name = "registrations_count")
	public Integer getRegistrationsCount() {
		return this.registrationsCount;
	}

	public void setRegistrationsCount(Integer registrationsCount) {
		this.registrationsCount = registrationsCount;
	}

	@Column(name = "consume_count", precision = 16)
	public Double getConsumeCount() {
		return this.consumeCount;
	}

	public void setConsumeCount(Double consumeCount) {
		this.consumeCount = consumeCount;
	}

	@Column(name = "count_Medical_Records_Count")
	public Integer getCountMedicalRecordsCount() {
		return this.countMedicalRecordsCount;
	}

	public void setCountMedicalRecordsCount(Integer countMedicalRecordsCount) {
		this.countMedicalRecordsCount = countMedicalRecordsCount;
	}

	/**
	 * 开始数据
	 */
	private String createDateStart;
	/**
	 * 结束时间 
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