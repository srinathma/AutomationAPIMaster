package getDQEcallUsingComplianceId;

public class DQEErrors
{
    private String dqeType;

    private String createdDateTime;

    private String[] comment;

    public String getDqeType ()
    {
        return dqeType;
    }

    public void setDqeType (String dqeType)
    {
        this.dqeType = dqeType;
    }

    public String getCreatedDateTime ()
    {
        return createdDateTime;
    }

    public void setCreatedDateTime (String createdDateTime)
    {
        this.createdDateTime = createdDateTime;
    }

    public String[] getComment ()
    {
        return comment;
    }

    public void setComment (String[] comment)
    {
        this.comment = comment;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [dqeType = "+dqeType+", createdDateTime = "+createdDateTime+", comment = "+comment+"]";
    }
}
			