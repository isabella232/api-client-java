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
import com.launchdarkly.api.model.FlagListItem;
import com.launchdarkly.api.model.Links;
import com.launchdarkly.api.model.UserSegmentRule;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * UserSegment
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-11-20T01:06:04.895Z")
public class UserSegment {
  @SerializedName("key")
  private String key = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("description")
  private String description = null;

  @SerializedName("tags")
  private List<String> tags = null;

  @SerializedName("creationDate")
  private Long creationDate = null;

  @SerializedName("included")
  private List<String> included = null;

  @SerializedName("excluded")
  private List<String> excluded = null;

  @SerializedName("rules")
  private List<UserSegmentRule> rules = null;

  @SerializedName("unbounded")
  private Boolean unbounded = null;

  @SerializedName("version")
  private Integer version = null;

  @SerializedName("_links")
  private Links links = null;

  @SerializedName("_flags")
  private List<FlagListItem> flags = null;

  public UserSegment key(String key) {
    this.key = key;
    return this;
  }

   /**
   * Unique identifier for the user segment.
   * @return key
  **/
  @ApiModelProperty(example = "beta-testers", required = true, value = "Unique identifier for the user segment.")
  public String getKey() {
    return key;
  }

  public void setKey(String key) {
    this.key = key;
  }

  public UserSegment name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Name of the user segment.
   * @return name
  **/
  @ApiModelProperty(example = "Beta Testers", required = true, value = "Name of the user segment.")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public UserSegment description(String description) {
    this.description = description;
    return this;
  }

   /**
   * Description of the user segment.
   * @return description
  **/
  @ApiModelProperty(example = "Users in this segment can access beta features.", value = "Description of the user segment.")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public UserSegment tags(List<String> tags) {
    this.tags = tags;
    return this;
  }

  public UserSegment addTagsItem(String tagsItem) {
    if (this.tags == null) {
      this.tags = new ArrayList<String>();
    }
    this.tags.add(tagsItem);
    return this;
  }

   /**
   * An array of tags for this user segment.
   * @return tags
  **/
  @ApiModelProperty(example = "[\"dev\",\"ops\"]", value = "An array of tags for this user segment.")
  public List<String> getTags() {
    return tags;
  }

  public void setTags(List<String> tags) {
    this.tags = tags;
  }

  public UserSegment creationDate(Long creationDate) {
    this.creationDate = creationDate;
    return this;
  }

   /**
   * A unix epoch time in milliseconds specifying the creation time of this flag.
   * @return creationDate
  **/
  @ApiModelProperty(example = "1443652232590", required = true, value = "A unix epoch time in milliseconds specifying the creation time of this flag.")
  public Long getCreationDate() {
    return creationDate;
  }

  public void setCreationDate(Long creationDate) {
    this.creationDate = creationDate;
  }

  public UserSegment included(List<String> included) {
    this.included = included;
    return this;
  }

  public UserSegment addIncludedItem(String includedItem) {
    if (this.included == null) {
      this.included = new ArrayList<String>();
    }
    this.included.add(includedItem);
    return this;
  }

   /**
   * An array of user keys that are included in this segment.
   * @return included
  **/
  @ApiModelProperty(value = "An array of user keys that are included in this segment.")
  public List<String> getIncluded() {
    return included;
  }

  public void setIncluded(List<String> included) {
    this.included = included;
  }

  public UserSegment excluded(List<String> excluded) {
    this.excluded = excluded;
    return this;
  }

  public UserSegment addExcludedItem(String excludedItem) {
    if (this.excluded == null) {
      this.excluded = new ArrayList<String>();
    }
    this.excluded.add(excludedItem);
    return this;
  }

   /**
   * An array of user keys that should not be included in this segment, unless they are also listed in \&quot;included\&quot;.
   * @return excluded
  **/
  @ApiModelProperty(value = "An array of user keys that should not be included in this segment, unless they are also listed in \"included\".")
  public List<String> getExcluded() {
    return excluded;
  }

  public void setExcluded(List<String> excluded) {
    this.excluded = excluded;
  }

  public UserSegment rules(List<UserSegmentRule> rules) {
    this.rules = rules;
    return this;
  }

  public UserSegment addRulesItem(UserSegmentRule rulesItem) {
    if (this.rules == null) {
      this.rules = new ArrayList<UserSegmentRule>();
    }
    this.rules.add(rulesItem);
    return this;
  }

   /**
   * An array of rules that can cause a user to be included in this segment.
   * @return rules
  **/
  @ApiModelProperty(value = "An array of rules that can cause a user to be included in this segment.")
  public List<UserSegmentRule> getRules() {
    return rules;
  }

  public void setRules(List<UserSegmentRule> rules) {
    this.rules = rules;
  }

  public UserSegment unbounded(Boolean unbounded) {
    this.unbounded = unbounded;
    return this;
  }

   /**
   * Controls whether this segment can support unlimited numbers of users. Requires the beta API and additional setup. Include/exclude lists in this payload are not used in unbounded segments.
   * @return unbounded
  **/
  @ApiModelProperty(example = "false", value = "Controls whether this segment can support unlimited numbers of users. Requires the beta API and additional setup. Include/exclude lists in this payload are not used in unbounded segments.")
  public Boolean isUnbounded() {
    return unbounded;
  }

  public void setUnbounded(Boolean unbounded) {
    this.unbounded = unbounded;
  }

  public UserSegment version(Integer version) {
    this.version = version;
    return this;
  }

   /**
   * Get version
   * @return version
  **/
  @ApiModelProperty(value = "")
  public Integer getVersion() {
    return version;
  }

  public void setVersion(Integer version) {
    this.version = version;
  }

  public UserSegment links(Links links) {
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

   /**
   * Get flags
   * @return flags
  **/
  @ApiModelProperty(value = "")
  public List<FlagListItem> getFlags() {
    return flags;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UserSegment userSegment = (UserSegment) o;
    return Objects.equals(this.key, userSegment.key) &&
        Objects.equals(this.name, userSegment.name) &&
        Objects.equals(this.description, userSegment.description) &&
        Objects.equals(this.tags, userSegment.tags) &&
        Objects.equals(this.creationDate, userSegment.creationDate) &&
        Objects.equals(this.included, userSegment.included) &&
        Objects.equals(this.excluded, userSegment.excluded) &&
        Objects.equals(this.rules, userSegment.rules) &&
        Objects.equals(this.unbounded, userSegment.unbounded) &&
        Objects.equals(this.version, userSegment.version) &&
        Objects.equals(this.links, userSegment.links) &&
        Objects.equals(this.flags, userSegment.flags);
  }

  @Override
  public int hashCode() {
    return Objects.hash(key, name, description, tags, creationDate, included, excluded, rules, unbounded, version, links, flags);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UserSegment {\n");
    
    sb.append("    key: ").append(toIndentedString(key)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
    sb.append("    creationDate: ").append(toIndentedString(creationDate)).append("\n");
    sb.append("    included: ").append(toIndentedString(included)).append("\n");
    sb.append("    excluded: ").append(toIndentedString(excluded)).append("\n");
    sb.append("    rules: ").append(toIndentedString(rules)).append("\n");
    sb.append("    unbounded: ").append(toIndentedString(unbounded)).append("\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
    sb.append("    links: ").append(toIndentedString(links)).append("\n");
    sb.append("    flags: ").append(toIndentedString(flags)).append("\n");
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

