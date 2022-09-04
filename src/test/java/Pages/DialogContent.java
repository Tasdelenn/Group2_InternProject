package Pages;

import Utilities.GWD;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class DialogContent extends Parent{

    public DialogContent() {
        PageFactory.initElements(GWD.getDriver(), this);
    }

    @FindBy(id="mat-input-0")
    private WebElement username;

    @FindBy(id="mat-input-1")
    private WebElement password;

    @FindBy(css="button[aria-label='LOGIN']")
    private WebElement loginButton;

    @FindBy(xpath="(//span[contains(text(),'Dashboard')])[2]")
    private WebElement dashboard;

    @FindBy(xpath="//ms-add-button[contains(@tooltip,'TITLE.ADD')]//button")
    private WebElement addButton;

    @FindBy(xpath="//ms-text-field[@formcontrolname='name']//input")
    private WebElement nameInput;

    @FindBy(xpath="//ms-text-field[@formcontrolname='code']//input")
    private WebElement codeInput;

    @FindBy(xpath="//ms-save-button//button")
    private WebElement saveButton;

    @FindBy(xpath = "//div[contains(text(),'successfully')]")
    private WebElement successMessage;

    @FindBy(xpath = "//ms-text-field[@formcontrolname='shortName']//input")
    private WebElement shortName;

    @FindBy(xpath = "//div[contains(text(),'already exists')]")
    private WebElement alreadyExist;

    @FindBy(xpath = "//button[@aria-label='Close dialog']")
    private WebElement closeDialog;

    @FindBy(xpath = "(//div[contains(@class,'mat-form-field-infix ng-tns-c74')]//input)[1]")
    private WebElement searchInput;

    @FindBy(xpath = "//ms-search-button//button")
    private WebElement searchButton;

    @FindBy(xpath = "//ms-delete-button//button")
    private WebElement deleteButton;

    @FindBy(xpath = "//span[contains(text(),'Delete')]")
    private WebElement deleteDialogBtn;

    @FindBy(xpath = "//ms-text-field[@formcontrolname='budgetAccountIntegrationCode']//input")
    private WebElement integrationCode;

    @FindBy(xpath = "//ms-integer-field[@formcontrolname='priority']//input")
    private WebElement priorityCode;

    @FindBy(xpath = "(//button[@class='consent-give'])[1]")
    private WebElement acceptCookies;

    //------------------------------------------------------
    // TEC7 - TEC8 DialogContent
    @FindBy(xpath = "(//mat-select[@role=\"combobox\"])[3]")
    private WebElement classroomSelect;

    @FindBy(xpath = "//span[text()=\" Other \"]")
    private WebElement other;

    @FindBy(xpath = "//ms-integer-field[@formcontrolname='capacity']//input")
    private WebElement capacity;

    @FindBy(xpath = "(//ms-edit-button//button)[1]")
    private WebElement editButton;

    @FindBy(xpath = "(//mat-slide-toggle)[1]")
    private WebElement slideToggle;

    @FindBy(xpath = "//span[text()=\"Section\"]")
    private WebElement section;

    //----------------------------------------------------
    // TEC-11 - TEC-12 DialogContent
    @FindBy (css="ms-text-field[formcontrolname='description']>input")
    private WebElement descriptionInput;

    @FindBy (css="ms-text-field[placeholder='DISCOUNT.TITLE.DESCRIPTION']>input")
    private WebElement searchDescription;

    @FindBy (css="ms-text-field[placeholder='GENERAL.FIELD.CODE']>input")
    private WebElement searchCode;

    @FindBy (xpath="(//ms-table-toolbar//button)[1]")
    private WebElement tableAddButton;
    
    //-------------------------------------------------------
    //TEC3-TEC10 DİALOG

    @FindBy(xpath = "//mat-form-field//textarea")
    private WebElement description;

    @FindBy(xpath = "//mat-select[@formcontrolname=\"attachmentStages\"]")
    private WebElement matSelect;

    @FindBy(xpath = "//span[text()=\" Examination \"]")
    private WebElement examination;

    @FindBy(xpath = "//mat-select[@formcontrolname=\"id\"]")
    private WebElement nextGrade;

    @FindBy(xpath = "//span[text()=\" Graduate Level \"]")
    private WebElement graduateLevel;

    @FindBy(xpath = "//ms-text-field[@formcontrolname=\"order\"]/input")
    private WebElement order;

    @FindBy(xpath = "(//ms-delete-button//button)[3]")
    private WebElement deleteButton3;

    @FindBy (css="ms-text-field[placeholder='GENERAL.FIELD.NAME']>input")
    private WebElement searchGeneralName;


    WebElement myElement;
    public void findAndSend(String strElement, String value){  // 2.aşama
        // burda string isimden weblemente ulaşıcam
        switch (strElement)
        {
            case "username" : myElement =username; break;
            case "password" : myElement =password; break;
            case "nameInput" : myElement =nameInput; break;
            case "codeInput" : myElement =codeInput; break;
            case "shortName" : myElement =shortName; break;
            case "searchInput" : myElement =searchInput; break;
            case "integrationCode" : myElement =integrationCode; break;
            case "priorityCode" : myElement =priorityCode; break;
            case "capacity" : myElement =capacity; break;
            case "descriptionInput" : myElement =descriptionInput; break;
            case "searchDescription" : myElement =searchDescription; break;
            case "searchCode" : myElement =searchCode; break;
            case "searchGeneralName" : myElement =searchGeneralName; break;
            case "description" : myElement =description; break;
            case "order" : myElement =order; break;
        }

        sendKeysFunction(myElement, value);
    }

    public void findAndClick(String strElement){  // 2.aşama
        // burda string isimden weblemente ulaşıcam
        switch (strElement)
        {
            case "loginButton" : myElement =loginButton; break;
            case "addButton" : myElement =addButton; break;
            case "saveButton" : myElement =saveButton; break;
            case "closeDialog" : myElement =closeDialog; break;
            case "searchButton" : myElement =searchButton; break;
            case "deleteButton" : myElement =deleteButton; break;
            case "deleteDialogBtn" : myElement =deleteDialogBtn; break;
            case "acceptCookies" : myElement =acceptCookies; break;
            case "classroomSelect" : myElement =classroomSelect; break;
            case "other" : myElement =other; break;
            case "editButton" : myElement =editButton; break;
            case "slideToggle" : myElement =slideToggle; break;
            case "section" : myElement =section; break;
            case "tableAddButton" : myElement =tableAddButton; break;
            case "matSelect" : myElement =matSelect; break;
            case "examination" : myElement =examination; break;
            case "nameInput" : myElement =nameInput; break;
            case "nextGrade" : myElement =nextGrade; break;
            case "graduateLevel" : myElement =graduateLevel; break;
            case "deleteButton3" : myElement =deleteButton3; break;

        }

        clickFunction(myElement);
    }

    public void findAndContainsText(String strElement, String text){  // 2.aşama
        // burda string isimden weblemente ulaşıcam
        switch (strElement)
        {
            case "dashboard" : myElement =dashboard; break;
            case "successMessage" : myElement =successMessage; break;
            case "alreadyExist" : myElement =alreadyExist; break;
        }

        verifyContainsText(myElement,text);
    }


    public void SearchAndDelete(String searchText){
        findAndSend("searchInput", searchText); // aranacak kelimeyi kutucuğa gönder
        findAndClick("searchButton"); // arama butonuna bas

        //waitUntilLoading();
        GWD.Bekle(3);

        findAndClick("deleteButton");// silme butonua bas
        findAndClick("deleteDialogBtn");// dilogdaki silme butonuna bas
    }










}
