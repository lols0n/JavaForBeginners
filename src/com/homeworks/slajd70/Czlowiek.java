package com.homeworks.slajd70;

public class Czlowiek {
    private String zawod, specjalizacja, imie, nazwisko;
    private int wiek;
    Czlowiek(String zawod, String specjalizacja, String imie, String nazwisko, int wiek){
        this.zawod = zawod;
        this.specjalizacja = specjalizacja;
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.wiek = wiek;
        System.out.println("Wywołanie konstruktora Człowiek");
    }
    void wyswietlDane (String imie){
        System.out.println("Witam nazywam się: " + imie);
    }
}
