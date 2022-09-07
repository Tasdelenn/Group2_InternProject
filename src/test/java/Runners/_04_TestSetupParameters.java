package Runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;


@CucumberOptions(

        // tags 'a and veya or diyerek test ekleyebiliriz
        tags = "@SetupParametersTest",
        features = {"src/test/java/FeatureFiles/_TEC3_ParametersDocumentTypes.feature",
                "src/test/java/FeatureFiles/_TEC4_FieldsSetup.feature",
                "src/test/java/FeatureFiles/_TEC9_BankAccounts.feature",
                "src/test/java/FeatureFiles/_TEC10_ParametersGradeLevels.feature",
                "src/test/java/FeatureFiles/_TEC11_SetupParametersDiscount.feature",
                "src/test/java/FeatureFiles/_TEC12_SetupParametersNationality.feature"
        },
        glue = {"StepDefinitions"}

)
public class _04_TestSetupParameters extends AbstractTestNGCucumberTests {

}
