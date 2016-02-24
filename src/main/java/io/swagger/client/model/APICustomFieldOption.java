package io.swagger.client.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;



/**
 * APICustomFieldOption
 **/

@ApiModel(description = "APICustomFieldOption")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-02-24T20:33:55.547+01:00")
public class APICustomFieldOption   {
  
  private Integer OPTION_ID = null;
  private String OPTION_VALUE = null;
  private Boolean OPTION_DEFAULT = null;

  
  /**
   * The unique id of the option
   **/
  public APICustomFieldOption OPTION_ID(Integer OPTION_ID) {
    this.OPTION_ID = OPTION_ID;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The unique id of the option")
  @JsonProperty("OPTION_ID")
  public Integer getOPTIONID() {
    return OPTION_ID;
  }
  public void setOPTIONID(Integer OPTION_ID) {
    this.OPTION_ID = OPTION_ID;
  }

  
  /**
   * An option value for a dropdown Custom Field
   **/
  public APICustomFieldOption OPTION_VALUE(String OPTION_VALUE) {
    this.OPTION_VALUE = OPTION_VALUE;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "An option value for a dropdown Custom Field")
  @JsonProperty("OPTION_VALUE")
  public String getOPTIONVALUE() {
    return OPTION_VALUE;
  }
  public void setOPTIONVALUE(String OPTION_VALUE) {
    this.OPTION_VALUE = OPTION_VALUE;
  }

  
  /**
   * True, if the option value should be the default
   **/
  public APICustomFieldOption OPTION_DEFAULT(Boolean OPTION_DEFAULT) {
    this.OPTION_DEFAULT = OPTION_DEFAULT;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "True, if the option value should be the default")
  @JsonProperty("OPTION_DEFAULT")
  public Boolean getOPTIONDEFAULT() {
    return OPTION_DEFAULT;
  }
  public void setOPTIONDEFAULT(Boolean OPTION_DEFAULT) {
    this.OPTION_DEFAULT = OPTION_DEFAULT;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    APICustomFieldOption aPICustomFieldOption = (APICustomFieldOption) o;
    return Objects.equals(this.OPTION_ID, aPICustomFieldOption.OPTION_ID) &&
        Objects.equals(this.OPTION_VALUE, aPICustomFieldOption.OPTION_VALUE) &&
        Objects.equals(this.OPTION_DEFAULT, aPICustomFieldOption.OPTION_DEFAULT);
  }

  @Override
  public int hashCode() {
    return Objects.hash(OPTION_ID, OPTION_VALUE, OPTION_DEFAULT);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class APICustomFieldOption {\n");
    
    sb.append("    OPTION_ID: ").append(toIndentedString(OPTION_ID)).append("\n");
    sb.append("    OPTION_VALUE: ").append(toIndentedString(OPTION_VALUE)).append("\n");
    sb.append("    OPTION_DEFAULT: ").append(toIndentedString(OPTION_DEFAULT)).append("\n");
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

