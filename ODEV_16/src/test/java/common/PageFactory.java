package common;

import pages.ButtonsPage;
import pages.WebTablesPage;

public class PageFactory {
    public static LoginPage buildLoginPage() {
        return new LoginPage("/");
    }
    public static ButtonsPage buildButtonsPage() {
        return new ButtonsPage("/");
    }
    public static WebTablesPage buildWebTablesPage() {
        return new WebTablesPage("/");
    }
}


