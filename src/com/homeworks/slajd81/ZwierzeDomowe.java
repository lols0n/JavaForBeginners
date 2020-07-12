package com.homeworks.slajd81;

public abstract class ZwierzeDomowe {
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
    abstract String podajRase();
    //    {
//        return this.rasa;
//    }
    abstract String podajPlec();
    //    {
//        return this.plec;
//    }
    abstract void ustawWiek(int wiek);
    //     {
//        this.wiek = wiek;
//    }
    abstract int podajwiek();
    //     {
//
//        return this.wiek;
//    }
    abstract void dajGlos();
//     {
//    }
}
