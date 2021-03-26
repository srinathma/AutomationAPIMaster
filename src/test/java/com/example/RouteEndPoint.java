
package com.example;

import java.util.HashMap;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "geoCode",
    "siteName",
    "pointSequence",
    "siteCode",
    "cityCode",
    "country"
})
public class RouteEndPoint {

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
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

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

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
