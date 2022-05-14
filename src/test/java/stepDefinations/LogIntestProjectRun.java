package stepDefinations;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "./Features/loginTestProject.feature"
		,glue={"stepDefinations"}
		,monochrome = true
				,plugin = {"json","json:./target/JSONreport/JSONReports2.json",
						"junit:./target/junitReport/report2.xml",
		"html:./target/htmlreport/report2.html"}
		)

public class LogIntestProjectRun {

}
