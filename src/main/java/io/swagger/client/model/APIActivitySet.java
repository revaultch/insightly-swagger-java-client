package io.swagger.client.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.client.model.APIActivity;
import java.util.ArrayList;
import java.util.List;



/**
 * APIActivitySet
 **/

@ApiModel(description = "APIActivitySet")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-02-24T20:33:55.547+01:00")
public class APIActivitySet   {
  
  private Long ACTIVITYSET_ID = null;
  private String NAME = null;
  private Boolean FOR_CONTACTS = null;
  private Boolean FOR_ORGANISATIONS = null;
  private Boolean FOR_OPPORTUNITIES = null;
  private Boolean FOR_PROJECTS = null;
  private Boolean FOR_LEADS = null;
  private Integer OWNER_USER_ID = null;
  private List<APIActivity> ACTIVITIES = new ArrayList<APIActivity>();

  
  /**
   * Unique ID for the Activity Set record.
   **/
  public APIActivitySet ACTIVITYSET_ID(Long ACTIVITYSET_ID) {
    this.ACTIVITYSET_ID = ACTIVITYSET_ID;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Unique ID for the Activity Set record.")
  @JsonProperty("ACTIVITYSET_ID")
  public Long getACTIVITYSETID() {
    return ACTIVITYSET_ID;
  }
  public void setACTIVITYSETID(Long ACTIVITYSET_ID) {
    this.ACTIVITYSET_ID = ACTIVITYSET_ID;
  }

  
  /**
   * The name for the Activity Set.
   **/
  public APIActivitySet NAME(String NAME) {
    this.NAME = NAME;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The name for the Activity Set.")
  @JsonProperty("NAME")
  public String getNAME() {
    return NAME;
  }
  public void setNAME(String NAME) {
    this.NAME = NAME;
  }

  
  /**
   * Whether or not the Activity Set is assignable to Contacts.
   **/
  public APIActivitySet FOR_CONTACTS(Boolean FOR_CONTACTS) {
    this.FOR_CONTACTS = FOR_CONTACTS;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Whether or not the Activity Set is assignable to Contacts.")
  @JsonProperty("FOR_CONTACTS")
  public Boolean getFORCONTACTS() {
    return FOR_CONTACTS;
  }
  public void setFORCONTACTS(Boolean FOR_CONTACTS) {
    this.FOR_CONTACTS = FOR_CONTACTS;
  }

  
  /**
   * Whether or not the Activity Set is assignable to Organisations.
   **/
  public APIActivitySet FOR_ORGANISATIONS(Boolean FOR_ORGANISATIONS) {
    this.FOR_ORGANISATIONS = FOR_ORGANISATIONS;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Whether or not the Activity Set is assignable to Organisations.")
  @JsonProperty("FOR_ORGANISATIONS")
  public Boolean getFORORGANISATIONS() {
    return FOR_ORGANISATIONS;
  }
  public void setFORORGANISATIONS(Boolean FOR_ORGANISATIONS) {
    this.FOR_ORGANISATIONS = FOR_ORGANISATIONS;
  }

  
  /**
   * Whether or not the Activity Set is assignable to Opportunities.
   **/
  public APIActivitySet FOR_OPPORTUNITIES(Boolean FOR_OPPORTUNITIES) {
    this.FOR_OPPORTUNITIES = FOR_OPPORTUNITIES;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Whether or not the Activity Set is assignable to Opportunities.")
  @JsonProperty("FOR_OPPORTUNITIES")
  public Boolean getFOROPPORTUNITIES() {
    return FOR_OPPORTUNITIES;
  }
  public void setFOROPPORTUNITIES(Boolean FOR_OPPORTUNITIES) {
    this.FOR_OPPORTUNITIES = FOR_OPPORTUNITIES;
  }

  
  /**
   * Whether or not the Activity Set is assignable to Projects.
   **/
  public APIActivitySet FOR_PROJECTS(Boolean FOR_PROJECTS) {
    this.FOR_PROJECTS = FOR_PROJECTS;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Whether or not the Activity Set is assignable to Projects.")
  @JsonProperty("FOR_PROJECTS")
  public Boolean getFORPROJECTS() {
    return FOR_PROJECTS;
  }
  public void setFORPROJECTS(Boolean FOR_PROJECTS) {
    this.FOR_PROJECTS = FOR_PROJECTS;
  }

  
  /**
   * Whether or not the Activity Set is assignable to Leads.
   **/
  public APIActivitySet FOR_LEADS(Boolean FOR_LEADS) {
    this.FOR_LEADS = FOR_LEADS;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Whether or not the Activity Set is assignable to Leads.")
  @JsonProperty("FOR_LEADS")
  public Boolean getFORLEADS() {
    return FOR_LEADS;
  }
  public void setFORLEADS(Boolean FOR_LEADS) {
    this.FOR_LEADS = FOR_LEADS;
  }

  
  /**
   * The unique ID for the Owner of the Activity.
   **/
  public APIActivitySet OWNER_USER_ID(Integer OWNER_USER_ID) {
    this.OWNER_USER_ID = OWNER_USER_ID;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The unique ID for the Owner of the Activity.")
  @JsonProperty("OWNER_USER_ID")
  public Integer getOWNERUSERID() {
    return OWNER_USER_ID;
  }
  public void setOWNERUSERID(Integer OWNER_USER_ID) {
    this.OWNER_USER_ID = OWNER_USER_ID;
  }

  
  /**
   * The list of Activities that belong to the Activity Set.
   **/
  public APIActivitySet ACTIVITIES(List<APIActivity> ACTIVITIES) {
    this.ACTIVITIES = ACTIVITIES;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The list of Activities that belong to the Activity Set.")
  @JsonProperty("ACTIVITIES")
  public List<APIActivity> getACTIVITIES() {
    return ACTIVITIES;
  }
  public void setACTIVITIES(List<APIActivity> ACTIVITIES) {
    this.ACTIVITIES = ACTIVITIES;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    APIActivitySet aPIActivitySet = (APIActivitySet) o;
    return Objects.equals(this.ACTIVITYSET_ID, aPIActivitySet.ACTIVITYSET_ID) &&
        Objects.equals(this.NAME, aPIActivitySet.NAME) &&
        Objects.equals(this.FOR_CONTACTS, aPIActivitySet.FOR_CONTACTS) &&
        Objects.equals(this.FOR_ORGANISATIONS, aPIActivitySet.FOR_ORGANISATIONS) &&
        Objects.equals(this.FOR_OPPORTUNITIES, aPIActivitySet.FOR_OPPORTUNITIES) &&
        Objects.equals(this.FOR_PROJECTS, aPIActivitySet.FOR_PROJECTS) &&
        Objects.equals(this.FOR_LEADS, aPIActivitySet.FOR_LEADS) &&
        Objects.equals(this.OWNER_USER_ID, aPIActivitySet.OWNER_USER_ID) &&
        Objects.equals(this.ACTIVITIES, aPIActivitySet.ACTIVITIES);
  }

  @Override
  public int hashCode() {
    return Objects.hash(ACTIVITYSET_ID, NAME, FOR_CONTACTS, FOR_ORGANISATIONS, FOR_OPPORTUNITIES, FOR_PROJECTS, FOR_LEADS, OWNER_USER_ID, ACTIVITIES);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class APIActivitySet {\n");
    
    sb.append("    ACTIVITYSET_ID: ").append(toIndentedString(ACTIVITYSET_ID)).append("\n");
    sb.append("    NAME: ").append(toIndentedString(NAME)).append("\n");
    sb.append("    FOR_CONTACTS: ").append(toIndentedString(FOR_CONTACTS)).append("\n");
    sb.append("    FOR_ORGANISATIONS: ").append(toIndentedString(FOR_ORGANISATIONS)).append("\n");
    sb.append("    FOR_OPPORTUNITIES: ").append(toIndentedString(FOR_OPPORTUNITIES)).append("\n");
    sb.append("    FOR_PROJECTS: ").append(toIndentedString(FOR_PROJECTS)).append("\n");
    sb.append("    FOR_LEADS: ").append(toIndentedString(FOR_LEADS)).append("\n");
    sb.append("    OWNER_USER_ID: ").append(toIndentedString(OWNER_USER_ID)).append("\n");
    sb.append("    ACTIVITIES: ").append(toIndentedString(ACTIVITIES)).append("\n");
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

