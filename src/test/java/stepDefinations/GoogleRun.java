package stepDefinations;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "./Features/googlesearch.feature"
		,glue={"stepDefinations"}
		,monochrome = true
				,plugin = {"json","json:./target/JSONreport/JSONReports1.json",
						"junit:./target/junitReport/report1.xml",
		"html:./target/htmlreport/report1.html"}
		)

public class GoogleRun {

}
