
package pojo;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.apache.commons.lang.builder.ToStringBuilder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "transportMode",
    "movementType",
    "routeLinkSequence",
    "vesselCode",
    "vesselIMO",
    "inboundVoyageNumber",
    "outboundVoyageNumber",
    "serviceCode",
    "waterLandMode",
    "isOutOfContractScope",
    "routeStartPoint",
    "routeEndPoint",
    "compliances"
})
public class RouteLink {

    @JsonProperty("transportMode")
    private String transportMode;
    @JsonProperty("movementType")
    private String movementType;
    @JsonProperty("routeLinkSequence")
    private Integer routeLinkSequence;
    @JsonProperty("vesselCode")
    private String vesselCode;
    @JsonProperty("vesselIMO")
    private Object vesselIMO;
    @JsonProperty("inboundVoyageNumber")
    private String inboundVoyageNumber;
    @JsonProperty("outboundVoyageNumber")
    private String outboundVoyageNumber;
    @JsonProperty("serviceCode")
    private String serviceCode;
    @JsonProperty("waterLandMode")
    private String waterLandMode;
    @JsonProperty("isOutOfContractScope")
    private Boolean isOutOfContractScope;
    @JsonProperty("routeStartPoint")
    private RouteStartPoint routeStartPoint;
    @JsonProperty("routeEndPoint")
    private RouteEndPoint routeEndPoint;
    @JsonProperty("compliances")
    private Object compliances;

    @JsonProperty("transportMode")
    public String getTransportMode() {
        return transportMode;
    }

    @JsonProperty("transportMode")
    public void setTransportMode(String transportMode) {
        this.transportMode = transportMode;
    }

    @JsonProperty("movementType")
    public String getMovementType() {
        return movementType;
    }

    @JsonProperty("movementType")
    public void setMovementType(String movementType) {
        this.movementType = movementType;
    }

    @JsonProperty("routeLinkSequence")
    public Integer getRouteLinkSequence() {
        return routeLinkSequence;
    }

    @JsonProperty("routeLinkSequence")
    public void setRouteLinkSequence(Integer routeLinkSequence) {
        this.routeLinkSequence = routeLinkSequence;
    }

    @JsonProperty("vesselCode")
    public String getVesselCode() {
        return vesselCode;
    }

    @JsonProperty("vesselCode")
    public void setVesselCode(String vesselCode) {
        this.vesselCode = vesselCode;
    }

    @JsonProperty("vesselIMO")
    public Object getVesselIMO() {
        return vesselIMO;
    }

    @JsonProperty("vesselIMO")
    public void setVesselIMO(Object vesselIMO) {
        this.vesselIMO = vesselIMO;
    }

   

    @JsonProperty("serviceCode")
    public String getServiceCode() {
        return serviceCode;
    }

    @JsonProperty("serviceCode")
    public void setServiceCode(String serviceCode) {
        this.serviceCode = serviceCode;
    }

    @JsonProperty("waterLandMode")
    public String getWaterLandMode() {
        return waterLandMode;
    }

    @JsonProperty("waterLandMode")
    public void setWaterLandMode(String waterLandMode) {
        this.waterLandMode = waterLandMode;
    }

    @JsonProperty("isOutOfContractScope")
    public Boolean getIsOutOfContractScope() {
        return isOutOfContractScope;
    }

    @JsonProperty("isOutOfContractScope")
    public void setIsOutOfContractScope(Boolean isOutOfContractScope) {
        this.isOutOfContractScope = isOutOfContractScope;
    }

    @JsonProperty("routeStartPoint")
    public RouteStartPoint getRouteStartPoint() {
        return routeStartPoint;
    }

    @JsonProperty("routeStartPoint")
    public void setRouteStartPoint(RouteStartPoint routeStartPoint) {
        this.routeStartPoint = routeStartPoint;
    }

    @JsonProperty("routeEndPoint")
    public RouteEndPoint getRouteEndPoint() {
        return routeEndPoint;
    }

    @JsonProperty("routeEndPoint")
    public void setRouteEndPoint(RouteEndPoint routeEndPoint) {
        this.routeEndPoint = routeEndPoint;
    }

    @JsonProperty("compliances")
    public Object getCompliances() {
        return compliances;
    }

    @JsonProperty("compliances")
    public void setCompliances(Object compliances) {
        this.compliances = compliances;
    }

	public String getInboundVoyageNumber() {
		return inboundVoyageNumber;
	}

	public void setInboundVoyageNumber(String inboundVoyageNumber) {
		this.inboundVoyageNumber = inboundVoyageNumber;
	}

	public String getOutboundVoyageNumber() {
		return outboundVoyageNumber;
	}

	public void setOutboundVoyageNumber(String outboundVoyageNumber) {
		this.outboundVoyageNumber = outboundVoyageNumber;
	}

   
}
