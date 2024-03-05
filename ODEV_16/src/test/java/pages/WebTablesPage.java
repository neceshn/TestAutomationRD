package pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;

public class WebTablesPage extends BasePage {

    public SelenideElement btnAdd = $("button#addNewRecordButton");
    public SelenideElement lblTitle = $("button#addNewRecordButton");
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

    public void fillRecord(String name, String surname, String mail, int age, int salary, String departman) {
        inputFirstName.setValue(name);
        inputLastName.setValue(surname);
        inputMail.setValue(mail);
        inputAge.setValue(String.valueOf(age));
        inputSalary.setValue(String.valueOf(salary));
        inputDepartman.setValue(departman);
        btnSubmit.click();
    }

    public void editRecord(String departman) {
        btnEdit.click();
        inputDepartman.setValue(departman);
        btnSubmit.click();
    }
}
