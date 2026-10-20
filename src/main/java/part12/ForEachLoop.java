package part12;
import java.util.ArrayList;
// Video: https://www.youtube.com/watch?v=xk4_1vDrzzo&t=8637s
//        starts at about 2:23:57 — stop at about 2:27:20, when he says "that is everything you need to know to get started with the for-each loop"
// Guide: GUIDE.md in this folder, steps 11–13
//
// Part 12 — the for-each loop
//
// SECTION A — FOLLOW ALONG: type the code from the video (or the guide) in this class.
//    His class is called Main. Yours is called ForEachLoop.
//    Leave the "package part12;" line and the "public class ForEachLoop" line alone.
//    Type everything else yourself.
//
// SECTION B — COMMENTS: when you finish, put a // comment ABOVE every line of code,
//    saying in YOUR OWN WORDS what that line does. The README shows an example.

public class ForEachLoop {
    // the start of the program
    public static void main(String[] args) {
        // declares and initializes a String array named animals with four elements
        String[] animals = {"cat", "dog", "rat", "bird"};

        // starts a for each loop to iterate through each string element in the animals array, calling each one i
        for (String i : animals) {
            // prints the current animal variable i to the console
            System.out.println(i);
            // closes the array for each loop block
        }

        // creates a new ArrayList of Strings named animalList
        ArrayList<String> animalList = new ArrayList<String>();
        // adds "cat" to the animalList
        animalList.add("cat");
        // adds "dog" to the animalList
        animalList.add("dog");
        // adds "rat" to the animalList
        animalList.add("rat");
        // adds "bird" to the animalList
        animalList.add("bird");

        // starts a for each loop to iterate through each string element in the animalList, calling each one i
        for (String i : animalList) {
            // prints the current animal variable i to the console
            System.out.println(i);
        }
    }
}