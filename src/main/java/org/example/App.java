package org.example;

import java.util.ArrayList;

public class App {
    public static void main(String[] args) {
        System.out.println("Hello World!");

        boolean a = true;
        double b = 3.2;
        int c = 4;
        String d = "Hello";

        if (c > 5) {
            System.out.println("Siffran är mer än 5");
        }

        for (int i = 0; i < 5; i++) {
            System.out.println(i);
        }

        int[] arr = { 1, 2, 3, 4, 5 };
        String[] arr2 = { "1", "2", "3", "4", "5" };

        for (String s : arr2) {
            System.out.println(s);
        }

        ArrayList<Integer> list = new ArrayList<>(java.util.Arrays.asList(1, 2, 3, 4, 5));
        list.set(3, list.get(3) + 4);

        for (int i : list) {
            System.out.println(i);
        }

        foo();

        System.out.println(add(3, 4));

        Animal cat = new Cat("Nala");
        cat.makeSound();
    }

    public static void foo() {
        System.out.println("Jag har skapat en metod i Java");
    }

    public static int add(int lhs, int rhs) {
        return lhs + rhs;
    }
}
