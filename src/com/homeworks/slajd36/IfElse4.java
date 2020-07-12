package com.homeworks.slajd36;

public class IfElse4 {

//    4. Zadeklaruj trzy zmienne liczbowe (całkowite) i przypisz im wartości. Następnie wypisz wartość największej z nich.

    public static void main(String[] args) {
        // write your code here
        int liczba1 = 13;
        int liczba2 = 20;
        int liczba3 = 99;
        if( liczba1 > liczba2 && liczba1 > liczba3){
            System.out.println("Liczba1 jest największa i wynosi: " + liczba1);
        } else if (liczba2 > liczba1 && liczba2 > liczba3) {
            System.out.println("Liczba2 jest największa i wynosi: " + liczba2);
        } else if (liczba3 > liczba2 && liczba3 > liczba1) {
            System.out.println("Liczba3 jest największa i wynosi: " + liczba3);
        }
    }
}
