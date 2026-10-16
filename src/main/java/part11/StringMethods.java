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

import java.util.Locale;

public class StringMethods {
    public static void main(String[] args) {
        // declaring a refernce type string with the value of bro
        String name = "Bro";
        // declaring a boolean to sout either true or false based if the name is equal to bro and it does so it souts true
        boolean equalsResult = name.equalsIgnoreCase("bro");
        System.out.println(equalsResult);
        // declaring an int to find the length of bro which is 3 bc length starts at 1
        int lengthResult = name.length();
        System.out.println(lengthResult);
        // finding the letter stored at said index value which is B
        char charResult = name.charAt(0);
        System.out.println(charResult);
        // this does the opposite of above which sends the index value of the letter and for o it would be 2bc it starts at 0
        int indexResult = name.indexOf("o");
        System.out.println(indexResult);
        // souts true or false dependent on if the string value is empty so for this instance it would be false
        boolean emptyResult = name.isEmpty();
        System.out.println(emptyResult);
        // this capitalizes everything in string value sout "BRO"
        String upperResult = name.toUpperCase();
        System.out.println(upperResult);
        // this lower cases everything in the string so it would be all just "bro"
        String lowerResult = name.toLowerCase();
        System.out.println(lowerResult);
        // the first time it just souts out "[     bro    ]"
        // so this string is spaced so when they trim it takes off all the trimmed space will be deleted and it would be "[Bro]"
        String spaced = "   Bro    ";
        String trimResult = spaced.trim();
        System.out.println("[" + spaced + "]");
        System.out.println("[" + trimResult + "]");
        // the replacement replaces a char with a new char so the sout will be "bra"
        String replaceResult = name.replace('o', 'a');
        System.out.println(replaceResult);

    }

}
