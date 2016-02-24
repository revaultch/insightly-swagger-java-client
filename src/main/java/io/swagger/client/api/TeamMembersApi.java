package io.swagger.client.api;

import com.sun.jersey.api.client.GenericType;

import io.swagger.client.ApiException;
import io.swagger.client.ApiClient;
import io.swagger.client.Configuration;
import io.swagger.client.Pair;

import io.swagger.client.model.APITeamMember;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-02-24T20:33:55.547+01:00")
public class TeamMembersApi {
  private ApiClient apiClient;

  public TeamMembersApi() {
    this(Configuration.getDefaultApiClient());
  }

  public TeamMembersApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  public ApiClient getApiClient() {
    return apiClient;
  }

  public void setApiClient(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  
  /**
   * Gets a list of Team Members
   * 
   * @param skip Optional, number of team members to skip.
   * @param top Optional, maximum number of team members to return in the response.
   * @param countTotal Optional, true if total number of records should be returned in the response headers.
   * @return List<APITeamMember>
   */
  public List<APITeamMember> getTeamMembers(Integer skip, Integer top, Boolean countTotal) throws ApiException {
    Object postBody = null;
    
    // create path and map variables
    String path = "/TeamMembers".replaceAll("\\{format\\}","json");

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

    
    GenericType<List<APITeamMember>> returnType = new GenericType<List<APITeamMember>>() {};
    return apiClient.invokeAPI(path, "GET", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
  }
  
  /**
   * Updates a Team Member
   * 
   * @param apiTeamMember The Team Member to update (just include JSON object as request body)
   * @return APITeamMember
   */
  public APITeamMember updateTeamMember(APITeamMember apiTeamMember) throws ApiException {
    Object postBody = apiTeamMember;
    
     // verify the required parameter 'apiTeamMember' is set
     if (apiTeamMember == null) {
        throw new ApiException(400, "Missing the required parameter 'apiTeamMember' when calling updateTeamMember");
     }
     
    // create path and map variables
    String path = "/TeamMembers".replaceAll("\\{format\\}","json");

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

    
    GenericType<APITeamMember> returnType = new GenericType<APITeamMember>() {};
    return apiClient.invokeAPI(path, "PUT", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
  }
  
  /**
   * Adds a new Team Member
   * 
   * @param apiTeamMember The Team Member to add (just include JSON object as request body)
   * @return APITeamMember
   */
  public APITeamMember addTeamMember(APITeamMember apiTeamMember) throws ApiException {
    Object postBody = apiTeamMember;
    
     // verify the required parameter 'apiTeamMember' is set
     if (apiTeamMember == null) {
        throw new ApiException(400, "Missing the required parameter 'apiTeamMember' when calling addTeamMember");
     }
     
    // create path and map variables
    String path = "/TeamMembers".replaceAll("\\{format\\}","json");

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

    
    GenericType<APITeamMember> returnType = new GenericType<APITeamMember>() {};
    return apiClient.invokeAPI(path, "POST", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
  }
  
  /**
   * Gets a Team Member
   * 
   * @param id A Team Member&#39;s ID (PERMISSION_ID)
   * @return APITeamMember
   */
  public APITeamMember getTeamMember(Long id) throws ApiException {
    Object postBody = null;
    
     // verify the required parameter 'id' is set
     if (id == null) {
        throw new ApiException(400, "Missing the required parameter 'id' when calling getTeamMember");
     }
     
    // create path and map variables
    String path = "/TeamMembers/{id}".replaceAll("\\{format\\}","json")
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

    
    GenericType<APITeamMember> returnType = new GenericType<APITeamMember>() {};
    return apiClient.invokeAPI(path, "GET", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
  }
  
  /**
   * Deletes a Team Member
   * 
   * @param id A Team Member&#39;s ID (PERMISSION_ID)
   * @return void
   */
  public void deleteTeamMember(Long id) throws ApiException {
    Object postBody = null;
    
     // verify the required parameter 'id' is set
     if (id == null) {
        throw new ApiException(400, "Missing the required parameter 'id' when calling deleteTeamMember");
     }
     
    // create path and map variables
    String path = "/TeamMembers/{id}".replaceAll("\\{format\\}","json")
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
