package StepDefinitions;

import Pages.DialogContent;
import Utilities.GWD;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;

public class _01_LoginSteps {
    DialogContent dc=new DialogContent();


    @Given("Navigate to basqar")
    public void navigateToBasqar() {
        GWD.getDriver().get("https://demo.mersys.io/");
        GWD.getDriver().manage().window().maximize();
        dc.findAndClick("acceptCookies");
    }

    @When("Enter username and password and click login button")
    public void enterUsernameAndPasswordAndClickLoginButton() {

        dc.findAndSend("username","richfield.edu");
        dc.findAndSend("password","Richfield2020!");
        dc.findAndClick("loginButton");
    }

    @Then("User should login successfuly")
    public void userShouldLoginSuccessfuly() {
        dc.findAndContainsText("dashboard","Dashboard");
    }

    @When("click to login button")
    public void clickToLoginButton() {
        dc.findAndClick("loginButton");

    }

    @Then("User should be seen require username and password")
    public void userShouldBeSeenRequireUsernameAndPassword() {
        dc.findAndContainsText("requiredUsernameAndPassword","Gereklidir");


    }

    @When("Enter invalid username and password")
    public void enterInvalidUsernameAndPassword() {
        dc.findAndSend("username","abcdef");
        dc.findAndSend("password","12345!");
        dc.findAndClick("loginButton");
    }

    @Then("User should be seen invalid username or password")
    public void userShouldBeSeenInvalidUsernameOrPassword() {
        dc.findAndContainsText("invalidUsernameAndPassword","Invalid");
    }

    @When("Click to Reset Password Link")
    public void clickToResetPasswordLink() {
        dc.findAndClick("resetPasswordLink");
    }


    @Then("User should be seen Reset Your Password")
    public void userShouldBeSeenResetYourPassword() {
        dc.findAndContainsText("resetPasswordHeader","Reset");
    }
}
