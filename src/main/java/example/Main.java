package example;

import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
    HashMap<String, HashMap<String, Double>> gezegenler = new HashMap<String, HashMap<String, Double>>();
    gezegenler.put("Merkür", new HashMap<String, Double>(){{
            put("siralama", 1.0);
            put("gunes e olan uzaklik", 69816.900);
            put("yaricap(km)", 2439.7);
            put("donme suresi(s)", 1000.0);
        }});

        gezegenler.put("Venüs", new HashMap<String, Double>(){{
            put("siralama", 2.0);
            put("gunes e olan uzaklik", 79816.900);
            put("yaricap(km)", 2239.7);
            put("donme suresi(s)", 1000.0);
        }});
        gezegenler.put("Dünya", new HashMap<String, Double>(){{
            put("siralama", 3.0);
            put("gunes e olan uzaklik", 89816.900);
            put("yaricap(km)", 2239.7);
            put("donme suresi(s)", 1000.0);
        }});
        gezegenler.put("Mars", new HashMap<String, Double>(){{
            put("siralama", 4.0);
            put("gunes e olan uzaklik", 99816.900);
            put("yaricap(km)", 2239.7);
            put("donme suresi(s)", 1000.0);
        }});
        gezegenler.put("Jüpiter", new HashMap<String, Double>(){{
            put("siralama", 5.0);
            put("gunes e olan uzaklik", 109816.900);
            put("yaricap(km)", 2239.7);
            put("donme suresi(s)", 1000.0);
        }});
        gezegenler.put("Satürn", new HashMap<String, Double>(){{
            put("siralama", 6.0);
            put("gunes e olan uzaklik", 79816.900);
            put("yaricap(km)", 2239.7);
            put("donme suresi(s)", 1000.0);
        }});

        gezegenler.put("Uranüs", new HashMap<String, Double>(){{
            put("siralama", 7.0);
            put("gunes e olan uzaklik", 79816.900);
            put("yaricap(km)", 2239.7);
            put("donme suresi(s)", 1000.0);
        }});
        gezegenler.put("Neptün", new HashMap<String, Double>(){{
            put("siralama", 8.0);
            put("gunes e olan uzaklik", 79816.900);
            put("yaricap(km)", 2239.7);
            put("donme suresi(s)", 1000.0);
        }});
        System.out.println(gezegenler);
    }
}
