
package com.billoflading;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.apache.commons.lang.builder.ToStringBuilder;

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

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("taxRegistrationType", taxRegistrationType).append("taxRegistrationNumber", taxRegistrationNumber).append("taxTypeLocalName", taxTypeLocalName).toString();
    }

}
