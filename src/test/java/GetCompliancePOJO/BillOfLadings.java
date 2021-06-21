package GetCompliancePOJO;

public class BillOfLadings
{
    private String receiverReferenceDate;

    private String sequenceNumber;

    private String icNumber;

    private String dqeErrors;

    private String moveType;

    private String dischargePort;

    private String lastSubmittedDate;

    private String customResponse;

    private String responseType;

    private String receiverReference;

    private String stage;

    private String loadPort;

    private String ediTransmissionId;

    private String bolNumber;

    private String consignments;

    private String status;

    private String errorDetails;

    public String getReceiverReferenceDate ()
    {
        return receiverReferenceDate;
    }

    public void setReceiverReferenceDate (String receiverReferenceDate)
    {
        this.receiverReferenceDate = receiverReferenceDate;
    }

    public String getSequenceNumber ()
    {
        return sequenceNumber;
    }

    public void setSequenceNumber (String sequenceNumber)
    {
        this.sequenceNumber = sequenceNumber;
    }

    public String getIcNumber ()
    {
        return icNumber;
    }

    public void setIcNumber (String icNumber)
    {
        this.icNumber = icNumber;
    }

    public String getDqeErrors ()
    {
        return dqeErrors;
    }

    public void setDqeErrors (String dqeErrors)
    {
        this.dqeErrors = dqeErrors;
    }

    public String getMoveType ()
    {
        return moveType;
    }

    public void setMoveType (String moveType)
    {
        this.moveType = moveType;
    }

    public String getDischargePort ()
    {
        return dischargePort;
    }

    public void setDischargePort (String dischargePort)
    {
        this.dischargePort = dischargePort;
    }

    public String getLastSubmittedDate ()
    {
        return lastSubmittedDate;
    }

    public void setLastSubmittedDate (String lastSubmittedDate)
    {
        this.lastSubmittedDate = lastSubmittedDate;
    }

    public String getCustomResponse ()
    {
        return customResponse;
    }

    public void setCustomResponse (String customResponse)
    {
        this.customResponse = customResponse;
    }

    public String getResponseType ()
    {
        return responseType;
    }

    public void setResponseType (String responseType)
    {
        this.responseType = responseType;
    }

    public String getReceiverReference ()
    {
        return receiverReference;
    }

    public void setReceiverReference (String receiverReference)
    {
        this.receiverReference = receiverReference;
    }

    public String getStage ()
    {
        return stage;
    }

    public void setStage (String stage)
    {
        this.stage = stage;
    }

    public String getLoadPort ()
    {
        return loadPort;
    }

    public void setLoadPort (String loadPort)
    {
        this.loadPort = loadPort;
    }

    public String getEdiTransmissionId ()
    {
        return ediTransmissionId;
    }

    public void setEdiTransmissionId (String ediTransmissionId)
    {
        this.ediTransmissionId = ediTransmissionId;
    }

    public String getBolNumber ()
    {
        return bolNumber;
    }

    public void setBolNumber (String bolNumber)
    {
        this.bolNumber = bolNumber;
    }

    public String getConsignments ()
    {
        return consignments;
    }

    public void setConsignments (String consignments)
    {
        this.consignments = consignments;
    }

    public String getStatus ()
    {
        return status;
    }

    public void setStatus (String status)
    {
        this.status = status;
    }

    public String getErrorDetails ()
    {
        return errorDetails;
    }

    public void setErrorDetails (String errorDetails)
    {
        this.errorDetails = errorDetails;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [receiverReferenceDate = "+receiverReferenceDate+", sequenceNumber = "+sequenceNumber+", icNumber = "+icNumber+", dqeErrors = "+dqeErrors+", moveType = "+moveType+", dischargePort = "+dischargePort+", lastSubmittedDate = "+lastSubmittedDate+", customResponse = "+customResponse+", responseType = "+responseType+", receiverReference = "+receiverReference+", stage = "+stage+", loadPort = "+loadPort+", ediTransmissionId = "+ediTransmissionId+", bolNumber = "+bolNumber+", consignments = "+consignments+", status = "+status+", errorDetails = "+errorDetails+"]";
    }
}
			
			
