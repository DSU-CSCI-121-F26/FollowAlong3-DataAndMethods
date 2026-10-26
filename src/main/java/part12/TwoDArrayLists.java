package part12;
import java.util.ArrayList;
// Video: https://www.youtube.com/watch?v=xk4_1vDrzzo&t=8210s
//        starts at about 2:16:50 — stop at about 2:23:45, when he says "that's how two-dimensional ArrayLists work"
// Guide: GUIDE.md in this folder, steps 7–10
//
// Part 12 — 2D ArrayList
//
// SECTION A — FOLLOW ALONG: type the code from the video (or the guide) in this class.
//    His class is called Main. Yours is called TwoDArrayLists.
//    Leave the "package part12;" line and the "public class TwoDArrayLists" line alone.
//    Type everything else yourself.
//
// SECTION B — COMMENTS: when you finish, put a // comment ABOVE every line of code,
//    saying in YOUR OWN WORDS what that line does. The README shows an example.

public class TwoDArrayLists {
    public static void main(String[] args) {


    // Create the first shopping list ArrayList for strings
    ArrayList<String> list1 = new ArrayList<>();
    // Add "pasta" to the first list[span_11](start_span)
        list1.add("pasta");
    // Add "garlic bread" to the first list
        list1.add("garlic bread");
    // Add "donuts" to the first list
        list1.add("donuts");
    // Print the entire first list
        System.out.println(list1);
    // Print the element at index 0 of the first list ("pasta")
        System.out.println(list1.get(0));

    // Create the second shopping list ArrayList
    ArrayList<String> list2 = new ArrayList<>();
    // Add "tomatoes" to the second list
        list2.add("tomatoes");
    // Add "zucchini" to the second list
        list2.add("zucchini");
    // Add "peppers" to the second list
        list2.add("peppers");

    // Create the third shopping list ArrayList
    ArrayList<String> list3 = new ArrayList<>();
    // Add "soda" to the third list
        list3.add("soda");
    // Add "coffee" to the third list
        list3.add("coffee");
    // Print the entire third list
        System.out.println(list3);

    // Create a 2D ArrayList (a list containing other ArrayLists of strings)
    ArrayList<ArrayList<String>> masterList = new ArrayList<>();
    // Add list1 into the master 2D list
        masterList.add(list1);
    // Add list2 into the master 2D list
        masterList.add(list2);
    // Add list3 into the master 2D list
        masterList.add(list3);

    // Print the entire master 2D ArrayList
        System.out.println(masterList);
    // Print the first inner list (list1) from the master list
        System.out.println(masterList.get(0));
    // Print the first item of the first inner list ("pasta")
        System.out.println(masterList.get(0).get(0));
    // Print the second item of the third inner list ("coffee").
        System.out.println(masterList.get(2).get(1));
}
}


