package runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

public class SeleniumRunner {
	@RunWith(Cucumber.class)
	@CucumberOptions(
	        features = "src\\test\\resources\\features\\",
	       	glue = "steps",
	        //glue = "src\\test\\java\\steps\\",
	        plugin = {"pretty", "html:target/report-html", "json:target/report.json"},
	        monochrome = false,
	        snippets = CucumberOptions.SnippetType.CAMELCASE
	)
	public static class RunnerSeleniumTest {
	}
}
