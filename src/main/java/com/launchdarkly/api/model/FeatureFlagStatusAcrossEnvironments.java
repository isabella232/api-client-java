/*
 * LaunchDarkly REST API
 * Build custom integrations with the LaunchDarkly REST API
 *
 * OpenAPI spec version: 3.4.0
 * Contact: support@launchdarkly.com
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package com.launchdarkly.api.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.launchdarkly.api.model.FeatureFlagStatusForQueriedEnvironment;
import com.launchdarkly.api.model.Links;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * FeatureFlagStatusAcrossEnvironments
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-08-12T16:37:54.213Z")
public class FeatureFlagStatusAcrossEnvironments {
  @SerializedName("_links")
  private Links links = null;

  @SerializedName("key")
  private String key = null;

  @SerializedName("environments")
  private Map<String, FeatureFlagStatusForQueriedEnvironment> environments = null;

  public FeatureFlagStatusAcrossEnvironments links(Links links) {
    this.links = links;
    return this;
  }

   /**
   * Get links
   * @return links
  **/
  @ApiModelProperty(value = "")
  public Links getLinks() {
    return links;
  }

  public void setLinks(Links links) {
    this.links = links;
  }

  public FeatureFlagStatusAcrossEnvironments key(String key) {
    this.key = key;
    return this;
  }

   /**
   * Get key
   * @return key
  **/
  @ApiModelProperty(value = "")
  public String getKey() {
    return key;
  }

  public void setKey(String key) {
    this.key = key;
  }

  public FeatureFlagStatusAcrossEnvironments environments(Map<String, FeatureFlagStatusForQueriedEnvironment> environments) {
    this.environments = environments;
    return this;
  }

  public FeatureFlagStatusAcrossEnvironments putEnvironmentsItem(String key, FeatureFlagStatusForQueriedEnvironment environmentsItem) {
    if (this.environments == null) {
      this.environments = new HashMap<String, FeatureFlagStatusForQueriedEnvironment>();
    }
    this.environments.put(key, environmentsItem);
    return this;
  }

   /**
   * Get environments
   * @return environments
  **/
  @ApiModelProperty(value = "")
  public Map<String, FeatureFlagStatusForQueriedEnvironment> getEnvironments() {
    return environments;
  }

  public void setEnvironments(Map<String, FeatureFlagStatusForQueriedEnvironment> environments) {
    this.environments = environments;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FeatureFlagStatusAcrossEnvironments featureFlagStatusAcrossEnvironments = (FeatureFlagStatusAcrossEnvironments) o;
    return Objects.equals(this.links, featureFlagStatusAcrossEnvironments.links) &&
        Objects.equals(this.key, featureFlagStatusAcrossEnvironments.key) &&
        Objects.equals(this.environments, featureFlagStatusAcrossEnvironments.environments);
  }

  @Override
  public int hashCode() {
    return Objects.hash(links, key, environments);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FeatureFlagStatusAcrossEnvironments {\n");
    
    sb.append("    links: ").append(toIndentedString(links)).append("\n");
    sb.append("    key: ").append(toIndentedString(key)).append("\n");
    sb.append("    environments: ").append(toIndentedString(environments)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}

