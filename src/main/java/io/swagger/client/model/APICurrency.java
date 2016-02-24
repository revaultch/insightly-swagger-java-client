package io.swagger.client.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;



/**
 * APICurrency
 **/

@ApiModel(description = "APICurrency")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-02-24T20:33:55.547+01:00")
public class APICurrency   {
  
  private String CURRENCY_CODE = null;
  private String CURRENCY_SYMBOL = null;

  
  /**
   * Currency Code
   **/
  public APICurrency CURRENCY_CODE(String CURRENCY_CODE) {
    this.CURRENCY_CODE = CURRENCY_CODE;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Currency Code")
  @JsonProperty("CURRENCY_CODE")
  public String getCURRENCYCODE() {
    return CURRENCY_CODE;
  }
  public void setCURRENCYCODE(String CURRENCY_CODE) {
    this.CURRENCY_CODE = CURRENCY_CODE;
  }

  
  /**
   * Currency Symbol
   **/
  public APICurrency CURRENCY_SYMBOL(String CURRENCY_SYMBOL) {
    this.CURRENCY_SYMBOL = CURRENCY_SYMBOL;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Currency Symbol")
  @JsonProperty("CURRENCY_SYMBOL")
  public String getCURRENCYSYMBOL() {
    return CURRENCY_SYMBOL;
  }
  public void setCURRENCYSYMBOL(String CURRENCY_SYMBOL) {
    this.CURRENCY_SYMBOL = CURRENCY_SYMBOL;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    APICurrency aPICurrency = (APICurrency) o;
    return Objects.equals(this.CURRENCY_CODE, aPICurrency.CURRENCY_CODE) &&
        Objects.equals(this.CURRENCY_SYMBOL, aPICurrency.CURRENCY_SYMBOL);
  }

  @Override
  public int hashCode() {
    return Objects.hash(CURRENCY_CODE, CURRENCY_SYMBOL);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class APICurrency {\n");
    
    sb.append("    CURRENCY_CODE: ").append(toIndentedString(CURRENCY_CODE)).append("\n");
    sb.append("    CURRENCY_SYMBOL: ").append(toIndentedString(CURRENCY_SYMBOL)).append("\n");
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

