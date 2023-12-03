package Pages;

import Utilities.GWD;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class DialogContent extends Parent{

    public DialogContent(){ PageFactory.initElements(GWD.getDriver(),this); }

    @FindBy(xpath = "//table[@class='layout']//input[@name='password']")
    private WebElement passwordInput;

    @FindBy(xpath = "//a[@class='login']")
    private WebElement signInPageButton;

    @FindBy(xpath = "//input[@id='email']")
    private WebElement emailInput;

    @FindBy(xpath = "//button[@id='SubmitLogin']")
    private WebElement signInButton;

    @FindBy(xpath = "//input[@id='email_create']")
    private WebElement createEmailInput;

    @FindBy(xpath = "//button[@id='SubmitCreate']")
    private WebElement createAccountButton;

    @FindBy(xpath = "//input[@type='radio'][@id='id_gender1']")
    private WebElement mrBox;

    @FindBy(xpath = "//input[@id='customer_firstname']")
    private WebElement firstNameInput;

    @FindBy(xpath = "//input[@id='customer_lastname']")
    private WebElement lastNameInput;

    @FindBy(xpath = "//input[@id='email']")
    private WebElement emailInputCreateAccount;

    @FindBy(xpath = "//input[@id='passwd']")
    private WebElement passwordInputCreateAccount;

    @FindBy(xpath = "//select[@id='days']")
    private WebElement day;

    @FindBy(xpath = "//select[@id='months']")
    private WebElement month;

    @FindBy(xpath = "//select[@id='years']")
    private WebElement year;

    @FindBy(xpath = "//button[@id='submitAccount']")
    private WebElement registerButton;

    @FindBy(xpath = "//div[@id='center_column']//p[@class='alert alert-success']")
    private WebElement successText;







    WebElement myElement;
    public void findAndSend(String strElement, String value){

        switch (strElement){

            case "createEmailInput":
                myElement = createEmailInput;
                break;

            case "firstNameInput":
                myElement = firstNameInput;
                break;

            case "lastNameInput":
                myElement = lastNameInput;
                break;//table[@class='layout']//input[@name='name']

            case "emailInputCreateAccount":
                myElement = emailInputCreateAccount;
                break;

            case "passwordInputCreateAccount":
                myElement = passwordInputCreateAccount;
                break;

            case "emailInput":
                myElement = emailInput;
                break;

            case "passwordInput":
                myElement = passwordInput;
                break;
        }
        sendKeysFunction(myElement, value);
    }

    public void findAndClick(String strElement){
        switch (strElement){

            case "createAccountButton":
                myElement = createAccountButton;
                break;

            case "mrBox":
                myElement = mrBox;
                break;

            case "registerButton":
                myElement = registerButton;
                break;

            case "signInPageButton":
                myElement = signInPageButton;
                break;

            case "signInButton":
                myElement = signInButton;
                break;
        }
        clickFunction(myElement);
    }

    public void findAndContains(String strElement, String value){
        switch (strElement){
            case "successText":
            myElement = successText;
            break;
        }
        verifyContainsTextFunction(myElement,value);
    }

    public void findAndSelect(String strElement, String value){
        switch (strElement){
            case "day":
                myElement = day;
                break;

                case "month":
                myElement = month;
                break;

                case "year":
                myElement = year;
                break;
        }
        select(myElement,value);
    }

}
