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
public class APILeadSource   {
  
  private Long LEAD_SOURCE_ID = null;
  private String LEAD_SOURCE = null;
  private Boolean DEFAULT_VALUE = null;
  private Integer FIELD_ORDER = null;

  
  /**
   * Unique ID for the current Lead Source
   **/
  public APILeadSource LEAD_SOURCE_ID(Long LEAD_SOURCE_ID) {
    this.LEAD_SOURCE_ID = LEAD_SOURCE_ID;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Unique ID for the current Lead Source")
  @JsonProperty("LEAD_SOURCE_ID")
  public Long getLEADSOURCEID() {
    return LEAD_SOURCE_ID;
  }
  public void setLEADSOURCEID(Long LEAD_SOURCE_ID) {
    this.LEAD_SOURCE_ID = LEAD_SOURCE_ID;
  }

  
  /**
   * Lead Source value
   **/
  public APILeadSource LEAD_SOURCE(String LEAD_SOURCE) {
    this.LEAD_SOURCE = LEAD_SOURCE;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Lead Source value")
  @JsonProperty("LEAD_SOURCE")
  public String getLEADSOURCE() {
    return LEAD_SOURCE;
  }
  public void setLEADSOURCE(String LEAD_SOURCE) {
    this.LEAD_SOURCE = LEAD_SOURCE;
  }

  
  /**
   * checks or sets the current Lead source for being the default value
   **/
  public APILeadSource DEFAULT_VALUE(Boolean DEFAULT_VALUE) {
    this.DEFAULT_VALUE = DEFAULT_VALUE;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "checks or sets the current Lead source for being the default value")
  @JsonProperty("DEFAULT_VALUE")
  public Boolean getDEFAULTVALUE() {
    return DEFAULT_VALUE;
  }
  public void setDEFAULTVALUE(Boolean DEFAULT_VALUE) {
    this.DEFAULT_VALUE = DEFAULT_VALUE;
  }

  
  /**
   * Field Order used to retrive list sorted
   **/
  public APILeadSource FIELD_ORDER(Integer FIELD_ORDER) {
    this.FIELD_ORDER = FIELD_ORDER;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Field Order used to retrive list sorted")
  @JsonProperty("FIELD_ORDER")
  public Integer getFIELDORDER() {
    return FIELD_ORDER;
  }
  public void setFIELDORDER(Integer FIELD_ORDER) {
    this.FIELD_ORDER = FIELD_ORDER;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    APILeadSource aPILeadSource = (APILeadSource) o;
    return Objects.equals(this.LEAD_SOURCE_ID, aPILeadSource.LEAD_SOURCE_ID) &&
        Objects.equals(this.LEAD_SOURCE, aPILeadSource.LEAD_SOURCE) &&
        Objects.equals(this.DEFAULT_VALUE, aPILeadSource.DEFAULT_VALUE) &&
        Objects.equals(this.FIELD_ORDER, aPILeadSource.FIELD_ORDER);
  }

  @Override
  public int hashCode() {
    return Objects.hash(LEAD_SOURCE_ID, LEAD_SOURCE, DEFAULT_VALUE, FIELD_ORDER);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class APILeadSource {\n");
    
    sb.append("    LEAD_SOURCE_ID: ").append(toIndentedString(LEAD_SOURCE_ID)).append("\n");
    sb.append("    LEAD_SOURCE: ").append(toIndentedString(LEAD_SOURCE)).append("\n");
    sb.append("    DEFAULT_VALUE: ").append(toIndentedString(DEFAULT_VALUE)).append("\n");
    sb.append("    FIELD_ORDER: ").append(toIndentedString(FIELD_ORDER)).append("\n");
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

