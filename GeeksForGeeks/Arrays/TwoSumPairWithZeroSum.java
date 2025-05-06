package DSA.GeeksForGeeks.Arrays;

import java.util.*;

class TwoSumPairWithZeroSum {
    public static ArrayList<ArrayList<Integer>> getPairs(int[] arr) {
        ArrayList<ArrayList<Integer>> arrayList=new ArrayList<>();
        HashSet<ArrayList<Integer>> hash=new HashSet<>();

        // code here
        for(int i=0;i<=arr.length-1;i++){
            for(int j=i+1;j<=arr.length-1;j++){
                if(arr[i]+arr[j]==0 && i!=j){
                    int min=Math.min(arr[i],arr[j]);
                    int max=Math.max(arr[i],arr[j]);
//                    String key=min+","+max;
                           ArrayList<Integer> arrayList2=new ArrayList<>();
                           arrayList2.add(min);
                           arrayList2.add(max);
                           hash.add(arrayList2);
                           arrayList.clear();
                           arrayList.addAll(hash);
                }
            }
        }
        return arrayList;
    }

    public static void main(String[] args) {
        int[] arr = {6,1,8,0,4,-9,-1,-10, -6, -5};
        ArrayList<ArrayList<Integer>> pairs = getPairs(arr);
        System.out.println(pairs);
    }
}

