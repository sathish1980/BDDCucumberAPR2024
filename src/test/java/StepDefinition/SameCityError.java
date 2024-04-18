package StepDefinition;

import org.testng.Assert;

import BrowserDriver.BrowserLauch;
import Pages.SearchPage;
import Pages.SearchResultPage;
import io.cucumber.java.en.Then;

public class SameCityError extends BrowserLauch{

	
	@Then("i See a Same City Error")
	public void i_See_a_Same_City_Error() {
		SearchPage srp = new SearchPage(driver);
		String actualText = srp.GetSameCityError();
		String expectedText = "From & To airports cannot be the same";
		Assert.assertEquals(actualText, expectedText);
		}
}
