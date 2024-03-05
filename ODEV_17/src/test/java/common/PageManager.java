package common;

import driver.DriverFactory;
import pages.ButtonsPage;
import pages.WebTablesPage;

public class PageManager {

    public ButtonsPage buttonsPage;
    public WebTablesPage webtablesPage;

    public PageManager() {

        DriverFactory.initDriver();

        buttonsPage = PageFactory.buildButtonsPage();
        webtablesPage = PageFactory.buildWebTablesPage();

    }
}
