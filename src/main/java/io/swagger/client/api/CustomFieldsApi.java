package io.swagger.client.api;

import com.sun.jersey.api.client.GenericType;

import io.swagger.client.ApiException;
import io.swagger.client.ApiClient;
import io.swagger.client.Configuration;
import io.swagger.client.Pair;

import io.swagger.client.model.APICustomFieldMetadata;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-02-24T20:33:55.547+01:00")
public class CustomFieldsApi {
  private ApiClient apiClient;

  public CustomFieldsApi() {
    this(Configuration.getDefaultApiClient());
  }

  public CustomFieldsApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  public ApiClient getApiClient() {
    return apiClient;
  }

  public void setApiClient(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  
  /**
   * Gets a list of Custom Fields
   * Use this API call to get a list of custom fields, and their IDs. A common problem API users have is to reference an invalid CUSTOM_FIELD_ID when referencing custom fields in a newly created or updated object.            If you plan to use custom fields in your API based application, be sure you are working with valid custom field IDs. To add or update custom fields for your Insightly instance, you&#39;ll need to go to the web app to do so.
   * @param skip Optional, number of custom fields to skip.
   * @param top Optional, maximum number of custom fields to return in the response.
   * @param countTotal Optional, true if total number of records should be returned in the response headers.
   * @return List<APICustomFieldMetadata>
   */
  public List<APICustomFieldMetadata> getCustomFields(Integer skip, Integer top, Boolean countTotal) throws ApiException {
    Object postBody = null;
    
    // create path and map variables
    String path = "/CustomFields".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, Object> formParams = new HashMap<String, Object>();

    
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

    
    GenericType<List<APICustomFieldMetadata>> returnType = new GenericType<List<APICustomFieldMetadata>>() {};
    return apiClient.invokeAPI(path, "GET", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
  }
  
  /**
   * Gets a Custom Field
   * This endpoint returns the graph for a specific custom field.
   * @param id A Custom Field&#39;s ID
   * @return void
   */
  public void getCustomField(String id) throws ApiException {
    Object postBody = null;
    
     // verify the required parameter 'id' is set
     if (id == null) {
        throw new ApiException(400, "Missing the required parameter 'id' when calling getCustomField");
     }
     
    // create path and map variables
    String path = "/CustomFields/{id}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "id" + "\\}", apiClient.escapeString(id.toString()));

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, Object> formParams = new HashMap<String, Object>();

    

    

    

    final String[] accepts = {
      "application/json"
    };
    final String accept = apiClient.selectHeaderAccept(accepts);

    final String[] contentTypes = {
      "application/json"
    };
    final String contentType = apiClient.selectHeaderContentType(contentTypes);

    String[] authNames = new String[] {  };

    
    apiClient.invokeAPI(path, "GET", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, null);
    
  }
  
}
