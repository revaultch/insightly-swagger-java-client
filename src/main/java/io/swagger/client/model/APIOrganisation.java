package io.swagger.client.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.client.model.APIAddress;
import io.swagger.client.model.APIContactInfo;
import io.swagger.client.model.APICustomField;
import io.swagger.client.model.APILink;
import io.swagger.client.model.APIOrganisationDate;
import io.swagger.client.model.APIOrganisationLink;
import io.swagger.client.model.APITag;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;



/**
 * APIOrganisation
 **/

@ApiModel(description = "APIOrganisation")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-02-24T20:33:55.547+01:00")
public class APIOrganisation   {
  
  private Long ORGANISATION_ID = null;
  private String ORGANISATION_NAME = null;
  private String BACKGROUND = null;
  private String IMAGE_URL = null;
  private Integer OWNER_USER_ID = null;
  private Date DATE_CREATED_UTC = null;
  private Date DATE_UPDATED_UTC = null;
  private String VISIBLE_TO = null;
  private Long VISIBLE_TEAM_ID = null;
  private String VISIBLE_USER_IDS = null;
  private List<APICustomField> CUSTOMFIELDS = new ArrayList<APICustomField>();
  private List<APIAddress> ADDRESSES = new ArrayList<APIAddress>();
  private List<APIContactInfo> CONTACTINFOS = new ArrayList<APIContactInfo>();
  private List<APIOrganisationDate> DATES = new ArrayList<APIOrganisationDate>();
  private List<APITag> TAGS = new ArrayList<APITag>();
  private List<APILink> LINKS = new ArrayList<APILink>();
  private List<APIOrganisationLink> ORGANISATIONLINKS = new ArrayList<APIOrganisationLink>();

  
  /**
   * Unique ID for the Organisation record
   **/
  public APIOrganisation ORGANISATION_ID(Long ORGANISATION_ID) {
    this.ORGANISATION_ID = ORGANISATION_ID;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Unique ID for the Organisation record")
  @JsonProperty("ORGANISATION_ID")
  public Long getORGANISATIONID() {
    return ORGANISATION_ID;
  }
  public void setORGANISATIONID(Long ORGANISATION_ID) {
    this.ORGANISATION_ID = ORGANISATION_ID;
  }

  
  /**
   * Name of the Organisation (required)
   **/
  public APIOrganisation ORGANISATION_NAME(String ORGANISATION_NAME) {
    this.ORGANISATION_NAME = ORGANISATION_NAME;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Name of the Organisation (required)")
  @JsonProperty("ORGANISATION_NAME")
  public String getORGANISATIONNAME() {
    return ORGANISATION_NAME;
  }
  public void setORGANISATIONNAME(String ORGANISATION_NAME) {
    this.ORGANISATION_NAME = ORGANISATION_NAME;
  }

  
  /**
   * Additional background information
   **/
  public APIOrganisation BACKGROUND(String BACKGROUND) {
    this.BACKGROUND = BACKGROUND;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Additional background information")
  @JsonProperty("BACKGROUND")
  public String getBACKGROUND() {
    return BACKGROUND;
  }
  public void setBACKGROUND(String BACKGROUND) {
    this.BACKGROUND = BACKGROUND;
  }

  
  /**
   * URL of the Image for the Organisation
   **/
  public APIOrganisation IMAGE_URL(String IMAGE_URL) {
    this.IMAGE_URL = IMAGE_URL;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "URL of the Image for the Organisation")
  @JsonProperty("IMAGE_URL")
  public String getIMAGEURL() {
    return IMAGE_URL;
  }
  public void setIMAGEURL(String IMAGE_URL) {
    this.IMAGE_URL = IMAGE_URL;
  }

  
  /**
   * User ID of the Organisation record owner
   **/
  public APIOrganisation OWNER_USER_ID(Integer OWNER_USER_ID) {
    this.OWNER_USER_ID = OWNER_USER_ID;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "User ID of the Organisation record owner")
  @JsonProperty("OWNER_USER_ID")
  public Integer getOWNERUSERID() {
    return OWNER_USER_ID;
  }
  public void setOWNERUSERID(Integer OWNER_USER_ID) {
    this.OWNER_USER_ID = OWNER_USER_ID;
  }

  
  /**
   * Date and time Organisation record created, as Coordinated Universal Time
   **/
  public APIOrganisation DATE_CREATED_UTC(Date DATE_CREATED_UTC) {
    this.DATE_CREATED_UTC = DATE_CREATED_UTC;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Date and time Organisation record created, as Coordinated Universal Time")
  @JsonProperty("DATE_CREATED_UTC")
  public Date getDATECREATEDUTC() {
    return DATE_CREATED_UTC;
  }
  public void setDATECREATEDUTC(Date DATE_CREATED_UTC) {
    this.DATE_CREATED_UTC = DATE_CREATED_UTC;
  }

  
  /**
   * Date and time Organisation record updated, as Coordinated Universal Time
   **/
  public APIOrganisation DATE_UPDATED_UTC(Date DATE_UPDATED_UTC) {
    this.DATE_UPDATED_UTC = DATE_UPDATED_UTC;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Date and time Organisation record updated, as Coordinated Universal Time")
  @JsonProperty("DATE_UPDATED_UTC")
  public Date getDATEUPDATEDUTC() {
    return DATE_UPDATED_UTC;
  }
  public void setDATEUPDATEDUTC(Date DATE_UPDATED_UTC) {
    this.DATE_UPDATED_UTC = DATE_UPDATED_UTC;
  }

  
  /**
   * Visible To: Everyone, Owner, Team or Individuals
   **/
  public APIOrganisation VISIBLE_TO(String VISIBLE_TO) {
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
  public APIOrganisation VISIBLE_TEAM_ID(Long VISIBLE_TEAM_ID) {
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
  public APIOrganisation VISIBLE_USER_IDS(String VISIBLE_USER_IDS) {
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
   * Set of Custom Fields atttached to the Organisation
   **/
  public APIOrganisation CUSTOMFIELDS(List<APICustomField> CUSTOMFIELDS) {
    this.CUSTOMFIELDS = CUSTOMFIELDS;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Set of Custom Fields atttached to the Organisation")
  @JsonProperty("CUSTOMFIELDS")
  public List<APICustomField> getCUSTOMFIELDS() {
    return CUSTOMFIELDS;
  }
  public void setCUSTOMFIELDS(List<APICustomField> CUSTOMFIELDS) {
    this.CUSTOMFIELDS = CUSTOMFIELDS;
  }

  
  /**
   * Set of Addresses attached to the Organisation
   **/
  public APIOrganisation ADDRESSES(List<APIAddress> ADDRESSES) {
    this.ADDRESSES = ADDRESSES;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Set of Addresses attached to the Organisation")
  @JsonProperty("ADDRESSES")
  public List<APIAddress> getADDRESSES() {
    return ADDRESSES;
  }
  public void setADDRESSES(List<APIAddress> ADDRESSES) {
    this.ADDRESSES = ADDRESSES;
  }

  
  /**
   * Set of Contact Infos attached to the Organisation
   **/
  public APIOrganisation CONTACTINFOS(List<APIContactInfo> CONTACTINFOS) {
    this.CONTACTINFOS = CONTACTINFOS;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Set of Contact Infos attached to the Organisation")
  @JsonProperty("CONTACTINFOS")
  public List<APIContactInfo> getCONTACTINFOS() {
    return CONTACTINFOS;
  }
  public void setCONTACTINFOS(List<APIContactInfo> CONTACTINFOS) {
    this.CONTACTINFOS = CONTACTINFOS;
  }

  
  /**
   * Set of Dates to Remember attached to the Organisation
   **/
  public APIOrganisation DATES(List<APIOrganisationDate> DATES) {
    this.DATES = DATES;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Set of Dates to Remember attached to the Organisation")
  @JsonProperty("DATES")
  public List<APIOrganisationDate> getDATES() {
    return DATES;
  }
  public void setDATES(List<APIOrganisationDate> DATES) {
    this.DATES = DATES;
  }

  
  /**
   * Set of Tags attached to the Organisation
   **/
  public APIOrganisation TAGS(List<APITag> TAGS) {
    this.TAGS = TAGS;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Set of Tags attached to the Organisation")
  @JsonProperty("TAGS")
  public List<APITag> getTAGS() {
    return TAGS;
  }
  public void setTAGS(List<APITag> TAGS) {
    this.TAGS = TAGS;
  }

  
  /**
   * Set of Links attached to the Organisation
   **/
  public APIOrganisation LINKS(List<APILink> LINKS) {
    this.LINKS = LINKS;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Set of Links attached to the Organisation")
  @JsonProperty("LINKS")
  public List<APILink> getLINKS() {
    return LINKS;
  }
  public void setLINKS(List<APILink> LINKS) {
    this.LINKS = LINKS;
  }

  
  /**
   * Set of Links to other Organisations attached to the Organisation
   **/
  public APIOrganisation ORGANISATIONLINKS(List<APIOrganisationLink> ORGANISATIONLINKS) {
    this.ORGANISATIONLINKS = ORGANISATIONLINKS;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Set of Links to other Organisations attached to the Organisation")
  @JsonProperty("ORGANISATIONLINKS")
  public List<APIOrganisationLink> getORGANISATIONLINKS() {
    return ORGANISATIONLINKS;
  }
  public void setORGANISATIONLINKS(List<APIOrganisationLink> ORGANISATIONLINKS) {
    this.ORGANISATIONLINKS = ORGANISATIONLINKS;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    APIOrganisation aPIOrganisation = (APIOrganisation) o;
    return Objects.equals(this.ORGANISATION_ID, aPIOrganisation.ORGANISATION_ID) &&
        Objects.equals(this.ORGANISATION_NAME, aPIOrganisation.ORGANISATION_NAME) &&
        Objects.equals(this.BACKGROUND, aPIOrganisation.BACKGROUND) &&
        Objects.equals(this.IMAGE_URL, aPIOrganisation.IMAGE_URL) &&
        Objects.equals(this.OWNER_USER_ID, aPIOrganisation.OWNER_USER_ID) &&
        Objects.equals(this.DATE_CREATED_UTC, aPIOrganisation.DATE_CREATED_UTC) &&
        Objects.equals(this.DATE_UPDATED_UTC, aPIOrganisation.DATE_UPDATED_UTC) &&
        Objects.equals(this.VISIBLE_TO, aPIOrganisation.VISIBLE_TO) &&
        Objects.equals(this.VISIBLE_TEAM_ID, aPIOrganisation.VISIBLE_TEAM_ID) &&
        Objects.equals(this.VISIBLE_USER_IDS, aPIOrganisation.VISIBLE_USER_IDS) &&
        Objects.equals(this.CUSTOMFIELDS, aPIOrganisation.CUSTOMFIELDS) &&
        Objects.equals(this.ADDRESSES, aPIOrganisation.ADDRESSES) &&
        Objects.equals(this.CONTACTINFOS, aPIOrganisation.CONTACTINFOS) &&
        Objects.equals(this.DATES, aPIOrganisation.DATES) &&
        Objects.equals(this.TAGS, aPIOrganisation.TAGS) &&
        Objects.equals(this.LINKS, aPIOrganisation.LINKS) &&
        Objects.equals(this.ORGANISATIONLINKS, aPIOrganisation.ORGANISATIONLINKS);
  }

  @Override
  public int hashCode() {
    return Objects.hash(ORGANISATION_ID, ORGANISATION_NAME, BACKGROUND, IMAGE_URL, OWNER_USER_ID, DATE_CREATED_UTC, DATE_UPDATED_UTC, VISIBLE_TO, VISIBLE_TEAM_ID, VISIBLE_USER_IDS, CUSTOMFIELDS, ADDRESSES, CONTACTINFOS, DATES, TAGS, LINKS, ORGANISATIONLINKS);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class APIOrganisation {\n");
    
    sb.append("    ORGANISATION_ID: ").append(toIndentedString(ORGANISATION_ID)).append("\n");
    sb.append("    ORGANISATION_NAME: ").append(toIndentedString(ORGANISATION_NAME)).append("\n");
    sb.append("    BACKGROUND: ").append(toIndentedString(BACKGROUND)).append("\n");
    sb.append("    IMAGE_URL: ").append(toIndentedString(IMAGE_URL)).append("\n");
    sb.append("    OWNER_USER_ID: ").append(toIndentedString(OWNER_USER_ID)).append("\n");
    sb.append("    DATE_CREATED_UTC: ").append(toIndentedString(DATE_CREATED_UTC)).append("\n");
    sb.append("    DATE_UPDATED_UTC: ").append(toIndentedString(DATE_UPDATED_UTC)).append("\n");
    sb.append("    VISIBLE_TO: ").append(toIndentedString(VISIBLE_TO)).append("\n");
    sb.append("    VISIBLE_TEAM_ID: ").append(toIndentedString(VISIBLE_TEAM_ID)).append("\n");
    sb.append("    VISIBLE_USER_IDS: ").append(toIndentedString(VISIBLE_USER_IDS)).append("\n");
    sb.append("    CUSTOMFIELDS: ").append(toIndentedString(CUSTOMFIELDS)).append("\n");
    sb.append("    ADDRESSES: ").append(toIndentedString(ADDRESSES)).append("\n");
    sb.append("    CONTACTINFOS: ").append(toIndentedString(CONTACTINFOS)).append("\n");
    sb.append("    DATES: ").append(toIndentedString(DATES)).append("\n");
    sb.append("    TAGS: ").append(toIndentedString(TAGS)).append("\n");
    sb.append("    LINKS: ").append(toIndentedString(LINKS)).append("\n");
    sb.append("    ORGANISATIONLINKS: ").append(toIndentedString(ORGANISATIONLINKS)).append("\n");
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

