package ODEV8;

import java.text.ParseException;

public abstract class Personel {
    String personelAdi;
    String personelSoyadi;
    String dogumTarihi;

    public Personel(String ad, String soyad, String dogumTarihi){
        this.personelAdi=ad;
        this.personelSoyadi=soyad;
        this.dogumTarihi=dogumTarihi;
    }

    public abstract String emeklilikHesaplama(String tarih) throws ParseException;
}
