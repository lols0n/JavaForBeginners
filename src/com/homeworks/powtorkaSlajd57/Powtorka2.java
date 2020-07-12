package com.homeworks.powtorkaSlajd57;

import java.util.Scanner;

public class Powtorka2 {

//    1. Napisz aplikację, która:
//    a) Będzie posiadała tablicę jednowymiarową składającą się z 3 elementów typu String: kombinerek, nożyczek i śrubokrętu.
//            b) Pobierze imię użytkownika.
//            c) Wypisze na ekran: „Witaj ! W naszej ofercie mamy: ” + lista elementów z tablicy produktów zdefiniowanych w podpunkcie a, każdy w nowej linii zaczynający się od myślnika + „Co chciałbyś kupić?”
//    d) Za pośrednictwem pętli switch – case przeanalizuj wybór użytkownika, dla opcji default wypisz „Takiego produktu nie mamy w ofercie”
//    e) Dla prawidłowego wyboru usuń dany element z tablicy i potwierdź użytkownikowi wybrany produkt.
//            f) Potwierdź usunięcie elementu z listy poprzez jej ponowne wyświetlenie.
//            g) *Imię użytkownika przekaż przez Varargs jako pierwszy parametr.
//    h) *Produkty do kupienia również.
//    i) W przypadku błędnego wyboru produktu pozwól na ponowny wybór tak długo, aż użytkownik nie napisze „do widzenia”

    public static void main(String[] args) {

        Scanner wejscie = new Scanner(System.in);
        String tab [] = {"kombinerki","nożyczki","śrubokręt"};
        System.out.println("Podaj imię: ");
        String imie = wejscie.nextLine();
        args = new String[]{imie};
        System.out.println("Witaj " + args[0] + " !\n w naszej ofercie mamy:" );
        String tool;
        do {
            System.out.println("Co chciałbyś kupić?");
            for ( String produkt:tab ) {
                System.out.println("  - " + produkt);
            }
            tool = wejscie.nextLine().toUpperCase();
            switch (tool) {
                case "KOMBINERKI":
                    tab[0] = "pusta";
                    System.out.println("Wybrałeś " + tool.toLowerCase());
                    System.out.println("Zawartość półki o indeksie 0 w magazynie: " + tab[0]);
                    break;
                case "NOŻYCZKI":
                    tab[1] = "pusta";
                    System.out.println("Wybrałeś " + tool.toLowerCase());
                    System.out.println("Zawartość półki o indeksie 1 w magazynie: " + tab[1]);
                    break;
                case "ŚRUBOKRĘT":
                    tab[2] = "pusta";
                    System.out.println("Wybrałeś " + tool.toLowerCase());
                    System.out.println("Zawartość półki o indeksie 2 w magazynie: " + tab[2]);
                    break;
                default:
                    if(tool.equals("DO WIDZENIA")){
                        System.out.println("Do widzenia. Zapraszamy ponownie !");
                    } else {
                        System.out.println("Takiego produktu nie ma w ofercie !");
                    }
                    break;
            }
        }while (!tool.equals("DO WIDZENIA"));

    }
}
