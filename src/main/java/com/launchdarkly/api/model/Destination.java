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
import com.launchdarkly.api.model.Links;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * Destination
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-11-20T01:06:04.895Z")
public class Destination {
  @SerializedName("_links")
  private Links links = null;

  @SerializedName("_id")
  private String id = null;

  @SerializedName("name")
  private String name = null;

  /**
   * Destination type (\&quot;google-pubsub\&quot;, \&quot;kinesis\&quot;, \&quot;mparticle\&quot;, or \&quot;segment\&quot;)
   */
  @JsonAdapter(KindEnum.Adapter.class)
  public enum KindEnum {
    GOOGLE_PUBSUB("google-pubsub"),
    
    KINESIS("kinesis"),
    
    MPARTICLE("mparticle"),
    
    SEGMENT("segment");

    private String value;

    KindEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static KindEnum fromValue(String text) {
      for (KindEnum b : KindEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<KindEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final KindEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public KindEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return KindEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName("kind")
  private KindEnum kind = null;

  @SerializedName("config")
  private Object config = null;

  @SerializedName("on")
  private Boolean on = null;

  @SerializedName("version")
  private Integer version = null;

  public Destination links(Links links) {
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

  public Destination id(String id) {
    this.id = id;
    return this;
  }

   /**
   * Unique destination ID.
   * @return id
  **/
  @ApiModelProperty(example = "37ed9aad-de0a-4665-932e-41c35587aeea", value = "Unique destination ID.")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public Destination name(String name) {
    this.name = name;
    return this;
  }

   /**
   * The destination name
   * @return name
  **/
  @ApiModelProperty(example = "Example Google Pub/Sub Destination", value = "The destination name")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Destination kind(KindEnum kind) {
    this.kind = kind;
    return this;
  }

   /**
   * Destination type (\&quot;google-pubsub\&quot;, \&quot;kinesis\&quot;, \&quot;mparticle\&quot;, or \&quot;segment\&quot;)
   * @return kind
  **/
  @ApiModelProperty(example = "google-pubsub", value = "Destination type (\"google-pubsub\", \"kinesis\", \"mparticle\", or \"segment\")")
  public KindEnum getKind() {
    return kind;
  }

  public void setKind(KindEnum kind) {
    this.kind = kind;
  }

  public Destination config(Object config) {
    this.config = config;
    return this;
  }

   /**
   * destination-specific configuration.
   * @return config
  **/
  @ApiModelProperty(example = "{\"project\":\"cool-project\",\"topic\":\"test\"}", value = "destination-specific configuration.")
  public Object getConfig() {
    return config;
  }

  public void setConfig(Object config) {
    this.config = config;
  }

  public Destination on(Boolean on) {
    this.on = on;
    return this;
  }

   /**
   * Whether the data export destination is on or not.
   * @return on
  **/
  @ApiModelProperty(example = "true", value = "Whether the data export destination is on or not.")
  public Boolean isOn() {
    return on;
  }

  public void setOn(Boolean on) {
    this.on = on;
  }

  public Destination version(Integer version) {
    this.version = version;
    return this;
  }

   /**
   * Get version
   * @return version
  **/
  @ApiModelProperty(example = "2", value = "")
  public Integer getVersion() {
    return version;
  }

  public void setVersion(Integer version) {
    this.version = version;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Destination destination = (Destination) o;
    return Objects.equals(this.links, destination.links) &&
        Objects.equals(this.id, destination.id) &&
        Objects.equals(this.name, destination.name) &&
        Objects.equals(this.kind, destination.kind) &&
        Objects.equals(this.config, destination.config) &&
        Objects.equals(this.on, destination.on) &&
        Objects.equals(this.version, destination.version);
  }

  @Override
  public int hashCode() {
    return Objects.hash(links, id, name, kind, config, on, version);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Destination {\n");
    
    sb.append("    links: ").append(toIndentedString(links)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    kind: ").append(toIndentedString(kind)).append("\n");
    sb.append("    config: ").append(toIndentedString(config)).append("\n");
    sb.append("    on: ").append(toIndentedString(on)).append("\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
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

