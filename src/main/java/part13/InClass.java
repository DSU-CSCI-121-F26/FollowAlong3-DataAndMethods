package part13;

// Video: https://www.youtube.com/watch?v=xk4_1vDrzzo&t=8874s
//        rewatch 2:27:54–2:39:30 for methods, parameters and return
//
// In-class exercise — we do this together in class. Not graded, but commit it.
// The README (In-class exercise) has the steps and the output to match.

public class InClass {
    public static void main(String[] args) {

        // STEP 1 — this code works, but it repeats itself.
        // Together, we break it into three methods: line(), greet(...) and add(...).
        // Run it FIRST and look at the output. When we are done, it must print
        // exactly the same thing.
        System.out.println("----------");
        System.out.println("Hello, Davis!");
        System.out.println("----------");
        System.out.println("Hello, Brooks!");
        System.out.println("----------");
        int total = 7 + 3;
        System.out.println("Total yards: " + total);
        int total2 = 12 + 30;
        System.out.println("Total yards: " + total2);

        // STEP 2 — fix the bugs. Do this AFTER step 1, once your three methods exist.
        // Each line below has ONE mistake.
        // Move ONE line at a time above the /* line, so Java sees it.
        // Read the red error. Fix it. Run it. Then do the next line.
        /*
        line;
        greet();
        String yards = add(2, 3);
        */
    }

    // Your new methods go here: after main's closing } and before the class's closing }.

}
