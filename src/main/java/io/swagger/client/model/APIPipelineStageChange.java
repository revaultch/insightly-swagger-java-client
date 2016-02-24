package io.swagger.client.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.client.model.APIActivitySetAssignment;



/**
 * Pipeline stage change api object.
 **/

@ApiModel(description = "Pipeline stage change api object.")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-02-24T20:33:55.547+01:00")
public class APIPipelineStageChange   {
  
  private Long STAGE_ID = null;
  private APIActivitySetAssignment ACTIVITYSET_ASSIGNMENT = null;

  
  /**
   * ID of the new stage.
   **/
  public APIPipelineStageChange STAGE_ID(Long STAGE_ID) {
    this.STAGE_ID = STAGE_ID;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "ID of the new stage.")
  @JsonProperty("STAGE_ID")
  public Long getSTAGEID() {
    return STAGE_ID;
  }
  public void setSTAGEID(Long STAGE_ID) {
    this.STAGE_ID = STAGE_ID;
  }

  
  /**
   * Assignment for the activity set associated with the stage. Must be provided if stage has an activity set.
   **/
  public APIPipelineStageChange ACTIVITYSET_ASSIGNMENT(APIActivitySetAssignment ACTIVITYSET_ASSIGNMENT) {
    this.ACTIVITYSET_ASSIGNMENT = ACTIVITYSET_ASSIGNMENT;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Assignment for the activity set associated with the stage. Must be provided if stage has an activity set.")
  @JsonProperty("ACTIVITYSET_ASSIGNMENT")
  public APIActivitySetAssignment getACTIVITYSETASSIGNMENT() {
    return ACTIVITYSET_ASSIGNMENT;
  }
  public void setACTIVITYSETASSIGNMENT(APIActivitySetAssignment ACTIVITYSET_ASSIGNMENT) {
    this.ACTIVITYSET_ASSIGNMENT = ACTIVITYSET_ASSIGNMENT;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    APIPipelineStageChange aPIPipelineStageChange = (APIPipelineStageChange) o;
    return Objects.equals(this.STAGE_ID, aPIPipelineStageChange.STAGE_ID) &&
        Objects.equals(this.ACTIVITYSET_ASSIGNMENT, aPIPipelineStageChange.ACTIVITYSET_ASSIGNMENT);
  }

  @Override
  public int hashCode() {
    return Objects.hash(STAGE_ID, ACTIVITYSET_ASSIGNMENT);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class APIPipelineStageChange {\n");
    
    sb.append("    STAGE_ID: ").append(toIndentedString(STAGE_ID)).append("\n");
    sb.append("    ACTIVITYSET_ASSIGNMENT: ").append(toIndentedString(ACTIVITYSET_ASSIGNMENT)).append("\n");
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

