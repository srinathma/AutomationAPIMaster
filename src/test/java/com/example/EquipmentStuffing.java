
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
    "equipmentId",
    "weightKgs",
    "weightLbs",
    "isOOG",
    "volumeCbm",
    "measureCbm"
})
public class EquipmentStuffing {

    @JsonProperty("instanceId")
    private String instanceId;
    @JsonProperty("packageCount")
    private String packageCount;
    @JsonProperty("equipmentId")
    private String equipmentId;
    @JsonProperty("weightKgs")
    private String weightKgs;
    @JsonProperty("weightLbs")
    private String weightLbs;
    @JsonProperty("isOOG")
    private String isOOG;
    @JsonProperty("volumeCbm")
    private String volumeCbm;
    @JsonProperty("measureCbm")
    private String measureCbm;
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

    @JsonProperty("equipmentId")
    public String getEquipmentId() {
        return equipmentId;
    }

    @JsonProperty("equipmentId")
    public void setEquipmentId(String equipmentId) {
        this.equipmentId = equipmentId;
    }

    @JsonProperty("weightKgs")
    public String getWeightKgs() {
        return weightKgs;
    }

    @JsonProperty("weightKgs")
    public void setWeightKgs(String weightKgs) {
        this.weightKgs = weightKgs;
    }

    @JsonProperty("weightLbs")
    public String getWeightLbs() {
        return weightLbs;
    }

    @JsonProperty("weightLbs")
    public void setWeightLbs(String weightLbs) {
        this.weightLbs = weightLbs;
    }

    @JsonProperty("isOOG")
    public String getIsOOG() {
        return isOOG;
    }

    @JsonProperty("isOOG")
    public void setIsOOG(String isOOG) {
        this.isOOG = isOOG;
    }

    @JsonProperty("volumeCbm")
    public String getVolumeCbm() {
        return volumeCbm;
    }

    @JsonProperty("volumeCbm")
    public void setVolumeCbm(String volumeCbm) {
        this.volumeCbm = volumeCbm;
    }

    @JsonProperty("measureCbm")
    public String getMeasureCbm() {
        return measureCbm;
    }

    @JsonProperty("measureCbm")
    public void setMeasureCbm(String measureCbm) {
        this.measureCbm = measureCbm;
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
