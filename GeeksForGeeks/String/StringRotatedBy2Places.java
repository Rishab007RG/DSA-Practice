package DSA.GeeksForGeeks.String;

public class StringRotatedBy2Places {
    public static void main(String[] args) {
        String str="amazon";
        String str2="azonam";
        System.out.println(check(str,str2));;
    }
    public static boolean check(String s1,String s2){
        boolean flag=false;
        if(s1.length()==s2.length()){
            String anticlockwise=s1.substring(2)+s1.substring(0,2);
            String clockwise=s1.substring(s1.length()-2)+s1.substring(0,s1.length()-2);
            if(s2.equals(anticlockwise) || s2.equals(clockwise)) return true;
        }
        return flag;
    }
}
