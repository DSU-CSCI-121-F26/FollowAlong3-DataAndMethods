package part12;
import java.util.ArrayList;

// Video: https://www.youtube.com/watch?v=xk4_1vDrzzo&t=7922s
//        rewatch 2:12:00–2:16:20 for ArrayList, 2:16:50–2:23:45 for 2D ArrayList,
//        2:23:57–2:27:20 for the for-each loop
// Guide: GUIDE.md in this folder
//
// SECTION C — Stretch. Do Stretch A, then Stretch B. The README says what each one should print.
//
// There is no main method here yet, and no import. Typing both is part of the stretch.

public class Stretch {
    public static void main(String[] args) {

        ArrayList<String> colors = new ArrayList<String>();

        colors.add("red");
        colors.add("green");
        colors.add("blue");

        colors.set(1, "yellow");
        colors.remove(0);
        // prints out yello and blue
        System.out.println(colors);
        // prints out 2
        System.out.println(colors.size());
        // is going to make yellow the new 0 value after the removal of red
        System.out.println(colors.get(0));
        // is going to print "yellow blue"
        for (String c : colors) {
            System.out.print(c + " ");
        }
        // printing out a new line
        System.out.println();

        // correct

        ArrayList<Integer> scores = new ArrayList<Integer>();
        scores.add(90);
        scores.add(75);
        scores.add(88);
        int sum = 0;
        for (int s : scores) {
            sum = sum + s;
        }
        System.out.println("Total: " + sum);


        ArrayList<String> playlist = new ArrayList<String>();
        playlist.add("Song A");
        playlist.add("Song B");
        playlist.add("Song C");
        playlist.add("Song D");

        for (int i = 0; i + 1 < playlist.size(); i++) {
            System.out.println((i + 1) + ". " + playlist.get(i));
        }

        playlist.remove(1);

        System.out.println("Songs left: " + playlist.size());
        System.out.println(playlist);

        ArrayList<String> row1 = new ArrayList<String>();
        row1.add("Ana");
        row1.add("Ben");

        ArrayList<String> row2 = new ArrayList<String>();
        row2.add("Cam");
        row2.add("Dee");
        row2.add("Eli");

        ArrayList<ArrayList<String>> seats = new ArrayList<>();
        seats.add(row1);
        seats.add(row2);

        for (ArrayList<String> row : seats) {
            System.out.print("Row: ");

            for (String person : row) {
                System.out.print(person + " ");
            }

            System.out.println();
        }

        System.out.println("Back corner: " + seats.get(1).get(2));




    }

}
