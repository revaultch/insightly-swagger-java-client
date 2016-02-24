package io.swagger.client.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;



/**
 * Information about a Link between an Event and a Contact, Organisation, Opportunity, or Project:  One linked object ID should be included.\&quot;
 **/

@ApiModel(description = "Information about a Link between an Event and a Contact, Organisation, Opportunity, or Project:  One linked object ID should be included.\"")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-02-24T20:33:55.547+01:00")
public class APIEventLink   {
  
  private Long EVENT_LINK_ID = null;
  private Long EVENT_ID = null;
  private Long CONTACT_ID = null;
  private Long ORGANISATION_ID = null;
  private Long OPPORTUNITY_ID = null;
  private Long PROJECT_ID = null;
  private Long LEAD_ID = null;

  
  /**
   * Unique ID for the Event Link record
   **/
  public APIEventLink EVENT_LINK_ID(Long EVENT_LINK_ID) {
    this.EVENT_LINK_ID = EVENT_LINK_ID;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Unique ID for the Event Link record")
  @JsonProperty("EVENT_LINK_ID")
  public Long getEVENTLINKID() {
    return EVENT_LINK_ID;
  }
  public void setEVENTLINKID(Long EVENT_LINK_ID) {
    this.EVENT_LINK_ID = EVENT_LINK_ID;
  }

  
  /**
   * Unique ID for the Event record being linked
   **/
  public APIEventLink EVENT_ID(Long EVENT_ID) {
    this.EVENT_ID = EVENT_ID;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Unique ID for the Event record being linked")
  @JsonProperty("EVENT_ID")
  public Long getEVENTID() {
    return EVENT_ID;
  }
  public void setEVENTID(Long EVENT_ID) {
    this.EVENT_ID = EVENT_ID;
  }

  
  /**
   * Unique ID for a Contact linked to the Event
   **/
  public APIEventLink CONTACT_ID(Long CONTACT_ID) {
    this.CONTACT_ID = CONTACT_ID;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Unique ID for a Contact linked to the Event")
  @JsonProperty("CONTACT_ID")
  public Long getCONTACTID() {
    return CONTACT_ID;
  }
  public void setCONTACTID(Long CONTACT_ID) {
    this.CONTACT_ID = CONTACT_ID;
  }

  
  /**
   * Unique ID for an Organisation linked to the Event
   **/
  public APIEventLink ORGANISATION_ID(Long ORGANISATION_ID) {
    this.ORGANISATION_ID = ORGANISATION_ID;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Unique ID for an Organisation linked to the Event")
  @JsonProperty("ORGANISATION_ID")
  public Long getORGANISATIONID() {
    return ORGANISATION_ID;
  }
  public void setORGANISATIONID(Long ORGANISATION_ID) {
    this.ORGANISATION_ID = ORGANISATION_ID;
  }

  
  /**
   * Unique ID for an Opportunity linked to the Event
   **/
  public APIEventLink OPPORTUNITY_ID(Long OPPORTUNITY_ID) {
    this.OPPORTUNITY_ID = OPPORTUNITY_ID;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Unique ID for an Opportunity linked to the Event")
  @JsonProperty("OPPORTUNITY_ID")
  public Long getOPPORTUNITYID() {
    return OPPORTUNITY_ID;
  }
  public void setOPPORTUNITYID(Long OPPORTUNITY_ID) {
    this.OPPORTUNITY_ID = OPPORTUNITY_ID;
  }

  
  /**
   * Unique ID for a Project linked to the Event
   **/
  public APIEventLink PROJECT_ID(Long PROJECT_ID) {
    this.PROJECT_ID = PROJECT_ID;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Unique ID for a Project linked to the Event")
  @JsonProperty("PROJECT_ID")
  public Long getPROJECTID() {
    return PROJECT_ID;
  }
  public void setPROJECTID(Long PROJECT_ID) {
    this.PROJECT_ID = PROJECT_ID;
  }

  
  /**
   * Unique ID for a Lead linked to the Event
   **/
  public APIEventLink LEAD_ID(Long LEAD_ID) {
    this.LEAD_ID = LEAD_ID;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Unique ID for a Lead linked to the Event")
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
    APIEventLink aPIEventLink = (APIEventLink) o;
    return Objects.equals(this.EVENT_LINK_ID, aPIEventLink.EVENT_LINK_ID) &&
        Objects.equals(this.EVENT_ID, aPIEventLink.EVENT_ID) &&
        Objects.equals(this.CONTACT_ID, aPIEventLink.CONTACT_ID) &&
        Objects.equals(this.ORGANISATION_ID, aPIEventLink.ORGANISATION_ID) &&
        Objects.equals(this.OPPORTUNITY_ID, aPIEventLink.OPPORTUNITY_ID) &&
        Objects.equals(this.PROJECT_ID, aPIEventLink.PROJECT_ID) &&
        Objects.equals(this.LEAD_ID, aPIEventLink.LEAD_ID);
  }

  @Override
  public int hashCode() {
    return Objects.hash(EVENT_LINK_ID, EVENT_ID, CONTACT_ID, ORGANISATION_ID, OPPORTUNITY_ID, PROJECT_ID, LEAD_ID);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class APIEventLink {\n");
    
    sb.append("    EVENT_LINK_ID: ").append(toIndentedString(EVENT_LINK_ID)).append("\n");
    sb.append("    EVENT_ID: ").append(toIndentedString(EVENT_ID)).append("\n");
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

