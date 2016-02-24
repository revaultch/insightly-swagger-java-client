package io.swagger.client.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;



/**
 * Information about a followed record.
 **/

@ApiModel(description = "Information about a followed record.")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-02-24T20:33:55.547+01:00")
public class APIUserFollow   {
  
  private String RECORD_TYPE = null;
  private Long RECORD_ID = null;

  
  /**
   * Type of the followed record. One of the following: EMAIL, NOTE, TASK, CONTACT, ORGANISATION, PROJECT, OPPORTUNITY, LEAD.
   **/
  public APIUserFollow RECORD_TYPE(String RECORD_TYPE) {
    this.RECORD_TYPE = RECORD_TYPE;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Type of the followed record. One of the following: EMAIL, NOTE, TASK, CONTACT, ORGANISATION, PROJECT, OPPORTUNITY, LEAD.")
  @JsonProperty("RECORD_TYPE")
  public String getRECORDTYPE() {
    return RECORD_TYPE;
  }
  public void setRECORDTYPE(String RECORD_TYPE) {
    this.RECORD_TYPE = RECORD_TYPE;
  }

  
  /**
   * ID of the followed record.
   **/
  public APIUserFollow RECORD_ID(Long RECORD_ID) {
    this.RECORD_ID = RECORD_ID;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "ID of the followed record.")
  @JsonProperty("RECORD_ID")
  public Long getRECORDID() {
    return RECORD_ID;
  }
  public void setRECORDID(Long RECORD_ID) {
    this.RECORD_ID = RECORD_ID;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    APIUserFollow aPIUserFollow = (APIUserFollow) o;
    return Objects.equals(this.RECORD_TYPE, aPIUserFollow.RECORD_TYPE) &&
        Objects.equals(this.RECORD_ID, aPIUserFollow.RECORD_ID);
  }

  @Override
  public int hashCode() {
    return Objects.hash(RECORD_TYPE, RECORD_ID);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class APIUserFollow {\n");
    
    sb.append("    RECORD_TYPE: ").append(toIndentedString(RECORD_TYPE)).append("\n");
    sb.append("    RECORD_ID: ").append(toIndentedString(RECORD_ID)).append("\n");
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

