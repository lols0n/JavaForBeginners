package com.homeworks.slajd33;

import java.util.Scanner;

public class Scanner2 {

    //2. Wprowadź z poziomu konsoli dwie wartości, dodaj je do siebie i wypisz ich sumę.

        public static void main(String[] args) {
            Scanner wejscie = new Scanner(System.in);
            System.out.println("Podaj pierwszą liczbę: ");
            int a = wejscie.nextInt();
            System.out.println("Podaj drugą liczbę: ");
            int b = wejscie.nextInt();
            System.out.println("Wynik dodawania to: " + (a + b));
        }
    }

