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
import com.google.gson.annotations.SerializedName;

import java.io.IOException;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;

/**
 * Gets or Sets CopyActions
 */
@JsonAdapter(CopyActions.Adapter.class)
public enum CopyActions {
  
  UPDATEON("updateOn"),
  
  UPDATEPREREQUISITES("updatePrerequisites"),
  
  UPDATETARGETS("updateTargets"),
  
  UPDATERULES("updateRules"),
  
  UPDATEFALLTHROUGH("updateFallthrough"),
  
  UPDATEOFFVARIATION("updateOffVariation");

  private String value;

  CopyActions(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static CopyActions fromValue(String text) {
    for (CopyActions b : CopyActions.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return null;
  }

  public static class Adapter extends TypeAdapter<CopyActions> {
    @Override
    public void write(final JsonWriter jsonWriter, final CopyActions enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public CopyActions read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return CopyActions.fromValue(String.valueOf(value));
    }
  }
}

