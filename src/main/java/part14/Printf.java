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
        // adds an int value to the front of the string which would be 123 and then whatever words are attached with it as well
        System.out.printf("%d This is a format string\n", 123);
        // declaring a boolean naming it myBoolean
        boolean myBoolean = true;
        // declaring a char calling it myChar
        char myChar = '@';
        // declaring a string named myString
        String myString = "Bro";
        // declaring a int called myInt
        int myInt = 50;
        // declaring a double for myDouble
        double myDouble = 1000;
        // prints the value stored in myBoolean using %b and moves to the next line
        System.out.printf("%b\n", myBoolean);
        // prints the character stored in myChar using %c and moves to the next line
        System.out.printf("%c\n", myChar);
        // prints the text stored in myString using %s and moves to the next line
        System.out.printf("%s\n", myString);
        // prints the whole number stored in myInt using %d without any decimal places
        System.out.printf("%d\n", myInt);
        // prints the value stored in myDouble using %f which shows six decimal places by default
        System.out.printf("%f\n", myDouble);
        // gives the string at least 10 characters of space and adds spaces before it to align it to the right
        System.out.printf("Hello %10s\n", myString);
        // gives the string at least 10 characters of space and uses the minus sign to add spaces after it
        System.out.printf("Hello %-10s!\n", myString);
        // prints the money amount with six decimal places because no specific decimal count is given
        System.out.printf("You have this much money %f\n", myDouble);
        // uses .2 to show exactly two digits after the decimal point like a normal money amount
        System.out.printf("You have this much money %.2f\n", myDouble);
        // uses .1 to show exactly one digit after the decimal point
        System.out.printf("You have this much money %.1f\n", myDouble);
        // gives the amount at least 20 characters of space and adds spaces after it before the exclamation point
        System.out.printf("You have this much money %-20f!\n", myDouble);
        // gives the amount at least 20 characters of space and adds spaces before it to align it to the righ
        System.out.printf("You have this much money %20f!\n", myDouble);
        // uses the plus flag to show a plus sign before the positive amount
        System.out.printf("You have this much money %+f\n", myDouble);
        // makes the amount negative and uses the plus flag which shows a minus sign for negative numbers
        System.out.printf("You have this much money %+f\n", -myDouble);
        // fills the space before the amount with zeros until the number takes up 20 characters including the decimal point
        System.out.printf("You have this much money %020f\n", myDouble);
        // uses the comma flag to separate groups of three digits so the amount is easier to read
        System.out.printf("You have this much money %,f\n", myDouble);

    }

}
