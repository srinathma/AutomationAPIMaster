package stepdefs;

import apiTest.UserTest;
import cucumber.api.java.en.When;

public class AmdStepDef {
	

@When("^user amends booking information for \"([^\"]*)\" with \"([^\"]*)\" having \"([^\"]*)\" with \"([^\"]*)\" for \"([^\"]*)\"$")
public void user_amends_booking_information_for_with_having_with_for(String event, String param, String pramvalue, String dqeApplicable, String bookingType) throws Throwable {

UserTest userTest =new UserTest();
userTest.insertDatainDB(event,param,pramvalue,dqeApplicable,bookingType);
}

}
