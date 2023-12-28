package StepDefinitions;

import Pages.DialogContent;
import Utilities.GWD;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class _02_LoginStepsNegative {
    DialogContent dc = new DialogContent();
    @Given("Navigate to XuClothingNegative")
    public void navigateToXuClothingNegative() {
        GWD.getDriver().get("https://cleverppc.com/prestashop4/");
        GWD.getDriver().manage().window().maximize();
    }

    @When("Enter invalid Email and valid Password and click login button")
    public void enterInvalidEmailAndValidPasswordAndClickLoginButton() {
        dc.findAndClick("signInPageButton");
        dc.findAndSend("emailInput","afedes@gmail.com");
        dc.findAndSend("passwordInput","12345");
        dc.findAndClick("signInButton");
    }

    @When("Enter valid Email and invalid Password and click login button")
    public void enterValidEmailAndInvalidPasswordAndClickLoginButton() {
        dc.findAndClick("signInPageButton");
        dc.findAndSend("emailInput","fedes@gmail.com");
        dc.findAndSend("passwordInput","112345");
        dc.findAndClick("signInButton");
    }

    @When("Enter invalid Email and invalid Password and click login button")
    public void enterInvalidEmailAndInvalidPasswordAndClickLoginButton() {
        dc.findAndClick("signInPageButton");
        dc.findAndSend("emailInput","afedes@gmail.com");
        dc.findAndSend("passwordInput","112345");
        dc.findAndClick("signInButton");
    }

    @Then("User should not login successfully")
    public void userShouldNotLoginSuccessfully() {
        dc.findAndContains("failedText","error");
    }
}
