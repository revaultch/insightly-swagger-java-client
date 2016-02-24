package io.swagger.client.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;



/**
 * API object for a link email address.
 **/

@ApiModel(description = "API object for a link email address.")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-02-24T20:33:55.547+01:00")
public class APILinkEmailAddress   {
  
  private String EMAIL = null;

  
  /**
   * Email address.
   **/
  public APILinkEmailAddress EMAIL(String EMAIL) {
    this.EMAIL = EMAIL;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Email address.")
  @JsonProperty("EMAIL")
  public String getEMAIL() {
    return EMAIL;
  }
  public void setEMAIL(String EMAIL) {
    this.EMAIL = EMAIL;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    APILinkEmailAddress aPILinkEmailAddress = (APILinkEmailAddress) o;
    return Objects.equals(this.EMAIL, aPILinkEmailAddress.EMAIL);
  }

  @Override
  public int hashCode() {
    return Objects.hash(EMAIL);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class APILinkEmailAddress {\n");
    
    sb.append("    EMAIL: ").append(toIndentedString(EMAIL)).append("\n");
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

