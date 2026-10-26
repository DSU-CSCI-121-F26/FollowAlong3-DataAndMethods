package part14;

// Video: https://www.youtube.com/watch?v=xk4_1vDrzzo&t=9954s
//        starts at about 2:45:54 — stop at about 2:56:50, when he says
//        "if you would like a copy of all this code"
// Guide: GUIDE.md in this folder, Video 2 — the same lesson, written out step by step
//
// Part 14, video 2 — the printf method
//
// SECTION A — FOLLOW ALONG: type the code from the video (or the guide) in this class.
//    His class is called Main. Yours is called Printf.
//    Leave the "package part14;" line and the "public class Printf" line alone.
//    Type everything else yourself.
//
// SECTION B — COMMENTS: when you finish, put a // comment ABOVE every line of code,
//    saying in YOUR OWN WORDS what that line does. The README shows an example.

public class Printf {
    public static void main(String[] args) {

        // Declares a boolean variable that stores true.
        boolean myBoolean = true;

        // Declares a char variable that stores the @ character.
        char myChar = '@';

        // Declares a String variable containing the word Bro.
        String myString = "Bro";

        // Declares an integer variable with a value of 50.
        int myInt = 50;

        // Declares a double variable with a value of 1000.
        double myDouble = 1000;


        // %b prints the boolean value as true or false.
        System.out.printf("%b%n", myBoolean);

        // %c prints a single character.
        System.out.printf("%c%n", myChar);

        // %10s prints the String right-aligned within 10 spaces.
        System.out.printf("Hello %10s%n", myString);

        // %-10s prints the String left-aligned within 10 spaces.
        System.out.printf("Hello %-10s!%n", myString);

        // %d prints an integer as a whole number.
        System.out.printf("%d%n", myInt);

        // %f prints a double with six decimal places by default.
        System.out.printf("%f%n", myDouble);


        // %f displays the double with six digits after the decimal.
        System.out.printf("You have this much money %f%n", myDouble);

        // %.2f displays the double rounded to two decimal places.
        System.out.printf("You have this much money %.2f%n", myDouble);

        // %.1f displays the double rounded to one decimal place.
        System.out.printf("You have this much money %.1f%n", myDouble);


        // %-30f left-aligns the double within a minimum width of 30 characters.
        System.out.printf("You have this much money %-30f!%n", myDouble);

        // %30f right-aligns the double within a minimum width of 30 characters.
        System.out.printf("You have this much money %30f!%n", myDouble);

        // %+f forces Java to display a plus sign for positive numbers.
        System.out.printf("You have this much money %+f%n", myDouble);

        // %+f displays the negative sign when the value is negative.
        System.out.printf("You have this much money %+f%n", -myDouble);

        // %020f fills unused character positions with zeros until the width is 20.
        System.out.printf("You have this much money %020f%n", myDouble);

        // %,f adds commas to separate groups of thousands.
        System.out.printf("You have this much money %,f%n", myDouble);
    }
}



