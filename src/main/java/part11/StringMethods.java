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

        String name = "Bro";

        boolean equalsResult = name.equalsIgnoreCase("bro");
        System.out.println(equalsResult);

        int lengthResult = name.length();
        System.out.println(lengthResult);

        char charResult = name.charAt(0);
        System.out.println(charResult);

        int indexResult = name.indexOf("o");
        System.out.println(indexResult);

        boolean emptyResult = name.isEmpty();
        System.out.println(emptyResult);

        String upperResult = name.toUpperCase();
        System.out.println(upperResult);

        String lowerResult = name.toLowerCase();
        System.out.println(lowerResult);

        String spaced = "   Bro    ";
        String trimResult = spaced.trim();
        System.out.println("[" + spaced + "]");
        System.out.println("[" + trimResult + "]");

        String replaceResult = name.replace('o', 'a');
        System.out.println(replaceResult);

    }

}
