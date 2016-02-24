package io.swagger.client.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;



/**
 * APIRelationship
 **/

@ApiModel(description = "APIRelationship")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-02-24T20:33:55.547+01:00")
public class APIRelationship   {
  
  private Long RELATIONSHIP_ID = null;
  private String FORWARD_TITLE = null;
  private String FORWARD = null;
  private String REVERSE_TITLE = null;
  private String REVERSE = null;
  private Boolean FOR_CONTACTS = null;
  private Boolean FOR_ORGANISATIONS = null;

  
  /**
   * Unique ID for the Relationship record.
   **/
  public APIRelationship RELATIONSHIP_ID(Long RELATIONSHIP_ID) {
    this.RELATIONSHIP_ID = RELATIONSHIP_ID;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Unique ID for the Relationship record.")
  @JsonProperty("RELATIONSHIP_ID")
  public Long getRELATIONSHIPID() {
    return RELATIONSHIP_ID;
  }
  public void setRELATIONSHIPID(Long RELATIONSHIP_ID) {
    this.RELATIONSHIP_ID = RELATIONSHIP_ID;
  }

  
  /**
   * Name of the direct Relationship.
   **/
  public APIRelationship FORWARD_TITLE(String FORWARD_TITLE) {
    this.FORWARD_TITLE = FORWARD_TITLE;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Name of the direct Relationship.")
  @JsonProperty("FORWARD_TITLE")
  public String getFORWARDTITLE() {
    return FORWARD_TITLE;
  }
  public void setFORWARDTITLE(String FORWARD_TITLE) {
    this.FORWARD_TITLE = FORWARD_TITLE;
  }

  
  /**
   * Description of the direct Relationship.
   **/
  public APIRelationship FORWARD(String FORWARD) {
    this.FORWARD = FORWARD;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Description of the direct Relationship.")
  @JsonProperty("FORWARD")
  public String getFORWARD() {
    return FORWARD;
  }
  public void setFORWARD(String FORWARD) {
    this.FORWARD = FORWARD;
  }

  
  /**
   * Name of the inverse Relationship.
   **/
  public APIRelationship REVERSE_TITLE(String REVERSE_TITLE) {
    this.REVERSE_TITLE = REVERSE_TITLE;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Name of the inverse Relationship.")
  @JsonProperty("REVERSE_TITLE")
  public String getREVERSETITLE() {
    return REVERSE_TITLE;
  }
  public void setREVERSETITLE(String REVERSE_TITLE) {
    this.REVERSE_TITLE = REVERSE_TITLE;
  }

  
  /**
   * Description of the inverse Relationship.
   **/
  public APIRelationship REVERSE(String REVERSE) {
    this.REVERSE = REVERSE;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Description of the inverse Relationship.")
  @JsonProperty("REVERSE")
  public String getREVERSE() {
    return REVERSE;
  }
  public void setREVERSE(String REVERSE) {
    this.REVERSE = REVERSE;
  }

  
  /**
   * Indicates whether the relationship is availble for linking Contacts.
   **/
  public APIRelationship FOR_CONTACTS(Boolean FOR_CONTACTS) {
    this.FOR_CONTACTS = FOR_CONTACTS;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Indicates whether the relationship is availble for linking Contacts.")
  @JsonProperty("FOR_CONTACTS")
  public Boolean getFORCONTACTS() {
    return FOR_CONTACTS;
  }
  public void setFORCONTACTS(Boolean FOR_CONTACTS) {
    this.FOR_CONTACTS = FOR_CONTACTS;
  }

  
  /**
   * Indicates whether the relationship is availble for linking Organisations.
   **/
  public APIRelationship FOR_ORGANISATIONS(Boolean FOR_ORGANISATIONS) {
    this.FOR_ORGANISATIONS = FOR_ORGANISATIONS;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Indicates whether the relationship is availble for linking Organisations.")
  @JsonProperty("FOR_ORGANISATIONS")
  public Boolean getFORORGANISATIONS() {
    return FOR_ORGANISATIONS;
  }
  public void setFORORGANISATIONS(Boolean FOR_ORGANISATIONS) {
    this.FOR_ORGANISATIONS = FOR_ORGANISATIONS;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    APIRelationship aPIRelationship = (APIRelationship) o;
    return Objects.equals(this.RELATIONSHIP_ID, aPIRelationship.RELATIONSHIP_ID) &&
        Objects.equals(this.FORWARD_TITLE, aPIRelationship.FORWARD_TITLE) &&
        Objects.equals(this.FORWARD, aPIRelationship.FORWARD) &&
        Objects.equals(this.REVERSE_TITLE, aPIRelationship.REVERSE_TITLE) &&
        Objects.equals(this.REVERSE, aPIRelationship.REVERSE) &&
        Objects.equals(this.FOR_CONTACTS, aPIRelationship.FOR_CONTACTS) &&
        Objects.equals(this.FOR_ORGANISATIONS, aPIRelationship.FOR_ORGANISATIONS);
  }

  @Override
  public int hashCode() {
    return Objects.hash(RELATIONSHIP_ID, FORWARD_TITLE, FORWARD, REVERSE_TITLE, REVERSE, FOR_CONTACTS, FOR_ORGANISATIONS);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class APIRelationship {\n");
    
    sb.append("    RELATIONSHIP_ID: ").append(toIndentedString(RELATIONSHIP_ID)).append("\n");
    sb.append("    FORWARD_TITLE: ").append(toIndentedString(FORWARD_TITLE)).append("\n");
    sb.append("    FORWARD: ").append(toIndentedString(FORWARD)).append("\n");
    sb.append("    REVERSE_TITLE: ").append(toIndentedString(REVERSE_TITLE)).append("\n");
    sb.append("    REVERSE: ").append(toIndentedString(REVERSE)).append("\n");
    sb.append("    FOR_CONTACTS: ").append(toIndentedString(FOR_CONTACTS)).append("\n");
    sb.append("    FOR_ORGANISATIONS: ").append(toIndentedString(FOR_ORGANISATIONS)).append("\n");
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

