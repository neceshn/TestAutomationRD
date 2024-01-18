package ODEV8;

import java.text.ParseException;

public class Main {
    public static void main(String[] args) throws ParseException {
        Erkek takimLideri = new Erkek("Mustafa", "Gürbüz", "24.09.1970");
        Departman departman = new Departman(takimLideri);
        Kadın calisan1 = new Kadın("Ece", "Şahin", "22.01.1994");
        Kadın calisan2 = new Kadın("Ayşe", "Fatma", "22.01.2003");
        Erkek calisan3 = new Erkek("Ekrem", "Şahin", "22.01.1998");
        Erkek calisan4 = new Erkek("Eray", "Aslan", "22.01.1990");
        departman.personelEkle(calisan1);
        departman.personelEkle(calisan2);
        departman.personelEkle(calisan3);
        departman.personelEkle(calisan4);
        departman.personelListele();
        departman.personelSil(calisan4);
        departman.gorevEkle("Test");
        System.out.println("Görev eklendi");
        departman.gorevIsaretle("Deneme");
        System.out.println("Görev işaretlendi.");
        departman.personelDegistir(calisan2, calisan3);
        System.out.println(calisan2.personelAdi + " personeli " + calisan3.personelAdi + " ile değiştirildi");
        Erkek yeniTakimLideri = new Erkek("Ali", "veli", "22.12.1954");
        departman.takimLideriDegistir(yeniTakimLideri);
        System.out.println(takimLideri.personelAdi + " isimli takım lideri " + yeniTakimLideri.personelAdi + " ile değiştirildi.");
        System.out.println("Çalışan Emekli Mi: " + (calisan1.emeklilikHesaplama("16.09.1998")));
    }
}