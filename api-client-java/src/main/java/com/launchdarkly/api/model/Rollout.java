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
import com.launchdarkly.api.model.WeightedVariation;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Rollout
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-02-12T22:54:15.249Z")
public class Rollout {
  @SerializedName("bucketBy")
  private String bucketBy = null;

  @SerializedName("variations")
  private List<WeightedVariation> variations = null;

  public Rollout bucketBy(String bucketBy) {
    this.bucketBy = bucketBy;
    return this;
  }

   /**
   * Get bucketBy
   * @return bucketBy
  **/
  @ApiModelProperty(value = "")
  public String getBucketBy() {
    return bucketBy;
  }

  public void setBucketBy(String bucketBy) {
    this.bucketBy = bucketBy;
  }

  public Rollout variations(List<WeightedVariation> variations) {
    this.variations = variations;
    return this;
  }

  public Rollout addVariationsItem(WeightedVariation variationsItem) {
    if (this.variations == null) {
      this.variations = new ArrayList<WeightedVariation>();
    }
    this.variations.add(variationsItem);
    return this;
  }

   /**
   * Get variations
   * @return variations
  **/
  @ApiModelProperty(value = "")
  public List<WeightedVariation> getVariations() {
    return variations;
  }

  public void setVariations(List<WeightedVariation> variations) {
    this.variations = variations;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Rollout rollout = (Rollout) o;
    return Objects.equals(this.bucketBy, rollout.bucketBy) &&
        Objects.equals(this.variations, rollout.variations);
  }

  @Override
  public int hashCode() {
    return Objects.hash(bucketBy, variations);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Rollout {\n");
    
    sb.append("    bucketBy: ").append(toIndentedString(bucketBy)).append("\n");
    sb.append("    variations: ").append(toIndentedString(variations)).append("\n");
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

