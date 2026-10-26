package part12;
// Import the ArrayList class from the java.util package so we can use dynamic lists
import java.util.ArrayList;
// Video: https://www.youtube.com/watch?v=xk4_1vDrzzo&t=7922s
//        starts at about 2:12:02 — stop at about 2:16:20, when he says "that is ArrayLists in Java"
// Guide: GUIDE.md in this folder, steps 1–6
//
// Part 12 — ArrayList
//
// SECTION A — FOLLOW ALONG: type the code from the video (or the guide) in this class.
//    His class is called Main. Yours is called ArrayLists.
//    Leave the "package part12;" line and the "public class ArrayLists" line alone.
//    Type everything else yourself.
//
// SECTION B — COMMENTS: when you finish, put a // comment ABOVE every line of code,
//    saying in YOUR OWN WORDS what that line does. The README shows an example.

public class ArrayLists {
    public static void main(String[] args) {
        // Create a new dynamic ArrayList designed to hold String elements named food
        ArrayList<String> food = new ArrayList<>();

        // Add the string "pizza" to the end of the food ArrayList
        food.add("pizza");
        // Add the string "hamburger" to the food ArrayList
        food.add("hamburger");
        // Add the string "hotdog" to the food ArrayList
        food.add("hotdog");

        // Set up a for loop to iterate from index 0 up to the current size of the food list
        for (int i = 0; i < food.size(); i++) {
            // Print out the element located at index i of the ArrayList
            System.out.println(food.get(i));
        }

        // Replace the element at index 0 ("pizza") with "sushi
        food.set(0, "sushi");
        // Print the entire ArrayList showing the updated contents inside brackets
        System.out.println(food);

        // Remove the element located at index 2 ("hotdog") from the list
        food.remove(2);
        // Print the modified ArrayList after the removal
        System.out.println(food);

        // Remove all elements from the ArrayList, making it completely empty
        food.clear();
        // Print the empty ArrayList, which will output empty brackets.
        System.out.println(food);
    }
}

