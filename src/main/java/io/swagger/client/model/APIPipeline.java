package io.swagger.client.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;



/**
 * APIPipeline
 **/

@ApiModel(description = "APIPipeline")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-02-24T20:33:55.547+01:00")
public class APIPipeline   {
  
  private Long PIPELINE_ID = null;
  private String PIPELINE_NAME = null;
  private Boolean FOR_OPPORTUNITIES = null;
  private Boolean FOR_PROJECTS = null;
  private Integer OWNER_USER_ID = null;

  
  /**
   * Unique ID for the Pipeline record.
   **/
  public APIPipeline PIPELINE_ID(Long PIPELINE_ID) {
    this.PIPELINE_ID = PIPELINE_ID;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Unique ID for the Pipeline record.")
  @JsonProperty("PIPELINE_ID")
  public Long getPIPELINEID() {
    return PIPELINE_ID;
  }
  public void setPIPELINEID(Long PIPELINE_ID) {
    this.PIPELINE_ID = PIPELINE_ID;
  }

  
  /**
   * Name of the Pipeline.
   **/
  public APIPipeline PIPELINE_NAME(String PIPELINE_NAME) {
    this.PIPELINE_NAME = PIPELINE_NAME;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Name of the Pipeline.")
  @JsonProperty("PIPELINE_NAME")
  public String getPIPELINENAME() {
    return PIPELINE_NAME;
  }
  public void setPIPELINENAME(String PIPELINE_NAME) {
    this.PIPELINE_NAME = PIPELINE_NAME;
  }

  
  /**
   * True if the Pipeline is available for Opportunity records.
   **/
  public APIPipeline FOR_OPPORTUNITIES(Boolean FOR_OPPORTUNITIES) {
    this.FOR_OPPORTUNITIES = FOR_OPPORTUNITIES;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "True if the Pipeline is available for Opportunity records.")
  @JsonProperty("FOR_OPPORTUNITIES")
  public Boolean getFOROPPORTUNITIES() {
    return FOR_OPPORTUNITIES;
  }
  public void setFOROPPORTUNITIES(Boolean FOR_OPPORTUNITIES) {
    this.FOR_OPPORTUNITIES = FOR_OPPORTUNITIES;
  }

  
  /**
   * True if the Pipeline is available for Project records.
   **/
  public APIPipeline FOR_PROJECTS(Boolean FOR_PROJECTS) {
    this.FOR_PROJECTS = FOR_PROJECTS;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "True if the Pipeline is available for Project records.")
  @JsonProperty("FOR_PROJECTS")
  public Boolean getFORPROJECTS() {
    return FOR_PROJECTS;
  }
  public void setFORPROJECTS(Boolean FOR_PROJECTS) {
    this.FOR_PROJECTS = FOR_PROJECTS;
  }

  
  /**
   * User ID of the Pipeline record owner.
   **/
  public APIPipeline OWNER_USER_ID(Integer OWNER_USER_ID) {
    this.OWNER_USER_ID = OWNER_USER_ID;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "User ID of the Pipeline record owner.")
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
    APIPipeline aPIPipeline = (APIPipeline) o;
    return Objects.equals(this.PIPELINE_ID, aPIPipeline.PIPELINE_ID) &&
        Objects.equals(this.PIPELINE_NAME, aPIPipeline.PIPELINE_NAME) &&
        Objects.equals(this.FOR_OPPORTUNITIES, aPIPipeline.FOR_OPPORTUNITIES) &&
        Objects.equals(this.FOR_PROJECTS, aPIPipeline.FOR_PROJECTS) &&
        Objects.equals(this.OWNER_USER_ID, aPIPipeline.OWNER_USER_ID);
  }

  @Override
  public int hashCode() {
    return Objects.hash(PIPELINE_ID, PIPELINE_NAME, FOR_OPPORTUNITIES, FOR_PROJECTS, OWNER_USER_ID);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class APIPipeline {\n");
    
    sb.append("    PIPELINE_ID: ").append(toIndentedString(PIPELINE_ID)).append("\n");
    sb.append("    PIPELINE_NAME: ").append(toIndentedString(PIPELINE_NAME)).append("\n");
    sb.append("    FOR_OPPORTUNITIES: ").append(toIndentedString(FOR_OPPORTUNITIES)).append("\n");
    sb.append("    FOR_PROJECTS: ").append(toIndentedString(FOR_PROJECTS)).append("\n");
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

