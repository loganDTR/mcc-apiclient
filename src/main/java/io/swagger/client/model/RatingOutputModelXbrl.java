/*
 * Calcola il Rating del Fondo di Garanzia
 * Calcola il tuo Rating e verifica l'idoneità al Fondo di Garanzia
 *
 * OpenAPI spec version: 1.0
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package io.swagger.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.client.model.RatingOutputModelXbrlRatingResponse;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
/**
 * RatingOutputModelXbrl
 */

public class RatingOutputModelXbrl {
  @SerializedName("RatingResponse")
  private RatingOutputModelXbrlRatingResponse ratingResponse = null;

  @SerializedName("Xbrl")
  private String xbrl = null;

  public RatingOutputModelXbrl ratingResponse(RatingOutputModelXbrlRatingResponse ratingResponse) {
    this.ratingResponse = ratingResponse;
    return this;
  }

   /**
   * Get ratingResponse
   * @return ratingResponse
  **/
  @Schema(description = "")
  public RatingOutputModelXbrlRatingResponse getRatingResponse() {
    return ratingResponse;
  }

  public void setRatingResponse(RatingOutputModelXbrlRatingResponse ratingResponse) {
    this.ratingResponse = ratingResponse;
  }

  public RatingOutputModelXbrl xbrl(String xbrl) {
    this.xbrl = xbrl;
    return this;
  }

   /**
   * Get xbrl
   * @return xbrl
  **/
  @Schema(description = "")
  public String getXbrl() {
    return xbrl;
  }

  public void setXbrl(String xbrl) {
    this.xbrl = xbrl;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RatingOutputModelXbrl ratingOutputModelXbrl = (RatingOutputModelXbrl) o;
    return Objects.equals(this.ratingResponse, ratingOutputModelXbrl.ratingResponse) &&
        Objects.equals(this.xbrl, ratingOutputModelXbrl.xbrl);
  }

  @Override
  public int hashCode() {
    return Objects.hash(ratingResponse, xbrl);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RatingOutputModelXbrl {\n");
    
    sb.append("    ratingResponse: ").append(toIndentedString(ratingResponse)).append("\n");
    sb.append("    xbrl: ").append(toIndentedString(xbrl)).append("\n");
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
