package io.swagger.client.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;



/**
 * APICustomFieldGroup
 **/

@ApiModel(description = "APICustomFieldGroup")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-02-24T20:33:55.547+01:00")
public class APICustomFieldGroup   {
  
  private Long GROUP_ID = null;
  private String GROUP_NAME = null;
  private String GROUP_FOR = null;
  private Integer GROUP_ORDER = null;

  
  /**
   * Unique ID for the custom field group
   **/
  public APICustomFieldGroup GROUP_ID(Long GROUP_ID) {
    this.GROUP_ID = GROUP_ID;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Unique ID for the custom field group")
  @JsonProperty("GROUP_ID")
  public Long getGROUPID() {
    return GROUP_ID;
  }
  public void setGROUPID(Long GROUP_ID) {
    this.GROUP_ID = GROUP_ID;
  }

  
  /**
   * Name of the custom field group
   **/
  public APICustomFieldGroup GROUP_NAME(String GROUP_NAME) {
    this.GROUP_NAME = GROUP_NAME;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Name of the custom field group")
  @JsonProperty("GROUP_NAME")
  public String getGROUPNAME() {
    return GROUP_NAME;
  }
  public void setGROUPNAME(String GROUP_NAME) {
    this.GROUP_NAME = GROUP_NAME;
  }

  
  /**
   * The type of object this group is for: Contact, Organisation, Project or Opportunity
   **/
  public APICustomFieldGroup GROUP_FOR(String GROUP_FOR) {
    this.GROUP_FOR = GROUP_FOR;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The type of object this group is for: Contact, Organisation, Project or Opportunity")
  @JsonProperty("GROUP_FOR")
  public String getGROUPFOR() {
    return GROUP_FOR;
  }
  public void setGROUPFOR(String GROUP_FOR) {
    this.GROUP_FOR = GROUP_FOR;
  }

  
  /**
   * The order of the group
   **/
  public APICustomFieldGroup GROUP_ORDER(Integer GROUP_ORDER) {
    this.GROUP_ORDER = GROUP_ORDER;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The order of the group")
  @JsonProperty("GROUP_ORDER")
  public Integer getGROUPORDER() {
    return GROUP_ORDER;
  }
  public void setGROUPORDER(Integer GROUP_ORDER) {
    this.GROUP_ORDER = GROUP_ORDER;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    APICustomFieldGroup aPICustomFieldGroup = (APICustomFieldGroup) o;
    return Objects.equals(this.GROUP_ID, aPICustomFieldGroup.GROUP_ID) &&
        Objects.equals(this.GROUP_NAME, aPICustomFieldGroup.GROUP_NAME) &&
        Objects.equals(this.GROUP_FOR, aPICustomFieldGroup.GROUP_FOR) &&
        Objects.equals(this.GROUP_ORDER, aPICustomFieldGroup.GROUP_ORDER);
  }

  @Override
  public int hashCode() {
    return Objects.hash(GROUP_ID, GROUP_NAME, GROUP_FOR, GROUP_ORDER);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class APICustomFieldGroup {\n");
    
    sb.append("    GROUP_ID: ").append(toIndentedString(GROUP_ID)).append("\n");
    sb.append("    GROUP_NAME: ").append(toIndentedString(GROUP_NAME)).append("\n");
    sb.append("    GROUP_FOR: ").append(toIndentedString(GROUP_FOR)).append("\n");
    sb.append("    GROUP_ORDER: ").append(toIndentedString(GROUP_ORDER)).append("\n");
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

