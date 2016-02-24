package io.swagger.client.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;



/**
 * APICategory
 **/

@ApiModel(description = "APICategory")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-02-24T20:33:55.547+01:00")
public class APICategory   {
  
  private Long CATEGORY_ID = null;
  private String CATEGORY_NAME = null;
  private Boolean ACTIVE = null;
  private String BACKGROUND_COLOR = null;

  
  /**
   * Unique ID for the category record
   **/
  public APICategory CATEGORY_ID(Long CATEGORY_ID) {
    this.CATEGORY_ID = CATEGORY_ID;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Unique ID for the category record")
  @JsonProperty("CATEGORY_ID")
  public Long getCATEGORYID() {
    return CATEGORY_ID;
  }
  public void setCATEGORYID(Long CATEGORY_ID) {
    this.CATEGORY_ID = CATEGORY_ID;
  }

  
  /**
   * Name of the Category
   **/
  public APICategory CATEGORY_NAME(String CATEGORY_NAME) {
    this.CATEGORY_NAME = CATEGORY_NAME;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Name of the Category")
  @JsonProperty("CATEGORY_NAME")
  public String getCATEGORYNAME() {
    return CATEGORY_NAME;
  }
  public void setCATEGORYNAME(String CATEGORY_NAME) {
    this.CATEGORY_NAME = CATEGORY_NAME;
  }

  
  /**
   * True, if the Category is active
   **/
  public APICategory ACTIVE(Boolean ACTIVE) {
    this.ACTIVE = ACTIVE;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "True, if the Category is active")
  @JsonProperty("ACTIVE")
  public Boolean getACTIVE() {
    return ACTIVE;
  }
  public void setACTIVE(Boolean ACTIVE) {
    this.ACTIVE = ACTIVE;
  }

  
  /**
   * The background color that will be displayed in the UI, in hex RGB, e.g. FF4A00 for Insightly orange
   **/
  public APICategory BACKGROUND_COLOR(String BACKGROUND_COLOR) {
    this.BACKGROUND_COLOR = BACKGROUND_COLOR;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The background color that will be displayed in the UI, in hex RGB, e.g. FF4A00 for Insightly orange")
  @JsonProperty("BACKGROUND_COLOR")
  public String getBACKGROUNDCOLOR() {
    return BACKGROUND_COLOR;
  }
  public void setBACKGROUNDCOLOR(String BACKGROUND_COLOR) {
    this.BACKGROUND_COLOR = BACKGROUND_COLOR;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    APICategory aPICategory = (APICategory) o;
    return Objects.equals(this.CATEGORY_ID, aPICategory.CATEGORY_ID) &&
        Objects.equals(this.CATEGORY_NAME, aPICategory.CATEGORY_NAME) &&
        Objects.equals(this.ACTIVE, aPICategory.ACTIVE) &&
        Objects.equals(this.BACKGROUND_COLOR, aPICategory.BACKGROUND_COLOR);
  }

  @Override
  public int hashCode() {
    return Objects.hash(CATEGORY_ID, CATEGORY_NAME, ACTIVE, BACKGROUND_COLOR);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class APICategory {\n");
    
    sb.append("    CATEGORY_ID: ").append(toIndentedString(CATEGORY_ID)).append("\n");
    sb.append("    CATEGORY_NAME: ").append(toIndentedString(CATEGORY_NAME)).append("\n");
    sb.append("    ACTIVE: ").append(toIndentedString(ACTIVE)).append("\n");
    sb.append("    BACKGROUND_COLOR: ").append(toIndentedString(BACKGROUND_COLOR)).append("\n");
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

