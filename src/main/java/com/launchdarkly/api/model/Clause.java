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
import java.util.ArrayList;
import java.util.List;

/**
 * Clause
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-11-20T01:06:04.895Z")
public class Clause {
  @SerializedName("_id")
  private String id = null;

  @SerializedName("attribute")
  private String attribute = null;

  @SerializedName("op")
  private String op = null;

  @SerializedName("values")
  private List<Object> values = null;

  @SerializedName("negate")
  private Boolean negate = null;

  public Clause id(String id) {
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

  public Clause attribute(String attribute) {
    this.attribute = attribute;
    return this;
  }

   /**
   * Get attribute
   * @return attribute
  **/
  @ApiModelProperty(example = "groups", value = "")
  public String getAttribute() {
    return attribute;
  }

  public void setAttribute(String attribute) {
    this.attribute = attribute;
  }

  public Clause op(String op) {
    this.op = op;
    return this;
  }

   /**
   * Get op
   * @return op
  **/
  @ApiModelProperty(example = "in", value = "")
  public String getOp() {
    return op;
  }

  public void setOp(String op) {
    this.op = op;
  }

  public Clause values(List<Object> values) {
    this.values = values;
    return this;
  }

  public Clause addValuesItem(Object valuesItem) {
    if (this.values == null) {
      this.values = new ArrayList<Object>();
    }
    this.values.add(valuesItem);
    return this;
  }

   /**
   * Get values
   * @return values
  **/
  @ApiModelProperty(value = "")
  public List<Object> getValues() {
    return values;
  }

  public void setValues(List<Object> values) {
    this.values = values;
  }

  public Clause negate(Boolean negate) {
    this.negate = negate;
    return this;
  }

   /**
   * Get negate
   * @return negate
  **/
  @ApiModelProperty(value = "")
  public Boolean isNegate() {
    return negate;
  }

  public void setNegate(Boolean negate) {
    this.negate = negate;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Clause clause = (Clause) o;
    return Objects.equals(this.id, clause.id) &&
        Objects.equals(this.attribute, clause.attribute) &&
        Objects.equals(this.op, clause.op) &&
        Objects.equals(this.values, clause.values) &&
        Objects.equals(this.negate, clause.negate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, attribute, op, values, negate);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Clause {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    attribute: ").append(toIndentedString(attribute)).append("\n");
    sb.append("    op: ").append(toIndentedString(op)).append("\n");
    sb.append("    values: ").append(toIndentedString(values)).append("\n");
    sb.append("    negate: ").append(toIndentedString(negate)).append("\n");
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

