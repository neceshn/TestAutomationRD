import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
public class Gezegen {

    public enum EnumGezegenler {
        MERCURY(1) {
            @Override
            public double getUzaklik() {
                return 10;
            }

            @Override
            public double getYaricap() {
                return 10;
            }

            @Override
            public double getDonmeSuresi() {
                return 10;
            }
        },
        VENUS(2) {
            @Override
            public double getUzaklik() {
                return 20;
            }

            @Override
            public double getYaricap() {
                return 20;
            }

            @Override
            public double getDonmeSuresi() {
                return 20;
            }
        },
        EARTH(3) {
            @Override
            public double getUzaklik() {
                return 30;
            }

            @Override
            public double getYaricap() {
                return 30;
            }

            @Override
            public double getDonmeSuresi() {
                return 30;
            }
        },
        MARS(4) {
            @Override
            public double getUzaklik() {
                return 40;
            }

            @Override
            public double getYaricap() {
                return 40;
            }

            @Override
            public double getDonmeSuresi() {
                return 40;
            }
        },
        JUPITER(5) {
            @Override
            public double getUzaklik() {
                return 50;
            }

            @Override
            public double getYaricap() {
                return 50;
            }

            @Override
            public double getDonmeSuresi() {
                return 50;
            }
        },
        SATURN(6) {
            @Override
            public double getUzaklik() {
                return 60;
            }

            @Override
            public double getYaricap() {
                return 60;
            }

            @Override
            public double getDonmeSuresi() {
                return 60;
            }
        },
        URANUS(7) {
            @Override
            public double getUzaklik() {
                return 70;
            }

            @Override
            public double getYaricap() {
                return 70;
            }

            @Override
            public double getDonmeSuresi() {
                return 70;
            }
        },
        NEPTUNE(8) {
            @Override
            public double getUzaklik() {
                return 81;
            }

            @Override
            public double getYaricap() {
                return 82;
            }

            @Override
            public double getDonmeSuresi() {
                return 83;
            }
        };
        private int siraNumarasi;
        public double getUzaklik() {
            return 0;
        }

        public double getYaricap() {
            return 0;
        }

        public double getDonmeSuresi() {
            return 0;
        }
        EnumGezegenler(int i) {
            this.siraNumarasi = i;
        }
    }

    private EnumGezegenler enumGezegenler;
    Gezegen(EnumGezegenler gezegenAdi){
        this.enumGezegenler = gezegenAdi;
    }

    public double getUzaklik() {
        return this.enumGezegenler.getUzaklik();
    }

    public double getYaricap() {
        return this.enumGezegenler.getYaricap();
    }

    public double getDonmeSuresi() {
        return this.enumGezegenler.getDonmeSuresi();
    }
}

