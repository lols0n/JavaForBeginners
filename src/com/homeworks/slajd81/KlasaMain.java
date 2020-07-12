package com.homeworks.slajd81;

import java.io.FileNotFoundException;

public class KlasaMain {
    public static void main(String[] args) throws FileNotFoundException {
        // write your code here
        Pies p1 = new Pies("York","suczka",1);
        Pies p2 = new Pies("Jamnik","pies",2);
        System.out.println("Liczba utworzonych obiektów klasy pies to: " + p1.getLicznik());
    }
}
