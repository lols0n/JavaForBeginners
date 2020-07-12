package com.homeworks.slajd69;



//        1. Analogicznie do klasy Pies stwórz klasę Kot, zaprezentuj jej działanie.
//        2. Stwórz klasę nadrzędną, np. ZwierzeDomowe, po której będzie dziedziczył Kot i Pies.
//        Przenieś do klasy ZwierzeDomowe wszystkie wspólne metody i atrybuty.
//        3. Stwórz tablicę przechowującą obiekt klasy Pies i obiekt klasy Kot. Wypisz wydawane przez
//        nie dźwięki.
//        Klasa Pies

public class Kot extends ZwierzeDomowe {
    String rasa;
    String plec;
    int wiek;
    Kot (String rasa, String plec, int wiek){
        super("Kot", rasa, plec, wiek);
        this.rasa = rasa;
        this.plec = plec;
        ustawWiek(0);
    }
    void ustawWiek(int wiek){
        this.wiek = wiek;
    }
    int podajwiek(){
        return this.wiek;
    }
    void dajGlos (){
        System.out.println("\n Miau");
    }
}
