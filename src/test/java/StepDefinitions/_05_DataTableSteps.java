package StepDefinitions;

import Pages.DialogContent;
import Pages.LeftNav;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class _05_DataTableSteps {
    LeftNav ln = new LeftNav();
    DialogContent dc = new DialogContent();
    WebDriver driver = new ChromeDriver();
    @Given("Click on the element in the LeftNav")
    public void clickOnTheElementInTheLeftNav(DataTable elements) {
        List<String> listElements = elements.asList(String.class);

        for (String strButtonName : listElements){
            ln.findAndClick(strButtonName);
            try {
                Thread.sleep(5000);
                WebElement frame4 = driver.findElement(By.id("ad_iframe"));
                driver.switchTo().frame(frame4);
                driver.findElement(By.xpath("//div[@id='dismiss-button']/div/span")).click();
                driver.switchTo().defaultContent();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    @When("User sending the keys in Dialog content")
    public void userSendingTheKeysInDialogContent(DataTable elements) {
        List<List<String>> listElements= elements.asLists(String.class);

        for(int i=0;i< listElements.size() ; i++ )
            dc.findAndSend(listElements.get(i).get(0), listElements.get(i).get(1) );
    }

    @And("User select from form")
    public void userSelectFromForm(DataTable elements) {
        List<List<String>> listElements= elements.asLists(String.class);

        for(int i=0;i< listElements.size() ; i++ )
            dc.findAndSelect(listElements.get(i).get(0), listElements.get(i).get(1) );
    }

    @And("Click on the element in the Dialog")
    public void clickOnTheElementInTheDialog(DataTable elements) {
        List<String> listElements= elements.asList(String.class);

        for(String strButtonName : listElements)
            dc.findAndClick(strButtonName);
    }

    @Then("Success message should be displayed")
    public void successMessageShouldBeDisplayed() {
        dc.findAndContains("successMessage","success");
    }
}
