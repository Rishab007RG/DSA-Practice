package DSA.GeeksForGeeks.String;

public class CountAndSay {
    public static void main(String[] args) {
//        int n=5;
        SolutionCountAndSay sol=new SolutionCountAndSay();
        sol.countAndSay();
    }
}
class SolutionCountAndSay{
    public void countAndSay(){
        int n=5;
        int input=1;
        int arr[]=new int[10];
        int j=0;
        arr[j]=input;
        int copy=arr[j];
        int count=1;
        for (int i = 0; i < n; i++) {
            try{
                if(arr[j]==arr[j+1]){
                    count++;
                    copy=arr[j+1];
                    int count2=count;
                    while (count2!=0){
                        j++;
                        System.out.println(count+copy);
                        arr[j]=copy;
                    }
                    count=0;
                }
            }catch (ArrayIndexOutOfBoundsException e){
                System.out.println("ok");
            }
        }
//        return "rishab";
    }
}
