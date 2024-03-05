package tests;

import drivers.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.*;
import utils.PropertyManager;

import java.net.MalformedURLException;

public class DemoQaWebTablesTests {
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
        WebElement lblTitle = driver.findElement(By.xpath("//h1[contains(text(),'Web Tables')]"));
        String title = lblTitle.getText();
        Assert.assertEquals(title,"Web Tables", "Yanlış Sayfadasın.");
    }

    @Test
    public void clickAddButtonTest() {
        WebElement btnAdd = driver.findElement(By.xpath("//button[@id='addNewRecordButton']"));
        btnAdd.click();
        WebElement lblFormTitle = driver.findElement(By.xpath("//div[@id='registration-form-modal']"));
        String title = lblFormTitle.getText();
        Assert.assertEquals(title,"Registration Form", "Form Açılmadı.");
    }

    @Test
    public void addEditRecordTest() throws InterruptedException {
        WebElement btnAdd = driver.findElement(By.xpath("//button[@id='addNewRecordButton']"));
        btnAdd.click();
        WebElement inputFirstName = driver.findElement(By.xpath("//input[@id='firstName']"));
        inputFirstName.sendKeys("Ece");
        WebElement inputLastName = driver.findElement(By.xpath("//input[@id='lastName']"));
        inputLastName.sendKeys("Gürbüz");
        WebElement inputMail = driver.findElement(By.xpath("//input[@id='userEmail']"));
        inputMail.sendKeys("ecegurbuz@yopmail.com");
        WebElement inputAge = driver.findElement(By.xpath("//input[@id='age']"));
        inputAge.sendKeys("33");
        WebElement inputSalary = driver.findElement(By.xpath("//input[@id='salary']"));
        inputSalary.sendKeys("25000");
        WebElement inputDepartman = driver.findElement(By.xpath("//input[@id='department']"));
        inputDepartman.sendKeys("QA");
        WebElement btnSubmit = driver.findElement(By.xpath("//button[@id='submit']"));
        btnSubmit.click();
        Thread.sleep(2000);

        WebElement selectRecord = driver.findElement(By.xpath("//div[@class='rt-tr-group'][4]//span[1]"));
        selectRecord.click();
        WebElement inputChangeDepartman = driver.findElement(By.xpath("//input[@id='department']"));
        inputChangeDepartman.clear();
        inputChangeDepartman.sendKeys("QA Engineer");
        WebElement btnChngeSubmit = driver.findElement(By.xpath("//button[@id='submit']"));
        btnChngeSubmit.click();
        Thread.sleep(2000);
    }

    @AfterMethod(alwaysRun = true)
    public void  after(){
        webDriver.quitDriver();
    }
}
