package DSA.GeeksForGeeks.String;

import java.util.HashSet;

public class LongestSubstringWithDistinctCharacters {
    public static void main(String[] args) {
        String s="geeksforgeeks";
        SolutionMaxSubString sol=new SolutionMaxSubString();
        System.out.println(sol.count(s));;

    }
}
class SolutionMaxSubString {
    public int count(String s){
        int n=s.length();
        int start=0;
        int maxLength=0;
        HashSet<Character> hash=new HashSet<>();
        for (int end = 0; end < n; end++) {
            char currentCharacter=s.charAt(end);
            while (hash.contains(currentCharacter)){
                System.out.println(currentCharacter);
                hash.remove(s.charAt(start));
                start++;
            }
            hash.add(currentCharacter);
            maxLength=Math.max(maxLength,end-start+1);
        }
        return maxLength;
    }
}
