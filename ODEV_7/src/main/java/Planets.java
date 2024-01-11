public class Planets {
    public enum PLANET {
        MERKUR(1, 0.30, 0.55, 12),
        VENUS(2, 0.30, 0.15, 23),
        DUNYA(3, 0.55, 0.45, 24),
        MARS(4, 0.30, 1.30, 5),
        JUPITER(5, 0.30, 2.15, 36),
        SATURN(6, 0.30, 5, 41),
        URANUS(7, 0.30, 4.23, 44),
        NEPTUN(8, 0.30, 9.3, 23),
        PLUTON(9, 0.30, 3.23, 23);

        private int siraNo;
        private double uzaklik;
        private double yaricap;
        private int sure;
        private  String name;

        PLANET(int siraNo, double uzaklik, double yaricap, int sure) {
            this.siraNo = siraNo;
            this.uzaklik = uzaklik;
            this.sure = sure;
            this.yaricap = yaricap;
            this.name = name();
        }
        public String getPlanets() {
            return String.format("Gezegen %d - %s: Uzaklık: %.2f milyon km, Yarıçap: %.2f km, Dönme Süresi: %d gün",
                    siraNo, name(), uzaklik, yaricap, sure);
        }
    }


}
