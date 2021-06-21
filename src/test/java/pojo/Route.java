
package pojo;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.apache.commons.lang.builder.ToStringBuilder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "instanceId",
    "routeLinks"
})
public class Route {

    @JsonProperty("instanceId")
    private String instanceId;
    @JsonProperty("routeLinks")
    private List<RouteLink> routeLinks = null;

    @JsonProperty("instanceId")
    public String getInstanceId() {
        return instanceId;
    }

    @JsonProperty("instanceId")
    public void setInstanceId(String instanceId) {
        this.instanceId = instanceId;
    }

    @JsonProperty("routeLinks")
    public List<RouteLink> getRouteLinks() {
        return routeLinks;
    }

    @JsonProperty("routeLinks")
    public void setRouteLinks(List<RouteLink> routeLinks) {
        this.routeLinks = routeLinks;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("instanceId", instanceId).append("routeLinks", routeLinks).toString();
    }

}
