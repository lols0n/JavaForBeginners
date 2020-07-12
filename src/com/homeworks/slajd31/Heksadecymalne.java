package com.homeworks.slajd31;

//5. Wyświetl wartości 192, 168, 1, 10 heksadecymalnie w formacie XX:XX:XX:XX, dla podanych wartości powinniśmy otrzymać: „C0:A8:01:0A”

public class Heksadecymalne {

    public static void main(String[] args) {
        int h1 = 192;
        int h2 = 168;
        int h3 = 1;
        int h4 = 10;
        System.out.printf("\n%02X:%02X:%02X:%02X", h1, h2, h3, h4);
        String hex = String.format("\n%02x:%02x:%02x:%02x", h1, h2, h3, h4).toUpperCase();
        System.out.println(hex);
    }
}
