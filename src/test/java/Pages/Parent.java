package Pages;

import Utilities.GWD;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;

public class Parent {
    WebDriverWait wait = new WebDriverWait(GWD.getDriver(), Duration.ofSeconds(3));

    public void sendKeysFunction(WebElement element, String value)
    {
        waitUntilVisible(element); // gözükene kadar bekle
        scrollToelement(element);  // elemente kadar scroll yap (javascriptexecuter)
        element.clear();           //        temizle  (clear)
        element.sendKeys(value);//        değeri gönder (sendKeys)
    }

    public void clickFunction(WebElement element)
    {
        waitUntilClickable(element); // Clickable olana kadar bekle
        scrollToelement(element);  // elemente kadar scroll yap (javascriptexecuter)
//        element.click();           //        click

        try {
            element.click();
        }catch (org.openqa.selenium.StaleElementReferenceException ex){
            element.click();
        }catch (org.openqa.selenium.ElementClickInterceptedException e){
            new Actions(GWD.getDriver()).sendKeys(Keys.ESCAPE).perform();
        }
    }

    public void waitUntilVisible(WebElement element)
    {
        wait.until(ExpectedConditions.visibilityOf(element));
    }

    public void scrollToelement(WebElement element)
    {
        JavascriptExecutor js=(JavascriptExecutor) GWD.getDriver();
        js.executeScript("arguments[0].scrollIntoView();", element);
    }

    public void waitUntilClickable(WebElement element)
    {
        wait.until(ExpectedConditions.elementToBeClickable(element));
    }

    public void verifyContainsTextFunction(WebElement element, String value)
    {
//        waitUntilVisible(element); // gözükene kadar bekle
        wait.until(ExpectedConditions.textToBePresentInElement(element, value)); // success için çalışıyor
        Assert.assertTrue(element.getText().toLowerCase().contains(value.toLowerCase()),"The text you searched could'nt be find");
        new Actions(GWD.getDriver()).sendKeys(Keys.ESCAPE).perform(); // açık dialog kutusu varsa kapansın
    }

    public void select(WebElement element, String value){
        Select ddDayMenu = new Select(element);
        ddDayMenu.selectByValue(value);
    }

//    public void waitUntilLoading()
//    {
//        wait.until(ExpectedConditions.numberOfElementsToBe(By.cssSelector("fuse-progress-bar > *"), 0));
//        // progressbar ın çocukları
//    }
}
