package io.swagger.client.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.client.model.APINoteLink;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;



/**
 * APINote
 **/

@ApiModel(description = "APINote")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-02-24T20:33:55.547+01:00")
public class APINote   {
  
  private Long NOTE_ID = null;
  private String TITLE = null;
  private String BODY = null;
  private Long LINK_SUBJECT_ID = null;
  private String LINK_SUBJECT_TYPE = null;
  private Integer OWNER_USER_ID = null;
  private Date DATE_CREATED_UTC = null;
  private Date DATE_UPDATED_UTC = null;
  private String VISIBLE_TO = null;
  private Long VISIBLE_TEAM_ID = null;
  private String VISIBLE_USER_IDS = null;
  private List<APINoteLink> NOTELINKS = new ArrayList<APINoteLink>();

  
  /**
   * Unique ID for the Note record
   **/
  public APINote NOTE_ID(Long NOTE_ID) {
    this.NOTE_ID = NOTE_ID;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Unique ID for the Note record")
  @JsonProperty("NOTE_ID")
  public Long getNOTEID() {
    return NOTE_ID;
  }
  public void setNOTEID(Long NOTE_ID) {
    this.NOTE_ID = NOTE_ID;
  }

  
  /**
   * Title of the Note (required)
   **/
  public APINote TITLE(String TITLE) {
    this.TITLE = TITLE;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Title of the Note (required)")
  @JsonProperty("TITLE")
  public String getTITLE() {
    return TITLE;
  }
  public void setTITLE(String TITLE) {
    this.TITLE = TITLE;
  }

  
  /**
   * Body of the Note
   **/
  public APINote BODY(String BODY) {
    this.BODY = BODY;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Body of the Note")
  @JsonProperty("BODY")
  public String getBODY() {
    return BODY;
  }
  public void setBODY(String BODY) {
    this.BODY = BODY;
  }

  
  /**
   * ID of the Contact, Organisation, Opportunity or Project the Note is linked to
   **/
  public APINote LINK_SUBJECT_ID(Long LINK_SUBJECT_ID) {
    this.LINK_SUBJECT_ID = LINK_SUBJECT_ID;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "ID of the Contact, Organisation, Opportunity or Project the Note is linked to")
  @JsonProperty("LINK_SUBJECT_ID")
  public Long getLINKSUBJECTID() {
    return LINK_SUBJECT_ID;
  }
  public void setLINKSUBJECTID(Long LINK_SUBJECT_ID) {
    this.LINK_SUBJECT_ID = LINK_SUBJECT_ID;
  }

  
  /**
   * Link subject type: CONTACT, ORGANISATION, OPPORTUNITY or PROJECT
   **/
  public APINote LINK_SUBJECT_TYPE(String LINK_SUBJECT_TYPE) {
    this.LINK_SUBJECT_TYPE = LINK_SUBJECT_TYPE;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Link subject type: CONTACT, ORGANISATION, OPPORTUNITY or PROJECT")
  @JsonProperty("LINK_SUBJECT_TYPE")
  public String getLINKSUBJECTTYPE() {
    return LINK_SUBJECT_TYPE;
  }
  public void setLINKSUBJECTTYPE(String LINK_SUBJECT_TYPE) {
    this.LINK_SUBJECT_TYPE = LINK_SUBJECT_TYPE;
  }

  
  /**
   * User ID of the Note owner
   **/
  public APINote OWNER_USER_ID(Integer OWNER_USER_ID) {
    this.OWNER_USER_ID = OWNER_USER_ID;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "User ID of the Note owner")
  @JsonProperty("OWNER_USER_ID")
  public Integer getOWNERUSERID() {
    return OWNER_USER_ID;
  }
  public void setOWNERUSERID(Integer OWNER_USER_ID) {
    this.OWNER_USER_ID = OWNER_USER_ID;
  }

  
  /**
   * Date and time Note record created, as Coordinated Universal Time
   **/
  public APINote DATE_CREATED_UTC(Date DATE_CREATED_UTC) {
    this.DATE_CREATED_UTC = DATE_CREATED_UTC;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Date and time Note record created, as Coordinated Universal Time")
  @JsonProperty("DATE_CREATED_UTC")
  public Date getDATECREATEDUTC() {
    return DATE_CREATED_UTC;
  }
  public void setDATECREATEDUTC(Date DATE_CREATED_UTC) {
    this.DATE_CREATED_UTC = DATE_CREATED_UTC;
  }

  
  /**
   * Date and time Note record updated, as Coordinated Universal Time
   **/
  public APINote DATE_UPDATED_UTC(Date DATE_UPDATED_UTC) {
    this.DATE_UPDATED_UTC = DATE_UPDATED_UTC;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Date and time Note record updated, as Coordinated Universal Time")
  @JsonProperty("DATE_UPDATED_UTC")
  public Date getDATEUPDATEDUTC() {
    return DATE_UPDATED_UTC;
  }
  public void setDATEUPDATEDUTC(Date DATE_UPDATED_UTC) {
    this.DATE_UPDATED_UTC = DATE_UPDATED_UTC;
  }

  
  /**
   * Visible To: Everyone, Team, Owner or Individuals
   **/
  public APINote VISIBLE_TO(String VISIBLE_TO) {
    this.VISIBLE_TO = VISIBLE_TO;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Visible To: Everyone, Team, Owner or Individuals")
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
  public APINote VISIBLE_TEAM_ID(Long VISIBLE_TEAM_ID) {
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
   * If VISIBLE_TO is 'Individuals', a comma separated list of User IDs
   **/
  public APINote VISIBLE_USER_IDS(String VISIBLE_USER_IDS) {
    this.VISIBLE_USER_IDS = VISIBLE_USER_IDS;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "If VISIBLE_TO is 'Individuals', a comma separated list of User IDs")
  @JsonProperty("VISIBLE_USER_IDS")
  public String getVISIBLEUSERIDS() {
    return VISIBLE_USER_IDS;
  }
  public void setVISIBLEUSERIDS(String VISIBLE_USER_IDS) {
    this.VISIBLE_USER_IDS = VISIBLE_USER_IDS;
  }

  
  /**
   * Set of Links attached to the Note
   **/
  public APINote NOTELINKS(List<APINoteLink> NOTELINKS) {
    this.NOTELINKS = NOTELINKS;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Set of Links attached to the Note")
  @JsonProperty("NOTELINKS")
  public List<APINoteLink> getNOTELINKS() {
    return NOTELINKS;
  }
  public void setNOTELINKS(List<APINoteLink> NOTELINKS) {
    this.NOTELINKS = NOTELINKS;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    APINote aPINote = (APINote) o;
    return Objects.equals(this.NOTE_ID, aPINote.NOTE_ID) &&
        Objects.equals(this.TITLE, aPINote.TITLE) &&
        Objects.equals(this.BODY, aPINote.BODY) &&
        Objects.equals(this.LINK_SUBJECT_ID, aPINote.LINK_SUBJECT_ID) &&
        Objects.equals(this.LINK_SUBJECT_TYPE, aPINote.LINK_SUBJECT_TYPE) &&
        Objects.equals(this.OWNER_USER_ID, aPINote.OWNER_USER_ID) &&
        Objects.equals(this.DATE_CREATED_UTC, aPINote.DATE_CREATED_UTC) &&
        Objects.equals(this.DATE_UPDATED_UTC, aPINote.DATE_UPDATED_UTC) &&
        Objects.equals(this.VISIBLE_TO, aPINote.VISIBLE_TO) &&
        Objects.equals(this.VISIBLE_TEAM_ID, aPINote.VISIBLE_TEAM_ID) &&
        Objects.equals(this.VISIBLE_USER_IDS, aPINote.VISIBLE_USER_IDS) &&
        Objects.equals(this.NOTELINKS, aPINote.NOTELINKS);
  }

  @Override
  public int hashCode() {
    return Objects.hash(NOTE_ID, TITLE, BODY, LINK_SUBJECT_ID, LINK_SUBJECT_TYPE, OWNER_USER_ID, DATE_CREATED_UTC, DATE_UPDATED_UTC, VISIBLE_TO, VISIBLE_TEAM_ID, VISIBLE_USER_IDS, NOTELINKS);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class APINote {\n");
    
    sb.append("    NOTE_ID: ").append(toIndentedString(NOTE_ID)).append("\n");
    sb.append("    TITLE: ").append(toIndentedString(TITLE)).append("\n");
    sb.append("    BODY: ").append(toIndentedString(BODY)).append("\n");
    sb.append("    LINK_SUBJECT_ID: ").append(toIndentedString(LINK_SUBJECT_ID)).append("\n");
    sb.append("    LINK_SUBJECT_TYPE: ").append(toIndentedString(LINK_SUBJECT_TYPE)).append("\n");
    sb.append("    OWNER_USER_ID: ").append(toIndentedString(OWNER_USER_ID)).append("\n");
    sb.append("    DATE_CREATED_UTC: ").append(toIndentedString(DATE_CREATED_UTC)).append("\n");
    sb.append("    DATE_UPDATED_UTC: ").append(toIndentedString(DATE_UPDATED_UTC)).append("\n");
    sb.append("    VISIBLE_TO: ").append(toIndentedString(VISIBLE_TO)).append("\n");
    sb.append("    VISIBLE_TEAM_ID: ").append(toIndentedString(VISIBLE_TEAM_ID)).append("\n");
    sb.append("    VISIBLE_USER_IDS: ").append(toIndentedString(VISIBLE_USER_IDS)).append("\n");
    sb.append("    NOTELINKS: ").append(toIndentedString(NOTELINKS)).append("\n");
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

