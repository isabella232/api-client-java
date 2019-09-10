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
 * Gets or Sets Role
 */
@JsonAdapter(Role.Adapter.class)
public enum Role {
  
  WRITER("writer"),
  
  READER("reader"),
  
  ADMIN("admin"),
  
  OWNER("owner");

  private String value;

  Role(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static Role fromValue(String text) {
    for (Role b : Role.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return null;
  }

  public static class Adapter extends TypeAdapter<Role> {
    @Override
    public void write(final JsonWriter jsonWriter, final Role enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public Role read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return Role.fromValue(String.valueOf(value));
    }
  }
}

