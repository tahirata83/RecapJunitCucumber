package runner;


import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(

        plugin={"html:target/cucumber-report",
                "json:target/cucumber.json"
        },
        glue={"stepDefinition"},
        features = {"@target/rerun.txt"},

//      it is checking all the steps are defined or not
        dryRun = false
)
public class rerunSmokeTest {
}
