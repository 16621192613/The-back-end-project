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
import javax.persistence.Transient;

/**
 * app推送
 * @author Administrator
 *
 */
@SuppressWarnings("serial")
@Entity
@Table(name = "ag_app_notification")
public class AgAppNotification {
	
	private Integer aanId;
	private Integer agentId;
	private String type;
	private Integer aniId;
	private String title;
	private String body;
	private Date createDate;
	
	private Integer id;
	
	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "aan_id")
	public Integer getAanId() {
		return aanId;
	}
	public void setAanId(Integer aanId) {
		this.aanId = aanId;
	}
	@Column(name = "agent_id")
	public Integer getAgentId() {
		return agentId;
	}
	public void setAgentId(Integer agentId) {
		this.agentId = agentId;
	}
	@Column(name = "type")
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	@Column(name = "ani_id")
	public Integer getAniId() {
		return aniId;
	}
	public void setAniId(Integer aniId) {
		this.aniId = aniId;
	}
	@Column(name = "title")
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	@Column(name = "body")
	public String getBody() {
		return body;
	}
	public void setBody(String body) {
		this.body = body;
	}
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "create_date" ) 
	public Date getCreateDate() {
		return createDate;
	}
	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}
	
	@Transient
	public Integer getId() {
		return aanId;
	}

	public void setId(Integer id) {
		this.aanId=id;
	}
}
