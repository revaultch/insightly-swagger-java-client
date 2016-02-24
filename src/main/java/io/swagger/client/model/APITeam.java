package io.swagger.client.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.client.model.APITeamMember;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;



/**
 * APITeam
 **/

@ApiModel(description = "APITeam")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-02-24T20:33:55.547+01:00")
public class APITeam   {
  
  private Long TEAM_ID = null;
  private String TEAM_NAME = null;
  private Boolean ANONYMOUS_TEAM = null;
  private Date DATE_CREATED_UTC = null;
  private Date DATE_UPDATED_UTC = null;
  private List<APITeamMember> TEAMMEMBERS = new ArrayList<APITeamMember>();

  
  /**
   * Unique ID for the Team record
   **/
  public APITeam TEAM_ID(Long TEAM_ID) {
    this.TEAM_ID = TEAM_ID;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Unique ID for the Team record")
  @JsonProperty("TEAM_ID")
  public Long getTEAMID() {
    return TEAM_ID;
  }
  public void setTEAMID(Long TEAM_ID) {
    this.TEAM_ID = TEAM_ID;
  }

  
  /**
   * Name of the Team
   **/
  public APITeam TEAM_NAME(String TEAM_NAME) {
    this.TEAM_NAME = TEAM_NAME;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Name of the Team")
  @JsonProperty("TEAM_NAME")
  public String getTEAMNAME() {
    return TEAM_NAME;
  }
  public void setTEAMNAME(String TEAM_NAME) {
    this.TEAM_NAME = TEAM_NAME;
  }

  
  /**
   * True, if this Team should not appear in the web UI
   **/
  public APITeam ANONYMOUS_TEAM(Boolean ANONYMOUS_TEAM) {
    this.ANONYMOUS_TEAM = ANONYMOUS_TEAM;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "True, if this Team should not appear in the web UI")
  @JsonProperty("ANONYMOUS_TEAM")
  public Boolean getANONYMOUSTEAM() {
    return ANONYMOUS_TEAM;
  }
  public void setANONYMOUSTEAM(Boolean ANONYMOUS_TEAM) {
    this.ANONYMOUS_TEAM = ANONYMOUS_TEAM;
  }

  
  /**
   * Date and time Team record created, as Coorindated Universal Time
   **/
  public APITeam DATE_CREATED_UTC(Date DATE_CREATED_UTC) {
    this.DATE_CREATED_UTC = DATE_CREATED_UTC;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Date and time Team record created, as Coorindated Universal Time")
  @JsonProperty("DATE_CREATED_UTC")
  public Date getDATECREATEDUTC() {
    return DATE_CREATED_UTC;
  }
  public void setDATECREATEDUTC(Date DATE_CREATED_UTC) {
    this.DATE_CREATED_UTC = DATE_CREATED_UTC;
  }

  
  /**
   * Date and time Team record updated, as Coordinated Universal Time
   **/
  public APITeam DATE_UPDATED_UTC(Date DATE_UPDATED_UTC) {
    this.DATE_UPDATED_UTC = DATE_UPDATED_UTC;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Date and time Team record updated, as Coordinated Universal Time")
  @JsonProperty("DATE_UPDATED_UTC")
  public Date getDATEUPDATEDUTC() {
    return DATE_UPDATED_UTC;
  }
  public void setDATEUPDATEDUTC(Date DATE_UPDATED_UTC) {
    this.DATE_UPDATED_UTC = DATE_UPDATED_UTC;
  }

  
  /**
   * Set of Team Members attached to the Team
   **/
  public APITeam TEAMMEMBERS(List<APITeamMember> TEAMMEMBERS) {
    this.TEAMMEMBERS = TEAMMEMBERS;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Set of Team Members attached to the Team")
  @JsonProperty("TEAMMEMBERS")
  public List<APITeamMember> getTEAMMEMBERS() {
    return TEAMMEMBERS;
  }
  public void setTEAMMEMBERS(List<APITeamMember> TEAMMEMBERS) {
    this.TEAMMEMBERS = TEAMMEMBERS;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    APITeam aPITeam = (APITeam) o;
    return Objects.equals(this.TEAM_ID, aPITeam.TEAM_ID) &&
        Objects.equals(this.TEAM_NAME, aPITeam.TEAM_NAME) &&
        Objects.equals(this.ANONYMOUS_TEAM, aPITeam.ANONYMOUS_TEAM) &&
        Objects.equals(this.DATE_CREATED_UTC, aPITeam.DATE_CREATED_UTC) &&
        Objects.equals(this.DATE_UPDATED_UTC, aPITeam.DATE_UPDATED_UTC) &&
        Objects.equals(this.TEAMMEMBERS, aPITeam.TEAMMEMBERS);
  }

  @Override
  public int hashCode() {
    return Objects.hash(TEAM_ID, TEAM_NAME, ANONYMOUS_TEAM, DATE_CREATED_UTC, DATE_UPDATED_UTC, TEAMMEMBERS);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class APITeam {\n");
    
    sb.append("    TEAM_ID: ").append(toIndentedString(TEAM_ID)).append("\n");
    sb.append("    TEAM_NAME: ").append(toIndentedString(TEAM_NAME)).append("\n");
    sb.append("    ANONYMOUS_TEAM: ").append(toIndentedString(ANONYMOUS_TEAM)).append("\n");
    sb.append("    DATE_CREATED_UTC: ").append(toIndentedString(DATE_CREATED_UTC)).append("\n");
    sb.append("    DATE_UPDATED_UTC: ").append(toIndentedString(DATE_UPDATED_UTC)).append("\n");
    sb.append("    TEAMMEMBERS: ").append(toIndentedString(TEAMMEMBERS)).append("\n");
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

