package Pages;

import Utilities.GWD;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LeftNav extends Parent{
    public LeftNav(){ PageFactory.initElements(GWD.getDriver(),this); }

    @FindBy(xpath = "//ul[@class='menusubnav']//a[text()='New Customer']")
    private WebElement newCustomerBtn;

    @FindBy(xpath = "//ul[@class='menusubnav']//a[text()='Edit Customer']")
    private WebElement editCustomerBtn;

    @FindBy(xpath = "//ul[@class='menusubnav']//a[text()='Delete Customer']")
    private WebElement deleteCustomerBtn;

    WebElement myElement;

    public void findAndClick(String strElement){
        switch (strElement){

            case "newCustomerBtn":
                myElement = newCustomerBtn;
                break;

            case "editCustomerBtn":
                myElement = editCustomerBtn;
                break;
            case "deleteCustomerBtn":
                myElement = deleteCustomerBtn;
                break;
        }
        clickFunction(myElement);
    }
}
