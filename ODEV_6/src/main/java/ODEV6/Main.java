package ODEV6;


import java.util.HashSet;

public class Main {
    public static void main(String[] args) {

        String metin = "Bu bir test dizinidir ece";
        String[] kelimeler = metin.split(" ");


        //tekrarlı 2 kelimeyi bulma
        int limit = 2;
        String tekrarliKelimeler = "";
        for (String kelime : kelimeler) {
            if (limit == 0) {
                break;
            }
            if (tekrarEdiyorMu(kelime)) {
                tekrarliKelimeler += kelime;
                limit--;
            }
        }
        System.out.println("Oluşturulan yeni kelime: " + kelimeTuret(tekrarliKelimeler));

    }

    public static boolean tekrarEdiyorMu(String kelime) {
        HashSet<Character> tekrarliKelime = new HashSet<>();
        for (Character harf : kelime.toCharArray()) {
            if (tekrarliKelime.contains(harf)) {
                return true;
            }
            tekrarliKelime.add(harf);
        }
        return false;
    }

    public static String kelimeTuret(String tekraliKelimeler) {
        String yeniKelime = "";
        for (int i = 1; i < tekraliKelimeler.length(); i = i + 2) {
            yeniKelime += tekraliKelimeler.toCharArray()[i];
        }
        for (int i = 0; i < tekraliKelimeler.length(); i = i + 2) {
            yeniKelime += tekraliKelimeler.toCharArray()[i];
        }
        return yeniKelime;
    }
}

