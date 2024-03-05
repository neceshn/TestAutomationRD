package pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;

public class WebTablesPage extends BasePage {

    public SelenideElement btnAdd = $("button#addNewRecordButton");
    public SelenideElement lblTitle = $("h1.text-center");
    public SelenideElement inputFirstName = $("input#firstName");
    public SelenideElement inputLastName = $("input#lastName");
    public SelenideElement inputMail = $("input#userEmail");
    public SelenideElement inputAge = $("input#age");
    public SelenideElement inputSalary = $("input#salary");
    public SelenideElement inputDepartman = $("input#department");
    public SelenideElement btnSubmit = $("button#submit");
    public SelenideElement btnEdit = $(".rt-table .rt-tbody > div:nth-child(4)  span#edit-record-4 >svg");

    public WebTablesPage(String pageUrl) {
        super(pageUrl);
    }

    public void clickAdd() {
        btnAdd.click();
    }

    public void sendName(String name) {
        inputFirstName.setValue(name);
    }
    public void sendSurname(String surname) {
        inputLastName.setValue(surname);
    }
    public void sendMail(String mail) {
        inputMail.setValue(mail);
    }
    public void sendAge(String age) {
        inputAge.setValue(age);
    }
    public void sendSalary(String salary) {
        inputSalary.setValue(salary);
    }
    public void sendDepartment(String department) {
        inputDepartman.setValue(department);
    }

    public void addRecord(){
        btnSubmit.click();
    }
    public void editRecord(String departman) {
        btnEdit.click();
        inputDepartman.setValue(departman);
    }
    public void waitPage() throws InterruptedException {
        Thread.sleep(2000);
    }
}
