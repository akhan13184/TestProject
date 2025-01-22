import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@cucumber.api.CucumberOptions(
    features = "src/test/resources/UITest.feature", // folder name
    glue = "StepDefinitions" // package name
)
public class TestRunner {
	
}

