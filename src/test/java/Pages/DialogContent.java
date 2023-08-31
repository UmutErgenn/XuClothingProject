package Pages;

import Utilities.GWD;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DialogContent extends Parent{

    public DialogContent(){ PageFactory.initElements(GWD.getDriver(),this); }

    @FindBy(xpath = "//form//input[@type='text']")
    private WebElement userID;

    @FindBy(xpath = "//form//input[@type='password']")
    private WebElement password;

    @FindBy(xpath = "//form//input[@type='submit']")
    private WebElement loginButton;

    @FindBy(xpath = "//form//input[@type='reset']")
    private WebElement resetButton;

    @FindBy(xpath = "//h2[@class='barone']")
    private WebElement SuccessText;

    @FindBy(xpath = "//table[@id='regmsg']//p")
    private WebElement successMessage;

    @FindBy(xpath = "//table[@class='layout']//input[@name='name']")
    private WebElement nameInput;

    @FindBy(xpath = "//table[@class='layout']//input[@name='rad1']")
    private WebElement genderBox;

    @FindBy(xpath = "//table[@class='layout']//input[@name='dob']")
    private WebElement birth;

    @FindBy(xpath = "//table[@class='layout']//textarea[@name='addr']")
    private WebElement adressInput;

    @FindBy(xpath = "//table[@class='layout']//input[@name='city']")
    private WebElement cityInput;

    @FindBy(xpath = "//table[@class='layout']//input[@name='state']")
    private WebElement stateInput;

    @FindBy(xpath = "//table[@class='layout']//input[@name='pinno']")
    private WebElement pinInput;

    @FindBy(xpath = "//table[@class='layout']//input[@name='telephoneno']")
    private WebElement phoneInput;

    @FindBy(xpath = "//table[@class='layout']//input[@name='emailid']")
    private WebElement mailInput;

    @FindBy(xpath = "//table[@class='layout']//input[@name='password']")
    private WebElement passwordInput;

//    @FindBy(xpath = "//div[@id='dismiss-button']")
//    private WebElement closeAddButton;




    WebElement myElement;
    public void findAndSend(String strElement, String value){

        switch (strElement){

            case "userID":
                myElement = userID;
                break;//table[@class='layout']//input[@name='name']

            case "password":
                myElement = password;
                break;

            case "nameInput":
                myElement = nameInput;
                break;//table[@class='layout']//input[@name='name']

            case "adressInput":
                myElement = adressInput;
                break;

            case "cityInput":
                myElement = cityInput;
                break;

            case "stateInput":
                myElement = stateInput;
                break;

            case "pinInput":
                myElement = pinInput;
                break;

            case "phoneInput":
                myElement = phoneInput;
                break;
            case "mailInput":
                myElement = mailInput;
                break;

            case "passwordInput":
                myElement = passwordInput;
                break;



        }
        sendKeysFunction(myElement, value);
    }

    public void findAndClick(String strElement){
        switch (strElement){

            case "loginButton":
                myElement = loginButton;
                break;

            case "resetButton":
                myElement = resetButton;
                break;

            case "genderBox":
                myElement = genderBox;
                break;
        }
        clickFunction(myElement);
    }

    public void findAndContains(String strElement, String value){
        switch (strElement){
            case "SuccessText":
            myElement = SuccessText;
            break;

            case "successMessage":
            myElement = successMessage;
            break;
        }
        verifyContainsTextFunction(myElement,value);
    }

    public void findAndSelect(String strElement, String value){
        switch (strElement){
            case "birth":
                myElement = birth;
                break;
        }
        select(myElement,value);
    }

}
