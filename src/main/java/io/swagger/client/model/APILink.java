package io.swagger.client.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;



/**
 * Information about a Link between Contacts, Organisations, Opportunities, or Projects:  Two linked object IDs should be included.
 **/

@ApiModel(description = "Information about a Link between Contacts, Organisations, Opportunities, or Projects:  Two linked object IDs should be included.")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-02-24T20:33:55.547+01:00")
public class APILink   {
  
  private Long LINK_ID = null;
  private Long CONTACT_ID = null;
  private Long OPPORTUNITY_ID = null;
  private Long ORGANISATION_ID = null;
  private Long PROJECT_ID = null;
  private Long SECOND_PROJECT_ID = null;
  private Long SECOND_OPPORTUNITY_ID = null;
  private String ROLE = null;
  private String DETAILS = null;

  
  /**
   * Unique ID for the Link record
   **/
  public APILink LINK_ID(Long LINK_ID) {
    this.LINK_ID = LINK_ID;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Unique ID for the Link record")
  @JsonProperty("LINK_ID")
  public Long getLINKID() {
    return LINK_ID;
  }
  public void setLINKID(Long LINK_ID) {
    this.LINK_ID = LINK_ID;
  }

  
  /**
   * Unique ID for a Contact on one side of the Relationship, must be a CONTACT_ID
   **/
  public APILink CONTACT_ID(Long CONTACT_ID) {
    this.CONTACT_ID = CONTACT_ID;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Unique ID for a Contact on one side of the Relationship, must be a CONTACT_ID")
  @JsonProperty("CONTACT_ID")
  public Long getCONTACTID() {
    return CONTACT_ID;
  }
  public void setCONTACTID(Long CONTACT_ID) {
    this.CONTACT_ID = CONTACT_ID;
  }

  
  /**
   * Unique ID for an Opportunity on one side of the Relationship, must be an OPPORTUNITY_ID
   **/
  public APILink OPPORTUNITY_ID(Long OPPORTUNITY_ID) {
    this.OPPORTUNITY_ID = OPPORTUNITY_ID;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Unique ID for an Opportunity on one side of the Relationship, must be an OPPORTUNITY_ID")
  @JsonProperty("OPPORTUNITY_ID")
  public Long getOPPORTUNITYID() {
    return OPPORTUNITY_ID;
  }
  public void setOPPORTUNITYID(Long OPPORTUNITY_ID) {
    this.OPPORTUNITY_ID = OPPORTUNITY_ID;
  }

  
  /**
   * Unique ID for an Organisation on one side of the Relationship, must be an ORGANISATION_ID
   **/
  public APILink ORGANISATION_ID(Long ORGANISATION_ID) {
    this.ORGANISATION_ID = ORGANISATION_ID;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Unique ID for an Organisation on one side of the Relationship, must be an ORGANISATION_ID")
  @JsonProperty("ORGANISATION_ID")
  public Long getORGANISATIONID() {
    return ORGANISATION_ID;
  }
  public void setORGANISATIONID(Long ORGANISATION_ID) {
    this.ORGANISATION_ID = ORGANISATION_ID;
  }

  
  /**
   * Unique ID for a Project on one side of the Relationship
   **/
  public APILink PROJECT_ID(Long PROJECT_ID) {
    this.PROJECT_ID = PROJECT_ID;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Unique ID for a Project on one side of the Relationship")
  @JsonProperty("PROJECT_ID")
  public Long getPROJECTID() {
    return PROJECT_ID;
  }
  public void setPROJECTID(Long PROJECT_ID) {
    this.PROJECT_ID = PROJECT_ID;
  }

  
  /**
   * Unique ID for a second Project on one side of the Relationship
   **/
  public APILink SECOND_PROJECT_ID(Long SECOND_PROJECT_ID) {
    this.SECOND_PROJECT_ID = SECOND_PROJECT_ID;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Unique ID for a second Project on one side of the Relationship")
  @JsonProperty("SECOND_PROJECT_ID")
  public Long getSECONDPROJECTID() {
    return SECOND_PROJECT_ID;
  }
  public void setSECONDPROJECTID(Long SECOND_PROJECT_ID) {
    this.SECOND_PROJECT_ID = SECOND_PROJECT_ID;
  }

  
  /**
   * Unique ID for a second Opportunity on one side of the Relationship
   **/
  public APILink SECOND_OPPORTUNITY_ID(Long SECOND_OPPORTUNITY_ID) {
    this.SECOND_OPPORTUNITY_ID = SECOND_OPPORTUNITY_ID;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Unique ID for a second Opportunity on one side of the Relationship")
  @JsonProperty("SECOND_OPPORTUNITY_ID")
  public Long getSECONDOPPORTUNITYID() {
    return SECOND_OPPORTUNITY_ID;
  }
  public void setSECONDOPPORTUNITYID(Long SECOND_OPPORTUNITY_ID) {
    this.SECOND_OPPORTUNITY_ID = SECOND_OPPORTUNITY_ID;
  }

  
  /**
   * Description of the Relationship between the linked objects
   **/
  public APILink ROLE(String ROLE) {
    this.ROLE = ROLE;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Description of the Relationship between the linked objects")
  @JsonProperty("ROLE")
  public String getROLE() {
    return ROLE;
  }
  public void setROLE(String ROLE) {
    this.ROLE = ROLE;
  }

  
  /**
   * Details of the Link
   **/
  public APILink DETAILS(String DETAILS) {
    this.DETAILS = DETAILS;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Details of the Link")
  @JsonProperty("DETAILS")
  public String getDETAILS() {
    return DETAILS;
  }
  public void setDETAILS(String DETAILS) {
    this.DETAILS = DETAILS;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    APILink aPILink = (APILink) o;
    return Objects.equals(this.LINK_ID, aPILink.LINK_ID) &&
        Objects.equals(this.CONTACT_ID, aPILink.CONTACT_ID) &&
        Objects.equals(this.OPPORTUNITY_ID, aPILink.OPPORTUNITY_ID) &&
        Objects.equals(this.ORGANISATION_ID, aPILink.ORGANISATION_ID) &&
        Objects.equals(this.PROJECT_ID, aPILink.PROJECT_ID) &&
        Objects.equals(this.SECOND_PROJECT_ID, aPILink.SECOND_PROJECT_ID) &&
        Objects.equals(this.SECOND_OPPORTUNITY_ID, aPILink.SECOND_OPPORTUNITY_ID) &&
        Objects.equals(this.ROLE, aPILink.ROLE) &&
        Objects.equals(this.DETAILS, aPILink.DETAILS);
  }

  @Override
  public int hashCode() {
    return Objects.hash(LINK_ID, CONTACT_ID, OPPORTUNITY_ID, ORGANISATION_ID, PROJECT_ID, SECOND_PROJECT_ID, SECOND_OPPORTUNITY_ID, ROLE, DETAILS);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class APILink {\n");
    
    sb.append("    LINK_ID: ").append(toIndentedString(LINK_ID)).append("\n");
    sb.append("    CONTACT_ID: ").append(toIndentedString(CONTACT_ID)).append("\n");
    sb.append("    OPPORTUNITY_ID: ").append(toIndentedString(OPPORTUNITY_ID)).append("\n");
    sb.append("    ORGANISATION_ID: ").append(toIndentedString(ORGANISATION_ID)).append("\n");
    sb.append("    PROJECT_ID: ").append(toIndentedString(PROJECT_ID)).append("\n");
    sb.append("    SECOND_PROJECT_ID: ").append(toIndentedString(SECOND_PROJECT_ID)).append("\n");
    sb.append("    SECOND_OPPORTUNITY_ID: ").append(toIndentedString(SECOND_OPPORTUNITY_ID)).append("\n");
    sb.append("    ROLE: ").append(toIndentedString(ROLE)).append("\n");
    sb.append("    DETAILS: ").append(toIndentedString(DETAILS)).append("\n");
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

