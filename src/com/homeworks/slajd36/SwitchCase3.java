package com.homeworks.slajd36;

import java.util.Scanner;

public class SwitchCase3 {

//6. Prosty teleturniej. Program ma zadać użytkownikowi 3 pytania.
//    Użytkownik może odpowiedzieć 1, 2 lub 3. I za każdą odpowiedź poprawną zdobywa 10 punktów.
//    Na koniec program wyświetla ilość zdobytych punktów.

    public static void main(String[] args) {

        Scanner wejscie = new Scanner(System.in);
        int ans;
        int punkty = 0;
        System.out.println("Jakiego koloru jest czerwony maluch: 1. czerwony 2. zielony 3.niebieski");
        ans = wejscie.nextInt();
        switch (ans){
            case 1:
                System.out.println("Brawo!");
                punkty = punkty + 10;
                break;
            case 2:
            case 3:
                System.out.println("Źle!");
                break;
            default:
                System.out.println("Nie ma takiej odpowiedzi!");
                break;
        }
        System.out.println("Nasz plenaeta jest która od słońca: 1. pierwsza 2. druga  3.trzecia");
        ans = wejscie.nextInt();
        switch (ans){
            case 1:
            case 2:
                System.out.println("Źle!");
                break;
            case 3:
                System.out.println("Brawo!");
                punkty = punkty + 10;
                break;
            default:
                System.out.println("Nie ma takiej odpowiedzi!");
                break;
        }
        System.out.println("Bitwa pod Grunwaldem odbyła się w: 1. 1050r. 2. 1410r. 3.1939r. ");
        ans = wejscie.nextInt();
        switch (ans){
            case 1:
            case 3:
                System.out.println("Źle!");
                break;
            case 2:
                System.out.println("Brawo!");
                punkty = punkty + 10;
                break;
            default:
                System.out.println("Nie ma takiej odpowiedzi!");
                break;
        }
        System.out.println("Ilość zdobytych punktów to:" + punkty);
    }
}

