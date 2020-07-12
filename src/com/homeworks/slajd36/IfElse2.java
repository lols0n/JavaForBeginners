package com.homeworks.slajd36;

import java.util.Scanner;

public class IfElse2 {

//    2. Pobierz z konsoli wartość od 0 do 9. Na podstawie otrzymanej wartości wyświetl dowolny znak.
//    Na przykład dla numeru 0 wyświetl „”, dla 1 wyświetl „$” (lub dowolny inny).*

    public static void main(String[] args) {
        // write your code here
        Scanner wejscie = new Scanner(System.in);
        System.out.println("Podaj cyfrę: ");
        int cyfra = wejscie.nextInt();
        if(cyfra == 1){
            System.out.println("Znak ukryty pod cyfrą " + cyfra + " to '!' ");
        } else if (cyfra == 2) {
            System.out.println("Znak ukryty pod cyfrą " + cyfra + " to '@' ");
        } else {
            System.out.println("Znak spoza listy ! Nie mogę wyświetlić");
        }
    }
}

