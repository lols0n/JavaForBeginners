package com.homeworks.slajd43;

import java.util.Scanner;

public class PetlaFor1 {

//    1. Wewnątrz pętli for (np. 10 razy) pobieraj produkt do kupienia i wyświetlaj go na ekran w postaci : „Dodałem do koszyka , to nasz  produkt!”

    public static void main(String[] args) {


        Scanner wejscie = new Scanner(System.in);
        String produkt;
        int ilosc = 0;

        for (int i = 1; i <= 10; i++) {
            System.out.println("Wprowadź produkt: ");
            produkt = wejscie.nextLine();
            System.out.println("Dodałem do koszyka " + produkt + ", to nasz " + i + " produkt");
            ilosc = i;
        }

        System.out.println("Mamy " + ilosc + "  produktów w koszyku");
    }
}
