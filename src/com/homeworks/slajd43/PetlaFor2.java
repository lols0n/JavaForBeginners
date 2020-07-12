package com.homeworks.slajd43;

import java.util.Scanner;

public class PetlaFor2 {

//    2. Stwórz pętle for, która wykona 5 iteracji. Wewnątrz pętli pobieraj z konsoli dowolną wartość typu int. Po wyjściu z pętli zwróć sumę tych wartości.

    public static void main(String[] args) {


        Scanner wejscie = new Scanner(System.in);
        int suma = 0;
        int liczba;
        for (int i = 1; i <= 5; i++) {
            System.out.println("Podaj koleją liczbe");
            liczba = wejscie.nextInt();
            suma = suma + liczba;
        }
        System.out.println("Suma wpisanych liczb to: " + suma);
    }
}