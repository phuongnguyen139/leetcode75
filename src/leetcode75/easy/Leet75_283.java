package leetcode75.easy;

import java.util.Arrays;

/*
 * Given an integer array nums, move all 0's to the end of it while maintaining the relative order of the non-zero elements.
   Note that you must do this in-place without making a copy of the array.
 */
public class Leet75_283 {
    public static void main(String[] args) {
        int arr[] = { 0, 1, 0, 3, 12 };
        moveZeroes(arr);
    }

    public static void moveZeroes(int[] nums) {
        int index = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                nums[index] = nums[i];
                index++;
            }
        }
        while (index < nums.length) {
            nums[index] = 0;
            index++;
        }

        Arrays.stream(nums).forEach(x -> System.out.print(x + " - "));
    }
}
