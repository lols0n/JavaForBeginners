package com.homeworks.slajd70;

public class JavaDeveloper extends Programista{
    JavaDeveloper(String imie,  String nazwisko, int wiek){
        super("Java Developer",  imie, nazwisko, wiek);
        System.out.println("Wywołanie konstruktora JavaDeveloper");
    }
    @Override
    void wyswietlDane(String imie) {
        super.wyswietlDane("Jacek");
    }
    void wyswietlDane(String imie, String nazwisko) {
        System.out.println("Witam nazywam się: " + imie + " " + nazwisko);
    }
}
