package part12;

// Video: https://www.youtube.com/watch?v=xk4_1vDrzzo&t=7922s
//        starts at about 2:12:02 — stop at about 2:16:20, when he says "that is ArrayLists in Java"
// Guide: GUIDE.md in this folder, steps 1–6
//
// Part 12 — ArrayList
//
// SECTION A — FOLLOW ALONG: type the code from the video (or the guide) in this class.
//    His class is called Main. Yours is called ArrayLists.
//    Leave the "package part12;" line and the "public class ArrayLists" line alone.
//    Type everything else yourself.
//
// SECTION B — COMMENTS: when you finish, put a // comment ABOVE every line of code,
//    saying in YOUR OWN WORDS what that line does. The README shows an example.
//Import the ArrayList class
import java.util.ArrayList;
//Create a class called ArrayLists
public class ArrayLists {
    //Creates a main method of ArrayList
    public static void main(String[] args) {
        //Creates an arraylist of strinsg called food
        ArrayList<String> food = new ArrayList<String>();
        //Add these elements into the arrayList
        food.add("pizza");
        food.add("hamburger");
        food.add("hotdog");

        //loop through the list using a normal for lop
        for (int i = 0; i < food.size(); i++) {
            //print the item at index 1
            System.out.println(food.get(i));
        }
        //Replace teh item at index 0 to Sushi
        food.set(0, "sushi");
        //print the updated lisy
        System.out.println(food);

        //Remove the item at index 2
        food.remove(2);
        //print the updatedList
        System.out.println(food);

        //Clear teh entire list
        food.clear();
        //print the now empty list
        System.out.println(food);


    }

}
