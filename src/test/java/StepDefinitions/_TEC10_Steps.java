package StepDefinitions;

import Pages.DialogContent;
import Utilities.GWD;
import io.cucumber.java.en.And;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class _TEC10_Steps {

    DialogContent dc = new DialogContent();

    @And("User delete third item from Dialog")
    public void userDeleteThirdItemFromDialog() {
        dc.findAndClick("deleteButton3");
        dc.findAndClick("deleteDialogBtn");
    }
}
