package com.homeworks.slajd64;

//1. Stwórz klasę Pies.
//        a) Dodaj atrybuty rasa, wiek, płeć
//        b) Dodaj metody umożliwiające ustawienie wieku oraz pobranie wieku (getAge,
//        setAge)
//        c) Dodaj konstruktor, który przyjmie wartości dla rasy i płci, a wiek ustawi na 0
//        d) Dodaj metodę powodująca wypisanie na ekran dźwięku wydawanego przez psa
//        „Woof!”
//        e) Z poziomu metody main zaprezentuj działanie poszczególnych metody – utwórz
//        obiekt klasy Pies, zmodyfikuj wiek, wyświetl parametry psa.
//        f) Stwórz listę składającą się z 2 różnych psów, wypisz wartości ich atrybutów.

    public class KlasaMain{

        public static void main(String[] args) {
            // write your code here
            Pies pies1 = new Pies("Pekińczyk", "pies", 2);
            Pies pies2 = new Pies("York", "suczka", 1);
            pies1.dajGlos();
            pies1.podajwiek();
            pies1.ustawWiek(3);
            System.out.println("Nasz nowy pies to: " + pies1.podajRase() + " i jest to " + pies1.podajPlec() + ", który ma " + pies1.podajwiek() + " lata");
            System.out.println("Nasz nowy pies to: " + pies2.podajRase() + " i jest to " + pies2.podajPlec() + ", który ma " + pies2.podajwiek() + " lata");
        }
    }

