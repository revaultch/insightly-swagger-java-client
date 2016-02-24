package io.swagger.client.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;



/**
 * Container for an uploaded file
 **/

@ApiModel(description = "Container for an uploaded file")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-02-24T20:33:55.547+01:00")
public class APIFile   {
  
  private String FILE_NAME = null;
  private String CONTENT_TYPE = null;
  private Long FILE_CATEGORY_ID = null;

  
  /**
   * The name and extension of the File Attachment
   **/
  public APIFile FILE_NAME(String FILE_NAME) {
    this.FILE_NAME = FILE_NAME;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The name and extension of the File Attachment")
  @JsonProperty("FILE_NAME")
  public String getFILENAME() {
    return FILE_NAME;
  }
  public void setFILENAME(String FILE_NAME) {
    this.FILE_NAME = FILE_NAME;
  }

  
  /**
   * The MIME type of the File Attachment
   **/
  public APIFile CONTENT_TYPE(String CONTENT_TYPE) {
    this.CONTENT_TYPE = CONTENT_TYPE;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The MIME type of the File Attachment")
  @JsonProperty("CONTENT_TYPE")
  public String getCONTENTTYPE() {
    return CONTENT_TYPE;
  }
  public void setCONTENTTYPE(String CONTENT_TYPE) {
    this.CONTENT_TYPE = CONTENT_TYPE;
  }

  
  /**
   * The category of the File Attachment, if it has been assigned to one
   **/
  public APIFile FILE_CATEGORY_ID(Long FILE_CATEGORY_ID) {
    this.FILE_CATEGORY_ID = FILE_CATEGORY_ID;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The category of the File Attachment, if it has been assigned to one")
  @JsonProperty("FILE_CATEGORY_ID")
  public Long getFILECATEGORYID() {
    return FILE_CATEGORY_ID;
  }
  public void setFILECATEGORYID(Long FILE_CATEGORY_ID) {
    this.FILE_CATEGORY_ID = FILE_CATEGORY_ID;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    APIFile aPIFile = (APIFile) o;
    return Objects.equals(this.FILE_NAME, aPIFile.FILE_NAME) &&
        Objects.equals(this.CONTENT_TYPE, aPIFile.CONTENT_TYPE) &&
        Objects.equals(this.FILE_CATEGORY_ID, aPIFile.FILE_CATEGORY_ID);
  }

  @Override
  public int hashCode() {
    return Objects.hash(FILE_NAME, CONTENT_TYPE, FILE_CATEGORY_ID);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class APIFile {\n");
    
    sb.append("    FILE_NAME: ").append(toIndentedString(FILE_NAME)).append("\n");
    sb.append("    CONTENT_TYPE: ").append(toIndentedString(CONTENT_TYPE)).append("\n");
    sb.append("    FILE_CATEGORY_ID: ").append(toIndentedString(FILE_CATEGORY_ID)).append("\n");
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

