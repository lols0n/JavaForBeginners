package com.homeworks.slajd70;

public class Programista extends Czlowiek {
    Programista(String imie, String specjalizacja,  String nazwisko, int wiek){
        super("Programista", specjalizacja,  imie, nazwisko, wiek);
        System.out.println("Wywołanie konstruktora Programista");
    }
}
