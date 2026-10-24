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
    public static void main(String[] args) {
        // another way to start an array based off of the java import of it
        ArrayList<String> food = new ArrayList<String>();
        // adding into the array pizza, hamburger, and hotdog as values in the array
        food.add("pizza");
        food.add("hamburger");
        food.add("hotdog");
        // a for loop to reaad out every value in the array, when the array list is sout
        // like this one you have to do size instead of length
        for (int i = 0; i < food.size(); i++) {
            // printing out all the values in the array
            System.out.println(food.get(i));
        }
        // similar to the replace function on strings the changes the initial value entered
        // at 0 to a new value and printing it out
        food.set(0, "sushi");
        System.out.println(food);
        // removes the value at that stored place in the index of the array
        food.remove(2);
        System.out.println(food);
        // deletes all the values from the list and makes it clear
        food.clear();
        System.out.println(food);

    }

}
