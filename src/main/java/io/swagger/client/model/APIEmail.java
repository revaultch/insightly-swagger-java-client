package io.swagger.client.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.client.model.APIEmailLink;
import io.swagger.client.model.APITag;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;



/**
 * APIEmail
 **/

@ApiModel(description = "APIEmail")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-02-24T20:33:55.547+01:00")
public class APIEmail   {
  
  private Long EMAIL_ID = null;
  private String GMAIL_MESSAGE_ID = null;
  private Date EMAIL_DATE_UTC = null;
  private String EMAIL_FROM = null;
  private String EMAIL_TO = null;
  private String EMAIL_CC = null;
  private String SUBJECT = null;
  private String BODY = null;
  private String BODY_EXTRACT = null;
  private String FORMAT = null;
  private Long SIZE = null;
  private Integer OWNER_USER_ID = null;
  private Date DATE_CREATED_UTC = null;
  private String VISIBLE_TO = null;
  private Long VISIBLE_TEAM_ID = null;
  private String VISIBLE_USER_IDS = null;
  private List<APIEmailLink> EMAILLINKS = new ArrayList<APIEmailLink>();
  private List<APITag> TAGS = new ArrayList<APITag>();

  
  /**
   * Unique ID for the email record
   **/
  public APIEmail EMAIL_ID(Long EMAIL_ID) {
    this.EMAIL_ID = EMAIL_ID;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Unique ID for the email record")
  @JsonProperty("EMAIL_ID")
  public Long getEMAILID() {
    return EMAIL_ID;
  }
  public void setEMAILID(Long EMAIL_ID) {
    this.EMAIL_ID = EMAIL_ID;
  }

  
  /**
   * Unique key of the Gmail message
   **/
  public APIEmail GMAIL_MESSAGE_ID(String GMAIL_MESSAGE_ID) {
    this.GMAIL_MESSAGE_ID = GMAIL_MESSAGE_ID;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Unique key of the Gmail message")
  @JsonProperty("GMAIL_MESSAGE_ID")
  public String getGMAILMESSAGEID() {
    return GMAIL_MESSAGE_ID;
  }
  public void setGMAILMESSAGEID(String GMAIL_MESSAGE_ID) {
    this.GMAIL_MESSAGE_ID = GMAIL_MESSAGE_ID;
  }

  
  /**
   * Date and time email sent, as Coordinated Universal Time
   **/
  public APIEmail EMAIL_DATE_UTC(Date EMAIL_DATE_UTC) {
    this.EMAIL_DATE_UTC = EMAIL_DATE_UTC;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Date and time email sent, as Coordinated Universal Time")
  @JsonProperty("EMAIL_DATE_UTC")
  public Date getEMAILDATEUTC() {
    return EMAIL_DATE_UTC;
  }
  public void setEMAILDATEUTC(Date EMAIL_DATE_UTC) {
    this.EMAIL_DATE_UTC = EMAIL_DATE_UTC;
  }

  
  /**
   * From address of the email
   **/
  public APIEmail EMAIL_FROM(String EMAIL_FROM) {
    this.EMAIL_FROM = EMAIL_FROM;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "From address of the email")
  @JsonProperty("EMAIL_FROM")
  public String getEMAILFROM() {
    return EMAIL_FROM;
  }
  public void setEMAILFROM(String EMAIL_FROM) {
    this.EMAIL_FROM = EMAIL_FROM;
  }

  
  /**
   * To addresses of the email
   **/
  public APIEmail EMAIL_TO(String EMAIL_TO) {
    this.EMAIL_TO = EMAIL_TO;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "To addresses of the email")
  @JsonProperty("EMAIL_TO")
  public String getEMAILTO() {
    return EMAIL_TO;
  }
  public void setEMAILTO(String EMAIL_TO) {
    this.EMAIL_TO = EMAIL_TO;
  }

  
  /**
   * CC addresses of the email
   **/
  public APIEmail EMAIL_CC(String EMAIL_CC) {
    this.EMAIL_CC = EMAIL_CC;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "CC addresses of the email")
  @JsonProperty("EMAIL_CC")
  public String getEMAILCC() {
    return EMAIL_CC;
  }
  public void setEMAILCC(String EMAIL_CC) {
    this.EMAIL_CC = EMAIL_CC;
  }

  
  /**
   * Subject of the Email
   **/
  public APIEmail SUBJECT(String SUBJECT) {
    this.SUBJECT = SUBJECT;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Subject of the Email")
  @JsonProperty("SUBJECT")
  public String getSUBJECT() {
    return SUBJECT;
  }
  public void setSUBJECT(String SUBJECT) {
    this.SUBJECT = SUBJECT;
  }

  
  /**
   * The body of the Email. This field is empty on list requests.
   **/
  public APIEmail BODY(String BODY) {
    this.BODY = BODY;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The body of the Email. This field is empty on list requests.")
  @JsonProperty("BODY")
  public String getBODY() {
    return BODY;
  }
  public void setBODY(String BODY) {
    this.BODY = BODY;
  }

  
  /**
   * An extract of the Email body.
   **/
  public APIEmail BODY_EXTRACT(String BODY_EXTRACT) {
    this.BODY_EXTRACT = BODY_EXTRACT;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "An extract of the Email body.")
  @JsonProperty("BODY_EXTRACT")
  public String getBODYEXTRACT() {
    return BODY_EXTRACT;
  }
  public void setBODYEXTRACT(String BODY_EXTRACT) {
    this.BODY_EXTRACT = BODY_EXTRACT;
  }

  
  /**
   * Format of the email: text or html
   **/
  public APIEmail FORMAT(String FORMAT) {
    this.FORMAT = FORMAT;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Format of the email: text or html")
  @JsonProperty("FORMAT")
  public String getFORMAT() {
    return FORMAT;
  }
  public void setFORMAT(String FORMAT) {
    this.FORMAT = FORMAT;
  }

  
  /**
   * The size of the email, in bytes
   **/
  public APIEmail SIZE(Long SIZE) {
    this.SIZE = SIZE;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The size of the email, in bytes")
  @JsonProperty("SIZE")
  public Long getSIZE() {
    return SIZE;
  }
  public void setSIZE(Long SIZE) {
    this.SIZE = SIZE;
  }

  
  /**
   * Insightly User ID of the email owner
   **/
  public APIEmail OWNER_USER_ID(Integer OWNER_USER_ID) {
    this.OWNER_USER_ID = OWNER_USER_ID;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Insightly User ID of the email owner")
  @JsonProperty("OWNER_USER_ID")
  public Integer getOWNERUSERID() {
    return OWNER_USER_ID;
  }
  public void setOWNERUSERID(Integer OWNER_USER_ID) {
    this.OWNER_USER_ID = OWNER_USER_ID;
  }

  
  /**
   * Date and time Email record created, as Coordinated Universal Time
   **/
  public APIEmail DATE_CREATED_UTC(Date DATE_CREATED_UTC) {
    this.DATE_CREATED_UTC = DATE_CREATED_UTC;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Date and time Email record created, as Coordinated Universal Time")
  @JsonProperty("DATE_CREATED_UTC")
  public Date getDATECREATEDUTC() {
    return DATE_CREATED_UTC;
  }
  public void setDATECREATEDUTC(Date DATE_CREATED_UTC) {
    this.DATE_CREATED_UTC = DATE_CREATED_UTC;
  }

  
  /**
   * Visible To: Everyone, Owner, Team or Individuals
   **/
  public APIEmail VISIBLE_TO(String VISIBLE_TO) {
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
  public APIEmail VISIBLE_TEAM_ID(Long VISIBLE_TEAM_ID) {
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
  public APIEmail VISIBLE_USER_IDS(String VISIBLE_USER_IDS) {
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
   * Set of links attached to the Email
   **/
  public APIEmail EMAILLINKS(List<APIEmailLink> EMAILLINKS) {
    this.EMAILLINKS = EMAILLINKS;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Set of links attached to the Email")
  @JsonProperty("EMAILLINKS")
  public List<APIEmailLink> getEMAILLINKS() {
    return EMAILLINKS;
  }
  public void setEMAILLINKS(List<APIEmailLink> EMAILLINKS) {
    this.EMAILLINKS = EMAILLINKS;
  }

  
  /**
   * Set of tags attached to the Email
   **/
  public APIEmail TAGS(List<APITag> TAGS) {
    this.TAGS = TAGS;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Set of tags attached to the Email")
  @JsonProperty("TAGS")
  public List<APITag> getTAGS() {
    return TAGS;
  }
  public void setTAGS(List<APITag> TAGS) {
    this.TAGS = TAGS;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    APIEmail aPIEmail = (APIEmail) o;
    return Objects.equals(this.EMAIL_ID, aPIEmail.EMAIL_ID) &&
        Objects.equals(this.GMAIL_MESSAGE_ID, aPIEmail.GMAIL_MESSAGE_ID) &&
        Objects.equals(this.EMAIL_DATE_UTC, aPIEmail.EMAIL_DATE_UTC) &&
        Objects.equals(this.EMAIL_FROM, aPIEmail.EMAIL_FROM) &&
        Objects.equals(this.EMAIL_TO, aPIEmail.EMAIL_TO) &&
        Objects.equals(this.EMAIL_CC, aPIEmail.EMAIL_CC) &&
        Objects.equals(this.SUBJECT, aPIEmail.SUBJECT) &&
        Objects.equals(this.BODY, aPIEmail.BODY) &&
        Objects.equals(this.BODY_EXTRACT, aPIEmail.BODY_EXTRACT) &&
        Objects.equals(this.FORMAT, aPIEmail.FORMAT) &&
        Objects.equals(this.SIZE, aPIEmail.SIZE) &&
        Objects.equals(this.OWNER_USER_ID, aPIEmail.OWNER_USER_ID) &&
        Objects.equals(this.DATE_CREATED_UTC, aPIEmail.DATE_CREATED_UTC) &&
        Objects.equals(this.VISIBLE_TO, aPIEmail.VISIBLE_TO) &&
        Objects.equals(this.VISIBLE_TEAM_ID, aPIEmail.VISIBLE_TEAM_ID) &&
        Objects.equals(this.VISIBLE_USER_IDS, aPIEmail.VISIBLE_USER_IDS) &&
        Objects.equals(this.EMAILLINKS, aPIEmail.EMAILLINKS) &&
        Objects.equals(this.TAGS, aPIEmail.TAGS);
  }

  @Override
  public int hashCode() {
    return Objects.hash(EMAIL_ID, GMAIL_MESSAGE_ID, EMAIL_DATE_UTC, EMAIL_FROM, EMAIL_TO, EMAIL_CC, SUBJECT, BODY, BODY_EXTRACT, FORMAT, SIZE, OWNER_USER_ID, DATE_CREATED_UTC, VISIBLE_TO, VISIBLE_TEAM_ID, VISIBLE_USER_IDS, EMAILLINKS, TAGS);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class APIEmail {\n");
    
    sb.append("    EMAIL_ID: ").append(toIndentedString(EMAIL_ID)).append("\n");
    sb.append("    GMAIL_MESSAGE_ID: ").append(toIndentedString(GMAIL_MESSAGE_ID)).append("\n");
    sb.append("    EMAIL_DATE_UTC: ").append(toIndentedString(EMAIL_DATE_UTC)).append("\n");
    sb.append("    EMAIL_FROM: ").append(toIndentedString(EMAIL_FROM)).append("\n");
    sb.append("    EMAIL_TO: ").append(toIndentedString(EMAIL_TO)).append("\n");
    sb.append("    EMAIL_CC: ").append(toIndentedString(EMAIL_CC)).append("\n");
    sb.append("    SUBJECT: ").append(toIndentedString(SUBJECT)).append("\n");
    sb.append("    BODY: ").append(toIndentedString(BODY)).append("\n");
    sb.append("    BODY_EXTRACT: ").append(toIndentedString(BODY_EXTRACT)).append("\n");
    sb.append("    FORMAT: ").append(toIndentedString(FORMAT)).append("\n");
    sb.append("    SIZE: ").append(toIndentedString(SIZE)).append("\n");
    sb.append("    OWNER_USER_ID: ").append(toIndentedString(OWNER_USER_ID)).append("\n");
    sb.append("    DATE_CREATED_UTC: ").append(toIndentedString(DATE_CREATED_UTC)).append("\n");
    sb.append("    VISIBLE_TO: ").append(toIndentedString(VISIBLE_TO)).append("\n");
    sb.append("    VISIBLE_TEAM_ID: ").append(toIndentedString(VISIBLE_TEAM_ID)).append("\n");
    sb.append("    VISIBLE_USER_IDS: ").append(toIndentedString(VISIBLE_USER_IDS)).append("\n");
    sb.append("    EMAILLINKS: ").append(toIndentedString(EMAILLINKS)).append("\n");
    sb.append("    TAGS: ").append(toIndentedString(TAGS)).append("\n");
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

