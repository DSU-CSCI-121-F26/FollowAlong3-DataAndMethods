package part13;

// Video: https://www.youtube.com/watch?v=xk4_1vDrzzo&t=8874s
//        rewatch 2:28:40–2:35:20 for parameters, 2:35:25–2:39:30 for return types
// Guide: GUIDE.md in this folder
//
// SECTION C — Stretch. Do Stretch A, then Stretch B. The README says what each one should print.
//
// There is no main method here yet. Typing it — and your own methods
// underneath it — is part of the stretch.

public class Stretch {
    public static void main(String[] args) {
        // outputs the number 5 on the first print
        int x = 5;
        change(x);
        System.out.println(x);
        // multiplies 5 times 2 and it equals 10
        System.out.println(twice(x));
        // multiplies the first result from twice and multiplies it by 2
        System.out.println(twice(twice(x)));
        // prints out Hi Sam 3 times on the same line
        greet("Sam", 3);

        // correct

        System.out.println(square(4));
        System.out.println(square(9));

        System.out.println(average(90, 85, 80));
        System.out.println(average(1, 2, 2));

        System.out.println(rating(3));
        System.out.println(rating(6));
        System.out.println(rating(1));

    }

    static void change(int x) {
        x = 100;
    }

    static int twice(int n) {
        return n * 2;
    }

    static void greet(String who, int times) {
        for (int i = 0; i < times; i++) {
            System.out.print("Hi " + who + "! ");
        }
        System.out.println();
    }

    static int square(int n) {
        return n * n;
    }

    static double average(int x, int z, int y) {
        return (double) (x + y + z) / 3;
    }

    static String rating(int rating) {
        if (rating == 5) {
            return "Amazing";
        } else if (rating == 3 || rating == 4) {
            return "Good";
        } else if (rating == 1 || rating == 2) {
            return "Bad";
        } else {
            return "Invalid";
        }
    }


}
