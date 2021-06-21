
package com.billoflading;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.apache.commons.lang.builder.ToStringBuilder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "geoCode",
    "siteName",
    "pointSequence",
    "siteCode",
    "cityCode",
    "country"
})
public class RouteStartPoint {

    @JsonProperty("geoCode")
    private String geoCode;
    @JsonProperty("siteName")
    private String siteName;
    @JsonProperty("pointSequence")
    private String pointSequence;
    @JsonProperty("siteCode")
    private String siteCode;
    @JsonProperty("cityCode")
    private String cityCode;
    @JsonProperty("country")
    private Object country;

    @JsonProperty("geoCode")
    public String getGeoCode() {
        return geoCode;
    }

    @JsonProperty("geoCode")
    public void setGeoCode(String geoCode) {
        this.geoCode = geoCode;
    }

    @JsonProperty("siteName")
    public String getSiteName() {
        return siteName;
    }

    @JsonProperty("siteName")
    public void setSiteName(String siteName) {
        this.siteName = siteName;
    }

    @JsonProperty("pointSequence")
    public String getPointSequence() {
        return pointSequence;
    }

    @JsonProperty("pointSequence")
    public void setPointSequence(String pointSequence) {
        this.pointSequence = pointSequence;
    }

    @JsonProperty("siteCode")
    public String getSiteCode() {
        return siteCode;
    }

    @JsonProperty("siteCode")
    public void setSiteCode(String siteCode) {
        this.siteCode = siteCode;
    }

    @JsonProperty("cityCode")
    public String getCityCode() {
        return cityCode;
    }

    @JsonProperty("cityCode")
    public void setCityCode(String cityCode) {
        this.cityCode = cityCode;
    }

    @JsonProperty("country")
    public Object getCountry() {
        return country;
    }

    @JsonProperty("country")
    public void setCountry(Object country) {
        this.country = country;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("geoCode", geoCode).append("siteName", siteName).append("pointSequence", pointSequence).append("siteCode", siteCode).append("cityCode", cityCode).append("country", country).toString();
    }

}
