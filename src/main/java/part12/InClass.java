package part12;

// Video: https://www.youtube.com/watch?v=xk4_1vDrzzo&t=7922s
//        rewatch 2:12:02–2:27:20 for ArrayList, 2D ArrayList and the for-each loop
//
// In-class exercise — we do this together in class. Not graded, but commit it.
// The README (In-class exercise) has the steps and the output to match.

import java.util.ArrayList;

public class InClass {
    public static void main(String[] args) {

        // STEP 1 — we build a team roster together, here.
// STEP 1 — Build a roster
        ArrayList<String> roster = new ArrayList<>();

        // Add the four players
        roster.add("Davis");
        roster.add("Brooks");
        roster.add("Lee");
        roster.add("Kim");

        // Print roster
        System.out.println("Roster: " + roster);

        // Print size
        System.out.println("Size: " + roster.size());

        // First player
        System.out.println("First: " + roster.get(0));

        // Replace Lee with Lopez (Lee is at index 2)
        roster.set(2, "Lopez");
        System.out.println("After set: " + roster);

        // Remove Brooks (Brooks is now at index 1)
        roster.remove(1);
        System.out.println("After remove: " + roster);

        // For-each loop
        System.out.println("Players:");
        for (String player : roster) {
            System.out.println("- " + player);
        }

        // Build offense list
        ArrayList<String> offense = new ArrayList<>();
        offense.add("Davis");
        offense.add("Lopez");

        // Build defense list
        ArrayList<String> defense = new ArrayList<>();
        defense.add("Kim");
        defense.add("Ortiz");

        // 2D ArrayList
        ArrayList<ArrayList<String>> team = new ArrayList<>();
        team.add(offense);
        team.add(defense);

        System.out.println("Team: " + team);

        // Defense captain = first name in second list
        System.out.println("Defense captain: " + team.get(1).get(0));



        // STEP 2 — fix the bugs. Each line below has ONE mistake.
        // Move ONE line at a time above the /* line, so Java sees it.
        // Read the red error. Fix it. Run it. Then do the next line.

        ArrayList<Integer> nums = new ArrayList<Integer>();//Needs to be the class Integer
        ArrayList<String> words = new ArrayList<String>();//Needs the parantheses
        System.out.println(roster.size());//Its size

    }
}
