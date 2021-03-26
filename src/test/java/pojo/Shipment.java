
package pojo;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.apache.commons.lang.builder.ToStringBuilder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "shipmentNumber",
    "shipmentVersionInstance",
    "receiptCargoMode",
    "receiptDeliveryMode",
    "isDangerous",
    "isORR",
    "businessUnitCode",
    "businessEmail",
    "parties",
    "houseBills",
    "equipments",
    "cargos",
    "route"
})
public class Shipment {

    @JsonProperty("shipmentNumber")
    private String shipmentNumber;
    @JsonProperty("shipmentVersionInstance")
    private String shipmentVersionInstance;
    @JsonProperty("receiptCargoMode")
    private String receiptCargoMode;
    @JsonProperty("receiptDeliveryMode")
    private String receiptDeliveryMode;
    @JsonProperty("isDangerous")
    private Boolean isDangerous;
    @JsonProperty("isORR")
    private Boolean isORR;
    @JsonProperty("operationalReferenceNumber")
    private String operationalReferenceNumber;
    public Boolean getIsORR() {
		return isORR;
	}

	public void setIsORR(Boolean isORR) {
		this.isORR = isORR;
	}

	public String getOperationalReferenceNumber() {
		return operationalReferenceNumber;
	}

	public void setOperationalReferenceNumber(String operationalReferenceNumber) {
		this.operationalReferenceNumber = operationalReferenceNumber;
	}

	@JsonProperty("businessUnitCode")
    private String businessUnitCode;
    
    @JsonProperty("businessEmail")
    private String businessEmail;
    @JsonProperty("parties")
    private List<Party> parties = null;
    @JsonProperty("houseBills")
    private List<Object> houseBills = null;
    @JsonProperty("equipments")
    private List<String> equipments = null;
    @JsonProperty("cargos")
    private List<String> cargos = null;
    @JsonProperty("route")
    private Route route;

    @JsonProperty("shipmentNumber")
    public String getShipmentNumber() {
        return shipmentNumber;
    }

    @JsonProperty("shipmentNumber")
    public void setShipmentNumber(String shipmentNumber) {
        this.shipmentNumber = shipmentNumber;
    }

    @JsonProperty("shipmentVersionInstance")
    public String getShipmentVersionInstance() {
        return shipmentVersionInstance;
    }

    @JsonProperty("shipmentVersionInstance")
    public void setShipmentVersionInstance(String shipmentVersionInstance) {
        this.shipmentVersionInstance = shipmentVersionInstance;
    }

    @JsonProperty("receiptCargoMode")
    public String getReceiptCargoMode() {
        return receiptCargoMode;
    }

    @JsonProperty("receiptCargoMode")
    public void setReceiptCargoMode(String receiptCargoMode) {
        this.receiptCargoMode = receiptCargoMode;
    }

    @JsonProperty("receiptDeliveryMode")
    public String getReceiptDeliveryMode() {
        return receiptDeliveryMode;
    }

    @JsonProperty("receiptDeliveryMode")
    public void setReceiptDeliveryMode(String receiptDeliveryMode) {
        this.receiptDeliveryMode = receiptDeliveryMode;
    }

    @JsonProperty("isDangerous")
    public Boolean getIsDangerous() {
        return isDangerous;
    }

    @JsonProperty("isDangerous")
    public void setIsDangerous(Boolean isDangerous) {
        this.isDangerous = isDangerous;
    }

    @JsonProperty("businessUnitCode")
    public String getBusinessUnitCode() {
        return businessUnitCode;
    }

    @JsonProperty("businessUnitCode")
    public void setBusinessUnitCode(String businessUnitCode) {
        this.businessUnitCode = businessUnitCode;
    }

    @JsonProperty("businessEmail")
    public String getBusinessEmail() {
        return businessEmail;
    }

    @JsonProperty("businessEmail")
    public void setBusinessEmail(String businessEmail) {
        this.businessEmail = businessEmail;
    }

    @JsonProperty("parties")
    public List<Party> getParties() {
        return parties;
    }

    @JsonProperty("parties")
    public void setParties(List<Party> parties) {
        this.parties = parties;
    }

    @JsonProperty("houseBills")
    public List<Object> getHouseBills() {
        return houseBills;
    }

    @JsonProperty("houseBills")
    public void setHouseBills(List<Object> houseBills) {
        this.houseBills = houseBills;
    }

    @JsonProperty("equipments")
    public List<String> getEquipments() {
        return equipments;
    }

    @JsonProperty("equipments")
    public void setEquipments(List<String> equipments) {
        this.equipments = equipments;
    }

    @JsonProperty("cargos")
    public List<String> getCargos() {
        return cargos;
    }

    @JsonProperty("cargos")
    public void setCargos(List<String> cargos) {
        this.cargos = cargos;
    }

    @JsonProperty("route")
    public Route getRoute() {
        return route;
    }

    @JsonProperty("route")
    public void setRoute(Route route) {
        this.route = route;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("shipmentNumber", shipmentNumber).append("shipmentVersionInstance", shipmentVersionInstance).append("receiptCargoMode", receiptCargoMode).append("receiptDeliveryMode", receiptDeliveryMode).append("isDangerous", isDangerous).append("businessUnitCode", businessUnitCode).append("businessEmail", businessEmail).append("parties", parties).append("houseBills", houseBills).append("equipments", equipments).append("cargos", cargos).append("route", route).toString();
    }

}
