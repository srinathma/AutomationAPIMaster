
package pojo;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.apache.commons.lang.builder.ToStringBuilder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "eventType",
    "key",
    "data",
    "eventCreatedAt"
})
public class User {

    @JsonProperty("eventType")
    private String eventType;
    @JsonProperty("key")
    private String key;
    @JsonProperty("data")
    public Data data;
    @JsonProperty("eventCreatedAt")
    private String eventCreatedAt;
  

	@JsonProperty("eventType")
    public String getEventType() {
        return eventType;
    }

    @JsonProperty("eventType")
    public void setEventType(String eventType) {
        this.eventType = eventType;
    }

    @JsonProperty("key")
    public String getKey() {
        return key;
    }

    @JsonProperty("key")
    public void setKey(String key) {
        this.key = key;
    }

    @JsonProperty("data")
    public Data getData() {
        return data;
    }

    @JsonProperty("data")
    public void setData(Data data) {
        this.data = data;
    }

    @JsonProperty("eventCreatedAt")
    public String getEventCreatedAt() {
        return eventCreatedAt;
    }

    @JsonProperty("eventCreatedAt")
    public void setEventCreatedAt(String eventCreatedAt) {
        this.eventCreatedAt = eventCreatedAt;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("eventType", eventType).append("key", key).append("data", data).append("eventCreatedAt", eventCreatedAt).toString();
    }

}
