package io.swagger.client.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.client.model.APIAddress;
import io.swagger.client.model.APIContactDate;
import io.swagger.client.model.APIContactInfo;
import io.swagger.client.model.APIContactLink;
import io.swagger.client.model.APICustomField;
import io.swagger.client.model.APILink;
import io.swagger.client.model.APITag;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;



/**
 * APIContact
 **/

@ApiModel(description = "APIContact")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-02-24T20:33:55.547+01:00")
public class APIContact   {
  
  private Long CONTACT_ID = null;
  private String SALUTATION = null;
  private String FIRST_NAME = null;
  private String LAST_NAME = null;
  private String BACKGROUND = null;
  private String IMAGE_URL = null;
  private Long DEFAULT_LINKED_ORGANISATION = null;
  private Integer OWNER_USER_ID = null;
  private Date DATE_CREATED_UTC = null;
  private Date DATE_UPDATED_UTC = null;
  private String VISIBLE_TO = null;
  private Long VISIBLE_TEAM_ID = null;
  private String VISIBLE_USER_IDS = null;
  private List<APICustomField> CUSTOMFIELDS = new ArrayList<APICustomField>();
  private List<APIAddress> ADDRESSES = new ArrayList<APIAddress>();
  private List<APIContactInfo> CONTACTINFOS = new ArrayList<APIContactInfo>();
  private List<APIContactDate> DATES = new ArrayList<APIContactDate>();
  private List<APITag> TAGS = new ArrayList<APITag>();
  private List<APILink> LINKS = new ArrayList<APILink>();
  private List<APIContactLink> CONTACTLINKS = new ArrayList<APIContactLink>();

  
  /**
   * Unique ID for the Contact record
   **/
  public APIContact CONTACT_ID(Long CONTACT_ID) {
    this.CONTACT_ID = CONTACT_ID;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Unique ID for the Contact record")
  @JsonProperty("CONTACT_ID")
  public Long getCONTACTID() {
    return CONTACT_ID;
  }
  public void setCONTACTID(Long CONTACT_ID) {
    this.CONTACT_ID = CONTACT_ID;
  }

  
  /**
   * Salutation
   **/
  public APIContact SALUTATION(String SALUTATION) {
    this.SALUTATION = SALUTATION;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Salutation")
  @JsonProperty("SALUTATION")
  public String getSALUTATION() {
    return SALUTATION;
  }
  public void setSALUTATION(String SALUTATION) {
    this.SALUTATION = SALUTATION;
  }

  
  /**
   * First/Given Name
   **/
  public APIContact FIRST_NAME(String FIRST_NAME) {
    this.FIRST_NAME = FIRST_NAME;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "First/Given Name")
  @JsonProperty("FIRST_NAME")
  public String getFIRSTNAME() {
    return FIRST_NAME;
  }
  public void setFIRSTNAME(String FIRST_NAME) {
    this.FIRST_NAME = FIRST_NAME;
  }

  
  /**
   * Last/Family/Surname of the Contact
   **/
  public APIContact LAST_NAME(String LAST_NAME) {
    this.LAST_NAME = LAST_NAME;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Last/Family/Surname of the Contact")
  @JsonProperty("LAST_NAME")
  public String getLASTNAME() {
    return LAST_NAME;
  }
  public void setLASTNAME(String LAST_NAME) {
    this.LAST_NAME = LAST_NAME;
  }

  
  /**
   * Additional background information
   **/
  public APIContact BACKGROUND(String BACKGROUND) {
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
   * URL of the Image for the Contact.
   **/
  public APIContact IMAGE_URL(String IMAGE_URL) {
    this.IMAGE_URL = IMAGE_URL;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "URL of the Image for the Contact.")
  @JsonProperty("IMAGE_URL")
  public String getIMAGEURL() {
    return IMAGE_URL;
  }
  public void setIMAGEURL(String IMAGE_URL) {
    this.IMAGE_URL = IMAGE_URL;
  }

  
  /**
   * Unique key of the Organisation linked to the Contact, must be a valid ORGANISATION_ID
   **/
  public APIContact DEFAULT_LINKED_ORGANISATION(Long DEFAULT_LINKED_ORGANISATION) {
    this.DEFAULT_LINKED_ORGANISATION = DEFAULT_LINKED_ORGANISATION;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Unique key of the Organisation linked to the Contact, must be a valid ORGANISATION_ID")
  @JsonProperty("DEFAULT_LINKED_ORGANISATION")
  public Long getDEFAULTLINKEDORGANISATION() {
    return DEFAULT_LINKED_ORGANISATION;
  }
  public void setDEFAULTLINKEDORGANISATION(Long DEFAULT_LINKED_ORGANISATION) {
    this.DEFAULT_LINKED_ORGANISATION = DEFAULT_LINKED_ORGANISATION;
  }

  
  /**
   * User ID of the Contact owner
   **/
  public APIContact OWNER_USER_ID(Integer OWNER_USER_ID) {
    this.OWNER_USER_ID = OWNER_USER_ID;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "User ID of the Contact owner")
  @JsonProperty("OWNER_USER_ID")
  public Integer getOWNERUSERID() {
    return OWNER_USER_ID;
  }
  public void setOWNERUSERID(Integer OWNER_USER_ID) {
    this.OWNER_USER_ID = OWNER_USER_ID;
  }

  
  /**
   * Date and time Contact record created, as Coordinated Universal Time
   **/
  public APIContact DATE_CREATED_UTC(Date DATE_CREATED_UTC) {
    this.DATE_CREATED_UTC = DATE_CREATED_UTC;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Date and time Contact record created, as Coordinated Universal Time")
  @JsonProperty("DATE_CREATED_UTC")
  public Date getDATECREATEDUTC() {
    return DATE_CREATED_UTC;
  }
  public void setDATECREATEDUTC(Date DATE_CREATED_UTC) {
    this.DATE_CREATED_UTC = DATE_CREATED_UTC;
  }

  
  /**
   * Date and time Contact record updated, as Coordinated Universal Time
   **/
  public APIContact DATE_UPDATED_UTC(Date DATE_UPDATED_UTC) {
    this.DATE_UPDATED_UTC = DATE_UPDATED_UTC;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Date and time Contact record updated, as Coordinated Universal Time")
  @JsonProperty("DATE_UPDATED_UTC")
  public Date getDATEUPDATEDUTC() {
    return DATE_UPDATED_UTC;
  }
  public void setDATEUPDATEDUTC(Date DATE_UPDATED_UTC) {
    this.DATE_UPDATED_UTC = DATE_UPDATED_UTC;
  }

  
  /**
   * Visible To
   **/
  public APIContact VISIBLE_TO(String VISIBLE_TO) {
    this.VISIBLE_TO = VISIBLE_TO;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Visible To")
  @JsonProperty("VISIBLE_TO")
  public String getVISIBLETO() {
    return VISIBLE_TO;
  }
  public void setVISIBLETO(String VISIBLE_TO) {
    this.VISIBLE_TO = VISIBLE_TO;
  }

  
  /**
   * If VISIBLE_TO is 'Team', then this should be a TEAM_ID
   **/
  public APIContact VISIBLE_TEAM_ID(Long VISIBLE_TEAM_ID) {
    this.VISIBLE_TEAM_ID = VISIBLE_TEAM_ID;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "If VISIBLE_TO is 'Team', then this should be a TEAM_ID")
  @JsonProperty("VISIBLE_TEAM_ID")
  public Long getVISIBLETEAMID() {
    return VISIBLE_TEAM_ID;
  }
  public void setVISIBLETEAMID(Long VISIBLE_TEAM_ID) {
    this.VISIBLE_TEAM_ID = VISIBLE_TEAM_ID;
  }

  
  /**
   * If VISIBLE_TO is 'Individuals, this should be a comma separated list of user IDs
   **/
  public APIContact VISIBLE_USER_IDS(String VISIBLE_USER_IDS) {
    this.VISIBLE_USER_IDS = VISIBLE_USER_IDS;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "If VISIBLE_TO is 'Individuals, this should be a comma separated list of user IDs")
  @JsonProperty("VISIBLE_USER_IDS")
  public String getVISIBLEUSERIDS() {
    return VISIBLE_USER_IDS;
  }
  public void setVISIBLEUSERIDS(String VISIBLE_USER_IDS) {
    this.VISIBLE_USER_IDS = VISIBLE_USER_IDS;
  }

  
  /**
   * Set of custom fields attached to the Contact
   **/
  public APIContact CUSTOMFIELDS(List<APICustomField> CUSTOMFIELDS) {
    this.CUSTOMFIELDS = CUSTOMFIELDS;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Set of custom fields attached to the Contact")
  @JsonProperty("CUSTOMFIELDS")
  public List<APICustomField> getCUSTOMFIELDS() {
    return CUSTOMFIELDS;
  }
  public void setCUSTOMFIELDS(List<APICustomField> CUSTOMFIELDS) {
    this.CUSTOMFIELDS = CUSTOMFIELDS;
  }

  
  /**
   * Set of addresses attached to the Contact
   **/
  public APIContact ADDRESSES(List<APIAddress> ADDRESSES) {
    this.ADDRESSES = ADDRESSES;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Set of addresses attached to the Contact")
  @JsonProperty("ADDRESSES")
  public List<APIAddress> getADDRESSES() {
    return ADDRESSES;
  }
  public void setADDRESSES(List<APIAddress> ADDRESSES) {
    this.ADDRESSES = ADDRESSES;
  }

  
  /**
   * Set of contact infos attached to the Contact
   **/
  public APIContact CONTACTINFOS(List<APIContactInfo> CONTACTINFOS) {
    this.CONTACTINFOS = CONTACTINFOS;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Set of contact infos attached to the Contact")
  @JsonProperty("CONTACTINFOS")
  public List<APIContactInfo> getCONTACTINFOS() {
    return CONTACTINFOS;
  }
  public void setCONTACTINFOS(List<APIContactInfo> CONTACTINFOS) {
    this.CONTACTINFOS = CONTACTINFOS;
  }

  
  /**
   * Set of dates to remember attached to the Contact
   **/
  public APIContact DATES(List<APIContactDate> DATES) {
    this.DATES = DATES;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Set of dates to remember attached to the Contact")
  @JsonProperty("DATES")
  public List<APIContactDate> getDATES() {
    return DATES;
  }
  public void setDATES(List<APIContactDate> DATES) {
    this.DATES = DATES;
  }

  
  /**
   * Set of tags attached to the Contact
   **/
  public APIContact TAGS(List<APITag> TAGS) {
    this.TAGS = TAGS;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Set of tags attached to the Contact")
  @JsonProperty("TAGS")
  public List<APITag> getTAGS() {
    return TAGS;
  }
  public void setTAGS(List<APITag> TAGS) {
    this.TAGS = TAGS;
  }

  
  /**
   * Set of links attached to the Contact
   **/
  public APIContact LINKS(List<APILink> LINKS) {
    this.LINKS = LINKS;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Set of links attached to the Contact")
  @JsonProperty("LINKS")
  public List<APILink> getLINKS() {
    return LINKS;
  }
  public void setLINKS(List<APILink> LINKS) {
    this.LINKS = LINKS;
  }

  
  /**
   * Set of links to other contacts attached to the Contact
   **/
  public APIContact CONTACTLINKS(List<APIContactLink> CONTACTLINKS) {
    this.CONTACTLINKS = CONTACTLINKS;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Set of links to other contacts attached to the Contact")
  @JsonProperty("CONTACTLINKS")
  public List<APIContactLink> getCONTACTLINKS() {
    return CONTACTLINKS;
  }
  public void setCONTACTLINKS(List<APIContactLink> CONTACTLINKS) {
    this.CONTACTLINKS = CONTACTLINKS;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    APIContact aPIContact = (APIContact) o;
    return Objects.equals(this.CONTACT_ID, aPIContact.CONTACT_ID) &&
        Objects.equals(this.SALUTATION, aPIContact.SALUTATION) &&
        Objects.equals(this.FIRST_NAME, aPIContact.FIRST_NAME) &&
        Objects.equals(this.LAST_NAME, aPIContact.LAST_NAME) &&
        Objects.equals(this.BACKGROUND, aPIContact.BACKGROUND) &&
        Objects.equals(this.IMAGE_URL, aPIContact.IMAGE_URL) &&
        Objects.equals(this.DEFAULT_LINKED_ORGANISATION, aPIContact.DEFAULT_LINKED_ORGANISATION) &&
        Objects.equals(this.OWNER_USER_ID, aPIContact.OWNER_USER_ID) &&
        Objects.equals(this.DATE_CREATED_UTC, aPIContact.DATE_CREATED_UTC) &&
        Objects.equals(this.DATE_UPDATED_UTC, aPIContact.DATE_UPDATED_UTC) &&
        Objects.equals(this.VISIBLE_TO, aPIContact.VISIBLE_TO) &&
        Objects.equals(this.VISIBLE_TEAM_ID, aPIContact.VISIBLE_TEAM_ID) &&
        Objects.equals(this.VISIBLE_USER_IDS, aPIContact.VISIBLE_USER_IDS) &&
        Objects.equals(this.CUSTOMFIELDS, aPIContact.CUSTOMFIELDS) &&
        Objects.equals(this.ADDRESSES, aPIContact.ADDRESSES) &&
        Objects.equals(this.CONTACTINFOS, aPIContact.CONTACTINFOS) &&
        Objects.equals(this.DATES, aPIContact.DATES) &&
        Objects.equals(this.TAGS, aPIContact.TAGS) &&
        Objects.equals(this.LINKS, aPIContact.LINKS) &&
        Objects.equals(this.CONTACTLINKS, aPIContact.CONTACTLINKS);
  }

  @Override
  public int hashCode() {
    return Objects.hash(CONTACT_ID, SALUTATION, FIRST_NAME, LAST_NAME, BACKGROUND, IMAGE_URL, DEFAULT_LINKED_ORGANISATION, OWNER_USER_ID, DATE_CREATED_UTC, DATE_UPDATED_UTC, VISIBLE_TO, VISIBLE_TEAM_ID, VISIBLE_USER_IDS, CUSTOMFIELDS, ADDRESSES, CONTACTINFOS, DATES, TAGS, LINKS, CONTACTLINKS);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class APIContact {\n");
    
    sb.append("    CONTACT_ID: ").append(toIndentedString(CONTACT_ID)).append("\n");
    sb.append("    SALUTATION: ").append(toIndentedString(SALUTATION)).append("\n");
    sb.append("    FIRST_NAME: ").append(toIndentedString(FIRST_NAME)).append("\n");
    sb.append("    LAST_NAME: ").append(toIndentedString(LAST_NAME)).append("\n");
    sb.append("    BACKGROUND: ").append(toIndentedString(BACKGROUND)).append("\n");
    sb.append("    IMAGE_URL: ").append(toIndentedString(IMAGE_URL)).append("\n");
    sb.append("    DEFAULT_LINKED_ORGANISATION: ").append(toIndentedString(DEFAULT_LINKED_ORGANISATION)).append("\n");
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
    sb.append("    CONTACTLINKS: ").append(toIndentedString(CONTACTLINKS)).append("\n");
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

