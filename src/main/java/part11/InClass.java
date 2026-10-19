package part11;

// Video: https://www.youtube.com/watch?v=xk4_1vDrzzo&t=7095s
//        rewatch 1:58:15–2:03:35 for the String methods, and the wrapper video after it
//
// In-class exercise — we do this together in class. Not graded, but commit it.
// The README (In-class exercise) has the steps and the output to match.

public class InClass {
    public static void main(String[] args) {

        String name = "  jordan smith  ";

        String trimmed = name.trim();
        System.out.println("[" + trimmed + "]");

        String upperCase = trimmed.toUpperCase();
        System.out.println("Shout: " + upperCase);

        int length = trimmed.length();
        System.out.println(length);

        char firstLetter = trimmed.charAt(0);
        System.out.println(firstLetter);

        char spaceAt = (char) trimmed.indexOf(" ");
        System.out.println(spaceAt);

        String replace = trimmed.replace(" ", "_");
        System.out.println(replace);

        boolean isItJSmith = false;
        System.out.println("Is it Jordan Smith: " + isItJSmith);



        // STEP 1 — we clean up a messy name together, here.



        // STEP 2 — fix the bugs. Each line below has ONE mistake.
        // Move ONE line at a time above the /* line, so Java sees it.
        // Read the red error. Fix it. Run it. Then do the next line.
        /*
        int size = "Sting".length;
        String initial = "Sting".charAt(0);
        String shout = "Sting".toUppercase();
        */
    }
}
