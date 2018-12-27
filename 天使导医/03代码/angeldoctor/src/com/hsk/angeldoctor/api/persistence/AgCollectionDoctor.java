package com.hsk.angeldoctor.api.persistence;

import javax.persistence.*; 
import static javax.persistence.GenerationType.IDENTITY;
import java.util.Date;

/**
 * 根据ag_collection_doctor表结构自动生成持久化对象<B> com.hsk.angeldoctor.api.persistence.AgCollectionDoctor</B>
 *<hr/>
 *===============数据库表字段属性==========
 *  <table> 
 * <tr><th>字段名称:</th><td>医生收藏ID(mcdId)</td><th>字段类型:</th><td>Integer(主键)</td></tr> 
 * <tr><th>字段名称:</th><td>医生ID(doctorId)</td><th>字段类型:</th><td>Integer(可以为空)</td></tr> 
 * <tr><th>字段名称:</th><td>用户账号ID(suiId)</td><th>字段类型:</th><td>Integer(可以为空)</td></tr> 
 * </table>
 *===============无关字段属性===============
 *  <table> 
 * 	<tr><th>字段名称:</th><td>医生收藏ID(mcdId)	</td><th>属性名称:</th><td>mcdId</td></tr>
 * 	<tr><th>字段名称:</th><td>医生ID(doctorId)	</td><th>属性名称:</th><td>doctorId</td></tr>
 * 	<tr><th>字段名称:</th><td>用户账号ID(suiId)	</td><th>属性名称:</th><td>suiId</td></tr>
 * 	<tr><th>字段名称:</th><td>(tab_like)	</td><th>属性名称:</th><td>tab_like</td></tr>
 * 	<tr><th>字段名称:</th><td>(tab_order)	</td><th>属性名称:</th><td>tab_order</td></tr>
 * </table>
 * <hr/>
 * @author  作者:admin  
 * @version  v1.0 创建时间: 2018-08-14 13:27:58
 */
 
 
@SuppressWarnings("serial")
@Entity
@Table(name = "ag_collection_doctor" )
public class AgCollectionDoctor {
///===============数据库表字段属性begin==========
			/**
			 *医生收藏ID(mcdId):字段类型为Integer  
			 */
 			private Integer mcdId; 
 	
			/**
			 *医生ID(doctorId):字段类型为Integer  
			 */
 			private Integer doctorId; 
 	
			/**
			 *用户账号ID(suiId):字段类型为Integer  
			 */
 			private Integer suiId; 
 	
			/**
			 *设置医生收藏ID(mcd_id)字段方法 (该字段是主键)
			 *@return  返回 <b>AgCollectionDoctor.McdId</b>的值
			 */	 
			@Id
			@GeneratedValue(strategy = IDENTITY)
			@Column(name = "mcd_id")
			public Integer getMcdId(){
			    return this.mcdId;
			}

		  /**
		   *设置 mcd_id字段方法 
		   *@param att_mcdId 输入<b>AgCollectionDoctor.mcdId</b>字段的值
		   */
		  public void setMcdId(Integer att_mcdId){
		    this.mcdId = att_mcdId;
		  }
  
			/**
			 *设置医生ID(doctor_id)字段方法 
			 *@return  返回 <b>AgCollectionDoctor.DoctorId</b>的值
			 */	 
			@Column(name = "doctor_id" ) 
			public Integer getDoctorId(){
			    return this.doctorId;
			}

		  /**
		   *设置 doctor_id字段方法 
		   *@param att_doctorId 输入<b>AgCollectionDoctor.doctorId</b>字段的值
		   */
		  public void setDoctorId(Integer att_doctorId){
		    this.doctorId = att_doctorId;
		  }
  
			/**
			 *设置用户账号ID(sui_id)字段方法 
			 *@return  返回 <b>AgCollectionDoctor.SuiId</b>的值
			 */	 
			@Column(name = "sui_id" ) 
			public Integer getSuiId(){
			    return this.suiId;
			}

		  /**
		   *设置 sui_id字段方法 
		   *@param att_suiId 输入<b>AgCollectionDoctor.suiId</b>字段的值
		   */
		  public void setSuiId(Integer att_suiId){
		    this.suiId = att_suiId;
		  }
  

///===============数据库表字段属性end==========

///===============数据库表无关子段字段属性begin==========
			/**
			 *医生收藏ID(mcd_id):字段类型为String
			 */
		  private String mcdId_str;  
			/**
			 *医生ID(doctor_id):字段类型为String
			 */
		  private String doctorId_str;  
			/**
			 *用户账号ID(sui_id):字段类型为String
			 */
		  private String suiId_str;  
			/**
			 *():字段类型为String
			 *ag_collection_doctor表里不用like作为条件的字符串
			 */
		  private String Tab_like;  
			/**
			 *():字段类型为String
			 *ag_collection_doctor表里order by 字符串
			 */
		  private String Tab_order;  
			/**
			 *设置mcdId字段方法  
			 *@return  返回 <b>AgCollectionDoctor.mcdId</b>的值
			 */ 
			@Transient
			public String getMcdId_str(){
				return this.mcdId_str;
			}
			/**
			  *设置 mcd_id字段方法 
			  *@param att_mcdId 输入<b>AgCollectionDoctor.mcdId</b>字段的值
			  */
			public void setMcdId_str(String att_mcdId_str){
				this.mcdId_str = att_mcdId_str;
			}
			/**
			 *设置doctorId字段方法  
			 *@return  返回 <b>AgCollectionDoctor.doctorId</b>的值
			 */ 
			@Transient
			public String getDoctorId_str(){
				return this.doctorId_str;
			}
			/**
			  *设置 doctor_id字段方法 
			  *@param att_doctorId 输入<b>AgCollectionDoctor.doctorId</b>字段的值
			  */
			public void setDoctorId_str(String att_doctorId_str){
				this.doctorId_str = att_doctorId_str;
			}
			/**
			 *设置suiId字段方法  
			 *@return  返回 <b>AgCollectionDoctor.suiId</b>的值
			 */ 
			@Transient
			public String getSuiId_str(){
				return this.suiId_str;
			}
			/**
			  *设置 sui_id字段方法 
			  *@param att_suiId 输入<b>AgCollectionDoctor.suiId</b>字段的值
			  */
			public void setSuiId_str(String att_suiId_str){
				this.suiId_str = att_suiId_str;
			}
			/**
			 *设置tab_like字段方法  
			 *@return  返回 <b>AgCollectionDoctor.tab_like</b>的值
			 */ 
			@Transient
			public String getTab_like(){
				return this.Tab_like;
			}
			/**
			  *设置 字段方法 
			  *@param att_tab_like 输入<b>AgCollectionDoctor.tab_like</b>字段的值
			  */
			public void setTab_like(String att_Tab_like){
				this.Tab_like = att_Tab_like;
			}
			/**
			 *设置tab_order字段方法  
			 *@return  返回 <b>AgCollectionDoctor.tab_order</b>的值
			 */ 
			@Transient
			public String getTab_order(){
				return this.Tab_order;
			}
			/**
			  *设置 字段方法 
			  *@param att_tab_order 输入<b>AgCollectionDoctor.tab_order</b>字段的值
			  */
			public void setTab_order(String att_Tab_order){
				this.Tab_order = att_Tab_order;
			}
///===============数据库表无关子段字段属性end==========
			private Integer id;
			@Transient
			public Integer getId() {
				return mcdId;
			}

			public void setId(Integer id) {
				this.mcdId=id;
			}
} 