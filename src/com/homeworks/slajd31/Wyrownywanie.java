package com.homeworks.slajd31;

//4. Wyświetl trzy dowolne ciągi znaków w jednej linii tak, aby były wyrównane do prawej krawędzi 15 znakowych bloków. Np. „ test t wprowadzenie”.

public class Wyrownywanie {

    public static void main (String args[]){
        String c1 = "Atos";
        String c2 = "Portos";
        String c3 = "Aramis";
        System.out.printf("\n%15s%15s%15s", c1, c2, c3);
    }

}
