package io.swagger.client.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;



/**
 * API instance object.
 **/

@ApiModel(description = "API instance object.")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-02-24T20:33:55.547+01:00")
public class APIInstance   {
  
  private String INSTANCE_NAME = null;
  private String INSTANCE_SUBDOMAIN = null;
  private String PLAN_NAME = null;

  
  /**
   * Name of your organization
   **/
  public APIInstance INSTANCE_NAME(String INSTANCE_NAME) {
    this.INSTANCE_NAME = INSTANCE_NAME;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Name of your organization")
  @JsonProperty("INSTANCE_NAME")
  public String getINSTANCENAME() {
    return INSTANCE_NAME;
  }
  public void setINSTANCENAME(String INSTANCE_NAME) {
    this.INSTANCE_NAME = INSTANCE_NAME;
  }

  
  /**
   * Sub domain of the instance
   **/
  public APIInstance INSTANCE_SUBDOMAIN(String INSTANCE_SUBDOMAIN) {
    this.INSTANCE_SUBDOMAIN = INSTANCE_SUBDOMAIN;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Sub domain of the instance")
  @JsonProperty("INSTANCE_SUBDOMAIN")
  public String getINSTANCESUBDOMAIN() {
    return INSTANCE_SUBDOMAIN;
  }
  public void setINSTANCESUBDOMAIN(String INSTANCE_SUBDOMAIN) {
    this.INSTANCE_SUBDOMAIN = INSTANCE_SUBDOMAIN;
  }

  
  /**
   * The plan that you have subscribed to
   **/
  public APIInstance PLAN_NAME(String PLAN_NAME) {
    this.PLAN_NAME = PLAN_NAME;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The plan that you have subscribed to")
  @JsonProperty("PLAN_NAME")
  public String getPLANNAME() {
    return PLAN_NAME;
  }
  public void setPLANNAME(String PLAN_NAME) {
    this.PLAN_NAME = PLAN_NAME;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    APIInstance aPIInstance = (APIInstance) o;
    return Objects.equals(this.INSTANCE_NAME, aPIInstance.INSTANCE_NAME) &&
        Objects.equals(this.INSTANCE_SUBDOMAIN, aPIInstance.INSTANCE_SUBDOMAIN) &&
        Objects.equals(this.PLAN_NAME, aPIInstance.PLAN_NAME);
  }

  @Override
  public int hashCode() {
    return Objects.hash(INSTANCE_NAME, INSTANCE_SUBDOMAIN, PLAN_NAME);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class APIInstance {\n");
    
    sb.append("    INSTANCE_NAME: ").append(toIndentedString(INSTANCE_NAME)).append("\n");
    sb.append("    INSTANCE_SUBDOMAIN: ").append(toIndentedString(INSTANCE_SUBDOMAIN)).append("\n");
    sb.append("    PLAN_NAME: ").append(toIndentedString(PLAN_NAME)).append("\n");
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

