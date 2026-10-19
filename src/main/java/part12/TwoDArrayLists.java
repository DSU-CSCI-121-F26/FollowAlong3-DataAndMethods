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

        ArrayList<String> bakeryList = new ArrayList<String>();
        ArrayList<String> produceList = new ArrayList<String>();
        ArrayList<String> drinksList = new ArrayList<String>();

        bakeryList.add("pasta");
        bakeryList.add("garlic bread");
        bakeryList.add("donuts");

        produceList.add("tomatoes");
        produceList.add("zucchini");
        produceList.add("peppers");

        drinksList.add("soda");
        drinksList.add("coffee");

        System.out.println(bakeryList);
        System.out.println(bakeryList.get(0));
        System.out.println(drinksList);

        ArrayList<ArrayList<String>> groceryList = new ArrayList<>();
        groceryList.add(bakeryList);
        groceryList.add(produceList);
        groceryList.add(drinksList);
        System.out.println(groceryList);

        System.out.println(groceryList.get(0));
        System.out.println(groceryList.get(0).get(0));
        System.out.println(groceryList.get(2).get(1));


    }

}
