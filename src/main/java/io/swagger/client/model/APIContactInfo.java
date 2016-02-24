package io.swagger.client.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;



/**
 * APIContactInfo
 **/

@ApiModel(description = "APIContactInfo")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-02-24T20:33:55.547+01:00")
public class APIContactInfo   {
  
  private Long CONTACT_INFO_ID = null;
  private String TYPE = null;
  private String SUBTYPE = null;
  private String LABEL = null;
  private String DETAIL = null;

  
  /**
   * Unique key of the Contact Info record
   **/
  public APIContactInfo CONTACT_INFO_ID(Long CONTACT_INFO_ID) {
    this.CONTACT_INFO_ID = CONTACT_INFO_ID;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Unique key of the Contact Info record")
  @JsonProperty("CONTACT_INFO_ID")
  public Long getCONTACTINFOID() {
    return CONTACT_INFO_ID;
  }
  public void setCONTACTINFOID(Long CONTACT_INFO_ID) {
    this.CONTACT_INFO_ID = CONTACT_INFO_ID;
  }

  
  /**
   * Type of Contact Info
   **/
  public APIContactInfo TYPE(String TYPE) {
    this.TYPE = TYPE;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Type of Contact Info")
  @JsonProperty("TYPE")
  public String getTYPE() {
    return TYPE;
  }
  public void setTYPE(String TYPE) {
    this.TYPE = TYPE;
  }

  
  /**
   * Subtype of Contact Info
   **/
  public APIContactInfo SUBTYPE(String SUBTYPE) {
    this.SUBTYPE = SUBTYPE;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Subtype of Contact Info")
  @JsonProperty("SUBTYPE")
  public String getSUBTYPE() {
    return SUBTYPE;
  }
  public void setSUBTYPE(String SUBTYPE) {
    this.SUBTYPE = SUBTYPE;
  }

  
  /**
   * Label
   **/
  public APIContactInfo LABEL(String LABEL) {
    this.LABEL = LABEL;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Label")
  @JsonProperty("LABEL")
  public String getLABEL() {
    return LABEL;
  }
  public void setLABEL(String LABEL) {
    this.LABEL = LABEL;
  }

  
  /**
   * Detail of the Contact Info
   **/
  public APIContactInfo DETAIL(String DETAIL) {
    this.DETAIL = DETAIL;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Detail of the Contact Info")
  @JsonProperty("DETAIL")
  public String getDETAIL() {
    return DETAIL;
  }
  public void setDETAIL(String DETAIL) {
    this.DETAIL = DETAIL;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    APIContactInfo aPIContactInfo = (APIContactInfo) o;
    return Objects.equals(this.CONTACT_INFO_ID, aPIContactInfo.CONTACT_INFO_ID) &&
        Objects.equals(this.TYPE, aPIContactInfo.TYPE) &&
        Objects.equals(this.SUBTYPE, aPIContactInfo.SUBTYPE) &&
        Objects.equals(this.LABEL, aPIContactInfo.LABEL) &&
        Objects.equals(this.DETAIL, aPIContactInfo.DETAIL);
  }

  @Override
  public int hashCode() {
    return Objects.hash(CONTACT_INFO_ID, TYPE, SUBTYPE, LABEL, DETAIL);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class APIContactInfo {\n");
    
    sb.append("    CONTACT_INFO_ID: ").append(toIndentedString(CONTACT_INFO_ID)).append("\n");
    sb.append("    TYPE: ").append(toIndentedString(TYPE)).append("\n");
    sb.append("    SUBTYPE: ").append(toIndentedString(SUBTYPE)).append("\n");
    sb.append("    LABEL: ").append(toIndentedString(LABEL)).append("\n");
    sb.append("    DETAIL: ").append(toIndentedString(DETAIL)).append("\n");
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

