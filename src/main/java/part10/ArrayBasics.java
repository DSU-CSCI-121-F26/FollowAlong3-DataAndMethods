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

public class ArrayBasics {
    public static void main(String[] args) {
        // declaring the array naming it cars and letting it be know it is a string array with 3 values
        String[] cars = new String[3];
        // the first value stored in the array being a mustang
        cars[0] = "Mustang";
        // the second value stored in the array being a corvette
        cars[1] = "Corvette";
        // the last value stored in the array being a tesla
        cars[2] = "Tesla";
        // outputting the first value in the array which all arrays start at 0
        System.out.println(cars[0]);
        // outputting the second value in the array
        System.out.println(cars[1]);
        // outputting the third value in the array
        System.out.println(cars[2]);
        // a for loop that reads and prints out all the array values by going until it reaches the end of the array
        // and it prints out all the array values from 0-2
        for (int i = 0; i < cars.length; i++) {
            // souts the array in order on a new line everytime
            System.out.println(cars[i]);
        }


    }

}
