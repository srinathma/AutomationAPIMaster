
package com.billoflading;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.apache.commons.lang.builder.ToStringBuilder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "transportMode",
    "movementType",
    "vesselCode",
    "vesselIMO",
    "routeLinkSequence",
    "importVoyage",
    "exportVoyage",
    "serviceCode",
    "waterLandMode",
    "isOutOfContractScope",
    "routeStartPoint",
    "routeEndPoint",
    "isTerminalMismatch",
    "terminalMismatchErrorDesc",
    "compliances"
})
public class RouteLink {

    @JsonProperty("transportMode")
    private String transportMode;
    @JsonProperty("movementType")
    private String movementType;
    @JsonProperty("vesselCode")
    private String vesselCode;
    @JsonProperty("vesselIMO")
    private Object vesselIMO;
    @JsonProperty("routeLinkSequence")
    private Long routeLinkSequence;
    @JsonProperty("importVoyage")
    private String importVoyage;
    @JsonProperty("exportVoyage")
    private String exportVoyage;
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
    @JsonProperty("isTerminalMismatch")
    private Boolean isTerminalMismatch;
    @JsonProperty("terminalMismatchErrorDesc")
    private String terminalMismatchErrorDesc;
    @JsonProperty("compliances")
    private List<String> compliances = null;

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

    @JsonProperty("routeLinkSequence")
    public Long getRouteLinkSequence() {
        return routeLinkSequence;
    }

    @JsonProperty("routeLinkSequence")
    public void setRouteLinkSequence(Long routeLinkSequence) {
        this.routeLinkSequence = routeLinkSequence;
    }

    @JsonProperty("importVoyage")
    public String getImportVoyage() {
        return importVoyage;
    }

    @JsonProperty("importVoyage")
    public void setImportVoyage(String importVoyage) {
        this.importVoyage = importVoyage;
    }

    @JsonProperty("exportVoyage")
    public String getExportVoyage() {
        return exportVoyage;
    }

    @JsonProperty("exportVoyage")
    public void setExportVoyage(String exportVoyage) {
        this.exportVoyage = exportVoyage;
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

    @JsonProperty("isTerminalMismatch")
    public Boolean getIsTerminalMismatch() {
        return isTerminalMismatch;
    }

    @JsonProperty("isTerminalMismatch")
    public void setIsTerminalMismatch(Boolean isTerminalMismatch) {
        this.isTerminalMismatch = isTerminalMismatch;
    }

    @JsonProperty("terminalMismatchErrorDesc")
    public String getTerminalMismatchErrorDesc() {
        return terminalMismatchErrorDesc;
    }

    @JsonProperty("terminalMismatchErrorDesc")
    public void setTerminalMismatchErrorDesc(String terminalMismatchErrorDesc) {
        this.terminalMismatchErrorDesc = terminalMismatchErrorDesc;
    }

    @JsonProperty("compliances")
    public List<String> getCompliances() {
        return compliances;
    }

    @JsonProperty("compliances")
    public void setCompliances(List<String> compliances) {
        this.compliances = compliances;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("transportMode", transportMode).append("movementType", movementType).append("vesselCode", vesselCode).append("vesselIMO", vesselIMO).append("routeLinkSequence", routeLinkSequence).append("importVoyage", importVoyage).append("exportVoyage", exportVoyage).append("serviceCode", serviceCode).append("waterLandMode", waterLandMode).append("isOutOfContractScope", isOutOfContractScope).append("routeStartPoint", routeStartPoint).append("routeEndPoint", routeEndPoint).append("isTerminalMismatch", isTerminalMismatch).append("terminalMismatchErrorDesc", terminalMismatchErrorDesc).append("compliances", compliances).toString();
    }

}
