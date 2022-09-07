package Runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;


@CucumberOptions(

        // tags 'a and veya or diyerek test ekleyebiliriz
        tags = "@Regression",
        features = {"src/test/java/FeatureFiles/"},

        glue = {"StepDefinitions"},

        dryRun = true,

        plugin = {"html:target\\cucumber-reports.html"}

)
public class _02_TestRegression extends AbstractTestNGCucumberTests {

}
