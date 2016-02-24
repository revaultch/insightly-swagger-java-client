package io.swagger.client.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Date;



/**
 * APIUser
 **/

@ApiModel(description = "APIUser")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-02-24T20:33:55.547+01:00")
public class APIUser   {
  
  private Long USER_ID = null;
  private Long CONTACT_ID = null;
  private String FIRST_NAME = null;
  private String LAST_NAME = null;
  private String TIMEZONE_ID = null;
  private String EMAIL_ADDRESS = null;
  private String EMAIL_DROPBOX_IDENTIFIER = null;
  private Boolean ADMINISTRATOR = null;
  private Boolean ACCOUNT_OWNER = null;
  private Boolean ACTIVE = null;
  private Date DATE_CREATED_UTC = null;
  private Date DATE_UPDATED_UTC = null;
  private String USER_CURRENCY = null;
  private String CONTACT_DISPLAY = null;
  private String CONTACT_ORDER = null;
  private Integer TASK_WEEK_START = null;
  private Long INSTANCE_ID = null;

  
  /**
   * Unique ID for the user record
   **/
  public APIUser USER_ID(Long USER_ID) {
    this.USER_ID = USER_ID;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Unique ID for the user record")
  @JsonProperty("USER_ID")
  public Long getUSERID() {
    return USER_ID;
  }
  public void setUSERID(Long USER_ID) {
    this.USER_ID = USER_ID;
  }

  
  /**
   * Unique ID for the Contact record corresponding to the User
   **/
  public APIUser CONTACT_ID(Long CONTACT_ID) {
    this.CONTACT_ID = CONTACT_ID;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Unique ID for the Contact record corresponding to the User")
  @JsonProperty("CONTACT_ID")
  public Long getCONTACTID() {
    return CONTACT_ID;
  }
  public void setCONTACTID(Long CONTACT_ID) {
    this.CONTACT_ID = CONTACT_ID;
  }

  
  /**
   * First name
   **/
  public APIUser FIRST_NAME(String FIRST_NAME) {
    this.FIRST_NAME = FIRST_NAME;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "First name")
  @JsonProperty("FIRST_NAME")
  public String getFIRSTNAME() {
    return FIRST_NAME;
  }
  public void setFIRSTNAME(String FIRST_NAME) {
    this.FIRST_NAME = FIRST_NAME;
  }

  
  /**
   * Last name
   **/
  public APIUser LAST_NAME(String LAST_NAME) {
    this.LAST_NAME = LAST_NAME;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Last name")
  @JsonProperty("LAST_NAME")
  public String getLASTNAME() {
    return LAST_NAME;
  }
  public void setLASTNAME(String LAST_NAME) {
    this.LAST_NAME = LAST_NAME;
  }

  
  /**
   * Timezone ID as set by the User in the User's regional settings
   **/
  public APIUser TIMEZONE_ID(String TIMEZONE_ID) {
    this.TIMEZONE_ID = TIMEZONE_ID;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Timezone ID as set by the User in the User's regional settings")
  @JsonProperty("TIMEZONE_ID")
  public String getTIMEZONEID() {
    return TIMEZONE_ID;
  }
  public void setTIMEZONEID(String TIMEZONE_ID) {
    this.TIMEZONE_ID = TIMEZONE_ID;
  }

  
  /**
   * User's email address
   **/
  public APIUser EMAIL_ADDRESS(String EMAIL_ADDRESS) {
    this.EMAIL_ADDRESS = EMAIL_ADDRESS;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "User's email address")
  @JsonProperty("EMAIL_ADDRESS")
  public String getEMAILADDRESS() {
    return EMAIL_ADDRESS;
  }
  public void setEMAILADDRESS(String EMAIL_ADDRESS) {
    this.EMAIL_ADDRESS = EMAIL_ADDRESS;
  }

  
  /**
   * Identifier of the User's personal email box, shown in the User's email mailbox setting
   **/
  public APIUser EMAIL_DROPBOX_IDENTIFIER(String EMAIL_DROPBOX_IDENTIFIER) {
    this.EMAIL_DROPBOX_IDENTIFIER = EMAIL_DROPBOX_IDENTIFIER;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Identifier of the User's personal email box, shown in the User's email mailbox setting")
  @JsonProperty("EMAIL_DROPBOX_IDENTIFIER")
  public String getEMAILDROPBOXIDENTIFIER() {
    return EMAIL_DROPBOX_IDENTIFIER;
  }
  public void setEMAILDROPBOXIDENTIFIER(String EMAIL_DROPBOX_IDENTIFIER) {
    this.EMAIL_DROPBOX_IDENTIFIER = EMAIL_DROPBOX_IDENTIFIER;
  }

  
  /**
   * True, if the User is an Administrator for the Insightly instance
   **/
  public APIUser ADMINISTRATOR(Boolean ADMINISTRATOR) {
    this.ADMINISTRATOR = ADMINISTRATOR;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "True, if the User is an Administrator for the Insightly instance")
  @JsonProperty("ADMINISTRATOR")
  public Boolean getADMINISTRATOR() {
    return ADMINISTRATOR;
  }
  public void setADMINISTRATOR(Boolean ADMINISTRATOR) {
    this.ADMINISTRATOR = ADMINISTRATOR;
  }

  
  /**
   * True, if the User is the Account owner for the Insightly instance
   **/
  public APIUser ACCOUNT_OWNER(Boolean ACCOUNT_OWNER) {
    this.ACCOUNT_OWNER = ACCOUNT_OWNER;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "True, if the User is the Account owner for the Insightly instance")
  @JsonProperty("ACCOUNT_OWNER")
  public Boolean getACCOUNTOWNER() {
    return ACCOUNT_OWNER;
  }
  public void setACCOUNTOWNER(Boolean ACCOUNT_OWNER) {
    this.ACCOUNT_OWNER = ACCOUNT_OWNER;
  }

  
  /**
   * True, if the account is active
   **/
  public APIUser ACTIVE(Boolean ACTIVE) {
    this.ACTIVE = ACTIVE;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "True, if the account is active")
  @JsonProperty("ACTIVE")
  public Boolean getACTIVE() {
    return ACTIVE;
  }
  public void setACTIVE(Boolean ACTIVE) {
    this.ACTIVE = ACTIVE;
  }

  
  /**
   * Date and time User record created, as Coordinated Universal Time
   **/
  public APIUser DATE_CREATED_UTC(Date DATE_CREATED_UTC) {
    this.DATE_CREATED_UTC = DATE_CREATED_UTC;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Date and time User record created, as Coordinated Universal Time")
  @JsonProperty("DATE_CREATED_UTC")
  public Date getDATECREATEDUTC() {
    return DATE_CREATED_UTC;
  }
  public void setDATECREATEDUTC(Date DATE_CREATED_UTC) {
    this.DATE_CREATED_UTC = DATE_CREATED_UTC;
  }

  
  /**
   * Date and time User record updated, as Coordinated Universal Time
   **/
  public APIUser DATE_UPDATED_UTC(Date DATE_UPDATED_UTC) {
    this.DATE_UPDATED_UTC = DATE_UPDATED_UTC;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Date and time User record updated, as Coordinated Universal Time")
  @JsonProperty("DATE_UPDATED_UTC")
  public Date getDATEUPDATEDUTC() {
    return DATE_UPDATED_UTC;
  }
  public void setDATEUPDATEDUTC(Date DATE_UPDATED_UTC) {
    this.DATE_UPDATED_UTC = DATE_UPDATED_UTC;
  }

  
  /**
   * User's regional setting for Currency
   **/
  public APIUser USER_CURRENCY(String USER_CURRENCY) {
    this.USER_CURRENCY = USER_CURRENCY;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "User's regional setting for Currency")
  @JsonProperty("USER_CURRENCY")
  public String getUSERCURRENCY() {
    return USER_CURRENCY;
  }
  public void setUSERCURRENCY(String USER_CURRENCY) {
    this.USER_CURRENCY = USER_CURRENCY;
  }

  
  /**
   * User's setting for Contact List display
   **/
  public APIUser CONTACT_DISPLAY(String CONTACT_DISPLAY) {
    this.CONTACT_DISPLAY = CONTACT_DISPLAY;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "User's setting for Contact List display")
  @JsonProperty("CONTACT_DISPLAY")
  public String getCONTACTDISPLAY() {
    return CONTACT_DISPLAY;
  }
  public void setCONTACTDISPLAY(String CONTACT_DISPLAY) {
    this.CONTACT_DISPLAY = CONTACT_DISPLAY;
  }

  
  /**
   * User's settting for Contact List order
   **/
  public APIUser CONTACT_ORDER(String CONTACT_ORDER) {
    this.CONTACT_ORDER = CONTACT_ORDER;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "User's settting for Contact List order")
  @JsonProperty("CONTACT_ORDER")
  public String getCONTACTORDER() {
    return CONTACT_ORDER;
  }
  public void setCONTACTORDER(String CONTACT_ORDER) {
    this.CONTACT_ORDER = CONTACT_ORDER;
  }

  
  /**
   * User's start day of week
   **/
  public APIUser TASK_WEEK_START(Integer TASK_WEEK_START) {
    this.TASK_WEEK_START = TASK_WEEK_START;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "User's start day of week")
  @JsonProperty("TASK_WEEK_START")
  public Integer getTASKWEEKSTART() {
    return TASK_WEEK_START;
  }
  public void setTASKWEEKSTART(Integer TASK_WEEK_START) {
    this.TASK_WEEK_START = TASK_WEEK_START;
  }

  
  /**
   * Unique key of the Instance which this User belongs to
   **/
  public APIUser INSTANCE_ID(Long INSTANCE_ID) {
    this.INSTANCE_ID = INSTANCE_ID;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Unique key of the Instance which this User belongs to")
  @JsonProperty("INSTANCE_ID")
  public Long getINSTANCEID() {
    return INSTANCE_ID;
  }
  public void setINSTANCEID(Long INSTANCE_ID) {
    this.INSTANCE_ID = INSTANCE_ID;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    APIUser aPIUser = (APIUser) o;
    return Objects.equals(this.USER_ID, aPIUser.USER_ID) &&
        Objects.equals(this.CONTACT_ID, aPIUser.CONTACT_ID) &&
        Objects.equals(this.FIRST_NAME, aPIUser.FIRST_NAME) &&
        Objects.equals(this.LAST_NAME, aPIUser.LAST_NAME) &&
        Objects.equals(this.TIMEZONE_ID, aPIUser.TIMEZONE_ID) &&
        Objects.equals(this.EMAIL_ADDRESS, aPIUser.EMAIL_ADDRESS) &&
        Objects.equals(this.EMAIL_DROPBOX_IDENTIFIER, aPIUser.EMAIL_DROPBOX_IDENTIFIER) &&
        Objects.equals(this.ADMINISTRATOR, aPIUser.ADMINISTRATOR) &&
        Objects.equals(this.ACCOUNT_OWNER, aPIUser.ACCOUNT_OWNER) &&
        Objects.equals(this.ACTIVE, aPIUser.ACTIVE) &&
        Objects.equals(this.DATE_CREATED_UTC, aPIUser.DATE_CREATED_UTC) &&
        Objects.equals(this.DATE_UPDATED_UTC, aPIUser.DATE_UPDATED_UTC) &&
        Objects.equals(this.USER_CURRENCY, aPIUser.USER_CURRENCY) &&
        Objects.equals(this.CONTACT_DISPLAY, aPIUser.CONTACT_DISPLAY) &&
        Objects.equals(this.CONTACT_ORDER, aPIUser.CONTACT_ORDER) &&
        Objects.equals(this.TASK_WEEK_START, aPIUser.TASK_WEEK_START) &&
        Objects.equals(this.INSTANCE_ID, aPIUser.INSTANCE_ID);
  }

  @Override
  public int hashCode() {
    return Objects.hash(USER_ID, CONTACT_ID, FIRST_NAME, LAST_NAME, TIMEZONE_ID, EMAIL_ADDRESS, EMAIL_DROPBOX_IDENTIFIER, ADMINISTRATOR, ACCOUNT_OWNER, ACTIVE, DATE_CREATED_UTC, DATE_UPDATED_UTC, USER_CURRENCY, CONTACT_DISPLAY, CONTACT_ORDER, TASK_WEEK_START, INSTANCE_ID);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class APIUser {\n");
    
    sb.append("    USER_ID: ").append(toIndentedString(USER_ID)).append("\n");
    sb.append("    CONTACT_ID: ").append(toIndentedString(CONTACT_ID)).append("\n");
    sb.append("    FIRST_NAME: ").append(toIndentedString(FIRST_NAME)).append("\n");
    sb.append("    LAST_NAME: ").append(toIndentedString(LAST_NAME)).append("\n");
    sb.append("    TIMEZONE_ID: ").append(toIndentedString(TIMEZONE_ID)).append("\n");
    sb.append("    EMAIL_ADDRESS: ").append(toIndentedString(EMAIL_ADDRESS)).append("\n");
    sb.append("    EMAIL_DROPBOX_IDENTIFIER: ").append(toIndentedString(EMAIL_DROPBOX_IDENTIFIER)).append("\n");
    sb.append("    ADMINISTRATOR: ").append(toIndentedString(ADMINISTRATOR)).append("\n");
    sb.append("    ACCOUNT_OWNER: ").append(toIndentedString(ACCOUNT_OWNER)).append("\n");
    sb.append("    ACTIVE: ").append(toIndentedString(ACTIVE)).append("\n");
    sb.append("    DATE_CREATED_UTC: ").append(toIndentedString(DATE_CREATED_UTC)).append("\n");
    sb.append("    DATE_UPDATED_UTC: ").append(toIndentedString(DATE_UPDATED_UTC)).append("\n");
    sb.append("    USER_CURRENCY: ").append(toIndentedString(USER_CURRENCY)).append("\n");
    sb.append("    CONTACT_DISPLAY: ").append(toIndentedString(CONTACT_DISPLAY)).append("\n");
    sb.append("    CONTACT_ORDER: ").append(toIndentedString(CONTACT_ORDER)).append("\n");
    sb.append("    TASK_WEEK_START: ").append(toIndentedString(TASK_WEEK_START)).append("\n");
    sb.append("    INSTANCE_ID: ").append(toIndentedString(INSTANCE_ID)).append("\n");
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

