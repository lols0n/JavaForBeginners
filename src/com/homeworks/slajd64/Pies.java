package com.homeworks.slajd64;



//    1. Stwórz klasę Pies.
//            a) Dodaj atrybuty rasa, wiek, płeć
//    b) Dodaj metody umożliwiające ustawienie wieku oraz pobranie wieku (getAge,
//                                                                        setAge)
//    c) Dodaj konstruktor, który przyjmie wartości dla rasy i płci, a wiek ustawi na 0
//    d) Dodaj metodę powodująca wypisanie na ekran dźwięku wydawanego przez psa
//„Woof!”
//    e) Z poziomu metody main zaprezentuj działanie poszczególnych metody – utwórz
//    obiekt klasy Pies, zmodyfikuj wiek, wyświetl parametry psa.
//    f) Stwórz listę składającą się z 2 różnych psów, wypisz wartości ich atrybutów.
//    Klasa Pies:

    public class Pies  {
        private String rasa;
        private String plec;
        private int wiek;
        Pies (String rasa, String plec, int wiek){
            this.rasa = rasa;
            this.plec = plec;
            ustawWiek(0);
        }
        String podajRase(){
            return this.rasa;
        }
        String podajPlec(){
            return this.plec;
        }
        void ustawWiek(int wiek){
            this.wiek = wiek;
        }
        int podajwiek(){
            return this.wiek;
        }
        void dajGlos (){
            System.out.println("\n Woof");
        }
    }

