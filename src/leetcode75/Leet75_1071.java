package leetcode75;

// Greatest Common Divisor of Strings (Tìm ước chung lớn nhất của chuỗi)
public class Leet75_1071 {
    public static void main(String[] args) {
        String str1 = "ABAB";
        String str2 = "ABABAB";
        
        System.out.println(gcdOfStrings(str1, str2));

    }

    public static String gcdOfStrings(String str1, String str2) {
        if (!(str1 + str2).equals(str2 + str1)) {
            return "";
        }
        
        int gcdLength = gcd(str1.length(), str2.length());
        
        return str1.substring(0, gcdLength);
    }
    
//    private static int gcd(int a, int b) {
//        while (b != 0) {
//            int temp = b;
//            b = a % b;
//            a = temp;
//        }
//        return a;
//    }
    
    private static int gcd(int a, int b) {
        if (a < b) {
        	a = b + a;
        	b = a - b;
        	a = a - b;
        }
        return a == b ? a : gcd(a - b, b);
    }
}
