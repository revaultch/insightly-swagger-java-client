package io.swagger.client.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Date;



/**
 * APIOpportunityState
 **/

@ApiModel(description = "APIOpportunityState")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-02-24T20:33:55.547+01:00")
public class APIOpportunityState   {
  
  private Long OPPORTUNITY_ID = null;
  private Date DATE_CHANGED_UTC = null;
  private String FOR_OPPORTUNITY_STATE = null;
  private Long STATE_REASON_ID = null;
  private String STATE_REASON = null;

  
  /**
   * Unique ID for the Opportunity record
   **/
  public APIOpportunityState OPPORTUNITY_ID(Long OPPORTUNITY_ID) {
    this.OPPORTUNITY_ID = OPPORTUNITY_ID;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Unique ID for the Opportunity record")
  @JsonProperty("OPPORTUNITY_ID")
  public Long getOPPORTUNITYID() {
    return OPPORTUNITY_ID;
  }
  public void setOPPORTUNITYID(Long OPPORTUNITY_ID) {
    this.OPPORTUNITY_ID = OPPORTUNITY_ID;
  }

  
  /**
   * Date and time the Opportunity State was changed, in Coordinated Universal Time
   **/
  public APIOpportunityState DATE_CHANGED_UTC(Date DATE_CHANGED_UTC) {
    this.DATE_CHANGED_UTC = DATE_CHANGED_UTC;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Date and time the Opportunity State was changed, in Coordinated Universal Time")
  @JsonProperty("DATE_CHANGED_UTC")
  public Date getDATECHANGEDUTC() {
    return DATE_CHANGED_UTC;
  }
  public void setDATECHANGEDUTC(Date DATE_CHANGED_UTC) {
    this.DATE_CHANGED_UTC = DATE_CHANGED_UTC;
  }

  
  /**
   * The state of the Opportunity: Abandoned, Lost, Open, Suspended, or Won
   **/
  public APIOpportunityState FOR_OPPORTUNITY_STATE(String FOR_OPPORTUNITY_STATE) {
    this.FOR_OPPORTUNITY_STATE = FOR_OPPORTUNITY_STATE;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The state of the Opportunity: Abandoned, Lost, Open, Suspended, or Won")
  @JsonProperty("FOR_OPPORTUNITY_STATE")
  public String getFOROPPORTUNITYSTATE() {
    return FOR_OPPORTUNITY_STATE;
  }
  public void setFOROPPORTUNITYSTATE(String FOR_OPPORTUNITY_STATE) {
    this.FOR_OPPORTUNITY_STATE = FOR_OPPORTUNITY_STATE;
  }

  
  /**
   * The unique key of the Reason that the State was changed
   **/
  public APIOpportunityState STATE_REASON_ID(Long STATE_REASON_ID) {
    this.STATE_REASON_ID = STATE_REASON_ID;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The unique key of the Reason that the State was changed")
  @JsonProperty("STATE_REASON_ID")
  public Long getSTATEREASONID() {
    return STATE_REASON_ID;
  }
  public void setSTATEREASONID(Long STATE_REASON_ID) {
    this.STATE_REASON_ID = STATE_REASON_ID;
  }

  
  /**
   * Opportunity state change Reason corresponding to the STATE_REASON_ID
   **/
  public APIOpportunityState STATE_REASON(String STATE_REASON) {
    this.STATE_REASON = STATE_REASON;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Opportunity state change Reason corresponding to the STATE_REASON_ID")
  @JsonProperty("STATE_REASON")
  public String getSTATEREASON() {
    return STATE_REASON;
  }
  public void setSTATEREASON(String STATE_REASON) {
    this.STATE_REASON = STATE_REASON;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    APIOpportunityState aPIOpportunityState = (APIOpportunityState) o;
    return Objects.equals(this.OPPORTUNITY_ID, aPIOpportunityState.OPPORTUNITY_ID) &&
        Objects.equals(this.DATE_CHANGED_UTC, aPIOpportunityState.DATE_CHANGED_UTC) &&
        Objects.equals(this.FOR_OPPORTUNITY_STATE, aPIOpportunityState.FOR_OPPORTUNITY_STATE) &&
        Objects.equals(this.STATE_REASON_ID, aPIOpportunityState.STATE_REASON_ID) &&
        Objects.equals(this.STATE_REASON, aPIOpportunityState.STATE_REASON);
  }

  @Override
  public int hashCode() {
    return Objects.hash(OPPORTUNITY_ID, DATE_CHANGED_UTC, FOR_OPPORTUNITY_STATE, STATE_REASON_ID, STATE_REASON);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class APIOpportunityState {\n");
    
    sb.append("    OPPORTUNITY_ID: ").append(toIndentedString(OPPORTUNITY_ID)).append("\n");
    sb.append("    DATE_CHANGED_UTC: ").append(toIndentedString(DATE_CHANGED_UTC)).append("\n");
    sb.append("    FOR_OPPORTUNITY_STATE: ").append(toIndentedString(FOR_OPPORTUNITY_STATE)).append("\n");
    sb.append("    STATE_REASON_ID: ").append(toIndentedString(STATE_REASON_ID)).append("\n");
    sb.append("    STATE_REASON: ").append(toIndentedString(STATE_REASON)).append("\n");
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

