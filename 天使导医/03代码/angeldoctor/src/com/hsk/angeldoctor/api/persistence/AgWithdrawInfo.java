package com.hsk.angeldoctor.api.persistence;

import javax.persistence.*; 

import org.hibernate.annotations.Formula;

import static javax.persistence.GenerationType.IDENTITY;
import java.util.Date;

/**
 * 根据ag_withdraw_info表结构自动生成持久化对象<B> com.hsk.angeldoctor.api.persistence.AgWithdrawInfo</B>
 *<hr/>
 *===============数据库表字段属性==========
 *  <table> 
 * <tr><th>字段名称:</th><td>提现申请ID(awiId)</td><th>字段类型:</th><td>Integer(主键)</td></tr> 
 * <tr><th>字段名称:</th><td>申请人ID(awiUserId)</td><th>字段类型:</th><td>Integer(可以为空)</td></tr> 
 * <tr><th>字段名称:</th><td>申请编号(serialNumber)</td><th>字段类型:</th><td>String(可以为空)</td></tr> 
 * <tr><th>字段名称:</th><td>申请类型:1医院提现申请，2员工提现申请，3供应商提现申请，4患者提现申请(withdrawType)</td><th>字段类型:</th><td>String(可以为空)</td></tr> 
 * <tr><th>字段名称:</th><td>提现申请金额(withdrawAmount)</td><th>字段类型:</th><td>Double(可以为空)</td></tr> 
 * <tr><th>字段名称:</th><td>申请人姓名(contextName)</td><th>字段类型:</th><td>String(可以为空)</td></tr> 
 * <tr><th>字段名称:</th><td>申请人手机号(contextMobile)</td><th>字段类型:</th><td>String(可以为空)</td></tr> 
 * <tr><th>字段名称:</th><td>银行名称(contextBankName)</td><th>字段类型:</th><td>String(可以为空)</td></tr> 
 * <tr><th>字段名称:</th><td>银行账户名称(contextAccountName)</td><th>字段类型:</th><td>String(可以为空)</td></tr> 
 * <tr><th>字段名称:</th><td>银行账号(contextAccountNumber)</td><th>字段类型:</th><td>String(可以为空)</td></tr> 
 * <tr><th>字段名称:</th><td>审核时间(checkFinishDate)</td><th>字段类型:</th><td>Date(可以为空)</td></tr> 
 * <tr><th>字段名称:</th><td>打款时间(withdrawFinishDate)</td><th>字段类型:</th><td>Date(可以为空)</td></tr> 
 * <tr><th>字段名称:</th><td>最后一次操作人(lastPortalUserId)</td><th>字段类型:</th><td>Integer(可以为空)</td></tr> 
 * <tr><th>字段名称:</th><td>审核失败原因(checkFailureReason)</td><th>字段类型:</th><td>String(可以为空)</td></tr> 
 * <tr><th>字段名称:</th><td>审核状态(checkStatus)</td><th>字段类型:</th><td>String(可以为空)</td></tr> 
 * <tr><th>字段名称:</th><td>打款状态(withdrawStatus)</td><th>字段类型:</th><td>String(可以为空)</td></tr> 
 * <tr><th>字段名称:</th><td>打款失败原因(withdrawFailureReason)</td><th>字段类型:</th><td>String(可以为空)</td></tr> 
 * <tr><th>字段名称:</th><td>状态:1正常，2禁用(status)</td><th>字段类型:</th><td>String(可以为空)</td></tr> 
 * <tr><th>字段名称:</th><td>创建人(createRen)</td><th>字段类型:</th><td>String(可以为空)</td></tr> 
 * <tr><th>字段名称:</th><td>创建时间(createDate)</td><th>字段类型:</th><td>Date(可以为空)</td></tr> 
 * <tr><th>字段名称:</th><td>修改人(editRen)</td><th>字段类型:</th><td>String(可以为空)</td></tr> 
 * <tr><th>字段名称:</th><td>修改时间(editDate)</td><th>字段类型:</th><td>Date(可以为空)</td></tr> 
 * <tr><th>字段名称:</th><td>最后一次操作账号(lastPortalUserName)</td><th>字段类型:</th><td>String(可以为空)</td></tr> 
 * <tr><th>字段名称:</th><td>交易类型(transactionType)</td><th>字段类型:</th><td>String(可以为空)</td></tr> 
 * </table>
 *===============无关字段属性===============
 *  <table> 
 * 	<tr><th>字段名称:</th><td>提现申请ID(awiId)	</td><th>属性名称:</th><td>awiId</td></tr>
 * 	<tr><th>字段名称:</th><td>申请人ID(awiUserId)	</td><th>属性名称:</th><td>awiUserId</td></tr>
 * 	<tr><th>字段名称:</th><td>审核时间(checkFinishDate)	</td><th>属性名称:</th><td>checkFinishDate</td></tr>
 * 	<tr><th>字段名称:</th><td>审核时间(checkFinishDate)	</td><th>属性名称:</th><td>checkFinishDate</td></tr>
 * 	<tr><th>字段名称:</th><td>打款时间(withdrawFinishDate)	</td><th>属性名称:</th><td>withdrawFinishDate</td></tr>
 * 	<tr><th>字段名称:</th><td>打款时间(withdrawFinishDate)	</td><th>属性名称:</th><td>withdrawFinishDate</td></tr>
 * 	<tr><th>字段名称:</th><td>最后一次操作人(lastPortalUserId)	</td><th>属性名称:</th><td>lastPortalUserId</td></tr>
 * 	<tr><th>字段名称:</th><td>创建时间(createDate)	</td><th>属性名称:</th><td>createDate</td></tr>
 * 	<tr><th>字段名称:</th><td>创建时间(createDate)	</td><th>属性名称:</th><td>createDate</td></tr>
 * 	<tr><th>字段名称:</th><td>修改时间(editDate)	</td><th>属性名称:</th><td>editDate</td></tr>
 * 	<tr><th>字段名称:</th><td>修改时间(editDate)	</td><th>属性名称:</th><td>editDate</td></tr>
 * 	<tr><th>字段名称:</th><td>(tab_like)	</td><th>属性名称:</th><td>tab_like</td></tr>
 * 	<tr><th>字段名称:</th><td>(tab_order)	</td><th>属性名称:</th><td>tab_order</td></tr>
 * </table>
 * <hr/>
 * @author  作者:admin  
 * @version  v1.0 创建时间: 2018-08-14 13:31:12
 */
 
 
@SuppressWarnings("serial")
@Entity
@Table(name = "ag_withdraw_info" )
public class AgWithdrawInfo {
///===============数据库表字段属性begin==========
			/**
			 *提现申请ID(awiId):字段类型为Integer  
			 */
 			private Integer awiId; 
 	
			/**
			 *申请人ID(awiUserId):字段类型为Integer  
			 */
 			private Integer awiUserId; 
 	
			/**
			 *申请编号(serialNumber):字段类型为String  
			 */
 			private String serialNumber; 
 	
			/**
			 *申请类型:1医院提现申请，2员工提现申请，3供应商提现申请，4患者提现申请(withdrawType):字段类型为String  
			 */
 			private String withdrawType; 
 	
			/**
			 *提现申请金额(withdrawAmount):字段类型为Double  
			 */
 			private Double withdrawAmount; 
 	
			/**
			 *申请人姓名(contextName):字段类型为String  
			 */
 			private String contextName; 
 	
			/**
			 *申请人手机号(contextMobile):字段类型为String  
			 */
 			private String contextMobile; 
 	
			/**
			 *银行名称(contextBankName):字段类型为String  
			 */
 			private String contextBankName; 
 	
			/**
			 *银行账户名称(contextAccountName):字段类型为String  
			 */
 			private String contextAccountName; 
 	
			/**
			 *银行账号(contextAccountNumber):字段类型为String  
			 */
 			private String contextAccountNumber; 
 	
			/**
			 *审核时间(checkFinishDate):字段类型为Date  
			 */
 			private Date checkFinishDate; 
 	
			/**
			 *打款时间(withdrawFinishDate):字段类型为Date  
			 */
 			private Date withdrawFinishDate; 
 	
			/**
			 *最后一次操作人(lastPortalUserId):字段类型为Integer  
			 */
 			private Integer lastPortalUserId; 
 	
			/**
			 *审核失败原因(checkFailureReason):字段类型为String  
			 */
 			private String checkFailureReason; 
 	
			/**
			 *审核状态(checkStatus):字段类型为String  
			 */
 			private String checkStatus; 
 	
			/**
			 *打款状态(withdrawStatus):字段类型为String  
			 */
 			private String withdrawStatus; 
 	
			/**
			 *打款失败原因(withdrawFailureReason):字段类型为String  
			 */
 			private String withdrawFailureReason; 
 	
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
			 *修改人(editRen):字段类型为String  
			 */
 			private String editRen; 
 	
			/**
			 *修改时间(editDate):字段类型为Date  
			 */
 			private Date editDate; 
 	
 			
 			/**
 			 * 交易类型(0:充值转入;1:患者提现转出;2:业务员提现转出;3:医院提现转出;4:代理商提现转出)
 			 */
 			private String transactionType;
 			 
 			
 			@Column(name = "transaction_Type")
			public String getTransactionType() {
				return transactionType;
			}

			public void setTransactionType(String transactionType) {
				this.transactionType = transactionType;
			}

			/**
			 *设置提现申请ID(awi_id)字段方法 (该字段是主键)
			 *@return  返回 <b>AgWithdrawInfo.AwiId</b>的值
			 */	 
			@Id
			@GeneratedValue(strategy = IDENTITY)
			@Column(name = "awi_id")
			public Integer getAwiId(){
			    return this.awiId;
			}

		  /**
		   *设置 awi_id字段方法 
		   *@param att_awiId 输入<b>AgWithdrawInfo.awiId</b>字段的值
		   */
		  public void setAwiId(Integer att_awiId){
		    this.awiId = att_awiId;
		  }
  
			/**
			 *设置申请人ID(awi_user_id)字段方法 
			 *@return  返回 <b>AgWithdrawInfo.AwiUserId</b>的值
			 */	 
			@Column(name = "awi_user_id" ) 
			public Integer getAwiUserId(){
			    return this.awiUserId;
			}

		  /**
		   *设置 awi_user_id字段方法 
		   *@param att_awiUserId 输入<b>AgWithdrawInfo.awiUserId</b>字段的值
		   */
		  public void setAwiUserId(Integer att_awiUserId){
		    this.awiUserId = att_awiUserId;
		  }
  
			/**
			 *设置申请编号(serial_number)字段方法 
			 *@return  返回 <b>AgWithdrawInfo.SerialNumber</b>的值
			 */	 
			@Column(name = "serial_number" ) 
			public String getSerialNumber(){
			    return this.serialNumber;
			}

		  /**
		   *设置 serial_number字段方法 
		   *@param att_serialNumber 输入<b>AgWithdrawInfo.serialNumber</b>字段的值
		   */
		  public void setSerialNumber(String att_serialNumber){
		    this.serialNumber = att_serialNumber;
		  }
  
			/**
			 *设置申请类型:1医院提现申请，2员工提现申请，3供应商提现申请，4患者提现申请(withdraw_type)字段方法 
			 *@return  返回 <b>AgWithdrawInfo.WithdrawType</b>的值
			 */	 
			@Column(name = "withdraw_type" ) 
			public String getWithdrawType(){
			    return this.withdrawType;
			}

		  /**
		   *设置 withdraw_type字段方法 
		   *@param att_withdrawType 输入<b>AgWithdrawInfo.withdrawType</b>字段的值
		   */
		  public void setWithdrawType(String att_withdrawType){
		    this.withdrawType = att_withdrawType;
		  }
  
			/**
			 *设置提现申请金额(withdraw_amount)字段方法 
			 *@return  返回 <b>AgWithdrawInfo.WithdrawAmount</b>的值
			 */	 
			@Column(name = "withdraw_amount" ) 
			public Double getWithdrawAmount(){
			    return this.withdrawAmount;
			}

		  /**
		   *设置 withdraw_amount字段方法 
		   *@param att_withdrawAmount 输入<b>AgWithdrawInfo.withdrawAmount</b>字段的值
		   */
		  public void setWithdrawAmount(Double att_withdrawAmount){
		    this.withdrawAmount = att_withdrawAmount;
		  }
  
			/**
			 *设置申请人姓名(context_name)字段方法 
			 *@return  返回 <b>AgWithdrawInfo.ContextName</b>的值
			 */	 
			@Column(name = "context_name" ) 
			public String getContextName(){
			    return this.contextName;
			}

		  /**
		   *设置 context_name字段方法 
		   *@param att_contextName 输入<b>AgWithdrawInfo.contextName</b>字段的值
		   */
		  public void setContextName(String att_contextName){
		    this.contextName = att_contextName;
		  }
  
			/**
			 *设置申请人手机号(context_mobile)字段方法 
			 *@return  返回 <b>AgWithdrawInfo.ContextMobile</b>的值
			 */	 
			@Column(name = "context_mobile" ) 
			public String getContextMobile(){
			    return this.contextMobile;
			}

		  /**
		   *设置 context_mobile字段方法 
		   *@param att_contextMobile 输入<b>AgWithdrawInfo.contextMobile</b>字段的值
		   */
		  public void setContextMobile(String att_contextMobile){
		    this.contextMobile = att_contextMobile;
		  }
  
			/**
			 *设置银行名称(context_bank_name)字段方法 
			 *@return  返回 <b>AgWithdrawInfo.ContextBankName</b>的值
			 */	 
			@Column(name = "context_bank_name" ) 
			public String getContextBankName(){
			    return this.contextBankName;
			}

		  /**
		   *设置 context_bank_name字段方法 
		   *@param att_contextBankName 输入<b>AgWithdrawInfo.contextBankName</b>字段的值
		   */
		  public void setContextBankName(String att_contextBankName){
		    this.contextBankName = att_contextBankName;
		  }
  
			/**
			 *设置银行账户名称(context_account_name)字段方法 
			 *@return  返回 <b>AgWithdrawInfo.ContextAccountName</b>的值
			 */	 
			@Column(name = "context_account_name" ) 
			public String getContextAccountName(){
			    return this.contextAccountName;
			}

		  /**
		   *设置 context_account_name字段方法 
		   *@param att_contextAccountName 输入<b>AgWithdrawInfo.contextAccountName</b>字段的值
		   */
		  public void setContextAccountName(String att_contextAccountName){
		    this.contextAccountName = att_contextAccountName;
		  }
  
			/**
			 *设置银行账号(context_account_number)字段方法 
			 *@return  返回 <b>AgWithdrawInfo.ContextAccountNumber</b>的值
			 */	 
			@Column(name = "context_account_number" ) 
			public String getContextAccountNumber(){
			    return this.contextAccountNumber;
			}

		  /**
		   *设置 context_account_number字段方法 
		   *@param att_contextAccountNumber 输入<b>AgWithdrawInfo.contextAccountNumber</b>字段的值
		   */
		  public void setContextAccountNumber(String att_contextAccountNumber){
		    this.contextAccountNumber = att_contextAccountNumber;
		  }
  
			/**
			 *设置审核时间(check_finish_date)字段方法 
			 *@return  返回 <b>AgWithdrawInfo.CheckFinishDate</b>的值
			 */	 
			@Temporal(TemporalType.TIMESTAMP)
			@Column(name = "check_finish_date" ) 
			public Date getCheckFinishDate(){
			    return this.checkFinishDate;
			}

		  /**
		   *设置 check_finish_date字段方法 
		   *@param att_checkFinishDate 输入<b>AgWithdrawInfo.checkFinishDate</b>字段的值
		   */
		  public void setCheckFinishDate(Date att_checkFinishDate){
		    this.checkFinishDate = att_checkFinishDate;
		  }
  
			/**
			 *设置打款时间(withdraw_finish_date)字段方法 
			 *@return  返回 <b>AgWithdrawInfo.WithdrawFinishDate</b>的值
			 */	 
			@Temporal(TemporalType.TIMESTAMP)
			@Column(name = "withdraw_finish_date" ) 
			public Date getWithdrawFinishDate(){
			    return this.withdrawFinishDate;
			}

		  /**
		   *设置 withdraw_finish_date字段方法 
		   *@param att_withdrawFinishDate 输入<b>AgWithdrawInfo.withdrawFinishDate</b>字段的值
		   */
		  public void setWithdrawFinishDate(Date att_withdrawFinishDate){
		    this.withdrawFinishDate = att_withdrawFinishDate;
		  }
  
			/**
			 *设置最后一次操作人(last_portal_user_id)字段方法 
			 *@return  返回 <b>AgWithdrawInfo.LastPortalUserId</b>的值
			 */	 
			@Column(name = "last_portal_user_id" ) 
			public Integer getLastPortalUserId(){
			    return this.lastPortalUserId;
			}

		  /**
		   *设置 last_portal_user_id字段方法 
		   *@param att_lastPortalUserId 输入<b>AgWithdrawInfo.lastPortalUserId</b>字段的值
		   */
		  public void setLastPortalUserId(Integer att_lastPortalUserId){
		    this.lastPortalUserId = att_lastPortalUserId;
		  }
  
			/**
			 *设置审核失败原因(check_failure_reason)字段方法 
			 *@return  返回 <b>AgWithdrawInfo.CheckFailureReason</b>的值
			 */	 
			@Column(name = "check_failure_reason" ) 
			public String getCheckFailureReason(){
			    return this.checkFailureReason;
			}

		  /**
		   *设置 check_failure_reason字段方法 
		   *@param att_checkFailureReason 输入<b>AgWithdrawInfo.checkFailureReason</b>字段的值
		   */
		  public void setCheckFailureReason(String att_checkFailureReason){
		    this.checkFailureReason = att_checkFailureReason;
		  }
  
			/**
			 *设置审核状态(check_status)字段方法 
			 *@return  返回 <b>AgWithdrawInfo.CheckStatus</b>的值
			 */	 
			@Column(name = "check_status" ) 
			public String getCheckStatus(){
			    return this.checkStatus;
			}

		  /**
		   *设置 check_status字段方法 
		   *@param att_checkStatus 输入<b>AgWithdrawInfo.checkStatus</b>字段的值
		   */
		  public void setCheckStatus(String att_checkStatus){
		    this.checkStatus = att_checkStatus;
		  }
  
			/**
			 *设置打款状态(withdraw_status)字段方法 
			 *@return  返回 <b>AgWithdrawInfo.WithdrawStatus</b>的值
			 */	 
			@Column(name = "withdraw_status" ) 
			public String getWithdrawStatus(){
			    return this.withdrawStatus;
			}

		  /**
		   *设置 withdraw_status字段方法 
		   *@param att_withdrawStatus 输入<b>AgWithdrawInfo.withdrawStatus</b>字段的值
		   */
		  public void setWithdrawStatus(String att_withdrawStatus){
		    this.withdrawStatus = att_withdrawStatus;
		  }
  
			/**
			 *设置打款失败原因(withdraw_failure_reason)字段方法 
			 *@return  返回 <b>AgWithdrawInfo.WithdrawFailureReason</b>的值
			 */	 
			@Column(name = "withdraw_failure_reason" ) 
			public String getWithdrawFailureReason(){
			    return this.withdrawFailureReason;
			}

		  /**
		   *设置 withdraw_failure_reason字段方法 
		   *@param att_withdrawFailureReason 输入<b>AgWithdrawInfo.withdrawFailureReason</b>字段的值
		   */
		  public void setWithdrawFailureReason(String att_withdrawFailureReason){
		    this.withdrawFailureReason = att_withdrawFailureReason;
		  }
  
			/**
			 *设置状态:1正常，2禁用(status)字段方法 
			 *@return  返回 <b>AgWithdrawInfo.Status</b>的值
			 */	 
			@Column(name = "status" ) 
			public String getStatus(){
			    return this.status;
			}

		  /**
		   *设置 status字段方法 
		   *@param att_status 输入<b>AgWithdrawInfo.status</b>字段的值
		   */
		  public void setStatus(String att_status){
		    this.status = att_status;
		  }
  
			/**
			 *设置创建人(create_ren)字段方法 
			 *@return  返回 <b>AgWithdrawInfo.CreateRen</b>的值
			 */	 
			@Column(name = "create_ren" ) 
			public String getCreateRen(){
			    return this.createRen;
			}

		  /**
		   *设置 create_ren字段方法 
		   *@param att_createRen 输入<b>AgWithdrawInfo.createRen</b>字段的值
		   */
		  public void setCreateRen(String att_createRen){
		    this.createRen = att_createRen;
		  }
  
			/**
			 *设置创建时间(create_date)字段方法 
			 *@return  返回 <b>AgWithdrawInfo.CreateDate</b>的值
			 */	 
			@Temporal(TemporalType.TIMESTAMP)
			@Column(name = "create_date" ) 
			public Date getCreateDate(){
			    return this.createDate;
			}

		  /**
		   *设置 create_date字段方法 
		   *@param att_createDate 输入<b>AgWithdrawInfo.createDate</b>字段的值
		   */
		  public void setCreateDate(Date att_createDate){
		    this.createDate = att_createDate;
		  }
  
			/**
			 *设置修改人(edit_ren)字段方法 
			 *@return  返回 <b>AgWithdrawInfo.EditRen</b>的值
			 */	 
			@Column(name = "edit_ren" ) 
			public String getEditRen(){
			    return this.editRen;
			}

		  /**
		   *设置 edit_ren字段方法 
		   *@param att_editRen 输入<b>AgWithdrawInfo.editRen</b>字段的值
		   */
		  public void setEditRen(String att_editRen){
		    this.editRen = att_editRen;
		  }
  
			/**
			 *设置修改时间(edit_date)字段方法 
			 *@return  返回 <b>AgWithdrawInfo.EditDate</b>的值
			 */	 
			@Temporal(TemporalType.TIMESTAMP)
			@Column(name = "edit_date" ) 
			public Date getEditDate(){
			    return this.editDate;
			}

		  /**
		   *设置 edit_date字段方法 
		   *@param att_editDate 输入<b>AgWithdrawInfo.editDate</b>字段的值
		   */
		  public void setEditDate(Date att_editDate){
		    this.editDate = att_editDate;
		  }
  
		  
		  
		  

///===============数据库表字段属性end==========
		  /**
		   * 操作类型 
		   */
		  private String runType;
		  /**
		   * 操作原因
		   */
		  private String  runReason;
		  
		  /**
		   * 最后一次操作账号
		   */
		  private String lastPortalUserName;
		  
		  
		  /**
		   * 获取  最后一次操作账号
		   * @return
		   */
		  @Formula("(SELECT a.user_name FROM sys_user_info a WHERE a.sui_id= last_portal_user_id  )")
		  public String getLastPortalUserName() {
			return lastPortalUserName;
		}
/**
 * 设置 最后一次操作账号
 * @param lastPortalUserName
 */
		public void setLastPortalUserName(String lastPortalUserName) {
			this.lastPortalUserName = lastPortalUserName;
		}

		@Transient
		  public String getRunType() {
			return runType;
		}
		/**
		 * 设置操作状态 <p>1、审批通过</p><p>2、审批不通过 </p><p>3、打款成功</p><p>4、打款失败</p>
		 * @param runType
		 */
		public void setRunType(String runType) {
			this.runType = runType;
		}
		@Transient
		public String getRunReason() {
			return runReason;
		}

		public void setRunReason(String runReason) {
			this.runReason = runReason;
		}


			///===============数据库表无关子段字段属性begin==========
			/**
			 *提现申请ID(awi_id):字段类型为String
			 */
		  private String awiId_str;  
			/**
			 *申请人ID(awi_user_id):字段类型为String
			 */
		  private String awiUserId_str;  
			/**
			 *审核时间(check_finish_date):字段类型为Date
			 */
		  private Date checkFinishDate_start;  
			/**
			 *审核时间(check_finish_date):字段类型为Date
			 */
		  private Date checkFinishDate_end;  
			/**
			 *打款时间(withdraw_finish_date):字段类型为Date
			 */
		  private Date withdrawFinishDate_start;  
			/**
			 *打款时间(withdraw_finish_date):字段类型为Date
			 */
		  private Date withdrawFinishDate_end;  
			/**
			 *最后一次操作人(last_portal_user_id):字段类型为String
			 */
		  private String lastPortalUserId_str;  
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
			 *ag_withdraw_info表里不用like作为条件的字符串
			 */
		  private String Tab_like;  
			/**
			 *():字段类型为String
			 *ag_withdraw_info表里order by 字符串
			 */
		  private String Tab_order;  
			/**
			 *设置awiId字段方法  
			 *@return  返回 <b>AgWithdrawInfo.awiId</b>的值
			 */ 
			@Transient
			public String getAwiId_str(){
				return this.awiId_str;
			}
			/**
			  *设置 awi_id字段方法 
			  *@param att_awiId 输入<b>AgWithdrawInfo.awiId</b>字段的值
			  */
			public void setAwiId_str(String att_awiId_str){
				this.awiId_str = att_awiId_str;
			}
			/**
			 *设置awiUserId字段方法  
			 *@return  返回 <b>AgWithdrawInfo.awiUserId</b>的值
			 */ 
			@Transient
			public String getAwiUserId_str(){
				return this.awiUserId_str;
			}
			/**
			  *设置 awi_user_id字段方法 
			  *@param att_awiUserId 输入<b>AgWithdrawInfo.awiUserId</b>字段的值
			  */
			public void setAwiUserId_str(String att_awiUserId_str){
				this.awiUserId_str = att_awiUserId_str;
			}
			/**
			 *设置checkFinishDate字段方法  
			 *@return  返回 <b>AgWithdrawInfo.checkFinishDate</b>的值
			 */ 
			@Transient
			public Date getCheckFinishDate_start(){
				return this.checkFinishDate_start;
			}
			/**
			  *设置 check_finish_date字段方法 
			  *@param att_checkFinishDate 输入<b>AgWithdrawInfo.checkFinishDate</b>字段的值
			  */
			public void setCheckFinishDate_start(Date att_checkFinishDate_start){
				this.checkFinishDate_start = att_checkFinishDate_start;
			}
			/**
			 *设置checkFinishDate字段方法  
			 *@return  返回 <b>AgWithdrawInfo.checkFinishDate</b>的值
			 */ 
			@Transient
			public Date getCheckFinishDate_end(){
				return this.checkFinishDate_end;
			}
			/**
			  *设置 check_finish_date字段方法 
			  *@param att_checkFinishDate 输入<b>AgWithdrawInfo.checkFinishDate</b>字段的值
			  */
			public void setCheckFinishDate_end(Date att_checkFinishDate_end){
				this.checkFinishDate_end = att_checkFinishDate_end;
			}
			/**
			 *设置withdrawFinishDate字段方法  
			 *@return  返回 <b>AgWithdrawInfo.withdrawFinishDate</b>的值
			 */ 
			@Transient
			public Date getWithdrawFinishDate_start(){
				return this.withdrawFinishDate_start;
			}
			/**
			  *设置 withdraw_finish_date字段方法 
			  *@param att_withdrawFinishDate 输入<b>AgWithdrawInfo.withdrawFinishDate</b>字段的值
			  */
			public void setWithdrawFinishDate_start(Date att_withdrawFinishDate_start){
				this.withdrawFinishDate_start = att_withdrawFinishDate_start;
			}
			/**
			 *设置withdrawFinishDate字段方法  
			 *@return  返回 <b>AgWithdrawInfo.withdrawFinishDate</b>的值
			 */ 
			@Transient
			public Date getWithdrawFinishDate_end(){
				return this.withdrawFinishDate_end;
			}
			/**
			  *设置 withdraw_finish_date字段方法 
			  *@param att_withdrawFinishDate 输入<b>AgWithdrawInfo.withdrawFinishDate</b>字段的值
			  */
			public void setWithdrawFinishDate_end(Date att_withdrawFinishDate_end){
				this.withdrawFinishDate_end = att_withdrawFinishDate_end;
			}
			/**
			 *设置lastPortalUserId字段方法  
			 *@return  返回 <b>AgWithdrawInfo.lastPortalUserId</b>的值
			 */ 
			@Transient
			public String getLastPortalUserId_str(){
				return this.lastPortalUserId_str;
			}
			/**
			  *设置 last_portal_user_id字段方法 
			  *@param att_lastPortalUserId 输入<b>AgWithdrawInfo.lastPortalUserId</b>字段的值
			  */
			public void setLastPortalUserId_str(String att_lastPortalUserId_str){
				this.lastPortalUserId_str = att_lastPortalUserId_str;
			}
			/**
			 *设置createDate字段方法  
			 *@return  返回 <b>AgWithdrawInfo.createDate</b>的值
			 */ 
			@Transient
			public Date getCreateDate_start(){
				return this.createDate_start;
			}
			/**
			  *设置 create_date字段方法 
			  *@param att_createDate 输入<b>AgWithdrawInfo.createDate</b>字段的值
			  */
			public void setCreateDate_start(Date att_createDate_start){
				this.createDate_start = att_createDate_start;
			}
			/**
			 *设置createDate字段方法  
			 *@return  返回 <b>AgWithdrawInfo.createDate</b>的值
			 */ 
			@Transient
			public Date getCreateDate_end(){
				return this.createDate_end;
			}
			/**
			  *设置 create_date字段方法 
			  *@param att_createDate 输入<b>AgWithdrawInfo.createDate</b>字段的值
			  */
			public void setCreateDate_end(Date att_createDate_end){
				this.createDate_end = att_createDate_end;
			}
			/**
			 *设置editDate字段方法  
			 *@return  返回 <b>AgWithdrawInfo.editDate</b>的值
			 */ 
			@Transient
			public Date getEditDate_start(){
				return this.editDate_start;
			}
			/**
			  *设置 edit_date字段方法 
			  *@param att_editDate 输入<b>AgWithdrawInfo.editDate</b>字段的值
			  */
			public void setEditDate_start(Date att_editDate_start){
				this.editDate_start = att_editDate_start;
			}
			/**
			 *设置editDate字段方法  
			 *@return  返回 <b>AgWithdrawInfo.editDate</b>的值
			 */ 
			@Transient
			public Date getEditDate_end(){
				return this.editDate_end;
			}
			/**
			  *设置 edit_date字段方法 
			  *@param att_editDate 输入<b>AgWithdrawInfo.editDate</b>字段的值
			  */
			public void setEditDate_end(Date att_editDate_end){
				this.editDate_end = att_editDate_end;
			}
			/**
			 *设置tab_like字段方法  
			 *@return  返回 <b>AgWithdrawInfo.tab_like</b>的值
			 */ 
			@Transient
			public String getTab_like(){
				return this.Tab_like;
			}
			/**
			  *设置 字段方法 
			  *@param att_tab_like 输入<b>AgWithdrawInfo.tab_like</b>字段的值
			  */
			public void setTab_like(String att_Tab_like){
				this.Tab_like = att_Tab_like;
			}
			/**
			 *设置tab_order字段方法  
			 *@return  返回 <b>AgWithdrawInfo.tab_order</b>的值
			 */ 
			@Transient
			public String getTab_order(){
				return this.Tab_order;
			}
			/**
			  *设置 字段方法 
			  *@param att_tab_order 输入<b>AgWithdrawInfo.tab_order</b>字段的值
			  */
			public void setTab_order(String att_Tab_order){
				this.Tab_order = att_Tab_order;
			}
///===============数据库表无关子段字段属性end==========
			
			private Integer id;
			@Transient
			public Integer getId() {
				return awiId;
			}

			public void setId(Integer id) {
				this.awiId=id;
			}
} 