/*
 * LaunchDarkly REST API
 * Build custom integrations with the LaunchDarkly REST API
 *
 * OpenAPI spec version: 2.0.6
 * Contact: support@launchdarkly.com
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package com.launchdarkly.api.api;

import com.launchdarkly.api.ApiException;
import com.launchdarkly.api.model.PatchOperation;
import com.launchdarkly.api.model.Webhook;
import com.launchdarkly.api.model.WebhookBody;
import com.launchdarkly.api.model.Webhooks;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for WebhooksApi
 */
@Ignore
public class WebhooksApiTest {

    private final WebhooksApi api = new WebhooksApi();

    
    /**
     * Delete a webhook by ID.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteWebhookTest() throws ApiException {
        String resourceId = null;
        api.deleteWebhook(resourceId);

        // TODO: test validations
    }
    
    /**
     * Get a webhook by ID.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getWebhookTest() throws ApiException {
        String resourceId = null;
        Webhook response = api.getWebhook(resourceId);

        // TODO: test validations
    }
    
    /**
     * Fetch a list of all webhooks.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getWebhooksTest() throws ApiException {
        Webhooks response = api.getWebhooks();

        // TODO: test validations
    }
    
    /**
     * Modify a webhook by ID.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void patchWebhookTest() throws ApiException {
        String resourceId = null;
        List<PatchOperation> patchDelta = null;
        Webhook response = api.patchWebhook(resourceId, patchDelta);

        // TODO: test validations
    }
    
    /**
     * Create a webhook.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void postWebhookTest() throws ApiException {
        WebhookBody webhookBody = null;
        api.postWebhook(webhookBody);

        // TODO: test validations
    }
    
}
