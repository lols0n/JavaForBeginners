package com.homeworks.slajd69;

public class Pies extends ZwierzeDomowe {
    String rasa;
    String plec;
    int wiek;
    Pies (String rasa, String plec, int wiek){
        super("Pies", rasa, plec, wiek);
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
