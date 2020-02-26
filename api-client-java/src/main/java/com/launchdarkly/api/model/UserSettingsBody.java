/*
 * LaunchDarkly REST API
 * Build custom integrations with the LaunchDarkly REST API
 *
 * OpenAPI spec version: 2.0.30
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
 * UserSettingsBody
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-02-26T23:38:52.972Z")
public class UserSettingsBody {
  @SerializedName("setting")
  private Boolean setting = null;

  public UserSettingsBody setting(Boolean setting) {
    this.setting = setting;
    return this;
  }

   /**
   * The variation value to set for the user. Must match the variation type of the flag. 
   * @return setting
  **/
  @ApiModelProperty(value = "The variation value to set for the user. Must match the variation type of the flag. ")
  public Boolean isSetting() {
    return setting;
  }

  public void setSetting(Boolean setting) {
    this.setting = setting;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UserSettingsBody userSettingsBody = (UserSettingsBody) o;
    return Objects.equals(this.setting, userSettingsBody.setting);
  }

  @Override
  public int hashCode() {
    return Objects.hash(setting);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UserSettingsBody {\n");
    
    sb.append("    setting: ").append(toIndentedString(setting)).append("\n");
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

