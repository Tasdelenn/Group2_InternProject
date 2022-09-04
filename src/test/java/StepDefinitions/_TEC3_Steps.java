package StepDefinitions;

import Pages.DialogContent;
import Utilities.GWD;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import org.openqa.selenium.interactions.Actions;

import java.util.List;

public class _TEC3_Steps {

    DialogContent dc = new DialogContent();

    @And("click Anywhere")
    public void clickAnywhere() {
        Actions actions = new Actions(GWD.getDriver());
        actions.click().build().perform();
    }

    @And("User search and delete item from Dialog")
    public void userSearchAndDeleteItemFromDialog(DataTable elements) {
        List<String> listElement = elements.asList(String.class);

        for(int i=0;i<listElement.size();i++) {
            //   System.out.println("listElement = " + listElement.get(i));
            dc.SearchAndDelete(listElement.get(i));
        }
    }
}
