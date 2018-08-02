/*
 * LaunchDarkly REST API
 * Build custom integrations with the LaunchDarkly REST API
 *
 * OpenAPI spec version: 2.0.6
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

/**
 * WebhookBody
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-08-01T18:06:36.710-07:00")
public class WebhookBody {
  @SerializedName("url")
  private String url = null;

  @SerializedName("secret")
  private String secret = null;

  @SerializedName("sign")
  private Boolean sign = null;

  @SerializedName("on")
  private Boolean on = null;

  @SerializedName("name")
  private String name = null;

  public WebhookBody url(String url) {
    this.url = url;
    return this;
  }

   /**
   * The URL of the remote webhook.
   * @return url
  **/
  @ApiModelProperty(example = "https://example.com/example", required = true, value = "The URL of the remote webhook.")
  public String getUrl() {
    return url;
  }

  public void setUrl(String url) {
    this.url = url;
  }

  public WebhookBody secret(String secret) {
    this.secret = secret;
    return this;
  }

   /**
   * If sign is true, and the secret attribute is omitted, LaunchDarkly will automatically generate a secret for you.
   * @return secret
  **/
  @ApiModelProperty(example = "<password>", value = "If sign is true, and the secret attribute is omitted, LaunchDarkly will automatically generate a secret for you.")
  public String getSecret() {
    return secret;
  }

  public void setSecret(String secret) {
    this.secret = secret;
  }

  public WebhookBody sign(Boolean sign) {
    this.sign = sign;
    return this;
  }

   /**
   * If sign is false, the webhook will not include a signature header, and the secret can be omitted.
   * @return sign
  **/
  @ApiModelProperty(required = true, value = "If sign is false, the webhook will not include a signature header, and the secret can be omitted.")
  public Boolean isSign() {
    return sign;
  }

  public void setSign(Boolean sign) {
    this.sign = sign;
  }

  public WebhookBody on(Boolean on) {
    this.on = on;
    return this;
  }

   /**
   * Whether this webhook is enabled or not.
   * @return on
  **/
  @ApiModelProperty(example = "true", required = true, value = "Whether this webhook is enabled or not.")
  public Boolean isOn() {
    return on;
  }

  public void setOn(Boolean on) {
    this.on = on;
  }

  public WebhookBody name(String name) {
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


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    WebhookBody webhookBody = (WebhookBody) o;
    return Objects.equals(this.url, webhookBody.url) &&
        Objects.equals(this.secret, webhookBody.secret) &&
        Objects.equals(this.sign, webhookBody.sign) &&
        Objects.equals(this.on, webhookBody.on) &&
        Objects.equals(this.name, webhookBody.name);
  }

  @Override
  public int hashCode() {
    return Objects.hash(url, secret, sign, on, name);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WebhookBody {\n");
    
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
    sb.append("    secret: ").append(toIndentedString(secret)).append("\n");
    sb.append("    sign: ").append(toIndentedString(sign)).append("\n");
    sb.append("    on: ").append(toIndentedString(on)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
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

