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
//Creates a class called Wrapper class
public class WrapperClasses {
    //The main method the start of the program
    public static void main(String[] args) {
        //Creates a variblae called Boolean that is true
        Boolean a = true;
        //Creates a Character b that is equal to '@'
        Character b = '@';
        //Creates an integer with the variable c that is equal to 123
        Integer c = 123;
        //Creates a Do4uble varibale that is equal to 3.1
        Double d = 3.14;

//An if condition to see if the variable is true
        if (a == true) {
            System.out.println("This is true");
        }
        //An if statement to see if B is true

        if (b == '@') {
            System.out.println("This is true");
        }
        //Ad 1 to the variable C
        System.out.println(c + 1);
        //Tiomes 2 the variable D
        System.out.println(d * 2);
    }

}
