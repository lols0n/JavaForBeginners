package com.homeworks.slajd52;

import java.util.Scanner;

public class TabliceJednowymiarowe1 {

//1. Wewnątrz pętli while (np. 10 razy) pobieraj produkt do kupienia i wprowadzaj go do utworzonej tablicy typu String.
//    Wyświetl wszystkie produkty z wykorzystaniem pętli for oraz for each.

    public static void main(String[] args) {


        Scanner wejscie = new Scanner(System.in);
        String produkt;
        String[] zakupy = new String[10];
        int i = 0;
        while (i < zakupy.length) {
            System.out.println("Podaj nazwę produktu: ");
            produkt = wejscie.nextLine();
            zakupy[i] = produkt;
            i++;
        }
        System.out.println("Lista zakupów :");
        for (String pozycja : zakupy) {
            System.out.println("  - " + pozycja);
        }
    }
}