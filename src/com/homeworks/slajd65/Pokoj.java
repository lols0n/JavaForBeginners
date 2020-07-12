package com.homeworks.slajd65;

class Pokoj {
    private double wysokosc;
    private double szerokosc;
    private double dlugosc;
    private double field;
    Pokoj (double szerokosc, double dlugosc, double wysokosc){
        this.szerokosc = szerokosc;
        this.dlugosc = dlugosc;
        this.wysokosc = wysokosc;
    }
    Pokoj (double szerokosc, double dlugosc){
        this.szerokosc = szerokosc;
        this.dlugosc = dlugosc;
        ustawWysokosc(2.4);
    }
    void ustawWysokosc(double wysokosc){
        this.wysokosc = wysokosc;
    }
    double podajSzerokosc(){
        return this.szerokosc;
    }
    double podajDlugosc(){
        return this.dlugosc;
    }
    double podajWysokos(){
        return this.wysokosc;
    }
    double mathField(){
        this.field = 2*(podajSzerokosc() * podajDlugosc()) + 2*(podajSzerokosc() * podajWysokos()) + 2*(podajDlugosc() * podajWysokos());
        return field;
    }
    double mathVolume(){
        this.field = podajSzerokosc() * podajDlugosc() * podajWysokos();
        return field;
    }
    void wyswietlPole(){
        System.out.println("Pole powierzchi to: " + mathField());
    }
    void wyswietlObjetosc(){
        System.out.println("Objętość to: " + mathVolume());
    }
}
