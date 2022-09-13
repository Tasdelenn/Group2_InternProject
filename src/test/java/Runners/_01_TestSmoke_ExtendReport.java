package Runners;

import Utilities.GWD;
import com.aventstack.extentreports.service.ExtentService;
import com.aventstack.extentreports.testng.listener.ExtentITestListenerClassAdapter;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Listeners;
import org.testng.annotations.Parameters;


@CucumberOptions(

        tags = "@SmokeTest",
        features = {"src/test/java/FeatureFiles/"},
        glue = {"StepDefinitions"}

)
@Listeners({ExtentITestListenerClassAdapter.class})
public class _01_TestSmoke_ExtendReport extends AbstractTestNGCucumberTests {

    @BeforeClass(alwaysRun = true) // bazı java versiyon hatalırı için
    @Parameters("browser")
    public void beforeClass(String browser)
    {
        GWD.threadBrowserName.set(browser);
        //burada browser set edilecek
        // bu threade browsername set edildi.
    }



    @AfterClass
    public static void writeExtentReport() {
        ExtentService.getInstance().setSystemInfo("User Name", "Grup2 Smoke Test");
        ExtentService.getInstance().setSystemInfo("Application Name", "Campus");
        ExtentService.getInstance().setSystemInfo("Operating System Info", System.getProperty("os.name").toString());
        ExtentService.getInstance().setSystemInfo("Department", "QA");
        ExtentService.getInstance().setSystemInfo("Ek Satır", "Smoke Test Sonucu");
    }

}
