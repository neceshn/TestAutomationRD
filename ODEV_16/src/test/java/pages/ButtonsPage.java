package pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;

public class ButtonsPage extends BasePage{
    public SelenideElement btnButtons = $("#item-4");
    public SelenideElement btnClickMe = $(".col-md-6 > div:nth-child(2) > div:nth-child(4) > button");
    public SelenideElement lblMessage = $("p#dynamicClickMessage");

    public ButtonsPage(String pageUrl) {
        super(pageUrl);
    }

    public void clickButton(){
        btnButtons.click();
    }
    public void clickMe(){
        btnClickMe.click();
    }
    public String checkMessage(){
       return  lblMessage.getText();
    }
}
