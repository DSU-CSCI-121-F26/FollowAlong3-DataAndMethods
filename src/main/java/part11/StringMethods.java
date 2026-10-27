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
//A class called StringMethods
public class StringMethods {
    //Creates a main method the start of the program
    public static void main(String[] args) {
        //Creates a String variale mamed named that equals to Bro
        String name = "Bro";
        //Ignores the case when comparing
        boolean ignoreResult = name.equalsIgnoreCase("bro");
       //Prints the boolean
        System.out.println(ignoreResult);
        //Checks if the name is equal to the string
        boolean equalsResult = name.equals("bro");
        //Prints the results
        System.out.println(equalsResult);
        //Using an integer checks the length of the string
        int lengthResult = name.length();
        //prints the length result
        System.out.println(lengthResult);
        //Checks what character is at the index
        char charResult = name.charAt(0);
        //Prints the result
        System.out.println(charResult);
        //Using an integer finds what index the letter is at
        int indexResult = name.indexOf("o");
        //Prints the result
        System.out.println(indexResult);
        //Checks if the string is an empty string
        boolean emptyResult = name.isEmpty();
        //Prints teh result
        System.out.println(emptyResult);
        //Changes the string to upper case
        String upperResult = name.toUpperCase();
        //Prints the result
        System.out.println(upperResult);

        //Change the string to lowercase

        String lowerCaseResult = name.toLowerCase();
        //Prints the result
        System.out.println(lowerCaseResult);
        //Creates a variable that space Bro
        String spaced = "   Bro   ";
        //Trim the variable so there is no space
        String trimResult = spaced.trim();
        //Prints without it being trimmed
        System.out.println("[" + spaced + "]");
        //Prints the string trimmed
        System.out.println("[" + trimResult + "]");
        //Replace a letter in the string with a new one
        String replaceResult = name.replace('o', 'a');
        //Print the result of the replaced String
        System.out.println(replaceResult);
    }
}
