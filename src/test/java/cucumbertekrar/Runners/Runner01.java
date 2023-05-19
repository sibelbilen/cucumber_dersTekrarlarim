package cucumbertekrar.Runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(

 features = "src/test/resources/features",
 glue = {"src/test/java/cucumbertekrar/StepDefinitions"},
 tags = "@TC01",
        dryRun = false






)




public class Runner01 {
}
