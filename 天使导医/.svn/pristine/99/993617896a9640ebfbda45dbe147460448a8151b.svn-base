package com.hsk.angeldoctor.api.persistence;

import javax.persistence.*;

import org.hibernate.annotations.Formula;

import static javax.persistence.GenerationType.IDENTITY;
import java.util.Date;

/**
 * 根据ag_agent_info表结构自动生成持久化对象<B> com.hsk.angeldoctor.api.persistence.AgAgentInfo</B>
 *<hr/>
 *===============数据库表字段属性==========
 *  <table> 
 * <tr><th>字段名称:</th><td>代理商ID(aaiId)</td><th>字段类型:</th><td>Integer(主键)</td></tr> 
 * <tr><th>字段名称:</th><td>代理商类型:0代理商，1医院(reservedRelateTo)</td><th>字段类型:</th><td>String(可以为空)</td></tr> 
 * <tr><th>字段名称:</th><td>上级组织ID(reservedRelateToOrganizationId)</td><th>字段类型:</th><td>Integer(可以为空)</td></tr> 
 * <tr><th>字段名称:</th><td>代理商名称(name)</td><th>字段类型:</th><td>String(可以为空)</td></tr> 
 * <tr><th>字段名称:</th><td>手机号(mobile)</td><th>字段类型:</th><td>String(可以为空)</td></tr> 
 * <tr><th>字段名称:</th><td>省(reservedProvId)</td><th>字段类型:</th><td>String(可以为空)</td></tr> 
 * <tr><th>字段名称:</th><td>市(reservedCityId)</td><th>字段类型:</th><td>String(可以为空)</td></tr> 
 * <tr><th>字段名称:</th><td>分佣比例(reservedSharePercent)</td><th>字段类型:</th><td>Double(可以为空)</td></tr> 
 * <tr><th>字段名称:</th><td>银行名称(reservedBankName)</td><th>字段类型:</th><td>String(可以为空)</td></tr> 
 * <tr><th>字段名称:</th><td>银行账户名称(reservedAccountName)</td><th>字段类型:</th><td>String(可以为空)</td></tr> 
 * <tr><th>字段名称:</th><td>银行账号(reservedAccountNumber)</td><th>字段类型:</th><td>String(可以为空)</td></tr> 
 * <tr><th>字段名称:</th><td>所属团队(reservedRelateToTeamName)</td><th>字段类型:</th><td>String(可以为空)</td></tr> 
 * <tr><th>字段名称:</th><td>状态:1正常，2禁用(status)</td><th>字段类型:</th><td>String(可以为空)</td></tr> 
 * <tr><th>字段名称:</th><td>创建人(createRen)</td><th>字段类型:</th><td>String(可以为空)</td></tr> 
 * <tr><th>字段名称:</th><td>创建时间(createDate)</td><th>字段类型:</th><td>Date(可以为空)</td></tr> 
 * <tr><th>字段名称:</th><td>修改时间(editDate)</td><th>字段类型:</th><td>Date(可以为空)</td></tr> 
 * <tr><th>字段名称:</th><td>修改人(editRen)</td><th>字段类型:</th><td>String(可以为空)</td></tr> 
 * </table>
 *===============无关字段属性===============
 *  <table> 
 * 	<tr><th>字段名称:</th><td>代理商ID(aaiId)	</td><th>属性名称:</th><td>aaiId</td></tr>
 * 	<tr><th>字段名称:</th><td>上级组织ID(reservedRelateToOrganizationId)	</td><th>属性名称:</th><td>reservedRelateToOrganizationId</td></tr>
 * 	<tr><th>字段名称:</th><td>创建时间(createDate)	</td><th>属性名称:</th><td>createDate</td></tr>
 * 	<tr><th>字段名称:</th><td>创建时间(createDate)	</td><th>属性名称:</th><td>createDate</td></tr>
 * 	<tr><th>字段名称:</th><td>修改时间(editDate)	</td><th>属性名称:</th><td>editDate</td></tr>
 * 	<tr><th>字段名称:</th><td>修改时间(editDate)	</td><th>属性名称:</th><td>editDate</td></tr>
 * 	<tr><th>字段名称:</th><td>(tab_like)	</td><th>属性名称:</th><td>tab_like</td></tr>
 * 	<tr><th>字段名称:</th><td>(tab_order)	</td><th>属性名称:</th><td>tab_order</td></tr>
 * 	<tr><th>字段名称:</th><td>(reservedUsername)	</td><th>属性名称:</th><td>账号(修改时不需填写)</td></tr>
 * 	<tr><th>字段名称:</th><td>(reservedPassword)	</td><th>属性名称:</th><td>密码(修改时不需填写)</td></tr>
 * </table>
 * <hr/>
 * @author  作者:admin  
 * @version  v1.0 创建时间: 2018-08-14 13:31:11
 */
 
 
@SuppressWarnings("serial")
@Entity
@Table(name = "ag_agent_info" )
public class AgAgentInfo {
///===============数据库表字段属性begin==========
			/**
			 *代理商ID(aaiId):字段类型为Integer  
			 */
 			private Integer aaiId; 
 	
			/**
			 *代理商类型:0代理商，1医院(reservedRelateTo):字段类型为String  
			 */
 			private String reservedRelateTo; 
 	
			/**
			 *上级组织ID(reservedRelateToOrganizationId):字段类型为Integer  
			 */
 			private Integer reservedRelateToOrganizationId; 
 	
			/**
			 *代理商名称(name):字段类型为String  
			 */
 			private String name; 
 	
			/**
			 *手机号(mobile):字段类型为String  
			 */
 			private String mobile; 
 	
			/**
			 *省(reservedProvId):字段类型为String  
			 */
 			private String reservedProvId; 
 	
			/**
			 *市(reservedCityId):字段类型为String  
			 */
 			private String reservedCityId; 
 	
			/**
			 *分佣比例(reservedSharePercent):字段类型为Double  
			 */
 			private Double reservedSharePercent; 
 	
			/**
			 *银行名称(reservedBankName):字段类型为String  
			 */
 			private String reservedBankName; 
 	
			/**
			 *银行账户名称(reservedAccountName):字段类型为String  
			 */
 			private String reservedAccountName; 
 	
			/**
			 *银行账号(reservedAccountNumber):字段类型为String  
			 */
 			private String reservedAccountNumber; 
 	
			/**
			 *所属团队(reservedRelateToTeamName):字段类型为String  
			 */
 			private String reservedRelateToTeamName; 
 	
			/**
			 *状态:1正常，2禁用(status):字段类型为String  
			 */
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
			 *修改时间(editDate):字段类型为Date  
			 */
 			private Date editDate; 
 	
			/**
			 *修改人(editRen):字段类型为String  
			 */
 			private String editRen; 
 	
			/**
			 *设置代理商ID(aai_id)字段方法 (该字段是主键)
			 *@return  返回 <b>AgAgentInfo.AaiId</b>的值
			 */	 
			@Id
			@GeneratedValue(strategy = IDENTITY)
			@Column(name = "aai_id")
			public Integer getAaiId(){
			    return this.aaiId;
			}

		  /**
		   *设置 aai_id字段方法 
		   *@param att_aaiId 输入<b>AgAgentInfo.aaiId</b>字段的值
		   */
		  public void setAaiId(Integer att_aaiId){
		    this.aaiId = att_aaiId;
		  }
  
			/**
			 *设置代理商类型:0代理商，1医院(reserved_relate_to)字段方法 
			 *@return  返回 <b>AgAgentInfo.ReservedRelateTo</b>的值
			 */	 
			@Column(name = "reserved_relate_to" ) 
			public String getReservedRelateTo(){
			    return this.reservedRelateTo;
			}

		  /**
		   *设置 reserved_relate_to字段方法 
		   *@param att_reservedRelateTo 输入<b>AgAgentInfo.reservedRelateTo</b>字段的值
		   */
		  public void setReservedRelateTo(String att_reservedRelateTo){
		    this.reservedRelateTo = att_reservedRelateTo;
		  }
  
			/**
			 *设置上级组织ID(reserved_relate_to_organization_id)字段方法 
			 *@return  返回 <b>AgAgentInfo.ReservedRelateToOrganizationId</b>的值
			 */	 
			@Column(name = "reserved_relate_to_organization_id" ) 
			public Integer getReservedRelateToOrganizationId(){
			    return this.reservedRelateToOrganizationId;
			}

		  /**
		   *设置 reserved_relate_to_organization_id字段方法 
		   *@param att_reservedRelateToOrganizationId 输入<b>AgAgentInfo.reservedRelateToOrganizationId</b>字段的值
		   */
		  public void setReservedRelateToOrganizationId(Integer att_reservedRelateToOrganizationId){
		    this.reservedRelateToOrganizationId = att_reservedRelateToOrganizationId;
		  }
  
			/**
			 *设置代理商名称(name)字段方法 
			 *@return  返回 <b>AgAgentInfo.Name</b>的值
			 */	 
			@Column(name = "name" ) 
			public String getName(){
			    return this.name;
			}

		  /**
		   *设置 name字段方法 
		   *@param att_name 输入<b>AgAgentInfo.name</b>字段的值
		   */
		  public void setName(String att_name){
		    this.name = att_name;
		  }
  
			/**
			 *设置手机号(mobile)字段方法 
			 *@return  返回 <b>AgAgentInfo.Mobile</b>的值
			 */	 
			@Column(name = "mobile" ) 
			public String getMobile(){
			    return this.mobile;
			}

		  /**
		   *设置 mobile字段方法 
		   *@param att_mobile 输入<b>AgAgentInfo.mobile</b>字段的值
		   */
		  public void setMobile(String att_mobile){
		    this.mobile = att_mobile;
		  }
  
			/**
			 *设置省(reserved_prov_id)字段方法 
			 *@return  返回 <b>AgAgentInfo.ReservedProvId</b>的值
			 */	 
			@Column(name = "reserved_prov_id" ) 
			public String getReservedProvId(){
			    return this.reservedProvId;
			}

		  /**
		   *设置 reserved_prov_id字段方法 
		   *@param att_reservedProvId 输入<b>AgAgentInfo.reservedProvId</b>字段的值
		   */
		  public void setReservedProvId(String att_reservedProvId){
		    this.reservedProvId = att_reservedProvId;
		  }
  
			/**
			 *设置市(reserved_city_id)字段方法 
			 *@return  返回 <b>AgAgentInfo.ReservedCityId</b>的值
			 */	 
			@Column(name = "reserved_city_id" ) 
			public String getReservedCityId(){
			    return this.reservedCityId;
			}

		  /**
		   *设置 reserved_city_id字段方法 
		   *@param att_reservedCityId 输入<b>AgAgentInfo.reservedCityId</b>字段的值
		   */
		  public void setReservedCityId(String att_reservedCityId){
		    this.reservedCityId = att_reservedCityId;
		  }
  
			/**
			 *设置分佣比例(reserved_share_percent)字段方法 
			 *@return  返回 <b>AgAgentInfo.ReservedSharePercent</b>的值
			 */	 
			@Column(name = "reserved_share_percent" ) 
			public Double getReservedSharePercent(){
			    return this.reservedSharePercent;
			}

		  /**
		   *设置 reserved_share_percent字段方法 
		   *@param att_reservedSharePercent 输入<b>AgAgentInfo.reservedSharePercent</b>字段的值
		   */
		  public void setReservedSharePercent(Double att_reservedSharePercent){
		    this.reservedSharePercent = att_reservedSharePercent;
		  }
  
			/**
			 *设置银行名称(reserved_bank_name)字段方法 
			 *@return  返回 <b>AgAgentInfo.ReservedBankName</b>的值
			 */	 
			@Column(name = "reserved_bank_name" ) 
			public String getReservedBankName(){
			    return this.reservedBankName;
			}

		  /**
		   *设置 reserved_bank_name字段方法 
		   *@param att_reservedBankName 输入<b>AgAgentInfo.reservedBankName</b>字段的值
		   */
		  public void setReservedBankName(String att_reservedBankName){
		    this.reservedBankName = att_reservedBankName;
		  }
  
			/**
			 *设置银行账户名称(reserved_account_name)字段方法 
			 *@return  返回 <b>AgAgentInfo.ReservedAccountName</b>的值
			 */	 
			@Column(name = "reserved_account_name" ) 
			public String getReservedAccountName(){
			    return this.reservedAccountName;
			}

		  /**
		   *设置 reserved_account_name字段方法 
		   *@param att_reservedAccountName 输入<b>AgAgentInfo.reservedAccountName</b>字段的值
		   */
		  public void setReservedAccountName(String att_reservedAccountName){
		    this.reservedAccountName = att_reservedAccountName;
		  }
  
			/**
			 *设置银行账号(reserved_account_number)字段方法 
			 *@return  返回 <b>AgAgentInfo.ReservedAccountNumber</b>的值
			 */	 
			@Column(name = "reserved_account_number" ) 
			public String getReservedAccountNumber(){
			    return this.reservedAccountNumber;
			}

		  /**
		   *设置 reserved_account_number字段方法 
		   *@param att_reservedAccountNumber 输入<b>AgAgentInfo.reservedAccountNumber</b>字段的值
		   */
		  public void setReservedAccountNumber(String att_reservedAccountNumber){
		    this.reservedAccountNumber = att_reservedAccountNumber;
		  }
  
			/**
			 *设置所属团队(reserved_relate_to_team_name)字段方法 
			 *@return  返回 <b>AgAgentInfo.ReservedRelateToTeamName</b>的值
			 */	 
			@Column(name = "reserved_relate_to_team_name" ) 
			public String getReservedRelateToTeamName(){
			    return this.reservedRelateToTeamName;
			}

		  /**
		   *设置 reserved_relate_to_team_name字段方法 
		   *@param att_reservedRelateToTeamName 输入<b>AgAgentInfo.reservedRelateToTeamName</b>字段的值
		   */
		  public void setReservedRelateToTeamName(String att_reservedRelateToTeamName){
		    this.reservedRelateToTeamName = att_reservedRelateToTeamName;
		  }
  
			/**
			 *设置状态:1正常，2禁用(status)字段方法 
			 *@return  返回 <b>AgAgentInfo.Status</b>的值
			 */	 
			@Column(name = "status" ) 
			public String getStatus(){
			    return this.status;
			}

		  /**
		   *设置 status字段方法 
		   *@param att_status 输入<b>AgAgentInfo.status</b>字段的值
		   */
		  public void setStatus(String att_status){
		    this.status = att_status;
		  }
  
			/**
			 *设置创建人(create_ren)字段方法 
			 *@return  返回 <b>AgAgentInfo.CreateRen</b>的值
			 */	 
			@Column(name = "create_ren" ) 
			public String getCreateRen(){
			    return this.createRen;
			}

		  /**
		   *设置 create_ren字段方法 
		   *@param att_createRen 输入<b>AgAgentInfo.createRen</b>字段的值
		   */
		  public void setCreateRen(String att_createRen){
		    this.createRen = att_createRen;
		  }
  
			/**
			 *设置创建时间(create_date)字段方法 
			 *@return  返回 <b>AgAgentInfo.CreateDate</b>的值
			 */	 
			@Temporal(TemporalType.TIMESTAMP)
			@Column(name = "create_date" ) 
			public Date getCreateDate(){
			    return this.createDate;
			}

		  /**
		   *设置 create_date字段方法 
		   *@param att_createDate 输入<b>AgAgentInfo.createDate</b>字段的值
		   */
		  public void setCreateDate(Date att_createDate){
		    this.createDate = att_createDate;
		  }
  
			/**
			 *设置修改时间(edit_date)字段方法 
			 *@return  返回 <b>AgAgentInfo.EditDate</b>的值
			 */	 
			@Temporal(TemporalType.TIMESTAMP)
			@Column(name = "edit_date" ) 
			public Date getEditDate(){
			    return this.editDate;
			}

		  /**
		   *设置 edit_date字段方法 
		   *@param att_editDate 输入<b>AgAgentInfo.editDate</b>字段的值
		   */
		  public void setEditDate(Date att_editDate){
		    this.editDate = att_editDate;
		  }
  
			/**
			 *设置修改人(edit_ren)字段方法 
			 *@return  返回 <b>AgAgentInfo.EditRen</b>的值
			 */	 
			@Column(name = "edit_ren" ) 
			public String getEditRen(){
			    return this.editRen;
			}

		  /**
		   *设置 edit_ren字段方法 
		   *@param att_editRen 输入<b>AgAgentInfo.editRen</b>字段的值
		   */
		  public void setEditRen(String att_editRen){
		    this.editRen = att_editRen;
		  }
	///===============数据库表字段属性end==========
	/**
	 * 用户账号
	 */
	private String reservedUsername;
	/**
	 * 用户密码
	 */
	private String reservedPassword;
	private String reservedRelateToOrganizationName;
	
	@Formula("(SELECT a.name FROM ag_hospital_info a WHERE a.organization_id=reserved_relate_to_organization_id)")
	public String getReservedRelateToOrganizationName() {
		return reservedRelateToOrganizationName;
	}

	public void setReservedRelateToOrganizationName(
			String reservedRelateToOrganizationName) {
		this.reservedRelateToOrganizationName = reservedRelateToOrganizationName;
	}

	/**
	 * 获取 用户账号
	 * 
	 * @return
	 */
	@Formula("(SELECT a.account FROM sys_user_info a WHERE a.user_type='4' AND a.srole_id=aai_id)")
	public String getReservedUsername() {
		return reservedUsername;
	}

	/**
	 * 设置用户账号
	 * 
	 * @param reservedUsername
	 */
	public void setReservedUsername(String reservedUsername) {
		this.reservedUsername = reservedUsername;
	}

	/**
	 * 获取用户密码
	 * 
	 * @return
	 */
	@Transient
	public String getReservedPassword() {
		return reservedPassword;
	}

	/**
	 * 设置用户密码
	 * 
	 * @param reservedPassword
	 */
	public void setReservedPassword(String reservedPassword) {
		this.reservedPassword = reservedPassword;
	}

			///===============数据库表无关子段字段属性begin==========
			/**
			 *代理商ID(aai_id):字段类型为String
			 */
		  private String aaiId_str;  
			/**
			 *上级组织ID(reserved_relate_to_organization_id):字段类型为String
			 */
		  private String reservedRelateToOrganizationId_str;  
			/**
			 *创建时间(create_date):字段类型为Date
			 */
		  private Date createDate_start;  
			/**
			 *创建时间(create_date):字段类型为Date
			 */
		  private Date createDate_end;  
			/**
			 *修改时间(edit_date):字段类型为Date
			 */
		  private Date editDate_start;  
			/**
			 *修改时间(edit_date):字段类型为Date
			 */
		  private Date editDate_end;  
			/**
			 *():字段类型为String
			 *ag_agent_info表里不用like作为条件的字符串
			 */
		  private String Tab_like;  
			/**
			 *():字段类型为String
			 *ag_agent_info表里order by 字符串
			 */
		  private String Tab_order;  
			/**
			 *设置aaiId字段方法  
			 *@return  返回 <b>AgAgentInfo.aaiId</b>的值
			 */ 
			@Transient
			public String getAaiId_str(){
				return this.aaiId_str;
			}
			/**
			  *设置 aai_id字段方法 
			  *@param att_aaiId 输入<b>AgAgentInfo.aaiId</b>字段的值
			  */
			public void setAaiId_str(String att_aaiId_str){
				this.aaiId_str = att_aaiId_str;
			}
			/**
			 *设置reservedRelateToOrganizationId字段方法  
			 *@return  返回 <b>AgAgentInfo.reservedRelateToOrganizationId</b>的值
			 */ 
			@Transient
			public String getReservedRelateToOrganizationId_str(){
				return this.reservedRelateToOrganizationId_str;
			}
			/**
			  *设置 reserved_relate_to_organization_id字段方法 
			  *@param att_reservedRelateToOrganizationId 输入<b>AgAgentInfo.reservedRelateToOrganizationId</b>字段的值
			  */
			public void setReservedRelateToOrganizationId_str(String att_reservedRelateToOrganizationId_str){
				this.reservedRelateToOrganizationId_str = att_reservedRelateToOrganizationId_str;
			}
			/**
			 *设置createDate字段方法  
			 *@return  返回 <b>AgAgentInfo.createDate</b>的值
			 */ 
			@Transient
			public Date getCreateDate_start(){
				return this.createDate_start;
			}
			/**
			  *设置 create_date字段方法 
			  *@param att_createDate 输入<b>AgAgentInfo.createDate</b>字段的值
			  */
			public void setCreateDate_start(Date att_createDate_start){
				this.createDate_start = att_createDate_start;
			}
			/**
			 *设置createDate字段方法  
			 *@return  返回 <b>AgAgentInfo.createDate</b>的值
			 */ 
			@Transient
			public Date getCreateDate_end(){
				return this.createDate_end;
			}
			/**
			  *设置 create_date字段方法 
			  *@param att_createDate 输入<b>AgAgentInfo.createDate</b>字段的值
			  */
			public void setCreateDate_end(Date att_createDate_end){
				this.createDate_end = att_createDate_end;
			}
			/**
			 *设置editDate字段方法  
			 *@return  返回 <b>AgAgentInfo.editDate</b>的值
			 */ 
			@Transient
			public Date getEditDate_start(){
				return this.editDate_start;
			}
			/**
			  *设置 edit_date字段方法 
			  *@param att_editDate 输入<b>AgAgentInfo.editDate</b>字段的值
			  */
			public void setEditDate_start(Date att_editDate_start){
				this.editDate_start = att_editDate_start;
			}
			/**
			 *设置editDate字段方法  
			 *@return  返回 <b>AgAgentInfo.editDate</b>的值
			 */ 
			@Transient
			public Date getEditDate_end(){
				return this.editDate_end;
			}
			/**
			  *设置 edit_date字段方法 
			  *@param att_editDate 输入<b>AgAgentInfo.editDate</b>字段的值
			  */
			public void setEditDate_end(Date att_editDate_end){
				this.editDate_end = att_editDate_end;
			}
			/**
			 *设置tab_like字段方法  
			 *@return  返回 <b>AgAgentInfo.tab_like</b>的值
			 */ 
			@Transient
			public String getTab_like(){
				return this.Tab_like;
			}
			/**
			  *设置 字段方法 
			  *@param att_tab_like 输入<b>AgAgentInfo.tab_like</b>字段的值
			  */
			public void setTab_like(String att_Tab_like){
				this.Tab_like = att_Tab_like;
			}
			/**
			 *设置tab_order字段方法  
			 *@return  返回 <b>AgAgentInfo.tab_order</b>的值
			 */ 
			@Transient
			public String getTab_order(){
				return this.Tab_order;
			}
			/**
			  *设置 字段方法 
			  *@param att_tab_order 输入<b>AgAgentInfo.tab_order</b>字段的值
			  */
			public void setTab_order(String att_Tab_order){
				this.Tab_order = att_Tab_order;
			}
///===============数据库表无关子段字段属性end==========
			private Integer id;
			private Integer belongingsCount;
			@Formula("(SELECT count(1) FROM ag_business_user a WHERE a.aai_id=aai_id and a.status='0')")
			public Integer getBelongingsCount() {
				return belongingsCount;
			}

			public void setBelongingsCount(Integer belongingsCount) {
				this.belongingsCount = belongingsCount;
			}

			@Transient
			public Integer getId() {
				return aaiId;
			}

			public void setId(Integer id) {
				this.aaiId=id;
			}
} 