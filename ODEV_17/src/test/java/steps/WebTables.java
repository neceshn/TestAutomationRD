package steps;

import common.PageManager;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.asserts.SoftAssert;

public class WebTables {
    PageManager pageManager = new PageManager();
    SoftAssert softAssert = new SoftAssert();

    @Given("Open the web site to add record")
    public void openTheWebSiteToAddRecord() {
        pageManager.webtablesPage.openWT();
        softAssert.assertTrue(pageManager.buttonsPage.checkTitle().contains("Tables"));
    }

    @When("User clicks on Add button")
    public void userClicksOnAddButton() {
        pageManager.webtablesPage.clickAdd();
    }

    @And("User sends name to record {string}")
    public void userSendsNameToRecord(String name) {
        pageManager.webtablesPage.sendName(name);
    }

    @And("User sends surname to record {string}")
    public void userSendsSurnameToRecord(String surname) {
        pageManager.webtablesPage.sendSurname(surname);
    }

    @And("User sends mail to record {string}")
    public void userSendsMailToRecord(String mail) {
        pageManager.webtablesPage.sendMail(mail);
    }

    @And("User sends age to record {string}")
    public void userSendsAgeToRecord(String age) {
        pageManager.webtablesPage.sendAge(age);
    }

    @And("User sends salary to record {string}")
    public void userSendsSalaryToRecord(String salary) {
        pageManager.webtablesPage.sendSalary(salary);
    }

    @And("User sends department to record {string}")
    public void userSendsDepartmentToRecord(String department) {
        pageManager.webtablesPage.sendDepartment(department);
    }

    @And("User clicks on Submit button")
    public void userClicksOnSubmitButton() {
        pageManager.webtablesPage.addRecord();
    }

    @Then("System adds relevant record")
    public void systemAddsRelevantRecord() throws InterruptedException {
        pageManager.webtablesPage.waitPage();

    }

    @When("User changes relevant record {string}")
    public void userChangesRelevantRecord(String changeDepartment) {
        pageManager.webtablesPage.editRecord(changeDepartment);
    }
}
