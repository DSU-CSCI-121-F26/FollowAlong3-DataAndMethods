package part12;
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
    // the start of the program
    public static void main(String[] args) {
        // creates a new ArrayList of Strings named food to store text items
        ArrayList<String> food = new ArrayList<String>();

        // adds the string "pizza" to the end of the food list
        food.add("pizza");
        // adds the string "hamburger" to the end of the food list
        food.add("hamburger");
        // adds the string "hotdog" to the end of the food list
        food.add("hotdog");

        // loops through each index of the food list from 0 up to its size
        for (int i = 0; i < food.size(); i++) {
            // prints the element at the current index i to the console
            System.out.println(food.get(i));
            // closes the for loop block
        }

        // replaces the element at index 0 with "sushi"
        food.set(0, "sushi");
        // prints the entire food list contents to the console
        System.out.println(food);

        // removes the element located at index 2 from the food list
        food.remove(2);
        // prints the updated food list contents to the console
        System.out.println(food);

        // removes all elements from the food list, making it empty
        food.clear();
        // prints the now-empty food list to the console
        System.out.println(food);
    }

}
