package Runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;


@CucumberOptions(

        // tags 'a and veya or diyerek test ekleyebiliriz
        tags = "@HumanResourcesTest",
        features = {"src/test/java/FeatureFiles/_TEC1_HR_Setup_PositionCategories.feature",
                "src/test/java/FeatureFiles/_TEC2_HR_Setup_Attestations.feature",
                "src/test/java/FeatureFiles/_TEC5_HR_Setup_Positions.feature"
        },
        glue = {"StepDefinitions"},

        plugin = {"html:target\\cucumber-reports.html"}

)
public class _06_TestHumanResources extends AbstractTestNGCucumberTests {

}
