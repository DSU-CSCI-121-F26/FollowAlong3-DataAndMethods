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

public class Methods {
    public static void main(String[] args) {
        // a string that stores the name that will be used to run the method
        String name = "Bro";
        //stores the that that will be used to run the method
        int age = 21;
        // calls the string name and age it starts the method and whatever the method is asking for
        hello(name, age);
        // declaring the int value x and storing 3 as the value
        int x = 3;
        // declaring the int value y and storing 4 as the value
        int y = 4;
        // calls the method and does the work said in the method adding up both values together and outputting the sum
        add(x, y);

        addAgain(x, y);

    }
    // the method named hello which is called in the main.
    static void hello(String title, int age) {
        // outtputting hello plus the name stored by string
        System.out.println("Hello " + title);
        // outtputting you are with the age stored by the int
        System.out.println("You are " + age);
    }
    // another method that gets 2 integers and adds them together and returns the sum
    static int add(int x, int y) {
        // stores the sum from x and y added together
        int z = x + y;
        // prints out the sum when the method is called
        System.out.println(z);
        // what outputs when the method is called
        return z;
    }
    //creates another method thats the same as the one above just a little simpler
    static int addAgain(int x, int y) {
        return x + y;
    }
}
