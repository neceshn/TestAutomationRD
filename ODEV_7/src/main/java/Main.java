public class Main {
    public static void main(String[] args) {
        Gezegen g = new Gezegen(Gezegen.EnumGezegenler.NEPTUNE);
        System.out.println(g.getUzaklik());
        System.out.println(g.getYaricap());
        System.out.println(g.getDonmeSuresi());

    }
}
