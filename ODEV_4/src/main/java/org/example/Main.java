package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Departman dp = new Departman();
        dp.adi ="IK";
        Personel p1 = new Personel();
        Personel p2 = new Personel();
        Personel p3 = new Personel();

        p1.ad = "Ece";
        p1.soyad = "Gürbüz";
        p1.yas = 33;
        p1.aktif = true;
        dp.PersonelEkle(p1);

        p2.ad = "Nazlı";
        p2.soyad = "Şahin";
        p2.yas = 32;
        p2.aktif = false;
        dp.PersonelEkle(p2);

        p3.ad = "Ayşe";
        p3.soyad = "Fatma";
        p3.yas = 30;
        p3.aktif = true;

        dp.PersonelEkle(p3);
        dp.PersonelListele();
    }
}