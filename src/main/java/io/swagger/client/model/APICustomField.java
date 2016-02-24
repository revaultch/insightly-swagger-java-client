package io.swagger.client.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;



/**
 * APICustomField
 **/

@ApiModel(description = "APICustomField")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-02-24T20:33:55.547+01:00")
public class APICustomField   {
  
  private String CUSTOM_FIELD_ID = null;
  private Object FIELD_VALUE = null;

  
  /**
   * The unique id of the custom field
   **/
  public APICustomField CUSTOM_FIELD_ID(String CUSTOM_FIELD_ID) {
    this.CUSTOM_FIELD_ID = CUSTOM_FIELD_ID;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The unique id of the custom field")
  @JsonProperty("CUSTOM_FIELD_ID")
  public String getCUSTOMFIELDID() {
    return CUSTOM_FIELD_ID;
  }
  public void setCUSTOMFIELDID(String CUSTOM_FIELD_ID) {
    this.CUSTOM_FIELD_ID = CUSTOM_FIELD_ID;
  }

  
  /**
   * Text, multi-line text, bit, dropdown, date value, numeric value or URL for the Custom Field.
   **/
  public APICustomField FIELD_VALUE(Object FIELD_VALUE) {
    this.FIELD_VALUE = FIELD_VALUE;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Text, multi-line text, bit, dropdown, date value, numeric value or URL for the Custom Field.")
  @JsonProperty("FIELD_VALUE")
  public Object getFIELDVALUE() {
    return FIELD_VALUE;
  }
  public void setFIELDVALUE(Object FIELD_VALUE) {
    this.FIELD_VALUE = FIELD_VALUE;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    APICustomField aPICustomField = (APICustomField) o;
    return Objects.equals(this.CUSTOM_FIELD_ID, aPICustomField.CUSTOM_FIELD_ID) &&
        Objects.equals(this.FIELD_VALUE, aPICustomField.FIELD_VALUE);
  }

  @Override
  public int hashCode() {
    return Objects.hash(CUSTOM_FIELD_ID, FIELD_VALUE);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class APICustomField {\n");
    
    sb.append("    CUSTOM_FIELD_ID: ").append(toIndentedString(CUSTOM_FIELD_ID)).append("\n");
    sb.append("    FIELD_VALUE: ").append(toIndentedString(FIELD_VALUE)).append("\n");
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

