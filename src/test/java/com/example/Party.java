
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
    "cmdCustomerId",
    "docAddress",
    "roleType",
    "roleDescription",
    "customerInformation"
})
public class Party {

    @JsonProperty("cmdCustomerId")
    private String cmdCustomerId;
    @JsonProperty("docAddress")
    private String docAddress;
    @JsonProperty("roleType")
    private String roleType;
    @JsonProperty("roleDescription")
    private String roleDescription;
    @JsonProperty("customerInformation")
    private CustomerInformation customerInformation;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("cmdCustomerId")
    public String getCmdCustomerId() {
        return cmdCustomerId;
    }

    @JsonProperty("cmdCustomerId")
    public void setCmdCustomerId(String cmdCustomerId) {
        this.cmdCustomerId = cmdCustomerId;
    }

    @JsonProperty("docAddress")
    public String getDocAddress() {
        return docAddress;
    }

    @JsonProperty("docAddress")
    public void setDocAddress(String docAddress) {
        this.docAddress = docAddress;
    }

    @JsonProperty("roleType")
    public String getRoleType() {
        return roleType;
    }

    @JsonProperty("roleType")
    public void setRoleType(String roleType) {
        this.roleType = roleType;
    }

    @JsonProperty("roleDescription")
    public String getRoleDescription() {
        return roleDescription;
    }

    @JsonProperty("roleDescription")
    public void setRoleDescription(String roleDescription) {
        this.roleDescription = roleDescription;
    }

    @JsonProperty("customerInformation")
    public CustomerInformation getCustomerInformation() {
        return customerInformation;
    }

    @JsonProperty("customerInformation")
    public void setCustomerInformation(CustomerInformation customerInformation) {
        this.customerInformation = customerInformation;
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
