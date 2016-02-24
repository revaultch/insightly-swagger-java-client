package io.swagger.client.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Date;



/**
 * APIComment
 **/

@ApiModel(description = "APIComment")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-02-24T20:33:55.547+01:00")
public class APIComment   {
  
  private Long COMMENT_ID = null;
  private String BODY = null;
  private Integer OWNER_USER_ID = null;
  private Long NOTE_ID = null;
  private Long EMAIL_ID = null;
  private Long TASK_ID = null;
  private Date DATE_CREATED_UTC = null;
  private Date DATE_UPDATED_UTC = null;

  
  /**
   * Unique ID for the Comment record.
   **/
  public APIComment COMMENT_ID(Long COMMENT_ID) {
    this.COMMENT_ID = COMMENT_ID;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Unique ID for the Comment record.")
  @JsonProperty("COMMENT_ID")
  public Long getCOMMENTID() {
    return COMMENT_ID;
  }
  public void setCOMMENTID(Long COMMENT_ID) {
    this.COMMENT_ID = COMMENT_ID;
  }

  
  /**
   * Text of the Comment.
   **/
  public APIComment BODY(String BODY) {
    this.BODY = BODY;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Text of the Comment.")
  @JsonProperty("BODY")
  public String getBODY() {
    return BODY;
  }
  public void setBODY(String BODY) {
    this.BODY = BODY;
  }

  
  /**
   * User ID of the Owner of the Comment.
   **/
  public APIComment OWNER_USER_ID(Integer OWNER_USER_ID) {
    this.OWNER_USER_ID = OWNER_USER_ID;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "User ID of the Owner of the Comment.")
  @JsonProperty("OWNER_USER_ID")
  public Integer getOWNERUSERID() {
    return OWNER_USER_ID;
  }
  public void setOWNERUSERID(Integer OWNER_USER_ID) {
    this.OWNER_USER_ID = OWNER_USER_ID;
  }

  
  /**
   * ID of the note the comment belongs to.
   **/
  public APIComment NOTE_ID(Long NOTE_ID) {
    this.NOTE_ID = NOTE_ID;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "ID of the note the comment belongs to.")
  @JsonProperty("NOTE_ID")
  public Long getNOTEID() {
    return NOTE_ID;
  }
  public void setNOTEID(Long NOTE_ID) {
    this.NOTE_ID = NOTE_ID;
  }

  
  /**
   * ID of the email the comment belongs to.
   **/
  public APIComment EMAIL_ID(Long EMAIL_ID) {
    this.EMAIL_ID = EMAIL_ID;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "ID of the email the comment belongs to.")
  @JsonProperty("EMAIL_ID")
  public Long getEMAILID() {
    return EMAIL_ID;
  }
  public void setEMAILID(Long EMAIL_ID) {
    this.EMAIL_ID = EMAIL_ID;
  }

  
  /**
   * ID of the task the comment belongs to.
   **/
  public APIComment TASK_ID(Long TASK_ID) {
    this.TASK_ID = TASK_ID;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "ID of the task the comment belongs to.")
  @JsonProperty("TASK_ID")
  public Long getTASKID() {
    return TASK_ID;
  }
  public void setTASKID(Long TASK_ID) {
    this.TASK_ID = TASK_ID;
  }

  
  /**
   * Date and Time Comment Created as Coordinated Universal Time.
   **/
  public APIComment DATE_CREATED_UTC(Date DATE_CREATED_UTC) {
    this.DATE_CREATED_UTC = DATE_CREATED_UTC;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Date and Time Comment Created as Coordinated Universal Time.")
  @JsonProperty("DATE_CREATED_UTC")
  public Date getDATECREATEDUTC() {
    return DATE_CREATED_UTC;
  }
  public void setDATECREATEDUTC(Date DATE_CREATED_UTC) {
    this.DATE_CREATED_UTC = DATE_CREATED_UTC;
  }

  
  /**
   * Date and Time Comment Updated as Coordinated Universal Time.
   **/
  public APIComment DATE_UPDATED_UTC(Date DATE_UPDATED_UTC) {
    this.DATE_UPDATED_UTC = DATE_UPDATED_UTC;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Date and Time Comment Updated as Coordinated Universal Time.")
  @JsonProperty("DATE_UPDATED_UTC")
  public Date getDATEUPDATEDUTC() {
    return DATE_UPDATED_UTC;
  }
  public void setDATEUPDATEDUTC(Date DATE_UPDATED_UTC) {
    this.DATE_UPDATED_UTC = DATE_UPDATED_UTC;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    APIComment aPIComment = (APIComment) o;
    return Objects.equals(this.COMMENT_ID, aPIComment.COMMENT_ID) &&
        Objects.equals(this.BODY, aPIComment.BODY) &&
        Objects.equals(this.OWNER_USER_ID, aPIComment.OWNER_USER_ID) &&
        Objects.equals(this.NOTE_ID, aPIComment.NOTE_ID) &&
        Objects.equals(this.EMAIL_ID, aPIComment.EMAIL_ID) &&
        Objects.equals(this.TASK_ID, aPIComment.TASK_ID) &&
        Objects.equals(this.DATE_CREATED_UTC, aPIComment.DATE_CREATED_UTC) &&
        Objects.equals(this.DATE_UPDATED_UTC, aPIComment.DATE_UPDATED_UTC);
  }

  @Override
  public int hashCode() {
    return Objects.hash(COMMENT_ID, BODY, OWNER_USER_ID, NOTE_ID, EMAIL_ID, TASK_ID, DATE_CREATED_UTC, DATE_UPDATED_UTC);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class APIComment {\n");
    
    sb.append("    COMMENT_ID: ").append(toIndentedString(COMMENT_ID)).append("\n");
    sb.append("    BODY: ").append(toIndentedString(BODY)).append("\n");
    sb.append("    OWNER_USER_ID: ").append(toIndentedString(OWNER_USER_ID)).append("\n");
    sb.append("    NOTE_ID: ").append(toIndentedString(NOTE_ID)).append("\n");
    sb.append("    EMAIL_ID: ").append(toIndentedString(EMAIL_ID)).append("\n");
    sb.append("    TASK_ID: ").append(toIndentedString(TASK_ID)).append("\n");
    sb.append("    DATE_CREATED_UTC: ").append(toIndentedString(DATE_CREATED_UTC)).append("\n");
    sb.append("    DATE_UPDATED_UTC: ").append(toIndentedString(DATE_UPDATED_UTC)).append("\n");
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

