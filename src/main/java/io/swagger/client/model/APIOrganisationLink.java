package io.swagger.client.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;



/**
 * APIOrganisationLink
 **/

@ApiModel(description = "APIOrganisationLink")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-02-24T20:33:55.547+01:00")
public class APIOrganisationLink   {
  
  private Long ORG_LINK_ID = null;
  private Long FIRST_ORGANISATION_ID = null;
  private Long SECOND_ORGANISATION_ID = null;
  private Long RELATIONSHIP_ID = null;
  private String DETAILS = null;

  
  /**
   * Unique ID for the Organisation Link record
   **/
  public APIOrganisationLink ORG_LINK_ID(Long ORG_LINK_ID) {
    this.ORG_LINK_ID = ORG_LINK_ID;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Unique ID for the Organisation Link record")
  @JsonProperty("ORG_LINK_ID")
  public Long getORGLINKID() {
    return ORG_LINK_ID;
  }
  public void setORGLINKID(Long ORG_LINK_ID) {
    this.ORG_LINK_ID = ORG_LINK_ID;
  }

  
  /**
   * Unique key of an Organisation on one side of the relationship
   **/
  public APIOrganisationLink FIRST_ORGANISATION_ID(Long FIRST_ORGANISATION_ID) {
    this.FIRST_ORGANISATION_ID = FIRST_ORGANISATION_ID;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Unique key of an Organisation on one side of the relationship")
  @JsonProperty("FIRST_ORGANISATION_ID")
  public Long getFIRSTORGANISATIONID() {
    return FIRST_ORGANISATION_ID;
  }
  public void setFIRSTORGANISATIONID(Long FIRST_ORGANISATION_ID) {
    this.FIRST_ORGANISATION_ID = FIRST_ORGANISATION_ID;
  }

  
  /**
   * Unique key of an Organisation on the other side of the relationship
   **/
  public APIOrganisationLink SECOND_ORGANISATION_ID(Long SECOND_ORGANISATION_ID) {
    this.SECOND_ORGANISATION_ID = SECOND_ORGANISATION_ID;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Unique key of an Organisation on the other side of the relationship")
  @JsonProperty("SECOND_ORGANISATION_ID")
  public Long getSECONDORGANISATIONID() {
    return SECOND_ORGANISATION_ID;
  }
  public void setSECONDORGANISATIONID(Long SECOND_ORGANISATION_ID) {
    this.SECOND_ORGANISATION_ID = SECOND_ORGANISATION_ID;
  }

  
  /**
   * Unique key of the Relationship from first Organisation to second Organisation
   **/
  public APIOrganisationLink RELATIONSHIP_ID(Long RELATIONSHIP_ID) {
    this.RELATIONSHIP_ID = RELATIONSHIP_ID;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Unique key of the Relationship from first Organisation to second Organisation")
  @JsonProperty("RELATIONSHIP_ID")
  public Long getRELATIONSHIPID() {
    return RELATIONSHIP_ID;
  }
  public void setRELATIONSHIPID(Long RELATIONSHIP_ID) {
    this.RELATIONSHIP_ID = RELATIONSHIP_ID;
  }

  
  /**
   * Details about the Relationship
   **/
  public APIOrganisationLink DETAILS(String DETAILS) {
    this.DETAILS = DETAILS;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Details about the Relationship")
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
    APIOrganisationLink aPIOrganisationLink = (APIOrganisationLink) o;
    return Objects.equals(this.ORG_LINK_ID, aPIOrganisationLink.ORG_LINK_ID) &&
        Objects.equals(this.FIRST_ORGANISATION_ID, aPIOrganisationLink.FIRST_ORGANISATION_ID) &&
        Objects.equals(this.SECOND_ORGANISATION_ID, aPIOrganisationLink.SECOND_ORGANISATION_ID) &&
        Objects.equals(this.RELATIONSHIP_ID, aPIOrganisationLink.RELATIONSHIP_ID) &&
        Objects.equals(this.DETAILS, aPIOrganisationLink.DETAILS);
  }

  @Override
  public int hashCode() {
    return Objects.hash(ORG_LINK_ID, FIRST_ORGANISATION_ID, SECOND_ORGANISATION_ID, RELATIONSHIP_ID, DETAILS);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class APIOrganisationLink {\n");
    
    sb.append("    ORG_LINK_ID: ").append(toIndentedString(ORG_LINK_ID)).append("\n");
    sb.append("    FIRST_ORGANISATION_ID: ").append(toIndentedString(FIRST_ORGANISATION_ID)).append("\n");
    sb.append("    SECOND_ORGANISATION_ID: ").append(toIndentedString(SECOND_ORGANISATION_ID)).append("\n");
    sb.append("    RELATIONSHIP_ID: ").append(toIndentedString(RELATIONSHIP_ID)).append("\n");
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

