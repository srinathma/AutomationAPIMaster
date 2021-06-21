
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
    "sealNumber",
    "sealName"
})
public class Seal {

    @JsonProperty("sealNumber")
    private String sealNumber;
    @JsonProperty("sealName")
    private String sealName;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("sealNumber")
    public String getSealNumber() {
        return sealNumber;
    }

    @JsonProperty("sealNumber")
    public void setSealNumber(String sealNumber) {
        this.sealNumber = sealNumber;
    }

    @JsonProperty("sealName")
    public String getSealName() {
        return sealName;
    }

    @JsonProperty("sealName")
    public void setSealName(String sealName) {
        this.sealName = sealName;
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
