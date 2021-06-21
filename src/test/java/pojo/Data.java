
package pojo;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.apache.commons.lang.builder.ToStringBuilder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "bolNumber",
    "bolInstanceId",
    "isIVCReceived",
    "operatorCode",
    "isHitchment",
    "isHouse",
    "houseBills",
    "isDelete",
    "isSplit",
    "isCompleted",
    "archiveInd",
    "isCancel",
    "isImportShipmentBOL",
    "originalBOLNumberForSplit",
    "loadPortRouteSequence",
    "isTransportDocLevelPrinting",
    "scacCode",
    "updateStructTime",
    "createdDate",
    "createdBy",
    "lastModifiedDate",
    "modifiedBy",
    "placeOfReceipt",
    "placeOfDelivery",
    "cargoOrigin",
    "cargoOriginTranslated",
    "cargoDestination",
    "cargoDestinationTranslated",
    "printedPlaceOfReceipt",
    "printedPlaceOfDelivery",
    "printedLoadPortValues",
    "printedDischargePortValue",
    "placeOfIssue",
    "dateOfIssue",
    "shippedOnBoardDate",
    "billType",
    "shipments",
    "equipments",
    "cargos"
})
public class Data {

    @JsonProperty("bolNumber")
    private String bolNumber;
    @JsonProperty("bolInstanceId")
    private String bolInstanceId;
    @JsonProperty("isIVCReceived")
    private Boolean isIVCReceived;
    @JsonProperty("operatorCode")
    private String operatorCode;
    @JsonProperty("isHitchment")
    private Boolean isHitchment;
    @JsonProperty("isHouse")
    private Boolean isHouse;
    @JsonProperty("isHouseMaster")
    private Boolean isHouseMaster;
    @JsonProperty("billTypeCode")
    private String billTypeCode;
    @JsonProperty("references")
    private String references;
    
    
    public String getReferences() {
		return references;
	}

	public void setReferences(String references) {
		this.references = references;
	}

	public String getBillTypeCode() {
		return billTypeCode;
	}

	public void setBillTypeCode(String billTypeCode) {
		this.billTypeCode = billTypeCode;
	}

	public Boolean getIsHouseMaster() {
		return isHouseMaster;
	}

	public void setIsHouseMaster(Boolean isHouseMaster) {
		this.isHouseMaster = isHouseMaster;
	}

	@JsonProperty("houseBills")
    private List<Object> houseBills = null;
    @JsonProperty("isDelete")
    private Object isDelete;
    @JsonProperty("isSplit")
    private Object isSplit;
    @JsonProperty("isCompleted")
    private Object isCompleted;
    @JsonProperty("archiveInd")
    private Object archiveInd;
    @JsonProperty("isCancel")
    private Object isCancel;
    @JsonProperty("isImportShipmentBOL")
    private Boolean isImportShipmentBOL;
    @JsonProperty("originalBOLNumberForSplit")
    private Object originalBOLNumberForSplit;
    @JsonProperty("loadPortRouteSequence")
    private Integer loadPortRouteSequence;
    @JsonProperty("isTransportDocLevelPrinting")
    private Boolean isTransportDocLevelPrinting;
    @JsonProperty("scacCode")
    private String scacCode;
    @JsonProperty("updateStructTime")
    private String updateStructTime;
    @JsonProperty("createdDate")
    private Object createdDate;
    @JsonProperty("createdBy")
    private Object createdBy;
    @JsonProperty("lastModifiedDate")
    private Object lastModifiedDate;
    @JsonProperty("modifiedBy")
    private Object modifiedBy;
    @JsonProperty("placeOfReceipt")
    private String placeOfReceipt;
    @JsonProperty("placeOfDelivery")
    private String placeOfDelivery;
    @JsonProperty("cargoOrigin")
    private Object cargoOrigin;
    @JsonProperty("cargoOriginTranslated")
    private Object cargoOriginTranslated;
    @JsonProperty("cargoDestination")
    private Object cargoDestination;
    @JsonProperty("cargoDestinationTranslated")
    private Object cargoDestinationTranslated;
    @JsonProperty("printedPlaceOfReceipt")
    private Object printedPlaceOfReceipt;
    @JsonProperty("printedPlaceOfDelivery")
    private Object printedPlaceOfDelivery;
    @JsonProperty("printedLoadPortValues")
    private Object printedLoadPortValues;
    @JsonProperty("printedDischargePortValue")
    private Object printedDischargePortValue;
    @JsonProperty("placeOfIssue")
    private Object placeOfIssue;
    @JsonProperty("dateOfIssue")
    private Object dateOfIssue;
    @JsonProperty("shippedOnBoardDate")
    private Object shippedOnBoardDate;
    @JsonProperty("billType")
    private String billType;
    @JsonProperty("shipments")
    private List<Shipment> shipments = null;
    @JsonProperty("equipments")
    private List<Equipment> equipments = null;
    @JsonProperty("cargos")
    public List<Cargo> cargos = null;

    @JsonProperty("bolNumber")
    public String getBolNumber() {
        return bolNumber;
    }

    @JsonProperty("bolNumber")
    public void setBolNumber(String bolNumber) {
        this.bolNumber = bolNumber;
    }

    @JsonProperty("bolInstanceId")
    public String getBolInstanceId() {
        return bolInstanceId;
    }

    @JsonProperty("bolInstanceId")
    public void setBolInstanceId(String bolInstanceId) {
        this.bolInstanceId = bolInstanceId;
    }

    @JsonProperty("isIVCReceived")
    public Boolean getIsIVCReceived() {
        return isIVCReceived;
    }

    @JsonProperty("isIVCReceived")
    public void setIsIVCReceived(Boolean isIVCReceived) {
        this.isIVCReceived = isIVCReceived;
    }

    @JsonProperty("operatorCode")
    public String getOperatorCode() {
        return operatorCode;
    }

    @JsonProperty("operatorCode")
    public void setOperatorCode(String operatorCode) {
        this.operatorCode = operatorCode;
    }

    @JsonProperty("isHitchment")
    public Boolean getIsHitchment() {
        return isHitchment;
    }

    @JsonProperty("isHitchment")
    public void setIsHitchment(Boolean isHitchment) {
        this.isHitchment = isHitchment;
    }

    @JsonProperty("isHouse")
    public Boolean getIsHouse() {
        return isHouse;
    }

    @JsonProperty("isHouse")
    public void setIsHouse(Boolean isHouse) {
        this.isHouse = isHouse;
    }

    @JsonProperty("houseBills")
    public List<Object> getHouseBills() {
        return houseBills;
    }

    @JsonProperty("houseBills")
    public void setHouseBills(List<Object> houseBills) {
        this.houseBills = houseBills;
    }

    @JsonProperty("isDelete")
    public Object getIsDelete() {
        return isDelete;
    }

    @JsonProperty("isDelete")
    public void setIsDelete(Object isDelete) {
        this.isDelete = isDelete;
    }

    @JsonProperty("isSplit")
    public Object getIsSplit() {
        return isSplit;
    }

    @JsonProperty("isSplit")
    public void setIsSplit(Object isSplit) {
        this.isSplit = isSplit;
    }

    @JsonProperty("isCompleted")
    public Object getIsCompleted() {
        return isCompleted;
    }

    @JsonProperty("isCompleted")
    public void setIsCompleted(Object isCompleted) {
        this.isCompleted = isCompleted;
    }

    @JsonProperty("archiveInd")
    public Object getArchiveInd() {
        return archiveInd;
    }

    @JsonProperty("archiveInd")
    public void setArchiveInd(Object archiveInd) {
        this.archiveInd = archiveInd;
    }

    @JsonProperty("isCancel")
    public Object getIsCancel() {
        return isCancel;
    }

    @JsonProperty("isCancel")
    public void setIsCancel(Object isCancel) {
        this.isCancel = isCancel;
    }

    @JsonProperty("isImportShipmentBOL")
    public Boolean getIsImportShipmentBOL() {
        return isImportShipmentBOL;
    }

    @JsonProperty("isImportShipmentBOL")
    public void setIsImportShipmentBOL(Boolean isImportShipmentBOL) {
        this.isImportShipmentBOL = isImportShipmentBOL;
    }

    @JsonProperty("originalBOLNumberForSplit")
    public Object getOriginalBOLNumberForSplit() {
        return originalBOLNumberForSplit;
    }

    @JsonProperty("originalBOLNumberForSplit")
    public void setOriginalBOLNumberForSplit(Object originalBOLNumberForSplit) {
        this.originalBOLNumberForSplit = originalBOLNumberForSplit;
    }

    @JsonProperty("loadPortRouteSequence")
    public Integer getLoadPortRouteSequence() {
        return loadPortRouteSequence;
    }

    @JsonProperty("loadPortRouteSequence")
    public void setLoadPortRouteSequence(Integer loadPortRouteSequence) {
        this.loadPortRouteSequence = loadPortRouteSequence;
    }

    @JsonProperty("isTransportDocLevelPrinting")
    public Boolean getIsTransportDocLevelPrinting() {
        return isTransportDocLevelPrinting;
    }

    @JsonProperty("isTransportDocLevelPrinting")
    public void setIsTransportDocLevelPrinting(Boolean isTransportDocLevelPrinting) {
        this.isTransportDocLevelPrinting = isTransportDocLevelPrinting;
    }

    @JsonProperty("scacCode")
    public String getScacCode() {
        return scacCode;
    }

    @JsonProperty("scacCode")
    public void setScacCode(String scacCode) {
        this.scacCode = scacCode;
    }

    @JsonProperty("updateStructTime")
    public String getUpdateStructTime() {
        return updateStructTime;
    }

    @JsonProperty("updateStructTime")
    public void setUpdateStructTime(String updateStructTime) {
        this.updateStructTime = updateStructTime;
    }

    @JsonProperty("createdDate")
    public Object getCreatedDate() {
        return createdDate;
    }

    @JsonProperty("createdDate")
    public void setCreatedDate(Object createdDate) {
        this.createdDate = createdDate;
    }

    @JsonProperty("createdBy")
    public Object getCreatedBy() {
        return createdBy;
    }

    @JsonProperty("createdBy")
    public void setCreatedBy(Object createdBy) {
        this.createdBy = createdBy;
    }

    @JsonProperty("lastModifiedDate")
    public Object getLastModifiedDate() {
        return lastModifiedDate;
    }

    @JsonProperty("lastModifiedDate")
    public void setLastModifiedDate(Object lastModifiedDate) {
        this.lastModifiedDate = lastModifiedDate;
    }

    @JsonProperty("modifiedBy")
    public Object getModifiedBy() {
        return modifiedBy;
    }

    @JsonProperty("modifiedBy")
    public void setModifiedBy(Object modifiedBy) {
        this.modifiedBy = modifiedBy;
    }

    @JsonProperty("placeOfReceipt")
    public String getPlaceOfReceipt() {
        return placeOfReceipt;
    }

    @JsonProperty("placeOfReceipt")
    public void setPlaceOfReceipt(String placeOfReceipt) {
        this.placeOfReceipt = placeOfReceipt;
    }

    @JsonProperty("placeOfDelivery")
    public String getPlaceOfDelivery() {
        return placeOfDelivery;
    }

    @JsonProperty("placeOfDelivery")
    public void setPlaceOfDelivery(String placeOfDelivery) {
        this.placeOfDelivery = placeOfDelivery;
    }

    @JsonProperty("cargoOrigin")
    public Object getCargoOrigin() {
        return cargoOrigin;
    }

    @JsonProperty("cargoOrigin")
    public void setCargoOrigin(Object cargoOrigin) {
        this.cargoOrigin = cargoOrigin;
    }

    @JsonProperty("cargoOriginTranslated")
    public Object getCargoOriginTranslated() {
        return cargoOriginTranslated;
    }

    @JsonProperty("cargoOriginTranslated")
    public void setCargoOriginTranslated(Object cargoOriginTranslated) {
        this.cargoOriginTranslated = cargoOriginTranslated;
    }

    @JsonProperty("cargoDestination")
    public Object getCargoDestination() {
        return cargoDestination;
    }

    @JsonProperty("cargoDestination")
    public void setCargoDestination(Object cargoDestination) {
        this.cargoDestination = cargoDestination;
    }

    @JsonProperty("cargoDestinationTranslated")
    public Object getCargoDestinationTranslated() {
        return cargoDestinationTranslated;
    }

    @JsonProperty("cargoDestinationTranslated")
    public void setCargoDestinationTranslated(Object cargoDestinationTranslated) {
        this.cargoDestinationTranslated = cargoDestinationTranslated;
    }

    @JsonProperty("printedPlaceOfReceipt")
    public Object getPrintedPlaceOfReceipt() {
        return printedPlaceOfReceipt;
    }

    @JsonProperty("printedPlaceOfReceipt")
    public void setPrintedPlaceOfReceipt(Object printedPlaceOfReceipt) {
        this.printedPlaceOfReceipt = printedPlaceOfReceipt;
    }

    @JsonProperty("printedPlaceOfDelivery")
    public Object getPrintedPlaceOfDelivery() {
        return printedPlaceOfDelivery;
    }

    @JsonProperty("printedPlaceOfDelivery")
    public void setPrintedPlaceOfDelivery(Object printedPlaceOfDelivery) {
        this.printedPlaceOfDelivery = printedPlaceOfDelivery;
    }

    @JsonProperty("printedLoadPortValues")
    public Object getPrintedLoadPortValues() {
        return printedLoadPortValues;
    }

    @JsonProperty("printedLoadPortValues")
    public void setPrintedLoadPortValues(Object printedLoadPortValues) {
        this.printedLoadPortValues = printedLoadPortValues;
    }

    @JsonProperty("printedDischargePortValue")
    public Object getPrintedDischargePortValue() {
        return printedDischargePortValue;
    }

    @JsonProperty("printedDischargePortValue")
    public void setPrintedDischargePortValue(Object printedDischargePortValue) {
        this.printedDischargePortValue = printedDischargePortValue;
    }

    @JsonProperty("placeOfIssue")
    public Object getPlaceOfIssue() {
        return placeOfIssue;
    }

    @JsonProperty("placeOfIssue")
    public void setPlaceOfIssue(Object placeOfIssue) {
        this.placeOfIssue = placeOfIssue;
    }

    @JsonProperty("dateOfIssue")
    public Object getDateOfIssue() {
        return dateOfIssue;
    }

    @JsonProperty("dateOfIssue")
    public void setDateOfIssue(Object dateOfIssue) {
        this.dateOfIssue = dateOfIssue;
    }

    @JsonProperty("shippedOnBoardDate")
    public Object getShippedOnBoardDate() {
        return shippedOnBoardDate;
    }

    @JsonProperty("shippedOnBoardDate")
    public void setShippedOnBoardDate(Object shippedOnBoardDate) {
        this.shippedOnBoardDate = shippedOnBoardDate;
    }

    @JsonProperty("billType")
    public String getBillType() {
        return billType;
    }

    @JsonProperty("billType")
    public void setBillType(String billType) {
        this.billType = billType;
    }

    @JsonProperty("shipments")
    public List<Shipment> getShipments() {
        return shipments;
    }

    @JsonProperty("shipments")
    public void setShipments(List<Shipment> shipments) {
        this.shipments = shipments;
    }

    @JsonProperty("equipments")
    public List<Equipment> getEquipments() {
        return equipments;
    }

    @JsonProperty("equipments")
    public void setEquipments(List<Equipment> equipments) {
        this.equipments = equipments;
    }

    @JsonProperty("cargos")
    public List<Cargo> getCargos() {
        return cargos;
    }

    @JsonProperty("cargos")
    public void setCargos(List<Cargo> cargos) {
        this.cargos = cargos;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("bolNumber", bolNumber).append("bolInstanceId", bolInstanceId).append("isIVCReceived", isIVCReceived).append("operatorCode", operatorCode).append("isHitchment", isHitchment).append("isHouse", isHouse).append("houseBills", houseBills).append("isDelete", isDelete).append("isSplit", isSplit).append("isCompleted", isCompleted).append("archiveInd", archiveInd).append("isCancel", isCancel).append("isImportShipmentBOL", isImportShipmentBOL).append("originalBOLNumberForSplit", originalBOLNumberForSplit).append("loadPortRouteSequence", loadPortRouteSequence).append("isTransportDocLevelPrinting", isTransportDocLevelPrinting).append("scacCode", scacCode).append("updateStructTime", updateStructTime).append("createdDate", createdDate).append("createdBy", createdBy).append("lastModifiedDate", lastModifiedDate).append("modifiedBy", modifiedBy).append("placeOfReceipt", placeOfReceipt).append("placeOfDelivery", placeOfDelivery).append("cargoOrigin", cargoOrigin).append("cargoOriginTranslated", cargoOriginTranslated).append("cargoDestination", cargoDestination).append("cargoDestinationTranslated", cargoDestinationTranslated).append("printedPlaceOfReceipt", printedPlaceOfReceipt).append("printedPlaceOfDelivery", printedPlaceOfDelivery).append("printedLoadPortValues", printedLoadPortValues).append("printedDischargePortValue", printedDischargePortValue).append("placeOfIssue", placeOfIssue).append("dateOfIssue", dateOfIssue).append("shippedOnBoardDate", shippedOnBoardDate).append("billType", billType).append("shipments", shipments).append("equipments", equipments).append("cargos", cargos).toString();
    }

}
