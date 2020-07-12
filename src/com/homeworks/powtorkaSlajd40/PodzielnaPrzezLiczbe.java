package com.homeworks.powtorkaSlajd40;

import java.util.Scanner;

public class PodzielnaPrzezLiczbe {



    public static void main(String[] args) {
        // write your code here
        Scanner wejscie = new Scanner(System.in);
        System.out.println("Podaj liczbę do sprawdzenia: ");
        int liczba1 = wejscie.nextInt();
        System.out.println("Podaj liczbę do sprawdzenia: ");
        int liczba2 = wejscie.nextInt();
        switch (liczba1%liczba2){
            case 0:
                System.out.println("Liczba " + liczba1 + " jest podzielna przez liczbę " + liczba2);
                break;
            default:
                System.out.println("Liczba " + liczba1 + " NIE jest podzielna przez liczbę " + liczba2);
                break;
        }
    }
}

