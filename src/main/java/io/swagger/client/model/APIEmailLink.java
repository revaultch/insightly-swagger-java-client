package io.swagger.client.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;



/**
 * Information about a Link between an Email and a Contact, Organisation, Opportunity, or Project:  One linked object ID should be included.
 **/

@ApiModel(description = "Information about a Link between an Email and a Contact, Organisation, Opportunity, or Project:  One linked object ID should be included.")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-02-24T20:33:55.547+01:00")
public class APIEmailLink   {
  
  private Long EMAIL_LINK_ID = null;
  private Long EMAIL_ID = null;
  private Long CONTACT_ID = null;
  private Long ORGANISATION_ID = null;
  private Long OPPORTUNITY_ID = null;
  private Long PROJECT_ID = null;
  private Long LEAD_ID = null;

  
  /**
   * UniqueID for the Email Link record
   **/
  public APIEmailLink EMAIL_LINK_ID(Long EMAIL_LINK_ID) {
    this.EMAIL_LINK_ID = EMAIL_LINK_ID;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "UniqueID for the Email Link record")
  @JsonProperty("EMAIL_LINK_ID")
  public Long getEMAILLINKID() {
    return EMAIL_LINK_ID;
  }
  public void setEMAILLINKID(Long EMAIL_LINK_ID) {
    this.EMAIL_LINK_ID = EMAIL_LINK_ID;
  }

  
  /**
   * Unique ID for the Email record being linked
   **/
  public APIEmailLink EMAIL_ID(Long EMAIL_ID) {
    this.EMAIL_ID = EMAIL_ID;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Unique ID for the Email record being linked")
  @JsonProperty("EMAIL_ID")
  public Long getEMAILID() {
    return EMAIL_ID;
  }
  public void setEMAILID(Long EMAIL_ID) {
    this.EMAIL_ID = EMAIL_ID;
  }

  
  /**
   * Unique ID for a Contact linked to the Email
   **/
  public APIEmailLink CONTACT_ID(Long CONTACT_ID) {
    this.CONTACT_ID = CONTACT_ID;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Unique ID for a Contact linked to the Email")
  @JsonProperty("CONTACT_ID")
  public Long getCONTACTID() {
    return CONTACT_ID;
  }
  public void setCONTACTID(Long CONTACT_ID) {
    this.CONTACT_ID = CONTACT_ID;
  }

  
  /**
   * Unique ID for an Organisation linked to the Email
   **/
  public APIEmailLink ORGANISATION_ID(Long ORGANISATION_ID) {
    this.ORGANISATION_ID = ORGANISATION_ID;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Unique ID for an Organisation linked to the Email")
  @JsonProperty("ORGANISATION_ID")
  public Long getORGANISATIONID() {
    return ORGANISATION_ID;
  }
  public void setORGANISATIONID(Long ORGANISATION_ID) {
    this.ORGANISATION_ID = ORGANISATION_ID;
  }

  
  /**
   * Unique ID for an Opportunity linked to the Email
   **/
  public APIEmailLink OPPORTUNITY_ID(Long OPPORTUNITY_ID) {
    this.OPPORTUNITY_ID = OPPORTUNITY_ID;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Unique ID for an Opportunity linked to the Email")
  @JsonProperty("OPPORTUNITY_ID")
  public Long getOPPORTUNITYID() {
    return OPPORTUNITY_ID;
  }
  public void setOPPORTUNITYID(Long OPPORTUNITY_ID) {
    this.OPPORTUNITY_ID = OPPORTUNITY_ID;
  }

  
  /**
   * Unique ID for a Project linked to the Email
   **/
  public APIEmailLink PROJECT_ID(Long PROJECT_ID) {
    this.PROJECT_ID = PROJECT_ID;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Unique ID for a Project linked to the Email")
  @JsonProperty("PROJECT_ID")
  public Long getPROJECTID() {
    return PROJECT_ID;
  }
  public void setPROJECTID(Long PROJECT_ID) {
    this.PROJECT_ID = PROJECT_ID;
  }

  
  /**
   * Unique ID for a Lead linked to the Email
   **/
  public APIEmailLink LEAD_ID(Long LEAD_ID) {
    this.LEAD_ID = LEAD_ID;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Unique ID for a Lead linked to the Email")
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
    APIEmailLink aPIEmailLink = (APIEmailLink) o;
    return Objects.equals(this.EMAIL_LINK_ID, aPIEmailLink.EMAIL_LINK_ID) &&
        Objects.equals(this.EMAIL_ID, aPIEmailLink.EMAIL_ID) &&
        Objects.equals(this.CONTACT_ID, aPIEmailLink.CONTACT_ID) &&
        Objects.equals(this.ORGANISATION_ID, aPIEmailLink.ORGANISATION_ID) &&
        Objects.equals(this.OPPORTUNITY_ID, aPIEmailLink.OPPORTUNITY_ID) &&
        Objects.equals(this.PROJECT_ID, aPIEmailLink.PROJECT_ID) &&
        Objects.equals(this.LEAD_ID, aPIEmailLink.LEAD_ID);
  }

  @Override
  public int hashCode() {
    return Objects.hash(EMAIL_LINK_ID, EMAIL_ID, CONTACT_ID, ORGANISATION_ID, OPPORTUNITY_ID, PROJECT_ID, LEAD_ID);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class APIEmailLink {\n");
    
    sb.append("    EMAIL_LINK_ID: ").append(toIndentedString(EMAIL_LINK_ID)).append("\n");
    sb.append("    EMAIL_ID: ").append(toIndentedString(EMAIL_ID)).append("\n");
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

