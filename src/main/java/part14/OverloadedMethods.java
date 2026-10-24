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

public class OverloadedMethods {
    public static void main(String[] args) {
        // calling the first add method that adds 1 and 2 and outputs 3 and sout attached with it
        int x = add(1, 2);
        System.out.println(x);
        // calling the second add method that adds 1 2 and 3 and outputs 6 and sout attached with it
        int y = add(1, 2, 3);
        System.out.println(y);
        // calling the third add method that adds 1 2 3 and 4 and outputs 10 and sout attached with it
        int z = add(1, 2, 3, 4);
        System.out.println(z);
        // calling the first double method that adds 1.0 2.0 3.0 and 4.0 and outputs 10.0 and sout attached with it
        double d = add(1.0, 2.0, 3.0, 4.0);
        System.out.println(d);


    }
    // the first instance of the add methods that just adds 2 int values
    static int add(int a, int b) {
        System.out.println("This is overload method #1");
        return a + b;
    }
    // the second instance of the add methods that adds 3 int values
    static int add(int a, int b, int c) {
        System.out.println("This is overloaded method #2");
        return a + b + c;
    }
    // the third  instance of the add methods that adds 4 int values
    static int add(int a, int b, int c, int d) {
        System.out.println("This is overloaded method #3");
        return a + b + c + d;
    }
    // the first instance of the double add methods that just adds 2 double values
    static double add(double a, double b) {
        System.out.println("This is overloaded method #4");
        return a + b;
    }
    // the second instance of the double add methods that adds 3 double values
    static double add(double a, double b, double c) {
        System.out.println("This is overloaded method #5");
        return a + b + c;
    }
    // the third instance of the double add methods that adds 4 double values
    static double add(double a, double b, double c, double d) {
        System.out.println("This is overloaded method #6");
        return a + b + c + d;
    }

}
