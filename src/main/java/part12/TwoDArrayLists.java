package part12;

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
//Import the ArrayList Class
import java.util.ArrayList;
//Creates a public class called TwoDArrayList
public class TwoDArrayLists {
    //The main method the start of teh program
    public static void main(String[] args) {
        //Creates an array list of Strings called bakeryLisyt
        ArrayList<String> bakeryList = new ArrayList();
        //Add these elements into teh bakeryList
        bakeryList.add("pasta");
        bakeryList.add("garlic bread");
        bakeryList.add("donuts");

        //Creates an array list of Strings called produceList
        ArrayList<String> produceList = new ArrayList<String>();
        //Add these elements into the produceList
        produceList.add("tomatoes");
        produceList.add("zucchini");
        produceList.add("peppers");

        //Creates an array list of Strings called drinksList
        ArrayList<String> drinksList = new ArrayList<String>();

        //Add these elemnts into the drinkList
        drinksList.add("soda");
        drinksList.add("coffee");

        //print the entire bakeryList of array
        System.out.println(bakeryList);
        //Prints the first element at 0
        System.out.println(bakeryList.get(0));
        //Prints the entire drinkList of array
        System.out.println(drinksList);

        //Creates an array list of groceryList
        ArrayList<ArrayList<String>> groceryList = new ArrayList<>();

        //add bakeryList into teh first element in groceryList
        groceryList.add(bakeryList);
        //add produceList into the second element in the groceryList
        groceryList.add(produceList);
        //Creates drinkList into teh third element in the drinkList
        groceryList.add(drinksList);
        //prints the entire 2d groceyrList
        System.out.println(groceryList);
        //prints the first element of bakeryList
        System.out.println(groceryList.get(0));
        //prints the first item of the inner list
        System.out.println(groceryList.get(0).get(0));
        //prints the second item of the inner list
        System.out.println(groceryList.get(2).get(1));
    }

}
