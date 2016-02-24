package io.swagger.client.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;



/**
 * APIContactLink
 **/

@ApiModel(description = "APIContactLink")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-02-24T20:33:55.547+01:00")
public class APIContactLink   {
  
  private Long CONTACT_LINK_ID = null;
  private Long FIRST_CONTACT_ID = null;
  private Long SECOND_CONTACT_ID = null;
  private Long RELATIONSHIP_ID = null;
  private String DETAILS = null;

  
  /**
   * Unique ID for the Contact Link record
   **/
  public APIContactLink CONTACT_LINK_ID(Long CONTACT_LINK_ID) {
    this.CONTACT_LINK_ID = CONTACT_LINK_ID;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Unique ID for the Contact Link record")
  @JsonProperty("CONTACT_LINK_ID")
  public Long getCONTACTLINKID() {
    return CONTACT_LINK_ID;
  }
  public void setCONTACTLINKID(Long CONTACT_LINK_ID) {
    this.CONTACT_LINK_ID = CONTACT_LINK_ID;
  }

  
  /**
   * Unique ID for a Contact on one side of the relationship
   **/
  public APIContactLink FIRST_CONTACT_ID(Long FIRST_CONTACT_ID) {
    this.FIRST_CONTACT_ID = FIRST_CONTACT_ID;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Unique ID for a Contact on one side of the relationship")
  @JsonProperty("FIRST_CONTACT_ID")
  public Long getFIRSTCONTACTID() {
    return FIRST_CONTACT_ID;
  }
  public void setFIRSTCONTACTID(Long FIRST_CONTACT_ID) {
    this.FIRST_CONTACT_ID = FIRST_CONTACT_ID;
  }

  
  /**
   * Unique ID for a Contact on the other side of the relationship
   **/
  public APIContactLink SECOND_CONTACT_ID(Long SECOND_CONTACT_ID) {
    this.SECOND_CONTACT_ID = SECOND_CONTACT_ID;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Unique ID for a Contact on the other side of the relationship")
  @JsonProperty("SECOND_CONTACT_ID")
  public Long getSECONDCONTACTID() {
    return SECOND_CONTACT_ID;
  }
  public void setSECONDCONTACTID(Long SECOND_CONTACT_ID) {
    this.SECOND_CONTACT_ID = SECOND_CONTACT_ID;
  }

  
  /**
   * Unique ID for the Relationship from First Contact to Second Contact
   **/
  public APIContactLink RELATIONSHIP_ID(Long RELATIONSHIP_ID) {
    this.RELATIONSHIP_ID = RELATIONSHIP_ID;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Unique ID for the Relationship from First Contact to Second Contact")
  @JsonProperty("RELATIONSHIP_ID")
  public Long getRELATIONSHIPID() {
    return RELATIONSHIP_ID;
  }
  public void setRELATIONSHIPID(Long RELATIONSHIP_ID) {
    this.RELATIONSHIP_ID = RELATIONSHIP_ID;
  }

  
  /**
   * Description of the Relationship
   **/
  public APIContactLink DETAILS(String DETAILS) {
    this.DETAILS = DETAILS;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Description of the Relationship")
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
    APIContactLink aPIContactLink = (APIContactLink) o;
    return Objects.equals(this.CONTACT_LINK_ID, aPIContactLink.CONTACT_LINK_ID) &&
        Objects.equals(this.FIRST_CONTACT_ID, aPIContactLink.FIRST_CONTACT_ID) &&
        Objects.equals(this.SECOND_CONTACT_ID, aPIContactLink.SECOND_CONTACT_ID) &&
        Objects.equals(this.RELATIONSHIP_ID, aPIContactLink.RELATIONSHIP_ID) &&
        Objects.equals(this.DETAILS, aPIContactLink.DETAILS);
  }

  @Override
  public int hashCode() {
    return Objects.hash(CONTACT_LINK_ID, FIRST_CONTACT_ID, SECOND_CONTACT_ID, RELATIONSHIP_ID, DETAILS);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class APIContactLink {\n");
    
    sb.append("    CONTACT_LINK_ID: ").append(toIndentedString(CONTACT_LINK_ID)).append("\n");
    sb.append("    FIRST_CONTACT_ID: ").append(toIndentedString(FIRST_CONTACT_ID)).append("\n");
    sb.append("    SECOND_CONTACT_ID: ").append(toIndentedString(SECOND_CONTACT_ID)).append("\n");
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

