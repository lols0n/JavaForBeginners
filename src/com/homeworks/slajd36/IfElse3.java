package com.homeworks.slajd36;

import java.util.Scanner;

public class IfElse3 {

//    3. *Jak wyżej, ale zamiast wartości operuj na łańcuchach znaków (Stringach). Na przykład dla słowa „gwiazdka” wyświetl „*”.

    public static void main(String[] args) {
        // write your code here
        Scanner wejscie = new Scanner(System.in);
        System.out.println("Podaj nazwę symbolu: ");
        String symbol = wejscie.nextLine();
        if(symbol.equals("wykrzynik")){
            System.out.println("Znak ukryty pod słowem " + symbol + " to '!' ");
        } else if (symbol.equals("małpa")) {
            System.out.println("Znak ukryty pod słowem " + symbol + " to '@' ");
        } else {
            System.out.println("Znak spoza listy ! Nie mogę wyświetlić");
        }
    }
}
