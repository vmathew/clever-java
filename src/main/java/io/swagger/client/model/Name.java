/*
 * Clever API
 * The Clever API
 *
 * OpenAPI spec version: 1.2.0
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package io.swagger.client.model;

import java.util.Objects;
import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * Name
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-04-27T16:04:29.480-07:00")
public class Name {
  @SerializedName("first")
  private String first = null;

  @SerializedName("last")
  private String last = null;

  @SerializedName("middle")
  private String middle = null;

  public Name first(String first) {
    this.first = first;
    return this;
  }

   /**
   * Get first
   * @return first
  **/
  @ApiModelProperty(value = "")
  public String getFirst() {
    return first;
  }

  public void setFirst(String first) {
    this.first = first;
  }

  public Name last(String last) {
    this.last = last;
    return this;
  }

   /**
   * Get last
   * @return last
  **/
  @ApiModelProperty(value = "")
  public String getLast() {
    return last;
  }

  public void setLast(String last) {
    this.last = last;
  }

  public Name middle(String middle) {
    this.middle = middle;
    return this;
  }

   /**
   * Get middle
   * @return middle
  **/
  @ApiModelProperty(value = "")
  public String getMiddle() {
    return middle;
  }

  public void setMiddle(String middle) {
    this.middle = middle;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Name name = (Name) o;
    return Objects.equals(this.first, name.first) &&
        Objects.equals(this.last, name.last) &&
        Objects.equals(this.middle, name.middle);
  }

  @Override
  public int hashCode() {
    return Objects.hash(first, last, middle);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Name {\n");
    
    sb.append("    first: ").append(toIndentedString(first)).append("\n");
    sb.append("    last: ").append(toIndentedString(last)).append("\n");
    sb.append("    middle: ").append(toIndentedString(middle)).append("\n");
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

