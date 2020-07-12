package com.homeworks.slajd81;

import java.io.FileNotFoundException;
import java.util.Scanner;
public class KalkulatorMain {
    public static int menu() {
        System.out.println("1. dodawanie");
        System.out.println("2. odejmowanie");
        System.out.println("3. mnozenie");
        System.out.println("4. dzielenie");
        System.out.println("Podaj rodzaj działania: ");
        Scanner wejscie = new Scanner(System.in);
        int w = wejscie.nextInt();
        return w;
    }
    public static void dodawanie(int a, int b){
        System.out.println("Suma liczb wynosi "+(a+b));
    }
    public static void odejmowanie(int a, int b){
        System.out.println("Roznica liczb wynosi "+(a-b));
    }
    public static void mnozenie(int a, int b){
        System.out.println("Iloczyn liczb wynosi "+(a*b));
    }
    public static void dzielenie(int a, int b) {
        if (b == 0) {
            System.out.println("Nie dziel przez 0");
        } else {
            System.out.println("Iloraz liczb wynosi " + ((double) a / b)); //radziłbym sprawdzać czy b nie jest 0...
        }
    }
    public static void main(String[] args) throws FileNotFoundException {
        // write your code here
        Scanner wejscie = new Scanner(System.in);
        int wybor;
        do {
            wybor = menu();
            int a, b;
            if (wybor != 0) {
                System.out.println("Podaj dwie liczby");
                a = wejscie.nextInt();
                b = wejscie.nextInt();
                switch (wybor) {
                    case 1:
                        dodawanie(a, b);
                        break;
                    case 2:
                        odejmowanie(a, b);
                        break;
                    case 3:
                        mnozenie(a, b);
                        break;
                    case 4:
                        dzielenie(a, b);
                        break;
                    default:
                        System.out.println("Podales zla liczbe");
                }
            }
        }
        while (wybor != 0) ;
    }
}
