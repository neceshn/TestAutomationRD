package tests;

import org.testng.annotations.Test;

public class WebTablesTest extends BaseTest{
    @Test
    public void addRecordTest(){
        pageManager.webtablesPage.openWT();
        pageManager.webtablesPage.clickAdd();
        pageManager.webtablesPage.fillRecord("Nazlı","Gürbüz","nazligurbuz@yopmail.com",33,12000,"QA");
    }
    @Test
    public void editRecordTest(){
        pageManager.webtablesPage.openWT();
        pageManager.webtablesPage.clickAdd();
        pageManager.webtablesPage.fillRecord("Nazlı","Gürbüz","nazligurbuz@yopmail.com",33,12000,"QA");
        pageManager.webtablesPage.editRecord("QA Engineer");
    }

}
