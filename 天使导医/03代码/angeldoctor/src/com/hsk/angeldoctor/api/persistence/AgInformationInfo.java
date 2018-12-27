package com.hsk.angeldoctor.api.persistence;

import javax.persistence.*;

import com.hsk.supper.dto.SystemContext;
import com.hsk.xframe.api.utils.freeMarker.CommonUtil;

import static javax.persistence.GenerationType.IDENTITY;
import java.util.Date;

/**
 * 根据ag_information_info表结构自动生成持久化对象<B> com.hsk.angeldoctor.api.persistence.AgInformationInfo</B>
 *<hr/>
 *===============数据库表字段属性==========
 *  <table> 
 * <tr><th>字段名称:</th><td>咨询ID(aiiId)</td><th>字段类型:</th><td>Integer(主键)</td></tr> 
 * <tr><th>字段名称:</th><td>类型(type)</td><th>字段类型:</th><td>String</td></tr> 
 * <tr><th>字段名称:</th><td>省(provId)</td><th>字段类型:</th><td>String(可以为空)</td></tr> 
 * <tr><th>字段名称:</th><td>市(cityId)</td><th>字段类型:</th><td>String(可以为空)</td></tr> 
 * <tr><th>字段名称:</th><td>标题(title)</td><th>字段类型:</th><td>String(可以为空)</td></tr> 
 * <tr><th>字段名称:</th><td>作者(author)</td><th>字段类型:</th><td>String(可以为空)</td></tr> 
 * <tr><th>字段名称:</th><td>图标(icon)</td><th>字段类型:</th><td>String(可以为空)</td></tr> 
 * <tr><th>字段名称:</th><td>摘要(digest)</td><th>字段类型:</th><td>String(可以为空)</td></tr> 
 * <tr><th>字段名称:</th><td>内容(content)</td><th>字段类型:</th><td>String(可以为空)</td></tr> 
 * <tr><th>字段名称:</th><td>是否设置为Banner(isBanner)</td><th>字段类型:</th><td>String</td></tr> 
 * <tr><th>字段名称:</th><td>bannerIconbanner图标(bannerIcon)</td><th>字段类型:</th><td>String(可以为空)</td></tr> 
 * <tr><th>字段名称:</th><td>bannerStartDate(bannerStartDate)</td><th>字段类型:</th><td>Date(可以为空)</td></tr> 
 * <tr><th>字段名称:</th><td>banner结束时间(bannerEndDate)</td><th>字段类型:</th><td>Date(可以为空)</td></tr> 
 * <tr><th>字段名称:</th><td>访问次数(pageRead)</td><th>字段类型:</th><td>Integer</td></tr> 
 * <tr><th>字段名称:</th><td>状态:1正常，2禁用(status)</td><th>字段类型:</th><td>String(可以为空)</td></tr> 
 * <tr><th>字段名称:</th><td>创建人(creatorName)</td><th>字段类型:</th><td>String(可以为空)</td></tr> 
 * <tr><th>字段名称:</th><td>创建时间(createDate)</td><th>字段类型:</th><td>Date(可以为空)</td></tr> 
 * <tr><th>字段名称:</th><td>创建人ID(creatorId)</td><th>字段类型:</th><td>Integer(可以为空)</td></tr> 
 * </table>
 *===============无关字段属性===============
 *  <table> 
 * 	<tr><th>字段名称:</th><td>咨询ID(aiiId)	</td><th>属性名称:</th><td>aiiId</td></tr>
 * 	<tr><th>字段名称:</th><td>bannerStartDate(bannerStartDate)	</td><th>属性名称:</th><td>bannerStartDate</td></tr>
 * 	<tr><th>字段名称:</th><td>bannerStartDate(bannerStartDate)	</td><th>属性名称:</th><td>bannerStartDate</td></tr>
 * 	<tr><th>字段名称:</th><td>banner结束时间(bannerEndDate)	</td><th>属性名称:</th><td>bannerEndDate</td></tr>
 * 	<tr><th>字段名称:</th><td>banner结束时间(bannerEndDate)	</td><th>属性名称:</th><td>bannerEndDate</td></tr>
 * 	<tr><th>字段名称:</th><td>访问次数(pageRead)	</td><th>属性名称:</th><td>pageRead</td></tr>
 * 	<tr><th>字段名称:</th><td>创建时间(createDate)	</td><th>属性名称:</th><td>createDate</td></tr>
 * 	<tr><th>字段名称:</th><td>创建时间(createDate)	</td><th>属性名称:</th><td>createDate</td></tr>
 * 	<tr><th>字段名称:</th><td>创建人ID(creatorId)	</td><th>属性名称:</th><td>creatorId</td></tr>
 * 	<tr><th>字段名称:</th><td>(tab_like)	</td><th>属性名称:</th><td>tab_like</td></tr>
 * 	<tr><th>字段名称:</th><td>(tab_order)	</td><th>属性名称:</th><td>tab_order</td></tr>
 * </table>
 * <hr/>
 * @author  作者:admin  
 * @version  v1.0 创建时间: 2018-08-14 13:40:21
 */
 
 
@SuppressWarnings("serial")
@Entity
@Table(name = "ag_information_info" )
public class AgInformationInfo {
///===============数据库表字段属性begin==========
			/**
			 *咨询ID(aiiId):字段类型为Integer  
			 */
 			private Integer aiiId; 
 	
			/**
			 *类型(type):字段类型为String  
			 */
 			private String type; 
 	
			/**
			 *省(provId):字段类型为String  
			 */
 			private String provId; 
 	
			/**
			 *市(cityId):字段类型为String  
			 */
 			private String cityId; 
 	
			/**
			 *标题(title):字段类型为String  
			 */
 			private String title; 
 	
			/**
			 *作者(author):字段类型为String  
			 */
 			private String author; 
 	
			/**
			 *图标(icon):字段类型为String  
			 */
 			private String icon; 
 	
			/**
			 *摘要(digest):字段类型为String  
			 */
 			private String digest; 
 	
			/**
			 *内容(content):字段类型为String  
			 */
 			private String content; 
 	
			/**
			 *是否设置为Banner(isBanner):字段类型为String  
			 */
 			private String isBanner; 
 	
			/**
			 *bannerIconbanner图标(bannerIcon):字段类型为String  
			 */
 			private String bannerIcon; 
 	
			/**
			 *bannerStartDate(bannerStartDate):字段类型为Date  
			 */
 			private Date bannerStartDate; 
 	
			/**
			 *banner结束时间(bannerEndDate):字段类型为Date  
			 */
 			private Date bannerEndDate; 
 	
			/**
			 *访问次数(pageRead):字段类型为Integer  
			 */
 			private Integer pageRead; 
 	
			/**
			 *状态:1正常，2禁用(status):字段类型为String  
			 */
 			private String status; 
 	
			/**
			 *创建人(creatorName):字段类型为String  
			 */
 			private String creatorName; 
 	
			/**
			 *创建时间(createDate):字段类型为Date  
			 */
 			private Date createDate; 
 	
			/**
			 *创建人ID(creatorId):字段类型为Integer  
			 */
 			private Integer creatorId; 
 	
			/**
			 *设置咨询ID(aii_id)字段方法 (该字段是主键)
			 *@return  返回 <b>AgInformationInfo.AiiId</b>的值
			 */	 
			@Id
			@GeneratedValue(strategy = IDENTITY)
			@Column(name = "aii_id")
			public Integer getAiiId(){
			    return this.aiiId;
			}

		  /**
		   *设置 aii_id字段方法 
		   *@param att_aiiId 输入<b>AgInformationInfo.aiiId</b>字段的值
		   */
		  public void setAiiId(Integer att_aiiId){
		    this.aiiId = att_aiiId;
		  }
  
			/**
			 *设置类型(type)字段方法 
			 *@return  返回 <b>AgInformationInfo.Type</b>的值
			 */	 
			@Column(name = "type" ) 
			public String getType(){
			    return this.type;
			}

		  /**
		   *设置 type字段方法 
		   *@param att_type 输入<b>AgInformationInfo.type</b>字段的值
		   */
		  public void setType(String att_type){
		    this.type = att_type;
		  }
  
			/**
			 *设置省(prov_id)字段方法 
			 *@return  返回 <b>AgInformationInfo.ProvId</b>的值
			 */	 
			@Column(name = "prov_id" ) 
			public String getProvId(){
			    return this.provId;
			}

		  /**
		   *设置 prov_id字段方法 
		   *@param att_provId 输入<b>AgInformationInfo.provId</b>字段的值
		   */
		  public void setProvId(String att_provId){
		    this.provId = att_provId;
		  }
  
			/**
			 *设置市(city_id)字段方法 
			 *@return  返回 <b>AgInformationInfo.CityId</b>的值
			 */	 
			@Column(name = "city_id" ) 
			public String getCityId(){
			    return this.cityId;
			}

		  /**
		   *设置 city_id字段方法 
		   *@param att_cityId 输入<b>AgInformationInfo.cityId</b>字段的值
		   */
		  public void setCityId(String att_cityId){
		    this.cityId = att_cityId;
		  }
  
			/**
			 *设置标题(title)字段方法 
			 *@return  返回 <b>AgInformationInfo.Title</b>的值
			 */	 
			@Column(name = "title" ) 
			public String getTitle(){
			    return this.title;
			}

		  /**
		   *设置 title字段方法 
		   *@param att_title 输入<b>AgInformationInfo.title</b>字段的值
		   */
		  public void setTitle(String att_title){
		    this.title = att_title;
		  }
  
			/**
			 *设置作者(author)字段方法 
			 *@return  返回 <b>AgInformationInfo.Author</b>的值
			 */	 
			@Column(name = "author" ) 
			public String getAuthor(){
			    return this.author;
			}

		  /**
		   *设置 author字段方法 
		   *@param att_author 输入<b>AgInformationInfo.author</b>字段的值
		   */
		  public void setAuthor(String att_author){
		    this.author = att_author;
		  }
  
			/**
			 *设置图标(icon)字段方法 
			 *@return  返回 <b>AgInformationInfo.Icon</b>的值
			 */	 
			@Column(name = "icon" ) 
			public String getIcon(){
			    return this.icon;
			}

		  /**
		   *设置 icon字段方法 
		   *@param att_icon 输入<b>AgInformationInfo.icon</b>字段的值
		   */
		  public void setIcon(String att_icon){
		    this.icon = att_icon;
		  }
  
			/**
			 *设置摘要(digest)字段方法 
			 *@return  返回 <b>AgInformationInfo.Digest</b>的值
			 */	 
			@Column(name = "digest" ) 
			public String getDigest(){
			    return this.digest;
			}

		  /**
		   *设置 digest字段方法 
		   *@param att_digest 输入<b>AgInformationInfo.digest</b>字段的值
		   */
		  public void setDigest(String att_digest){
		    this.digest = att_digest;
		  }
  
			/**
			 *设置内容(content)字段方法 
			 *@return  返回 <b>AgInformationInfo.Content</b>的值
			 */	 
			@Column(name = "content" ) 
			public String getContent(){
			    return this.content;
			}

		  /**
		   *设置 content字段方法 
		   *@param att_content 输入<b>AgInformationInfo.content</b>字段的值
		   */
		  public void setContent(String att_content){
		    this.content = att_content;
		  }
  
			/**
			 *设置是否设置为Banner(is_banner)字段方法 
			 *@return  返回 <b>AgInformationInfo.IsBanner</b>的值
			 */	 
			@Column(name = "is_banner" ) 
			public String getIsBanner(){
			    return this.isBanner;
			}

		  /**
		   *设置 is_banner字段方法 
		   *@param att_isBanner 输入<b>AgInformationInfo.isBanner</b>字段的值
		   */
		  public void setIsBanner(String att_isBanner){
		    this.isBanner = att_isBanner;
		  }
  
			/**
			 *设置bannerIconbanner图标(banner_icon)字段方法 
			 *@return  返回 <b>AgInformationInfo.BannerIcon</b>的值
			 */	 
			@Column(name = "banner_icon" ) 
			public String getBannerIcon(){
			    return this.bannerIcon;
			}

		  /**
		   *设置 banner_icon字段方法 
		   *@param att_bannerIcon 输入<b>AgInformationInfo.bannerIcon</b>字段的值
		   */
		  public void setBannerIcon(String att_bannerIcon){
		    this.bannerIcon = att_bannerIcon;
		  }
  
			/**
			 *设置bannerStartDate(banner_start_date)字段方法 
			 *@return  返回 <b>AgInformationInfo.BannerStartDate</b>的值
			 */	 
			@Temporal(TemporalType.DATE)
			@Column(name = "banner_start_date" ) 
			public Date getBannerStartDate(){
			    return this.bannerStartDate;
			}

		  /**
		   *设置 banner_start_date字段方法 
		   *@param att_bannerStartDate 输入<b>AgInformationInfo.bannerStartDate</b>字段的值
		   */
		  public void setBannerStartDate(Date att_bannerStartDate){
		    this.bannerStartDate = att_bannerStartDate;
		  }
  
			/**
			 *设置banner结束时间(banner_end_date)字段方法 
			 *@return  返回 <b>AgInformationInfo.BannerEndDate</b>的值
			 */	 
			@Temporal(TemporalType.DATE)
			@Column(name = "banner_end_date" ) 
			public Date getBannerEndDate(){
			    return this.bannerEndDate;
			}

		  /**
		   *设置 banner_end_date字段方法 
		   *@param att_bannerEndDate 输入<b>AgInformationInfo.bannerEndDate</b>字段的值
		   */
		  public void setBannerEndDate(Date att_bannerEndDate){
		    this.bannerEndDate = att_bannerEndDate;
		  }
  
			/**
			 *设置访问次数(page_read)字段方法 
			 *@return  返回 <b>AgInformationInfo.PageRead</b>的值
			 */	 
			@Column(name = "page_read" ) 
			public Integer getPageRead(){
			    return this.pageRead;
			}

		  /**
		   *设置 page_read字段方法 
		   *@param att_pageRead 输入<b>AgInformationInfo.pageRead</b>字段的值
		   */
		  public void setPageRead(Integer att_pageRead){
		    this.pageRead = att_pageRead;
		  }
  
			/**
			 *设置状态:1正常，2禁用(status)字段方法 
			 *@return  返回 <b>AgInformationInfo.Status</b>的值
			 */	 
			@Column(name = "status" ) 
			public String getStatus(){
			    return this.status;
			}

		  /**
		   *设置 status字段方法 
		   *@param att_status 输入<b>AgInformationInfo.status</b>字段的值
		   */
		  public void setStatus(String att_status){
		    this.status = att_status;
		  }
  
			/**
			 *设置创建人(creator_name)字段方法 
			 *@return  返回 <b>AgInformationInfo.CreatorName</b>的值
			 */	 
			@Column(name = "creator_name" ) 
			public String getCreatorName(){
			    return this.creatorName;
			}

		  /**
		   *设置 creator_name字段方法 
		   *@param att_creatorName 输入<b>AgInformationInfo.creatorName</b>字段的值
		   */
		  public void setCreatorName(String att_creatorName){
		    this.creatorName = att_creatorName;
		  }
  
			/**
			 *设置创建时间(create_date)字段方法 
			 *@return  返回 <b>AgInformationInfo.CreateDate</b>的值
			 */	 
			@Temporal(TemporalType.TIMESTAMP)
			@Column(name = "create_date" ) 
			public Date getCreateDate(){
			    return this.createDate;
			}

		  /**
		   *设置 create_date字段方法 
		   *@param att_createDate 输入<b>AgInformationInfo.createDate</b>字段的值
		   */
		  public void setCreateDate(Date att_createDate){
		    this.createDate = att_createDate;
		  }
  
			/**
			 *设置创建人ID(creator_id)字段方法 
			 *@return  返回 <b>AgInformationInfo.CreatorId</b>的值
			 */	 
			@Column(name = "creator_id" ) 
			public Integer getCreatorId(){
			    return this.creatorId;
			}

		  /**
		   *设置 creator_id字段方法 
		   *@param att_creatorId 输入<b>AgInformationInfo.creatorId</b>字段的值
		   */
		  public void setCreatorId(Integer att_creatorId){
		    this.creatorId = att_creatorId;
		  }
  

///===============数据库表字段属性end==========

///===============数据库表无关子段字段属性begin==========
			/**
			 *咨询ID(aii_id):字段类型为String
			 */
		  private String aiiId_str;  
			/**
			 *bannerStartDate(banner_start_date):字段类型为Date
			 */
		  private Date bannerStartDate_start;  
			/**
			 *bannerStartDate(banner_start_date):字段类型为Date
			 */
		  private Date bannerStartDate_end;  
			/**
			 *banner结束时间(banner_end_date):字段类型为Date
			 */
		  private Date bannerEndDate_start;  
			/**
			 *banner结束时间(banner_end_date):字段类型为Date
			 */
		  private Date bannerEndDate_end;  
			/**
			 *访问次数(page_read):字段类型为String
			 */
		  private String pageRead_str;  
			/**
			 *创建时间(create_date):字段类型为Date
			 */
		  private Date createDate_start;  
			/**
			 *创建时间(create_date):字段类型为Date
			 */
		  private Date createDate_end;  
			/**
			 *创建人ID(creator_id):字段类型为String
			 */
		  private String creatorId_str;  
			/**
			 *():字段类型为String
			 *ag_information_info表里不用like作为条件的字符串
			 */
		  private String Tab_like;  
			/**
			 *():字段类型为String
			 *ag_information_info表里order by 字符串
			 */
		  private String Tab_order;  
			/**
			 *设置aiiId字段方法  
			 *@return  返回 <b>AgInformationInfo.aiiId</b>的值
			 */ 
			@Transient
			public String getAiiId_str(){
				return this.aiiId_str;
			}
			/**
			  *设置 aii_id字段方法 
			  *@param att_aiiId 输入<b>AgInformationInfo.aiiId</b>字段的值
			  */
			public void setAiiId_str(String att_aiiId_str){
				this.aiiId_str = att_aiiId_str;
			}
			/**
			 *设置bannerStartDate字段方法  
			 *@return  返回 <b>AgInformationInfo.bannerStartDate</b>的值
			 */ 
			@Transient
			public Date getBannerStartDate_start(){
				return this.bannerStartDate_start;
			}
			/**
			  *设置 banner_start_date字段方法 
			  *@param att_bannerStartDate 输入<b>AgInformationInfo.bannerStartDate</b>字段的值
			  */
			public void setBannerStartDate_start(Date att_bannerStartDate_start){
				this.bannerStartDate_start = att_bannerStartDate_start;
			}
			/**
			 *设置bannerStartDate字段方法  
			 *@return  返回 <b>AgInformationInfo.bannerStartDate</b>的值
			 */ 
			@Transient
			public Date getBannerStartDate_end(){
				return this.bannerStartDate_end;
			}
			/**
			  *设置 banner_start_date字段方法 
			  *@param att_bannerStartDate 输入<b>AgInformationInfo.bannerStartDate</b>字段的值
			  */
			public void setBannerStartDate_end(Date att_bannerStartDate_end){
				this.bannerStartDate_end = att_bannerStartDate_end;
			}
			/**
			 *设置bannerEndDate字段方法  
			 *@return  返回 <b>AgInformationInfo.bannerEndDate</b>的值
			 */ 
			@Transient
			public Date getBannerEndDate_start(){
				return this.bannerEndDate_start;
			}
			/**
			  *设置 banner_end_date字段方法 
			  *@param att_bannerEndDate 输入<b>AgInformationInfo.bannerEndDate</b>字段的值
			  */
			public void setBannerEndDate_start(Date att_bannerEndDate_start){
				this.bannerEndDate_start = att_bannerEndDate_start;
			}
			/**
			 *设置bannerEndDate字段方法  
			 *@return  返回 <b>AgInformationInfo.bannerEndDate</b>的值
			 */ 
			@Transient
			public Date getBannerEndDate_end(){
				return this.bannerEndDate_end;
			}
			/**
			  *设置 banner_end_date字段方法 
			  *@param att_bannerEndDate 输入<b>AgInformationInfo.bannerEndDate</b>字段的值
			  */
			public void setBannerEndDate_end(Date att_bannerEndDate_end){
				this.bannerEndDate_end = att_bannerEndDate_end;
			}
			/**
			 *设置pageRead字段方法  
			 *@return  返回 <b>AgInformationInfo.pageRead</b>的值
			 */ 
			@Transient
			public String getPageRead_str(){
				return this.pageRead_str;
			}
			/**
			  *设置 page_read字段方法 
			  *@param att_pageRead 输入<b>AgInformationInfo.pageRead</b>字段的值
			  */
			public void setPageRead_str(String att_pageRead_str){
				this.pageRead_str = att_pageRead_str;
			}
			/**
			 *设置createDate字段方法  
			 *@return  返回 <b>AgInformationInfo.createDate</b>的值
			 */ 
			@Transient
			public Date getCreateDate_start(){
				return this.createDate_start;
			}
			/**
			  *设置 create_date字段方法 
			  *@param att_createDate 输入<b>AgInformationInfo.createDate</b>字段的值
			  */
			public void setCreateDate_start(Date att_createDate_start){
				this.createDate_start = att_createDate_start;
			}
			/**
			 *设置createDate字段方法  
			 *@return  返回 <b>AgInformationInfo.createDate</b>的值
			 */ 
			@Transient
			public Date getCreateDate_end(){
				return this.createDate_end;
			}
			/**
			  *设置 create_date字段方法 
			  *@param att_createDate 输入<b>AgInformationInfo.createDate</b>字段的值
			  */
			public void setCreateDate_end(Date att_createDate_end){
				this.createDate_end = att_createDate_end;
			}
			/**
			 *设置creatorId字段方法  
			 *@return  返回 <b>AgInformationInfo.creatorId</b>的值
			 */ 
			@Transient
			public String getCreatorId_str(){
				return this.creatorId_str;
			}
			/**
			  *设置 creator_id字段方法 
			  *@param att_creatorId 输入<b>AgInformationInfo.creatorId</b>字段的值
			  */
			public void setCreatorId_str(String att_creatorId_str){
				this.creatorId_str = att_creatorId_str;
			}
			/**
			 *设置tab_like字段方法  
			 *@return  返回 <b>AgInformationInfo.tab_like</b>的值
			 */ 
			@Transient
			public String getTab_like(){
				return this.Tab_like;
			}
			/**
			  *设置 字段方法 
			  *@param att_tab_like 输入<b>AgInformationInfo.tab_like</b>字段的值
			  */
			public void setTab_like(String att_Tab_like){
				this.Tab_like = att_Tab_like;
			}
			/**
			 *设置tab_order字段方法  
			 *@return  返回 <b>AgInformationInfo.tab_order</b>的值
			 */ 
			@Transient
			public String getTab_order(){
				return this.Tab_order;
			}
			/**
			  *设置 字段方法 
			  *@param att_tab_order 输入<b>AgInformationInfo.tab_order</b>字段的值
			  */
			public void setTab_order(String att_Tab_order){
				this.Tab_order = att_Tab_order;
			}
///===============数据库表无关子段字段属性end==========
			
			private Integer id;
			private String url;
			@Transient
			public Integer getId() {
				return aiiId;
			}

			public void setId(Integer id) {
				this.aiiId=id;
			}
			@Transient
			public String getUrl() {
				url=CommonUtil.HTTP_URL2+CommonUtil.HTML_PATH2+this.aiiId+".html";
				return url;
			}

			public void setUrl(String url) {
				this.url = url;
			}
			
} 