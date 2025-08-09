package leetcode75.easy;

// 392. Is Subsequence
/**
 * Given two strings s and t, return true if s is a subsequence of t, or false
 * otherwise.
 * A subsequence of a string is a new string that is formed from the original
 * string by deleting some (can be none)
 * of the characters without disturbing the relative positions of the remaining
 * characters.
 * (i.e., "ace" is a subsequence of "abcde" while "aec" is not).
 * 
 * Example 1:
 * Input: s = "abc", t = "ahbgdc"
 * Output: true
 * 
 * Example 2:
 * Input: s = "axc", t = "ahbgdc"
 * Output: false
 */
public class Leet75_392 {
    public static void main(String[] args) {
        String s = "aaaa";
        String t = "bbaaa";
        System.out.println(isSubsequence(s, t));
        // System.out.println(t.length());
    }

    public static boolean isSubsequence(String s, String t) {
        if (s.isEmpty()) {
            return true;
        }
        // Trường hợp đặc biệt: nếu t rỗng nhưng s không rỗng, trả về false
        if (t.isEmpty()) {
            return false;
        }

        int pointerS = 0; // Con trỏ cho chuỗi s
        int pointerT = 0; // Con trỏ cho chuỗi t

        // Duyệt qua cả hai chuỗi
        while (pointerT < t.length()) {
            // Nếu ký tự hiện tại của s và t khớp nhau
            if (s.charAt(pointerS) == t.charAt(pointerT)) {
                pointerS++; // Tăng con trỏ của s
                // Nếu đã duyệt hết s, trả về true
                if (pointerS == s.length()) {
                    return true;
                }
            }
            pointerT++; // Tăng con trỏ của t
        }

        // Nếu không duyệt hết s, trả về false
        return false;
    }

    // public static boolean isSubsequence(String s, String t) {
    // // String[] strArr = s.split("");
    // if (s.equals(t)) {
    // return true;
    // }
    // int index = 0;
    // int sLength = 0;
    // for (String str : s.split("")) {
    // if (t.substring(index).contains(str)) {
    // index = t.indexOf(str);
    // sLength++;
    // } else {
    // return false;
    // }
    // }
    // return sLength < t.length();
    // }
}
