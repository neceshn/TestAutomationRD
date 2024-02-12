package ODEV13;

import java.util.ArrayList;

public class Departman {
    String adi;
    static ArrayList<Personel> personels = new ArrayList<Personel>();

    public void PersonelEkle(Personel personel) {
        personels.add(personel);
    }

    public ArrayList<Personel> PersonelListele() {
        for (int i = 0; i < personels.size(); i++) {
            System.out.println(personels.get(i).ad);
        }
        return personels;
    }

    public static ArrayList<Personel> PersonelDondur() {
        return personels;
    }
}

