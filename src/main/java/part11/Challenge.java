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
        char firstInitial = first.toUpperCase().charAt(0);
        char secondInitial = last.toUpperCase().charAt(0);
        return "" +  firstInitial + "." + secondInitial + ".";
    }


    // swapEnds("code") should return "eodc"
    // swapEnds("a")    should return "a"    (shorter than 2 letters: give it back unchanged)
    public static String swapEnds(String s) {
        String result = "";

        if (s.length() < 2){
            return s;
        }
        char firstLetter = s.charAt(0);
        char lastLetter = s.charAt(s.length() - 1);
        // starting after 1 and going until just before the last element in s
        String middle = s.substring(1, s.length() - 1);


        return lastLetter + middle +  firstLetter;   // YOUR CODE
    }
}
