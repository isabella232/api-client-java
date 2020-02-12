/*
 * LaunchDarkly REST API
 * Build custom integrations with the LaunchDarkly REST API
 *
 * OpenAPI spec version: 2.0.29
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
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

/**
 * EnvironmentPost
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-02-12T22:54:15.249Z")
public class EnvironmentPost {
  @SerializedName("name")
  private String name = null;

  @SerializedName("key")
  private String key = null;

  @SerializedName("color")
  private String color = null;

  @SerializedName("defaultTtl")
  private BigDecimal defaultTtl = null;

  @SerializedName("secureMode")
  private Boolean secureMode = null;

  @SerializedName("defaultTrackEvents")
  private Boolean defaultTrackEvents = null;

  @SerializedName("tags")
  private List<String> tags = null;

  @SerializedName("requireComments")
  private Boolean requireComments = null;

  @SerializedName("confirmChanges")
  private Boolean confirmChanges = null;

  public EnvironmentPost name(String name) {
    this.name = name;
    return this;
  }

   /**
   * The name of the new environment.
   * @return name
  **/
  @ApiModelProperty(example = "Development", required = true, value = "The name of the new environment.")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public EnvironmentPost key(String key) {
    this.key = key;
    return this;
  }

   /**
   * A project-unique key for the new environment.
   * @return key
  **/
  @ApiModelProperty(example = "dev", required = true, value = "A project-unique key for the new environment.")
  public String getKey() {
    return key;
  }

  public void setKey(String key) {
    this.key = key;
  }

  public EnvironmentPost color(String color) {
    this.color = color;
    return this;
  }

   /**
   * A color swatch (as an RGB hex value with no leading &#39;#&#39;, e.g. C8C8C8).
   * @return color
  **/
  @ApiModelProperty(example = "417505", required = true, value = "A color swatch (as an RGB hex value with no leading '#', e.g. C8C8C8).")
  public String getColor() {
    return color;
  }

  public void setColor(String color) {
    this.color = color;
  }

  public EnvironmentPost defaultTtl(BigDecimal defaultTtl) {
    this.defaultTtl = defaultTtl;
    return this;
  }

   /**
   * The default TTL for the new environment.
   * @return defaultTtl
  **/
  @ApiModelProperty(example = "0.0", value = "The default TTL for the new environment.")
  public BigDecimal getDefaultTtl() {
    return defaultTtl;
  }

  public void setDefaultTtl(BigDecimal defaultTtl) {
    this.defaultTtl = defaultTtl;
  }

  public EnvironmentPost secureMode(Boolean secureMode) {
    this.secureMode = secureMode;
    return this;
  }

   /**
   * Determines whether the environment is in secure mode.
   * @return secureMode
  **/
  @ApiModelProperty(example = "false", value = "Determines whether the environment is in secure mode.")
  public Boolean isSecureMode() {
    return secureMode;
  }

  public void setSecureMode(Boolean secureMode) {
    this.secureMode = secureMode;
  }

  public EnvironmentPost defaultTrackEvents(Boolean defaultTrackEvents) {
    this.defaultTrackEvents = defaultTrackEvents;
    return this;
  }

   /**
   * Set to true to send detailed event information for newly created flags.
   * @return defaultTrackEvents
  **/
  @ApiModelProperty(example = "false", value = "Set to true to send detailed event information for newly created flags.")
  public Boolean isDefaultTrackEvents() {
    return defaultTrackEvents;
  }

  public void setDefaultTrackEvents(Boolean defaultTrackEvents) {
    this.defaultTrackEvents = defaultTrackEvents;
  }

  public EnvironmentPost tags(List<String> tags) {
    this.tags = tags;
    return this;
  }

  public EnvironmentPost addTagsItem(String tagsItem) {
    if (this.tags == null) {
      this.tags = new ArrayList<String>();
    }
    this.tags.add(tagsItem);
    return this;
  }

   /**
   * An array of tags for this environment.
   * @return tags
  **/
  @ApiModelProperty(example = "[\"tag1\",\"tag2\"]", value = "An array of tags for this environment.")
  public List<String> getTags() {
    return tags;
  }

  public void setTags(List<String> tags) {
    this.tags = tags;
  }

  public EnvironmentPost requireComments(Boolean requireComments) {
    this.requireComments = requireComments;
    return this;
  }

   /**
   * Determines if this environment requires comments for flag and segment changes.
   * @return requireComments
  **/
  @ApiModelProperty(example = "false", value = "Determines if this environment requires comments for flag and segment changes.")
  public Boolean isRequireComments() {
    return requireComments;
  }

  public void setRequireComments(Boolean requireComments) {
    this.requireComments = requireComments;
  }

  public EnvironmentPost confirmChanges(Boolean confirmChanges) {
    this.confirmChanges = confirmChanges;
    return this;
  }

   /**
   * Determines if this environment requires confirmation for flag and segment changes.
   * @return confirmChanges
  **/
  @ApiModelProperty(example = "false", value = "Determines if this environment requires confirmation for flag and segment changes.")
  public Boolean isConfirmChanges() {
    return confirmChanges;
  }

  public void setConfirmChanges(Boolean confirmChanges) {
    this.confirmChanges = confirmChanges;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EnvironmentPost environmentPost = (EnvironmentPost) o;
    return Objects.equals(this.name, environmentPost.name) &&
        Objects.equals(this.key, environmentPost.key) &&
        Objects.equals(this.color, environmentPost.color) &&
        Objects.equals(this.defaultTtl, environmentPost.defaultTtl) &&
        Objects.equals(this.secureMode, environmentPost.secureMode) &&
        Objects.equals(this.defaultTrackEvents, environmentPost.defaultTrackEvents) &&
        Objects.equals(this.tags, environmentPost.tags) &&
        Objects.equals(this.requireComments, environmentPost.requireComments) &&
        Objects.equals(this.confirmChanges, environmentPost.confirmChanges);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, key, color, defaultTtl, secureMode, defaultTrackEvents, tags, requireComments, confirmChanges);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EnvironmentPost {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    key: ").append(toIndentedString(key)).append("\n");
    sb.append("    color: ").append(toIndentedString(color)).append("\n");
    sb.append("    defaultTtl: ").append(toIndentedString(defaultTtl)).append("\n");
    sb.append("    secureMode: ").append(toIndentedString(secureMode)).append("\n");
    sb.append("    defaultTrackEvents: ").append(toIndentedString(defaultTrackEvents)).append("\n");
    sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
    sb.append("    requireComments: ").append(toIndentedString(requireComments)).append("\n");
    sb.append("    confirmChanges: ").append(toIndentedString(confirmChanges)).append("\n");
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

