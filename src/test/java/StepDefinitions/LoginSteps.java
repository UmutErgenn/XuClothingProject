package StepDefinitions;

import Pages.DialogContent;
import Utilities.GWD;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginSteps {
    DialogContent dc = new DialogContent();
    @Given("Navigate to XuClothing")
    public void navigateToXuClothing() {
        GWD.getDriver().get("https://cleverppc.com/prestashop4/");
        GWD.getDriver().manage().window().maximize();
    }

    @When("Enter valid Email and Password and click login button")
    public void enterValidEmailAndPasswordAndClickLoginButton() {
        dc.findAndSend("emailInput","fedes@gmail.com");
        dc.findAndSend("passwordInput","12345");
        dc.findAndClick("signInButton");
    }

    @Then("User should login successfully")
    public void userShouldLoginSuccessfully() {
        dc.findAndContains("SuccessText","has been created");
    }
}
