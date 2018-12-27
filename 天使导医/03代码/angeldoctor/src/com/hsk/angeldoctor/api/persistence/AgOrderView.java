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
@Table(name = "ag_order_view")
public class AgOrderView {
	
	private Integer aoiId;
	private String serialNumber;
	private Integer organizationId;
	private Integer agentId;
	private Integer departmentId;
	private Integer shiftPlanId;
	private Integer shiftPeriodId;
	private Integer patientId;
	private Integer doctorId;
	private Integer aaiId;
	private Integer firstAgentId;
	private Integer secondAgentId;
	private String patientSource;
	private Integer parentRegistrationId;
	private String registerType;
	private Date registerDate;
	private String patientName;
	private String patientMobile;
	private String patientGender;
	private String patientAge;
	private String description;
	private String outpatientName;
	private String registerStatus;
	private String outpatientStatus;
	private String isFirstAgent;
	private String chargeType;
	private String status;
	private String createRen;
	private Date createDate;
	private String editRen;
	private Date editDate;
	private Integer id;
	private String organizationName;
	private String departmentName;
	private String doctorName;
	private String expert;
	private String shiftPeriod;
	private Double treatmentFee;
	private Double drugFee;
	private String agentName;
	private String agentMobile;
	private String firstAgentName;
	private String firstAgentMobile;
	private String secondAgentName;
	private String secondAgentMobile;
	private Double patientSharePercent;
	private Double primarySalesmanSharePercent;
	private Double secondarySalesmanSharePercent;
	private Double platformSharePercent;
	private Double organizationSharePercent;
	private Double reservedSharePercent;

	// Constructors

	/** default constructor */
	public AgOrderView() {
	}

	/** minimal constructor */
	public AgOrderView(Integer aoiId) {
		this.aoiId = aoiId;
	}

	/** full constructor */
	public AgOrderView(Integer aoiId, String serialNumber, Integer organizationId, Integer agentId,
			Integer departmentId, Integer shiftPlanId, Integer shiftPeriodId, Integer patientId, Integer doctorId,
			Integer aaiId, Integer firstAgentId, Integer secondAgentId, String patientSource,
			Integer parentRegistrationId, String registerType, Date registerDate, String patientName,
			String patientMobile, String patientGender, String patientAge, String description, String outpatientName,
			String registerStatus, String outpatientStatus, String isFirstAgent, String chargeType, String status,
			String createRen, Date createDate, String editRen, Date editDate, Integer id,
			String organizationName, String departmentName, String doctorName, String expert, String shiftPeriod,
			Double treatmentFee, Double drugFee, String agentName, String agentMobile, String firstAgentName,
			String firstAgentMobile, String secondAgentName, String secondAgentMobile, Double patientSharePercent,
			Double primarySalesmanSharePercent, Double secondarySalesmanSharePercent, Double platformSharePercent,
			Double organizationSharePercent) {
		this.aoiId = aoiId;
		this.serialNumber = serialNumber;
		this.organizationId = organizationId;
		this.agentId = agentId;
		this.departmentId = departmentId;
		this.shiftPlanId = shiftPlanId;
		this.shiftPeriodId = shiftPeriodId;
		this.patientId = patientId;
		this.doctorId = doctorId;
		this.aaiId = aaiId;
		this.firstAgentId = firstAgentId;
		this.secondAgentId = secondAgentId;
		this.patientSource = patientSource;
		this.parentRegistrationId = parentRegistrationId;
		this.registerType = registerType;
		this.registerDate = registerDate;
		this.patientName = patientName;
		this.patientMobile = patientMobile;
		this.patientGender = patientGender;
		this.patientAge = patientAge;
		this.description = description;
		this.outpatientName = outpatientName;
		this.registerStatus = registerStatus;
		this.outpatientStatus = outpatientStatus;
		this.isFirstAgent = isFirstAgent;
		this.chargeType = chargeType;
		this.status = status;
		this.createRen = createRen;
		this.createDate = createDate;
		this.editRen = editRen;
		this.editDate = editDate;
		this.id = id;
		this.organizationName = organizationName;
		this.departmentName = departmentName;
		this.doctorName = doctorName;
		this.expert = expert;
		this.shiftPeriod = shiftPeriod;
		this.treatmentFee = treatmentFee;
		this.drugFee = drugFee;
		this.agentName = agentName;
		this.agentMobile = agentMobile;
		this.firstAgentName = firstAgentName;
		this.firstAgentMobile = firstAgentMobile;
		this.secondAgentName = secondAgentName;
		this.secondAgentMobile = secondAgentMobile;
		this.patientSharePercent = patientSharePercent;
		this.primarySalesmanSharePercent = primarySalesmanSharePercent;
		this.secondarySalesmanSharePercent = secondarySalesmanSharePercent;
		this.platformSharePercent = platformSharePercent;
		this.organizationSharePercent = organizationSharePercent;
	}

	// Property accessors
	@Id
	@Column(name = "aoi_id", nullable = false)

	public Integer getAoiId() {
		return this.aoiId;
	}

	public void setAoiId(Integer aoiId) {
		this.aoiId = aoiId;
	}

	@Column(name = "serial_number", length = 100)

	public String getSerialNumber() {
		return this.serialNumber;
	}

	public void setSerialNumber(String serialNumber) {
		this.serialNumber = serialNumber;
	}

	@Column(name = "organization_id")

	public Integer getOrganizationId() {
		return this.organizationId;
	}

	public void setOrganizationId(Integer organizationId) {
		this.organizationId = organizationId;
	}

	@Column(name = "agent_id")

	public Integer getAgentId() {
		return this.agentId;
	}

	public void setAgentId(Integer agentId) {
		this.agentId = agentId;
	}

	@Column(name = "department_id")

	public Integer getDepartmentId() {
		return this.departmentId;
	}

	public void setDepartmentId(Integer departmentId) {
		this.departmentId = departmentId;
	}

	@Column(name = "shift_plan_id")

	public Integer getShiftPlanId() {
		return this.shiftPlanId;
	}

	public void setShiftPlanId(Integer shiftPlanId) {
		this.shiftPlanId = shiftPlanId;
	}

	@Column(name = "shift_period_id")

	public Integer getShiftPeriodId() {
		return this.shiftPeriodId;
	}

	public void setShiftPeriodId(Integer shiftPeriodId) {
		this.shiftPeriodId = shiftPeriodId;
	}

	@Column(name = "patient_id")

	public Integer getPatientId() {
		return this.patientId;
	}

	public void setPatientId(Integer patientId) {
		this.patientId = patientId;
	}

	@Column(name = "doctor_id")

	public Integer getDoctorId() {
		return this.doctorId;
	}

	public void setDoctorId(Integer doctorId) {
		this.doctorId = doctorId;
	}

	@Column(name = "aai_id")

	public Integer getAaiId() {
		return this.aaiId;
	}

	public void setAaiId(Integer aaiId) {
		this.aaiId = aaiId;
	}

	@Column(name = "first_agent_id")

	public Integer getFirstAgentId() {
		return this.firstAgentId;
	}

	public void setFirstAgentId(Integer firstAgentId) {
		this.firstAgentId = firstAgentId;
	}

	@Column(name = "second_agent_id")

	public Integer getSecondAgentId() {
		return this.secondAgentId;
	}

	public void setSecondAgentId(Integer secondAgentId) {
		this.secondAgentId = secondAgentId;
	}

	@Column(name = "patient_source", length = 32)

	public String getPatientSource() {
		return this.patientSource;
	}

	public void setPatientSource(String patientSource) {
		this.patientSource = patientSource;
	}

	@Column(name = "parent_registration_id")

	public Integer getParentRegistrationId() {
		return this.parentRegistrationId;
	}

	public void setParentRegistrationId(Integer parentRegistrationId) {
		this.parentRegistrationId = parentRegistrationId;
	}

	@Column(name = "register_type", length = 32)

	public String getRegisterType() {
		return this.registerType;
	}

	public void setRegisterType(String registerType) {
		this.registerType = registerType;
	}
	@Temporal(TemporalType.DATE)
	@Column(name = "register_date", length = 0)

	public Date getRegisterDate() {
		return this.registerDate;
	}

	public void setRegisterDate(Date registerDate) {
		this.registerDate = registerDate;
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

	@Column(name = "patient_gender", length = 32)

	public String getPatientGender() {
		return this.patientGender;
	}

	public void setPatientGender(String patientGender) {
		this.patientGender = patientGender;
	}

	@Column(name = "patient_age", length = 32)

	public String getPatientAge() {
		return this.patientAge;
	}

	public void setPatientAge(String patientAge) {
		this.patientAge = patientAge;
	}

	@Column(name = "description")

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	@Column(name = "outpatient_name", length = 100)

	public String getOutpatientName() {
		return this.outpatientName;
	}

	public void setOutpatientName(String outpatientName) {
		this.outpatientName = outpatientName;
	}

	@Column(name = "register_status", length = 32)

	public String getRegisterStatus() {
		return this.registerStatus;
	}

	public void setRegisterStatus(String registerStatus) {
		this.registerStatus = registerStatus;
	}

	@Column(name = "outpatient_status", length = 32)

	public String getOutpatientStatus() {
		return this.outpatientStatus;
	}

	public void setOutpatientStatus(String outpatientStatus) {
		this.outpatientStatus = outpatientStatus;
	}

	@Column(name = "is_first_agent", length = 32)

	public String getIsFirstAgent() {
		return this.isFirstAgent;
	}

	public void setIsFirstAgent(String isFirstAgent) {
		this.isFirstAgent = isFirstAgent;
	}

	@Column(name = "charge_type", length = 32)

	public String getChargeType() {
		return this.chargeType;
	}

	public void setChargeType(String chargeType) {
		this.chargeType = chargeType;
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
	@Column(name = "create_date", length = 0)

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
	@Column(name = "edit_date", length = 0)

	public Date getEditDate() {
		return this.editDate;
	}
	
	public void setEditDate(Date editDate) {
		this.editDate = editDate;
	}

	@Column(name = "id", nullable = false)

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	@Column(name = "organization_name", length = 100)

	public String getOrganizationName() {
		return this.organizationName;
	}

	public void setOrganizationName(String organizationName) {
		this.organizationName = organizationName;
	}

	@Column(name = "department_name", length = 100)

	public String getDepartmentName() {
		return this.departmentName;
	}

	public void setDepartmentName(String departmentName) {
		this.departmentName = departmentName;
	}

	@Column(name = "doctor_name", length = 100)

	public String getDoctorName() {
		return this.doctorName;
	}

	public void setDoctorName(String doctorName) {
		this.doctorName = doctorName;
	}

	@Column(name = "expert", length = 32)

	public String getExpert() {
		return this.expert;
	}

	public void setExpert(String expert) {
		this.expert = expert;
	}

	@Column(name = "shift_period", length = 131)

	public String getShiftPeriod() {
		return this.shiftPeriod;
	}

	public void setShiftPeriod(String shiftPeriod) {
		this.shiftPeriod = shiftPeriod;
	}

	@Column(name = "treatment_fee", precision = 16)

	public Double getTreatmentFee() {
		return this.treatmentFee;
	}

	public void setTreatmentFee(Double treatmentFee) {
		this.treatmentFee = treatmentFee;
	}

	@Column(name = "drug_fee", precision = 16)

	public Double getDrugFee() {
		return this.drugFee;
	}

	public void setDrugFee(Double drugFee) {
		this.drugFee = drugFee;
	}

	@Column(name = "agent_name", length = 100)

	public String getAgentName() {
		return this.agentName;
	}

	public void setAgentName(String agentName) {
		this.agentName = agentName;
	}

	@Column(name = "agent_mobile", length = 100)

	public String getAgentMobile() {
		return this.agentMobile;
	}

	public void setAgentMobile(String agentMobile) {
		this.agentMobile = agentMobile;
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

	public void setPrimarySalesmanSharePercent(Double primarySalesmanSharePercent) {
		this.primarySalesmanSharePercent = primarySalesmanSharePercent;
	}

	@Column(name = "secondary_salesman_share_percent", precision = 16)

	public Double getSecondarySalesmanSharePercent() {
		return this.secondarySalesmanSharePercent;
	}

	public void setSecondarySalesmanSharePercent(Double secondarySalesmanSharePercent) {
		this.secondarySalesmanSharePercent = secondarySalesmanSharePercent;
	}

	@Column(name = "platform_share_percent", precision = 16)

	public Double getPlatformSharePercent() {
		return this.platformSharePercent;
	}

	public void setPlatformSharePercent(Double platformSharePercent) {
		this.platformSharePercent = platformSharePercent;
	}

	@Column(name = "organization_share_percent", precision = 16)

	public Double getOrganizationSharePercent() {
		return this.organizationSharePercent;
	}

	public void setOrganizationSharePercent(Double organizationSharePercent) {
		this.organizationSharePercent = organizationSharePercent;
	}
	@Column(name = "reserved_share_percent" )
	public Double getReservedSharePercent() {
		return reservedSharePercent;
	}

	public void setReservedSharePercent(Double reservedSharePercent) {
		this.reservedSharePercent = reservedSharePercent;
	}
	
	private String previousRegistration;
	private String previousRegistrationStr;
	
	@Transient
	public String getPreviousRegistration() {
		if(this.parentRegistrationId!=null){
			previousRegistration="1";
		}else
			previousRegistration="0";
		return previousRegistration;
	}

	public void setPreviousRegistration(String previousRegistration) {
		this.previousRegistration = previousRegistration;
	}
	@Transient
	public String getPreviousRegistrationStr() {
		return previousRegistrationStr;
	}

	public void setPreviousRegistrationStr(String previousRegistrationStr) {
		this.previousRegistrationStr = previousRegistrationStr;
	}

	private String filterStr;
	@Transient
	public String getFilterStr() {
		return filterStr;
	}

	public void setFilterStr(String filterStr) {
		this.filterStr = filterStr;
	}
	
	
}
