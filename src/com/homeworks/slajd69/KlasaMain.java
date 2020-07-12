package com.homeworks.slajd69;

public class KlasaMain{
    public static void main(String[] args) {
        // write your code here
        ZwierzeDomowe tab [] =  {new Pies("Pekińczyk","pies",2),
                new Kot("Perski","kotka",3) };
        for(ZwierzeDomowe zwierze: tab){
            zwierze.dajGlos();
        }
    }
}
