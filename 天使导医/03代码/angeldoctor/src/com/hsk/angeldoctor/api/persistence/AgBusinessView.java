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

import org.hibernate.annotations.Formula;

/**
 * AgBusinessViewId entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "Ag_Business_View" )
public class AgBusinessView implements java.io.Serializable {

	// Fields

	private String reservedProvId;
	private String reservedCityId;
	private Date createDate;
	private String name;
	private String mobile;
	private Double totalShare;
	private Double withdrawCount;
	private Double moneyCount;
	private Integer suiId;
	private Integer registrationsCount;
	private Integer allRegistrationsCount;
	private Integer aaiId;
	private Integer parentAgentId;
	

	// Constructors

	/** default constructor */
	public AgBusinessView() {
	}

	/** full constructor */
	public AgBusinessView(String reservedProvId, String reservedCityId,
			Date createDate, String name, String mobile,
			Double totalShare, Double withdrawCount, Double moneyCount,
			Integer suiId, Integer registrationsCount) {
		this.reservedProvId = reservedProvId;
		this.reservedCityId = reservedCityId;
		this.createDate = createDate;
		this.name = name;
		this.mobile = mobile;
		this.totalShare = totalShare;
		this.withdrawCount = withdrawCount;
		this.moneyCount = moneyCount;
		this.suiId = suiId;
		this.registrationsCount = registrationsCount;
	}

	// Property accessors

	@Column(name = "reserved_prov_id", length = 20)
	public String getReservedProvId() {
		return this.reservedProvId;
	}

	public void setReservedProvId(String reservedProvId) {
		this.reservedProvId = reservedProvId;
	}

	@Column(name = "reserved_city_id", length = 20)
	public String getReservedCityId() {
		return this.reservedCityId;
	}

	public void setReservedCityId(String reservedCityId) {
		this.reservedCityId = reservedCityId;
	}
	@Temporal(TemporalType.DATE)
	@Column(name = "create_date")
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

	@Column(name = "mobile", length = 100)
	public String getMobile() {
		return this.mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
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
	@Id
	@Column(name = "sui_id")
	public Integer getSuiId() {
		return this.suiId;
	}

	public void setSuiId(Integer suiId) {
		this.suiId = suiId;
	}

	@Column(name = "registrations_count")
	public Integer getRegistrationsCount() {
		return this.registrationsCount;
	}

	public void setRegistrationsCount(Integer registrationsCount) {
		this.registrationsCount = registrationsCount;
	}
	
	@Column(name = "aai_id")
	public Integer getAaiId() {
		return aaiId;
	}

	public void setAaiId(Integer aaiId) {
		this.aaiId = aaiId;
	}
	@Column(name = "parent_agent_id")
	public Integer getParentAgentId() {
		return parentAgentId;
	}

	public void setParentAgentId(Integer parentAgentId) {
		this.parentAgentId = parentAgentId;
	}

	@Transient
	public Integer getAllRegistrationsCount() {
		return registrationsCount;
	}

	public void setAllRegistrationsCount(Integer allRegistrationsCount) {
		this.allRegistrationsCount = allRegistrationsCount;
	}

	/**
	 * 开始数据
	 */
	private String createDateStart;
	/**
	 * 结束时间 
	 */
	private String createDateEnd;
	private String isHasPatient;
	private Integer totalDeal;
	
	@Formula("(SELECT COUNT(1) FROM ag_order_info a WHERE a.agent_id=sui_id AND a.register_type=0 AND a.outpatient_status=0)")
	public Integer getTotalDeal() {
		return totalDeal;
	}

	public void setTotalDeal(Integer totalDeal) {
		this.totalDeal = totalDeal;
	}

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
	@Transient
	public String getIsHasPatient() {
		return isHasPatient;
	}

	public void setIsHasPatient(String isHasPatient) {
		this.isHasPatient = isHasPatient;
	}
	
	
}