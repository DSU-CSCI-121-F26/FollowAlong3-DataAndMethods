package part10;

// Video: https://www.youtube.com/watch?v=xk4_1vDrzzo&t=6233s
//        rewatch 1:43:53 (getting one element) and 1:48:37 (looping through an array)
// Guide: GUIDE.md in this folder, steps 2 and 6
//
// SECTION D — Challenge. Two small methods. A test checks them: src/test/java/part10/ChallengeTest.java
// Run the test with the green arrow next to "class ChallengeTest". Do NOT change the test.
//
// Each method already has its top line. The inputs are in the parentheses.
// Replace the line marked YOUR CODE so the method returns the right answer.

public class Challenge {

    // Return true if the FIRST or the LAST number in the array equals target.
    // The array always has at least one number.
    // endsWith(new int[] {7, 2, 3}, 7)  should return true   (first is 7)
    // endsWith(new int[] {1, 2, 9}, 9)  should return true   (last is 9)
    // endsWith(new int[] {1, 5, 3}, 5)  should return false  (5 is only in the middle)
    public static boolean endsWith(int[] nums, int target) {
        /* check first and last index if the target is not there return false
        if it is return true
         */
        int numsLength = nums.length - 1;

        if (target == nums[0] ||target == nums[numsLength] ){
            return true;
        }
        return false;
    }

    // Return the total: all the numbers in the array added up.
    // total(new int[] {1, 2, 3})  should return 6
    // total(new int[] {10})       should return 10
    // total(new int[] {})         should return 0   (an empty array adds up to 0)
    public static int total(int[] nums) {
        // make a for loop adding the number at the beginning to a result until its done
        int result = 0;

        for (int i = 0; i < nums.length;i++){
            result += nums[i];
        }
        return result ;   // YOUR CODE
    }
}
