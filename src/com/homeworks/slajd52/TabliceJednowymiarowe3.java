package com.homeworks.slajd52;

public class TabliceJednowymiarowe3 {

//    3. Stwórz tablicę zawierającą 5 imion. Wewnątrz pętli for-each dopisuj imiona do zmiennej typu String,
//    oddzielając je przecinkami. Wyświetl utworzony łańcuch znaków. Np. „Małgorzata, Jan, Jakub”.

    public static void main(String[] args) {

        String wypis = "";
        String tab[] = {"Ala", "Kasia", "Olga", "Tomek", "Marcin"};
        for (String pozycja: tab) {
            wypis = wypis.concat(pozycja + ", ");
        }
        System.out.println("Lista osób: " + wypis);

    }
}
