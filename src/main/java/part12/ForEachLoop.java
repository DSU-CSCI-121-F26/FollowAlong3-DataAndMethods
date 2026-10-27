package part12;

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

import java.util.ArrayList;
// A public class called ForEachLoop
public class ForEachLoop {
    //The main method
    public static void main(String[] args) {
        //Creates A string of an array of animals
        String[] animals = {"cat", "dog", "rat", "bird"};
        //A for each loop that goes through each iteration of String
        for (String i : animals) {
            //print the current animal stores in i
            System.out.println(i);
        }
        //Creates an Array list of strings called animalList
        ArrayList<String> animalList = new ArrayList<String>();
        //Adds the animales in each arrau list
        animalList.add("cat");
        animalList.add("dog");
        animalList.add("rat");
        animalList.add("bird");

        //Creates a for each loop that goes through each element in the arrayList
        for (String i : animalList) {
            //print the current animals in the arraylist
            System.out.println(i);
        }

    }
}
