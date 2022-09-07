package Runners;

import com.aventstack.extentreports.service.ExtentService;
import com.aventstack.extentreports.testng.listener.ExtentITestListenerClassAdapter;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Listeners;


@CucumberOptions(

        tags = "@SetupSchoolTest",
        features = {"src/test/java/FeatureFiles/"},
        glue = {"StepDefinitions"}


)
@Listeners({ExtentITestListenerClassAdapter.class})
public class _04_TestSetupSchool_ExtendReport extends AbstractTestNGCucumberTests {
        @AfterClass
        public static void writeExtentReport() {
                ExtentService.getInstance().setSystemInfo("User Name", "Grup2 SetupSchool Tests");
                ExtentService.getInstance().setSystemInfo("Application Name", "Campus");
                ExtentService.getInstance().setSystemInfo("Operating System Info", System.getProperty("os.name").toString());
                ExtentService.getInstance().setSystemInfo("Department", "QA");
                ExtentService.getInstance().setSystemInfo("Ek Satır", "SetupSchool Test Sonucu");
        }
}
