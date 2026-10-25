package part14;

// Video: https://www.youtube.com/watch?v=xk4_1vDrzzo&t=9618s
//        rewatch 2:40:18–2:45:29 (overloading) or 2:45:54–2:56:50 (printf)
// Guide: GUIDE.md in this folder
//
// SECTION C — Stretch. Do Stretch A, then Stretch B. The README says what each one should print.
//
// There is no main method here yet. Typing it is part of the stretch.
// Your extra methods (twice, area) go INSIDE this class, but OUTSIDE main.

public class Stretch {
    public static void main(String[] args) {
        /*
        6
        5.0
        abab
        [    42]
        [   -42]
        [3.1]
        1234567

        correction:
        6
        5.0
        ababa
        [    42]
        [42    ] - the negative sign makes it go to the left of the box
        [3.1]
        [1,234,567] - puts the number in a box followed by , after every three integers
         */

        System.out.println(twice(3));
        System.out.println(twice(2.5));
        System.out.println(twice("ab"));
        System.out.printf("[%5d]\n", 42);
        System.out.printf("[%-5d]\n", 42);
        System.out.printf("[%.1f]\n", 3.14159);
        System.out.printf("[%,d]\n", 1234567);

        // B1
        String item = "Pizza";
        int qty = 2;
        double price = 12.5;
        System.out.printf("%-10s x%d  $%.2f\n", item, qty, price * qty);
        System.out.println();

        // B2
        System.out.printf("Square:    %d\n", area(4));
        System.out.printf("Rectangle: %d\n", area(3, 5));
        System.out.printf("Circle:    %.2f\n", area(2.0));

        System.out.println();

        // B3
        System.out.printf("%-10s %3s %8s\n", "Item", "Qty", "Cost");

        System.out.printf("%-10s %3d %8.2f\n", "Pizza", 2, 25.00);
        System.out.printf("%-10s %3d %8.2f\n", "Wings", 10, 12.99);
        System.out.printf("%-10s %3d %8.2f\n", "Soda", 3, 4.50);


        System.out.printf("%-10s %3s %8.2f\n", "TOTAL", "", 42.49);
    }
    static int area(int side){
        return side * side;
    }

    static int area(int width, int height){
        return width * height;
    }

    static double area(double radius){
        return Math.PI * radius * radius;
    }

    static int twice(int n) {
        return n * 2;
    }

    static double twice(double n) {
        return n * 2;
    }

    static String twice(String s) {
        return s + s;
    }

    //
}
