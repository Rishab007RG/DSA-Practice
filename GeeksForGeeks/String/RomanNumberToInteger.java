package DSA.GeeksForGeeks.String;

public class RomanNumberToInteger {
    public static void main(String[] args) {
        String str="II";
        System.out.println(romanToDecimal(str));;
    }
    public static int romanToDecimal(String str){
        int x=0;
        char ch[]=str.toCharArray();
        int arr[]=new int[ch.length];
        for (int i = 0; i <ch.length; i++) {
            switch (ch[i]) {
                case 'I':
                    arr[i] = 1;
                    break;
                case 'V':
                    arr[i] = 5;
                    break;
                case 'X':
                    arr[i] = 10;
                    break;
                case 'L':
                    arr[i] = 50;
                    break;
                case 'C':
                    arr[i] = 100;
                    break;
                case 'D':
                    arr[i] = 500;
                    break;
                case 'M':
                    arr[i] = 1000;
                    break;
            }
        }
        if(arr.length==1){
            return arr[0];
        }
        for (int i = 0; i <arr.length-1; i++) {

                if(arr[i]>=arr[i+1]){
                    System.out.println(arr[i]);
                    System.out.println(arr[i+1]);
                    x=x+arr[i];
                }else if(arr[i]<arr[i+1]){
                    x=x+(arr[i+1]-arr[i]);
                    i++;
                }

        }
        x=x+arr[arr.length-1];
        return x;
    }
}
