/*
 * LaunchDarkly REST API
 * Build custom integrations with the LaunchDarkly REST API
 *
 * OpenAPI spec version: 3.6.0
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
import com.launchdarkly.api.model.FeatureFlagScheduledChangesConflictsInstructions;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * FeatureFlagScheduledChangesConflicts
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-10-05T21:01:14.302Z")
public class FeatureFlagScheduledChangesConflicts {
  @SerializedName("instructions")
  private List<FeatureFlagScheduledChangesConflictsInstructions> instructions = null;

  public FeatureFlagScheduledChangesConflicts instructions(List<FeatureFlagScheduledChangesConflictsInstructions> instructions) {
    this.instructions = instructions;
    return this;
  }

  public FeatureFlagScheduledChangesConflicts addInstructionsItem(FeatureFlagScheduledChangesConflictsInstructions instructionsItem) {
    if (this.instructions == null) {
      this.instructions = new ArrayList<FeatureFlagScheduledChangesConflictsInstructions>();
    }
    this.instructions.add(instructionsItem);
    return this;
  }

   /**
   * Get instructions
   * @return instructions
  **/
  @ApiModelProperty(value = "")
  public List<FeatureFlagScheduledChangesConflictsInstructions> getInstructions() {
    return instructions;
  }

  public void setInstructions(List<FeatureFlagScheduledChangesConflictsInstructions> instructions) {
    this.instructions = instructions;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FeatureFlagScheduledChangesConflicts featureFlagScheduledChangesConflicts = (FeatureFlagScheduledChangesConflicts) o;
    return Objects.equals(this.instructions, featureFlagScheduledChangesConflicts.instructions);
  }

  @Override
  public int hashCode() {
    return Objects.hash(instructions);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FeatureFlagScheduledChangesConflicts {\n");
    
    sb.append("    instructions: ").append(toIndentedString(instructions)).append("\n");
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
