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
 * AgHospitalViewId entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "Ag_Hospital_View" )
public class AgHospitalView implements java.io.Serializable {

	// Fields

	private String provId;
	private String cityId;
	private Date createDate;
	private String name;
	private Double consumeCount;
	private Double moneyCount;
	private Integer id;
	private Double totalShare;
	private Double depositAmount;

	// Constructors

	/** default constructor */
	public AgHospitalView() {
	}

	/** full constructor */
	public AgHospitalView(String provId, String cityId, Date createDate,
			String name, Double consumeCount, Double moneyCount, Integer suiId,
			Double totalShare) {
		this.provId = provId;
		this.cityId = cityId;
		this.createDate = createDate;
		this.name = name;
		this.consumeCount = consumeCount;
		this.moneyCount = moneyCount;
		this.id = id;
		this.totalShare = totalShare;
	}

	// Property accessors

	@Column(name = "prov_id", length = 20)
	public String getProvId() {
		return this.provId;
	}

	public void setProvId(String provId) {
		this.provId = provId;
	}

	@Column(name = "city_id", length = 20)
	public String getCityId() {
		return this.cityId;
	}

	public void setCityId(String cityId) {
		this.cityId = cityId;
	}
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

	@Column(name = "consume_count", precision = 16)
	public Double getConsumeCount() {
		return this.consumeCount;
	}

	public void setConsumeCount(Double consumeCount) {
		this.consumeCount = consumeCount;
	}

	@Transient
	public Double getMoneyCount() {
		moneyCount = this.getDepositAmount()+this.getTotalShare()-this.getConsumeCount();
		return this.moneyCount;
	}

	public void setMoneyCount(Double moneyCount) {
		this.moneyCount = moneyCount;
	}
	@Id
	@Column(name = "id")
	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	@Column(name = "total_share", precision = 16)
	public Double getTotalShare() {
		return this.totalShare;
	}

	public void setTotalShare(Double totalShare) {
		this.totalShare = totalShare;
	}
	
	@Column(name = "deposit_amount", precision = 16)
	public Double getDepositAmount() {
		return depositAmount;
	}

	public void setDepositAmount(Double depositAmount) {
		this.depositAmount = depositAmount;
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