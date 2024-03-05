package tests;

import drivers.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import utils.PropertyManager;

import java.net.MalformedURLException;

public class DemoQAButtonsTests {
    public static WebDriver driver;
    Driver webDriver = new Driver();
    PropertyManager propertyManager= new PropertyManager();
    String url =propertyManager.getProperty("APP_URL");



    @BeforeMethod(alwaysRun = true)
    public void before() throws MalformedURLException {
        driver = webDriver.initializeDriver();
        driver.get(url);
    }

    @Test
    public void openDemoQAPageTest() {
        String pageTitle = driver.getTitle();
        Assert.assertEquals(pageTitle,"DEMOQA");
    }

    @Test
    public void clickButtonsElementTest() throws InterruptedException {
        WebElement btnButtons = driver.findElement(new By.ByCssSelector("#item-4"));
        btnButtons.click();
        WebElement lblTitle = driver.findElement(new By.ByCssSelector("h1.text-center"));
        String checkLabel = lblTitle.getText();
        Assert.assertEquals(checkLabel, "Buttons", "tıklama işlemi başarısız oldu");
    }

    @Test
    public void clickClickMeTest(){
        WebElement btnButtons = driver.findElement(new By.ByCssSelector("#item-4"));
        btnButtons.click();
        WebElement btnClickMe = driver.findElement(new By.ByCssSelector(".col-md-6 > div:nth-child(2) > div:nth-child(4) > button"));
        btnClickMe.click();
        WebElement lblMessage = driver.findElement(new By.ByCssSelector("p#dynamicClickMessage"));
        String message = lblMessage.getText();
        Assert.assertEquals(message, "You have done a dynamic click", "Yanlış butona tıklanmış olabilir.");
    }

    @AfterMethod(alwaysRun = true)
    public void  after(){
        webDriver.quitDriver();
    }
}
