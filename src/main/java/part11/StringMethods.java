package part11;

// Video: https://www.youtube.com/watch?v=xk4_1vDrzzo&t=7095s
//        starts at about 1:58:15 — stop at about 2:03:35, when he says "those are a few of the more useful String methods"
// Guide: GUIDE.md in this folder, steps 1–10
//
// Part 11 — String methods
//
// SECTION A — FOLLOW ALONG: type the code from the video (or the guide) in this class.
//    His class is called Main. Yours is called StringMethods.
//    Leave the "package part11;" line and the "public class StringMethods" line alone.
//    Type everything else yourself.
//
// SECTION B — COMMENTS: when you finish, put a // comment ABOVE every line of code,
//    saying in YOUR OWN WORDS what that line does. The README shows an example.
// A publicly accessed class called StringMethods
public class StringMethods {
    // the start of the program
    public static void main(String[] args) {

        // initialization of a String named name assigned to "Bro
        String name = "Bro";

        // initialization of a boolean variable named equalsResult assigned to see if the name equals "Bro"
        boolean equalsResult = name.equals("Bro");
        // this prints if name equals Bro which is true
        System.out.println(equalsResult);

        // initialization of a boolean variable named lowerResult assigned to see if the name equals "bro"
        boolean lowerResult = name.equals("bro");
        // this prints if name equals bro which is false
        System.out.println(lowerResult);

        /* initialization of a boolean variable named ignoreResult
         assigned to see if the name equals "bro" without caring if it is uppercase or lowercase
         */
        boolean ignoreResult = name.equalsIgnoreCase("bro");
        // this prints if name equals bro which is true
        System.out.println(ignoreResult);

        // initialization of a integer variable named lengthResult assigned the length of name
        int lengthResult = name.length();
        // this prints 3 - the length of name
        System.out.println(lengthResult);

        // initialization of a boolean variable named lowerResult assigned to see if the name equals "bro"
        char charResult = name.charAt(0);
        // this prints the character at the index 0 which is B in name
        System.out.println(charResult);

        // initialization of a integer variable named indexResult assigned to the index of the o in name
        int indexResult = name.indexOf("o");
        // this prints the index of the character 0 which is 2 - it starts at 0
        System.out.println(indexResult);

        // initialization of a boolean variable named emptyResult assigned to see if the name equals "bro"
        boolean emptyResult = name.isEmpty();
        // this prints if the result is empty and its false
        System.out.println(emptyResult);

        // initialization of a String variable named upperResult assigned to make name uppercase
        String upperResult = name.toUpperCase();
        // this prints BRO
        System.out.println(upperResult);

        // initialization of a boolean variable named lowerCaseResult assigned to make name lowercase
        String lowerCaseResult = name.toLowerCase();
        //this prints bro
        System.out.println(lowerCaseResult);

        // initialization of a string variable named spaced assigned to "   Bro   "
        String spaced = "   Bro   ";
        // this String variable stores the trimmed string of Bro in trim result
        String trimResult = spaced.trim();
        // this prints out [   Bro   ]
        System.out.println("[" + spaced + "]");
        // this prints [Bro]
        System.out.println("[" + trimResult + "]");

        // initialization of a string variable named replaceResult assigned to replacing the o with a in Bro
        String replaceResult = name.replace('o', 'a');
        // this prints Bra
        System.out.println(replaceResult);



    }

}
