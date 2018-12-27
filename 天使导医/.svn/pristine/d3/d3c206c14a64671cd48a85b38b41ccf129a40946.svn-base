package com.hsk.angeldoctor.api.persistence;

import javax.persistence.*; 
import static javax.persistence.GenerationType.IDENTITY;
import java.util.Date;

/**
 * 根据ag_work_time表结构自动生成持久化对象<B> com.hsk.angeldoctor.api.persistence.AgWorkTime</B>
 *<hr/>
 *===============数据库表字段属性==========
 *  <table> 
 * <tr><th>字段名称:</th><td>排班时间ID(shiftPeriodId)</td><th>字段类型:</th><td>Integer(主键)</td></tr> 
 * <tr><th>字段名称:</th><td>医院ID(organizationId)</td><th>字段类型:</th><td>Integer(可以为空)</td></tr> 
 * <tr><th>字段名称:</th><td>开始时(startH)</td><th>字段类型:</th><td>String</td></tr> 
 * <tr><th>字段名称:</th><td>(startM)</td><th>字段类型:</th><td>String</td></tr> 
 * <tr><th>字段名称:</th><td>结束时(endH)</td><th>字段类型:</th><td>String</td></tr> 
 * <tr><th>字段名称:</th><td>结束分(endM)</td><th>字段类型:</th><td>String</td></tr> 
 * <tr><th>字段名称:</th><td>状态:0禁用1启用(status)</td><th>字段类型:</th><td>String(可以为空)</td></tr> 
 * <tr><th>字段名称:</th><td>创建人(createRen)</td><th>字段类型:</th><td>String(可以为空)</td></tr> 
 * <tr><th>字段名称:</th><td>创建时间(createDate)</td><th>字段类型:</th><td>Date(可以为空)</td></tr> 
 * <tr><th>字段名称:</th><td>修改人(editRen)</td><th>字段类型:</th><td>String(可以为空)</td></tr> 
 * <tr><th>字段名称:</th><td>修改时间(editDate)</td><th>字段类型:</th><td>Date(可以为空)</td></tr> 
 * </table>
 *===============无关字段属性===============
 *  <table> 
 * 	<tr><th>字段名称:</th><td>排班时间ID(shiftPeriodId)	</td><th>属性名称:</th><td>shiftPeriodId</td></tr>
 * 	<tr><th>字段名称:</th><td>医院ID(organizationId)	</td><th>属性名称:</th><td>organizationId</td></tr>
 * 	<tr><th>字段名称:</th><td>创建时间(createDate)	</td><th>属性名称:</th><td>createDate</td></tr>
 * 	<tr><th>字段名称:</th><td>创建时间(createDate)	</td><th>属性名称:</th><td>createDate</td></tr>
 * 	<tr><th>字段名称:</th><td>修改时间(editDate)	</td><th>属性名称:</th><td>editDate</td></tr>
 * 	<tr><th>字段名称:</th><td>修改时间(editDate)	</td><th>属性名称:</th><td>editDate</td></tr>
 * 	<tr><th>字段名称:</th><td>(tab_like)	</td><th>属性名称:</th><td>tab_like</td></tr>
 * 	<tr><th>字段名称:</th><td>(tab_order)	</td><th>属性名称:</th><td>tab_order</td></tr>
 * </table>
 * <hr/>
 * @author  作者:admin  
 * @version  v1.0 创建时间: 2018-08-14 13:28:02
 */
 
 
@SuppressWarnings("serial")
@Entity
@Table(name = "ag_work_time" )
public class AgWorkTime {
///===============数据库表字段属性begin==========
			/**
			 *排班时间ID(shiftPeriodId):字段类型为Integer  
			 */
 			private Integer shiftPeriodId; 
 	
			/**
			 *医院ID(organizationId):字段类型为Integer  
			 */
 			private Integer organizationId; 
 	
			/**
			 *开始时(startH):字段类型为String  
			 */
 			private String startH; 
 	
			/**
			 *(startM):字段类型为String  
			 */
 			private String startM; 
 	
			/**
			 *结束时(endH):字段类型为String  
			 */
 			private String endH; 
 	
			/**
			 *结束分(endM):字段类型为String  
			 */
 			private String endM; 
 	
			/**
			 *状态:0禁用1启用(status):字段类型为String  
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
			 *设置排班时间ID(shift_period_id)字段方法 (该字段是主键)
			 *@return  返回 <b>AgWorkTime.ShiftPeriodId</b>的值
			 */	 
			@Id
			@GeneratedValue(strategy = IDENTITY)
			@Column(name = "shift_period_id")
			public Integer getShiftPeriodId(){
			    return this.shiftPeriodId;
			}

		  /**
		   *设置 shift_period_id字段方法 
		   *@param att_shiftPeriodId 输入<b>AgWorkTime.shiftPeriodId</b>字段的值
		   */
		  public void setShiftPeriodId(Integer att_shiftPeriodId){
		    this.shiftPeriodId = att_shiftPeriodId;
		  }
  
			/**
			 *设置医院ID(organization_id)字段方法 
			 *@return  返回 <b>AgWorkTime.OrganizationId</b>的值
			 */	 
			@Column(name = "organization_id" ) 
			public Integer getOrganizationId(){
			    return this.organizationId;
			}

		  /**
		   *设置 organization_id字段方法 
		   *@param att_organizationId 输入<b>AgWorkTime.organizationId</b>字段的值
		   */
		  public void setOrganizationId(Integer att_organizationId){
		    this.organizationId = att_organizationId;
		  }
  
			/**
			 *设置开始时(start_h)字段方法 
			 *@return  返回 <b>AgWorkTime.StartH</b>的值
			 */	 
			@Column(name = "start_h" ) 
			public String getStartH(){
			    return this.startH;
			}

		  /**
		   *设置 start_h字段方法 
		   *@param att_startH 输入<b>AgWorkTime.startH</b>字段的值
		   */
		  public void setStartH(String att_startH){
		    this.startH = att_startH;
		  }
  
			/**
			 *设置(start_m)字段方法 
			 *@return  返回 <b>AgWorkTime.StartM</b>的值
			 */	 
			@Column(name = "start_m" ) 
			public String getStartM(){
			    return this.startM;
			}

		  /**
		   *设置 start_m字段方法 
		   *@param att_startM 输入<b>AgWorkTime.startM</b>字段的值
		   */
		  public void setStartM(String att_startM){
		    this.startM = att_startM;
		  }
  
			/**
			 *设置结束时(end_h)字段方法 
			 *@return  返回 <b>AgWorkTime.EndH</b>的值
			 */	 
			@Column(name = "end_h" ) 
			public String getEndH(){
			    return this.endH;
			}

		  /**
		   *设置 end_h字段方法 
		   *@param att_endH 输入<b>AgWorkTime.endH</b>字段的值
		   */
		  public void setEndH(String att_endH){
		    this.endH = att_endH;
		  }
  
			/**
			 *设置结束分(end_m)字段方法 
			 *@return  返回 <b>AgWorkTime.EndM</b>的值
			 */	 
			@Column(name = "end_m" ) 
			public String getEndM(){
			    return this.endM;
			}

		  /**
		   *设置 end_m字段方法 
		   *@param att_endM 输入<b>AgWorkTime.endM</b>字段的值
		   */
		  public void setEndM(String att_endM){
		    this.endM = att_endM;
		  }
  
			/**
			 *设置状态:0禁用1启用(status)字段方法 
			 *@return  返回 <b>AgWorkTime.Status</b>的值
			 */	 
			@Column(name = "status" ) 
			public String getStatus(){
			    return this.status;
			}

		  /**
		   *设置 status字段方法 
		   *@param att_status 输入<b>AgWorkTime.status</b>字段的值
		   */
		  public void setStatus(String att_status){
		    this.status = att_status;
		  }
  
			/**
			 *设置创建人(create_ren)字段方法 
			 *@return  返回 <b>AgWorkTime.CreateRen</b>的值
			 */	 
			@Column(name = "create_ren" ) 
			public String getCreateRen(){
			    return this.createRen;
			}

		  /**
		   *设置 create_ren字段方法 
		   *@param att_createRen 输入<b>AgWorkTime.createRen</b>字段的值
		   */
		  public void setCreateRen(String att_createRen){
		    this.createRen = att_createRen;
		  }
  
			/**
			 *设置创建时间(create_date)字段方法 
			 *@return  返回 <b>AgWorkTime.CreateDate</b>的值
			 */	 
			@Temporal(TemporalType.TIMESTAMP)
			@Column(name = "create_date" ) 
			public Date getCreateDate(){
			    return this.createDate;
			}

		  /**
		   *设置 create_date字段方法 
		   *@param att_createDate 输入<b>AgWorkTime.createDate</b>字段的值
		   */
		  public void setCreateDate(Date att_createDate){
		    this.createDate = att_createDate;
		  }
  
			/**
			 *设置修改人(edit_ren)字段方法 
			 *@return  返回 <b>AgWorkTime.EditRen</b>的值
			 */	 
			@Column(name = "edit_ren" ) 
			public String getEditRen(){
			    return this.editRen;
			}

		  /**
		   *设置 edit_ren字段方法 
		   *@param att_editRen 输入<b>AgWorkTime.editRen</b>字段的值
		   */
		  public void setEditRen(String att_editRen){
		    this.editRen = att_editRen;
		  }
  
			/**
			 *设置修改时间(edit_date)字段方法 
			 *@return  返回 <b>AgWorkTime.EditDate</b>的值
			 */	 
			@Temporal(TemporalType.TIMESTAMP)
			@Column(name = "edit_date" ) 
			public Date getEditDate(){
			    return this.editDate;
			}

		  /**
		   *设置 edit_date字段方法 
		   *@param att_editDate 输入<b>AgWorkTime.editDate</b>字段的值
		   */
		  public void setEditDate(Date att_editDate){
		    this.editDate = att_editDate;
		  }
  

///===============数据库表字段属性end==========
 /**
  * 开始时间
  */
		 /*
		  private String start;
		  /**
		   * 结束时间
		   */
		 /* private String end;*/
		  
		  /**
		   * 获取开始时间
		   * @return
		   */
		/*  public String getStart() {
			  this.start=this.startH+":"+this.startM;
			return start;
		}*/
/**
 * 设置开始时间
 * @param start
 */
		/*public void setStart(String start) {
			this.start = start;
		}*/
		/**
		 * 获取结束时间 
		 * @return
		 */

		/* public String getEnd() {
			this.end=this.endH+":"+this.endM;
			return end;
		}*/
/**
 * 设置结束时间 
 * @param end
 */
		/*public void setEnd(String end) {
			this.end = end;
		}*/


			///===============数据库表无关子段字段属性begin==========
			/**
			 *排班时间ID(shift_period_id):字段类型为String
			 */
		  private String shiftPeriodId_str;  
			/**
			 *医院ID(organization_id):字段类型为String
			 */
		  private String organizationId_str;  
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
			 *ag_work_time表里不用like作为条件的字符串
			 */
		  private String Tab_like;  
			/**
			 *():字段类型为String
			 *ag_work_time表里order by 字符串
			 */
		  private String Tab_order;  
			/**
			 *设置shiftPeriodId字段方法  
			 *@return  返回 <b>AgWorkTime.shiftPeriodId</b>的值
			 */ 
			@Transient
			public String getShiftPeriodId_str(){
				return this.shiftPeriodId_str;
			}
			/**
			  *设置 shift_period_id字段方法 
			  *@param att_shiftPeriodId 输入<b>AgWorkTime.shiftPeriodId</b>字段的值
			  */
			public void setShiftPeriodId_str(String att_shiftPeriodId_str){
				this.shiftPeriodId_str = att_shiftPeriodId_str;
			}
			/**
			 *设置organizationId字段方法  
			 *@return  返回 <b>AgWorkTime.organizationId</b>的值
			 */ 
			@Transient
			public String getOrganizationId_str(){
				return this.organizationId_str;
			}
			/**
			  *设置 organization_id字段方法 
			  *@param att_organizationId 输入<b>AgWorkTime.organizationId</b>字段的值
			  */
			public void setOrganizationId_str(String att_organizationId_str){
				this.organizationId_str = att_organizationId_str;
			}
			/**
			 *设置createDate字段方法  
			 *@return  返回 <b>AgWorkTime.createDate</b>的值
			 */ 
			@Transient
			public Date getCreateDate_start(){
				return this.createDate_start;
			}
			/**
			  *设置 create_date字段方法 
			  *@param att_createDate 输入<b>AgWorkTime.createDate</b>字段的值
			  */
			public void setCreateDate_start(Date att_createDate_start){
				this.createDate_start = att_createDate_start;
			}
			/**
			 *设置createDate字段方法  
			 *@return  返回 <b>AgWorkTime.createDate</b>的值
			 */ 
			@Transient
			public Date getCreateDate_end(){
				return this.createDate_end;
			}
			/**
			  *设置 create_date字段方法 
			  *@param att_createDate 输入<b>AgWorkTime.createDate</b>字段的值
			  */
			public void setCreateDate_end(Date att_createDate_end){
				this.createDate_end = att_createDate_end;
			}
			/**
			 *设置editDate字段方法  
			 *@return  返回 <b>AgWorkTime.editDate</b>的值
			 */ 
			@Transient
			public Date getEditDate_start(){
				return this.editDate_start;
			}
			/**
			  *设置 edit_date字段方法 
			  *@param att_editDate 输入<b>AgWorkTime.editDate</b>字段的值
			  */
			public void setEditDate_start(Date att_editDate_start){
				this.editDate_start = att_editDate_start;
			}
			/**
			 *设置editDate字段方法  
			 *@return  返回 <b>AgWorkTime.editDate</b>的值
			 */ 
			@Transient
			public Date getEditDate_end(){
				return this.editDate_end;
			}
			/**
			  *设置 edit_date字段方法 
			  *@param att_editDate 输入<b>AgWorkTime.editDate</b>字段的值
			  */
			public void setEditDate_end(Date att_editDate_end){
				this.editDate_end = att_editDate_end;
			}
			/**
			 *设置tab_like字段方法  
			 *@return  返回 <b>AgWorkTime.tab_like</b>的值
			 */ 
			@Transient
			public String getTab_like(){
				return this.Tab_like;
			}
			/**
			  *设置 字段方法 
			  *@param att_tab_like 输入<b>AgWorkTime.tab_like</b>字段的值
			  */
			public void setTab_like(String att_Tab_like){
				this.Tab_like = att_Tab_like;
			}
			/**
			 *设置tab_order字段方法  
			 *@return  返回 <b>AgWorkTime.tab_order</b>的值
			 */ 
			@Transient
			public String getTab_order(){
				return this.Tab_order;
			}
			/**
			  *设置 字段方法 
			  *@param att_tab_order 输入<b>AgWorkTime.tab_order</b>字段的值
			  */
			public void setTab_order(String att_Tab_order){
				this.Tab_order = att_Tab_order;
			}
///===============数据库表无关子段字段属性end==========
			private Integer id;
			@Transient
			public Integer getId() {
				return shiftPeriodId;
			}

			public void setId(Integer id) {
				this.shiftPeriodId=id;
			}
} 