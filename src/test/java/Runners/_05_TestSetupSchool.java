package Runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;


@CucumberOptions(

        // tags 'a and veya or diyerek test ekleyebiliriz
        tags = "@SetupSchoolTest",
        features = {"src/test/java/FeatureFiles/_TEC7_SchoolSetupLocations.feature",
                "src/test/java/FeatureFiles/_TEC8_SchoolSetupDepartments.feature"
        },
        glue = {"StepDefinitions"},

        plugin = {"html:target\\cucumber-reports.html"}

)
public class _05_TestSetupSchool extends AbstractTestNGCucumberTests {

}
