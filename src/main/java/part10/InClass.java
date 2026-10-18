package part10;

// Video: https://www.youtube.com/watch?v=xk4_1vDrzzo&t=6222s
//        rewatch arrays (about 1:43:42) and 2D arrays (about 1:50:51)
//
// In-class exercise — we do this together in class. Not graded, but commit it.
// The README (In-class exercise) has the steps and the output to match.

public class InClass {
    public static void main(String[] args) {

        // STEP 1 — we build the temperature log and the map together, here.
        System.out.println("=== TEMPERATURE LOG ===");

        int[] temps = {70,72,68,75,71};

        for (int i = 0; i < temps.length; i++){
            System.out.println("Reading "+i+":"+temps[i]);
        }

        //Find the Highest
        int highest = temps[0]; //start at the first

        for (int i = 0; i < temps.length;i++){
            if (temps[i] > highest){
                highest = temps[i];
            }

        }
        System.out.println("Highest: " + highest);


        // STEP 2 — fix the bugs. Each bug below is inside its own /* ... */.
        // Do ONE bug at a time: delete its /* line and its */ line, so Java sees it.
        // Read the red error. Fix it. Run it. Then do the next bug.

        //add spots
        int[] readings = new int[3];


        //U dont need the ()
        int[] speeds = {3, 5, 4};
        System.out.println(speeds.length);


        //It does 0,1,2, Ana is out of index
        String[] names = new String[3];
        names[2] = "Ana";
        System.out.println(names[2]);

    }
}
