package Runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;


@CucumberOptions(

        // tags 'a and veya or diyerek test ekleyebiliriz
        tags = "@EducationTest",
        features = {"src/test/java/FeatureFiles/_TEC6_Subject_Categories.feature"
        },
        glue = {"StepDefinitions"},

        plugin = {"html:target\\cucumber-reports.html"}

)
public class _05_TestEducation extends AbstractTestNGCucumberTests {

}
