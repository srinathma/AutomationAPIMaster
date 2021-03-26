
package com.billoflading;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.apache.commons.lang.builder.ToStringBuilder;

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

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("sealNumber", sealNumber).append("sealName", sealName).toString();
    }

}
