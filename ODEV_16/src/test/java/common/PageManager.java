package common;

import driver.DriverFactory;
import pages.ButtonsPage;
import pages.WebTablesPage;

public class PageManager {
    public LoginPage loginPage;

    public ButtonsPage buttonsPage;
    public WebTablesPage webtablesPage;

    public PageManager() {

        DriverFactory.initDriver();

        loginPage = PageFactory.buildLoginPage();
        buttonsPage = PageFactory.buildButtonsPage();
        webtablesPage = PageFactory.buildWebTablesPage();

    }
}
