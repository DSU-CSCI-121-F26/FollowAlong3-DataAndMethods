package part10;

// Video: https://www.youtube.com/watch?v=xk4_1vDrzzo&t=6651s
//        starts at 1:50:51 — stop at about 1:57:41, at "so that is the basics of 2D arrays"
// Guide: GUIDE.md in this folder, steps 7–11
//
// Part 10 — 2D arrays (an array of arrays: rows and columns)
//
// SECTION A — FOLLOW ALONG: type the code from the video (or the guide) in this class.
//    His class is called Main. Yours is called TwoDArrays.
//    Leave the "package part10;" line and the class line alone. Type everything else.
//
// SECTION B — COMMENTS: when you finish, put a // comment ABOVE every line of code,
//    saying in YOUR OWN WORDS what that line does. The README shows an example.

public class TwoDArrays {
    public static void main(String[] args) {
        // another string array but like a double string array to make a parking lot
        String[][] cars = {
                // the values in the array, there are 9 total
                {"Camaro", "Corvette", "Silverado"},
                {"Mustang", "Ranger", "F-150"},
                {"Ferrari", "Lambo", "Tesla"}};
        // the for loop to read in all the array values starting from 0 which is the first value
        for (int i = 0; i < cars.length; i++) {
            // prinitng out a new line
            System.out.println();
            // another for loop that reads the cars in the array at i and printing them out based
            // upon their position which is what leads to the structure of the array
            for (int j = 0; j < cars[i].length; j++) {
                // prints out the cars together in the structure wanted
                System.out.println(cars[i][j] + " ");
            }
        }
    }

}
