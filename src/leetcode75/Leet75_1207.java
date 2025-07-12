package leetcode75;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * Given an array of integers arr, return true if the number of occurrences of each value in the array is unique or false otherwise.
 * (Số lần xuất hiện bằng nhau hay không)
 * Example 1:
    Input: arr = [1,2,2,1,1,3]
    Output: true
    Explanation: The value 1 has 3 occurrences, 2 has 2 and 3 has 1. No two values have the same number of occurrences.
 */
public class Leet75_1207 {
    public static void main(String[] args) {
        int arr[] = {1,2,2,1,1,3};
       System.out.println( uniqueOccurrences(arr));
    }

    public static boolean uniqueOccurrences(int[] arr) {
        Map<Integer, Integer> m = new HashMap<Integer, Integer>();

        for (int i : arr) {
            if (!m.containsKey(i)) {
                m.put(i, 0);
            }
            m.put(i, m.get(i) + 1);
        }

        HashSet<Integer> frequencies = new HashSet<>();

        for (int x : m.keySet()) {
            frequencies.add(m.get(x));
        }

        return frequencies.size() == m.keySet().size();
    }
}
