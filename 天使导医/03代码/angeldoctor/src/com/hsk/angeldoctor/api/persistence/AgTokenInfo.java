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
@Table(name = "ag_token_info" )
public class AgTokenInfo {
	
	private Integer atiId;
	private String token;
	private Integer suiId;
	private Date createDate;
	
	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "ati_id")
	public Integer getAtiId() {
		return atiId;
	}
	public void setAtiId(Integer atiId) {
		this.atiId = atiId;
	}
	@Column(name = "token")
	public String getToken() {
		return token;
	}
	public void setToken(String token) {
		this.token = token;
	}
	@Column(name = "sui_id")
	public Integer getSuiId() {
		return suiId;
	}
	public void setSuiId(Integer suiId) {
		this.suiId = suiId;
	}
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "create_date" ) 
	public Date getCreateDate() {
		return createDate;
	}
	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}
}
