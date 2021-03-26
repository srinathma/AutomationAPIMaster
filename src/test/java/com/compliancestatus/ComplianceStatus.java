
package com.compliancestatus;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
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
public class ComplianceStatus {

    @JsonProperty("bolNumber")
    private String bolNumber;
    @JsonProperty("sequenceNumber")
    private Long sequenceNumber;
    @JsonProperty("ediTransmissionId")
    private Object ediTransmissionId;
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
    private Object dqeErrors;
    @JsonProperty("errorDetails")
    private Object errorDetails;
    @JsonProperty("customResponse")
    private Object customResponse;
    @JsonProperty("moveType")
    private String moveType;
    @JsonProperty("consignments")
    private Object consignments;

    @JsonProperty("bolNumber")
    public String getBolNumber() {
        return bolNumber;
    }

    @JsonProperty("bolNumber")
    public void setBolNumber(String bolNumber) {
        this.bolNumber = bolNumber;
    }

    @JsonProperty("sequenceNumber")
    public Long getSequenceNumber() {
        return sequenceNumber;
    }

    @JsonProperty("sequenceNumber")
    public void setSequenceNumber(Long sequenceNumber) {
        this.sequenceNumber = sequenceNumber;
    }

    @JsonProperty("ediTransmissionId")
    public Object getEdiTransmissionId() {
        return ediTransmissionId;
    }

    @JsonProperty("ediTransmissionId")
    public void setEdiTransmissionId(Object ediTransmissionId) {
        this.ediTransmissionId = ediTransmissionId;
    }

    @JsonProperty("icNumber")
    public Object getIcNumber() {
        return icNumber;
    }

    @JsonProperty("icNumber")
    public void setIcNumber(Object icNumber) {
        this.icNumber = icNumber;
    }

    @JsonProperty("receiverReference")
    public Object getReceiverReference() {
        return receiverReference;
    }

    @JsonProperty("receiverReference")
    public void setReceiverReference(Object receiverReference) {
        this.receiverReference = receiverReference;
    }

    @JsonProperty("receiverReferenceDate")
    public Object getReceiverReferenceDate() {
        return receiverReferenceDate;
    }

    @JsonProperty("receiverReferenceDate")
    public void setReceiverReferenceDate(Object receiverReferenceDate) {
        this.receiverReferenceDate = receiverReferenceDate;
    }

    @JsonProperty("lastSubmittedDate")
    public Object getLastSubmittedDate() {
        return lastSubmittedDate;
    }

    @JsonProperty("lastSubmittedDate")
    public void setLastSubmittedDate(Object lastSubmittedDate) {
        this.lastSubmittedDate = lastSubmittedDate;
    }

    @JsonProperty("responseType")
    public Object getResponseType() {
        return responseType;
    }

    @JsonProperty("responseType")
    public void setResponseType(Object responseType) {
        this.responseType = responseType;
    }

    @JsonProperty("status")
    public String getStatus() {
        return status;
    }

    @JsonProperty("status")
    public void setStatus(String status) {
        this.status = status;
    }

    @JsonProperty("stage")
    public String getStage() {
        return stage;
    }

    @JsonProperty("stage")
    public void setStage(String stage) {
        this.stage = stage;
    }

    @JsonProperty("loadPort")
    public String getLoadPort() {
        return loadPort;
    }

    @JsonProperty("loadPort")
    public void setLoadPort(String loadPort) {
        this.loadPort = loadPort;
    }

    @JsonProperty("dischargePort")
    public String getDischargePort() {
        return dischargePort;
    }

    @JsonProperty("dischargePort")
    public void setDischargePort(String dischargePort) {
        this.dischargePort = dischargePort;
    }

    @JsonProperty("dqeErrors")
    public Object getDqeErrors() {
        return dqeErrors;
    }

    @JsonProperty("dqeErrors")
    public void setDqeErrors(Object dqeErrors) {
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

    @JsonProperty("customResponse")
    public Object getCustomResponse() {
        return customResponse;
    }

    @JsonProperty("customResponse")
    public void setCustomResponse(Object customResponse) {
        this.customResponse = customResponse;
    }

    @JsonProperty("moveType")
    public String getMoveType() {
        return moveType;
    }

    @JsonProperty("moveType")
    public void setMoveType(String moveType) {
        this.moveType = moveType;
    }

    @JsonProperty("consignments")
    public Object getConsignments() {
        return consignments;
    }

    @JsonProperty("consignments")
    public void setConsignments(Object consignments) {
        this.consignments = consignments;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("bolNumber", bolNumber).append("sequenceNumber", sequenceNumber).append("ediTransmissionId", ediTransmissionId).append("icNumber", icNumber).append("receiverReference", receiverReference).append("receiverReferenceDate", receiverReferenceDate).append("lastSubmittedDate", lastSubmittedDate).append("responseType", responseType).append("status", status).append("stage", stage).append("loadPort", loadPort).append("dischargePort", dischargePort).append("dqeErrors", dqeErrors).append("errorDetails", errorDetails).append("customResponse", customResponse).append("moveType", moveType).append("consignments", consignments).toString();
    }

}
