package leetcode75.easy;

// 1768. Merge Strings Alternately
public class Leet75_1768 {
    public static void main(String[] args) {
        String word1 = "ab";
        String word2 = "pqrs";
        System.out.println(mergeAlternately(word1, word2));
        
        String result = "apbqrs";
        System.out.println(result.equals(mergeAlternately(word1, word2)));
    }

    public static String mergeAlternately(String word1, String word2) {
        StringBuffer resultBf = new StringBuffer();

        int count = word1.length() > word2.length() ? word1.length() : word2.length();
        for (int i = 0; i < count; i++) {
            if (word1.length() > i) {
                resultBf.append(word1.charAt(i));
            }
            if (word2.length() > i) {
                resultBf.append(word2.charAt(i));
            }
        }

        return resultBf.toString();
    }
}
