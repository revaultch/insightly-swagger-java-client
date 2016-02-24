package io.swagger.client.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.client.model.APITaskLink;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;



/**
 * APITask
 **/

@ApiModel(description = "APITask")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-02-24T20:33:55.547+01:00")
public class APITask   {
  
  private Long TASK_ID = null;
  private String TITLE = null;
  private Long CATEGORY_ID = null;
  private Date DUE_DATE = null;
  private Date COMPLETED_DATE_UTC = null;
  private Boolean PUBLICLY_VISIBLE = null;
  private Boolean COMPLETED = null;
  private Long PROJECT_ID = null;
  private Long OPPORTUNITY_ID = null;
  private Long MILESTONE_ID = null;
  private Long PIPELINE_ID = null;
  private Long STAGE_ID = null;
  private String DETAILS = null;
  private String STATUS = null;
  private Integer PRIORITY = null;
  private Integer PERCENT_COMPLETE = null;
  private Date START_DATE = null;
  private Integer ASSIGNED_BY_USER_ID = null;
  private Long PARENT_TASK_ID = null;
  private Boolean OWNER_VISIBLE = null;
  private Integer RESPONSIBLE_USER_ID = null;
  private Long ASSIGNED_TEAM_ID = null;
  private Date ASSIGNED_DATE_UTC = null;
  private Integer OWNER_USER_ID = null;
  private Date DATE_CREATED_UTC = null;
  private Date DATE_UPDATED_UTC = null;
  private Date REMINDER_DATE_UTC = null;
  private Boolean REMINDER_SENT = null;
  private List<APITaskLink> TASKLINKS = new ArrayList<APITaskLink>();

  
  /**
   * Unique key of the Task record
   **/
  public APITask TASK_ID(Long TASK_ID) {
    this.TASK_ID = TASK_ID;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Unique key of the Task record")
  @JsonProperty("TASK_ID")
  public Long getTASKID() {
    return TASK_ID;
  }
  public void setTASKID(Long TASK_ID) {
    this.TASK_ID = TASK_ID;
  }

  
  /**
   * Title of the Task (required)
   **/
  public APITask TITLE(String TITLE) {
    this.TITLE = TITLE;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Title of the Task (required)")
  @JsonProperty("TITLE")
  public String getTITLE() {
    return TITLE;
  }
  public void setTITLE(String TITLE) {
    this.TITLE = TITLE;
  }

  
  /**
   * The Category ID of the Task, if it has been assigned to one
   **/
  public APITask CATEGORY_ID(Long CATEGORY_ID) {
    this.CATEGORY_ID = CATEGORY_ID;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The Category ID of the Task, if it has been assigned to one")
  @JsonProperty("CATEGORY_ID")
  public Long getCATEGORYID() {
    return CATEGORY_ID;
  }
  public void setCATEGORYID(Long CATEGORY_ID) {
    this.CATEGORY_ID = CATEGORY_ID;
  }

  
  /**
   * Due date of the Task, in YYYY-MM-DD format
   **/
  public APITask DUE_DATE(Date DUE_DATE) {
    this.DUE_DATE = DUE_DATE;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Due date of the Task, in YYYY-MM-DD format")
  @JsonProperty("DUE_DATE")
  public Date getDUEDATE() {
    return DUE_DATE;
  }
  public void setDUEDATE(Date DUE_DATE) {
    this.DUE_DATE = DUE_DATE;
  }

  
  /**
   * Completed Date of the Task, in YYYY-MM-DD format
   **/
  public APITask COMPLETED_DATE_UTC(Date COMPLETED_DATE_UTC) {
    this.COMPLETED_DATE_UTC = COMPLETED_DATE_UTC;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Completed Date of the Task, in YYYY-MM-DD format")
  @JsonProperty("COMPLETED_DATE_UTC")
  public Date getCOMPLETEDDATEUTC() {
    return COMPLETED_DATE_UTC;
  }
  public void setCOMPLETEDDATEUTC(Date COMPLETED_DATE_UTC) {
    this.COMPLETED_DATE_UTC = COMPLETED_DATE_UTC;
  }

  
  /**
   * True, if Task is visible to others
   **/
  public APITask PUBLICLY_VISIBLE(Boolean PUBLICLY_VISIBLE) {
    this.PUBLICLY_VISIBLE = PUBLICLY_VISIBLE;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "True, if Task is visible to others")
  @JsonProperty("PUBLICLY_VISIBLE")
  public Boolean getPUBLICLYVISIBLE() {
    return PUBLICLY_VISIBLE;
  }
  public void setPUBLICLYVISIBLE(Boolean PUBLICLY_VISIBLE) {
    this.PUBLICLY_VISIBLE = PUBLICLY_VISIBLE;
  }

  
  /**
   * True, if Task has been completed
   **/
  public APITask COMPLETED(Boolean COMPLETED) {
    this.COMPLETED = COMPLETED;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "True, if Task has been completed")
  @JsonProperty("COMPLETED")
  public Boolean getCOMPLETED() {
    return COMPLETED;
  }
  public void setCOMPLETED(Boolean COMPLETED) {
    this.COMPLETED = COMPLETED;
  }

  
  /**
   * ID of the project the task is related to, if applicable. Should be a valid PROJECT_ID, if set.
   **/
  public APITask PROJECT_ID(Long PROJECT_ID) {
    this.PROJECT_ID = PROJECT_ID;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "ID of the project the task is related to, if applicable. Should be a valid PROJECT_ID, if set.")
  @JsonProperty("PROJECT_ID")
  public Long getPROJECTID() {
    return PROJECT_ID;
  }
  public void setPROJECTID(Long PROJECT_ID) {
    this.PROJECT_ID = PROJECT_ID;
  }

  
  /**
   * ID of the opportunity the task is related to. Can only be set if PROJECT_ID is null.
   **/
  public APITask OPPORTUNITY_ID(Long OPPORTUNITY_ID) {
    this.OPPORTUNITY_ID = OPPORTUNITY_ID;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "ID of the opportunity the task is related to. Can only be set if PROJECT_ID is null.")
  @JsonProperty("OPPORTUNITY_ID")
  public Long getOPPORTUNITYID() {
    return OPPORTUNITY_ID;
  }
  public void setOPPORTUNITYID(Long OPPORTUNITY_ID) {
    this.OPPORTUNITY_ID = OPPORTUNITY_ID;
  }

  
  /**
   * ID of the project milestone the task is related to. Can only be set to a milestone of a project defined by PROJECT_ID.
   **/
  public APITask MILESTONE_ID(Long MILESTONE_ID) {
    this.MILESTONE_ID = MILESTONE_ID;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "ID of the project milestone the task is related to. Can only be set to a milestone of a project defined by PROJECT_ID.")
  @JsonProperty("MILESTONE_ID")
  public Long getMILESTONEID() {
    return MILESTONE_ID;
  }
  public void setMILESTONEID(Long MILESTONE_ID) {
    this.MILESTONE_ID = MILESTONE_ID;
  }

  
  /**
   * ID of the pipeline the task is related to. Can only be set to a pipeline associated with the related project or opportunity.
   **/
  public APITask PIPELINE_ID(Long PIPELINE_ID) {
    this.PIPELINE_ID = PIPELINE_ID;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "ID of the pipeline the task is related to. Can only be set to a pipeline associated with the related project or opportunity.")
  @JsonProperty("PIPELINE_ID")
  public Long getPIPELINEID() {
    return PIPELINE_ID;
  }
  public void setPIPELINEID(Long PIPELINE_ID) {
    this.PIPELINE_ID = PIPELINE_ID;
  }

  
  /**
   * ID of the pipeline stage the task is related to. Can only be set to an existing stage of a pipeline associated with related project or opportunity.
   **/
  public APITask STAGE_ID(Long STAGE_ID) {
    this.STAGE_ID = STAGE_ID;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "ID of the pipeline stage the task is related to. Can only be set to an existing stage of a pipeline associated with related project or opportunity.")
  @JsonProperty("STAGE_ID")
  public Long getSTAGEID() {
    return STAGE_ID;
  }
  public void setSTAGEID(Long STAGE_ID) {
    this.STAGE_ID = STAGE_ID;
  }

  
  /**
   * Details of the Task
   **/
  public APITask DETAILS(String DETAILS) {
    this.DETAILS = DETAILS;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Details of the Task")
  @JsonProperty("DETAILS")
  public String getDETAILS() {
    return DETAILS;
  }
  public void setDETAILS(String DETAILS) {
    this.DETAILS = DETAILS;
  }

  
  /**
   * Status: Completed, Deferred, In Progress, Not Started, or Waiting
   **/
  public APITask STATUS(String STATUS) {
    this.STATUS = STATUS;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Status: Completed, Deferred, In Progress, Not Started, or Waiting")
  @JsonProperty("STATUS")
  public String getSTATUS() {
    return STATUS;
  }
  public void setSTATUS(String STATUS) {
    this.STATUS = STATUS;
  }

  
  /**
   * Priority: 1 (Low), 2 (Normal) or 3 (High)
   **/
  public APITask PRIORITY(Integer PRIORITY) {
    this.PRIORITY = PRIORITY;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Priority: 1 (Low), 2 (Normal) or 3 (High)")
  @JsonProperty("PRIORITY")
  public Integer getPRIORITY() {
    return PRIORITY;
  }
  public void setPRIORITY(Integer PRIORITY) {
    this.PRIORITY = PRIORITY;
  }

  
  /**
   * Percentage completion of the Task, integer value from 0 to 100
   **/
  public APITask PERCENT_COMPLETE(Integer PERCENT_COMPLETE) {
    this.PERCENT_COMPLETE = PERCENT_COMPLETE;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Percentage completion of the Task, integer value from 0 to 100")
  @JsonProperty("PERCENT_COMPLETE")
  public Integer getPERCENTCOMPLETE() {
    return PERCENT_COMPLETE;
  }
  public void setPERCENTCOMPLETE(Integer PERCENT_COMPLETE) {
    this.PERCENT_COMPLETE = PERCENT_COMPLETE;
  }

  
  /**
   * Start Date of the Task, in YYYY-MM-DD format
   **/
  public APITask START_DATE(Date START_DATE) {
    this.START_DATE = START_DATE;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Start Date of the Task, in YYYY-MM-DD format")
  @JsonProperty("START_DATE")
  public Date getSTARTDATE() {
    return START_DATE;
  }
  public void setSTARTDATE(Date START_DATE) {
    this.START_DATE = START_DATE;
  }

  
  /**
   * User ID of the User who assigned the Task to another User
   **/
  public APITask ASSIGNED_BY_USER_ID(Integer ASSIGNED_BY_USER_ID) {
    this.ASSIGNED_BY_USER_ID = ASSIGNED_BY_USER_ID;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "User ID of the User who assigned the Task to another User")
  @JsonProperty("ASSIGNED_BY_USER_ID")
  public Integer getASSIGNEDBYUSERID() {
    return ASSIGNED_BY_USER_ID;
  }
  public void setASSIGNEDBYUSERID(Integer ASSIGNED_BY_USER_ID) {
    this.ASSIGNED_BY_USER_ID = ASSIGNED_BY_USER_ID;
  }

  
  /**
   * Parent Task ID
   **/
  public APITask PARENT_TASK_ID(Long PARENT_TASK_ID) {
    this.PARENT_TASK_ID = PARENT_TASK_ID;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Parent Task ID")
  @JsonProperty("PARENT_TASK_ID")
  public Long getPARENTTASKID() {
    return PARENT_TASK_ID;
  }
  public void setPARENTTASKID(Long PARENT_TASK_ID) {
    this.PARENT_TASK_ID = PARENT_TASK_ID;
  }

  
  /**
   * Used to determine if owner of assigned task wants to be kept notified of the Task
   **/
  public APITask OWNER_VISIBLE(Boolean OWNER_VISIBLE) {
    this.OWNER_VISIBLE = OWNER_VISIBLE;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Used to determine if owner of assigned task wants to be kept notified of the Task")
  @JsonProperty("OWNER_VISIBLE")
  public Boolean getOWNERVISIBLE() {
    return OWNER_VISIBLE;
  }
  public void setOWNERVISIBLE(Boolean OWNER_VISIBLE) {
    this.OWNER_VISIBLE = OWNER_VISIBLE;
  }

  
  /**
   * Responsible User ID
   **/
  public APITask RESPONSIBLE_USER_ID(Integer RESPONSIBLE_USER_ID) {
    this.RESPONSIBLE_USER_ID = RESPONSIBLE_USER_ID;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Responsible User ID")
  @JsonProperty("RESPONSIBLE_USER_ID")
  public Integer getRESPONSIBLEUSERID() {
    return RESPONSIBLE_USER_ID;
  }
  public void setRESPONSIBLEUSERID(Integer RESPONSIBLE_USER_ID) {
    this.RESPONSIBLE_USER_ID = RESPONSIBLE_USER_ID;
  }

  
  /**
   * ID of the Team which is responsible for the Task
   **/
  public APITask ASSIGNED_TEAM_ID(Long ASSIGNED_TEAM_ID) {
    this.ASSIGNED_TEAM_ID = ASSIGNED_TEAM_ID;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "ID of the Team which is responsible for the Task")
  @JsonProperty("ASSIGNED_TEAM_ID")
  public Long getASSIGNEDTEAMID() {
    return ASSIGNED_TEAM_ID;
  }
  public void setASSIGNEDTEAMID(Long ASSIGNED_TEAM_ID) {
    this.ASSIGNED_TEAM_ID = ASSIGNED_TEAM_ID;
  }

  
  /**
   * Date when the Task was assigned
   **/
  public APITask ASSIGNED_DATE_UTC(Date ASSIGNED_DATE_UTC) {
    this.ASSIGNED_DATE_UTC = ASSIGNED_DATE_UTC;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Date when the Task was assigned")
  @JsonProperty("ASSIGNED_DATE_UTC")
  public Date getASSIGNEDDATEUTC() {
    return ASSIGNED_DATE_UTC;
  }
  public void setASSIGNEDDATEUTC(Date ASSIGNED_DATE_UTC) {
    this.ASSIGNED_DATE_UTC = ASSIGNED_DATE_UTC;
  }

  
  /**
   * User ID of the Task record owner
   **/
  public APITask OWNER_USER_ID(Integer OWNER_USER_ID) {
    this.OWNER_USER_ID = OWNER_USER_ID;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "User ID of the Task record owner")
  @JsonProperty("OWNER_USER_ID")
  public Integer getOWNERUSERID() {
    return OWNER_USER_ID;
  }
  public void setOWNERUSERID(Integer OWNER_USER_ID) {
    this.OWNER_USER_ID = OWNER_USER_ID;
  }

  
  /**
   * Date and time Task record created, as Coordinated Universal Time
   **/
  public APITask DATE_CREATED_UTC(Date DATE_CREATED_UTC) {
    this.DATE_CREATED_UTC = DATE_CREATED_UTC;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Date and time Task record created, as Coordinated Universal Time")
  @JsonProperty("DATE_CREATED_UTC")
  public Date getDATECREATEDUTC() {
    return DATE_CREATED_UTC;
  }
  public void setDATECREATEDUTC(Date DATE_CREATED_UTC) {
    this.DATE_CREATED_UTC = DATE_CREATED_UTC;
  }

  
  /**
   * Date and time Task record updated, as Coordinated Universal Time
   **/
  public APITask DATE_UPDATED_UTC(Date DATE_UPDATED_UTC) {
    this.DATE_UPDATED_UTC = DATE_UPDATED_UTC;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Date and time Task record updated, as Coordinated Universal Time")
  @JsonProperty("DATE_UPDATED_UTC")
  public Date getDATEUPDATEDUTC() {
    return DATE_UPDATED_UTC;
  }
  public void setDATEUPDATEDUTC(Date DATE_UPDATED_UTC) {
    this.DATE_UPDATED_UTC = DATE_UPDATED_UTC;
  }

  
  /**
   * Reminder date and time of the Task, as Coordinated Universal Time
   **/
  public APITask REMINDER_DATE_UTC(Date REMINDER_DATE_UTC) {
    this.REMINDER_DATE_UTC = REMINDER_DATE_UTC;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Reminder date and time of the Task, as Coordinated Universal Time")
  @JsonProperty("REMINDER_DATE_UTC")
  public Date getREMINDERDATEUTC() {
    return REMINDER_DATE_UTC;
  }
  public void setREMINDERDATEUTC(Date REMINDER_DATE_UTC) {
    this.REMINDER_DATE_UTC = REMINDER_DATE_UTC;
  }

  
  /**
   * True, if a reminder was sent
   **/
  public APITask REMINDER_SENT(Boolean REMINDER_SENT) {
    this.REMINDER_SENT = REMINDER_SENT;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "True, if a reminder was sent")
  @JsonProperty("REMINDER_SENT")
  public Boolean getREMINDERSENT() {
    return REMINDER_SENT;
  }
  public void setREMINDERSENT(Boolean REMINDER_SENT) {
    this.REMINDER_SENT = REMINDER_SENT;
  }

  
  /**
   * Set of Links attached to the Task
   **/
  public APITask TASKLINKS(List<APITaskLink> TASKLINKS) {
    this.TASKLINKS = TASKLINKS;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Set of Links attached to the Task")
  @JsonProperty("TASKLINKS")
  public List<APITaskLink> getTASKLINKS() {
    return TASKLINKS;
  }
  public void setTASKLINKS(List<APITaskLink> TASKLINKS) {
    this.TASKLINKS = TASKLINKS;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    APITask aPITask = (APITask) o;
    return Objects.equals(this.TASK_ID, aPITask.TASK_ID) &&
        Objects.equals(this.TITLE, aPITask.TITLE) &&
        Objects.equals(this.CATEGORY_ID, aPITask.CATEGORY_ID) &&
        Objects.equals(this.DUE_DATE, aPITask.DUE_DATE) &&
        Objects.equals(this.COMPLETED_DATE_UTC, aPITask.COMPLETED_DATE_UTC) &&
        Objects.equals(this.PUBLICLY_VISIBLE, aPITask.PUBLICLY_VISIBLE) &&
        Objects.equals(this.COMPLETED, aPITask.COMPLETED) &&
        Objects.equals(this.PROJECT_ID, aPITask.PROJECT_ID) &&
        Objects.equals(this.OPPORTUNITY_ID, aPITask.OPPORTUNITY_ID) &&
        Objects.equals(this.MILESTONE_ID, aPITask.MILESTONE_ID) &&
        Objects.equals(this.PIPELINE_ID, aPITask.PIPELINE_ID) &&
        Objects.equals(this.STAGE_ID, aPITask.STAGE_ID) &&
        Objects.equals(this.DETAILS, aPITask.DETAILS) &&
        Objects.equals(this.STATUS, aPITask.STATUS) &&
        Objects.equals(this.PRIORITY, aPITask.PRIORITY) &&
        Objects.equals(this.PERCENT_COMPLETE, aPITask.PERCENT_COMPLETE) &&
        Objects.equals(this.START_DATE, aPITask.START_DATE) &&
        Objects.equals(this.ASSIGNED_BY_USER_ID, aPITask.ASSIGNED_BY_USER_ID) &&
        Objects.equals(this.PARENT_TASK_ID, aPITask.PARENT_TASK_ID) &&
        Objects.equals(this.OWNER_VISIBLE, aPITask.OWNER_VISIBLE) &&
        Objects.equals(this.RESPONSIBLE_USER_ID, aPITask.RESPONSIBLE_USER_ID) &&
        Objects.equals(this.ASSIGNED_TEAM_ID, aPITask.ASSIGNED_TEAM_ID) &&
        Objects.equals(this.ASSIGNED_DATE_UTC, aPITask.ASSIGNED_DATE_UTC) &&
        Objects.equals(this.OWNER_USER_ID, aPITask.OWNER_USER_ID) &&
        Objects.equals(this.DATE_CREATED_UTC, aPITask.DATE_CREATED_UTC) &&
        Objects.equals(this.DATE_UPDATED_UTC, aPITask.DATE_UPDATED_UTC) &&
        Objects.equals(this.REMINDER_DATE_UTC, aPITask.REMINDER_DATE_UTC) &&
        Objects.equals(this.REMINDER_SENT, aPITask.REMINDER_SENT) &&
        Objects.equals(this.TASKLINKS, aPITask.TASKLINKS);
  }

  @Override
  public int hashCode() {
    return Objects.hash(TASK_ID, TITLE, CATEGORY_ID, DUE_DATE, COMPLETED_DATE_UTC, PUBLICLY_VISIBLE, COMPLETED, PROJECT_ID, OPPORTUNITY_ID, MILESTONE_ID, PIPELINE_ID, STAGE_ID, DETAILS, STATUS, PRIORITY, PERCENT_COMPLETE, START_DATE, ASSIGNED_BY_USER_ID, PARENT_TASK_ID, OWNER_VISIBLE, RESPONSIBLE_USER_ID, ASSIGNED_TEAM_ID, ASSIGNED_DATE_UTC, OWNER_USER_ID, DATE_CREATED_UTC, DATE_UPDATED_UTC, REMINDER_DATE_UTC, REMINDER_SENT, TASKLINKS);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class APITask {\n");
    
    sb.append("    TASK_ID: ").append(toIndentedString(TASK_ID)).append("\n");
    sb.append("    TITLE: ").append(toIndentedString(TITLE)).append("\n");
    sb.append("    CATEGORY_ID: ").append(toIndentedString(CATEGORY_ID)).append("\n");
    sb.append("    DUE_DATE: ").append(toIndentedString(DUE_DATE)).append("\n");
    sb.append("    COMPLETED_DATE_UTC: ").append(toIndentedString(COMPLETED_DATE_UTC)).append("\n");
    sb.append("    PUBLICLY_VISIBLE: ").append(toIndentedString(PUBLICLY_VISIBLE)).append("\n");
    sb.append("    COMPLETED: ").append(toIndentedString(COMPLETED)).append("\n");
    sb.append("    PROJECT_ID: ").append(toIndentedString(PROJECT_ID)).append("\n");
    sb.append("    OPPORTUNITY_ID: ").append(toIndentedString(OPPORTUNITY_ID)).append("\n");
    sb.append("    MILESTONE_ID: ").append(toIndentedString(MILESTONE_ID)).append("\n");
    sb.append("    PIPELINE_ID: ").append(toIndentedString(PIPELINE_ID)).append("\n");
    sb.append("    STAGE_ID: ").append(toIndentedString(STAGE_ID)).append("\n");
    sb.append("    DETAILS: ").append(toIndentedString(DETAILS)).append("\n");
    sb.append("    STATUS: ").append(toIndentedString(STATUS)).append("\n");
    sb.append("    PRIORITY: ").append(toIndentedString(PRIORITY)).append("\n");
    sb.append("    PERCENT_COMPLETE: ").append(toIndentedString(PERCENT_COMPLETE)).append("\n");
    sb.append("    START_DATE: ").append(toIndentedString(START_DATE)).append("\n");
    sb.append("    ASSIGNED_BY_USER_ID: ").append(toIndentedString(ASSIGNED_BY_USER_ID)).append("\n");
    sb.append("    PARENT_TASK_ID: ").append(toIndentedString(PARENT_TASK_ID)).append("\n");
    sb.append("    OWNER_VISIBLE: ").append(toIndentedString(OWNER_VISIBLE)).append("\n");
    sb.append("    RESPONSIBLE_USER_ID: ").append(toIndentedString(RESPONSIBLE_USER_ID)).append("\n");
    sb.append("    ASSIGNED_TEAM_ID: ").append(toIndentedString(ASSIGNED_TEAM_ID)).append("\n");
    sb.append("    ASSIGNED_DATE_UTC: ").append(toIndentedString(ASSIGNED_DATE_UTC)).append("\n");
    sb.append("    OWNER_USER_ID: ").append(toIndentedString(OWNER_USER_ID)).append("\n");
    sb.append("    DATE_CREATED_UTC: ").append(toIndentedString(DATE_CREATED_UTC)).append("\n");
    sb.append("    DATE_UPDATED_UTC: ").append(toIndentedString(DATE_UPDATED_UTC)).append("\n");
    sb.append("    REMINDER_DATE_UTC: ").append(toIndentedString(REMINDER_DATE_UTC)).append("\n");
    sb.append("    REMINDER_SENT: ").append(toIndentedString(REMINDER_SENT)).append("\n");
    sb.append("    TASKLINKS: ").append(toIndentedString(TASKLINKS)).append("\n");
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

