package io.swagger.client.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;



/**
 * APICountry
 **/

@ApiModel(description = "APICountry")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-02-24T20:33:55.547+01:00")
public class APICountry   {
  
  private String COUNTRY_NAME = null;

  
  /**
   * Country Name
   **/
  public APICountry COUNTRY_NAME(String COUNTRY_NAME) {
    this.COUNTRY_NAME = COUNTRY_NAME;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Country Name")
  @JsonProperty("COUNTRY_NAME")
  public String getCOUNTRYNAME() {
    return COUNTRY_NAME;
  }
  public void setCOUNTRYNAME(String COUNTRY_NAME) {
    this.COUNTRY_NAME = COUNTRY_NAME;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    APICountry aPICountry = (APICountry) o;
    return Objects.equals(this.COUNTRY_NAME, aPICountry.COUNTRY_NAME);
  }

  @Override
  public int hashCode() {
    return Objects.hash(COUNTRY_NAME);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class APICountry {\n");
    
    sb.append("    COUNTRY_NAME: ").append(toIndentedString(COUNTRY_NAME)).append("\n");
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

