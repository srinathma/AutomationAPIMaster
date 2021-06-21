package com.getCountryData;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

public class CountryDataPojo

{
	
	  @JsonProperty("Country")
	    private List<Country> Country = null;
	  
	  
   

    public List<com.getCountryData.Country> getCountry ()
    {
        return Country;
    }

    public void setCountry (List<com.getCountryData.Country> Country)
    {
        this.Country = Country;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [Country = "+Country+"]";
    }
}
