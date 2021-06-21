
package getDQEcallUsingComplianceId;

import java.util.ArrayList;
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
    "billOfLadings"
})
public class DQECompliance {

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
    @JsonProperty("billOfLadings")
    private List<BillOfLading> billOfLadings = new ArrayList<BillOfLading>();
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("complianceId")
    public String getComplianceId() {
        return complianceId;
    }

    @JsonProperty("complianceId")
    public void setComplianceId(String complianceId) {
        this.complianceId = complianceId;
    }

    public DQECompliance withComplianceId(String complianceId) {
        this.complianceId = complianceId;
        return this;
    }

    @JsonProperty("brand")
    public String getBrand() {
        return brand;
    }

    @JsonProperty("brand")
    public void setBrand(String brand) {
        this.brand = brand;
    }

    public DQECompliance withBrand(String brand) {
        this.brand = brand;
        return this;
    }

    @JsonProperty("complianceType")
    public String getComplianceType() {
        return complianceType;
    }

    @JsonProperty("complianceType")
    public void setComplianceType(String complianceType) {
        this.complianceType = complianceType;
    }

    public DQECompliance withComplianceType(String complianceType) {
        this.complianceType = complianceType;
        return this;
    }

    @JsonProperty("complianceName")
    public String getComplianceName() {
        return complianceName;
    }

    @JsonProperty("complianceName")
    public void setComplianceName(String complianceName) {
        this.complianceName = complianceName;
    }

    public DQECompliance withComplianceName(String complianceName) {
        this.complianceName = complianceName;
        return this;
    }

    @JsonProperty("createdDate")
    public String getCreatedDate() {
        return createdDate;
    }

    @JsonProperty("createdDate")
    public void setCreatedDate(String createdDate) {
        this.createdDate = createdDate;
    }

    public DQECompliance withCreatedDate(String createdDate) {
        this.createdDate = createdDate;
        return this;
    }

    @JsonProperty("updatedDate")
    public String getUpdatedDate() {
        return updatedDate;
    }

    @JsonProperty("updatedDate")
    public void setUpdatedDate(String updatedDate) {
        this.updatedDate = updatedDate;
    }

    public DQECompliance withUpdatedDate(String updatedDate) {
        this.updatedDate = updatedDate;
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

    public DQECompliance withLastSubmittedDate(Object lastSubmittedDate) {
        this.lastSubmittedDate = lastSubmittedDate;
        return this;
    }

    @JsonProperty("compliancePort")
    public String getCompliancePort() {
        return compliancePort;
    }

    @JsonProperty("compliancePort")
    public void setCompliancePort(String compliancePort) {
        this.compliancePort = compliancePort;
    }

    public DQECompliance withCompliancePort(String compliancePort) {
        this.compliancePort = compliancePort;
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

    public DQECompliance withStatus(String status) {
        this.status = status;
        return this;
    }

    @JsonProperty("messageReference")
    public Object getMessageReference() {
        return messageReference;
    }

    @JsonProperty("messageReference")
    public void setMessageReference(Object messageReference) {
        this.messageReference = messageReference;
    }

    public DQECompliance withMessageReference(Object messageReference) {
        this.messageReference = messageReference;
        return this;
    }

    @JsonProperty("receiversReferenceNumber")
    public Object getReceiversReferenceNumber() {
        return receiversReferenceNumber;
    }

    @JsonProperty("receiversReferenceNumber")
    public void setReceiversReferenceNumber(Object receiversReferenceNumber) {
        this.receiversReferenceNumber = receiversReferenceNumber;
    }

    public DQECompliance withReceiversReferenceNumber(Object receiversReferenceNumber) {
        this.receiversReferenceNumber = receiversReferenceNumber;
        return this;
    }

    @JsonProperty("receiversReferenceDate")
    public Object getReceiversReferenceDate() {
        return receiversReferenceDate;
    }

    @JsonProperty("receiversReferenceDate")
    public void setReceiversReferenceDate(Object receiversReferenceDate) {
        this.receiversReferenceDate = receiversReferenceDate;
    }

    public DQECompliance withReceiversReferenceDate(Object receiversReferenceDate) {
        this.receiversReferenceDate = receiversReferenceDate;
        return this;
    }

    @JsonProperty("billOfLadings")
    public List<BillOfLading> getBillOfLadings() {
        return billOfLadings;
    }

    @JsonProperty("billOfLadings")
    public void setBillOfLadings(List<BillOfLading> billOfLadings) {
        this.billOfLadings = billOfLadings;
    }

    public DQECompliance withBillOfLadings(List<BillOfLading> billOfLadings) {
        this.billOfLadings = billOfLadings;
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

    public DQECompliance withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(complianceId).append(brand).append(complianceType).append(complianceName).append(createdDate).append(updatedDate).append(lastSubmittedDate).append(compliancePort).append(status).append(messageReference).append(receiversReferenceNumber).append(receiversReferenceDate).append(billOfLadings).append(additionalProperties).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof DQECompliance) == false) {
            return false;
        }
        DQECompliance rhs = ((DQECompliance) other);
        return new EqualsBuilder().append(complianceId, rhs.complianceId).append(brand, rhs.brand).append(complianceType, rhs.complianceType).append(complianceName, rhs.complianceName).append(createdDate, rhs.createdDate).append(updatedDate, rhs.updatedDate).append(lastSubmittedDate, rhs.lastSubmittedDate).append(compliancePort, rhs.compliancePort).append(status, rhs.status).append(messageReference, rhs.messageReference).append(receiversReferenceNumber, rhs.receiversReferenceNumber).append(receiversReferenceDate, rhs.receiversReferenceDate).append(billOfLadings, rhs.billOfLadings).append(additionalProperties, rhs.additionalProperties).isEquals();
    }

}
