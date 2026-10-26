package part12;
import java.util.ArrayList;
import java.util.Arrays;
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
        System.out.println(colors);
        System.out.println(colors.size());
        System.out.println(colors.get(0));
        for (String c : colors) {
            System.out.print(c + " ");
        }
        System.out.println();
        /* My Guess
        yellow, blue I was wrong for I forgot that the array would print strings inside brackets
        2
        yellow
        yellow blue
         */
        ArrayList<Integer> scores = new ArrayList<Integer>();
        scores.add(90);
        scores.add(75);
        scores.add(88);
        int sum = 0;
        for (int s : scores) {
            sum = sum + s;
        }
        System.out.println("Total: " + sum);

        // 1. Make an ArrayList<String> called row1 with Ana and Ben
        ArrayList<String> row1 = new ArrayList<>(Arrays.asList("Ana", "Ben"));

        // 2. Make an ArrayList<String> called row2 with Cam, Dee and Eli
        ArrayList<String> row2 = new ArrayList<>(Arrays.asList("Cam", "Dee", "Eli"));

        // 3. Make an ArrayList<ArrayList<String>> called seats, and add both rows
        ArrayList<ArrayList<String>> seats = new ArrayList<>();
        seats.add(row1);
        seats.add(row2);

        // 4. Use a for-each loop inside another for-each loop to print each row
        for (ArrayList<String> row : seats) {
            for (String person : row) {
                System.out.print(person + " ");
            }
            System.out.println();
        }

        // 5. Print the person in the back corner using get twice
        // (Last element of the last row)
        System.out.println(seats.get(seats.size() - 1).get(seats.get(seats.size() - 1).size() - 1));

        // Create an ArrayList called playlist with four songs
        ArrayList<String> playlist = new ArrayList<>(Arrays.asList("Song A", "Song B", "Song C", "Song D"));

        // 1. Use a regular for loop (with i) to print each song with a number in front
        for (int i = 0; i < playlist.size(); i++) {
            System.out.println((i + 1) + ". " + playlist.get(i));
        }

        // 2. Remove the second song (index 1)
        playlist.remove(1);

        // 3. Print how many songs are left, and the whole list
        System.out.println(playlist);
    }
}





