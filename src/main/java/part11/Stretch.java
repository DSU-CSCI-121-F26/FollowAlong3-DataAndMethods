package part11;

// Video: https://www.youtube.com/watch?v=xk4_1vDrzzo&t=7151s
//        rewatch 1:59:10–2:03:35 for the String methods, 2:07:30–2:11:35 for wrapper classes
// Guide: GUIDE.md in this folder, steps 2–15
//
// SECTION C — Stretch. Do Stretch A, then Stretch B. The README says what each one should print.
//
// There is no main method here yet. Typing it is part of the stretch.

import java.util.Locale;

public class Stretch {
    public static void main(String[] args) {

        String word = "Java";
        // souts 4
        System.out.println(word.length());
        // souts a
        System.out.println(word.charAt(1));
        // souts 2
        System.out.println(word.indexOf("v"));
        // souts JAVA
        System.out.println(word.toUpperCase());
        // souts Jovo
        System.out.println(word.replace('a', 'o'));
        // souts false
        System.out.println(word.equals("java"));
        // souts true
        System.out.println(word.equalsIgnoreCase("java"));
        // souts Java
        System.out.println(word);

        // correct on all

        String city = "  Dover   ";
        String clean = city.trim();
        System.out.println(clean.toUpperCase());
        System.out.println(clean.length());
        System.out.println(clean.charAt(0));

        int apples = 5;
        int oranges = 10;
        int fruit = apples + oranges;
        double price = 9.99;
        boolean isOpen = true;

        System.out.println("Fruit: " + fruit);
        System.out.println("Two cost: " + price * 2);
        if (isOpen == true) {
            System.out.println("The store is open");
        } else {
            System.out.println("The store is closed");
        }

        String first = "Jordan";
        String last = "Smith";

        String firstInitial = String.valueOf(first.toLowerCase().charAt(0));
        String lower = last.toLowerCase();

        System.out.println(firstInitial + lower + "@desu.edu");








    }

}
