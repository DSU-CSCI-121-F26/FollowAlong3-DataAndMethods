package part14;

// Video: https://www.youtube.com/watch?v=xk4_1vDrzzo&t=9618s
//        starts at about 2:40:18 — stop at about 2:45:29, when he says
//        "if you would like a copy of all this code"
// Guide: GUIDE.md in this folder, Video 1 — the same lesson, written out step by step
//
// Part 14, video 1 — overloaded methods
//
// SECTION A — FOLLOW ALONG: type the code from the video (or the guide) in this class.
//    His class is called Main. Yours is called OverloadedMethods.
//    Leave the "package part14;" line and the "public class OverloadedMethods" line alone.
//    Type everything else yourself.
//
// SECTION B — COMMENTS: when you finish, put a // comment ABOVE every line of code,
//    saying in YOUR OWN WORDS what that line does. The README shows an example.
// publicly accessed class called OverloadedMethods
public class OverloadedMethods {

    // the start of the program
    public static void main(String[] args) {

        // the int x is assigned to the method add with the parameters 1 and 2
        int x = add(1, 2);

        // prints x which is the add methods result of 3
        System.out.println(x);

        // the int y is assigned to the method add with the parameters 1, 2, and 3
        int y = add(1, 2, 3);

        // prints y which is the add methods result of 6
        System.out.println(y);

        // the int z is assigned to the method add with the parameters 1, 2, 3, and 4
        int z = add(1, 2, 3, 4);

        // prints z which is the add methods result of 10
        System.out.println(z);

        // the double variable d is assigned the result of the add method taking four double parameters
        double d = add(1.0, 2.0, 3.0, 4.0);

        // prints d which is the add methods result of 10.0
        System.out.println(d);
    }

    // A static method called add that takes two integers and returns their sum
    static int add(int a, int b) {

        // prints a message indicating that overloaded method #1 was called
        System.out.println("This is overloaded method #1");

        // returns the addition of parameters a and b
        return a + b;
    }

    // A static method called add that takes three integers and returns their sum
    static int add(int a, int b, int c) {

        // prints a message indicating that overloaded method #2 was called
        System.out.println("This is overloaded method #2");

        // returns the addition of parameters a, b, and c
        return a + b + c;
    }

    // A static method called add that takes four integers and returns their sum
    static int add(int a, int b, int c, int d) {

        // prints a message indicating that overloaded method #3 was called
        System.out.println("This is overloaded method #3");

        // returns the addition of parameters a, b, c, and d
        return a + b + c + d;
    }

    // A static method called add that takes two doubles and returns their sum
    static double add(double a, double b) {

        // prints a message indicating that overloaded method #4 was called
        System.out.println("This is overloaded method #4");

        // returns the addition of parameters a and b
        return a + b;
    }

    // A static method called add that takes three doubles and returns their sum
    static double add(double a, double b, double c) {

        // prints a message indicating that overloaded method #5 was called
        System.out.println("This is overloaded method #5");

        // returns the addition of parameters a, b, and c
        return a + b + c;
    }

    // A static method called add that takes four doubles and returns their sum
    static double add(double a, double b, double c, double d) {

        // prints a message indicating that overloaded method #6 was called
        System.out.println("This is overloaded method #6");

        // returns the addition of parameters a, b, c, and d
        return a + b + c + d;
    }

}
