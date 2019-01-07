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


package com.launchdarkly.api.model;

import java.util.Objects;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * UserSegmentBody
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-01-07T23:25:29.865Z")
public class UserSegmentBody {
  @SerializedName("name")
  private String name = null;

  @SerializedName("key")
  private String key = null;

  @SerializedName("description")
  private String description = null;

  @SerializedName("tags")
  private List<String> tags = null;

  public UserSegmentBody name(String name) {
    this.name = name;
    return this;
  }

   /**
   * A human-friendly name for the user segment.
   * @return name
  **/
  @ApiModelProperty(example = "new segment", required = true, value = "A human-friendly name for the user segment.")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public UserSegmentBody key(String key) {
    this.key = key;
    return this;
  }

   /**
   * A unique key that will be used to reference the user segment in feature flags.
   * @return key
  **/
  @ApiModelProperty(example = "new-segment", required = true, value = "A unique key that will be used to reference the user segment in feature flags.")
  public String getKey() {
    return key;
  }

  public void setKey(String key) {
    this.key = key;
  }

  public UserSegmentBody description(String description) {
    this.description = description;
    return this;
  }

   /**
   * A description for the user segment.
   * @return description
  **/
  @ApiModelProperty(example = "Users in this segment will have access to beta features.", value = "A description for the user segment.")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public UserSegmentBody tags(List<String> tags) {
    this.tags = tags;
    return this;
  }

  public UserSegmentBody addTagsItem(String tagsItem) {
    if (this.tags == null) {
      this.tags = new ArrayList<String>();
    }
    this.tags.add(tagsItem);
    return this;
  }

   /**
   * Tags for the user segment.
   * @return tags
  **/
  @ApiModelProperty(value = "Tags for the user segment.")
  public List<String> getTags() {
    return tags;
  }

  public void setTags(List<String> tags) {
    this.tags = tags;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UserSegmentBody userSegmentBody = (UserSegmentBody) o;
    return Objects.equals(this.name, userSegmentBody.name) &&
        Objects.equals(this.key, userSegmentBody.key) &&
        Objects.equals(this.description, userSegmentBody.description) &&
        Objects.equals(this.tags, userSegmentBody.tags);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, key, description, tags);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UserSegmentBody {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    key: ").append(toIndentedString(key)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
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

