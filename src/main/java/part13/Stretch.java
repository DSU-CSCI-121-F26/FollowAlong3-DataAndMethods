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
        /* My Guess:
        5
        10
        100//It waas posed to be 20
        Hi Sam 3 times
         */
        // inside main:
        int x = 5;
        change(x);
        System.out.println(x);
        System.out.println(twice(x));
        System.out.println(twice(twice(x)));
        greet("Sam", 3);

        //B1
        System.out.println(square(4));
        System.out.println(square(9));

        //B2
        System.out.println(average(90, 80, 85));
        System.out.println(average(1, 2, 2));

        //B3
        System.out.println(rating(5));
        System.out.println(rating(4));
        System.out.println(rating(1));
        System.out.println(rating(9));
    }
    //B3
    static String rating(int stars) {
        if (stars == 5) {
            return "Amazing";
        } else if (stars == 3 || stars == 4) {
            return "Good";
        } else if (stars == 1 || stars == 2) {
            return "Bad";
        } else {
            return "Invalid";
        }
    }
    //B1
    static int square(int n){
        return n*n;
    }
    //B2
    static double average(int a, int b, int c) {
        return (a + b + c) / 3.0;
    }
        // below main, inside the class:
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

}
