package org.example;

//13.1 Skapa en subklass som ärver från Animal. Subklassen ska vara en valfri djurart.
public class Cat extends Animal {
    public Cat(String name) {
        super(name);
    }

    // 13.2 Med hjälp av polymorfism skriv över makeSound metoden från superklassen
    // Animal och få ditt nya djur att göra ett nytt ljud.
    @Override
    public void makeSound() {
        System.out.println("Meow");
    }

}