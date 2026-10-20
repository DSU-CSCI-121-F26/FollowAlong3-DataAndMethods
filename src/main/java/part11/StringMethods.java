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

public class StringMethods {
    public static void main(String[] args) {

        // Declare a String variable named name and assign it the value "Bro"
        String name = "Bro";

        // Check if the name string is exactly equal to "Bro" (case-sensitive)
        boolean equalsResult1 = name.equals("Bro");
        // Print the boolean result of the first equals check (true)
        System.out.println(equalsResult1);

        // Check if the name string is equal to lowercase "bro" (case-sensitive mismatch)
        boolean equalsResult2 = name.equals("bro");
        // Print the boolean result of the second equals check (false)
        System.out.println(equalsResult2);

        // Check if the name string equals "bro" ignoring upper/lower case differences
        boolean equalsResult3 = name.equalsIgnoreCase("bro");
        // Print the boolean result of the case-insensitive check (true)
        System.out.println(equalsResult3);

        // Get the total number of characters in the name string
        int lengthResult = name.length();
        // Print the length of the string (3)
        System.out.println(lengthResult);

        // Retrieve the single character located at index position 0 of the string
        char charAtResult = name.charAt(0);
        // Print the character at index 0 (B)
        System.out.println(charAtResult);

        // Find the index position where the letter "o" first appears in the string
        int indexOfResult = name.indexOf("o");
        // Print the index number of "o" (2)
        System.out.println(indexOfResult);

        // Check if the string is completely empty or has zero length
        boolean emptyResult = name.isEmpty();
        // Print whether the string is empty (false)
        System.out.println(emptyResult);

        // Convert all characters in the string to uppercase letters
        String upperResult = name.toUpperCase();
        // Print the uppercase version of the string (BRO)
        System.out.println(upperResult);

        // Convert all characters in the string to lowercase letters
        String lowerResult = name.toLowerCase();
        // Print the lowercase version of the string (bro)
        System.out.println(lowerResult);

        // Declare a new String variable containing leading and trailing whitespace characters[span_0](start_span)[span_0](end_span)
        String spaced = " Bro ";
        // Print the spaced string wrapped in brackets so the extra spaces are visible[span_1](start_span)[span_1](end_span)
        System.out.println("[" + spaced + "]");

        // Remove any leading and trailing whitespace from the spaced string[span_2](start_span)[span_2](end_span)
        String trimResult = spaced.trim();
        // Print the trimmed string wrapped in brackets[span_3](start_span)[span_3](end_span)
        System.out.println("[" + trimResult + "]");

        // Replace all instances of the letter "o" with the letter "a" in the name string
        String replaceResult = name.replace("o", "a");
        // Print the modified string resulting from the replacement (Bra)
        System.out.println(replaceResult);
    }
}

