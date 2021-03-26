
package pojo;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.apache.commons.lang.builder.ToStringBuilder;

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
    private Object customerInformation;

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
    public Object getCustomerInformation() {
        return customerInformation;
    }

    @JsonProperty("customerInformation")
    public void setCustomerInformation(Object customerInformation) {
        this.customerInformation = customerInformation;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("cmdCustomerId", cmdCustomerId).append("docAddress", docAddress).append("roleType", roleType).append("roleDescription", roleDescription).append("customerInformation", customerInformation).toString();
    }

}
