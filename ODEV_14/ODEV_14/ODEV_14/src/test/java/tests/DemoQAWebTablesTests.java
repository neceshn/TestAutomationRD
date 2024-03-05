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


public class DemoQAWebTablesTests {
    public static WebDriver driver;
    Driver webDriver = new Driver();
    PropertyManager propertyManager= new PropertyManager();
    String url =propertyManager.getProperty("APP_URL_WT");



    @BeforeMethod(alwaysRun = true)
    public void before() throws MalformedURLException {
        driver = webDriver.initializeDriver();
        driver.get(url);
    }


    @Test
    public void openDemoQAWebTablesPageTest() {
        WebElement lblTitle = driver.findElement(new By.ByCssSelector("h1.text-center"));
        String title = lblTitle.getText();
        Assert.assertEquals(title,"Web Tables", "Yanlış Sayfadasın.");
    }

    @Test
    public void clickAddButtonTest() {
        WebElement btnAdd = driver.findElement(new By.ByCssSelector("button#addNewRecordButton"));
        btnAdd.click();
        WebElement lblFormTitle = driver.findElement(new By.ByCssSelector("div#registration-form-modal"));
        String title = lblFormTitle.getText();
        Assert.assertEquals(title,"Registration Form", "Form Açılmadı.");
    }

    @Test
    public void addEditRecordTest() throws InterruptedException {
        WebElement btnAdd = driver.findElement(new By.ByCssSelector("button#addNewRecordButton"));
        btnAdd.click();
        WebElement inputFirstName = driver.findElement(new By.ByCssSelector("input#firstName"));
        inputFirstName.sendKeys("Ece");
        WebElement inputLastName = driver.findElement(new By.ByCssSelector("input#lastName"));
        inputLastName.sendKeys("Gürbüz");
        WebElement inputMail = driver.findElement(new By.ByCssSelector("input#userEmail"));
        inputMail.sendKeys("ecegurbuz@yopmail.com");
        WebElement inputAge = driver.findElement(new By.ByCssSelector("input#age"));
        inputAge.sendKeys("33");
        WebElement inputSalary = driver.findElement(new By.ByCssSelector("input#salary"));
        inputSalary.sendKeys("25000");
        WebElement inputDepartman = driver.findElement(new By.ByCssSelector("input#department"));
        inputDepartman.sendKeys("QA");
        WebElement btnSubmit = driver.findElement(new By.ByCssSelector("button#submit"));
        btnSubmit.click();
        Thread.sleep(2000);

        WebElement selectRecord = driver.findElement(new By.ByCssSelector(".rt-table .rt-tbody > div:nth-child(4)  span#edit-record-4 >svg"));
        selectRecord.click();
        WebElement inputChangeDepartman = driver.findElement(new By.ByCssSelector("input#department"));
        inputChangeDepartman.clear();
        inputChangeDepartman.sendKeys("QA Engineer");
        WebElement btnChngeSubmit = driver.findElement(new By.ByCssSelector("button#submit"));
        btnChngeSubmit.click();
        Thread.sleep(2000);
    }

    @AfterMethod(alwaysRun = true)
    public void  after(){
        webDriver.quitDriver();
    }
}
