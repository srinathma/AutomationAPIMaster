package com.getCountryData;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Country
{
	@JsonProperty("Vessel")
    private String Vessel;

	@JsonProperty("EndPointGeoCode")
    private String EndPointGeoCode;

	@JsonProperty("StartPoint")
    private String StartPoint;

	@JsonProperty("EndPoint")
    private String EndPoint;

	@JsonProperty("StartPointGeoCode")
    private String StartPointGeoCode;

	@JsonProperty("inboundVoyageNumber")
    private String inboundVoyageNumber;

	@JsonProperty("outboundVoyageNumber")
    private String outboundVoyageNumber;
	
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

	public String getVessel ()
    {
        return Vessel;
    }

    public void setVessel (String Vessel)
    {
        this.Vessel = Vessel;
    }

    public String getEndPointGeoCode ()
    {
        return EndPointGeoCode;
    }

    public void setEndPointGeoCode (String EndPointGeoCode)
    {
        this.EndPointGeoCode = EndPointGeoCode;
    }

    public String getStartPoint ()
    {
        return StartPoint;
    }

    public void setStartPoint (String StartPoint)
    {
        this.StartPoint = StartPoint;
    }

    public String getEndPoint ()
    {
        return EndPoint;
    }

    public void setEndPoint (String EndPoint)
    {
        this.EndPoint = EndPoint;
    }

    public String getStartPointGeoCode ()
    {
        return StartPointGeoCode;
    }

   

	public void setStartPointGeoCode (String StartPointGeoCode)
    {
        this.StartPointGeoCode = StartPointGeoCode;
    }

   
       @Override
    public String toString()
    {
        return "ClassPojo [Vessel = "+Vessel+", EndPointGeoCode = "+EndPointGeoCode+", StartPoint = "+StartPoint+", EndPoint = "+EndPoint+", StartPointGeoCode = "+StartPointGeoCode+", voyage = "+outboundVoyageNumber+"]";
    }
}
