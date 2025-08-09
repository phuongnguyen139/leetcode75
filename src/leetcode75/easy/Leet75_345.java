package leetcode75.easy;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * 345. Reverse Vowels of a String
 * Given a string s, reverse only all the vowels in the string and return it.
 * The vowels are 'a', 'e', 'i', 'o', and 'u', and they can appear in both lower and upper cases, more than once.
    Example 1:
    Input: s = "IceCreAm"
    Output: "AceCreIm"
    Explanation:
    The vowels in s are ['I', 'e', 'e', 'A']. On reversing the vowels, s becomes "AceCreIm".

    Example 2:
    Input: s = "leetcode"
    Output: "leotcede"
 */
public class Leet75_345 {
    public static void main(String[] args) {
        // String s = "Marge, let's \"went.\" I await news telegram.";
        String s = " apG0i4maAs::sA0m4i0Gp0";
        System.out.println(reverseVowels(s));
    }

    public static String reverseVowels(String s) {
        char charS[] = s.toCharArray();
        int pointerAsc = 0;
        int pointerDesc = charS.length - 1;


        while ((pointerAsc < charS.length) && (pointerDesc >= 0) && (pointerAsc <= pointerDesc)) {
            if (isVowels(charS[pointerAsc]) && isVowels(charS[pointerDesc])) {
                char temp;
                temp = charS[pointerAsc];
                charS[pointerAsc] = charS[pointerDesc];
                charS[pointerDesc] = temp;
                pointerAsc++;
                pointerDesc--;
            } else if (!isVowels(charS[pointerAsc])) {
                pointerAsc++;
            } else if (!isVowels(charS[pointerDesc])) {
                pointerDesc--;
            }
        }

        return new String(charS);
    }

    public static boolean isVowels(char c) {
        return c == ('a') || c == ('e')
                || c == ('i') || c == ('o') || c == ('u')
                || c == ('A') || c == ('E')
                || c == ('I') || c == ('O') || c == ('U');
    }
}
