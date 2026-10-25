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
// publicly accessed class called TwoDArrays
public class TwoDArrays {
    // the start of the program
    public static void main(String[] args) {
        // a 2D array of strings named cars
        String[][] cars = {
                // first row: Chevy models
                {"Camaro", "Corvette", "Silverado"},
                // second row: Ford models
                {"Mustang", "Ranger", "F-150"},
                // third row: Luxury/Electric models
                {"Ferrari", "Lambo", "Tesla"}
        };

        // outer loop iterates through each row of the 2D array
        for (int i = 0; i < cars.length; i++) {
            // prints a line break before each row
            System.out.println();

            // inner loop iterates through the columns of the current row
            for (int j = 0; j < cars[i].length; j++) {
                // print the car at the current row/column index followed by a space
                System.out.print(cars[i][j] + " ");
            }
        }
    }
}

