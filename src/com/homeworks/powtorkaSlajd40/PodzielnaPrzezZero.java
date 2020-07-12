package com.homeworks.powtorkaSlajd40;

import java.util.Scanner;

public class PodzielnaPrzezZero {

    //obsłuż sytuację, w której użytkownik poda wartość 0 podczas dzielenia.

    public static void main(String[] args) {

        Scanner wejscie = new Scanner(System.in);
        System.out.println("Podaj rodzaj operacji matematyczne: ");
        String operation = wejscie.nextLine().toUpperCase();
        int a, b;
        System.out.println("Podaj pierszwą liczbę: ");
        a = wejscie.nextInt();
        System.out.println("Podaj pierszwą liczbę: ");
        b = wejscie.nextInt();
        switch(operation){
            case "SUMA":
                System.out.println("Suma liczb jest równa: " + (a+b));
                break;
            case "RÓŻNICA":
                System.out.println("Różnica liczb jest równa: " + (a-b) );
                break;
            case "ILOCZYN":
                System.out.println("Iloczyn liczb jest równa: " + (a*b) );
                break;
            case "ILORAZ":
                if (b==0)
                    System.out.println("Nie dziel przez zero!");
                else
                    System.out.println("Iloraz liczb jest równa: " + ((double)a/b) );
                break;
            default:
                System.out.println("Podaleś opercję nie występującą w bazie !");
                break;
        }
    }
}

