package part10;

// Video: https://www.youtube.com/watch?v=xk4_1vDrzzo&t=6222s
//        starts at 1:43:42 — stop at about 1:49:45, at "so that's what an array is"
// Guide: GUIDE.md in this folder, steps 1–6
//
// Part 10 — arrays (many values in one variable)
//
// SECTION A — FOLLOW ALONG: type the code from the video (or the guide) in this class.
//    His class is called Main. Yours is called ArrayBasics.
//    Leave the "package part10;" line and the class line alone. Type everything else.
//
// SECTION B — COMMENTS: when you finish, put a // comment ABOVE every line of code,
//    saying in YOUR OWN WORDS what that line does. The README shows an example.
// publicly accessed class called Array Basics
public class ArrayBasics {
    // start of the program
    public static void main(String[] args) {
        // this is an array of strings called cars that stores 3 elements
        String[] cars = new String[3];
        // the first string element in cars and it holds Camaro
        cars[0] = "Camaro";
        // the second string element in cars and it holds Corvette
        cars[1] = "Corvette";
        // the third string element in cars and it holds Tesla
        cars[2] = "Tesla";
        // prints the first element in the array cars which is Camaro
        System.out.println(cars[0]);
        // prints the second element in the array cars which is Corvette
        System.out.println(cars[1]);
        // prints the third element in the array cars which is Tesla
        System.out.println(cars[2]);
        /* for as long as the initialized integer i that is assigned
        the value 0 is less than the length of cars (which is 3)
        everytime the loop ends i is incremented by 1
         */
        for (int i = 0; i < cars.length; i++) {
            // this prints the car at the position of i in the array cars
            System.out.println(cars[i]);
        }
    }
}
