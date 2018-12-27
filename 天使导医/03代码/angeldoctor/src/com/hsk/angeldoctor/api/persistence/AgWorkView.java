package com.hsk.angeldoctor.api.persistence;


import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;

import org.hibernate.annotations.Formula;

@Entity
@Table(name = "ag_work_view")
public class AgWorkView {
	
	private Integer shiftPlanId;
	private Integer departmentId;
	private Integer organizationId;
	private Integer doctorId;
	private Integer shiftPeriodId;
	private String planDate;
	private Integer planCount;
	private String status;
	private String createRen;
	private Date createDate;
	private String editRen;
	private Date editDate;
	private Integer id;
	private String organizationName;
	private String departmentName;
	private String doctorName;
	private String shiftPeriod;
	private String shiftStart;
	private String shiftEnd;
	private String docIds;
	// Constructors

	/** default constructor */
	public AgWorkView() {
	}

	/** minimal constructor */
	public AgWorkView(Integer shiftPlanId, Integer id) {
		this.shiftPlanId = shiftPlanId;
		this.id = id;
	}

	/** full constructor */
	public AgWorkView(Integer shiftPlanId, Integer departmentId, Integer organizationId, Integer doctorId,
			Integer shiftPeriodId, String planDate, Integer planCount, String status,
			String createRen, Date createDate, String editRen, Date editDate, Integer id,
			String organizationName, String departmentName, String doctorName, String shiftPeriod) {
		this.shiftPlanId = shiftPlanId;
		this.departmentId = departmentId;
		this.organizationId = organizationId;
		this.doctorId = doctorId;
		this.shiftPeriodId = shiftPeriodId;
		this.planDate = planDate;
		this.planCount = planCount;
		this.status = status;
		this.createRen = createRen;
		this.createDate = createDate;
		this.editRen = editRen;
		this.editDate = editDate;
		this.id = id;
		this.organizationName = organizationName;
		this.departmentName = departmentName;
		this.doctorName = doctorName;
		this.shiftPeriod = shiftPeriod;
	}

	// Property accessors
	@Id
	@Column(name = "shift_plan_id", nullable = false)

	public Integer getShiftPlanId() {
		return this.shiftPlanId;
	}

	public void setShiftPlanId(Integer shiftPlanId) {
		this.shiftPlanId = shiftPlanId;
	}

	@Column(name = "department_id")

	public Integer getDepartmentId() {
		return this.departmentId;
	}

	public void setDepartmentId(Integer departmentId) {
		this.departmentId = departmentId;
	}

	@Column(name = "organization_id")

	public Integer getOrganizationId() {
		return this.organizationId;
	}

	public void setOrganizationId(Integer organizationId) {
		this.organizationId = organizationId;
	}

	@Column(name = "doctor_id")

	public Integer getDoctorId() {
		return this.doctorId;
	}

	public void setDoctorId(Integer doctorId) {
		this.doctorId = doctorId;
	}

	@Column(name = "shift_period_id")

	public Integer getShiftPeriodId() {
		return this.shiftPeriodId;
	}

	public void setShiftPeriodId(Integer shiftPeriodId) {
		this.shiftPeriodId = shiftPeriodId;
	}

	@Column(name = "plan_date", length = 32)

	public String getPlanDate() {
		return this.planDate;
	}

	public void setPlanDate(String planDate) {
		this.planDate = planDate;
	}

	@Column(name = "plan_count")

	public Integer getPlanCount() {
		return this.planCount;
	}

	public void setPlanCount(Integer planCount) {
		this.planCount = planCount;
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

	@Column(name = "organizationName", length = 100)

	public String getOrganizationName() {
		return this.organizationName;
	}

	public void setOrganizationName(String organizationName) {
		this.organizationName = organizationName;
	}

	@Column(name = "departmentName", length = 100)

	public String getDepartmentName() {
		return this.departmentName;
	}

	public void setDepartmentName(String departmentName) {
		this.departmentName = departmentName;
	}

	@Column(name = "doctorName", length = 100)

	public String getDoctorName() {
		return this.doctorName;
	}

	public void setDoctorName(String doctorName) {
		this.doctorName = doctorName;
	}

	@Column(name = "shift_period", length = 131)

	public String getShiftPeriod() {
		return this.shiftPeriod;
	}

	public void setShiftPeriod(String shiftPeriod) {
		this.shiftPeriod = shiftPeriod;
	}
	
	@Column(name = "shift_start")
	public String getShiftStart() {
		return shiftStart;
	}

	public void setShiftStart(String shiftStart) {
		this.shiftStart = shiftStart;
	}
	@Column(name = "shift_end")
	public String getShiftEnd() {
		return shiftEnd;
	}

	public void setShiftEnd(String shiftEnd) {
		this.shiftEnd = shiftEnd;
	}

	private Integer actualCount;
	private String shiftStart_start;
	private String shiftStart_end;
	private String shiftEnd_start;
	private String shiftEnd_end;
	
	@Transient
	public String getShiftStart_start() {
		return shiftStart_start;
	}

	public void setShiftStart_start(String shiftStart_start) {
		this.shiftStart_start = shiftStart_start;
	}
	@Transient
	public String getShiftStart_end() {
		return shiftStart_end;
	}

	public void setShiftStart_end(String shiftStart_end) {
		this.shiftStart_end = shiftStart_end;
	}
	@Transient
	public String getShiftEnd_start() {
		return shiftEnd_start;
	}

	public void setShiftEnd_start(String shiftEnd_start) {
		this.shiftEnd_start = shiftEnd_start;
	}
	@Transient
	public String getShiftEnd_end() {
		return shiftEnd_end;
	}

	public void setShiftEnd_end(String shiftEnd_end) {
		this.shiftEnd_end = shiftEnd_end;
	}

	@Formula("(SELECT COUNT(1) FROM ag_order_info a WHERE a.shift_plan_id=shift_plan_id AND a.status=0 and a.register_status in (0,1) )")
	public Integer getActualCount() {
		return actualCount;
	}

	public void setActualCount(Integer actualCount) {
		this.actualCount = actualCount;
	}
	@Transient
	public String getDocIds() {
		return docIds;
	}

	public void setDocIds(String docIds) {
		this.docIds = docIds;
	}
	

}
