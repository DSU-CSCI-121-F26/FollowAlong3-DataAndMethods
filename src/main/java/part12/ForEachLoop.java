package part12;
// Import the ArrayList class from the java.util package so we can use dynamic lists
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
    public static void main(String[] args) {
        // Declare and initialize a standard fixed-size array of animal strings
        String[] animals = {"cat", "dog", "rat", "bird"};

        // Use a for-each loop to iterate through every element in the standard animals array
        for (String animal : animals) {
            // Print each animal string on a new line
            System.out.println(animal);
        }

        // Create an ArrayList of strings named animalList to hold dynamic elements
        ArrayList<String> animalList = new ArrayList<>();
        // Add the string "cat" to the animal ArrayList
        animalList.add("cat");
        // Add the string "dog" to the animal ArrayList
        animalList.add("dog");
        // Add the string "rat" to the animal ArrayList
        animalList.add("rat");
        // Add the string "bird" to the animal ArrayList
        animalList.add("bird");

        // Use a for-each loop to iterate through every element stored in the animalList
        for (String animal : animalList) {
            // Print each animal string from the ArrayList on a new line.
            System.out.println(animal);
        }
    }
}
