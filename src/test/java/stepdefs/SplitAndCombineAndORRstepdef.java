package stepdefs;

import cucumber.api.java.en.When;
import gcd.splitAndMerge.SplitAndMerge;

public class SplitAndCombineAndORRstepdef {
	SplitAndMerge splitAndMerge=new SplitAndMerge();

	@When("^user create a BOL for ORR with \"([^\"]*)\" and \"([^\"]*)\" for \"([^\"]*)\"$")
	public void user_create_a_BOL_for_ORR_with_and_for(String Event, String GdsPath, String type) throws Throwable {
		splitAndMerge.createAndInsertdata(Event, GdsPath, type);
	   
	}
	
	
}
