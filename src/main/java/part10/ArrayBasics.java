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
        // Create a new string array designed to hold a maximum of 3 items
        String[] cars = new String[3];
        // Assign the string "Camaro" to index position 0 of the array
        cars[0] = "Camaro";
        // Assign the string "Corvette" to index position 1 of the array
        cars[1] = "Corvette";
        // Assign the string "Tesla" to index position 2 of the array
        cars[2] = "Tesla";
        // Print the element stored at index 0 to the console
        System.out.println(cars[0]);
        // Print the element stored at index 1 to the console
        System.out.println(cars[1]);
        // Print the element stored at index 2 to the console
        System.out.println(cars[2]);
        // Set up a for loop to iterate through every index of the array from start to finish
        for (int i = 0; i < cars.length; i++) {
            // Print out the value of the array element at the current index i
            System.out.println(cars[i]);
        }
    }
}

