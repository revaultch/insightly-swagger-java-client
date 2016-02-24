package io.swagger.client.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.client.model.APICustomField;
import io.swagger.client.model.APITag;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;



/**
 * APILead
 **/

@ApiModel(description = "APILead")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-02-24T20:33:55.547+01:00")
public class APILead   {
  
  private Long LEAD_ID = null;
  private String SALUTATION = null;
  private String TITLE = null;
  private String FIRST_NAME = null;
  private String LAST_NAME = null;
  private String ORGANIZATION_NAME = null;
  private String PHONE_NUMBER = null;
  private String MOBILE_PHONE_NUMBER = null;
  private String FAX_NUMBER = null;
  private String EMAIL_ADDRESS = null;
  private String WEBSITE_URL = null;
  private Integer OWNER_USER_ID = null;
  private Date DATE_CREATED_UTC = null;
  private Date DATE_UPDATED_UTC = null;
  private Boolean CONVERTED = null;
  private Date CONVERTED_DATE_UTC = null;
  private Long CONVERTED_CONTACT_ID = null;
  private Long CONVERTED_ORGANIZATION_ID = null;
  private Long CONVERTED_OPPORTUNITY_ID = null;
  private String VISIBLE_TO = null;
  private Integer RESPONSIBLE_USER_ID = null;
  private String INDUSTRY = null;
  private Long LEAD_STATUS_ID = null;
  private Long LEAD_SOURCE_ID = null;
  private Long VISIBLE_TEAM_ID = null;
  private Integer EMPLOYEE_COUNT = null;
  private Integer LEAD_RATING = null;
  private String LEAD_DESCRIPTION = null;
  private String VISIBLE_USER_IDS = null;
  private List<APICustomField> CUSTOMFIELDS = new ArrayList<APICustomField>();
  private String ADDRESS_STREET = null;
  private String ADDRESS_CITY = null;
  private String ADDRESS_STATE = null;
  private String ADDRESS_POSTCODE = null;
  private String ADDRESS_COUNTRY = null;
  private List<APITag> TAGS = new ArrayList<APITag>();
  private String IMAGE_URL = null;

  
  /**
   * Unique ID for the Lead record
   **/
  public APILead LEAD_ID(Long LEAD_ID) {
    this.LEAD_ID = LEAD_ID;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Unique ID for the Lead record")
  @JsonProperty("LEAD_ID")
  public Long getLEADID() {
    return LEAD_ID;
  }
  public void setLEADID(Long LEAD_ID) {
    this.LEAD_ID = LEAD_ID;
  }

  
  /**
   * Salutation
   **/
  public APILead SALUTATION(String SALUTATION) {
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
   * Salutation
   **/
  public APILead TITLE(String TITLE) {
    this.TITLE = TITLE;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Salutation")
  @JsonProperty("TITLE")
  public String getTITLE() {
    return TITLE;
  }
  public void setTITLE(String TITLE) {
    this.TITLE = TITLE;
  }

  
  /**
   * First/Given Name
   **/
  public APILead FIRST_NAME(String FIRST_NAME) {
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
   * Last/Family/Surname of the Lead
   **/
  public APILead LAST_NAME(String LAST_NAME) {
    this.LAST_NAME = LAST_NAME;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Last/Family/Surname of the Lead")
  @JsonProperty("LAST_NAME")
  public String getLASTNAME() {
    return LAST_NAME;
  }
  public void setLASTNAME(String LAST_NAME) {
    this.LAST_NAME = LAST_NAME;
  }

  
  /**
   * Organisation Name
   **/
  public APILead ORGANIZATION_NAME(String ORGANIZATION_NAME) {
    this.ORGANIZATION_NAME = ORGANIZATION_NAME;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Organisation Name")
  @JsonProperty("ORGANIZATION_NAME")
  public String getORGANIZATIONNAME() {
    return ORGANIZATION_NAME;
  }
  public void setORGANIZATIONNAME(String ORGANIZATION_NAME) {
    this.ORGANIZATION_NAME = ORGANIZATION_NAME;
  }

  
  /**
   * Phone Number
   **/
  public APILead PHONE_NUMBER(String PHONE_NUMBER) {
    this.PHONE_NUMBER = PHONE_NUMBER;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Phone Number")
  @JsonProperty("PHONE_NUMBER")
  public String getPHONENUMBER() {
    return PHONE_NUMBER;
  }
  public void setPHONENUMBER(String PHONE_NUMBER) {
    this.PHONE_NUMBER = PHONE_NUMBER;
  }

  
  /**
   * Mobile Phone Number
   **/
  public APILead MOBILE_PHONE_NUMBER(String MOBILE_PHONE_NUMBER) {
    this.MOBILE_PHONE_NUMBER = MOBILE_PHONE_NUMBER;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Mobile Phone Number")
  @JsonProperty("MOBILE_PHONE_NUMBER")
  public String getMOBILEPHONENUMBER() {
    return MOBILE_PHONE_NUMBER;
  }
  public void setMOBILEPHONENUMBER(String MOBILE_PHONE_NUMBER) {
    this.MOBILE_PHONE_NUMBER = MOBILE_PHONE_NUMBER;
  }

  
  /**
   * Fax Number
   **/
  public APILead FAX_NUMBER(String FAX_NUMBER) {
    this.FAX_NUMBER = FAX_NUMBER;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Fax Number")
  @JsonProperty("FAX_NUMBER")
  public String getFAXNUMBER() {
    return FAX_NUMBER;
  }
  public void setFAXNUMBER(String FAX_NUMBER) {
    this.FAX_NUMBER = FAX_NUMBER;
  }

  
  /**
   * Email Address
   **/
  public APILead EMAIL_ADDRESS(String EMAIL_ADDRESS) {
    this.EMAIL_ADDRESS = EMAIL_ADDRESS;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Email Address")
  @JsonProperty("EMAIL_ADDRESS")
  public String getEMAILADDRESS() {
    return EMAIL_ADDRESS;
  }
  public void setEMAILADDRESS(String EMAIL_ADDRESS) {
    this.EMAIL_ADDRESS = EMAIL_ADDRESS;
  }

  
  /**
   * Website URL Address
   **/
  public APILead WEBSITE_URL(String WEBSITE_URL) {
    this.WEBSITE_URL = WEBSITE_URL;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Website URL Address")
  @JsonProperty("WEBSITE_URL")
  public String getWEBSITEURL() {
    return WEBSITE_URL;
  }
  public void setWEBSITEURL(String WEBSITE_URL) {
    this.WEBSITE_URL = WEBSITE_URL;
  }

  
  /**
   * User ID of the Lead owner
   **/
  public APILead OWNER_USER_ID(Integer OWNER_USER_ID) {
    this.OWNER_USER_ID = OWNER_USER_ID;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "User ID of the Lead owner")
  @JsonProperty("OWNER_USER_ID")
  public Integer getOWNERUSERID() {
    return OWNER_USER_ID;
  }
  public void setOWNERUSERID(Integer OWNER_USER_ID) {
    this.OWNER_USER_ID = OWNER_USER_ID;
  }

  
  /**
   * Date and time Lead record creates, as Coordinated Universal Time (read only, automatically generated by server)
   **/
  public APILead DATE_CREATED_UTC(Date DATE_CREATED_UTC) {
    this.DATE_CREATED_UTC = DATE_CREATED_UTC;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Date and time Lead record creates, as Coordinated Universal Time (read only, automatically generated by server)")
  @JsonProperty("DATE_CREATED_UTC")
  public Date getDATECREATEDUTC() {
    return DATE_CREATED_UTC;
  }
  public void setDATECREATEDUTC(Date DATE_CREATED_UTC) {
    this.DATE_CREATED_UTC = DATE_CREATED_UTC;
  }

  
  /**
   * Date and time Lead record updated, as Coordinated Universal Time (read only, automatically generated by server)
   **/
  public APILead DATE_UPDATED_UTC(Date DATE_UPDATED_UTC) {
    this.DATE_UPDATED_UTC = DATE_UPDATED_UTC;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Date and time Lead record updated, as Coordinated Universal Time (read only, automatically generated by server)")
  @JsonProperty("DATE_UPDATED_UTC")
  public Date getDATEUPDATEDUTC() {
    return DATE_UPDATED_UTC;
  }
  public void setDATEUPDATEDUTC(Date DATE_UPDATED_UTC) {
    this.DATE_UPDATED_UTC = DATE_UPDATED_UTC;
  }

  
  /**
   * IsConverted Lead
   **/
  public APILead CONVERTED(Boolean CONVERTED) {
    this.CONVERTED = CONVERTED;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "IsConverted Lead")
  @JsonProperty("CONVERTED")
  public Boolean getCONVERTED() {
    return CONVERTED;
  }
  public void setCONVERTED(Boolean CONVERTED) {
    this.CONVERTED = CONVERTED;
  }

  
  /**
   * Date and time Lead record converted to opportunity, as Coordinated Universal Time (read only, automatically generated by server)
   **/
  public APILead CONVERTED_DATE_UTC(Date CONVERTED_DATE_UTC) {
    this.CONVERTED_DATE_UTC = CONVERTED_DATE_UTC;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Date and time Lead record converted to opportunity, as Coordinated Universal Time (read only, automatically generated by server)")
  @JsonProperty("CONVERTED_DATE_UTC")
  public Date getCONVERTEDDATEUTC() {
    return CONVERTED_DATE_UTC;
  }
  public void setCONVERTEDDATEUTC(Date CONVERTED_DATE_UTC) {
    this.CONVERTED_DATE_UTC = CONVERTED_DATE_UTC;
  }

  
  /**
   * The Contact ID resulted from a Lead conversion process to Opportunity
   **/
  public APILead CONVERTED_CONTACT_ID(Long CONVERTED_CONTACT_ID) {
    this.CONVERTED_CONTACT_ID = CONVERTED_CONTACT_ID;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The Contact ID resulted from a Lead conversion process to Opportunity")
  @JsonProperty("CONVERTED_CONTACT_ID")
  public Long getCONVERTEDCONTACTID() {
    return CONVERTED_CONTACT_ID;
  }
  public void setCONVERTEDCONTACTID(Long CONVERTED_CONTACT_ID) {
    this.CONVERTED_CONTACT_ID = CONVERTED_CONTACT_ID;
  }

  
  /**
   * The Opportunity ID resulted from a Lead conversion process
   **/
  public APILead CONVERTED_ORGANIZATION_ID(Long CONVERTED_ORGANIZATION_ID) {
    this.CONVERTED_ORGANIZATION_ID = CONVERTED_ORGANIZATION_ID;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The Opportunity ID resulted from a Lead conversion process")
  @JsonProperty("CONVERTED_ORGANIZATION_ID")
  public Long getCONVERTEDORGANIZATIONID() {
    return CONVERTED_ORGANIZATION_ID;
  }
  public void setCONVERTEDORGANIZATIONID(Long CONVERTED_ORGANIZATION_ID) {
    this.CONVERTED_ORGANIZATION_ID = CONVERTED_ORGANIZATION_ID;
  }

  
  /**
   * The Opportunity ID resulted from a Lead conversion process
   **/
  public APILead CONVERTED_OPPORTUNITY_ID(Long CONVERTED_OPPORTUNITY_ID) {
    this.CONVERTED_OPPORTUNITY_ID = CONVERTED_OPPORTUNITY_ID;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The Opportunity ID resulted from a Lead conversion process")
  @JsonProperty("CONVERTED_OPPORTUNITY_ID")
  public Long getCONVERTEDOPPORTUNITYID() {
    return CONVERTED_OPPORTUNITY_ID;
  }
  public void setCONVERTEDOPPORTUNITYID(Long CONVERTED_OPPORTUNITY_ID) {
    this.CONVERTED_OPPORTUNITY_ID = CONVERTED_OPPORTUNITY_ID;
  }

  
  /**
   * This field can have one of the following values: 'Everyone' (Default), 'Owner', 'Team', or 'Individuals'.\"
   **/
  public APILead VISIBLE_TO(String VISIBLE_TO) {
    this.VISIBLE_TO = VISIBLE_TO;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "This field can have one of the following values: 'Everyone' (Default), 'Owner', 'Team', or 'Individuals'.\"")
  @JsonProperty("VISIBLE_TO")
  public String getVISIBLETO() {
    return VISIBLE_TO;
  }
  public void setVISIBLETO(String VISIBLE_TO) {
    this.VISIBLE_TO = VISIBLE_TO;
  }

  
  /**
   * Responsible User's ID.
   **/
  public APILead RESPONSIBLE_USER_ID(Integer RESPONSIBLE_USER_ID) {
    this.RESPONSIBLE_USER_ID = RESPONSIBLE_USER_ID;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Responsible User's ID.")
  @JsonProperty("RESPONSIBLE_USER_ID")
  public Integer getRESPONSIBLEUSERID() {
    return RESPONSIBLE_USER_ID;
  }
  public void setRESPONSIBLEUSERID(Integer RESPONSIBLE_USER_ID) {
    this.RESPONSIBLE_USER_ID = RESPONSIBLE_USER_ID;
  }

  
  /**
   * The associated Industry
   **/
  public APILead INDUSTRY(String INDUSTRY) {
    this.INDUSTRY = INDUSTRY;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The associated Industry")
  @JsonProperty("INDUSTRY")
  public String getINDUSTRY() {
    return INDUSTRY;
  }
  public void setINDUSTRY(String INDUSTRY) {
    this.INDUSTRY = INDUSTRY;
  }

  
  /**
   * Lead Statuses which will be having a value pair of (status and status type) i.e. (Contacted, OPEN) or (Converted, CLOSED)
   **/
  public APILead LEAD_STATUS_ID(Long LEAD_STATUS_ID) {
    this.LEAD_STATUS_ID = LEAD_STATUS_ID;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Lead Statuses which will be having a value pair of (status and status type) i.e. (Contacted, OPEN) or (Converted, CLOSED)")
  @JsonProperty("LEAD_STATUS_ID")
  public Long getLEADSTATUSID() {
    return LEAD_STATUS_ID;
  }
  public void setLEADSTATUSID(Long LEAD_STATUS_ID) {
    this.LEAD_STATUS_ID = LEAD_STATUS_ID;
  }

  
  /**
   * Lead Source i.e. web, phone etc
   **/
  public APILead LEAD_SOURCE_ID(Long LEAD_SOURCE_ID) {
    this.LEAD_SOURCE_ID = LEAD_SOURCE_ID;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Lead Source i.e. web, phone etc")
  @JsonProperty("LEAD_SOURCE_ID")
  public Long getLEADSOURCEID() {
    return LEAD_SOURCE_ID;
  }
  public void setLEADSOURCEID(Long LEAD_SOURCE_ID) {
    this.LEAD_SOURCE_ID = LEAD_SOURCE_ID;
  }

  
  /**
   * If VISIBLE_TO is 'Team', then this should be a Team ID, which must be a valid TEAM_ID record locator.
   **/
  public APILead VISIBLE_TEAM_ID(Long VISIBLE_TEAM_ID) {
    this.VISIBLE_TEAM_ID = VISIBLE_TEAM_ID;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "If VISIBLE_TO is 'Team', then this should be a Team ID, which must be a valid TEAM_ID record locator.")
  @JsonProperty("VISIBLE_TEAM_ID")
  public Long getVISIBLETEAMID() {
    return VISIBLE_TEAM_ID;
  }
  public void setVISIBLETEAMID(Long VISIBLE_TEAM_ID) {
    this.VISIBLE_TEAM_ID = VISIBLE_TEAM_ID;
  }

  
  /**
   * Employee count for the lead's organization
   **/
  public APILead EMPLOYEE_COUNT(Integer EMPLOYEE_COUNT) {
    this.EMPLOYEE_COUNT = EMPLOYEE_COUNT;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Employee count for the lead's organization")
  @JsonProperty("EMPLOYEE_COUNT")
  public Integer getEMPLOYEECOUNT() {
    return EMPLOYEE_COUNT;
  }
  public void setEMPLOYEECOUNT(Integer EMPLOYEE_COUNT) {
    this.EMPLOYEE_COUNT = EMPLOYEE_COUNT;
  }

  
  /**
   * Lead's Rating
   **/
  public APILead LEAD_RATING(Integer LEAD_RATING) {
    this.LEAD_RATING = LEAD_RATING;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Lead's Rating")
  @JsonProperty("LEAD_RATING")
  public Integer getLEADRATING() {
    return LEAD_RATING;
  }
  public void setLEADRATING(Integer LEAD_RATING) {
    this.LEAD_RATING = LEAD_RATING;
  }

  
  /**
   * Lead's Description
   **/
  public APILead LEAD_DESCRIPTION(String LEAD_DESCRIPTION) {
    this.LEAD_DESCRIPTION = LEAD_DESCRIPTION;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Lead's Description")
  @JsonProperty("LEAD_DESCRIPTION")
  public String getLEADDESCRIPTION() {
    return LEAD_DESCRIPTION;
  }
  public void setLEADDESCRIPTION(String LEAD_DESCRIPTION) {
    this.LEAD_DESCRIPTION = LEAD_DESCRIPTION;
  }

  
  /**
   * If VISIBLE_TO is 'Individuals', then this should be a comma-separated list of User IDs. This field is always empty in the response. Upon successful POST or PUT an anonymous team is created from the list of IDs, and the response will contain a VISIBLE_TEAM_ID.
   **/
  public APILead VISIBLE_USER_IDS(String VISIBLE_USER_IDS) {
    this.VISIBLE_USER_IDS = VISIBLE_USER_IDS;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "If VISIBLE_TO is 'Individuals', then this should be a comma-separated list of User IDs. This field is always empty in the response. Upon successful POST or PUT an anonymous team is created from the list of IDs, and the response will contain a VISIBLE_TEAM_ID.")
  @JsonProperty("VISIBLE_USER_IDS")
  public String getVISIBLEUSERIDS() {
    return VISIBLE_USER_IDS;
  }
  public void setVISIBLEUSERIDS(String VISIBLE_USER_IDS) {
    this.VISIBLE_USER_IDS = VISIBLE_USER_IDS;
  }

  
  /**
   * Set of custom fields attached to the Lead
   **/
  public APILead CUSTOMFIELDS(List<APICustomField> CUSTOMFIELDS) {
    this.CUSTOMFIELDS = CUSTOMFIELDS;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Set of custom fields attached to the Lead")
  @JsonProperty("CUSTOMFIELDS")
  public List<APICustomField> getCUSTOMFIELDS() {
    return CUSTOMFIELDS;
  }
  public void setCUSTOMFIELDS(List<APICustomField> CUSTOMFIELDS) {
    this.CUSTOMFIELDS = CUSTOMFIELDS;
  }

  
  /**
   * Set of addresses attached to the Lead
   **/
  public APILead ADDRESS_STREET(String ADDRESS_STREET) {
    this.ADDRESS_STREET = ADDRESS_STREET;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Set of addresses attached to the Lead")
  @JsonProperty("ADDRESS_STREET")
  public String getADDRESSSTREET() {
    return ADDRESS_STREET;
  }
  public void setADDRESSSTREET(String ADDRESS_STREET) {
    this.ADDRESS_STREET = ADDRESS_STREET;
  }

  
  /**
   * Address street attached to the Lead
   **/
  public APILead ADDRESS_CITY(String ADDRESS_CITY) {
    this.ADDRESS_CITY = ADDRESS_CITY;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Address street attached to the Lead")
  @JsonProperty("ADDRESS_CITY")
  public String getADDRESSCITY() {
    return ADDRESS_CITY;
  }
  public void setADDRESSCITY(String ADDRESS_CITY) {
    this.ADDRESS_CITY = ADDRESS_CITY;
  }

  
  /**
   * Address state attached to the Lead
   **/
  public APILead ADDRESS_STATE(String ADDRESS_STATE) {
    this.ADDRESS_STATE = ADDRESS_STATE;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Address state attached to the Lead")
  @JsonProperty("ADDRESS_STATE")
  public String getADDRESSSTATE() {
    return ADDRESS_STATE;
  }
  public void setADDRESSSTATE(String ADDRESS_STATE) {
    this.ADDRESS_STATE = ADDRESS_STATE;
  }

  
  /**
   * Address postal code attached to the Lead
   **/
  public APILead ADDRESS_POSTCODE(String ADDRESS_POSTCODE) {
    this.ADDRESS_POSTCODE = ADDRESS_POSTCODE;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Address postal code attached to the Lead")
  @JsonProperty("ADDRESS_POSTCODE")
  public String getADDRESSPOSTCODE() {
    return ADDRESS_POSTCODE;
  }
  public void setADDRESSPOSTCODE(String ADDRESS_POSTCODE) {
    this.ADDRESS_POSTCODE = ADDRESS_POSTCODE;
  }

  
  /**
   * Address country attached to the Lead
   **/
  public APILead ADDRESS_COUNTRY(String ADDRESS_COUNTRY) {
    this.ADDRESS_COUNTRY = ADDRESS_COUNTRY;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Address country attached to the Lead")
  @JsonProperty("ADDRESS_COUNTRY")
  public String getADDRESSCOUNTRY() {
    return ADDRESS_COUNTRY;
  }
  public void setADDRESSCOUNTRY(String ADDRESS_COUNTRY) {
    this.ADDRESS_COUNTRY = ADDRESS_COUNTRY;
  }

  
  /**
   * Set of tags attached to the Lead
   **/
  public APILead TAGS(List<APITag> TAGS) {
    this.TAGS = TAGS;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Set of tags attached to the Lead")
  @JsonProperty("TAGS")
  public List<APITag> getTAGS() {
    return TAGS;
  }
  public void setTAGS(List<APITag> TAGS) {
    this.TAGS = TAGS;
  }

  
  /**
   * Url of the Image for the Lead.  Use the 'leads/:id/image' endpoint to change the image.
   **/
  public APILead IMAGE_URL(String IMAGE_URL) {
    this.IMAGE_URL = IMAGE_URL;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Url of the Image for the Lead.  Use the 'leads/:id/image' endpoint to change the image.")
  @JsonProperty("IMAGE_URL")
  public String getIMAGEURL() {
    return IMAGE_URL;
  }
  public void setIMAGEURL(String IMAGE_URL) {
    this.IMAGE_URL = IMAGE_URL;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    APILead aPILead = (APILead) o;
    return Objects.equals(this.LEAD_ID, aPILead.LEAD_ID) &&
        Objects.equals(this.SALUTATION, aPILead.SALUTATION) &&
        Objects.equals(this.TITLE, aPILead.TITLE) &&
        Objects.equals(this.FIRST_NAME, aPILead.FIRST_NAME) &&
        Objects.equals(this.LAST_NAME, aPILead.LAST_NAME) &&
        Objects.equals(this.ORGANIZATION_NAME, aPILead.ORGANIZATION_NAME) &&
        Objects.equals(this.PHONE_NUMBER, aPILead.PHONE_NUMBER) &&
        Objects.equals(this.MOBILE_PHONE_NUMBER, aPILead.MOBILE_PHONE_NUMBER) &&
        Objects.equals(this.FAX_NUMBER, aPILead.FAX_NUMBER) &&
        Objects.equals(this.EMAIL_ADDRESS, aPILead.EMAIL_ADDRESS) &&
        Objects.equals(this.WEBSITE_URL, aPILead.WEBSITE_URL) &&
        Objects.equals(this.OWNER_USER_ID, aPILead.OWNER_USER_ID) &&
        Objects.equals(this.DATE_CREATED_UTC, aPILead.DATE_CREATED_UTC) &&
        Objects.equals(this.DATE_UPDATED_UTC, aPILead.DATE_UPDATED_UTC) &&
        Objects.equals(this.CONVERTED, aPILead.CONVERTED) &&
        Objects.equals(this.CONVERTED_DATE_UTC, aPILead.CONVERTED_DATE_UTC) &&
        Objects.equals(this.CONVERTED_CONTACT_ID, aPILead.CONVERTED_CONTACT_ID) &&
        Objects.equals(this.CONVERTED_ORGANIZATION_ID, aPILead.CONVERTED_ORGANIZATION_ID) &&
        Objects.equals(this.CONVERTED_OPPORTUNITY_ID, aPILead.CONVERTED_OPPORTUNITY_ID) &&
        Objects.equals(this.VISIBLE_TO, aPILead.VISIBLE_TO) &&
        Objects.equals(this.RESPONSIBLE_USER_ID, aPILead.RESPONSIBLE_USER_ID) &&
        Objects.equals(this.INDUSTRY, aPILead.INDUSTRY) &&
        Objects.equals(this.LEAD_STATUS_ID, aPILead.LEAD_STATUS_ID) &&
        Objects.equals(this.LEAD_SOURCE_ID, aPILead.LEAD_SOURCE_ID) &&
        Objects.equals(this.VISIBLE_TEAM_ID, aPILead.VISIBLE_TEAM_ID) &&
        Objects.equals(this.EMPLOYEE_COUNT, aPILead.EMPLOYEE_COUNT) &&
        Objects.equals(this.LEAD_RATING, aPILead.LEAD_RATING) &&
        Objects.equals(this.LEAD_DESCRIPTION, aPILead.LEAD_DESCRIPTION) &&
        Objects.equals(this.VISIBLE_USER_IDS, aPILead.VISIBLE_USER_IDS) &&
        Objects.equals(this.CUSTOMFIELDS, aPILead.CUSTOMFIELDS) &&
        Objects.equals(this.ADDRESS_STREET, aPILead.ADDRESS_STREET) &&
        Objects.equals(this.ADDRESS_CITY, aPILead.ADDRESS_CITY) &&
        Objects.equals(this.ADDRESS_STATE, aPILead.ADDRESS_STATE) &&
        Objects.equals(this.ADDRESS_POSTCODE, aPILead.ADDRESS_POSTCODE) &&
        Objects.equals(this.ADDRESS_COUNTRY, aPILead.ADDRESS_COUNTRY) &&
        Objects.equals(this.TAGS, aPILead.TAGS) &&
        Objects.equals(this.IMAGE_URL, aPILead.IMAGE_URL);
  }

  @Override
  public int hashCode() {
    return Objects.hash(LEAD_ID, SALUTATION, TITLE, FIRST_NAME, LAST_NAME, ORGANIZATION_NAME, PHONE_NUMBER, MOBILE_PHONE_NUMBER, FAX_NUMBER, EMAIL_ADDRESS, WEBSITE_URL, OWNER_USER_ID, DATE_CREATED_UTC, DATE_UPDATED_UTC, CONVERTED, CONVERTED_DATE_UTC, CONVERTED_CONTACT_ID, CONVERTED_ORGANIZATION_ID, CONVERTED_OPPORTUNITY_ID, VISIBLE_TO, RESPONSIBLE_USER_ID, INDUSTRY, LEAD_STATUS_ID, LEAD_SOURCE_ID, VISIBLE_TEAM_ID, EMPLOYEE_COUNT, LEAD_RATING, LEAD_DESCRIPTION, VISIBLE_USER_IDS, CUSTOMFIELDS, ADDRESS_STREET, ADDRESS_CITY, ADDRESS_STATE, ADDRESS_POSTCODE, ADDRESS_COUNTRY, TAGS, IMAGE_URL);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class APILead {\n");
    
    sb.append("    LEAD_ID: ").append(toIndentedString(LEAD_ID)).append("\n");
    sb.append("    SALUTATION: ").append(toIndentedString(SALUTATION)).append("\n");
    sb.append("    TITLE: ").append(toIndentedString(TITLE)).append("\n");
    sb.append("    FIRST_NAME: ").append(toIndentedString(FIRST_NAME)).append("\n");
    sb.append("    LAST_NAME: ").append(toIndentedString(LAST_NAME)).append("\n");
    sb.append("    ORGANIZATION_NAME: ").append(toIndentedString(ORGANIZATION_NAME)).append("\n");
    sb.append("    PHONE_NUMBER: ").append(toIndentedString(PHONE_NUMBER)).append("\n");
    sb.append("    MOBILE_PHONE_NUMBER: ").append(toIndentedString(MOBILE_PHONE_NUMBER)).append("\n");
    sb.append("    FAX_NUMBER: ").append(toIndentedString(FAX_NUMBER)).append("\n");
    sb.append("    EMAIL_ADDRESS: ").append(toIndentedString(EMAIL_ADDRESS)).append("\n");
    sb.append("    WEBSITE_URL: ").append(toIndentedString(WEBSITE_URL)).append("\n");
    sb.append("    OWNER_USER_ID: ").append(toIndentedString(OWNER_USER_ID)).append("\n");
    sb.append("    DATE_CREATED_UTC: ").append(toIndentedString(DATE_CREATED_UTC)).append("\n");
    sb.append("    DATE_UPDATED_UTC: ").append(toIndentedString(DATE_UPDATED_UTC)).append("\n");
    sb.append("    CONVERTED: ").append(toIndentedString(CONVERTED)).append("\n");
    sb.append("    CONVERTED_DATE_UTC: ").append(toIndentedString(CONVERTED_DATE_UTC)).append("\n");
    sb.append("    CONVERTED_CONTACT_ID: ").append(toIndentedString(CONVERTED_CONTACT_ID)).append("\n");
    sb.append("    CONVERTED_ORGANIZATION_ID: ").append(toIndentedString(CONVERTED_ORGANIZATION_ID)).append("\n");
    sb.append("    CONVERTED_OPPORTUNITY_ID: ").append(toIndentedString(CONVERTED_OPPORTUNITY_ID)).append("\n");
    sb.append("    VISIBLE_TO: ").append(toIndentedString(VISIBLE_TO)).append("\n");
    sb.append("    RESPONSIBLE_USER_ID: ").append(toIndentedString(RESPONSIBLE_USER_ID)).append("\n");
    sb.append("    INDUSTRY: ").append(toIndentedString(INDUSTRY)).append("\n");
    sb.append("    LEAD_STATUS_ID: ").append(toIndentedString(LEAD_STATUS_ID)).append("\n");
    sb.append("    LEAD_SOURCE_ID: ").append(toIndentedString(LEAD_SOURCE_ID)).append("\n");
    sb.append("    VISIBLE_TEAM_ID: ").append(toIndentedString(VISIBLE_TEAM_ID)).append("\n");
    sb.append("    EMPLOYEE_COUNT: ").append(toIndentedString(EMPLOYEE_COUNT)).append("\n");
    sb.append("    LEAD_RATING: ").append(toIndentedString(LEAD_RATING)).append("\n");
    sb.append("    LEAD_DESCRIPTION: ").append(toIndentedString(LEAD_DESCRIPTION)).append("\n");
    sb.append("    VISIBLE_USER_IDS: ").append(toIndentedString(VISIBLE_USER_IDS)).append("\n");
    sb.append("    CUSTOMFIELDS: ").append(toIndentedString(CUSTOMFIELDS)).append("\n");
    sb.append("    ADDRESS_STREET: ").append(toIndentedString(ADDRESS_STREET)).append("\n");
    sb.append("    ADDRESS_CITY: ").append(toIndentedString(ADDRESS_CITY)).append("\n");
    sb.append("    ADDRESS_STATE: ").append(toIndentedString(ADDRESS_STATE)).append("\n");
    sb.append("    ADDRESS_POSTCODE: ").append(toIndentedString(ADDRESS_POSTCODE)).append("\n");
    sb.append("    ADDRESS_COUNTRY: ").append(toIndentedString(ADDRESS_COUNTRY)).append("\n");
    sb.append("    TAGS: ").append(toIndentedString(TAGS)).append("\n");
    sb.append("    IMAGE_URL: ").append(toIndentedString(IMAGE_URL)).append("\n");
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

