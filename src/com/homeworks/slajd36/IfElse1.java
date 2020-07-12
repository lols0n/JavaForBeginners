package com.homeworks.slajd36;

import java.util.Scanner;

public class IfElse1 {

//    1. Zmodyfikuj przykładowy program tak, aby pobierana liczba pochodziła z konsoli.
//    Przetestuj program dla każdego przypadku (liczba mniejsza, równa lub większa od 10).
//    Podpowiedź: skorzystaj z metody Scannera „nextInt”.

    public static void main(String[] args) {

        Scanner wejscie = new Scanner(System.in);
        System.out.println("Podaj liczbę");
        int naszaLiczba = wejscie.nextInt();
        if(naszaLiczba < 10){
            System.out.println("Nasza liczba jest mniejsza od 10");
        } else if (naszaLiczba == 10) {
            System.out.println("Nasza liczba jest równa 10");
        } else {
            System.out.println("Nasza liczba jest większa od 10");
        }
    }
}

