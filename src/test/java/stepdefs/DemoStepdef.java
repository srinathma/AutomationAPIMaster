package stepdefs;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class DemoStepdef {
	
	@When("^we try to learn cucumber stepdef$")
	public void we_try_to_learn_cucumber_stepdef() throws Throwable {
	   System.out.println("we got the mapping right");
	}

	@Then("^we create stepdefenitions using \"([^\"]*)\"$")
	public void we_create_stepdefenitions_using(String lang) throws Throwable {
		System.out.println("language is "+lang);
	}

}
