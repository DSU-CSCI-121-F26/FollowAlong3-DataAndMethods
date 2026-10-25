package part10;

// Video: https://www.youtube.com/watch?v=xk4_1vDrzzo&t=6233s
//        rewatch 1:43:53 (arrays), 1:48:37 (looping through an array), 1:53:36 (2D loops)
// Guide: GUIDE.md in this folder
//
// SECTION C — Stretch. Do Stretch A, then Stretch B. The README says what each one should print.
//
// There is no main method here yet. Typing it is part of the stretch.

public class Stretch {
    public static void main(String[] args) {
        /*
        8
        4
        17
        16 15 8 4

        4
        2 rows, 3 columns

        correction:8
         4
         17
         16 15 8 17 - thought there was a line between these lines also
         I forgot 4 got updated to 17
         4
         2 rows, 3 columns

         */
        int[] nums = {4, 8, 15, 16};
        System.out.println(nums[1]);
        System.out.println(nums.length);
        nums[0] = nums[3] + 1;
        System.out.println(nums[0]);
        for (int i = nums.length - 1; i >= 0; i--) {
            System.out.print(nums[i] + " ");
        }
        System.out.println();
        int[][] grid = {{1, 2, 3}, {4, 5, 6}};
        System.out.println(grid[1][0]);
        System.out.println(grid.length + " rows, " + grid[0].length + " columns");

        // B1
        String[] foods = {"Steak", "chicken", "dumplings"};

        for (String food : foods) {
            System.out.println("I like " + food);
        }

        // B2
        System.out.println();
        int[] s = {88, 92, 75, 100, 64};
        double result = 0.0;

        for (int num : s) {
            result += num;
        }
        System.out.println("Total: " + result);
        System.out.println("Average: " + result / s.length);
        System.out.println();

        // B3
        String[][] seats = {
                {"Ana", "Ben", "Cal"},
                {"Dee", "Eli", "Fay"}
        };

        for (int row = 0; row < seats.length; row++) {
            System.out.print("Row " + (row + 1) + ":\t");
            for (int col = 0; col < seats[row].length; col++) {
                System.out.print(seats[row][col] + " \t");
            }
            System.out.println();
        }
    }
}