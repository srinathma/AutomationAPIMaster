
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
    "instanceId",
    "packageCount",
    "packageDescriptionType",
    "packageStyleAltText",
    "cargoPackageType"
})
public class CargoPackage {

    @JsonProperty("instanceId")
    private String instanceId;
    @JsonProperty("packageCount")
    private String packageCount;
    @JsonProperty("packageDescriptionType")
    private String packageDescriptionType;
    @JsonProperty("packageStyleAltText")
    private String packageStyleAltText;
    @JsonProperty("cargoPackageType")
    private Object cargoPackageType;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("instanceId")
    public String getInstanceId() {
        return instanceId;
    }

    @JsonProperty("instanceId")
    public void setInstanceId(String instanceId) {
        this.instanceId = instanceId;
    }

    @JsonProperty("packageCount")
    public String getPackageCount() {
        return packageCount;
    }

    @JsonProperty("packageCount")
    public void setPackageCount(String packageCount) {
        this.packageCount = packageCount;
    }

    @JsonProperty("packageDescriptionType")
    public String getPackageDescriptionType() {
        return packageDescriptionType;
    }

    @JsonProperty("packageDescriptionType")
    public void setPackageDescriptionType(String packageDescriptionType) {
        this.packageDescriptionType = packageDescriptionType;
    }

    @JsonProperty("packageStyleAltText")
    public String getPackageStyleAltText() {
        return packageStyleAltText;
    }

    @JsonProperty("packageStyleAltText")
    public void setPackageStyleAltText(String packageStyleAltText) {
        this.packageStyleAltText = packageStyleAltText;
    }

    @JsonProperty("cargoPackageType")
    public Object getCargoPackageType() {
        return cargoPackageType;
    }

    @JsonProperty("cargoPackageType")
    public void setCargoPackageType(Object cargoPackageType) {
        this.cargoPackageType = cargoPackageType;
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
