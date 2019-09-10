/*
 * LaunchDarkly REST API
 * Build custom integrations with the LaunchDarkly REST API
 *
 * OpenAPI spec version: 2.0.19
 * Contact: support@launchdarkly.com
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package com.launchdarkly.api.api;

import com.launchdarkly.api.ApiException;
import com.launchdarkly.api.model.Environment;
import com.launchdarkly.api.model.EnvironmentPost;
import com.launchdarkly.api.model.PatchOperation;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for EnvironmentsApi
 */
@Ignore
public class EnvironmentsApiTest {

    private final EnvironmentsApi api = new EnvironmentsApi();

    
    /**
     * Delete an environment in a specific project.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteEnvironmentTest() throws ApiException {
        String projectKey = null;
        String environmentKey = null;
        api.deleteEnvironment(projectKey, environmentKey);

        // TODO: test validations
    }
    
    /**
     * Get an environment given a project and key.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getEnvironmentTest() throws ApiException {
        String projectKey = null;
        String environmentKey = null;
        Environment response = api.getEnvironment(projectKey, environmentKey);

        // TODO: test validations
    }
    
    /**
     * Modify an environment by ID.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void patchEnvironmentTest() throws ApiException {
        String projectKey = null;
        String environmentKey = null;
        List<PatchOperation> patchDelta = null;
        Environment response = api.patchEnvironment(projectKey, environmentKey, patchDelta);

        // TODO: test validations
    }
    
    /**
     * Create a new environment in a specified project with a given name, key, and swatch color.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void postEnvironmentTest() throws ApiException {
        String projectKey = null;
        EnvironmentPost environmentBody = null;
        Environment response = api.postEnvironment(projectKey, environmentBody);

        // TODO: test validations
    }
    
}
