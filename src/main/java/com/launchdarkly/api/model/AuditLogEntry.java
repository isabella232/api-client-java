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
import com.launchdarkly.api.model.AuditLogEntryTarget;
import com.launchdarkly.api.model.Links;
import com.launchdarkly.api.model.Member;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * AuditLogEntry
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-11-20T01:06:04.895Z")
public class AuditLogEntry {
  @SerializedName("_links")
  private Links links = null;

  @SerializedName("_id")
  private String id = null;

  @SerializedName("date")
  private Long date = null;

  @SerializedName("kind")
  private String kind = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("description")
  private String description = null;

  @SerializedName("shortDescription")
  private String shortDescription = null;

  @SerializedName("comment")
  private String comment = null;

  @SerializedName("member")
  private Member member = null;

  @SerializedName("titleVerb")
  private String titleVerb = null;

  @SerializedName("title")
  private String title = null;

  @SerializedName("target")
  private AuditLogEntryTarget target = null;

  public AuditLogEntry links(Links links) {
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

  public AuditLogEntry id(String id) {
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

  public AuditLogEntry date(Long date) {
    this.date = date;
    return this;
  }

   /**
   * Get date
   * @return date
  **/
  @ApiModelProperty(example = "1472243938774", value = "")
  public Long getDate() {
    return date;
  }

  public void setDate(Long date) {
    this.date = date;
  }

  public AuditLogEntry kind(String kind) {
    this.kind = kind;
    return this;
  }

   /**
   * Get kind
   * @return kind
  **/
  @ApiModelProperty(example = "environment", value = "")
  public String getKind() {
    return kind;
  }

  public void setKind(String kind) {
    this.kind = kind;
  }

  public AuditLogEntry name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @ApiModelProperty(example = "Testing", value = "")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public AuditLogEntry description(String description) {
    this.description = description;
    return this;
  }

   /**
   * Get description
   * @return description
  **/
  @ApiModelProperty(example = "Changed the name from Test to Testing", value = "")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public AuditLogEntry shortDescription(String shortDescription) {
    this.shortDescription = shortDescription;
    return this;
  }

   /**
   * Get shortDescription
   * @return shortDescription
  **/
  @ApiModelProperty(example = "\"\"", value = "")
  public String getShortDescription() {
    return shortDescription;
  }

  public void setShortDescription(String shortDescription) {
    this.shortDescription = shortDescription;
  }

  public AuditLogEntry comment(String comment) {
    this.comment = comment;
    return this;
  }

   /**
   * Get comment
   * @return comment
  **/
  @ApiModelProperty(example = "This is a comment string", value = "")
  public String getComment() {
    return comment;
  }

  public void setComment(String comment) {
    this.comment = comment;
  }

  public AuditLogEntry member(Member member) {
    this.member = member;
    return this;
  }

   /**
   * Get member
   * @return member
  **/
  @ApiModelProperty(value = "")
  public Member getMember() {
    return member;
  }

  public void setMember(Member member) {
    this.member = member;
  }

  public AuditLogEntry titleVerb(String titleVerb) {
    this.titleVerb = titleVerb;
    return this;
  }

   /**
   * Get titleVerb
   * @return titleVerb
  **/
  @ApiModelProperty(example = "changed the name of", value = "")
  public String getTitleVerb() {
    return titleVerb;
  }

  public void setTitleVerb(String titleVerb) {
    this.titleVerb = titleVerb;
  }

  public AuditLogEntry title(String title) {
    this.title = title;
    return this;
  }

   /**
   * Get title
   * @return title
  **/
  @ApiModelProperty(example = "[Reese Applebaum](mailto:refapp@launchdarkly.com) changed the name of [Testing](https://app.launchdarkly.com/settings#/projects)", value = "")
  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public AuditLogEntry target(AuditLogEntryTarget target) {
    this.target = target;
    return this;
  }

   /**
   * Get target
   * @return target
  **/
  @ApiModelProperty(value = "")
  public AuditLogEntryTarget getTarget() {
    return target;
  }

  public void setTarget(AuditLogEntryTarget target) {
    this.target = target;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AuditLogEntry auditLogEntry = (AuditLogEntry) o;
    return Objects.equals(this.links, auditLogEntry.links) &&
        Objects.equals(this.id, auditLogEntry.id) &&
        Objects.equals(this.date, auditLogEntry.date) &&
        Objects.equals(this.kind, auditLogEntry.kind) &&
        Objects.equals(this.name, auditLogEntry.name) &&
        Objects.equals(this.description, auditLogEntry.description) &&
        Objects.equals(this.shortDescription, auditLogEntry.shortDescription) &&
        Objects.equals(this.comment, auditLogEntry.comment) &&
        Objects.equals(this.member, auditLogEntry.member) &&
        Objects.equals(this.titleVerb, auditLogEntry.titleVerb) &&
        Objects.equals(this.title, auditLogEntry.title) &&
        Objects.equals(this.target, auditLogEntry.target);
  }

  @Override
  public int hashCode() {
    return Objects.hash(links, id, date, kind, name, description, shortDescription, comment, member, titleVerb, title, target);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AuditLogEntry {\n");
    
    sb.append("    links: ").append(toIndentedString(links)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    date: ").append(toIndentedString(date)).append("\n");
    sb.append("    kind: ").append(toIndentedString(kind)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    shortDescription: ").append(toIndentedString(shortDescription)).append("\n");
    sb.append("    comment: ").append(toIndentedString(comment)).append("\n");
    sb.append("    member: ").append(toIndentedString(member)).append("\n");
    sb.append("    titleVerb: ").append(toIndentedString(titleVerb)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    target: ").append(toIndentedString(target)).append("\n");
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

