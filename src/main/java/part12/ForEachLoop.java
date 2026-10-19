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

public class ForEachLoop {
    public static void main(String[] args) {
        String[] animals = {"cat", "dog", "rat", "bird"};

        for (String i : animals) {
            System.out.println(i);
        }
        ArrayList<String> animalList = new ArrayList<String>();
        animalList.add("cat");
        animalList.add("dog");
        animalList.add("rat");
        animalList.add("bird");

        for (String i : animalList) {
            System.out.println(i);
        }

    }
}
