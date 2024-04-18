package TestRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.*;

;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "C:\\Users\\kumar\\eclipse-workspace\\BDDCucumber\\src\\test\\java\\Features\\MakeMyTripSearch.feature"
		,glue="StepDefinition",publish=true)
public class RunnerClass {
	
	

}
