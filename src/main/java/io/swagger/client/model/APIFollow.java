package io.swagger.client.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;



/**
 * APIFollow
 **/

@ApiModel(description = "APIFollow")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-02-24T20:33:55.547+01:00")
public class APIFollow   {
  
  private Boolean FOLLOWING = null;

  
  /**
   * Whether or not a user is following a Contact, Organisation, Opportunity, or Project.
   **/
  public APIFollow FOLLOWING(Boolean FOLLOWING) {
    this.FOLLOWING = FOLLOWING;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Whether or not a user is following a Contact, Organisation, Opportunity, or Project.")
  @JsonProperty("FOLLOWING")
  public Boolean getFOLLOWING() {
    return FOLLOWING;
  }
  public void setFOLLOWING(Boolean FOLLOWING) {
    this.FOLLOWING = FOLLOWING;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    APIFollow aPIFollow = (APIFollow) o;
    return Objects.equals(this.FOLLOWING, aPIFollow.FOLLOWING);
  }

  @Override
  public int hashCode() {
    return Objects.hash(FOLLOWING);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class APIFollow {\n");
    
    sb.append("    FOLLOWING: ").append(toIndentedString(FOLLOWING)).append("\n");
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

