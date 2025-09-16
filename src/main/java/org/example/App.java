package org.example;

import java.util.ArrayList;

public class App {
    public static void main(String[] args) {
        // 1. Skriv ut "Hello World" i konsolen.
        System.out.println("Hello World!");

        // 2. Skriv 4 olika variabler som har datatyperna int, double, String, boolean
        boolean a = true;
        double b = 3.2;
        int c = 4;
        String d = "Hello";

        // 3. Skriv en if-sats som kollar om värdet på din tidigare skapade int är ett
        // värde över 5.
        if (c > 5) {
            // Om värdet är större än 5 skriv ut i konsolen: "Siffran är mer än 5"
            System.out.println("Siffran är mer än 5");
        }

        // 4. Skriv en for loop som repeteras 5 gånger och skriver i varje iteration ut
        // i (antalet iterationer).
        for (int i = 0; i < 5; i++) {
            System.out.println(i);
        }

        // 5. Skapa en Array som har 5 ints.
        int[] arr = { 1, 2, 3, 4, 5 };
        // 6. Skapa en Array med 5 Strings.
        String[] arr2 = { "1", "2", "3", "4", "5" };

        // 7. Loopa igenom din andra array med strängar för att skriva ut samtliga
        // texter i Arrayen i var sin rad i konsolen.
        for (String s : arr2) {
            System.out.println(s);
        }

        // 8. Skapa en ArrayList av Integers som innehåller 5 integer som du väljer
        // själv.
        ArrayList<Integer> list = new ArrayList<>(java.util.Arrays.asList(1, 2, 3, 4, 5));
        // 9. Öka den fjärde siffrans värde med 4.
        list.set(3, list.get(3) + 4);

        // 9.1 Skriv ut hela ArrayListen i Konsolen.
        for (int i : list) {
            System.out.println(i);
        }

        // 10 forts. Kalla på metoden
        foo();

        // 11.1 Använd metoden och skriv ut resultatet i konsolen.
        System.out.println(add(3, 4));

        // 12.3 Instansiera klassen och kalla på objektets metod makeSound.
        Animal animal = new Animal("Generic Animal");
        animal.makeSound();

        // 13.3 Instansiera din subklass och kalla på metoden makeSound.
        Animal cat = new Cat("Nala");
        cat.makeSound();
    }

    // 10. Skriv en metod som skriver ut "Jag har skapat en metod i Java" metoden
    // ska inte returnera ett värde.
    public static void foo() {
        System.out.println("Jag har skapat en metod i Java");
    }

    // 11. Skriv en metod vid namn add som tar emot 2 integers och returnerar deras
    // summa (int).
    public static int add(int lhs, int rhs) {
        return lhs + rhs;
    }
}
