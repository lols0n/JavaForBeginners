package com.homeworks.slajd53;

import java.util.Scanner;

public class TabliceJednowymiarowe5 {

    public static void main(String[] args) {

       // 1. Napisz program, który dla zadanej tablicy typu int zwraca:
       // a) Największą wartość
        int tab [] = {1, 6, 3, 4 ,5};
        int max = tab[0];
        for (int liczba: tab) {
            if (liczba > max) {
                max = liczba;
            }
        }
       // b) Najmniejszą wartość
        int tab1 [] = {1, 6, 3, 4 ,5};
        int min =  tab1[0];
        for (int liczba1: tab) {
            if (liczba1 < min) {
                min = liczba1;
            }
        }
       // c) Sumę wszystkich wartości
        int tab2 [] = {1, 6, 3, 4 ,5};
        int suma=0;
        for (int liczba2: tab2) {
            suma = suma + liczba2;
        }
        System.out.println("Suma liczb z tablicy to: " + suma);
       // d) *Wartość średnią
        int tab3 [] = {2, 6, 3, 4 ,5};
        double suma1=0;
        for (int liczba3: tab) {
            suma1 = suma1 + liczba3;
        }
        System.out.println("Srednia liczb z tablicy to: " + (suma1/tab.length));
       // e) *Medianę
        int tab4 [] = {2, 3, 4, 5, 6, 7};
        float mediana;
        if (tab4.length % 2 == 0){
            mediana = (tab4[(tab4.length/2)-1] + tab4[tab4.length/2]);
            mediana = mediana / 2;
        } else {
            mediana = tab4[(tab4.length/2)];
        }
        System.out.println("Mediana liczb z tablicy to: " + mediana);

//        2. Napisz program, który zwraca w postaci tablicy zbiór wszystkich liczb mniejszych od zadanej przez użytkownika liczby oraz:
//        a) Podzielnych przez 2
//        b) Podzielnych przez 3
//        c) *Podzielnych przez zadaną przez użytkownika liczbę

       Scanner wejscie = new Scanner(System.in);
        System.out.println("Wpisz liczbę: ");
        int liczba4 = wejscie.nextInt();
        int tab5 [] = {2, 3, 4, 5, 6, 7, 8, 9, 10}, dziel2 = 0, dziel3 = 0, dzieluser = 0, i = 0, j = 0, k = 0 ;
        for (int count: tab) {
            if (liczba4 > count){
                if(count % 2 == 0 ){
                    dziel2++;
                }
                if(count % 3 == 0 ){
                    dziel3++;
                }
                if(count % liczba4 == 0 ){
                    dzieluser++;
                }
            }
        }
        int tabDziel2 [] = new int [dziel2];
        int tabDziel3 [] = new int [dziel3];
        int tabDzieluser [] = new int [dzieluser];
        for (int count: tab) {
            if(count < liczba4) {
                if(count % 2 == 0 ){
                    tabDziel2[i] = count;
                    i++;
                }
                if(count % 3 == 0 ){
                    tabDziel3[j] = count;
                    j++;
                }
                if(count % liczba4 == 0 ){
                    tabDzieluser[k] = count;
                    k++;
                }
            }
        }
        System.out.println("Liczby mniejsze od: " + liczba4 + " i podzielne przez 2");
        for(int count: tabDziel2) {
            System.out.println(count);
        }
        System.out.println("Liczby mniejsze od: " + liczba4 + " i podzielne przez 3");
        for(int count: tabDziel3) {
            System.out.println(count);
        }
        System.out.println("Liczby mniejsze od: " + liczba4 + " i podzielne przez: " + liczba4);
        for(int count: tabDzieluser) {
            System.out.println(count);
        }

    }
}
