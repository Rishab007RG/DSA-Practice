package DSA.Searching_Sorting.Sorting;

import java.util.Scanner;

public class QuickSort {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int arr[];
        System.out.println("Enter the size of the array");
        int n=sc.nextInt();
        arr=new int[n];
        System.out.println("Enter the elements");
        for (int i = 0; i < n; i++) {
            arr[i]=sc.nextInt();
        }
        DivideAndConquer divideAndConquer=new DivideAndConquer();
        divideAndConquer.divide(arr,0,n-1);
        for (int i = 0; i < n; i++) {
            System.out.println(arr[i]+" ");
        }
    }
}
class DivideAndConquer{
    public int conquer(int arr[],int start,int end){
        int pindex=start;
        int pivot=arr[end];
        for (int i = start; i <end ; i++) {
            if(arr[i]<pivot){
                int temp=arr[pindex];
                arr[pindex]=arr[i];
                arr[i]=temp;
                pindex++;
            }
        }
        int temp=arr[pindex];
        arr[pindex]=arr[end];
        arr[end]=temp;
        return pindex;
    }
    public void divide(int arr[],int start,int end){
        if(start<end){
            int p=conquer(arr,start,end);
            divide(arr,start,p-1);
            divide(arr,p+   1,end);
        }
    }
}

