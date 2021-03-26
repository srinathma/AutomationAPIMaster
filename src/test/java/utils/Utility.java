package utils;

import java.util.ArrayList;
import java.util.Arrays;

public class Utility {
	
	public String getRootElement(String parameter)
	{
		ArrayList<String> Cargos = new ArrayList<String>(
			    Arrays.asList("hsCode", "commodityCode", "commodityDescription"));
		
		ArrayList<String> CargoDesc = new ArrayList<String>(
			    Arrays.asList("cargoDesc", "cargoDescText"));
		
		if(Cargos.contains(parameter))
			return "Cargo";
		else if(CargoDesc.contains(parameter))
			return "CargoDesc";
		else
			return "NA";
		
	}

}
