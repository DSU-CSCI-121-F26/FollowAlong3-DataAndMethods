package part11;

// Video: https://www.youtube.com/watch?v=xk4_1vDrzzo&t=7151s
//        rewatch 1:59:10–2:03:35 for charAt, toUpperCase and the other String methods
// Guide: GUIDE.md in this folder, steps 2–10
//
// SECTION D — Challenge. Two methods. The README explains each one.
// A test in src/test/java/part11/ChallengeTest.java checks your answers.
// Change ONLY the lines marked YOUR CODE. Do not change the test file.

public class Challenge {

    // initials("jordan", "smith") should return "J.S."
    // initials("Ada", "Lovelace") should return "A.L."
    public static String initials(String first, String last) {
        // Get first letter of first name, uppercase
        char firstInitial = first.toUpperCase().charAt(0);

        // Get first letter of last name, uppercase
        char lastInitial = last.toUpperCase().charAt(0);

        // Build the string safely using a String in between
        return firstInitial + "." + lastInitial + ".";  // YOUR CODE
    }

    // swapEnds("code") should return "eodc"
    // swapEnds("a")    should return "a"    (shorter than 2 letters: give it back unchanged)
    public static String swapEnds(String s) {
        // If the string is too short to swap, return it unchanged
        if (s.length() < 2) {
            return s;
        }

        // First and last characters
        char first = s.charAt(0);
        char last = s.charAt(s.length() - 1);

        // Middle section (everything except first and last)
        String middle = s.substring(1, s.length() - 1);

        // Build swapped string
        return last + middle + first;   // YOUR CODE
    }
}
//COmpleted at 10-19 Hardest part was the challenge
