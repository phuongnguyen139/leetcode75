package leetcode75.easy;

//643. Maximum Average Subarray I
/* You are given an integer array nums consisting of n elements, and an integer k.
Find a contiguous subarray whose length is equal to k that has the maximum average value and return this value. Any answer with a calculation error less than 10-5 will be accepted.

Example 1:
    Input: nums = [1,12,-5,-6,50,3], k = 4 -- 
    Output: 12.75000
    Explanation: Maximum average is (12 - 5 - 6 + 50) / 4 = 51 / 4 = 12.75
Example 2:
    Input: nums = [5], k = 1
    Output: 5.00000
 */

/*
 * [1, 12, -5, -6, 50, 3, 4, 0, 1]
 * St1: Create init value
 * - intValue
 * St2: Slide to next part of arr (remove the arr[i] and add arr[i - k])
 * - for (i from k to (length - 1)) {
 * iniValue += arr[i] - arr[i - k] (i = k)
 * }
 */
public class Leet75_643 {
    public static void main(String[] args) {
        int nums[] = { 1, 12, -5, -6, 50, 3 };
        int k = 4;

        System.out.println(findMaxAverage(nums, k));
    }

    public static double findMaxAverage(int[] nums, int k) {
        double initSum = 0;
        double maxSum = 0;

        for (int i = 0; i < k; i++) {
            initSum += nums[i];
        }

        for (int i = k; i < nums.length; i++) {
            initSum += nums[i] - nums[i - k];
            maxSum = initSum > maxSum ? initSum : maxSum;
        }

        return maxSum / k;
    }

}
