package DSA.GeeksForGeeks.String;

import java.util.HashSet;
import java.util.Scanner;

public class LengthOfTheLongestSubstring {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        Solution sol=new Solution();
        System.out.println(sol.longestUniqueSubstring(s));;
    }
    static class Solution {
        int longestUniqueSubstring(String s) {
            int maxLength=0;
            int left=0;
            HashSet<Character> hash=new HashSet<>();
            for(int right=0;right < s.length();right++){
                while(hash.contains(s.charAt(right))){
                    hash.remove(s.charAt(left));
                    left++;
                }

                hash.add(s.charAt(right));
                maxLength=Math.max(maxLength,right-left+1);
            }
            return maxLength;
        }
    }
}
