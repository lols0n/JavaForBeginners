package com.homeworks.slajd69;

public class ZwierzeDomowe {
    String rodzaj;
    String rasa;
    String plec;
    int wiek;
    ZwierzeDomowe (String rodzaj, String rasa, String plec, int wiek){
        this.rodzaj = rodzaj;
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
    void dajGlos() {
    }
}
