
package pojo;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.apache.commons.lang.builder.ToStringBuilder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "instanceId",
    "cargoDesc",
    "cargoDescText",
    "tpdLevelInd"
})
public class Description {

    @JsonProperty("instanceId")
    private String instanceId;
    @JsonProperty("cargoDesc")
    private String cargoDesc;
    @JsonProperty("cargoDescText")
    private String cargoDescText;
    @JsonProperty("tpdLevelInd")
    private String tpdLevelInd;

    @JsonProperty("instanceId")
    public String getInstanceId() {
        return instanceId;
    }

    @JsonProperty("instanceId")
    public void setInstanceId(String instanceId) {
        this.instanceId = instanceId;
    }

    @JsonProperty("cargoDesc")
    public String getCargoDesc() {
        return cargoDesc;
    }

    @JsonProperty("cargoDesc")
    public void setCargoDesc(String cargoDesc) {
        this.cargoDesc = cargoDesc;
    }

    @JsonProperty("cargoDescText")
    public String getCargoDescText() {
        return cargoDescText;
    }

    @JsonProperty("cargoDescText")
    public void setCargoDescText(String cargoDescText) {
        this.cargoDescText = cargoDescText;
    }

    @JsonProperty("tpdLevelInd")
    public String getTpdLevelInd() {
        return tpdLevelInd;
    }

    @JsonProperty("tpdLevelInd")
    public void setTpdLevelInd(String tpdLevelInd) {
        this.tpdLevelInd = tpdLevelInd;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("instanceId", instanceId).append("cargoDesc", cargoDesc).append("cargoDescText", cargoDescText).append("tpdLevelInd", tpdLevelInd).toString();
    }

}
