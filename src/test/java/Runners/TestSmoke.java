package Runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;


@CucumberOptions(

        tags = "@SmokeTest",
        features = {"src/test/java/FeatureFiles/_01_Login.feature",
                "src/test/java/FeatureFiles/_TEC1_HR_Setup_PositionCategories.feature"
        },
        glue = {"StepDefinitions"}

)
public class TestSmoke extends AbstractTestNGCucumberTests {

}
