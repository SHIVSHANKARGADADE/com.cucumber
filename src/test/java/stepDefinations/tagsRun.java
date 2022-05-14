package stepDefinations;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "./tagsFeature/tags.feature",
		glue = {"stepDefinations"},
		tags = "@smoke and @regression"
		)

public class tagsRun {



}
