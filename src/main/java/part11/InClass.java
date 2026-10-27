package part11;

// Video: https://www.youtube.com/watch?v=xk4_1vDrzzo&t=7095s
//        rewatch 1:58:15–2:03:35 for the String methods, and the wrapper video after it
//
// In-class exercise — we do this together in class. Not graded, but commit it.
// The README (In-class exercise) has the steps and the output to match.

public class InClass {
    public static void main(String[] args) {

        // STEP 1 — we clean up a messy name together, here.
        String name = "  jordan smith  ";;
        String clean = name.trim();
        String replace = clean.replace(" ","_");

        System.out.println("Trimmed: ["+name.trim()+"]");
        System.out.println("Length: "+name.length());
        System.out.println("Shout: "+clean.toUpperCase());
        System.out.println("First letter: "+clean.charAt(0));
        System.out.println("Space at: "+clean.indexOf(" "));
        System.out.println("Handle: "+clean.replace(" ","_"));
        System.out.println("Is it Jordan_smith? "+replace.equals("jordan_smith"));
        System.out.println("Is it JORDAN_SMITH? "+replace.equalsIgnoreCase("JORDAN_SMITH"));
        System.out.println("Doubled: "+ (clean.length()*2));


        // STEP 2 — fix the bugs. Each line below has ONE mistake.
        // Move ONE line at a time above the /* line, so Java sees it.
        // Read the red error. Fix it. Run it. Then do the next line.

        int size = "Sting".length();//No parantheses
        char initial = "Sting".charAt(0);// Makw it char
        String shout = "Sting".toUpperCase();//The c capital

    }
}
