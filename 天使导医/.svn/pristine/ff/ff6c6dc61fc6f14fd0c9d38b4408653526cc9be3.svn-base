package com.hsk.angeldoctor.api.persistence;

import javax.persistence.*; 
import static javax.persistence.GenerationType.IDENTITY;
import java.util.Date;

/**
 * 根据ag_money_count表结构自动生成持久化对象<B> com.hsk.angeldoctor.api.persistence.AgMoneyCount</B>
 *<hr/>
 *===============数据库表字段属性==========
 *  <table> 
 * <tr><th>字段名称:</th><td>余额信息ID(amcId)</td><th>字段类型:</th><td>Integer(主键)</td></tr> 
 * <tr><th>字段名称:</th><td>用户ID(suiId)</td><th>字段类型:</th><td>Integer(可以为空)</td></tr> 
 * <tr><th>字段名称:</th><td>用户类型:1医院；2代理商；3业务员；4患者(amcType)</td><th>字段类型:</th><td>String(可以为空)</td></tr> 
 * <tr><th>字段名称:</th><td>消费总额(consumeCount)</td><th>字段类型:</th><td>Double(可以为空)</td></tr> 
 * <tr><th>字段名称:</th><td>余额(moneyCount)</td><th>字段类型:</th><td>Double(可以为空)</td></tr> 
 * <tr><th>字段名称:</th><td>提现总额(withdrawCount)</td><th>字段类型:</th><td>Double(可以为空)</td></tr> 
 * <tr><th>字段名称:</th><td>积分总数(integralCount)</td><th>字段类型:</th><td>Integer(可以为空)</td></tr> 
 * <tr><th>字段名称:</th><td>总返利金额(totalShare)</td><th>字段类型:</th><td>Double(可以为空)</td></tr> 
 * <tr><th>字段名称:</th><td>预约/代约总次数(registrationsCount)</td><th>字段类型:</th><td>Integer(可以为空)</td></tr> 
 * <tr><th>字段名称:</th><td>评论数(feedbacksCount)</td><th>字段类型:</th><td>Integer(可以为空)</td></tr>  
 * <tr><th>字段名称:</th><td>反馈数(feedbacksCount)</td><th>字段类型:</th><td>Integer(可以为空)</td></tr>  
 * <tr><th>字段名称:</th><td>累计到诊次数(countMedicalRecordsCount)</td><th>字段类型:</th><td>Integer(可以为空)</td></tr>  

 * </table>
 *===============无关字段属性===============
 *  <table> 
 * 	<tr><th>字段名称:</th><td>余额信息ID(amcId)	</td><th>属性名称:</th><td>amcId</td></tr>
 * 	<tr><th>字段名称:</th><td>用户ID(suiId)	</td><th>属性名称:</th><td>suiId</td></tr>
 * 	<tr><th>字段名称:</th><td>积分总数(integralCount)	</td><th>属性名称:</th><td>integralCount</td></tr>
 * 	<tr><th>字段名称:</th><td>(tab_like)	</td><th>属性名称:</th><td>tab_like</td></tr>
 * 	<tr><th>字段名称:</th><td>(tab_order)	</td><th>属性名称:</th><td>tab_order</td></tr>
 * </table>
 * <hr/>
 * @author  作者:admin  
 * @version  v1.0 创建时间: 2018-08-14 13:35:36
 */
 
 
@SuppressWarnings("serial")
@Entity
@Table(name = "ag_money_count" )
public class AgMoneyCount {
///===============数据库表字段属性begin==========
			/**
			 *余额信息ID(amcId):字段类型为Integer  
			 */
 			private Integer amcId; 
 	
			/**
			 *用户ID(suiId):字段类型为Integer  
			 */
 			private Integer suiId; 
 	
			/**
			 *用户类型:1医院；2代理商；3业务员；4患者(amcType):字段类型为String  
			 */
 			private String amcType; 
 	
			/**
			 *消费总额(consumeCount):字段类型为Double  
			 */
 			private Double consumeCount; 
 	
			/**
			 *余额(moneyCount):字段类型为Double  
			 */
 			private Double moneyCount; 
 	
			/**
			 *提现总额(withdrawCount):字段类型为Double  
			 */
 			private Double withdrawCount; 
 	
			/**
			 *积分总数(integralCount):字段类型为Integer  
			 */
 			private Integer integralCount; 
 			/**
			 *总返利金额(totalShare):字段类型为Double  
			 */
 			private Double totalShare;
 			/**
			 *预约/代约总次数(registrationsCount):字段类型为Double  
			 */
 			private Integer registrationsCount;
 			/**
			 *评论数(evaluationsCount):字段类型为Integer  
			 */
 			private Integer evaluationsCount;
 			/**
			 *反馈数(feedbacksCount):字段类型为Integer  
			 */
 			private Integer feedbacksCount;
 			/**
			 *累计到诊次数(countMedicalRecordsCount):字段类型为Integer  
			 */
 			private Integer countMedicalRecordsCount;
 			/**
 			 * 前一天积分排名
 			 */
 			private Integer previousRanking;
			/**
			 *设置余额信息ID(amc_id)字段方法 (该字段是主键)
			 *@return  返回 <b>AgMoneyCount.AmcId</b>的值
			 */	 
			@Id
			@GeneratedValue(strategy = IDENTITY)
			@Column(name = "amc_id")
			public Integer getAmcId(){
			    return this.amcId;
			}

		  /**
		   *设置 amc_id字段方法 
		   *@param att_amcId 输入<b>AgMoneyCount.amcId</b>字段的值
		   */
		  public void setAmcId(Integer att_amcId){
		    this.amcId = att_amcId;
		  }
  
			/**
			 *设置用户ID(sui_id)字段方法 
			 *@return  返回 <b>AgMoneyCount.SuiId</b>的值
			 */	 
			@Column(name = "sui_id" ) 
			public Integer getSuiId(){
			    return this.suiId;
			}

		  /**
		   *设置 sui_id字段方法 
		   *@param att_suiId 输入<b>AgMoneyCount.suiId</b>字段的值
		   */
		  public void setSuiId(Integer att_suiId){
		    this.suiId = att_suiId;
		  }
  
			/**
			 *设置用户类型:1医院；2代理商；3业务员；4患者(amc_type)字段方法 
			 *@return  返回 <b>AgMoneyCount.AmcType</b>的值
			 */	 
			@Column(name = "amc_type" ) 
			public String getAmcType(){
			    return this.amcType;
			}

		  /**
		   *设置 amc_type字段方法 
		   *@param att_amcType 输入<b>AgMoneyCount.amcType</b>字段的值
		   */
		  public void setAmcType(String att_amcType){
		    this.amcType = att_amcType;
		  }
  
			/**
			 *设置消费总额(consume_count)字段方法 
			 *@return  返回 <b>AgMoneyCount.ConsumeCount</b>的值
			 */	 
			@Column(name = "consume_count" ) 
			public Double getConsumeCount(){
			    return this.consumeCount;
			}

		  /**
		   *设置 consume_count字段方法 
		   *@param att_consumeCount 输入<b>AgMoneyCount.consumeCount</b>字段的值
		   */
		  public void setConsumeCount(Double att_consumeCount){
		    this.consumeCount = att_consumeCount;
		  }
  
			/**
			 *设置余额(money_count)字段方法 
			 *@return  返回 <b>AgMoneyCount.MoneyCount</b>的值
			 */	 
			@Column(name = "money_count" ) 
			public Double getMoneyCount(){
			    return this.moneyCount;
			}

		  /**
		   *设置 money_count字段方法 
		   *@param att_moneyCount 输入<b>AgMoneyCount.moneyCount</b>字段的值
		   */
		  public void setMoneyCount(Double att_moneyCount){
		    this.moneyCount = att_moneyCount;
		  }
  
			/**
			 *设置提现总额(withdraw_count)字段方法 
			 *@return  返回 <b>AgMoneyCount.WithdrawCount</b>的值
			 */	 
			@Column(name = "withdraw_count" ) 
			public Double getWithdrawCount(){
			    return this.withdrawCount;
			}

		  /**
		   *设置 withdraw_count字段方法 
		   *@param att_withdrawCount 输入<b>AgMoneyCount.withdrawCount</b>字段的值
		   */
		  public void setWithdrawCount(Double att_withdrawCount){
		    this.withdrawCount = att_withdrawCount;
		  }
  
			/**
			 *设置积分总数(integral_count)字段方法 
			 *@return  返回 <b>AgMoneyCount.IntegralCount</b>的值
			 */	 
			@Column(name = "integral_count" ) 
			public Integer getIntegralCount(){
			    return this.integralCount;
			}

		  /**
		   *设置 integral_count字段方法 
		   *@param att_integralCount 输入<b>AgMoneyCount.integralCount</b>字段的值
		   */
		  public void setIntegralCount(Integer att_integralCount){
		    this.integralCount = att_integralCount;
		  }
		  @Column(name = "total_share" ) 
		  public Double getTotalShare() {
				return totalShare;
		  }

		  public void setTotalShare(Double totalShare) {
				this.totalShare = totalShare;
		  }
		  @Column(name = "registrations_count" ) 
		  public Integer getRegistrationsCount() {
			return registrationsCount;
		}

		public void setRegistrationsCount(Integer registrationsCount) {
			this.registrationsCount = registrationsCount;
		}

			@Column(name = "evaluations_count" ) 
			public Integer getEvaluationsCount() {
				return evaluationsCount;
			}

			public void setEvaluationsCount(Integer evaluationsCount) {
				this.evaluationsCount = evaluationsCount;
			}
			@Column(name = "feedbacks_count" ) 
			public Integer getFeedbacksCount() {
				return feedbacksCount;
			}
			public void setFeedbacksCount(Integer feedbacksCount) {
				this.feedbacksCount = feedbacksCount;
			}
			@Column(name = "count_medical_records_count" ) 
			public Integer getCountMedicalRecordsCount() {
				return countMedicalRecordsCount;
			}

			public void setCountMedicalRecordsCount(Integer countMedicalRecordsCount) {
				this.countMedicalRecordsCount = countMedicalRecordsCount;
			}
			@Column(name = "previous_ranking" ) 
			public Integer getPreviousRanking() {
				return previousRanking;
			}

			public void setPreviousRanking(Integer previousRanking) {
				this.previousRanking = previousRanking;
			}


			///===============数据库表字段属性end==========
			///===============数据库表无关子段字段属性begin==========
			/**
			 *余额信息ID(amc_id):字段类型为String
			 */
		  private String amcId_str;  
			/**
			 *用户ID(sui_id):字段类型为String
			 */
		  private String suiId_str;  
			/**
			 *积分总数(integral_count):字段类型为String
			 */
		  private String integralCount_str;  
			/**
			 *():字段类型为String
			 *ag_money_count表里不用like作为条件的字符串
			 */
		  private String Tab_like;  
			/**
			 *():字段类型为String
			 *ag_money_count表里order by 字符串
			 */
		  private String Tab_order;  
			/**
			 *设置amcId字段方法  
			 *@return  返回 <b>AgMoneyCount.amcId</b>的值
			 */ 
			@Transient
			public String getAmcId_str(){
				return this.amcId_str;
			}
			/**
			  *设置 amc_id字段方法 
			  *@param att_amcId 输入<b>AgMoneyCount.amcId</b>字段的值
			  */
			public void setAmcId_str(String att_amcId_str){
				this.amcId_str = att_amcId_str;
			}
			/**
			 *设置suiId字段方法  
			 *@return  返回 <b>AgMoneyCount.suiId</b>的值
			 */ 
			@Transient
			public String getSuiId_str(){
				return this.suiId_str;
			}
			/**
			  *设置 sui_id字段方法 
			  *@param att_suiId 输入<b>AgMoneyCount.suiId</b>字段的值
			  */
			public void setSuiId_str(String att_suiId_str){
				this.suiId_str = att_suiId_str;
			}
			/**
			 *设置integralCount字段方法  
			 *@return  返回 <b>AgMoneyCount.integralCount</b>的值
			 */ 
			@Transient
			public String getIntegralCount_str(){
				return this.integralCount_str;
			}
			/**
			  *设置 integral_count字段方法 
			  *@param att_integralCount 输入<b>AgMoneyCount.integralCount</b>字段的值
			  */
			public void setIntegralCount_str(String att_integralCount_str){
				this.integralCount_str = att_integralCount_str;
			}
			/**
			 *设置tab_like字段方法  
			 *@return  返回 <b>AgMoneyCount.tab_like</b>的值
			 */ 
			@Transient
			public String getTab_like(){
				return this.Tab_like;
			}
			/**
			  *设置 字段方法 
			  *@param att_tab_like 输入<b>AgMoneyCount.tab_like</b>字段的值
			  */
			public void setTab_like(String att_Tab_like){
				this.Tab_like = att_Tab_like;
			}
			/**
			 *设置tab_order字段方法  
			 *@return  返回 <b>AgMoneyCount.tab_order</b>的值
			 */ 
			@Transient
			public String getTab_order(){
				return this.Tab_order;
			}
			/**
			  *设置 字段方法 
			  *@param att_tab_order 输入<b>AgMoneyCount.tab_order</b>字段的值
			  */
			public void setTab_order(String att_Tab_order){
				this.Tab_order = att_Tab_order;
			}
///===============数据库表无关子段字段属性end==========

			private Integer id;
			@Transient
			public Integer getId() {
				return amcId;
			}

			public void setId(Integer id) {
				this.amcId=id;
			}
			
			
			/**
			 * 总消费金额 等同 消费总额(consumeCount)
			 */
			private Double totalFee;
 
			/**
			 * 获取 消费总额(consumeCount) 等同与  this.getConsumeCount()
			 * @return
			 */
			@Transient
			public Double getTotalFee() { 
				return this.getConsumeCount();
			}
			/**
			 * 设置消费总额(consumeCount) 等同与  this.setConsumeCount(att_consumeCount)
			 * @return
			 */
			public void setTotalFee(Double totalFee) {
				this.totalFee = totalFee; 
				this.consumeCount=totalFee;
			} 
			
} 