package io.swagger.client.api;

import com.sun.jersey.api.client.GenericType;

import io.swagger.client.ApiException;
import io.swagger.client.ApiClient;
import io.swagger.client.Configuration;
import io.swagger.client.Pair;

import io.swagger.client.model.APILeadStatus;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-02-24T20:33:55.547+01:00")
public class LeadStatusesApi {
  private ApiClient apiClient;

  public LeadStatusesApi() {
    this(Configuration.getDefaultApiClient());
  }

  public LeadStatusesApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  public ApiClient getApiClient() {
    return apiClient;
  }

  public void setApiClient(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  
  /**
   * Gets a list of Lead Statuses
   * This endpoint returns a list of the possible lead statuses that have been defined for the Insightly instance.
   * @param includeConverted Optional, by default converted status is not included, pass in \&quot;true\&quot; to include it in the response
   * @param skip Optional, number of lead statuses to skip.
   * @param top Optional, maximum number of lead statuses to return in the response.
   * @param countTotal Optional, true if total number of records should be returned in the response headers.
   * @return List<APILeadStatus>
   */
  public List<APILeadStatus> getLeadStatuses(Boolean includeConverted, Integer skip, Integer top, Boolean countTotal) throws ApiException {
    Object postBody = null;
    
    // create path and map variables
    String path = "/LeadStatuses".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, Object> formParams = new HashMap<String, Object>();

    
    queryParams.addAll(apiClient.parameterToPairs("", "include_converted", includeConverted));
    
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

    
    GenericType<List<APILeadStatus>> returnType = new GenericType<List<APILeadStatus>>() {};
    return apiClient.invokeAPI(path, "GET", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
  }
  
  /**
   * Updates a Lead Status
   * This endpoint is used to update an existing lead status. This endpoint is only accessible to users with administrator access.
   * @param leadStatus A Lead Status
   * @return APILeadStatus
   */
  public APILeadStatus updateLeadStatus(APILeadStatus leadStatus) throws ApiException {
    Object postBody = leadStatus;
    
     // verify the required parameter 'leadStatus' is set
     if (leadStatus == null) {
        throw new ApiException(400, "Missing the required parameter 'leadStatus' when calling updateLeadStatus");
     }
     
    // create path and map variables
    String path = "/LeadStatuses".replaceAll("\\{format\\}","json");

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

    
    GenericType<APILeadStatus> returnType = new GenericType<APILeadStatus>() {};
    return apiClient.invokeAPI(path, "PUT", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
  }
  
  /**
   * Adds a Lead Status
   * This endpoint is used to add a new lead status option to the instance. This endpoint is only accessible to users with administrator access.
   * @param leadStatus The Lead Status to add
   * @return APILeadStatus
   */
  public APILeadStatus addLeadStatus(APILeadStatus leadStatus) throws ApiException {
    Object postBody = leadStatus;
    
     // verify the required parameter 'leadStatus' is set
     if (leadStatus == null) {
        throw new ApiException(400, "Missing the required parameter 'leadStatus' when calling addLeadStatus");
     }
     
    // create path and map variables
    String path = "/LeadStatuses".replaceAll("\\{format\\}","json");

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

    
    GenericType<APILeadStatus> returnType = new GenericType<APILeadStatus>() {};
    return apiClient.invokeAPI(path, "POST", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
  }
  
  /**
   * Deletes a Lead Status
   * This endpoint is used to delete an existing lead status.
   * @param id A Lead Status&#39;s ID
   * @return void
   */
  public void deleteLeadStatus(Long id) throws ApiException {
    Object postBody = null;
    
     // verify the required parameter 'id' is set
     if (id == null) {
        throw new ApiException(400, "Missing the required parameter 'id' when calling deleteLeadStatus");
     }
     
    // create path and map variables
    String path = "/LeadStatuses/{id}".replaceAll("\\{format\\}","json")
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
