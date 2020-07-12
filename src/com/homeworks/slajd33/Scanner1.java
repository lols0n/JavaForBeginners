package com.homeworks.slajd33;

import java.util.Scanner;

public class Scanner1 {

//    1. Wprowadź swoje imię z poziomu konsoli i zapisz je do zmiennej typu String. Wypisz na konsolę „Witaj, <imię>”.

        public static void main (String args[]){
            System.out.println("Podaj swoje imie: ");
            Scanner wejscie = new Scanner(System.in);
            String imie = wejscie.nextLine();
            System.out.println("Witaj: " + "\""+ imie + "\"");
        }
    }
