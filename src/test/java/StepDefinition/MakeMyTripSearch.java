package StepDefinition;

import java.io.IOException;

import org.testng.Assert;


import BrowserDriver.BrowserLauch;
import Pages.SearchPage;
import Pages.SearchResultPage;
import Utis.PropertyFileRead;
import io.cucumber.java.en.*;

public class MakeMyTripSearch extends BrowserLauch{
	

@Given("Lauch the browser and enter MakemyTrip Url")
public void lauch_the_browser_and_enter_makemy_trip_url() throws IOException {
	Launch();
	String URL = PropertyFileRead.ReadPropertyfile().getProperty("url");
	driver.get(URL);

}

@Given("Wait for Some to click on Adds")
public void wait_for_some_to_click_on_adds() {
	SearchPage sp = new SearchPage(driver);
	//sp.CloseAdd();    
}

@When("I see a From location dorpdown I will select on it {string}")
public void i_see_a_from_location_dorpdown_i_will_select_on_it(String from) throws InterruptedException {
	SearchPage sp = new SearchPage(driver);
	//sp.CloseAdd();
	Thread.sleep(5000);
	sp.ClickFromLocation();
	sp.SelectValueFromList(from);
	
}

@When("Select to location {string}")
public void select_to_location(String to) {
	SearchPage sp = new SearchPage(driver);
	sp.ClickToLocation();
	sp.SelectValueFromList(to);
}

/*@When("Select to location as same as from")
public void select_to_location_as_same_as_from() {
	SearchPage sp = new SearchPage(driver);
	sp.ClickToLocation();
	sp.SelectValueFromList("MAA");
	
}*/

@When("select date {string}")
public void select_date(String date) {
	SearchPage sp = new SearchPage(driver);
	sp.SelectDate(date);
	
}

@When("Click On Search button")
public void click_on_search_button() {
	SearchPage sp = new SearchPage(driver);
	sp.ClickOnSearch();
	
}

@Then("I validate the searchResult")
public void i_validate_the_search_result() {
	SearchResultPage srp = new SearchResultPage(driver);
	String actualText = srp.GetErrorMessage();
	String expectedText = "NETWORK PROBLEM";
	Assert.assertEquals(actualText, expectedText);
	}

@Then("I Close the Browser")
public void I_Close_the_Browser() {
	driver.quit();
	}


}
