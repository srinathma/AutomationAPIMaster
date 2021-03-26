
package com.example;

import java.util.HashMap;
import java.util.List;
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
    "commodityCode",
    "commodityDescription",
    "sequence",
    "cargoClassification",
    "weightKgs",
    "weightLbs",
    "hsCode",
    "measureCbm",
    "reeferTemperatureCelsius",
    "freightPaymentMethod",
    "equipments",
    "descriptions",
    "cargoPackages",
    "equipmentStuffings",
    "dangerousDetails"
})
public class Cargo {

    @JsonProperty("instanceId")
    private String instanceId;
    @JsonProperty("commodityCode")
    private String commodityCode;
    @JsonProperty("commodityDescription")
    private String commodityDescription;
    @JsonProperty("sequence")
    private int sequence;
    @JsonProperty("cargoClassification")
    private Object cargoClassification;
    @JsonProperty("weightKgs")
    private String weightKgs;
    @JsonProperty("weightLbs")
    private String weightLbs;
    @JsonProperty("hsCode")
    private String hsCode;
    @JsonProperty("measureCbm")
    private String measureCbm;
    @JsonProperty("reeferTemperatureCelsius")
    private Object reeferTemperatureCelsius;
    @JsonProperty("freightPaymentMethod")
    private String freightPaymentMethod;
    @JsonProperty("equipments")
    private List<String> equipments = null;
    @JsonProperty("descriptions")
    private List<Description> descriptions = null;
    @JsonProperty("cargoPackages")
    private List<CargoPackage> cargoPackages = null;
    @JsonProperty("equipmentStuffings")
    private List<EquipmentStuffing> equipmentStuffings = null;
    @JsonProperty("dangerousDetails")
    private List<Object> dangerousDetails = null;
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

    @JsonProperty("commodityCode")
    public String getCommodityCode() {
        return commodityCode;
    }

    @JsonProperty("commodityCode")
    public void setCommodityCode(String commodityCode) {
        this.commodityCode = commodityCode;
    }

    @JsonProperty("commodityDescription")
    public String getCommodityDescription() {
        return commodityDescription;
    }

    @JsonProperty("commodityDescription")
    public void setCommodityDescription(String commodityDescription) {
        this.commodityDescription = commodityDescription;
    }

    @JsonProperty("sequence")
    public int getSequence() {
        return sequence;
    }

    @JsonProperty("sequence")
    public void setSequence(int sequence) {
        this.sequence = sequence;
    }

    @JsonProperty("cargoClassification")
    public Object getCargoClassification() {
        return cargoClassification;
    }

    @JsonProperty("cargoClassification")
    public void setCargoClassification(Object cargoClassification) {
        this.cargoClassification = cargoClassification;
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

    @JsonProperty("hsCode")
    public String getHsCode() {
        return hsCode;
    }

    @JsonProperty("hsCode")
    public void setHsCode(String hsCode) {
        this.hsCode = hsCode;
    }

    @JsonProperty("measureCbm")
    public String getMeasureCbm() {
        return measureCbm;
    }

    @JsonProperty("measureCbm")
    public void setMeasureCbm(String measureCbm) {
        this.measureCbm = measureCbm;
    }

    @JsonProperty("reeferTemperatureCelsius")
    public Object getReeferTemperatureCelsius() {
        return reeferTemperatureCelsius;
    }

    @JsonProperty("reeferTemperatureCelsius")
    public void setReeferTemperatureCelsius(Object reeferTemperatureCelsius) {
        this.reeferTemperatureCelsius = reeferTemperatureCelsius;
    }

    @JsonProperty("freightPaymentMethod")
    public String getFreightPaymentMethod() {
        return freightPaymentMethod;
    }

    @JsonProperty("freightPaymentMethod")
    public void setFreightPaymentMethod(String freightPaymentMethod) {
        this.freightPaymentMethod = freightPaymentMethod;
    }

    @JsonProperty("equipments")
    public List<String> getEquipments() {
        return equipments;
    }

    @JsonProperty("equipments")
    public void setEquipments(List<String> equipments) {
        this.equipments = equipments;
    }

    @JsonProperty("descriptions")
    public List<Description> getDescriptions() {
        return descriptions;
    }

    @JsonProperty("descriptions")
    public void setDescriptions(List<Description> descriptions) {
        this.descriptions = descriptions;
    }

    @JsonProperty("cargoPackages")
    public List<CargoPackage> getCargoPackages() {
        return cargoPackages;
    }

    @JsonProperty("cargoPackages")
    public void setCargoPackages(List<CargoPackage> cargoPackages) {
        this.cargoPackages = cargoPackages;
    }

    @JsonProperty("equipmentStuffings")
    public List<EquipmentStuffing> getEquipmentStuffings() {
        return equipmentStuffings;
    }

    @JsonProperty("equipmentStuffings")
    public void setEquipmentStuffings(List<EquipmentStuffing> equipmentStuffings) {
        this.equipmentStuffings = equipmentStuffings;
    }

    @JsonProperty("dangerousDetails")
    public List<Object> getDangerousDetails() {
        return dangerousDetails;
    }

    @JsonProperty("dangerousDetails")
    public void setDangerousDetails(List<Object> dangerousDetails) {
        this.dangerousDetails = dangerousDetails;
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
