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

// Create a class called OverloadedMethods
public class OverloadedMethods {

    // Main method - program starts here
    public static void main(String[] args) {

        // Call the add method that takes 3 ints
        // Store the returned value in y
        int y = add(1, 2, 3);

        // Print the value of y
        System.out.println(y);

        // Call the add method that takes 4 ints
        // Store the returned value in z
        int z = add(1, 2, 3, 4);

        // Print the value of z
        System.out.println(z);

        // Call the add method that takes 4 doubles
        // Store the returned value in d
        double d = add(1.0, 2.0, 3.0, 4.0);

        // Print the value of d
        System.out.println(d);
    }

    // Overloaded method #1
    // Accepts 3 int parameters
    static int add(int a, int b, int c) {

        // Print which overloaded method was called
        System.out.println("This is overloaded method #1");

        // Return the sum of a and b
        // NOTE: c is not being used here
        return a + b;
    }

    // Overloaded method #2
    // Accepts 4 int parameters
    static int add(int a, int b, int c, int d) {

        // Return the sum of all 4 integers
        return a + b + c + d;
    }

    // Overloaded method #3
    // Accepts 2 double parameters
    static double add(double a, double b) {

        // Print which overloaded method was called
        System.out.println("This is overloaded method #4");

        // Return the sum of the two doubles
        return a + b;
    }

    // Overloaded method #4
    // Accepts 3 double parameters
    static double add(double a, double b, double c) {

        // Print which overloaded method was called
        System.out.println("This is overloaded method #5");

        // Return the sum of the three doubles
        return a + b + c;
    }

    // Overloaded method #5
    // Accepts 4 double parameters
    static double add(double a, double b, double c, double d) {

        // Print which overloaded method was called
        System.out.println("This is overloaded method #6");

        // Return the sum of the four doubles
        return a + b + c + d;
    }

} // End of class