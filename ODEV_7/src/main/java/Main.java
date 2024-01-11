public class Main {
    public static void main(String[] args) {
        Gezegen g = new Gezegen(Gezegen.EnumGezegenler.MARS);
        System.out.println("Adı: " + g.getEnumAdi() + " Uzaklığı: " + g.getUzaklik() + " Yarıçapı: " + g.getYaricap() + " Dönme Süresi: " + g.getDonmeSuresi());
        System.out.println("************");
        for (Planets.PLANET planets : Planets.PLANET.values()) {
            System.out.println(planets.getPlanets());

        }


    }
}
