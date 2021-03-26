
package getDQEcallUsingComplianceId;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "bolNumber",
    "sequenceNumber",
    "ediTransmissionId",
    "icNumber",
    "receiverReference",
    "receiverReferenceDate",
    "lastSubmittedDate",
    "responseType",
    "status",
    "stage",
    "loadPort",
    "dischargePort",
    "dqeErrors",
    "errorDetails",
    "customResponse",
    "moveType",
    "consignments"
})
public class BillOfLading {

    @JsonProperty("bolNumber")
    private String bolNumber;
    @JsonProperty("sequenceNumber")
    private Integer sequenceNumber;
    @JsonProperty("ediTransmissionId")
    private String ediTransmissionId;
    @JsonProperty("icNumber")
    private Object icNumber;
    @JsonProperty("receiverReference")
    private Object receiverReference;
    @JsonProperty("receiverReferenceDate")
    private Object receiverReferenceDate;
    @JsonProperty("lastSubmittedDate")
    private Object lastSubmittedDate;
    @JsonProperty("responseType")
    private Object responseType;
    @JsonProperty("status")
    private String status;
    @JsonProperty("stage")
    private String stage;
    @JsonProperty("loadPort")
    private String loadPort;
    @JsonProperty("dischargePort")
    private String dischargePort;
    @JsonProperty("dqeErrors")
    private List<DQEErrors> dqeErrors;
    @JsonProperty("errorDetails")
    private Object errorDetails;
    @JsonProperty("customResponse")
    private Object customResponse;
    @JsonProperty("moveType")
    private String moveType;
    @JsonProperty("consignments")
    private Object consignments;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("bolNumber")
    public String getBolNumber() {
        return bolNumber;
    }

    @JsonProperty("bolNumber")
    public void setBolNumber(String bolNumber) {
        this.bolNumber = bolNumber;
    }

    public BillOfLading withBolNumber(String bolNumber) {
        this.bolNumber = bolNumber;
        return this;
    }

    @JsonProperty("sequenceNumber")
    public Integer getSequenceNumber() {
        return sequenceNumber;
    }

    @JsonProperty("sequenceNumber")
    public void setSequenceNumber(Integer sequenceNumber) {
        this.sequenceNumber = sequenceNumber;
    }

    public BillOfLading withSequenceNumber(Integer sequenceNumber) {
        this.sequenceNumber = sequenceNumber;
        return this;
    }

    @JsonProperty("ediTransmissionId")
    public String getEdiTransmissionId() {
        return ediTransmissionId;
    }

    @JsonProperty("ediTransmissionId")
    public void setEdiTransmissionId(String ediTransmissionId) {
        this.ediTransmissionId = ediTransmissionId;
    }

    public BillOfLading withEdiTransmissionId(String ediTransmissionId) {
        this.ediTransmissionId = ediTransmissionId;
        return this;
    }

    @JsonProperty("icNumber")
    public Object getIcNumber() {
        return icNumber;
    }

    @JsonProperty("icNumber")
    public void setIcNumber(Object icNumber) {
        this.icNumber = icNumber;
    }

    public BillOfLading withIcNumber(Object icNumber) {
        this.icNumber = icNumber;
        return this;
    }

    @JsonProperty("receiverReference")
    public Object getReceiverReference() {
        return receiverReference;
    }

    @JsonProperty("receiverReference")
    public void setReceiverReference(Object receiverReference) {
        this.receiverReference = receiverReference;
    }

    public BillOfLading withReceiverReference(Object receiverReference) {
        this.receiverReference = receiverReference;
        return this;
    }

    @JsonProperty("receiverReferenceDate")
    public Object getReceiverReferenceDate() {
        return receiverReferenceDate;
    }

    @JsonProperty("receiverReferenceDate")
    public void setReceiverReferenceDate(Object receiverReferenceDate) {
        this.receiverReferenceDate = receiverReferenceDate;
    }

    public BillOfLading withReceiverReferenceDate(Object receiverReferenceDate) {
        this.receiverReferenceDate = receiverReferenceDate;
        return this;
    }

    @JsonProperty("lastSubmittedDate")
    public Object getLastSubmittedDate() {
        return lastSubmittedDate;
    }

    @JsonProperty("lastSubmittedDate")
    public void setLastSubmittedDate(Object lastSubmittedDate) {
        this.lastSubmittedDate = lastSubmittedDate;
    }

    public BillOfLading withLastSubmittedDate(Object lastSubmittedDate) {
        this.lastSubmittedDate = lastSubmittedDate;
        return this;
    }

    @JsonProperty("responseType")
    public Object getResponseType() {
        return responseType;
    }

    @JsonProperty("responseType")
    public void setResponseType(Object responseType) {
        this.responseType = responseType;
    }

    public BillOfLading withResponseType(Object responseType) {
        this.responseType = responseType;
        return this;
    }

    @JsonProperty("status")
    public String getStatus() {
        return status;
    }

    @JsonProperty("status")
    public void setStatus(String status) {
        this.status = status;
    }

    public BillOfLading withStatus(String status) {
        this.status = status;
        return this;
    }

    @JsonProperty("stage")
    public String getStage() {
        return stage;
    }

    @JsonProperty("stage")
    public void setStage(String stage) {
        this.stage = stage;
    }

    public BillOfLading withStage(String stage) {
        this.stage = stage;
        return this;
    }

    @JsonProperty("loadPort")
    public String getLoadPort() {
        return loadPort;
    }

    @JsonProperty("loadPort")
    public void setLoadPort(String loadPort) {
        this.loadPort = loadPort;
    }

    public BillOfLading withLoadPort(String loadPort) {
        this.loadPort = loadPort;
        return this;
    }

    @JsonProperty("dischargePort")
    public String getDischargePort() {
        return dischargePort;
    }

    @JsonProperty("dischargePort")
    public void setDischargePort(String dischargePort) {
        this.dischargePort = dischargePort;
    }

    public BillOfLading withDischargePort(String dischargePort) {
        this.dischargePort = dischargePort;
        return this;
    }

    @JsonProperty("dqeErrors")
    public List<DQEErrors> getDqeErrors() {
        return dqeErrors;
     
    }

    @JsonProperty("dqeErrors")
    public void setDqeErrors(List<DQEErrors> dqeErrors) {
        this.dqeErrors = dqeErrors;
    }

   

    @JsonProperty("errorDetails")
    public Object getErrorDetails() {
        return errorDetails;
    }

    @JsonProperty("errorDetails")
    public void setErrorDetails(Object errorDetails) {
        this.errorDetails = errorDetails;
    }

    public BillOfLading withErrorDetails(Object errorDetails) {
        this.errorDetails = errorDetails;
        return this;
    }

    @JsonProperty("customResponse")
    public Object getCustomResponse() {
        return customResponse;
    }

    @JsonProperty("customResponse")
    public void setCustomResponse(Object customResponse) {
        this.customResponse = customResponse;
    }

    public BillOfLading withCustomResponse(Object customResponse) {
        this.customResponse = customResponse;
        return this;
    }

    @JsonProperty("moveType")
    public String getMoveType() {
        return moveType;
    }

    @JsonProperty("moveType")
    public void setMoveType(String moveType) {
        this.moveType = moveType;
    }

    public BillOfLading withMoveType(String moveType) {
        this.moveType = moveType;
        return this;
    }

    @JsonProperty("consignments")
    public Object getConsignments() {
        return consignments;
    }

    @JsonProperty("consignments")
    public void setConsignments(Object consignments) {
        this.consignments = consignments;
    }

    public BillOfLading withConsignments(Object consignments) {
        this.consignments = consignments;
        return this;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

    public BillOfLading withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(bolNumber).append(sequenceNumber).append(ediTransmissionId).append(icNumber).append(receiverReference).append(receiverReferenceDate).append(lastSubmittedDate).append(responseType).append(status).append(stage).append(loadPort).append(dischargePort).append(dqeErrors).append(errorDetails).append(customResponse).append(moveType).append(consignments).append(additionalProperties).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof BillOfLading) == false) {
            return false;
        }
        BillOfLading rhs = ((BillOfLading) other);
        return new EqualsBuilder().append(bolNumber, rhs.bolNumber).append(sequenceNumber, rhs.sequenceNumber).append(ediTransmissionId, rhs.ediTransmissionId).append(icNumber, rhs.icNumber).append(receiverReference, rhs.receiverReference).append(receiverReferenceDate, rhs.receiverReferenceDate).append(lastSubmittedDate, rhs.lastSubmittedDate).append(responseType, rhs.responseType).append(status, rhs.status).append(stage, rhs.stage).append(loadPort, rhs.loadPort).append(dischargePort, rhs.dischargePort).append(dqeErrors, rhs.dqeErrors).append(errorDetails, rhs.errorDetails).append(customResponse, rhs.customResponse).append(moveType, rhs.moveType).append(consignments, rhs.consignments).append(additionalProperties, rhs.additionalProperties).isEquals();
    }

}
