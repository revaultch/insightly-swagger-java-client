package io.swagger.client.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.client.model.APICustomFieldOption;
import java.util.ArrayList;
import java.util.List;



/**
 * APICustomFieldMetadata
 **/

@ApiModel(description = "APICustomFieldMetadata")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-02-24T20:33:55.547+01:00")
public class APICustomFieldMetadata   {
  
  private String CUSTOM_FIELD_ID = null;
  private Long ORDER_ID = null;
  private String FIELD_FOR = null;
  private String FIELD_NAME = null;
  private String FIELD_TYPE = null;
  private String FIELD_HELP_TEXT = null;
  private Object DEFAULT_VALUE = null;
  private Long GROUP_ID = null;
  private Boolean EDITABLE = null;
  private Boolean VISIBLE = null;
  private List<APICustomFieldOption> CUSTOM_FIELD_OPTIONS = new ArrayList<APICustomFieldOption>();

  
  /**
   * Unique ID for the custom field record
   **/
  public APICustomFieldMetadata CUSTOM_FIELD_ID(String CUSTOM_FIELD_ID) {
    this.CUSTOM_FIELD_ID = CUSTOM_FIELD_ID;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Unique ID for the custom field record")
  @JsonProperty("CUSTOM_FIELD_ID")
  public String getCUSTOMFIELDID() {
    return CUSTOM_FIELD_ID;
  }
  public void setCUSTOMFIELDID(String CUSTOM_FIELD_ID) {
    this.CUSTOM_FIELD_ID = CUSTOM_FIELD_ID;
  }

  
  /**
   * ORDER_ID is required
   **/
  public APICustomFieldMetadata ORDER_ID(Long ORDER_ID) {
    this.ORDER_ID = ORDER_ID;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "ORDER_ID is required")
  @JsonProperty("ORDER_ID")
  public Long getORDERID() {
    return ORDER_ID;
  }
  public void setORDERID(Long ORDER_ID) {
    this.ORDER_ID = ORDER_ID;
  }

  
  /**
   * The type of object this custom field is for: Contact, Organisation, Project or Opportunity
   **/
  public APICustomFieldMetadata FIELD_FOR(String FIELD_FOR) {
    this.FIELD_FOR = FIELD_FOR;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The type of object this custom field is for: Contact, Organisation, Project or Opportunity")
  @JsonProperty("FIELD_FOR")
  public String getFIELDFOR() {
    return FIELD_FOR;
  }
  public void setFIELDFOR(String FIELD_FOR) {
    this.FIELD_FOR = FIELD_FOR;
  }

  
  /**
   * The name of the custom field
   **/
  public APICustomFieldMetadata FIELD_NAME(String FIELD_NAME) {
    this.FIELD_NAME = FIELD_NAME;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The name of the custom field")
  @JsonProperty("FIELD_NAME")
  public String getFIELDNAME() {
    return FIELD_NAME;
  }
  public void setFIELDNAME(String FIELD_NAME) {
    this.FIELD_NAME = FIELD_NAME;
  }

  
  /**
   * The type of data this custom field holds: text, date or dropdown
   **/
  public APICustomFieldMetadata FIELD_TYPE(String FIELD_TYPE) {
    this.FIELD_TYPE = FIELD_TYPE;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The type of data this custom field holds: text, date or dropdown")
  @JsonProperty("FIELD_TYPE")
  public String getFIELDTYPE() {
    return FIELD_TYPE;
  }
  public void setFIELDTYPE(String FIELD_TYPE) {
    this.FIELD_TYPE = FIELD_TYPE;
  }

  
  /**
   * Help text that appears next to the custom field in the UI.
   **/
  public APICustomFieldMetadata FIELD_HELP_TEXT(String FIELD_HELP_TEXT) {
    this.FIELD_HELP_TEXT = FIELD_HELP_TEXT;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Help text that appears next to the custom field in the UI.")
  @JsonProperty("FIELD_HELP_TEXT")
  public String getFIELDHELPTEXT() {
    return FIELD_HELP_TEXT;
  }
  public void setFIELDHELPTEXT(String FIELD_HELP_TEXT) {
    this.FIELD_HELP_TEXT = FIELD_HELP_TEXT;
  }

  
  /**
   * The default value of the custom field
   **/
  public APICustomFieldMetadata DEFAULT_VALUE(Object DEFAULT_VALUE) {
    this.DEFAULT_VALUE = DEFAULT_VALUE;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The default value of the custom field")
  @JsonProperty("DEFAULT_VALUE")
  public Object getDEFAULTVALUE() {
    return DEFAULT_VALUE;
  }
  public void setDEFAULTVALUE(Object DEFAULT_VALUE) {
    this.DEFAULT_VALUE = DEFAULT_VALUE;
  }

  
  /**
   * Unique key of the custom field group
   **/
  public APICustomFieldMetadata GROUP_ID(Long GROUP_ID) {
    this.GROUP_ID = GROUP_ID;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Unique key of the custom field group")
  @JsonProperty("GROUP_ID")
  public Long getGROUPID() {
    return GROUP_ID;
  }
  public void setGROUPID(Long GROUP_ID) {
    this.GROUP_ID = GROUP_ID;
  }

  
  /**
   * Whether or not the field is editable
   **/
  public APICustomFieldMetadata EDITABLE(Boolean EDITABLE) {
    this.EDITABLE = EDITABLE;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Whether or not the field is editable")
  @JsonProperty("EDITABLE")
  public Boolean getEDITABLE() {
    return EDITABLE;
  }
  public void setEDITABLE(Boolean EDITABLE) {
    this.EDITABLE = EDITABLE;
  }

  
  /**
   * Whether or not the field is visible
   **/
  public APICustomFieldMetadata VISIBLE(Boolean VISIBLE) {
    this.VISIBLE = VISIBLE;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Whether or not the field is visible")
  @JsonProperty("VISIBLE")
  public Boolean getVISIBLE() {
    return VISIBLE;
  }
  public void setVISIBLE(Boolean VISIBLE) {
    this.VISIBLE = VISIBLE;
  }

  
  /**
   * A list of option values for a dropdown Custom Field
   **/
  public APICustomFieldMetadata CUSTOM_FIELD_OPTIONS(List<APICustomFieldOption> CUSTOM_FIELD_OPTIONS) {
    this.CUSTOM_FIELD_OPTIONS = CUSTOM_FIELD_OPTIONS;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "A list of option values for a dropdown Custom Field")
  @JsonProperty("CUSTOM_FIELD_OPTIONS")
  public List<APICustomFieldOption> getCUSTOMFIELDOPTIONS() {
    return CUSTOM_FIELD_OPTIONS;
  }
  public void setCUSTOMFIELDOPTIONS(List<APICustomFieldOption> CUSTOM_FIELD_OPTIONS) {
    this.CUSTOM_FIELD_OPTIONS = CUSTOM_FIELD_OPTIONS;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    APICustomFieldMetadata aPICustomFieldMetadata = (APICustomFieldMetadata) o;
    return Objects.equals(this.CUSTOM_FIELD_ID, aPICustomFieldMetadata.CUSTOM_FIELD_ID) &&
        Objects.equals(this.ORDER_ID, aPICustomFieldMetadata.ORDER_ID) &&
        Objects.equals(this.FIELD_FOR, aPICustomFieldMetadata.FIELD_FOR) &&
        Objects.equals(this.FIELD_NAME, aPICustomFieldMetadata.FIELD_NAME) &&
        Objects.equals(this.FIELD_TYPE, aPICustomFieldMetadata.FIELD_TYPE) &&
        Objects.equals(this.FIELD_HELP_TEXT, aPICustomFieldMetadata.FIELD_HELP_TEXT) &&
        Objects.equals(this.DEFAULT_VALUE, aPICustomFieldMetadata.DEFAULT_VALUE) &&
        Objects.equals(this.GROUP_ID, aPICustomFieldMetadata.GROUP_ID) &&
        Objects.equals(this.EDITABLE, aPICustomFieldMetadata.EDITABLE) &&
        Objects.equals(this.VISIBLE, aPICustomFieldMetadata.VISIBLE) &&
        Objects.equals(this.CUSTOM_FIELD_OPTIONS, aPICustomFieldMetadata.CUSTOM_FIELD_OPTIONS);
  }

  @Override
  public int hashCode() {
    return Objects.hash(CUSTOM_FIELD_ID, ORDER_ID, FIELD_FOR, FIELD_NAME, FIELD_TYPE, FIELD_HELP_TEXT, DEFAULT_VALUE, GROUP_ID, EDITABLE, VISIBLE, CUSTOM_FIELD_OPTIONS);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class APICustomFieldMetadata {\n");
    
    sb.append("    CUSTOM_FIELD_ID: ").append(toIndentedString(CUSTOM_FIELD_ID)).append("\n");
    sb.append("    ORDER_ID: ").append(toIndentedString(ORDER_ID)).append("\n");
    sb.append("    FIELD_FOR: ").append(toIndentedString(FIELD_FOR)).append("\n");
    sb.append("    FIELD_NAME: ").append(toIndentedString(FIELD_NAME)).append("\n");
    sb.append("    FIELD_TYPE: ").append(toIndentedString(FIELD_TYPE)).append("\n");
    sb.append("    FIELD_HELP_TEXT: ").append(toIndentedString(FIELD_HELP_TEXT)).append("\n");
    sb.append("    DEFAULT_VALUE: ").append(toIndentedString(DEFAULT_VALUE)).append("\n");
    sb.append("    GROUP_ID: ").append(toIndentedString(GROUP_ID)).append("\n");
    sb.append("    EDITABLE: ").append(toIndentedString(EDITABLE)).append("\n");
    sb.append("    VISIBLE: ").append(toIndentedString(VISIBLE)).append("\n");
    sb.append("    CUSTOM_FIELD_OPTIONS: ").append(toIndentedString(CUSTOM_FIELD_OPTIONS)).append("\n");
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

