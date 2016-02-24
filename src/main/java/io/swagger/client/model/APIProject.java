package io.swagger.client.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.client.model.APICustomField;
import io.swagger.client.model.APILink;
import io.swagger.client.model.APITag;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;



/**
 * APIProject
 **/

@ApiModel(description = "APIProject")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-02-24T20:33:55.547+01:00")
public class APIProject   {
  
  private Long PROJECT_ID = null;
  private String PROJECT_NAME = null;
  private String STATUS = null;
  private String PROJECT_DETAILS = null;
  private Long OPPORTUNITY_ID = null;
  private Date STARTED_DATE = null;
  private Date COMPLETED_DATE = null;
  private String IMAGE_URL = null;
  private Integer RESPONSIBLE_USER_ID = null;
  private Integer OWNER_USER_ID = null;
  private Date DATE_CREATED_UTC = null;
  private Date DATE_UPDATED_UTC = null;
  private Long CATEGORY_ID = null;
  private Long PIPELINE_ID = null;
  private Long STAGE_ID = null;
  private String VISIBLE_TO = null;
  private Long VISIBLE_TEAM_ID = null;
  private String VISIBLE_USER_IDS = null;
  private List<APICustomField> CUSTOMFIELDS = new ArrayList<APICustomField>();
  private List<APITag> TAGS = new ArrayList<APITag>();
  private List<APILink> LINKS = new ArrayList<APILink>();

  
  /**
   * Unique ID for the Project record
   **/
  public APIProject PROJECT_ID(Long PROJECT_ID) {
    this.PROJECT_ID = PROJECT_ID;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Unique ID for the Project record")
  @JsonProperty("PROJECT_ID")
  public Long getPROJECTID() {
    return PROJECT_ID;
  }
  public void setPROJECTID(Long PROJECT_ID) {
    this.PROJECT_ID = PROJECT_ID;
  }

  
  /**
   * Name of the Project (required)
   **/
  public APIProject PROJECT_NAME(String PROJECT_NAME) {
    this.PROJECT_NAME = PROJECT_NAME;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Name of the Project (required)")
  @JsonProperty("PROJECT_NAME")
  public String getPROJECTNAME() {
    return PROJECT_NAME;
  }
  public void setPROJECTNAME(String PROJECT_NAME) {
    this.PROJECT_NAME = PROJECT_NAME;
  }

  
  /**
   * Status: Abandoned, Cancelled, Completed, Deferred, In Progress or Not Started
   **/
  public APIProject STATUS(String STATUS) {
    this.STATUS = STATUS;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Status: Abandoned, Cancelled, Completed, Deferred, In Progress or Not Started")
  @JsonProperty("STATUS")
  public String getSTATUS() {
    return STATUS;
  }
  public void setSTATUS(String STATUS) {
    this.STATUS = STATUS;
  }

  
  /**
   * Details of the Project
   **/
  public APIProject PROJECT_DETAILS(String PROJECT_DETAILS) {
    this.PROJECT_DETAILS = PROJECT_DETAILS;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Details of the Project")
  @JsonProperty("PROJECT_DETAILS")
  public String getPROJECTDETAILS() {
    return PROJECT_DETAILS;
  }
  public void setPROJECTDETAILS(String PROJECT_DETAILS) {
    this.PROJECT_DETAILS = PROJECT_DETAILS;
  }

  
  /**
   * Unique ID for the Opportunity from which the Project may have been converted
   **/
  public APIProject OPPORTUNITY_ID(Long OPPORTUNITY_ID) {
    this.OPPORTUNITY_ID = OPPORTUNITY_ID;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Unique ID for the Opportunity from which the Project may have been converted")
  @JsonProperty("OPPORTUNITY_ID")
  public Long getOPPORTUNITYID() {
    return OPPORTUNITY_ID;
  }
  public void setOPPORTUNITYID(Long OPPORTUNITY_ID) {
    this.OPPORTUNITY_ID = OPPORTUNITY_ID;
  }

  
  /**
   * Date Project started, in YYYY-MM-DD format
   **/
  public APIProject STARTED_DATE(Date STARTED_DATE) {
    this.STARTED_DATE = STARTED_DATE;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Date Project started, in YYYY-MM-DD format")
  @JsonProperty("STARTED_DATE")
  public Date getSTARTEDDATE() {
    return STARTED_DATE;
  }
  public void setSTARTEDDATE(Date STARTED_DATE) {
    this.STARTED_DATE = STARTED_DATE;
  }

  
  /**
   * Date Project completed, in YYYY-MM-DD format
   **/
  public APIProject COMPLETED_DATE(Date COMPLETED_DATE) {
    this.COMPLETED_DATE = COMPLETED_DATE;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Date Project completed, in YYYY-MM-DD format")
  @JsonProperty("COMPLETED_DATE")
  public Date getCOMPLETEDDATE() {
    return COMPLETED_DATE;
  }
  public void setCOMPLETEDDATE(Date COMPLETED_DATE) {
    this.COMPLETED_DATE = COMPLETED_DATE;
  }

  
  /**
   * URL of the Image for the Project
   **/
  public APIProject IMAGE_URL(String IMAGE_URL) {
    this.IMAGE_URL = IMAGE_URL;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "URL of the Image for the Project")
  @JsonProperty("IMAGE_URL")
  public String getIMAGEURL() {
    return IMAGE_URL;
  }
  public void setIMAGEURL(String IMAGE_URL) {
    this.IMAGE_URL = IMAGE_URL;
  }

  
  /**
   * Responsible user ID
   **/
  public APIProject RESPONSIBLE_USER_ID(Integer RESPONSIBLE_USER_ID) {
    this.RESPONSIBLE_USER_ID = RESPONSIBLE_USER_ID;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Responsible user ID")
  @JsonProperty("RESPONSIBLE_USER_ID")
  public Integer getRESPONSIBLEUSERID() {
    return RESPONSIBLE_USER_ID;
  }
  public void setRESPONSIBLEUSERID(Integer RESPONSIBLE_USER_ID) {
    this.RESPONSIBLE_USER_ID = RESPONSIBLE_USER_ID;
  }

  
  /**
   * User ID of the Project record owner
   **/
  public APIProject OWNER_USER_ID(Integer OWNER_USER_ID) {
    this.OWNER_USER_ID = OWNER_USER_ID;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "User ID of the Project record owner")
  @JsonProperty("OWNER_USER_ID")
  public Integer getOWNERUSERID() {
    return OWNER_USER_ID;
  }
  public void setOWNERUSERID(Integer OWNER_USER_ID) {
    this.OWNER_USER_ID = OWNER_USER_ID;
  }

  
  /**
   * Date and time Project record created, as Coordinated Universal Time
   **/
  public APIProject DATE_CREATED_UTC(Date DATE_CREATED_UTC) {
    this.DATE_CREATED_UTC = DATE_CREATED_UTC;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Date and time Project record created, as Coordinated Universal Time")
  @JsonProperty("DATE_CREATED_UTC")
  public Date getDATECREATEDUTC() {
    return DATE_CREATED_UTC;
  }
  public void setDATECREATEDUTC(Date DATE_CREATED_UTC) {
    this.DATE_CREATED_UTC = DATE_CREATED_UTC;
  }

  
  /**
   * Date and time Project record updated, as Coordinated Universal Time
   **/
  public APIProject DATE_UPDATED_UTC(Date DATE_UPDATED_UTC) {
    this.DATE_UPDATED_UTC = DATE_UPDATED_UTC;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Date and time Project record updated, as Coordinated Universal Time")
  @JsonProperty("DATE_UPDATED_UTC")
  public Date getDATEUPDATEDUTC() {
    return DATE_UPDATED_UTC;
  }
  public void setDATEUPDATEDUTC(Date DATE_UPDATED_UTC) {
    this.DATE_UPDATED_UTC = DATE_UPDATED_UTC;
  }

  
  /**
   * The Category ID of the Project, if it has been assigned to one.
   **/
  public APIProject CATEGORY_ID(Long CATEGORY_ID) {
    this.CATEGORY_ID = CATEGORY_ID;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The Category ID of the Project, if it has been assigned to one.")
  @JsonProperty("CATEGORY_ID")
  public Long getCATEGORYID() {
    return CATEGORY_ID;
  }
  public void setCATEGORYID(Long CATEGORY_ID) {
    this.CATEGORY_ID = CATEGORY_ID;
  }

  
  /**
   * The Pipeline ID that the Project is in, if it has been assigned to one. Note! This is a read-only field, to update the Pipeline please use the /Projects/{id}/Pipeline endpoint.
   **/
  public APIProject PIPELINE_ID(Long PIPELINE_ID) {
    this.PIPELINE_ID = PIPELINE_ID;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The Pipeline ID that the Project is in, if it has been assigned to one. Note! This is a read-only field, to update the Pipeline please use the /Projects/{id}/Pipeline endpoint.")
  @JsonProperty("PIPELINE_ID")
  public Long getPIPELINEID() {
    return PIPELINE_ID;
  }
  public void setPIPELINEID(Long PIPELINE_ID) {
    this.PIPELINE_ID = PIPELINE_ID;
  }

  
  /**
   * The Stage ID of the Stage the Project is in, if it has been assigned to one. Note! This is a read-only field, to update the Pipeline Stage please use the /Projects/{id}/PipelineStage endpoint.
   **/
  public APIProject STAGE_ID(Long STAGE_ID) {
    this.STAGE_ID = STAGE_ID;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The Stage ID of the Stage the Project is in, if it has been assigned to one. Note! This is a read-only field, to update the Pipeline Stage please use the /Projects/{id}/PipelineStage endpoint.")
  @JsonProperty("STAGE_ID")
  public Long getSTAGEID() {
    return STAGE_ID;
  }
  public void setSTAGEID(Long STAGE_ID) {
    this.STAGE_ID = STAGE_ID;
  }

  
  /**
   * Visible To: Everyone, Owner, Team or Individuals
   **/
  public APIProject VISIBLE_TO(String VISIBLE_TO) {
    this.VISIBLE_TO = VISIBLE_TO;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Visible To: Everyone, Owner, Team or Individuals")
  @JsonProperty("VISIBLE_TO")
  public String getVISIBLETO() {
    return VISIBLE_TO;
  }
  public void setVISIBLETO(String VISIBLE_TO) {
    this.VISIBLE_TO = VISIBLE_TO;
  }

  
  /**
   * If VISIBLE_TO is 'Team', the TEAM_ID
   **/
  public APIProject VISIBLE_TEAM_ID(Long VISIBLE_TEAM_ID) {
    this.VISIBLE_TEAM_ID = VISIBLE_TEAM_ID;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "If VISIBLE_TO is 'Team', the TEAM_ID")
  @JsonProperty("VISIBLE_TEAM_ID")
  public Long getVISIBLETEAMID() {
    return VISIBLE_TEAM_ID;
  }
  public void setVISIBLETEAMID(Long VISIBLE_TEAM_ID) {
    this.VISIBLE_TEAM_ID = VISIBLE_TEAM_ID;
  }

  
  /**
   * If VISIBLE_TO is 'Individuals', a comma separated list of user IDs
   **/
  public APIProject VISIBLE_USER_IDS(String VISIBLE_USER_IDS) {
    this.VISIBLE_USER_IDS = VISIBLE_USER_IDS;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "If VISIBLE_TO is 'Individuals', a comma separated list of user IDs")
  @JsonProperty("VISIBLE_USER_IDS")
  public String getVISIBLEUSERIDS() {
    return VISIBLE_USER_IDS;
  }
  public void setVISIBLEUSERIDS(String VISIBLE_USER_IDS) {
    this.VISIBLE_USER_IDS = VISIBLE_USER_IDS;
  }

  
  /**
   * Set of Custom Fields attached to the Project
   **/
  public APIProject CUSTOMFIELDS(List<APICustomField> CUSTOMFIELDS) {
    this.CUSTOMFIELDS = CUSTOMFIELDS;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Set of Custom Fields attached to the Project")
  @JsonProperty("CUSTOMFIELDS")
  public List<APICustomField> getCUSTOMFIELDS() {
    return CUSTOMFIELDS;
  }
  public void setCUSTOMFIELDS(List<APICustomField> CUSTOMFIELDS) {
    this.CUSTOMFIELDS = CUSTOMFIELDS;
  }

  
  /**
   * Set of Tags attached to the Project
   **/
  public APIProject TAGS(List<APITag> TAGS) {
    this.TAGS = TAGS;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Set of Tags attached to the Project")
  @JsonProperty("TAGS")
  public List<APITag> getTAGS() {
    return TAGS;
  }
  public void setTAGS(List<APITag> TAGS) {
    this.TAGS = TAGS;
  }

  
  /**
   * Set of Links attached to the Project
   **/
  public APIProject LINKS(List<APILink> LINKS) {
    this.LINKS = LINKS;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Set of Links attached to the Project")
  @JsonProperty("LINKS")
  public List<APILink> getLINKS() {
    return LINKS;
  }
  public void setLINKS(List<APILink> LINKS) {
    this.LINKS = LINKS;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    APIProject aPIProject = (APIProject) o;
    return Objects.equals(this.PROJECT_ID, aPIProject.PROJECT_ID) &&
        Objects.equals(this.PROJECT_NAME, aPIProject.PROJECT_NAME) &&
        Objects.equals(this.STATUS, aPIProject.STATUS) &&
        Objects.equals(this.PROJECT_DETAILS, aPIProject.PROJECT_DETAILS) &&
        Objects.equals(this.OPPORTUNITY_ID, aPIProject.OPPORTUNITY_ID) &&
        Objects.equals(this.STARTED_DATE, aPIProject.STARTED_DATE) &&
        Objects.equals(this.COMPLETED_DATE, aPIProject.COMPLETED_DATE) &&
        Objects.equals(this.IMAGE_URL, aPIProject.IMAGE_URL) &&
        Objects.equals(this.RESPONSIBLE_USER_ID, aPIProject.RESPONSIBLE_USER_ID) &&
        Objects.equals(this.OWNER_USER_ID, aPIProject.OWNER_USER_ID) &&
        Objects.equals(this.DATE_CREATED_UTC, aPIProject.DATE_CREATED_UTC) &&
        Objects.equals(this.DATE_UPDATED_UTC, aPIProject.DATE_UPDATED_UTC) &&
        Objects.equals(this.CATEGORY_ID, aPIProject.CATEGORY_ID) &&
        Objects.equals(this.PIPELINE_ID, aPIProject.PIPELINE_ID) &&
        Objects.equals(this.STAGE_ID, aPIProject.STAGE_ID) &&
        Objects.equals(this.VISIBLE_TO, aPIProject.VISIBLE_TO) &&
        Objects.equals(this.VISIBLE_TEAM_ID, aPIProject.VISIBLE_TEAM_ID) &&
        Objects.equals(this.VISIBLE_USER_IDS, aPIProject.VISIBLE_USER_IDS) &&
        Objects.equals(this.CUSTOMFIELDS, aPIProject.CUSTOMFIELDS) &&
        Objects.equals(this.TAGS, aPIProject.TAGS) &&
        Objects.equals(this.LINKS, aPIProject.LINKS);
  }

  @Override
  public int hashCode() {
    return Objects.hash(PROJECT_ID, PROJECT_NAME, STATUS, PROJECT_DETAILS, OPPORTUNITY_ID, STARTED_DATE, COMPLETED_DATE, IMAGE_URL, RESPONSIBLE_USER_ID, OWNER_USER_ID, DATE_CREATED_UTC, DATE_UPDATED_UTC, CATEGORY_ID, PIPELINE_ID, STAGE_ID, VISIBLE_TO, VISIBLE_TEAM_ID, VISIBLE_USER_IDS, CUSTOMFIELDS, TAGS, LINKS);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class APIProject {\n");
    
    sb.append("    PROJECT_ID: ").append(toIndentedString(PROJECT_ID)).append("\n");
    sb.append("    PROJECT_NAME: ").append(toIndentedString(PROJECT_NAME)).append("\n");
    sb.append("    STATUS: ").append(toIndentedString(STATUS)).append("\n");
    sb.append("    PROJECT_DETAILS: ").append(toIndentedString(PROJECT_DETAILS)).append("\n");
    sb.append("    OPPORTUNITY_ID: ").append(toIndentedString(OPPORTUNITY_ID)).append("\n");
    sb.append("    STARTED_DATE: ").append(toIndentedString(STARTED_DATE)).append("\n");
    sb.append("    COMPLETED_DATE: ").append(toIndentedString(COMPLETED_DATE)).append("\n");
    sb.append("    IMAGE_URL: ").append(toIndentedString(IMAGE_URL)).append("\n");
    sb.append("    RESPONSIBLE_USER_ID: ").append(toIndentedString(RESPONSIBLE_USER_ID)).append("\n");
    sb.append("    OWNER_USER_ID: ").append(toIndentedString(OWNER_USER_ID)).append("\n");
    sb.append("    DATE_CREATED_UTC: ").append(toIndentedString(DATE_CREATED_UTC)).append("\n");
    sb.append("    DATE_UPDATED_UTC: ").append(toIndentedString(DATE_UPDATED_UTC)).append("\n");
    sb.append("    CATEGORY_ID: ").append(toIndentedString(CATEGORY_ID)).append("\n");
    sb.append("    PIPELINE_ID: ").append(toIndentedString(PIPELINE_ID)).append("\n");
    sb.append("    STAGE_ID: ").append(toIndentedString(STAGE_ID)).append("\n");
    sb.append("    VISIBLE_TO: ").append(toIndentedString(VISIBLE_TO)).append("\n");
    sb.append("    VISIBLE_TEAM_ID: ").append(toIndentedString(VISIBLE_TEAM_ID)).append("\n");
    sb.append("    VISIBLE_USER_IDS: ").append(toIndentedString(VISIBLE_USER_IDS)).append("\n");
    sb.append("    CUSTOMFIELDS: ").append(toIndentedString(CUSTOMFIELDS)).append("\n");
    sb.append("    TAGS: ").append(toIndentedString(TAGS)).append("\n");
    sb.append("    LINKS: ").append(toIndentedString(LINKS)).append("\n");
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

