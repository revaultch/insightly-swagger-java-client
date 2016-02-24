package io.swagger.client.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Date;



/**
 * APIFileAttachment
 **/

@ApiModel(description = "APIFileAttachment")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-02-24T20:33:55.547+01:00")
public class APIFileAttachment   {
  
  private Long FILE_ID = null;
  private String FILE_NAME = null;
  private String CONTENT_TYPE = null;
  private Long FILE_SIZE = null;
  private Long FILE_CATEGORY_ID = null;
  private Integer OWNER_USER_ID = null;
  private Date DATE_CREATED_UTC = null;
  private Date DATE_UPDATED_UTC = null;
  private String URL = null;

  
  /**
   * Unique ID for the File Attachment record
   **/
  public APIFileAttachment FILE_ID(Long FILE_ID) {
    this.FILE_ID = FILE_ID;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Unique ID for the File Attachment record")
  @JsonProperty("FILE_ID")
  public Long getFILEID() {
    return FILE_ID;
  }
  public void setFILEID(Long FILE_ID) {
    this.FILE_ID = FILE_ID;
  }

  
  /**
   * The name and extension of the File Attachment
   **/
  public APIFileAttachment FILE_NAME(String FILE_NAME) {
    this.FILE_NAME = FILE_NAME;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The name and extension of the File Attachment")
  @JsonProperty("FILE_NAME")
  public String getFILENAME() {
    return FILE_NAME;
  }
  public void setFILENAME(String FILE_NAME) {
    this.FILE_NAME = FILE_NAME;
  }

  
  /**
   * The MIME type of the File Attachment
   **/
  public APIFileAttachment CONTENT_TYPE(String CONTENT_TYPE) {
    this.CONTENT_TYPE = CONTENT_TYPE;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The MIME type of the File Attachment")
  @JsonProperty("CONTENT_TYPE")
  public String getCONTENTTYPE() {
    return CONTENT_TYPE;
  }
  public void setCONTENTTYPE(String CONTENT_TYPE) {
    this.CONTENT_TYPE = CONTENT_TYPE;
  }

  
  /**
   * The size of the File Attachment, in bytes
   **/
  public APIFileAttachment FILE_SIZE(Long FILE_SIZE) {
    this.FILE_SIZE = FILE_SIZE;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The size of the File Attachment, in bytes")
  @JsonProperty("FILE_SIZE")
  public Long getFILESIZE() {
    return FILE_SIZE;
  }
  public void setFILESIZE(Long FILE_SIZE) {
    this.FILE_SIZE = FILE_SIZE;
  }

  
  /**
   * The category of the File Attachment, if it has been assigned to one
   **/
  public APIFileAttachment FILE_CATEGORY_ID(Long FILE_CATEGORY_ID) {
    this.FILE_CATEGORY_ID = FILE_CATEGORY_ID;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The category of the File Attachment, if it has been assigned to one")
  @JsonProperty("FILE_CATEGORY_ID")
  public Long getFILECATEGORYID() {
    return FILE_CATEGORY_ID;
  }
  public void setFILECATEGORYID(Long FILE_CATEGORY_ID) {
    this.FILE_CATEGORY_ID = FILE_CATEGORY_ID;
  }

  
  /**
   * The User ID of the File Attachment owner
   **/
  public APIFileAttachment OWNER_USER_ID(Integer OWNER_USER_ID) {
    this.OWNER_USER_ID = OWNER_USER_ID;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The User ID of the File Attachment owner")
  @JsonProperty("OWNER_USER_ID")
  public Integer getOWNERUSERID() {
    return OWNER_USER_ID;
  }
  public void setOWNERUSERID(Integer OWNER_USER_ID) {
    this.OWNER_USER_ID = OWNER_USER_ID;
  }

  
  /**
   * Date and time File Attachment record created, as Coordinated Universal Time
   **/
  public APIFileAttachment DATE_CREATED_UTC(Date DATE_CREATED_UTC) {
    this.DATE_CREATED_UTC = DATE_CREATED_UTC;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Date and time File Attachment record created, as Coordinated Universal Time")
  @JsonProperty("DATE_CREATED_UTC")
  public Date getDATECREATEDUTC() {
    return DATE_CREATED_UTC;
  }
  public void setDATECREATEDUTC(Date DATE_CREATED_UTC) {
    this.DATE_CREATED_UTC = DATE_CREATED_UTC;
  }

  
  /**
   * Date and time File Attachment record updated, as Coordinated Universal Time
   **/
  public APIFileAttachment DATE_UPDATED_UTC(Date DATE_UPDATED_UTC) {
    this.DATE_UPDATED_UTC = DATE_UPDATED_UTC;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Date and time File Attachment record updated, as Coordinated Universal Time")
  @JsonProperty("DATE_UPDATED_UTC")
  public Date getDATEUPDATEDUTC() {
    return DATE_UPDATED_UTC;
  }
  public void setDATEUPDATEDUTC(Date DATE_UPDATED_UTC) {
    this.DATE_UPDATED_UTC = DATE_UPDATED_UTC;
  }

  
  /**
   * URL of the File Attachment
   **/
  public APIFileAttachment URL(String URL) {
    this.URL = URL;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "URL of the File Attachment")
  @JsonProperty("URL")
  public String getURL() {
    return URL;
  }
  public void setURL(String URL) {
    this.URL = URL;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    APIFileAttachment aPIFileAttachment = (APIFileAttachment) o;
    return Objects.equals(this.FILE_ID, aPIFileAttachment.FILE_ID) &&
        Objects.equals(this.FILE_NAME, aPIFileAttachment.FILE_NAME) &&
        Objects.equals(this.CONTENT_TYPE, aPIFileAttachment.CONTENT_TYPE) &&
        Objects.equals(this.FILE_SIZE, aPIFileAttachment.FILE_SIZE) &&
        Objects.equals(this.FILE_CATEGORY_ID, aPIFileAttachment.FILE_CATEGORY_ID) &&
        Objects.equals(this.OWNER_USER_ID, aPIFileAttachment.OWNER_USER_ID) &&
        Objects.equals(this.DATE_CREATED_UTC, aPIFileAttachment.DATE_CREATED_UTC) &&
        Objects.equals(this.DATE_UPDATED_UTC, aPIFileAttachment.DATE_UPDATED_UTC) &&
        Objects.equals(this.URL, aPIFileAttachment.URL);
  }

  @Override
  public int hashCode() {
    return Objects.hash(FILE_ID, FILE_NAME, CONTENT_TYPE, FILE_SIZE, FILE_CATEGORY_ID, OWNER_USER_ID, DATE_CREATED_UTC, DATE_UPDATED_UTC, URL);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class APIFileAttachment {\n");
    
    sb.append("    FILE_ID: ").append(toIndentedString(FILE_ID)).append("\n");
    sb.append("    FILE_NAME: ").append(toIndentedString(FILE_NAME)).append("\n");
    sb.append("    CONTENT_TYPE: ").append(toIndentedString(CONTENT_TYPE)).append("\n");
    sb.append("    FILE_SIZE: ").append(toIndentedString(FILE_SIZE)).append("\n");
    sb.append("    FILE_CATEGORY_ID: ").append(toIndentedString(FILE_CATEGORY_ID)).append("\n");
    sb.append("    OWNER_USER_ID: ").append(toIndentedString(OWNER_USER_ID)).append("\n");
    sb.append("    DATE_CREATED_UTC: ").append(toIndentedString(DATE_CREATED_UTC)).append("\n");
    sb.append("    DATE_UPDATED_UTC: ").append(toIndentedString(DATE_UPDATED_UTC)).append("\n");
    sb.append("    URL: ").append(toIndentedString(URL)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

