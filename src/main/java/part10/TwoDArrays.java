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
//creates a public class called TwoDArrays
public class TwoDArrays {
    //the main method what starts program
    public static void main(String[] args) {
        //creates a 2d array with 3 rows and 3 columns
        String[][] cars = {
                //The strings inside the 2d Array
                {"Camaro", "Corvette", "Silverado"},
                {"Mustang", "Ranger", "F-150"},
                {"Ferrari", "Lambo", "Tesla"}
        };
        //creates a nested for loop with the first for loop iterating over the rows
        for (int i = 0; i < cars.length; i++) {
            //prints a blank lime to make it cleaner
            System.out.println();
            //The Inner loop
            //prints through each column using cars[i].length whihc is 3 becaise each row is 3
            for (int j = 0; j < cars[i].length; j++) {
                //access the specific item in the array
                System.out.print(cars[i][j] + " ");
            }
        }
    }

}
