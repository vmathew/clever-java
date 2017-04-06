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
import io.swagger.client.model.Location;
import io.swagger.client.model.Principal;

/**
 * School
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-04-06T11:52:21.984-07:00")
public class School {
  @SerializedName("id")
  private String id = null;

  @SerializedName("created")
  private String created = null;

  @SerializedName("district")
  private String district = null;

  @SerializedName("high_grade")
  private String highGrade = null;

  @SerializedName("last_modified")
  private String lastModified = null;

  @SerializedName("location")
  private Location location = null;

  @SerializedName("low_grade")
  private String lowGrade = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("nces_id")
  private String ncesId = null;

  @SerializedName("phone")
  private String phone = null;

  @SerializedName("principal")
  private Principal principal = null;

  @SerializedName("school_number")
  private String schoolNumber = null;

  @SerializedName("sis_id")
  private String sisId = null;

  @SerializedName("state_id")
  private String stateId = null;

  @SerializedName("mdr_number")
  private String mdrNumber = null;

  public School id(String id) {
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

  public School created(String created) {
    this.created = created;
    return this;
  }

   /**
   * Get created
   * @return created
  **/
  @ApiModelProperty(value = "")
  public String getCreated() {
    return created;
  }

  public void setCreated(String created) {
    this.created = created;
  }

  public School district(String district) {
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

  public School highGrade(String highGrade) {
    this.highGrade = highGrade;
    return this;
  }

   /**
   * Get highGrade
   * @return highGrade
  **/
  @ApiModelProperty(value = "")
  public String getHighGrade() {
    return highGrade;
  }

  public void setHighGrade(String highGrade) {
    this.highGrade = highGrade;
  }

  public School lastModified(String lastModified) {
    this.lastModified = lastModified;
    return this;
  }

   /**
   * Get lastModified
   * @return lastModified
  **/
  @ApiModelProperty(value = "")
  public String getLastModified() {
    return lastModified;
  }

  public void setLastModified(String lastModified) {
    this.lastModified = lastModified;
  }

  public School location(Location location) {
    this.location = location;
    return this;
  }

   /**
   * Get location
   * @return location
  **/
  @ApiModelProperty(value = "")
  public Location getLocation() {
    return location;
  }

  public void setLocation(Location location) {
    this.location = location;
  }

  public School lowGrade(String lowGrade) {
    this.lowGrade = lowGrade;
    return this;
  }

   /**
   * Get lowGrade
   * @return lowGrade
  **/
  @ApiModelProperty(value = "")
  public String getLowGrade() {
    return lowGrade;
  }

  public void setLowGrade(String lowGrade) {
    this.lowGrade = lowGrade;
  }

  public School name(String name) {
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

  public School ncesId(String ncesId) {
    this.ncesId = ncesId;
    return this;
  }

   /**
   * Get ncesId
   * @return ncesId
  **/
  @ApiModelProperty(value = "")
  public String getNcesId() {
    return ncesId;
  }

  public void setNcesId(String ncesId) {
    this.ncesId = ncesId;
  }

  public School phone(String phone) {
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

  public School principal(Principal principal) {
    this.principal = principal;
    return this;
  }

   /**
   * Get principal
   * @return principal
  **/
  @ApiModelProperty(value = "")
  public Principal getPrincipal() {
    return principal;
  }

  public void setPrincipal(Principal principal) {
    this.principal = principal;
  }

  public School schoolNumber(String schoolNumber) {
    this.schoolNumber = schoolNumber;
    return this;
  }

   /**
   * Get schoolNumber
   * @return schoolNumber
  **/
  @ApiModelProperty(value = "")
  public String getSchoolNumber() {
    return schoolNumber;
  }

  public void setSchoolNumber(String schoolNumber) {
    this.schoolNumber = schoolNumber;
  }

  public School sisId(String sisId) {
    this.sisId = sisId;
    return this;
  }

   /**
   * Get sisId
   * @return sisId
  **/
  @ApiModelProperty(value = "")
  public String getSisId() {
    return sisId;
  }

  public void setSisId(String sisId) {
    this.sisId = sisId;
  }

  public School stateId(String stateId) {
    this.stateId = stateId;
    return this;
  }

   /**
   * Get stateId
   * @return stateId
  **/
  @ApiModelProperty(value = "")
  public String getStateId() {
    return stateId;
  }

  public void setStateId(String stateId) {
    this.stateId = stateId;
  }

  public School mdrNumber(String mdrNumber) {
    this.mdrNumber = mdrNumber;
    return this;
  }

   /**
   * Get mdrNumber
   * @return mdrNumber
  **/
  @ApiModelProperty(value = "")
  public String getMdrNumber() {
    return mdrNumber;
  }

  public void setMdrNumber(String mdrNumber) {
    this.mdrNumber = mdrNumber;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    School school = (School) o;
    return Objects.equals(this.id, school.id) &&
        Objects.equals(this.created, school.created) &&
        Objects.equals(this.district, school.district) &&
        Objects.equals(this.highGrade, school.highGrade) &&
        Objects.equals(this.lastModified, school.lastModified) &&
        Objects.equals(this.location, school.location) &&
        Objects.equals(this.lowGrade, school.lowGrade) &&
        Objects.equals(this.name, school.name) &&
        Objects.equals(this.ncesId, school.ncesId) &&
        Objects.equals(this.phone, school.phone) &&
        Objects.equals(this.principal, school.principal) &&
        Objects.equals(this.schoolNumber, school.schoolNumber) &&
        Objects.equals(this.sisId, school.sisId) &&
        Objects.equals(this.stateId, school.stateId) &&
        Objects.equals(this.mdrNumber, school.mdrNumber);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, created, district, highGrade, lastModified, location, lowGrade, name, ncesId, phone, principal, schoolNumber, sisId, stateId, mdrNumber);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class School {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    created: ").append(toIndentedString(created)).append("\n");
    sb.append("    district: ").append(toIndentedString(district)).append("\n");
    sb.append("    highGrade: ").append(toIndentedString(highGrade)).append("\n");
    sb.append("    lastModified: ").append(toIndentedString(lastModified)).append("\n");
    sb.append("    location: ").append(toIndentedString(location)).append("\n");
    sb.append("    lowGrade: ").append(toIndentedString(lowGrade)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    ncesId: ").append(toIndentedString(ncesId)).append("\n");
    sb.append("    phone: ").append(toIndentedString(phone)).append("\n");
    sb.append("    principal: ").append(toIndentedString(principal)).append("\n");
    sb.append("    schoolNumber: ").append(toIndentedString(schoolNumber)).append("\n");
    sb.append("    sisId: ").append(toIndentedString(sisId)).append("\n");
    sb.append("    stateId: ").append(toIndentedString(stateId)).append("\n");
    sb.append("    mdrNumber: ").append(toIndentedString(mdrNumber)).append("\n");
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

