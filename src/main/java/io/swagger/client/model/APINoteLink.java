package io.swagger.client.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;



/**
 * Information about a Link between a Note and a Contact, Organisation, Opportunity, or Project:  One linked object ID should be included.
 **/

@ApiModel(description = "Information about a Link between a Note and a Contact, Organisation, Opportunity, or Project:  One linked object ID should be included.")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-02-24T20:33:55.547+01:00")
public class APINoteLink   {
  
  private Long NOTE_LINK_ID = null;
  private Long NOTE_ID = null;
  private Long CONTACT_ID = null;
  private Long ORGANISATION_ID = null;
  private Long OPPORTUNITY_ID = null;
  private Long PROJECT_ID = null;
  private Long LEAD_ID = null;

  
  /**
   * Unique ID for the Note Link record
   **/
  public APINoteLink NOTE_LINK_ID(Long NOTE_LINK_ID) {
    this.NOTE_LINK_ID = NOTE_LINK_ID;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Unique ID for the Note Link record")
  @JsonProperty("NOTE_LINK_ID")
  public Long getNOTELINKID() {
    return NOTE_LINK_ID;
  }
  public void setNOTELINKID(Long NOTE_LINK_ID) {
    this.NOTE_LINK_ID = NOTE_LINK_ID;
  }

  
  /**
   * Unique ID of the Note record being linked
   **/
  public APINoteLink NOTE_ID(Long NOTE_ID) {
    this.NOTE_ID = NOTE_ID;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Unique ID of the Note record being linked")
  @JsonProperty("NOTE_ID")
  public Long getNOTEID() {
    return NOTE_ID;
  }
  public void setNOTEID(Long NOTE_ID) {
    this.NOTE_ID = NOTE_ID;
  }

  
  /**
   * Unique ID for a Contact linked to the Note
   **/
  public APINoteLink CONTACT_ID(Long CONTACT_ID) {
    this.CONTACT_ID = CONTACT_ID;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Unique ID for a Contact linked to the Note")
  @JsonProperty("CONTACT_ID")
  public Long getCONTACTID() {
    return CONTACT_ID;
  }
  public void setCONTACTID(Long CONTACT_ID) {
    this.CONTACT_ID = CONTACT_ID;
  }

  
  /**
   * Unique ID for an Organisation linked to the Note
   **/
  public APINoteLink ORGANISATION_ID(Long ORGANISATION_ID) {
    this.ORGANISATION_ID = ORGANISATION_ID;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Unique ID for an Organisation linked to the Note")
  @JsonProperty("ORGANISATION_ID")
  public Long getORGANISATIONID() {
    return ORGANISATION_ID;
  }
  public void setORGANISATIONID(Long ORGANISATION_ID) {
    this.ORGANISATION_ID = ORGANISATION_ID;
  }

  
  /**
   * Unique ID for an Opportunity linked to the Note
   **/
  public APINoteLink OPPORTUNITY_ID(Long OPPORTUNITY_ID) {
    this.OPPORTUNITY_ID = OPPORTUNITY_ID;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Unique ID for an Opportunity linked to the Note")
  @JsonProperty("OPPORTUNITY_ID")
  public Long getOPPORTUNITYID() {
    return OPPORTUNITY_ID;
  }
  public void setOPPORTUNITYID(Long OPPORTUNITY_ID) {
    this.OPPORTUNITY_ID = OPPORTUNITY_ID;
  }

  
  /**
   * Unique ID for a Project linked to the Note
   **/
  public APINoteLink PROJECT_ID(Long PROJECT_ID) {
    this.PROJECT_ID = PROJECT_ID;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Unique ID for a Project linked to the Note")
  @JsonProperty("PROJECT_ID")
  public Long getPROJECTID() {
    return PROJECT_ID;
  }
  public void setPROJECTID(Long PROJECT_ID) {
    this.PROJECT_ID = PROJECT_ID;
  }

  
  /**
   * Unique ID for a Lead linked to the Note
   **/
  public APINoteLink LEAD_ID(Long LEAD_ID) {
    this.LEAD_ID = LEAD_ID;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Unique ID for a Lead linked to the Note")
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
    APINoteLink aPINoteLink = (APINoteLink) o;
    return Objects.equals(this.NOTE_LINK_ID, aPINoteLink.NOTE_LINK_ID) &&
        Objects.equals(this.NOTE_ID, aPINoteLink.NOTE_ID) &&
        Objects.equals(this.CONTACT_ID, aPINoteLink.CONTACT_ID) &&
        Objects.equals(this.ORGANISATION_ID, aPINoteLink.ORGANISATION_ID) &&
        Objects.equals(this.OPPORTUNITY_ID, aPINoteLink.OPPORTUNITY_ID) &&
        Objects.equals(this.PROJECT_ID, aPINoteLink.PROJECT_ID) &&
        Objects.equals(this.LEAD_ID, aPINoteLink.LEAD_ID);
  }

  @Override
  public int hashCode() {
    return Objects.hash(NOTE_LINK_ID, NOTE_ID, CONTACT_ID, ORGANISATION_ID, OPPORTUNITY_ID, PROJECT_ID, LEAD_ID);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class APINoteLink {\n");
    
    sb.append("    NOTE_LINK_ID: ").append(toIndentedString(NOTE_LINK_ID)).append("\n");
    sb.append("    NOTE_ID: ").append(toIndentedString(NOTE_ID)).append("\n");
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

