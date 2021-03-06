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
 * IntegrationSubscriptionStatus
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-11-20T01:06:04.895Z")
public class IntegrationSubscriptionStatus {
  @SerializedName("successCount")
  private Integer successCount = null;

  @SerializedName("lastSuccess")
  private Long lastSuccess = null;

  @SerializedName("errorCount")
  private Integer errorCount = null;

  public IntegrationSubscriptionStatus successCount(Integer successCount) {
    this.successCount = successCount;
    return this;
  }

   /**
   * Get successCount
   * @return successCount
  **/
  @ApiModelProperty(example = "6", value = "")
  public Integer getSuccessCount() {
    return successCount;
  }

  public void setSuccessCount(Integer successCount) {
    this.successCount = successCount;
  }

  public IntegrationSubscriptionStatus lastSuccess(Long lastSuccess) {
    this.lastSuccess = lastSuccess;
    return this;
  }

   /**
   * A unix epoch time in milliseconds specifying the last time this integration was successfully used.
   * @return lastSuccess
  **/
  @ApiModelProperty(example = "1443652232590", value = "A unix epoch time in milliseconds specifying the last time this integration was successfully used.")
  public Long getLastSuccess() {
    return lastSuccess;
  }

  public void setLastSuccess(Long lastSuccess) {
    this.lastSuccess = lastSuccess;
  }

  public IntegrationSubscriptionStatus errorCount(Integer errorCount) {
    this.errorCount = errorCount;
    return this;
  }

   /**
   * Get errorCount
   * @return errorCount
  **/
  @ApiModelProperty(example = "2", value = "")
  public Integer getErrorCount() {
    return errorCount;
  }

  public void setErrorCount(Integer errorCount) {
    this.errorCount = errorCount;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IntegrationSubscriptionStatus integrationSubscriptionStatus = (IntegrationSubscriptionStatus) o;
    return Objects.equals(this.successCount, integrationSubscriptionStatus.successCount) &&
        Objects.equals(this.lastSuccess, integrationSubscriptionStatus.lastSuccess) &&
        Objects.equals(this.errorCount, integrationSubscriptionStatus.errorCount);
  }

  @Override
  public int hashCode() {
    return Objects.hash(successCount, lastSuccess, errorCount);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IntegrationSubscriptionStatus {\n");
    
    sb.append("    successCount: ").append(toIndentedString(successCount)).append("\n");
    sb.append("    lastSuccess: ").append(toIndentedString(lastSuccess)).append("\n");
    sb.append("    errorCount: ").append(toIndentedString(errorCount)).append("\n");
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

