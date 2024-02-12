import org.openqa.selenium.WebDriver;

public class Main {
    public static void main(String[] args) {
        WebDriverSingleton webDriverSingleton = WebDriverSingleton.getInstance();
        WebDriver driverSingleton = webDriverSingleton.getDriver();
        driverSingleton.get("https://google.com");
        WebDriverSingleton.quitDriver();

        WebDriverBuilder builder = new WebDriverBuilder()
                .withPageLoadTimeout(30)
                .withImplicitWait(10);

        WebDriver driver = builder.build();

        driver.get("https://yahoo.com");

        // WebDriver kapatma
        builder.quitDriver();
    }
}
