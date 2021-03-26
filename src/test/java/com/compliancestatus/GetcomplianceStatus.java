
package com.compliancestatus;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import getDQEcallUsingComplianceId.BillOfLading;

import org.apache.commons.lang.builder.ToStringBuilder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "complianceId",
    "brand",
    "complianceType",
    "complianceName",
    "createdDate",
    "updatedDate",
    "lastSubmittedDate",
    "compliancePort",
    "status",
    "messageReference",
    "receiversReferenceNumber",
    "receiversReferenceDate",
    "mandatoryFields",
    "billOfLadings"
})
public class GetcomplianceStatus {

    @JsonProperty("complianceId")
    private String complianceId;
    @JsonProperty("brand")
    private String brand;
    @JsonProperty("complianceType")
    private String complianceType;
    @JsonProperty("complianceName")
    private String complianceName;
    @JsonProperty("createdDate")
    private String createdDate;
    @JsonProperty("updatedDate")
    private String updatedDate;
    @JsonProperty("lastSubmittedDate")
    private Object lastSubmittedDate;
    @JsonProperty("compliancePort")
    private String compliancePort;
    @JsonProperty("status")
    private String status;
    @JsonProperty("messageReference")
    private Object messageReference;
    @JsonProperty("receiversReferenceNumber")
    private Object receiversReferenceNumber;
    @JsonProperty("receiversReferenceDate")
    private Object receiversReferenceDate;
    @JsonProperty("mandatoryFields")
    private Object mandatoryFields;
    @JsonProperty("billOfLadings")
    private List<BillOfLading> billOfLadings = null;

    @JsonProperty("complianceId")
    public String getComplianceId() {
        return complianceId;
    }

    @JsonProperty("complianceId")
    public void setComplianceId(String complianceId) {
        this.complianceId = complianceId;
    }

    @JsonProperty("brand")
    public String getBrand() {
        return brand;
    }

    @JsonProperty("brand")
    public void setBrand(String brand) {
        this.brand = brand;
    }

    @JsonProperty("complianceType")
    public String getComplianceType() {
        return complianceType;
    }

    @JsonProperty("complianceType")
    public void setComplianceType(String complianceType) {
        this.complianceType = complianceType;
    }

    @JsonProperty("complianceName")
    public String getComplianceName() {
        return complianceName;
    }

    @JsonProperty("complianceName")
    public void setComplianceName(String complianceName) {
        this.complianceName = complianceName;
    }

    @JsonProperty("createdDate")
    public String getCreatedDate() {
        return createdDate;
    }

    @JsonProperty("createdDate")
    public void setCreatedDate(String createdDate) {
        this.createdDate = createdDate;
    }

    @JsonProperty("updatedDate")
    public String getUpdatedDate() {
        return updatedDate;
    }

    @JsonProperty("updatedDate")
    public void setUpdatedDate(String updatedDate) {
        this.updatedDate = updatedDate;
    }

    @JsonProperty("lastSubmittedDate")
    public Object getLastSubmittedDate() {
        return lastSubmittedDate;
    }

    @JsonProperty("lastSubmittedDate")
    public void setLastSubmittedDate(Object lastSubmittedDate) {
        this.lastSubmittedDate = lastSubmittedDate;
    }

    @JsonProperty("compliancePort")
    public String getCompliancePort() {
        return compliancePort;
    }

    @JsonProperty("compliancePort")
    public void setCompliancePort(String compliancePort) {
        this.compliancePort = compliancePort;
    }

    @JsonProperty("status")
    public String getStatus() {
        return status;
    }

    @JsonProperty("status")
    public void setStatus(String status) {
        this.status = status;
    }

    @JsonProperty("messageReference")
    public Object getMessageReference() {
        return messageReference;
    }

    @JsonProperty("messageReference")
    public void setMessageReference(Object messageReference) {
        this.messageReference = messageReference;
    }

    @JsonProperty("receiversReferenceNumber")
    public Object getReceiversReferenceNumber() {
        return receiversReferenceNumber;
    }

    @JsonProperty("receiversReferenceNumber")
    public void setReceiversReferenceNumber(Object receiversReferenceNumber) {
        this.receiversReferenceNumber = receiversReferenceNumber;
    }

    @JsonProperty("receiversReferenceDate")
    public Object getReceiversReferenceDate() {
        return receiversReferenceDate;
    }

    @JsonProperty("receiversReferenceDate")
    public void setReceiversReferenceDate(Object receiversReferenceDate) {
        this.receiversReferenceDate = receiversReferenceDate;
    }

    @JsonProperty("mandatoryFields")
    public Object getMandatoryFields() {
        return mandatoryFields;
    }

    @JsonProperty("mandatoryFields")
    public void setMandatoryFields(Object mandatoryFields) {
        this.mandatoryFields = mandatoryFields;
    }

    @JsonProperty("billOfLadings")
    public List<BillOfLading> getBillOfLadings() {
        return billOfLadings;
    }

    @JsonProperty("billOfLadings")
    public void setBillOfLadings(List<BillOfLading> billOfLadings) {
        this.billOfLadings = billOfLadings;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("complianceId", complianceId).append("brand", brand).append("complianceType", complianceType).append("complianceName", complianceName).append("createdDate", createdDate).append("updatedDate", updatedDate).append("lastSubmittedDate", lastSubmittedDate).append("compliancePort", compliancePort).append("status", status).append("messageReference", messageReference).append("receiversReferenceNumber", receiversReferenceNumber).append("receiversReferenceDate", receiversReferenceDate).append("mandatoryFields", mandatoryFields).append("billOfLadings", billOfLadings).toString();
    }

}
