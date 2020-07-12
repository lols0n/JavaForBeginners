package com.homeworks.slajd36;

import java.util.Scanner;

public class SwitchCase1 {
//
//    1. Zmodyfikuj przykładowy program tak, aby pobierana liczba pochodziła z konsoli.
//    Przetestuj program dla każdego przypadku (liczba mniejsza, równa lub większa od 10).
//    Podpowiedź: skorzystaj z metody Scannera „nextInt”.

    public static void main(String[] args) {
        // write your code here
        System.out.println("Podaj liczbę: ");
        Scanner wejscie = new Scanner(System.in);
        int naszaLiczba = wejscie.nextInt();
        // I sposób
//        switch (naszaLiczba){
//            case 10:
//                System.out.println("Nasza liczba jest równa od 10");
//                break;
//            case 100:
//                System.out.println("Nasza liczba jest równa 100 i jest wieksza od 10");
//                break;
//            default:
//                if (naszaLiczba > 10)
//                    System.out.println("Nasza liczba jest większa od 10");
//                else
//                    System.out.println("Nasza liczba jest mniejsza od 10");
//                break;
//        }
        // II sposób
        switch (naszaLiczba) {
            case 0:
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
                System.out.println("Nasza liczba jest mniejsza od 10");
                break;
            case 10:
                System.out.println("Nasza liczba jest równa od 10");
                break;
            default:
                System.out.println("Nasza liczba jest większa od 10");
                break;
        }
    }
}
