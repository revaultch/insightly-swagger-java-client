package io.swagger.client.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;



/**
 * APIAddress
 **/

@ApiModel(description = "APIAddress")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-02-24T20:33:55.547+01:00")
public class APIAddress   {
  
  private Long ADDRESS_ID = null;
  private String ADDRESS_TYPE = null;
  private String STREET = null;
  private String CITY = null;
  private String STATE = null;
  private String POSTCODE = null;
  private String COUNTRY = null;

  
  /**
   * Unique key of the address record
   **/
  public APIAddress ADDRESS_ID(Long ADDRESS_ID) {
    this.ADDRESS_ID = ADDRESS_ID;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Unique key of the address record")
  @JsonProperty("ADDRESS_ID")
  public Long getADDRESSID() {
    return ADDRESS_ID;
  }
  public void setADDRESSID(Long ADDRESS_ID) {
    this.ADDRESS_ID = ADDRESS_ID;
  }

  
  /**
   * Address Type
   **/
  public APIAddress ADDRESS_TYPE(String ADDRESS_TYPE) {
    this.ADDRESS_TYPE = ADDRESS_TYPE;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Address Type")
  @JsonProperty("ADDRESS_TYPE")
  public String getADDRESSTYPE() {
    return ADDRESS_TYPE;
  }
  public void setADDRESSTYPE(String ADDRESS_TYPE) {
    this.ADDRESS_TYPE = ADDRESS_TYPE;
  }

  
  /**
   * Street number and name of address
   **/
  public APIAddress STREET(String STREET) {
    this.STREET = STREET;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Street number and name of address")
  @JsonProperty("STREET")
  public String getSTREET() {
    return STREET;
  }
  public void setSTREET(String STREET) {
    this.STREET = STREET;
  }

  
  /**
   * City
   **/
  public APIAddress CITY(String CITY) {
    this.CITY = CITY;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "City")
  @JsonProperty("CITY")
  public String getCITY() {
    return CITY;
  }
  public void setCITY(String CITY) {
    this.CITY = CITY;
  }

  
  /**
   * State/Province
   **/
  public APIAddress STATE(String STATE) {
    this.STATE = STATE;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "State/Province")
  @JsonProperty("STATE")
  public String getSTATE() {
    return STATE;
  }
  public void setSTATE(String STATE) {
    this.STATE = STATE;
  }

  
  /**
   * Zip or postal code
   **/
  public APIAddress POSTCODE(String POSTCODE) {
    this.POSTCODE = POSTCODE;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Zip or postal code")
  @JsonProperty("POSTCODE")
  public String getPOSTCODE() {
    return POSTCODE;
  }
  public void setPOSTCODE(String POSTCODE) {
    this.POSTCODE = POSTCODE;
  }

  
  /**
   * Country, see Countries resource for options
   **/
  public APIAddress COUNTRY(String COUNTRY) {
    this.COUNTRY = COUNTRY;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Country, see Countries resource for options")
  @JsonProperty("COUNTRY")
  public String getCOUNTRY() {
    return COUNTRY;
  }
  public void setCOUNTRY(String COUNTRY) {
    this.COUNTRY = COUNTRY;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    APIAddress aPIAddress = (APIAddress) o;
    return Objects.equals(this.ADDRESS_ID, aPIAddress.ADDRESS_ID) &&
        Objects.equals(this.ADDRESS_TYPE, aPIAddress.ADDRESS_TYPE) &&
        Objects.equals(this.STREET, aPIAddress.STREET) &&
        Objects.equals(this.CITY, aPIAddress.CITY) &&
        Objects.equals(this.STATE, aPIAddress.STATE) &&
        Objects.equals(this.POSTCODE, aPIAddress.POSTCODE) &&
        Objects.equals(this.COUNTRY, aPIAddress.COUNTRY);
  }

  @Override
  public int hashCode() {
    return Objects.hash(ADDRESS_ID, ADDRESS_TYPE, STREET, CITY, STATE, POSTCODE, COUNTRY);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class APIAddress {\n");
    
    sb.append("    ADDRESS_ID: ").append(toIndentedString(ADDRESS_ID)).append("\n");
    sb.append("    ADDRESS_TYPE: ").append(toIndentedString(ADDRESS_TYPE)).append("\n");
    sb.append("    STREET: ").append(toIndentedString(STREET)).append("\n");
    sb.append("    CITY: ").append(toIndentedString(CITY)).append("\n");
    sb.append("    STATE: ").append(toIndentedString(STATE)).append("\n");
    sb.append("    POSTCODE: ").append(toIndentedString(POSTCODE)).append("\n");
    sb.append("    COUNTRY: ").append(toIndentedString(COUNTRY)).append("\n");
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

