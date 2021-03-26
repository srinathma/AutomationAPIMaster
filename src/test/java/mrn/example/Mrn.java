
package mrn.example;

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
    "transportDocumentNumber",
    "vesselCode",
    "arrivalVoyageNumber",
    "complianceReceiverPort",
    "mrnCustomsNumber",
    "departureVoyageNumber",
    "dischargePort",
    "complianceStatus",
    "complianceLoadStatus",
    "customsResponseReason",
    "sentTimeStamp",
    "entryPortETA",
    "isAttached"
})
public class Mrn {

    @JsonProperty("transportDocumentNumber")
    private String transportDocumentNumber;
    @JsonProperty("vesselCode")
    private String vesselCode;
    @JsonProperty("arrivalVoyageNumber")
    private String arrivalVoyageNumber;
    @JsonProperty("complianceReceiverPort")
    private String complianceReceiverPort;
    @JsonProperty("mrnCustomsNumber")
    private String mrnCustomsNumber;
    @JsonProperty("departureVoyageNumber")
    private String departureVoyageNumber;
    @JsonProperty("dischargePort")
    private String dischargePort;
    @JsonProperty("complianceStatus")
    private String complianceStatus;
    @JsonProperty("complianceLoadStatus")
    private String complianceLoadStatus;
    @JsonProperty("customsResponseReason")
    private String customsResponseReason;
    @JsonProperty("sentTimeStamp")
    private String sentTimeStamp;
    @JsonProperty("entryPortETA")
    private String entryPortETA;
    @JsonProperty("isAttached")
    private String isAttached;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("transportDocumentNumber")
    public String getTransportDocumentNumber() {
        return transportDocumentNumber;
    }

    @JsonProperty("transportDocumentNumber")
    public void setTransportDocumentNumber(String transportDocumentNumber) {
        this.transportDocumentNumber = transportDocumentNumber;
    }

    @JsonProperty("vesselCode")
    public String getVesselCode() {
        return vesselCode;
    }

    @JsonProperty("vesselCode")
    public void setVesselCode(String vesselCode) {
        this.vesselCode = vesselCode;
    }

    @JsonProperty("arrivalVoyageNumber")
    public String getArrivalVoyageNumber() {
        return arrivalVoyageNumber;
    }

    @JsonProperty("arrivalVoyageNumber")
    public void setArrivalVoyageNumber(String arrivalVoyageNumber) {
        this.arrivalVoyageNumber = arrivalVoyageNumber;
    }

    @JsonProperty("complianceReceiverPort")
    public String getComplianceReceiverPort() {
        return complianceReceiverPort;
    }

    @JsonProperty("complianceReceiverPort")
    public void setComplianceReceiverPort(String complianceReceiverPort) {
        this.complianceReceiverPort = complianceReceiverPort;
    }

    @JsonProperty("mrnCustomsNumber")
    public String getMrnCustomsNumber() {
        return mrnCustomsNumber;
    }

    @JsonProperty("mrnCustomsNumber")
    public void setMrnCustomsNumber(String mrnCustomsNumber) {
        this.mrnCustomsNumber = mrnCustomsNumber;
    }

    @JsonProperty("departureVoyageNumber")
    public String getDepartureVoyageNumber() {
        return departureVoyageNumber;
    }

    @JsonProperty("departureVoyageNumber")
    public void setDepartureVoyageNumber(String departureVoyageNumber) {
        this.departureVoyageNumber = departureVoyageNumber;
    }

    @JsonProperty("dischargePort")
    public String getDischargePort() {
        return dischargePort;
    }

    @JsonProperty("dischargePort")
    public void setDischargePort(String dischargePort) {
        this.dischargePort = dischargePort;
    }

    @JsonProperty("complianceStatus")
    public String getComplianceStatus() {
        return complianceStatus;
    }

    @JsonProperty("complianceStatus")
    public void setComplianceStatus(String complianceStatus) {
        this.complianceStatus = complianceStatus;
    }

    @JsonProperty("complianceLoadStatus")
    public String getComplianceLoadStatus() {
        return complianceLoadStatus;
    }

    @JsonProperty("complianceLoadStatus")
    public void setComplianceLoadStatus(String complianceLoadStatus) {
        this.complianceLoadStatus = complianceLoadStatus;
    }

    @JsonProperty("customsResponseReason")
    public String getCustomsResponseReason() {
        return customsResponseReason;
    }

    @JsonProperty("customsResponseReason")
    public void setCustomsResponseReason(String customsResponseReason) {
        this.customsResponseReason = customsResponseReason;
    }

    @JsonProperty("sentTimeStamp")
    public String getSentTimeStamp() {
        return sentTimeStamp;
    }

    @JsonProperty("sentTimeStamp")
    public void setSentTimeStamp(String sentTimeStamp) {
        this.sentTimeStamp = sentTimeStamp;
    }

    @JsonProperty("entryPortETA")
    public String getEntryPortETA() {
        return entryPortETA;
    }

    @JsonProperty("entryPortETA")
    public void setEntryPortETA(String entryPortETA) {
        this.entryPortETA = entryPortETA;
    }

    @JsonProperty("isAttached")
    public String getIsAttached() {
        return isAttached;
    }

    @JsonProperty("isAttached")
    public void setIsAttached(String isAttached) {
        this.isAttached = isAttached;
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
