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
        String word = "Java";
        System.out.println(word.length());
        System.out.println(word.charAt(1));
        System.out.println(word.indexOf("v"));
        System.out.println(word.toUpperCase());
        System.out.println(word.replace('a', 'o'));
        System.out.println(word.equals("java"));
        System.out.println(word.equalsIgnoreCase("java"));
        System.out.println(word);
        /* My Guess
        4
        a
        2
        JAVA
        Jovo
        Java = java wrong I interpreted the line as just saying that
        true
        Java
         */
        String city = "  Dover  ";
        String clean = city.trim();
        System.out.println(clean.toUpperCase());
        System.out.println(clean.length());
        System.out.println(clean.charAt(0));

        String first = "Jordan";
        String last = "Smith";

        String username = first.toLowerCase().charAt(0) + last.toLowerCase();

        System.out.println(username);
        System.out.println(username + "@desu.edu");

    }

}
