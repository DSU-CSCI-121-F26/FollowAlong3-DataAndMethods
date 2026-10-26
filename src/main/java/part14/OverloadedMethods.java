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
// makes a class called OverloadedMethods
public class OverloadedMethods {
    public static void main(String[] args) {//
        // Calls the first add method, which accepts two integers.
        // Stores the returned sum (3) in x and prints it.
        int x = add(1, 2);
        System.out.println(x);
        // Calls the second add method, which accepts three integers.
        // Stores the returned sum (6) in y and prints it.
        int y = add(1, 2, 3);
        System.out.println(y);
        // Calls the third add method, which accepts four integers.
        // Stores the returned sum (10) in z and prints it.
        int z = add(1, 2, 3, 4);
        System.out.println(z);
    }
    // First overloaded method: accepts two integers.
    // Adds both numbers and returns their sum.
    static int add(int a, int b) {
        System.out.println("This is overloaded method #1");
        return a + b;
        /*
         * Adds two integers together and returns their sum.
         * This is the first overloaded version of the add method.
         *
         * @param a The first integer
         * @param b The second integer
         * @return The sum of a and b
         */
    }
    // Second overloaded method: accepts three integers.
    // Adds all three numbers and returns their sum.
    static int add(int a, int b, int c) {
        System.out.println("This is overloaded method #2");
        return a + b + c;
        /*
         * Adds three integers together and returns their sum.
         * This overloaded method accepts one additional parameter.
         *
         * @param a The first integer
         * @param b The second integer
         * @param c The third integer
         * @return The sum of a, b, and c
         */
    }
    // Third overloaded method: accepts four integers.
    // Adds all four numbers and returns their sum.
    static int add(int a, int b, int c, int d) {
        System.out.println("This is overloaded method #3");
        return a + b + c + d;
        /*
         * Adds four integers together and returns their sum.
         * This overloaded method accepts four parameters.
         *
         * @param a The first integer
         * @param b The second integer
         * @param c The third integer
         * @param d The fourth integer
         * @return The sum of all four integers
         */
    }
}

