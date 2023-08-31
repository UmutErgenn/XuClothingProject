package StepDefinitions;

import Pages.DialogContent;
import Utilities.GWD;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginSteps {
    DialogContent dc = new DialogContent();
    @Given("Navigate to Guru")
    public void navigateToGuru() {
        GWD.getDriver().get("https://demo.guru99.com/v4/");
        GWD.getDriver().manage().window().maximize();
    }

    @When("Enter valid UserID and Password and click login button")
    public void enterValidUserIDAndPasswordAndClickLoginButton() {
        dc.findAndSend("userID","mngr47659");
        dc.findAndSend("password","12345@123");
        dc.findAndClick("loginButton");
    }

    @Then("User should login successfully")
    public void userShouldLoginSuccessfully() {
        dc.findAndContains("SuccessText","Guru99 Bank");
    }
}
