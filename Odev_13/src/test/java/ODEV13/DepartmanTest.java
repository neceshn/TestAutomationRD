package ODEV13;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import java.util.ArrayList;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

public class DepartmanTest {
    Departman departman = new Departman();



    @Test
    public void testPersonelEkle() {
        Departman departman = new Departman();
        Personel personel = new Personel();
        departman.PersonelEkle(personel);
        ArrayList<Personel> personels = departman.PersonelListele();
        assertTrue(personels.contains(personel));
    }

    @Test
    public void testPersonelDondur() {
        Departman departman = new Departman();
        Personel personel1 = new Personel();
        Personel personel2 = new Personel();
        departman.PersonelEkle(personel1);
        departman.PersonelEkle(personel2);
        ArrayList<Personel> personels = departman.PersonelListele();
        assertEquals(personels.size(), 2);
        assertTrue(personels.contains(personel1));
        assertTrue(personels.contains(personel2));
    }

    @AfterMethod
    public void tearDown() {
        departman = new Departman();
    }}
