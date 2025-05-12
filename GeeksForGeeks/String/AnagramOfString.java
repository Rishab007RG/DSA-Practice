package DSA.GeeksForGeeks.String;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class AnagramOfString {
    public static void main(String[] args) {
        String s1="hel";
        String s2="hello";
        SolutionAnagramOfString sol=new SolutionAnagramOfString();
        System.out.println(sol.anagramOfString(s1,s2));;
    }
}
class SolutionAnagramOfString{
    public int anagramOfString(String s1,String s2){
        int ch1[]=new int[26];
        int ch2[]=new int[26];
        for (char c:s1.toCharArray()){
            ch1[c-'a']++;
        }
        for (char c:s2.toCharArray()){
            ch2[c-'a']++;
        }
        int deletion=0;
        for (int i = 0; i < 26; i++) {
            deletion=deletion+Math.abs(ch1[i]-ch2[i]);
        }
        return deletion;
    }
}
