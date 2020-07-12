package com.homeworks.powtorkaSlajd40;

import java.util.Scanner;

public class ParzystaNieparzysta {

    public static void main(String[] args) {
        // write your code here
        Scanner wejscie = new Scanner(System.in);
        System.out.println("Podaj liczbę do sprawdzenia: ");
        int liczba = wejscie.nextInt();
        switch (liczba%2){
            case 0:
                System.out.println("Liczba jest przysta");
                break;
            default:
                System.out.println("Liczba jest nieprzysta");
                break;
        }
    }
}

