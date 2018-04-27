package runTest;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/main/java/feature/mergelead.feature", glue = {"pages","steps"})
public class runnermergeLead {

}
