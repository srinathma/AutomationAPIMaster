
package pojo;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.apache.commons.lang.builder.ToStringBuilder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "instanceId",
    "isoCode",
    "equipmentGrossWeightKgs",
    "equipmentGrossWeightLbs",
    "verifiedGrossMassKgs",
    "verifiedGrossMassLbs",
    "customerWeightKgs",
    "customerWeightLbs",
    "tareWeightKgs",
    "totalVolume",
    "totalPackageCount",
    "totalWeightKgs",
    "totalWeightLbs",
    "isShortShipped",
    "isShipperOwned",
    "containerType",
    "containerSize",
    "equipmentNoWhenBooked",
    "operationalEquipmentNumber",
    "cargoList",
    "shipments",
    "seals"
})
public class Equipment {

    @JsonProperty("instanceId")
    private String instanceId;
    @JsonProperty("isoCode")
    private String isoCode;
    @JsonProperty("equipmentGrossWeightKgs")
    private String equipmentGrossWeightKgs;
    @JsonProperty("equipmentGrossWeightLbs")
    private String equipmentGrossWeightLbs;
    @JsonProperty("verifiedGrossMassKgs")
    private Object verifiedGrossMassKgs;
    @JsonProperty("verifiedGrossMassLbs")
    private Object verifiedGrossMassLbs;
    @JsonProperty("customerWeightKgs")
    private String customerWeightKgs;
    @JsonProperty("customerWeightLbs")
    private String customerWeightLbs;
    @JsonProperty("tareWeightKgs")
    private String tareWeightKgs;
    @JsonProperty("totalVolume")
    private String totalVolume;
    @JsonProperty("totalPackageCount")
    private String totalPackageCount;
    @JsonProperty("totalWeightKgs")
    private String totalWeightKgs;
    @JsonProperty("totalWeightLbs")
    private String totalWeightLbs;
    @JsonProperty("isShortShipped")
    private Boolean isShortShipped;
    @JsonProperty("isShipperOwned")
    private Boolean isShipperOwned;
    @JsonProperty("containerType")
    private String containerType;
    @JsonProperty("containerSize")
    private String containerSize;
    @JsonProperty("equipmentNoWhenBooked")
    private String equipmentNoWhenBooked;
    @JsonProperty("operationalEquipmentNumber")
    private Object operationalEquipmentNumber;
    @JsonProperty("cargoList")
    private List<String> cargoList = null;
    @JsonProperty("shipments")
    private List<String> shipments = null;
    @JsonProperty("seals")
    private List<Seal> seals = null;

    @JsonProperty("instanceId")
    public String getInstanceId() {
        return instanceId;
    }

    @JsonProperty("instanceId")
    public void setInstanceId(String instanceId) {
        this.instanceId = instanceId;
    }

    @JsonProperty("isoCode")
    public String getIsoCode() {
        return isoCode;
    }

    @JsonProperty("isoCode")
    public void setIsoCode(String isoCode) {
        this.isoCode = isoCode;
    }

    @JsonProperty("equipmentGrossWeightKgs")
    public String getEquipmentGrossWeightKgs() {
        return equipmentGrossWeightKgs;
    }

    @JsonProperty("equipmentGrossWeightKgs")
    public void setEquipmentGrossWeightKgs(String equipmentGrossWeightKgs) {
        this.equipmentGrossWeightKgs = equipmentGrossWeightKgs;
    }

    @JsonProperty("equipmentGrossWeightLbs")
    public String getEquipmentGrossWeightLbs() {
        return equipmentGrossWeightLbs;
    }

    @JsonProperty("equipmentGrossWeightLbs")
    public void setEquipmentGrossWeightLbs(String equipmentGrossWeightLbs) {
        this.equipmentGrossWeightLbs = equipmentGrossWeightLbs;
    }

    @JsonProperty("verifiedGrossMassKgs")
    public Object getVerifiedGrossMassKgs() {
        return verifiedGrossMassKgs;
    }

    @JsonProperty("verifiedGrossMassKgs")
    public void setVerifiedGrossMassKgs(Object verifiedGrossMassKgs) {
        this.verifiedGrossMassKgs = verifiedGrossMassKgs;
    }

    @JsonProperty("verifiedGrossMassLbs")
    public Object getVerifiedGrossMassLbs() {
        return verifiedGrossMassLbs;
    }

    @JsonProperty("verifiedGrossMassLbs")
    public void setVerifiedGrossMassLbs(Object verifiedGrossMassLbs) {
        this.verifiedGrossMassLbs = verifiedGrossMassLbs;
    }

    @JsonProperty("customerWeightKgs")
    public String getCustomerWeightKgs() {
        return customerWeightKgs;
    }

    @JsonProperty("customerWeightKgs")
    public void setCustomerWeightKgs(String customerWeightKgs) {
        this.customerWeightKgs = customerWeightKgs;
    }

    @JsonProperty("customerWeightLbs")
    public String getCustomerWeightLbs() {
        return customerWeightLbs;
    }

    @JsonProperty("customerWeightLbs")
    public void setCustomerWeightLbs(String customerWeightLbs) {
        this.customerWeightLbs = customerWeightLbs;
    }

    @JsonProperty("tareWeightKgs")
    public String getTareWeightKgs() {
        return tareWeightKgs;
    }

    @JsonProperty("tareWeightKgs")
    public void setTareWeightKgs(String tareWeightKgs) {
        this.tareWeightKgs = tareWeightKgs;
    }

    @JsonProperty("totalVolume")
    public String getTotalVolume() {
        return totalVolume;
    }

    @JsonProperty("totalVolume")
    public void setTotalVolume(String totalVolume) {
        this.totalVolume = totalVolume;
    }

    @JsonProperty("totalPackageCount")
    public String getTotalPackageCount() {
        return totalPackageCount;
    }

    @JsonProperty("totalPackageCount")
    public void setTotalPackageCount(String totalPackageCount) {
        this.totalPackageCount = totalPackageCount;
    }

    @JsonProperty("totalWeightKgs")
    public String getTotalWeightKgs() {
        return totalWeightKgs;
    }

    @JsonProperty("totalWeightKgs")
    public void setTotalWeightKgs(String totalWeightKgs) {
        this.totalWeightKgs = totalWeightKgs;
    }

    @JsonProperty("totalWeightLbs")
    public String getTotalWeightLbs() {
        return totalWeightLbs;
    }

    @JsonProperty("totalWeightLbs")
    public void setTotalWeightLbs(String totalWeightLbs) {
        this.totalWeightLbs = totalWeightLbs;
    }

    @JsonProperty("isShortShipped")
    public Boolean getIsShortShipped() {
        return isShortShipped;
    }

    @JsonProperty("isShortShipped")
    public void setIsShortShipped(Boolean isShortShipped) {
        this.isShortShipped = isShortShipped;
    }

    @JsonProperty("isShipperOwned")
    public Boolean getIsShipperOwned() {
        return isShipperOwned;
    }

    @JsonProperty("isShipperOwned")
    public void setIsShipperOwned(Boolean isShipperOwned) {
        this.isShipperOwned = isShipperOwned;
    }

    @JsonProperty("containerType")
    public String getContainerType() {
        return containerType;
    }

    @JsonProperty("containerType")
    public void setContainerType(String containerType) {
        this.containerType = containerType;
    }

    @JsonProperty("containerSize")
    public String getContainerSize() {
        return containerSize;
    }

    @JsonProperty("containerSize")
    public void setContainerSize(String containerSize) {
        this.containerSize = containerSize;
    }

    @JsonProperty("equipmentNoWhenBooked")
    public String getEquipmentNoWhenBooked() {
        return equipmentNoWhenBooked;
    }

    @JsonProperty("equipmentNoWhenBooked")
    public void setEquipmentNoWhenBooked(String equipmentNoWhenBooked) {
        this.equipmentNoWhenBooked = equipmentNoWhenBooked;
    }

    @JsonProperty("operationalEquipmentNumber")
    public Object getOperationalEquipmentNumber() {
        return operationalEquipmentNumber;
    }

    @JsonProperty("operationalEquipmentNumber")
    public void setOperationalEquipmentNumber(Object operationalEquipmentNumber) {
        this.operationalEquipmentNumber = operationalEquipmentNumber;
    }

    @JsonProperty("cargoList")
    public List<String> getCargoList() {
        return cargoList;
    }

    @JsonProperty("cargoList")
    public void setCargoList(List<String> cargoList) {
        this.cargoList = cargoList;
    }

    @JsonProperty("shipments")
    public List<String> getShipments() {
        return shipments;
    }

    @JsonProperty("shipments")
    public void setShipments(List<String> shipments) {
        this.shipments = shipments;
    }

    @JsonProperty("seals")
    public List<Seal> getSeals() {
        return seals;
    }

    @JsonProperty("seals")
    public void setSeals(List<Seal> seals) {
        this.seals = seals;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("instanceId", instanceId).append("isoCode", isoCode).append("equipmentGrossWeightKgs", equipmentGrossWeightKgs).append("equipmentGrossWeightLbs", equipmentGrossWeightLbs).append("verifiedGrossMassKgs", verifiedGrossMassKgs).append("verifiedGrossMassLbs", verifiedGrossMassLbs).append("customerWeightKgs", customerWeightKgs).append("customerWeightLbs", customerWeightLbs).append("tareWeightKgs", tareWeightKgs).append("totalVolume", totalVolume).append("totalPackageCount", totalPackageCount).append("totalWeightKgs", totalWeightKgs).append("totalWeightLbs", totalWeightLbs).append("isShortShipped", isShortShipped).append("isShipperOwned", isShipperOwned).append("containerType", containerType).append("containerSize", containerSize).append("equipmentNoWhenBooked", equipmentNoWhenBooked).append("operationalEquipmentNumber", operationalEquipmentNumber).append("cargoList", cargoList).append("shipments", shipments).append("seals", seals).toString();
    }

}
