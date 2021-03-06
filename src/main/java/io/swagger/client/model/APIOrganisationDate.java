package io.swagger.client.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Date;



/**
 * APIOrganisationDate
 **/

@ApiModel(description = "APIOrganisationDate")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-02-24T20:33:55.547+01:00")
public class APIOrganisationDate   {
  
  private Long DATE_ID = null;
  private String OCCASION_NAME = null;
  private Date OCCASION_DATE = null;
  private Boolean REPEAT_YEARLY = null;
  private Boolean CREATE_TASK_YEARLY = null;

  
  /**
   * Unique ID for the Organisation Date record
   **/
  public APIOrganisationDate DATE_ID(Long DATE_ID) {
    this.DATE_ID = DATE_ID;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Unique ID for the Organisation Date record")
  @JsonProperty("DATE_ID")
  public Long getDATEID() {
    return DATE_ID;
  }
  public void setDATEID(Long DATE_ID) {
    this.DATE_ID = DATE_ID;
  }

  
  /**
   * Occasion Name of the Organisation Date
   **/
  public APIOrganisationDate OCCASION_NAME(String OCCASION_NAME) {
    this.OCCASION_NAME = OCCASION_NAME;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Occasion Name of the Organisation Date")
  @JsonProperty("OCCASION_NAME")
  public String getOCCASIONNAME() {
    return OCCASION_NAME;
  }
  public void setOCCASIONNAME(String OCCASION_NAME) {
    this.OCCASION_NAME = OCCASION_NAME;
  }

  
  /**
   * Occasion date, in YYYY-MM-DD HH:MM:SS format
   **/
  public APIOrganisationDate OCCASION_DATE(Date OCCASION_DATE) {
    this.OCCASION_DATE = OCCASION_DATE;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Occasion date, in YYYY-MM-DD HH:MM:SS format")
  @JsonProperty("OCCASION_DATE")
  public Date getOCCASIONDATE() {
    return OCCASION_DATE;
  }
  public void setOCCASIONDATE(Date OCCASION_DATE) {
    this.OCCASION_DATE = OCCASION_DATE;
  }

  
  /**
   * True, if Occasion occurs each year
   **/
  public APIOrganisationDate REPEAT_YEARLY(Boolean REPEAT_YEARLY) {
    this.REPEAT_YEARLY = REPEAT_YEARLY;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "True, if Occasion occurs each year")
  @JsonProperty("REPEAT_YEARLY")
  public Boolean getREPEATYEARLY() {
    return REPEAT_YEARLY;
  }
  public void setREPEATYEARLY(Boolean REPEAT_YEARLY) {
    this.REPEAT_YEARLY = REPEAT_YEARLY;
  }

  
  /**
   * True, to create a reminder each year
   **/
  public APIOrganisationDate CREATE_TASK_YEARLY(Boolean CREATE_TASK_YEARLY) {
    this.CREATE_TASK_YEARLY = CREATE_TASK_YEARLY;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "True, to create a reminder each year")
  @JsonProperty("CREATE_TASK_YEARLY")
  public Boolean getCREATETASKYEARLY() {
    return CREATE_TASK_YEARLY;
  }
  public void setCREATETASKYEARLY(Boolean CREATE_TASK_YEARLY) {
    this.CREATE_TASK_YEARLY = CREATE_TASK_YEARLY;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    APIOrganisationDate aPIOrganisationDate = (APIOrganisationDate) o;
    return Objects.equals(this.DATE_ID, aPIOrganisationDate.DATE_ID) &&
        Objects.equals(this.OCCASION_NAME, aPIOrganisationDate.OCCASION_NAME) &&
        Objects.equals(this.OCCASION_DATE, aPIOrganisationDate.OCCASION_DATE) &&
        Objects.equals(this.REPEAT_YEARLY, aPIOrganisationDate.REPEAT_YEARLY) &&
        Objects.equals(this.CREATE_TASK_YEARLY, aPIOrganisationDate.CREATE_TASK_YEARLY);
  }

  @Override
  public int hashCode() {
    return Objects.hash(DATE_ID, OCCASION_NAME, OCCASION_DATE, REPEAT_YEARLY, CREATE_TASK_YEARLY);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class APIOrganisationDate {\n");
    
    sb.append("    DATE_ID: ").append(toIndentedString(DATE_ID)).append("\n");
    sb.append("    OCCASION_NAME: ").append(toIndentedString(OCCASION_NAME)).append("\n");
    sb.append("    OCCASION_DATE: ").append(toIndentedString(OCCASION_DATE)).append("\n");
    sb.append("    REPEAT_YEARLY: ").append(toIndentedString(REPEAT_YEARLY)).append("\n");
    sb.append("    CREATE_TASK_YEARLY: ").append(toIndentedString(CREATE_TASK_YEARLY)).append("\n");
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

