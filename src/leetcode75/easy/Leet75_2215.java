package leetcode75.easy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

/**
 * 2215: Find the Difference of two Arrays
 * Input: nums1 = [1,2,3], nums2 = [2,4,6]
    Output: [[1,3],[4,6]]   
 */
public class Leet75_2215 {
    public static void main(String[] args) {
        // int nums1[] = {1,2,3};
        // int nums2[] = {2,4,6};

        int nums1[] = {1,2,3,3};
        int nums2[] = {1,1,2,2};

        System.out.println(findDifference(nums1, nums2));
    }

    public static List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        Set<Integer> set1 = new HashSet<>();
        Set<Integer> set2 = new HashSet<>();
        for (int num : nums1) {
            set1.add(num); 
        }
        for (int num : nums2) {
            set2.add(num);
        }

        // Set<Integer> onlyInNums1 = new HashSet<>();
        // Set<Integer> onlyInNums2 = new HashSet<>(); 

        List<Integer> onlyInNums1 = new ArrayList<>();
        List<Integer> onlyInNums2 = new ArrayList<>();
            
        for (int num : set1) {
            if (!set2.contains(num)) {
                onlyInNums1.add(num);
            }
        }

        for (int num : set2) {
            if (!set1.contains(num)) {
                onlyInNums2.add(num);
            }
        }

        // List<Integer> list1 = new ArrayList<>(onlyInNums1);
        // List<Integer> list2 = new ArrayList<>(onlyInNums2);

        return List.of(onlyInNums1, onlyInNums2);
    }
}
