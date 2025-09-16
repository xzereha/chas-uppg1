package org.example;

//12.1 Skriv en klass som heter Animal. Animal ska ha en namnvariabel (String).
public class Animal {
    private String name;

    public Animal(String name) {
        this.name = name;
    }

    // 12.2 Skapa en metod som skriver ut i konsolen när man kallar på metoden. Döp
    // metoden makeSound.
    public void makeSound() {
        System.out.println("woof?");
    }
}
