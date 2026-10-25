package part13;

// Video: https://www.youtube.com/watch?v=xk4_1vDrzzo&t=8874s
//        starts at about 2:27:54 — stop at about 2:39:30, when he says "those are methods"
// Guide: GUIDE.md in this folder, steps 1–11
//
// Part 13 — methods
//
// SECTION A — FOLLOW ALONG: type the code from the video (or the guide) in this class.
//    His class is called Main. Yours is called Methods.
//    Leave the "package part13;" line and the "public class Methods" line alone.
//    Type everything else yourself.
//
// SECTION B — COMMENTS: when you finish, put a // comment ABOVE every line of code,
//    saying in YOUR OWN WORDS what that line does. The README shows an example.
// publicly accessed class Methods
public class Methods {
    // the start of the program
    public static void main(String[] args) {
        // create a String variable called name and store the text "Bro" in it
        String name = "Bro";
        // create an int variable called age and store the number 21 in it
        int age = 21;

        // call the hello method, passing name and age as arguments
        hello(name, age);

        // create an int variable x and set it to 3
        int x = 3;
        // create an int variable y and set it to 4
        int y = 4;

        // call add with x and y, and store the returned value (7) in z
        int z = add(x, y);
        // print the value of z (7) to the console
        System.out.println(z);
        // call add again and print its returned value (7) directly
        System.out.println(add(x, y));

        // call add, but the returned value (7) is discarded, so nothing visible happens
        add(x, y);

    }

    // define a method named hello that takes a String and an int and returns nothing (void)
    static void hello(String name, int age) {
        // print "Hello " joined with the name parameter (e.g. "Hello Bro")
        System.out.println("Hello " + name);
        // print "You are " joined with the age parameter (e.g. "You are 21")
        System.out.println("You are " + age);
    }

    // define a method named add that takes two ints and returns an int
    static int add(int x, int y) {
        // add the two parameters together and send the result back to the caller
        return x + y;
    }
}