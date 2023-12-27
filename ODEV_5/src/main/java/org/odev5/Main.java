package org.odev5;
public class Main {
    public static void main(String[] args) {

        Departman dp = new Departman();

        dp.adi ="IK";

        Personel p1 = new Personel();
        Personel p2 = new Personel();
        Personel p3 = new Personel();

        p1.ad = "Ece";
        p1.soyad = "Gurbuz";
        p1.yas = 33;
        p1.aktif = true;
        p1.calisilanGunSayisi=26;
        dp.PersonelEkle(p1);

        p2.ad = "Nazlı";
        p2.soyad = "Şahin";
        p2.yas = 32;
        p2.aktif = false;
        p2.calisilanGunSayisi=22;
        dp.PersonelEkle(p2);

        p3.ad = "Mustafa";
        p3.soyad = "Fatma";
        p3.yas = 30;
        p3.aktif = true;
        p3.calisilanGunSayisi=30;
        dp.PersonelEkle(p3);

        Muhasebe mh = new Muhasebe();
        for(Personel personel : Departman.PersonelDondur()) {
            double maas = Muhasebe.maasHesapla(personel);
            System.out.println(personel.ad + " adlı personelin maaşı: " + maas + " TL");
        }
    }
}