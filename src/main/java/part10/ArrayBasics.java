package part10;

// Video: https://www.youtube.com/watch?v=xk4_1vDrzzo&t=6222s
//        starts at 1:43:42 — stop at about 1:49:45, at "so that's what an array is"
// Guide: GUIDE.md in this folder, steps 1–6
//
// Part 10 — arrays (many values in one variable)
//
// SECTION A — FOLLOW ALONG: type the code from the video (or the guide) in this class.
//    His class is called Main. Yours is called ArrayBasics.
//    Leave the "package part10;" line and the class line alone. Type everything else.
//
// SECTION B — COMMENTS: when you finish, put a // comment ABOVE every line of code,
//    saying in YOUR OWN WORDS what that line does. The README shows an example.

public class ArrayBasics {
    public static void main(String[] args) {

        String[] cars = new String[3];
        cars[0] = "Mustang";
        cars[1] = "Corvette";
        cars[2] = "Tesla";

        System.out.println(cars[0]);
        System.out.println(cars[1]);
        System.out.println(cars[2]);

        for (int i = 0; i < cars.length; i++) {
            System.out.println(cars[i]);
        }


    }

}
