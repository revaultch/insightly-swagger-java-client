package io.swagger.client.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;



/**
 * APITeamMember
 **/

@ApiModel(description = "APITeamMember")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-02-24T20:33:55.547+01:00")
public class APITeamMember   {
  
  private Long PERMISSION_ID = null;
  private Long TEAM_ID = null;
  private Integer MEMBER_USER_ID = null;

  
  /**
   * Unique ID for the Team Member record
   **/
  public APITeamMember PERMISSION_ID(Long PERMISSION_ID) {
    this.PERMISSION_ID = PERMISSION_ID;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Unique ID for the Team Member record")
  @JsonProperty("PERMISSION_ID")
  public Long getPERMISSIONID() {
    return PERMISSION_ID;
  }
  public void setPERMISSIONID(Long PERMISSION_ID) {
    this.PERMISSION_ID = PERMISSION_ID;
  }

  
  /**
   * The unique ID for the Team the team membership record describes
   **/
  public APITeamMember TEAM_ID(Long TEAM_ID) {
    this.TEAM_ID = TEAM_ID;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The unique ID for the Team the team membership record describes")
  @JsonProperty("TEAM_ID")
  public Long getTEAMID() {
    return TEAM_ID;
  }
  public void setTEAMID(Long TEAM_ID) {
    this.TEAM_ID = TEAM_ID;
  }

  
  /**
   * The unique ID for the User the team membership record describes
   **/
  public APITeamMember MEMBER_USER_ID(Integer MEMBER_USER_ID) {
    this.MEMBER_USER_ID = MEMBER_USER_ID;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The unique ID for the User the team membership record describes")
  @JsonProperty("MEMBER_USER_ID")
  public Integer getMEMBERUSERID() {
    return MEMBER_USER_ID;
  }
  public void setMEMBERUSERID(Integer MEMBER_USER_ID) {
    this.MEMBER_USER_ID = MEMBER_USER_ID;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    APITeamMember aPITeamMember = (APITeamMember) o;
    return Objects.equals(this.PERMISSION_ID, aPITeamMember.PERMISSION_ID) &&
        Objects.equals(this.TEAM_ID, aPITeamMember.TEAM_ID) &&
        Objects.equals(this.MEMBER_USER_ID, aPITeamMember.MEMBER_USER_ID);
  }

  @Override
  public int hashCode() {
    return Objects.hash(PERMISSION_ID, TEAM_ID, MEMBER_USER_ID);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class APITeamMember {\n");
    
    sb.append("    PERMISSION_ID: ").append(toIndentedString(PERMISSION_ID)).append("\n");
    sb.append("    TEAM_ID: ").append(toIndentedString(TEAM_ID)).append("\n");
    sb.append("    MEMBER_USER_ID: ").append(toIndentedString(MEMBER_USER_ID)).append("\n");
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

