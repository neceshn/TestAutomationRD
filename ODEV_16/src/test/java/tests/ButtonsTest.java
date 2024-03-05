package tests;

import org.testng.annotations.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class ButtonsTest extends BaseTest{
    @Test
    public void buttonsTest() {
        pageManager.buttonsPage.open();
        pageManager.buttonsPage.clickButton();
        pageManager.buttonsPage.clickMe();
        assertThat(pageManager.buttonsPage.checkMessage()).isEqualTo("You have done a dynamic click");
    }

}
