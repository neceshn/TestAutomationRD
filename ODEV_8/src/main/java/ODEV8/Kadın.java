package ODEV8;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Kadın extends Personel {
    public Kadın(String ad, String soyad, String yas) {
        super(ad, soyad, yas);
    }

    @Override
    public String emeklilikHesaplama(String tarih) throws ParseException {
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd.mm.yyyy");
        Date dogumTarihi = dateFormat.parse(tarih);

        Calendar bugun = Calendar.getInstance();
        Calendar dogumTakvimi = Calendar.getInstance();
        dogumTakvimi.setTime(dogumTarihi);

        int yas = bugun.get(Calendar.YEAR) - dogumTakvimi.get(Calendar.YEAR);
        if (yas >= 65) {
            return "Emekli olabilir.";
        } else {
            return "Emekli olamaz";
        }

    }
}