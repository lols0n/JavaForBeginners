package com.homeworks.slajd43;

import java.util.Scanner;

public class PetlaFor4 {

//    5. Jak wyżej, ale znak, z którego będzie składał się kwadrat, również pobierz z konsoli.

    public static void main(String[] args) {

        Scanner wejscie = new Scanner(System.in);
        System.out.println("Podaj znak do budowy kwadratu: ");
        String znak = wejscie.nextLine();
        System.out.println("Podaj długość boku kwadratu: ");
        int bok = wejscie.nextInt();
        for (int i = 1; i <= bok; i++) {
            for (int j = 1; j <= bok; j++) {
                System.out.print("" + znak + "  ");
            }
            System.out.println();
        }
    }
}
