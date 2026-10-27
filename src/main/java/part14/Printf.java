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
        System.out.printf("This is a format string %d\n", 123);
        boolean myBoolean = true;
        char myChar = '@';
        String myString = "Bro";
        int myInt = 50;
        double myDouble = 1000;
        System.out.printf("%b\n", myBoolean);
        System.out.printf("%c\n", myChar);
        System.out.printf("%s\n", myString);
        System.out.printf("%d\n", myInt);
        System.out.printf("%f\n", myDouble);
        System.out.printf("Hello %10s\n", myString);System.out.printf("Hello %-10s!\n", myString);
        System.out.printf("You have this much money %f\n", myDouble);
        System.out.printf("You have this much money %.2f\n", myDouble);
        System.out.printf("You have this much money %.1f\n", myDouble);
        System.out.printf("You have this much money %-20f!\n", myDouble);
        System.out.printf("You have this much money %20f!\n", myDouble);
        System.out.printf("You have this much money %+f\n", myDouble);
        System.out.printf("You have this much money %+f\n", -myDouble);
        System.out.printf("You have this much money %020f\n", myDouble);
        System.out.printf("You have this much money %,f\n", myDouble);

    }

}
