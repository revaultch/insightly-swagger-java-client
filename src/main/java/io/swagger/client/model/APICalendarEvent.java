package io.swagger.client.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.client.model.APIEventLink;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;



/**
 * APICalendarEvent
 **/

@ApiModel(description = "APICalendarEvent")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-02-24T20:33:55.547+01:00")
public class APICalendarEvent   {
  
  private Long EVENT_ID = null;
  private String TITLE = null;
  private String LOCATION = null;
  private String DETAILS = null;
  private Date START_DATE_UTC = null;
  private Date END_DATE_UTC = null;
  private Boolean ALL_DAY = null;
  private Boolean PUBLICLY_VISIBLE = null;
  private Date REMINDER_DATE_UTC = null;
  private Boolean REMINDER_SENT = null;
  private List<APIEventLink> EVENTLINKS = new ArrayList<APIEventLink>();
  private Integer OWNER_USER_ID = null;
  private Date DATE_CREATED_UTC = null;
  private Date DATE_UPDATED_UTC = null;

  
  /**
   * Unique ID for event record
   **/
  public APICalendarEvent EVENT_ID(Long EVENT_ID) {
    this.EVENT_ID = EVENT_ID;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Unique ID for event record")
  @JsonProperty("EVENT_ID")
  public Long getEVENTID() {
    return EVENT_ID;
  }
  public void setEVENTID(Long EVENT_ID) {
    this.EVENT_ID = EVENT_ID;
  }

  
  /**
   * Name or title of the event (required)
   **/
  public APICalendarEvent TITLE(String TITLE) {
    this.TITLE = TITLE;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Name or title of the event (required)")
  @JsonProperty("TITLE")
  public String getTITLE() {
    return TITLE;
  }
  public void setTITLE(String TITLE) {
    this.TITLE = TITLE;
  }

  
  /**
   * Location of the event
   **/
  public APICalendarEvent LOCATION(String LOCATION) {
    this.LOCATION = LOCATION;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Location of the event")
  @JsonProperty("LOCATION")
  public String getLOCATION() {
    return LOCATION;
  }
  public void setLOCATION(String LOCATION) {
    this.LOCATION = LOCATION;
  }

  
  /**
   * Details of the event
   **/
  public APICalendarEvent DETAILS(String DETAILS) {
    this.DETAILS = DETAILS;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Details of the event")
  @JsonProperty("DETAILS")
  public String getDETAILS() {
    return DETAILS;
  }
  public void setDETAILS(String DETAILS) {
    this.DETAILS = DETAILS;
  }

  
  /**
   * Start date and time of the event, as Coordinated Universal Time
   **/
  public APICalendarEvent START_DATE_UTC(Date START_DATE_UTC) {
    this.START_DATE_UTC = START_DATE_UTC;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Start date and time of the event, as Coordinated Universal Time")
  @JsonProperty("START_DATE_UTC")
  public Date getSTARTDATEUTC() {
    return START_DATE_UTC;
  }
  public void setSTARTDATEUTC(Date START_DATE_UTC) {
    this.START_DATE_UTC = START_DATE_UTC;
  }

  
  /**
   * End date and time of the event, as Coordinated Universal Time
   **/
  public APICalendarEvent END_DATE_UTC(Date END_DATE_UTC) {
    this.END_DATE_UTC = END_DATE_UTC;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "End date and time of the event, as Coordinated Universal Time")
  @JsonProperty("END_DATE_UTC")
  public Date getENDDATEUTC() {
    return END_DATE_UTC;
  }
  public void setENDDATEUTC(Date END_DATE_UTC) {
    this.END_DATE_UTC = END_DATE_UTC;
  }

  
  /**
   * True, if event is an all-day event
   **/
  public APICalendarEvent ALL_DAY(Boolean ALL_DAY) {
    this.ALL_DAY = ALL_DAY;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "True, if event is an all-day event")
  @JsonProperty("ALL_DAY")
  public Boolean getALLDAY() {
    return ALL_DAY;
  }
  public void setALLDAY(Boolean ALL_DAY) {
    this.ALL_DAY = ALL_DAY;
  }

  
  /**
   * True, if event is visible to others
   **/
  public APICalendarEvent PUBLICLY_VISIBLE(Boolean PUBLICLY_VISIBLE) {
    this.PUBLICLY_VISIBLE = PUBLICLY_VISIBLE;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "True, if event is visible to others")
  @JsonProperty("PUBLICLY_VISIBLE")
  public Boolean getPUBLICLYVISIBLE() {
    return PUBLICLY_VISIBLE;
  }
  public void setPUBLICLYVISIBLE(Boolean PUBLICLY_VISIBLE) {
    this.PUBLICLY_VISIBLE = PUBLICLY_VISIBLE;
  }

  
  /**
   * Reminder data and time of the event, as Coordinated Universal Time
   **/
  public APICalendarEvent REMINDER_DATE_UTC(Date REMINDER_DATE_UTC) {
    this.REMINDER_DATE_UTC = REMINDER_DATE_UTC;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Reminder data and time of the event, as Coordinated Universal Time")
  @JsonProperty("REMINDER_DATE_UTC")
  public Date getREMINDERDATEUTC() {
    return REMINDER_DATE_UTC;
  }
  public void setREMINDERDATEUTC(Date REMINDER_DATE_UTC) {
    this.REMINDER_DATE_UTC = REMINDER_DATE_UTC;
  }

  
  /**
   * True, if a reminder was sent
   **/
  public APICalendarEvent REMINDER_SENT(Boolean REMINDER_SENT) {
    this.REMINDER_SENT = REMINDER_SENT;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "True, if a reminder was sent")
  @JsonProperty("REMINDER_SENT")
  public Boolean getREMINDERSENT() {
    return REMINDER_SENT;
  }
  public void setREMINDERSENT(Boolean REMINDER_SENT) {
    this.REMINDER_SENT = REMINDER_SENT;
  }

  
  /**
   * Set of links attached to the Event
   **/
  public APICalendarEvent EVENTLINKS(List<APIEventLink> EVENTLINKS) {
    this.EVENTLINKS = EVENTLINKS;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Set of links attached to the Event")
  @JsonProperty("EVENTLINKS")
  public List<APIEventLink> getEVENTLINKS() {
    return EVENTLINKS;
  }
  public void setEVENTLINKS(List<APIEventLink> EVENTLINKS) {
    this.EVENTLINKS = EVENTLINKS;
  }

  
  /**
   * User ID of the event owner (must be a valid user ID)
   **/
  public APICalendarEvent OWNER_USER_ID(Integer OWNER_USER_ID) {
    this.OWNER_USER_ID = OWNER_USER_ID;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "User ID of the event owner (must be a valid user ID)")
  @JsonProperty("OWNER_USER_ID")
  public Integer getOWNERUSERID() {
    return OWNER_USER_ID;
  }
  public void setOWNERUSERID(Integer OWNER_USER_ID) {
    this.OWNER_USER_ID = OWNER_USER_ID;
  }

  
  /**
   * Date and time event record created, as Coordinated Universal Time
   **/
  public APICalendarEvent DATE_CREATED_UTC(Date DATE_CREATED_UTC) {
    this.DATE_CREATED_UTC = DATE_CREATED_UTC;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Date and time event record created, as Coordinated Universal Time")
  @JsonProperty("DATE_CREATED_UTC")
  public Date getDATECREATEDUTC() {
    return DATE_CREATED_UTC;
  }
  public void setDATECREATEDUTC(Date DATE_CREATED_UTC) {
    this.DATE_CREATED_UTC = DATE_CREATED_UTC;
  }

  
  /**
   * Date and time event record updated, as Coordinated Universal Time
   **/
  public APICalendarEvent DATE_UPDATED_UTC(Date DATE_UPDATED_UTC) {
    this.DATE_UPDATED_UTC = DATE_UPDATED_UTC;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Date and time event record updated, as Coordinated Universal Time")
  @JsonProperty("DATE_UPDATED_UTC")
  public Date getDATEUPDATEDUTC() {
    return DATE_UPDATED_UTC;
  }
  public void setDATEUPDATEDUTC(Date DATE_UPDATED_UTC) {
    this.DATE_UPDATED_UTC = DATE_UPDATED_UTC;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    APICalendarEvent aPICalendarEvent = (APICalendarEvent) o;
    return Objects.equals(this.EVENT_ID, aPICalendarEvent.EVENT_ID) &&
        Objects.equals(this.TITLE, aPICalendarEvent.TITLE) &&
        Objects.equals(this.LOCATION, aPICalendarEvent.LOCATION) &&
        Objects.equals(this.DETAILS, aPICalendarEvent.DETAILS) &&
        Objects.equals(this.START_DATE_UTC, aPICalendarEvent.START_DATE_UTC) &&
        Objects.equals(this.END_DATE_UTC, aPICalendarEvent.END_DATE_UTC) &&
        Objects.equals(this.ALL_DAY, aPICalendarEvent.ALL_DAY) &&
        Objects.equals(this.PUBLICLY_VISIBLE, aPICalendarEvent.PUBLICLY_VISIBLE) &&
        Objects.equals(this.REMINDER_DATE_UTC, aPICalendarEvent.REMINDER_DATE_UTC) &&
        Objects.equals(this.REMINDER_SENT, aPICalendarEvent.REMINDER_SENT) &&
        Objects.equals(this.EVENTLINKS, aPICalendarEvent.EVENTLINKS) &&
        Objects.equals(this.OWNER_USER_ID, aPICalendarEvent.OWNER_USER_ID) &&
        Objects.equals(this.DATE_CREATED_UTC, aPICalendarEvent.DATE_CREATED_UTC) &&
        Objects.equals(this.DATE_UPDATED_UTC, aPICalendarEvent.DATE_UPDATED_UTC);
  }

  @Override
  public int hashCode() {
    return Objects.hash(EVENT_ID, TITLE, LOCATION, DETAILS, START_DATE_UTC, END_DATE_UTC, ALL_DAY, PUBLICLY_VISIBLE, REMINDER_DATE_UTC, REMINDER_SENT, EVENTLINKS, OWNER_USER_ID, DATE_CREATED_UTC, DATE_UPDATED_UTC);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class APICalendarEvent {\n");
    
    sb.append("    EVENT_ID: ").append(toIndentedString(EVENT_ID)).append("\n");
    sb.append("    TITLE: ").append(toIndentedString(TITLE)).append("\n");
    sb.append("    LOCATION: ").append(toIndentedString(LOCATION)).append("\n");
    sb.append("    DETAILS: ").append(toIndentedString(DETAILS)).append("\n");
    sb.append("    START_DATE_UTC: ").append(toIndentedString(START_DATE_UTC)).append("\n");
    sb.append("    END_DATE_UTC: ").append(toIndentedString(END_DATE_UTC)).append("\n");
    sb.append("    ALL_DAY: ").append(toIndentedString(ALL_DAY)).append("\n");
    sb.append("    PUBLICLY_VISIBLE: ").append(toIndentedString(PUBLICLY_VISIBLE)).append("\n");
    sb.append("    REMINDER_DATE_UTC: ").append(toIndentedString(REMINDER_DATE_UTC)).append("\n");
    sb.append("    REMINDER_SENT: ").append(toIndentedString(REMINDER_SENT)).append("\n");
    sb.append("    EVENTLINKS: ").append(toIndentedString(EVENTLINKS)).append("\n");
    sb.append("    OWNER_USER_ID: ").append(toIndentedString(OWNER_USER_ID)).append("\n");
    sb.append("    DATE_CREATED_UTC: ").append(toIndentedString(DATE_CREATED_UTC)).append("\n");
    sb.append("    DATE_UPDATED_UTC: ").append(toIndentedString(DATE_UPDATED_UTC)).append("\n");
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

