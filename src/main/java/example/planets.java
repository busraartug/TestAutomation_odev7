package example;

public class planets {
    enum Planets{
        MERKUR(1, 69816.900, 2239.7, 1000),
        VENUS(2, 79816.900, 3239.7, 2000),
        DUNYA(3, 89816.900, 4239.7, 3000),
        MARS(4, 99816.900, 5239.7, 4000),
        JUPITER(5, 109816.900, 6239.7, 5000),
        SATURN(6, 119816.900, 7239.7, 6000),
        URANUS(7, 129816.900, 8239.7, 7000),
        NEPTUN(8, 139816.900, 9239.7, 8000),
        ;
        private final int siralama ;
        private final double uzaklik;
        private final double yaricap;
        private final int donmesuresi;
        Planets(int siralama, double uzaklik, double yaricap, int donmesuresi) {

            this.siralama = siralama;
            this.uzaklik = uzaklik;
            this.yaricap = yaricap;
            this.donmesuresi = donmesuresi;
        }
        public int getSiralama(){
            return siralama;
        }
        public double getUzaklik(){
            return uzaklik;
        }
        public double getYaricap(){
            return yaricap;
        }
        public int getDonmesuresi(){
            return  donmesuresi;
        }
    }
    }


