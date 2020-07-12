package com.homeworks.slajd52;

import java.util.Scanner;

public class TabliceJednowymiarowe2 {

//2. Utwórz tablicę przechowującą wartości typu int o rozmiarze zadanym z konsoli. Wypełnij ją wartościami wewnątrz pętli for. Zwróć sumę tych wartości.


    public static void main(String[] args) {

        Scanner wejscie = new Scanner(System.in);
        System.out.println("Podaj długość tablicy: ");
        int tablen = wejscie.nextInt();
        int liczba;
        int tab[] = new int[tablen];
        for (int i=0; i < tablen; i++) {
            System.out.println("Podaj " + i + " liczbę: ");
            liczba = wejscie.nextInt();
            tab[i] = liczba;
        }
        int suma=0;
        for (int kolejna: tab  ){
            suma = suma + kolejna;
        }
        System.out.println("Suma liczb z tablicy to: " + suma);

    }


}
