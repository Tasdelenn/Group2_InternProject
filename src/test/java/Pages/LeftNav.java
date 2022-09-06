package Pages;

import Utilities.GWD;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LeftNav extends Parent{

    public LeftNav() {
        PageFactory.initElements(GWD.getDriver(), this);
    }

    @FindBy(xpath="(//span[text()='Setup'])[1]")
    private WebElement setupOne;

    @FindBy(xpath="(//span[text()='Setup'])[2]")
    private WebElement setupExam;

    @FindBy(xpath = "//span[text()='Parameters']")
    private WebElement parameters;

    @FindBy(xpath = "//span[text()='Countries']")
    private WebElement countries;

    @FindBy(xpath = "//span[text()='Citizenships']")
    private WebElement citizenShip;

    @FindBy(xpath = "//span[text()='Nationalities']")
    private WebElement nationalities;

    @FindBy(xpath = "//span[text()='Fees']")
    private WebElement fees;

    @FindBy(xpath = "//span[text()='Entrance Exams']")
    private WebElement entranceExams;

    @FindBy(xpath = "(//span[text()='Entrance Exams'])[2]")
    private WebElement entranceExams2;

    //-----------------------------------------------------
    //TEC1 - TEC2 LeftNav
    @FindBy(xpath = "//span[text()='Human Resources']")
    private WebElement humanResources;

    @FindBy(xpath = "(//span[text()='Setup'])[3]")
    private WebElement hrSetup;

    @FindBy(xpath = "//span[text()='Position Categories']")
    private WebElement positionCategories;

    @FindBy(xpath = "//span[text()='Positions']")
    private WebElement positions;

    @FindBy(xpath = "//span[text()='Attestations']")
    private WebElement attestations;

    @FindBy(xpath = "//span[text()='Employees']")
    private WebElement employees;

    //----------------------------------------------------
    // TEC7 - TEC8 LeftNav
    @FindBy(xpath = "//span[text()='School Setup']")
    private WebElement schoolSetup;

    @FindBy(xpath = "//span[text()='Locations']")
    private WebElement locations;

    @FindBy(xpath = "//span[text()='Departments']")
    private WebElement departments;


    //----------------------------------------------------
    // TEC-11 - TEC-12 LeftNav
    @FindBy(xpath = "//span[text()='Discounts']")
    private WebElement discounts;

    //---------------------------------------------------
    // TEC-3 - TEC10 LeftNav

    @FindBy(xpath = "//span[text()='Document Types']")
    private WebElement documentTypes;

    @FindBy(xpath = "//a/span[text()=\"Grade Levels\"]")
    private WebElement gradeLevels;



    WebElement myElement;
    public void findAndClick(String strElement){  // 2.aşama
        // burda string isimden weblemente ulaşıcam
        switch (strElement)
        {
            case "setupOne" : myElement =setupOne; break;
            case "parameters" : myElement =parameters; break;
            case "countries" : myElement =countries; break;
            case "citizenShip" : myElement =citizenShip; break;
            case "nationalities" : myElement =nationalities; break;
            case "fees" : myElement =fees; break;
            case "entranceExams" : myElement =entranceExams; break;
            case "setupExam" : myElement =setupExam; break;
            case "entranceExams2" : myElement =entranceExams2; break;
            case "humanResources" : myElement =humanResources; break;
            case "employees" : myElement =employees; break;
            case "schoolSetup" : myElement =schoolSetup; break;
            case "locations" : myElement =locations; break;
            case "departments" : myElement =departments; break;
            case "discounts" : myElement =discounts; break;
            case "documentTypes" : myElement =documentTypes; break;
            case "gradeLevels" : myElement =gradeLevels; break;
            case "hrSetup" : myElement =hrSetup; break;
            case "positionCategories" : myElement =positionCategories; break;
            case "positions" : myElement =positions; break;
            case "attestations" : myElement =attestations; break;

        }

        clickFunction(myElement);
    }

}
