/*
 * LaunchDarkly REST API
 * Build custom integrations with the LaunchDarkly REST API
 *
 * OpenAPI spec version: 3.9.0
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

/**
 * DestinationGooglePubSub
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-11-20T01:06:04.895Z")
public class DestinationGooglePubSub {
  @SerializedName("project")
  private String project = null;

  @SerializedName("topic")
  private String topic = null;

  public DestinationGooglePubSub project(String project) {
    this.project = project;
    return this;
  }

   /**
   * Get project
   * @return project
  **/
  @ApiModelProperty(example = "cool-project", value = "")
  public String getProject() {
    return project;
  }

  public void setProject(String project) {
    this.project = project;
  }

  public DestinationGooglePubSub topic(String topic) {
    this.topic = topic;
    return this;
  }

   /**
   * Get topic
   * @return topic
  **/
  @ApiModelProperty(example = "test", value = "")
  public String getTopic() {
    return topic;
  }

  public void setTopic(String topic) {
    this.topic = topic;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DestinationGooglePubSub destinationGooglePubSub = (DestinationGooglePubSub) o;
    return Objects.equals(this.project, destinationGooglePubSub.project) &&
        Objects.equals(this.topic, destinationGooglePubSub.topic);
  }

  @Override
  public int hashCode() {
    return Objects.hash(project, topic);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DestinationGooglePubSub {\n");
    
    sb.append("    project: ").append(toIndentedString(project)).append("\n");
    sb.append("    topic: ").append(toIndentedString(topic)).append("\n");
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

