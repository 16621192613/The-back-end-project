package com.hsk.angeldoctor.api.persistence;

import static javax.persistence.GenerationType.IDENTITY;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
/**
 * app设备
 * @author Administrator
 *
 */
@SuppressWarnings("serial")
@Entity
@Table(name = "ag_app_device")
public class AgAppDevice {
	private Integer aadId;//设备ID
	private Integer agentId;//业务员ID
	private String token;//注册ID
	private String appType;//设备类型
	
	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "aad_id")
	public Integer getAadId() {
		return aadId;
	}
	public void setAadId(Integer aadId) {
		this.aadId = aadId;
	}
	@Column(name = "agent_id")
	public Integer getAgentId() {
		return agentId;
	}
	public void setAgentId(Integer agentId) {
		this.agentId = agentId;
	}
	@Column(name = "token")
	public String getToken() {
		return token;
	}
	public void setToken(String token) {
		this.token = token;
	}
	@Column(name = "app_type")
	public String getAppType() {
		return appType;
	}
	public void setAppType(String appType) {
		this.appType = appType;
	}
	
	
}
