package DSA.GeeksForGeeks.Arrays;

public class ConvertArrayIntoZigZagFashion {
    public static void main(String[] args) {
        int arr[]={4,3,7,8,6,2,1};
        zigzag(arr);
        for (int x:arr){
            System.out.println(x);
        }
    }
    static void zigzag(int arr[]){
        String sign="<";
        for (int i = 0; i < arr.length-1; i++) {
            if(sign=="<"){
                switchSign (sign,arr,i);
                sign=">";
            }else{
                switchSign (sign,arr,i);
                sign="<";
            }
        }
//        return arr;
    }
    static void switchSign(String sign,int[] arr,int i){
        switch (sign){
            case "<":{
                if(arr[i]<arr[i+1]){
                    break;
                }else{
                    int data=arr[i+1];
                    arr[i+1]=arr[i];
                    arr[i]=data;
                    break;
                }
            }
            case ">":{
                if(arr[i]>arr[i+1]){
                    break;
                }else{
                    int data=arr[i+1];
                    arr[i+1]=arr[i];
                    arr[i]=data;
                    break;
                }
            }
        }
    }

}
