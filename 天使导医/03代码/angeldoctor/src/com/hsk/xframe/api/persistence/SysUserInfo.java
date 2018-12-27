package com.hsk.xframe.api.persistence;

import static javax.persistence.GenerationType.IDENTITY;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Transient;

import org.hibernate.annotations.Formula;

@SuppressWarnings("serial")
@Entity
@Table(name = "sys_user_info")
public class SysUserInfo {
	
	private Integer suiId;
	private Integer sroleId;
	private String userName;
	private String userCode;
	private String email;
	private String phoneNumber;
	private String account;
	private String password;
	private String authentCode;
	private Date createDate;
	private String createRen;
	private Integer state;
	private String barCode;
	private String barCodeFileCode;
	private String editRen;
	private Date editDate;//上次登录时间
	 
	private Integer orgGxId; 
	private String orgName;
	private Integer userType;//用户类型:1:管理员；2：供应商；3集团；4医院；5门诊
	private Integer userRole;
	private String roleName;
	
	
	private String organizaType; 
	
	private Integer oldId;
	
	private String barCodePath;
	
	private String isAdmin;
	
	private String registrationId;//极光推送ID
	
	
	public SysUserInfo(){
		
	}
	
	public SysUserInfo(Integer suiId){
		this.suiId = suiId;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "sui_id", unique = true, nullable = false)
	public Integer getSuiId() {
		return suiId;
	}

	public void setSuiId(Integer suiId) {
		this.suiId = suiId;
	}
	
	@Column(name = "user_name", unique = false, nullable = true, insertable = true, updatable = true, length = 64)
	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}
	@Column(name = "user_code", unique = false, nullable = true, insertable = true, updatable = true, length = 32)
	public String getUserCode() {
		return userCode;
	}

	public void setUserCode(String userCode) {
		this.userCode = userCode;
	}
	
	@Column(name = "user_email", unique = false, nullable = true, insertable = true, updatable = true, length = 64)
	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	@Column(name = "user_phone_number", unique = false, nullable = true, insertable = true, updatable = true, length = 64)
	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	@Column(name = "password", unique = false, nullable = true, insertable = true, updatable = true, length = 64)
	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	@Column(name = "authent_code", unique = false, nullable = true, insertable = true, updatable = true, length = 16)
	public String getAuthentCode() {
		return authentCode;
	}

	public void setAuthentCode(String authentCode) {
		this.authentCode = authentCode;
	}
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "create_date")
	public Date getCreateDate() {
		return createDate;
	}

	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}
	@Column(name = "create_ren", unique = false, nullable = true, insertable = true, updatable = true, length = 32)
	public String getCreateRen() {
		return createRen;
	}
	

	public void setCreateRen(String createRen) {
		this.createRen = createRen;
	}
	@Column(name = "account", unique = false, nullable = true, insertable = true, updatable = true, length = 215)
	public String getAccount() {
		return account;
	}

	public void setAccount(String account) {
		this.account = account;
	}

	@Column(name = "state", unique = false, nullable = true, insertable = true, updatable = true, length = 10)
	public Integer getState() {
		return state;
	}

	public void setState(Integer state) {
		this.state = state;
	}
	@Column(name = "srole_id")
	public Integer getSroleId() {
		return sroleId;
	}

	public void setSroleId(Integer sroleId) {
		this.sroleId = sroleId;
	}
	@Column(name = "barcode", unique = false, nullable = true, insertable = true, updatable = true, length = 64)
	public String getBarCode() {
		return barCode;
	}

	public void setBarCode(String barCode) {
		this.barCode = barCode;
	}
	@Column(name = "barcode_filecode")
	public String getBarCodeFileCode() {
		return barCodeFileCode;
	}

	public void setBarCodeFileCode(String barCodeFileCode) {
		this.barCodeFileCode = barCodeFileCode;
	}

	@Column(name = "edit_ren", unique = false, nullable = true, insertable = true, updatable = true, length = 100)
	public String getEditRen() {
		return editRen;
	}

	public void setEditRen(String editRen) {
		this.editRen = editRen;
	}
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "edit_date")
	public Date getEditDate() {
		return editDate;
	}

	public void setEditDate(Date editDate) {
		this.editDate = editDate;
	}
	
	@Column(name = "user_type")
	public Integer getUserType() {
		return userType;
	}

	public void setUserType(Integer userType) {
		this.userType = userType;
	}
	@Column(name = "org_gx_id")
	public Integer getOrgGxId() {
		return orgGxId;
	}

	public void setOrgGxId(Integer orgGxId) {
		this.orgGxId = orgGxId;
	}
	
	@Column(name = "user_role")
	public Integer getUserRole() {
		return userRole;
	}

	public void setUserRole(Integer userRole) {
		this.userRole = userRole;
	}
	
	
	@Transient
	public String getOrgName() {
		return orgName;
	}

	public void setOrgName(String orgName) {
		this.orgName = orgName;
	}
	@Transient
	public String getOrganizaType() {
		return organizaType;
	}

	public void setOrganizaType(String organizaType) {
		this.organizaType = organizaType;
	}
	@Transient
	public Integer getOldId() {
		return oldId;
	}

	public void setOldId(Integer oldId) {
		this.oldId = oldId;
	} 
	
	public  String suiId_str ;

	@Transient
	public String getSuiId_str() {
		return suiId_str;
	}

	public void setSuiId_str(String suiId_str) {
		this.suiId_str = suiId_str;
	}
	
	
	public  String state_str ;

	@Transient
	public String getState_str() {
		return state_str;
	}

	public void setState_str(String state_str) {
		this.state_str = state_str;
	}
	@Transient
	public String getBarCodePath() {
		return barCodePath;
	}

	public void setBarCodePath(String barCodePath) {
		this.barCodePath = barCodePath;
	}
	@Formula("(SELECT a.menu_name FROM sys_role_info a WHERE a.srole_id= user_role)")
	public String getRoleName() {
		return roleName;
	}

	public void setRoleName(String roleName) {
		this.roleName = roleName;
	}
	@Formula("(SELECT a.is_admin FROM sys_role_info a WHERE a.srole_id= user_role)")
	public String getIsAdmin() {
		return isAdmin;
	}

	public void setIsAdmin(String isAdmin) {
		this.isAdmin = isAdmin;
	}
	@Column(name = "registration_id")
	public String getRegistrationId() {
		return registrationId;
	}

	public void setRegistrationId(String registrationId) {
		this.registrationId = registrationId;
	}
}
