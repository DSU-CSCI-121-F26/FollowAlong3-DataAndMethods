package part12;

// Video: https://www.youtube.com/watch?v=xk4_1vDrzzo&t=7922s
//        (warm-up first — no video until the follow-along)

// Warm-up — 5 minutes, before the video. Practice, not graded.
//
// Open part11/Stretch.java. Look at your Stretch B1 code for 30 seconds. Then close it.
// Without looking again, type Stretch B1 into this file and run it.
// It should print the same thing it printed last time.
//
// You will need to type the main method yourself. That is part of the practice.

public class Warmup {
    public static void main(String[] args) {
        String city = "  Dover  ";
        String clean = city.trim();
        System.out.println(clean.toUpperCase());
        System.out.println(clean.length());
        System.out.println(clean.charAt(0));
    }
}
