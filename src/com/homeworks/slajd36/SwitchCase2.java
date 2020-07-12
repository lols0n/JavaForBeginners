package com.homeworks.slajd36;

import java.util.Scanner;

public class SwitchCase2 {

//5. Program sprawdzający czy użytkownik jest pełnoletni na podstawie wpisanego wieku:

    public static void main(String[] args) {
        // write your code here
        System.out.println("Podaj wiek: ");
        Scanner wejscie = new Scanner(System.in);
        int wiek= wejscie.nextInt();
        // I sposób
        switch (wiek){
            case 18:
                System.out.println("JESTES PELNOLETNI !");
                break;
            default:
                if (wiek> 18)
                    System.out.println("JESTES PELNOLETNI !");
                else
                    System.out.println("NIE JESTES PELNOLETNI !");
                break;
        }
//        // II sposób
//        switch (wiek) {
//            case 0:
//            case 1:
//            case 2:
//            case 3:
//            case 4:
//            case 5:
//            case 6:
//            case 7:
//            case 8:
//            case 9:
//            case 10:
//            case 11:
//            case 12:
//            case 13:
//            case 14:
//            case 15:
//            case 16:
//            case 17:
//                System.out.println("NIE JESTES PELNOLETNI !");
//                break;
//            default:
//                System.out.println("JESTES PELNOLETNI !");
//                break;
//        }
    }
}

