package StepDefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import BrowserDriver.BrowserLauch;
import Pages.SearchPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class MakemyTripMultipleData extends BrowserLauch {
	
	@Given("I see a From location dorpdown I will select on it as ([^\"]*)$")
	public void I_see_a_From_location_dorpdown_I_will_select_on_it_as (String from) throws InterruptedException {
		SearchPage sp = new SearchPage(driver);
		//sp.CloseAdd();
		Thread.sleep(5000);
		sp.ClickFromLocation();
		sp.SelectValueFromList(from);
	}
	
	@Given("Select to location as ([^\"]*)$")
	public void Select_to_location_as (String to) throws InterruptedException {
		SearchPage sp = new SearchPage(driver);
		//sp.CloseAdd();
		Thread.sleep(5000);
		sp.ClickToLocation();
		sp.SelectValueFromList(to);
	}
	
	@When("select date as ([^\"]*)$")
	public void select_date_as(String date) {
		SearchPage sp = new SearchPage(driver);
		sp.SelectDate(date);
		
	}
}
