package GetCompliancePOJO;

import java.util.List;

public class GetComplianceObject
{
    private String messageReference;

    private String compliancePort;

    private List<BillOfLadings> billOfLadings;

    private String updatedDate;

    private String receiversReferenceDate;

    private String complianceType;

    private String lastSubmittedDate;

    private String complianceName;

    private String createdDate;

    private String complianceId;

    private String receiversReferenceNumber;

    private String brand;

    private String status;

    public String getMessageReference ()
    {
        return messageReference;
    }

    public void setMessageReference (String messageReference)
    {
        this.messageReference = messageReference;
    }

    public String getCompliancePort ()
    {
        return compliancePort;
    }

    public void setCompliancePort (String compliancePort)
    {
        this.compliancePort = compliancePort;
    }

    public List<BillOfLadings> getBillOfLadings ()
    {
        return billOfLadings;
    }

    public void setBillOfLadings (List<BillOfLadings> billOfLadings)
    {
        this.billOfLadings = billOfLadings;
    }

    public String getUpdatedDate ()
    {
        return updatedDate;
    }

    public void setUpdatedDate (String updatedDate)
    {
        this.updatedDate = updatedDate;
    }

    public String getReceiversReferenceDate ()
    {
        return receiversReferenceDate;
    }

    public void setReceiversReferenceDate (String receiversReferenceDate)
    {
        this.receiversReferenceDate = receiversReferenceDate;
    }

    public String getComplianceType ()
    {
        return complianceType;
    }

    public void setComplianceType (String complianceType)
    {
        this.complianceType = complianceType;
    }

    public String getLastSubmittedDate ()
    {
        return lastSubmittedDate;
    }

    public void setLastSubmittedDate (String lastSubmittedDate)
    {
        this.lastSubmittedDate = lastSubmittedDate;
    }

    public String getComplianceName ()
    {
        return complianceName;
    }

    public void setComplianceName (String complianceName)
    {
        this.complianceName = complianceName;
    }

    public String getCreatedDate ()
    {
        return createdDate;
    }

    public void setCreatedDate (String createdDate)
    {
        this.createdDate = createdDate;
    }

    public String getComplianceId ()
    {
        return complianceId;
    }

    public void setComplianceId (String complianceId)
    {
        this.complianceId = complianceId;
    }

    public String getReceiversReferenceNumber ()
    {
        return receiversReferenceNumber;
    }

    public void setReceiversReferenceNumber (String receiversReferenceNumber)
    {
        this.receiversReferenceNumber = receiversReferenceNumber;
    }

    public String getBrand ()
    {
        return brand;
    }

    public void setBrand (String brand)
    {
        this.brand = brand;
    }

    public String getStatus ()
    {
        return status;
    }

    public void setStatus (String status)
    {
        this.status = status;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [messageReference = "+messageReference+", compliancePort = "+compliancePort+", billOfLadings = "+billOfLadings+", updatedDate = "+updatedDate+", receiversReferenceDate = "+receiversReferenceDate+", complianceType = "+complianceType+", lastSubmittedDate = "+lastSubmittedDate+", complianceName = "+complianceName+", createdDate = "+createdDate+", complianceId = "+complianceId+", receiversReferenceNumber = "+receiversReferenceNumber+", brand = "+brand+", status = "+status+"]";
    }
}
			
			