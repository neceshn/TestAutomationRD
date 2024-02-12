package ODEV13;

public class Muhasebe {
    static double gunUcreti = 550;
    static double maas = 0;

    static int fazlaGun =0;

    public static double maasHesapla(Personel personel) {
        if (personel.calisilanGunSayisi > 25) {
            fazlaGun  = personel.calisilanGunSayisi-25;
            maas = personel.calisilanGunSayisi * gunUcreti + (fazlaGun * 1000);
        } else {
            maas = personel.calisilanGunSayisi * gunUcreti;
        }

        return maas;
    }
}
