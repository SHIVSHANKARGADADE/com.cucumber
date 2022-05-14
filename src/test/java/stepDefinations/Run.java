package stepDefinations;

import org.junit.runner.RunWith;

import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "./Features/login.feature"
		,glue={"stepDefinations"}
		,monochrome = true
		,plugin = {"json","json:./target/JSONreport/JSONReports.json",
				"junit:./target/junitReport/report.xml",
				"html:./target/htmlreport/report.html"}
		)


public class Run {

}
