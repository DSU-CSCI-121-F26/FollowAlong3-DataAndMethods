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
    public static void main(String[] args) {
        // the regular way many people write out an array
        String[] animals = {"cat", "dog", "rat", "bird"};
        // a way to read an array from 0 to whenever it ends in a for loop
        for (String i : animals) {
            // printing out all the values on a new line after each iteration of the loop is ran
            System.out.println(i);
        }
        // the way to write an array with the import way and stuff
        ArrayList<String> animalList = new ArrayList<String>();
        // adding cat to the animal list first
        animalList.add("cat");
        // adding dog to the animal list 2nd value
        animalList.add("dog");
        // adding rat to the animal list as the 3rd value
        animalList.add("rat");
        // adding bird to the animal list as the 4th value
        animalList.add("bird");
        // the for loop with the new way of knowing to read the list
        for (String i : animalList) {
            // printing each value of the animal list starting from index 0 on a new line after each iteration
            System.out.println(i);
        }
    }

}
