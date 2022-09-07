package Runners;


import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;


@CucumberOptions(

        features = {"src/test/java/FeatureFiles/_01_Login.feature",
                "src/test/java/FeatureFiles/_TEC1_HR_Setup_PositionCategories.feature"
        },
        glue = {"StepDefinitions"},

        dryRun = false   // default u false yazmaya gerek yok. Ama true yaparsan
                        // testi çalıştırmadan sadece adımların varlığına bakar...

)
public class _02_TestRunner extends AbstractTestNGCucumberTests {


}
