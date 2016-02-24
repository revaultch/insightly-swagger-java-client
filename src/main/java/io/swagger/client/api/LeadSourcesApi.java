package io.swagger.client.api;

import com.sun.jersey.api.client.GenericType;

import io.swagger.client.ApiException;
import io.swagger.client.ApiClient;
import io.swagger.client.Configuration;
import io.swagger.client.Pair;

import io.swagger.client.model.APILeadSource;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-02-24T20:33:55.547+01:00")
public class LeadSourcesApi {
  private ApiClient apiClient;

  public LeadSourcesApi() {
    this(Configuration.getDefaultApiClient());
  }

  public LeadSourcesApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  public ApiClient getApiClient() {
    return apiClient;
  }

  public void setApiClient(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  
  /**
   * Gets a list of Lead Sources
   * This endpoint returns a list of the lead sources that have been defined on the Insightly instance.
   * @param skip Optional, number of lead sources to skip.
   * @param top Optional, maximum number of lead sources to return in the response.
   * @param countTotal Optional, true if total number of records should be returned in the response headers.
   * @return List<APILeadSource>
   */
  public List<APILeadSource> getLeadSources(Integer skip, Integer top, Boolean countTotal) throws ApiException {
    Object postBody = null;
    
    // create path and map variables
    String path = "/LeadSources".replaceAll("\\{format\\}","json");

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

    
    GenericType<List<APILeadSource>> returnType = new GenericType<List<APILeadSource>>() {};
    return apiClient.invokeAPI(path, "GET", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
  }
  
  /**
   * Updates a Lead Source
   * This endpoint is used to update an existing lead source.
   * @param leadSource A Lead Source
   * @return APILeadSource
   */
  public APILeadSource updateLeadSource(APILeadSource leadSource) throws ApiException {
    Object postBody = leadSource;
    
     // verify the required parameter 'leadSource' is set
     if (leadSource == null) {
        throw new ApiException(400, "Missing the required parameter 'leadSource' when calling updateLeadSource");
     }
     
    // create path and map variables
    String path = "/LeadSources".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, Object> formParams = new HashMap<String, Object>();

    

    

    

    final String[] accepts = {
      "application/json", "text/json"
    };
    final String accept = apiClient.selectHeaderAccept(accepts);

    final String[] contentTypes = {
      "application/json"
    };
    final String contentType = apiClient.selectHeaderContentType(contentTypes);

    String[] authNames = new String[] {  };

    
    GenericType<APILeadSource> returnType = new GenericType<APILeadSource>() {};
    return apiClient.invokeAPI(path, "PUT", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
  }
  
  /**
   * Adds a Lead Source
   * This endpoint is used to define a new lead source. This endpoint is only accessible to users with administrator access.
   * @param leadSource The Lead Source to add
   * @return APILeadSource
   */
  public APILeadSource addLeadSource(APILeadSource leadSource) throws ApiException {
    Object postBody = leadSource;
    
     // verify the required parameter 'leadSource' is set
     if (leadSource == null) {
        throw new ApiException(400, "Missing the required parameter 'leadSource' when calling addLeadSource");
     }
     
    // create path and map variables
    String path = "/LeadSources".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, Object> formParams = new HashMap<String, Object>();

    

    

    

    final String[] accepts = {
      "application/json", "text/json"
    };
    final String accept = apiClient.selectHeaderAccept(accepts);

    final String[] contentTypes = {
      "application/json"
    };
    final String contentType = apiClient.selectHeaderContentType(contentTypes);

    String[] authNames = new String[] {  };

    
    GenericType<APILeadSource> returnType = new GenericType<APILeadSource>() {};
    return apiClient.invokeAPI(path, "POST", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
  }
  
  /**
   * Deletes a Lead Source
   * This endpoint is used to delete an existing lead source.
   * @param id A Lead Source&#39;s ID
   * @return void
   */
  public void deleteLeadSource(Long id) throws ApiException {
    Object postBody = null;
    
     // verify the required parameter 'id' is set
     if (id == null) {
        throw new ApiException(400, "Missing the required parameter 'id' when calling deleteLeadSource");
     }
     
    // create path and map variables
    String path = "/LeadSources/{id}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "id" + "\\}", apiClient.escapeString(id.toString()));

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, Object> formParams = new HashMap<String, Object>();

    

    

    

    final String[] accepts = {
      "application/json", "text/json"
    };
    final String accept = apiClient.selectHeaderAccept(accepts);

    final String[] contentTypes = {
      "application/json"
    };
    final String contentType = apiClient.selectHeaderContentType(contentTypes);

    String[] authNames = new String[] {  };

    
    apiClient.invokeAPI(path, "DELETE", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, null);
    
  }
  
}
