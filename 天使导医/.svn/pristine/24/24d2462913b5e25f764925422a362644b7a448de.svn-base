package com.hsk.angeldoctor.api.persistence;

import static javax.persistence.GenerationType.IDENTITY;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@SuppressWarnings("serial")
@Entity
@Table(name = "ag_deposit_info")
public class AgDepositInfo {
	
	private Integer adiId;
	private Integer organizationId;
	private Double depositAmount;
	
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
	
	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "adi_id")
	public Integer getAdiId() {
		return adiId;
	}

	public void setAdiId(Integer adiId) {
		this.adiId = adiId;
	}
	@Column(name = "organization_id")
	public Integer getOrganizationId() {
		return organizationId;
	}

	public void setOrganizationId(Integer organizationId) {
		this.organizationId = organizationId;
	}
	@Column(name = "deposit_amount")
	public Double getDepositAmount() {
		return depositAmount;
	}

	public void setDepositAmount(Double depositAmount) {
		this.depositAmount = depositAmount;
	}

	/**
	 *设置是否在职,0是，1不是(status)字段方法 
	 *@return  返回 <b>AgDoctorInfo.Status</b>的值
	 */	 
	@Column(name = "status" ) 
	public String getStatus(){
	    return this.status;
	}

  /**
   *设置 status字段方法 
   *@param att_status 输入<b>AgDoctorInfo.status</b>字段的值
   */
  public void setStatus(String att_status){
    this.status = att_status;
  }

	/**
	 *设置创建人(create_ren)字段方法 
	 *@return  返回 <b>AgDoctorInfo.CreateRen</b>的值
	 */	 
	@Column(name = "create_ren" ) 
	public String getCreateRen(){
	    return this.createRen;
	}

  /**
   *设置 create_ren字段方法 
   *@param att_createRen 输入<b>AgDoctorInfo.createRen</b>字段的值
   */
  public void setCreateRen(String att_createRen){
    this.createRen = att_createRen;
  }

	/**
	 *设置创建时间(create_date)字段方法 
	 *@return  返回 <b>AgDoctorInfo.CreateDate</b>的值
	 */	 
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "create_date" ) 
	public Date getCreateDate(){
	    return this.createDate;
	}

  /**
   *设置 create_date字段方法 
   *@param att_createDate 输入<b>AgDoctorInfo.createDate</b>字段的值
   */
  public void setCreateDate(Date att_createDate){
    this.createDate = att_createDate;
  }

	/**
	 *设置修改人(edit_ren)字段方法 
	 *@return  返回 <b>AgDoctorInfo.EditRen</b>的值
	 */	 
	@Column(name = "edit_ren" ) 
	public String getEditRen(){
	    return this.editRen;
	}

  /**
   *设置 edit_ren字段方法 
   *@param att_editRen 输入<b>AgDoctorInfo.editRen</b>字段的值
   */
  public void setEditRen(String att_editRen){
    this.editRen = att_editRen;
  }

	/**
	 *设置修改时间(edit_date)字段方法 
	 *@return  返回 <b>AgDoctorInfo.EditDate</b>的值
	 */	 
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "edit_date" ) 
	public Date getEditDate(){
	    return this.editDate;
	}

  /**
   *设置 edit_date字段方法 
   *@param att_editDate 输入<b>AgDoctorInfo.editDate</b>字段的值
   */
  public void setEditDate(Date att_editDate){
    this.editDate = att_editDate;
  }
	

}
