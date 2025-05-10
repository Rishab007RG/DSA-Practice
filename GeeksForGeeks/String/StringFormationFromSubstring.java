package DSA.GeeksForGeeks.String;

import java.util.Scanner;

public class StringFormationFromSubstring {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        SolutionSFFS sol=new SolutionSFFS();
        System.out.println(sol.isRepeat(s));
    }
}
class SolutionSFFS {
    int isRepeat(String s) {
        int n=s.length();
        for (int i = 1; i <= n/2 ; i++) {
            if(n%i==0){
                String part=s.substring(0,i);
                StringBuilder build=new StringBuilder();
                for (int j = 0; j < n/i; j++) {
                    build.append(part);
                }
                if(build.toString().equals(s)){
                    return 1;
                }
            }
        }
        return 0;
    }
}
