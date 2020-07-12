package com.homeworks.slajd43;

import java.util.Scanner;

public class PetlaFor3 {

//    4. Wyświetl kwadrat składający się z samych gwiazdek „*”, których liczba (długość boku kwadratu) będzie równa podanej z konsoli wartości.

    public static void main(String[] args) {

        Scanner wejscie = new Scanner(System.in);
        int m = wejscie.nextInt();
        for (int i = 1; i <= m; i++) {
            for (int j = 1; j <= m; j++) {
                System.out.print("*  ");
            }
            System.out.println();
        }
    }
}
