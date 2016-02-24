package io.swagger.client.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;



/**
 * APITaskLink
 **/

@ApiModel(description = "APITaskLink")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-02-24T20:33:55.547+01:00")
public class APITaskLink   {
  
  private Long TASK_LINK_ID = null;
  private Long TASK_ID = null;
  private Long CONTACT_ID = null;
  private Long ORGANISATION_ID = null;
  private Long OPPORTUNITY_ID = null;
  private Long PROJECT_ID = null;
  private Long LEAD_ID = null;

  
  /**
   * Unique ID for the Task Link record
   **/
  public APITaskLink TASK_LINK_ID(Long TASK_LINK_ID) {
    this.TASK_LINK_ID = TASK_LINK_ID;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Unique ID for the Task Link record")
  @JsonProperty("TASK_LINK_ID")
  public Long getTASKLINKID() {
    return TASK_LINK_ID;
  }
  public void setTASKLINKID(Long TASK_LINK_ID) {
    this.TASK_LINK_ID = TASK_LINK_ID;
  }

  
  /**
   * Unique ID for the Task record being linked
   **/
  public APITaskLink TASK_ID(Long TASK_ID) {
    this.TASK_ID = TASK_ID;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Unique ID for the Task record being linked")
  @JsonProperty("TASK_ID")
  public Long getTASKID() {
    return TASK_ID;
  }
  public void setTASKID(Long TASK_ID) {
    this.TASK_ID = TASK_ID;
  }

  
  /**
   * Unique ID for a Contact linked to the Task
   **/
  public APITaskLink CONTACT_ID(Long CONTACT_ID) {
    this.CONTACT_ID = CONTACT_ID;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Unique ID for a Contact linked to the Task")
  @JsonProperty("CONTACT_ID")
  public Long getCONTACTID() {
    return CONTACT_ID;
  }
  public void setCONTACTID(Long CONTACT_ID) {
    this.CONTACT_ID = CONTACT_ID;
  }

  
  /**
   * Unique ID for an Organisation linked to the Task
   **/
  public APITaskLink ORGANISATION_ID(Long ORGANISATION_ID) {
    this.ORGANISATION_ID = ORGANISATION_ID;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Unique ID for an Organisation linked to the Task")
  @JsonProperty("ORGANISATION_ID")
  public Long getORGANISATIONID() {
    return ORGANISATION_ID;
  }
  public void setORGANISATIONID(Long ORGANISATION_ID) {
    this.ORGANISATION_ID = ORGANISATION_ID;
  }

  
  /**
   * Unique ID for an Opportunity linked to the Task
   **/
  public APITaskLink OPPORTUNITY_ID(Long OPPORTUNITY_ID) {
    this.OPPORTUNITY_ID = OPPORTUNITY_ID;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Unique ID for an Opportunity linked to the Task")
  @JsonProperty("OPPORTUNITY_ID")
  public Long getOPPORTUNITYID() {
    return OPPORTUNITY_ID;
  }
  public void setOPPORTUNITYID(Long OPPORTUNITY_ID) {
    this.OPPORTUNITY_ID = OPPORTUNITY_ID;
  }

  
  /**
   * Unique ID for a Project linked to the Task
   **/
  public APITaskLink PROJECT_ID(Long PROJECT_ID) {
    this.PROJECT_ID = PROJECT_ID;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Unique ID for a Project linked to the Task")
  @JsonProperty("PROJECT_ID")
  public Long getPROJECTID() {
    return PROJECT_ID;
  }
  public void setPROJECTID(Long PROJECT_ID) {
    this.PROJECT_ID = PROJECT_ID;
  }

  
  /**
   * Unique ID for a Lead linked to the Task
   **/
  public APITaskLink LEAD_ID(Long LEAD_ID) {
    this.LEAD_ID = LEAD_ID;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Unique ID for a Lead linked to the Task")
  @JsonProperty("LEAD_ID")
  public Long getLEADID() {
    return LEAD_ID;
  }
  public void setLEADID(Long LEAD_ID) {
    this.LEAD_ID = LEAD_ID;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    APITaskLink aPITaskLink = (APITaskLink) o;
    return Objects.equals(this.TASK_LINK_ID, aPITaskLink.TASK_LINK_ID) &&
        Objects.equals(this.TASK_ID, aPITaskLink.TASK_ID) &&
        Objects.equals(this.CONTACT_ID, aPITaskLink.CONTACT_ID) &&
        Objects.equals(this.ORGANISATION_ID, aPITaskLink.ORGANISATION_ID) &&
        Objects.equals(this.OPPORTUNITY_ID, aPITaskLink.OPPORTUNITY_ID) &&
        Objects.equals(this.PROJECT_ID, aPITaskLink.PROJECT_ID) &&
        Objects.equals(this.LEAD_ID, aPITaskLink.LEAD_ID);
  }

  @Override
  public int hashCode() {
    return Objects.hash(TASK_LINK_ID, TASK_ID, CONTACT_ID, ORGANISATION_ID, OPPORTUNITY_ID, PROJECT_ID, LEAD_ID);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class APITaskLink {\n");
    
    sb.append("    TASK_LINK_ID: ").append(toIndentedString(TASK_LINK_ID)).append("\n");
    sb.append("    TASK_ID: ").append(toIndentedString(TASK_ID)).append("\n");
    sb.append("    CONTACT_ID: ").append(toIndentedString(CONTACT_ID)).append("\n");
    sb.append("    ORGANISATION_ID: ").append(toIndentedString(ORGANISATION_ID)).append("\n");
    sb.append("    OPPORTUNITY_ID: ").append(toIndentedString(OPPORTUNITY_ID)).append("\n");
    sb.append("    PROJECT_ID: ").append(toIndentedString(PROJECT_ID)).append("\n");
    sb.append("    LEAD_ID: ").append(toIndentedString(LEAD_ID)).append("\n");
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

