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

// Create a public class called Printf
public class Printf {

    // Main method - Java starts running here
    public static void main(String[] args) {

        // Print an integer using the %d format specifier
        System.out.printf("This is a format string %d\n", 123);

        // Create a boolean variable called myBoolean
        boolean myBoolean = true;

        // Create a char variable called myChar
        char myChar = '@';

        // Create a String variable called myString
        String myString = "Bro";

        // Create an int variable called MyInt
        int myInt = 50;

        // Create a double variable called myDouble
        double myDouble = 1000;

        // Print a boolean using %b
        System.out.printf("%b\n", myBoolean);

        // Print a char using %c
        System.out.printf("%c\n", myChar);

        // Print a String using %s
        System.out.printf("%s\n", myString);

        // Print an integer using %d
        System.out.printf("%d\n", myInt);

        // Print a decimal using %f
        System.out.printf("%f\n", myDouble);

        // Right-align the String in a field 10 characters wide
        System.out.printf("Hello %10s\n", myString);

        // Left-align the String in a field 10 characters wide uising -10
        System.out.printf("Hello %-10s!\n", myString);

        // Print a double with the default 6 decimal places
        System.out.printf("You have this much money %f\n", myDouble);

        // Print a double with exactly 2 decimal places
        System.out.printf("You have this much money %.2f\n", myDouble);

        // Print a double with exactly 1 decimal place
        System.out.printf("You have this much money %.1f\n", myDouble);

        // Left-align the number in a field 20 characters wide
        System.out.printf("You have this much money %-20f!\n", myDouble);

        // Right-align the number in a field 20 characters wide
        System.out.printf("You have this much money %20f!\n", myDouble);

        // Always show the sign +  of the number
        System.out.printf("You have this much money %+f\n", myDouble);

        // Show the sign for a negative number
        System.out.printf("You have this much money %+f\n", -myDouble);

        // Pad the number with leading zeros until width 20 is reached
        System.out.printf("You have this much money %020f\n", myDouble);

        // Add commas as thousands separators with the default 6 decimal places
        System.out.printf("You have this much money %,f\n", myDouble);

    } // end of main method

} // end of class