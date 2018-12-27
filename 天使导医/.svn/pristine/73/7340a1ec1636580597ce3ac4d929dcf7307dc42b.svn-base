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
 * AgDealCountViewId entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "ag_deal_count_view")
public class AgDealCountView implements java.io.Serializable {

	// Fields

	private Integer adiId;
	private Integer aoiId;
	private Integer aaiId;
	private Integer organizationId;
	private Integer abuId;
	private Integer doctorId;
	private Integer departmentId;
	private Integer patientId;
	private Double treatmentFee;
	private Double receptionFee;
	private Double drugFee;
	private String comment;
	private String status;
	private String createRen;
	private Date createDate;
	private String editRen;
	private Date editDate;
	private Double drugFeePercent;
	private Double treatmentFeePercent;
	private String agentMobile;
	private String agentName;
	private String chargeType;
	private String registerType;
	private String patientName;
	private String patientMobile;
	private String patientGender;
	private String patientAge;
	private String patientSource;
	private String serialNumber;
	private Date registerDate;
	private String organizationName;
	private  Double totalFee;
	private  Double totalFeeToPay;
	
	private String shiftPeriod;
	private String regDepartmentName;
	private String actualDepartmentName;
	private String regDoctorName;
	private String actualDoctorName;
	

	// Constructors

	/** default constructor */
	public AgDealCountView() {
	}

	/** minimal constructor */
	public AgDealCountView(Integer adiId, Double receptionFee) {
		this.adiId = adiId;
		this.receptionFee = receptionFee;
	}

	/** full constructor */
	public AgDealCountView(Integer adiId, Integer aoiId,
			Integer organizationId, Integer abuId, Integer doctorId,
			Integer departmentId, Integer patientId, Double treatmentFee,
			Double receptionFee, Double drugFee, String comment, String status,
			String createRen, Timestamp createDate, String editRen,
			Timestamp editDate, Double drugFeePercent,
			Double treatmentFeePercent, String agentMobile, String agentName,
			String chargeType, String registerType, String patientName,
			String patientMobile, String patientSource, String serialNumber,
			Timestamp registerDate) {
		this.adiId = adiId;
		this.aoiId = aoiId;
		this.organizationId = organizationId;
		this.abuId = abuId;
		this.doctorId = doctorId;
		this.departmentId = departmentId;
		this.patientId = patientId;
		this.treatmentFee = treatmentFee;
		this.receptionFee = receptionFee;
		this.drugFee = drugFee;
		this.comment = comment;
		this.status = status;
		this.createRen = createRen;
		this.createDate = createDate;
		this.editRen = editRen;
		this.editDate = editDate;
		this.drugFeePercent = drugFeePercent;
		this.treatmentFeePercent = treatmentFeePercent;
		this.agentMobile = agentMobile;
		this.agentName = agentName;
		this.chargeType = chargeType;
		this.registerType = registerType;
		this.patientName = patientName;
		this.patientMobile = patientMobile;
		this.patientSource = patientSource;
		this.serialNumber = serialNumber;
		this.registerDate = registerDate;
	}

	// Property accessors
	@Id
	@Column(name = "adi_id", nullable = false)
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
	@Column(name = "aai_id")
	public Integer getAaiId() {
		return aaiId;
	}

	public void setAaiId(Integer aaiId) {
		this.aaiId = aaiId;
	}

	@Column(name = "organization_id")
	public Integer getOrganizationId() {
		return this.organizationId;
	}

	public void setOrganizationId(Integer organizationId) {
		this.organizationId = organizationId;
	}

	@Column(name = "abu_id")
	public Integer getAbuId() {
		return this.abuId;
	}

	public void setAbuId(Integer abuId) {
		this.abuId = abuId;
	}

	@Column(name = "doctor_id")
	public Integer getDoctorId() {
		return this.doctorId;
	}

	public void setDoctorId(Integer doctorId) {
		this.doctorId = doctorId;
	}

	@Column(name = "department_id")
	public Integer getDepartmentId() {
		return this.departmentId;
	}

	public void setDepartmentId(Integer departmentId) {
		this.departmentId = departmentId;
	}

	@Column(name = "patient_id")
	public Integer getPatientId() {
		return this.patientId;
	}

	public void setPatientId(Integer patientId) {
		this.patientId = patientId;
	}

	@Column(name = "treatment_fee", precision = 16)
	public Double getTreatmentFee() {
		return this.treatmentFee;
	}

	public void setTreatmentFee(Double treatmentFee) {
		this.treatmentFee = treatmentFee;
	}

	@Column(name = "reception_fee", nullable = false, precision = 16)
	public Double getReceptionFee() {
		return this.receptionFee;
	}

	public void setReceptionFee(Double receptionFee) {
		this.receptionFee = receptionFee;
	}

	@Column(name = "drug_fee", precision = 16)
	public Double getDrugFee() {
		return this.drugFee;
	}

	public void setDrugFee(Double drugFee) {
		this.drugFee = drugFee;
	}

	@Column(name = "comment", length = 100)
	public String getComment() {
		return this.comment;
	}

	public void setComment(String comment) {
		this.comment = comment;
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

	@Column(name = "drug_fee_percent", precision = 16)
	public Double getDrugFeePercent() {
		return this.drugFeePercent;
	}

	public void setDrugFeePercent(Double drugFeePercent) {
		this.drugFeePercent = drugFeePercent;
	}

	@Column(name = "treatment_fee_percent", precision = 16)
	public Double getTreatmentFeePercent() {
		return this.treatmentFeePercent;
	}

	public void setTreatmentFeePercent(Double treatmentFeePercent) {
		this.treatmentFeePercent = treatmentFeePercent;
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

	@Column(name = "charge_type", length = 32)
	public String getChargeType() {
		return this.chargeType;
	}

	public void setChargeType(String chargeType) {
		this.chargeType = chargeType;
	}

	@Column(name = "register_type", length = 32)
	public String getRegisterType() {
		return this.registerType;
	}

	public void setRegisterType(String registerType) {
		this.registerType = registerType;
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
	
	@Column(name = "patient_gender", length = 100)
	public String getPatientGender() {
		return patientGender;
	}

	public void setPatientGender(String patientGender) {
		this.patientGender = patientGender;
	}
	@Column(name = "patient_age", length = 100)
	public String getPatientAge() {
		return patientAge;
	}

	public void setPatientAge(String patientAge) {
		this.patientAge = patientAge;
	}

	@Column(name = "patient_source", length = 32)
	public String getPatientSource() {
		return this.patientSource;
	}

	public void setPatientSource(String patientSource) {
		this.patientSource = patientSource;
	}

	@Column(name = "serial_number", length = 100)
	public String getSerialNumber() {
		return this.serialNumber;
	}

	public void setSerialNumber(String serialNumber) {
		this.serialNumber = serialNumber;
	}
	@Temporal(TemporalType.DATE)
	@Column(name = "register_date")
	public Date getRegisterDate() {
		return this.registerDate;
	}

	public void setRegisterDate(Date registerDate) {
		this.registerDate = registerDate;
	}
	
	
	
	@Column(name = "total_Fee")
	public Double getTotalFee() {
		return totalFee;
	}

	public void setTotalFee(Double totalFee) {
		this.totalFee = totalFee;
	}
	
	@Column(name = "total_Fee_To_Pay")
	public Double getTotalFeeToPay() {
		return totalFeeToPay;
	}

	public void setTotalFeeToPay(Double totalFeeToPay) {
		this.totalFeeToPay = totalFeeToPay;
	}
	 


	@Column(name = "organization_Name")
	public String getOrganizationName() {
		return organizationName;
	}

	public void setOrganizationName(String organizationName) {
		this.organizationName = organizationName;
	}
	
	
 
	@Column(name = "shift_period")
	public String getShiftPeriod() {
		return shiftPeriod;
	}

	public void setShiftPeriod(String shiftPeriod) {
		this.shiftPeriod = shiftPeriod;
	}
	@Column(name = "reg_department_name")
	public String getRegDepartmentName() {
		return regDepartmentName;
	}

	public void setRegDepartmentName(String regDepartmentName) {
		this.regDepartmentName = regDepartmentName;
	}
	@Column(name = "actual_department_name")
	public String getActualDepartmentName() {
		return actualDepartmentName;
	}

	public void setActualDepartmentName(String actualDepartmentName) {
		this.actualDepartmentName = actualDepartmentName;
	}
	@Column(name = "reg_doctor_name")
	public String getRegDoctorName() {
		return regDoctorName;
	}

	public void setRegDoctorName(String regDoctorName) {
		this.regDoctorName = regDoctorName;
	}
	@Column(name = "actual_doctor_name")
	public String getActualDoctorName() {
		return actualDoctorName;
	}

	public void setActualDoctorName(String actualDoctorName) {
		this.actualDoctorName = actualDoctorName;
	}

	/**
	 * 订单开始时间
	 */
	private String createDateStart;
	/**
	 * 订单结束时间
	 */
	private String createDateEnd;
	
	private Double royalty;
	@Transient
	public Double getRoyalty() {
		return this.getTotalFeeToPay();
	}

	public void setRoyalty(Double royalty) {
		this.royalty = royalty;
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
}