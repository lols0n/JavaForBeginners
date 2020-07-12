package com.homeworks.slajd52;

public class TabliceJednowymiarowe4 {

//    4. Jak wyżej, ale dopisuj tylko imiona, które składają się z mniej, niż 5 znaków.

    public static void main(String[] args) {

        String wypis = "";
        String tab[] = {"Ala", "Kasia", "Olga", "Tomek", "Marcin"};
        for (String pozycja: tab) {
            if (pozycja.length()<5){
                wypis = wypis.concat(pozycja + ", ");
            }
        }
        System.out.println("Lista osób: " + wypis);

    }
}
