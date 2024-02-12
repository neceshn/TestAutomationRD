package ODEV13;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class MuhasebeTest {
    @DataProvider(name = "maasData")
    public Object[][] maasData() {
        return new Object[][]{
                {22, 22 * Muhasebe.gunUcreti},
                {25, 25 * Muhasebe.gunUcreti},
                {30, (25 * Muhasebe.gunUcreti) + (5 * Muhasebe.gunUcreti) + (5 * 1000)},
                {35, 25 * Muhasebe.gunUcreti + (10 * Muhasebe.gunUcreti) +(10 * 1000)}
        };
    }

    @Test(dataProvider = "maasData")
    void testMaasHesapla(double calisilanGunSayisi, double expected) {
        Personel personel = new Personel();
        personel.calisilanGunSayisi = (int) calisilanGunSayisi;
        double maas = Muhasebe.maasHesapla(personel);
        assertEquals(expected, maas);
    }
}
