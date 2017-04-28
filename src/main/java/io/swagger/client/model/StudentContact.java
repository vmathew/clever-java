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
 * StudentContact
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-04-27T16:04:29.480-07:00")
public class StudentContact {
  @SerializedName("district")
  private String district = null;

  @SerializedName("email")
  private String email = null;

  @SerializedName("id")
  private String id = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("phone")
  private String phone = null;

  @SerializedName("phone_type")
  private String phoneType = null;

  @SerializedName("relationship")
  private String relationship = null;

  @SerializedName("student")
  private String student = null;

  @SerializedName("type")
  private String type = null;

  public StudentContact district(String district) {
    this.district = district;
    return this;
  }

   /**
   * Get district
   * @return district
  **/
  @ApiModelProperty(value = "")
  public String getDistrict() {
    return district;
  }

  public void setDistrict(String district) {
    this.district = district;
  }

  public StudentContact email(String email) {
    this.email = email;
    return this;
  }

   /**
   * Get email
   * @return email
  **/
  @ApiModelProperty(value = "")
  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public StudentContact id(String id) {
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

  public StudentContact name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @ApiModelProperty(value = "")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public StudentContact phone(String phone) {
    this.phone = phone;
    return this;
  }

   /**
   * Get phone
   * @return phone
  **/
  @ApiModelProperty(value = "")
  public String getPhone() {
    return phone;
  }

  public void setPhone(String phone) {
    this.phone = phone;
  }

  public StudentContact phoneType(String phoneType) {
    this.phoneType = phoneType;
    return this;
  }

   /**
   * Get phoneType
   * @return phoneType
  **/
  @ApiModelProperty(value = "")
  public String getPhoneType() {
    return phoneType;
  }

  public void setPhoneType(String phoneType) {
    this.phoneType = phoneType;
  }

  public StudentContact relationship(String relationship) {
    this.relationship = relationship;
    return this;
  }

   /**
   * Get relationship
   * @return relationship
  **/
  @ApiModelProperty(value = "")
  public String getRelationship() {
    return relationship;
  }

  public void setRelationship(String relationship) {
    this.relationship = relationship;
  }

  public StudentContact student(String student) {
    this.student = student;
    return this;
  }

   /**
   * Get student
   * @return student
  **/
  @ApiModelProperty(value = "")
  public String getStudent() {
    return student;
  }

  public void setStudent(String student) {
    this.student = student;
  }

  public StudentContact type(String type) {
    this.type = type;
    return this;
  }

   /**
   * Get type
   * @return type
  **/
  @ApiModelProperty(value = "")
  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    StudentContact studentContact = (StudentContact) o;
    return Objects.equals(this.district, studentContact.district) &&
        Objects.equals(this.email, studentContact.email) &&
        Objects.equals(this.id, studentContact.id) &&
        Objects.equals(this.name, studentContact.name) &&
        Objects.equals(this.phone, studentContact.phone) &&
        Objects.equals(this.phoneType, studentContact.phoneType) &&
        Objects.equals(this.relationship, studentContact.relationship) &&
        Objects.equals(this.student, studentContact.student) &&
        Objects.equals(this.type, studentContact.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(district, email, id, name, phone, phoneType, relationship, student, type);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class StudentContact {\n");
    
    sb.append("    district: ").append(toIndentedString(district)).append("\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    phone: ").append(toIndentedString(phone)).append("\n");
    sb.append("    phoneType: ").append(toIndentedString(phoneType)).append("\n");
    sb.append("    relationship: ").append(toIndentedString(relationship)).append("\n");
    sb.append("    student: ").append(toIndentedString(student)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
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

