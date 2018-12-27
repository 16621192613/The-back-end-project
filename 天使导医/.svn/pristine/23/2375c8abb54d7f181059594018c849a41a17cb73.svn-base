package com.hsk.angeldoctor.api.persistence;

import javax.persistence.*;

import org.hibernate.annotations.Formula;

import static javax.persistence.GenerationType.IDENTITY;
import java.util.Date;
import java.util.List;

/**
 * 根据ag_hospital_info表结构自动生成持久化对象<B> com.hsk.angeldoctor.api.persistence.AgHospitalInfo</B>
 *<hr/>
 *===============数据库表字段属性==========
 *  <table> 
 * <tr><th>字段名称:</th><td>医院ID(organizationId)</td><th>字段类型:</th><td>Integer(主键)</td></tr> 
 * <tr><th>字段名称:</th><td>内部业务员ID(internalBusinessPeopleId)</td><th>字段类型:</th><td>Integer(可以为空)</td></tr> 
 * <tr><th>字段名称:</th><td>医院名称(name)</td><th>字段类型:</th><td>String(可以为空)</td></tr> 
 * <tr><th>字段名称:</th><td>登录域名(domainName)</td><th>字段类型:</th><td>String(可以为空)</td></tr> 
 * <tr><th>字段名称:</th><td>是否医保：0是1否(medicalinsurance)</td><th>字段类型:</th><td>Integer(可以为空)</td></tr> 
 * <tr><th>字段名称:</th><td>医院类型(organizationType)</td><th>字段类型:</th><td>String</td></tr> 
 * <tr><th>字段名称:</th><td>省(provId)</td><th>字段类型:</th><td>String(可以为空)</td></tr> 
 * <tr><th>字段名称:</th><td>市(cityId)</td><th>字段类型:</th><td>String(可以为空)</td></tr> 
 * <tr><th>字段名称:</th><td>分布区(districtId)</td><th>字段类型:</th><td>String(可以为空)</td></tr> 
 * <tr><th>字段名称:</th><td>详细地址(address)</td><th>字段类型:</th><td>String(可以为空)</td></tr> 
 * <tr><th>字段名称:</th><td>交通线路(trafficRoute)</td><th>字段类型:</th><td>String(可以为空)</td></tr> 
 * <tr><th>字段名称:</th><td>经度(longitude)</td><th>字段类型:</th><td>String(可以为空)</td></tr> 
 * <tr><th>字段名称:</th><td>维度(latitude)</td><th>字段类型:</th><td>String(可以为空)</td></tr> 
 * <tr><th>字段名称:</th><td>医院His管理人员名称(managerName)</td><th>字段类型:</th><td>String(可以为空)</td></tr> 
 * <tr><th>字段名称:</th><td>管理员手机号(managerMobile)</td><th>字段类型:</th><td>String(可以为空)</td></tr> 
 * <tr><th>字段名称:</th><td>管理员邮箱(managerEmail)</td><th>字段类型:</th><td>String(可以为空)</td></tr> 
 * <tr><th>字段名称:</th><td>联系电话(contactMobile)</td><th>字段类型:</th><td>String(可以为空)</td></tr> 
 * <tr><th>字段名称:</th><td>医院简介(introduction)</td><th>字段类型:</th><td>String(可以为空)</td></tr> 
 * <tr><th>字段名称:</th><td>图标(icon)</td><th>字段类型:</th><td>String(可以为空)</td></tr> 
 * <tr><th>字段名称:</th><td>图片列表(images)</td><th>字段类型:</th><td>String(可以为空)</td></tr> 
 * <tr><th>字段名称:</th><td>每月计划群发次数(monthlyMessagePlanCount)</td><th>字段类型:</th><td>Integer</td></tr> 
 * <tr><th>字段名称:</th><td>每月实际群发总数(monthlyMessageActualCount)</td><th>字段类型:</th><td>Integer</td></tr> 
 * <tr><th>字段名称:</th><td>医院联系人姓名(registrationContactName)</td><th>字段类型:</th><td>String(可以为空)</td></tr> 
 * <tr><th>字段名称:</th><td>医院联系人电话(registrationContactMobile)</td><th>字段类型:</th><td>String(可以为空)</td></tr> 
 * <tr><th>字段名称:</th><td>医院联系人邮箱(registrationContactEmail)</td><th>字段类型:</th><td>String(可以为空)</td></tr> 
 * <tr><th>字段名称:</th><td>药费佣金比例(drugFeePercent)</td><th>字段类型:</th><td>Double</td></tr> 
 * <tr><th>字段名称:</th><td>诊疗费佣金比例(treatmentFeePercent)</td><th>字段类型:</th><td>Double</td></tr> 
 * <tr><th>字段名称:</th><td>接洽费(receptionFee)</td><th>字段类型:</th><td>Double</td></tr> 
 * <tr><th>字段名称:</th><td>患者补贴比例(patientSharePercent)</td><th>字段类型:</th><td>Double</td></tr> 
 * <tr><th>字段名称:</th><td>一级业务员奖金比例(primarySalesmanSharePercent)</td><th>字段类型:</th><td>Double</td></tr> 
 * <tr><th>字段名称:</th><td>二级业务员奖金比例(secondarySalesmanSharePercent)</td><th>字段类型:</th><td>Double</td></tr> 
 * <tr><th>字段名称:</th><td>医院共享用户分佣比例(organizationSharePercent)</td><th>字段类型:</th><td>Double</td></tr> 
 * <tr><th>字段名称:</th><td>平台佣金比例(platformSharePercent)</td><th>字段类型:</th><td>Double</td></tr> 
 * <tr><th>字段名称:</th><td>银行名称(bankName)</td><th>字段类型:</th><td>String(可以为空)</td></tr> 
 * <tr><th>字段名称:</th><td>银行账户名称(bankAccountName)</td><th>字段类型:</th><td>String(可以为空)</td></tr> 
 * <tr><th>字段名称:</th><td>银行账号(bankAccountNumber)</td><th>字段类型:</th><td>String(可以为空)</td></tr> 
 * <tr><th>字段名称:</th><td>状态:0禁用1启用(status)</td><th>字段类型:</th><td>String(可以为空)</td></tr> 
 * <tr><th>字段名称:</th><td>创建人(createRen)</td><th>字段类型:</th><td>String(可以为空)</td></tr> 
 * <tr><th>字段名称:</th><td>创建时间(createDate)</td><th>字段类型:</th><td>Date(可以为空)</td></tr> 
 * <tr><th>字段名称:</th><td>修改人(editRen)</td><th>字段类型:</th><td>String(可以为空)</td></tr> 
 * <tr><th>字段名称:</th><td>修改时间(editDate)</td><th>字段类型:</th><td>Date(可以为空)</td></tr> 
 * </table>
 *===============无关字段属性===============
 *  <table> 
 * 	<tr><th>字段名称:</th><td>医院ID(organizationId)	</td><th>属性名称:</th><td>organizationId</td></tr>
 * 	<tr><th>字段名称:</th><td>内部业务员ID(internalBusinessPeopleId)	</td><th>属性名称:</th><td>internalBusinessPeopleId</td></tr>
 * 	<tr><th>字段名称:</th><td>是否医保：0是1否(medicalinsurance)	</td><th>属性名称:</th><td>medicalinsurance</td></tr>
 * 	<tr><th>字段名称:</th><td>每月计划群发次数(monthlyMessagePlanCount)	</td><th>属性名称:</th><td>monthlyMessagePlanCount</td></tr>
 * 	<tr><th>字段名称:</th><td>每月实际群发总数(monthlyMessageActualCount)	</td><th>属性名称:</th><td>monthlyMessageActualCount</td></tr>
 * 	<tr><th>字段名称:</th><td>创建时间(createDate)	</td><th>属性名称:</th><td>createDate</td></tr>
 * 	<tr><th>字段名称:</th><td>创建时间(createDate)	</td><th>属性名称:</th><td>createDate</td></tr>
 * 	<tr><th>字段名称:</th><td>修改时间(editDate)	</td><th>属性名称:</th><td>editDate</td></tr>
 * 	<tr><th>字段名称:</th><td>修改时间(editDate)	</td><th>属性名称:</th><td>editDate</td></tr>
 * 	<tr><th>字段名称:</th><td>(tab_like)	</td><th>属性名称:</th><td>tab_like</td></tr>
 * 	<tr><th>字段名称:</th><td>(tab_order)	</td><th>属性名称:</th><td>tab_order</td></tr>
 * </table>
 * <hr/>
 * @author  作者:admin  
 * @version  v1.0 创建时间: 2018-08-14 13:28:00
 */
 
 
@SuppressWarnings("serial")
@Entity
@Table(name = "ag_hospital_info" )
public class AgHospitalInfo {
///===============数据库表字段属性begin==========
			/**
			 *医院ID(organizationId):字段类型为Integer  
			 */
 			private Integer organizationId; 
 	
			/**
			 *内部业务员ID(internalBusinessPeopleId):字段类型为Integer  
			 */
 			private Integer internalBusinessPeopleId; 
 	
			/**
			 *医院名称(name):字段类型为String  
			 */
 			private String name; 
 	
			/**
			 *登录域名(domainName):字段类型为String  
			 */
 			private String domainName; 
 	
			/**
			 *是否医保：0是1否(medicalinsurance):字段类型为Integer  
			 */
 			private Integer medicalInsurance; 
 	
			/**
			 *医院类型(organizationType):字段类型为String  
			 */
 			private String organizationType; 
 	
			/**
			 *省(provId):字段类型为String  
			 */
 			private String provId; 
 	
			/**
			 *市(cityId):字段类型为String  
			 */
 			private String cityId; 
 	
			/**
			 *分布区(districtId):字段类型为String  
			 */
 			private String districtId; 
 	
			/**
			 *详细地址(address):字段类型为String  
			 */
 			private String address; 
 	
			/**
			 *交通线路(trafficRoute):字段类型为String  
			 */
 			private String trafficRoute; 
 	
			/**
			 *经度(longitude):字段类型为String  
			 */
 			private String longitude; 
 	
			/**
			 *维度(latitude):字段类型为String  
			 */
 			private String latitude; 
 	
			/**
			 *医院His管理人员名称(managerName):字段类型为String  
			 */
 			private String managerName; 
 	
			/**
			 *管理员手机号(managerMobile):字段类型为String  
			 */
 			private String managerMobile; 
 	
			/**
			 *管理员邮箱(managerEmail):字段类型为String  
			 */
 			private String managerEmail; 
 	
			/**
			 *联系电话(contactMobile):字段类型为String  
			 */
 			private String contactMobile; 
 	
			/**
			 *医院简介(introduction):字段类型为String  
			 */
 			private String introduction; 
 	
			/**
			 *图标(icon):字段类型为String  
			 */
 			private String icon; 
 	
			/**
			 *图片列表(images):字段类型为String  
			 */
 			private String images; 
 	
			/**
			 *每月计划群发次数(monthlyMessagePlanCount):字段类型为Integer  
			 */
 			private Integer monthlyMessagePlanCount; 
 	
			/**
			 *每月实际群发总数(monthlyMessageActualCount):字段类型为Integer  
			 */
 			private Integer monthlyMessageActualCount; 
 	
			/**
			 *医院联系人姓名(registrationContactName):字段类型为String  
			 */
 			private String registrationContactName; 
 	
			/**
			 *医院联系人电话(registrationContactMobile):字段类型为String  
			 */
 			private String registrationContactMobile; 
 	
			/**
			 *医院联系人邮箱(registrationContactEmail):字段类型为String  
			 */
 			private String registrationContactEmail; 
 	
			/**
			 *药费佣金比例(drugFeePercent):字段类型为Double  
			 */
 			private Double drugFeePercent; 
 	
			/**
			 *诊疗费佣金比例(treatmentFeePercent):字段类型为Double  
			 */
 			private Double treatmentFeePercent; 
 	
			/**
			 *接洽费(receptionFee):字段类型为Double  
			 */
 			private Double receptionFee; 
 	
			/**
			 *患者补贴比例(patientSharePercent):字段类型为Double  
			 */
 			private Double patientSharePercent; 
 	
			/**
			 *一级业务员奖金比例(primarySalesmanSharePercent):字段类型为Double  
			 */
 			private Double primarySalesmanSharePercent; 
 	
			/**
			 *二级业务员奖金比例(secondarySalesmanSharePercent):字段类型为Double  
			 */
 			private Double secondarySalesmanSharePercent; 
 	
			/**
			 *医院共享用户分佣比例(organizationSharePercent):字段类型为Double  
			 */
 			private Double organizationSharePercent; 
 	
			/**
			 *平台佣金比例(platformSharePercent):字段类型为Double  
			 */
 			private Double platformSharePercent; 
 	
			/**
			 *银行名称(bankName):字段类型为String  
			 */
 			private String bankName; 
 	
			/**
			 *银行账户名称(bankAccountName):字段类型为String  
			 */
 			private String bankAccountName; 
 	
			/**
			 *银行账号(bankAccountNumber):字段类型为String  
			 */
 			private String bankAccountNumber; 
 	
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
 			 * 创建人账号
 			 */
 			private String createAccount;
 	
			/**
			 *设置医院ID(organization_id)字段方法 (该字段是主键)
			 *@return  返回 <b>AgHospitalInfo.OrganizationId</b>的值
			 */	 
			@Id
			@GeneratedValue(strategy = IDENTITY)
			@Column(name = "organization_id")
			public Integer getOrganizationId(){
			    return this.organizationId;
			}

		  /**
		   *设置 organization_id字段方法 
		   *@param att_organizationId 输入<b>AgHospitalInfo.organizationId</b>字段的值
		   */
		  public void setOrganizationId(Integer att_organizationId){
		    this.organizationId = att_organizationId;
		  }
  
			/**
			 *设置内部业务员ID(internal_business_people_id)字段方法 
			 *@return  返回 <b>AgHospitalInfo.InternalBusinessPeopleId</b>的值
			 */	 
			@Column(name = "internal_business_people_id" ) 
			public Integer getInternalBusinessPeopleId(){
			    return this.internalBusinessPeopleId;
			}

		  /**
		   *设置 internal_business_people_id字段方法 
		   *@param att_internalBusinessPeopleId 输入<b>AgHospitalInfo.internalBusinessPeopleId</b>字段的值
		   */
		  public void setInternalBusinessPeopleId(Integer att_internalBusinessPeopleId){
		    this.internalBusinessPeopleId = att_internalBusinessPeopleId;
		  }
  
			/**
			 *设置医院名称(name)字段方法 
			 *@return  返回 <b>AgHospitalInfo.Name</b>的值
			 */	 
			@Column(name = "name" ) 
			public String getName(){
			    return this.name;
			}

		  /**
		   *设置 name字段方法 
		   *@param att_name 输入<b>AgHospitalInfo.name</b>字段的值
		   */
		  public void setName(String att_name){
		    this.name = att_name;
		  }
  
			/**
			 *设置登录域名(domain_name)字段方法 
			 *@return  返回 <b>AgHospitalInfo.DomainName</b>的值
			 */	 
			@Column(name = "domain_name" ) 
			public String getDomainName(){
			    return this.domainName;
			}

		  /**
		   *设置 domain_name字段方法 
		   *@param att_domainName 输入<b>AgHospitalInfo.domainName</b>字段的值
		   */
		  public void setDomainName(String att_domainName){
		    this.domainName = att_domainName;
		  }
  
			/**
			 *设置是否医保：0是1否(medicalInsurance)字段方法 
			 *@return  返回 <b>AgHospitalInfo.Medicalinsurance</b>的值
			 */	 
			@Column(name = "medicalInsurance" ) 
			public Integer getMedicalInsurance(){
			    return this.medicalInsurance;
			}

		  /**
		   *设置 medicalInsurance字段方法 
		   *@param att_medicalinsurance 输入<b>AgHospitalInfo.medicalinsurance</b>字段的值
		   */
		  public void setMedicalInsurance(Integer att_medicalInsurance){
		    this.medicalInsurance = att_medicalInsurance;
		  }
  
			/**
			 *设置医院类型(organization_type)字段方法 
			 *@return  返回 <b>AgHospitalInfo.OrganizationType</b>的值
			 */	 
			@Column(name = "organization_type" ) 
			public String getOrganizationType(){
			    return this.organizationType;
			}

		  /**
		   *设置 organization_type字段方法 
		   *@param att_organizationType 输入<b>AgHospitalInfo.organizationType</b>字段的值
		   */
		  public void setOrganizationType(String att_organizationType){
		    this.organizationType = att_organizationType;
		  }
  
			/**
			 *设置省(prov_id)字段方法 
			 *@return  返回 <b>AgHospitalInfo.ProvId</b>的值
			 */	 
			@Column(name = "prov_id" ) 
			public String getProvId(){
			    return this.provId;
			}

		  /**
		   *设置 prov_id字段方法 
		   *@param att_provId 输入<b>AgHospitalInfo.provId</b>字段的值
		   */
		  public void setProvId(String att_provId){
		    this.provId = att_provId;
		  }
  
			/**
			 *设置市(city_id)字段方法 
			 *@return  返回 <b>AgHospitalInfo.CityId</b>的值
			 */	 
			@Column(name = "city_id" ) 
			public String getCityId(){
			    return this.cityId;
			}

		  /**
		   *设置 city_id字段方法 
		   *@param att_cityId 输入<b>AgHospitalInfo.cityId</b>字段的值
		   */
		  public void setCityId(String att_cityId){
		    this.cityId = att_cityId;
		  }
  
			/**
			 *设置分布区(district_id)字段方法 
			 *@return  返回 <b>AgHospitalInfo.DistrictId</b>的值
			 */	 
			@Column(name = "district_id" ) 
			public String getDistrictId(){
			    return this.districtId;
			}

		  /**
		   *设置 district_id字段方法 
		   *@param att_districtId 输入<b>AgHospitalInfo.districtId</b>字段的值
		   */
		  public void setDistrictId(String att_districtId){
		    this.districtId = att_districtId;
		  }
  
			/**
			 *设置详细地址(address)字段方法 
			 *@return  返回 <b>AgHospitalInfo.Address</b>的值
			 */	 
			@Column(name = "address" ) 
			public String getAddress(){
			    return this.address;
			}

		  /**
		   *设置 address字段方法 
		   *@param att_address 输入<b>AgHospitalInfo.address</b>字段的值
		   */
		  public void setAddress(String att_address){
		    this.address = att_address;
		  }
  
			/**
			 *设置交通线路(traffic_route)字段方法 
			 *@return  返回 <b>AgHospitalInfo.TrafficRoute</b>的值
			 */	 
			@Column(name = "traffic_route" ) 
			public String getTrafficRoute(){
			    return this.trafficRoute;
			}

		  /**
		   *设置 traffic_route字段方法 
		   *@param att_trafficRoute 输入<b>AgHospitalInfo.trafficRoute</b>字段的值
		   */
		  public void setTrafficRoute(String att_trafficRoute){
		    this.trafficRoute = att_trafficRoute;
		  }
  
			/**
			 *设置经度(longitude)字段方法 
			 *@return  返回 <b>AgHospitalInfo.Longitude</b>的值
			 */	 
			@Column(name = "longitude" ) 
			public String getLongitude(){
			    return this.longitude;
			}

		  /**
		   *设置 longitude字段方法 
		   *@param att_longitude 输入<b>AgHospitalInfo.longitude</b>字段的值
		   */
		  public void setLongitude(String att_longitude){
		    this.longitude = att_longitude;
		  }
  
			/**
			 *设置维度(latitude)字段方法 
			 *@return  返回 <b>AgHospitalInfo.Latitude</b>的值
			 */	 
			@Column(name = "latitude" ) 
			public String getLatitude(){
			    return this.latitude;
			}

		  /**
		   *设置 latitude字段方法 
		   *@param att_latitude 输入<b>AgHospitalInfo.latitude</b>字段的值
		   */
		  public void setLatitude(String att_latitude){
		    this.latitude = att_latitude;
		  }
  
			/**
			 *设置医院His管理人员名称(manager_name)字段方法 
			 *@return  返回 <b>AgHospitalInfo.ManagerName</b>的值
			 */	 
			@Column(name = "manager_name" ) 
			public String getManagerName(){
			    return this.managerName;
			}

		  /**
		   *设置 manager_name字段方法 
		   *@param att_managerName 输入<b>AgHospitalInfo.managerName</b>字段的值
		   */
		  public void setManagerName(String att_managerName){
		    this.managerName = att_managerName;
		  }
  
			/**
			 *设置管理员手机号(manager_mobile)字段方法 
			 *@return  返回 <b>AgHospitalInfo.ManagerMobile</b>的值
			 */	 
			@Column(name = "manager_mobile" ) 
			public String getManagerMobile(){
			    return this.managerMobile;
			}

		  /**
		   *设置 manager_mobile字段方法 
		   *@param att_managerMobile 输入<b>AgHospitalInfo.managerMobile</b>字段的值
		   */
		  public void setManagerMobile(String att_managerMobile){
		    this.managerMobile = att_managerMobile;
		  }
  
			/**
			 *设置管理员邮箱(manager_email)字段方法 
			 *@return  返回 <b>AgHospitalInfo.ManagerEmail</b>的值
			 */	 
			@Column(name = "manager_email" ) 
			public String getManagerEmail(){
			    return this.managerEmail;
			}

		  /**
		   *设置 manager_email字段方法 
		   *@param att_managerEmail 输入<b>AgHospitalInfo.managerEmail</b>字段的值
		   */
		  public void setManagerEmail(String att_managerEmail){
		    this.managerEmail = att_managerEmail;
		  }
  
			/**
			 *设置联系电话(contact_mobile)字段方法 
			 *@return  返回 <b>AgHospitalInfo.ContactMobile</b>的值
			 */	 
			@Column(name = "contact_mobile" ) 
			public String getContactMobile(){
			    return this.contactMobile;
			}

		  /**
		   *设置 contact_mobile字段方法 
		   *@param att_contactMobile 输入<b>AgHospitalInfo.contactMobile</b>字段的值
		   */
		  public void setContactMobile(String att_contactMobile){
		    this.contactMobile = att_contactMobile;
		  }
  
			/**
			 *设置医院简介(introduction)字段方法 
			 *@return  返回 <b>AgHospitalInfo.Introduction</b>的值
			 */	 
			@Column(name = "introduction" ) 
			public String getIntroduction(){
			    return this.introduction;
			}

		  /**
		   *设置 introduction字段方法 
		   *@param att_introduction 输入<b>AgHospitalInfo.introduction</b>字段的值
		   */
		  public void setIntroduction(String att_introduction){
		    this.introduction = att_introduction;
		  }
  
			/**
			 *设置图标(icon)字段方法 
			 *@return  返回 <b>AgHospitalInfo.Icon</b>的值
			 */	 
			@Column(name = "icon" ) 
			public String getIcon(){
			    return this.icon;
			}

		  /**
		   *设置 icon字段方法 
		   *@param att_icon 输入<b>AgHospitalInfo.icon</b>字段的值
		   */
		  public void setIcon(String att_icon){
		    this.icon = att_icon;
		  }
  
			/**
			 *设置图片列表(images)字段方法 
			 *@return  返回 <b>AgHospitalInfo.Images</b>的值
			 */	 
			@Column(name = "images" ) 
			public String getImages(){
			    return this.images;
			}

		  /**
		   *设置 images字段方法 
		   *@param att_images 输入<b>AgHospitalInfo.images</b>字段的值
		   */
		  public void setImages(String att_images){
		    this.images = att_images;
		  }
  
			/**
			 *设置每月计划群发次数(monthly_message_plan_count)字段方法 
			 *@return  返回 <b>AgHospitalInfo.MonthlyMessagePlanCount</b>的值
			 */	 
			@Column(name = "monthly_message_plan_count" ) 
			public Integer getMonthlyMessagePlanCount(){
			    return this.monthlyMessagePlanCount;
			}

		  /**
		   *设置 monthly_message_plan_count字段方法 
		   *@param att_monthlyMessagePlanCount 输入<b>AgHospitalInfo.monthlyMessagePlanCount</b>字段的值
		   */
		  public void setMonthlyMessagePlanCount(Integer att_monthlyMessagePlanCount){
		    this.monthlyMessagePlanCount = att_monthlyMessagePlanCount;
		  }
  
			/**
			 *设置每月实际群发总数(monthly_message_actual_count)字段方法 
			 *@return  返回 <b>AgHospitalInfo.MonthlyMessageActualCount</b>的值
			 */	 
			@Column(name = "monthly_message_actual_count" ) 
			public Integer getMonthlyMessageActualCount(){
			    return this.monthlyMessageActualCount;
			}

		  /**
		   *设置 monthly_message_actual_count字段方法 
		   *@param att_monthlyMessageActualCount 输入<b>AgHospitalInfo.monthlyMessageActualCount</b>字段的值
		   */
		  public void setMonthlyMessageActualCount(Integer att_monthlyMessageActualCount){
		    this.monthlyMessageActualCount = att_monthlyMessageActualCount;
		  }
  
			/**
			 *设置医院联系人姓名(registration_contact_name)字段方法 
			 *@return  返回 <b>AgHospitalInfo.RegistrationContactName</b>的值
			 */	 
			@Column(name = "registration_contact_name" ) 
			public String getRegistrationContactName(){
			    return this.registrationContactName;
			}

		  /**
		   *设置 registration_contact_name字段方法 
		   *@param att_registrationContactName 输入<b>AgHospitalInfo.registrationContactName</b>字段的值
		   */
		  public void setRegistrationContactName(String att_registrationContactName){
		    this.registrationContactName = att_registrationContactName;
		  }
  
			/**
			 *设置医院联系人电话(registration_contact_mobile)字段方法 
			 *@return  返回 <b>AgHospitalInfo.RegistrationContactMobile</b>的值
			 */	 
			@Column(name = "registration_contact_mobile" ) 
			public String getRegistrationContactMobile(){
			    return this.registrationContactMobile;
			}

		  /**
		   *设置 registration_contact_mobile字段方法 
		   *@param att_registrationContactMobile 输入<b>AgHospitalInfo.registrationContactMobile</b>字段的值
		   */
		  public void setRegistrationContactMobile(String att_registrationContactMobile){
		    this.registrationContactMobile = att_registrationContactMobile;
		  }
  
			/**
			 *设置医院联系人邮箱(registration_contact_email)字段方法 
			 *@return  返回 <b>AgHospitalInfo.RegistrationContactEmail</b>的值
			 */	 
			@Column(name = "registration_contact_email" ) 
			public String getRegistrationContactEmail(){
			    return this.registrationContactEmail;
			}

		  /**
		   *设置 registration_contact_email字段方法 
		   *@param att_registrationContactEmail 输入<b>AgHospitalInfo.registrationContactEmail</b>字段的值
		   */
		  public void setRegistrationContactEmail(String att_registrationContactEmail){
		    this.registrationContactEmail = att_registrationContactEmail;
		  }
  
			/**
			 *设置药费佣金比例(drug_fee_percent)字段方法 
			 *@return  返回 <b>AgHospitalInfo.DrugFeePercent</b>的值
			 */	 
			@Column(name = "drug_fee_percent" ) 
			public Double getDrugFeePercent(){
			    return this.drugFeePercent;
			}

		  /**
		   *设置 drug_fee_percent字段方法 
		   *@param att_drugFeePercent 输入<b>AgHospitalInfo.drugFeePercent</b>字段的值
		   */
		  public void setDrugFeePercent(Double att_drugFeePercent){
		    this.drugFeePercent = att_drugFeePercent;
		  }
  
			/**
			 *设置诊疗费佣金比例(treatment_fee_percent)字段方法 
			 *@return  返回 <b>AgHospitalInfo.TreatmentFeePercent</b>的值
			 */	 
			@Column(name = "treatment_fee_percent" ) 
			public Double getTreatmentFeePercent(){
			    return this.treatmentFeePercent;
			}

		  /**
		   *设置 treatment_fee_percent字段方法 
		   *@param att_treatmentFeePercent 输入<b>AgHospitalInfo.treatmentFeePercent</b>字段的值
		   */
		  public void setTreatmentFeePercent(Double att_treatmentFeePercent){
		    this.treatmentFeePercent = att_treatmentFeePercent;
		  }
  
			/**
			 *设置接洽费(reception_fee)字段方法 
			 *@return  返回 <b>AgHospitalInfo.ReceptionFee</b>的值
			 */	 
			@Column(name = "reception_fee" ) 
			public Double getReceptionFee(){
			    return this.receptionFee;
			}

		  /**
		   *设置 reception_fee字段方法 
		   *@param att_receptionFee 输入<b>AgHospitalInfo.receptionFee</b>字段的值
		   */
		  public void setReceptionFee(Double att_receptionFee){
		    this.receptionFee = att_receptionFee;
		  }
  
			/**
			 *设置患者补贴比例(patient_share_percent)字段方法 
			 *@return  返回 <b>AgHospitalInfo.PatientSharePercent</b>的值
			 */	 
			@Column(name = "patient_share_percent" ) 
			public Double getPatientSharePercent(){
			    return this.patientSharePercent;
			}

		  /**
		   *设置 patient_share_percent字段方法 
		   *@param att_patientSharePercent 输入<b>AgHospitalInfo.patientSharePercent</b>字段的值
		   */
		  public void setPatientSharePercent(Double att_patientSharePercent){
		    this.patientSharePercent = att_patientSharePercent;
		  }
  
			/**
			 *设置一级业务员奖金比例(primary_salesman_share_percent)字段方法 
			 *@return  返回 <b>AgHospitalInfo.PrimarySalesmanSharePercent</b>的值
			 */	 
			@Column(name = "primary_salesman_share_percent" ) 
			public Double getPrimarySalesmanSharePercent(){
			    return this.primarySalesmanSharePercent;
			}

		  /**
		   *设置 primary_salesman_share_percent字段方法 
		   *@param att_primarySalesmanSharePercent 输入<b>AgHospitalInfo.primarySalesmanSharePercent</b>字段的值
		   */
		  public void setPrimarySalesmanSharePercent(Double att_primarySalesmanSharePercent){
		    this.primarySalesmanSharePercent = att_primarySalesmanSharePercent;
		  }
  
			/**
			 *设置二级业务员奖金比例(secondary_salesman_share_percent)字段方法 
			 *@return  返回 <b>AgHospitalInfo.SecondarySalesmanSharePercent</b>的值
			 */	 
			@Column(name = "secondary_salesman_share_percent" ) 
			public Double getSecondarySalesmanSharePercent(){
			    return this.secondarySalesmanSharePercent;
			}

		  /**
		   *设置 secondary_salesman_share_percent字段方法 
		   *@param att_secondarySalesmanSharePercent 输入<b>AgHospitalInfo.secondarySalesmanSharePercent</b>字段的值
		   */
		  public void setSecondarySalesmanSharePercent(Double att_secondarySalesmanSharePercent){
		    this.secondarySalesmanSharePercent = att_secondarySalesmanSharePercent;
		  }
  
			/**
			 *设置医院共享用户分佣比例(organization_share_percent)字段方法 
			 *@return  返回 <b>AgHospitalInfo.OrganizationSharePercent</b>的值
			 */	 
			@Column(name = "organization_share_percent" ) 
			public Double getOrganizationSharePercent(){
			    return this.organizationSharePercent;
			}

		  /**
		   *设置 organization_share_percent字段方法 
		   *@param att_organizationSharePercent 输入<b>AgHospitalInfo.organizationSharePercent</b>字段的值
		   */
		  public void setOrganizationSharePercent(Double att_organizationSharePercent){
		    this.organizationSharePercent = att_organizationSharePercent;
		  }
  
			/**
			 *设置平台佣金比例(platform_share_percent)字段方法 
			 *@return  返回 <b>AgHospitalInfo.PlatformSharePercent</b>的值
			 */	 
			@Column(name = "platform_share_percent" ) 
			public Double getPlatformSharePercent(){
			    return this.platformSharePercent;
			}

		  /**
		   *设置 platform_share_percent字段方法 
		   *@param att_platformSharePercent 输入<b>AgHospitalInfo.platformSharePercent</b>字段的值
		   */
		  public void setPlatformSharePercent(Double att_platformSharePercent){
		    this.platformSharePercent = att_platformSharePercent;
		  }
  
			/**
			 *设置银行名称(bank_name)字段方法 
			 *@return  返回 <b>AgHospitalInfo.BankName</b>的值
			 */	 
			@Column(name = "bank_name" ) 
			public String getBankName(){
			    return this.bankName;
			}

		  /**
		   *设置 bank_name字段方法 
		   *@param att_bankName 输入<b>AgHospitalInfo.bankName</b>字段的值
		   */
		  public void setBankName(String att_bankName){
		    this.bankName = att_bankName;
		  }
  
			/**
			 *设置银行账户名称(bank_account_name)字段方法 
			 *@return  返回 <b>AgHospitalInfo.BankAccountName</b>的值
			 */	 
			@Column(name = "bank_account_name" ) 
			public String getBankAccountName(){
			    return this.bankAccountName;
			}

		  /**
		   *设置 bank_account_name字段方法 
		   *@param att_bankAccountName 输入<b>AgHospitalInfo.bankAccountName</b>字段的值
		   */
		  public void setBankAccountName(String att_bankAccountName){
		    this.bankAccountName = att_bankAccountName;
		  }
  
			/**
			 *设置银行账号(bank_account_number)字段方法 
			 *@return  返回 <b>AgHospitalInfo.BankAccountNumber</b>的值
			 */	 
			@Column(name = "bank_account_number" ) 
			public String getBankAccountNumber(){
			    return this.bankAccountNumber;
			}

		  /**
		   *设置 bank_account_number字段方法 
		   *@param att_bankAccountNumber 输入<b>AgHospitalInfo.bankAccountNumber</b>字段的值
		   */
		  public void setBankAccountNumber(String att_bankAccountNumber){
		    this.bankAccountNumber = att_bankAccountNumber;
		  }
  
			/**
			 *设置状态:0禁用1启用(status)字段方法 
			 *@return  返回 <b>AgHospitalInfo.Status</b>的值
			 */	 
			@Column(name = "status" ) 
			public String getStatus(){
			    return this.status;
			}

		  /**
		   *设置 status字段方法 
		   *@param att_status 输入<b>AgHospitalInfo.status</b>字段的值
		   */
		  public void setStatus(String att_status){
		    this.status = att_status;
		  }
  
			/**
			 *设置创建人(create_ren)字段方法 
			 *@return  返回 <b>AgHospitalInfo.CreateRen</b>的值
			 */	 
			@Column(name = "create_ren" ) 
			public String getCreateRen(){
			    return this.createRen;
			}

		  /**
		   *设置 create_ren字段方法 
		   *@param att_createRen 输入<b>AgHospitalInfo.createRen</b>字段的值
		   */
		  public void setCreateRen(String att_createRen){
		    this.createRen = att_createRen;
		  }
  
			/**
			 *设置创建时间(create_date)字段方法 
			 *@return  返回 <b>AgHospitalInfo.CreateDate</b>的值
			 */	 
			@Temporal(TemporalType.TIMESTAMP)
			@Column(name = "create_date" ) 
			public Date getCreateDate(){
			    return this.createDate;
			}

		  /**
		   *设置 create_date字段方法 
		   *@param att_createDate 输入<b>AgHospitalInfo.createDate</b>字段的值
		   */
		  public void setCreateDate(Date att_createDate){
		    this.createDate = att_createDate;
		  }
  
			/**
			 *设置修改人(edit_ren)字段方法 
			 *@return  返回 <b>AgHospitalInfo.EditRen</b>的值
			 */	 
			@Column(name = "edit_ren" ) 
			public String getEditRen(){
			    return this.editRen;
			}

		  /**
		   *设置 edit_ren字段方法 
		   *@param att_editRen 输入<b>AgHospitalInfo.editRen</b>字段的值
		   */
		  public void setEditRen(String att_editRen){
		    this.editRen = att_editRen;
		  }
  
			/**
			 *设置修改时间(edit_date)字段方法 
			 *@return  返回 <b>AgHospitalInfo.EditDate</b>的值
			 */	 
			@Temporal(TemporalType.TIMESTAMP)
			@Column(name = "edit_date" ) 
			public Date getEditDate(){
			    return this.editDate;
			}

		  /**
		   *设置 edit_date字段方法 
		   *@param att_editDate 输入<b>AgHospitalInfo.editDate</b>字段的值
		   */
		  public void setEditDate(Date att_editDate){
		    this.editDate = att_editDate;
		  }
		  @Column(name = "create_account" ) 
		  public String getCreateAccount() {
				return createAccount;
			}

			public void setCreateAccount(String createAccount) {
				this.createAccount = createAccount;
			}
  

///===============数据库表字段属性end==========

		




			///===============数据库表无关子段字段属性begin==========
			/**
			 *医院ID(organization_id):字段类型为String
			 */
		  private String organizationId_str;  
			/**
			 *内部业务员ID(internal_business_people_id):字段类型为String
			 */
		  private String internalBusinessPeopleId_str;  
			/**
			 *是否医保：0是1否(medicalInsurance):字段类型为String
			 */
		  private String medicalinsurance_str;  
			/**
			 *每月计划群发次数(monthly_message_plan_count):字段类型为String
			 */
		  private String monthlyMessagePlanCount_str;  
			/**
			 *每月实际群发总数(monthly_message_actual_count):字段类型为String
			 */
		  private String monthlyMessageActualCount_str;  
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
			 *ag_hospital_info表里不用like作为条件的字符串
			 */
		  private String Tab_like;  
			/**
			 *():字段类型为String
			 *ag_hospital_info表里order by 字符串
			 */
		  private String Tab_order;  
			/**
			 *设置organizationId字段方法  
			 *@return  返回 <b>AgHospitalInfo.organizationId</b>的值
			 */ 
			@Transient
			public String getOrganizationId_str(){
				return this.organizationId_str;
			}
			/**
			  *设置 organization_id字段方法 
			  *@param att_organizationId 输入<b>AgHospitalInfo.organizationId</b>字段的值
			  */
			public void setOrganizationId_str(String att_organizationId_str){
				this.organizationId_str = att_organizationId_str;
			}
			/**
			 *设置internalBusinessPeopleId字段方法  
			 *@return  返回 <b>AgHospitalInfo.internalBusinessPeopleId</b>的值
			 */ 
			@Transient
			public String getInternalBusinessPeopleId_str(){
				return this.internalBusinessPeopleId_str;
			}
			/**
			  *设置 internal_business_people_id字段方法 
			  *@param att_internalBusinessPeopleId 输入<b>AgHospitalInfo.internalBusinessPeopleId</b>字段的值
			  */
			public void setInternalBusinessPeopleId_str(String att_internalBusinessPeopleId_str){
				this.internalBusinessPeopleId_str = att_internalBusinessPeopleId_str;
			}
			/**
			 *设置medicalinsurance字段方法  
			 *@return  返回 <b>AgHospitalInfo.medicalinsurance</b>的值
			 */ 
			@Transient
			public String getMedicalinsurance_str(){
				return this.medicalinsurance_str;
			}
			/**
			  *设置 medicalInsurance字段方法 
			  *@param att_medicalinsurance 输入<b>AgHospitalInfo.medicalinsurance</b>字段的值
			  */
			public void setMedicalinsurance_str(String att_medicalinsurance_str){
				this.medicalinsurance_str = att_medicalinsurance_str;
			}
			/**
			 *设置monthlyMessagePlanCount字段方法  
			 *@return  返回 <b>AgHospitalInfo.monthlyMessagePlanCount</b>的值
			 */ 
			@Transient
			public String getMonthlyMessagePlanCount_str(){
				return this.monthlyMessagePlanCount_str;
			}
			/**
			  *设置 monthly_message_plan_count字段方法 
			  *@param att_monthlyMessagePlanCount 输入<b>AgHospitalInfo.monthlyMessagePlanCount</b>字段的值
			  */
			public void setMonthlyMessagePlanCount_str(String att_monthlyMessagePlanCount_str){
				this.monthlyMessagePlanCount_str = att_monthlyMessagePlanCount_str;
			}
			/**
			 *设置monthlyMessageActualCount字段方法  
			 *@return  返回 <b>AgHospitalInfo.monthlyMessageActualCount</b>的值
			 */ 
			@Transient
			public String getMonthlyMessageActualCount_str(){
				return this.monthlyMessageActualCount_str;
			}
			/**
			  *设置 monthly_message_actual_count字段方法 
			  *@param att_monthlyMessageActualCount 输入<b>AgHospitalInfo.monthlyMessageActualCount</b>字段的值
			  */
			public void setMonthlyMessageActualCount_str(String att_monthlyMessageActualCount_str){
				this.monthlyMessageActualCount_str = att_monthlyMessageActualCount_str;
			}
			/**
			 *设置createDate字段方法  
			 *@return  返回 <b>AgHospitalInfo.createDate</b>的值
			 */ 
			@Transient
			public Date getCreateDate_start(){
				return this.createDate_start;
			}
			/**
			  *设置 create_date字段方法 
			  *@param att_createDate 输入<b>AgHospitalInfo.createDate</b>字段的值
			  */
			public void setCreateDate_start(Date att_createDate_start){
				this.createDate_start = att_createDate_start;
			}
			/**
			 *设置createDate字段方法  
			 *@return  返回 <b>AgHospitalInfo.createDate</b>的值
			 */ 
			@Transient
			public Date getCreateDate_end(){
				return this.createDate_end;
			}
			/**
			  *设置 create_date字段方法 
			  *@param att_createDate 输入<b>AgHospitalInfo.createDate</b>字段的值
			  */
			public void setCreateDate_end(Date att_createDate_end){
				this.createDate_end = att_createDate_end;
			}
			/**
			 *设置editDate字段方法  
			 *@return  返回 <b>AgHospitalInfo.editDate</b>的值
			 */ 
			@Transient
			public Date getEditDate_start(){
				return this.editDate_start;
			}
			/**
			  *设置 edit_date字段方法 
			  *@param att_editDate 输入<b>AgHospitalInfo.editDate</b>字段的值
			  */
			public void setEditDate_start(Date att_editDate_start){
				this.editDate_start = att_editDate_start;
			}
			/**
			 *设置editDate字段方法  
			 *@return  返回 <b>AgHospitalInfo.editDate</b>的值
			 */ 
			@Transient
			public Date getEditDate_end(){
				return this.editDate_end;
			}
			/**
			  *设置 edit_date字段方法 
			  *@param att_editDate 输入<b>AgHospitalInfo.editDate</b>字段的值
			  */
			public void setEditDate_end(Date att_editDate_end){
				this.editDate_end = att_editDate_end;
			}
			/**
			 *设置tab_like字段方法  
			 *@return  返回 <b>AgHospitalInfo.tab_like</b>的值
			 */ 
			@Transient
			public String getTab_like(){
				return this.Tab_like;
			}
			/**
			  *设置 字段方法 
			  *@param att_tab_like 输入<b>AgHospitalInfo.tab_like</b>字段的值
			  */
			public void setTab_like(String att_Tab_like){
				this.Tab_like = att_Tab_like;
			}
			/**
			 *设置tab_order字段方法  
			 *@return  返回 <b>AgHospitalInfo.tab_order</b>的值
			 */ 
			@Transient
			public String getTab_order(){
				return this.Tab_order;
			}
			/**
			  *设置 字段方法 
			  *@param att_tab_order 输入<b>AgHospitalInfo.tab_order</b>字段的值
			  */
			public void setTab_order(String att_Tab_order){
				this.Tab_order = att_Tab_order;
			}
///===============数据库表无关子段字段属性end==========
			
			private String initialUsername;
			private String initialPassword;
			private String internalBusinessPeopleName;
			private Integer id;
			private Integer medicalOrdersCount;
			private Integer favouritesCount;
			private Double distance;//距离
			private List<String> docList;
			private List<String> depList;
			private String isColl;
			private String easemobCustomerServiceUsername;//在线的环信用户
			
			@Transient
			public String getIsColl() {
				return isColl;
			}

			public void setIsColl(String isColl) {
				this.isColl = isColl;
			}
			
			@Formula("(SELECT a.account FROM sys_user_info a WHERE a.user_type='2' and a.user_role='1' AND a.srole_id=organization_id)")
			public String getInitialUsername() {
				return initialUsername;
			}

			public void setInitialUsername(String initialUsername) {
				this.initialUsername = initialUsername;
			}
			@Formula("(SELECT a.password FROM sys_user_info a WHERE a.user_type='2' and a.user_role='1' AND a.srole_id=organization_id)")
			public String getInitialPassword() {
				return initialPassword;
			}
			
			public void setInitialPassword(String initialPassword) {
				this.initialPassword = initialPassword;
			}
			@Formula("(SELECT a.name FROM ag_inside_info a WHERE a.aii_id=internal_business_people_id)")
			public String getInternalBusinessPeopleName() {
				return internalBusinessPeopleName;
			}

			public void setInternalBusinessPeopleName(String internalBusinessPeopleName) {
				this.internalBusinessPeopleName = internalBusinessPeopleName;
			}
			@Formula("(SELECT count(1) FROM ag_order_info a WHERE a.organization_id=organization_id and a.status=0)")
			public Integer getMedicalOrdersCount() {
				return medicalOrdersCount;
			}

			public void setMedicalOrdersCount(Integer medicalOrdersCount) {
				this.medicalOrdersCount = medicalOrdersCount;
			}
			@Formula("(SELECT count(1) FROM ag_collection_hospital a WHERE a.organization_id=organization_id)")
			public Integer getFavouritesCount() {
				return favouritesCount;
			}

			public void setFavouritesCount(Integer favouritesCount) {
				this.favouritesCount = favouritesCount;
			}

			@Transient
			public Double getDistance() {
				return distance;
			}

			public void setDistance(Double distance) {
				this.distance = distance;
			}

			@Transient
			public Integer getId() {
				return organizationId;
			}

			public void setId(Integer id) {
				this.organizationId=id;
			}
			
			@Transient
			public List<String> getDocList() {
				return docList;
			}

			public void setDocList(List<String> docList) {
				this.docList = docList;
			}
			
			@Transient
			public List<String> getDepList() {
				return depList;
			}

			public void setDepList(List<String> depList) {
				this.depList = depList;
			}
			@Transient
			public String getEasemobCustomerServiceUsername() {
				return easemobCustomerServiceUsername;
			}

			public void setEasemobCustomerServiceUsername(String easemobCustomerServiceUsername) {
				this.easemobCustomerServiceUsername = easemobCustomerServiceUsername;
			}
			
} 