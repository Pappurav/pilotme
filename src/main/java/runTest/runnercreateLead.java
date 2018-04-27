package runTest;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = {"src/main/java/feature/createlead.feature","src/main/java/feature/editLead.feature"}, glue = {"pages","steps"}, tags= {"@Smoke, @Sanity"},monochrome = true)
public class runnercreateLead {

}
