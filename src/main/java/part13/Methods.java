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

public class Methods {//public class named Methods
    public static void main(String[] args) {//functions as the main method for the entry point of the program to run it
        String name = "Bro"; // variable of datatype String titled name with bro as its meaning
        int age = 21; //variable of data type int named age with value of 21
        hello(name, age); // prints out hello(method) attached with variables name and age
        int x = 3; // variable x of datatype int with value of 3
        int y = 4;//variable named why using datatype int equal to value of 4
        int answer = add(x, y); // variable type int named answer calls upon the add method
        System.out.println(answer);// prints variable answer
        System.out.println(add(x, y));// prints add method by itself without answer
    }

    // the method named hello that takes values and datatypes String name and int age, in addition to giving nothing back(the void)
    static void hello(String name, int age) {
        System.out.println("Hello " + name); // the system  prints out string Hello in addition to our variable(name)
        System.out.println("You are " + age);// system prints String "You are "  forging it with int age
    }   //makes a static method of add that takes 2 ints and gives back their sum in int
        static int add ( int x, int y){
            return x + y; // sends x + y to the main line that called add

        }


    }


