package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import org.testng.annotations.DataProvider;


@CucumberOptions(tags = "", features = "src/test/resources/features/", glue = "steps")

public class CucumberRunner extends AbstractTestNGCucumberTests {

}