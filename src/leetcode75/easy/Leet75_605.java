package leetcode75.easy;

/**
 * 605. Can Place Flowers
 * You have a long flowerbed in which some of the plots are planted, and some
 * are not. However, flowers cannot be planted in adjacent plots.
 * Given an integer array flowerbed containing 0's and 1's, where 0 means empty
 * and 1 means not empty, and an integer n, return true if n new flowers can be
 * planted in the flowerbed without violating the no-adjacent-flowers rule and
 * false otherwise.
 * Example 1:
 * Input: flowerbed = [1,0,0,0,1], n = 1
 * Output: true
 * Example 2:
 * Input: flowerbed = [1,0,0,0,1], n = 2
 * Output: false
 */
public class Leet75_605 {
    public static void main(String[] args) {
        // int arr[] = {1,0,0,0,1};
        int arr[] = {1,0,0,0,1,0,0};
        // int arr[] = {1,0,0,0,1};
        int n = 2;
        System.out.println(canPlace(arr, n));
    }

    public static boolean canPlace(int flowerbed[], int n) {
        if (n == 0) {
            return true;
        }
        if (flowerbed.length == 1) {
            return flowerbed[0] == 0;
        }
        int numberOfPlace = 0;

        for (int i = 0; i < flowerbed.length; i++) {

            if (flowerbed[i] != 1) {
                if (i == 0) {
                    if (flowerbed[i + 1] == 0) {
                        flowerbed[i] = 1;
                        numberOfPlace++;
                    }
                    continue;
                }

                if (i == flowerbed.length - 1 && flowerbed[i - 1] == 0) {
                    flowerbed[i] = 1;
                    numberOfPlace++;
                    continue;
                }
                if (flowerbed[i - 1] == 0 && flowerbed[i + 1] == 0) {
                    flowerbed[i] = 1;
                    numberOfPlace++;
                }
            }
        }

        return n <= numberOfPlace;
    }
}
