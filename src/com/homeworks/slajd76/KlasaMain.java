package com.homeworks.slajd76;

//1. Zmodyfikuj aplikację dotyczącą zwierząt domowych tak, aby klasa ZwierzeDomowe była
//        abstrakcyjna.
//2. Utwórz klasę Kaganiec (rozmiar, materiał wykonania…), której obiekt będzie zawierała
//        klasa Pies (kompozycja). Wyświetl dane dotyczące kagańca za pośrednictwem obiektu
//        psa.

public class KlasaMain {
    public static void main(String[] args) {
        Pies p1 = new Pies("York","suczka",1);
        System.out.println(p1.podajRodzajMatrerialu());
        System.out.println(p1.podajRozmiarKaganca());
    }
}
