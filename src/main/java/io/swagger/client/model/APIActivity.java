package io.swagger.client.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;



/**
 * APIActivity
 **/

@ApiModel(description = "APIActivity")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-02-24T20:33:55.547+01:00")
public class APIActivity   {
  
  private Long ACTIVITY_ID = null;
  private Long ACTIVITYSET_ID = null;
  private String ACTIVITY_NAME = null;
  private String ACTIVITY_DETAILS = null;
  private String ACTIVITY_TYPE = null;
  private Long CATEGORY_ID = null;
  private Boolean REMINDER = null;
  private Integer REMINDER_DAYS_BEFORE_DUE = null;
  private String REMINDER_TIME = null;
  private Boolean PUBLICLY_VISIBLE = null;
  private Boolean OWNER_VISIBLE = null;
  private Integer OWNER_USER_ID = null;
  private Integer RESPONSIBLE_USER_ID = null;
  private Long ASSIGNED_TEAM_ID = null;
  private Boolean SKIP_SUN = null;
  private Boolean SKIP_MON = null;
  private Boolean SKIP_TUE = null;
  private Boolean SKIP_WED = null;
  private Boolean SKIP_THU = null;
  private Boolean SKIP_FRI = null;
  private Boolean SKIP_SAT = null;
  private Integer DUE_DAYS_AFTER_START = null;
  private Integer DUE_DAYS_BEFORE_END = null;
  private Integer EVENT_DAYS_AFTER_START = null;
  private Integer EVENT_DAYS_BEFORE_END = null;
  private String EVENT_TIME = null;
  private Boolean ALL_DAY = null;
  private Integer DURATION = null;

  
  /**
   * Unique ID for the Activity
   **/
  public APIActivity ACTIVITY_ID(Long ACTIVITY_ID) {
    this.ACTIVITY_ID = ACTIVITY_ID;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Unique ID for the Activity")
  @JsonProperty("ACTIVITY_ID")
  public Long getACTIVITYID() {
    return ACTIVITY_ID;
  }
  public void setACTIVITYID(Long ACTIVITY_ID) {
    this.ACTIVITY_ID = ACTIVITY_ID;
  }

  
  /**
   * Unique ID for the Activity Set record that this Activity belongs to
   **/
  public APIActivity ACTIVITYSET_ID(Long ACTIVITYSET_ID) {
    this.ACTIVITYSET_ID = ACTIVITYSET_ID;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Unique ID for the Activity Set record that this Activity belongs to")
  @JsonProperty("ACTIVITYSET_ID")
  public Long getACTIVITYSETID() {
    return ACTIVITYSET_ID;
  }
  public void setACTIVITYSETID(Long ACTIVITYSET_ID) {
    this.ACTIVITYSET_ID = ACTIVITYSET_ID;
  }

  
  /**
   * The name for the Activity
   **/
  public APIActivity ACTIVITY_NAME(String ACTIVITY_NAME) {
    this.ACTIVITY_NAME = ACTIVITY_NAME;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The name for the Activity")
  @JsonProperty("ACTIVITY_NAME")
  public String getACTIVITYNAME() {
    return ACTIVITY_NAME;
  }
  public void setACTIVITYNAME(String ACTIVITY_NAME) {
    this.ACTIVITY_NAME = ACTIVITY_NAME;
  }

  
  /**
   * The details for the Activity
   **/
  public APIActivity ACTIVITY_DETAILS(String ACTIVITY_DETAILS) {
    this.ACTIVITY_DETAILS = ACTIVITY_DETAILS;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The details for the Activity")
  @JsonProperty("ACTIVITY_DETAILS")
  public String getACTIVITYDETAILS() {
    return ACTIVITY_DETAILS;
  }
  public void setACTIVITYDETAILS(String ACTIVITY_DETAILS) {
    this.ACTIVITY_DETAILS = ACTIVITY_DETAILS;
  }

  
  /**
   * The type of Activity
   **/
  public APIActivity ACTIVITY_TYPE(String ACTIVITY_TYPE) {
    this.ACTIVITY_TYPE = ACTIVITY_TYPE;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The type of Activity")
  @JsonProperty("ACTIVITY_TYPE")
  public String getACTIVITYTYPE() {
    return ACTIVITY_TYPE;
  }
  public void setACTIVITYTYPE(String ACTIVITY_TYPE) {
    this.ACTIVITY_TYPE = ACTIVITY_TYPE;
  }

  
  /**
   * The unique ID for the category associated with the Activity. Only applicable if the ACTIVITY_TYPE is set to TASK.
   **/
  public APIActivity CATEGORY_ID(Long CATEGORY_ID) {
    this.CATEGORY_ID = CATEGORY_ID;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The unique ID for the category associated with the Activity. Only applicable if the ACTIVITY_TYPE is set to TASK.")
  @JsonProperty("CATEGORY_ID")
  public Long getCATEGORYID() {
    return CATEGORY_ID;
  }
  public void setCATEGORYID(Long CATEGORY_ID) {
    this.CATEGORY_ID = CATEGORY_ID;
  }

  
  /**
   * Whether or not a reminder is set on the Activity. Only applicable if the ACTIVITY_TYPE is set to TASK.
   **/
  public APIActivity REMINDER(Boolean REMINDER) {
    this.REMINDER = REMINDER;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Whether or not a reminder is set on the Activity. Only applicable if the ACTIVITY_TYPE is set to TASK.")
  @JsonProperty("REMINDER")
  public Boolean getREMINDER() {
    return REMINDER;
  }
  public void setREMINDER(Boolean REMINDER) {
    this.REMINDER = REMINDER;
  }

  
  /**
   * Number of days before due date of the Activity a reminder will be sent out. Only applicable if the ACTIVITY_TYPE is set to TASK.
   **/
  public APIActivity REMINDER_DAYS_BEFORE_DUE(Integer REMINDER_DAYS_BEFORE_DUE) {
    this.REMINDER_DAYS_BEFORE_DUE = REMINDER_DAYS_BEFORE_DUE;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Number of days before due date of the Activity a reminder will be sent out. Only applicable if the ACTIVITY_TYPE is set to TASK.")
  @JsonProperty("REMINDER_DAYS_BEFORE_DUE")
  public Integer getREMINDERDAYSBEFOREDUE() {
    return REMINDER_DAYS_BEFORE_DUE;
  }
  public void setREMINDERDAYSBEFOREDUE(Integer REMINDER_DAYS_BEFORE_DUE) {
    this.REMINDER_DAYS_BEFORE_DUE = REMINDER_DAYS_BEFORE_DUE;
  }

  
  /**
   * The time when a reminder will be sent out for the Activity. Only applicable if the ACTIVITY_TYPE is set to TASK.
   **/
  public APIActivity REMINDER_TIME(String REMINDER_TIME) {
    this.REMINDER_TIME = REMINDER_TIME;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The time when a reminder will be sent out for the Activity. Only applicable if the ACTIVITY_TYPE is set to TASK.")
  @JsonProperty("REMINDER_TIME")
  public String getREMINDERTIME() {
    return REMINDER_TIME;
  }
  public void setREMINDERTIME(String REMINDER_TIME) {
    this.REMINDER_TIME = REMINDER_TIME;
  }

  
  /**
   * Whether the Activity is publicly visible.
   **/
  public APIActivity PUBLICLY_VISIBLE(Boolean PUBLICLY_VISIBLE) {
    this.PUBLICLY_VISIBLE = PUBLICLY_VISIBLE;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Whether the Activity is publicly visible.")
  @JsonProperty("PUBLICLY_VISIBLE")
  public Boolean getPUBLICLYVISIBLE() {
    return PUBLICLY_VISIBLE;
  }
  public void setPUBLICLYVISIBLE(Boolean PUBLICLY_VISIBLE) {
    this.PUBLICLY_VISIBLE = PUBLICLY_VISIBLE;
  }

  
  /**
   * Whether the Activity is visible to the Owner.
   **/
  public APIActivity OWNER_VISIBLE(Boolean OWNER_VISIBLE) {
    this.OWNER_VISIBLE = OWNER_VISIBLE;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Whether the Activity is visible to the Owner.")
  @JsonProperty("OWNER_VISIBLE")
  public Boolean getOWNERVISIBLE() {
    return OWNER_VISIBLE;
  }
  public void setOWNERVISIBLE(Boolean OWNER_VISIBLE) {
    this.OWNER_VISIBLE = OWNER_VISIBLE;
  }

  
  /**
   * The unique ID for the Owner of the Activity.
   **/
  public APIActivity OWNER_USER_ID(Integer OWNER_USER_ID) {
    this.OWNER_USER_ID = OWNER_USER_ID;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The unique ID for the Owner of the Activity.")
  @JsonProperty("OWNER_USER_ID")
  public Integer getOWNERUSERID() {
    return OWNER_USER_ID;
  }
  public void setOWNERUSERID(Integer OWNER_USER_ID) {
    this.OWNER_USER_ID = OWNER_USER_ID;
  }

  
  /**
   * The unique ID for the Responsible User of the Activity. Only applicable if the ACTIVITY_TYPE is set to TASK.
   **/
  public APIActivity RESPONSIBLE_USER_ID(Integer RESPONSIBLE_USER_ID) {
    this.RESPONSIBLE_USER_ID = RESPONSIBLE_USER_ID;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The unique ID for the Responsible User of the Activity. Only applicable if the ACTIVITY_TYPE is set to TASK.")
  @JsonProperty("RESPONSIBLE_USER_ID")
  public Integer getRESPONSIBLEUSERID() {
    return RESPONSIBLE_USER_ID;
  }
  public void setRESPONSIBLEUSERID(Integer RESPONSIBLE_USER_ID) {
    this.RESPONSIBLE_USER_ID = RESPONSIBLE_USER_ID;
  }

  
  /**
   * The unique ID for the Responsible Team of the Activity. Only applicable if the ACTIVITY_TYPE is set to TASK.
   **/
  public APIActivity ASSIGNED_TEAM_ID(Long ASSIGNED_TEAM_ID) {
    this.ASSIGNED_TEAM_ID = ASSIGNED_TEAM_ID;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The unique ID for the Responsible Team of the Activity. Only applicable if the ACTIVITY_TYPE is set to TASK.")
  @JsonProperty("ASSIGNED_TEAM_ID")
  public Long getASSIGNEDTEAMID() {
    return ASSIGNED_TEAM_ID;
  }
  public void setASSIGNEDTEAMID(Long ASSIGNED_TEAM_ID) {
    this.ASSIGNED_TEAM_ID = ASSIGNED_TEAM_ID;
  }

  
  /**
   * Whether or not to skip scheduling of this Activity on a Sunday.
   **/
  public APIActivity SKIP_SUN(Boolean SKIP_SUN) {
    this.SKIP_SUN = SKIP_SUN;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Whether or not to skip scheduling of this Activity on a Sunday.")
  @JsonProperty("SKIP_SUN")
  public Boolean getSKIPSUN() {
    return SKIP_SUN;
  }
  public void setSKIPSUN(Boolean SKIP_SUN) {
    this.SKIP_SUN = SKIP_SUN;
  }

  
  /**
   * Whether or not to skip scheduling of this Activity on a Monday.
   **/
  public APIActivity SKIP_MON(Boolean SKIP_MON) {
    this.SKIP_MON = SKIP_MON;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Whether or not to skip scheduling of this Activity on a Monday.")
  @JsonProperty("SKIP_MON")
  public Boolean getSKIPMON() {
    return SKIP_MON;
  }
  public void setSKIPMON(Boolean SKIP_MON) {
    this.SKIP_MON = SKIP_MON;
  }

  
  /**
   * Whether or not to skip scheduling of this Activity on a Tuesday.
   **/
  public APIActivity SKIP_TUE(Boolean SKIP_TUE) {
    this.SKIP_TUE = SKIP_TUE;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Whether or not to skip scheduling of this Activity on a Tuesday.")
  @JsonProperty("SKIP_TUE")
  public Boolean getSKIPTUE() {
    return SKIP_TUE;
  }
  public void setSKIPTUE(Boolean SKIP_TUE) {
    this.SKIP_TUE = SKIP_TUE;
  }

  
  /**
   * Whether or not to skip scheduling of this Activity on a Wednesday.
   **/
  public APIActivity SKIP_WED(Boolean SKIP_WED) {
    this.SKIP_WED = SKIP_WED;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Whether or not to skip scheduling of this Activity on a Wednesday.")
  @JsonProperty("SKIP_WED")
  public Boolean getSKIPWED() {
    return SKIP_WED;
  }
  public void setSKIPWED(Boolean SKIP_WED) {
    this.SKIP_WED = SKIP_WED;
  }

  
  /**
   * Whether or not to skip scheduling of this Activity on a Thursday.
   **/
  public APIActivity SKIP_THU(Boolean SKIP_THU) {
    this.SKIP_THU = SKIP_THU;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Whether or not to skip scheduling of this Activity on a Thursday.")
  @JsonProperty("SKIP_THU")
  public Boolean getSKIPTHU() {
    return SKIP_THU;
  }
  public void setSKIPTHU(Boolean SKIP_THU) {
    this.SKIP_THU = SKIP_THU;
  }

  
  /**
   * Whether or not to skip scheduling of this Activity on a Friday.
   **/
  public APIActivity SKIP_FRI(Boolean SKIP_FRI) {
    this.SKIP_FRI = SKIP_FRI;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Whether or not to skip scheduling of this Activity on a Friday.")
  @JsonProperty("SKIP_FRI")
  public Boolean getSKIPFRI() {
    return SKIP_FRI;
  }
  public void setSKIPFRI(Boolean SKIP_FRI) {
    this.SKIP_FRI = SKIP_FRI;
  }

  
  /**
   * Whether or not to skip scheduling of this Activity on a Saturday.
   **/
  public APIActivity SKIP_SAT(Boolean SKIP_SAT) {
    this.SKIP_SAT = SKIP_SAT;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Whether or not to skip scheduling of this Activity on a Saturday.")
  @JsonProperty("SKIP_SAT")
  public Boolean getSKIPSAT() {
    return SKIP_SAT;
  }
  public void setSKIPSAT(Boolean SKIP_SAT) {
    this.SKIP_SAT = SKIP_SAT;
  }

  
  /**
   * Determines the due date based on number of days after the Activity Set is created. Only applicable if the ACTIVITY_TYPE is set to TASK.
   **/
  public APIActivity DUE_DAYS_AFTER_START(Integer DUE_DAYS_AFTER_START) {
    this.DUE_DAYS_AFTER_START = DUE_DAYS_AFTER_START;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Determines the due date based on number of days after the Activity Set is created. Only applicable if the ACTIVITY_TYPE is set to TASK.")
  @JsonProperty("DUE_DAYS_AFTER_START")
  public Integer getDUEDAYSAFTERSTART() {
    return DUE_DAYS_AFTER_START;
  }
  public void setDUEDAYSAFTERSTART(Integer DUE_DAYS_AFTER_START) {
    this.DUE_DAYS_AFTER_START = DUE_DAYS_AFTER_START;
  }

  
  /**
   * Determines the due date based on number of days before the Activity Set ends. Only applicable if the ACTIVITY_TYPE is set to TASK.
   **/
  public APIActivity DUE_DAYS_BEFORE_END(Integer DUE_DAYS_BEFORE_END) {
    this.DUE_DAYS_BEFORE_END = DUE_DAYS_BEFORE_END;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Determines the due date based on number of days before the Activity Set ends. Only applicable if the ACTIVITY_TYPE is set to TASK.")
  @JsonProperty("DUE_DAYS_BEFORE_END")
  public Integer getDUEDAYSBEFOREEND() {
    return DUE_DAYS_BEFORE_END;
  }
  public void setDUEDAYSBEFOREEND(Integer DUE_DAYS_BEFORE_END) {
    this.DUE_DAYS_BEFORE_END = DUE_DAYS_BEFORE_END;
  }

  
  /**
   * Determines the event date based on number of days after the Activity Set is created. Only applicable if the ACTIVITY_TYPE is set to EVENT.
   **/
  public APIActivity EVENT_DAYS_AFTER_START(Integer EVENT_DAYS_AFTER_START) {
    this.EVENT_DAYS_AFTER_START = EVENT_DAYS_AFTER_START;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Determines the event date based on number of days after the Activity Set is created. Only applicable if the ACTIVITY_TYPE is set to EVENT.")
  @JsonProperty("EVENT_DAYS_AFTER_START")
  public Integer getEVENTDAYSAFTERSTART() {
    return EVENT_DAYS_AFTER_START;
  }
  public void setEVENTDAYSAFTERSTART(Integer EVENT_DAYS_AFTER_START) {
    this.EVENT_DAYS_AFTER_START = EVENT_DAYS_AFTER_START;
  }

  
  /**
   * Determines the event date based on number of days before the Activity Set ends. Only applicable if the ACTIVITY_TYPE is set to EVENT.
   **/
  public APIActivity EVENT_DAYS_BEFORE_END(Integer EVENT_DAYS_BEFORE_END) {
    this.EVENT_DAYS_BEFORE_END = EVENT_DAYS_BEFORE_END;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Determines the event date based on number of days before the Activity Set ends. Only applicable if the ACTIVITY_TYPE is set to EVENT.")
  @JsonProperty("EVENT_DAYS_BEFORE_END")
  public Integer getEVENTDAYSBEFOREEND() {
    return EVENT_DAYS_BEFORE_END;
  }
  public void setEVENTDAYSBEFOREEND(Integer EVENT_DAYS_BEFORE_END) {
    this.EVENT_DAYS_BEFORE_END = EVENT_DAYS_BEFORE_END;
  }

  
  /**
   * The time of the event. Only applicable if the ACTIVITY_TYPE is set to EVENT.
   **/
  public APIActivity EVENT_TIME(String EVENT_TIME) {
    this.EVENT_TIME = EVENT_TIME;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The time of the event. Only applicable if the ACTIVITY_TYPE is set to EVENT.")
  @JsonProperty("EVENT_TIME")
  public String getEVENTTIME() {
    return EVENT_TIME;
  }
  public void setEVENTTIME(String EVENT_TIME) {
    this.EVENT_TIME = EVENT_TIME;
  }

  
  /**
   * Whether or not the event is an all day event. Only applicable if the ACTIVITY_TYPE is set to EVENT.
   **/
  public APIActivity ALL_DAY(Boolean ALL_DAY) {
    this.ALL_DAY = ALL_DAY;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Whether or not the event is an all day event. Only applicable if the ACTIVITY_TYPE is set to EVENT.")
  @JsonProperty("ALL_DAY")
  public Boolean getALLDAY() {
    return ALL_DAY;
  }
  public void setALLDAY(Boolean ALL_DAY) {
    this.ALL_DAY = ALL_DAY;
  }

  
  /**
   * Duration of the event in hours. Only applicable if the ACTIVITY_TYPE is set to EVENT.
   **/
  public APIActivity DURATION(Integer DURATION) {
    this.DURATION = DURATION;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Duration of the event in hours. Only applicable if the ACTIVITY_TYPE is set to EVENT.")
  @JsonProperty("DURATION")
  public Integer getDURATION() {
    return DURATION;
  }
  public void setDURATION(Integer DURATION) {
    this.DURATION = DURATION;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    APIActivity aPIActivity = (APIActivity) o;
    return Objects.equals(this.ACTIVITY_ID, aPIActivity.ACTIVITY_ID) &&
        Objects.equals(this.ACTIVITYSET_ID, aPIActivity.ACTIVITYSET_ID) &&
        Objects.equals(this.ACTIVITY_NAME, aPIActivity.ACTIVITY_NAME) &&
        Objects.equals(this.ACTIVITY_DETAILS, aPIActivity.ACTIVITY_DETAILS) &&
        Objects.equals(this.ACTIVITY_TYPE, aPIActivity.ACTIVITY_TYPE) &&
        Objects.equals(this.CATEGORY_ID, aPIActivity.CATEGORY_ID) &&
        Objects.equals(this.REMINDER, aPIActivity.REMINDER) &&
        Objects.equals(this.REMINDER_DAYS_BEFORE_DUE, aPIActivity.REMINDER_DAYS_BEFORE_DUE) &&
        Objects.equals(this.REMINDER_TIME, aPIActivity.REMINDER_TIME) &&
        Objects.equals(this.PUBLICLY_VISIBLE, aPIActivity.PUBLICLY_VISIBLE) &&
        Objects.equals(this.OWNER_VISIBLE, aPIActivity.OWNER_VISIBLE) &&
        Objects.equals(this.OWNER_USER_ID, aPIActivity.OWNER_USER_ID) &&
        Objects.equals(this.RESPONSIBLE_USER_ID, aPIActivity.RESPONSIBLE_USER_ID) &&
        Objects.equals(this.ASSIGNED_TEAM_ID, aPIActivity.ASSIGNED_TEAM_ID) &&
        Objects.equals(this.SKIP_SUN, aPIActivity.SKIP_SUN) &&
        Objects.equals(this.SKIP_MON, aPIActivity.SKIP_MON) &&
        Objects.equals(this.SKIP_TUE, aPIActivity.SKIP_TUE) &&
        Objects.equals(this.SKIP_WED, aPIActivity.SKIP_WED) &&
        Objects.equals(this.SKIP_THU, aPIActivity.SKIP_THU) &&
        Objects.equals(this.SKIP_FRI, aPIActivity.SKIP_FRI) &&
        Objects.equals(this.SKIP_SAT, aPIActivity.SKIP_SAT) &&
        Objects.equals(this.DUE_DAYS_AFTER_START, aPIActivity.DUE_DAYS_AFTER_START) &&
        Objects.equals(this.DUE_DAYS_BEFORE_END, aPIActivity.DUE_DAYS_BEFORE_END) &&
        Objects.equals(this.EVENT_DAYS_AFTER_START, aPIActivity.EVENT_DAYS_AFTER_START) &&
        Objects.equals(this.EVENT_DAYS_BEFORE_END, aPIActivity.EVENT_DAYS_BEFORE_END) &&
        Objects.equals(this.EVENT_TIME, aPIActivity.EVENT_TIME) &&
        Objects.equals(this.ALL_DAY, aPIActivity.ALL_DAY) &&
        Objects.equals(this.DURATION, aPIActivity.DURATION);
  }

  @Override
  public int hashCode() {
    return Objects.hash(ACTIVITY_ID, ACTIVITYSET_ID, ACTIVITY_NAME, ACTIVITY_DETAILS, ACTIVITY_TYPE, CATEGORY_ID, REMINDER, REMINDER_DAYS_BEFORE_DUE, REMINDER_TIME, PUBLICLY_VISIBLE, OWNER_VISIBLE, OWNER_USER_ID, RESPONSIBLE_USER_ID, ASSIGNED_TEAM_ID, SKIP_SUN, SKIP_MON, SKIP_TUE, SKIP_WED, SKIP_THU, SKIP_FRI, SKIP_SAT, DUE_DAYS_AFTER_START, DUE_DAYS_BEFORE_END, EVENT_DAYS_AFTER_START, EVENT_DAYS_BEFORE_END, EVENT_TIME, ALL_DAY, DURATION);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class APIActivity {\n");
    
    sb.append("    ACTIVITY_ID: ").append(toIndentedString(ACTIVITY_ID)).append("\n");
    sb.append("    ACTIVITYSET_ID: ").append(toIndentedString(ACTIVITYSET_ID)).append("\n");
    sb.append("    ACTIVITY_NAME: ").append(toIndentedString(ACTIVITY_NAME)).append("\n");
    sb.append("    ACTIVITY_DETAILS: ").append(toIndentedString(ACTIVITY_DETAILS)).append("\n");
    sb.append("    ACTIVITY_TYPE: ").append(toIndentedString(ACTIVITY_TYPE)).append("\n");
    sb.append("    CATEGORY_ID: ").append(toIndentedString(CATEGORY_ID)).append("\n");
    sb.append("    REMINDER: ").append(toIndentedString(REMINDER)).append("\n");
    sb.append("    REMINDER_DAYS_BEFORE_DUE: ").append(toIndentedString(REMINDER_DAYS_BEFORE_DUE)).append("\n");
    sb.append("    REMINDER_TIME: ").append(toIndentedString(REMINDER_TIME)).append("\n");
    sb.append("    PUBLICLY_VISIBLE: ").append(toIndentedString(PUBLICLY_VISIBLE)).append("\n");
    sb.append("    OWNER_VISIBLE: ").append(toIndentedString(OWNER_VISIBLE)).append("\n");
    sb.append("    OWNER_USER_ID: ").append(toIndentedString(OWNER_USER_ID)).append("\n");
    sb.append("    RESPONSIBLE_USER_ID: ").append(toIndentedString(RESPONSIBLE_USER_ID)).append("\n");
    sb.append("    ASSIGNED_TEAM_ID: ").append(toIndentedString(ASSIGNED_TEAM_ID)).append("\n");
    sb.append("    SKIP_SUN: ").append(toIndentedString(SKIP_SUN)).append("\n");
    sb.append("    SKIP_MON: ").append(toIndentedString(SKIP_MON)).append("\n");
    sb.append("    SKIP_TUE: ").append(toIndentedString(SKIP_TUE)).append("\n");
    sb.append("    SKIP_WED: ").append(toIndentedString(SKIP_WED)).append("\n");
    sb.append("    SKIP_THU: ").append(toIndentedString(SKIP_THU)).append("\n");
    sb.append("    SKIP_FRI: ").append(toIndentedString(SKIP_FRI)).append("\n");
    sb.append("    SKIP_SAT: ").append(toIndentedString(SKIP_SAT)).append("\n");
    sb.append("    DUE_DAYS_AFTER_START: ").append(toIndentedString(DUE_DAYS_AFTER_START)).append("\n");
    sb.append("    DUE_DAYS_BEFORE_END: ").append(toIndentedString(DUE_DAYS_BEFORE_END)).append("\n");
    sb.append("    EVENT_DAYS_AFTER_START: ").append(toIndentedString(EVENT_DAYS_AFTER_START)).append("\n");
    sb.append("    EVENT_DAYS_BEFORE_END: ").append(toIndentedString(EVENT_DAYS_BEFORE_END)).append("\n");
    sb.append("    EVENT_TIME: ").append(toIndentedString(EVENT_TIME)).append("\n");
    sb.append("    ALL_DAY: ").append(toIndentedString(ALL_DAY)).append("\n");
    sb.append("    DURATION: ").append(toIndentedString(DURATION)).append("\n");
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

