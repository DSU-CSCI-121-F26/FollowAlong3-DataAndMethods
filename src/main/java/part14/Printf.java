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

// publicly accessed class called Printf
public class Printf {
    // Declares the main execution method where the program starts running
    public static void main(String[] args) {
        // Declares and initializes a boolean variable with the value true
        boolean myBoolean = true;
        // Declares and initializes a character variable with an asterisk
        char myChar = '*';
        // Declares and initializes a string variable with the name juwa
        String myString = "juwa";
        // Declares and initializes an integer variable with the value 50
        int myInt = 50;
        // Declares and initializes a double-precision floating-point variable with 1000
        double myDouble = 1000;

        // Prints the boolean value followed by a newline character using printf formatting
        System.out.printf("%b\n", myBoolean);
        // Prints the character value followed by a newline character using printf formatting
        System.out.printf("%c\n", myChar);
        // Prints the string value followed by a newline character using printf formatting
        System.out.printf("%s\n", myString);
        // Prints the integer value followed by a newline character using printf formatting
        System.out.printf("%d\n", myInt);
        // Prints the double value as a floating-point number with a newline
        System.out.printf("%f\n", myDouble);
        // 10 is the length of the string
        // Prints a greeting followed by the string right-padded with spaces to occupy 10 total width slots
        System.out.printf("Hello %10s\n", myString);
        // Prints a greeting followed by the string left-justified within a 10-character width slot, ending with an exclamation mark
        System.out.printf("Hello %-10s!\n", myString);

        // Prints a money label followed by the default formatted double value
        System.out.printf("You have this much money %f\n", myDouble);
        // Prints the double value formatted to display exactly two decimal places
        System.out.printf("You have this much money %.2f\n", myDouble);
        // Prints the double value formatted to display exactly one decimal place
        System.out.printf("You have this much money %.1f\n", myDouble);

        // Prints the double value left-aligned and padded with spaces to occupy a total width of 20 characters
        System.out.printf("You have this much money %-20f!\n", myDouble);
        // Prints the double value right-aligned and padded with leading spaces to fill a 20-character width slot
        System.out.printf("You have this much money %20f!\n", myDouble);
        // Prints the double value explicitly displaying a plus sign for positive numbers
        System.out.printf("You have this much money %+f\n", myDouble);
        // Prints the negated double value, automatically displaying a minus sign for the negative number
        System.out.printf("You have this much money %+f\n", -myDouble);
        // Prints the double value padded with leading zeros instead of spaces to reach a 20-character width
        System.out.printf("You have this much money %020f\n", myDouble);
        // Prints the double value formatted with locale-specific group separators like commas for thousands
        System.out.printf("You have this much money %,f\n", myDouble);
    }

}