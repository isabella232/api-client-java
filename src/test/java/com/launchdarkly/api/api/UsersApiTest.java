/*
 * LaunchDarkly REST API
 * Build custom integrations with the LaunchDarkly REST API
 *
 * OpenAPI spec version: 2.0.12
 * Contact: support@launchdarkly.com
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package com.launchdarkly.api.api;

import com.launchdarkly.api.ApiException;
import java.math.BigDecimal;
import com.launchdarkly.api.model.User;
import com.launchdarkly.api.model.Users;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for UsersApi
 */
@Ignore
public class UsersApiTest {

    private final UsersApi api = new UsersApi();

    
    /**
     * Delete a user by ID.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteUserTest() throws ApiException {
        String projectKey = null;
        String environmentKey = null;
        String userKey = null;
        api.deleteUser(projectKey, environmentKey, userKey);

        // TODO: test validations
    }
    
    /**
     * Search users in LaunchDarkly based on their last active date, or a search query. It should not be used to enumerate all users in LaunchDarkly-- use the List users API resource.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getSearchUsersTest() throws ApiException {
        String projectKey = null;
        String environmentKey = null;
        String q = null;
        Integer limit = null;
        Integer offset = null;
        BigDecimal after = null;
        Users response = api.getSearchUsers(projectKey, environmentKey, q, limit, offset, after);

        // TODO: test validations
    }
    
    /**
     * Get a user by key.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getUserTest() throws ApiException {
        String projectKey = null;
        String environmentKey = null;
        String userKey = null;
        User response = api.getUser(projectKey, environmentKey, userKey);

        // TODO: test validations
    }
    
    /**
     * List all users in the environment. Includes the total count of users. In each page, there will be up to &#39;limit&#39; users returned (default 20). This is useful for exporting all users in the system for further analysis. Paginated collections will include a next link containing a URL with the next set of elements in the collection.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getUsersTest() throws ApiException {
        String projectKey = null;
        String environmentKey = null;
        Integer limit = null;
        String h = null;
        String scrollId = null;
        Users response = api.getUsers(projectKey, environmentKey, limit, h, scrollId);

        // TODO: test validations
    }
    
}
