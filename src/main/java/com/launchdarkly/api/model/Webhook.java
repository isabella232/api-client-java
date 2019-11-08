/*
 * LaunchDarkly REST API
 * Build custom integrations with the LaunchDarkly REST API
 *
 * OpenAPI spec version: 2.0.21
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
import com.launchdarkly.api.model.Statements;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Webhook
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-11-08T23:43:42.697Z")
public class Webhook {
  @SerializedName("_links")
  private Links links = null;

  @SerializedName("_id")
  private String id = null;

  @SerializedName("url")
  private String url = null;

  @SerializedName("secret")
  private String secret = null;

  @SerializedName("on")
  private Boolean on = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("statements")
  private Statements statements = null;

  @SerializedName("tags")
  private List<String> tags = null;

  public Webhook links(Links links) {
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

  public Webhook id(String id) {
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @ApiModelProperty(value = "")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public Webhook url(String url) {
    this.url = url;
    return this;
  }

   /**
   * The URL of the remote webhook.
   * @return url
  **/
  @ApiModelProperty(example = "https://example.com/example", value = "The URL of the remote webhook.")
  public String getUrl() {
    return url;
  }

  public void setUrl(String url) {
    this.url = url;
  }

  public Webhook secret(String secret) {
    this.secret = secret;
    return this;
  }

   /**
   * If defined, the webhooks post request will include a X-LD-Signature header whose value will contain an HMAC SHA256 hex digest of the webhook payload, using the secret as the key.
   * @return secret
  **/
  @ApiModelProperty(example = "frobozz", value = "If defined, the webhooks post request will include a X-LD-Signature header whose value will contain an HMAC SHA256 hex digest of the webhook payload, using the secret as the key.")
  public String getSecret() {
    return secret;
  }

  public void setSecret(String secret) {
    this.secret = secret;
  }

  public Webhook on(Boolean on) {
    this.on = on;
    return this;
  }

   /**
   * Whether this webhook is enabled or not.
   * @return on
  **/
  @ApiModelProperty(example = "true", value = "Whether this webhook is enabled or not.")
  public Boolean isOn() {
    return on;
  }

  public void setOn(Boolean on) {
    this.on = on;
  }

  public Webhook name(String name) {
    this.name = name;
    return this;
  }

   /**
   * The name of the webhook.
   * @return name
  **/
  @ApiModelProperty(example = "Example hook", value = "The name of the webhook.")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Webhook statements(Statements statements) {
    this.statements = statements;
    return this;
  }

   /**
   * Get statements
   * @return statements
  **/
  @ApiModelProperty(value = "")
  public Statements getStatements() {
    return statements;
  }

  public void setStatements(Statements statements) {
    this.statements = statements;
  }

  public Webhook tags(List<String> tags) {
    this.tags = tags;
    return this;
  }

  public Webhook addTagsItem(String tagsItem) {
    if (this.tags == null) {
      this.tags = new ArrayList<String>();
    }
    this.tags.add(tagsItem);
    return this;
  }

   /**
   * Tags assigned to this webhook.
   * @return tags
  **/
  @ApiModelProperty(value = "Tags assigned to this webhook.")
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
    Webhook webhook = (Webhook) o;
    return Objects.equals(this.links, webhook.links) &&
        Objects.equals(this.id, webhook.id) &&
        Objects.equals(this.url, webhook.url) &&
        Objects.equals(this.secret, webhook.secret) &&
        Objects.equals(this.on, webhook.on) &&
        Objects.equals(this.name, webhook.name) &&
        Objects.equals(this.statements, webhook.statements) &&
        Objects.equals(this.tags, webhook.tags);
  }

  @Override
  public int hashCode() {
    return Objects.hash(links, id, url, secret, on, name, statements, tags);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Webhook {\n");
    
    sb.append("    links: ").append(toIndentedString(links)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
    sb.append("    secret: ").append(toIndentedString(secret)).append("\n");
    sb.append("    on: ").append(toIndentedString(on)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    statements: ").append(toIndentedString(statements)).append("\n");
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

