package part11;

// Video: https://www.youtube.com/watch?v=xk4_1vDrzzo&t=7151s
//        rewatch 1:59:10–2:03:35 for the String methods, 2:07:30–2:11:35 for wrapper classes
// Guide: GUIDE.md in this folder, steps 2–15
//
// SECTION C — Stretch. Do Stretch A, then Stretch B. The README says what each one should print.
//
// There is no main method here yet. Typing it is part of the stretch.

public class Stretch {
    public static void main(String[] args) {
        /*
        4
        a
        2
        JAVA
        Jovo
        false
        true
        Java
         */
        String word = "Java";
        System.out.println(word.length());
        System.out.println(word.charAt(1));
        System.out.println(word.indexOf("v"));
        System.out.println(word.toUpperCase());
        System.out.println(word.replace('a', 'o'));
        System.out.println(word.equals("java"));
        System.out.println(word.equalsIgnoreCase("java"));
        System.out.println(word);

        // B1
        String city = "  Dover  ";
        String clean = city.trim();
        System.out.println(clean.toUpperCase());
        System.out.println(clean.length());
        System.out.println(clean.charAt(0));

        // B2

        Integer apples = 5;
        Integer oranges = 10;
        int fruit = apples + oranges;
        Double price = 9.99;
        Boolean isOpen = true;

        System.out.println("Fruit: " + fruit);
        System.out.println("Two cost: " + price * 2);

        if (isOpen) {
            System.out.println("The store is open");
        }

        // B3
        String first = "Jordan";
        String last = "Smith";

        String username = "" + first.toLowerCase().charAt(0) + last.toLowerCase();

        System.out.println(username);
        System.out.println(username + "@desu.edu");
    }

}
