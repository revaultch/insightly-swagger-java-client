package io.swagger.client.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;



/**
 * APICategory
 **/

@ApiModel(description = "APICategory")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-02-24T20:33:55.547+01:00")
public class APILeadStatus   {
  
  private Long LEAD_STATUS_ID = null;
  private String LEAD_STATUS = null;
  private Boolean DEFAULT_STATUS = null;
  private Integer STATUS_TYPE = null;
  private Integer FIELD_ORDER = null;

  
  /**
   * Unique ID for the current Lead Status
   **/
  public APILeadStatus LEAD_STATUS_ID(Long LEAD_STATUS_ID) {
    this.LEAD_STATUS_ID = LEAD_STATUS_ID;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Unique ID for the current Lead Status")
  @JsonProperty("LEAD_STATUS_ID")
  public Long getLEADSTATUSID() {
    return LEAD_STATUS_ID;
  }
  public void setLEADSTATUSID(Long LEAD_STATUS_ID) {
    this.LEAD_STATUS_ID = LEAD_STATUS_ID;
  }

  
  /**
   * Lead Status value
   **/
  public APILeadStatus LEAD_STATUS(String LEAD_STATUS) {
    this.LEAD_STATUS = LEAD_STATUS;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Lead Status value")
  @JsonProperty("LEAD_STATUS")
  public String getLEADSTATUS() {
    return LEAD_STATUS;
  }
  public void setLEADSTATUS(String LEAD_STATUS) {
    this.LEAD_STATUS = LEAD_STATUS;
  }

  
  /**
   * checks or sets the current Lead source for being the default value
   **/
  public APILeadStatus DEFAULT_STATUS(Boolean DEFAULT_STATUS) {
    this.DEFAULT_STATUS = DEFAULT_STATUS;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "checks or sets the current Lead source for being the default value")
  @JsonProperty("DEFAULT_STATUS")
  public Boolean getDEFAULTSTATUS() {
    return DEFAULT_STATUS;
  }
  public void setDEFAULTSTATUS(Boolean DEFAULT_STATUS) {
    this.DEFAULT_STATUS = DEFAULT_STATUS;
  }

  
  /**
   * Status type indicating Lead Status (either open or close)
   **/
  public APILeadStatus STATUS_TYPE(Integer STATUS_TYPE) {
    this.STATUS_TYPE = STATUS_TYPE;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Status type indicating Lead Status (either open or close)")
  @JsonProperty("STATUS_TYPE")
  public Integer getSTATUSTYPE() {
    return STATUS_TYPE;
  }
  public void setSTATUSTYPE(Integer STATUS_TYPE) {
    this.STATUS_TYPE = STATUS_TYPE;
  }

  
  /**
   * Field Order used to retrive list sorted
   **/
  public APILeadStatus FIELD_ORDER(Integer FIELD_ORDER) {
    this.FIELD_ORDER = FIELD_ORDER;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Field Order used to retrive list sorted")
  @JsonProperty("FIELD_ORDER")
  public Integer getFIELDORDER() {
    return FIELD_ORDER;
  }
  public void setFIELDORDER(Integer FIELD_ORDER) {
    this.FIELD_ORDER = FIELD_ORDER;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    APILeadStatus aPILeadStatus = (APILeadStatus) o;
    return Objects.equals(this.LEAD_STATUS_ID, aPILeadStatus.LEAD_STATUS_ID) &&
        Objects.equals(this.LEAD_STATUS, aPILeadStatus.LEAD_STATUS) &&
        Objects.equals(this.DEFAULT_STATUS, aPILeadStatus.DEFAULT_STATUS) &&
        Objects.equals(this.STATUS_TYPE, aPILeadStatus.STATUS_TYPE) &&
        Objects.equals(this.FIELD_ORDER, aPILeadStatus.FIELD_ORDER);
  }

  @Override
  public int hashCode() {
    return Objects.hash(LEAD_STATUS_ID, LEAD_STATUS, DEFAULT_STATUS, STATUS_TYPE, FIELD_ORDER);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class APILeadStatus {\n");
    
    sb.append("    LEAD_STATUS_ID: ").append(toIndentedString(LEAD_STATUS_ID)).append("\n");
    sb.append("    LEAD_STATUS: ").append(toIndentedString(LEAD_STATUS)).append("\n");
    sb.append("    DEFAULT_STATUS: ").append(toIndentedString(DEFAULT_STATUS)).append("\n");
    sb.append("    STATUS_TYPE: ").append(toIndentedString(STATUS_TYPE)).append("\n");
    sb.append("    FIELD_ORDER: ").append(toIndentedString(FIELD_ORDER)).append("\n");
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

