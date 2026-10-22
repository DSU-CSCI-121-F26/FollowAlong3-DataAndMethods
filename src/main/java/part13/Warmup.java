package part13;

// Video: https://www.youtube.com/watch?v=xk4_1vDrzzo&t=8874s
//        (warm-up first — no video until the follow-along)

// Warm-up — 5 minutes, before the video. Practice, not graded.
//
// Open part12/Stretch.java. Look at your Stretch B1 code for 30 seconds. Then close it.
// Without looking again, type Stretch B1 into this file and run it.
// It should print the same thing it printed last time.
//
// You will need to type the main method yourself. That is part of the practice.
// Part 12's B1 used an ArrayList, so you need the import line too:
// type  import java.util.ArrayList;  under the package line.

import java.util.ArrayList;

public class Warmup {
    public static void main(String[] args) {
        ArrayList<Integer> scores = new ArrayList<Integer>();
        scores.add(90);
        scores.add(75);
        scores.add(88);
        int sum = 0;
        for (int s : scores) {
            sum = sum + s;
        }
        System.out.println("Total: " + sum);

    }
}
