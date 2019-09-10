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
import com.launchdarkly.api.model.Member;
import com.launchdarkly.api.model.Members;
import com.launchdarkly.api.model.MembersBody;
import com.launchdarkly.api.model.PatchOperation;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for TeamMembersApi
 */
@Ignore
public class TeamMembersApiTest {

    private final TeamMembersApi api = new TeamMembersApi();

    
    /**
     * Delete a team member by ID.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteMemberTest() throws ApiException {
        String memberId = null;
        api.deleteMember(memberId);

        // TODO: test validations
    }
    
    /**
     * Get a single team member by ID.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getMemberTest() throws ApiException {
        String memberId = null;
        Member response = api.getMember(memberId);

        // TODO: test validations
    }
    
    /**
     * Returns a list of all members in the account.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getMembersTest() throws ApiException {
        Members response = api.getMembers();

        // TODO: test validations
    }
    
    /**
     * Modify a team member by ID.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void patchMemberTest() throws ApiException {
        String memberId = null;
        List<PatchOperation> patchDelta = null;
        Member response = api.patchMember(memberId, patchDelta);

        // TODO: test validations
    }
    
    /**
     * Invite new members.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void postMembersTest() throws ApiException {
        List<MembersBody> membersBody = null;
        Members response = api.postMembers(membersBody);

        // TODO: test validations
    }
    
}
