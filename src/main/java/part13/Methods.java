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
//Create a public class called method
public class Methods {
    //Create a method the start of the program
    public static void main(String[] args) {
        //Creates a string bro with the variable name
        String name = "Bro";
        //Creates a int 21 with the vairable age
        int age = 21;
        //Call the method hello with the argument name and age
        hello(name, age);
        //create the variable x with the number integer 3
        int x =3;
        //create the variable y with the number 4
        int y = 4;
        //create the variable z with the method that accepts the two paramters x and y
        int z = add(x,y);
        //print the z in the terminal
        System.out.println(z);
        //print it without using the varibale z
        System.out.println(add(x,y));

    }
    //creates a static void method that takes  aString title and int age
    static void hello(String title, int age) {
        //prinys hello + the variable title
        System.out.println("Hello " + title);
        //prints the you are with the variable age
        System.out.println("You are "+ age);
    }
    //Creates a static void method that takes add with a int x and int y
    static int add(int x, int y) {
        //return x + y which is adding them together
       return x+y;
    }

}
