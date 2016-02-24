package io.swagger.client.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Date;



/**
 * Project milestone API object.
 **/

@ApiModel(description = "Project milestone API object.")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-02-24T20:33:55.547+01:00")
public class APIMilestone   {
  
  private Long MILESTONE_ID = null;
  private Long PROJECT_ID = null;
  private String TITLE = null;
  private Date DUE_DATE = null;
  private Boolean COMPLETED = null;
  private Date COMPLETED_DATE_UTC = null;
  private Integer RESPONSIBLE_USER_ID = null;
  private Date DATE_CREATED_UTC = null;
  private Date DATE_UPDATED_UTC = null;

  
  /**
   * Unique ID for the Milestone record.
   **/
  public APIMilestone MILESTONE_ID(Long MILESTONE_ID) {
    this.MILESTONE_ID = MILESTONE_ID;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Unique ID for the Milestone record.")
  @JsonProperty("MILESTONE_ID")
  public Long getMILESTONEID() {
    return MILESTONE_ID;
  }
  public void setMILESTONEID(Long MILESTONE_ID) {
    this.MILESTONE_ID = MILESTONE_ID;
  }

  
  /**
   * Unique ID for the Project record the milestone is assigned to.
   **/
  public APIMilestone PROJECT_ID(Long PROJECT_ID) {
    this.PROJECT_ID = PROJECT_ID;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Unique ID for the Project record the milestone is assigned to.")
  @JsonProperty("PROJECT_ID")
  public Long getPROJECTID() {
    return PROJECT_ID;
  }
  public void setPROJECTID(Long PROJECT_ID) {
    this.PROJECT_ID = PROJECT_ID;
  }

  
  /**
   * Title of the milestone.
   **/
  public APIMilestone TITLE(String TITLE) {
    this.TITLE = TITLE;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Title of the milestone.")
  @JsonProperty("TITLE")
  public String getTITLE() {
    return TITLE;
  }
  public void setTITLE(String TITLE) {
    this.TITLE = TITLE;
  }

  
  /**
   * Date when milestone is due.
   **/
  public APIMilestone DUE_DATE(Date DUE_DATE) {
    this.DUE_DATE = DUE_DATE;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Date when milestone is due.")
  @JsonProperty("DUE_DATE")
  public Date getDUEDATE() {
    return DUE_DATE;
  }
  public void setDUEDATE(Date DUE_DATE) {
    this.DUE_DATE = DUE_DATE;
  }

  
  /**
   * True if milestone is completed.
   **/
  public APIMilestone COMPLETED(Boolean COMPLETED) {
    this.COMPLETED = COMPLETED;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "True if milestone is completed.")
  @JsonProperty("COMPLETED")
  public Boolean getCOMPLETED() {
    return COMPLETED;
  }
  public void setCOMPLETED(Boolean COMPLETED) {
    this.COMPLETED = COMPLETED;
  }

  
  /**
   * Date and time when the milestone was completed (Coordinated Universal Time).
   **/
  public APIMilestone COMPLETED_DATE_UTC(Date COMPLETED_DATE_UTC) {
    this.COMPLETED_DATE_UTC = COMPLETED_DATE_UTC;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Date and time when the milestone was completed (Coordinated Universal Time).")
  @JsonProperty("COMPLETED_DATE_UTC")
  public Date getCOMPLETEDDATEUTC() {
    return COMPLETED_DATE_UTC;
  }
  public void setCOMPLETEDDATEUTC(Date COMPLETED_DATE_UTC) {
    this.COMPLETED_DATE_UTC = COMPLETED_DATE_UTC;
  }

  
  /**
   * ID of the user that is responsible for the milestone.
   **/
  public APIMilestone RESPONSIBLE_USER_ID(Integer RESPONSIBLE_USER_ID) {
    this.RESPONSIBLE_USER_ID = RESPONSIBLE_USER_ID;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "ID of the user that is responsible for the milestone.")
  @JsonProperty("RESPONSIBLE_USER_ID")
  public Integer getRESPONSIBLEUSERID() {
    return RESPONSIBLE_USER_ID;
  }
  public void setRESPONSIBLEUSERID(Integer RESPONSIBLE_USER_ID) {
    this.RESPONSIBLE_USER_ID = RESPONSIBLE_USER_ID;
  }

  
  /**
   * Date and time the Milestone record was created, as Coordinated Universal Time
   **/
  public APIMilestone DATE_CREATED_UTC(Date DATE_CREATED_UTC) {
    this.DATE_CREATED_UTC = DATE_CREATED_UTC;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Date and time the Milestone record was created, as Coordinated Universal Time")
  @JsonProperty("DATE_CREATED_UTC")
  public Date getDATECREATEDUTC() {
    return DATE_CREATED_UTC;
  }
  public void setDATECREATEDUTC(Date DATE_CREATED_UTC) {
    this.DATE_CREATED_UTC = DATE_CREATED_UTC;
  }

  
  /**
   * Date and time the Milestone record was updated, as Coordinated Universal Time
   **/
  public APIMilestone DATE_UPDATED_UTC(Date DATE_UPDATED_UTC) {
    this.DATE_UPDATED_UTC = DATE_UPDATED_UTC;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Date and time the Milestone record was updated, as Coordinated Universal Time")
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
    APIMilestone aPIMilestone = (APIMilestone) o;
    return Objects.equals(this.MILESTONE_ID, aPIMilestone.MILESTONE_ID) &&
        Objects.equals(this.PROJECT_ID, aPIMilestone.PROJECT_ID) &&
        Objects.equals(this.TITLE, aPIMilestone.TITLE) &&
        Objects.equals(this.DUE_DATE, aPIMilestone.DUE_DATE) &&
        Objects.equals(this.COMPLETED, aPIMilestone.COMPLETED) &&
        Objects.equals(this.COMPLETED_DATE_UTC, aPIMilestone.COMPLETED_DATE_UTC) &&
        Objects.equals(this.RESPONSIBLE_USER_ID, aPIMilestone.RESPONSIBLE_USER_ID) &&
        Objects.equals(this.DATE_CREATED_UTC, aPIMilestone.DATE_CREATED_UTC) &&
        Objects.equals(this.DATE_UPDATED_UTC, aPIMilestone.DATE_UPDATED_UTC);
  }

  @Override
  public int hashCode() {
    return Objects.hash(MILESTONE_ID, PROJECT_ID, TITLE, DUE_DATE, COMPLETED, COMPLETED_DATE_UTC, RESPONSIBLE_USER_ID, DATE_CREATED_UTC, DATE_UPDATED_UTC);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class APIMilestone {\n");
    
    sb.append("    MILESTONE_ID: ").append(toIndentedString(MILESTONE_ID)).append("\n");
    sb.append("    PROJECT_ID: ").append(toIndentedString(PROJECT_ID)).append("\n");
    sb.append("    TITLE: ").append(toIndentedString(TITLE)).append("\n");
    sb.append("    DUE_DATE: ").append(toIndentedString(DUE_DATE)).append("\n");
    sb.append("    COMPLETED: ").append(toIndentedString(COMPLETED)).append("\n");
    sb.append("    COMPLETED_DATE_UTC: ").append(toIndentedString(COMPLETED_DATE_UTC)).append("\n");
    sb.append("    RESPONSIBLE_USER_ID: ").append(toIndentedString(RESPONSIBLE_USER_ID)).append("\n");
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

