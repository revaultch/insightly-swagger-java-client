package io.swagger.client.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.client.model.APIActivityAssignment;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;



/**
 * APIActivitySetAssignment
 **/

@ApiModel(description = "APIActivitySetAssignment")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-02-24T20:33:55.547+01:00")
public class APIActivitySetAssignment   {
  
  private Long ACTIVITYSET_ID = null;
  private Date START_DATE = null;
  private Date END_DATE = null;
  private List<APIActivityAssignment> ACTIVITY_ASSIGNMENTS = new ArrayList<APIActivityAssignment>();

  
  /**
   * Unique ID for the Activity Set
   **/
  public APIActivitySetAssignment ACTIVITYSET_ID(Long ACTIVITYSET_ID) {
    this.ACTIVITYSET_ID = ACTIVITYSET_ID;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Unique ID for the Activity Set")
  @JsonProperty("ACTIVITYSET_ID")
  public Long getACTIVITYSETID() {
    return ACTIVITYSET_ID;
  }
  public void setACTIVITYSETID(Long ACTIVITYSET_ID) {
    this.ACTIVITYSET_ID = ACTIVITYSET_ID;
  }

  
  /**
   * Start Date for the Activity Set
   **/
  public APIActivitySetAssignment START_DATE(Date START_DATE) {
    this.START_DATE = START_DATE;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Start Date for the Activity Set")
  @JsonProperty("START_DATE")
  public Date getSTARTDATE() {
    return START_DATE;
  }
  public void setSTARTDATE(Date START_DATE) {
    this.START_DATE = START_DATE;
  }

  
  /**
   * End Date for the Activity Set. If activity set contains activities with end date specification then END_DATE is required
   **/
  public APIActivitySetAssignment END_DATE(Date END_DATE) {
    this.END_DATE = END_DATE;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "End Date for the Activity Set. If activity set contains activities with end date specification then END_DATE is required")
  @JsonProperty("END_DATE")
  public Date getENDDATE() {
    return END_DATE;
  }
  public void setENDDATE(Date END_DATE) {
    this.END_DATE = END_DATE;
  }

  
  /**
   * List of Activity Assignments. Only needed for Task Activities that have not been pre-assigned when configuring the Activity Set.
   **/
  public APIActivitySetAssignment ACTIVITY_ASSIGNMENTS(List<APIActivityAssignment> ACTIVITY_ASSIGNMENTS) {
    this.ACTIVITY_ASSIGNMENTS = ACTIVITY_ASSIGNMENTS;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "List of Activity Assignments. Only needed for Task Activities that have not been pre-assigned when configuring the Activity Set.")
  @JsonProperty("ACTIVITY_ASSIGNMENTS")
  public List<APIActivityAssignment> getACTIVITYASSIGNMENTS() {
    return ACTIVITY_ASSIGNMENTS;
  }
  public void setACTIVITYASSIGNMENTS(List<APIActivityAssignment> ACTIVITY_ASSIGNMENTS) {
    this.ACTIVITY_ASSIGNMENTS = ACTIVITY_ASSIGNMENTS;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    APIActivitySetAssignment aPIActivitySetAssignment = (APIActivitySetAssignment) o;
    return Objects.equals(this.ACTIVITYSET_ID, aPIActivitySetAssignment.ACTIVITYSET_ID) &&
        Objects.equals(this.START_DATE, aPIActivitySetAssignment.START_DATE) &&
        Objects.equals(this.END_DATE, aPIActivitySetAssignment.END_DATE) &&
        Objects.equals(this.ACTIVITY_ASSIGNMENTS, aPIActivitySetAssignment.ACTIVITY_ASSIGNMENTS);
  }

  @Override
  public int hashCode() {
    return Objects.hash(ACTIVITYSET_ID, START_DATE, END_DATE, ACTIVITY_ASSIGNMENTS);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class APIActivitySetAssignment {\n");
    
    sb.append("    ACTIVITYSET_ID: ").append(toIndentedString(ACTIVITYSET_ID)).append("\n");
    sb.append("    START_DATE: ").append(toIndentedString(START_DATE)).append("\n");
    sb.append("    END_DATE: ").append(toIndentedString(END_DATE)).append("\n");
    sb.append("    ACTIVITY_ASSIGNMENTS: ").append(toIndentedString(ACTIVITY_ASSIGNMENTS)).append("\n");
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

