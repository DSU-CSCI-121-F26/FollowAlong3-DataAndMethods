package part11;

// Video: https://www.youtube.com/watch?v=xk4_1vDrzzo&t=7467s
//        starts at about 2:04:27 — stop at about 2:11:35, when he says "that's the basics of wrapper classes"
// Guide: GUIDE.md in this folder, steps 11–15
//
// Part 11 — wrapper classes
//
// SECTION A — FOLLOW ALONG: type the code from the video (or the guide) in this class.
//    His class is called Main. Yours is called WrapperClasses.
//    Leave the "package part11;" line and the "public class WrapperClasses" line alone.
//    Type everything else yourself.
//
// SECTION B — COMMENTS: when you finish, put a // comment ABOVE every line of code,
//    saying in YOUR OWN WORDS what that line does. The README shows an example.
// publicly accessed class called WrapperClasses
public class WrapperClasses {
    // the start of the program
    public static void main(String[] args) {

        // declares a Boolean wrapper object named a and assigns it the value true
        Boolean a = true;
        // declares a Character wrapper object named b and assigns it the character '@'
        Character b = '@';
        // declares an Integer wrapper object named c and assigns it the integer value 123
        Integer c = 123;
        // declares a Double wrapper object named d and assigns it the floating-point value 3.14
        Double d = 3.14;
        // declares a String object named e and assigns it the text value "Bro"
        String e = "Bro";

        // checks if the Boolean variable a evaluates to true
        if (a == true) {
            // prints "This is true" to the console if the condition is met
            System.out.println("This is true");
        }

        // checks if the Character variable b equals the character '@'
        if (b == '@') {
            // prints "This is true" to the console if the condition is met
            System.out.println("This is true");
        }
    }
}