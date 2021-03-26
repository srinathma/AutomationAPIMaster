
package com.example;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "accountStatus",
    "tradingName",
    "customerCode",
    "country",
    "city",
    "citySubArea",
    "streetName",
    "streetNumber",
    "apartment",
    "pbNumber",
    "postalCode",
    "taxNumbers",
    "customerReference"
})
public class CustomerInformation {

    @JsonProperty("accountStatus")
    private String accountStatus;
    @JsonProperty("tradingName")
    private String tradingName;
    @JsonProperty("customerCode")
    private String customerCode;
    @JsonProperty("country")
    private String country;
    @JsonProperty("city")
    private String city;
    @JsonProperty("citySubArea")
    private String citySubArea;
    @JsonProperty("streetName")
    private String streetName;
    @JsonProperty("streetNumber")
    private Object streetNumber;
    @JsonProperty("apartment")
    private String apartment;
    @JsonProperty("pbNumber")
    private Object pbNumber;
    @JsonProperty("postalCode")
    private String postalCode;
    @JsonProperty("taxNumbers")
    private List<TaxNumber> taxNumbers = null;
    @JsonProperty("customerReference")
    private Object customerReference;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("accountStatus")
    public String getAccountStatus() {
        return accountStatus;
    }

    @JsonProperty("accountStatus")
    public void setAccountStatus(String accountStatus) {
        this.accountStatus = accountStatus;
    }

    @JsonProperty("tradingName")
    public String getTradingName() {
        return tradingName;
    }

    @JsonProperty("tradingName")
    public void setTradingName(String tradingName) {
        this.tradingName = tradingName;
    }

    @JsonProperty("customerCode")
    public String getCustomerCode() {
        return customerCode;
    }

    @JsonProperty("customerCode")
    public void setCustomerCode(String customerCode) {
        this.customerCode = customerCode;
    }

    @JsonProperty("country")
    public String getCountry() {
        return country;
    }

    @JsonProperty("country")
    public void setCountry(String country) {
        this.country = country;
    }

    @JsonProperty("city")
    public String getCity() {
        return city;
    }

    @JsonProperty("city")
    public void setCity(String city) {
        this.city = city;
    }

    @JsonProperty("citySubArea")
    public String getCitySubArea() {
        return citySubArea;
    }

    @JsonProperty("citySubArea")
    public void setCitySubArea(String citySubArea) {
        this.citySubArea = citySubArea;
    }

    @JsonProperty("streetName")
    public String getStreetName() {
        return streetName;
    }

    @JsonProperty("streetName")
    public void setStreetName(String streetName) {
        this.streetName = streetName;
    }

    @JsonProperty("streetNumber")
    public Object getStreetNumber() {
        return streetNumber;
    }

    @JsonProperty("streetNumber")
    public void setStreetNumber(Object streetNumber) {
        this.streetNumber = streetNumber;
    }

    @JsonProperty("apartment")
    public String getApartment() {
        return apartment;
    }

    @JsonProperty("apartment")
    public void setApartment(String apartment) {
        this.apartment = apartment;
    }

    @JsonProperty("pbNumber")
    public Object getPbNumber() {
        return pbNumber;
    }

    @JsonProperty("pbNumber")
    public void setPbNumber(Object pbNumber) {
        this.pbNumber = pbNumber;
    }

    @JsonProperty("postalCode")
    public String getPostalCode() {
        return postalCode;
    }

    @JsonProperty("postalCode")
    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }

    @JsonProperty("taxNumbers")
    public List<TaxNumber> getTaxNumbers() {
        return taxNumbers;
    }

    @JsonProperty("taxNumbers")
    public void setTaxNumbers(List<TaxNumber> taxNumbers) {
        this.taxNumbers = taxNumbers;
    }

    @JsonProperty("customerReference")
    public Object getCustomerReference() {
        return customerReference;
    }

    @JsonProperty("customerReference")
    public void setCustomerReference(Object customerReference) {
        this.customerReference = customerReference;
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
