package com.homeworks.slajd65;

//1. Stwórz klasę Pokoj.
//        a) Dodaj atrybuty wysokość, szerokość, długość (typu double).
//        b) Dodaj konstruktor, który przyjmie wszystkie wartości.
//        c) Dodaj drugi konstruktor, który przyjmie szerokość i długość a wysokość ustawi na 2,4 m.
//        d) Dodaj metody obliczające oraz zwracające pole powierzchni oraz objętość pokoju.
//        e) Dodaj metody wyświetlające pole powierzchni oraz objętość pokoju.
//        f) Z poziomu metody main zaprezentuj działanie poszczególnych metod.
//        g) Stwórz listę pokoi. Wyświetl ich parametry.

public class KlasaMain {

        public static void main(String[] args) {
            // write your code here
            Pokoj pokoj1 = new Pokoj(4.0, 5.0, 2.5);
            Pokoj pokoj2 = new Pokoj(3.5, 4.0);
            System.out.println("\nPokoj 1  - pole powierzchni oraz objętość gdy pola są PRIVATE: ");
            pokoj1.wyswietlPole();
            pokoj1.wyswietlObjetosc();
            System.out.println("\nPokoj 2  - pole powierzchni oraz objętość gdy pola są PRIVATE: ");
            pokoj2.wyswietlPole();
            pokoj2.wyswietlObjetosc();
        }
    }

