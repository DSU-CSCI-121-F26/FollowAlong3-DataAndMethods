package part12;

// Video: https://www.youtube.com/watch?v=xk4_1vDrzzo&t=7922s
//        rewatch 2:12:00–2:16:20 for ArrayList, 2:16:50–2:23:45 for 2D ArrayList,
//        2:23:57–2:27:20 for the for-each loop
// Guide: GUIDE.md in this folder
//
// SECTION C — Stretch. Do Stretch A, then Stretch B. The README says what each one should print.
//
// There is no main method here yet, and no import. Typing both is part of the stretch.

import java.util.ArrayList;

public class Stretch {
    public static void main(String[] args) {

        /* MY GUESS:
        [Yellow,blue]
        2
        yellow
        yellow blue
         */
        ArrayList<String> colors = new ArrayList<String>();
        colors.add("red");
        colors.add("green");
        colors.add("blue");
        colors.set(1, "yellow");
        colors.remove(0);
        System.out.println(colors);
        System.out.println(colors.size());
        System.out.println(colors.get(0));
        for (String c : colors) {
            System.out.print(c + " ");
        }
        System.out.println();

        //Stretch B
        //B1
        ArrayList<Integer> scores = new ArrayList<Integer>();
        scores.add(90);
        scores.add(75);
        scores.add(88);
        int sum = 0;
        for (int s : scores) {
            sum = sum + s;
        }
        System.out.println("Total: " + sum);

        //B2
        ArrayList<String> playlist = new ArrayList<String>();
        playlist.add("Song A");
        playlist.add("Song B");
        playlist.add("Song C");
        playlist.add("Song D");

        // Print each song with a number in front
        for (int i = 0; i < playlist.size(); i++) {
            System.out.println((i + 1) + ". " + playlist.get(i));
        }

        // Remove the second song (index 1)
        playlist.remove(1);

        // Print how many songs are left
        System.out.println("Songs left: " + playlist.size());

        // Print the whole playlist
        System.out.println(playlist);

        //B3
        // Make row1 with Ana and Ben
        ArrayList<String> row1 = new ArrayList<String>();
        row1.add("Ana");
        row1.add("Ben");

        // Make row2 with Cam, Dee, Eli
        ArrayList<String> row2 = new ArrayList<String>();
        row2.add("Cam");
        row2.add("Dee");
        row2.add("Eli");

        // Make the 2D ArrayList seats
        ArrayList<ArrayList<String>> seats = new ArrayList<ArrayList<String>>();
        seats.add(row1);
        seats.add(row2);

        // Print each row using nested for-each loops
        for (ArrayList<String> row : seats) {
            System.out.print("Row:");
            for (String person : row) {
                System.out.print(" " + person);
            }
            System.out.println();
        }

        // Back corner: row 1, seat 2 → Eli
        System.out.println("Back corner: " + seats.get(1).get(2));
    }
}
