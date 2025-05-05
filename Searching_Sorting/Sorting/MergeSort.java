package DSA.Searching_Sorting.Sorting;

import java.util.Scanner;

public class MergeSort {
    public static void main(String[] args) {
        int arr[], no, i, j;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements to be added in the array");
        no = sc.nextInt();
        arr = new int[no];
        System.out.println("Enter the elements to the array");
        for (i = 0; i < no; i++) {
            arr[i] = sc.nextInt();
        }
        int start=0;
        int end=no-1;
        Merge merge = new Merge();
        merge.divide(arr,start,end);
        for (int k = 0; k < arr.length; k++) {
            System.out.println(arr[k]+" ");
        }
    }
}
class Merge{
    public void divide(int arr[],int start,int end){
       if(start<end){
           int mid=(start+end)/2;
           divide(arr,start,mid);
           divide(arr,mid+1,end);
           merge(arr, start,mid, end);
       }

    }
    void merge(int arr[],int start,int mid ,int end){
     int l=mid-start+1;
     int r=end-mid;
     int left_subarray[]=new int[l];
     int right_subarray[]=new int[r];

        for (int i = 0; i <left_subarray.length; ++i) {
            left_subarray[i]=arr[start+i];
        }
        for (int i = 0; i < right_subarray.length; ++i) {
            right_subarray[i]=arr[mid+1+i];
        }

        int i=0;int j=0;
        int k=start;
        while (i<l && j<r){
            if(left_subarray[i]<=right_subarray[j]){
                arr[k]=left_subarray[i];
                i++;
            }else {
                arr[k]=right_subarray[j];
                j++;
            }
            k++;
        }
        while (i<l){
            arr[k]=left_subarray[i];
            i++;
            k++;
        }
        while (j<r){
            arr[k]=right_subarray[j];
            j++;
            k++;
        }
    }
}
