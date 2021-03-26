
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
    "taxRegistrationType",
    "taxRegistrationNumber",
    "taxTypeLocalName"
})
public class TaxNumber {

    @JsonProperty("taxRegistrationType")
    private String taxRegistrationType;
    @JsonProperty("taxRegistrationNumber")
    private String taxRegistrationNumber;
    @JsonProperty("taxTypeLocalName")
    private String taxTypeLocalName;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("taxRegistrationType")
    public String getTaxRegistrationType() {
        return taxRegistrationType;
    }

    @JsonProperty("taxRegistrationType")
    public void setTaxRegistrationType(String taxRegistrationType) {
        this.taxRegistrationType = taxRegistrationType;
    }

    @JsonProperty("taxRegistrationNumber")
    public String getTaxRegistrationNumber() {
        return taxRegistrationNumber;
    }

    @JsonProperty("taxRegistrationNumber")
    public void setTaxRegistrationNumber(String taxRegistrationNumber) {
        this.taxRegistrationNumber = taxRegistrationNumber;
    }

    @JsonProperty("taxTypeLocalName")
    public String getTaxTypeLocalName() {
        return taxTypeLocalName;
    }

    @JsonProperty("taxTypeLocalName")
    public void setTaxTypeLocalName(String taxTypeLocalName) {
        this.taxTypeLocalName = taxTypeLocalName;
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
