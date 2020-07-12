package com.homeworks.slajd81;

public class Pies extends ZwierzeDomowe {
    private static int licznik;
    private String rasa;
    private String plec;
    private int wiek;

    Pies(String rasa, String plec, int wiek) {
        super("Pies", rasa, plec, wiek);
        this.rasa = rasa;
        this.plec = plec;
        ustawWiek(0);
        licznik++;
    }

    int getLicznik() {
        return licznik;
    }

    Kaganiec kaganiec = new Kaganiec("S", "skóra");

    String podajRozmiarKaganca() {
        return kaganiec.podajRozmiar();
    }

    String podajRase() {
        return this.rasa;
    }

    String podajPlec() {
        return this.plec;
    }

    void ustawWiek(int wiek) {
        this.wiek = wiek;
    }

    int podajwiek() {
        return this.wiek;
    }

    void dajGlos() {
        System.out.println("\n Woof");
    }
}