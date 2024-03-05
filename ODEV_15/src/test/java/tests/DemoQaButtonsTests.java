package tests;

import drivers.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.*;
import utils.PropertyManager;
import java.net.MalformedURLException;

public class DemoQaButtonsTests {
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
    public void clickButtonsElementTest() {
        WebElement btnButtons =  driver.findElement(By.xpath("//div[@class='element-list collapse show']//li[5]"));
        btnButtons.click();
        WebElement lblTitle = driver.findElement(By.xpath("//h1[contains(text(),'Buttons')]"));
        String checkLabel = lblTitle.getText();
        Assert.assertEquals(checkLabel, "Buttons", "tıklama işlemi başarısız oldu");
    }

    @Test
    public void clickClickMeTest(){
        WebElement btnButtons = driver.findElement(By.xpath("//div[@class='element-list collapse show']//li[5]"));
        btnButtons.click();
        WebElement btnClickMe = driver.findElement(By.xpath("//div[@class='mt-4'][2]//button"));
        btnClickMe.click();
        WebElement lblMessage = driver.findElement(By.xpath("//p[@id=dynamicClickMessage]"));
        String message = lblMessage.getText();
        Assert.assertEquals(message, "You have done a dynamic click", "Yanlış butona tıklanmış olabilir.");
    }

    @AfterMethod(alwaysRun = true)
    public void  after(){
        webDriver.quitDriver();
    }
}
