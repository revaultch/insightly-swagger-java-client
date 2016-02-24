package io.swagger.client.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;



/**
 * APIPipelineStage
 **/

@ApiModel(description = "APIPipelineStage")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-02-24T20:33:55.547+01:00")
public class APIPipelineStage   {
  
  private Long STAGE_ID = null;
  private Long PIPELINE_ID = null;
  private String STAGE_NAME = null;
  private Integer STAGE_ORDER = null;
  private Long ACTIVITYSET_ID = null;
  private Integer OWNER_USER_ID = null;

  
  /**
   * Unique ID for the Stage record.
   **/
  public APIPipelineStage STAGE_ID(Long STAGE_ID) {
    this.STAGE_ID = STAGE_ID;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Unique ID for the Stage record.")
  @JsonProperty("STAGE_ID")
  public Long getSTAGEID() {
    return STAGE_ID;
  }
  public void setSTAGEID(Long STAGE_ID) {
    this.STAGE_ID = STAGE_ID;
  }

  
  /**
   * Unique ID for the Pipeline the Stage is participates in.
   **/
  public APIPipelineStage PIPELINE_ID(Long PIPELINE_ID) {
    this.PIPELINE_ID = PIPELINE_ID;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Unique ID for the Pipeline the Stage is participates in.")
  @JsonProperty("PIPELINE_ID")
  public Long getPIPELINEID() {
    return PIPELINE_ID;
  }
  public void setPIPELINEID(Long PIPELINE_ID) {
    this.PIPELINE_ID = PIPELINE_ID;
  }

  
  /**
   * Name of the Stage.
   **/
  public APIPipelineStage STAGE_NAME(String STAGE_NAME) {
    this.STAGE_NAME = STAGE_NAME;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Name of the Stage.")
  @JsonProperty("STAGE_NAME")
  public String getSTAGENAME() {
    return STAGE_NAME;
  }
  public void setSTAGENAME(String STAGE_NAME) {
    this.STAGE_NAME = STAGE_NAME;
  }

  
  /**
   * Order of the Stage in the list of Stages for the Pipeline.
   **/
  public APIPipelineStage STAGE_ORDER(Integer STAGE_ORDER) {
    this.STAGE_ORDER = STAGE_ORDER;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Order of the Stage in the list of Stages for the Pipeline.")
  @JsonProperty("STAGE_ORDER")
  public Integer getSTAGEORDER() {
    return STAGE_ORDER;
  }
  public void setSTAGEORDER(Integer STAGE_ORDER) {
    this.STAGE_ORDER = STAGE_ORDER;
  }

  
  /**
   * Optional ID of the activity set associated with the pipeline stage.
   **/
  public APIPipelineStage ACTIVITYSET_ID(Long ACTIVITYSET_ID) {
    this.ACTIVITYSET_ID = ACTIVITYSET_ID;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Optional ID of the activity set associated with the pipeline stage.")
  @JsonProperty("ACTIVITYSET_ID")
  public Long getACTIVITYSETID() {
    return ACTIVITYSET_ID;
  }
  public void setACTIVITYSETID(Long ACTIVITYSET_ID) {
    this.ACTIVITYSET_ID = ACTIVITYSET_ID;
  }

  
  /**
   * User ID of the Pipeline Stage record owner.
   **/
  public APIPipelineStage OWNER_USER_ID(Integer OWNER_USER_ID) {
    this.OWNER_USER_ID = OWNER_USER_ID;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "User ID of the Pipeline Stage record owner.")
  @JsonProperty("OWNER_USER_ID")
  public Integer getOWNERUSERID() {
    return OWNER_USER_ID;
  }
  public void setOWNERUSERID(Integer OWNER_USER_ID) {
    this.OWNER_USER_ID = OWNER_USER_ID;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    APIPipelineStage aPIPipelineStage = (APIPipelineStage) o;
    return Objects.equals(this.STAGE_ID, aPIPipelineStage.STAGE_ID) &&
        Objects.equals(this.PIPELINE_ID, aPIPipelineStage.PIPELINE_ID) &&
        Objects.equals(this.STAGE_NAME, aPIPipelineStage.STAGE_NAME) &&
        Objects.equals(this.STAGE_ORDER, aPIPipelineStage.STAGE_ORDER) &&
        Objects.equals(this.ACTIVITYSET_ID, aPIPipelineStage.ACTIVITYSET_ID) &&
        Objects.equals(this.OWNER_USER_ID, aPIPipelineStage.OWNER_USER_ID);
  }

  @Override
  public int hashCode() {
    return Objects.hash(STAGE_ID, PIPELINE_ID, STAGE_NAME, STAGE_ORDER, ACTIVITYSET_ID, OWNER_USER_ID);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class APIPipelineStage {\n");
    
    sb.append("    STAGE_ID: ").append(toIndentedString(STAGE_ID)).append("\n");
    sb.append("    PIPELINE_ID: ").append(toIndentedString(PIPELINE_ID)).append("\n");
    sb.append("    STAGE_NAME: ").append(toIndentedString(STAGE_NAME)).append("\n");
    sb.append("    STAGE_ORDER: ").append(toIndentedString(STAGE_ORDER)).append("\n");
    sb.append("    ACTIVITYSET_ID: ").append(toIndentedString(ACTIVITYSET_ID)).append("\n");
    sb.append("    OWNER_USER_ID: ").append(toIndentedString(OWNER_USER_ID)).append("\n");
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

