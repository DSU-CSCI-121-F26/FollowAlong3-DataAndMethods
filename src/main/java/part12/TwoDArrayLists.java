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
        // the declaration of a new string array for all 3 holding as many values s i want to give it
        ArrayList<String> bakeryList = new ArrayList<String>();
        ArrayList<String> produceList = new ArrayList<String>();
        ArrayList<String> drinksList = new ArrayList<String>();
        // adding to the first index of the baker list and the value is pasta
        bakeryList.add("pasta");
        // adding to the 2nd index value of bakery list with garlic bread
        bakeryList.add("garlic bread");
        // adding to the 3rd value of the index on bakery list with pasta
        bakeryList.add("donuts");
        // adding to the 1st value of the index of the produce list with tomatoes
        produceList.add("tomatoes");
        // adding to the 2nd value of the index of the produce list with zucchini
        produceList.add("zucchini");
        // adding to the 3rd value of the index of the produce list with peppers
        produceList.add("peppers");
        // adding to the 1st value of the index of the drinks list with soda
        drinksList.add("soda");
        // adding to the 2nd value of the index of the drinks list with coffee
        drinksList.add("coffee");
        // printing out every value bakerylist separated by a comma in the array format
        System.out.println(bakeryList);
        // getting and printing the value that is at the first index bakerylist which would pasta
        System.out.println(bakeryList.get(0));
        // printing out every value of drinks list in array format with a comma in between
        System.out.println(drinksList);
        // creating an array that stores other arrays with their values stored inside
        ArrayList<ArrayList<String>> groceryList = new ArrayList<>();
        // adding the bakerylist and all of its items in this main array
        groceryList.add(bakeryList);
        // adding the produce list and all of its values in the main grocery list array
        groceryList.add(produceList);
        // adding the drinks list into the main grocery list array
        groceryList.add(drinksList);
        // printing out every thing added in the list so bakery, produce, and drink will be outputted
        System.out.println(groceryList);
        // getting the first value of the whole array which will be the all the bakery list values
        System.out.println(groceryList.get(0));
        // getting the first item stored at the first index of the bakery list so pasta
        System.out.println(groceryList.get(0).get(0));
        // getting the last array in the list and getting the last value in its list which would be coffee
        System.out.println(groceryList.get(2).get(1));


    }

}
