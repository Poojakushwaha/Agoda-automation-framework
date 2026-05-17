package runner;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "src/test/resources/Features",
        glue = {"stepDefinitions","hooks"},
        tags= "@EndToEnd",
        plugin = {"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:",
        		
        		"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:target/extentreport.html"
        },
        dryRun=true,
        monochrome = false
		)
public class TestRunner {

}
