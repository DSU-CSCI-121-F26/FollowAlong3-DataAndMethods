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

public class WrapperClasses {
    public static void main(String[] args) {
        // a boolean declared value that is automatically set to true
        Boolean a = true;
        // a char value being the at sign
        Character b = '@';
        // an integer assigned value that is 123
        Integer c = 123;
        // a double assigned value that is 3.14
        Double d = 3.14;
        // a string value that is declared as "Bro"
        String e = "Bro";
        // an if statement that souts This is true if the boolean a is equal to like to the exact to true
        if (a == true) {
            System.out.println("This is true");
        }
        // if the char value is equal to the exact of the @ symbol it will also sout this is true
        if (b == '@') {
            System.out.println("This is true");
        }
        // this just adds one to the int value c and that makes it 124
        System.out.println(c + 1);
        // this multiplies the double which is the shortened version of pi following its same format with
        // 2 values after the decimal and it souts 6.28
        System.out.println(d * 2);


    }

}
