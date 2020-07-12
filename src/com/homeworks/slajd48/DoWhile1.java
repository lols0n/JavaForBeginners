package com.homeworks.slajd48;

import java.util.Scanner;

public class DoWhile1 {

public static void main(String[]args){

//większe od 10



    Scanner wejscie = new Scanner(System.in);
    int suma = 0;
    int i = 1;
    int liczba;
do

    {
        System.out.println("Podaj kolejną liczbę: ");
        liczba = wejscie.nextInt();
        if (liczba > 10) {
            suma = suma + liczba;
        }
        i++;
    }while(i<=5);
}
}
