package Test_Runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(tags = "", features = { "src/test/resources/Features/AddToCart.feature" }, glue = {
		"com.stepDefinition" }, plugin = { "pretty", "html:target/htmlreport.html" })

public class CucumberTestRunner extends AbstractTestNGCucumberTests {

}
