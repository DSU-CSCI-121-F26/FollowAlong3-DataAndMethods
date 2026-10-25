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
// publicly accessed class called TwoDArrayLists
public class TwoDArrayLists {
    // the start of the program
    public static void main(String[] args) {

        // creates a new ArrayList of Strings named bakeryList
        ArrayList<String> bakeryList = new ArrayList<String>();

        // adds "pasta" to the bakeryList
        bakeryList.add("pasta");
        // adds "garlic bread" to the bakeryList
        bakeryList.add("garlic bread");
        // adds "donuts" to the bakeryList
        bakeryList.add("donuts");

        // creates a new ArrayList of Strings named produceList
        ArrayList<String> produceList = new ArrayList<String>();
        // adds "tomatoes" to the produceList
        produceList.add("tomatoes");
        // adds "zucchini" to the produceList
        produceList.add("zucchini");
        // adds "peppers" to the produceList
        produceList.add("peppers");

        // creates a new ArrayList of Strings named drinksList
        ArrayList<String> drinksList = new ArrayList<String>();
        // adds "soda" to the drinksList
        drinksList.add("soda");
        // adds "coffee" to the drinksList
        drinksList.add("coffee");

        // prints the contents of bakeryList to the console
        System.out.println(bakeryList);
        // prints the element at index 0 of bakeryList to the console
        System.out.println(bakeryList.get(0));
        // prints the contents of drinksList to the console
        System.out.println(drinksList);

        // creates a 2D ArrayList containing lists of string lists named groceryList
        ArrayList<ArrayList<String>> groceryList = new ArrayList<>();
        // adds the bakeryList into the 2D groceryList
        groceryList.add(bakeryList);
        // adds the produceList into the 2D groceryList
        groceryList.add(produceList);
        // adds the drinksList into the 2D groceryList
        groceryList.add(drinksList);
        // prints the entire 2D groceryList to the console
        System.out.println(groceryList);

        // prints the first list inside groceryList (bakeryList) to the console
        System.out.println(groceryList.get(0));
        // prints the first element of the first list inside groceryList ("pasta") to the console
        System.out.println(groceryList.get(0).get(0));
        // prints the second element of the third list inside groceryList ("coffee") to the console
        System.out.println(groceryList.get(2).get(1));
    }
}
