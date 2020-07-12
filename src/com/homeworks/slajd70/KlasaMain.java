package com.homeworks.slajd70;

//Stwórz 3 klasy: Czlowiek, Programista, JavaDeveloper.
//        a) Powiąż klasy:
//        • Czlowiek jest nadrzędny
//        • Programista dziedziczy po Czlowiek
//        • JavaDeveloper dziedziczy po Programista
//        b) Dla każdej z klas stwórz konstruktor, który wywoła konstruktor nadrzędny (jeśli istnieje) oraz wypisze informację o swoim wywołaniu, np. dla klasy Czlowiek powinniśmy otrzymać komunikat „Wywołanie konstruktora Czlowiek”.
//        c) Utwórz obiekt klasy JavaDeveloper
//        d) *Za pośrednictwem obiektu JavaDeveloper wywołaj dowolną metodę utworzoną w klasie Czlowiek, która przyjmie jeden parametr. Jaki powinna posiadać modyfikator dostępu?
//        e) **Przeciąż metodę z klasy Człowiek wewnątrz klasy JavaDeveloper tak, aby mogła przyjmować dodatkowe parametry.

public class KlasaMain {
    public static void main(String[] args) {
        Czlowiek czlek1 = new Czlowiek("Lekarz", "Pediatra", "Andrzej", "Gołota", 34);
        Programista prog1 = new Programista("Python Dev", "Jarek", "Ogarek", 29);
        JavaDeveloper jdev1 = new JavaDeveloper("John", "Mnemonik", 31);
        jdev1.wyswietlDane("Adam");
        jdev1.wyswietlDane("Adam", "Buksa");
    }
}
