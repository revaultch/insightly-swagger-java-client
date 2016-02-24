package io.swagger.client.api;

import com.sun.jersey.api.client.GenericType;

import io.swagger.client.ApiException;
import io.swagger.client.ApiClient;
import io.swagger.client.Configuration;
import io.swagger.client.Pair;

import io.swagger.client.model.APITeam;
import java.util.Date;
import io.swagger.client.model.APITeamMember;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-02-24T20:33:55.547+01:00")
public class TeamsApi {
  private ApiClient apiClient;

  public TeamsApi() {
    this(Configuration.getDefaultApiClient());
  }

  public TeamsApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  public ApiClient getApiClient() {
    return apiClient;
  }

  public void setApiClient(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  
  /**
   * Gets a list of Teams.
   * Simple object graphs (excluding TEAMMEMBERS) are returned if \&quot;brief=true\&quot; is used in the query string.
   * @param brief Optional, true if response should only contain top level properties of the team.
   * @param skip Optional, number of teams to skip.
   * @param top Optional, maximum number of teams to return in the response.
   * @param countTotal Optional, true if total number of records should be returned in the response headers.
   * @return List<APITeam>
   */
  public List<APITeam> getTeams(Boolean brief, Integer skip, Integer top, Boolean countTotal) throws ApiException {
    Object postBody = null;
    
    // create path and map variables
    String path = "/Teams".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, Object> formParams = new HashMap<String, Object>();

    
    queryParams.addAll(apiClient.parameterToPairs("", "brief", brief));
    
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

    
    GenericType<List<APITeam>> returnType = new GenericType<List<APITeam>>() {};
    return apiClient.invokeAPI(path, "GET", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
  }
  
  /**
   * Updates a Team
   * 
   * @param apiTeam The Team to update (just include JSON object as request body)
   * @param brief Optional, true if you wish to do a partial update containing only top level properties of the Team. When true, all sub-collections are ignored.
   * @return APITeam
   */
  public APITeam updateTeam(APITeam apiTeam, Boolean brief) throws ApiException {
    Object postBody = apiTeam;
    
     // verify the required parameter 'apiTeam' is set
     if (apiTeam == null) {
        throw new ApiException(400, "Missing the required parameter 'apiTeam' when calling updateTeam");
     }
     
    // create path and map variables
    String path = "/Teams".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, Object> formParams = new HashMap<String, Object>();

    
    queryParams.addAll(apiClient.parameterToPairs("", "brief", brief));
    

    

    

    final String[] accepts = {
      "application/json", "text/json"
    };
    final String accept = apiClient.selectHeaderAccept(accepts);

    final String[] contentTypes = {
      "application/json"
    };
    final String contentType = apiClient.selectHeaderContentType(contentTypes);

    String[] authNames = new String[] {  };

    
    GenericType<APITeam> returnType = new GenericType<APITeam>() {};
    return apiClient.invokeAPI(path, "PUT", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
  }
  
  /**
   * Adds a Team
   * 
   * @param apiTeam The Team to add (just include JSON object as request body)
   * @return APITeam
   */
  public APITeam addTeam(APITeam apiTeam) throws ApiException {
    Object postBody = apiTeam;
    
     // verify the required parameter 'apiTeam' is set
     if (apiTeam == null) {
        throw new ApiException(400, "Missing the required parameter 'apiTeam' when calling addTeam");
     }
     
    // create path and map variables
    String path = "/Teams".replaceAll("\\{format\\}","json");

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

    
    GenericType<APITeam> returnType = new GenericType<APITeam>() {};
    return apiClient.invokeAPI(path, "POST", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
  }
  
  /**
   * Gets a filtered list of Teams.
   * Only one optional parameter (excluding brief, top, skip and count_total) can be specified. Simple object graphs (excluding TEAMMEMBERS) are returned if \&quot;brief=true\&quot; is used in the query string.
   * @param teamName Optional, name of the team.
   * @param updatedAfterUtc Optional, earliest date when team was last updated.
   * @param brief Optional, true if response should only contain top level properties of the team.
   * @param skip Optional, number of teams to skip.
   * @param top Optional, maximum number of teams to return in the response.
   * @param countTotal Optional, true if total number of records should be returned in the response headers.
   * @return List<APITeam>
   */
  public List<APITeam> getTeamsBySearch(String teamName, Date updatedAfterUtc, Boolean brief, Integer skip, Integer top, Boolean countTotal) throws ApiException {
    Object postBody = null;
    
    // create path and map variables
    String path = "/Teams/Search".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, Object> formParams = new HashMap<String, Object>();

    
    queryParams.addAll(apiClient.parameterToPairs("", "team_name", teamName));
    
    queryParams.addAll(apiClient.parameterToPairs("", "updated_after_utc", updatedAfterUtc));
    
    queryParams.addAll(apiClient.parameterToPairs("", "brief", brief));
    
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

    
    GenericType<List<APITeam>> returnType = new GenericType<List<APITeam>>() {};
    return apiClient.invokeAPI(path, "GET", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
  }
  
  /**
   * Gets a Team
   * 
   * @param id A Team&#39;s ID
   * @return APITeam
   */
  public APITeam getTeam(Long id) throws ApiException {
    Object postBody = null;
    
     // verify the required parameter 'id' is set
     if (id == null) {
        throw new ApiException(400, "Missing the required parameter 'id' when calling getTeam");
     }
     
    // create path and map variables
    String path = "/Teams/{id}".replaceAll("\\{format\\}","json")
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

    
    GenericType<APITeam> returnType = new GenericType<APITeam>() {};
    return apiClient.invokeAPI(path, "GET", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
  }
  
  /**
   * Deletes a Team
   * 
   * @param id A Team&#39;s ID
   * @return void
   */
  public void deleteTeam(Long id) throws ApiException {
    Object postBody = null;
    
     // verify the required parameter 'id' is set
     if (id == null) {
        throw new ApiException(400, "Missing the required parameter 'id' when calling deleteTeam");
     }
     
    // create path and map variables
    String path = "/Teams/{id}".replaceAll("\\{format\\}","json")
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
  
  /**
   * Updates a Team Member
   * 
   * @param id A Team&#39;s ID (TEAM_ID)
   * @param apiTeamMember The Team Member to update (just include JSON object as request body)
   * @return APITeamMember
   */
  public APITeamMember updateTeamMember(Long id, APITeamMember apiTeamMember) throws ApiException {
    Object postBody = apiTeamMember;
    
     // verify the required parameter 'id' is set
     if (id == null) {
        throw new ApiException(400, "Missing the required parameter 'id' when calling updateTeamMember");
     }
     
     // verify the required parameter 'apiTeamMember' is set
     if (apiTeamMember == null) {
        throw new ApiException(400, "Missing the required parameter 'apiTeamMember' when calling updateTeamMember");
     }
     
    // create path and map variables
    String path = "/Teams/{id}/TeamMembers".replaceAll("\\{format\\}","json")
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

    
    GenericType<APITeamMember> returnType = new GenericType<APITeamMember>() {};
    return apiClient.invokeAPI(path, "PUT", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
  }
  
  /**
   * Adds a Team Member
   * 
   * @param id A Team&#39;s ID (TEAM_ID)
   * @param apiTeamMember The Team Member to add (just include JSON object as request body)
   * @return APITeamMember
   */
  public APITeamMember addTeamMember(Long id, APITeamMember apiTeamMember) throws ApiException {
    Object postBody = apiTeamMember;
    
     // verify the required parameter 'id' is set
     if (id == null) {
        throw new ApiException(400, "Missing the required parameter 'id' when calling addTeamMember");
     }
     
     // verify the required parameter 'apiTeamMember' is set
     if (apiTeamMember == null) {
        throw new ApiException(400, "Missing the required parameter 'apiTeamMember' when calling addTeamMember");
     }
     
    // create path and map variables
    String path = "/Teams/{id}/TeamMembers".replaceAll("\\{format\\}","json")
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

    
    GenericType<APITeamMember> returnType = new GenericType<APITeamMember>() {};
    return apiClient.invokeAPI(path, "POST", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
  }
  
  /**
   * Deletes a Team Member
   * 
   * @param id A Team&#39;s ID (TEAM_ID)
   * @param permissionId A Team Members&#39;s ID (PERMISSION_ID)
   * @return void
   */
  public void deleteTeamMember(Long id, Long permissionId) throws ApiException {
    Object postBody = null;
    
     // verify the required parameter 'id' is set
     if (id == null) {
        throw new ApiException(400, "Missing the required parameter 'id' when calling deleteTeamMember");
     }
     
     // verify the required parameter 'permissionId' is set
     if (permissionId == null) {
        throw new ApiException(400, "Missing the required parameter 'permissionId' when calling deleteTeamMember");
     }
     
    // create path and map variables
    String path = "/Teams/{id}/TeamMembers/{permissionId}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "id" + "\\}", apiClient.escapeString(id.toString()))
      .replaceAll("\\{" + "permissionId" + "\\}", apiClient.escapeString(permissionId.toString()));

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
