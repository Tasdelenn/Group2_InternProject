package Runners;

import com.aventstack.extentreports.service.ExtentService;
import com.aventstack.extentreports.testng.listener.ExtentITestListenerClassAdapter;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Listeners;


@CucumberOptions(
        tags = "@SetupParametersTest",
        features = {"src/test/java/FeatureFiles/"},
        glue = {"StepDefinitions"}

)
@Listeners({ExtentITestListenerClassAdapter.class})
public class _03_TestSetupParameters_ExtendReport extends AbstractTestNGCucumberTests {
        @AfterClass
        public static void writeExtentReport() {
                ExtentService.getInstance().setSystemInfo("User Name", "Grup2 SetupParameters Tests");
                ExtentService.getInstance().setSystemInfo("Application Name", "Campus");
                ExtentService.getInstance().setSystemInfo("Operating System Info", System.getProperty("os.name").toString());
                ExtentService.getInstance().setSystemInfo("Department", "QA");
                ExtentService.getInstance().setSystemInfo("Ek Satır", "SetupParameters Test Sonucu");
        }

}
