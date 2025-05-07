package DSA.GeeksForGeeks.String;

import java.math.BigInteger;

public class MultiplicationOfTwoString {
    public static void main(String[] args) {
        String s1="2";
        String s2="3";
        Solution sol=new Solution();
        System.out.println(sol.multiplyStrings(s1,s2));;
    }
}
class Solution {
    public String multiplyStrings(String s1, String s2) {

        try {
            BigInteger num1 = new BigInteger(s1);
            BigInteger num2 = new BigInteger(s2);
            BigInteger result = num1.multiply(num2);
            return result.toString();
        } catch (NumberFormatException e) {
            return "error";
        }

    }
}
