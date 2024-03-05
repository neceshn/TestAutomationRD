package steps;

import common.PageManager;
import io.cucumber.java.en.*;
import org.assertj.core.api.StringAssert;
import org.testng.asserts.SoftAssert;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class ElementsSteps  {
    PageManager pageManager = new PageManager();
    @Given("Open the web site")
    public void openTheWebSite() {
        pageManager.buttonsPage.open();
    }

    @When("User clicks on Buttons button")
    public void userClicksOnButtonsButton() {
        pageManager.buttonsPage.clickButton();
    }

    @Then("The system views buttons page")
    public void theSystemViewsButtonsPage() {
        pageManager.buttonsPage.checkTitle();
    }

    @When("User clicks on Click Me button")
    public void userClicksOnClickMeButton() {
        pageManager.buttonsPage.clickMe();
    }


    @Then("System views {string}")
    public void systemViews(String msg) {
       assertThat(pageManager.buttonsPage.checkMessage()).isEqualTo(msg);
    }
}
