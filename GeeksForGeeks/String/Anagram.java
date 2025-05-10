package DSA.GeeksForGeeks.String;

import java.util.Arrays;

public class Anagram {
    public static void main(String[] args) {
        String s1="hello";
        String s2="oellh";
        SolutionAnagram sol=new SolutionAnagram();
        System.out.println(sol.areAnagrams(s1,s2));;
    }

}
class SolutionAnagram {
    // Function is to check whether two strings are anagram of each other or not.
    public boolean areAnagrams(String s1, String s2) {
        char[] ch1=s1.toCharArray();
        Arrays.sort(ch1);
        char[] ch2=s2.toCharArray();
        Arrays.sort(ch2);
        s1=new String(ch1);
        s2=new String(ch2);
        if(s1.length()==s2.length()){
            if(s1.equals(s2)){
                return true;
            }
        }
        return false;
    }
}

