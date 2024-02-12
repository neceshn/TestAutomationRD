import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class WebDriverBuilder {
    private WebDriver driver;

    public WebDriverBuilder() {
        driver = new ChromeDriver();
    }

    public WebDriverBuilder withPageLoadTimeout(int seconds) {
        driver.manage().timeouts().pageLoadTimeout(seconds, TimeUnit.SECONDS);
        return this;
    }

    public WebDriverBuilder withImplicitWait(int seconds) {
        driver.manage().timeouts().implicitlyWait(seconds, TimeUnit.SECONDS);
        return this;
    }

    public WebDriver build() {
        return driver;
    }

    public void quitDriver() {
        if (driver != null) {
            driver.quit();
            driver = null;
        }
    }

}
