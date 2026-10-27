package part13;

// Video: https://www.youtube.com/watch?v=xk4_1vDrzzo&t=9324s
//        rewatch 2:35:25–2:39:30 for return types
// Guide: GUIDE.md in this folder, steps 8–11
//
// SECTION D — Challenge. Two methods. The README explains each one.
// A test in src/test/java/part13/ChallengeTest.java checks your answers.
// Change ONLY the lines marked YOUR CODE. Do not change the test file.

public class Challenge {

    // sign(5)  should return "positive"
    // sign(-3) should return "negative"
    // sign(0)  should return "zero"
    public static String sign(int n) {
            if (n > 0) {
                return "positive";
            } else if (n < 0) {
                return "negative";
            } else {
                return "zero";
            }
          // YOUR CODE
    }

    // closerTo10(8, 13) should return 8    (8 is 2 away from 10, 13 is 3 away)
    // closerTo10(8, 12) should return 0    (a tie: both are 2 away)
    public static int closerTo10(int a, int b) {
        int distA = Math.abs(a - 10);
        int distB = Math.abs(b - 10);

        if (distA < distB) {
            return a;
        } else if (distB < distA) {
            return b;
        } else {
            return 0;
        }   // YOUR CODE
    }
}
//Completed 10-21 Hardest part is the Stretch
