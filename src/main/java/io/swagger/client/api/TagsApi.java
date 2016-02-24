package io.swagger.client.api;

import com.sun.jersey.api.client.GenericType;

import io.swagger.client.ApiException;
import io.swagger.client.ApiClient;
import io.swagger.client.Configuration;
import io.swagger.client.Pair;

import io.swagger.client.model.APITag;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-02-24T20:33:55.547+01:00")
public class TagsApi {
  private ApiClient apiClient;

  public TagsApi() {
    this(Configuration.getDefaultApiClient());
  }

  public TagsApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  public ApiClient getApiClient() {
    return apiClient;
  }

  public void setApiClient(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  
  /**
   * Gets a list of Tags used for a record type
   * This endpoint returns a list of tags associated with a record type. The endpoint expects the query parameter            record_type=contacts|leads|opportunities|organisations|projects|emails, so to fetch a list of tags associated with contacts, your query would be            /Tags?record_type=contacts
   * @param recordType Required, filters tags by a given record type.
   * @param skip Optional, number of records to skip.
   * @param top Optional, maximum number of records to return in the response.
   * @param countTotal Optional, true if total number of records should be returned in the response headers.
   * @return List<APITag>
   */
  public List<APITag> getTags(String recordType, Integer skip, Integer top, Boolean countTotal) throws ApiException {
    Object postBody = null;
    
     // verify the required parameter 'recordType' is set
     if (recordType == null) {
        throw new ApiException(400, "Missing the required parameter 'recordType' when calling getTags");
     }
     
    // create path and map variables
    String path = "/Tags".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, Object> formParams = new HashMap<String, Object>();

    
    queryParams.addAll(apiClient.parameterToPairs("", "record_type", recordType));
    
    queryParams.addAll(apiClient.parameterToPairs("", "skip", skip));
    
    queryParams.addAll(apiClient.parameterToPairs("", "top", top));
    
    queryParams.addAll(apiClient.parameterToPairs("", "count_total", countTotal));
    

    

    

    final String[] accepts = {
      "application/json"
    };
    final String accept = apiClient.selectHeaderAccept(accepts);

    final String[] contentTypes = {
      "application/json"
    };
    final String contentType = apiClient.selectHeaderContentType(contentTypes);

    String[] authNames = new String[] {  };

    
    GenericType<List<APITag>> returnType = new GenericType<List<APITag>>() {};
    return apiClient.invokeAPI(path, "GET", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
  }
  
}
