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
        // Declare and initialize a 2D string array containing rows of vehicle names
        String[][] twoDGrid = {
                {"Camaro", "Corvette", "Silverado"},
                {"Mustang", "Ranger", "F-150"},
                {"Ferrari", "Lambo", "Tesla"}
        };
        // Loop through each row of the 2D array starting from index 0
        for (int i = 0; i < twoDGrid.length; i++) {
            // Loop through each individual column item within the current row
            for (int j = 0; j < twoDGrid[i].length; j++) {
                // Print the current car name with a trailing space on the same line
                System.out.print(twoDGrid[i][j] + " ");
            }
            // Print an empty line to jump to the next row once a row finishes
            System.out.println();
        }
    }
}
