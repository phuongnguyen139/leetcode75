package leetcode75;

public class Leet75_1732 {
    public static void main(String[] args) {
        int gain[] = {0,-4,-7,-9,-10,-6,-3,-1};
        System.out.println(largestAltitude(gain));
    }

    public static int largestAltitude(int[] gain) {
        int att[] = new int[gain.length + 1];
        att[0] = 0;
        int largestNum = att[0];
        for (int i = 1; i < att.length; i++) {
            att[i] = gain[i - 1] + att[i - 1];
            if (largestNum < att[i]) {
                largestNum = att[i];
            }
        }
        return largestNum;
    }
}