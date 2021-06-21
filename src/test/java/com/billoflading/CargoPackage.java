
package com.billoflading;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.apache.commons.lang.builder.ToStringBuilder;

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

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("instanceId", instanceId).append("packageCount", packageCount).append("packageDescriptionType", packageDescriptionType).append("packageStyleAltText", packageStyleAltText).append("cargoPackageType", cargoPackageType).toString();
    }

}
